package com.example.tuantx.kotlinmvp.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.annotations.RealmClass

/**
 * Created by tuantx on 4/26/2018.
 */
@RealmClass
open class Post : RealmObject() {

    @SerializedName("id")
    @PrimaryKey
    var id: Int = 0

    @SerializedName("title")
    @Expose
    var title: String = ""

    @SerializedName("body")
    @Expose
    var body: String = ""
}