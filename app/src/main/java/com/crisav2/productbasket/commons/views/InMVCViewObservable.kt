package com.crisav2.productbasket.commons.views

import androidx.databinding.ViewDataBinding
import com.crisav2.productbasket.commons.InBaseObservable

interface InMVCViewObservable<ListenerType,BindingType: ViewDataBinding>: InMVCView<BindingType>, InBaseObservable<ListenerType>{

}