package com.example.dashboardproject.Repository.Model

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.squareup.moshi.Json

@Entity
class ContactModel {
    @ColumnInfo(name = "results")
    @Json(name = "results")
    @Ignore
    var results: List<ResultOne>? = null

    @Json(name = "info")
    @ColumnInfo(name = "info")
    @Ignore
    var info: Info? = null

    @PrimaryKey(autoGenerate = true)
    @Json(name = "uid")
    @ColumnInfo(name = "uid")
    var uid: Int? = null
}