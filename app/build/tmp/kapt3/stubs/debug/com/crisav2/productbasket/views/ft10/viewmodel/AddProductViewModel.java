package com.crisav2.productbasket.views.ft10.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001SB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020AH\u0002J\u0010\u0010B\u001a\u00020\t2\u0006\u0010C\u001a\u00020DH\u0002J\u0006\u0010E\u001a\u00020?J\b\u0010F\u001a\u00020?H\u0002J\u0006\u0010G\u001a\u00020?J\u0006\u0010H\u001a\u00020\u0013J\u0006\u0010I\u001a\u00020\u0013J\u0010\u0010J\u001a\u00020?2\u0006\u0010@\u001a\u00020AH\u0002J\u0018\u0010K\u001a\u00020\u00132\u0006\u0010C\u001a\u00020D2\u0006\u0010L\u001a\u00020MH\u0002J\u0006\u0010N\u001a\u00020\u0013J\u0006\u0010O\u001a\u00020\u0013J\u0006\u0010P\u001a\u00020\u0013J\u0006\u0010Q\u001a\u00020\u0013J\u0006\u0010R\u001a\u00020\u0013R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u000fR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\u001e8F\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u000fR\u0011\u0010#\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010&\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010%R\u0011\u0010(\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010%R\u0011\u0010*\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010%R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020\r0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u000fR\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u000fR\u0017\u00101\u001a\b\u0012\u0004\u0012\u00020\r0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\u000fR\u000e\u00103\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u00108\u001a\b\u0012\u0004\u0012\u00020\r0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010\u000fR\u0017\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00130\b\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010\u000fR\u0017\u0010<\u001a\b\u0012\u0004\u0012\u00020\r0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010\u000f\u00a8\u0006T"}, d2 = {"Lcom/crisav2/productbasket/views/ft10/viewmodel/AddProductViewModel;", "Landroidx/lifecycle/ViewModel;", "addProductValidator", "Lcom/crisav2/core/useCase/ft01/AddProductValidator;", "calculateTotalProduct", "Lcom/crisav2/core/useCase/ft10/CalculateTotalProduct;", "(Lcom/crisav2/core/useCase/ft01/AddProductValidator;Lcom/crisav2/core/useCase/ft10/CalculateTotalProduct;)V", "_formValid", "Landroidx/lifecycle/MutableLiveData;", "", "_product", "Lcom/crisav2/core/data/ProductBasket;", "amount1String", "", "getAmount1String", "()Landroidx/lifecycle/MutableLiveData;", "amount2String", "getAmount2String", "amountProduct", "", "getAmountProduct", "amountProductString", "getAmountProductString", "brandProduct", "getBrandProduct", "discountC", "getDiscountC", "discountP", "getDiscountP", "formValid", "Landroidx/lifecycle/LiveData;", "getFormValid", "()Landroidx/lifecycle/LiveData;", "hasDiscount", "getHasDiscount", "maxLengthAmount", "getMaxLengthAmount", "()I", "maxLengthAmountDiscount", "getMaxLengthAmountDiscount", "maxLengthDiscount", "getMaxLengthDiscount", "maxLengthPrice", "getMaxLengthPrice", "percentageString", "getPercentageString", "priceUnitProduct", "", "getPriceUnitProduct", "priceUnitString", "getPriceUnitString", "productAmountValid", "productBrandValid", "productDiscountValid", "productPriceValid", "productTypeValid", "total", "getTotal", "typeDiscount", "getTypeDiscount", "typeProduct", "getTypeProduct", "calculateTotal", "", "addProductForm", "Lcom/crisav2/core/useCase/ft01/AddProductForm;", "isInputPartOfTotal", "inputField", "Lcom/crisav2/productbasket/views/ft10/viewmodel/AddProductViewModel$FIELD;", "saveProductInDatabase", "setDiscountInProduct", "updateProductHasDiscount", "updateTypeDiscountChanged", "validateAmount", "validateForm", "validateInput", "validateResponse", "Lcom/crisav2/core/data/commons/ValidatorResponse;", "validatePercentage", "validateProductAmount", "validateProductBrand", "validateProductPrice", "validateProductType", "FIELD", "app_debug"})
public final class AddProductViewModel extends androidx.lifecycle.ViewModel {
    private boolean productTypeValid = false;
    private boolean productBrandValid = false;
    private boolean productAmountValid = false;
    private boolean productPriceValid = false;
    private boolean productDiscountValid = false;
    private final int maxLengthAmount = 0;
    private final int maxLengthPrice = 0;
    private final int maxLengthDiscount = 0;
    private final int maxLengthAmountDiscount = 0;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> typeProduct = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> brandProduct = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> amountProduct = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> amountProductString = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Double> priceUnitProduct = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> priceUnitString = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> hasDiscount = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> discountP = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> discountC = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> percentageString = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> amount1String = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> amount2String = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> total = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> typeDiscount = null;
    private final androidx.lifecycle.MutableLiveData<com.crisav2.core.data.ProductBasket> _product = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _formValid = null;
    private final com.crisav2.core.useCase.ft01.AddProductValidator addProductValidator = null;
    private final com.crisav2.core.useCase.ft10.CalculateTotalProduct calculateTotalProduct = null;
    
