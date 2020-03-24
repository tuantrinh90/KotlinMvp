package com.example.tuantx.kotlinmvp.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.tuantx.kotlinmvp.application.PostApplication
import com.example.tuantx.kotlinmvp.model.ApiInterfaces
import javax.inject.Inject

/**
 * Created by tuantx on 5/2/2018.
 */
abstract class BaseActivity : AppCompatActivity() {
    @Inject
    lateinit var apiInterfaces: ApiInterfaces

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())

        //Todo comment
        
        PostApplication.createPostComponent().inject(this)

    }

    abstract fun getLayoutId(): Int
}