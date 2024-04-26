package com.example.dashboardproject.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fragmentActivity:FragmentActivity):FragmentStateAdapter(fragmentActivity) {

    private var fragmentList : MutableList<Fragment> = mutableListOf<Fragment>()
    private var fragmentTile : MutableList<String> = mutableListOf()

    override fun getItemCount() = fragmentList.size

    override fun createFragment(position: Int) = fragmentList[position]

    fun getTabTile(position:Int):String{
        return fragmentTile[position]
    }

    fun addFragment(fragment:Fragment, title:String){
        fragmentList.add(fragment)
        fragmentTile.add(title)
    }
}