    public final int getMaxLengthAmount() {
        return 0;
    }
    
    public final int getMaxLengthPrice() {
        return 0;
    }
    
    public final int getMaxLengthDiscount() {
        return 0;
    }
    
    public final int getMaxLengthAmountDiscount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getTypeProduct() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getBrandProduct() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getAmountProduct() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getAmountProductString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Double> getPriceUnitProduct() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPriceUnitString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getHasDiscount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getDiscountP() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getDiscountC() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPercentageString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getAmount1String() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getAmount2String() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getTotal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getTypeDiscount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getFormValid() {
        return null;
    }
    
    public final int validateProductType() {
        return 0;
    }
    
    public final int validateProductBrand() {
        return 0;
    }
    
    public final int validateProductAmount() {
        return 0;
    }
    
    public final int validateProductPrice() {
        return 0;
    }
    
    public final void updateProductHasDiscount() {
    }
    
    public final int updateTypeDiscountChanged() {
        return 0;
    }
    
    public final int validatePercentage() {
        return 0;
    }
    
    public final int validateAmount() {
        return 0;
    }
    
    private final int validateInput(com.crisav2.productbasket.views.ft10.viewmodel.AddProductViewModel.FIELD inputField, com.crisav2.core.data.commons.ValidatorResponse validateResponse) {
        return 0;
    }
    
    private final void calculateTotal(com.crisav2.core.useCase.ft01.AddProductForm addProductForm) {
    }
    
    private final void setDiscountInProduct() {
    }
    
    private final boolean isInputPartOfTotal(com.crisav2.productbasket.views.ft10.viewmodel.AddProductViewModel.FIELD inputField) {
        return false;
    }
    
    private final void validateForm(com.crisav2.core.useCase.ft01.AddProductForm addProductForm) {
    }
    
    public final void saveProductInDatabase() {
    }
    
    public AddProductViewModel(@org.jetbrains.annotations.NotNull()
    com.crisav2.core.useCase.ft01.AddProductValidator addProductValidator, @org.jetbrains.annotations.NotNull()
    com.crisav2.core.useCase.ft10.CalculateTotalProduct calculateTotalProduct) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lcom/crisav2/productbasket/views/ft10/viewmodel/AddProductViewModel$FIELD;", "", "(Ljava/lang/String;I)V", "TYPE_PRODUCT", "BRAND_PRODUCT", "AMOUNT_PRODUCT", "PRICE_PRODUCT", "DISCOUNT_PERCENTAGE", "DISCOUNT_AMOUNT", "app_debug"})
    static enum FIELD {
        /*public static final*/ TYPE_PRODUCT /* = new TYPE_PRODUCT() */,
        /*public static final*/ BRAND_PRODUCT /* = new BRAND_PRODUCT() */,
        /*public static final*/ AMOUNT_PRODUCT /* = new AMOUNT_PRODUCT() */,
        /*public static final*/ PRICE_PRODUCT /* = new PRICE_PRODUCT() */,
        /*public static final*/ DISCOUNT_PERCENTAGE /* = new DISCOUNT_PERCENTAGE() */,
        /*public static final*/ DISCOUNT_AMOUNT /* = new DISCOUNT_AMOUNT() */;
        
        FIELD() {
        }
    }
}