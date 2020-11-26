package com.crisav2.productbasket.commons.dependencyinjection

import android.app.Application
import com.crisav2.core.data.commons.ErrorsTable

class CompositionRoot(private val application: Application) {
    private val errorsTable: ErrorsTable = ErrorsTable

    fun getErrorsTable() = errorsTable
}