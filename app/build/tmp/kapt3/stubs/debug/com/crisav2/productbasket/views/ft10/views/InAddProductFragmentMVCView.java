package com.crisav2.productbasket.views.ft10.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0017J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H&R\u0018\u0010\u0004\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0018"}, d2 = {"Lcom/crisav2/productbasket/views/ft10/views/InAddProductFragmentMVCView;", "Lcom/crisav2/productbasket/commons/views/InMVCViewObservable;", "Lcom/crisav2/productbasket/views/ft10/views/InAddProductFragmentMVCView$Listener;", "Lcom/crisav2/productbasket/databinding/AddProductFragmentBinding;", "binding", "getBinding", "()Lcom/crisav2/productbasket/databinding/AddProductFragmentBinding;", "setBinding", "(Lcom/crisav2/productbasket/databinding/AddProductFragmentBinding;)V", "changeDiscountCVisibility", "", "visible", "", "changeDiscountContainerVisibility", "changeDiscountPVisibility", "setDiscountTypeCFieldError", "errorId", "", "setDiscountTypePFieldError", "setProductAmountFieldError", "setProductBrandFieldError", "setProductPriceFieldError", "setProductTypeFieldError", "Listener", "app_debug"})
public abstract interface InAddProductFragmentMVCView extends com.crisav2.productbasket.commons.views.InMVCViewObservable<com.crisav2.productbasket.views.ft10.views.InAddProductFragmentMVCView.Listener, com.crisav2.productbasket.databinding.AddProductFragmentBinding> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.crisav2.productbasket.databinding.AddProductFragmentBinding getBinding();
    
    public abstract void setBinding(@org.jetbrains.annotations.NotNull()
    com.crisav2.productbasket.databinding.AddProductFragmentBinding p0);
    
    public abstract void changeDiscountContainerVisibility(boolean visible);
    
    public abstract void changeDiscountPVisibility(boolean visible);
    
    public abstract void changeDiscountCVisibility(boolean visible);
    
    public abstract void setProductTypeFieldError(int errorId);
    
    public abstract void setProductBrandFieldError(int errorId);
    
    public abstract void setProductAmountFieldError(int errorId);
    
    public abstract void setProductPriceFieldError(int errorId);
    
    public abstract void setDiscountTypePFieldError(int errorId);
    
    public abstract void setDiscountTypeCFieldError(int errorId);
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0003H&\u00a8\u0006\u0010"}, d2 = {"Lcom/crisav2/productbasket/views/ft10/views/InAddProductFragmentMVCView$Listener;", "", "onAmount1Changed", "", "onAmount2Changed", "onDeleteProductClicked", "onDiscountChanged", "checkId", "", "onPercentageChanged", "onProductAmountTextChanged", "onProductBrandTextChanged", "onProductHasDiscountChanged", "onProductPriceTextChanged", "onProductTypeTextChanged", "onSaveProductClicked", "app_debug"})
    public static abstract interface Listener {
        
        public abstract void onSaveProductClicked();
        
        public abstract void onDeleteProductClicked();
        
        public abstract void onProductTypeTextChanged();
        
        public abstract void onProductBrandTextChanged();
        
        public abstract void onProductAmountTextChanged();
        
        public abstract void onProductPriceTextChanged();
        
        public abstract void onProductHasDiscountChanged();
        
        public abstract void onDiscountChanged(int checkId);
        
        public abstract void onPercentageChanged();
        
        public abstract void onAmount1Changed();
        
        public abstract void onAmount2Changed();
    }
}