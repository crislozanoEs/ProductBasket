package com.crisav2.productbasket.commons.dependencyinjection

import com.crisav2.core.data.commons.ErrorsTable
import com.crisav2.core.useCase.ft01.AddProductValidator
import com.crisav2.core.useCase.ft10.CalculateTotalProduct
import com.crisav2.productbasket.commons.navigation.NavigationHelper
import com.crisav2.productbasket.commons.viewmodel.ViewModelFactory
import com.crisav2.productbasket.commons.views.MVCViewFactory

class ControllerCompositionRoot(private val activityCompositionRoot: ActivityCompositionRoot) {

    fun getActivity() = activityCompositionRoot.getActivity()
    fun getContext() = activityCompositionRoot.getContext()
    fun getMVCViewFactory(): MVCViewFactory = activityCompositionRoot.getMVCViewFactory()
    fun getNavigationController(): NavigationHelper = activityCompositionRoot.getNavigationController()
    fun getViewModelFactory(): ViewModelFactory = activityCompositionRoot.getViewModelFactory()
    fun getAddProductValidator(): AddProductValidator = activityCompositionRoot.getAddProductValidator()
    fun getErrorsTable(): ErrorsTable = activityCompositionRoot.getErrorsTable()
    fun getCalculatorTotalProduct(): CalculateTotalProduct = activityCompositionRoot.getCalculatorTotalProduct()
}