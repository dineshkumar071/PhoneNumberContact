package com.example.dashboardproject.Repository.Model

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import com.squareup.moshi.Json

@Entity
class Name {

    @Json(name = "id")
    @ColumnInfo(name = "id")
    @Ignore
    var id: Id? = null


    @ColumnInfo(name = "title")
    @Json(name = "title")
    var title: String? = null

    @Json(name = "first")
    @ColumnInfo(name = "first")
    var first: String? = null

    @Json(name = "last")
    @ColumnInfo(name = "last")
    var last: String? = null

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name= " uid")
    var uid:Int = 0
}