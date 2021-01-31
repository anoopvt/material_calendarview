package com.anoopvt.calendarexample

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.anoopvt.material_calendarview.CalendarView
import com.anoopvt.material_calendarview.EventDay
import java.util.*
import kotlin.collections.ArrayList


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var events: MutableList<EventDay> = ArrayList()
        var dates: MutableList<Calendar> = ArrayList()

        val calendar: Calendar = Calendar.getInstance()

        calendar.add(Calendar.DAY_OF_MONTH,3)

        events.add(EventDay(calendar,"4564646"))

        dates.add(calendar)

      val calendarView =  findViewById<CalendarView>(R.id.calendarView)

        calendarView.setEvents(events)

        calendarView.selectedDates = dates

    }
}