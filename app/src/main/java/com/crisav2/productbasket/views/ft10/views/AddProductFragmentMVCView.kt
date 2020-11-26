package com.crisav2.productbasket.views.ft10.views

import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.crisav2.core.data.commons.ErrorsTable
import com.crisav2.productbasket.R
import com.crisav2.productbasket.commons.views.MVCViewObservable
import com.crisav2.productbasket.databinding.AddProductFragmentBinding

class AddProductFragmentMVCView(layoutInflater: LayoutInflater, parent: ViewGroup, private val errorsTable: ErrorsTable):
    MVCViewObservable<InAddProductFragmentMVCView.Listener, AddProductFragmentBinding>(),
    InAddProductFragmentMVCView {

    override var binding: AddProductFragmentBinding = DataBindingUtil.inflate(layoutInflater, R.layout.add_product_fragment, parent, false)
    private val textWatcherTypeProduct = object :TextWatcher{
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            //Not need for know
        }
        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            //Not need for know
        }
        override fun afterTextChanged(s: Editable?) {
            getListeners().forEach {
                it.onProductTypeTextChanged()
            }
        }
    }
    private val textWatcherBrandProduct = object :TextWatcher{
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            //Not need for know
        }
        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            //Not need for know
        }
        override fun afterTextChanged(s: Editable?) {
            getListeners().forEach {
                it.onProductBrandTextChanged()
            }
        }
    }
    private val textWatcherAmountProduct = object :TextWatcher{
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            //Not need for know
        }
        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            //Not need for know
        }
        override fun afterTextChanged(s: Editable?) {
            getListeners().forEach {
                it.onProductAmountTextChanged()
            }
        }
    }
    private val textWatcherPriceProduct = object :TextWatcher{
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            //Not need for know
        }
        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            //Not need for know
        }
        override fun afterTextChanged(s: Editable?) {
            getListeners().forEach {
                it.onProductPriceTextChanged()
            }
        }
    }
    private val textWatcherPercentage = object :TextWatcher{
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            //Not need for know
        }
        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            //Not need for know
        }
        override fun afterTextChanged(s: Editable?) {
            getListeners().forEach {
                it.onPercentageChanged()
            }
        }
    }
    private val textWatcherAmount1 = object :TextWatcher{
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            //Not need for know
        }
        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            //Not need for know
        }
        override fun afterTextChanged(s: Editable?) {
            getListeners().forEach {
                it.onAmount1Changed()
            }
        }
    }
    private val textWatcherAmount2 = object :TextWatcher{
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            //Not need for know
        }
        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            //Not need for know
        }
        override fun afterTextChanged(s: Editable?) {
            getListeners().forEach {
                it.onAmount2Changed()
            }
        }
    }

    init{
        super.setRootView(binding.root)
        setUpChangeTextListener()
    }

    private fun setUpChangeTextListener() {
        binding.typeText.addTextChangedListener(textWatcherTypeProduct)
        binding.brandText.addTextChangedListener(textWatcherBrandProduct)
        binding.amountText.addTextChangedListener(textWatcherAmountProduct)
        binding.priceText.addTextChangedListener(textWatcherPriceProduct)
        binding.discountSwitch.setOnClickListener {
            getListeners().forEach {
                it.onProductHasDiscountChanged()
            }
        }
        binding.discountTypeRadio.setOnCheckedChangeListener { _, checkedId ->
            getListeners().forEach {
                val checkedIdToFragment = if(checkedId == R.id.discount_type_1) 0 else 1
                it.onDiscountChanged(checkedIdToFragment)
                if(checkedId == R.id.discount_type_1){
                    binding.percentageText.addTextChangedListener(textWatcherPercentage)
                    binding.amount1Text.removeTextChangedListener(textWatcherAmount1)
                    binding.amount2Text.removeTextChangedListener(textWatcherAmount2)
                }
                if(checkedId == R.id.discount_type_2){
                    binding.amount1Text.addTextChangedListener(textWatcherAmount1)
                    binding.amount2Text.addTextChangedListener(textWatcherAmount1)
                    binding.percentageText.removeTextChangedListener(textWatcherPercentage)
                }
            }
        }
        binding.addProduct.setOnClickListener {
            getListeners().forEach {
                it.onSaveProductClicked()
            }
        }
    }

    override fun changeDiscountContainerVisibility(visible: Boolean) {
        binding.completeDiscountContainer.visibility = if(visible) View.VISIBLE else View.GONE
    }

    override fun changeDiscountPVisibility(visible: Boolean) {
        binding.containerPercentageDiscount.visibility = if(visible) View.VISIBLE else View.GONE
    }

    override fun changeDiscountCVisibility(visible: Boolean) {
        binding.containerAmountDiscount.visibility = if(visible) View.VISIBLE else View.GONE
    }

    override fun setProductTypeFieldError(errorId: Int) {
        if(errorId == -1){
            binding.typeText.error = null
        }else{
            binding.typeText.error = errorsTable.getErrors()[errorId]
        }
    }

    override fun setProductBrandFieldError(errorId: Int) {
        if(errorId == -1){
            binding.brandText.error = null
        }else{
            binding.brandText.error = errorsTable.getErrors()[errorId]
        }
    }

    override fun setProductAmountFieldError(errorId: Int) {
        if(errorId == -1){
            binding.amountText.error = null
        }else{
            binding.amountText.error = errorsTable.getErrors()[errorId]
        }
    }

    override fun setProductPriceFieldError(errorId: Int) {
        if(errorId == -1){
            binding.priceText.error = null
        }else{
            binding.priceText.error = errorsTable.getErrors()[errorId]
        }
    }

    override fun setDiscountTypePFieldError(errorId: Int) {
        if(errorId == -1){
            binding.percentageText.error = null
        }else{
            binding.percentageText.error = errorsTable.getErrors()[errorId]
        }
    }

    override fun setDiscountTypeCFieldError(errorId: Int) {
        if(errorId == -1){
            binding.amount2Text.error = null
        }else{
            binding.amount2Text.error = errorsTable.getErrors()[errorId]
        }
    }
}
