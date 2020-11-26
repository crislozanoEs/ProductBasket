package com.crisav2.productbasket.databinding;
import com.crisav2.productbasket.R;
import com.crisav2.productbasket.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AddProductFragmentBindingImpl extends AddProductFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.type_container, 13);
        sViewsWithIds.put(R.id.brand_container, 14);
        sViewsWithIds.put(R.id.amount_container, 15);
        sViewsWithIds.put(R.id.price_container, 16);
        sViewsWithIds.put(R.id.complete_discount_container, 17);
        sViewsWithIds.put(R.id.discount_type_radio, 18);
        sViewsWithIds.put(R.id.container_percentage_discount, 19);
        sViewsWithIds.put(R.id.percentage_discount_container, 20);
        sViewsWithIds.put(R.id.label_percentage_symbol, 21);
        sViewsWithIds.put(R.id.container_amount_discount, 22);
        sViewsWithIds.put(R.id.percentage_amount_1_container, 23);
        sViewsWithIds.put(R.id.label_times_symbol, 24);
        sViewsWithIds.put(R.id.percentage_amount_2_container, 25);
        sViewsWithIds.put(R.id.total_to_pay_container, 26);
        sViewsWithIds.put(R.id.cancel_add_product, 27);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener amount1TextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of ProductViewModel.amount1String.getValue()
            //         is ProductViewModel.amount1String.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(amount1Text);
            // localize variables for thread safety
            // ProductViewModel.amount1String
            androidx.lifecycle.MutableLiveData<java.lang.String> productViewModelAmount1String = null;
            // ProductViewModel.amount1String != null
            boolean productViewModelAmount1StringJavaLangObjectNull = false;
            // ProductViewModel
            com.crisav2.productbasket.views.ft10.viewmodel.AddProductViewModel productViewModel = mProductViewModel;
            // ProductViewModel != null
            boolean productViewModelJavaLangObjectNull = false;
            // ProductViewModel.amount1String.getValue()
            java.lang.String productViewModelAmount1StringGetValue = null;



            productViewModelJavaLangObjectNull = (productViewModel) != (null);
            if (productViewModelJavaLangObjectNull) {


                productViewModelAmount1String = productViewModel.getAmount1String();

                productViewModelAmount1StringJavaLangObjectNull = (productViewModelAmount1String) != (null);
                if (productViewModelAmount1StringJavaLangObjectNull) {




                    productViewModelAmount1String.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener amount2TextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of ProductViewModel.amount2String.getValue()
            //         is ProductViewModel.amount2String.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(amount2Text);
            // localize variables for thread safety
            // ProductViewModel.amount2String != null
            boolean productViewModelAmount2StringJavaLangObjectNull = false;
            // ProductViewModel.amount2String
            androidx.lifecycle.MutableLiveData<java.lang.String> productViewModelAmount2String = null;
            // ProductViewModel
            com.crisav2.productbasket.views.ft10.viewmodel.AddProductViewModel productViewModel = mProductViewModel;
            // ProductViewModel.amount2String.getValue()
            java.lang.String productViewModelAmount2StringGetValue = null;
            // ProductViewModel != null
            boolean productViewModelJavaLangObjectNull = false;



            productViewModelJavaLangObjectNull = (productViewModel) != (null);
            if (productViewModelJavaLangObjectNull) {


                productViewModelAmount2String = productViewModel.getAmount2String();

                productViewModelAmount2StringJavaLangObjectNull = (productViewModelAmount2String) != (null);
                if (productViewModelAmount2StringJavaLangObjectNull) {




                    productViewModelAmount2String.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener amountTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of ProductViewModel.amountProductString.getValue()
            //         is ProductViewModel.amountProductString.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(amountText);
            // localize variables for thread safety
            // ProductViewModel.amountProductString.getValue()
            java.lang.String productViewModelAmountProductStringGetValue = null;
            // ProductViewModel
            com.crisav2.productbasket.views.ft10.viewmodel.AddProductViewModel productViewModel = mProductViewModel;
            // ProductViewModel.amountProductString != null
            boolean productViewModelAmountProductStringJavaLangObjectNull = false;
            // ProductViewModel != null
            boolean productViewModelJavaLangObjectNull = false;
            // ProductViewModel.amountProductString
            androidx.lifecycle.MutableLiveData<java.lang.String> productViewModelAmountProductString = null;



            productViewModelJavaLangObjectNull = (productViewModel) != (null);
            if (productViewModelJavaLangObjectNull) {


                productViewModelAmountProductString = productViewModel.getAmountProductString();

                productViewModelAmountProductStringJavaLangObjectNull = (productViewModelAmountProductString) != (null);
                if (productViewModelAmountProductStringJavaLangObjectNull) {




                    productViewModelAmountProductString.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener brandTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of ProductViewModel.brandProduct.getValue()
            //         is ProductViewModel.brandProduct.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(brandText);
            // localize variables for thread safety
            // ProductViewModel.brandProduct != null
            boolean productViewModelBrandProductJavaLangObjectNull = false;
            // ProductViewModel
            com.crisav2.productbasket.views.ft10.viewmodel.AddProductViewModel productViewModel = mProductViewModel;
            // ProductViewModel != null
            boolean productViewModelJavaLangObjectNull = false;
            // ProductViewModel.brandProduct.getValue()
            java.lang.String productViewModelBrandProductGetValue = null;
            // ProductViewModel.brandProduct
            androidx.lifecycle.MutableLiveData<java.lang.String> productViewModelBrandProduct = null;



            productViewModelJavaLangObjectNull = (productViewModel) != (null);
            if (productViewModelJavaLangObjectNull) {


                productViewModelBrandProduct = productViewModel.getBrandProduct();

                productViewModelBrandProductJavaLangObjectNull = (productViewModelBrandProduct) != (null);
                if (productViewModelBrandProductJavaLangObjectNull) {




                    productViewModelBrandProduct.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener discountSwitchandroidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of ProductViewModel.hasDiscount.getValue()
            //         is ProductViewModel.hasDiscount.setValue((java.lang.Boolean) callbackArg_0)
            boolean callbackArg_0 = discountSwitch.isChecked();
            // localize variables for thread safety
            // ProductViewModel
            com.crisav2.productbasket.views.ft10.viewmodel.AddProductViewModel productViewModel = mProductViewModel;
            // ProductViewModel != null
            boolean productViewModelJavaLangObjectNull = false;
            // ProductViewModel.hasDiscount != null
            boolean productViewModelHasDiscountJavaLangObjectNull = false;
            // ProductViewModel.hasDiscount
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> productViewModelHasDiscount = null;
            // ProductViewModel.hasDiscount.getValue()
            java.lang.Boolean productViewModelHasDiscountGetValue = null;



            productViewModelJavaLangObjectNull = (productViewModel) != (null);
            if (productViewModelJavaLangObjectNull) {


                productViewModelHasDiscount = productViewModel.getHasDiscount();

                productViewModelHasDiscountJavaLangObjectNull = (productViewModelHasDiscount) != (null);
                if (productViewModelHasDiscountJavaLangObjectNull) {




                    productViewModelHasDiscount.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener discountType1androidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of ProductViewModel.discountP.getValue()
            //         is ProductViewModel.discountP.setValue((java.lang.Boolean) callbackArg_0)
            boolean callbackArg_0 = discountType1.isChecked();
            // localize variables for thread safety
            // ProductViewModel.discountP.getValue()
            java.lang.Boolean productViewModelDiscountPGetValue = null;
            // ProductViewModel
            com.crisav2.productbasket.views.ft10.viewmodel.AddProductViewModel productViewModel = mProductViewModel;
            // ProductViewModel.discountP
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> productViewModelDiscountP = null;
            // ProductViewModel.discountP != null
            boolean productViewModelDiscountPJavaLangObjectNull = false;
            // ProductViewModel != null
            boolean productViewModelJavaLangObjectNull = false;



            productViewModelJavaLangObjectNull = (productViewModel) != (null);
            if (productViewModelJavaLangObjectNull) {


                productViewModelDiscountP = productViewModel.getDiscountP();

                productViewModelDiscountPJavaLangObjectNull = (productViewModelDiscountP) != (null);
                if (productViewModelDiscountPJavaLangObjectNull) {




                    productViewModelDiscountP.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener discountType2androidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of ProductViewModel.discountC.getValue()
            //         is ProductViewModel.discountC.setValue((java.lang.Boolean) callbackArg_0)
            boolean callbackArg_0 = discountType2.isChecked();
            // localize variables for thread safety
            // ProductViewModel.discountC.getValue()
            java.lang.Boolean productViewModelDiscountCGetValue = null;
            // ProductViewModel
            com.crisav2.productbasket.views.ft10.viewmodel.AddProductViewModel productViewModel = mProductViewModel;
            // ProductViewModel != null
            boolean productViewModelJavaLangObjectNull = false;
            // ProductViewModel.discountC != null
            boolean productViewModelDiscountCJavaLangObjectNull = false;
            // ProductViewModel.discountC
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> productViewModelDiscountC = null;



            productViewModelJavaLangObjectNull = (productViewModel) != (null);
            if (productViewModelJavaLangObjectNull) {


                productViewModelDiscountC = productViewModel.getDiscountC();

                productViewModelDiscountCJavaLangObjectNull = (productViewModelDiscountC) != (null);
                if (productViewModelDiscountCJavaLangObjectNull) {




                    productViewModelDiscountC.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener percentageTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of ProductViewModel.percentageString.getValue()
            //         is ProductViewModel.percentageString.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(percentageText);
            // localize variables for thread safety
            // ProductViewModel
            com.crisav2.productbasket.views.ft10.viewmodel.AddProductViewModel productViewModel = mProductViewModel;
            // ProductViewModel.percentageString.getValue()
            java.lang.String productViewModelPercentageStringGetValue = null;
            // ProductViewModel != null
            boolean productViewModelJavaLangObjectNull = false;
            // ProductViewModel.percentageString != null
            boolean productViewModelPercentageStringJavaLangObjectNull = false;
            // ProductViewModel.percentageString
            androidx.lifecycle.MutableLiveData<java.lang.String> productViewModelPercentageString = null;



            productViewModelJavaLangObjectNull = (productViewModel) != (null);
            if (productViewModelJavaLangObjectNull) {


                productViewModelPercentageString = productViewModel.getPercentageString();

                productViewModelPercentageStringJavaLangObjectNull = (productViewModelPercentageString) != (null);
                if (productViewModelPercentageStringJavaLangObjectNull) {




                    productViewModelPercentageString.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener priceTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of ProductViewModel.priceUnitString.getValue()
            //         is ProductViewModel.priceUnitString.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(priceText);
            // localize variables for thread safety
            // ProductViewModel.priceUnitString != null
            boolean productViewModelPriceUnitStringJavaLangObjectNull = false;
            // ProductViewModel
            com.crisav2.productbasket.views.ft10.viewmodel.AddProductViewModel productViewModel = mProductViewModel;
            // ProductViewModel.priceUnitString
            androidx.lifecycle.MutableLiveData<java.lang.String> productViewModelPriceUnitString = null;
            // ProductViewModel.priceUnitString.getValue()
            java.lang.String productViewModelPriceUnitStringGetValue = null;
            // ProductViewModel != null
            boolean productViewModelJavaLangObjectNull = false;



            productViewModelJavaLangObjectNull = (productViewModel) != (null);
            if (productViewModelJavaLangObjectNull) {


                productViewModelPriceUnitString = productViewModel.getPriceUnitString();

                productViewModelPriceUnitStringJavaLangObjectNull = (productViewModelPriceUnitString) != (null);
                if (productViewModelPriceUnitStringJavaLangObjectNull) {




                    productViewModelPriceUnitString.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener totalToPayTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of ProductViewModel.total.getValue()
            //         is ProductViewModel.total.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(totalToPayText);
            // localize variables for thread safety
            // ProductViewModel
            com.crisav2.productbasket.views.ft10.viewmodel.AddProductViewModel productViewModel = mProductViewModel;
            // ProductViewModel.total.getValue()
            java.lang.String productViewModelTotalGetValue = null;
            // ProductViewModel.total != null
            boolean productViewModelTotalJavaLangObjectNull = false;
            // ProductViewModel != null
            boolean productViewModelJavaLangObjectNull = false;
            // ProductViewModel.total
            androidx.lifecycle.MutableLiveData<java.lang.String> productViewModelTotal = null;



            productViewModelJavaLangObjectNull = (productViewModel) != (null);
            if (productViewModelJavaLangObjectNull) {


                productViewModelTotal = productViewModel.getTotal();

                productViewModelTotalJavaLangObjectNull = (productViewModelTotal) != (null);
                if (productViewModelTotalJavaLangObjectNull) {




                    productViewModelTotal.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener typeTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of ProductViewModel.typeProduct.getValue()
            //         is ProductViewModel.typeProduct.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(typeText);
            // localize variables for thread safety
            // ProductViewModel.typeProduct.getValue()
            java.lang.String productViewModelTypeProductGetValue = null;
            // ProductViewModel
            com.crisav2.productbasket.views.ft10.viewmodel.AddProductViewModel productViewModel = mProductViewModel;
            // ProductViewModel.typeProduct != null
            boolean productViewModelTypeProductJavaLangObjectNull = false;
            // ProductViewModel != null
            boolean productViewModelJavaLangObjectNull = false;
            // ProductViewModel.typeProduct
            androidx.lifecycle.MutableLiveData<java.lang.String> productViewModelTypeProduct = null;



            productViewModelJavaLangObjectNull = (productViewModel) != (null);
            if (productViewModelJavaLangObjectNull) {


                productViewModelTypeProduct = productViewModel.getTypeProduct();

                productViewModelTypeProductJavaLangObjectNull = (productViewModelTypeProduct) != (null);
                if (productViewModelTypeProductJavaLangObjectNull) {




                    productViewModelTypeProduct.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public AddProductFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 28, sIncludes, sViewsWithIds));
    }
    private AddProductFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 12
            , (android.widget.Button) bindings[12]
            , (com.google.android.material.textfield.TextInputEditText) bindings[9]
            , (com.google.android.material.textfield.TextInputEditText) bindings[10]
            , (com.google.android.material.textfield.TextInputLayout) bindings[15]
            , (com.google.android.material.textfield.TextInputEditText) bindings[3]
            , (com.google.android.material.textfield.TextInputLayout) bindings[14]
            , (com.google.android.material.textfield.TextInputEditText) bindings[2]
            , (android.widget.Button) bindings[27]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[17]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[22]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[19]
            , (com.google.android.material.switchmaterial.SwitchMaterial) bindings[5]
            , (android.widget.RadioButton) bindings[6]
            , (android.widget.RadioButton) bindings[7]
            , (android.widget.RadioGroup) bindings[18]
            , (android.widget.TextView) bindings[21]
            , (android.widget.TextView) bindings[24]
            , (com.google.android.material.textfield.TextInputLayout) bindings[23]
            , (com.google.android.material.textfield.TextInputLayout) bindings[25]
            , (com.google.android.material.textfield.TextInputLayout) bindings[20]
            , (com.google.android.material.textfield.TextInputEditText) bindings[8]
            , (com.google.android.material.textfield.TextInputLayout) bindings[16]
            , (com.google.android.material.textfield.TextInputEditText) bindings[4]
            , (com.google.android.material.textfield.TextInputLayout) bindings[26]
            , (com.google.android.material.textfield.TextInputEditText) bindings[11]
            , (com.google.android.material.textfield.TextInputLayout) bindings[13]
            , (com.google.android.material.textfield.TextInputEditText) bindings[1]
            );
        this.addProduct.setTag(null);
        this.amount1Text.setTag(null);
        this.amount2Text.setTag(null);
        this.amountText.setTag(null);
        this.brandText.setTag(null);
        this.discountSwitch.setTag(null);
        this.discountType1.setTag(null);
        this.discountType2.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.percentageText.setTag(null);
        this.priceText.setTag(null);
        this.totalToPayText.setTag(null);
        this.typeText.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2000L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.ProductViewModel == variableId) {
            setProductViewModel((com.crisav2.productbasket.views.ft10.viewmodel.AddProductViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setProductViewModel(@Nullable com.crisav2.productbasket.views.ft10.viewmodel.AddProductViewModel ProductViewModel) {
        this.mProductViewModel = ProductViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1000L;
        }
        notifyPropertyChanged(BR.ProductViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeProductViewModelAmount2String((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeProductViewModelDiscountP((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeProductViewModelBrandProduct((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeProductViewModelTotal((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeProductViewModelFormValid((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 5 :
                return onChangeProductViewModelAmount1String((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeProductViewModelHasDiscount((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 7 :
                return onChangeProductViewModelPercentageString((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 8 :
                return onChangeProductViewModelPriceUnitString((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 9 :
                return onChangeProductViewModelAmountProductString((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 10 :
                return onChangeProductViewModelTypeProduct((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 11 :
                return onChangeProductViewModelDiscountC((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeProductViewModelAmount2String(androidx.lifecycle.MutableLiveData<java.lang.String> ProductViewModelAmount2String, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeProductViewModelDiscountP(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ProductViewModelDiscountP, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeProductViewModelBrandProduct(androidx.lifecycle.MutableLiveData<java.lang.String> ProductViewModelBrandProduct, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeProductViewModelTotal(androidx.lifecycle.MutableLiveData<java.lang.String> ProductViewModelTotal, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeProductViewModelFormValid(androidx.lifecycle.LiveData<java.lang.Boolean> ProductViewModelFormValid, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeProductViewModelAmount1String(androidx.lifecycle.MutableLiveData<java.lang.String> ProductViewModelAmount1String, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeProductViewModelHasDiscount(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ProductViewModelHasDiscount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeProductViewModelPercentageString(androidx.lifecycle.MutableLiveData<java.lang.String> ProductViewModelPercentageString, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeProductViewModelPriceUnitString(androidx.lifecycle.MutableLiveData<java.lang.String> ProductViewModelPriceUnitString, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeProductViewModelAmountProductString(androidx.lifecycle.MutableLiveData<java.lang.String> ProductViewModelAmountProductString, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeProductViewModelTypeProduct(androidx.lifecycle.MutableLiveData<java.lang.String> ProductViewModelTypeProduct, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeProductViewModelDiscountC(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ProductViewModelDiscountC, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.lifecycle.MutableLiveData<java.lang.String> productViewModelAmount2String = null;
        java.lang.Boolean productViewModelFormValidGetValue = null;
        java.lang.String productViewModelAmount1StringGetValue = null;
        int productViewModelMaxLengthDiscount = 0;
        java.lang.String productViewModelBrandProductGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> productViewModelDiscountP = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> productViewModelBrandProduct = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> productViewModelTotal = null;
        java.lang.Boolean productViewModelHasDiscountGetValue = null;
        java.lang.Boolean productViewModelDiscountCGetValue = null;
        int productViewModelMaxLengthAmountDiscount = 0;
        java.lang.String productViewModelAmount2StringGetValue = null;
        androidx.lifecycle.LiveData<java.lang.Boolean> productViewModelFormValid = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxProductViewModelHasDiscountGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.String> productViewModelAmount1String = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxProductViewModelDiscountCGetValue = false;
        com.crisav2.productbasket.views.ft10.viewmodel.AddProductViewModel productViewModel = mProductViewModel;
        java.lang.String productViewModelPriceUnitStringGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxProductViewModelFormValidGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> productViewModelHasDiscount = null;
        int productViewModelMaxLengthAmount = 0;
        int productViewModelMaxLengthPrice = 0;
        androidx.lifecycle.MutableLiveData<java.lang.String> productViewModelPercentageString = null;
        java.lang.Boolean productViewModelDiscountPGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> productViewModelPriceUnitString = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> productViewModelAmountProductString = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> productViewModelTypeProduct = null;
        java.lang.String productViewModelTypeProductGetValue = null;
        java.lang.String productViewModelAmountProductStringGetValue = null;
        java.lang.String productViewModelPercentageStringGetValue = null;
        java.lang.String productViewModelTotalGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxProductViewModelDiscountPGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> productViewModelDiscountC = null;

        if ((dirtyFlags & 0x3fffL) != 0) {


            if ((dirtyFlags & 0x3001L) != 0) {

                    if (productViewModel != null) {
                        // read ProductViewModel.amount2String
                        productViewModelAmount2String = productViewModel.getAmount2String();
                    }
                    updateLiveDataRegistration(0, productViewModelAmount2String);


                    if (productViewModelAmount2String != null) {
                        // read ProductViewModel.amount2String.getValue()
                        productViewModelAmount2StringGetValue = productViewModelAmount2String.getValue();
                    }
            }
            if ((dirtyFlags & 0x3000L) != 0) {

                    if (productViewModel != null) {
                        // read ProductViewModel.maxLengthDiscount
                        productViewModelMaxLengthDiscount = productViewModel.getMaxLengthDiscount();
                        // read ProductViewModel.maxLengthAmountDiscount
                        productViewModelMaxLengthAmountDiscount = productViewModel.getMaxLengthAmountDiscount();
                        // read ProductViewModel.maxLengthAmount
                        productViewModelMaxLengthAmount = productViewModel.getMaxLengthAmount();
                        // read ProductViewModel.maxLengthPrice
                        productViewModelMaxLengthPrice = productViewModel.getMaxLengthPrice();
                    }
            }
            if ((dirtyFlags & 0x3002L) != 0) {

                    if (productViewModel != null) {
                        // read ProductViewModel.discountP
                        productViewModelDiscountP = productViewModel.getDiscountP();
                    }
                    updateLiveDataRegistration(1, productViewModelDiscountP);


                    if (productViewModelDiscountP != null) {
                        // read ProductViewModel.discountP.getValue()
                        productViewModelDiscountPGetValue = productViewModelDiscountP.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(ProductViewModel.discountP.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxProductViewModelDiscountPGetValue = androidx.databinding.ViewDataBinding.safeUnbox(productViewModelDiscountPGetValue);
            }
            if ((dirtyFlags & 0x3004L) != 0) {

                    if (productViewModel != null) {
                        // read ProductViewModel.brandProduct
                        productViewModelBrandProduct = productViewModel.getBrandProduct();
                    }
                    updateLiveDataRegistration(2, productViewModelBrandProduct);


                    if (productViewModelBrandProduct != null) {
                        // read ProductViewModel.brandProduct.getValue()
                        productViewModelBrandProductGetValue = productViewModelBrandProduct.getValue();
                    }
            }
            if ((dirtyFlags & 0x3008L) != 0) {

                    if (productViewModel != null) {
                        // read ProductViewModel.total
                        productViewModelTotal = productViewModel.getTotal();
                    }
                    updateLiveDataRegistration(3, productViewModelTotal);


                    if (productViewModelTotal != null) {
                        // read ProductViewModel.total.getValue()
                        productViewModelTotalGetValue = productViewModelTotal.getValue();
                    }
            }
            if ((dirtyFlags & 0x3010L) != 0) {

                    if (productViewModel != null) {
                        // read ProductViewModel.formValid
                        productViewModelFormValid = productViewModel.getFormValid();
                    }
                    updateLiveDataRegistration(4, productViewModelFormValid);


                    if (productViewModelFormValid != null) {
                        // read ProductViewModel.formValid.getValue()
                        productViewModelFormValidGetValue = productViewModelFormValid.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(ProductViewModel.formValid.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxProductViewModelFormValidGetValue = androidx.databinding.ViewDataBinding.safeUnbox(productViewModelFormValidGetValue);
            }
            if ((dirtyFlags & 0x3020L) != 0) {

                    if (productViewModel != null) {
                        // read ProductViewModel.amount1String
                        productViewModelAmount1String = productViewModel.getAmount1String();
                    }
                    updateLiveDataRegistration(5, productViewModelAmount1String);


                    if (productViewModelAmount1String != null) {
                        // read ProductViewModel.amount1String.getValue()
                        productViewModelAmount1StringGetValue = productViewModelAmount1String.getValue();
                    }
            }
            if ((dirtyFlags & 0x3040L) != 0) {

                    if (productViewModel != null) {
                        // read ProductViewModel.hasDiscount
                        productViewModelHasDiscount = productViewModel.getHasDiscount();
                    }
                    updateLiveDataRegistration(6, productViewModelHasDiscount);


                    if (productViewModelHasDiscount != null) {
                        // read ProductViewModel.hasDiscount.getValue()
                        productViewModelHasDiscountGetValue = productViewModelHasDiscount.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(ProductViewModel.hasDiscount.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxProductViewModelHasDiscountGetValue = androidx.databinding.ViewDataBinding.safeUnbox(productViewModelHasDiscountGetValue);
            }
            if ((dirtyFlags & 0x3080L) != 0) {

                    if (productViewModel != null) {
                        // read ProductViewModel.percentageString
                        productViewModelPercentageString = productViewModel.getPercentageString();
                    }
                    updateLiveDataRegistration(7, productViewModelPercentageString);


                    if (productViewModelPercentageString != null) {
                        // read ProductViewModel.percentageString.getValue()
                        productViewModelPercentageStringGetValue = productViewModelPercentageString.getValue();
                    }
            }
            if ((dirtyFlags & 0x3100L) != 0) {

                    if (productViewModel != null) {
                        // read ProductViewModel.priceUnitString
                        productViewModelPriceUnitString = productViewModel.getPriceUnitString();
                    }
                    updateLiveDataRegistration(8, productViewModelPriceUnitString);


                    if (productViewModelPriceUnitString != null) {
                        // read ProductViewModel.priceUnitString.getValue()
                        productViewModelPriceUnitStringGetValue = productViewModelPriceUnitString.getValue();
                    }
            }
            if ((dirtyFlags & 0x3200L) != 0) {

                    if (productViewModel != null) {
                        // read ProductViewModel.amountProductString
                        productViewModelAmountProductString = productViewModel.getAmountProductString();
                    }
                    updateLiveDataRegistration(9, productViewModelAmountProductString);


                    if (productViewModelAmountProductString != null) {
                        // read ProductViewModel.amountProductString.getValue()
                        productViewModelAmountProductStringGetValue = productViewModelAmountProductString.getValue();
                    }
            }
            if ((dirtyFlags & 0x3400L) != 0) {

                    if (productViewModel != null) {
                        // read ProductViewModel.typeProduct
                        productViewModelTypeProduct = productViewModel.getTypeProduct();
                    }
                    updateLiveDataRegistration(10, productViewModelTypeProduct);


                    if (productViewModelTypeProduct != null) {
                        // read ProductViewModel.typeProduct.getValue()
                        productViewModelTypeProductGetValue = productViewModelTypeProduct.getValue();
                    }
            }
            if ((dirtyFlags & 0x3800L) != 0) {

                    if (productViewModel != null) {
                        // read ProductViewModel.discountC
                        productViewModelDiscountC = productViewModel.getDiscountC();
                    }
                    updateLiveDataRegistration(11, productViewModelDiscountC);


                    if (productViewModelDiscountC != null) {
                        // read ProductViewModel.discountC.getValue()
                        productViewModelDiscountCGetValue = productViewModelDiscountC.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(ProductViewModel.discountC.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxProductViewModelDiscountCGetValue = androidx.databinding.ViewDataBinding.safeUnbox(productViewModelDiscountCGetValue);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x3010L) != 0) {
            // api target 1

            this.addProduct.setEnabled(androidxDatabindingViewDataBindingSafeUnboxProductViewModelFormValidGetValue);
        }
        if ((dirtyFlags & 0x3000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setMaxLength(this.amount1Text, productViewModelMaxLengthAmountDiscount);
            androidx.databinding.adapters.TextViewBindingAdapter.setMaxLength(this.amount2Text, productViewModelMaxLengthAmountDiscount);
            androidx.databinding.adapters.TextViewBindingAdapter.setMaxLength(this.amountText, productViewModelMaxLengthAmount);
            androidx.databinding.adapters.TextViewBindingAdapter.setMaxLength(this.percentageText, productViewModelMaxLengthDiscount);
            androidx.databinding.adapters.TextViewBindingAdapter.setMaxLength(this.priceText, productViewModelMaxLengthPrice);
        }
        if ((dirtyFlags & 0x3020L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.amount1Text, productViewModelAmount1StringGetValue);
        }
        if ((dirtyFlags & 0x2000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.amount1Text, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, amount1TextandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.amount2Text, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, amount2TextandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.amountText, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, amountTextandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.brandText, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, brandTextandroidTextAttrChanged);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.discountSwitch, (android.widget.CompoundButton.OnCheckedChangeListener)null, discountSwitchandroidCheckedAttrChanged);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.discountType1, (android.widget.CompoundButton.OnCheckedChangeListener)null, discountType1androidCheckedAttrChanged);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.discountType2, (android.widget.CompoundButton.OnCheckedChangeListener)null, discountType2androidCheckedAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.percentageText, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, percentageTextandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.priceText, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, priceTextandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.totalToPayText, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, totalToPayTextandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.typeText, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, typeTextandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x3001L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.amount2Text, productViewModelAmount2StringGetValue);
        }
        if ((dirtyFlags & 0x3200L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.amountText, productViewModelAmountProductStringGetValue);
        }
        if ((dirtyFlags & 0x3004L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.brandText, productViewModelBrandProductGetValue);
        }
        if ((dirtyFlags & 0x3040L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.discountSwitch, androidxDatabindingViewDataBindingSafeUnboxProductViewModelHasDiscountGetValue);
        }
        if ((dirtyFlags & 0x3002L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.discountType1, androidxDatabindingViewDataBindingSafeUnboxProductViewModelDiscountPGetValue);
        }
        if ((dirtyFlags & 0x3800L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.discountType2, androidxDatabindingViewDataBindingSafeUnboxProductViewModelDiscountCGetValue);
        }
        if ((dirtyFlags & 0x3080L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.percentageText, productViewModelPercentageStringGetValue);
        }
        if ((dirtyFlags & 0x3100L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.priceText, productViewModelPriceUnitStringGetValue);
        }
        if ((dirtyFlags & 0x3008L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.totalToPayText, productViewModelTotalGetValue);
        }
        if ((dirtyFlags & 0x3400L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.typeText, productViewModelTypeProductGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): ProductViewModel.amount2String
        flag 1 (0x2L): ProductViewModel.discountP
        flag 2 (0x3L): ProductViewModel.brandProduct
        flag 3 (0x4L): ProductViewModel.total
        flag 4 (0x5L): ProductViewModel.formValid
        flag 5 (0x6L): ProductViewModel.amount1String
        flag 6 (0x7L): ProductViewModel.hasDiscount
        flag 7 (0x8L): ProductViewModel.percentageString
        flag 8 (0x9L): ProductViewModel.priceUnitString
        flag 9 (0xaL): ProductViewModel.amountProductString
        flag 10 (0xbL): ProductViewModel.typeProduct
        flag 11 (0xcL): ProductViewModel.discountC
        flag 12 (0xdL): ProductViewModel
        flag 13 (0xeL): null
    flag mapping end*/
    //end
}