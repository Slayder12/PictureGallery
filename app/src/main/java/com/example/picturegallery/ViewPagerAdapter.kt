package com.example.picturegallery

import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(
    fragment: FragmentActivity,
    private val viewPagerList: MutableList<Picture>
) :
    FragmentStateAdapter(fragment) {
    private val itemCountMultiplier = 1000
    override fun getItemCount(): Int {
        return viewPagerList.size * itemCountMultiplier
    }

    override fun createFragment(position: Int): Fragment {
        val actualPosition = position % viewPagerList.size
        val fragment = ViewPagerFragment()
        fragment.arguments = bundleOf("vp" to viewPagerList[actualPosition])
        return fragment
    }
}