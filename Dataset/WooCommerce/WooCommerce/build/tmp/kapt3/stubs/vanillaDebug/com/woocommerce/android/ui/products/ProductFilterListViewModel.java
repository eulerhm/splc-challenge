package com.woocommerce.android.ui.products;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\b\u0007\u0018\u0000 ^2\u00020\u0001:\u0005^_`abB\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ$\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00100?2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00100?2\u0006\u0010A\u001a\u00020BH\u0002J\b\u0010C\u001a\u00020\u000eH\u0002J\u000e\u0010D\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002J\n\u0010E\u001a\u0004\u0018\u000108H\u0002J\n\u0010F\u001a\u0004\u0018\u000108H\u0002J\n\u0010G\u001a\u0004\u0018\u000108H\u0002J\n\u0010H\u001a\u0004\u0018\u000108H\u0002J\u0006\u0010I\u001a\u000208J\b\u0010J\u001a\u00020BH\u0002J\b\u0010K\u001a\u00020BH\u0002J\b\u0010L\u001a\u00020BH\u0002J\u000e\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020PJ\u0006\u0010Q\u001a\u00020NJ\u0011\u0010R\u001a\u00020NH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010SJ\u0006\u0010T\u001a\u00020BJ\u0006\u0010U\u001a\u00020NJ\u0016\u0010V\u001a\u00020N2\u0006\u0010O\u001a\u00020P2\u0006\u0010W\u001a\u00020\u0010J\u000e\u0010X\u001a\u00020N2\u0006\u0010Y\u001a\u00020PJ\u0006\u0010Z\u001a\u00020NJ\u000e\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00100\rH\u0002J\u0016\u0010\\\u001a\u00020N2\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00100\rH\u0002R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\r0\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020 8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b&\u0010\'\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020 0)\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+R+\u0010-\u001a\u00020,2\u0006\u0010\u001f\u001a\u00020,8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b2\u0010\'\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0017\u00103\u001a\b\u0012\u0004\u0012\u00020,0)\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010+R\'\u00105\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u000208068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b9\u0010:R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010=\u001a\u0004\u0018\u000108X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006c"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductFilterListViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "resourceProvider", "Lcom/woocommerce/android/viewmodel/ResourceProvider;", "productCategoriesRepository", "Lcom/woocommerce/android/ui/products/categories/ProductCategoriesRepository;", "networkStatus", "Lcom/woocommerce/android/tools/NetworkStatus;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/viewmodel/ResourceProvider;Lcom/woocommerce/android/ui/products/categories/ProductCategoriesRepository;Lcom/woocommerce/android/tools/NetworkStatus;)V", "_filterListItems", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/woocommerce/android/ui/products/ProductFilterListViewModel$FilterListItemUiModel;", "_filterOptionListItems", "Lcom/woocommerce/android/ui/products/ProductFilterListViewModel$FilterListOptionItemUiModel;", "arguments", "Lcom/woocommerce/android/ui/products/ProductFilterListFragmentArgs;", "getArguments", "()Lcom/woocommerce/android/ui/products/ProductFilterListFragmentArgs;", "arguments$delegate", "Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "filterListItems", "Landroidx/lifecycle/LiveData;", "getFilterListItems", "()Landroidx/lifecycle/LiveData;", "filterOptionListItems", "getFilterOptionListItems", "productCategories", "Lcom/woocommerce/android/model/ProductCategory;", "<set-?>", "Lcom/woocommerce/android/ui/products/ProductFilterListViewModel$ProductFilterListViewState;", "productFilterListViewState", "getProductFilterListViewState", "()Lcom/woocommerce/android/ui/products/ProductFilterListViewModel$ProductFilterListViewState;", "setProductFilterListViewState", "(Lcom/woocommerce/android/ui/products/ProductFilterListViewModel$ProductFilterListViewState;)V", "productFilterListViewState$delegate", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "productFilterListViewStateData", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getProductFilterListViewStateData", "()Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "Lcom/woocommerce/android/ui/products/ProductFilterListViewModel$ProductFilterOptionListViewState;", "productFilterOptionListViewState", "getProductFilterOptionListViewState", "()Lcom/woocommerce/android/ui/products/ProductFilterListViewModel$ProductFilterOptionListViewState;", "setProductFilterOptionListViewState", "(Lcom/woocommerce/android/ui/products/ProductFilterListViewModel$ProductFilterOptionListViewState;)V", "productFilterOptionListViewState$delegate", "productFilterOptionListViewStateData", "getProductFilterOptionListViewStateData", "productFilterOptions", "", "Lorg/wordpress/android/fluxc/store/WCProductStore$ProductFilterOption;", "", "getProductFilterOptions", "()Ljava/util/Map;", "productFilterOptions$delegate", "Lkotlin/Lazy;", "selectedCategoryName", "addDefaultFilterOption", "", "filterOptionList", "isDefaultFilterOptionSelected", "", "buildCategoryFilterListItemUiModel", "buildFilterListItemUiModel", "getFilterByProductCategory", "getFilterByProductStatus", "getFilterByProductType", "getFilterByStockStatus", "getFilterString", "hasChanges", "isFromProductListWithExistingCategoryFilter", "isProductCategoriesPartiallyFilled", "loadFilterOptions", "", "selectedFilterListItemPosition", "", "loadFilters", "maybeLoadCategories", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onBackButtonClicked", "onClearFilterSelected", "onFilterOptionItemSelected", "selectedFilterItem", "onLoadMoreRequested", "selectedFilterItemPosition", "onShowProductsClicked", "productCategoriesToOptionListItems", "updateCategoryFilterListItem", "categoryOptions", "Companion", "FilterListItemUiModel", "FilterListOptionItemUiModel", "ProductFilterListViewState", "ProductFilterOptionListViewState", "WooCommerce_vanillaDebug"})
public final class ProductFilterListViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.viewmodel.ResourceProvider resourceProvider = null;
    private final com.woocommerce.android.ui.products.categories.ProductCategoriesRepository productCategoriesRepository = null;
    private final com.woocommerce.android.tools.NetworkStatus networkStatus = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.products.ProductFilterListViewModel.Companion Companion = null;
    private static final java.lang.String KEY_PRODUCT_FILTER_OPTIONS = "key_product_filter_options";
    private static final java.lang.String KEY_PRODUCT_FILTER_SELECTED_CATEGORY_NAME = "key_product_filter_selected_category_name";
    private final com.woocommerce.android.viewmodel.NavArgsLazy arguments$delegate = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.woocommerce.android.ui.products.ProductFilterListViewModel.FilterListItemUiModel>> _filterListItems = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.ui.products.ProductFilterListViewModel.FilterListItemUiModel>> filterListItems = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.woocommerce.android.ui.products.ProductFilterListViewModel.FilterListOptionItemUiModel>> _filterOptionListItems = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.ui.products.ProductFilterListViewModel.FilterListOptionItemUiModel>> filterOptionListItems = null;
    @org.jetbrains.annotations.NotNull()
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.products.ProductFilterListViewModel.ProductFilterListViewState> productFilterListViewStateData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate productFilterListViewState$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.products.ProductFilterListViewModel.ProductFilterOptionListViewState> productFilterOptionListViewStateData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate productFilterOptionListViewState$delegate = null;
    private java.util.List<com.woocommerce.android.model.ProductCategory> productCategories;
    
    /**
     * Holds the filter properties (stock_status, status, type, category) already selected by the user in a [Map]
     * where the key is the [ProductFilterOption] and value is the slug associated with the property.
     *
     * If no filters are previously selected, the map is empty.
     */
    private final kotlin.Lazy productFilterOptions$delegate = null;
    private java.lang.String selectedCategoryName;
    
    @javax.inject.Inject()
    public ProductFilterListViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.viewmodel.ResourceProvider resourceProvider, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.categories.ProductCategoriesRepository productCategoriesRepository, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.tools.NetworkStatus networkStatus) {
        super(null);
    }
    
    private final com.woocommerce.android.ui.products.ProductFilterListFragmentArgs getArguments() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.ui.products.ProductFilterListViewModel.FilterListItemUiModel>> getFilterListItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.ui.products.ProductFilterListViewModel.FilterListOptionItemUiModel>> getFilterOptionListItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.products.ProductFilterListViewModel.ProductFilterListViewState> getProductFilterListViewStateData() {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.ProductFilterListViewModel.ProductFilterListViewState getProductFilterListViewState() {
        return null;
    }
    
    private final void setProductFilterListViewState(com.woocommerce.android.ui.products.ProductFilterListViewModel.ProductFilterListViewState p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.products.ProductFilterListViewModel.ProductFilterOptionListViewState> getProductFilterOptionListViewStateData() {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.ProductFilterListViewModel.ProductFilterOptionListViewState getProductFilterOptionListViewState() {
        return null;
    }
    
    private final void setProductFilterOptionListViewState(com.woocommerce.android.ui.products.ProductFilterListViewModel.ProductFilterOptionListViewState p0) {
    }
    
    /**
     * Holds the filter properties (stock_status, status, type, category) already selected by the user in a [Map]
     * where the key is the [ProductFilterOption] and value is the slug associated with the property.
     *
     * If no filters are previously selected, the map is empty.
     */
    private final java.util.Map<org.wordpress.android.fluxc.store.WCProductStore.ProductFilterOption, java.lang.String> getProductFilterOptions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFilterString() {
        return null;
    }
    
    private final java.lang.String getFilterByStockStatus() {
        return null;
    }
    
    private final java.lang.String getFilterByProductStatus() {
        return null;
    }
    
    private final java.lang.String getFilterByProductType() {
        return null;
    }
    
    private final java.lang.String getFilterByProductCategory() {
        return null;
    }
    
    private final java.lang.Object maybeLoadCategories(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final boolean isFromProductListWithExistingCategoryFilter() {
        return false;
    }
    
    private final boolean isProductCategoriesPartiallyFilled() {
        return false;
    }
    
    public final void loadFilters() {
    }
    
    public final void loadFilterOptions(int selectedFilterListItemPosition) {
    }
    
    private final java.util.List<com.woocommerce.android.ui.products.ProductFilterListViewModel.FilterListOptionItemUiModel> productCategoriesToOptionListItems() {
        return null;
    }
    
    public final boolean onBackButtonClicked() {
        return false;
    }
    
    public final void onClearFilterSelected() {
    }
    
    public final void onFilterOptionItemSelected(int selectedFilterListItemPosition, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.ProductFilterListViewModel.FilterListOptionItemUiModel selectedFilterItem) {
    }
    
    public final void onShowProductsClicked() {
    }
    
    private final java.util.List<com.woocommerce.android.ui.products.ProductFilterListViewModel.FilterListItemUiModel> buildFilterListItemUiModel() {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.ProductFilterListViewModel.FilterListItemUiModel buildCategoryFilterListItemUiModel() {
        return null;
    }
    
    /**
     * The [FilterListOptionItemUiModel] list includes a default option of `Any`
     * which is added to the list by this method before updating the UI
     */
    private final java.util.List<com.woocommerce.android.ui.products.ProductFilterListViewModel.FilterListOptionItemUiModel> addDefaultFilterOption(java.util.List<com.woocommerce.android.ui.products.ProductFilterListViewModel.FilterListOptionItemUiModel> filterOptionList, boolean isDefaultFilterOptionSelected) {
        return null;
    }
    
    private final boolean hasChanges() {
        return false;
    }
    
    public final void onLoadMoreRequested(int selectedFilterItemPosition) {
    }
    
    private final void updateCategoryFilterListItem(java.util.List<com.woocommerce.android.ui.products.ProductFilterListViewModel.FilterListOptionItemUiModel> categoryOptions) {
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\bJ&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0011H\u00d6\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u001c"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductFilterListViewModel$ProductFilterListViewState;", "Landroid/os/Parcelable;", "screenTitle", "", "displayClearButton", "", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "getDisplayClearButton", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getScreenTitle", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/woocommerce/android/ui/products/ProductFilterListViewModel$ProductFilterListViewState;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
    public static final class ProductFilterListViewState implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String screenTitle = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean displayClearButton = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.products.ProductFilterListViewModel.ProductFilterListViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.ProductFilterListViewModel.ProductFilterListViewState copy(@org.jetbrains.annotations.Nullable()
        java.lang.String screenTitle, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean displayClearButton) {
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
        
        public ProductFilterListViewState() {
            super();
        }
        
        public ProductFilterListViewState(@org.jetbrains.annotations.Nullable()
        java.lang.String screenTitle, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean displayClearButton) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getScreenTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean getDisplayClearButton() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.products.ProductFilterListViewModel.ProductFilterListViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.ProductFilterListViewModel.ProductFilterListViewState createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.ProductFilterListViewModel.ProductFilterListViewState[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\bJ2\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0010J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0012H\u00d6\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0006\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0004\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u001d"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductFilterListViewModel$ProductFilterOptionListViewState;", "Landroid/os/Parcelable;", "screenTitle", "", "isSkeletonShown", "", "isLoadingMore", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getScreenTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/woocommerce/android/ui/products/ProductFilterListViewModel$ProductFilterOptionListViewState;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
    public static final class ProductFilterOptionListViewState implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String screenTitle = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isSkeletonShown = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isLoadingMore = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.products.ProductFilterListViewModel.ProductFilterOptionListViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.ProductFilterListViewModel.ProductFilterOptionListViewState copy(@org.jetbrains.annotations.Nullable()
        java.lang.String screenTitle, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isSkeletonShown, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isLoadingMore) {
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
        
        public ProductFilterOptionListViewState() {
            super();
        }
        
        public ProductFilterOptionListViewState(@org.jetbrains.annotations.Nullable()
        java.lang.String screenTitle, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isSkeletonShown, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isLoadingMore) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getScreenTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isSkeletonShown() {
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
        
        @java.lang.Override()
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.products.ProductFilterListViewModel.ProductFilterOptionListViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.ProductFilterListViewModel.ProductFilterOptionListViewState createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.ProductFilterListViewModel.ProductFilterOptionListViewState[] newArray(int size) {
                return null;
            }
        }
    }
    
    /**
     * [filterItemKey] includes the [ProductFilterOption] which can be [STATUS], [TYPE], [CATEGORY], or [STOCK_STATUS]
     * [filterItemName] is the display name of the filter list item i.e Product Status, Stock Status
     * [filterOptionListItems] includes a list of [FilterListOptionItemUiModel]
     */
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J-\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0017H\u00d6\u0001J\u000e\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u0000J\t\u0010\u001f\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0017H\u00d6\u0001J \u0010%\u001a\u00020\u0019*\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\'"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductFilterListViewModel$FilterListItemUiModel;", "Landroid/os/Parcelable;", "filterItemKey", "Lorg/wordpress/android/fluxc/store/WCProductStore$ProductFilterOption;", "filterItemName", "", "filterOptionListItems", "", "Lcom/woocommerce/android/ui/products/ProductFilterListViewModel$FilterListOptionItemUiModel;", "(Lorg/wordpress/android/fluxc/store/WCProductStore$ProductFilterOption;Ljava/lang/String;Ljava/util/List;)V", "getFilterItemKey", "()Lorg/wordpress/android/fluxc/store/WCProductStore$ProductFilterOption;", "getFilterItemName", "()Ljava/lang/String;", "getFilterOptionListItems", "()Ljava/util/List;", "setFilterOptionListItems", "(Ljava/util/List;)V", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "isSameFilter", "updatedFilterOption", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "isSameFilterOptions", "updatedFilterOptions", "WooCommerce_vanillaDebug"})
    public static final class FilterListItemUiModel implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        private final org.wordpress.android.fluxc.store.WCProductStore.ProductFilterOption filterItemKey = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String filterItemName = null;
        @org.jetbrains.annotations.NotNull()
        private java.util.List<com.woocommerce.android.ui.products.ProductFilterListViewModel.FilterListOptionItemUiModel> filterOptionListItems;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.products.ProductFilterListViewModel.FilterListItemUiModel> CREATOR = null;
        
        /**
         * [filterItemKey] includes the [ProductFilterOption] which can be [STATUS], [TYPE], [CATEGORY], or [STOCK_STATUS]
         * [filterItemName] is the display name of the filter list item i.e Product Status, Stock Status
         * [filterOptionListItems] includes a list of [FilterListOptionItemUiModel]
         */
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.ProductFilterListViewModel.FilterListItemUiModel copy(@org.jetbrains.annotations.NotNull()
        org.wordpress.android.fluxc.store.WCProductStore.ProductFilterOption filterItemKey, @org.jetbrains.annotations.NotNull()
        java.lang.String filterItemName, @org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.ui.products.ProductFilterListViewModel.FilterListOptionItemUiModel> filterOptionListItems) {
            return null;
        }
        
        /**
         * [filterItemKey] includes the [ProductFilterOption] which can be [STATUS], [TYPE], [CATEGORY], or [STOCK_STATUS]
         * [filterItemName] is the display name of the filter list item i.e Product Status, Stock Status
         * [filterOptionListItems] includes a list of [FilterListOptionItemUiModel]
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * [filterItemKey] includes the [ProductFilterOption] which can be [STATUS], [TYPE], [CATEGORY], or [STOCK_STATUS]
         * [filterItemName] is the display name of the filter list item i.e Product Status, Stock Status
         * [filterOptionListItems] includes a list of [FilterListOptionItemUiModel]
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * [filterItemKey] includes the [ProductFilterOption] which can be [STATUS], [TYPE], [CATEGORY], or [STOCK_STATUS]
         * [filterItemName] is the display name of the filter list item i.e Product Status, Stock Status
         * [filterOptionListItems] includes a list of [FilterListOptionItemUiModel]
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public FilterListItemUiModel(@org.jetbrains.annotations.NotNull()
        org.wordpress.android.fluxc.store.WCProductStore.ProductFilterOption filterItemKey, @org.jetbrains.annotations.NotNull()
        java.lang.String filterItemName, @org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.ui.products.ProductFilterListViewModel.FilterListOptionItemUiModel> filterOptionListItems) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wordpress.android.fluxc.store.WCProductStore.ProductFilterOption component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wordpress.android.fluxc.store.WCProductStore.ProductFilterOption getFilterItemKey() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFilterItemName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.ui.products.ProductFilterListViewModel.FilterListOptionItemUiModel> component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.ui.products.ProductFilterListViewModel.FilterListOptionItemUiModel> getFilterOptionListItems() {
            return null;
        }
        
        public final void setFilterOptionListItems(@org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.ui.products.ProductFilterListViewModel.FilterListOptionItemUiModel> p0) {
        }
        
        public final boolean isSameFilter(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.products.ProductFilterListViewModel.FilterListItemUiModel updatedFilterOption) {
            return false;
        }
        
        /**
         * Compares this filter's options with the passed list, returns true only if both lists contain
         * the same filter options in the same order
         */
        private final boolean isSameFilterOptions(java.util.List<com.woocommerce.android.ui.products.ProductFilterListViewModel.FilterListOptionItemUiModel> $this$isSameFilterOptions, java.util.List<com.woocommerce.android.ui.products.ProductFilterListViewModel.FilterListOptionItemUiModel> updatedFilterOptions) {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.products.ProductFilterListViewModel.FilterListItemUiModel> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.ProductFilterListViewModel.FilterListItemUiModel createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.ProductFilterListViewModel.FilterListItemUiModel[] newArray(int size) {
                return null;
            }
        }
    }
    
    /**
     * [filterOptionItemName] is the display name of the filter option
     * Eg: for stock status, this would be In Stock, Out of stock.
     * for product type, this would be Simple, Grouped.
     * for product type, this would be Pending, Draft
     *
     * [filterOptionItemValue] is the slug for the filter option.
     * Eg: for stock status, this would be instock, outofstock
     * for product type, this would be simple, grouped, variable
     * for product status, this would be pending, draft
     * for category, this would be category ID
     */
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0001$B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\bH\u00c6\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\t\u0010\u0017\u001a\u00020\bH\u00d6\u0001J\u0013\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u00d6\u0003J\t\u0010\u001b\u001a\u00020\bH\u00d6\u0001J\u000e\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0000J\t\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\bH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\rR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006%"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductFilterListViewModel$FilterListOptionItemUiModel;", "Landroid/os/Parcelable;", "filterOptionItemName", "", "filterOptionItemValue", "isSelected", "", "margin", "", "(Ljava/lang/String;Ljava/lang/String;ZI)V", "getFilterOptionItemName", "()Ljava/lang/String;", "getFilterOptionItemValue", "()Z", "getMargin", "()I", "setMargin", "(I)V", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "other", "", "hashCode", "isSameFilterOption", "updatedFilterOption", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "WooCommerce_vanillaDebug"})
    public static final class FilterListOptionItemUiModel implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String filterOptionItemName = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String filterOptionItemValue = null;
        private final boolean isSelected = false;
        private int margin;
        @org.jetbrains.annotations.NotNull()
        public static final com.woocommerce.android.ui.products.ProductFilterListViewModel.FilterListOptionItemUiModel.Companion Companion = null;
        @androidx.annotation.DimenRes()
        public static final int DEFAULT_FILTER_OPTION_MARGIN = 0;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.products.ProductFilterListViewModel.FilterListOptionItemUiModel> CREATOR = null;
        
        /**
         * [filterOptionItemName] is the display name of the filter option
         * Eg: for stock status, this would be In Stock, Out of stock.
         * for product type, this would be Simple, Grouped.
         * for product type, this would be Pending, Draft
         *
         * [filterOptionItemValue] is the slug for the filter option.
         * Eg: for stock status, this would be instock, outofstock
         * for product type, this would be simple, grouped, variable
         * for product status, this would be pending, draft
         * for category, this would be category ID
         */
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.ProductFilterListViewModel.FilterListOptionItemUiModel copy(@org.jetbrains.annotations.NotNull()
        java.lang.String filterOptionItemName, @org.jetbrains.annotations.NotNull()
        java.lang.String filterOptionItemValue, boolean isSelected, int margin) {
            return null;
        }
        
        /**
         * [filterOptionItemName] is the display name of the filter option
         * Eg: for stock status, this would be In Stock, Out of stock.
         * for product type, this would be Simple, Grouped.
         * for product type, this would be Pending, Draft
         *
         * [filterOptionItemValue] is the slug for the filter option.
         * Eg: for stock status, this would be instock, outofstock
         * for product type, this would be simple, grouped, variable
         * for product status, this would be pending, draft
         * for category, this would be category ID
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * [filterOptionItemName] is the display name of the filter option
         * Eg: for stock status, this would be In Stock, Out of stock.
         * for product type, this would be Simple, Grouped.
         * for product type, this would be Pending, Draft
         *
         * [filterOptionItemValue] is the slug for the filter option.
         * Eg: for stock status, this would be instock, outofstock
         * for product type, this would be simple, grouped, variable
         * for product status, this would be pending, draft
         * for category, this would be category ID
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * [filterOptionItemName] is the display name of the filter option
         * Eg: for stock status, this would be In Stock, Out of stock.
         * for product type, this would be Simple, Grouped.
         * for product type, this would be Pending, Draft
         *
         * [filterOptionItemValue] is the slug for the filter option.
         * Eg: for stock status, this would be instock, outofstock
         * for product type, this would be simple, grouped, variable
         * for product status, this would be pending, draft
         * for category, this would be category ID
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public FilterListOptionItemUiModel(@org.jetbrains.annotations.NotNull()
        java.lang.String filterOptionItemName, @org.jetbrains.annotations.NotNull()
        java.lang.String filterOptionItemValue, boolean isSelected, int margin) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFilterOptionItemName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFilterOptionItemValue() {
            return null;
        }
        
        public final boolean component3() {
            return false;
        }
        
        public final boolean isSelected() {
            return false;
        }
        
        public final int component4() {
            return 0;
        }
        
        public final int getMargin() {
            return 0;
        }
        
        public final void setMargin(int p0) {
        }
        
        public final boolean isSameFilterOption(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.products.ProductFilterListViewModel.FilterListOptionItemUiModel updatedFilterOption) {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.products.ProductFilterListViewModel.FilterListOptionItemUiModel> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.ProductFilterListViewModel.FilterListOptionItemUiModel createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.ProductFilterListViewModel.FilterListOptionItemUiModel[] newArray(int size) {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductFilterListViewModel$FilterListOptionItemUiModel$Companion;", "", "()V", "DEFAULT_FILTER_OPTION_MARGIN", "", "WooCommerce_vanillaDebug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductFilterListViewModel$Companion;", "", "()V", "KEY_PRODUCT_FILTER_OPTIONS", "", "KEY_PRODUCT_FILTER_SELECTED_CATEGORY_NAME", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}