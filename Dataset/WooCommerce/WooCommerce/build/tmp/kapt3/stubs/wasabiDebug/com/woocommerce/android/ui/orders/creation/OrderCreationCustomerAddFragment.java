package com.woocommerce.android.ui.orders.creation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 B2\u00020\u0001:\u0001BB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020 H\u0002J\b\u0010$\u001a\u00020 H\u0002J\u0018\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020 H\u0016J\u0010\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\fH\u0016J\u001a\u0010.\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u0010\u00101\u001a\u00020 2\u0006\u00102\u001a\u000203H\u0002J\u0010\u00104\u001a\u00020 2\u0006\u00102\u001a\u000203H\u0002J\b\u00105\u001a\u00020 H\u0002J\u001e\u00106\u001a\u00020 2\u0006\u00102\u001a\u0002032\f\u00107\u001a\b\u0012\u0004\u0012\u00020908H\u0002J\u001e\u0010:\u001a\u00020 2\u0006\u00102\u001a\u0002032\f\u0010;\u001a\b\u0012\u0004\u0012\u00020908H\u0002J\u0010\u0010<\u001a\u00020 2\u0006\u0010=\u001a\u00020,H\u0002J\u001c\u0010>\u001a\u00020 *\u00020\n2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020@H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\b\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006C"}, d2 = {"Lcom/woocommerce/android/ui/orders/creation/OrderCreationCustomerAddFragment;", "Lcom/woocommerce/android/ui/base/BaseFragment;", "()V", "addressViewModel", "Lcom/woocommerce/android/ui/orders/details/editing/address/AddressViewModel;", "getAddressViewModel", "()Lcom/woocommerce/android/ui/orders/details/editing/address/AddressViewModel;", "addressViewModel$delegate", "Lkotlin/Lazy;", "billingBinding", "Lcom/woocommerce/android/databinding/LayoutAddressFormBinding;", "doneMenuItem", "Landroid/view/MenuItem;", "fragmentViewBinding", "Lcom/woocommerce/android/databinding/FragmentCreationEditCustomerAddressBinding;", "sharedViewModel", "Lcom/woocommerce/android/ui/orders/creation/OrderCreationViewModel;", "getSharedViewModel", "()Lcom/woocommerce/android/ui/orders/creation/OrderCreationViewModel;", "sharedViewModel$delegate", "shippingBinding", "showShippingAddressFormSwitch", "Lcom/woocommerce/android/databinding/LayoutAddressSwitchBinding;", "uiMessageResolver", "Lcom/woocommerce/android/ui/base/UIMessageResolver;", "getUiMessageResolver", "()Lcom/woocommerce/android/ui/base/UIMessageResolver;", "setUiMessageResolver", "(Lcom/woocommerce/android/ui/base/UIMessageResolver;)V", "getFragmentTitle", "", "inflateLayout", "", "view", "Landroid/view/View;", "observeEvents", "observeViewState", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onDestroyView", "onOptionsItemSelected", "", "item", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "setupHandlingCountrySelection", "addressType", "Lcom/woocommerce/android/ui/orders/details/editing/address/AddressViewModel$AddressType;", "setupHandlingStateSelection", "setupLocationHandling", "showCountrySearchScreen", "countries", "", "Lcom/woocommerce/android/model/Location;", "showStateSearchScreen", "states", "updateShippingBindingVisibility", "checked", "setAccessibilityHeaders", "detailsHeading", "", "addressHeading", "Companion", "WooCommerce_wasabiDebug"})
@dagger.hilt.android.AndroidEntryPoint
public final class OrderCreationCustomerAddFragment extends com.woocommerce.android.ui.base.BaseFragment {
    @org.jetbrains.annotations.NotNull
    private static final com.woocommerce.android.ui.orders.creation.OrderCreationCustomerAddFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    @java.lang.Deprecated
    public static final java.lang.String SELECT_BILLING_COUNTRY_REQUEST = "select_billing_country_request";
    @org.jetbrains.annotations.NotNull
    @java.lang.Deprecated
    public static final java.lang.String SELECT_BILLING_STATE_REQUEST = "select_billing_state_request";
    @org.jetbrains.annotations.NotNull
    @java.lang.Deprecated
    public static final java.lang.String SELECT_SHIPPING_COUNTRY_REQUEST = "select_shipping_country_request";
    @org.jetbrains.annotations.NotNull
    @java.lang.Deprecated
    public static final java.lang.String SELECT_SHIPPING_STATE_REQUEST = "select_shipping_state_request";
    private final kotlin.Lazy addressViewModel$delegate = null;
    private final kotlin.Lazy sharedViewModel$delegate = null;
    private com.woocommerce.android.databinding.FragmentCreationEditCustomerAddressBinding fragmentViewBinding;
    private com.woocommerce.android.databinding.LayoutAddressFormBinding shippingBinding;
    private com.woocommerce.android.databinding.LayoutAddressFormBinding billingBinding;
    private com.woocommerce.android.databinding.LayoutAddressSwitchBinding showShippingAddressFormSwitch;
    private android.view.MenuItem doneMenuItem;
    @javax.inject.Inject
    public com.woocommerce.android.ui.base.UIMessageResolver uiMessageResolver;
    
    public OrderCreationCustomerAddFragment() {
        super();
    }
    
    private final com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel getAddressViewModel() {
        return null;
    }
    
    private final com.woocommerce.android.ui.orders.creation.OrderCreationViewModel getSharedViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.ui.base.UIMessageResolver getUiMessageResolver() {
        return null;
    }
    
    public final void setUiMessageResolver(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.base.UIMessageResolver p0) {
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupLocationHandling() {
    }
    
    private final void observeViewState() {
    }
    
    private final void observeEvents() {
    }
    
    private final void inflateLayout(android.view.View view) {
    }
    
    private final void setAccessibilityHeaders(com.woocommerce.android.databinding.LayoutAddressFormBinding $this$setAccessibilityHeaders, int detailsHeading, int addressHeading) {
    }
    
    private final void setupHandlingCountrySelection(com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.AddressType addressType) {
    }
    
    private final void setupHandlingStateSelection(com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.AddressType addressType) {
    }
    
    private final void updateShippingBindingVisibility(boolean checked) {
    }
    
    private final void showCountrySearchScreen(com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.AddressType addressType, java.util.List<com.woocommerce.android.model.Location> countries) {
    }
    
    private final void showStateSearchScreen(com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.AddressType addressType, java.util.List<com.woocommerce.android.model.Location> states) {
    }
    
    @java.lang.Override
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull
    android.view.Menu menu, @org.jetbrains.annotations.NotNull
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull
    android.view.MenuItem item) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getFragmentTitle() {
        return null;
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/woocommerce/android/ui/orders/creation/OrderCreationCustomerAddFragment$Companion;", "", "()V", "SELECT_BILLING_COUNTRY_REQUEST", "", "SELECT_BILLING_STATE_REQUEST", "SELECT_SHIPPING_COUNTRY_REQUEST", "SELECT_SHIPPING_STATE_REQUEST", "WooCommerce_wasabiDebug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}