package com.woocommerce.android.ui.products.addons;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ*\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u0013\u001a\u00020\u0014J(\u0010\u0015\u001a\u00020\f*\u00020\n2\u0006\u0010\r\u001a\u00020\u00162\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0002J\u0014\u0010\u0017\u001a\u00020\f*\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0002J(\u0010\u0018\u001a\u00020\f*\u00020\n2\u0006\u0010\r\u001a\u00020\u00192\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/woocommerce/android/ui/products/addons/ProductAddonCard;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/woocommerce/android/databinding/ProductAddonCardBinding;", "bind", "", "addon", "Lorg/wordpress/android/fluxc/domain/Addon;", "formatCurrencyForDisplay", "Lkotlin/Function1;", "Ljava/math/BigDecimal;", "", "orderMode", "", "bindAdjustedPrice", "Lorg/wordpress/android/fluxc/domain/Addon$HasAdjustablePrice;", "bindDescription", "bindOptionList", "Lorg/wordpress/android/fluxc/domain/Addon$HasOptions;", "WooCommerce_wasabiDebug"})
public final class ProductAddonCard extends android.widget.LinearLayout {
    private final com.woocommerce.android.databinding.ProductAddonCardBinding binding = null;
    
    @kotlin.jvm.JvmOverloads
    public ProductAddonCard(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public ProductAddonCard(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public ProductAddonCard(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public final void bind(@org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.domain.Addon addon, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.math.BigDecimal, java.lang.String> formatCurrencyForDisplay, boolean orderMode) {
    }
    
    private final void bindAdjustedPrice(com.woocommerce.android.databinding.ProductAddonCardBinding $this$bindAdjustedPrice, org.wordpress.android.fluxc.domain.Addon.HasAdjustablePrice addon, kotlin.jvm.functions.Function1<? super java.math.BigDecimal, java.lang.String> formatCurrencyForDisplay) {
    }
    
    private final void bindDescription(com.woocommerce.android.databinding.ProductAddonCardBinding $this$bindDescription, org.wordpress.android.fluxc.domain.Addon addon) {
    }
    
    private final void bindOptionList(com.woocommerce.android.databinding.ProductAddonCardBinding $this$bindOptionList, org.wordpress.android.fluxc.domain.Addon.HasOptions addon, kotlin.jvm.functions.Function1<? super java.math.BigDecimal, java.lang.String> formatCurrencyForDisplay) {
    }
}