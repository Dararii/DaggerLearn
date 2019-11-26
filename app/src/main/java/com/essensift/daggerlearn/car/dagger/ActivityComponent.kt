package com.essensift.daggerlearn.car.dagger

import com.essensift.daggerlearn.MainActivity
import com.essensift.daggerlearn.car.Car
import dagger.BindsInstance
import dagger.Subcomponent
import javax.inject.Named

@PerActivity
@Subcomponent(modules = [WheelModule::class, PetrolEngineModule::class])
interface ActivityComponent {

    fun getCar(): Car

    fun inject(mainActivity: MainActivity)

    /*@Component.Builder
    interface Builder {

        @BindsInstance
        fun horsePower(@Named("HP") hp: Int): Builder

        @BindsInstance
        fun engineCapacity(@Named("CAPACITY") capacity: Int): Builder

        fun appComponent(appComponent: AppComponent): Builder

        fun build(): ActivityComponent
    }*/

    /*@Subcomponent.Builder
    interface Builder {

        @BindsInstance
        fun horsePower(@Named("HP") hp: Int): Builder

        @BindsInstance
        fun engineCapacity(@Named("CAPACITY") capacity: Int): Builder

        fun build(): ActivityComponent
    }*/

    @Subcomponent.Factory
    interface Factory {

        fun create(
            @BindsInstance @Named("HP") hp: Int,
            @BindsInstance @Named("CAPACITY") capacity: Int
        ): ActivityComponent

    }

}