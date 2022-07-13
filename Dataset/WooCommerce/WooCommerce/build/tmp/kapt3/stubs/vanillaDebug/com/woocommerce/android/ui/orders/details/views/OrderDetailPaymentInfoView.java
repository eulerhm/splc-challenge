package com.woocommerce.android.ui.orders.details.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ*\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00130\u0012J0\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00130\u0012J3\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u000e2!\u0010\u001c\u001a\u001d\u0012\u0013\u0012\u00110\u001d\u00a2\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\f0\u0012H\u0002J$\u0010!\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00162\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J$\u0010\"\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00162\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\u00be\u0001\u0010#\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00130\u00122!\u0010%\u001a\u001d\u0012\u0013\u0012\u00110\u001d\u00a2\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\f0\u00122!\u0010&\u001a\u001d\u0012\u0013\u0012\u00110\u001d\u00a2\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\f0\u00122!\u0010\u001c\u001a\u001d\u0012\u0013\u0012\u00110\u001d\u00a2\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\f0\u00122!\u0010\'\u001a\u001d\u0012\u0013\u0012\u00110\u001d\u00a2\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\f0\u0012J3\u0010(\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u000e2!\u0010\'\u001a\u001d\u0012\u0013\u0012\u00110\u001d\u00a2\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\f0\u0012H\u0002JG\u0010)\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00162\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00130\u00122!\u0010&\u001a\u001d\u0012\u0013\u0012\u00110\u001d\u00a2\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\f0\u0012H\u0002J3\u0010*\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u000e2!\u0010%\u001a\u001d\u0012\u0013\u0012\u00110\u001d\u00a2\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\f0\u0012H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/views/OrderDetailPaymentInfoView;", "Lcom/google/android/material/card/MaterialCardView;", "ctx", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/woocommerce/android/databinding/OrderDetailPaymentInfoBinding;", "showRefundTotal", "", "show", "", "refundTotal", "Ljava/math/BigDecimal;", "formatCurrencyForDisplay", "Lkotlin/Function1;", "", "showRefunds", "order", "Lcom/woocommerce/android/model/Order;", "refunds", "", "Lcom/woocommerce/android/model/Refund;", "updateCollectPaymentSection", "isPaymentCollectableWithCardReader", "onCollectCardPresentPaymentClickListener", "Landroid/view/View;", "Lkotlin/ParameterName;", "name", "view", "updateDiscountsSection", "updateFeesSection", "updatePaymentInfo", "isReceiptAvailable", "onSeeReceiptClickListener", "onIssueRefundClickListener", "onPrintingInstructionsClickListener", "updatePrintingInstructionSection", "updateRefundSection", "updateSeeReceiptSection", "WooCommerce_vanillaDebug"})
public final class OrderDetailPaymentInfoView extends com.google.android.material.card.MaterialCardView {
    private final com.woocommerce.android.databinding.OrderDetailPaymentInfoBinding binding = null;
    
    @kotlin.jvm.JvmOverloads()
    public OrderDetailPaymentInfoView(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public OrderDetailPaymentInfoView(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public OrderDetailPaymentInfoView(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @kotlin.Suppress(names = {"LongParameterList"})
    public final void updatePaymentInfo(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.Order order, boolean isReceiptAvailable, boolean isPaymentCollectableWithCardReader, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.math.BigDecimal, java.lang.String> formatCurrencyForDisplay, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> onSeeReceiptClickListener, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> onIssueRefundClickListener, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> onCollectCardPresentPaymentClickListener, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> onPrintingInstructionsClickListener) {
    }
    
    private final void updateDiscountsSection(com.woocommerce.android.model.Order order, kotlin.jvm.functions.Function1<? super java.math.BigDecimal, java.lang.String> formatCurrencyForDisplay) {
    }
    
    private final void updateFeesSection(com.woocommerce.android.model.Order order, kotlin.jvm.functions.Function1<? super java.math.BigDecimal, java.lang.String> formatCurrencyForDisplay) {
    }
    
    private final void updateRefundSection(com.woocommerce.android.model.Order order, kotlin.jvm.functions.Function1<? super java.math.BigDecimal, java.lang.String> formatCurrencyForDisplay, kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> onIssueRefundClickListener) {
    }
    
    private final void updateCollectPaymentSection(boolean isPaymentCollectableWithCardReader, kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> onCollectCardPresentPaymentClickListener) {
    }
    
    private final void updateSeeReceiptSection(boolean isReceiptAvailable, kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> onSeeReceiptClickListener) {
    }
    
    private final void updatePrintingInstructionSection(boolean isPaymentCollectableWithCardReader, kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> onPrintingInstructionsClickListener) {
    }
    
    public final void showRefunds(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.Order order, @org.jetbrains.annotations.NotNull()
    java.util.List<com.woocommerce.android.model.Refund> refunds, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.math.BigDecimal, java.lang.String> formatCurrencyForDisplay) {
    }
    
    public final void showRefundTotal(boolean show, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal refundTotal, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.math.BigDecimal, java.lang.String> formatCurrencyForDisplay) {
    }
}