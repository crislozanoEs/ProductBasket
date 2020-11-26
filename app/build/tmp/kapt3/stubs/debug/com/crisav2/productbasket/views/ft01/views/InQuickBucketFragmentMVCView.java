package com.crisav2.productbasket.views.ft01.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tR\u0018\u0010\u0004\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\n"}, d2 = {"Lcom/crisav2/productbasket/views/ft01/views/InQuickBucketFragmentMVCView;", "Lcom/crisav2/productbasket/commons/views/InMVCViewObservable;", "Lcom/crisav2/productbasket/views/ft01/views/InQuickBucketFragmentMVCView$Listener;", "Lcom/crisav2/productbasket/databinding/QuickBucketFragmentBinding;", "binding", "getBinding", "()Lcom/crisav2/productbasket/databinding/QuickBucketFragmentBinding;", "setBinding", "(Lcom/crisav2/productbasket/databinding/QuickBucketFragmentBinding;)V", "Listener", "app_debug"})
public abstract interface InQuickBucketFragmentMVCView extends com.crisav2.productbasket.commons.views.InMVCViewObservable<com.crisav2.productbasket.views.ft01.views.InQuickBucketFragmentMVCView.Listener, com.crisav2.productbasket.databinding.QuickBucketFragmentBinding> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.crisav2.productbasket.databinding.QuickBucketFragmentBinding getBinding();
    
    public abstract void setBinding(@org.jetbrains.annotations.NotNull()
    com.crisav2.productbasket.databinding.QuickBucketFragmentBinding p0);
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/crisav2/productbasket/views/ft01/views/InQuickBucketFragmentMVCView$Listener;", "", "onAddProductsClicked", "", "app_debug"})
    public static abstract interface Listener {
        
        public abstract void onAddProductsClicked();
    }
}