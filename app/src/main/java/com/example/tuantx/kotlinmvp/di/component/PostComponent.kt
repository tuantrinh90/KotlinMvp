package com.example.tuantx.kotlinmvp.di.component

import com.example.tuantx.kotlinmvp.activity.MainActivity
import com.example.tuantx.kotlinmvp.di.module.PostModule
import dagger.Component

/**
 * Created by tuantx on 4/26/2018.
 */

@Component(modules = arrayOf(PostModule::class))
interface PostComponent {
    fun inject(mainActivity: MainActivity)

}