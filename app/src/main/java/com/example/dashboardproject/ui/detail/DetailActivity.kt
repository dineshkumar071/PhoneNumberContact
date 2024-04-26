package com.example.dashboardproject.ui.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dashboardproject.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    lateinit var detailBinding: ActivityDetailBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailBinding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(detailBinding.root)

    }
}