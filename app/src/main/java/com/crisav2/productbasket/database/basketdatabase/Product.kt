package com.crisav2.productbasket.database.basketdatabase

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "products_table")
data class Product(
        @PrimaryKey(autoGenerate = true)
        var idProduct: Long? = null,
        @ColumnInfo(name = "product_type")
        var productType: String,
)