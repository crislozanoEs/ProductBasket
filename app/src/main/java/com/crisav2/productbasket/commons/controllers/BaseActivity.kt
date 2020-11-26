package com.crisav2.productbasket.commons.controllers

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.crisav2.productbasket.commons.CustomApplication
import com.crisav2.productbasket.commons.dependencyinjection.ActivityCompositionRoot
import com.crisav2.productbasket.commons.viewmodel.ViewModelFactory

open class BaseActivity: AppCompatActivity() {

    private lateinit var activityCompositionRoot: ActivityCompositionRoot

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityCompositionRoot = ActivityCompositionRoot((application as CustomApplication).getCompositionRoot(), this)
    }

    fun getActivityCompositionRoot() = activityCompositionRoot

}