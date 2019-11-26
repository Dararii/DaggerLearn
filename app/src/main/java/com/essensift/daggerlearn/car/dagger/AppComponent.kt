package com.essensift.daggerlearn.car.dagger

import com.essensift.daggerlearn.car.Driver
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DriverModule::class])
interface AppComponent {

    fun getDriver(): Driver
}