package com.woocommerce.android.ui.analytics.daterangeselector;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 +2\u00020\u0001:\u0001+B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000e\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\fH\u0002J\b\u0010\u0010\u001a\u00020\fH\u0002J\b\u0010\u0011\u001a\u00020\fH\u0002J\b\u0010\u0012\u001a\u00020\fH\u0002J\b\u0010\u0013\u001a\u00020\fH\u0002J\b\u0010\u0014\u001a\u00020\fH\u0002J\b\u0010\u0015\u001a\u00020\fH\u0002J\b\u0010\u0016\u001a\u00020\fH\u0002J\b\u0010\u0017\u001a\u00020\fH\u0002J\b\u0010\u0018\u001a\u00020\fH\u0002J\b\u0010\u0019\u001a\u00020\fH\u0002J\b\u0010\u001a\u001a\u00020\fH\u0002J\b\u0010\u001b\u001a\u00020\fH\u0002J\b\u0010\u001c\u001a\u00020\fH\u0002J\b\u0010\u001d\u001a\u00020\fH\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u001fH\u0002J\b\u0010!\u001a\u00020\u001fH\u0002J\b\u0010\"\u001a\u00020\u001fH\u0002J\b\u0010#\u001a\u00020\fH\u0002J\b\u0010$\u001a\u00020\u001fH\u0002J\b\u0010%\u001a\u00020\u001fH\u0002J\b\u0010&\u001a\u00020\'H\u0002J\b\u0010(\u001a\u00020\u001fH\u0002J\b\u0010)\u001a\u00020\u001fH\u0002J\b\u0010*\u001a\u00020\'H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006,"}, d2 = {"Lcom/woocommerce/android/ui/analytics/daterangeselector/AnalyticsDateRangeCalculator;", "", "dateUtils", "Lcom/woocommerce/android/util/DateUtils;", "(Lcom/woocommerce/android/util/DateUtils;)V", "getDateUtils", "()Lcom/woocommerce/android/util/DateUtils;", "getAnalyticsDateRangeFrom", "Lcom/woocommerce/android/ui/analytics/daterangeselector/DateRange;", "selectionRange", "Lcom/woocommerce/android/ui/analytics/daterangeselector/AnalyticsDateRanges;", "getDateFirstDayOneWeekAgo", "Ljava/util/Date;", "getDateFirstDayPreviousMonth", "getDateForLastDayOfTwoYearsAgo", "getDateForLastDayPreviousMonth", "getDateForTwoDaysAgo", "getDateForYesterday", "getDateLastDayOneWeekAgo", "getDateLastDayTwoMonthsAgo", "getDateMinusOneMonth", "getDateMinusQuarter", "getDateOFirstDayTwoQuartersAgo", "getDateOfFirstDayPreviousQuarter", "getDateOfFirstDayTwoMonthsAgo", "getDateOfFirstDayTwoWeeksAgo", "getDateOfLastDayPreviousQuarter", "getDateOfLastDayTwoQuartersAgo", "getDateOfLastDayTwoWeeksAgo", "getDateSevenDaysAgo", "getLastMonthRange", "Lcom/woocommerce/android/ui/analytics/daterangeselector/DateRange$MultipleDateRange;", "getLastQuarterRange", "getLastWeekRange", "getLastYearRange", "getMinusOneYearDate", "getMonthToDateRange", "getQuarterToRangeDate", "getTodayRange", "Lcom/woocommerce/android/ui/analytics/daterangeselector/DateRange$SimpleDateRange;", "getWeekToDateRange", "getYearToDateRange", "getYesterdayRange", "Companion", "WooCommerce_wasabiDebug"})
public final class AnalyticsDateRangeCalculator {
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.util.DateUtils dateUtils = null;
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.analytics.daterangeselector.AnalyticsDateRangeCalculator.Companion Companion = null;
    public static final int DAYS_IN_WEEK = -7;
    public static final int MONTHS_IN_QUARTER = -3;
    public static final int MINUS_ONE = -1;
    public static final int TWO = 2;
    public static final int ONE = 1;
    
