package com.woocommerce.android.ui.base;

import java.lang.System;

/**
 * Special interface for top-level fragments hosted by the bottom bar.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/woocommerce/android/ui/base/TopLevelFragmentView;", "Lcom/woocommerce/android/ui/base/BaseFragmentView;", "scrollToTop", "", "WooCommerce_wasabiDebug"})
public abstract interface TopLevelFragmentView extends com.woocommerce.android.ui.base.BaseFragmentView {
    
    /**
     * Scroll to the top of this view
     */
    public abstract void scrollToTop();
}