package com.woocommerce.android.ui.orders.simplepayments;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\b\u001a\u00020\tX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/woocommerce/android/ui/orders/simplepayments/SimplePaymentsSharedViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "wooCommerceStore", "Lorg/wordpress/android/fluxc/store/WooCommerceStore;", "currencyFormatter", "Lcom/woocommerce/android/util/CurrencyFormatter;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/tools/SelectedSite;Lorg/wordpress/android/fluxc/store/WooCommerceStore;Lcom/woocommerce/android/util/CurrencyFormatter;)V", "currencyCode", "", "getCurrencyCode", "()Ljava/lang/String;", "decimals", "", "getDecimals", "()I", "formatAmount", "amount", "Ljava/math/BigDecimal;", "Companion", "WooCommerce_wasabiDebug"})
@com.woocommerce.android.annotations.OpenClassOnDebug
public class SimplePaymentsSharedViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    private final org.wordpress.android.fluxc.store.WooCommerceStore wooCommerceStore = null;
    private final com.woocommerce.android.util.CurrencyFormatter currencyFormatter = null;
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.orders.simplepayments.SimplePaymentsSharedViewModel.Companion Companion = null;
    private static final int DEFAULT_DECIMAL_PRECISION = 2;
    
    @javax.inject.Inject
    public SimplePaymentsSharedViewModel(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.SelectedSite selectedSite, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.WooCommerceStore wooCommerceStore, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.CurrencyFormatter currencyFormatter) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public java.lang.String getCurrencyCode() {
        return null;
    }
    
    public int getDecimals() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.lang.String formatAmount(@org.jetbrains.annotations.NotNull
    java.math.BigDecimal amount) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/orders/simplepayments/SimplePaymentsSharedViewModel$Companion;", "", "()V", "DEFAULT_DECIMAL_PRECISION", "", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}