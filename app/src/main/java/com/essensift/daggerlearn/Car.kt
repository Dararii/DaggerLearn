package com.essensift.daggerlearn

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(
    var engine: Engine,
    var wheel: Wheel
) {

    //Inject sequence: Constructor, Field, Method

    companion object {
        const val TAG: String = "CAR"
    }

    //Method Injection
    @Inject
    fun remoteCar(remote: Remote) {
        remote.setListener(this)
    }

    fun drive() {
        Log.d(TAG, "driving..")
    }
}