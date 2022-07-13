package com.woocommerce.android.ui.media;

import java.lang.System;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0002/0B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fJ\u000e\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u000fJ\u000e\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u000fJ\b\u0010\u001a\u001a\u00020\u0015H\u0002J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u001c\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u000f2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0012J\u0010\u0010!\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020$H\u0002J\u001a\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120&2\u0006\u0010\u0018\u001a\u00020\u000fJ\u001a\u0010\'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00120&2\u0006\u0010\u0018\u001a\u00020\u000fJ\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000f0&J\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020*0&2\u0006\u0010\u0018\u001a\u00020\u000fJ\u001e\u0010+\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000f2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\u0010\u0010-\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0002J\f\u0010.\u001a\u00020\u0013*\u00020\"H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2 = {"Lcom/woocommerce/android/ui/media/MediaFileUploadHandler;", "", "notificationHandler", "Lcom/woocommerce/android/media/ProductImagesNotificationHandler;", "worker", "Lcom/woocommerce/android/media/ProductImagesUploadWorker;", "resourceProvider", "Lcom/woocommerce/android/viewmodel/ResourceProvider;", "productDetailRepository", "Lcom/woocommerce/android/ui/products/ProductDetailRepository;", "appCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lcom/woocommerce/android/media/ProductImagesNotificationHandler;Lcom/woocommerce/android/media/ProductImagesUploadWorker;Lcom/woocommerce/android/viewmodel/ResourceProvider;Lcom/woocommerce/android/ui/products/ProductDetailRepository;Lkotlinx/coroutines/CoroutineScope;)V", "externalObservers", "", "", "uploadsStatus", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/woocommerce/android/ui/media/MediaFileUploadHandler$ProductImageUploadData;", "assignUploadsToCreatedProduct", "", "productId", "cancelUpload", "remoteProductId", "clearImageErrors", "clearPendingUploads", "enqueueMediaUpload", "event", "Lcom/woocommerce/android/media/ProductImagesUploadWorker$Event$MediaUploadEvent$FetchSucceeded;", "enqueueUpload", "uris", "", "handleMediaUploadEvent", "Lcom/woocommerce/android/media/ProductImagesUploadWorker$Event$MediaUploadEvent;", "handleProductUpdateEvent", "Lcom/woocommerce/android/media/ProductImagesUploadWorker$Event$ProductUpdateEvent;", "observeCurrentUploadErrors", "Lkotlinx/coroutines/flow/Flow;", "observeCurrentUploads", "observeProductImageChanges", "observeSuccessfulUploads", "Lorg/wordpress/android/fluxc/model/MediaModel;", "showUploadFailureNotifIfNoObserver", "state", "updateProductIfNeeded", "toStatus", "ProductImageUploadData", "UploadStatus", "WooCommerce_vanillaDebug"})
@javax.inject.Singleton()
public final class MediaFileUploadHandler {
    private final com.woocommerce.android.media.ProductImagesNotificationHandler notificationHandler = null;
    private final com.woocommerce.android.media.ProductImagesUploadWorker worker = null;
    private final com.woocommerce.android.viewmodel.ResourceProvider resourceProvider = null;
    private final com.woocommerce.android.ui.products.ProductDetailRepository productDetailRepository = null;
    private final kotlinx.coroutines.CoroutineScope appCoroutineScope = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.woocommerce.android.ui.media.MediaFileUploadHandler.ProductImageUploadData>> uploadsStatus = null;
    private final java.util.List<java.lang.Long> externalObservers = null;
    
    @javax.inject.Inject()
    public MediaFileUploadHandler(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.media.ProductImagesNotificationHandler notificationHandler, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.media.ProductImagesUploadWorker worker, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.viewmodel.ResourceProvider resourceProvider, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.ProductDetailRepository productDetailRepository, @org.jetbrains.annotations.NotNull()
    @com.woocommerce.android.di.AppCoroutineScope()
    kotlinx.coroutines.CoroutineScope appCoroutineScope) {
        super();
    }
    
    private final void handleMediaUploadEvent(com.woocommerce.android.media.ProductImagesUploadWorker.Event.MediaUploadEvent event) {
    }
    
    private final void enqueueMediaUpload(com.woocommerce.android.media.ProductImagesUploadWorker.Event.MediaUploadEvent.FetchSucceeded event) {
    }
    
    private final void handleProductUpdateEvent(com.woocommerce.android.media.ProductImagesUploadWorker.Event.ProductUpdateEvent event) {
    }
    
    private final void updateProductIfNeeded(long productId) {
    }
    
    private final void showUploadFailureNotifIfNoObserver(long productId, java.util.List<com.woocommerce.android.ui.media.MediaFileUploadHandler.ProductImageUploadData> state) {
    }
    
    private final void clearPendingUploads() {
    }
    
    public final void enqueueUpload(long remoteProductId, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> uris) {
    }
    
