package com.essensift.daggerlearn.car

import android.util.Log
import javax.inject.Inject

class DieselEngine @Inject constructor() : Engine {

    companion object {
        const val TAG = "DIESEL_ENGINE"
    }

    override fun startEngine() {
        Log.d(TAG, "$TAG started")
    }
}