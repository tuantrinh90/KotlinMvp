package com.example.tuantx.kotlinmvp.di.module

import com.example.tuantx.kotlinmvp.model.ApiInterfaces
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/**
 * Created by tuantx on 4/26/2018.
 */
@Module
class PostModule {
    private var retrofit: Retrofit? = null
    private val baseURL = "https://jsonplaceholder.typicode.com/"

    @Singleton
    @Provides
    fun providerRetrofit(): ApiInterfaces {
        retrofit = Retrofit.Builder()
                .baseUrl(baseURL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        return retrofit!!.create(ApiInterfaces::class.java)

    }
}