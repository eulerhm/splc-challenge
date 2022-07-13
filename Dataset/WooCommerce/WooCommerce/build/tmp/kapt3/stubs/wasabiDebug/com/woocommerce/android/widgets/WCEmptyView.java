package com.woocommerce.android.widgets;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0002J\u0006\u0010\r\u001a\u00020\fJ,\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0013R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/woocommerce/android/widgets/WCEmptyView;", "Landroid/widget/LinearLayout;", "ctx", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/woocommerce/android/databinding/WcEmptyViewBinding;", "lastEmptyViewType", "Lcom/woocommerce/android/widgets/WCEmptyView$EmptyViewType;", "checkOrientation", "", "hide", "show", "type", "searchQueryOrFilter", "", "onButtonClick", "Lkotlin/Function0;", "EmptyViewType", "WooCommerce_wasabiDebug"})
public final class WCEmptyView extends android.widget.LinearLayout {
    private final com.woocommerce.android.databinding.WcEmptyViewBinding binding = null;
    private com.woocommerce.android.widgets.WCEmptyView.EmptyViewType lastEmptyViewType;
    
    @kotlin.jvm.JvmOverloads
    public WCEmptyView(@org.jetbrains.annotations.NotNull
    android.content.Context ctx) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public WCEmptyView(@org.jetbrains.annotations.NotNull
    android.content.Context ctx, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    /**
     * Hide the image in landscape since there isn't enough room for it on most devices
     */
    private final void checkOrientation() {
    }
    
    public final void show(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.widgets.WCEmptyView.EmptyViewType type, @org.jetbrains.annotations.Nullable
    java.lang.String searchQueryOrFilter, @org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function0<kotlin.Unit> onButtonClick) {
    }
    
    public final void hide() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/widgets/WCEmptyView$EmptyViewType;", "", "(Ljava/lang/String;I)V", "DASHBOARD", "ORDER_LIST", "ORDER_LIST_LOADING", "ORDER_LIST_FILTERED", "PRODUCT_LIST", "REVIEW_LIST", "SEARCH_RESULTS", "FILTER_RESULTS", "NETWORK_ERROR", "NETWORK_OFFLINE", "PRODUCT_CATEGORY_LIST", "PRODUCT_TAG_LIST", "SHIPPING_LABEL_CARRIER_RATES", "SHIPPING_LABEL_SERVICE_PACKAGE_LIST", "WooCommerce_wasabiDebug"})
    public static enum EmptyViewType {
        /*public static final*/ DASHBOARD /* = new DASHBOARD() */,
        /*public static final*/ ORDER_LIST /* = new ORDER_LIST() */,
        /*public static final*/ ORDER_LIST_LOADING /* = new ORDER_LIST_LOADING() */,
        /*public static final*/ ORDER_LIST_FILTERED /* = new ORDER_LIST_FILTERED() */,
        /*public static final*/ PRODUCT_LIST /* = new PRODUCT_LIST() */,
        /*public static final*/ REVIEW_LIST /* = new REVIEW_LIST() */,
        /*public static final*/ SEARCH_RESULTS /* = new SEARCH_RESULTS() */,
        /*public static final*/ FILTER_RESULTS /* = new FILTER_RESULTS() */,
        /*public static final*/ NETWORK_ERROR /* = new NETWORK_ERROR() */,
        /*public static final*/ NETWORK_OFFLINE /* = new NETWORK_OFFLINE() */,
        /*public static final*/ PRODUCT_CATEGORY_LIST /* = new PRODUCT_CATEGORY_LIST() */,
        /*public static final*/ PRODUCT_TAG_LIST /* = new PRODUCT_TAG_LIST() */,
        /*public static final*/ SHIPPING_LABEL_CARRIER_RATES /* = new SHIPPING_LABEL_CARRIER_RATES() */,
        /*public static final*/ SHIPPING_LABEL_SERVICE_PACKAGE_LIST /* = new SHIPPING_LABEL_SERVICE_PACKAGE_LIST() */;
        
        EmptyViewType() {
        }
    }
}