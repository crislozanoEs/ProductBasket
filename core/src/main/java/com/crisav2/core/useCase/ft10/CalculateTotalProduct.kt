package com.crisav2.core.useCase.ft10

import com.crisav2.core.data.ProductBasket

class CalculateTotalProduct {

    fun calculateTotalNoDiscount(product: ProductBasket): Float{
        product.total = product.amount*product.price
        return product.total
    }

    fun calculateTotalWithDiscount(product: ProductBasket): Float{
        product.total = product.amount*product.price
        if(product.idDiscount == 1){
            val discount: Float = (100-product.pDiscount.percentage.toFloat())/100
            product.total = product.total*discount
        }
        if(product.idDiscount == 2){
            val ratio: Float = product.cDiscount.needToBuy.toFloat()/product.cDiscount.amountToDiscount.toFloat()
            product.total = product.total*ratio
        }
        return product.total
    }
}