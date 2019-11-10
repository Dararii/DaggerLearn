package com.essensift.daggerlearn.car

import android.util.Log
import javax.inject.Inject

class PetrolEngine @Inject constructor() : Engine {

    companion object {
        const val TAG = "PETROL_ENGINE"
    }

    override fun startEngine() {
        Log.d(TAG, "$TAG started")
    }
}