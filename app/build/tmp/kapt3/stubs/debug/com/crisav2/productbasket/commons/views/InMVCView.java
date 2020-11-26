package com.crisav2.productbasket.commons.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H&\u00a8\u0006\t"}, d2 = {"Lcom/crisav2/productbasket/commons/views/InMVCView;", "BindingType", "Landroidx/databinding/ViewDataBinding;", "", "getRootView", "Landroid/view/View;", "setRootView", "", "view", "app_debug"})
public abstract interface InMVCView<BindingType extends androidx.databinding.ViewDataBinding> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.view.View getRootView();
    
    public abstract void setRootView(@org.jetbrains.annotations.NotNull()
    android.view.View view);
}