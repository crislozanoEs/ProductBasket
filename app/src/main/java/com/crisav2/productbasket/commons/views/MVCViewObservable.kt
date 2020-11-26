package com.crisav2.productbasket.commons.views

import androidx.databinding.ViewDataBinding

open class MVCViewObservable<ListenerType,BindingType: ViewDataBinding>: InMVCViewObservable<ListenerType, BindingType>, MVCView<BindingType>() {

    private val listeners = mutableSetOf<ListenerType>()
    override fun registerListener(listener: ListenerType): Boolean = listeners.add(listener)
    override fun unregisterListener(listener: ListenerType): Boolean = listeners.remove(listener)
    override fun getListeners(): Set<ListenerType> = listeners
}