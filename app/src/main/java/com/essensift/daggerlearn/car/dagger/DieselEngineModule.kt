package com.essensift.daggerlearn.car.dagger

import com.essensift.daggerlearn.car.DieselEngine
import com.essensift.daggerlearn.car.Engine
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule {

    @Provides
    fun provideEngine(engine: DieselEngine): Engine {
        return engine
    }
}