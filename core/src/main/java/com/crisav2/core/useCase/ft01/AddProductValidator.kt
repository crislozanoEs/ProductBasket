package com.crisav2.core.useCase.ft01

import com.crisav2.core.data.commons.ValidatorResponse

class AddProductValidator{
    val maxLengthAmount = 4
    val maxLengthPrice = 9
    val maxLengthPercentageDiscount= 3
    val maxLengthAmountDiscount = 2

    fun validateTypeProduct(productType: String): ValidatorResponse{
        return if(productType.isEmpty()){
            ValidatorResponse(false,10)
        }else{
            ValidatorResponse(true, 0)
        }
    }

    fun validateBrandProduct(productBrand: String): ValidatorResponse{
        return if(productBrand.isEmpty()){
            ValidatorResponse(false,11)
        }else{
            ValidatorResponse(true, 0)
        }
    }

    fun validateAmountProduct(amount: String): ValidatorResponse{
        val validatorResponse = ValidatorResponse(true, 0)
        val amountToEvaluate = if(amount.isEmpty()) "0" else amount
        if(amountToEvaluate.toInt() == 0){
            validatorResponse.valid = false
            validatorResponse.errorCode = 12
        }
        return validatorResponse
    }

    fun validatePriceProduct(price: String): ValidatorResponse{
        val validatorResponse = ValidatorResponse(true, 0)
        val priceToEvaluate = if(price.isEmpty()) "0" else price
        if(priceToEvaluate.toLong() == 0L){
            validatorResponse.valid = false
            validatorResponse.errorCode = 13
        }
        return validatorResponse
    }

    fun validatePercentage(percentage: String): ValidatorResponse{
        val validatorResponse = ValidatorResponse(true, 0)
        val percentageToEvaluate = if(percentage.isEmpty()) "0" else percentage
        if(percentageToEvaluate.toInt() == 0){
            validatorResponse.valid = false
            validatorResponse.errorCode = 14
        }
        if(percentageToEvaluate.toInt() > 100){
            validatorResponse.valid = false
            validatorResponse.errorCode = 15
        }
        return validatorResponse
    }

    fun validateAmountDiscount(amount1: String, amount2: String): ValidatorResponse{
        val validatorResponse = ValidatorResponse(true, 0)
        val amount1ToEvaluate = if(amount1.isEmpty()) "0" else amount1
        val amount2ToEvaluate = if(amount2.isEmpty()) "0" else amount2
        if(amount1ToEvaluate.toInt() ==  0 || amount2ToEvaluate.toInt() == 0){
            validatorResponse.valid = false
            validatorResponse.errorCode = 16
        }
        if(amount1ToEvaluate.toInt()> amount2ToEvaluate.toInt()){
            validatorResponse.valid = false
            validatorResponse.errorCode = 17
        }
        return validatorResponse
    }

    fun validateCompleteForm(addProductForm: AddProductForm): Boolean =
            if(!addProductForm.productHasDiscount) validateFromWithNoDiscount(addProductForm) else validateFormWithDiscount(addProductForm)

    private fun validateFormWithDiscount(addProductForm: AddProductForm): Boolean =
            validateFromWithNoDiscount(addProductForm) && addProductForm.productDiscountValid

    private fun validateFromWithNoDiscount(addProductForm: AddProductForm): Boolean =
            addProductForm.productTypeValid && addProductForm.productBrandValid && addProductForm.productAmountValid && addProductForm.productPriceValid

    fun enableToCalculateTotalNoDiscount(addProductForm: AddProductForm): Boolean = addProductForm.productAmountValid && addProductForm.productPriceValid

    fun enableToCalculateTotalWithDiscount(addProductForm: AddProductForm): Boolean = addProductForm.productAmountValid && addProductForm.productPriceValid && addProductForm.productDiscountValid

}