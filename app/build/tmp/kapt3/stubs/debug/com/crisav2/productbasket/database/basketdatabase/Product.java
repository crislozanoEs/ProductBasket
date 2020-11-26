package com.crisav2.productbasket.database.basketdatabase;

import java.lang.System;

@androidx.room.Entity(tableName = "products_table")
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J$\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0005H\u00d6\u0001R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001a"}, d2 = {"Lcom/crisav2/productbasket/database/basketdatabase/Product;", "", "idProduct", "", "productType", "", "(Ljava/lang/Long;Ljava/lang/String;)V", "getIdProduct", "()Ljava/lang/Long;", "setIdProduct", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getProductType", "()Ljava/lang/String;", "setProductType", "(Ljava/lang/String;)V", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/lang/String;)Lcom/crisav2/productbasket/database/basketdatabase/Product;", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class Product {
    @org.jetbrains.annotations.Nullable()
    @androidx.room.PrimaryKey(autoGenerate = true)
    private java.lang.Long idProduct;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "product_type")
    private java.lang.String productType;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getIdProduct() {
        return null;
    }
    
    public final void setIdProduct(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProductType() {
        return null;
    }
    
    public final void setProductType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public Product(@org.jetbrains.annotations.Nullable()
    java.lang.Long idProduct, @org.jetbrains.annotations.NotNull()
    java.lang.String productType) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.crisav2.productbasket.database.basketdatabase.Product copy(@org.jetbrains.annotations.Nullable()
    java.lang.Long idProduct, @org.jetbrains.annotations.NotNull()
    java.lang.String productType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}