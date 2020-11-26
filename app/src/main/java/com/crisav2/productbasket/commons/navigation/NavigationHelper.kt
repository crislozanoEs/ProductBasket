package com.crisav2.productbasket.commons.navigation

import androidx.navigation.NavController
import com.crisav2.productbasket.views.ft01.controller.QuickBucketFragmentDirections

class NavigationHelper(private val navController: NavController): com.crisav2.productbasket.commons.BaseObservable<NavigationHelper.Listener>() {

    interface Listener{
        fun onAddNewProductClicked()
    }

    fun updateOnAddNewProductClicked(){
        getListeners().forEach{
            it.onAddNewProductClicked()
        }
    }

    fun fromBasketListToAddNewProduct() = navController.navigate(QuickBucketFragmentDirections.aactionQuickBucketToAddProduct())
}