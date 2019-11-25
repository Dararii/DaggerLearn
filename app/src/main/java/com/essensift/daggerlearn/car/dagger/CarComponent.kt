package com.essensift.daggerlearn.car.dagger

import com.essensift.daggerlearn.MainActivity
import com.essensift.daggerlearn.car.Car
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Component(modules = [WheelModule::class, PetrolEngineModule::class])
interface CarComponent {

    fun getCar(): Car

    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun horsePower(@Named("HP") hp: Int): Builder

        @BindsInstance
        fun engineCapacity(@Named("CAPACITY") capacity: Int): Builder

        fun build(): CarComponent
    }

}