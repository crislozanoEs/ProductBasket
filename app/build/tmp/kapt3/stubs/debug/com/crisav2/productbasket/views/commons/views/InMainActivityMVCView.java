package com.crisav2.productbasket.views.commons.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\fJ\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\nH&R\u0018\u0010\u0004\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Lcom/crisav2/productbasket/views/commons/views/InMainActivityMVCView;", "Lcom/crisav2/productbasket/commons/views/InMVCViewObservable;", "Lcom/crisav2/productbasket/views/commons/views/InMainActivityMVCView$Listener;", "Lcom/crisav2/productbasket/databinding/ActivityMainBinding;", "binding", "getBinding", "()Lcom/crisav2/productbasket/databinding/ActivityMainBinding;", "setBinding", "(Lcom/crisav2/productbasket/databinding/ActivityMainBinding;)V", "getLayoutId", "", "getNavControllerId", "Listener", "app_debug"})
public abstract interface InMainActivityMVCView extends com.crisav2.productbasket.commons.views.InMVCViewObservable<com.crisav2.productbasket.views.commons.views.InMainActivityMVCView.Listener, com.crisav2.productbasket.databinding.ActivityMainBinding> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.crisav2.productbasket.databinding.ActivityMainBinding getBinding();
    
    public abstract void setBinding(@org.jetbrains.annotations.NotNull()
    com.crisav2.productbasket.databinding.ActivityMainBinding p0);
    
    public abstract int getLayoutId();
    
    public abstract int getNavControllerId();
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lcom/crisav2/productbasket/views/commons/views/InMainActivityMVCView$Listener;", "", "onFavoriteProductsClicked", "", "onListBasketsClicked", "onQuickBasketClicked", "app_debug"})
    public static abstract interface Listener {
        
        public abstract void onQuickBasketClicked();
        
        public abstract void onListBasketsClicked();
        
        public abstract void onFavoriteProductsClicked();
    }
}