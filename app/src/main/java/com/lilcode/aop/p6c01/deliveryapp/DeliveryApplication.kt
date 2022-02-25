package com.lilcode.aop.p6c01.deliveryapp

import android.app.Application
import android.content.Context
import com.lilcode.aop.p6c01.deliveryapp.di.appModule
import org.koin.core.context.startKoin
import org.koin.dsl.module

class DeliveryApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        _appContext = this

        startKoin {
            modules(appModule)
        }
    }

    override fun onTerminate() {
        super.onTerminate()
        _appContext = null
    }

    companion object {
        var _appContext: Context? = null
            private set
    }
}