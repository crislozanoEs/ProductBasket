package com.crisav2.productbasket.commons.dependencyinjection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0015\u001a\u00020\u0005J\u0006\u0010\u0016\u001a\u00020\bJ\u0006\u0010\u0017\u001a\u00020\nJ\u0006\u0010\u0018\u001a\u00020\fJ\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u0010J\u0006\u0010\u001c\u001a\u00020\u0012J\u0006\u0010\u001d\u001a\u00020\u0014J\u000e\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020 R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/crisav2/productbasket/commons/dependencyinjection/ActivityCompositionRoot;", "", "compositionRoot", "Lcom/crisav2/productbasket/commons/dependencyinjection/CompositionRoot;", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "(Lcom/crisav2/productbasket/commons/dependencyinjection/CompositionRoot;Landroidx/appcompat/app/AppCompatActivity;)V", "addProductValidator", "Lcom/crisav2/core/useCase/ft01/AddProductValidator;", "calculateTotalProduct", "Lcom/crisav2/core/useCase/ft10/CalculateTotalProduct;", "context", "Landroid/content/Context;", "layoutInflater", "Landroid/view/LayoutInflater;", "mvcViewFactory", "Lcom/crisav2/productbasket/commons/views/MVCViewFactory;", "navigationHelper", "Lcom/crisav2/productbasket/commons/navigation/NavigationHelper;", "viewModelFactory", "Lcom/crisav2/productbasket/commons/viewmodel/ViewModelFactory;", "getActivity", "getAddProductValidator", "getCalculatorTotalProduct", "getContext", "getErrorsTable", "Lcom/crisav2/core/data/commons/ErrorsTable;", "getMVCViewFactory", "getNavigationController", "getViewModelFactory", "setUpNavigationController", "navController", "Landroidx/navigation/NavController;", "app_debug"})
public class ActivityCompositionRoot {
    private com.crisav2.productbasket.commons.navigation.NavigationHelper navigationHelper;
    private final com.crisav2.productbasket.commons.viewmodel.ViewModelFactory viewModelFactory = null;
    private final android.content.Context context = null;
    private final android.view.LayoutInflater layoutInflater = null;
    private final com.crisav2.productbasket.commons.views.MVCViewFactory mvcViewFactory = null;
    private final com.crisav2.core.useCase.ft01.AddProductValidator addProductValidator = null;
    private final com.crisav2.core.useCase.ft10.CalculateTotalProduct calculateTotalProduct = null;
    private final com.crisav2.productbasket.commons.dependencyinjection.CompositionRoot compositionRoot = null;
    private final androidx.appcompat.app.AppCompatActivity activity = null;
    
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
    public final com.crisav2.productbasket.commons.viewmodel.ViewModelFactory getViewModelFactory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.crisav2.productbasket.commons.navigation.NavigationHelper setUpNavigationController(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController navController) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.crisav2.productbasket.commons.navigation.NavigationHelper getNavigationController() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.crisav2.core.useCase.ft01.AddProductValidator getAddProductValidator() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.crisav2.core.useCase.ft10.CalculateTotalProduct getCalculatorTotalProduct() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.crisav2.core.data.commons.ErrorsTable getErrorsTable() {
        return null;
    }
    
    public ActivityCompositionRoot(@org.jetbrains.annotations.NotNull()
    com.crisav2.productbasket.commons.dependencyinjection.CompositionRoot compositionRoot, @org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity activity) {
        super();
    }
}