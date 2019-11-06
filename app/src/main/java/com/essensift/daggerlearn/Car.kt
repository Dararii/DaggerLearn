package com.essensift.daggerlearn

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(
    var engine: Engine,
    var wheel: Wheel
) {

    companion object {
        const val TAG: String = "CAR"
    }

    fun drive() {
        Log.d(TAG, "driving..")
    }
}