package com.woocommerce.android.ui.orders.shippinglabels.creation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 12\u00020\u0001:\u00011BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0018J\t\u0010 \u001a\u00020\tH\u00c6\u0003J\u0016\u0010!\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ^\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00062\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006H\u00c6\u0001\u00a2\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(H\u00d6\u0003J\t\u0010)\u001a\u00020*H\u00d6\u0001J\u0006\u0010+\u001a\u00020,J\u0006\u0010-\u001a\u00020.J\t\u0010/\u001a\u000200H\u00d6\u0001R\u001b\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0019\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001b\u00a8\u00062"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCarrierRatesFragmentArgs;", "Landroidx/navigation/NavArgs;", "originAddress", "Lcom/woocommerce/android/model/Address;", "destinationAddress", "packages", "", "Lcom/woocommerce/android/model/ShippingLabelPackage;", "order", "Lcom/woocommerce/android/model/Order;", "customsPackages", "Lcom/woocommerce/android/model/CustomsPackage;", "selectedRates", "Lcom/woocommerce/android/model/ShippingRate;", "(Lcom/woocommerce/android/model/Address;Lcom/woocommerce/android/model/Address;[Lcom/woocommerce/android/model/ShippingLabelPackage;Lcom/woocommerce/android/model/Order;[Lcom/woocommerce/android/model/CustomsPackage;[Lcom/woocommerce/android/model/ShippingRate;)V", "getCustomsPackages", "()[Lcom/woocommerce/android/model/CustomsPackage;", "[Lcom/woocommerce/android/model/CustomsPackage;", "getDestinationAddress", "()Lcom/woocommerce/android/model/Address;", "getOrder", "()Lcom/woocommerce/android/model/Order;", "getOriginAddress", "getPackages", "()[Lcom/woocommerce/android/model/ShippingLabelPackage;", "[Lcom/woocommerce/android/model/ShippingLabelPackage;", "getSelectedRates", "()[Lcom/woocommerce/android/model/ShippingRate;", "[Lcom/woocommerce/android/model/ShippingRate;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lcom/woocommerce/android/model/Address;Lcom/woocommerce/android/model/Address;[Lcom/woocommerce/android/model/ShippingLabelPackage;Lcom/woocommerce/android/model/Order;[Lcom/woocommerce/android/model/CustomsPackage;[Lcom/woocommerce/android/model/ShippingRate;)Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCarrierRatesFragmentArgs;", "equals", "", "other", "", "hashCode", "", "toBundle", "Landroid/os/Bundle;", "toSavedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "toString", "", "Companion", "WooCommerce_wasabiDebug"})
public final class ShippingCarrierRatesFragmentArgs implements androidx.navigation.NavArgs {
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.model.Address originAddress = null;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.model.Address destinationAddress = null;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.model.ShippingLabelPackage[] packages = null;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.model.Order order = null;
    @org.jetbrains.annotations.Nullable
    private final com.woocommerce.android.model.CustomsPackage[] customsPackages = null;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.model.ShippingRate[] selectedRates = null;
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCarrierRatesFragmentArgs.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCarrierRatesFragmentArgs copy(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.Address originAddress, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.Address destinationAddress, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.ShippingLabelPackage[] packages, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.Order order, @org.jetbrains.annotations.Nullable
    com.woocommerce.android.model.CustomsPackage[] customsPackages, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.ShippingRate[] selectedRates) {
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
    
    public ShippingCarrierRatesFragmentArgs(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.Address originAddress, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.Address destinationAddress, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.ShippingLabelPackage[] packages, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.Order order, @org.jetbrains.annotations.Nullable
    com.woocommerce.android.model.CustomsPackage[] customsPackages, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.ShippingRate[] selectedRates) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.model.Address component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.model.Address getOriginAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.model.Address component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.model.Address getDestinationAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.model.ShippingLabelPackage[] component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.model.ShippingLabelPackage[] getPackages() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.model.Order component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.model.Order getOrder() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.woocommerce.android.model.CustomsPackage[] component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.woocommerce.android.model.CustomsPackage[] getCustomsPackages() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.model.ShippingRate[] component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.model.ShippingRate[] getSelectedRates() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.Suppress(names = {"CAST_NEVER_SUCCEEDS"})
    public final android.os.Bundle toBundle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.Suppress(names = {"CAST_NEVER_SUCCEEDS"})
    public final androidx.lifecycle.SavedStateHandle toSavedStateHandle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    @kotlin.jvm.JvmStatic
    public static final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCarrierRatesFragmentArgs fromBundle(@org.jetbrains.annotations.NotNull
    android.os.Bundle bundle) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.JvmStatic
    public static final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCarrierRatesFragmentArgs fromSavedStateHandle(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007\u00a8\u0006\n"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCarrierRatesFragmentArgs$Companion;", "", "()V", "fromBundle", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCarrierRatesFragmentArgs;", "bundle", "Landroid/os/Bundle;", "fromSavedStateHandle", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @kotlin.Suppress(names = {"UNCHECKED_CAST"})
        @kotlin.jvm.JvmStatic
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCarrierRatesFragmentArgs fromBundle(@org.jetbrains.annotations.NotNull
        android.os.Bundle bundle) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @kotlin.jvm.JvmStatic
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCarrierRatesFragmentArgs fromSavedStateHandle(@org.jetbrains.annotations.NotNull
        androidx.lifecycle.SavedStateHandle savedStateHandle) {
            return null;
        }
    }
}