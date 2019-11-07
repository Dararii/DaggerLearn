package com.essensift.daggerlearn

import android.util.Log
import javax.inject.Inject

class Remote @Inject constructor() {

    companion object {
        private const val TAG = "REMOTE"
    }

    fun setListener(car: Car) {
        Log.d(TAG, "Listener Added")
    }
}