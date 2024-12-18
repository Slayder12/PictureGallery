package com.example.picturegallery

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager2
    private lateinit var adapter: ViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = ViewPagerAdapter(this, Picture.viewPagerList)
        viewPager = findViewById(R.id.viewPager)

        viewPager.adapter = adapter

        val initialPosition = Picture.viewPagerList.size * 500
        viewPager.setCurrentItem(initialPosition, false)

        viewPager.post {
            viewPager.setCurrentItem(initialPosition, false)
        }
    }
}