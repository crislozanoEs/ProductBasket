package com.crisav2.productbasket.commons.navigation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/crisav2/productbasket/commons/navigation/NavigationHelper;", "Lcom/crisav2/productbasket/commons/BaseObservable;", "Lcom/crisav2/productbasket/commons/navigation/NavigationHelper$Listener;", "navController", "Landroidx/navigation/NavController;", "(Landroidx/navigation/NavController;)V", "fromBasketListToAddNewProduct", "", "updateOnAddNewProductClicked", "Listener", "app_debug"})
public final class NavigationHelper extends com.crisav2.productbasket.commons.BaseObservable<com.crisav2.productbasket.commons.navigation.NavigationHelper.Listener> {
    private final androidx.navigation.NavController navController = null;
    
    public final void updateOnAddNewProductClicked() {
    }
    
    public final void fromBasketListToAddNewProduct() {
    }
    
    public NavigationHelper(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController navController) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/crisav2/productbasket/commons/navigation/NavigationHelper$Listener;", "", "onAddNewProductClicked", "", "app_debug"})
    public static abstract interface Listener {
        
        public abstract void onAddNewProductClicked();
    }
}