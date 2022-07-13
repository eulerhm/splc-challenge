package com.woocommerce.android.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f\u00a8\u0006\u000e"}, d2 = {"Lcom/woocommerce/android/model/TimeGroup;", "", "labelRes", "", "(Ljava/lang/String;II)V", "getLabelRes", "()I", "GROUP_FUTURE", "GROUP_TODAY", "GROUP_YESTERDAY", "GROUP_OLDER_TWO_DAYS", "GROUP_OLDER_WEEK", "GROUP_OLDER_MONTH", "Companion", "WooCommerce_wasabiDebug"})
public enum TimeGroup {
    /*public static final*/ GROUP_FUTURE /* = new GROUP_FUTURE(0) */,
    /*public static final*/ GROUP_TODAY /* = new GROUP_TODAY(0) */,
    /*public static final*/ GROUP_YESTERDAY /* = new GROUP_YESTERDAY(0) */,
    /*public static final*/ GROUP_OLDER_TWO_DAYS /* = new GROUP_OLDER_TWO_DAYS(0) */,
    /*public static final*/ GROUP_OLDER_WEEK /* = new GROUP_OLDER_WEEK(0) */,
    /*public static final*/ GROUP_OLDER_MONTH /* = new GROUP_OLDER_MONTH(0) */;
    private final int labelRes = 0;
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.model.TimeGroup.Companion Companion = null;
    
    TimeGroup(@androidx.annotation.StringRes
    int labelRes) {
    }
    
    public final int getLabelRes() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/model/TimeGroup$Companion;", "", "()V", "getTimeGroupForDate", "Lcom/woocommerce/android/model/TimeGroup;", "localDate", "Ljava/util/Date;", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.model.TimeGroup getTimeGroupForDate(@org.jetbrains.annotations.NotNull
        java.util.Date localDate) {
            return null;
        }
    }
}