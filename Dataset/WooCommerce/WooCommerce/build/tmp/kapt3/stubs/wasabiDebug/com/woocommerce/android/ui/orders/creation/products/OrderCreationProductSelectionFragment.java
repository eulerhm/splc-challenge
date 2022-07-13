package com.woocommerce.android.ui.orders.creation.products;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0002J\u0018\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020 H\u0016J\u0012\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010*\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010+\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0013H\u0016J\u0010\u0010,\u001a\u00020 2\u0006\u0010\"\u001a\u00020#H\u0016J\u0012\u0010-\u001a\u00020(2\b\u0010.\u001a\u0004\u0018\u00010\u001eH\u0016J\u0012\u0010/\u001a\u00020(2\b\u00100\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u00101\u001a\u00020 H\u0016J\u001a\u00102\u001a\u00020 2\u0006\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106H\u0016J\"\u00107\u001a\u00020 2\u0006\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010;2\u0006\u0010<\u001a\u00020;H\u0002J\b\u0010=\u001a\u00020 H\u0002J\b\u0010>\u001a\u00020 H\u0002J\u0010\u0010?\u001a\u00020 2\u0006\u00108\u001a\u000209H\u0002J\u0018\u0010@\u001a\u00020 2\u0006\u00108\u001a\u0002092\u0006\u0010A\u001a\u00020(H\u0002J\u0018\u0010B\u001a\u00020 2\u0006\u00108\u001a\u0002092\u0006\u0010A\u001a\u00020(H\u0002J\u001a\u0010C\u001a\u00020 *\u0002092\f\u0010D\u001a\b\u0012\u0004\u0012\u00020F0EH\u0002J\f\u0010G\u001a\u00020 *\u00020\u0013H\u0002R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006H"}, d2 = {"Lcom/woocommerce/android/ui/orders/creation/products/OrderCreationProductSelectionFragment;", "Lcom/woocommerce/android/ui/base/BaseFragment;", "Lcom/woocommerce/android/ui/products/OnLoadMoreListener;", "Landroidx/appcompat/widget/SearchView$OnQueryTextListener;", "Landroid/view/MenuItem$OnActionExpandListener;", "()V", "currencyFormatter", "Lcom/woocommerce/android/util/CurrencyFormatter;", "getCurrencyFormatter", "()Lcom/woocommerce/android/util/CurrencyFormatter;", "setCurrencyFormatter", "(Lcom/woocommerce/android/util/CurrencyFormatter;)V", "productListViewModel", "Lcom/woocommerce/android/ui/orders/creation/products/OrderCreationProductSelectionViewModel;", "getProductListViewModel", "()Lcom/woocommerce/android/ui/orders/creation/products/OrderCreationProductSelectionViewModel;", "productListViewModel$delegate", "Lkotlin/Lazy;", "searchMenuItem", "Landroid/view/MenuItem;", "searchView", "Landroidx/appcompat/widget/SearchView;", "sharedViewModel", "Lcom/woocommerce/android/ui/orders/creation/OrderCreationViewModel;", "getSharedViewModel", "()Lcom/woocommerce/android/ui/orders/creation/OrderCreationViewModel;", "sharedViewModel$delegate", "skeletonView", "Lcom/woocommerce/android/widgets/SkeletonView;", "getFragmentTitle", "", "onClearSearchButtonClicked", "", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onDestroyView", "onMenuItemActionCollapse", "", "item", "onMenuItemActionExpand", "onOptionsItemSelected", "onPrepareOptionsMenu", "onQueryTextChange", "newText", "onQueryTextSubmit", "query", "onRequestLoadMore", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onViewStateChanged", "binding", "Lcom/woocommerce/android/databinding/FragmentOrderCreationProductSelectionBinding;", "old", "Lcom/woocommerce/android/ui/orders/creation/products/OrderCreationProductSelectionViewModel$ViewState;", "new", "registerSearchListeners", "removeSearchListener", "setupObserversWith", "showEmptyView", "show", "showSkeleton", "loadProductsAdapterWith", "products", "", "Lcom/woocommerce/android/model/Product;", "restoreSearchMenuItemState", "WooCommerce_wasabiDebug"})
@dagger.hilt.android.AndroidEntryPoint
public final class OrderCreationProductSelectionFragment extends com.woocommerce.android.ui.base.BaseFragment implements com.woocommerce.android.ui.products.OnLoadMoreListener, androidx.appcompat.widget.SearchView.OnQueryTextListener, android.view.MenuItem.OnActionExpandListener {
    private final kotlin.Lazy sharedViewModel$delegate = null;
    private final kotlin.Lazy productListViewModel$delegate = null;
    private final com.woocommerce.android.widgets.SkeletonView skeletonView = null;
    private android.view.MenuItem searchMenuItem;
    private androidx.appcompat.widget.SearchView searchView;
    @javax.inject.Inject
    public com.woocommerce.android.util.CurrencyFormatter currencyFormatter;
    
