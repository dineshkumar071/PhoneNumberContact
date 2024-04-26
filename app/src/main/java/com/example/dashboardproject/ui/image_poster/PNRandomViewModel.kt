package com.example.dashboardproject.ui.image_poster

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.dashboardproject.Repository.ApiCalls
import com.example.dashboardproject.Repository.Model.Trending
import com.example.dashboardproject.Repository.TSResponse
import com.example.dashboardproject.database.PNDatabase
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class PNRandomViewModel @Inject constructor(
    private val mApplication: Application,
    private val apiCalls: ApiCalls,
    private val dataBase:PNDatabase
) : AndroidViewModel(mApplication) {

    val trendingLiveData by lazy { MutableLiveData<TSResponse<Trending>>() }
    val searchedTrendsLiveData by lazy { MutableLiveData<TSResponse<Trending>>() }


}