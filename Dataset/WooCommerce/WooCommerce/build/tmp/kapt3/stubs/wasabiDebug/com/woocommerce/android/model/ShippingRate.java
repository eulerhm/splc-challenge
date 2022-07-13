package com.woocommerce.android.model;

import java.lang.System;

@kotlinx.parcelize.Parcelize
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001<Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\fH\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0011H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\nH\u00c6\u0003J\t\u0010-\u001a\u00020\fH\u00c6\u0003J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\u0081\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u00c6\u0001J\t\u00100\u001a\u00020\nH\u00d6\u0001J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104H\u00d6\u0003J\t\u00105\u001a\u00020\nH\u00d6\u0001J\t\u00106\u001a\u00020\u0003H\u00d6\u0001J\u0019\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\nH\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0014\u00a8\u0006="}, d2 = {"Lcom/woocommerce/android/model/ShippingRate;", "Landroid/os/Parcelable;", "packageId", "", "shipmentId", "rateId", "serviceId", "carrierId", "serviceName", "deliveryDays", "", "price", "Ljava/math/BigDecimal;", "formattedPrice", "discount", "formattedFee", "option", "Lcom/woocommerce/android/model/ShippingRate$Option;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Lcom/woocommerce/android/model/ShippingRate$Option;)V", "getCarrierId", "()Ljava/lang/String;", "getDeliveryDays", "()I", "getDiscount", "()Ljava/math/BigDecimal;", "getFormattedFee", "getFormattedPrice", "getOption", "()Lcom/woocommerce/android/model/ShippingRate$Option;", "getPackageId", "getPrice", "getRateId", "getServiceId", "getServiceName", "getShipmentId", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Option", "WooCommerce_wasabiDebug"})
public final class ShippingRate implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String packageId = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String shipmentId = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String rateId = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String serviceId = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String carrierId = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String serviceName = null;
    private final int deliveryDays = 0;
    @org.jetbrains.annotations.NotNull
    private final java.math.BigDecimal price = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String formattedPrice = null;
    @org.jetbrains.annotations.NotNull
    private final java.math.BigDecimal discount = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String formattedFee = null;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.model.ShippingRate.Option option = null;
    public static final android.os.Parcelable.Creator<com.woocommerce.android.model.ShippingRate> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.model.ShippingRate copy(@org.jetbrains.annotations.NotNull
    java.lang.String packageId, @org.jetbrains.annotations.NotNull
    java.lang.String shipmentId, @org.jetbrains.annotations.NotNull
    java.lang.String rateId, @org.jetbrains.annotations.NotNull
    java.lang.String serviceId, @org.jetbrains.annotations.NotNull
    java.lang.String carrierId, @org.jetbrains.annotations.NotNull
    java.lang.String serviceName, int deliveryDays, @org.jetbrains.annotations.NotNull
    java.math.BigDecimal price, @org.jetbrains.annotations.NotNull
    java.lang.String formattedPrice, @org.jetbrains.annotations.NotNull
    java.math.BigDecimal discount, @org.jetbrains.annotations.NotNull
    java.lang.String formattedFee, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.ShippingRate.Option option) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public ShippingRate(@org.jetbrains.annotations.NotNull
    java.lang.String packageId, @org.jetbrains.annotations.NotNull
    java.lang.String shipmentId, @org.jetbrains.annotations.NotNull
    java.lang.String rateId, @org.jetbrains.annotations.NotNull
    java.lang.String serviceId, @org.jetbrains.annotations.NotNull
    java.lang.String carrierId, @org.jetbrains.annotations.NotNull
    java.lang.String serviceName, int deliveryDays, @org.jetbrains.annotations.NotNull
    java.math.BigDecimal price, @org.jetbrains.annotations.NotNull
    java.lang.String formattedPrice, @org.jetbrains.annotations.NotNull
    java.math.BigDecimal discount, @org.jetbrains.annotations.NotNull
    java.lang.String formattedFee, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.ShippingRate.Option option) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPackageId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getShipmentId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRateId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getServiceId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCarrierId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getServiceName() {
        return null;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getDeliveryDays() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.math.BigDecimal component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.math.BigDecimal getPrice() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFormattedPrice() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.math.BigDecimal component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.math.BigDecimal getDiscount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFormattedFee() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.model.ShippingRate.Option component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.model.ShippingRate.Option getOption() {
        return null;
    }
    
    @java.lang.Override
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override
    public void writeToParcel(@org.jetbrains.annotations.NotNull
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.model.ShippingRate> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.woocommerce.android.model.ShippingRate createFromParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.woocommerce.android.model.ShippingRate[] newArray(int size) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/woocommerce/android/model/ShippingRate$Option;", "", "(Ljava/lang/String;I)V", "DEFAULT", "SIGNATURE", "ADULT_SIGNATURE", "WooCommerce_wasabiDebug"})
    public static enum Option {
        /*public static final*/ DEFAULT /* = new DEFAULT() */,
        /*public static final*/ SIGNATURE /* = new SIGNATURE() */,
        /*public static final*/ ADULT_SIGNATURE /* = new ADULT_SIGNATURE() */;
        
        Option() {
        }
    }
}