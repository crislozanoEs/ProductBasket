package com.crisav2.productbasket.commons.views

import android.content.Context
import android.view.View
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.LifecycleOwner

open class MVCView<BindingType: ViewDataBinding>: InMVCView<BindingType> {

    private var rootView: View ?= null
    override fun getRootView(): View = rootView!!
    override fun setRootView(view: View) {
        rootView = view
    }
}