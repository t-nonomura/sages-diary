package com.treeengineering.sagesdiary.ui.calendar

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class CalendarFragmentStateAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
    override fun getItemCount(): Int = NUM_PAGES

    override fun createFragment(position: Int): Fragment = CalendarFragment.newInstance()

    companion object {
        const val NUM_PAGES = 5
    }
}

