package com.essensift.daggerlearn.car.dagger

import com.essensift.daggerlearn.MainActivity
import com.essensift.daggerlearn.car.Car
import dagger.Component

@Component(modules = [WheelModule::class, DieselEngineModule::class])
interface CarComponent {

    fun getCar(): Car

    fun inject(mainActivity: MainActivity)
}