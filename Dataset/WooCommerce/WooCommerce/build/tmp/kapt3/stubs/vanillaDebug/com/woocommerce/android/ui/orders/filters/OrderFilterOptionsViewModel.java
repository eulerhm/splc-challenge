package com.woocommerce.android.ui.orders.filters;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001:\u0001;B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\"\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0006\u0010$\u001a\u00020%J\u0016\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020)J\u000e\u0010+\u001a\u00020\'2\u0006\u0010,\u001a\u00020-J\u0006\u0010.\u001a\u00020\'J\b\u0010/\u001a\u00020\'H\u0002J\b\u00100\u001a\u00020\'H\u0002J\b\u00101\u001a\u00020\'H\u0002J\u0010\u00102\u001a\u00020\'2\u0006\u00103\u001a\u00020-H\u0002J\u0018\u00104\u001a\u00020-2\u0006\u00105\u001a\u00020\u001d2\u0006\u00106\u001a\u00020-H\u0002J\u0010\u00107\u001a\u00020\'2\u0006\u00108\u001a\u00020-H\u0002J\u0010\u00109\u001a\u00020\'2\u0006\u0010:\u001a\u00020-H\u0002R+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!\u00a8\u0006<"}, d2 = {"Lcom/woocommerce/android/ui/orders/filters/OrderFilterOptionsViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "resourceProvider", "Lcom/woocommerce/android/viewmodel/ResourceProvider;", "orderFilterRepository", "Lcom/woocommerce/android/ui/orders/filters/data/OrderFiltersRepository;", "getTrackingForFilterSelection", "Lcom/woocommerce/android/ui/orders/filters/domain/GetTrackingForFilterSelection;", "dateUtils", "Lcom/woocommerce/android/util/DateUtils;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/viewmodel/ResourceProvider;Lcom/woocommerce/android/ui/orders/filters/data/OrderFiltersRepository;Lcom/woocommerce/android/ui/orders/filters/domain/GetTrackingForFilterSelection;Lcom/woocommerce/android/util/DateUtils;)V", "<set-?>", "Lcom/woocommerce/android/ui/orders/filters/OrderFilterOptionsViewModel$ViewState;", "_viewState", "get_viewState", "()Lcom/woocommerce/android/ui/orders/filters/OrderFilterOptionsViewModel$ViewState;", "set_viewState", "(Lcom/woocommerce/android/ui/orders/filters/OrderFilterOptionsViewModel$ViewState;)V", "_viewState$delegate", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "arguments", "Lcom/woocommerce/android/ui/orders/filters/OrderFilterOptionsFragmentArgs;", "getArguments", "()Lcom/woocommerce/android/ui/orders/filters/OrderFilterOptionsFragmentArgs;", "arguments$delegate", "Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "categoryKey", "Lcom/woocommerce/android/ui/orders/filters/data/OrderListFilterCategory;", "viewState", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getViewState", "()Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getOrderFilterOptionsTitle", "", "onBackPressed", "", "onCustomDateRangeChanged", "", "startMillis", "", "endMillis", "onFilterOptionSelected", "selectedOrderFilterOption", "Lcom/woocommerce/android/ui/orders/filters/model/OrderFilterOptionUiModel;", "onShowOrdersClicked", "saveFiltersSelection", "trackFilterSelection", "uncheckFilterOptionAll", "updateDateRangeFilters", "dateRangeOptionClicked", "updateFilterOptionsSelectedValue", "category", "filterOptionClicked", "updateOrderStatusSelectedFilters", "orderStatusClicked", "updateSelectedFilterValues", "selectedFilterOption", "ViewState", "WooCommerce_vanillaDebug"})
public final class OrderFilterOptionsViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.viewmodel.ResourceProvider resourceProvider = null;
    private final com.woocommerce.android.ui.orders.filters.data.OrderFiltersRepository orderFilterRepository = null;
    private final com.woocommerce.android.ui.orders.filters.domain.GetTrackingForFilterSelection getTrackingForFilterSelection = null;
    private final com.woocommerce.android.util.DateUtils dateUtils = null;
    private final com.woocommerce.android.viewmodel.NavArgsLazy arguments$delegate = null;
    private final com.woocommerce.android.ui.orders.filters.data.OrderListFilterCategory categoryKey = null;
    @org.jetbrains.annotations.NotNull()
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.filters.OrderFilterOptionsViewModel.ViewState> viewState = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate _viewState$delegate = null;
    
    @javax.inject.Inject()
    public OrderFilterOptionsViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.viewmodel.ResourceProvider resourceProvider, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.orders.filters.data.OrderFiltersRepository orderFilterRepository, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.orders.filters.domain.GetTrackingForFilterSelection getTrackingForFilterSelection, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.DateUtils dateUtils) {
        super(null);
    }
    
    private final com.woocommerce.android.ui.orders.filters.OrderFilterOptionsFragmentArgs getArguments() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.filters.OrderFilterOptionsViewModel.ViewState> getViewState() {
        return null;
    }
    
    private final com.woocommerce.android.ui.orders.filters.OrderFilterOptionsViewModel.ViewState get_viewState() {
        return null;
    }
    
    private final void set_viewState(com.woocommerce.android.ui.orders.filters.OrderFilterOptionsViewModel.ViewState p0) {
    }
    
    public final void onFilterOptionSelected(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.orders.filters.model.OrderFilterOptionUiModel selectedOrderFilterOption) {
    }
    
    public final void onShowOrdersClicked() {
    }
    
    public final boolean onBackPressed() {
        return false;
    }
    
    private final void trackFilterSelection() {
    }
    
    private final void saveFiltersSelection() {
    }
    
    private final void updateOrderStatusSelectedFilters(com.woocommerce.android.ui.orders.filters.model.OrderFilterOptionUiModel orderStatusClicked) {
    }
    
    private final void updateDateRangeFilters(com.woocommerce.android.ui.orders.filters.model.OrderFilterOptionUiModel dateRangeOptionClicked) {
    }
    
    private final void updateSelectedFilterValues(com.woocommerce.android.ui.orders.filters.model.OrderFilterOptionUiModel selectedFilterOption) {
    }
    
    private final com.woocommerce.android.ui.orders.filters.model.OrderFilterOptionUiModel updateFilterOptionsSelectedValue(com.woocommerce.android.ui.orders.filters.data.OrderListFilterCategory category, com.woocommerce.android.ui.orders.filters.model.OrderFilterOptionUiModel filterOptionClicked) {
        return null;
    }
    
    private final void uncheckFilterOptionAll() {
    }
    
    private final java.lang.String getOrderFilterOptionsTitle(com.woocommerce.android.ui.orders.filters.data.OrderListFilterCategory categoryKey) {
        return null;
    }
    
    public final void onCustomDateRangeChanged(long startMillis, long endMillis) {
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0006H\u00c6\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0006H\u00d6\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u001c"}, d2 = {"Lcom/woocommerce/android/ui/orders/filters/OrderFilterOptionsViewModel$ViewState;", "Landroid/os/Parcelable;", "filterOptions", "", "Lcom/woocommerce/android/ui/orders/filters/model/OrderFilterOptionUiModel;", "title", "", "(Ljava/util/List;Ljava/lang/String;)V", "getFilterOptions", "()Ljava/util/List;", "getTitle", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
    public static final class ViewState implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.woocommerce.android.ui.orders.filters.model.OrderFilterOptionUiModel> filterOptions = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String title = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.filters.OrderFilterOptionsViewModel.ViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.filters.OrderFilterOptionsViewModel.ViewState copy(@org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.ui.orders.filters.model.OrderFilterOptionUiModel> filterOptions, @org.jetbrains.annotations.NotNull()
        java.lang.String title) {
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
        
        public ViewState(@org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.ui.orders.filters.model.OrderFilterOptionUiModel> filterOptions, @org.jetbrains.annotations.NotNull()
        java.lang.String title) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.ui.orders.filters.model.OrderFilterOptionUiModel> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.ui.orders.filters.model.OrderFilterOptionUiModel> getFilterOptions() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTitle() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.filters.OrderFilterOptionsViewModel.ViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.orders.filters.OrderFilterOptionsViewModel.ViewState createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.orders.filters.OrderFilterOptionsViewModel.ViewState[] newArray(int size) {
                return null;
            }
        }
    }
}