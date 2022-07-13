package com.woocommerce.android.ui.orders.shippinglabels.creation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000e\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u000e\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u00a8\u0006\u001f"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelEvent;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "()V", "DialPhoneNumber", "EditSelectedAddress", "OpenMapWithAddress", "ShowAddressEditor", "ShowCountrySelector", "ShowCustomsForm", "ShowPackageDetails", "ShowPaymentDetails", "ShowPrintShippingLabels", "ShowShippingRates", "ShowStateSelector", "ShowSuggestedAddress", "ShowWooDiscountBottomSheet", "UseSelectedAddress", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelEvent$ShowAddressEditor;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelEvent$ShowSuggestedAddress;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelEvent$UseSelectedAddress;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelEvent$EditSelectedAddress;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelEvent$ShowCountrySelector;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelEvent$ShowStateSelector;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelEvent$OpenMapWithAddress;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelEvent$DialPhoneNumber;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelEvent$ShowPackageDetails;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelEvent$ShowCustomsForm;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelEvent$ShowShippingRates;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelEvent$ShowPaymentDetails;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelEvent$ShowPrintShippingLabels;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelEvent$ShowWooDiscountBottomSheet;", "WooCommerce_vanillaDebug"})
public abstract class CreateShippingLabelEvent extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
    
    private CreateShippingLabelEvent() {
        super(false);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\tH\u00c6\u0003J3\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001f"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelEvent$ShowAddressEditor;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelEvent;", "address", "Lcom/woocommerce/android/model/Address;", "type", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelAddressValidator$AddressType;", "validationResult", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelAddressValidator$ValidationResult;", "requiresPhoneNumber", "", "(Lcom/woocommerce/android/model/Address;Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelAddressValidator$AddressType;Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelAddressValidator$ValidationResult;Z)V", "getAddress", "()Lcom/woocommerce/android/model/Address;", "getRequiresPhoneNumber", "()Z", "getType", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelAddressValidator$AddressType;", "getValidationResult", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelAddressValidator$ValidationResult;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class ShowAddressEditor extends com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelEvent {
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.model.Address address = null;
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressValidator.AddressType type = null;
        @org.jetbrains.annotations.Nullable()
        private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressValidator.ValidationResult validationResult = null;
        private final boolean requiresPhoneNumber = false;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelEvent.ShowAddressEditor copy(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.Address address, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressValidator.AddressType type, @org.jetbrains.annotations.Nullable()
        com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressValidator.ValidationResult validationResult, boolean requiresPhoneNumber) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public ShowAddressEditor(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.Address address, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressValidator.AddressType type, @org.jetbrains.annotations.Nullable()
        com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressValidator.ValidationResult validationResult, boolean requiresPhoneNumber) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.Address component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.Address getAddress() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressValidator.AddressType component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressValidator.AddressType getType() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressValidator.ValidationResult component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressValidator.ValidationResult getValidationResult() {
            return null;
        }
        
        public final boolean component4() {
            return false;
        }
        
        public final boolean getRequiresPhoneNumber() {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0019"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelEvent$ShowSuggestedAddress;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelEvent;", "originalAddress", "Lcom/woocommerce/android/model/Address;", "suggestedAddress", "type", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelAddressValidator$AddressType;", "(Lcom/woocommerce/android/model/Address;Lcom/woocommerce/android/model/Address;Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelAddressValidator$AddressType;)V", "getOriginalAddress", "()Lcom/woocommerce/android/model/Address;", "getSuggestedAddress", "getType", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelAddressValidator$AddressType;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class ShowSuggestedAddress extends com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelEvent {
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.model.Address originalAddress = null;
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.model.Address suggestedAddress = null;
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressValidator.AddressType type = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelEvent.ShowSuggestedAddress copy(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.Address originalAddress, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.Address suggestedAddress, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressValidator.AddressType type) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public ShowSuggestedAddress(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.Address originalAddress, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.Address suggestedAddress, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressValidator.AddressType type) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.Address component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.Address getOriginalAddress() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.Address component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.Address getSuggestedAddress() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressValidator.AddressType component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressValidator.AddressType getType() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelEvent$UseSelectedAddress;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelEvent;", "address", "Lcom/woocommerce/android/model/Address;", "(Lcom/woocommerce/android/model/Address;)V", "getAddress", "()Lcom/woocommerce/android/model/Address;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class UseSelectedAddress extends com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelEvent {
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.model.Address address = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelEvent.UseSelectedAddress copy(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.Address address) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public UseSelectedAddress(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.Address address) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.Address component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.Address getAddress() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelEvent$EditSelectedAddress;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelEvent;", "address", "Lcom/woocommerce/android/model/Address;", "(Lcom/woocommerce/android/model/Address;)V", "getAddress", "()Lcom/woocommerce/android/model/Address;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class EditSelectedAddress extends com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelEvent {
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.model.Address address = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelEvent.EditSelectedAddress copy(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.Address address) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public EditSelectedAddress(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.Address address) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.Address component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.Address getAddress() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J%\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0006H\u00d6\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelEvent$ShowCountrySelector;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelEvent;", "locations", "", "Lcom/woocommerce/android/model/Location;", "currentCountryCode", "", "(Ljava/util/List;Ljava/lang/String;)V", "getCurrentCountryCode", "()Ljava/lang/String;", "getLocations", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_vanillaDebug"})
    public static final class ShowCountrySelector extends com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.woocommerce.android.model.Location> locations = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String currentCountryCode = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelEvent.ShowCountrySelector copy(@org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.model.Location> locations, @org.jetbrains.annotations.Nullable()
        java.lang.String currentCountryCode) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public ShowCountrySelector(@org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.model.Location> locations, @org.jetbrains.annotations.Nullable()
        java.lang.String currentCountryCode) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.model.Location> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.model.Location> getLocations() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCurrentCountryCode() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J%\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0006H\u00d6\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelEvent$ShowStateSelector;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelEvent;", "locations", "", "Lcom/woocommerce/android/model/Location;", "currentStateCode", "", "(Ljava/util/List;Ljava/lang/String;)V", "getCurrentStateCode", "()Ljava/lang/String;", "getLocations", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_vanillaDebug"})
    public static final class ShowStateSelector extends com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.woocommerce.android.model.Location> locations = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String currentStateCode = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelEvent.ShowStateSelector copy(@org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.model.Location> locations, @org.jetbrains.annotations.Nullable()
        java.lang.String currentStateCode) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public ShowStateSelector(@org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.model.Location> locations, @org.jetbrains.annotations.Nullable()
        java.lang.String currentStateCode) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.model.Location> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.model.Location> getLocations() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCurrentStateCode() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelEvent$OpenMapWithAddress;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelEvent;", "address", "Lcom/woocommerce/android/model/Address;", "(Lcom/woocommerce/android/model/Address;)V", "getAddress", "()Lcom/woocommerce/android/model/Address;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class OpenMapWithAddress extends com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelEvent {
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.model.Address address = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelEvent.OpenMapWithAddress copy(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.Address address) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public OpenMapWithAddress(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.Address address) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.Address component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.Address getAddress() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelEvent$DialPhoneNumber;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelEvent;", "phoneNumber", "", "(Ljava/lang/String;)V", "getPhoneNumber", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_vanillaDebug"})
    public static final class DialPhoneNumber extends com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String phoneNumber = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelEvent.DialPhoneNumber copy(@org.jetbrains.annotations.NotNull()
        java.lang.String phoneNumber) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public DialPhoneNumber(@org.jetbrains.annotations.NotNull()
        java.lang.String phoneNumber) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPhoneNumber() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelEvent$ShowPackageDetails;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelEvent;", "orderId", "", "shippingLabelPackages", "", "Lcom/woocommerce/android/model/ShippingLabelPackage;", "(JLjava/util/List;)V", "getOrderId", "()J", "getShippingLabelPackages", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class ShowPackageDetails extends com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelEvent {
        private final long orderId = 0L;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.woocommerce.android.model.ShippingLabelPackage> shippingLabelPackages = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelEvent.ShowPackageDetails copy(long orderId, @org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.model.ShippingLabelPackage> shippingLabelPackages) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public ShowPackageDetails(long orderId, @org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.model.ShippingLabelPackage> shippingLabelPackages) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getOrderId() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.model.ShippingLabelPackage> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.model.ShippingLabelPackage> getShippingLabelPackages() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H\u00c6\u0003J=\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f\u00a8\u0006\u001d"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelEvent$ShowCustomsForm;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelEvent;", "originCountryCode", "", "destinationCountryCode", "shippingPackages", "", "Lcom/woocommerce/android/model/ShippingLabelPackage;", "customsPackages", "Lcom/woocommerce/android/model/CustomsPackage;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getCustomsPackages", "()Ljava/util/List;", "getDestinationCountryCode", "()Ljava/lang/String;", "getOriginCountryCode", "getShippingPackages", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_vanillaDebug"})
    public static final class ShowCustomsForm extends com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String originCountryCode = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String destinationCountryCode = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.woocommerce.android.model.ShippingLabelPackage> shippingPackages = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.woocommerce.android.model.CustomsPackage> customsPackages = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelEvent.ShowCustomsForm copy(@org.jetbrains.annotations.NotNull()
        java.lang.String originCountryCode, @org.jetbrains.annotations.NotNull()
        java.lang.String destinationCountryCode, @org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.model.ShippingLabelPackage> shippingPackages, @org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.model.CustomsPackage> customsPackages) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public ShowCustomsForm(@org.jetbrains.annotations.NotNull()
        java.lang.String originCountryCode, @org.jetbrains.annotations.NotNull()
        java.lang.String destinationCountryCode, @org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.model.ShippingLabelPackage> shippingPackages, @org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.model.CustomsPackage> customsPackages) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getOriginCountryCode() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDestinationCountryCode() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.model.ShippingLabelPackage> component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.model.ShippingLabelPackage> getShippingPackages() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.model.CustomsPackage> component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.model.CustomsPackage> getCustomsPackages() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00c6\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bH\u00c6\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\bH\u00c6\u0003JY\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bH\u00c6\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u00d6\u0003J\t\u0010#\u001a\u00020$H\u00d6\u0001J\t\u0010%\u001a\u00020&H\u00d6\u0001R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010\u00a8\u0006\'"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelEvent$ShowShippingRates;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelEvent;", "order", "Lcom/woocommerce/android/model/Order;", "originAddress", "Lcom/woocommerce/android/model/Address;", "destinationAddress", "shippingLabelPackages", "", "Lcom/woocommerce/android/model/ShippingLabelPackage;", "customsPackages", "Lcom/woocommerce/android/model/CustomsPackage;", "selectedRates", "Lcom/woocommerce/android/model/ShippingRate;", "(Lcom/woocommerce/android/model/Order;Lcom/woocommerce/android/model/Address;Lcom/woocommerce/android/model/Address;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getCustomsPackages", "()Ljava/util/List;", "getDestinationAddress", "()Lcom/woocommerce/android/model/Address;", "getOrder", "()Lcom/woocommerce/android/model/Order;", "getOriginAddress", "getSelectedRates", "getShippingLabelPackages", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class ShowShippingRates extends com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelEvent {
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.model.Order order = null;
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.model.Address originAddress = null;
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.model.Address destinationAddress = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.woocommerce.android.model.ShippingLabelPackage> shippingLabelPackages = null;
        @org.jetbrains.annotations.Nullable()
        private final java.util.List<com.woocommerce.android.model.CustomsPackage> customsPackages = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.woocommerce.android.model.ShippingRate> selectedRates = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelEvent.ShowShippingRates copy(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.Order order, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.Address originAddress, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.Address destinationAddress, @org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.model.ShippingLabelPackage> shippingLabelPackages, @org.jetbrains.annotations.Nullable()
        java.util.List<com.woocommerce.android.model.CustomsPackage> customsPackages, @org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.model.ShippingRate> selectedRates) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public ShowShippingRates(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.Order order, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.Address originAddress, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.Address destinationAddress, @org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.model.ShippingLabelPackage> shippingLabelPackages, @org.jetbrains.annotations.Nullable()
        java.util.List<com.woocommerce.android.model.CustomsPackage> customsPackages, @org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.model.ShippingRate> selectedRates) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.Order component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.Order getOrder() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.Address component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.Address getOriginAddress() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.Address component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.Address getDestinationAddress() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.model.ShippingLabelPackage> component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.model.ShippingLabelPackage> getShippingLabelPackages() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.woocommerce.android.model.CustomsPackage> component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.woocommerce.android.model.CustomsPackage> getCustomsPackages() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.model.ShippingRate> component6() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.model.ShippingRate> getSelectedRates() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelEvent$ShowPaymentDetails;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelEvent;", "()V", "WooCommerce_vanillaDebug"})
    public static final class ShowPaymentDetails extends com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelEvent.ShowPaymentDetails INSTANCE = null;
        
        private ShowPaymentDetails() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelEvent$ShowPrintShippingLabels;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelEvent;", "orderId", "", "labels", "", "Lcom/woocommerce/android/model/ShippingLabel;", "(JLjava/util/List;)V", "getLabels", "()Ljava/util/List;", "getOrderId", "()J", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class ShowPrintShippingLabels extends com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelEvent {
        private final long orderId = 0L;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.woocommerce.android.model.ShippingLabel> labels = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelEvent.ShowPrintShippingLabels copy(long orderId, @org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.model.ShippingLabel> labels) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public ShowPrintShippingLabels(long orderId, @org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.model.ShippingLabel> labels) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getOrderId() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.model.ShippingLabel> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.model.ShippingLabel> getLabels() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelEvent$ShowWooDiscountBottomSheet;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelEvent;", "()V", "WooCommerce_vanillaDebug"})
    public static final class ShowWooDiscountBottomSheet extends com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelEvent.ShowWooDiscountBottomSheet INSTANCE = null;
        
        private ShowWooDiscountBottomSheet() {
            super();
        }
    }
}