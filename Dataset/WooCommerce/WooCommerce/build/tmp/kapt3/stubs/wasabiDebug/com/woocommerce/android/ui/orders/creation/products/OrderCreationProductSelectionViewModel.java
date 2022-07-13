package com.woocommerce.android.ui.orders.creation.products;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u000289B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\'\u001a\u00020(2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010*\u001a\u00020\fH\u0002J\u0010\u0010+\u001a\u00020(2\u0006\u0010,\u001a\u00020\fH\u0002J\u0012\u0010-\u001a\u00020(2\b\b\u0002\u0010,\u001a\u00020\fH\u0002J\u0006\u0010.\u001a\u00020(J\u000e\u0010/\u001a\u00020(2\u0006\u00100\u001a\u000201J\u0006\u00102\u001a\u00020(J\u0006\u00103\u001a\u00020(J\u0006\u00104\u001a\u00020(J\"\u00105\u001a\u00020(2\u0006\u00106\u001a\u00020\b2\b\b\u0002\u0010,\u001a\u00020\f2\b\b\u0002\u00107\u001a\u00020\fR\u0011\u0010\u0007\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\rR\u0011\u0010\u000e\u001a\u00020\f8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\rR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R+\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001b0$\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&\u00a8\u0006:"}, d2 = {"Lcom/woocommerce/android/ui/orders/creation/products/OrderCreationProductSelectionViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "productListRepository", "Lcom/woocommerce/android/ui/products/ProductListRepository;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/ui/products/ProductListRepository;)V", "currentQuery", "", "getCurrentQuery", "()Ljava/lang/String;", "isLoading", "", "()Z", "isSearchActive", "loadingJob", "Lkotlinx/coroutines/Job;", "productList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/woocommerce/android/model/Product;", "productListData", "Landroidx/lifecycle/LiveData;", "getProductListData", "()Landroidx/lifecycle/LiveData;", "searchJob", "<set-?>", "Lcom/woocommerce/android/ui/orders/creation/products/OrderCreationProductSelectionViewModel$ViewState;", "viewState", "getViewState", "()Lcom/woocommerce/android/ui/orders/creation/products/OrderCreationProductSelectionViewModel$ViewState;", "setViewState", "(Lcom/woocommerce/android/ui/orders/creation/products/OrderCreationProductSelectionViewModel$ViewState;)V", "viewState$delegate", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "viewStateData", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getViewStateData", "()Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "handleSearchResult", "", "searchResult", "loadedMore", "loadFullProductList", "loadMore", "loadProductList", "onLoadMoreRequest", "onProductSelected", "productId", "", "onSearchClosed", "onSearchOpened", "onSearchQueryCleared", "searchProductList", "query", "delayed", "AddProduct", "ViewState", "WooCommerce_wasabiDebug"})
public final class OrderCreationProductSelectionViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.ui.products.ProductListRepository productListRepository = null;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.creation.products.OrderCreationProductSelectionViewModel.ViewState> viewStateData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate viewState$delegate = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.woocommerce.android.model.Product>> productList = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.model.Product>> productListData = null;
    private kotlinx.coroutines.Job searchJob;
    private kotlinx.coroutines.Job loadingJob;
    
    @javax.inject.Inject
    public OrderCreationProductSelectionViewModel(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.ProductListRepository productListRepository) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.creation.products.OrderCreationProductSelectionViewModel.ViewState> getViewStateData() {
        return null;
    }
    
    private final com.woocommerce.android.ui.orders.creation.products.OrderCreationProductSelectionViewModel.ViewState getViewState() {
        return null;
    }
    
    private final void setViewState(com.woocommerce.android.ui.orders.creation.products.OrderCreationProductSelectionViewModel.ViewState p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.model.Product>> getProductListData() {
        return null;
    }
    
    public final boolean isSearchActive() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCurrentQuery() {
        return null;
    }
    
    private final boolean isLoading() {
        return false;
    }
    
    private final void loadProductList(boolean loadMore) {
    }
    
    private final void loadFullProductList(boolean loadMore) {
    }
    
    public final void onProductSelected(long productId) {
    }
    
    public final void searchProductList(@org.jetbrains.annotations.NotNull
    java.lang.String query, boolean loadMore, boolean delayed) {
    }
    
    private final void handleSearchResult(java.util.List<com.woocommerce.android.model.Product> searchResult, boolean loadedMore) {
    }
    
    public final void onSearchOpened() {
    }
    
    public final void onSearchClosed() {
    }
    
    public final void onSearchQueryCleared() {
    }
    
    public final void onLoadMoreRequest() {
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\tJ>\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0012J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0006H\u00d6\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0014H\u00d6\u0001R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u0007\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u0004\u0010\tR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u0002\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u001f"}, d2 = {"Lcom/woocommerce/android/ui/orders/creation/products/OrderCreationProductSelectionViewModel$ViewState;", "Landroid/os/Parcelable;", "isSkeletonShown", "", "isSearchActive", "query", "", "isEmptyViewShowing", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getQuery", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/woocommerce/android/ui/orders/creation/products/OrderCreationProductSelectionViewModel$ViewState;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class ViewState implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean isSkeletonShown = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean isSearchActive = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String query = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean isEmptyViewShowing = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.creation.products.OrderCreationProductSelectionViewModel.ViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.creation.products.OrderCreationProductSelectionViewModel.ViewState copy(@org.jetbrains.annotations.Nullable
        java.lang.Boolean isSkeletonShown, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isSearchActive, @org.jetbrains.annotations.Nullable
        java.lang.String query, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isEmptyViewShowing) {
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
        
        public ViewState() {
            super();
        }
        
        public ViewState(@org.jetbrains.annotations.Nullable
        java.lang.Boolean isSkeletonShown, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isSearchActive, @org.jetbrains.annotations.Nullable
        java.lang.String query, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isEmptyViewShowing) {
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
        public final java.lang.Boolean isSearchActive() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getQuery() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean isEmptyViewShowing() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.creation.products.OrderCreationProductSelectionViewModel.ViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.orders.creation.products.OrderCreationProductSelectionViewModel.ViewState createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.orders.creation.products.OrderCreationProductSelectionViewModel.ViewState[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/orders/creation/products/OrderCreationProductSelectionViewModel$AddProduct;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "productId", "", "(J)V", "getProductId", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
    public static final class AddProduct extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        private final long productId = 0L;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.creation.products.OrderCreationProductSelectionViewModel.AddProduct copy(long productId) {
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
        
        public AddProduct(long productId) {
            super(false);
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getProductId() {
            return 0L;
        }
    }
}