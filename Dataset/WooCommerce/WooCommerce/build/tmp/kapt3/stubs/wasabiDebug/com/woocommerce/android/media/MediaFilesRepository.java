package com.woocommerce.android.media;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u001d\u001e\u001fB?\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0013\u001a\u00020\u0014J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001a\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u001cR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006 "}, d2 = {"Lcom/woocommerce/android/media/MediaFilesRepository;", "", "dispatcher", "Lorg/wordpress/android/fluxc/Dispatcher;", "context", "Landroid/content/Context;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "mediaStore", "Lorg/wordpress/android/fluxc/store/MediaStore;", "dispatchers", "Lcom/woocommerce/android/util/CoroutineDispatchers;", "resourceProvider", "Lcom/woocommerce/android/viewmodel/ResourceProvider;", "mediaPickerUtils", "Lorg/wordpress/android/mediapicker/MediaPickerUtils;", "(Lorg/wordpress/android/fluxc/Dispatcher;Landroid/content/Context;Lcom/woocommerce/android/tools/SelectedSite;Lorg/wordpress/android/fluxc/store/MediaStore;Lcom/woocommerce/android/util/CoroutineDispatchers;Lcom/woocommerce/android/viewmodel/ResourceProvider;Lorg/wordpress/android/mediapicker/MediaPickerUtils;)V", "fetchMedia", "Lorg/wordpress/android/fluxc/model/MediaModel;", "localUri", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadFile", "Lkotlinx/coroutines/flow/Flow;", "Lcom/woocommerce/android/media/MediaFilesRepository$UploadResult;", "uploadMedia", "localMediaModel", "stripLocation", "", "MediaUploadException", "OnMediaUploadListener", "UploadResult", "WooCommerce_wasabiDebug"})
public final class MediaFilesRepository {
    private final org.wordpress.android.fluxc.Dispatcher dispatcher = null;
    private final android.content.Context context = null;
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    private final org.wordpress.android.fluxc.store.MediaStore mediaStore = null;
    private final com.woocommerce.android.util.CoroutineDispatchers dispatchers = null;
    private final com.woocommerce.android.viewmodel.ResourceProvider resourceProvider = null;
    private final org.wordpress.android.mediapicker.MediaPickerUtils mediaPickerUtils = null;
    
    @javax.inject.Inject
    public MediaFilesRepository(@org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.Dispatcher dispatcher, @org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.SelectedSite selectedSite, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.MediaStore mediaStore, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.CoroutineDispatchers dispatchers, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.viewmodel.ResourceProvider resourceProvider, @org.jetbrains.annotations.NotNull
    org.wordpress.android.mediapicker.MediaPickerUtils mediaPickerUtils) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object fetchMedia(@org.jetbrains.annotations.NotNull
    java.lang.String localUri, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super org.wordpress.android.fluxc.model.MediaModel> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.woocommerce.android.media.MediaFilesRepository.UploadResult> uploadMedia(@org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.model.MediaModel localMediaModel, boolean stripLocation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.woocommerce.android.media.MediaFilesRepository.UploadResult> uploadFile(@org.jetbrains.annotations.NotNull
    java.lang.String localUri) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/woocommerce/android/media/MediaFilesRepository$OnMediaUploadListener;", "", "producerScope", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/woocommerce/android/media/MediaFilesRepository$UploadResult;", "(Lcom/woocommerce/android/media/MediaFilesRepository;Lkotlinx/coroutines/channels/ProducerScope;)V", "onMediaUploaded", "", "event", "Lorg/wordpress/android/fluxc/store/MediaStore$OnMediaUploaded;", "WooCommerce_wasabiDebug"})
    final class OnMediaUploadListener {
        private final kotlinx.coroutines.channels.ProducerScope<com.woocommerce.android.media.MediaFilesRepository.UploadResult> producerScope = null;
        
        public OnMediaUploadListener(@org.jetbrains.annotations.NotNull
        kotlinx.coroutines.channels.ProducerScope<? super com.woocommerce.android.media.MediaFilesRepository.UploadResult> producerScope) {
            super();
        }
        
