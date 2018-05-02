package com.example.tuantx.kotlinmvp.model

import io.reactivex.Observable
import retrofit2.http.GET

/**
 * Created by tuantx on 4/26/2018.
 */
interface ApiInterfaces {

    @GET("posts")
    fun getPost(): Observable<List<Post>>
}