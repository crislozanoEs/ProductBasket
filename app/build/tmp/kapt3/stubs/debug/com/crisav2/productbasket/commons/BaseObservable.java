package com.crisav2.productbasket.commons;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u000bJ\u0015\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u000bR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/crisav2/productbasket/commons/BaseObservable;", "ListenerType", "Lcom/crisav2/productbasket/commons/InBaseObservable;", "()V", "listeners", "", "getListeners", "", "registerListener", "", "listener", "(Ljava/lang/Object;)Z", "unregisterListener", "app_debug"})
public class BaseObservable<ListenerType extends java.lang.Object> implements com.crisav2.productbasket.commons.InBaseObservable<ListenerType> {
    private final java.util.Set<ListenerType> listeners = null;
    
    @java.lang.Override()
    public boolean registerListener(ListenerType listener) {
        return false;
    }
    
    @java.lang.Override()
    public boolean unregisterListener(ListenerType listener) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Set<ListenerType> getListeners() {
        return null;
    }
    
    public BaseObservable() {
        super();
    }
}