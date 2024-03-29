package com.essensift.daggerlearn.car

import android.util.Log
import com.essensift.daggerlearn.car.dagger.PerActivity
import javax.inject.Inject

@PerActivity
class Car @Inject constructor(
    var driver: Driver,
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
        engine.startEngine()
        Log.d(TAG, "$driver ${driver.name} driving.. $this")
    }
}