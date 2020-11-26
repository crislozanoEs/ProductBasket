package com.crisav2.productbasket.views.ft10.controller

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.crisav2.productbasket.commons.controllers.BaseFragment
import com.crisav2.productbasket.views.ft10.viewmodel.AddProductViewModel
import com.crisav2.productbasket.views.ft10.viewmodel.AddProductViewModelFactory
import com.crisav2.productbasket.views.ft10.views.InAddProductFragmentMVCView

class AddProductFragment: BaseFragment(), InAddProductFragmentMVCView.Listener {

    private lateinit var mvcView: InAddProductFragmentMVCView
    private lateinit var viewModel: AddProductViewModel
    private lateinit var viewModelFactory: AddProductViewModelFactory

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mvcView = getControllerCompositionRoot().getMVCViewFactory().getAddProductFragmentMVCView(container, getControllerCompositionRoot().getErrorsTable())
        mvcView.binding.lifecycleOwner = this
        viewModelFactory = getControllerCompositionRoot()
            .getViewModelFactory()
            .getAddProductViewModelFactory(
                    getControllerCompositionRoot().getAddProductValidator(),
                    getControllerCompositionRoot().getCalculatorTotalProduct())
        viewModel = ViewModelProvider(this, viewModelFactory).get(AddProductViewModel::class.java)
        mvcView.binding.productViewModel = viewModel
        startViewModelObservers()
        return mvcView.getRootView()
    }

    override fun onStart() {
        super.onStart()
        mvcView.registerListener(this)
    }

    override fun onStop() {
        super.onStop()
        mvcView.unregisterListener(this)
    }

    private fun startViewModelObservers() {
        viewModel.hasDiscount.observe(viewLifecycleOwner, {value ->
            mvcView.changeDiscountContainerVisibility(value)
        })
        viewModel.discountP.observe(viewLifecycleOwner, {value ->
            mvcView.changeDiscountPVisibility(value)
        })
        viewModel.discountC.observe(viewLifecycleOwner, {value ->
            mvcView.changeDiscountCVisibility(value)
        })
    }

    override fun onSaveProductClicked() {
        viewModel.saveProductInDatabase()
    }

    override fun onDeleteProductClicked() {
        TODO("Not yet implemented")
    }

    override fun onProductTypeTextChanged() {
        mvcView.setProductTypeFieldError(viewModel.validateProductType())
    }

    override fun onProductBrandTextChanged() {
        mvcView.setProductBrandFieldError(viewModel.validateProductBrand())
    }

    override fun onProductAmountTextChanged() {
        mvcView.setProductAmountFieldError(viewModel.validateProductAmount())
    }

    override fun onProductPriceTextChanged() {
        mvcView.setProductPriceFieldError(viewModel.validateProductPrice())
    }

    override fun onProductHasDiscountChanged() {
        viewModel.updateProductHasDiscount()
    }

    override fun onDiscountChanged(checkId: Int) {
        if(checkId == 0){
            mvcView.setDiscountTypePFieldError(viewModel.updateTypeDiscountChanged())
        }else{
            mvcView.setDiscountTypeCFieldError(viewModel.updateTypeDiscountChanged())
        }
    }

    override fun onPercentageChanged() {
        mvcView.setDiscountTypePFieldError(viewModel.validatePercentage())
    }

    override fun onAmount1Changed() {
        mvcView.setDiscountTypeCFieldError(viewModel.validateAmount())
    }

    override fun onAmount2Changed() {
        mvcView.setDiscountTypeCFieldError(viewModel.validateAmount())
    }
}