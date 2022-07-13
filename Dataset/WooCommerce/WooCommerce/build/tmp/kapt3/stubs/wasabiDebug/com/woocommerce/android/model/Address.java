package com.woocommerce.android.model;

import java.lang.System;

@kotlinx.parcelize.Parcelize
@kotlin.Suppress(names = {"TooManyFunctions"})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 I2\u00020\u0001:\u0001IB]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\bH\u00c6\u0003J\t\u0010&\u001a\u00020\nH\u00c6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003Jw\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0003H\u00c6\u0001J\t\u0010+\u001a\u00020,H\u00d6\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100H\u00d6\u0003J\b\u00101\u001a\u000202H\u0002J\u0006\u00103\u001a\u00020\u0003J\u001e\u00104\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u00032\u0006\u00106\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003J\u0006\u00107\u001a\u00020.J\t\u00108\u001a\u00020,H\u00d6\u0001J\u000e\u00109\u001a\u00020.2\u0006\u0010:\u001a\u00020\u0000J\b\u0010;\u001a\u00020\u0003H\u0002J\u0012\u0010<\u001a\u00020=2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u0003J\u0006\u0010?\u001a\u00020@J\u0006\u0010A\u001a\u00020BJ\b\u0010C\u001a\u00020\u0003H\u0016J\u0019\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020,H\u00d6\u0001R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e\u00a8\u0006J"}, d2 = {"Lcom/woocommerce/android/model/Address;", "Landroid/os/Parcelable;", "company", "", "firstName", "lastName", "phone", "country", "Lcom/woocommerce/android/model/Location;", "state", "Lcom/woocommerce/android/model/AmbiguousLocation;", "address1", "address2", "city", "postcode", "email", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/woocommerce/android/model/Location;Lcom/woocommerce/android/model/AmbiguousLocation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddress1", "()Ljava/lang/String;", "getAddress2", "getCity", "getCompany", "getCountry", "()Lcom/woocommerce/android/model/Location;", "getEmail", "getFirstName", "getLastName", "getPhone", "getPostcode", "getState", "()Lcom/woocommerce/android/model/AmbiguousLocation;", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "getAddressData", "Lcom/google/i18n/addressinput/common/AddressData;", "getEnvelopeAddress", "getFullAddress", "name", "address", "hasInfo", "hashCode", "isSamePhysicalAddress", "otherAddress", "orderAddressToString", "toBillingAddressModel", "Lorg/wordpress/android/fluxc/model/order/OrderAddress$Billing;", "customEmail", "toShippingAddressModel", "Lorg/wordpress/android/fluxc/model/order/OrderAddress$Shipping;", "toShippingLabelModel", "Lorg/wordpress/android/fluxc/model/shippinglabels/WCShippingLabelModel$ShippingLabelAddress;", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "WooCommerce_wasabiDebug"})
public final class Address implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String company = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String firstName = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String lastName = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String phone = null;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.model.Location country = null;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.model.AmbiguousLocation state = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String address1 = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String address2 = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String city = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String postcode = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String email = null;
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.model.Address.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    private static final kotlin.Lazy EMPTY$delegate = null;
    public static final android.os.Parcelable.Creator<com.woocommerce.android.model.Address> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.model.Address copy(@org.jetbrains.annotations.NotNull
    java.lang.String company, @org.jetbrains.annotations.NotNull
    java.lang.String firstName, @org.jetbrains.annotations.NotNull
    java.lang.String lastName, @org.jetbrains.annotations.NotNull
    java.lang.String phone, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.Location country, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.AmbiguousLocation state, @org.jetbrains.annotations.NotNull
    java.lang.String address1, @org.jetbrains.annotations.NotNull
    java.lang.String address2, @org.jetbrains.annotations.NotNull
    java.lang.String city, @org.jetbrains.annotations.NotNull
    java.lang.String postcode, @org.jetbrains.annotations.NotNull
    java.lang.String email) {
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
    
    public Address(@org.jetbrains.annotations.NotNull
    java.lang.String company, @org.jetbrains.annotations.NotNull
    java.lang.String firstName, @org.jetbrains.annotations.NotNull
    java.lang.String lastName, @org.jetbrains.annotations.NotNull
    java.lang.String phone, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.Location country, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.AmbiguousLocation state, @org.jetbrains.annotations.NotNull
    java.lang.String address1, @org.jetbrains.annotations.NotNull
    java.lang.String address2, @org.jetbrains.annotations.NotNull
    java.lang.String city, @org.jetbrains.annotations.NotNull
    java.lang.String postcode, @org.jetbrains.annotations.NotNull
    java.lang.String email) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCompany() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFirstName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLastName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPhone() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.model.Location component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.model.Location getCountry() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.model.AmbiguousLocation component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.model.AmbiguousLocation getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAddress1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAddress2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPostcode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEmail() {
        return null;
    }
    
    private final java.lang.String orderAddressToString() {
        return null;
    }
    
    private final com.google.i18n.addressinput.common.AddressData getAddressData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEnvelopeAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFullAddress(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String address, @org.jetbrains.annotations.NotNull
    java.lang.String country) {
        return null;
    }
    
    public final boolean hasInfo() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.wordpress.android.fluxc.model.shippinglabels.WCShippingLabelModel.ShippingLabelAddress toShippingLabelModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.wordpress.android.fluxc.model.order.OrderAddress.Shipping toShippingAddressModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.wordpress.android.fluxc.model.order.OrderAddress.Billing toBillingAddressModel(@org.jetbrains.annotations.Nullable
    java.lang.String customEmail) {
        return null;
    }
    
    /**
     * Compares this address's physical location to the other one
     */
    public final boolean isSamePhysicalAddress(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.Address otherAddress) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.model.Address> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.woocommerce.android.model.Address createFromParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.woocommerce.android.model.Address[] newArray(int size) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/woocommerce/android/model/Address$Companion;", "", "()V", "EMPTY", "Lcom/woocommerce/android/model/Address;", "getEMPTY", "()Lcom/woocommerce/android/model/Address;", "EMPTY$delegate", "Lkotlin/Lazy;", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.model.Address getEMPTY() {
            return null;
        }
    }
}