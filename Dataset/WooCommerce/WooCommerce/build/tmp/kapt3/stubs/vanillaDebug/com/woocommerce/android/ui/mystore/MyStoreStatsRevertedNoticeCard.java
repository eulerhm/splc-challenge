package com.woocommerce.android.ui.mystore;

import java.lang.System;

/**
 * Dashboard card that displays a reverted notice message if the WooCommerce Admin plugin
 * is disabled/uninstalled from a site but the v4 stats is already displayed to the user
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/woocommerce/android/ui/mystore/MyStoreStatsRevertedNoticeCard;", "Lcom/google/android/material/card/MaterialCardView;", "ctx", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/woocommerce/android/databinding/MyStoreStatsRevertedNoticeBinding;", "initView", "", "listener", "Lcom/woocommerce/android/ui/mystore/MyStoreStatsAvailabilityListener;", "WooCommerce_vanillaDebug"})
public final class MyStoreStatsRevertedNoticeCard extends com.google.android.material.card.MaterialCardView {
    private final com.woocommerce.android.databinding.MyStoreStatsRevertedNoticeBinding binding = null;
    
    @kotlin.jvm.JvmOverloads()
    public MyStoreStatsRevertedNoticeCard(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public MyStoreStatsRevertedNoticeCard(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public MyStoreStatsRevertedNoticeCard(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public final void initView(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.mystore.MyStoreStatsAvailabilityListener listener) {
    }
}