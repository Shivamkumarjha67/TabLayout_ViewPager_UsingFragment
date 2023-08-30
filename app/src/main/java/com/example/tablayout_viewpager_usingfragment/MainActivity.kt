package com.example.tablayout_viewpager_usingfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var viewPager : ViewPager2
    private lateinit var vpAdapter : ViewPagerAdapter
    private lateinit var tabLayout : TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        tabLayout = findViewById(R.id.tabLayout)
        viewPager = findViewById(R.id.viewPager)
        vpAdapter = ViewPagerAdapter(this)

        viewPager.adapter = vpAdapter

        TabLayoutMediator(tabLayout, viewPager) { tab : TabLayout.Tab, position : Int ->
            when(position) {
                0 -> tab.text = "Messages"
                1 -> tab.text = "Status"
                2 -> tab.text = "Calls"
            }
        }.attach()
    }
}