package com.woocommerce.android.ui.orders.details.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 #2\u00020\u0001:\u0001#B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0010\u001a\u00020\u000eH\u0002J\b\u0010\u0011\u001a\u00020\u000eH\u0002J\u0012\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u0014H\u0014J\b\u0010\u0016\u001a\u00020\u000eH\u0002J\b\u0010\u0017\u001a\u00020\u000eH\u0002J\u0010\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0018\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\fH\u0002J\u0010\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0018\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\fH\u0002J \u0010 \u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\fH\u0002J\u001e\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\fR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/views/OrderDetailCustomerInfoView;", "Lcom/google/android/material/card/MaterialCardView;", "ctx", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/woocommerce/android/databinding/OrderDetailCustomerInfoBinding;", "isCustomerInfoViewExpanded", "", "collapseCustomerInfoView", "", "expandCustomerInfoView", "navigateToBillingAddressEditingView", "navigateToShippingAddressEditingView", "onRestoreInstanceState", "state", "Landroid/os/Parcelable;", "onSaveInstanceState", "onViewMoreCustomerInfoClick", "restoreCustomerInfoViewExpandedOrCollapsedState", "showBillingAddressEmailInfo", "order", "Lcom/woocommerce/android/model/Order;", "showBillingAddressPhoneInfo", "showBillingInfo", "isReadOnly", "showCallOrMessagePopup", "showCustomerNote", "showShippingAddress", "isVirtualOrder", "updateCustomerInfo", "Companion", "WooCommerce_vanillaDebug"})
public final class OrderDetailCustomerInfoView extends com.google.android.material.card.MaterialCardView {
    @org.jetbrains.annotations.NotNull()
    private static final com.woocommerce.android.ui.orders.details.views.OrderDetailCustomerInfoView.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    @java.lang.Deprecated()
    public static final java.lang.String KEY_SUPER_STATE = "ORDER-DETAIL-CUSTOMER-INFO-VIEW-SUPER-STATE";
    @org.jetbrains.annotations.NotNull()
    @java.lang.Deprecated()
    public static final java.lang.String KEY_IS_CUSTOMER_INFO_VIEW_EXPANDED = "ORDER-DETAIL-CUSTOMER-INFO-VIEW-IS_CUSTOMER_INFO_VIEW_EXPANDED";
    private final com.woocommerce.android.databinding.OrderDetailCustomerInfoBinding binding = null;
    private boolean isCustomerInfoViewExpanded = false;
    
    @kotlin.jvm.JvmOverloads()
    public OrderDetailCustomerInfoView(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public OrderDetailCustomerInfoView(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public OrderDetailCustomerInfoView(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected android.os.Parcelable onSaveInstanceState() {
        return null;
    }
    
    @java.lang.Override()
    protected void onRestoreInstanceState(@org.jetbrains.annotations.Nullable()
    android.os.Parcelable state) {
    }
    
    public final void updateCustomerInfo(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.Order order, boolean isVirtualOrder, boolean isReadOnly) {
    }
    
    private final void showBillingInfo(com.woocommerce.android.model.Order order, boolean isReadOnly) {
    }
    
    private final void onViewMoreCustomerInfoClick() {
    }
    
    private final void expandCustomerInfoView() {
    }
    
    private final void collapseCustomerInfoView() {
    }
    
    private final void restoreCustomerInfoViewExpandedOrCollapsedState() {
    }
    
    private final void showBillingAddressEmailInfo(com.woocommerce.android.model.Order order) {
    }
    
    private final void showBillingAddressPhoneInfo(com.woocommerce.android.model.Order order) {
    }
    
    private final void showCustomerNote(com.woocommerce.android.model.Order order, boolean isReadOnly) {
    }
    
    private final void showShippingAddress(com.woocommerce.android.model.Order order, boolean isVirtualOrder, boolean isReadOnly) {
    }
    
    private final void navigateToShippingAddressEditingView() {
    }
    
    private final void navigateToBillingAddressEditingView() {
    }
    
    private final void showCallOrMessagePopup(com.woocommerce.android.model.Order order) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/views/OrderDetailCustomerInfoView$Companion;", "", "()V", "KEY_IS_CUSTOMER_INFO_VIEW_EXPANDED", "", "KEY_SUPER_STATE", "WooCommerce_vanillaDebug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}