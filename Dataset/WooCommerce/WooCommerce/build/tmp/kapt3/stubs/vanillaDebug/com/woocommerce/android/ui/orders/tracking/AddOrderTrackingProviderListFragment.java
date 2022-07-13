package com.woocommerce.android.ui.orders.tracking;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 62\u00020\u00012\u00020\u00022\u00020\u0003:\u00016B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0012\u0010 \u001a\u00020\u001d2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0018\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'H\u0016J\b\u0010(\u001a\u00020\u001dH\u0016J\u0010\u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020+H\u0016J\u0010\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u001bH\u0016J\u0010\u0010/\u001a\u00020-2\u0006\u00100\u001a\u00020\u001bH\u0016J\b\u00101\u001a\u00020\u001dH\u0016J\u001a\u00102\u001a\u00020\u001d2\u0006\u00103\u001a\u0002042\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0010\u00105\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u0017\u0010\u0018\u00a8\u00067"}, d2 = {"Lcom/woocommerce/android/ui/orders/tracking/AddOrderTrackingProviderListFragment;", "Lcom/woocommerce/android/ui/base/BaseFragment;", "Landroidx/appcompat/widget/SearchView$OnQueryTextListener;", "Lcom/woocommerce/android/ui/orders/tracking/AddOrderTrackingProviderListAdapter$OnProviderClickListener;", "()V", "providerListAdapter", "Lcom/woocommerce/android/ui/orders/tracking/AddOrderTrackingProviderListAdapter;", "getProviderListAdapter", "()Lcom/woocommerce/android/ui/orders/tracking/AddOrderTrackingProviderListAdapter;", "providerListAdapter$delegate", "Lkotlin/Lazy;", "searchView", "Landroidx/appcompat/widget/SearchView;", "skeletonView", "Lcom/woocommerce/android/widgets/SkeletonView;", "uiMessageResolver", "Lcom/woocommerce/android/ui/base/UIMessageResolver;", "getUiMessageResolver", "()Lcom/woocommerce/android/ui/base/UIMessageResolver;", "setUiMessageResolver", "(Lcom/woocommerce/android/ui/base/UIMessageResolver;)V", "viewModel", "Lcom/woocommerce/android/ui/orders/tracking/AddOrderTrackingProviderListViewModel;", "getViewModel", "()Lcom/woocommerce/android/ui/orders/tracking/AddOrderTrackingProviderListViewModel;", "viewModel$delegate", "getFragmentTitle", "", "initUi", "", "binding", "Lcom/woocommerce/android/databinding/DialogOrderTrackingProviderListBinding;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onDestroyView", "onProviderClick", "provider", "Lcom/woocommerce/android/model/OrderShipmentProvider;", "onQueryTextChange", "", "newText", "onQueryTextSubmit", "query", "onResume", "onViewCreated", "view", "Landroid/view/View;", "setupObservers", "Companion", "WooCommerce_vanillaDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class AddOrderTrackingProviderListFragment extends com.woocommerce.android.ui.base.BaseFragment implements androidx.appcompat.widget.SearchView.OnQueryTextListener, com.woocommerce.android.ui.orders.tracking.AddOrderTrackingProviderListAdapter.OnProviderClickListener {
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.orders.tracking.AddOrderTrackingProviderListFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "AddOrderTrackingProviderListFragment";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SHIPMENT_TRACKING_PROVIDER_RESULT = "tracking-provider-result";
    @javax.inject.Inject()
    public com.woocommerce.android.ui.base.UIMessageResolver uiMessageResolver;
    private final kotlin.Lazy viewModel$delegate = null;
    private final kotlin.Lazy providerListAdapter$delegate = null;
    private androidx.appcompat.widget.SearchView searchView;
    private final com.woocommerce.android.widgets.SkeletonView skeletonView = null;
    
    public AddOrderTrackingProviderListFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.ui.base.UIMessageResolver getUiMessageResolver() {
        return null;
    }
    
    public final void setUiMessageResolver(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.base.UIMessageResolver p0) {
    }
    
    private final com.woocommerce.android.ui.orders.tracking.AddOrderTrackingProviderListViewModel getViewModel() {
        return null;
    }
    
    private final com.woocommerce.android.ui.orders.tracking.AddOrderTrackingProviderListAdapter getProviderListAdapter() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final void setupObservers(com.woocommerce.android.databinding.DialogOrderTrackingProviderListBinding binding) {
    }
    
    private final void initUi(com.woocommerce.android.databinding.DialogOrderTrackingProviderListBinding binding) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getFragmentTitle() {
        return null;
    }
    
    @java.lang.Override()
    public void onProviderClick(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.OrderShipmentProvider provider) {
    }
    
    @java.lang.Override()
    public boolean onQueryTextSubmit(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onQueryTextChange(@org.jetbrains.annotations.NotNull()
    java.lang.String newText) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/woocommerce/android/ui/orders/tracking/AddOrderTrackingProviderListFragment$Companion;", "", "()V", "SHIPMENT_TRACKING_PROVIDER_RESULT", "", "TAG", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}