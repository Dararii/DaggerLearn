package com.essensift.daggerlearn

import android.app.Application
import com.essensift.daggerlearn.car.dagger.AppComponent
import com.essensift.daggerlearn.car.dagger.DaggerAppComponent

class DaggerLearnApp : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        /*activityComponent = DaggerActivityComponent.builder()
            .engineCapacity(1400)
            .horsePower(120)
            .build()*/
        appComponent = DaggerAppComponent.create()
    }
}