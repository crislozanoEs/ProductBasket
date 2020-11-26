package com.crisav2.core.useCase.ft01

class AddProductForm(
        var productTypeValid: Boolean,
        var productBrandValid: Boolean,
        var productAmountValid: Boolean,
        var productPriceValid: Boolean,
        var productHasDiscount: Boolean,
        var productDiscountValid: Boolean
)