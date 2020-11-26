package com.crisav2.productbasket.views.ft10.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.crisav2.core.data.ProductBasket
import com.crisav2.core.data.commons.ValidatorResponse
import com.crisav2.core.useCase.ft01.AddProductForm
import com.crisav2.core.useCase.ft01.AddProductValidator
import com.crisav2.core.useCase.ft10.CalculateTotalProduct

class  AddProductViewModel(private val addProductValidator: AddProductValidator, private val calculateTotalProduct: CalculateTotalProduct): ViewModel() {

    private enum class FIELD{
        TYPE_PRODUCT, BRAND_PRODUCT, AMOUNT_PRODUCT, PRICE_PRODUCT, DISCOUNT_PERCENTAGE, DISCOUNT_AMOUNT
    }
    private var productTypeValid = false
    private var productBrandValid = false
    private var productAmountValid = false
    private var productPriceValid = false
    private var productDiscountValid = false
    val maxLengthAmount: Int = addProductValidator.maxLengthAmount
    val maxLengthPrice: Int = addProductValidator.maxLengthPrice
    val maxLengthDiscount: Int = addProductValidator.maxLengthPercentageDiscount
    val maxLengthAmountDiscount: Int = addProductValidator.maxLengthAmountDiscount
    val typeProduct = MutableLiveData<String>()
    val brandProduct = MutableLiveData<String>()
    val amountProduct = MutableLiveData<Int>()
    val amountProductString = MutableLiveData<String>()
    val priceUnitProduct = MutableLiveData<Double>()
    val priceUnitString = MutableLiveData<String>()
    val hasDiscount = MutableLiveData<Boolean>()
    val discountP = MutableLiveData<Boolean>()
    val discountC = MutableLiveData<Boolean>()
    val percentageString = MutableLiveData<String>()
    val amount1String = MutableLiveData<String>()
    val amount2String = MutableLiveData<String>()
    val total = MutableLiveData<String>()
    val typeDiscount = MutableLiveData<Int>()
    private val _product = MutableLiveData<ProductBasket>()
    private val _formValid = MutableLiveData<Boolean>()
    val formValid: LiveData<Boolean>
        get() = _formValid


    init{
        _product.value = ProductBasket(id = -1L, brand = "", type = "")
        _formValid.value = false
        hasDiscount.value = false
        discountC.value = false
        discountP.value = false
        percentageString.value = "000"
        amount1String.value = "0"
        amount2String.value = "0"
        total.value = "0000"
    }

    fun validateProductType(): Int = validateInput(FIELD.TYPE_PRODUCT, addProductValidator.validateTypeProduct(typeProduct.value!!))
    fun validateProductBrand(): Int = validateInput(FIELD.BRAND_PRODUCT, addProductValidator.validateBrandProduct(brandProduct.value!!))
    fun validateProductAmount(): Int = validateInput(FIELD.AMOUNT_PRODUCT, addProductValidator.validateAmountProduct(amountProductString.value!!))
    fun validateProductPrice(): Int = validateInput(FIELD.PRICE_PRODUCT, addProductValidator.validatePriceProduct(priceUnitString.value!!))
    fun updateProductHasDiscount(){
        val addProductForm = AddProductForm(productTypeValid, productBrandValid, productAmountValid, productPriceValid, hasDiscount.value!!, productDiscountValid)
        validateForm(addProductForm)
    }
    fun updateTypeDiscountChanged(): Int{
        if(discountC.value!!){
            return validateAmount()
        }
        if(discountP.value!!){
             return validatePercentage()
        }
        return -1
    }
    fun validatePercentage(): Int = validateInput(FIELD.DISCOUNT_PERCENTAGE, addProductValidator.validatePercentage(percentageString.value!!))
    fun validateAmount(): Int = validateInput(FIELD.DISCOUNT_AMOUNT, addProductValidator.validateAmountDiscount(amount1String.value!!, amount2String.value!!))

    private fun validateInput(
        inputField: FIELD,
        validateResponse: ValidatorResponse
    ): Int {
        when(inputField){
            FIELD.TYPE_PRODUCT -> productTypeValid = validateResponse.valid
            FIELD.BRAND_PRODUCT -> productBrandValid = validateResponse.valid
            FIELD.AMOUNT_PRODUCT -> productAmountValid = validateResponse.valid
            FIELD.PRICE_PRODUCT -> productPriceValid = validateResponse.valid
            FIELD.DISCOUNT_PERCENTAGE -> productDiscountValid = validateResponse.valid
            FIELD.DISCOUNT_AMOUNT -> productDiscountValid = validateResponse.valid
        }
        val addProductForm = AddProductForm(productTypeValid, productBrandValid, productAmountValid, productPriceValid, hasDiscount.value!!, productDiscountValid)
        if(isInputPartOfTotal(inputField))
            calculateTotal(addProductForm)
        validateForm(addProductForm)
        return if(validateResponse.valid) -1 else validateResponse.errorCode
    }

    private fun calculateTotal(addProductForm: AddProductForm) {
        var totalValueString = ""
        if(!hasDiscount.value!!){
            if(addProductValidator.enableToCalculateTotalNoDiscount(addProductForm)) {
                _product.value!!.hasDiscount = false
                _product.value!!.price = priceUnitString.value!!.toFloat()
                _product.value!!.amount = amountProductString.value!!.toInt()
                val totalNumeric = calculateTotalProduct.calculateTotalNoDiscount(_product.value!!)
                totalValueString = totalNumeric.toString()
                _product.value!!.total  = totalNumeric
            }
        }else{
            if(addProductValidator.enableToCalculateTotalWithDiscount(addProductForm)) {
                _product.value!!.hasDiscount = true
                _product.value!!.price = priceUnitString.value!!.toFloat()
                _product.value!!.amount = amountProductString.value!!.toInt()
                setDiscountInProduct()
                val totalNumeric = calculateTotalProduct.calculateTotalWithDiscount(_product.value!!)
                totalValueString = totalNumeric.toString()
                _product.value!!.total  = totalNumeric
            }
        }
        total.value = totalValueString
    }

    private fun setDiscountInProduct() {
        if(discountP.value!!){
            _product.value!!.idDiscount = 1
            _product.value!!.pDiscount.percentage = percentageString.value!!.toInt()
        }
        if(discountC.value!!){
            _product.value!!.idDiscount = 2
            _product.value!!.cDiscount.needToBuy = amount1String.value!!.toInt()
            _product.value!!.cDiscount.amountToDiscount = amount2String.value!!.toInt()
        }
    }

    private fun isInputPartOfTotal(inputField: FIELD) =
            inputField == FIELD.AMOUNT_PRODUCT || inputField == FIELD.PRICE_PRODUCT ||
                    inputField == FIELD.DISCOUNT_PERCENTAGE || inputField == FIELD.DISCOUNT_AMOUNT

    private fun validateForm(addProductForm: AddProductForm) {
       _formValid.value = addProductValidator.validateCompleteForm(addProductForm)
    }

    fun saveProductInDatabase(){
        _product.value!!.type = typeProduct.value!!
        _product.value!!.brand = brandProduct.value!!
    }
}