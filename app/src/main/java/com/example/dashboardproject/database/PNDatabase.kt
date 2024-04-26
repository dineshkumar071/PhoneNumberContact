package com.example.dashboardproject.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.dashboardproject.Repository.Model.ContactModel
import com.example.dashboardproject.Repository.Model.Id
import com.example.dashboardproject.Repository.Model.Name
import com.example.dashboardproject.Repository.Model.ResultOne

@Database(entities = [ContactModel::class, Id::class ,ResultOne::class, Name::class],version = 1 )
abstract class PNDatabase: RoomDatabase() {
    abstract fun userDOA():ContactDAO

    companion object {
        private lateinit var instance1: PNDatabase
        fun getInstance( context: Context?): PNDatabase {
            if (!::instance1.isInitialized && context != null) {
                synchronized(PNDatabase::class.java) {
                    instance1 = Room.databaseBuilder(context, PNDatabase::class.java, "users_database")
                        .build()
                }
            }
            return instance1
        }
    }
}