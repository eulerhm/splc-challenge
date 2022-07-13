package com.woocommerce.android.model;

import java.lang.System;

@kotlinx.parcelize.Parcelize
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\bL\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B\u00fb\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u001b\u001a\u00020\u0013\u0012\u0006\u0010\u001c\u001a\u00020\u0013\u0012\u0006\u0010\u001d\u001a\u00020\u0013\u0012\u0006\u0010\u001e\u001a\u00020\u0013\u0012\u0006\u0010\u001f\u001a\u00020\b\u0012\u0006\u0010 \u001a\u00020\u0013\u0012\u0006\u0010!\u001a\u00020\b\u0012\u0006\u0010\"\u001a\u00020\u0005\u0012\u0006\u0010#\u001a\u00020$\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\'0&\u0012\u0006\u0010(\u001a\u00020)\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010+\u001a\u00020)\u0012\u0006\u0010,\u001a\u00020)\u00a2\u0006\u0002\u0010-J\u0011\u0010T\u001a\u00020$2\u0006\u0010U\u001a\u00020\u0000H\u0096\u0002J\t\u0010V\u001a\u00020\u0005H\u00c6\u0003J\t\u0010W\u001a\u00020\u0013H\u00c6\u0003J\t\u0010X\u001a\u00020\u0015H\u00c6\u0003J\t\u0010Y\u001a\u00020\u0017H\u00c6\u0003J\t\u0010Z\u001a\u00020\u0019H\u00c6\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\t\u0010\\\u001a\u00020\u0013H\u00c6\u0003J\t\u0010]\u001a\u00020\u0013H\u00c6\u0003J\t\u0010^\u001a\u00020\u0013H\u00c6\u0003J\t\u0010_\u001a\u00020\u0013H\u00c6\u0003J\t\u0010`\u001a\u00020\bH\u00c6\u0003J\t\u0010a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010b\u001a\u00020\u0013H\u00c6\u0003J\t\u0010c\u001a\u00020\bH\u00c6\u0003J\t\u0010d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010e\u001a\u00020$H\u00c6\u0003J\u0014\u0010f\u001a\b\u0012\u0004\u0012\u00020\'0&H\u00c6\u0003\u00a2\u0006\u0002\u0010/J\t\u0010g\u001a\u00020)H\u00c6\u0003J\t\u0010h\u001a\u00020)H\u00c6\u0003J\t\u0010i\u001a\u00020)H\u00c6\u0003J\t\u0010j\u001a\u00020)H\u00c6\u0003J\t\u0010k\u001a\u00020\bH\u00c6\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u00ba\u0002\u0010r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u001b\u001a\u00020\u00132\b\b\u0002\u0010\u001c\u001a\u00020\u00132\b\b\u0002\u0010\u001d\u001a\u00020\u00132\b\b\u0002\u0010\u001e\u001a\u00020\u00132\b\b\u0002\u0010\u001f\u001a\u00020\b2\b\b\u0002\u0010 \u001a\u00020\u00132\b\b\u0002\u0010!\u001a\u00020\b2\b\b\u0002\u0010\"\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020$2\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020\'0&2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010+\u001a\u00020)2\b\b\u0002\u0010,\u001a\u00020)H\u00c6\u0001\u00a2\u0006\u0002\u0010sJ\t\u0010t\u001a\u00020$H\u00d6\u0001J\u0013\u0010u\u001a\u00020\u00132\b\u0010U\u001a\u0004\u0018\u00010vH\u0096\u0002J\u0012\u0010w\u001a\u00020\b2\n\b\u0002\u0010x\u001a\u0004\u0018\u00010yJ\b\u0010z\u001a\u00020$H\u0016J\u0012\u0010{\u001a\u00020|2\n\b\u0002\u0010}\u001a\u0004\u0018\u00010|J\t\u0010~\u001a\u00020\bH\u00d6\u0001J\u001d\u0010\u007f\u001a\u00030\u0080\u00012\b\u0010\u0081\u0001\u001a\u00030\u0082\u00012\u0007\u0010\u0083\u0001\u001a\u00020$H\u00d6\u0001R\u0019\u0010%\u001a\b\u0012\u0004\u0012\u00020\'0&\u00a2\u0006\n\n\u0002\u00100\u001a\u0004\b.\u0010/R\u0011\u0010\u0016\u001a\u00020\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u001f\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0014\u0010+\u001a\u00020)X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0011\u0010\u001d\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u00109R\u0011\u0010\u001b\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u00109R\u0011\u0010:\u001a\u00020\u00138F\u00a2\u0006\u0006\u001a\u0004\b:\u00109R\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u00109R\u0011\u0010\u001e\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u00109R\u0011\u0010\u001c\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u00109R\u0011\u0010 \u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b \u00109R\u0014\u0010(\u001a\u00020)X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u00106R\u0011\u0010#\u001a\u00020$\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u00104\"\u0004\bA\u0010BR\u0013\u0010\r\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010?R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u0010ER\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010?R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010HR\u0011\u0010!\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u00104R\u0011\u0010\"\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u0010ER\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u00104R\u0011\u0010\u0018\u001a\u00020\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u0011\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u0010QR\u0014\u0010,\u001a\u00020)X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u00106R\u0014\u0010*\u001a\u00020)X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bS\u00106\u00a8\u0006\u0084\u0001"}, d2 = {"Lcom/woocommerce/android/model/ProductVariation;", "Landroid/os/Parcelable;", "Lcom/woocommerce/android/model/IProduct;", "", "remoteProductId", "", "remoteVariationId", "sku", "", "image", "Lcom/woocommerce/android/model/Product$Image;", "price", "Ljava/math/BigDecimal;", "regularPrice", "salePrice", "saleEndDateGmt", "Ljava/util/Date;", "saleStartDateGmt", "isSaleScheduled", "", "stockStatus", "Lcom/woocommerce/android/ui/products/ProductStockStatus;", "backorderStatus", "Lcom/woocommerce/android/ui/products/ProductBackorderStatus;", "stockQuantity", "", "priceWithCurrency", "isPurchasable", "isVirtual", "isDownloadable", "isStockManaged", "description", "isVisible", "shippingClass", "shippingClassId", "menuOrder", "", "attributes", "", "Lcom/woocommerce/android/model/VariantOption;", "length", "", "width", "height", "weight", "(JJLjava/lang/String;Lcom/woocommerce/android/model/Product$Image;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/Date;Ljava/util/Date;ZLcom/woocommerce/android/ui/products/ProductStockStatus;Lcom/woocommerce/android/ui/products/ProductBackorderStatus;DLjava/lang/String;ZZZZLjava/lang/String;ZLjava/lang/String;JI[Lcom/woocommerce/android/model/VariantOption;FFFF)V", "getAttributes", "()[Lcom/woocommerce/android/model/VariantOption;", "[Lcom/woocommerce/android/model/VariantOption;", "getBackorderStatus", "()Lcom/woocommerce/android/ui/products/ProductBackorderStatus;", "getDescription", "()Ljava/lang/String;", "getHeight", "()F", "getImage", "()Lcom/woocommerce/android/model/Product$Image;", "()Z", "isSaleInEffect", "getLength", "getMenuOrder", "()I", "getPrice", "()Ljava/math/BigDecimal;", "getPriceWithCurrency", "setPriceWithCurrency", "(Ljava/lang/String;)V", "getRegularPrice", "getRemoteProductId", "()J", "getRemoteVariationId", "getSaleEndDateGmt", "()Ljava/util/Date;", "getSalePrice", "getSaleStartDateGmt", "getShippingClass", "getShippingClassId", "getSku", "getStockQuantity", "()D", "getStockStatus", "()Lcom/woocommerce/android/ui/products/ProductStockStatus;", "getWeight", "getWidth", "compareTo", "other", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JJLjava/lang/String;Lcom/woocommerce/android/model/Product$Image;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/Date;Ljava/util/Date;ZLcom/woocommerce/android/ui/products/ProductStockStatus;Lcom/woocommerce/android/ui/products/ProductBackorderStatus;DLjava/lang/String;ZZZZLjava/lang/String;ZLjava/lang/String;JI[Lcom/woocommerce/android/model/VariantOption;FFFF)Lcom/woocommerce/android/model/ProductVariation;", "describeContents", "equals", "", "getName", "parentProduct", "Lcom/woocommerce/android/model/Product;", "hashCode", "toDataModel", "Lorg/wordpress/android/fluxc/model/WCProductVariationModel;", "cachedVariation", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
public final class ProductVariation implements android.os.Parcelable, com.woocommerce.android.model.IProduct, java.lang.Comparable<com.woocommerce.android.model.ProductVariation> {
    private final long remoteProductId = 0L;
    private final long remoteVariationId = 0L;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String sku = null;
    @org.jetbrains.annotations.Nullable
    private final com.woocommerce.android.model.Product.Image image = null;
    @org.jetbrains.annotations.Nullable
    private final java.math.BigDecimal price = null;
    @org.jetbrains.annotations.Nullable
    private final java.math.BigDecimal regularPrice = null;
    @org.jetbrains.annotations.Nullable
    private final java.math.BigDecimal salePrice = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.Date saleEndDateGmt = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.Date saleStartDateGmt = null;
    private final boolean isSaleScheduled = false;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.ui.products.ProductStockStatus stockStatus = null;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.ui.products.ProductBackorderStatus backorderStatus = null;
    private final double stockQuantity = 0.0;
    @org.jetbrains.annotations.Nullable
    private java.lang.String priceWithCurrency;
    private final boolean isPurchasable = false;
    private final boolean isVirtual = false;
    private final boolean isDownloadable = false;
    private final boolean isStockManaged = false;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String description = null;
    private final boolean isVisible = false;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String shippingClass = null;
    private final long shippingClassId = 0L;
    private final int menuOrder = 0;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.model.VariantOption[] attributes = null;
    private final float length = 0.0F;
    private final float width = 0.0F;
    private final float height = 0.0F;
    private final float weight = 0.0F;
    public static final android.os.Parcelable.Creator<com.woocommerce.android.model.ProductVariation> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.model.ProductVariation copy(long remoteProductId, long remoteVariationId, @org.jetbrains.annotations.NotNull
    java.lang.String sku, @org.jetbrains.annotations.Nullable
    com.woocommerce.android.model.Product.Image image, @org.jetbrains.annotations.Nullable
    java.math.BigDecimal price, @org.jetbrains.annotations.Nullable
    java.math.BigDecimal regularPrice, @org.jetbrains.annotations.Nullable
    java.math.BigDecimal salePrice, @org.jetbrains.annotations.Nullable
    java.util.Date saleEndDateGmt, @org.jetbrains.annotations.Nullable
    java.util.Date saleStartDateGmt, boolean isSaleScheduled, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.ProductStockStatus stockStatus, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.ProductBackorderStatus backorderStatus, double stockQuantity, @org.jetbrains.annotations.Nullable
    java.lang.String priceWithCurrency, boolean isPurchasable, boolean isVirtual, boolean isDownloadable, boolean isStockManaged, @org.jetbrains.annotations.NotNull
    java.lang.String description, boolean isVisible, @org.jetbrains.annotations.NotNull
    java.lang.String shippingClass, long shippingClassId, int menuOrder, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.VariantOption[] attributes, float length, float width, float height, float weight) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public ProductVariation(long remoteProductId, long remoteVariationId, @org.jetbrains.annotations.NotNull
    java.lang.String sku, @org.jetbrains.annotations.Nullable
    com.woocommerce.android.model.Product.Image image, @org.jetbrains.annotations.Nullable
    java.math.BigDecimal price, @org.jetbrains.annotations.Nullable
    java.math.BigDecimal regularPrice, @org.jetbrains.annotations.Nullable
    java.math.BigDecimal salePrice, @org.jetbrains.annotations.Nullable
    java.util.Date saleEndDateGmt, @org.jetbrains.annotations.Nullable
    java.util.Date saleStartDateGmt, boolean isSaleScheduled, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.ProductStockStatus stockStatus, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.ProductBackorderStatus backorderStatus, double stockQuantity, @org.jetbrains.annotations.Nullable
    java.lang.String priceWithCurrency, boolean isPurchasable, boolean isVirtual, boolean isDownloadable, boolean isStockManaged, @org.jetbrains.annotations.NotNull
    java.lang.String description, boolean isVisible, @org.jetbrains.annotations.NotNull
    java.lang.String shippingClass, long shippingClassId, int menuOrder, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.VariantOption[] attributes, float length, float width, float height, float weight) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getRemoteProductId() {
        return 0L;
    }
    
    public final long component2() {
        return 0L;
    }
    
    public final long getRemoteVariationId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSku() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.woocommerce.android.model.Product.Image component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.woocommerce.android.model.Product.Image getImage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.math.BigDecimal component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.math.BigDecimal getPrice() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.math.BigDecimal component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.math.BigDecimal getRegularPrice() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.math.BigDecimal component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.math.BigDecimal getSalePrice() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.Date component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.Date getSaleEndDateGmt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.Date component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.Date getSaleStartDateGmt() {
        return null;
    }
    
    public final boolean component10() {
        return false;
    }
    
    public final boolean isSaleScheduled() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.ui.products.ProductStockStatus component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.ui.products.ProductStockStatus getStockStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.ui.products.ProductBackorderStatus component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.ui.products.ProductBackorderStatus getBackorderStatus() {
        return null;
    }
    
    public final double component13() {
        return 0.0;
    }
    
    public final double getStockQuantity() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPriceWithCurrency() {
        return null;
    }
    
    public final void setPriceWithCurrency(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    public final boolean component15() {
        return false;
    }
    
    public final boolean isPurchasable() {
        return false;
    }
    
    public final boolean component16() {
        return false;
    }
    
    public final boolean isVirtual() {
        return false;
    }
    
    public final boolean component17() {
        return false;
    }
    
    public final boolean isDownloadable() {
        return false;
    }
    
    public final boolean component18() {
        return false;
    }
    
    public final boolean isStockManaged() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final boolean component20() {
        return false;
    }
    
    public final boolean isVisible() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getShippingClass() {
        return null;
    }
    
    public final long component22() {
        return 0L;
    }
    
    public final long getShippingClassId() {
        return 0L;
    }
    
    public final int component23() {
        return 0;
    }
    
    public final int getMenuOrder() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.model.VariantOption[] component24() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.model.VariantOption[] getAttributes() {
        return null;
    }
    
    public final float component25() {
        return 0.0F;
    }
    
    @java.lang.Override
    public float getLength() {
        return 0.0F;
    }
    
    public final float component26() {
        return 0.0F;
    }
    
    @java.lang.Override
    public float getWidth() {
        return 0.0F;
    }
    
    public final float component27() {
        return 0.0F;
    }
    
    @java.lang.Override
    public float getHeight() {
        return 0.0F;
    }
    
    public final float component28() {
        return 0.0F;
    }
    
    @java.lang.Override
    public float getWeight() {
        return 0.0F;
    }
    
    public final boolean isSaleInEffect() {
        return false;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int compareTo(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.ProductVariation other) {
        return 0;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.wordpress.android.fluxc.model.WCProductVariationModel toDataModel(@org.jetbrains.annotations.Nullable
    org.wordpress.android.fluxc.model.WCProductVariationModel cachedVariation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName(@org.jetbrains.annotations.Nullable
    com.woocommerce.android.model.Product parentProduct) {
        return null;
    }
    
    @java.lang.Override
    public int describeContents() {
        return 0;
    }
    
    /**
     * Formats the [Product] size (length, width, height) with the given [dimensionUnit]
     * if all the dimensions are available.
     * Eg: 12 x 15 x 13 in
     */
    @org.jetbrains.annotations.NotNull
    public java.lang.String getSizeWithUnits(@org.jetbrains.annotations.Nullable
    java.lang.String dimensionUnit) {
        return null;
    }
    
    /**
     * Formats the [Product] weight with the given [weightUnit]
     * for display purposes.
     * Eg: 12oz
     */
    @org.jetbrains.annotations.NotNull
    public java.lang.String getWeightWithUnits(@org.jetbrains.annotations.Nullable
    java.lang.String weightUnit) {
        return null;
    }
    
    @java.lang.Override
    public void writeToParcel(@org.jetbrains.annotations.NotNull
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.model.ProductVariation> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.woocommerce.android.model.ProductVariation createFromParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.woocommerce.android.model.ProductVariation[] newArray(int size) {
            return null;
        }
    }
}