    public final void cancelUpload(long remoteProductId) {
    }
    
    public final void clearImageErrors(long remoteProductId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.woocommerce.android.ui.media.MediaFileUploadHandler.ProductImageUploadData>> observeCurrentUploadErrors(long remoteProductId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<java.lang.String>> observeCurrentUploads(long remoteProductId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<org.wordpress.android.fluxc.model.MediaModel> observeSuccessfulUploads(long remoteProductId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Long> observeProductImageChanges() {
        return null;
    }
    
    public final void assignUploadsToCreatedProduct(long productId) {
    }
    
    private final com.woocommerce.android.ui.media.MediaFileUploadHandler.ProductImageUploadData toStatus(com.woocommerce.android.media.ProductImagesUploadWorker.Event.MediaUploadEvent $this$toStatus) {
        return null;
    }
    
    /**
     * *
     * Identifies both an event and status.
     * Holds a reference to the productId and localUri to keep track of each upload
     */
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006 "}, d2 = {"Lcom/woocommerce/android/ui/media/MediaFileUploadHandler$ProductImageUploadData;", "Landroid/os/Parcelable;", "remoteProductId", "", "localUri", "", "uploadStatus", "Lcom/woocommerce/android/ui/media/MediaFileUploadHandler$UploadStatus;", "(JLjava/lang/String;Lcom/woocommerce/android/ui/media/MediaFileUploadHandler$UploadStatus;)V", "getLocalUri", "()Ljava/lang/String;", "getRemoteProductId", "()J", "getUploadStatus", "()Lcom/woocommerce/android/ui/media/MediaFileUploadHandler$UploadStatus;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
    public static final class ProductImageUploadData implements android.os.Parcelable {
        private final long remoteProductId = 0L;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String localUri = null;
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.ui.media.MediaFileUploadHandler.UploadStatus uploadStatus = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.media.MediaFileUploadHandler.ProductImageUploadData> CREATOR = null;
        
        /**
         * *
         * Identifies both an event and status.
         * Holds a reference to the productId and localUri to keep track of each upload
         */
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.media.MediaFileUploadHandler.ProductImageUploadData copy(long remoteProductId, @org.jetbrains.annotations.NotNull()
        java.lang.String localUri, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.media.MediaFileUploadHandler.UploadStatus uploadStatus) {
            return null;
        }
        
        /**
         * *
         * Identifies both an event and status.
         * Holds a reference to the productId and localUri to keep track of each upload
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * *
         * Identifies both an event and status.
         * Holds a reference to the productId and localUri to keep track of each upload
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * *
         * Identifies both an event and status.
         * Holds a reference to the productId and localUri to keep track of each upload
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public ProductImageUploadData(long remoteProductId, @org.jetbrains.annotations.NotNull()
        java.lang.String localUri, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.media.MediaFileUploadHandler.UploadStatus uploadStatus) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getRemoteProductId() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLocalUri() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.media.MediaFileUploadHandler.UploadStatus component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.media.MediaFileUploadHandler.UploadStatus getUploadStatus() {
            return null;
        }
        
        @java.lang.Override()
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.media.MediaFileUploadHandler.ProductImageUploadData> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.media.MediaFileUploadHandler.ProductImageUploadData createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.media.MediaFileUploadHandler.ProductImageUploadData[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/woocommerce/android/ui/media/MediaFileUploadHandler$UploadStatus;", "Landroid/os/Parcelable;", "()V", "Failed", "InProgress", "UploadSuccess", "Lcom/woocommerce/android/ui/media/MediaFileUploadHandler$UploadStatus$InProgress;", "Lcom/woocommerce/android/ui/media/MediaFileUploadHandler$UploadStatus$Failed;", "Lcom/woocommerce/android/ui/media/MediaFileUploadHandler$UploadStatus$UploadSuccess;", "WooCommerce_vanillaDebug"})
    public static abstract class UploadStatus implements android.os.Parcelable {
        
        private UploadStatus() {
            super();
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u00d6\u0001\u00a8\u0006\n"}, d2 = {"Lcom/woocommerce/android/ui/media/MediaFileUploadHandler$UploadStatus$InProgress;", "Lcom/woocommerce/android/ui/media/MediaFileUploadHandler$UploadStatus;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
        public static final class InProgress extends com.woocommerce.android.ui.media.MediaFileUploadHandler.UploadStatus {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.media.MediaFileUploadHandler.UploadStatus.InProgress INSTANCE = null;
            public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.media.MediaFileUploadHandler.UploadStatus.InProgress> CREATOR = null;
            
            private InProgress() {
                super();
            }
            
            @java.lang.Override()
            public int describeContents() {
                return 0;
            }
            
            @java.lang.Override()
            public void writeToParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel parcel, int flags) {
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
            public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.media.MediaFileUploadHandler.UploadStatus.InProgress> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.ui.media.MediaFileUploadHandler.UploadStatus.InProgress createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.ui.media.MediaFileUploadHandler.UploadStatus.InProgress[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006 "}, d2 = {"Lcom/woocommerce/android/ui/media/MediaFileUploadHandler$UploadStatus$Failed;", "Lcom/woocommerce/android/ui/media/MediaFileUploadHandler$UploadStatus;", "media", "Lorg/wordpress/android/fluxc/model/MediaModel;", "mediaErrorType", "Lorg/wordpress/android/fluxc/store/MediaStore$MediaErrorType;", "mediaErrorMessage", "", "(Lorg/wordpress/android/fluxc/model/MediaModel;Lorg/wordpress/android/fluxc/store/MediaStore$MediaErrorType;Ljava/lang/String;)V", "getMedia", "()Lorg/wordpress/android/fluxc/model/MediaModel;", "getMediaErrorMessage", "()Ljava/lang/String;", "getMediaErrorType", "()Lorg/wordpress/android/fluxc/store/MediaStore$MediaErrorType;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
        public static final class Failed extends com.woocommerce.android.ui.media.MediaFileUploadHandler.UploadStatus {
            @org.jetbrains.annotations.NotNull()
            private final org.wordpress.android.fluxc.model.MediaModel media = null;
            @org.jetbrains.annotations.NotNull()
            private final org.wordpress.android.fluxc.store.MediaStore.MediaErrorType mediaErrorType = null;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String mediaErrorMessage = null;
            public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.media.MediaFileUploadHandler.UploadStatus.Failed> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.media.MediaFileUploadHandler.UploadStatus.Failed copy(@org.jetbrains.annotations.NotNull()
            org.wordpress.android.fluxc.model.MediaModel media, @org.jetbrains.annotations.NotNull()
            org.wordpress.android.fluxc.store.MediaStore.MediaErrorType mediaErrorType, @org.jetbrains.annotations.NotNull()
            java.lang.String mediaErrorMessage) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public Failed(@org.jetbrains.annotations.NotNull()
            org.wordpress.android.fluxc.model.MediaModel media, @org.jetbrains.annotations.NotNull()
            org.wordpress.android.fluxc.store.MediaStore.MediaErrorType mediaErrorType, @org.jetbrains.annotations.NotNull()
            java.lang.String mediaErrorMessage) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final org.wordpress.android.fluxc.model.MediaModel component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final org.wordpress.android.fluxc.model.MediaModel getMedia() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final org.wordpress.android.fluxc.store.MediaStore.MediaErrorType component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final org.wordpress.android.fluxc.store.MediaStore.MediaErrorType getMediaErrorType() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component3() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getMediaErrorMessage() {
                return null;
            }
            
            @java.lang.Override()
            public int describeContents() {
                return 0;
            }
            
            @java.lang.Override()
            public void writeToParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel parcel, int flags) {
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
            public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.media.MediaFileUploadHandler.UploadStatus.Failed> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.ui.media.MediaFileUploadHandler.UploadStatus.Failed createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.ui.media.MediaFileUploadHandler.UploadStatus.Failed[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\nH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Lcom/woocommerce/android/ui/media/MediaFileUploadHandler$UploadStatus$UploadSuccess;", "Lcom/woocommerce/android/ui/media/MediaFileUploadHandler$UploadStatus;", "media", "Lorg/wordpress/android/fluxc/model/MediaModel;", "(Lorg/wordpress/android/fluxc/model/MediaModel;)V", "getMedia", "()Lorg/wordpress/android/fluxc/model/MediaModel;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
        public static final class UploadSuccess extends com.woocommerce.android.ui.media.MediaFileUploadHandler.UploadStatus {
            @org.jetbrains.annotations.NotNull()
            private final org.wordpress.android.fluxc.model.MediaModel media = null;
            public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.media.MediaFileUploadHandler.UploadStatus.UploadSuccess> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.media.MediaFileUploadHandler.UploadStatus.UploadSuccess copy(@org.jetbrains.annotations.NotNull()
            org.wordpress.android.fluxc.model.MediaModel media) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public UploadSuccess(@org.jetbrains.annotations.NotNull()
            org.wordpress.android.fluxc.model.MediaModel media) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final org.wordpress.android.fluxc.model.MediaModel component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final org.wordpress.android.fluxc.model.MediaModel getMedia() {
                return null;
            }
            
            @java.lang.Override()
            public int describeContents() {
                return 0;
            }
            
            @java.lang.Override()
            public void writeToParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel parcel, int flags) {
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
            public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.media.MediaFileUploadHandler.UploadStatus.UploadSuccess> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.ui.media.MediaFileUploadHandler.UploadStatus.UploadSuccess createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.ui.media.MediaFileUploadHandler.UploadStatus.UploadSuccess[] newArray(int size) {
                    return null;
                }
            }
        }
    }
}