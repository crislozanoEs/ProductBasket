package com.crisav2.productbasket.commons.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00042\b\u0012\u0004\u0012\u0002H\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016J\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u000eR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/crisav2/productbasket/commons/views/MVCViewObservable;", "ListenerType", "BindingType", "Landroidx/databinding/ViewDataBinding;", "Lcom/crisav2/productbasket/commons/views/InMVCViewObservable;", "Lcom/crisav2/productbasket/commons/views/MVCView;", "()V", "listeners", "", "getListeners", "", "registerListener", "", "listener", "(Ljava/lang/Object;)Z", "unregisterListener", "app_debug"})
public class MVCViewObservable<ListenerType extends java.lang.Object, BindingType extends androidx.databinding.ViewDataBinding> extends com.crisav2.productbasket.commons.views.MVCView<BindingType> implements com.crisav2.productbasket.commons.views.InMVCViewObservable<ListenerType, BindingType> {
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
    
    public MVCViewObservable() {
        super();
    }
}