package com.essensift.daggerlearn.car

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class PetrolEngine @Inject constructor(
    @Named("HP") var hp: Int,
    @Named("CAPACITY") var capacity: Int
) : Engine {

    companion object {
        const val TAG = "PETROL_ENGINE"
    }

    override fun startEngine() {
        Log.d(TAG, "$TAG started. HP: $hp, Capacity: $capacity")
    }
}