package com.lilcode.aop.p6c01.deliveryapp.widget.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.lilcode.aop.p6c01.deliveryapp.model.CellType
import com.lilcode.aop.p6c01.deliveryapp.model.Model
import com.lilcode.aop.p6c01.deliveryapp.screen.base.BaseViewModel
import com.lilcode.aop.p6c01.deliveryapp.util.mapper.ModelViewHolderMapper
import com.lilcode.aop.p6c01.deliveryapp.util.provider.ResourcesProvider
import com.lilcode.aop.p6c01.deliveryapp.widget.adapter.listener.AdapterListener
import com.lilcode.aop.p6c01.deliveryapp.widget.adapter.viewHolder.ModelViewHolder

class ModelRecyclerAdapter<M : Model, VM : BaseViewModel>(
    private var modelList: List<Model>,
    private val viewModel: VM,
    private val resourcesProvider: ResourcesProvider,
    private val adapterListener: AdapterListener
) : ListAdapter<Model, ModelViewHolder<M>>(Model.DIFF_CALLBACK) {

    override fun getItemCount(): Int = modelList.size

    override fun getItemViewType(position: Int): Int = modelList[position].type.ordinal

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModelViewHolder<M> {
        return ModelViewHolderMapper.map(
            parent,
            CellType.values()[viewType],
            viewModel,
            resourcesProvider
        )
    }

    @Suppress("UNCHECKED_CAST")
    override fun onBindViewHolder(holder: ModelViewHolder<M>, position: Int) {
        with(holder) {
            bindData(modelList[position] as M)
            bindViews(modelList[position] as M, adapterListener)
        }
    }

    override fun submitList(list: MutableList<Model>?) {
        list?.let { modelList = it }
        super.submitList(list)
    }


}