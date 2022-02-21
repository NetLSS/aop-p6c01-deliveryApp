package com.lilcode.aop.p6c01.deliveryapp.util.provider

import android.content.Context
import android.content.res.ColorStateList
import androidx.annotation.ColorRes
import androidx.annotation.StringRes
import androidx.core.content.ContextCompat

class DefaultResourcesProvider(
    private val context: Context
) : ResourcesProvider {

    override fun getString(@StringRes resId: Int): String = context.getString(resId)

    override fun getString(@StringRes resId: Int, vararg fromArgs: Any): String =
        context.getString(resId, fromArgs)

    override fun getColor(@ColorRes resId: Int): Int = ContextCompat.getColor(context, resId)

    override fun getColorStateList(@ColorRes resId: Int): ColorStateList =
        context.getColorStateList(resId)

}