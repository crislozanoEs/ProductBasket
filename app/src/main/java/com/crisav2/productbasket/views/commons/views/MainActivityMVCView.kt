package com.crisav2.productbasket.views.commons.views

import android.view.View
import androidx.navigation.NavController
import com.crisav2.productbasket.R
import com.crisav2.productbasket.commons.views.MVCViewObservable
import com.crisav2.productbasket.databinding.ActivityMainBinding

class MainActivityMVCView:
    MVCViewObservable<InMainActivityMVCView.Listener, ActivityMainBinding>(), InMainActivityMVCView  {

    override lateinit var binding: ActivityMainBinding
    private val idResource: Int = R.layout.activity_main
    private val idNavController: Int = R.id.insert_point

    override fun getLayoutId() = idResource
    override fun getNavControllerId() = idNavController

}