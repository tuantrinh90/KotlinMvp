package com.example.tuantx.kotlinmvp.application

import android.app.Application
import com.example.tuantx.kotlinmvp.di.component.DaggerPostComponent
import com.example.tuantx.kotlinmvp.di.component.PostComponent
import com.example.tuantx.kotlinmvp.di.module.PostModule

/**
 * Created by tuantx on 4/26/2018.
 */
class PostApplication : Application() {

    lateinit var postComponent: PostComponent

    override fun onCreate() {
        super.onCreate()
        postComponent = createPostComponent()
    }


    companion object {
        fun createPostComponent(): PostComponent {
            return DaggerPostComponent.builder().postModule(PostModule()).build()
        }
    }


}