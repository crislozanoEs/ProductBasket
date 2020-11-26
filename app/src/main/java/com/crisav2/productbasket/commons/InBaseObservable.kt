package com.crisav2.productbasket.commons

interface InBaseObservable<ListenerType> {

    fun registerListener(listener: ListenerType): Boolean

    fun unregisterListener(listener: ListenerType): Boolean

    fun getListeners(): Set<ListenerType>
}