package com.crisav2.productbasket.commons.controllers

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.crisav2.productbasket.commons.dependencyinjection.ControllerCompositionRoot

open class BaseFragment: Fragment() {

    private lateinit var controllerCompositionRoot: ControllerCompositionRoot

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        controllerCompositionRoot = ControllerCompositionRoot((requireActivity() as BaseActivity).getActivityCompositionRoot())
    }

    fun getControllerCompositionRoot() = controllerCompositionRoot
}