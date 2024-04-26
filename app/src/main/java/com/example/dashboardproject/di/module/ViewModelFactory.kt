package com.example.dashboardproject.di.module

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.dashboardproject.Repository.ApiCalls
import com.example.dashboardproject.database.PNDatabase
import com.example.dashboardproject.ui.detail_screen.PNContactViewModel
import com.example.dashboardproject.ui.image_poster.PNRandomViewModel
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ViewModelFactory  @Inject constructor(private val mApplication: Application, private val creator: ApiCalls,private val dataBase:PNDatabase) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass == PNContactViewModel::class.java) {
            return PNContactViewModel(mApplication, creator,dataBase) as T
        }else if(modelClass == PNRandomViewModel::class.java)
          return PNRandomViewModel(mApplication,creator,dataBase) as T
        else{
            throw IllegalArgumentException("Unknown ViewModel class")
        }
    }
}