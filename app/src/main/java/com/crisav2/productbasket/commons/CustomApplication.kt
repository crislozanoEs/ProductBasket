package com.crisav2.productbasket.commons

import android.app.Application
import com.crisav2.core.data.commons.ErrorsTable
import com.crisav2.productbasket.commons.dependencyinjection.CompositionRoot

class CustomApplication: Application() {
    private lateinit var compositionRoot: CompositionRoot

    override fun onCreate() {
        super.onCreate()
        compositionRoot = CompositionRoot(this)
    }

    fun getCompositionRoot() = compositionRoot
}