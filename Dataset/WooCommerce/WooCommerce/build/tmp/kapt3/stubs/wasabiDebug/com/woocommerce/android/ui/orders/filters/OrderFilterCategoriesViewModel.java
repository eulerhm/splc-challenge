package com.woocommerce.android.ui.orders.filters;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 A2\u00020\u0001:\u0002ABB?\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J\u0016\u0010(\u001a\u00020#2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0002J\u000e\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u001fH\u0002J\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u001fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J\u0006\u0010-\u001a\u00020.J\u0006\u0010/\u001a\u000200J\u000e\u00101\u001a\u0002002\u0006\u00102\u001a\u00020 J\u000e\u00103\u001a\u0002002\u0006\u00104\u001a\u00020 J\u0006\u00105\u001a\u000200J\u0016\u00106\u001a\u0002002\f\u00107\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0002J\b\u00108\u001a\u000200H\u0002J\u0018\u00109\u001a\u00020 2\u0006\u0010:\u001a\u00020 2\u0006\u0010;\u001a\u00020 H\u0002J\"\u0010<\u001a\u00020=*\b\u0012\u0004\u0012\u00020+0\u001f2\u0006\u0010>\u001a\u00020?2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u0012\u0010@\u001a\u00020.*\b\u0012\u0004\u0012\u00020 0\u001fH\u0002R+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00128B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00120\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006C"}, d2 = {"Lcom/woocommerce/android/ui/orders/filters/OrderFilterCategoriesViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "resourceProvider", "Lcom/woocommerce/android/viewmodel/ResourceProvider;", "getOrderStatusFilterOptions", "Lcom/woocommerce/android/ui/orders/filters/domain/GetOrderStatusFilterOptions;", "getDateRangeFilterOptions", "Lcom/woocommerce/android/ui/orders/filters/domain/GetDateRangeFilterOptions;", "orderFilterRepository", "Lcom/woocommerce/android/ui/orders/filters/data/OrderFiltersRepository;", "getTrackingForFilterSelection", "Lcom/woocommerce/android/ui/orders/filters/domain/GetTrackingForFilterSelection;", "dateUtils", "Lcom/woocommerce/android/util/DateUtils;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/viewmodel/ResourceProvider;Lcom/woocommerce/android/ui/orders/filters/domain/GetOrderStatusFilterOptions;Lcom/woocommerce/android/ui/orders/filters/domain/GetDateRangeFilterOptions;Lcom/woocommerce/android/ui/orders/filters/data/OrderFiltersRepository;Lcom/woocommerce/android/ui/orders/filters/domain/GetTrackingForFilterSelection;Lcom/woocommerce/android/util/DateUtils;)V", "<set-?>", "Lcom/woocommerce/android/ui/orders/filters/OrderFilterCategoriesViewModel$OrderFilterCategories;", "_categories", "get_categories", "()Lcom/woocommerce/android/ui/orders/filters/OrderFilterCategoriesViewModel$OrderFilterCategories;", "set_categories", "(Lcom/woocommerce/android/ui/orders/filters/OrderFilterCategoriesViewModel$OrderFilterCategories;)V", "_categories$delegate", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "categories", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getCategories", "()Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "oldFilterSelection", "", "Lcom/woocommerce/android/ui/orders/filters/model/OrderFilterCategoryUiModel;", "orderFilterCategoryViewState", "Landroidx/lifecycle/LiveData;", "Lcom/woocommerce/android/ui/orders/filters/model/OrderFilterCategoryListViewState;", "getOrderFilterCategoryViewState", "()Landroidx/lifecycle/LiveData;", "buildFilterListUiModel", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFilterCategoryViewState", "filterCategories", "loadDateRangeFilterOptions", "Lcom/woocommerce/android/ui/orders/filters/model/OrderFilterOptionUiModel;", "loadOrderStatusFilterOptions", "onBackPressed", "", "onClearFilters", "", "onFilterCategorySelected", "filterCategory", "onFilterOptionsUpdated", "updatedCategory", "onShowOrdersClicked", "saveFiltersSelection", "selectedFilters", "trackFilterSelection", "updateFilterOptionsForCategory", "old", "new", "getDisplayValue", "", "selectedFilterCategoryKey", "Lcom/woocommerce/android/ui/orders/filters/data/OrderListFilterCategory;", "isAnyFilterSelected", "Companion", "OrderFilterCategories", "WooCommerce_wasabiDebug"})
public final class OrderFilterCategoriesViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.viewmodel.ResourceProvider resourceProvider = null;
    private final com.woocommerce.android.ui.orders.filters.domain.GetOrderStatusFilterOptions getOrderStatusFilterOptions = null;
    private final com.woocommerce.android.ui.orders.filters.domain.GetDateRangeFilterOptions getDateRangeFilterOptions = null;
    private final com.woocommerce.android.ui.orders.filters.data.OrderFiltersRepository orderFilterRepository = null;
    private final com.woocommerce.android.ui.orders.filters.domain.GetTrackingForFilterSelection getTrackingForFilterSelection = null;
    private final com.woocommerce.android.util.DateUtils dateUtils = null;
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.orders.filters.OrderFilterCategoriesViewModel.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String OLD_FILTER_SELECTION_KEY = "old_filter_selection_key";
    private java.util.List<com.woocommerce.android.ui.orders.filters.model.OrderFilterCategoryUiModel> oldFilterSelection;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.filters.OrderFilterCategoriesViewModel.OrderFilterCategories> categories = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate _categories$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.woocommerce.android.ui.orders.filters.model.OrderFilterCategoryListViewState> orderFilterCategoryViewState = null;
    
    @javax.inject.Inject
    public OrderFilterCategoriesViewModel(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.viewmodel.ResourceProvider resourceProvider, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.orders.filters.domain.GetOrderStatusFilterOptions getOrderStatusFilterOptions, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.orders.filters.domain.GetDateRangeFilterOptions getDateRangeFilterOptions, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.orders.filters.data.OrderFiltersRepository orderFilterRepository, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.orders.filters.domain.GetTrackingForFilterSelection getTrackingForFilterSelection, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.DateUtils dateUtils) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.filters.OrderFilterCategoriesViewModel.OrderFilterCategories> getCategories() {
        return null;
    }
    
    private final com.woocommerce.android.ui.orders.filters.OrderFilterCategoriesViewModel.OrderFilterCategories get_categories() {
        return null;
    }
    
    private final void set_categories(com.woocommerce.android.ui.orders.filters.OrderFilterCategoriesViewModel.OrderFilterCategories p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.woocommerce.android.ui.orders.filters.model.OrderFilterCategoryListViewState> getOrderFilterCategoryViewState() {
        return null;
    }
    
    public final void onFilterCategorySelected(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.orders.filters.model.OrderFilterCategoryUiModel filterCategory) {
    }
    
    public final void onShowOrdersClicked() {
    }
    
    public final void onClearFilters() {
    }
    
    public final void onFilterOptionsUpdated(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.orders.filters.model.OrderFilterCategoryUiModel updatedCategory) {
    }
    
    public final boolean onBackPressed() {
        return false;
    }
    
    private final com.woocommerce.android.ui.orders.filters.model.OrderFilterCategoryUiModel updateFilterOptionsForCategory(com.woocommerce.android.ui.orders.filters.model.OrderFilterCategoryUiModel old, com.woocommerce.android.ui.orders.filters.model.OrderFilterCategoryUiModel p1_54480) {
        return null;
    }
    
    private final java.lang.Object buildFilterListUiModel(kotlin.coroutines.Continuation<? super java.util.List<com.woocommerce.android.ui.orders.filters.model.OrderFilterCategoryUiModel>> continuation) {
        return null;
    }
    
    private final java.util.List<com.woocommerce.android.ui.orders.filters.model.OrderFilterOptionUiModel> loadDateRangeFilterOptions() {
        return null;
    }
    
    private final com.woocommerce.android.ui.orders.filters.model.OrderFilterCategoryListViewState getFilterCategoryViewState(java.util.List<com.woocommerce.android.ui.orders.filters.model.OrderFilterCategoryUiModel> filterCategories) {
        return null;
    }
    
    private final java.lang.Object loadOrderStatusFilterOptions(kotlin.coroutines.Continuation<? super java.util.List<com.woocommerce.android.ui.orders.filters.model.OrderFilterOptionUiModel>> continuation) {
        return null;
    }
    
    private final java.lang.String getDisplayValue(java.util.List<com.woocommerce.android.ui.orders.filters.model.OrderFilterOptionUiModel> $this$getDisplayValue, com.woocommerce.android.ui.orders.filters.data.OrderListFilterCategory selectedFilterCategoryKey, com.woocommerce.android.viewmodel.ResourceProvider resourceProvider) {
        return null;
    }
    
    private final void saveFiltersSelection(java.util.List<com.woocommerce.android.ui.orders.filters.model.OrderFilterCategoryUiModel> selectedFilters) {
    }
    
    private final void trackFilterSelection() {
    }
    
    private final boolean isAnyFilterSelected(java.util.List<com.woocommerce.android.ui.orders.filters.model.OrderFilterCategoryUiModel> $this$isAnyFilterSelected) {
        return false;
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\t\u0010\n\u001a\u00020\u000bH\u00d6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u000bH\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bH\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0018"}, d2 = {"Lcom/woocommerce/android/ui/orders/filters/OrderFilterCategoriesViewModel$OrderFilterCategories;", "Landroid/os/Parcelable;", "list", "", "Lcom/woocommerce/android/ui/orders/filters/model/OrderFilterCategoryUiModel;", "(Ljava/util/List;)V", "getList", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class OrderFilterCategories implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull
        private final java.util.List<com.woocommerce.android.ui.orders.filters.model.OrderFilterCategoryUiModel> list = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.filters.OrderFilterCategoriesViewModel.OrderFilterCategories> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.filters.OrderFilterCategoriesViewModel.OrderFilterCategories copy(@org.jetbrains.annotations.NotNull
        java.util.List<com.woocommerce.android.ui.orders.filters.model.OrderFilterCategoryUiModel> list) {
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
        
        public OrderFilterCategories(@org.jetbrains.annotations.NotNull
        java.util.List<com.woocommerce.android.ui.orders.filters.model.OrderFilterCategoryUiModel> list) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.woocommerce.android.ui.orders.filters.model.OrderFilterCategoryUiModel> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.woocommerce.android.ui.orders.filters.model.OrderFilterCategoryUiModel> getList() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.filters.OrderFilterCategoriesViewModel.OrderFilterCategories> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.orders.filters.OrderFilterCategoriesViewModel.OrderFilterCategories createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.orders.filters.OrderFilterCategoriesViewModel.OrderFilterCategories[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/orders/filters/OrderFilterCategoriesViewModel$Companion;", "", "()V", "OLD_FILTER_SELECTION_KEY", "", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}