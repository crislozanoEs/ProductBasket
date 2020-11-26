package com.crisav2.productbasket.commons;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H&J\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\b\u00a8\u0006\n"}, d2 = {"Lcom/crisav2/productbasket/commons/InBaseObservable;", "ListenerType", "", "getListeners", "", "registerListener", "", "listener", "(Ljava/lang/Object;)Z", "unregisterListener", "app_debug"})
public abstract interface InBaseObservable<ListenerType extends java.lang.Object> {
    
    public abstract boolean registerListener(ListenerType listener);
    
    public abstract boolean unregisterListener(ListenerType listener);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Set<ListenerType> getListeners();
}