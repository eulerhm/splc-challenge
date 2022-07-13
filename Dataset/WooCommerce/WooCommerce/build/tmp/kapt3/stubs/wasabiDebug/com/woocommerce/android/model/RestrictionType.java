package com.woocommerce.android.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f\u00a8\u0006\r"}, d2 = {"Lcom/woocommerce/android/model/RestrictionType;", "", "title", "", "(Ljava/lang/String;II)V", "getTitle", "()I", "toDataModel", "Lorg/wordpress/android/fluxc/model/shippinglabels/WCRestrictionType;", "None", "Quarantine", "SanitaryInspection", "Other", "WooCommerce_wasabiDebug"})
public enum RestrictionType {
    /*public static final*/ None /* = new None(0) */,
    /*public static final*/ Quarantine /* = new Quarantine(0) */,
    /*public static final*/ SanitaryInspection /* = new SanitaryInspection(0) */,
    /*public static final*/ Other /* = new Other(0) */;
    private final int title = 0;
    
    RestrictionType(@androidx.annotation.StringRes
    int title) {
    }
    
    public final int getTitle() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.wordpress.android.fluxc.model.shippinglabels.WCRestrictionType toDataModel() {
        return null;
    }
}