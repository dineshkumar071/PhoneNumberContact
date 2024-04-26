package com.example.dashboardproject.ui.image_poster

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dashboardproject.Repository.Model.PhoneNumber
import com.example.dashboardproject.common.TSApplication.Companion.instance
import com.example.dashboardproject.databinding.FragmentImagePosterBinding
import com.example.dashboardproject.ui.base.TSBaseFragment
import com.example.dashboardproject.ui.detail.DetailActivity
import javax.inject.Inject
import javax.inject.Named

class PNRandomFragment : TSBaseFragment() {
    private lateinit var imagePosterBinding: FragmentImagePosterBinding
    private var trendings :MutableList<PhoneNumber> = mutableListOf()
    @Inject
    @Named("random")
    lateinit var imagePosterViewModelFactory: ViewModelProvider.Factory
    private lateinit var imagePosterViewModel :PNRandomViewModel
    private var isEnableSearchView:Boolean = false
    private val posterAdapter by lazy {
        TSImagePosterAdapter(mContext,trendings
        ) { position, trend ->
            run {
                val intent = Intent(mContext, DetailActivity::class.java)
                intent.putExtra("email", trend.name)
                intent.putExtra("name", "unknown name")
                intent.putExtra("Phone Number", trend.phoneNumber)
                startActivity(intent)
            }
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        imagePosterBinding = FragmentImagePosterBinding.inflate(inflater, container, false)
        return imagePosterBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        instance?.getComponent()?.inject(this)
        imagePosterViewModel =ViewModelProvider(this,imagePosterViewModelFactory)[PNRandomViewModel::class.java]
        imagePosterBinding.apply {
            rvRandom.layoutManager = LinearLayoutManager(mContext,  RecyclerView.VERTICAL, false)
            rvRandom.adapter = posterAdapter
            contactList?.let { trendings.addAll(it) }
            rvRandom.adapter?.notifyDataSetChanged()
        }

    }

    companion object{
        var contactList: MutableList<PhoneNumber>? = null
        fun newInstance(list:MutableList<PhoneNumber>):PNRandomFragment{
            return PNRandomFragment().apply {
                contactList = list
            }
        }
    }

}