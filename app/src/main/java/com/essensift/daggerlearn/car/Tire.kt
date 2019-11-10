package com.essensift.daggerlearn.car

import android.util.Log

class Tire {

    companion object {
        private const val TAG = "TIRE"
    }

    fun inflate() {
        Log.d(TAG, "Tire Inflated")
    }
}