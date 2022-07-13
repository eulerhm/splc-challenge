package com.woocommerce.android.ui.products;

import java.lang.System;

/**
 * Helper class that handles navigation logic for product related screens.
 * Currently injected to [BaseProductFragment]. Modify the [navigate] method when you want to add more logic
 * to navigate the Products detail/product sub detail screen.
 *
 * Note that a new data class in the [ProductNavigationTarget] must be added first
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ8\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002\u00a8\u0006\u0012"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductNavigator;", "", "()V", "navigate", "", "fragment", "Landroidx/fragment/app/Fragment;", "target", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget;", "viewProductImages", "remoteId", "", "images", "", "Lcom/woocommerce/android/model/Product$Image;", "selectedImage", "showChooser", "", "WooCommerce_wasabiDebug"})
@javax.inject.Singleton
public final class ProductNavigator {
    
    @javax.inject.Inject
    public ProductNavigator() {
        super();
    }
    
    public final void navigate(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.ProductNavigationTarget target) {
    }
    
    private final void viewProductImages(androidx.fragment.app.Fragment fragment, long remoteId, java.util.List<com.woocommerce.android.model.Product.Image> images, com.woocommerce.android.model.Product.Image selectedImage, boolean showChooser) {
    }
}