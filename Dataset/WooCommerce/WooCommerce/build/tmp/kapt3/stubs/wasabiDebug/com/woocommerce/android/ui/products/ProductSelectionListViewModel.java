package com.woocommerce.android.ui.products;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001:\u0001GB\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\'\u00108\u001a\u0002092\n\b\u0002\u00104\u001a\u0004\u0018\u0001052\b\b\u0002\u0010:\u001a\u00020\u0016H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010;J\u0012\u0010<\u001a\u0002092\b\b\u0002\u0010:\u001a\u00020\u0016H\u0002J\b\u0010=\u001a\u000209H\u0014J\u0018\u0010>\u001a\u0002092\u0010\b\u0002\u0010?\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000bJ\u0006\u0010@\u001a\u000209J\u0006\u0010A\u001a\u000209J\u0006\u0010B\u001a\u000209J\u0006\u0010C\u001a\u000209J\u000e\u0010D\u001a\u0002092\u0006\u0010E\u001a\u000205J\b\u0010F\u001a\u000209H\u0002R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00168BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00168BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00168BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0#\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010(\u001a\u00020\'2\u0006\u0010&\u001a\u00020\'8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00020\'00\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0010\u00103\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0013\u00104\u001a\u0004\u0018\u0001058F\u00a2\u0006\u0006\u001a\u0004\b6\u00107\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006H"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductSelectionListViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "networkStatus", "Lcom/woocommerce/android/tools/NetworkStatus;", "productRepository", "Lcom/woocommerce/android/ui/products/ProductListRepository;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/tools/NetworkStatus;Lcom/woocommerce/android/ui/products/ProductListRepository;)V", "_productList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/woocommerce/android/model/Product;", "excludedProductIds", "", "getExcludedProductIds", "()Ljava/util/List;", "groupedProductListType", "Lcom/woocommerce/android/ui/products/GroupedProductListType;", "getGroupedProductListType", "()Lcom/woocommerce/android/ui/products/GroupedProductListType;", "isLoading", "", "()Z", "isRefreshing", "isSearching", "loadJob", "Lkotlinx/coroutines/Job;", "navArgs", "Lcom/woocommerce/android/ui/products/ProductSelectionListFragmentArgs;", "getNavArgs", "()Lcom/woocommerce/android/ui/products/ProductSelectionListFragmentArgs;", "navArgs$delegate", "Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "productList", "Landroidx/lifecycle/LiveData;", "getProductList", "()Landroidx/lifecycle/LiveData;", "<set-?>", "Lcom/woocommerce/android/ui/products/ProductSelectionListViewModel$ProductSelectionListViewState;", "productSelectionListViewState", "getProductSelectionListViewState", "()Lcom/woocommerce/android/ui/products/ProductSelectionListViewModel$ProductSelectionListViewState;", "setProductSelectionListViewState", "(Lcom/woocommerce/android/ui/products/ProductSelectionListViewModel$ProductSelectionListViewState;)V", "productSelectionListViewState$delegate", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "productSelectionListViewStateLiveData", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getProductSelectionListViewStateLiveData", "()Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "searchJob", "searchQuery", "", "getSearchQuery", "()Ljava/lang/String;", "fetchProductList", "", "loadMore", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadProducts", "onCleared", "onDoneButtonClicked", "selectedProductIds", "onLoadMoreRequested", "onRefreshRequested", "onSearchClosed", "onSearchOpened", "onSearchQueryChanged", "query", "waitForExistingLoad", "ProductSelectionListViewState", "WooCommerce_wasabiDebug"})
public final class ProductSelectionListViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.tools.NetworkStatus networkStatus = null;
    private final com.woocommerce.android.ui.products.ProductListRepository productRepository = null;
    private final com.woocommerce.android.viewmodel.NavArgsLazy navArgs$delegate = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.woocommerce.android.model.Product>> _productList = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.model.Product>> productList = null;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.products.ProductSelectionListViewModel.ProductSelectionListViewState> productSelectionListViewStateLiveData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate productSelectionListViewState$delegate = null;
    private kotlinx.coroutines.Job loadJob;
    private kotlinx.coroutines.Job searchJob;
    
    @javax.inject.Inject
    public ProductSelectionListViewModel(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.NetworkStatus networkStatus, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.ProductListRepository productRepository) {
        super(null);
    }
    
    private final com.woocommerce.android.ui.products.ProductSelectionListFragmentArgs getNavArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.model.Product>> getProductList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.products.ProductSelectionListViewModel.ProductSelectionListViewState> getProductSelectionListViewStateLiveData() {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.ProductSelectionListViewModel.ProductSelectionListViewState getProductSelectionListViewState() {
        return null;
    }
    
    private final void setProductSelectionListViewState(com.woocommerce.android.ui.products.ProductSelectionListViewModel.ProductSelectionListViewState p0) {
    }
    
    private final boolean isRefreshing() {
        return false;
    }
    
    private final boolean isLoading() {
        return false;
    }
    
    private final boolean isSearching() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.ui.products.GroupedProductListType getGroupedProductListType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSearchQuery() {
        return null;
    }
    
    private final java.util.List<java.lang.Long> getExcludedProductIds() {
        return null;
    }
    
    public final void onLoadMoreRequested() {
    }
    
    public final void onRefreshRequested() {
    }
    
    public final void onDoneButtonClicked(@org.jetbrains.annotations.Nullable
    java.util.List<java.lang.Long> selectedProductIds) {
    }
    
    public final void onSearchQueryChanged(@org.jetbrains.annotations.NotNull
    java.lang.String query) {
    }
    
    public final void onSearchOpened() {
    }
    
    public final void onSearchClosed() {
    }
    
    private final void loadProducts(boolean loadMore) {
    }
    
    /**
     * If products are already being fetched, wait for the existing job to finish
     */
    private final void waitForExistingLoad() {
    }
    
    private final java.lang.Object fetchProductList(java.lang.String searchQuery, boolean loadMore, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJn\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u001bJ\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\u0013\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u00d6\u0003J\t\u0010!\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\"\u001a\u00020\nH\u00d6\u0001J\u0019\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u001dH\u00d6\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\b\u0010\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0004\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0005\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0007\u0010\u000eR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\u000eR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0002\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006("}, d2 = {"Lcom/woocommerce/android/ui/products/ProductSelectionListViewModel$ProductSelectionListViewState;", "Landroid/os/Parcelable;", "isSkeletonShown", "", "isLoading", "isLoadingMore", "canLoadMore", "isRefreshing", "isEmptyViewVisible", "searchQuery", "", "isSearchActive", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;)V", "getCanLoadMore", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSearchQuery", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/woocommerce/android/ui/products/ProductSelectionListViewModel$ProductSelectionListViewState;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class ProductSelectionListViewState implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean isSkeletonShown = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean isLoading = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean isLoadingMore = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean canLoadMore = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean isRefreshing = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean isEmptyViewVisible = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String searchQuery = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean isSearchActive = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.products.ProductSelectionListViewModel.ProductSelectionListViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.ProductSelectionListViewModel.ProductSelectionListViewState copy(@org.jetbrains.annotations.Nullable
        java.lang.Boolean isSkeletonShown, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isLoading, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isLoadingMore, @org.jetbrains.annotations.Nullable
        java.lang.Boolean canLoadMore, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isRefreshing, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isEmptyViewVisible, @org.jetbrains.annotations.Nullable
        java.lang.String searchQuery, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isSearchActive) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public ProductSelectionListViewState() {
            super();
        }
        
        public ProductSelectionListViewState(@org.jetbrains.annotations.Nullable
        java.lang.Boolean isSkeletonShown, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isLoading, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isLoadingMore, @org.jetbrains.annotations.Nullable
        java.lang.Boolean canLoadMore, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isRefreshing, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isEmptyViewVisible, @org.jetbrains.annotations.Nullable
        java.lang.String searchQuery, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isSearchActive) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean isSkeletonShown() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean isLoading() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean isLoadingMore() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean getCanLoadMore() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean isRefreshing() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean isEmptyViewVisible() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getSearchQuery() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component8() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean isSearchActive() {
            return null;
        }
        
        @java.lang.Override
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override
        public void writeToParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.products.ProductSelectionListViewModel.ProductSelectionListViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.products.ProductSelectionListViewModel.ProductSelectionListViewState createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.products.ProductSelectionListViewModel.ProductSelectionListViewState[] newArray(int size) {
                return null;
            }
        }
    }
}