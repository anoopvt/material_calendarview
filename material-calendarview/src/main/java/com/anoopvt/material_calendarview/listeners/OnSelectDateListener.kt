package com.anoopvt.material_calendarview.listeners

import java.util.*

/**
 * This interface is used to inform DatePicker that user selected any days
 *
 * Created by Anoop V T.
 */

interface OnSelectDateListener {

    @JvmSuppressWildcards
    fun onSelect(calendar: List<Calendar>)
}