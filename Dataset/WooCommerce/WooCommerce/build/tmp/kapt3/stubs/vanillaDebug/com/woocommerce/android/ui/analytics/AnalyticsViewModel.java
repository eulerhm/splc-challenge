package com.woocommerce.android.ui.analytics;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\u0016H\u0002J\u0018\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\u0016H\u0002J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0018H\u0002J\b\u0010\u001c\u001a\u00020\u0015H\u0002J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0015R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006 "}, d2 = {"Lcom/woocommerce/android/ui/analytics/AnalyticsViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "resourceProvider", "Lcom/woocommerce/android/viewmodel/ResourceProvider;", "dateUtils", "Lcom/woocommerce/android/util/DateUtils;", "analyticsDateRange", "Lcom/woocommerce/android/ui/analytics/daterangeselector/AnalyticsDateRangeCalculator;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/woocommerce/android/viewmodel/ResourceProvider;Lcom/woocommerce/android/util/DateUtils;Lcom/woocommerce/android/ui/analytics/daterangeselector/AnalyticsDateRangeCalculator;Landroidx/lifecycle/SavedStateHandle;)V", "dateRange", "Lcom/woocommerce/android/ui/analytics/daterangeselector/DateRange$SimpleDateRange;", "mutableState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/woocommerce/android/ui/analytics/AnalyticsViewState;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "calculateFromDatePeriod", "", "Lcom/woocommerce/android/ui/analytics/daterangeselector/DateRange;", "calculateToDatePeriod", "Lcom/woocommerce/android/ui/analytics/daterangeselector/AnalyticsDateRanges;", "getAvailableDateRanges", "", "getDateSelectedMessage", "getDefaultSelectedPeriod", "onSelectedDateRangeChanged", "", "newSelection", "WooCommerce_vanillaDebug"})
public final class AnalyticsViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.viewmodel.ResourceProvider resourceProvider = null;
    private final com.woocommerce.android.util.DateUtils dateUtils = null;
    private final com.woocommerce.android.ui.analytics.daterangeselector.AnalyticsDateRangeCalculator analyticsDateRange = null;
    private final com.woocommerce.android.ui.analytics.daterangeselector.DateRange.SimpleDateRange dateRange = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.woocommerce.android.ui.analytics.AnalyticsViewState> mutableState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.woocommerce.android.ui.analytics.AnalyticsViewState> state = null;
    
    @javax.inject.Inject()
    public AnalyticsViewModel(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.viewmodel.ResourceProvider resourceProvider, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.DateUtils dateUtils, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.analytics.daterangeselector.AnalyticsDateRangeCalculator analyticsDateRange, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedState) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.woocommerce.android.ui.analytics.AnalyticsViewState> getState() {
        return null;
    }
    
    public final void onSelectedDateRangeChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String newSelection) {
    }
    
    private final java.lang.String calculateToDatePeriod(com.woocommerce.android.ui.analytics.daterangeselector.AnalyticsDateRanges analyticsDateRange, com.woocommerce.android.ui.analytics.daterangeselector.DateRange dateRange) {
        return null;
    }
    
    private final java.lang.String calculateFromDatePeriod(com.woocommerce.android.ui.analytics.daterangeselector.DateRange dateRange) {
        return null;
    }
    
    private final java.util.List<java.lang.String> getAvailableDateRanges() {
        return null;
    }
    
    private final java.lang.String getDefaultSelectedPeriod() {
        return null;
    }
    
    private final java.lang.String getDateSelectedMessage(com.woocommerce.android.ui.analytics.daterangeselector.AnalyticsDateRanges analyticsDateRange) {
        return null;
    }
}