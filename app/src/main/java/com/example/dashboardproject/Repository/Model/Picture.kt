package com.example.dashboardproject.Repository.Model

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import com.squareup.moshi.Json


@Entity
class Picture {
    @Json(name = "id")
    @ColumnInfo(name = "id")
    @Ignore
    var id: Id? = null

    @PrimaryKey
    @Json(name = "large")
    @ColumnInfo(name = "large")
    var large: String? = null

    @Json(name = "medium")
    @ColumnInfo(name = "medium")
    var medium: String? = null

    @Json(name = "thumbnail")
    @ColumnInfo(name = "thumbnail")
    var thumbnail: String? = null
}