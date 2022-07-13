package com.woocommerce.android.ui.products;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001CB\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\'\u00101\u001a\u0002022\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000b2\u0006\u00104\u001a\u00020\u0012H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00105J\u0006\u00106\u001a\u000207J\u0012\u00108\u001a\u0002022\b\b\u0002\u00104\u001a\u00020\u0012H\u0002J\u0006\u00109\u001a\u000202J\u0006\u0010:\u001a\u00020\u0012J\b\u0010;\u001a\u000202H\u0014J\u000e\u0010<\u001a\u0002022\u0006\u0010=\u001a\u00020\fJ\u0014\u0010>\u001a\u0002022\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000bJ\u0010\u0010?\u001a\u0002022\u0006\u0010@\u001a\u00020AH\u0002J\b\u0010B\u001a\u000202H\u0002R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R+\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020\"8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\"0+\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b/\u00100\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006D"}, d2 = {"Lcom/woocommerce/android/ui/products/GroupedProductListViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "networkStatus", "Lcom/woocommerce/android/tools/NetworkStatus;", "groupedProductListRepository", "Lcom/woocommerce/android/ui/products/GroupedProductListRepository;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/tools/NetworkStatus;Lcom/woocommerce/android/ui/products/GroupedProductListRepository;)V", "_productList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/woocommerce/android/model/Product;", "groupedProductListType", "Lcom/woocommerce/android/ui/products/GroupedProductListType;", "getGroupedProductListType", "()Lcom/woocommerce/android/ui/products/GroupedProductListType;", "hasChanges", "", "getHasChanges", "()Z", "navArgs", "Lcom/woocommerce/android/ui/products/GroupedProductListFragmentArgs;", "getNavArgs", "()Lcom/woocommerce/android/ui/products/GroupedProductListFragmentArgs;", "navArgs$delegate", "Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "originalProductIds", "", "productList", "Landroidx/lifecycle/LiveData;", "getProductList", "()Landroidx/lifecycle/LiveData;", "<set-?>", "Lcom/woocommerce/android/ui/products/GroupedProductListViewModel$GroupedProductListViewState;", "productListViewState", "getProductListViewState", "()Lcom/woocommerce/android/ui/products/GroupedProductListViewModel$GroupedProductListViewState;", "setProductListViewState", "(Lcom/woocommerce/android/ui/products/GroupedProductListViewModel$GroupedProductListViewState;)V", "productListViewState$delegate", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "productListViewStateData", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getProductListViewStateData", "()Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "selectedProductIds", "getSelectedProductIds", "()Ljava/util/List;", "fetchProducts", "", "groupedProductIds", "loadMore", "(Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getKeyForGroupedProductListType", "", "loadProducts", "onAddProductButtonClicked", "onBackButtonClicked", "onCleared", "onProductDeleted", "product", "onProductsAdded", "track", "action", "Lcom/woocommerce/android/analytics/AnalyticsTracker$Companion$ConnectedProductsListAction;", "updateProductList", "GroupedProductListViewState", "WooCommerce_wasabiDebug"})
public final class GroupedProductListViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.tools.NetworkStatus networkStatus = null;
    private final com.woocommerce.android.ui.products.GroupedProductListRepository groupedProductListRepository = null;
    private final com.woocommerce.android.viewmodel.NavArgsLazy navArgs$delegate = null;
    private final java.util.List<java.lang.Long> originalProductIds = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.woocommerce.android.model.Product>> _productList = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.model.Product>> productList = null;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.products.GroupedProductListViewModel.GroupedProductListViewState> productListViewStateData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate productListViewState$delegate = null;
    
    @javax.inject.Inject
    public GroupedProductListViewModel(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.NetworkStatus networkStatus, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.GroupedProductListRepository groupedProductListRepository) {
        super(null);
    }
    
    private final com.woocommerce.android.ui.products.GroupedProductListFragmentArgs getNavArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.model.Product>> getProductList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.products.GroupedProductListViewModel.GroupedProductListViewState> getProductListViewStateData() {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.GroupedProductListViewModel.GroupedProductListViewState getProductListViewState() {
        return null;
    }
    
    private final void setProductListViewState(com.woocommerce.android.ui.products.GroupedProductListViewModel.GroupedProductListViewState p0) {
    }
    
    private final java.util.List<java.lang.Long> getSelectedProductIds() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.ui.products.GroupedProductListType getGroupedProductListType() {
        return null;
    }
    
    public final boolean getHasChanges() {
        return false;
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getKeyForGroupedProductListType() {
        return null;
    }
    
    public final void onProductsAdded(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Long> selectedProductIds) {
    }
    
    public final void onProductDeleted(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.Product product) {
    }
    
    private final void updateProductList() {
    }
    
    public final void onAddProductButtonClicked() {
    }
    
    public final boolean onBackButtonClicked() {
        return false;
    }
    
    private final void loadProducts(boolean loadMore) {
    }
    
    private final java.lang.Object fetchProducts(java.util.List<java.lang.Long> groupedProductIds, boolean loadMore, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final void track(com.woocommerce.android.analytics.AnalyticsTracker.Companion.ConnectedProductsListAction action) {
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\bJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJ6\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0013J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015H\u00d6\u0001R\u0011\u0010\t\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0007\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0005\u0010\u000bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006!"}, d2 = {"Lcom/woocommerce/android/ui/products/GroupedProductListViewModel$GroupedProductListViewState;", "Landroid/os/Parcelable;", "selectedProductIds", "", "", "isSkeletonShown", "", "isLoadingMore", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "isAddProductButtonVisible", "()Z", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSelectedProductIds", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/woocommerce/android/ui/products/GroupedProductListViewModel$GroupedProductListViewState;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class GroupedProductListViewState implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull
        private final java.util.List<java.lang.Long> selectedProductIds = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean isSkeletonShown = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean isLoadingMore = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.products.GroupedProductListViewModel.GroupedProductListViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.GroupedProductListViewModel.GroupedProductListViewState copy(@org.jetbrains.annotations.NotNull
        java.util.List<java.lang.Long> selectedProductIds, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isSkeletonShown, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isLoadingMore) {
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
        
        public GroupedProductListViewState(@org.jetbrains.annotations.NotNull
        java.util.List<java.lang.Long> selectedProductIds, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isSkeletonShown, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isLoadingMore) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.lang.Long> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.lang.Long> getSelectedProductIds() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean isSkeletonShown() {
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
        
        public final boolean isAddProductButtonVisible() {
            return false;
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.products.GroupedProductListViewModel.GroupedProductListViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.products.GroupedProductListViewModel.GroupedProductListViewState createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.products.GroupedProductListViewModel.GroupedProductListViewState[] newArray(int size) {
                return null;
            }
        }
    }
}