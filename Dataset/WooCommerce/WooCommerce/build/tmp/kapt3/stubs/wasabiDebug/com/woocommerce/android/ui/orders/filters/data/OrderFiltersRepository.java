package com.woocommerce.android.ui.orders.filters.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bJ\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eJ\u001c\u0010\u0013\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/woocommerce/android/ui/orders/filters/data/OrderFiltersRepository;", "", "appSharedPrefs", "Lcom/woocommerce/android/AppPrefsWrapper;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "(Lcom/woocommerce/android/AppPrefsWrapper;Lcom/woocommerce/android/tools/SelectedSite;)V", "getCurrentFilterSelection", "", "", "filterCategory", "Lcom/woocommerce/android/ui/orders/filters/data/OrderListFilterCategory;", "getCustomDateRangeFilter", "Lkotlin/Pair;", "", "setCustomDateRange", "", "startDateMillis", "endDateMillis", "setSelectedFilters", "selectedFilters", "WooCommerce_wasabiDebug"})
@javax.inject.Singleton
public final class OrderFiltersRepository {
    private final com.woocommerce.android.AppPrefsWrapper appSharedPrefs = null;
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    
    @javax.inject.Inject
    public OrderFiltersRepository(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.AppPrefsWrapper appSharedPrefs, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.SelectedSite selectedSite) {
        super();
    }
    
    public final void setSelectedFilters(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.orders.filters.data.OrderListFilterCategory filterCategory, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> selectedFilters) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getCurrentFilterSelection(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.orders.filters.data.OrderListFilterCategory filterCategory) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlin.Pair<java.lang.Long, java.lang.Long> getCustomDateRangeFilter() {
        return null;
    }
    
    public final void setCustomDateRange(long startDateMillis, long endDateMillis) {
    }
}