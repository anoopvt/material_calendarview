package com.anoopvt.material_calendarview

import androidx.annotation.ColorInt
import androidx.annotation.RestrictTo
import com.anoopvt.material_calendarview.utils.setMidnight
import java.util.*

/**
 * This class represents an event of a day. An instance of this class is returned when user click
 * a day cell. This class can be overridden to make calendar more functional. A list of instances of
 * this class can be passed to CalendarView object using setEvents() method.
 *
 *
 * @param calendar      Calendar object which represents a date of the event
 * @param drawable Drawable which will be displayed in a day cell
 * @param drawableRes Drawable resource which will be displayed in a day cell
 * @param labelColor Color which will be displayed as row label text color
 *
 * Created by Anoop V T.
 */

data class EventDay(val calendar: Calendar) {
    //An object which contains image to display in the day row
    internal var imageDrawable: String = ""

    internal var labelColor: Int = 0

    @set:RestrictTo(RestrictTo.Scope.LIBRARY)
    var isEnabled: Boolean = false

    init {
        calendar.setMidnight()
    }

    constructor(day: Calendar, drawable: String) : this(day) {
        imageDrawable = drawable
    }


    constructor(day: Calendar, drawableRes: String, @ColorInt labelColor: Int) : this(day) {
        imageDrawable = drawableRes
        this.labelColor = labelColor
    }
}