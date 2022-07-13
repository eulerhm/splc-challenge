package com.woocommerce.android.ui.products;

import java.lang.System;

/**
 * Single image viewer used by the ViewPager in [ProductImagesFragment]
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 +2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001+B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0012\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u000fH\u0016J4\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u0015H\u0016J>\u0010\u001d\u001a\u00020\u00152\b\u0010\u001e\u001a\u0004\u0018\u00010\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001b2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010\u001c\u001a\u00020\u0015H\u0016J\b\u0010!\u001a\u00020\u000fH\u0016J\u0010\u0010\"\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u0012H\u0016J\u001a\u0010$\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020&2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u000e\u0010\'\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u000bJ\u0010\u0010)\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\u0015H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lcom/woocommerce/android/ui/products/ImageViewerFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/bumptech/glide/request/RequestListener;", "Landroid/graphics/drawable/Drawable;", "()V", "_binding", "Lcom/woocommerce/android/databinding/FragmentImageViewerBinding;", "binding", "getBinding", "()Lcom/woocommerce/android/databinding/FragmentImageViewerBinding;", "imageListener", "Lcom/woocommerce/android/ui/products/ImageViewerFragment$Companion$ImageViewerListener;", "imageUrl", "", "loadImage", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onLoadFailed", "", "e", "Lcom/bumptech/glide/load/engine/GlideException;", "model", "", "target", "Lcom/bumptech/glide/request/target/Target;", "isFirstResource", "onResourceReady", "resource", "dataSource", "Lcom/bumptech/glide/load/DataSource;", "onResume", "onSaveInstanceState", "outState", "onViewCreated", "view", "Landroid/view/View;", "setImageListener", "listener", "showProgress", "show", "Companion", "WooCommerce_vanillaDebug"})
public final class ImageViewerFragment extends androidx.fragment.app.Fragment implements com.bumptech.glide.request.RequestListener<android.graphics.drawable.Drawable> {
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.products.ImageViewerFragment.Companion Companion = null;
    private static final java.lang.String KEY_IMAGE_URL = "image_url";
    private java.lang.String imageUrl;
    private com.woocommerce.android.ui.products.ImageViewerFragment.Companion.ImageViewerListener imageListener;
    private com.woocommerce.android.databinding.FragmentImageViewerBinding _binding;
    
    public ImageViewerFragment() {
        super();
    }
    
    private final com.woocommerce.android.databinding.FragmentImageViewerBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    public final void setImageListener(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.ImageViewerFragment.Companion.ImageViewerListener listener) {
    }
    
    private final void loadImage() {
    }
    
    private final void showProgress(boolean show) {
    }
    
    /**
     * Glide failed to load the image, alert the host activity
     */
    @java.lang.Override()
    public boolean onLoadFailed(@org.jetbrains.annotations.Nullable()
    com.bumptech.glide.load.engine.GlideException e, @org.jetbrains.annotations.Nullable()
    java.lang.Object model, @org.jetbrains.annotations.Nullable()
    com.bumptech.glide.request.target.Target<android.graphics.drawable.Drawable> target, boolean isFirstResource) {
        return false;
    }
    
    /**
     * Glide has loaded the image, hide the progress bar
     */
    @java.lang.Override()
    public boolean onResourceReady(@org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable resource, @org.jetbrains.annotations.Nullable()
    java.lang.Object model, @org.jetbrains.annotations.Nullable()
    com.bumptech.glide.request.target.Target<android.graphics.drawable.Drawable> target, @org.jetbrains.annotations.Nullable()
    com.bumptech.glide.load.DataSource dataSource, boolean isFirstResource) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\tB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/woocommerce/android/ui/products/ImageViewerFragment$Companion;", "", "()V", "KEY_IMAGE_URL", "", "newInstance", "Lcom/woocommerce/android/ui/products/ImageViewerFragment;", "imageModel", "Lcom/woocommerce/android/model/Product$Image;", "ImageViewerListener", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.ImageViewerFragment newInstance(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.Product.Image imageModel) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/products/ImageViewerFragment$Companion$ImageViewerListener;", "", "onImageLoadError", "", "onImageTapped", "WooCommerce_vanillaDebug"})
        public static abstract interface ImageViewerListener {
            
            public abstract void onImageTapped();
            
            public abstract void onImageLoadError();
        }
    }
}