package com.essensift.daggerlearn.car.dagger

import com.essensift.daggerlearn.car.Engine
import com.essensift.daggerlearn.car.PetrolEngine
import dagger.Binds
import dagger.Module

@Module
abstract class PetrolEngineModule {

    @Binds
    abstract fun provideEngine(engine: PetrolEngine): Engine
}