package com.woocommerce.android.media;

import java.lang.System;

/**
 * *
 * This class is responsible for queuing and handling different tasks related to product images upload.
 * It handles three types of works:
 * - [Work.FetchMedia]
 * - [Work.UploadMedia]
 * - [Work.UpdateProduct]
 *
 * And notifies the consumers using the [Event]s it publishes.
 *
 * Uploading media and updating product is done sequentially (using a [Mutex] lock) because our repositories don't
 * play well with parallel requests, due to the use of a single shared continuation.
 */
@kotlinx.coroutines.ExperimentalCoroutinesApi
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\t\n\u0000\n\u0002\u0010%\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 92\u00020\u0001:\u00049:;<B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0012J\u0019\u0010\'\u001a\u00020%2\u0006\u0010(\u001a\u00020\u000fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)J\u000e\u0010*\u001a\u00020%2\u0006\u0010+\u001a\u00020\u001fJ\u0019\u0010,\u001a\u00020%2\u0006\u0010+\u001a\u00020-H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.J\b\u0010/\u001a\u00020%H\u0002J\u0010\u00100\u001a\u00020%2\u0006\u0010+\u001a\u00020\u001fH\u0002J\b\u00101\u001a\u00020%H\u0002J\u0019\u00102\u001a\u00020%2\u0006\u0010+\u001a\u000203H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00104J\b\u00105\u001a\u00020%H\u0002J\u0019\u00106\u001a\u00020%2\u0006\u0010+\u001a\u000207H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00108R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00150\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006="}, d2 = {"Lcom/woocommerce/android/media/ProductImagesUploadWorker;", "", "mediaFilesRepository", "Lcom/woocommerce/android/media/MediaFilesRepository;", "productDetailRepository", "Lcom/woocommerce/android/ui/products/ProductDetailRepository;", "productImagesServiceWrapper", "Lcom/woocommerce/android/media/ProductImagesServiceWrapper;", "notificationHandler", "Lcom/woocommerce/android/media/ProductImagesNotificationHandler;", "appCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lcom/woocommerce/android/media/MediaFilesRepository;Lcom/woocommerce/android/ui/products/ProductDetailRepository;Lcom/woocommerce/android/media/ProductImagesServiceWrapper;Lcom/woocommerce/android/media/ProductImagesNotificationHandler;Lkotlinx/coroutines/CoroutineScope;)V", "_events", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/woocommerce/android/media/ProductImagesUploadWorker$Event;", "cancelledProducts", "", "", "currentJobs", "", "", "Lkotlinx/coroutines/Job;", "events", "Lkotlinx/coroutines/flow/SharedFlow;", "getEvents", "()Lkotlinx/coroutines/flow/SharedFlow;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "pendingWorkList", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/woocommerce/android/media/ProductImagesUploadWorker$Work;", "queue", "uploadList", "", "Lcom/woocommerce/android/media/ProductImagesUploadWorker$MediaUploadEntry;", "cancelUpload", "", "productId", "emitEvent", "event", "(Lcom/woocommerce/android/media/ProductImagesUploadWorker$Event;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "enqueueWork", "work", "fetchMedia", "Lcom/woocommerce/android/media/ProductImagesUploadWorker$Work$FetchMedia;", "(Lcom/woocommerce/android/media/ProductImagesUploadWorker$Work$FetchMedia;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleServiceStatus", "handleWork", "observeQueue", "updateProduct", "Lcom/woocommerce/android/media/ProductImagesUploadWorker$Work$UpdateProduct;", "(Lcom/woocommerce/android/media/ProductImagesUploadWorker$Work$UpdateProduct;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUploadList", "uploadMedia", "Lcom/woocommerce/android/media/ProductImagesUploadWorker$Work$UploadMedia;", "(Lcom/woocommerce/android/media/ProductImagesUploadWorker$Work$UploadMedia;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "Event", "MediaUploadEntry", "Work", "WooCommerce_wasabiDebug"})
@javax.inject.Singleton
public final class ProductImagesUploadWorker {
    private final com.woocommerce.android.media.MediaFilesRepository mediaFilesRepository = null;
    private final com.woocommerce.android.ui.products.ProductDetailRepository productDetailRepository = null;
    private final com.woocommerce.android.media.ProductImagesServiceWrapper productImagesServiceWrapper = null;
    private final com.woocommerce.android.media.ProductImagesNotificationHandler notificationHandler = null;
    private final kotlinx.coroutines.CoroutineScope appCoroutineScope = null;
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.media.ProductImagesUploadWorker.Companion Companion = null;
    public static final long DURATION_BEFORE_STOPPING_SERVICE = 1000L;
    public static final int PRODUCT_UPDATE_RETRIES = 3;
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.woocommerce.android.media.ProductImagesUploadWorker.Work> queue = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.woocommerce.android.media.ProductImagesUploadWorker.Work>> pendingWorkList = null;
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.woocommerce.android.media.ProductImagesUploadWorker.Event> _events = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.SharedFlow<com.woocommerce.android.media.ProductImagesUploadWorker.Event> events = null;
    private final java.util.Set<java.lang.Long> cancelledProducts = null;
    private final java.util.Map<java.lang.Long, java.util.List<kotlinx.coroutines.Job>> currentJobs = null;
    private final java.util.List<com.woocommerce.android.media.ProductImagesUploadWorker.MediaUploadEntry> uploadList = null;
    private final kotlinx.coroutines.sync.Mutex mutex = null;
    
