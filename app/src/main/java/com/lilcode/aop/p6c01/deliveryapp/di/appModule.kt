package com.lilcode.aop.p6c01.deliveryapp.di

import com.lilcode.aop.p6c01.deliveryapp.screen.main.home.HomeViewModel
import com.lilcode.aop.p6c01.deliveryapp.screen.main.home.MyViewModel
import com.lilcode.aop.p6c01.deliveryapp.util.provider.DefaultResourcesProvider
import com.lilcode.aop.p6c01.deliveryapp.util.provider.ResourcesProvider
import kotlinx.coroutines.Dispatchers
import org.koin.android.ext.koin.androidApplication
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    viewModel { HomeViewModel() }
    viewModel { MyViewModel() }

    single { provideGsonConvertFactory() }
    single { buildOkHttpClient() }
    single { provideRetrofit(get(), get()) }

    single<ResourcesProvider> { DefaultResourcesProvider(androidApplication()) }

    single { Dispatchers.IO }
    single { Dispatchers.Main }

}