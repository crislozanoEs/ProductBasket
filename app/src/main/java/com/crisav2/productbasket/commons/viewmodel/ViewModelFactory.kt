package com.crisav2.productbasket.commons.viewmodel

import com.crisav2.core.useCase.ft01.AddProductValidator
import com.crisav2.core.useCase.ft10.CalculateTotalProduct
import com.crisav2.productbasket.views.ft10.viewmodel.AddProductViewModelFactory

class ViewModelFactory {
    fun getAddProductViewModelFactory(addProductValidator: AddProductValidator, calculateTotalProduct: CalculateTotalProduct): AddProductViewModelFactory = AddProductViewModelFactory(addProductValidator, calculateTotalProduct)
}