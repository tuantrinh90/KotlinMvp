package com.example.tuantx.kotlinmvp.presenter

import com.example.tuantx.kotlinmvp.model.ApiService
import com.example.tuantx.kotlinmvp.model.Post
import com.example.tuantx.kotlinmvp.view.PostContract
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

/**
 * Created by tuantx on 4/26/2018.
 */
class PostPresenter {

    var apiService: ApiService? = null
    var compositeDisposable = CompositeDisposable()
    var postContract: PostContract? = null

    constructor(postContract: PostContract, apiService: ApiService) {
        this.postContract = postContract
        this.apiService = apiService
    }

    fun showListPost() {
        compositeDisposable!!.add(apiService!!.createService().getPost()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe { listPost: List<Post> -> postContract?.showListPost(listPost) })
    }

    fun unSubScribe() {
        compositeDisposable.isDisposed
    }


}