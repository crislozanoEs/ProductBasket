package com.crisav2.productbasket.commons.views

import android.view.LayoutInflater
import android.view.ViewGroup
import com.crisav2.core.data.commons.ErrorsTable
import com.crisav2.productbasket.views.commons.views.MainActivityMVCView
import com.crisav2.productbasket.views.ft01.views.InQuickBucketFragmentMVCView
import com.crisav2.productbasket.views.ft01.views.QuickBucketFragmentMVCView
import com.crisav2.productbasket.views.ft10.views.AddProductFragmentMVCView
import com.crisav2.productbasket.views.ft10.views.InAddProductFragmentMVCView

class MVCViewFactory(private val layoutInflater: LayoutInflater) {
    fun getMainActivityMVCView() = MainActivityMVCView()
    fun getQuickBucketFragmentMVCView(container: ViewGroup?): InQuickBucketFragmentMVCView = QuickBucketFragmentMVCView(layoutInflater, container!!)
    fun getAddProductFragmentMVCView(container: ViewGroup?, errorsTable: ErrorsTable): InAddProductFragmentMVCView = AddProductFragmentMVCView(layoutInflater, container!!, errorsTable)
}