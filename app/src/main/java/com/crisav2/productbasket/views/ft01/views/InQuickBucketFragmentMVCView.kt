package com.crisav2.productbasket.views.ft01.views

import androidx.lifecycle.LifecycleOwner
import com.crisav2.productbasket.commons.views.InMVCViewObservable
import com.crisav2.productbasket.databinding.QuickBucketFragmentBinding

interface InQuickBucketFragmentMVCView:
    InMVCViewObservable<InQuickBucketFragmentMVCView.Listener, QuickBucketFragmentBinding> {
    interface Listener{
        fun onAddProductsClicked()
    }
    var binding: QuickBucketFragmentBinding
}