package com.crisav2.core.useCase.ft01

import com.crisav2.core.data.ProductBasket
import com.crisav2.core.repository.ProductDataRepository

class AddProduct(private val productDataRepository: ProductDataRepository) {
    suspend operator fun invoke(productBasket: ProductBasket) = productDataRepository.addProduct(productBasket)
}