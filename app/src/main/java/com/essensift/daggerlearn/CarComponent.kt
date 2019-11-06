package com.essensift.daggerlearn

import dagger.Component

@Component
interface CarComponent {

    fun getCar(): Car
}