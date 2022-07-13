package com.woocommerce.android.ui.orders.tracking;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 K2\u00020\u00012\u00020\u0002:\u0001KB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010*\u001a\u00020+H\u0016J\u0010\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0002J\u0010\u00100\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0002J\u0012\u00101\u001a\u00020-2\b\u00102\u001a\u0004\u0018\u000103H\u0016J\u0018\u00104\u001a\u00020-2\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000208H\u0016J&\u00109\u001a\u0004\u0018\u00010:2\u0006\u00107\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010=2\b\u00102\u001a\u0004\u0018\u000103H\u0016J\u0010\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020AH\u0016J\b\u0010B\u001a\u00020?H\u0016J\b\u0010C\u001a\u00020-H\u0016J\b\u0010D\u001a\u00020-H\u0016J\u001a\u0010E\u001a\u00020-2\u0006\u0010F\u001a\u00020:2\b\u00102\u001a\u0004\u0018\u000103H\u0016J\u0010\u0010G\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0002J\u0010\u0010H\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0002J\u0010\u0010I\u001a\u00020-2\u0006\u0010J\u001a\u00020?H\u0002R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b&\u0010\'\u00a8\u0006L"}, d2 = {"Lcom/woocommerce/android/ui/orders/tracking/AddOrderShipmentTrackingFragment;", "Lcom/woocommerce/android/ui/base/BaseFragment;", "Lcom/woocommerce/android/ui/main/MainActivity$Companion$BackPressListener;", "()V", "activityAppBarStatus", "Lcom/woocommerce/android/ui/main/AppBarStatus;", "getActivityAppBarStatus", "()Lcom/woocommerce/android/ui/main/AppBarStatus;", "dateShippedPickerDialog", "Landroid/app/DatePickerDialog;", "dateUtils", "Lcom/woocommerce/android/util/DateUtils;", "getDateUtils", "()Lcom/woocommerce/android/util/DateUtils;", "setDateUtils", "(Lcom/woocommerce/android/util/DateUtils;)V", "navigator", "Lcom/woocommerce/android/ui/orders/OrderNavigator;", "getNavigator", "()Lcom/woocommerce/android/ui/orders/OrderNavigator;", "setNavigator", "(Lcom/woocommerce/android/ui/orders/OrderNavigator;)V", "networkStatus", "Lcom/woocommerce/android/tools/NetworkStatus;", "getNetworkStatus", "()Lcom/woocommerce/android/tools/NetworkStatus;", "setNetworkStatus", "(Lcom/woocommerce/android/tools/NetworkStatus;)V", "progressDialog", "Lcom/woocommerce/android/widgets/CustomProgressDialog;", "uiMessageResolver", "Lcom/woocommerce/android/ui/base/UIMessageResolver;", "getUiMessageResolver", "()Lcom/woocommerce/android/ui/base/UIMessageResolver;", "setUiMessageResolver", "(Lcom/woocommerce/android/ui/base/UIMessageResolver;)V", "viewModel", "Lcom/woocommerce/android/ui/orders/tracking/AddOrderShipmentTrackingViewModel;", "getViewModel", "()Lcom/woocommerce/android/ui/orders/tracking/AddOrderShipmentTrackingViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getFragmentTitle", "", "hideCustomProviderFields", "", "binding", "Lcom/woocommerce/android/databinding/FragmentAddShipmentTrackingBinding;", "initUi", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onRequestAllowBackPress", "onResume", "onStop", "onViewCreated", "view", "setupObservers", "showCustomProviderFields", "showProgressDialog", "show", "Companion", "WooCommerce_wasabiDebug"})
@dagger.hilt.android.AndroidEntryPoint
public final class AddOrderShipmentTrackingFragment extends com.woocommerce.android.ui.base.BaseFragment implements com.woocommerce.android.ui.main.MainActivity.Companion.BackPressListener {
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.orders.tracking.AddOrderShipmentTrackingFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_ADD_SHIPMENT_TRACKING_RESULT = "key_add_shipment_tracking_result";
    @javax.inject.Inject
    public com.woocommerce.android.tools.NetworkStatus networkStatus;
    @javax.inject.Inject
    public com.woocommerce.android.ui.base.UIMessageResolver uiMessageResolver;
    @javax.inject.Inject
    public com.woocommerce.android.ui.orders.OrderNavigator navigator;
    @javax.inject.Inject
    public com.woocommerce.android.util.DateUtils dateUtils;
    private final kotlin.Lazy viewModel$delegate = null;
    private android.app.DatePickerDialog dateShippedPickerDialog;
    private com.woocommerce.android.widgets.CustomProgressDialog progressDialog;
    
    public AddOrderShipmentTrackingFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.tools.NetworkStatus getNetworkStatus() {
        return null;
    }
    
    public final void setNetworkStatus(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.NetworkStatus p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.ui.base.UIMessageResolver getUiMessageResolver() {
        return null;
    }
    
    public final void setUiMessageResolver(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.base.UIMessageResolver p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.ui.orders.OrderNavigator getNavigator() {
        return null;
    }
    
    public final void setNavigator(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.orders.OrderNavigator p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.util.DateUtils getDateUtils() {
        return null;
    }
    
    public final void setDateUtils(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.DateUtils p0) {
    }
    
    private final com.woocommerce.android.ui.orders.tracking.AddOrderShipmentTrackingViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.woocommerce.android.ui.main.AppBarStatus getActivityAppBarStatus() {
        return null;
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getFragmentTitle() {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupObservers(com.woocommerce.android.databinding.FragmentAddShipmentTrackingBinding binding) {
    }
    
    private final void initUi(com.woocommerce.android.databinding.FragmentAddShipmentTrackingBinding binding) {
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    @java.lang.Override
    public void onStop() {
    }
    
    /**
     * Reusing the same menu used for adding order notes
     */
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
    
    @java.lang.Override
    public boolean onRequestAllowBackPress() {
        return false;
    }
    
    private final void showCustomProviderFields(com.woocommerce.android.databinding.FragmentAddShipmentTrackingBinding binding) {
    }
    
    private final void hideCustomProviderFields(com.woocommerce.android.databinding.FragmentAddShipmentTrackingBinding binding) {
    }
    
    private final void showProgressDialog(boolean show) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/orders/tracking/AddOrderShipmentTrackingFragment$Companion;", "", "()V", "KEY_ADD_SHIPMENT_TRACKING_RESULT", "", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}