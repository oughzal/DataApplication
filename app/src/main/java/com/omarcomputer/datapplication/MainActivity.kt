package com.omarcomputer.datapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    lateinit var viewPager : ViewPager2
    lateinit var tabLayout : TabLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tabNames = listOf<String>("Tab A","Tab B")
        setContentView(R.layout.activity_main)
        viewPager = findViewById(R.id.viewPager)
        tabLayout = findViewById(R.id.tabLayout)
        viewPager.adapter = ViewPageAdapter(this)
        //TabLayoutMediator(tabLayout,viewPager){ tab: TabLayout.Tab, i: Int ->
          //     tab.text = tabNames[i]
        //}.attach()
    }
}