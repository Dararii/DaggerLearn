package com.essensift.daggerlearn

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.essensift.daggerlearn.car.Car
import com.essensift.daggerlearn.car.dagger.DaggerCarComponent
import com.essensift.daggerlearn.car.dagger.DieselEngineModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val carComponent = DaggerCarComponent.builder()
            .dieselEngineModule(DieselEngineModule(100))
            .build()

        //Constructor Injection
        //car = carComponent.getCar()

        //Field Injection
        carComponent.inject(this)

        car.drive()
    }
}
