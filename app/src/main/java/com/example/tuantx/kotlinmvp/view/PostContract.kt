package com.example.tuantx.kotlinmvp.view

import com.example.tuantx.kotlinmvp.model.Post

/**
 * Created by tuantx on 4/26/2018.
 */
interface PostContract {
    fun showListPost(list: List<Post>)
}