package com.essensift.daggerlearn

import android.app.Application
import com.essensift.daggerlearn.car.dagger.AppComponent
import com.essensift.daggerlearn.car.dagger.DaggerAppComponent
import com.essensift.daggerlearn.car.dagger.DriverModule

class DaggerLearnApp : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        /*activityComponent = DaggerActivityComponent.builder()
            .engineCapacity(1400)
            .horsePower(120)
            .build()*/
        appComponent = DaggerAppComponent.factory().create(DriverModule("Darari"))
    }
}