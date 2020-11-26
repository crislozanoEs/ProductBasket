package com.crisav2.productbasket.views.ft01.controller

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.crisav2.productbasket.R

class QuickBucketFragmentDirections private constructor() {
    companion object {
        fun aactionQuickBucketToAddProduct(): NavDirections =
                ActionOnlyNavDirections(R.id.aaction_quickBucket_to_addProduct)
    }
}
