package com.crisav2.core.repository

import com.crisav2.core.data.ProductBasket

interface ProductDataSource {
    suspend fun addProduct(product: ProductBasket)
    suspend fun getProduct(idProduct: Long, idList: Long): ProductBasket?
    suspend fun getAllProducts(idList: Long): List<ProductBasket>
    suspend fun removeProduct(product: ProductBasket, idList: Long)
}