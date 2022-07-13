package com.woocommerce.android.ui.orders.details.editing.address;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\'\u0018\u0000 62\u00020\u0001:\u00016B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u001fH\u0016J\b\u0010#\u001a\u00020\u001fH\u0016J\u0010\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010\'\u001a\u00020\u001fH\u0016J\u0010\u0010(\u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\u0004H&J\u001a\u0010)\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u0010.\u001a\u00020\u001fH\u0002J\b\u0010/\u001a\u00020\u001fH\u0002J\u0016\u00100\u001a\u00020\u001f2\f\u00101\u001a\b\u0012\u0004\u0012\u00020302H\u0002J\u0016\u00104\u001a\u00020\u001f2\f\u00105\u001a\b\u0012\u0004\u0012\u00020302H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00020\nX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0012\u0010\u001c\u001a\u00020\u0006X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\b\u00a8\u00067"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/editing/address/BaseAddressEditingFragment;", "Lcom/woocommerce/android/ui/orders/details/editing/BaseOrderEditingFragment;", "()V", "_binding", "Lcom/woocommerce/android/databinding/FragmentBaseEditAddressBinding;", "addressDraft", "Lcom/woocommerce/android/model/Address;", "getAddressDraft", "()Lcom/woocommerce/android/model/Address;", "addressType", "Lcom/woocommerce/android/ui/orders/details/editing/address/AddressViewModel$AddressType;", "getAddressType", "()Lcom/woocommerce/android/ui/orders/details/editing/address/AddressViewModel$AddressType;", "addressViewModel", "Lcom/woocommerce/android/ui/orders/details/editing/address/AddressViewModel;", "getAddressViewModel", "()Lcom/woocommerce/android/ui/orders/details/editing/address/AddressViewModel;", "addressViewModel$delegate", "Lkotlin/Lazy;", "binding", "getBinding", "()Lcom/woocommerce/android/databinding/FragmentBaseEditAddressBinding;", "replicateAddressSwitch", "Lcom/google/android/material/switchmaterial/SwitchMaterial;", "getReplicateAddressSwitch", "()Lcom/google/android/material/switchmaterial/SwitchMaterial;", "setReplicateAddressSwitch", "(Lcom/google/android/material/switchmaterial/SwitchMaterial;)V", "storedAddress", "getStoredAddress", "bindTextWatchers", "", "hasChanges", "", "onDestroyView", "onDetach", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onStop", "onViewBound", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setupObservers", "setupResultHandlers", "showCountrySearchScreen", "countries", "", "Lcom/woocommerce/android/model/Location;", "showStateSearchScreen", "states", "Companion", "WooCommerce_wasabiDebug"})
@dagger.hilt.android.AndroidEntryPoint
public abstract class BaseAddressEditingFragment extends com.woocommerce.android.ui.orders.details.editing.BaseOrderEditingFragment {
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.orders.details.editing.address.BaseAddressEditingFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TAG = "BaseEditAddressFragment";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SELECT_COUNTRY_REQUEST = "select_country_request";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SELECT_STATE_REQUEST = "select_state_request";
    private final kotlin.Lazy addressViewModel$delegate = null;
    private com.woocommerce.android.databinding.FragmentBaseEditAddressBinding _binding;
    protected com.google.android.material.switchmaterial.SwitchMaterial replicateAddressSwitch;
    
    public BaseAddressEditingFragment() {
        super();
    }
    
    private final com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel getAddressViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.woocommerce.android.model.Address getStoredAddress();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.AddressType getAddressType();
    
    public abstract void onViewBound(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.databinding.FragmentBaseEditAddressBinding binding);
    
    private final com.woocommerce.android.databinding.FragmentBaseEditAddressBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected final com.google.android.material.switchmaterial.SwitchMaterial getReplicateAddressSwitch() {
        return null;
    }
    
    protected final void setReplicateAddressSwitch(@org.jetbrains.annotations.NotNull
    com.google.android.material.switchmaterial.SwitchMaterial p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.model.Address getAddressDraft() {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public boolean hasChanges() {
        return false;
    }
    
    @java.lang.Override
    public void onStop() {
    }
    
    @java.lang.Override
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override
    public void onDetach() {
    }
    
    private final void bindTextWatchers() {
    }
    
    private final void showCountrySearchScreen(java.util.List<com.woocommerce.android.model.Location> countries) {
    }
    
    private final void showStateSearchScreen(java.util.List<com.woocommerce.android.model.Location> states) {
    }
    
    private final void setupObservers() {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    private final void setupResultHandlers() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/editing/address/BaseAddressEditingFragment$Companion;", "", "()V", "SELECT_COUNTRY_REQUEST", "", "SELECT_STATE_REQUEST", "TAG", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}