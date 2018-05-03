package com.example.tuantx.kotlinmvp.application

import android.app.Application
import com.example.tuantx.kotlinmvp.di.component.DaggerPostComponent
import com.example.tuantx.kotlinmvp.di.component.PostComponent
import com.example.tuantx.kotlinmvp.di.module.PostModule
import io.realm.Realm
import io.realm.RealmConfiguration

/**
 * Created by tuantx on 4/26/2018.
 */
class PostApplication : Application() {

    lateinit var postComponent: PostComponent
    var realmConfiguration: RealmConfiguration? = null

    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
        realmConfiguration = RealmConfiguration.Builder()
                .name(Realm.DEFAULT_REALM_NAME)
                .schemaVersion(2)
                .deleteRealmIfMigrationNeeded()
                .build()
        Realm.setDefaultConfiguration(realmConfiguration)
        postComponent = createPostComponent()
    }


    companion object {
        fun createPostComponent(): PostComponent {
            return DaggerPostComponent.builder().postModule(PostModule()).build()
        }
    }


}