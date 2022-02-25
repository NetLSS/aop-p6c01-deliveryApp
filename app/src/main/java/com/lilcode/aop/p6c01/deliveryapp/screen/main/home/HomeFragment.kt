package com.lilcode.aop.p6c01.deliveryapp.screen.main.home

import com.lilcode.aop.p6c01.deliveryapp.databinding.FragmentHomeBinding
import com.lilcode.aop.p6c01.deliveryapp.screen.base.BaseFragment
import org.koin.android.viewmodel.ext.android.viewModel

class HomeFragment : BaseFragment<HomeViewModel, FragmentHomeBinding>() {

    override val viewModel by viewModel<HomeViewModel>()

    override fun getViewBinding(): FragmentHomeBinding = FragmentHomeBinding.inflate(layoutInflater)

    override fun observeData() {
        TODO("Not yet implemented")
    }

    companion object {

        fun newInstance() = HomeFragment()

        const val TAG = "HomeFragment"
    }

}