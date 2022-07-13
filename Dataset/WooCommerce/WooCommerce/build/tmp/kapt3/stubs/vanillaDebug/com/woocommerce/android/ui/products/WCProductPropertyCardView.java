package com.woocommerce.android.ui.products;

import java.lang.System;

/**
 * CardView with an optional caption (title), used for product detail properties
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0016\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u001e\u0010\u0010\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/woocommerce/android/ui/products/WCProductPropertyCardView;", "Lcom/google/android/material/card/MaterialCardView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "viewBinding", "Lcom/woocommerce/android/databinding/ProductPropertyCardviewLayoutBinding;", "loadData", "", "data", "", "Lcom/woocommerce/android/ui/products/models/ProductProperty;", "show", "caption", "", "properties", "WooCommerce_vanillaDebug"})
public final class WCProductPropertyCardView extends com.google.android.material.card.MaterialCardView {
    private com.woocommerce.android.databinding.ProductPropertyCardviewLayoutBinding viewBinding;
    
    @kotlin.jvm.JvmOverloads()
    public WCProductPropertyCardView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public WCProductPropertyCardView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public WCProductPropertyCardView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyle) {
        super(null);
    }
    
    public final void show(@org.jetbrains.annotations.Nullable()
    java.lang.String caption, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.woocommerce.android.ui.products.models.ProductProperty> properties) {
    }
    
    private final void loadData(java.util.List<? extends com.woocommerce.android.ui.products.models.ProductProperty> data) {
    }
}