package com.lilcode.aop.p6c01.deliveryapp.widget.adapter.viewHolder

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.lilcode.aop.p6c01.deliveryapp.model.Model
import com.lilcode.aop.p6c01.deliveryapp.screen.base.BaseViewModel
import com.lilcode.aop.p6c01.deliveryapp.util.provider.ResourcesProvider
import com.lilcode.aop.p6c01.deliveryapp.widget.adapter.listener.AdapterListener

abstract class ModelViewHolder<M : Model>(
    binding: ViewBinding,
    val viewModel: BaseViewModel,
    val resourcesProvider: ResourcesProvider
) : RecyclerView.ViewHolder(binding.root) {

    abstract fun reset()

    open fun bindData(model: M) {
        reset()
    }

    abstract fun bindViews(model: M, adapterListener: AdapterListener)
}