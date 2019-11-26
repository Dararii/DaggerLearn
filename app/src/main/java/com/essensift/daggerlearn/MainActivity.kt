package com.essensift.daggerlearn

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.essensift.daggerlearn.car.Car
import com.essensift.daggerlearn.car.dagger.DaggerActivityComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car

    @Inject
    lateinit var car2: Car


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*val carComponent = DaggerCarComponent.builder()
            .horsePower(100)
            .engineCapacity(1400)
            .build()*/

        //val carComponent = (application as DaggerLearnApp).activityComponent

        val activityComponent = DaggerActivityComponent.builder()
            .engineCapacity(1400)
            .horsePower(120)
            .appComponent((application as DaggerLearnApp).appComponent)
            .build()

        //Constructor Injection
        //car = carComponent.getCar()

        //Field Injection
        //carComponent.inject(this)

        activityComponent.inject(this)

        car.drive()
        car2.drive()
    }
}
