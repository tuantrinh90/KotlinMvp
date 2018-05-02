package com.example.tuantx.kotlinmvp.di.component

import com.example.tuantx.kotlinmvp.activity.BaseActivity
import com.example.tuantx.kotlinmvp.activity.MainActivity
import com.example.tuantx.kotlinmvp.di.module.PostModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by tuantx on 4/26/2018.
 */
@Singleton
@Component(modules = arrayOf(PostModule::class))
interface PostComponent {
    fun inject(baseActivity: BaseActivity)

}