package com.woocommerce.android.media;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J*\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0002J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\rH\u0002J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\rH\u0002J0\u0010\u0017\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001aR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/woocommerce/android/media/ProductImagesUtils;", "", "()V", "OPTIMIZE_IMAGE_MAX_SIZE", "", "OPTIMIZE_IMAGE_QUALITY", "createMediaModel", "Lorg/wordpress/android/fluxc/model/MediaModel;", "mediaStore", "Lorg/wordpress/android/fluxc/store/MediaStore;", "fetchedUri", "Landroid/net/Uri;", "path", "", "localSiteId", "fetchMedia", "context", "Landroid/content/Context;", "mediaUri", "getOptimizedImagePath", "getOptimizedImageUri", "getOptimizedPath", "filePath", "mediaModelFromLocalUri", "localUri", "mediaPickerUtils", "Lorg/wordpress/android/mediapicker/MediaPickerUtils;", "WooCommerce_vanillaDebug"})
public final class ProductImagesUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.media.ProductImagesUtils INSTANCE = null;
    private static final int OPTIMIZE_IMAGE_MAX_SIZE = 3000;
    private static final int OPTIMIZE_IMAGE_QUALITY = 85;
    
    private ProductImagesUtils() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wordpress.android.fluxc.model.MediaModel mediaModelFromLocalUri(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int localSiteId, @org.jetbrains.annotations.NotNull()
    android.net.Uri localUri, @org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.MediaStore mediaStore, @org.jetbrains.annotations.NotNull()
    org.wordpress.android.mediapicker.MediaPickerUtils mediaPickerUtils) {
        return null;
    }
    
    private final org.wordpress.android.fluxc.model.MediaModel createMediaModel(org.wordpress.android.fluxc.store.MediaStore mediaStore, android.net.Uri fetchedUri, java.lang.String path, int localSiteId) {
        return null;
    }
    
    @kotlin.Suppress(names = {"TooGenericExceptionCaught"})
    private final java.lang.String getOptimizedPath(android.content.Context context, java.lang.String filePath) {
        return null;
    }
    
    /**
     * Downloads the {@code mediaUri} and returns the {@link Uri} for the downloaded file
     * <p>
     * If the {@code mediaUri} is already in the the local store, no download will be done and the given
     * {@code mediaUri} will be returned instead. This may return null if the download fails.
     * <p>
     * The current thread is blocked until the download is finished.
     *
     * @return A local {@link Uri} or null if the download failed
     */
    private final android.net.Uri fetchMedia(android.content.Context context, android.net.Uri mediaUri) {
        return null;
    }
    
    /**
     * Resize and compress the passed image
     */
    private final android.net.Uri getOptimizedImageUri(android.content.Context context, java.lang.String path) {
        return null;
    }
    
    @kotlin.Suppress(names = {"TooGenericExceptionCaught"})
    private final java.lang.String getOptimizedImagePath(android.content.Context context, java.lang.String path) {
        return null;
    }
}