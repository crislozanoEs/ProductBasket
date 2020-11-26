package com.crisav2.productbasket.views.commons

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.crisav2.productbasket.commons.controllers.BaseActivity
import com.crisav2.productbasket.commons.navigation.NavigationHelper
import com.crisav2.productbasket.views.commons.views.InMainActivityMVCView

class MainActivity : BaseActivity() {

    private lateinit var mvcView: InMainActivityMVCView
    private lateinit var navigationHelper: NavigationHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mvcView = getActivityCompositionRoot().getMVCViewFactory().getMainActivityMVCView()
        // Calling here because this function has a strong reference to the activity (controller)
        // I rather let the Activity knowing about the view that the other way around.
        mvcView.binding = DataBindingUtil.setContentView(this, mvcView.getLayoutId())
        navigationHelper = getActivityCompositionRoot().setUpNavigationController(this.findNavController(mvcView.getNavControllerId()))
    }

}