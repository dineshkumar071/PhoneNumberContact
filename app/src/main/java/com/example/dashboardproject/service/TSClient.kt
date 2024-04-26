package com.example.dashboardproject.service

import com.example.dashboardproject.Repository.Model.ContactModel
import com.example.dashboardproject.Repository.Model.Trending
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface TSClient {

    @GET("api/")
    fun getRandomContacts(@Query("results") result:Int,
                          @Query("inc", encoded = true) variant:String):Call<ContactModel>
}