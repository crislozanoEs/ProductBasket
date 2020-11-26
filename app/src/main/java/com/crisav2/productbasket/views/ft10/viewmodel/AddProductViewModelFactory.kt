package com.crisav2.productbasket.views.ft10.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.crisav2.core.useCase.ft01.AddProductValidator
import com.crisav2.core.useCase.ft10.CalculateTotalProduct
import java.lang.IllegalArgumentException

class AddProductViewModelFactory(private val addProductValidator: AddProductValidator, private val calculateTotalProduct: CalculateTotalProduct): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(AddProductViewModel::class.java))
            return AddProductViewModel(addProductValidator, calculateTotalProduct) as T
        throw IllegalArgumentException("Unknown viewModel class")
    }


}