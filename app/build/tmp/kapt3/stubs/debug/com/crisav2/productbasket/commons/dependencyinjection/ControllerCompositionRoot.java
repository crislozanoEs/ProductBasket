package com.crisav2.productbasket.commons.dependencyinjection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/crisav2/productbasket/commons/dependencyinjection/ControllerCompositionRoot;", "", "activityCompositionRoot", "Lcom/crisav2/productbasket/commons/dependencyinjection/ActivityCompositionRoot;", "(Lcom/crisav2/productbasket/commons/dependencyinjection/ActivityCompositionRoot;)V", "getActivity", "Landroidx/appcompat/app/AppCompatActivity;", "getAddProductValidator", "Lcom/crisav2/core/useCase/ft01/AddProductValidator;", "getCalculatorTotalProduct", "Lcom/crisav2/core/useCase/ft10/CalculateTotalProduct;", "getContext", "Landroid/content/Context;", "getErrorsTable", "Lcom/crisav2/core/data/commons/ErrorsTable;", "getMVCViewFactory", "Lcom/crisav2/productbasket/commons/views/MVCViewFactory;", "getNavigationController", "Lcom/crisav2/productbasket/commons/navigation/NavigationHelper;", "getViewModelFactory", "Lcom/crisav2/productbasket/commons/viewmodel/ViewModelFactory;", "app_debug"})
public final class ControllerCompositionRoot {
    private final com.crisav2.productbasket.commons.dependencyinjection.ActivityCompositionRoot activityCompositionRoot = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.app.AppCompatActivity getActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.crisav2.productbasket.commons.views.MVCViewFactory getMVCViewFactory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.crisav2.productbasket.commons.navigation.NavigationHelper getNavigationController() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.crisav2.productbasket.commons.viewmodel.ViewModelFactory getViewModelFactory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.crisav2.core.useCase.ft01.AddProductValidator getAddProductValidator() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.crisav2.core.data.commons.ErrorsTable getErrorsTable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.crisav2.core.useCase.ft10.CalculateTotalProduct getCalculatorTotalProduct() {
        return null;
    }
    
    public ControllerCompositionRoot(@org.jetbrains.annotations.NotNull()
    com.crisav2.productbasket.commons.dependencyinjection.ActivityCompositionRoot activityCompositionRoot) {
        super();
    }
}