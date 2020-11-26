package com.crisav2.productbasket.views.commons.views

import android.view.View
import androidx.navigation.NavController
import com.crisav2.productbasket.commons.views.InMVCViewObservable
import com.crisav2.productbasket.databinding.ActivityMainBinding

interface InMainActivityMVCView: InMVCViewObservable<InMainActivityMVCView.Listener, ActivityMainBinding> {
    interface Listener{
        fun onQuickBasketClicked()
        fun onListBasketsClicked()
        fun onFavoriteProductsClicked()
    }
    var binding: ActivityMainBinding
    fun getLayoutId(): Int
    fun getNavControllerId(): Int
}