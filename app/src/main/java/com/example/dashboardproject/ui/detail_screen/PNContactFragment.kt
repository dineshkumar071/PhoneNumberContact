package com.example.dashboardproject.ui.detail_screen

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dashboardproject.Repository.Model.ResultOne
import com.example.dashboardproject.Utils.Status
import com.example.dashboardproject.common.TSApplication
import com.example.dashboardproject.databinding.FragmentDetailScreenBinding
import com.example.dashboardproject.ui.main.MainActivity
import com.example.dashboardproject.ui.base.TSBaseFragment
import com.example.dashboardproject.ui.detail.DetailActivity
import javax.inject.Inject
import javax.inject.Named


class PNContactFragment : TSBaseFragment() {

    private lateinit var detailScreenBinding: FragmentDetailScreenBinding


    @Inject
    @Named("contact")
    lateinit var detailScreenViewModelFactory: ViewModelProvider.Factory
    private lateinit var detailScreenViewModel: PNContactViewModel
    private var similarShows: MutableList<ResultOne> = mutableListOf()
    private val similarShowsAdapter by lazy {
        ContactAdapter(
            mContext, similarShows
        ) { position, trend ->
            val intent = Intent(mContext, DetailActivity::class.java)
            intent.putExtra("email", trend.email)
            intent.putExtra("name", "unknown name")
            intent.putExtra("Phone Number", trend.phone)
            startActivity(intent)
        }
    }
    private val PAGE_START = 25
    private var isLoading1 = false
    private val isLastPage1 = false
    private val TOTAL_PAGES = 28
    private var currentPage: Int = PAGE_START

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        detailScreenBinding = FragmentDetailScreenBinding.inflate(inflater, container, false)
        return detailScreenBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        TSApplication.instance?.getComponent()?.inject(this)
        detailScreenViewModel = ViewModelProvider(
            this,
            detailScreenViewModelFactory
        )[PNContactViewModel::class.java]
        detailScreenBinding.apply {
            val layoutManager = LinearLayoutManager(mContext, RecyclerView.VERTICAL, false)
            rvContact.layoutManager = layoutManager
            rvContact.adapter = similarShowsAdapter
            rvContact.addOnScrollListener(object : PaginationScrollListener(layoutManager) {
                override fun loadMoreItems() {
                    isLoading1 = true
                    currentPage += 1
                    if (currentPage <= TOTAL_PAGES) // simulating network latency for API call
                        Handler().postDelayed(Runnable { loadNextPage() }, 1000)
                }

                override val totalPageCount: Int
                    get() = TOTAL_PAGES
                override val isLastPage: Boolean
                    get() = isLastPage1
                override val isLoading: Boolean
                    get() = isLoading1
            })
            svContact.addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(
                    s: CharSequence?,
                    start: Int,
                    count: Int,
                    after: Int
                ) {
                    //not in use
                }

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    if (s?.isNotEmpty() == true) {
                        detailScreenViewModel.fetchRandomContact(object :
                            PNContactViewModel.ContactListCallBack {
                            override fun getContacts(contactList: List<ResultOne>) {
                                similarShows.clear()
                                for (contact in contactList) {
                                    if (s?.let { contact.email?.contains(it) } == true) {
                                        similarShows.add(contact)
                                    }
                                }
                                (mContext as MainActivity).runOnUiThread {
                                    rvContact.adapter?.notifyDataSetChanged()
                                }
                            }

                        })
                    } else {
                        detailScreenViewModel.getDeviceRandomContact(currentPage)
                    }
                }

                override fun afterTextChanged(s: Editable?) {
                    // not in use
                }
            })
        }

        detailScreenViewModel.getDeviceRandomContact(currentPage)
        observeViewModel()
    }

    private fun loadNextPage() {
        detailScreenViewModel.getDeviceRandomContact(currentPage)
    }


    private fun observeViewModel() {
        detailScreenViewModel.contacts.observe(viewLifecycleOwner) {
            when (it.status) {
                Status.SUCCESS -> {
                    detailScreenBinding.pgRandom.visibility = View.GONE
                    similarShows.clear()
                    if (it.data?.results?.isNotEmpty() == true) {
                        similarShows.addAll(it.data.results!!)
                    }
                    similarShowsAdapter.notifyDataSetChanged()
                }

                Status.ERROR -> {
                    detailScreenBinding.pgRandom.visibility = View.GONE
                    //here we need to hide the loader and handle the error scenario.
                    Toast.makeText(mContext, it.message, Toast.LENGTH_SHORT).show()
                }

                Status.LOADING -> {
                    // Here we need to show the loader to the user.
                    detailScreenBinding.pgRandom.visibility = View.VISIBLE
                }

                else -> {

                }
            }
        }
    }

}