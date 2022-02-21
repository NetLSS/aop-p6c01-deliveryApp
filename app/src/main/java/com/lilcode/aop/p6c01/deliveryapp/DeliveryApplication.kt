package com.lilcode.aop.p6c01.deliveryapp

import android.app.Application
import android.content.Context

class DeliveryApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        _appContext = this
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