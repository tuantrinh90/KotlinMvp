package com.example.tuantx.kotlinmvp.activity

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.tuantx.kotlinmvp.R
import com.example.tuantx.kotlinmvp.adapter.PostAdapter
import com.example.tuantx.kotlinmvp.model.Post
import com.example.tuantx.kotlinmvp.presenter.PostPresenter
import com.example.tuantx.kotlinmvp.view.PostContract
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity(), PostContract {

    lateinit var postPresenter: PostPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        this.postPresenter = PostPresenter(this, apiInterfaces)

        postPresenter.showListPost()
        rv_post?.setHasFixedSize(true)
        rv_post?.layoutManager = LinearLayoutManager(this)

    }

    override fun getLayoutId(): Int {
        return R.layout.activity_main
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
