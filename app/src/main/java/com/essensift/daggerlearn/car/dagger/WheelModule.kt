package com.essensift.daggerlearn.car.dagger

import com.essensift.daggerlearn.car.Rim
import com.essensift.daggerlearn.car.Tire
import com.essensift.daggerlearn.car.Wheel
import dagger.Module
import dagger.Provides

@Module
class WheelModule {

    @Provides
    fun provideRim(): Rim {
        return Rim()
    }

    @Provides
    fun provideTire(): Tire {
        val tire = Tire()
        tire.inflate()
        return tire
    }

    @Provides
    fun provideWheel(rim: Rim, tire: Tire): Wheel {
        return Wheel(rim, tire)
    }
}