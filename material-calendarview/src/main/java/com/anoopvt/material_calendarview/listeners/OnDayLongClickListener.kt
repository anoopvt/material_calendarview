package com.anoopvt.material_calendarview.listeners

import com.anoopvt.material_calendarview.EventDay

/**
 * This interface is used to handle long clicks on calendar cells
 *
 * Created by Anoop V T.
 */

interface OnDayLongClickListener {
    fun onDayLongClick(eventDay: EventDay)
}