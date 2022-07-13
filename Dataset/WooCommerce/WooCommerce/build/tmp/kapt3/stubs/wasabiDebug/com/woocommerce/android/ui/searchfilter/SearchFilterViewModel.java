package com.woocommerce.android.ui.searchfilter;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bJ\u000e\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0011J)\u0010\u0019\u001a\u00020\u00152\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001b2\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u001dR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u000f\u00a8\u0006\u001e"}, d2 = {"Lcom/woocommerce/android/ui/searchfilter/SearchFilterViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_eventLiveData", "Lcom/woocommerce/android/viewmodel/SingleLiveEvent;", "Lcom/woocommerce/android/ui/searchfilter/SearchFilterEvent;", "_viewStateLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/woocommerce/android/ui/searchfilter/SearchFilterViewState;", "allSearchFilterItems", "", "Lcom/woocommerce/android/ui/searchfilter/SearchFilterItem;", "eventLiveData", "Landroidx/lifecycle/LiveData;", "getEventLiveData", "()Landroidx/lifecycle/LiveData;", "requestKey", "", "viewStateLiveData", "getViewStateLiveData", "onItemSelected", "", "selectedItem", "onSearch", "searchQuery", "start", "searchFilterItems", "", "searchHint", "([Lcom/woocommerce/android/ui/searchfilter/SearchFilterItem;Ljava/lang/String;Ljava/lang/String;)V", "WooCommerce_wasabiDebug"})
public final class SearchFilterViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.woocommerce.android.ui.searchfilter.SearchFilterViewState> _viewStateLiveData = null;
    private final com.woocommerce.android.viewmodel.SingleLiveEvent<com.woocommerce.android.ui.searchfilter.SearchFilterEvent> _eventLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.woocommerce.android.ui.searchfilter.SearchFilterEvent> eventLiveData = null;
    private java.util.List<com.woocommerce.android.ui.searchfilter.SearchFilterItem> allSearchFilterItems;
    private java.lang.String requestKey;
    
    @javax.inject.Inject
    public SearchFilterViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.woocommerce.android.ui.searchfilter.SearchFilterViewState> getViewStateLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.woocommerce.android.ui.searchfilter.SearchFilterEvent> getEventLiveData() {
        return null;
    }
    
    public final void start(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.searchfilter.SearchFilterItem[] searchFilterItems, @org.jetbrains.annotations.NotNull
    java.lang.String searchHint, @org.jetbrains.annotations.NotNull
    java.lang.String requestKey) {
    }
    
    public final void onSearch(@org.jetbrains.annotations.NotNull
    java.lang.String searchQuery) {
    }
    
    public final void onItemSelected(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.searchfilter.SearchFilterItem selectedItem) {
    }
}