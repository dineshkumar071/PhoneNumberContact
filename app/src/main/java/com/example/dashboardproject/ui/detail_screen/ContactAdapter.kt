package com.example.dashboardproject.ui.detail_screen

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dashboardproject.Repository.Model.ResultOne
import com.example.dashboardproject.databinding.AdapterSimilarShowsBinding

class ContactAdapter(private val mContext: Context, private val similarShows: MutableList<ResultOne>, private val showSimilarShowClickListener: ShowSimilarShowClickListener):RecyclerView.Adapter<ContactAdapter.ViewHolder>() {
    inner class ViewHolder(val binding: AdapterSimilarShowsBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = AdapterSimilarShowsBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }

    override fun getItemCount() = similarShows.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder){
            with(similarShows[position]){
                binding.tvName.text = "${this.name?.first.toString()} ${this.name?.last.toString()}"
                binding.tvNumber.text = this.phone.toString()
                binding.cvCard.setOnClickListener {
                    showSimilarShowClickListener.onClickSimilarShows(position,this)
                }
            }
        }
    }

    fun interface ShowSimilarShowClickListener{
        fun onClickSimilarShows(position: Int, trend:ResultOne)
    }
}