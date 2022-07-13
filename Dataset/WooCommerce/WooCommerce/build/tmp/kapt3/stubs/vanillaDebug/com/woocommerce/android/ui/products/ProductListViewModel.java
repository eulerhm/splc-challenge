package com.woocommerce.android.ui.products;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 [2\u00020\u0001:\u0004[\\]^B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ0\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u00142\b\u0010/\u001a\u0004\u0018\u00010\u00142\b\u00100\u001a\u0004\u0018\u00010\u00142\b\u00101\u001a\u0004\u0018\u00010\u0014H\u0002J\b\u00102\u001a\u00020-H\u0002J1\u00103\u001a\u0002042\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u00106\u001a\u00020-2\b\b\u0002\u00107\u001a\u00020-H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00108J\u0010\u00109\u001a\u0004\u0018\u00010:2\u0006\u0010;\u001a\u00020<J\b\u0010=\u001a\u0004\u0018\u00010\u0014J\b\u0010>\u001a\u00020?H\u0002J\b\u0010@\u001a\u00020-H\u0002J\u0006\u0010A\u001a\u00020-J$\u0010B\u001a\u0002042\b\b\u0002\u00106\u001a\u00020-2\b\b\u0002\u00107\u001a\u00020-2\b\b\u0002\u0010C\u001a\u00020-J\u0006\u0010D\u001a\u000204J\b\u0010E\u001a\u000204H\u0014J\u0006\u0010F\u001a\u000204J8\u0010G\u001a\u0002042\b\u0010.\u001a\u0004\u0018\u00010\u00142\b\u0010/\u001a\u0004\u0018\u00010\u00142\b\u00100\u001a\u0004\u0018\u00010\u00142\b\u00101\u001a\u0004\u0018\u00010\u00142\b\u0010H\u001a\u0004\u0018\u00010\u0014J\u0006\u0010I\u001a\u000204J\u0010\u0010J\u001a\u0002042\u0006\u0010K\u001a\u00020LH\u0007J\u0006\u0010M\u001a\u000204J\u0006\u0010N\u001a\u000204J\u0006\u0010O\u001a\u000204J\u000e\u0010P\u001a\u0002042\u0006\u0010Q\u001a\u00020\u0014J\u0006\u0010R\u001a\u000204J\u0006\u0010S\u001a\u000204J\u0010\u0010T\u001a\u0002042\b\b\u0002\u00107\u001a\u00020-J\u0017\u0010U\u001a\u0002042\n\b\u0002\u0010V\u001a\u0004\u0018\u00010<\u00a2\u0006\u0002\u0010WJ\b\u0010X\u001a\u000204H\u0002J\u000e\u0010Y\u001a\u0002042\u0006\u0010;\u001a\u00020<J\b\u0010Z\u001a\u000204H\u0002R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\'\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R+\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020 8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b&\u0010\'\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020 0)\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006_"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductListViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "productRepository", "Lcom/woocommerce/android/ui/products/ProductListRepository;", "networkStatus", "Lcom/woocommerce/android/tools/NetworkStatus;", "mediaFileUploadHandler", "Lcom/woocommerce/android/ui/media/MediaFileUploadHandler;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/ui/products/ProductListRepository;Lcom/woocommerce/android/tools/NetworkStatus;Lcom/woocommerce/android/ui/media/MediaFileUploadHandler;)V", "_productList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/woocommerce/android/model/Product;", "loadJob", "Lkotlinx/coroutines/Job;", "productFilterOptions", "", "Lorg/wordpress/android/fluxc/store/WCProductStore$ProductFilterOption;", "", "getProductFilterOptions", "()Ljava/util/Map;", "productFilterOptions$delegate", "Lkotlin/Lazy;", "productList", "Landroidx/lifecycle/LiveData;", "getProductList", "()Landroidx/lifecycle/LiveData;", "searchJob", "selectedCategoryName", "<set-?>", "Lcom/woocommerce/android/ui/products/ProductListViewModel$ViewState;", "viewState", "getViewState", "()Lcom/woocommerce/android/ui/products/ProductListViewModel$ViewState;", "setViewState", "(Lcom/woocommerce/android/ui/products/ProductListViewModel$ViewState;)V", "viewState$delegate", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "viewStateLiveData", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getViewStateLiveData", "()Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "areFiltersChanged", "", "stockStatus", "productStatus", "productType", "productCategory", "checkConnection", "fetchProductList", "", "searchQuery", "loadMore", "scrollToTop", "(Ljava/lang/String;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProduct", "Lorg/wordpress/android/fluxc/model/WCProductModel;", "remoteProductId", "", "getSearchQuery", "getSortingTitle", "", "isLoading", "isSearching", "loadProducts", "isRefreshing", "onAddProductButtonClicked", "onCleared", "onFiltersButtonTapped", "onFiltersChanged", "productCategoryName", "onLoadMoreRequested", "onRefreshProducts", "event", "Lcom/woocommerce/android/ui/products/ProductListViewModel$OnProductSortingChanged;", "onRefreshRequested", "onSearchClosed", "onSearchOpened", "onSearchQueryChanged", "query", "onSearchRequested", "onSortButtonTapped", "refreshProducts", "reloadProductsFromDb", "excludeProductId", "(Ljava/lang/Long;)V", "resetViewState", "trashProduct", "waitForExistingLoad", "Companion", "OnProductSortingChanged", "ProductListEvent", "ViewState", "WooCommerce_vanillaDebug"})
public final class ProductListViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.ui.products.ProductListRepository productRepository = null;
    private final com.woocommerce.android.tools.NetworkStatus networkStatus = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.products.ProductListViewModel.Companion Companion = null;
    private static final java.lang.String KEY_PRODUCT_FILTER_OPTIONS = "key_product_filter_options";
    private static final java.lang.String KEY_PRODUCT_FILTER_SELECTED_CATEGORY_NAME = "key_product_filter_selected_category_name";
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.woocommerce.android.model.Product>> _productList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.model.Product>> productList = null;
    @org.jetbrains.annotations.NotNull()
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.products.ProductListViewModel.ViewState> viewStateLiveData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate viewState$delegate = null;
    private final kotlin.Lazy productFilterOptions$delegate = null;
    private java.lang.String selectedCategoryName;
    private kotlinx.coroutines.Job searchJob;
    private kotlinx.coroutines.Job loadJob;
    
    @javax.inject.Inject()
    public ProductListViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.ProductListRepository productRepository, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.tools.NetworkStatus networkStatus, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.media.MediaFileUploadHandler mediaFileUploadHandler) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.model.Product>> getProductList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.products.ProductListViewModel.ViewState> getViewStateLiveData() {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.ProductListViewModel.ViewState getViewState() {
        return null;
    }
    
    private final void setViewState(com.woocommerce.android.ui.products.ProductListViewModel.ViewState p0) {
    }
    
    private final java.util.Map<org.wordpress.android.fluxc.store.WCProductStore.ProductFilterOption, java.lang.String> getProductFilterOptions() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public final boolean isSearching() {
        return false;
    }
    
    private final boolean isLoading() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSearchQuery() {
        return null;
    }
    
    public final void onSearchQueryChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    public final void onFiltersChanged(@org.jetbrains.annotations.Nullable()
    java.lang.String stockStatus, @org.jetbrains.annotations.Nullable()
    java.lang.String productStatus, @org.jetbrains.annotations.Nullable()
    java.lang.String productType, @org.jetbrains.annotations.Nullable()
    java.lang.String productCategory, @org.jetbrains.annotations.Nullable()
    java.lang.String productCategoryName) {
    }
    
    private final boolean areFiltersChanged(java.lang.String stockStatus, java.lang.String productStatus, java.lang.String productType, java.lang.String productCategory) {
        return false;
    }
    
    public final void onFiltersButtonTapped() {
    }
    
    public final void onSortButtonTapped() {
    }
    
    public final void onRefreshRequested() {
    }
    
    public final void onAddProductButtonClicked() {
    }
    
    public final void onSearchOpened() {
    }
    
    public final void onSearchClosed() {
    }
    
    public final void onLoadMoreRequested() {
    }
    
    public final void onSearchRequested() {
    }
    
    public final void reloadProductsFromDb(@org.jetbrains.annotations.Nullable()
    java.lang.Long excludeProductId) {
    }
    
    public final void loadProducts(boolean loadMore, boolean scrollToTop, boolean isRefreshing) {
    }
    
    /**
     * Resets the view state following a refresh
     */
    private final void resetViewState() {
    }
    
    /**
     * If products are already being fetched, wait for the existing job to finish
     */
    private final void waitForExistingLoad() {
    }
    
    public final void refreshProducts(boolean scrollToTop) {
    }
    
    private final java.lang.Object fetchProductList(java.lang.String searchQuery, boolean loadMore, boolean scrollToTop, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final int getSortingTitle() {
        return 0;
    }
    
    /**
     * Returns true if the network is connected, otherwise shows an offline snackbar and returns false
     */
    private final boolean checkConnection() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wordpress.android.fluxc.model.WCProductModel getProduct(long remoteProductId) {
        return null;
    }
    
    public final void trashProduct(long remoteProductId) {
    }
    
    @kotlin.Suppress(names = {"unused"})
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onRefreshProducts(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.ProductListViewModel.OnProductSortingChanged event) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductListViewModel$OnProductSortingChanged;", "", "()V", "WooCommerce_vanillaDebug"})
    public static final class OnProductSortingChanged {
        @org.jetbrains.annotations.NotNull()
        public static final com.woocommerce.android.ui.products.ProductListViewModel.OnProductSortingChanged INSTANCE = null;
        
        private OnProductSortingChanged() {
            super();
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b%\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0011J\u0010\u0010 \u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0013J\u0010\u0010!\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0013J\u0010\u0010#\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0013J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0013J\u0010\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0013J\u0010\u0010&\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0013J\u0010\u0010\'\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0013J\u000b\u0010(\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\u0010\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0013J\u0010\u0010+\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0013J\u009e\u0001\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010-J\t\u0010.\u001a\u00020\u000bH\u00d6\u0001J\u0013\u0010/\u001a\u00020\u00032\b\u00100\u001a\u0004\u0018\u000101H\u00d6\u0003J\t\u00102\u001a\u00020\u000bH\u00d6\u0001J\t\u00103\u001a\u00020\tH\u00d6\u0001J\u0019\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u000bH\u00d6\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0013R\u0017\u0010\u0019\u001a\u00020\u0003\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0019\u0010\u001cR\u0015\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\r\u0010\u0013R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0004\u0010\u0013R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0005\u0010\u0013R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0007\u0010\u0013R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\f\u0010\u0013R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0002\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001f\u0010\u0017\u00a8\u00069"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductListViewModel$ViewState;", "Landroid/os/Parcelable;", "isSkeletonShown", "", "isLoading", "isLoadingMore", "canLoadMore", "isRefreshing", "query", "", "filterCount", "", "isSearchActive", "isEmptyViewVisible", "sortingTitleResource", "displaySortAndFilterCard", "isAddProductButtonVisible", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getCanLoadMore", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDisplaySortAndFilterCard", "getFilterCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "isBottomNavBarVisible", "isBottomNavBarVisible$annotations", "()V", "()Z", "getQuery", "()Ljava/lang/String;", "getSortingTitleResource", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/woocommerce/android/ui/products/ProductListViewModel$ViewState;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
    public static final class ViewState implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isSkeletonShown = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isLoading = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isLoadingMore = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean canLoadMore = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isRefreshing = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String query = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer filterCount = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isSearchActive = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isEmptyViewVisible = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer sortingTitleResource = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean displaySortAndFilterCard = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isAddProductButtonVisible = null;
        private final boolean isBottomNavBarVisible = false;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.products.ProductListViewModel.ViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.ProductListViewModel.ViewState copy(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean isSkeletonShown, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isLoading, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isLoadingMore, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean canLoadMore, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isRefreshing, @org.jetbrains.annotations.Nullable()
        java.lang.String query, @org.jetbrains.annotations.Nullable()
        java.lang.Integer filterCount, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isSearchActive, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isEmptyViewVisible, @org.jetbrains.annotations.Nullable()
        java.lang.Integer sortingTitleResource, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean displaySortAndFilterCard, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isAddProductButtonVisible) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public ViewState() {
            super();
        }
        
        public ViewState(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean isSkeletonShown, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isLoading, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isLoadingMore, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean canLoadMore, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isRefreshing, @org.jetbrains.annotations.Nullable()
        java.lang.String query, @org.jetbrains.annotations.Nullable()
        java.lang.Integer filterCount, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isSearchActive, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isEmptyViewVisible, @org.jetbrains.annotations.Nullable()
        java.lang.Integer sortingTitleResource, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean displaySortAndFilterCard, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isAddProductButtonVisible) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isSkeletonShown() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isLoading() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isLoadingMore() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean getCanLoadMore() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isRefreshing() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getQuery() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getFilterCount() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component8() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isSearchActive() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component9() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isEmptyViewVisible() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component10() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getSortingTitleResource() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component11() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean getDisplaySortAndFilterCard() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component12() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isAddProductButtonVisible() {
            return null;
        }
        
        public final boolean isBottomNavBarVisible() {
            return false;
        }
        
        @kotlinx.parcelize.IgnoredOnParcel()
        @java.lang.Deprecated()
        public static void isBottomNavBarVisible$annotations() {
        }
        
        @java.lang.Override()
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.products.ProductListViewModel.ViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.ProductListViewModel.ViewState createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.ProductListViewModel.ViewState[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductListViewModel$ProductListEvent;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "()V", "ScrollToTop", "ShowAddProductBottomSheet", "ShowProductFilterScreen", "ShowProductSortingBottomSheet", "Lcom/woocommerce/android/ui/products/ProductListViewModel$ProductListEvent$ScrollToTop;", "Lcom/woocommerce/android/ui/products/ProductListViewModel$ProductListEvent$ShowAddProductBottomSheet;", "Lcom/woocommerce/android/ui/products/ProductListViewModel$ProductListEvent$ShowProductSortingBottomSheet;", "Lcom/woocommerce/android/ui/products/ProductListViewModel$ProductListEvent$ShowProductFilterScreen;", "WooCommerce_vanillaDebug"})
    public static abstract class ProductListEvent extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        
        private ProductListEvent() {
            super(false);
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductListViewModel$ProductListEvent$ScrollToTop;", "Lcom/woocommerce/android/ui/products/ProductListViewModel$ProductListEvent;", "()V", "WooCommerce_vanillaDebug"})
        public static final class ScrollToTop extends com.woocommerce.android.ui.products.ProductListViewModel.ProductListEvent {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.products.ProductListViewModel.ProductListEvent.ScrollToTop INSTANCE = null;
            
            private ScrollToTop() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductListViewModel$ProductListEvent$ShowAddProductBottomSheet;", "Lcom/woocommerce/android/ui/products/ProductListViewModel$ProductListEvent;", "()V", "WooCommerce_vanillaDebug"})
        public static final class ShowAddProductBottomSheet extends com.woocommerce.android.ui.products.ProductListViewModel.ProductListEvent {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.products.ProductListViewModel.ProductListEvent.ShowAddProductBottomSheet INSTANCE = null;
            
            private ShowAddProductBottomSheet() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductListViewModel$ProductListEvent$ShowProductSortingBottomSheet;", "Lcom/woocommerce/android/ui/products/ProductListViewModel$ProductListEvent;", "()V", "WooCommerce_vanillaDebug"})
        public static final class ShowProductSortingBottomSheet extends com.woocommerce.android.ui.products.ProductListViewModel.ProductListEvent {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.products.ProductListViewModel.ProductListEvent.ShowProductSortingBottomSheet INSTANCE = null;
            
            private ShowProductSortingBottomSheet() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003JE\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n\u00a8\u0006\u001c"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductListViewModel$ProductListEvent$ShowProductFilterScreen;", "Lcom/woocommerce/android/ui/products/ProductListViewModel$ProductListEvent;", "stockStatusFilter", "", "productTypeFilter", "productStatusFilter", "productCategoryFilter", "selectedCategoryName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getProductCategoryFilter", "()Ljava/lang/String;", "getProductStatusFilter", "getProductTypeFilter", "getSelectedCategoryName", "getStockStatusFilter", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_vanillaDebug"})
        public static final class ShowProductFilterScreen extends com.woocommerce.android.ui.products.ProductListViewModel.ProductListEvent {
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String stockStatusFilter = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String productTypeFilter = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String productStatusFilter = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String productCategoryFilter = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String selectedCategoryName = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.products.ProductListViewModel.ProductListEvent.ShowProductFilterScreen copy(@org.jetbrains.annotations.Nullable()
            java.lang.String stockStatusFilter, @org.jetbrains.annotations.Nullable()
            java.lang.String productTypeFilter, @org.jetbrains.annotations.Nullable()
            java.lang.String productStatusFilter, @org.jetbrains.annotations.Nullable()
            java.lang.String productCategoryFilter, @org.jetbrains.annotations.Nullable()
            java.lang.String selectedCategoryName) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public ShowProductFilterScreen(@org.jetbrains.annotations.Nullable()
            java.lang.String stockStatusFilter, @org.jetbrains.annotations.Nullable()
            java.lang.String productTypeFilter, @org.jetbrains.annotations.Nullable()
            java.lang.String productStatusFilter, @org.jetbrains.annotations.Nullable()
            java.lang.String productCategoryFilter, @org.jetbrains.annotations.Nullable()
            java.lang.String selectedCategoryName) {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getStockStatusFilter() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getProductTypeFilter() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component3() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getProductStatusFilter() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component4() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getProductCategoryFilter() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component5() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getSelectedCategoryName() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductListViewModel$Companion;", "", "()V", "KEY_PRODUCT_FILTER_OPTIONS", "", "KEY_PRODUCT_FILTER_SELECTED_CATEGORY_NAME", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}