package com.woocommerce.android.ui.products;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00bc\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 }2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001}B\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u00102\u001a\u000203H\u0002J\b\u00104\u001a\u000203H\u0002J\b\u00105\u001a\u000203H\u0002J\b\u00106\u001a\u000207H\u0016J\u0010\u00108\u001a\u0002032\u0006\u00109\u001a\u00020:H\u0002J\u0012\u0010;\u001a\u0002032\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J\u0018\u0010>\u001a\u0002032\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020BH\u0016J\b\u0010C\u001a\u000203H\u0016J\b\u0010D\u001a\u000203H\u0002J\b\u0010E\u001a\u000203H\u0016J\b\u0010F\u001a\u000203H\u0002J\u0012\u0010G\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010\u001fH\u0016J\u0012\u0010J\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010K\u001a\u00020H2\u0006\u0010I\u001a\u00020\u001fH\u0016J\u0010\u0010L\u001a\u0002032\u0006\u0010?\u001a\u00020@H\u0016J\u001a\u0010M\u001a\u0002032\u0006\u0010N\u001a\u00020\u00192\b\u0010O\u001a\u0004\u0018\u00010PH\u0002J\u0010\u0010Q\u001a\u00020H2\u0006\u0010R\u001a\u000207H\u0016J\u0010\u0010S\u001a\u00020H2\u0006\u0010T\u001a\u000207H\u0016J\b\u0010U\u001a\u000203H\u0016J\b\u0010V\u001a\u000203H\u0016J\b\u0010W\u001a\u000203H\u0016J\b\u0010X\u001a\u000203H\u0016J\u001a\u0010Y\u001a\u0002032\u0006\u0010Z\u001a\u00020P2\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J\b\u0010[\u001a\u000203H\u0002J\u0010\u0010\\\u001a\u0002032\u0006\u0010]\u001a\u00020\u0015H\u0002J\b\u0010^\u001a\u000203H\u0016J\u0010\u0010_\u001a\u0002032\u0006\u0010`\u001a\u00020HH\u0002J\u0010\u0010a\u001a\u0002032\u0006\u0010,\u001a\u00020-H\u0002J\b\u0010b\u001a\u000203H\u0002J\b\u0010c\u001a\u00020HH\u0016J\b\u0010d\u001a\u00020HH\u0002J\b\u0010e\u001a\u000203H\u0002J\u0010\u0010f\u001a\u0002032\u0006\u0010g\u001a\u00020HH\u0002J\u0010\u0010h\u001a\u0002032\u0006\u0010i\u001a\u00020HH\u0002J\u0010\u0010j\u001a\u0002032\u0006\u0010g\u001a\u00020HH\u0002J:\u0010k\u001a\u0002032\b\u0010l\u001a\u0004\u0018\u0001072\b\u0010m\u001a\u0004\u0018\u0001072\b\u0010n\u001a\u0004\u0018\u0001072\b\u0010o\u001a\u0004\u0018\u0001072\b\u0010p\u001a\u0004\u0018\u000107H\u0002J\u0016\u0010q\u001a\u0002032\f\u0010r\u001a\b\u0012\u0004\u0012\u00020t0sH\u0002J\u0010\u0010u\u001a\u0002032\u0006\u0010g\u001a\u00020HH\u0002J\b\u0010v\u001a\u000203H\u0002J\u0010\u0010w\u001a\u0002032\u0006\u0010g\u001a\u00020HH\u0002J\u0010\u0010x\u001a\u0002032\u0006\u0010g\u001a\u00020HH\u0002J\u0010\u0010y\u001a\u0002032\u0006\u0010N\u001a\u00020\u0019H\u0002J\u0010\u0010z\u001a\u0002032\u0006\u0010{\u001a\u00020|H\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010&\u001a\u00020\'8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001b\u0010,\u001a\u00020-8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b0\u00101\u001a\u0004\b.\u0010/\u00a8\u0006~"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductListFragment;", "Lcom/woocommerce/android/ui/base/TopLevelFragment;", "Lcom/woocommerce/android/ui/products/ProductSortAndFiltersCard$ProductSortAndFilterListener;", "Lcom/woocommerce/android/ui/products/OnLoadMoreListener;", "Landroidx/appcompat/widget/SearchView$OnQueryTextListener;", "Landroid/view/MenuItem$OnActionExpandListener;", "()V", "_binding", "Lcom/woocommerce/android/databinding/FragmentProductListBinding;", "_productAdapter", "Lcom/woocommerce/android/ui/products/ProductListAdapter;", "binding", "getBinding", "()Lcom/woocommerce/android/databinding/FragmentProductListBinding;", "currencyFormatter", "Lcom/woocommerce/android/util/CurrencyFormatter;", "getCurrencyFormatter", "()Lcom/woocommerce/android/util/CurrencyFormatter;", "setCurrencyFormatter", "(Lcom/woocommerce/android/util/CurrencyFormatter;)V", "feedbackState", "Lcom/woocommerce/android/model/FeatureFeedbackSettings$FeedbackState;", "getFeedbackState", "()Lcom/woocommerce/android/model/FeatureFeedbackSettings$FeedbackState;", "pendingTrashProductId", "", "Ljava/lang/Long;", "productAdapter", "getProductAdapter", "()Lcom/woocommerce/android/ui/products/ProductListAdapter;", "searchMenuItem", "Landroid/view/MenuItem;", "searchView", "Landroidx/appcompat/widget/SearchView;", "skeletonView", "Lcom/woocommerce/android/widgets/SkeletonView;", "trashProductUndoSnack", "Lcom/google/android/material/snackbar/Snackbar;", "uiMessageResolver", "Lcom/woocommerce/android/ui/base/UIMessageResolver;", "getUiMessageResolver", "()Lcom/woocommerce/android/ui/base/UIMessageResolver;", "setUiMessageResolver", "(Lcom/woocommerce/android/ui/base/UIMessageResolver;)V", "viewModel", "Lcom/woocommerce/android/ui/products/ProductListViewModel;", "getViewModel", "()Lcom/woocommerce/android/ui/products/ProductListViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "closeSearchView", "", "disableSearchListeners", "enableSearchListeners", "getFragmentTitle", "", "initAddProductFab", "fabButton", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onDestroyView", "onDismissProductWIPNoticeCardClicked", "onFilterOptionSelected", "onGiveFeedbackClicked", "onMenuItemActionCollapse", "", "item", "onMenuItemActionExpand", "onOptionsItemSelected", "onPrepareOptionsMenu", "onProductClick", "remoteProductId", "sharedView", "Landroid/view/View;", "onQueryTextChange", "newText", "onQueryTextSubmit", "query", "onRequestLoadMore", "onResume", "onSortOptionSelected", "onStop", "onViewCreated", "view", "refreshOptionsMenu", "registerFeedbackSetting", "state", "scrollToTop", "setIsRefreshing", "isRefreshing", "setupObservers", "setupResultHandlers", "shouldExpandToolbar", "shouldShowSearchMenuItem", "showAddProductBottomSheet", "showAddProductButton", "show", "showBottomNavBar", "isVisible", "showLoadMoreProgress", "showProductFilterScreen", "stockStatus", "productType", "productStatus", "productCategory", "productCategoryName", "showProductList", "products", "", "Lcom/woocommerce/android/model/Product;", "showProductSortAndFiltersCard", "showProductSortingBottomSheet", "showProductWIPNoticeCard", "showSkeleton", "trashProduct", "updateFilterSelection", "filterCount", "", "Companion", "WooCommerce_wasabiDebug"})
@dagger.hilt.android.AndroidEntryPoint
public final class ProductListFragment extends com.woocommerce.android.ui.base.TopLevelFragment implements com.woocommerce.android.ui.products.ProductSortAndFiltersCard.ProductSortAndFilterListener, com.woocommerce.android.ui.products.OnLoadMoreListener, androidx.appcompat.widget.SearchView.OnQueryTextListener, android.view.MenuItem.OnActionExpandListener {
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.products.ProductListFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String TAG = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String PRODUCT_FILTER_RESULT_KEY = "product_filter_result";
    @javax.inject.Inject
    public com.woocommerce.android.ui.base.UIMessageResolver uiMessageResolver;
    @javax.inject.Inject
    public com.woocommerce.android.util.CurrencyFormatter currencyFormatter;
    private com.woocommerce.android.ui.products.ProductListAdapter _productAdapter;
    private final kotlin.Lazy viewModel$delegate = null;
    private final com.woocommerce.android.widgets.SkeletonView skeletonView = null;
    private android.view.MenuItem searchMenuItem;
    private androidx.appcompat.widget.SearchView searchView;
    private com.google.android.material.snackbar.Snackbar trashProductUndoSnack;
    private java.lang.Long pendingTrashProductId;
    private com.woocommerce.android.databinding.FragmentProductListBinding _binding;
    
    public ProductListFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.ui.base.UIMessageResolver getUiMessageResolver() {
        return null;
    }
    
    public final void setUiMessageResolver(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.base.UIMessageResolver p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.util.CurrencyFormatter getCurrencyFormatter() {
        return null;
    }
    
    public final void setCurrencyFormatter(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.CurrencyFormatter p0) {
    }
    
    private final com.woocommerce.android.ui.products.ProductListAdapter getProductAdapter() {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.ProductListViewModel getViewModel() {
        return null;
    }
    
    private final com.woocommerce.android.databinding.FragmentProductListBinding getBinding() {
        return null;
    }
    
    private final com.woocommerce.android.model.FeatureFeedbackSettings.FeedbackState getFeedbackState() {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initAddProductFab(com.google.android.material.floatingactionbutton.FloatingActionButton fabButton) {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    @java.lang.Override
    public void onStop() {
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
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
    
    /**
     * Use this rather than invalidateOptionsMenu() since that collapses the search menu item
     */
    private final void refreshOptionsMenu() {
    }
    
    /**
     * Prevent search from appearing when a child fragment is active
     */
    private final boolean shouldShowSearchMenuItem() {
        return false;
    }
    
    @java.lang.Override
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull
    android.view.MenuItem item) {
        return false;
    }
    
    private final void closeSearchView() {
    }
    
    private final void disableSearchListeners() {
    }
    
    private final void enableSearchListeners() {
    }
    
    @java.lang.Override
    public boolean onQueryTextSubmit(@org.jetbrains.annotations.NotNull
    java.lang.String query) {
        return false;
    }
    
    @java.lang.Override
    public boolean onQueryTextChange(@org.jetbrains.annotations.NotNull
    java.lang.String newText) {
        return false;
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
    
    private final void setIsRefreshing(boolean isRefreshing) {
    }
    
    @kotlin.Suppress(names = {"LongMethod"})
    private final void setupObservers(com.woocommerce.android.ui.products.ProductListViewModel viewModel) {
    }
    
    private final void setupResultHandlers() {
    }
    
    private final void trashProduct(long remoteProductId) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getFragmentTitle() {
        return null;
    }
    
    @java.lang.Override
    public void scrollToTop() {
    }
    
    private final void showSkeleton(boolean show) {
    }
    
    private final void showLoadMoreProgress(boolean show) {
    }
    
    private final void showProductList(java.util.List<com.woocommerce.android.model.Product> products) {
    }
    
    private final void showProductWIPNoticeCard(boolean show) {
    }
    
    private final void showProductSortAndFiltersCard(boolean show) {
    }
    
    private final void showBottomNavBar(boolean isVisible) {
    }
    
    private final void updateFilterSelection(int filterCount) {
    }
    
    private final void showAddProductButton(boolean show) {
    }
    
    private final void onProductClick(long remoteProductId, android.view.View sharedView) {
    }
    
    private final void showAddProductBottomSheet() {
    }
    
    @java.lang.Override
    public void onRequestLoadMore() {
    }
    
    private final void showProductFilterScreen(java.lang.String stockStatus, java.lang.String productType, java.lang.String productStatus, java.lang.String productCategory, java.lang.String productCategoryName) {
    }
    
    @java.lang.Override
    public void onFilterOptionSelected() {
    }
    
    private final void showProductSortingBottomSheet() {
    }
    
    @java.lang.Override
    public void onSortOptionSelected() {
    }
    
    private final void onGiveFeedbackClicked() {
    }
    
    private final void onDismissProductWIPNoticeCardClicked() {
    }
    
    private final void registerFeedbackSetting(com.woocommerce.android.model.FeatureFeedbackSettings.FeedbackState state) {
    }
    
    @java.lang.Override
    public boolean shouldExpandToolbar() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductListFragment$Companion;", "", "()V", "PRODUCT_FILTER_RESULT_KEY", "", "getPRODUCT_FILTER_RESULT_KEY", "()Ljava/lang/String;", "TAG", "getTAG", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getTAG() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getPRODUCT_FILTER_RESULT_KEY() {
            return null;
        }
    }
}