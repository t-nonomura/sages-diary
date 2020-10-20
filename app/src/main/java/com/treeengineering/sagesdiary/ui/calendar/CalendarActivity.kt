package com.treeengineering.sagesdiary.ui.calendar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.treeengineering.sagesdiary.R

class CalendarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, CalendarFragment.newInstance())
                .commitNow()
        }
    }
}
