package com.essensift.daggerlearn.car.dagger

import com.essensift.daggerlearn.car.Driver
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DriverModule(var name: String) {

    @Provides
    @Singleton
    fun provideDriver(): Driver {
        return Driver(name)
    }
}