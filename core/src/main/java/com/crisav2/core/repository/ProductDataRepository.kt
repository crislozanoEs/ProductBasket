package com.crisav2.core.repository

import com.crisav2.core.data.ProductBasket

class ProductDataRepository (private val dataSource: ProductDataSource){
    suspend fun addProduct(product: ProductBasket){
        dataSource.addProduct(product)
    }
    suspend fun getProduct(idProduct: Long, idList: Long): ProductBasket? = dataSource.getProduct(idProduct,idList)
    suspend fun getAllProducts(idList: Long): List<ProductBasket> = dataSource.getAllProducts(idList)
    suspend fun removeProduct(product: ProductBasket, idList: Long) {
        removeProduct(product,idList)
    }
}