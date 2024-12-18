package com.example.picturegallery

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView


class ViewPagerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_view_pager, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val nameViewPagerTV: TextView = view.findViewById(R.id.nameViewPagerTV)
        val creatorViewPagerTV: TextView = view.findViewById(R.id.creatorViewPagerTV)
        val pictureViewPagerIV: ImageView = view.findViewById(R.id.pictureViewPagerIV)

        val viewPagerItem =  arguments?.getSerializable("vp") as Picture
        nameViewPagerTV.text = viewPagerItem.name
        creatorViewPagerTV.text = viewPagerItem.creator
        pictureViewPagerIV.setImageResource(viewPagerItem.imageView)
    }

}