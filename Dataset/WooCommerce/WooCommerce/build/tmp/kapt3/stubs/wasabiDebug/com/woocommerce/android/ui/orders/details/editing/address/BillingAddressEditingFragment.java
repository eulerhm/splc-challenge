package com.woocommerce.android.ui.orders.details.editing.address;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001a"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/editing/address/BillingAddressEditingFragment;", "Lcom/woocommerce/android/ui/orders/details/editing/address/BaseAddressEditingFragment;", "()V", "activityAppBarStatus", "Lcom/woocommerce/android/ui/main/AppBarStatus;", "getActivityAppBarStatus", "()Lcom/woocommerce/android/ui/main/AppBarStatus;", "addressType", "Lcom/woocommerce/android/ui/orders/details/editing/address/AddressViewModel$AddressType;", "getAddressType", "()Lcom/woocommerce/android/ui/orders/details/editing/address/AddressViewModel$AddressType;", "analyticsValue", "", "getAnalyticsValue", "()Ljava/lang/String;", "storedAddress", "Lcom/woocommerce/android/model/Address;", "getStoredAddress", "()Lcom/woocommerce/android/model/Address;", "getFragmentTitle", "onViewBound", "", "binding", "Lcom/woocommerce/android/databinding/FragmentBaseEditAddressBinding;", "saveChanges", "", "WooCommerce_wasabiDebug"})
public final class BillingAddressEditingFragment extends com.woocommerce.android.ui.orders.details.editing.address.BaseAddressEditingFragment {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String analyticsValue = "billing_address";
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.AddressType addressType = com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.AddressType.BILLING;
    
    public BillingAddressEditingFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getAnalyticsValue() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.woocommerce.android.ui.main.AppBarStatus getActivityAppBarStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.woocommerce.android.model.Address getStoredAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.AddressType getAddressType() {
        return null;
    }
    
    @java.lang.Override
    public boolean saveChanges() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getFragmentTitle() {
        return null;
    }
    
    @java.lang.Override
    public void onViewBound(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.databinding.FragmentBaseEditAddressBinding binding) {
    }
}