package com.crisav2.productbasket.views.ft01.controller

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.crisav2.productbasket.commons.controllers.BaseFragment
import com.crisav2.productbasket.commons.navigation.NavigationHelper
import com.crisav2.productbasket.views.ft01.views.InQuickBucketFragmentMVCView

class QuickBucketFragment: BaseFragment(), InQuickBucketFragmentMVCView.Listener {

    private lateinit var mvcView: InQuickBucketFragmentMVCView
    private lateinit var navigationHelper: NavigationHelper

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mvcView = getControllerCompositionRoot().getMVCViewFactory().getQuickBucketFragmentMVCView(container)
        mvcView.binding.lifecycleOwner = this
        navigationHelper = getControllerCompositionRoot().getNavigationController()
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
    override fun onAddProductsClicked() {
        navigationHelper.fromBasketListToAddNewProduct()
    }
}