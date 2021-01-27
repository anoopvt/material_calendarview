package com.anoopvt.material_calendarview.utils

/**
 * These classes hold different types of event images
 */

sealed class EventImage {
    object EmptyEventImage : EventImage()
    data class EventImageResource( val drawableRes: String) : EventImage()
    data class EventImageDrawable(val drawable: String) : EventImage()
}