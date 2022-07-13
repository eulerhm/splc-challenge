package com.woocommerce.android.mediapicker;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005H\u0016J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0005H\u0016R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/mediapicker/MediaPickerMimeTypeProvider;", "Lorg/wordpress/android/mediapicker/api/MimeTypeProvider;", "()V", "audioTypes", "", "", "getAudioTypes", "()Ljava/util/List;", "imageTypes", "getImageTypes", "videoTypes", "getVideoTypes", "isApplicationTypeSupported", "", "applicationType", "isMimeTypeSupported", "mimeType", "WooCommerce_vanillaDebug"})
public final class MediaPickerMimeTypeProvider implements org.wordpress.android.mediapicker.api.MimeTypeProvider {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> imageTypes = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> videoTypes = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> audioTypes = null;
    
    @javax.inject.Inject()
    public MediaPickerMimeTypeProvider() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<java.lang.String> getImageTypes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<java.lang.String> getVideoTypes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<java.lang.String> getAudioTypes() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isApplicationTypeSupported(@org.jetbrains.annotations.NotNull()
    java.lang.String applicationType) {
        return false;
    }
    
    @java.lang.Override()
    public boolean isMimeTypeSupported(@org.jetbrains.annotations.NotNull()
    java.lang.String mimeType) {
        return false;
    }
}