package com.lilcode.aop.p6c01.deliveryapp.util.mapper

import android.view.LayoutInflater
import android.view.ViewGroup
import com.lilcode.aop.p6c01.deliveryapp.databinding.ViewholderEmptyBinding
import com.lilcode.aop.p6c01.deliveryapp.model.CellType
import com.lilcode.aop.p6c01.deliveryapp.model.Model
import com.lilcode.aop.p6c01.deliveryapp.screen.base.BaseViewModel
import com.lilcode.aop.p6c01.deliveryapp.util.provider.ResourcesProvider
import com.lilcode.aop.p6c01.deliveryapp.widget.adapter.viewHolder.EmptyViewHolder
import com.lilcode.aop.p6c01.deliveryapp.widget.adapter.viewHolder.ModelViewHolder

object ModelViewHolderMapper {

    @Suppress("UNCHECKED_CAST")
    fun <M : Model> map(
        parent: ViewGroup,
        type: CellType,
        viewModel: BaseViewModel,
        resourcesProvider: ResourcesProvider
    ): ModelViewHolder<M> {
        val inflater = LayoutInflater.from(parent.context)
        val viewHolder = when (type) {
            CellType.EMPTY_CELL -> EmptyViewHolder(
                ViewholderEmptyBinding.inflate(inflater, parent, false),
                viewModel,
                resourcesProvider
            )
        }
        return viewHolder as ModelViewHolder<M>
    }

}