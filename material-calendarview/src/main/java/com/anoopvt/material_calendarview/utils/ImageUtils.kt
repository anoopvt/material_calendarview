@file:JvmName("ImageUtils")

package com.anoopvt.material_calendarview.utils

import android.widget.TextView

/**
 * This class is used to load event image in a day cell
 *
 * Created by Anoop V T.
 */

internal fun TextView.loadImage(eventImage: String,textColor: Int?) {
    text = eventImage
    if (textColor!=null){
        setTextColor(textColor)
    }
}