        @java.lang.SuppressWarnings(value = {"unused"})
        @kotlin.Suppress(names = {"LongMethod"})
        @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.BACKGROUND)
        public final void onMediaUploaded(@org.jetbrains.annotations.NotNull
        org.wordpress.android.fluxc.store.MediaStore.OnMediaUploaded event) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/woocommerce/android/media/MediaFilesRepository$MediaUploadException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "media", "Lorg/wordpress/android/fluxc/model/MediaModel;", "errorType", "Lorg/wordpress/android/fluxc/store/MediaStore$MediaErrorType;", "errorMessage", "", "(Lorg/wordpress/android/fluxc/model/MediaModel;Lorg/wordpress/android/fluxc/store/MediaStore$MediaErrorType;Ljava/lang/String;)V", "getErrorMessage", "()Ljava/lang/String;", "getErrorType", "()Lorg/wordpress/android/fluxc/store/MediaStore$MediaErrorType;", "getMedia", "()Lorg/wordpress/android/fluxc/model/MediaModel;", "WooCommerce_wasabiDebug"})
    public static final class MediaUploadException extends java.lang.Exception {
        @org.jetbrains.annotations.NotNull
        private final org.wordpress.android.fluxc.model.MediaModel media = null;
        @org.jetbrains.annotations.NotNull
        private final org.wordpress.android.fluxc.store.MediaStore.MediaErrorType errorType = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String errorMessage = null;
        
        public MediaUploadException(@org.jetbrains.annotations.NotNull
        org.wordpress.android.fluxc.model.MediaModel media, @org.jetbrains.annotations.NotNull
        org.wordpress.android.fluxc.store.MediaStore.MediaErrorType errorType, @org.jetbrains.annotations.NotNull
        java.lang.String errorMessage) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final org.wordpress.android.fluxc.model.MediaModel getMedia() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final org.wordpress.android.fluxc.store.MediaStore.MediaErrorType getErrorType() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getErrorMessage() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/woocommerce/android/media/MediaFilesRepository$UploadResult;", "", "()V", "UploadFailure", "UploadProgress", "UploadSuccess", "Lcom/woocommerce/android/media/MediaFilesRepository$UploadResult$UploadProgress;", "Lcom/woocommerce/android/media/MediaFilesRepository$UploadResult$UploadSuccess;", "Lcom/woocommerce/android/media/MediaFilesRepository$UploadResult$UploadFailure;", "WooCommerce_wasabiDebug"})
    public static abstract class UploadResult {
        
        private UploadResult() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/media/MediaFilesRepository$UploadResult$UploadProgress;", "Lcom/woocommerce/android/media/MediaFilesRepository$UploadResult;", "progress", "", "(F)V", "getProgress", "()F", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
        public static final class UploadProgress extends com.woocommerce.android.media.MediaFilesRepository.UploadResult {
            private final float progress = 0.0F;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.media.MediaFilesRepository.UploadResult.UploadProgress copy(float progress) {
                return null;
            }
            
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public UploadProgress(float progress) {
                super();
            }
            
            public final float component1() {
                return 0.0F;
            }
            
            public final float getProgress() {
                return 0.0F;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/media/MediaFilesRepository$UploadResult$UploadSuccess;", "Lcom/woocommerce/android/media/MediaFilesRepository$UploadResult;", "media", "Lorg/wordpress/android/fluxc/model/MediaModel;", "(Lorg/wordpress/android/fluxc/model/MediaModel;)V", "getMedia", "()Lorg/wordpress/android/fluxc/model/MediaModel;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
        public static final class UploadSuccess extends com.woocommerce.android.media.MediaFilesRepository.UploadResult {
            @org.jetbrains.annotations.NotNull
            private final org.wordpress.android.fluxc.model.MediaModel media = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.media.MediaFilesRepository.UploadResult.UploadSuccess copy(@org.jetbrains.annotations.NotNull
            org.wordpress.android.fluxc.model.MediaModel media) {
                return null;
            }
            
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public UploadSuccess(@org.jetbrains.annotations.NotNull
            org.wordpress.android.fluxc.model.MediaModel media) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final org.wordpress.android.fluxc.model.MediaModel component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final org.wordpress.android.fluxc.model.MediaModel getMedia() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/media/MediaFilesRepository$UploadResult$UploadFailure;", "Lcom/woocommerce/android/media/MediaFilesRepository$UploadResult;", "error", "Lcom/woocommerce/android/media/MediaFilesRepository$MediaUploadException;", "(Lcom/woocommerce/android/media/MediaFilesRepository$MediaUploadException;)V", "getError", "()Lcom/woocommerce/android/media/MediaFilesRepository$MediaUploadException;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
        public static final class UploadFailure extends com.woocommerce.android.media.MediaFilesRepository.UploadResult {
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.media.MediaFilesRepository.MediaUploadException error = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.media.MediaFilesRepository.UploadResult.UploadFailure copy(@org.jetbrains.annotations.NotNull
            com.woocommerce.android.media.MediaFilesRepository.MediaUploadException error) {
                return null;
            }
            
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public UploadFailure(@org.jetbrains.annotations.NotNull
            com.woocommerce.android.media.MediaFilesRepository.MediaUploadException error) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.media.MediaFilesRepository.MediaUploadException component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.media.MediaFilesRepository.MediaUploadException getError() {
                return null;
            }
        }
    }
}