    @javax.inject.Inject
    public AnalyticsDateRangeCalculator(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.DateUtils dateUtils) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.util.DateUtils getDateUtils() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.ui.analytics.daterangeselector.DateRange getAnalyticsDateRangeFrom(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.analytics.daterangeselector.AnalyticsDateRanges selectionRange) {
        return null;
    }
    
    private final com.woocommerce.android.ui.analytics.daterangeselector.DateRange.MultipleDateRange getYearToDateRange() {
        return null;
    }
    
    private final com.woocommerce.android.ui.analytics.daterangeselector.DateRange.MultipleDateRange getQuarterToRangeDate() {
        return null;
    }
    
    private final com.woocommerce.android.ui.analytics.daterangeselector.DateRange.MultipleDateRange getMonthToDateRange() {
        return null;
    }
    
    private final com.woocommerce.android.ui.analytics.daterangeselector.DateRange.MultipleDateRange getWeekToDateRange() {
        return null;
    }
    
    private final com.woocommerce.android.ui.analytics.daterangeselector.DateRange.MultipleDateRange getLastYearRange() {
        return null;
    }
    
    private final com.woocommerce.android.ui.analytics.daterangeselector.DateRange.MultipleDateRange getLastQuarterRange() {
        return null;
    }
    
    private final java.util.Date getDateOfLastDayPreviousQuarter() {
        return null;
    }
    
    private final java.util.Date getDateOfFirstDayPreviousQuarter() {
        return null;
    }
    
    private final java.util.Date getDateOFirstDayTwoQuartersAgo() {
        return null;
    }
    
    private final java.util.Date getDateOfLastDayTwoQuartersAgo() {
        return null;
    }
    
    private final com.woocommerce.android.ui.analytics.daterangeselector.DateRange.SimpleDateRange getYesterdayRange() {
        return null;
    }
    
    private final java.util.Date getDateForTwoDaysAgo() {
        return null;
    }
    
    private final com.woocommerce.android.ui.analytics.daterangeselector.DateRange.SimpleDateRange getTodayRange() {
        return null;
    }
    
    private final java.util.Date getDateForYesterday() {
        return null;
    }
    
    private final com.woocommerce.android.ui.analytics.daterangeselector.DateRange.MultipleDateRange getLastMonthRange() {
        return null;
    }
    
    private final java.util.Date getDateForLastDayPreviousMonth() {
        return null;
    }
    
    private final java.util.Date getDateFirstDayPreviousMonth() {
        return null;
    }
    
    private final java.util.Date getDateLastDayTwoMonthsAgo() {
        return null;
    }
    
    private final java.util.Date getDateOfFirstDayTwoMonthsAgo() {
        return null;
    }
    
    private final com.woocommerce.android.ui.analytics.daterangeselector.DateRange.MultipleDateRange getLastWeekRange() {
        return null;
    }
    
    private final java.util.Date getDateLastDayOneWeekAgo() {
        return null;
    }
    
    private final java.util.Date getDateFirstDayOneWeekAgo() {
        return null;
    }
    
    private final java.util.Date getDateOfLastDayTwoWeeksAgo() {
        return null;
    }
    
    private final java.util.Date getDateOfFirstDayTwoWeeksAgo() {
        return null;
    }
    
    private final java.util.Date getMinusOneYearDate() {
        return null;
    }
    
    private final java.util.Date getDateMinusQuarter() {
        return null;
    }
    
    private final java.util.Date getDateSevenDaysAgo() {
        return null;
    }
    
    private final java.util.Date getDateMinusOneMonth() {
        return null;
    }
    
    private final java.util.Date getDateForLastDayOfTwoYearsAgo() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/woocommerce/android/ui/analytics/daterangeselector/AnalyticsDateRangeCalculator$Companion;", "", "()V", "DAYS_IN_WEEK", "", "MINUS_ONE", "MONTHS_IN_QUARTER", "ONE", "TWO", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}