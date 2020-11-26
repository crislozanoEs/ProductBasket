package com.crisav2.productbasket.views.ft01.views

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LifecycleOwner
import com.crisav2.productbasket.R
import com.crisav2.productbasket.commons.views.MVCViewObservable
import com.crisav2.productbasket.databinding.QuickBucketFragmentBinding

class QuickBucketFragmentMVCView(layoutInflater: LayoutInflater, parent: ViewGroup):
    MVCViewObservable<InQuickBucketFragmentMVCView.Listener, QuickBucketFragmentBinding>(),
    InQuickBucketFragmentMVCView{

    override var binding: QuickBucketFragmentBinding = DataBindingUtil.inflate(layoutInflater, R.layout.quick_bucket_fragment, parent, false)

    init {
        super.setRootView(binding.root)
        bindAddProductClickListener()
    }

    private fun bindAddProductClickListener(){
        binding.buttonAddMore.setOnClickListener {
            updateOnAddProductsClicked()
        }
    }
    private fun updateOnAddProductsClicked(){
        getListeners().forEach {
            it.onAddProductsClicked()
        }
    }
}