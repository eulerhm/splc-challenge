package com.woocommerce.android.ui.orders.filters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0001+B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u001a\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002J\u0010\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u001eH\u0002J\u0016\u0010\'\u001a\u00020\u00172\f\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)H\u0002R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006,"}, d2 = {"Lcom/woocommerce/android/ui/orders/filters/OrderFilterOptionsFragment;", "Lcom/woocommerce/android/ui/base/BaseFragment;", "Lcom/woocommerce/android/ui/main/MainActivity$Companion$BackPressListener;", "()V", "activityAppBarStatus", "Lcom/woocommerce/android/ui/main/AppBarStatus;", "getActivityAppBarStatus", "()Lcom/woocommerce/android/ui/main/AppBarStatus;", "orderFilterOptionAdapter", "Lcom/woocommerce/android/ui/orders/filters/adapter/OrderFilterOptionAdapter;", "getOrderFilterOptionAdapter", "()Lcom/woocommerce/android/ui/orders/filters/adapter/OrderFilterOptionAdapter;", "setOrderFilterOptionAdapter", "(Lcom/woocommerce/android/ui/orders/filters/adapter/OrderFilterOptionAdapter;)V", "viewModel", "Lcom/woocommerce/android/ui/orders/filters/OrderFilterOptionsViewModel;", "getViewModel", "()Lcom/woocommerce/android/ui/orders/filters/OrderFilterOptionsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onRequestAllowBackPress", "", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "openDateRangePicker", "startDateMillis", "", "endDateMillis", "setUpFilterOptionsRecyclerView", "binding", "Lcom/woocommerce/android/databinding/FragmentOrderFilterListBinding;", "setUpObservers", "showDateRangePicker", "selectedStartMillis", "selectedEndMillis", "showOrderFilterOptions", "orderFilterOptions", "", "Lcom/woocommerce/android/ui/orders/filters/model/OrderFilterOptionUiModel;", "Companion", "WooCommerce_vanillaDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class OrderFilterOptionsFragment extends com.woocommerce.android.ui.base.BaseFragment implements com.woocommerce.android.ui.main.MainActivity.Companion.BackPressListener {
    @org.jetbrains.annotations.NotNull()
    private static final com.woocommerce.android.ui.orders.filters.OrderFilterOptionsFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    @java.lang.Deprecated()
    public static final java.lang.String DATE_PICKER_FRAGMENT_TAG = "DateRangePicker";
    private final kotlin.Lazy viewModel$delegate = null;
    public com.woocommerce.android.ui.orders.filters.adapter.OrderFilterOptionAdapter orderFilterOptionAdapter;
    
    public OrderFilterOptionsFragment() {
        super();
    }
    
    private final com.woocommerce.android.ui.orders.filters.OrderFilterOptionsViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.ui.orders.filters.adapter.OrderFilterOptionAdapter getOrderFilterOptionAdapter() {
        return null;
    }
    
    public final void setOrderFilterOptionAdapter(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.orders.filters.adapter.OrderFilterOptionAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.woocommerce.android.ui.main.AppBarStatus getActivityAppBarStatus() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUpFilterOptionsRecyclerView(com.woocommerce.android.databinding.FragmentOrderFilterListBinding binding) {
    }
    
    private final void setUpObservers(com.woocommerce.android.ui.orders.filters.OrderFilterOptionsViewModel viewModel) {
    }
    
    private final void openDateRangePicker(long startDateMillis, long endDateMillis) {
    }
    
    private final void showDateRangePicker(long selectedStartMillis, long selectedEndMillis) {
    }
    
    private final void showOrderFilterOptions(java.util.List<com.woocommerce.android.ui.orders.filters.model.OrderFilterOptionUiModel> orderFilterOptions) {
    }
    
    @java.lang.Override()
    public boolean onRequestAllowBackPress() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/orders/filters/OrderFilterOptionsFragment$Companion;", "", "()V", "DATE_PICKER_FRAGMENT_TAG", "", "WooCommerce_vanillaDebug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}