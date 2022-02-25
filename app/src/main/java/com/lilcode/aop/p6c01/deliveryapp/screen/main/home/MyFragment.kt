package com.lilcode.aop.p6c01.deliveryapp.screen.main.home

import com.lilcode.aop.p6c01.deliveryapp.databinding.FragmentMyBinding
import com.lilcode.aop.p6c01.deliveryapp.screen.base.BaseFragment
import org.koin.android.viewmodel.ext.android.viewModel

class MyFragment : BaseFragment<MyViewModel, FragmentMyBinding>() {

    override val viewModel by viewModel<MyViewModel>()

    override fun getViewBinding(): FragmentMyBinding = FragmentMyBinding.inflate(layoutInflater)

    override fun observeData() {
        TODO("Not yet implemented")
    }


    companion object {

        fun newInstance() = MyFragment()

        const val TAG = "MyFragment"
    }

}