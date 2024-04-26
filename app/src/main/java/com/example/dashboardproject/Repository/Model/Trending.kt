package com.example.dashboardproject.Repository.Model

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import com.squareup.moshi.Json

@Entity
class Trending {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "uid")
    @Json(name = "uid")
    var uid:Int? =null

    @Json(name = "page")
    @ColumnInfo(name = "page")
    var page: Int? = null

    @Json(name = "results")
    @ColumnInfo(name = "results")
    @Ignore
    var results: List<ResultOne>? = null

    @Json(name = "total_pages")
    @ColumnInfo(name = "total_pages")
    var totalPages: Int? = null

    @Json(name = "total_results")
    @ColumnInfo(name = "total_results")
    var totalResults: Int? = null
}