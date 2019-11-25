package com.essensift.daggerlearn.car

import android.util.Log
import javax.inject.Inject

class DieselEngine @Inject constructor(var hp: Int) : Engine {

    companion object {
        const val TAG = "DIESEL_ENGINE"
    }

    override fun startEngine() {
        Log.d(TAG, "$TAG started HP: $hp")
    }
}