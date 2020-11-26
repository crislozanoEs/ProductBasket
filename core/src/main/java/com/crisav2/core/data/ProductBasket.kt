package com.crisav2.core.data


data class ProductBasket (
    var id: Long,
    var type: String,
    var typeId: Int = -1,
    var brand: String,
    var brandId: Int = -1,
    var amount: Int = 0,
    var price: Float = 0.0f,
    var hasDiscount: Boolean = false,
    var idDiscount: Int = -1,
    var total: Float = 0.0f,
    var cDiscount: CDiscount =  CDiscount(-1,0,0),
    var pDiscount: PDiscount =  PDiscount(-1,0)
)