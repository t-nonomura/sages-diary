package com.treeengineering.sagesdiary.ui.calendar

import android.content.Context
import android.util.AttributeSet
import android.view.View

class MonthlyView
constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) :
    View(context, attrs, defStyleAttr) {

    enum class DayOfWeekCell {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
    }
}
