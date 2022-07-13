package com.woocommerce.android.mediapicker;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/woocommerce/android/mediapicker/MediaPickerLoaderFactory;", "Lorg/wordpress/android/mediapicker/loader/MediaLoaderFactory;", "deviceMediaSourceFactory", "Lorg/wordpress/android/mediapicker/source/device/DeviceMediaSource$Factory;", "mediaLibrarySourceFactory", "Lorg/wordpress/android/mediapicker/source/wordpress/MediaLibrarySource$Factory;", "(Lorg/wordpress/android/mediapicker/source/device/DeviceMediaSource$Factory;Lorg/wordpress/android/mediapicker/source/wordpress/MediaLibrarySource$Factory;)V", "build", "Lorg/wordpress/android/mediapicker/loader/MediaLoader;", "mediaPickerSetup", "Lorg/wordpress/android/mediapicker/api/MediaPickerSetup;", "WooCommerce_wasabiDebug"})
public final class MediaPickerLoaderFactory implements org.wordpress.android.mediapicker.loader.MediaLoaderFactory {
    private final org.wordpress.android.mediapicker.source.device.DeviceMediaSource.Factory deviceMediaSourceFactory = null;
    private final org.wordpress.android.mediapicker.source.wordpress.MediaLibrarySource.Factory mediaLibrarySourceFactory = null;
    
    @javax.inject.Inject
    public MediaPickerLoaderFactory(@org.jetbrains.annotations.NotNull
    org.wordpress.android.mediapicker.source.device.DeviceMediaSource.Factory deviceMediaSourceFactory, @org.jetbrains.annotations.NotNull
    org.wordpress.android.mediapicker.source.wordpress.MediaLibrarySource.Factory mediaLibrarySourceFactory) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public org.wordpress.android.mediapicker.loader.MediaLoader build(@org.jetbrains.annotations.NotNull
    org.wordpress.android.mediapicker.api.MediaPickerSetup mediaPickerSetup) {
        return null;
    }
}