package com.example.dashboardproject.Repository.Model

import android.graphics.Picture
import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import com.squareup.moshi.Json

@Entity
data class ResultOne(
    @Json(name = "gender")
    @ColumnInfo(name = "gender")
    var gender: String? = null,

    @Json(name = "name")
    @ColumnInfo(name = "name")
    @Ignore
    var name: Name? = null,

    @Json(name = "email")
    @ColumnInfo(name = "email")
    var email: String? = null,

    @Json(name = "phone")
    @ColumnInfo(name = "phone")
    var phone: String? = null,

    @Json(name = "cell")
    @ColumnInfo(name = "cell")
    var cell: String? = null,


    @Json(name = "id")
    @ColumnInfo(name = "id")
    @Ignore
    var id: Id? = null,

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "uid")
    @Json(name = "uid")
    var uid:Int? =null
)