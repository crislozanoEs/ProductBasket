package com.crisav2.productbasket.commons.dependencyinjection

import android.content.Context
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.crisav2.core.data.commons.ErrorsTable
import com.crisav2.core.useCase.ft01.AddProductValidator
import com.crisav2.core.useCase.ft10.CalculateTotalProduct
import com.crisav2.productbasket.commons.navigation.NavigationHelper
import com.crisav2.productbasket.commons.viewmodel.ViewModelFactory
import com.crisav2.productbasket.commons.views.MVCViewFactory

open class ActivityCompositionRoot (private val compositionRoot: CompositionRoot, private val activity: AppCompatActivity){

    private lateinit var navigationHelper: NavigationHelper
    private val viewModelFactory: ViewModelFactory = ViewModelFactory()
    private val context: Context = activity.baseContext
    private val layoutInflater: LayoutInflater = LayoutInflater.from(context)
    private val mvcViewFactory: MVCViewFactory = MVCViewFactory(layoutInflater)
    private val addProductValidator = AddProductValidator()
    private val calculateTotalProduct = CalculateTotalProduct()

    fun getActivity(): AppCompatActivity = activity
    fun getContext(): Context = context
    fun getMVCViewFactory(): MVCViewFactory =  mvcViewFactory
    fun getViewModelFactory(): ViewModelFactory = viewModelFactory
    fun setUpNavigationController(navController: NavController): NavigationHelper{
        navigationHelper = NavigationHelper(navController)
        return navigationHelper
    }
    fun getNavigationController() = navigationHelper
    fun getAddProductValidator(): AddProductValidator =  addProductValidator
    fun getCalculatorTotalProduct(): CalculateTotalProduct = calculateTotalProduct
    fun getErrorsTable(): ErrorsTable = compositionRoot.getErrorsTable()

}