package com.example.dashboardproject.Repository.Model

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import com.squareup.moshi.Json

@Entity
class Info {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "uid")
    @Json(name = "uid")
    var uid:Int? =null

    @Json(name = "id")
    @Ignore
    @ColumnInfo(name = "id")
    var id: Id? = null

    @Json(name = "seed")
    @ColumnInfo(name = "seed")
    var seed: String? = null

    @Json(name = "results")
    @ColumnInfo(name = "results")
    var results: Int? = null

    @Json(name = "page")
    @ColumnInfo(name = "page")
    var page: Int? = null

    @Json(name = "version")
    @ColumnInfo(name = "version")
    var version: String? = null
}