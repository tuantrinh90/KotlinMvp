package com.example.tuantx.kotlinmvp.model

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class ApiService {

         var retrofit: Retrofit? = null
         val baseURL = "https://jsonplaceholder.typicode.com/"

        fun createService(): ApiInterfaces {
            retrofit = Retrofit.Builder()
                    .baseUrl(baseURL)
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            return retrofit!!.create(ApiInterfaces::class.java)
        }


}