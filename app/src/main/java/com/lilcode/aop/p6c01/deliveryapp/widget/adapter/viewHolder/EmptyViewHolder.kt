package com.lilcode.aop.p6c01.deliveryapp.widget.adapter.viewHolder

import com.lilcode.aop.p6c01.deliveryapp.databinding.ViewholderEmptyBinding
import com.lilcode.aop.p6c01.deliveryapp.model.Model
import com.lilcode.aop.p6c01.deliveryapp.screen.base.BaseViewModel
import com.lilcode.aop.p6c01.deliveryapp.util.provider.ResourcesProvider
import com.lilcode.aop.p6c01.deliveryapp.widget.adapter.listener.AdapterListener

class EmptyViewHolder(
    binding: ViewholderEmptyBinding,
    viewModel: BaseViewModel,
    resourcesProvider: ResourcesProvider
): ModelViewHolder<Model>(binding, viewModel, resourcesProvider) {
    override fun reset() = Unit

    override fun bindViews(model: Model, adapterListener: AdapterListener)  = Unit
}