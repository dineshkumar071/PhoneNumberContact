package com.example.dashboardproject.Repository.Model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.squareup.moshi.Json

@Entity
class Id {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "uid")
    @Json(name = "uid")
    var uid:Int? =null

    @ColumnInfo(name = "id")
    @Json(name = "id")
    var id: Int? = null

    @ColumnInfo(name = "name")
    @Json(name = "name")
    var name: String? = null

    @ColumnInfo(name = "value")
    @Json(name = "value")
    var value: String? = null
}