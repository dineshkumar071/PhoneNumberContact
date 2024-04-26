package com.example.dashboardproject.ui.main

import android.Manifest
import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.provider.ContactsContract
import android.provider.Settings
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import com.example.dashboardproject.Repository.Model.PhoneNumber
import com.example.dashboardproject.databinding.ActivityMainBinding
import com.example.dashboardproject.ui.ViewPagerAdapter
import com.example.dashboardproject.ui.detail_screen.PNContactFragment
import com.example.dashboardproject.ui.image_poster.PNRandomFragment
import com.google.android.material.tabs.TabLayoutMediator


class MainActivity : AppCompatActivity(){
    private lateinit var navController: NavController
    private lateinit var mainBinding: ActivityMainBinding
    var contactDetails:MutableList<PhoneNumber> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(mainBinding.root)
        if (checkSelfPermission(Manifest.permission.READ_CONTACTS) != PackageManager.PERMISSION_GRANTED) {
            requestPermissions(arrayOf(Manifest.permission.READ_CONTACTS), 1)
        } else {
            // Permission has already been granted, so fetch contacts
            fetchContacts()
        }
        val adapter = ViewPagerAdapter(this)

        adapter.addFragment(PNContactFragment(),"RANDOM")
        adapter.addFragment(PNRandomFragment.newInstance(contactDetails),"CONTACT")

        mainBinding.vpRandomContact.adapter = adapter

        TabLayoutMediator(mainBinding.tlTabLayout, mainBinding.vpRandomContact) { tab, position ->
            tab.text = adapter.getTabTile(position)
        }.attach()
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == 1 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            fetchContacts()
        }else{
            val intent = Intent(
                Settings.ACTION_APPLICATION_DETAILS_SETTINGS,
                Uri.fromParts("package", packageName, null)
            )
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
        }
    }

    @SuppressLint("Range")
    private fun fetchContacts() {
        val contentResolver = contentResolver
        val cursor = contentResolver.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, null)

        cursor?.use {
            while (it.moveToNext()) {
                val name = it.getString(it.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME))
                val phoneNumber = it.getString(it.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER))
                contactDetails.add(PhoneNumber(name,phoneNumber))
            }
        }


    }

}