    @javax.inject.Inject
    public ProductImagesUploadWorker(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.media.MediaFilesRepository mediaFilesRepository, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.ProductDetailRepository productDetailRepository, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.media.ProductImagesServiceWrapper productImagesServiceWrapper, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.media.ProductImagesNotificationHandler notificationHandler, @org.jetbrains.annotations.NotNull
    @com.woocommerce.android.di.AppCoroutineScope
    kotlinx.coroutines.CoroutineScope appCoroutineScope) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.SharedFlow<com.woocommerce.android.media.ProductImagesUploadWorker.Event> getEvents() {
        return null;
    }
    
    private final void observeQueue() {
    }
    
    private final void handleServiceStatus() {
    }
    
    private final void updateUploadList() {
    }
    
    /**
     * Allows filtering events for cancelled operations.
     * Please use this instead of accessing [_events] directly
     */
    private final java.lang.Object emitEvent(com.woocommerce.android.media.ProductImagesUploadWorker.Event event, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final void handleWork(com.woocommerce.android.media.ProductImagesUploadWorker.Work work) {
    }
    
    public final void enqueueWork(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.media.ProductImagesUploadWorker.Work work) {
    }
    
    public final void cancelUpload(long productId) {
    }
    
    private final java.lang.Object fetchMedia(com.woocommerce.android.media.ProductImagesUploadWorker.Work.FetchMedia work, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object uploadMedia(com.woocommerce.android.media.ProductImagesUploadWorker.Work.UploadMedia work, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object updateProduct(com.woocommerce.android.media.ProductImagesUploadWorker.Work.UpdateProduct work, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f\u00a8\u0006\r"}, d2 = {"Lcom/woocommerce/android/media/ProductImagesUploadWorker$Work;", "", "()V", "productId", "", "getProductId", "()J", "FetchMedia", "UpdateProduct", "UploadMedia", "Lcom/woocommerce/android/media/ProductImagesUploadWorker$Work$FetchMedia;", "Lcom/woocommerce/android/media/ProductImagesUploadWorker$Work$UploadMedia;", "Lcom/woocommerce/android/media/ProductImagesUploadWorker$Work$UpdateProduct;", "WooCommerce_wasabiDebug"})
    public static abstract class Work {
        
        private Work() {
            super();
        }
        
        public abstract long getProductId();
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/woocommerce/android/media/ProductImagesUploadWorker$Work$FetchMedia;", "Lcom/woocommerce/android/media/ProductImagesUploadWorker$Work;", "productId", "", "localUri", "", "(JLjava/lang/String;)V", "getLocalUri", "()Ljava/lang/String;", "getProductId", "()J", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_wasabiDebug"})
        public static final class FetchMedia extends com.woocommerce.android.media.ProductImagesUploadWorker.Work {
            private final long productId = 0L;
            @org.jetbrains.annotations.NotNull
            private final java.lang.String localUri = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.media.ProductImagesUploadWorker.Work.FetchMedia copy(long productId, @org.jetbrains.annotations.NotNull
            java.lang.String localUri) {
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
            
            public FetchMedia(long productId, @org.jetbrains.annotations.NotNull
            java.lang.String localUri) {
                super();
            }
            
            public final long component1() {
                return 0L;
            }
            
            @java.lang.Override
            public long getProductId() {
                return 0L;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getLocalUri() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001a"}, d2 = {"Lcom/woocommerce/android/media/ProductImagesUploadWorker$Work$UploadMedia;", "Lcom/woocommerce/android/media/ProductImagesUploadWorker$Work;", "productId", "", "localUri", "", "fetchedMedia", "Lorg/wordpress/android/fluxc/model/MediaModel;", "(JLjava/lang/String;Lorg/wordpress/android/fluxc/model/MediaModel;)V", "getFetchedMedia", "()Lorg/wordpress/android/fluxc/model/MediaModel;", "getLocalUri", "()Ljava/lang/String;", "getProductId", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_wasabiDebug"})
        public static final class UploadMedia extends com.woocommerce.android.media.ProductImagesUploadWorker.Work {
            private final long productId = 0L;
            @org.jetbrains.annotations.NotNull
            private final java.lang.String localUri = null;
            @org.jetbrains.annotations.NotNull
            private final org.wordpress.android.fluxc.model.MediaModel fetchedMedia = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.media.ProductImagesUploadWorker.Work.UploadMedia copy(long productId, @org.jetbrains.annotations.NotNull
            java.lang.String localUri, @org.jetbrains.annotations.NotNull
            org.wordpress.android.fluxc.model.MediaModel fetchedMedia) {
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
            
            public UploadMedia(long productId, @org.jetbrains.annotations.NotNull
            java.lang.String localUri, @org.jetbrains.annotations.NotNull
            org.wordpress.android.fluxc.model.MediaModel fetchedMedia) {
                super();
            }
            
            public final long component1() {
                return 0L;
            }
            
            @java.lang.Override
            public long getProductId() {
                return 0L;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getLocalUri() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final org.wordpress.android.fluxc.model.MediaModel component3() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final org.wordpress.android.fluxc.model.MediaModel getFetchedMedia() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lcom/woocommerce/android/media/ProductImagesUploadWorker$Work$UpdateProduct;", "Lcom/woocommerce/android/media/ProductImagesUploadWorker$Work;", "productId", "", "addedImages", "", "Lorg/wordpress/android/fluxc/model/MediaModel;", "(JLjava/util/List;)V", "getAddedImages", "()Ljava/util/List;", "getProductId", "()J", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
        public static final class UpdateProduct extends com.woocommerce.android.media.ProductImagesUploadWorker.Work {
            private final long productId = 0L;
            @org.jetbrains.annotations.NotNull
            private final java.util.List<org.wordpress.android.fluxc.model.MediaModel> addedImages = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.media.ProductImagesUploadWorker.Work.UpdateProduct copy(long productId, @org.jetbrains.annotations.NotNull
            java.util.List<? extends org.wordpress.android.fluxc.model.MediaModel> addedImages) {
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
            
            public UpdateProduct(long productId, @org.jetbrains.annotations.NotNull
            java.util.List<? extends org.wordpress.android.fluxc.model.MediaModel> addedImages) {
                super();
            }
            
            public final long component1() {
                return 0L;
            }
            
            @java.lang.Override
            public long getProductId() {
                return 0L;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.util.List<org.wordpress.android.fluxc.model.MediaModel> component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.util.List<org.wordpress.android.fluxc.model.MediaModel> getAddedImages() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0007\b\t\nB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\u000b\f\r\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/woocommerce/android/media/ProductImagesUploadWorker$Event;", "", "()V", "productId", "", "getProductId", "()J", "MediaUploadEvent", "ProductUpdateEvent", "ProductUploadsCompleted", "ServiceStopped", "Lcom/woocommerce/android/media/ProductImagesUploadWorker$Event$ProductUploadsCompleted;", "Lcom/woocommerce/android/media/ProductImagesUploadWorker$Event$ServiceStopped;", "Lcom/woocommerce/android/media/ProductImagesUploadWorker$Event$MediaUploadEvent;", "Lcom/woocommerce/android/media/ProductImagesUploadWorker$Event$ProductUpdateEvent;", "WooCommerce_wasabiDebug"})
    public static abstract class Event {
        
        private Event() {
            super();
        }
        
        public abstract long getProductId();
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/media/ProductImagesUploadWorker$Event$ProductUploadsCompleted;", "Lcom/woocommerce/android/media/ProductImagesUploadWorker$Event;", "productId", "", "(J)V", "getProductId", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
        public static final class ProductUploadsCompleted extends com.woocommerce.android.media.ProductImagesUploadWorker.Event {
            private final long productId = 0L;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.media.ProductImagesUploadWorker.Event.ProductUploadsCompleted copy(long productId) {
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
            
            public ProductUploadsCompleted(long productId) {
                super();
            }
            
            public final long component1() {
                return 0L;
            }
            
            @java.lang.Override
            public long getProductId() {
                return 0L;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/media/ProductImagesUploadWorker$Event$ServiceStopped;", "Lcom/woocommerce/android/media/ProductImagesUploadWorker$Event;", "()V", "productId", "", "getProductId", "()J", "WooCommerce_wasabiDebug"})
        public static final class ServiceStopped extends com.woocommerce.android.media.ProductImagesUploadWorker.Event {
            @org.jetbrains.annotations.NotNull
            public static final com.woocommerce.android.media.ProductImagesUploadWorker.Event.ServiceStopped INSTANCE = null;
            private static final long productId = 0L;
            
            private ServiceStopped() {
                super();
            }
            
            @java.lang.Override
            public long getProductId() {
                return 0L;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0007\b\t\nB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\u000b\f\r\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/woocommerce/android/media/ProductImagesUploadWorker$Event$MediaUploadEvent;", "Lcom/woocommerce/android/media/ProductImagesUploadWorker$Event;", "()V", "localUri", "", "getLocalUri", "()Ljava/lang/String;", "FetchFailed", "FetchSucceeded", "UploadFailed", "UploadSucceeded", "Lcom/woocommerce/android/media/ProductImagesUploadWorker$Event$MediaUploadEvent$FetchSucceeded;", "Lcom/woocommerce/android/media/ProductImagesUploadWorker$Event$MediaUploadEvent$FetchFailed;", "Lcom/woocommerce/android/media/ProductImagesUploadWorker$Event$MediaUploadEvent$UploadSucceeded;", "Lcom/woocommerce/android/media/ProductImagesUploadWorker$Event$MediaUploadEvent$UploadFailed;", "WooCommerce_wasabiDebug"})
        public static abstract class MediaUploadEvent extends com.woocommerce.android.media.ProductImagesUploadWorker.Event {
            
            private MediaUploadEvent() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public abstract java.lang.String getLocalUri();
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001a"}, d2 = {"Lcom/woocommerce/android/media/ProductImagesUploadWorker$Event$MediaUploadEvent$FetchSucceeded;", "Lcom/woocommerce/android/media/ProductImagesUploadWorker$Event$MediaUploadEvent;", "productId", "", "localUri", "", "fetchedMedia", "Lorg/wordpress/android/fluxc/model/MediaModel;", "(JLjava/lang/String;Lorg/wordpress/android/fluxc/model/MediaModel;)V", "getFetchedMedia", "()Lorg/wordpress/android/fluxc/model/MediaModel;", "getLocalUri", "()Ljava/lang/String;", "getProductId", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_wasabiDebug"})
            public static final class FetchSucceeded extends com.woocommerce.android.media.ProductImagesUploadWorker.Event.MediaUploadEvent {
                private final long productId = 0L;
                @org.jetbrains.annotations.NotNull
                private final java.lang.String localUri = null;
                @org.jetbrains.annotations.NotNull
                private final org.wordpress.android.fluxc.model.MediaModel fetchedMedia = null;
                
                @org.jetbrains.annotations.NotNull
                public final com.woocommerce.android.media.ProductImagesUploadWorker.Event.MediaUploadEvent.FetchSucceeded copy(long productId, @org.jetbrains.annotations.NotNull
                java.lang.String localUri, @org.jetbrains.annotations.NotNull
                org.wordpress.android.fluxc.model.MediaModel fetchedMedia) {
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
                
                public FetchSucceeded(long productId, @org.jetbrains.annotations.NotNull
                java.lang.String localUri, @org.jetbrains.annotations.NotNull
                org.wordpress.android.fluxc.model.MediaModel fetchedMedia) {
                    super();
                }
                
                public final long component1() {
                    return 0L;
                }
                
                @java.lang.Override
                public long getProductId() {
                    return 0L;
                }
                
                @org.jetbrains.annotations.NotNull
                public final java.lang.String component2() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public java.lang.String getLocalUri() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                public final org.wordpress.android.fluxc.model.MediaModel component3() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                public final org.wordpress.android.fluxc.model.MediaModel getFetchedMedia() {
                    return null;
                }
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0005H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/woocommerce/android/media/ProductImagesUploadWorker$Event$MediaUploadEvent$FetchFailed;", "Lcom/woocommerce/android/media/ProductImagesUploadWorker$Event$MediaUploadEvent;", "productId", "", "localUri", "", "(JLjava/lang/String;)V", "getLocalUri", "()Ljava/lang/String;", "getProductId", "()J", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_wasabiDebug"})
            public static final class FetchFailed extends com.woocommerce.android.media.ProductImagesUploadWorker.Event.MediaUploadEvent {
                private final long productId = 0L;
                @org.jetbrains.annotations.NotNull
                private final java.lang.String localUri = null;
                
                @org.jetbrains.annotations.NotNull
                public final com.woocommerce.android.media.ProductImagesUploadWorker.Event.MediaUploadEvent.FetchFailed copy(long productId, @org.jetbrains.annotations.NotNull
                java.lang.String localUri) {
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
                
                public FetchFailed(long productId, @org.jetbrains.annotations.NotNull
                java.lang.String localUri) {
                    super();
                }
                
                public final long component1() {
                    return 0L;
                }
                
                @java.lang.Override
                public long getProductId() {
                    return 0L;
                }
                
                @org.jetbrains.annotations.NotNull
                public final java.lang.String component2() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public java.lang.String getLocalUri() {
                    return null;
                }
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0005H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001a"}, d2 = {"Lcom/woocommerce/android/media/ProductImagesUploadWorker$Event$MediaUploadEvent$UploadSucceeded;", "Lcom/woocommerce/android/media/ProductImagesUploadWorker$Event$MediaUploadEvent;", "productId", "", "localUri", "", "media", "Lorg/wordpress/android/fluxc/model/MediaModel;", "(JLjava/lang/String;Lorg/wordpress/android/fluxc/model/MediaModel;)V", "getLocalUri", "()Ljava/lang/String;", "getMedia", "()Lorg/wordpress/android/fluxc/model/MediaModel;", "getProductId", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_wasabiDebug"})
            public static final class UploadSucceeded extends com.woocommerce.android.media.ProductImagesUploadWorker.Event.MediaUploadEvent {
                private final long productId = 0L;
                @org.jetbrains.annotations.NotNull
                private final java.lang.String localUri = null;
                @org.jetbrains.annotations.NotNull
                private final org.wordpress.android.fluxc.model.MediaModel media = null;
                
                @org.jetbrains.annotations.NotNull
                public final com.woocommerce.android.media.ProductImagesUploadWorker.Event.MediaUploadEvent.UploadSucceeded copy(long productId, @org.jetbrains.annotations.NotNull
                java.lang.String localUri, @org.jetbrains.annotations.NotNull
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
                
                public UploadSucceeded(long productId, @org.jetbrains.annotations.NotNull
                java.lang.String localUri, @org.jetbrains.annotations.NotNull
                org.wordpress.android.fluxc.model.MediaModel media) {
                    super();
                }
                
                public final long component1() {
                    return 0L;
                }
                
                @java.lang.Override
                public long getProductId() {
                    return 0L;
                }
                
                @org.jetbrains.annotations.NotNull
                public final java.lang.String component2() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public java.lang.String getLocalUri() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                public final org.wordpress.android.fluxc.model.MediaModel component3() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                public final org.wordpress.android.fluxc.model.MediaModel getMedia() {
                    return null;
                }
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001a"}, d2 = {"Lcom/woocommerce/android/media/ProductImagesUploadWorker$Event$MediaUploadEvent$UploadFailed;", "Lcom/woocommerce/android/media/ProductImagesUploadWorker$Event$MediaUploadEvent;", "productId", "", "localUri", "", "error", "Lcom/woocommerce/android/media/MediaFilesRepository$MediaUploadException;", "(JLjava/lang/String;Lcom/woocommerce/android/media/MediaFilesRepository$MediaUploadException;)V", "getError", "()Lcom/woocommerce/android/media/MediaFilesRepository$MediaUploadException;", "getLocalUri", "()Ljava/lang/String;", "getProductId", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_wasabiDebug"})
            public static final class UploadFailed extends com.woocommerce.android.media.ProductImagesUploadWorker.Event.MediaUploadEvent {
                private final long productId = 0L;
                @org.jetbrains.annotations.NotNull
                private final java.lang.String localUri = null;
                @org.jetbrains.annotations.NotNull
                private final com.woocommerce.android.media.MediaFilesRepository.MediaUploadException error = null;
                
                @org.jetbrains.annotations.NotNull
                public final com.woocommerce.android.media.ProductImagesUploadWorker.Event.MediaUploadEvent.UploadFailed copy(long productId, @org.jetbrains.annotations.NotNull
                java.lang.String localUri, @org.jetbrains.annotations.NotNull
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
                
                public UploadFailed(long productId, @org.jetbrains.annotations.NotNull
                java.lang.String localUri, @org.jetbrains.annotations.NotNull
                com.woocommerce.android.media.MediaFilesRepository.MediaUploadException error) {
                    super();
                }
                
                public final long component1() {
                    return 0L;
                }
                
                @java.lang.Override
                public long getProductId() {
                    return 0L;
                }
                
                @org.jetbrains.annotations.NotNull
                public final java.lang.String component2() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public java.lang.String getLocalUri() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                public final com.woocommerce.android.media.MediaFilesRepository.MediaUploadException component3() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                public final com.woocommerce.android.media.MediaFilesRepository.MediaUploadException getError() {
                    return null;
                }
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/media/ProductImagesUploadWorker$Event$ProductUpdateEvent;", "Lcom/woocommerce/android/media/ProductImagesUploadWorker$Event;", "()V", "ProductUpdateFailed", "ProductUpdateSucceeded", "Lcom/woocommerce/android/media/ProductImagesUploadWorker$Event$ProductUpdateEvent$ProductUpdateSucceeded;", "Lcom/woocommerce/android/media/ProductImagesUploadWorker$Event$ProductUpdateEvent$ProductUpdateFailed;", "WooCommerce_wasabiDebug"})
        public static abstract class ProductUpdateEvent extends com.woocommerce.android.media.ProductImagesUploadWorker.Event {
            
            private ProductUpdateEvent() {
                super();
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001a"}, d2 = {"Lcom/woocommerce/android/media/ProductImagesUploadWorker$Event$ProductUpdateEvent$ProductUpdateSucceeded;", "Lcom/woocommerce/android/media/ProductImagesUploadWorker$Event$ProductUpdateEvent;", "productId", "", "product", "Lcom/woocommerce/android/model/Product;", "imagesCount", "", "(JLcom/woocommerce/android/model/Product;I)V", "getImagesCount", "()I", "getProduct", "()Lcom/woocommerce/android/model/Product;", "getProductId", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "WooCommerce_wasabiDebug"})
            public static final class ProductUpdateSucceeded extends com.woocommerce.android.media.ProductImagesUploadWorker.Event.ProductUpdateEvent {
                private final long productId = 0L;
                @org.jetbrains.annotations.NotNull
                private final com.woocommerce.android.model.Product product = null;
                private final int imagesCount = 0;
                
                @org.jetbrains.annotations.NotNull
                public final com.woocommerce.android.media.ProductImagesUploadWorker.Event.ProductUpdateEvent.ProductUpdateSucceeded copy(long productId, @org.jetbrains.annotations.NotNull
                com.woocommerce.android.model.Product product, int imagesCount) {
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
                
                public ProductUpdateSucceeded(long productId, @org.jetbrains.annotations.NotNull
                com.woocommerce.android.model.Product product, int imagesCount) {
                    super();
                }
                
                public final long component1() {
                    return 0L;
                }
                
                @java.lang.Override
                public long getProductId() {
                    return 0L;
                }
                
                @org.jetbrains.annotations.NotNull
                public final com.woocommerce.android.model.Product component2() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                public final com.woocommerce.android.model.Product getProduct() {
                    return null;
                }
                
                public final int component3() {
                    return 0;
                }
                
                public final int getImagesCount() {
                    return 0;
                }
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0016"}, d2 = {"Lcom/woocommerce/android/media/ProductImagesUploadWorker$Event$ProductUpdateEvent$ProductUpdateFailed;", "Lcom/woocommerce/android/media/ProductImagesUploadWorker$Event$ProductUpdateEvent;", "productId", "", "product", "Lcom/woocommerce/android/model/Product;", "(JLcom/woocommerce/android/model/Product;)V", "getProduct", "()Lcom/woocommerce/android/model/Product;", "getProductId", "()J", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
            public static final class ProductUpdateFailed extends com.woocommerce.android.media.ProductImagesUploadWorker.Event.ProductUpdateEvent {
                private final long productId = 0L;
                @org.jetbrains.annotations.Nullable
                private final com.woocommerce.android.model.Product product = null;
                
                @org.jetbrains.annotations.NotNull
                public final com.woocommerce.android.media.ProductImagesUploadWorker.Event.ProductUpdateEvent.ProductUpdateFailed copy(long productId, @org.jetbrains.annotations.Nullable
                com.woocommerce.android.model.Product product) {
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
                
                public ProductUpdateFailed(long productId, @org.jetbrains.annotations.Nullable
                com.woocommerce.android.model.Product product) {
                    super();
                }
                
                public final long component1() {
                    return 0L;
                }
                
                @java.lang.Override
                public long getProductId() {
                    return 0L;
                }
                
                @org.jetbrains.annotations.Nullable
                public final com.woocommerce.android.model.Product component2() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable
                public final com.woocommerce.android.model.Product getProduct() {
                    return null;
                }
            }
        }
    }
    
    /**
     * This class is only used to be able to count total of uploads, and number of completed ones, and update
     * notification accordingly
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0017"}, d2 = {"Lcom/woocommerce/android/media/ProductImagesUploadWorker$MediaUploadEntry;", "", "productId", "", "localUri", "", "isDone", "", "(JLjava/lang/String;Z)V", "()Z", "getLocalUri", "()Ljava/lang/String;", "getProductId", "()J", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "WooCommerce_wasabiDebug"})
    public static final class MediaUploadEntry {
        private final long productId = 0L;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String localUri = null;
        private final boolean isDone = false;
        
        /**
         * This class is only used to be able to count total of uploads, and number of completed ones, and update
         * notification accordingly
         */
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.media.ProductImagesUploadWorker.MediaUploadEntry copy(long productId, @org.jetbrains.annotations.NotNull
        java.lang.String localUri, boolean isDone) {
            return null;
        }
        
        /**
         * This class is only used to be able to count total of uploads, and number of completed ones, and update
         * notification accordingly
         */
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        /**
         * This class is only used to be able to count total of uploads, and number of completed ones, and update
         * notification accordingly
         */
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        /**
         * This class is only used to be able to count total of uploads, and number of completed ones, and update
         * notification accordingly
         */
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public MediaUploadEntry(long productId, @org.jetbrains.annotations.NotNull
        java.lang.String localUri, boolean isDone) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getProductId() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getLocalUri() {
            return null;
        }
        
        public final boolean component3() {
            return false;
        }
        
        public final boolean isDone() {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/media/ProductImagesUploadWorker$Companion;", "", "()V", "DURATION_BEFORE_STOPPING_SERVICE", "", "PRODUCT_UPDATE_RETRIES", "", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}