    public OrderCreationProductSelectionFragment() {
        super();
    }
    
    private final com.woocommerce.android.ui.orders.creation.OrderCreationViewModel getSharedViewModel() {
        return null;
    }
    
    private final com.woocommerce.android.ui.orders.creation.products.OrderCreationProductSelectionViewModel getProductListViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.util.CurrencyFormatter getCurrencyFormatter() {
        return null;
    }
    
    public final void setCurrencyFormatter(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.CurrencyFormatter p0) {
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    private final void setupObserversWith(com.woocommerce.android.databinding.FragmentOrderCreationProductSelectionBinding binding) {
    }
    
    private final void loadProductsAdapterWith(com.woocommerce.android.databinding.FragmentOrderCreationProductSelectionBinding $this$loadProductsAdapterWith, java.util.List<com.woocommerce.android.model.Product> products) {
    }
    
    @java.lang.Override
    public void onRequestLoadMore() {
    }
    
    private final void onViewStateChanged(com.woocommerce.android.databinding.FragmentOrderCreationProductSelectionBinding binding, com.woocommerce.android.ui.orders.creation.products.OrderCreationProductSelectionViewModel.ViewState old, com.woocommerce.android.ui.orders.creation.products.OrderCreationProductSelectionViewModel.ViewState p2_54480) {
    }
    
    private final void showSkeleton(com.woocommerce.android.databinding.FragmentOrderCreationProductSelectionBinding binding, boolean show) {
    }
    
    private final void showEmptyView(com.woocommerce.android.databinding.FragmentOrderCreationProductSelectionBinding binding, boolean show) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getFragmentTitle() {
        return null;
    }
    
    @java.lang.Override
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull
    android.view.Menu menu, @org.jetbrains.annotations.NotNull
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override
    public void onPrepareOptionsMenu(@org.jetbrains.annotations.NotNull
    android.view.Menu menu) {
    }
    
    @java.lang.Override
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull
    android.view.MenuItem item) {
        return false;
    }
    
    private final void restoreSearchMenuItemState(android.view.MenuItem $this$restoreSearchMenuItemState) {
    }
    
    @java.lang.Override
    public boolean onMenuItemActionExpand(@org.jetbrains.annotations.Nullable
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override
    public boolean onMenuItemActionCollapse(@org.jetbrains.annotations.Nullable
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override
    public boolean onQueryTextSubmit(@org.jetbrains.annotations.Nullable
    java.lang.String query) {
        return false;
    }
    
    @java.lang.Override
    public boolean onQueryTextChange(@org.jetbrains.annotations.Nullable
    java.lang.String newText) {
        return false;
    }
    
    private final void registerSearchListeners() {
    }
    
    private final void removeSearchListener() {
    }
    
    private final void onClearSearchButtonClicked() {
    }
}