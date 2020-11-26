package com.crisav2.core.data.commons

object ErrorsTable {
    private var errors: HashMap<Int, String> = HashMap()
    init{
        errors[0] = "Generic error"
        errors[10] = "Product type must not be empty"
        errors[11] = "Product brand must not be empty"
        errors[12] = "Amount must be greater than 0"
        errors[13] = "Price must be greater than 0"
        errors[14] = "The percentage of discount must be greater than 0"
        errors[15] = "The percentage of discount must be less than 100%"
        errors[16] = "Both amounts must be greater than 0"
        errors[17] = "Y must be greater than X"
    }

    fun getErrors() = errors
}