package com.anoopvt.material_calendarview.utils

import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.view.View
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.anoopvt.material_calendarview.R
import com.anoopvt.material_calendarview.extensions.CalendarViewPager


/**
 * Created by Anoop V T.
 */

internal fun View.setAbbreviationsLabels(color: Int, firstDayOfWeek: Int) {
    val labels = getAbbreviationsTextViews()

    val abbreviations =
        context.resources.getStringArray(R.array.material_calendar_day_abbreviations_array)

    labels.forEachIndexed { index, label ->
        label.text = abbreviations[(index + firstDayOfWeek - 1) % 7]

        if (color != 0) {
            label.setTextColor(color)
        }
    }
}

private fun View.getAbbreviationsTextViews() = listOf(
    findViewById<TextView>(R.id.mondayLabel),
    findViewById<TextView>(R.id.tuesdayLabel),
    findViewById<TextView>(R.id.wednesdayLabel),
    findViewById<TextView>(R.id.thursdayLabel),
    findViewById<TextView>(R.id.fridayLabel),
    findViewById<TextView>(R.id.saturdayLabel),
    findViewById<TextView>(R.id.sundayLabel)
)

internal fun View.setTypeface(typeface: Typeface?) {
    if (typeface == null) return
    getAbbreviationsTextViews().forEach { label ->
        label.typeface = typeface
    }
}

internal fun View.setHeaderColor(color: Int) {
    if (color == 0) return
    this.findViewById<ConstraintLayout>(R.id.calendarHeader).setBackgroundColor(color)
}

internal fun View.setHeaderLabelColor(color: Int) {
    if (color == 0) return
    this.findViewById<TextView>(R.id.currentDateLabel).setTextColor(color)
}

internal fun View.setHeaderTypeface(typeface: Typeface?) {
    if (typeface == null) return
    this.findViewById<TextView>(R.id.currentDateLabel).typeface = typeface
}

internal fun View.setAbbreviationsBarColor(color: Int) {
    if (color == 0) return
    this.findViewById<LinearLayout>(R.id.abbreviationsBar).setBackgroundColor(color)
}

internal fun View.setPagesColor(color: Int) {
    if (color == 0) return
    this.findViewById<CalendarViewPager>(R.id.calendarViewPager).setBackgroundColor(color)
}

internal fun View.setPreviousButtonImage(drawable: Drawable?) {
    if (drawable == null) return
    this.findViewById<ImageButton>(R.id.previousButton).setImageDrawable(drawable)
}

internal fun View.setForwardButtonImage(drawable: Drawable?) {
    if (drawable == null) return
    this.findViewById<ImageButton>(R.id.forwardButton).setImageDrawable(drawable)
}

internal fun View.setHeaderVisibility(visibility: Int) {
    this.findViewById<ConstraintLayout>(R.id.calendarHeader).visibility = visibility
}

internal fun View.setNavigationVisibility(visibility: Int) {
    this.findViewById<ImageButton>(R.id.previousButton).visibility = visibility
    this.findViewById<ImageButton>(R.id.forwardButton).visibility = visibility
}

internal fun View.setAbbreviationsBarVisibility(visibility: Int) {
    this.findViewById<LinearLayout>(R.id.abbreviationsBar).visibility = visibility
}
