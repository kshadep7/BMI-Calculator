package com.akash.bmicalculator.utils


import android.icu.text.SimpleDateFormat
import android.os.Build
import android.view.View
import androidx.annotation.RequiresApi
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.observe
import com.akash.bmicalculator.Event
import com.google.android.material.snackbar.Snackbar
import java.util.*


fun View.showSnackBar(snackBarText: String, snackBarlength: Int) {

    Snackbar.make(this, snackBarText, snackBarlength).run { show() }
}

/**
 * Triggers a snackbar message when the value contained by snackbarTaskMessageLiveEvent is modified.
 */
fun View.setupSnackBar(
        lifecycleOwner: LifecycleOwner,
        snackBarEvent: LiveData<Event<Int>>,
        timeLength: Int
) {
    snackBarEvent.observe(lifecycleOwner) { _event ->
        _event.getContentIfNotHandled()?.let {
            showSnackBar(context.getString(it), timeLength)
        }
    }
}

@RequiresApi(Build.VERSION_CODES.N)
fun Date.getNowInString(): String {
    val pattern = "yyyy-MM-dd"
    val simpleDateFormat = SimpleDateFormat(pattern, Locale.ENGLISH)
    return simpleDateFormat.format(this)
}