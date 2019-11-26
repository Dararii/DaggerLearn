package com.essensift.daggerlearn.car.dagger

import com.essensift.daggerlearn.MainActivity
import com.essensift.daggerlearn.car.Car
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

@PerActivity
@Component(
    dependencies = [AppComponent::class],
    modules = [WheelModule::class, PetrolEngineModule::class]
)
interface ActivityComponent {

    fun getCar(): Car

    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun horsePower(@Named("HP") hp: Int): Builder

        @BindsInstance
        fun engineCapacity(@Named("CAPACITY") capacity: Int): Builder

        fun appComponent(appComponent: AppComponent): Builder

        fun build(): ActivityComponent
    }

}