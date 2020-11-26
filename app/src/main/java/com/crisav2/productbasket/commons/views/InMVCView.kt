package com.crisav2.productbasket.commons.views

import android.view.View
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.LifecycleOwner

interface InMVCView<BindingType: ViewDataBinding> {

    fun getRootView(): View
    fun setRootView(view: View)

}