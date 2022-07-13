package com.woocommerce.android.support;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u000f\u0010B\'\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u00a2\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0002\u0011\u0012\u00a8\u0006\u0013"}, d2 = {"Lcom/woocommerce/android/support/TicketType;", "", "form", "", "subcategoryName", "", "tags", "", "(JLjava/lang/String;Ljava/util/List;)V", "getForm", "()J", "getSubcategoryName", "()Ljava/lang/String;", "getTags", "()Ljava/util/List;", "General", "Payments", "Lcom/woocommerce/android/support/TicketType$General;", "Lcom/woocommerce/android/support/TicketType$Payments;", "WooCommerce_vanillaDebug"})
public abstract class TicketType {
    private final long form = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String subcategoryName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> tags = null;
    
    private TicketType(long form, java.lang.String subcategoryName, java.util.List<java.lang.String> tags) {
        super();
    }
    
    public final long getForm() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSubcategoryName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getTags() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/support/TicketType$General;", "Lcom/woocommerce/android/support/TicketType;", "()V", "WooCommerce_vanillaDebug"})
    public static final class General extends com.woocommerce.android.support.TicketType {
        @org.jetbrains.annotations.NotNull()
        public static final com.woocommerce.android.support.TicketType.General INSTANCE = null;
        
        private General() {
            super(0L, null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/support/TicketType$Payments;", "Lcom/woocommerce/android/support/TicketType;", "()V", "WooCommerce_vanillaDebug"})
    public static final class Payments extends com.woocommerce.android.support.TicketType {
        @org.jetbrains.annotations.NotNull()
        public static final com.woocommerce.android.support.TicketType.Payments INSTANCE = null;
        
        private Payments() {
            super(0L, null, null);
        }
    }
}