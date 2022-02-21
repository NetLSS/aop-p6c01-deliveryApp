package com.lilcode.aop.p6c01.deliveryapp.screen.base

import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

abstract class BaseViewModel : ViewModel() {

    protected var stateBundle: Bundle? = null

    open fun fetchData(): Job = viewModelScope.launch {  }

    open fun storeState(stateBundle: Bundle) {
        this.stateBundle = stateBundle
        /*
        fragment 가 종료 되기 전 까지는 유지
         */
    }

}