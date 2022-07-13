package com.woocommerce.android.ui.products.categories;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u0002<=B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0018\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020.J\u0006\u0010/\u001a\u00020*J\u001b\u0010/\u001a\u00020*2\b\b\u0002\u00100\u001a\u000201H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00102J\b\u00103\u001a\u0004\u0018\u00010,J\u0006\u00104\u001a\u00020.J\u0012\u00105\u001a\u00020*2\b\b\u0002\u00100\u001a\u000201H\u0002J\u0016\u00106\u001a\u0002012\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020,J\u000e\u00107\u001a\u00020*2\u0006\u0010+\u001a\u00020,J\b\u00108\u001a\u00020*H\u0014J\u0006\u00109\u001a\u00020*J\u000e\u0010:\u001a\u00020*2\u0006\u0010-\u001a\u00020.J\u0006\u0010;\u001a\u00020*R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR+\u0010!\u001a\u00020 2\u0006\u0010\u000f\u001a\u00020 8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b&\u0010\u0017\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0017\u0010\'\u001a\b\u0012\u0004\u0012\u00020 0\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006>"}, d2 = {"Lcom/woocommerce/android/ui/products/categories/AddProductCategoryViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "productCategoriesRepository", "Lcom/woocommerce/android/ui/products/categories/ProductCategoriesRepository;", "networkStatus", "Lcom/woocommerce/android/tools/NetworkStatus;", "resourceProvider", "Lcom/woocommerce/android/viewmodel/ResourceProvider;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/ui/products/categories/ProductCategoriesRepository;Lcom/woocommerce/android/tools/NetworkStatus;Lcom/woocommerce/android/viewmodel/ResourceProvider;)V", "_parentCategories", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/woocommerce/android/ui/products/categories/ProductCategoryItemUiModel;", "<set-?>", "Lcom/woocommerce/android/ui/products/categories/AddProductCategoryViewModel$AddProductCategoryViewState;", "addProductCategoryViewState", "getAddProductCategoryViewState", "()Lcom/woocommerce/android/ui/products/categories/AddProductCategoryViewModel$AddProductCategoryViewState;", "setAddProductCategoryViewState", "(Lcom/woocommerce/android/ui/products/categories/AddProductCategoryViewModel$AddProductCategoryViewState;)V", "addProductCategoryViewState$delegate", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "addProductCategoryViewStateData", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getAddProductCategoryViewStateData", "()Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "parentCategories", "Landroidx/lifecycle/LiveData;", "getParentCategories", "()Landroidx/lifecycle/LiveData;", "Lcom/woocommerce/android/ui/products/categories/AddProductCategoryViewModel$ParentCategoryListViewState;", "parentCategoryListViewState", "getParentCategoryListViewState", "()Lcom/woocommerce/android/ui/products/categories/AddProductCategoryViewModel$ParentCategoryListViewState;", "setParentCategoryListViewState", "(Lcom/woocommerce/android/ui/products/categories/AddProductCategoryViewModel$ParentCategoryListViewState;)V", "parentCategoryListViewState$delegate", "parentCategoryListViewStateData", "getParentCategoryListViewStateData", "addProductCategory", "", "categoryName", "", "parentId", "", "fetchParentCategories", "loadMore", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSelectedParentCategoryName", "getSelectedParentId", "loadParentCategories", "onBackButtonClicked", "onCategoryNameChanged", "onCleared", "onLoadMoreParentCategoriesRequested", "onParentCategorySelected", "refreshParentCategories", "AddProductCategoryViewState", "ParentCategoryListViewState", "WooCommerce_vanillaDebug"})
public final class AddProductCategoryViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.ui.products.categories.ProductCategoriesRepository productCategoriesRepository = null;
    private final com.woocommerce.android.tools.NetworkStatus networkStatus = null;
    private final com.woocommerce.android.viewmodel.ResourceProvider resourceProvider = null;
    @org.jetbrains.annotations.NotNull()
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.products.categories.AddProductCategoryViewModel.AddProductCategoryViewState> addProductCategoryViewStateData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate addProductCategoryViewState$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.products.categories.AddProductCategoryViewModel.ParentCategoryListViewState> parentCategoryListViewStateData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate parentCategoryListViewState$delegate = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.woocommerce.android.ui.products.categories.ProductCategoryItemUiModel>> _parentCategories = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.ui.products.categories.ProductCategoryItemUiModel>> parentCategories = null;
    
    @javax.inject.Inject()
    public AddProductCategoryViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.categories.ProductCategoriesRepository productCategoriesRepository, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.tools.NetworkStatus networkStatus, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.viewmodel.ResourceProvider resourceProvider) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.products.categories.AddProductCategoryViewModel.AddProductCategoryViewState> getAddProductCategoryViewStateData() {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.categories.AddProductCategoryViewModel.AddProductCategoryViewState getAddProductCategoryViewState() {
        return null;
    }
    
    private final void setAddProductCategoryViewState(com.woocommerce.android.ui.products.categories.AddProductCategoryViewModel.AddProductCategoryViewState p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.products.categories.AddProductCategoryViewModel.ParentCategoryListViewState> getParentCategoryListViewStateData() {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.categories.AddProductCategoryViewModel.ParentCategoryListViewState getParentCategoryListViewState() {
        return null;
    }
    
    private final void setParentCategoryListViewState(com.woocommerce.android.ui.products.categories.AddProductCategoryViewModel.ParentCategoryListViewState p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.ui.products.categories.ProductCategoryItemUiModel>> getParentCategories() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public final boolean onBackButtonClicked(@org.jetbrains.annotations.NotNull()
    java.lang.String categoryName, @org.jetbrains.annotations.NotNull()
    java.lang.String parentId) {
        return false;
    }
    
    public final void onCategoryNameChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String categoryName) {
    }
    
    public final void addProductCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String categoryName, long parentId) {
    }
    
    public final void fetchParentCategories() {
    }
    
    public final void onParentCategorySelected(long parentId) {
    }
    
    public final long getSelectedParentId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSelectedParentCategoryName() {
        return null;
    }
    
    /**
     * Refreshes the list of categories by calling the [loadParentCategories] method
     * which eventually checks, if there is anything new to fetch from the server
     */
    public final void refreshParentCategories() {
    }
    
    /**
     * Loads the list of categories from the database or from the server.
     * This depends on whether categories are stored in the database, and if any new ones are
     * required to be fetched.
     *
     * @param loadMore Whether to load more categories after the ones loaded
     */
    private final void loadParentCategories(boolean loadMore) {
    }
    
    /**
     * Triggered when the user scrolls past the point of loaded categories
     * already displayed on the screen or on record.
     */
    public final void onLoadMoreParentCategoriesRequested() {
    }
    
    /**
     * This method is used to fetch the categories from the backend. It does not
     * check the database.
     *
     * @param loadMore Whether this is another page or the first one
     */
    private final java.lang.Object fetchParentCategories(boolean loadMore, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J<\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u001aJ\t\u0010\u001b\u001a\u00020\u0005H\u00d6\u0001J\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00d6\u0001J\t\u0010 \u001a\u00020!H\u00d6\u0001J\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0005H\u00d6\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\'"}, d2 = {"Lcom/woocommerce/android/ui/products/categories/AddProductCategoryViewModel$AddProductCategoryViewState;", "Landroid/os/Parcelable;", "displayProgressDialog", "", "categoryNameErrorMessage", "", "selectedParentId", "", "shouldShowDiscardDialog", "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Long;Z)V", "getCategoryNameErrorMessage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDisplayProgressDialog", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSelectedParentId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getShouldShowDiscardDialog", "()Z", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Long;Z)Lcom/woocommerce/android/ui/products/categories/AddProductCategoryViewModel$AddProductCategoryViewState;", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
    public static final class AddProductCategoryViewState implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean displayProgressDialog = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer categoryNameErrorMessage = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Long selectedParentId = null;
        private final boolean shouldShowDiscardDialog = false;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.products.categories.AddProductCategoryViewModel.AddProductCategoryViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.categories.AddProductCategoryViewModel.AddProductCategoryViewState copy(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean displayProgressDialog, @org.jetbrains.annotations.Nullable()
        java.lang.Integer categoryNameErrorMessage, @org.jetbrains.annotations.Nullable()
        java.lang.Long selectedParentId, boolean shouldShowDiscardDialog) {
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
        
        public AddProductCategoryViewState() {
            super();
        }
        
        public AddProductCategoryViewState(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean displayProgressDialog, @org.jetbrains.annotations.Nullable()
        java.lang.Integer categoryNameErrorMessage, @org.jetbrains.annotations.Nullable()
        java.lang.Long selectedParentId, boolean shouldShowDiscardDialog) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean getDisplayProgressDialog() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getCategoryNameErrorMessage() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long getSelectedParentId() {
            return null;
        }
        
        public final boolean component4() {
            return false;
        }
        
        public final boolean getShouldShowDiscardDialog() {
            return false;
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.products.categories.AddProductCategoryViewModel.AddProductCategoryViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.categories.AddProductCategoryViewModel.AddProductCategoryViewState createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.categories.AddProductCategoryViewModel.AddProductCategoryViewState[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJV\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0014J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016H\u00d6\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\b\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0004\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0005\u0010\u000bR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0007\u0010\u000bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0002\u0010\u000b\u00a8\u0006\""}, d2 = {"Lcom/woocommerce/android/ui/products/categories/AddProductCategoryViewModel$ParentCategoryListViewState;", "Landroid/os/Parcelable;", "isSkeletonShown", "", "isLoading", "isLoadingMore", "canLoadMore", "isRefreshing", "isEmptyViewVisible", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getCanLoadMore", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/woocommerce/android/ui/products/categories/AddProductCategoryViewModel$ParentCategoryListViewState;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
    public static final class ParentCategoryListViewState implements android.os.Parcelable {
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
        private final java.lang.Boolean isEmptyViewVisible = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.products.categories.AddProductCategoryViewModel.ParentCategoryListViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.categories.AddProductCategoryViewModel.ParentCategoryListViewState copy(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean isSkeletonShown, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isLoading, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isLoadingMore, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean canLoadMore, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isRefreshing, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isEmptyViewVisible) {
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
        
        public ParentCategoryListViewState() {
            super();
        }
        
        public ParentCategoryListViewState(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean isSkeletonShown, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isLoading, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isLoadingMore, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean canLoadMore, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isRefreshing, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isEmptyViewVisible) {
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
        public final java.lang.Boolean component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isEmptyViewVisible() {
            return null;
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.products.categories.AddProductCategoryViewModel.ParentCategoryListViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.categories.AddProductCategoryViewModel.ParentCategoryListViewState createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.categories.AddProductCategoryViewModel.ParentCategoryListViewState[] newArray(int size) {
                return null;
            }
        }
    }
}