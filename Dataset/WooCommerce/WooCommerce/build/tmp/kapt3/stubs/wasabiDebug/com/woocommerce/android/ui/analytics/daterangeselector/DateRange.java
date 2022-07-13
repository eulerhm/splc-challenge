package com.woocommerce.android.ui.analytics.daterangeselector;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/ui/analytics/daterangeselector/DateRange;", "", "()V", "MultipleDateRange", "SimpleDateRange", "Lcom/woocommerce/android/ui/analytics/daterangeselector/DateRange$SimpleDateRange;", "Lcom/woocommerce/android/ui/analytics/daterangeselector/DateRange$MultipleDateRange;", "WooCommerce_wasabiDebug"})
public abstract class DateRange {
    
    private DateRange() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"Lcom/woocommerce/android/ui/analytics/daterangeselector/DateRange$SimpleDateRange;", "Lcom/woocommerce/android/ui/analytics/daterangeselector/DateRange;", "from", "Ljava/util/Date;", "to", "(Ljava/util/Date;Ljava/util/Date;)V", "getFrom", "()Ljava/util/Date;", "getTo", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
    public static final class SimpleDateRange extends com.woocommerce.android.ui.analytics.daterangeselector.DateRange {
        @org.jetbrains.annotations.NotNull
        private final java.util.Date from = null;
        @org.jetbrains.annotations.NotNull
        private final java.util.Date to = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.analytics.daterangeselector.DateRange.SimpleDateRange copy(@org.jetbrains.annotations.NotNull
        java.util.Date from, @org.jetbrains.annotations.NotNull
        java.util.Date to) {
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
        
        public SimpleDateRange(@org.jetbrains.annotations.NotNull
        java.util.Date from, @org.jetbrains.annotations.NotNull
        java.util.Date to) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.Date component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.Date getFrom() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.Date component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.Date getTo() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"Lcom/woocommerce/android/ui/analytics/daterangeselector/DateRange$MultipleDateRange;", "Lcom/woocommerce/android/ui/analytics/daterangeselector/DateRange;", "from", "Lcom/woocommerce/android/ui/analytics/daterangeselector/DateRange$SimpleDateRange;", "to", "(Lcom/woocommerce/android/ui/analytics/daterangeselector/DateRange$SimpleDateRange;Lcom/woocommerce/android/ui/analytics/daterangeselector/DateRange$SimpleDateRange;)V", "getFrom", "()Lcom/woocommerce/android/ui/analytics/daterangeselector/DateRange$SimpleDateRange;", "getTo", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
    public static final class MultipleDateRange extends com.woocommerce.android.ui.analytics.daterangeselector.DateRange {
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.ui.analytics.daterangeselector.DateRange.SimpleDateRange from = null;
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.ui.analytics.daterangeselector.DateRange.SimpleDateRange to = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.analytics.daterangeselector.DateRange.MultipleDateRange copy(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.analytics.daterangeselector.DateRange.SimpleDateRange from, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.analytics.daterangeselector.DateRange.SimpleDateRange to) {
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
        
        public MultipleDateRange(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.analytics.daterangeselector.DateRange.SimpleDateRange from, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.analytics.daterangeselector.DateRange.SimpleDateRange to) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.analytics.daterangeselector.DateRange.SimpleDateRange component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.analytics.daterangeselector.DateRange.SimpleDateRange getFrom() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.analytics.daterangeselector.DateRange.SimpleDateRange component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.analytics.daterangeselector.DateRange.SimpleDateRange getTo() {
            return null;
        }
    }
}