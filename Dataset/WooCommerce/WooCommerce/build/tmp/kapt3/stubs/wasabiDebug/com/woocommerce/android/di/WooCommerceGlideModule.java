package com.woocommerce.android.di;

import java.lang.System;

/**
 * Custom [AppGlideModule] that replaces Glide's default [RequestQueue] with FluxC's.
 */
@com.bumptech.glide.annotation.GlideModule
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\b\u0010\f\u001a\u00020\rH\u0016J \u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/woocommerce/android/di/WooCommerceGlideModule;", "Lcom/bumptech/glide/module/AppGlideModule;", "()V", "requestQueue", "Lcom/android/volley/RequestQueue;", "applyOptions", "", "context", "Landroid/content/Context;", "builder", "Lcom/bumptech/glide/GlideBuilder;", "initGlideCache", "isManifestParsingEnabled", "", "registerComponents", "glide", "Lcom/bumptech/glide/Glide;", "registry", "Lcom/bumptech/glide/Registry;", "WooCommerceGlideEntryPoint", "WooCommerce_wasabiDebug"})
public final class WooCommerceGlideModule extends com.bumptech.glide.module.AppGlideModule {
    private com.android.volley.RequestQueue requestQueue;
    
    public WooCommerceGlideModule() {
        super();
    }
    
    @java.lang.Override
    public void applyOptions(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.bumptech.glide.GlideBuilder builder) {
    }
    
    @java.lang.Override
    public boolean isManifestParsingEnabled() {
        return false;
    }
    
    @java.lang.Override
    public void registerComponents(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.bumptech.glide.Glide glide, @org.jetbrains.annotations.NotNull
    com.bumptech.glide.Registry registry) {
    }
    
    /**
     * Reduces the size of the disk cache if Android tells us our cache quota is smaller than Glide's
     * default cache size. Note that this only affects devices running API 26 or later since earlier
     * APIs don't support getCacheQuotaBytes().
     */
    private final void initGlideCache(android.content.Context context, com.bumptech.glide.GlideBuilder builder) {
    }
    
    @dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
    @dagger.hilt.EntryPoint
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'\u00a8\u0006\u0004"}, d2 = {"Lcom/woocommerce/android/di/WooCommerceGlideModule$WooCommerceGlideEntryPoint;", "", "requestQueue", "Lcom/android/volley/RequestQueue;", "WooCommerce_wasabiDebug"})
    public static abstract interface WooCommerceGlideEntryPoint {
        
        @org.jetbrains.annotations.NotNull
        @javax.inject.Named(value = "custom-ssl")
        public abstract com.android.volley.RequestQueue requestQueue();
    }
}