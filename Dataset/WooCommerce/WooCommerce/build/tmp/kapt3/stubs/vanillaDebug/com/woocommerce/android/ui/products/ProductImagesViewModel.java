package com.woocommerce.android.ui.products;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\bEFGHIJKLB\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020)H\u0002J\u000e\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020\rJ\u000e\u0010-\u001a\u00020)2\u0006\u0010,\u001a\u00020\rJ\u000e\u0010.\u001a\u00020)2\u0006\u0010,\u001a\u00020\rJ\u0006\u0010/\u001a\u00020)J\u0016\u00100\u001a\u00020)2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000202J\u000e\u00104\u001a\u00020)2\u0006\u00105\u001a\u000206J\u0006\u00107\u001a\u00020)J\u0014\u00108\u001a\u00020)2\f\u00109\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u0006\u0010:\u001a\u00020)J\u0006\u0010;\u001a\u00020)J\u0006\u0010<\u001a\u00020)J\u0006\u0010=\u001a\u00020)J\u0006\u0010>\u001a\u00020)J\b\u0010?\u001a\u00020)H\u0002J\b\u0010@\u001a\u00020)H\u0002J\u001c\u0010A\u001a\u00020)2\u0006\u0010B\u001a\u0002062\f\u0010C\u001a\b\u0012\u0004\u0012\u00020D0\fR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001c8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001c0%\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'\u00a8\u0006M"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductImagesViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "networkStatus", "Lcom/woocommerce/android/tools/NetworkStatus;", "mediaFileUploadHandler", "Lcom/woocommerce/android/ui/media/MediaFileUploadHandler;", "resourceProvider", "Lcom/woocommerce/android/viewmodel/ResourceProvider;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/woocommerce/android/tools/NetworkStatus;Lcom/woocommerce/android/ui/media/MediaFileUploadHandler;Lcom/woocommerce/android/viewmodel/ResourceProvider;Landroidx/lifecycle/SavedStateHandle;)V", "images", "", "Lcom/woocommerce/android/model/Product$Image;", "getImages", "()Ljava/util/List;", "isImageDeletingAllowed", "", "()Z", "isMultiSelectionAllowed", "navArgs", "Lcom/woocommerce/android/ui/products/ProductImagesFragmentArgs;", "getNavArgs", "()Lcom/woocommerce/android/ui/products/ProductImagesFragmentArgs;", "navArgs$delegate", "Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "originalImages", "<set-?>", "Lcom/woocommerce/android/ui/products/ProductImagesViewModel$ViewState;", "viewState", "getViewState", "()Lcom/woocommerce/android/ui/products/ProductImagesViewModel$ViewState;", "setViewState", "(Lcom/woocommerce/android/ui/products/ProductImagesViewModel$ViewState;)V", "viewState$delegate", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "viewStateData", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getViewStateData", "()Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "clearImageUploadErrors", "", "observeImageUploadEvents", "onDeleteImageConfirmed", "image", "onGalleryImageClicked", "onGalleryImageDeleteIconClicked", "onGalleryImageDragStarted", "onGalleryImageMoved", "from", "", "to", "onImageRemoved", "imageId", "", "onImageSourceButtonClicked", "onMediaLibraryImagesAdded", "newImages", "onNavigateBackButtonClicked", "onShowCameraButtonClicked", "onShowStorageChooserButtonClicked", "onShowWPMediaPickerButtonClicked", "onValidateButtonClicked", "updateButtonStates", "updateDragAndDropDescriptionStates", "uploadProductImages", "remoteProductId", "localUriList", "Landroid/net/Uri;", "ProductImagesState", "ShowCamera", "ShowDeleteImageConfirmation", "ShowImageDetail", "ShowImageSourceDialog", "ShowStorageChooser", "ShowWPMediaPicker", "ViewState", "WooCommerce_vanillaDebug"})
public final class ProductImagesViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.tools.NetworkStatus networkStatus = null;
    private final com.woocommerce.android.ui.media.MediaFileUploadHandler mediaFileUploadHandler = null;
    private final com.woocommerce.android.viewmodel.ResourceProvider resourceProvider = null;
    private final com.woocommerce.android.viewmodel.NavArgsLazy navArgs$delegate = null;
    private final java.util.List<com.woocommerce.android.model.Product.Image> originalImages = null;
    private final boolean isMultiSelectionAllowed = false;
    @org.jetbrains.annotations.NotNull()
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.products.ProductImagesViewModel.ViewState> viewStateData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate viewState$delegate = null;
    
    @javax.inject.Inject()
    public ProductImagesViewModel(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.tools.NetworkStatus networkStatus, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.media.MediaFileUploadHandler mediaFileUploadHandler, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.viewmodel.ResourceProvider resourceProvider, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedState) {
        super(null);
    }
    
    private final com.woocommerce.android.ui.products.ProductImagesFragmentArgs getNavArgs() {
        return null;
    }
    
    public final boolean isMultiSelectionAllowed() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.products.ProductImagesViewModel.ViewState> getViewStateData() {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.ProductImagesViewModel.ViewState getViewState() {
        return null;
    }
    
    private final void setViewState(com.woocommerce.android.ui.products.ProductImagesViewModel.ViewState p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.woocommerce.android.model.Product.Image> getImages() {
        return null;
    }
    
    public final boolean isImageDeletingAllowed() {
        return false;
    }
    
    public final void uploadProductImages(long remoteProductId, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends android.net.Uri> localUriList) {
    }
    
    public final void onShowStorageChooserButtonClicked() {
    }
    
    public final void onShowCameraButtonClicked() {
    }
    
    public final void onShowWPMediaPickerButtonClicked() {
    }
    
    public final void onImageRemoved(long imageId) {
    }
    
    public final void onMediaLibraryImagesAdded(@org.jetbrains.annotations.NotNull()
    java.util.List<com.woocommerce.android.model.Product.Image> newImages) {
    }
    
    public final void onImageSourceButtonClicked() {
    }
    
    public final void onGalleryImageClicked(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.Product.Image image) {
    }
    
    public final void onValidateButtonClicked() {
    }
    
    public final void onNavigateBackButtonClicked() {
    }
    
    private final void updateButtonStates() {
    }
    
    private final void updateDragAndDropDescriptionStates() {
    }
    
    private final void clearImageUploadErrors() {
    }
    
    private final void observeImageUploadEvents() {
    }
    
    public final void onGalleryImageDragStarted() {
    }
    
    public final void onGalleryImageDeleteIconClicked(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.Product.Image image) {
    }
    
    public final void onDeleteImageConfirmed(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.Product.Image image) {
    }
    
    public final void onGalleryImageMoved(int from, int to) {
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J\u0010\u0010!\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016J\t\u0010#\u001a\u00020\u000fH\u00c6\u0003Jx\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u00c6\u0001\u00a2\u0006\u0002\u0010%J\t\u0010&\u001a\u00020\u000bH\u00d6\u0001J\u0013\u0010\'\u001a\u00020\u00032\b\u0010(\u001a\u0004\u0018\u00010)H\u00d6\u0003J\t\u0010*\u001a\u00020\u000bH\u00d6\u0001J\t\u0010+\u001a\u00020,H\u00d6\u0001J\u0019\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u000bH\u00d6\u0001R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\r\u0010\u0016R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0007\u0010\u0016R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\f\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u001a\u0010\u0016R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015\u00a8\u00062"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductImagesViewModel$ViewState;", "Landroid/os/Parcelable;", "showSourceChooser", "", "uploadingImageUris", "", "Landroid/net/Uri;", "isImageDeletingAllowed", "images", "Lcom/woocommerce/android/model/Product$Image;", "chooserButtonButtonTitleRes", "", "isWarningVisible", "isDragDropDescriptionVisible", "productImagesState", "Lcom/woocommerce/android/ui/products/ProductImagesViewModel$ProductImagesState;", "(Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/woocommerce/android/ui/products/ProductImagesViewModel$ProductImagesState;)V", "getChooserButtonButtonTitleRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getImages", "()Ljava/util/List;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getProductImagesState", "()Lcom/woocommerce/android/ui/products/ProductImagesViewModel$ProductImagesState;", "getShowSourceChooser", "getUploadingImageUris", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/woocommerce/android/ui/products/ProductImagesViewModel$ProductImagesState;)Lcom/woocommerce/android/ui/products/ProductImagesViewModel$ViewState;", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
    public static final class ViewState implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean showSourceChooser = null;
        @org.jetbrains.annotations.Nullable()
        private final java.util.List<android.net.Uri> uploadingImageUris = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isImageDeletingAllowed = null;
        @org.jetbrains.annotations.Nullable()
        private final java.util.List<com.woocommerce.android.model.Product.Image> images = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer chooserButtonButtonTitleRes = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isWarningVisible = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isDragDropDescriptionVisible = null;
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.ui.products.ProductImagesViewModel.ProductImagesState productImagesState = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.products.ProductImagesViewModel.ViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.ProductImagesViewModel.ViewState copy(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean showSourceChooser, @org.jetbrains.annotations.Nullable()
        java.util.List<? extends android.net.Uri> uploadingImageUris, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isImageDeletingAllowed, @org.jetbrains.annotations.Nullable()
        java.util.List<com.woocommerce.android.model.Product.Image> images, @org.jetbrains.annotations.Nullable()
        java.lang.Integer chooserButtonButtonTitleRes, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isWarningVisible, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isDragDropDescriptionVisible, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.products.ProductImagesViewModel.ProductImagesState productImagesState) {
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
        
        public ViewState() {
            super();
        }
        
        public ViewState(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean showSourceChooser, @org.jetbrains.annotations.Nullable()
        java.util.List<? extends android.net.Uri> uploadingImageUris, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isImageDeletingAllowed, @org.jetbrains.annotations.Nullable()
        java.util.List<com.woocommerce.android.model.Product.Image> images, @org.jetbrains.annotations.Nullable()
        java.lang.Integer chooserButtonButtonTitleRes, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isWarningVisible, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isDragDropDescriptionVisible, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.products.ProductImagesViewModel.ProductImagesState productImagesState) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean getShowSourceChooser() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<android.net.Uri> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<android.net.Uri> getUploadingImageUris() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isImageDeletingAllowed() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.woocommerce.android.model.Product.Image> component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.woocommerce.android.model.Product.Image> getImages() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getChooserButtonButtonTitleRes() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isWarningVisible() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isDragDropDescriptionVisible() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.ProductImagesViewModel.ProductImagesState component8() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.ProductImagesViewModel.ProductImagesState getProductImagesState() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.products.ProductImagesViewModel.ViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.ProductImagesViewModel.ViewState createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.ProductImagesViewModel.ViewState[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductImagesViewModel$ShowImageSourceDialog;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "()V", "WooCommerce_vanillaDebug"})
    public static final class ShowImageSourceDialog extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        @org.jetbrains.annotations.NotNull()
        public static final com.woocommerce.android.ui.products.ProductImagesViewModel.ShowImageSourceDialog INSTANCE = null;
        
        private ShowImageSourceDialog() {
            super(false);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductImagesViewModel$ShowStorageChooser;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "()V", "WooCommerce_vanillaDebug"})
    public static final class ShowStorageChooser extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        @org.jetbrains.annotations.NotNull()
        public static final com.woocommerce.android.ui.products.ProductImagesViewModel.ShowStorageChooser INSTANCE = null;
        
        private ShowStorageChooser() {
            super(false);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductImagesViewModel$ShowCamera;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "()V", "WooCommerce_vanillaDebug"})
    public static final class ShowCamera extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        @org.jetbrains.annotations.NotNull()
        public static final com.woocommerce.android.ui.products.ProductImagesViewModel.ShowCamera INSTANCE = null;
        
        private ShowCamera() {
            super(false);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductImagesViewModel$ShowWPMediaPicker;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "()V", "WooCommerce_vanillaDebug"})
    public static final class ShowWPMediaPicker extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        @org.jetbrains.annotations.NotNull()
        public static final com.woocommerce.android.ui.products.ProductImagesViewModel.ShowWPMediaPicker INSTANCE = null;
        
        private ShowWPMediaPicker() {
            super(false);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductImagesViewModel$ShowDeleteImageConfirmation;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "image", "Lcom/woocommerce/android/model/Product$Image;", "(Lcom/woocommerce/android/model/Product$Image;)V", "getImage", "()Lcom/woocommerce/android/model/Product$Image;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class ShowDeleteImageConfirmation extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.model.Product.Image image = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.ProductImagesViewModel.ShowDeleteImageConfirmation copy(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.Product.Image image) {
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
        
        public ShowDeleteImageConfirmation(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.Product.Image image) {
            super(false);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.Product.Image component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.Product.Image getImage() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\t\u00a8\u0006\u0014"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductImagesViewModel$ShowImageDetail;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "image", "Lcom/woocommerce/android/model/Product$Image;", "isOpenedDirectly", "", "(Lcom/woocommerce/android/model/Product$Image;Z)V", "getImage", "()Lcom/woocommerce/android/model/Product$Image;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class ShowImageDetail extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.model.Product.Image image = null;
        private final boolean isOpenedDirectly = false;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.ProductImagesViewModel.ShowImageDetail copy(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.Product.Image image, boolean isOpenedDirectly) {
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
        
        public ShowImageDetail(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.Product.Image image, boolean isOpenedDirectly) {
            super(false);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.Product.Image component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.Product.Image getImage() {
            return null;
        }
        
        public final boolean component2() {
            return false;
        }
        
        public final boolean isOpenedDirectly() {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductImagesViewModel$ProductImagesState;", "Landroid/os/Parcelable;", "()V", "Browsing", "Dragging", "Lcom/woocommerce/android/ui/products/ProductImagesViewModel$ProductImagesState$Dragging;", "Lcom/woocommerce/android/ui/products/ProductImagesViewModel$ProductImagesState$Browsing;", "WooCommerce_vanillaDebug"})
    public static abstract class ProductImagesState implements android.os.Parcelable {
        
        private ProductImagesState() {
            super();
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\t\u0010\n\u001a\u00020\u000bH\u00d6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u000bH\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bH\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0018"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductImagesViewModel$ProductImagesState$Dragging;", "Lcom/woocommerce/android/ui/products/ProductImagesViewModel$ProductImagesState;", "initialState", "", "Lcom/woocommerce/android/model/Product$Image;", "(Ljava/util/List;)V", "getInitialState", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
        public static final class Dragging extends com.woocommerce.android.ui.products.ProductImagesViewModel.ProductImagesState {
            @org.jetbrains.annotations.NotNull()
            private final java.util.List<com.woocommerce.android.model.Product.Image> initialState = null;
            public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.products.ProductImagesViewModel.ProductImagesState.Dragging> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.products.ProductImagesViewModel.ProductImagesState.Dragging copy(@org.jetbrains.annotations.NotNull()
            java.util.List<com.woocommerce.android.model.Product.Image> initialState) {
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
            
            public Dragging(@org.jetbrains.annotations.NotNull()
            java.util.List<com.woocommerce.android.model.Product.Image> initialState) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<com.woocommerce.android.model.Product.Image> component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<com.woocommerce.android.model.Product.Image> getInitialState() {
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
            public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.products.ProductImagesViewModel.ProductImagesState.Dragging> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.ui.products.ProductImagesViewModel.ProductImagesState.Dragging createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.ui.products.ProductImagesViewModel.ProductImagesState.Dragging[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u00d6\u0001\u00a8\u0006\n"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductImagesViewModel$ProductImagesState$Browsing;", "Lcom/woocommerce/android/ui/products/ProductImagesViewModel$ProductImagesState;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
        public static final class Browsing extends com.woocommerce.android.ui.products.ProductImagesViewModel.ProductImagesState {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.products.ProductImagesViewModel.ProductImagesState.Browsing INSTANCE = null;
            public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.products.ProductImagesViewModel.ProductImagesState.Browsing> CREATOR = null;
            
            private Browsing() {
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
            public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.products.ProductImagesViewModel.ProductImagesState.Browsing> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.ui.products.ProductImagesViewModel.ProductImagesState.Browsing createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.ui.products.ProductImagesViewModel.ProductImagesState.Browsing[] newArray(int size) {
                    return null;
                }
            }
        }
    }
}