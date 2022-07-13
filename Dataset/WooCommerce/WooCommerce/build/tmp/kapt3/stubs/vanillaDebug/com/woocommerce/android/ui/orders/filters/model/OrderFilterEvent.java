package com.woocommerce.android.ui.orders.filters.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/woocommerce/android/ui/orders/filters/model/OrderFilterEvent;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "()V", "OnFilterOptionsSelectionUpdated", "OnShowOrders", "ShowCustomDateRangePicker", "ShowFilterOptionsForCategory", "Lcom/woocommerce/android/ui/orders/filters/model/OrderFilterEvent$ShowFilterOptionsForCategory;", "Lcom/woocommerce/android/ui/orders/filters/model/OrderFilterEvent$OnFilterOptionsSelectionUpdated;", "Lcom/woocommerce/android/ui/orders/filters/model/OrderFilterEvent$ShowCustomDateRangePicker;", "Lcom/woocommerce/android/ui/orders/filters/model/OrderFilterEvent$OnShowOrders;", "WooCommerce_vanillaDebug"})
public abstract class OrderFilterEvent extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
    
    private OrderFilterEvent() {
        super(false);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/orders/filters/model/OrderFilterEvent$ShowFilterOptionsForCategory;", "Lcom/woocommerce/android/ui/orders/filters/model/OrderFilterEvent;", "category", "Lcom/woocommerce/android/ui/orders/filters/model/OrderFilterCategoryUiModel;", "(Lcom/woocommerce/android/ui/orders/filters/model/OrderFilterCategoryUiModel;)V", "getCategory", "()Lcom/woocommerce/android/ui/orders/filters/model/OrderFilterCategoryUiModel;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class ShowFilterOptionsForCategory extends com.woocommerce.android.ui.orders.filters.model.OrderFilterEvent {
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.ui.orders.filters.model.OrderFilterCategoryUiModel category = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.filters.model.OrderFilterEvent.ShowFilterOptionsForCategory copy(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.filters.model.OrderFilterCategoryUiModel category) {
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
        
        public ShowFilterOptionsForCategory(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.filters.model.OrderFilterCategoryUiModel category) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.filters.model.OrderFilterCategoryUiModel component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.filters.model.OrderFilterCategoryUiModel getCategory() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/orders/filters/model/OrderFilterEvent$OnFilterOptionsSelectionUpdated;", "Lcom/woocommerce/android/ui/orders/filters/model/OrderFilterEvent;", "category", "Lcom/woocommerce/android/ui/orders/filters/model/OrderFilterCategoryUiModel;", "(Lcom/woocommerce/android/ui/orders/filters/model/OrderFilterCategoryUiModel;)V", "getCategory", "()Lcom/woocommerce/android/ui/orders/filters/model/OrderFilterCategoryUiModel;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class OnFilterOptionsSelectionUpdated extends com.woocommerce.android.ui.orders.filters.model.OrderFilterEvent {
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.ui.orders.filters.model.OrderFilterCategoryUiModel category = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.filters.model.OrderFilterEvent.OnFilterOptionsSelectionUpdated copy(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.filters.model.OrderFilterCategoryUiModel category) {
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
        
        public OnFilterOptionsSelectionUpdated(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.filters.model.OrderFilterCategoryUiModel category) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.filters.model.OrderFilterCategoryUiModel component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.filters.model.OrderFilterCategoryUiModel getCategory() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"Lcom/woocommerce/android/ui/orders/filters/model/OrderFilterEvent$ShowCustomDateRangePicker;", "Lcom/woocommerce/android/ui/orders/filters/model/OrderFilterEvent;", "startDateMillis", "", "endDateMillis", "(JJ)V", "getEndDateMillis", "()J", "getStartDateMillis", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class ShowCustomDateRangePicker extends com.woocommerce.android.ui.orders.filters.model.OrderFilterEvent {
        private final long startDateMillis = 0L;
        private final long endDateMillis = 0L;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.filters.model.OrderFilterEvent.ShowCustomDateRangePicker copy(long startDateMillis, long endDateMillis) {
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
        
        public ShowCustomDateRangePicker(long startDateMillis, long endDateMillis) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getStartDateMillis() {
            return 0L;
        }
        
        public final long component2() {
            return 0L;
        }
        
        public final long getEndDateMillis() {
            return 0L;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/orders/filters/model/OrderFilterEvent$OnShowOrders;", "Lcom/woocommerce/android/ui/orders/filters/model/OrderFilterEvent;", "()V", "WooCommerce_vanillaDebug"})
    public static final class OnShowOrders extends com.woocommerce.android.ui.orders.filters.model.OrderFilterEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.woocommerce.android.ui.orders.filters.model.OrderFilterEvent.OnShowOrders INSTANCE = null;
        
        private OnShowOrders() {
            super();
        }
    }
}