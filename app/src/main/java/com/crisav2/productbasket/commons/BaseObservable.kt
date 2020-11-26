package com.crisav2.productbasket.commons

open class BaseObservable<ListenerType>: InBaseObservable<ListenerType> {

    private val listeners = mutableSetOf<ListenerType>()

    override fun registerListener(listener: ListenerType) = listeners.add(listener)

    override fun unregisterListener(listener: ListenerType) = listeners.remove(listener)

    override fun getListeners(): Set<ListenerType> = listeners

}