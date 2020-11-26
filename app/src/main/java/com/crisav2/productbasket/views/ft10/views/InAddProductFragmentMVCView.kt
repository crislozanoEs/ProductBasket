package com.crisav2.productbasket.views.ft10.views

import com.crisav2.productbasket.commons.views.InMVCViewObservable
import com.crisav2.productbasket.databinding.AddProductFragmentBinding

interface InAddProductFragmentMVCView:
    InMVCViewObservable<InAddProductFragmentMVCView.Listener, AddProductFragmentBinding> {
    interface Listener{
        fun onSaveProductClicked()
        fun onDeleteProductClicked()
        fun onProductTypeTextChanged()
        fun onProductBrandTextChanged()
        fun onProductAmountTextChanged()
        fun onProductPriceTextChanged()
        fun onProductHasDiscountChanged()
        fun onDiscountChanged(checkId: Int)
        fun onPercentageChanged()
        fun onAmount1Changed()
        fun onAmount2Changed()
    }
    var binding: AddProductFragmentBinding
    fun changeDiscountContainerVisibility(visible: Boolean)
    fun changeDiscountPVisibility(visible: Boolean)
    fun changeDiscountCVisibility(visible: Boolean)
    fun setProductTypeFieldError(errorId: Int)
    fun setProductBrandFieldError(errorId: Int)
    fun setProductAmountFieldError(errorId: Int)
    fun setProductPriceFieldError(errorId: Int)
    fun setDiscountTypePFieldError(errorId: Int)
    fun setDiscountTypeCFieldError(errorId: Int)
}