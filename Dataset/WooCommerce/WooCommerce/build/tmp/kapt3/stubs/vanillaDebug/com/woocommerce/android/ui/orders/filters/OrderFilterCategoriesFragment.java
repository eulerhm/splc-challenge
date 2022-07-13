package com.woocommerce.android.ui.orders.filters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\b\u0007\u0018\u0000 12\u00020\u00012\u00020\u0002:\u00011B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0018\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\tH\u0016J\b\u0010\"\u001a\u00020 H\u0016J\u001a\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u0010\u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00020*H\u0002J\u0010\u0010+\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010,\u001a\u00020\u00172\u0006\u0010-\u001a\u00020 H\u0002J\u0016\u0010.\u001a\u00020\u00172\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001900H\u0002R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013\u00a8\u00062"}, d2 = {"Lcom/woocommerce/android/ui/orders/filters/OrderFilterCategoriesFragment;", "Lcom/woocommerce/android/ui/base/BaseFragment;", "Lcom/woocommerce/android/ui/main/MainActivity$Companion$BackPressListener;", "()V", "activityAppBarStatus", "Lcom/woocommerce/android/ui/main/AppBarStatus;", "getActivityAppBarStatus", "()Lcom/woocommerce/android/ui/main/AppBarStatus;", "clearAllMenuItem", "Landroid/view/MenuItem;", "orderFilterCategoryAdapter", "Lcom/woocommerce/android/ui/orders/filters/adapter/OrderFilterCategoryAdapter;", "getOrderFilterCategoryAdapter", "()Lcom/woocommerce/android/ui/orders/filters/adapter/OrderFilterCategoryAdapter;", "setOrderFilterCategoryAdapter", "(Lcom/woocommerce/android/ui/orders/filters/adapter/OrderFilterCategoryAdapter;)V", "viewModel", "Lcom/woocommerce/android/ui/orders/filters/OrderFilterCategoriesViewModel;", "getViewModel", "()Lcom/woocommerce/android/ui/orders/filters/OrderFilterCategoriesViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "navigateToFilterOptions", "", "category", "Lcom/woocommerce/android/ui/orders/filters/model/OrderFilterCategoryUiModel;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onOptionsItemSelected", "", "item", "onRequestAllowBackPress", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setUpFiltersRecyclerView", "binding", "Lcom/woocommerce/android/databinding/FragmentOrderFilterListBinding;", "setUpObservers", "showClearAllAction", "show", "showOrderFilters", "orderFilters", "", "Companion", "WooCommerce_vanillaDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class OrderFilterCategoriesFragment extends com.woocommerce.android.ui.base.BaseFragment implements com.woocommerce.android.ui.main.MainActivity.Companion.BackPressListener {
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.orders.filters.OrderFilterCategoriesFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_UPDATED_FILTER_OPTIONS = "key_updated_filter_options";
    private final kotlin.Lazy viewModel$delegate = null;
    public com.woocommerce.android.ui.orders.filters.adapter.OrderFilterCategoryAdapter orderFilterCategoryAdapter;
    private android.view.MenuItem clearAllMenuItem;
    
    public OrderFilterCategoriesFragment() {
        super();
    }
    
    private final com.woocommerce.android.ui.orders.filters.OrderFilterCategoriesViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.ui.orders.filters.adapter.OrderFilterCategoryAdapter getOrderFilterCategoryAdapter() {
        return null;
    }
    
    public final void setOrderFilterCategoryAdapter(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.orders.filters.adapter.OrderFilterCategoryAdapter p0) {
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
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void setUpFiltersRecyclerView(com.woocommerce.android.databinding.FragmentOrderFilterListBinding binding) {
    }
    
    private final void navigateToFilterOptions(com.woocommerce.android.ui.orders.filters.model.OrderFilterCategoryUiModel category) {
    }
    
    private final void setUpObservers(com.woocommerce.android.ui.orders.filters.OrderFilterCategoriesViewModel viewModel) {
    }
    
    private final void showClearAllAction(boolean show) {
    }
    
    private final void showOrderFilters(java.util.List<com.woocommerce.android.ui.orders.filters.model.OrderFilterCategoryUiModel> orderFilters) {
    }
    
    @java.lang.Override()
    public boolean onRequestAllowBackPress() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/orders/filters/OrderFilterCategoriesFragment$Companion;", "", "()V", "KEY_UPDATED_FILTER_OPTIONS", "", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}