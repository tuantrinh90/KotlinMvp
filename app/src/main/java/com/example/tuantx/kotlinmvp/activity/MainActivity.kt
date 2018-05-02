package com.example.tuantx.kotlinmvp.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.example.tuantx.kotlinmvp.R
import com.example.tuantx.kotlinmvp.adapter.PostAdapter
import com.example.tuantx.kotlinmvp.application.PostApplication
import com.example.tuantx.kotlinmvp.model.ApiInterfaces
import com.example.tuantx.kotlinmvp.model.Post
import com.example.tuantx.kotlinmvp.presenter.PostPresenter
import com.example.tuantx.kotlinmvp.view.PostContract
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity(), PostContract {

    @Inject
    lateinit var apiInterfaces: ApiInterfaces

    lateinit var postPresenter: PostPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        PostApplication.createPostComponent().inject(this)

        this.postPresenter = PostPresenter(this, apiInterfaces)

        postPresenter.showListPost()
        rv_post?.setHasFixedSize(true)
        rv_post?.layoutManager = LinearLayoutManager(this)

    }


    override fun showListPost(list: List<Post>) {
        var adapter = PostAdapter(applicationContext, list!!)
        rv_post?.adapter = adapter
    }

    override fun onDestroy() {
        super.onDestroy()
        postPresenter.unSubScribe()
    }

}
