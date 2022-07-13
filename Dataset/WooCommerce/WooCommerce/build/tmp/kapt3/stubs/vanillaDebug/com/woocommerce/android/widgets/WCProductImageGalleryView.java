package com.woocommerce.android.widgets;

import java.lang.System;

/**
 * Custom recycler which displays all images for a product
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 /2\u00020\u0001:\u0004/012B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u001cJ\u0010\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u0007H\u0002J\u0018\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0007H\u0002J\u000e\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\u0014J\u0016\u0010%\u001a\u00020\u001c2\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\'J\u0016\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020+2\u0006\u0010\u0018\u001a\u00020\u0019J\u001c\u0010,\u001a\u00020\u001c2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020+0\'2\u0006\u0010\u0018\u001a\u00020\u0019J\u0016\u0010.\u001a\u00020\u001c2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020+0\'H\u0002R\u0012\u0010\t\u001a\u00060\nR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00063"}, d2 = {"Lcom/woocommerce/android/widgets/WCProductImageGalleryView;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "adapter", "Lcom/woocommerce/android/widgets/WCProductImageGalleryView$ImageGalleryAdapter;", "draggableItemTouchHelper", "Lcom/woocommerce/android/widgets/DraggableItemTouchHelper;", "glideRequest", "error/NonExistentClass", "Lerror/NonExistentClass;", "glideTransform", "Lcom/bumptech/glide/request/RequestOptions;", "imageSize", "isDraggingEnabled", "", "isGridView", "layoutInflater", "Landroid/view/LayoutInflater;", "listener", "Lcom/woocommerce/android/widgets/WCProductImageGalleryView$OnGalleryImageInteractionListener;", "showAddImageIcon", "clearImages", "", "clearPlaceholders", "onImageClicked", "position", "onProductImagesPositionChanged", "from", "to", "setDraggingState", "isDragging", "setPlaceholderImageUris", "imageUriList", "", "Landroid/net/Uri;", "showProductImage", "image", "Lcom/woocommerce/android/model/Product$Image;", "showProductImages", "images", "updateDraggingItemTouchHelper", "Companion", "ImageGalleryAdapter", "ImageViewHolder", "OnGalleryImageInteractionListener", "WooCommerce_vanillaDebug"})
public final class WCProductImageGalleryView extends androidx.recyclerview.widget.RecyclerView {
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.widgets.WCProductImageGalleryView.Companion Companion = null;
    private static final int VIEW_TYPE_IMAGE = 0;
    private static final int VIEW_TYPE_PLACEHOLDER = 1;
    private static final int VIEW_TYPE_ADD_IMAGE = 2;
    private static final int NUM_COLUMNS = 2;
    private static final long ADD_IMAGE_ITEM_ID = 9223372036854775807L;
    private static final int NUM_GRID_MARGINS = 3;
    private int imageSize = 0;
    private boolean isGridView = false;
    private boolean showAddImageIcon = false;
    private boolean isDraggingEnabled = false;
    private final com.woocommerce.android.widgets.WCProductImageGalleryView.ImageGalleryAdapter adapter = null;
    private final android.view.LayoutInflater layoutInflater = null;
    private final error.NonExistentClass glideRequest = null;
    private final com.bumptech.glide.request.RequestOptions glideTransform = null;
    private com.woocommerce.android.widgets.WCProductImageGalleryView.OnGalleryImageInteractionListener listener;
    private final com.woocommerce.android.widgets.DraggableItemTouchHelper draggableItemTouchHelper = null;
    
    @kotlin.jvm.JvmOverloads()
    public WCProductImageGalleryView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public WCProductImageGalleryView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public WCProductImageGalleryView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyle) {
        super(null);
    }
    
    public final void showProductImages(@org.jetbrains.annotations.NotNull()
    java.util.List<com.woocommerce.android.model.Product.Image> images, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.widgets.WCProductImageGalleryView.OnGalleryImageInteractionListener listener) {
    }
    
    public final void showProductImage(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.Product.Image image, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.widgets.WCProductImageGalleryView.OnGalleryImageInteractionListener listener) {
    }
    
    private final void updateDraggingItemTouchHelper(java.util.List<com.woocommerce.android.model.Product.Image> images) {
    }
    
    private final void onProductImagesPositionChanged(int from, int to) {
    }
    
    public final void clearImages() {
    }
    
    public final void clearPlaceholders() {
    }
    
    /**
     * Show upload placeholders for the passed local image Uris
     */
    public final void setPlaceholderImageUris(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends android.net.Uri> imageUriList) {
    }
    
    private final void onImageClicked(int position) {
    }
    
    public final void setDraggingState(boolean isDragging) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016\u00a8\u0006\r"}, d2 = {"Lcom/woocommerce/android/widgets/WCProductImageGalleryView$OnGalleryImageInteractionListener;", "", "onGalleryAddImageClicked", "", "onGalleryImageClicked", "image", "Lcom/woocommerce/android/model/Product$Image;", "onGalleryImageDeleteIconClicked", "onGalleryImageDragStarted", "onGalleryImageMoved", "from", "", "to", "WooCommerce_vanillaDebug"})
    public static abstract interface OnGalleryImageInteractionListener {
        
        public abstract void onGalleryImageClicked(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.Product.Image image);
        
        public abstract void onGalleryAddImageClicked();
        
        public abstract void onGalleryImageDragStarted();
        
        public abstract void onGalleryImageMoved(int from, int to);
        
        public abstract void onGalleryImageDeleteIconClicked(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.Product.Image image);
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class DefaultImpls {
            
            public static void onGalleryAddImageClicked(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.widgets.WCProductImageGalleryView.OnGalleryImageInteractionListener $this) {
            }
            
            public static void onGalleryImageDragStarted(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.widgets.WCProductImageGalleryView.OnGalleryImageInteractionListener $this) {
            }
            
            public static void onGalleryImageMoved(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.widgets.WCProductImageGalleryView.OnGalleryImageInteractionListener $this, int from, int to) {
            }
            
            public static void onGalleryImageDeleteIconClicked(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.widgets.WCProductImageGalleryView.OnGalleryImageInteractionListener $this, @org.jetbrains.annotations.NotNull()
            com.woocommerce.android.model.Product.Image image) {
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0082\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\nJ\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010H\u0002J\u000e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010H\u0002J\u000e\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u001a\u001a\u00020\n2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010H\u0002J\u001c\u0010\u001c\u001a\u00020\r2\n\u0010\u001d\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u001e\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0013H\u0016J\u0014\u0010\"\u001a\u00020\r2\n\u0010\u001d\u001a\u00060\u0002R\u00020\u0003H\u0016J\u0014\u0010#\u001a\u00020\r2\n\u0010\u001d\u001a\u00060\u0002R\u00020\u0003H\u0016J\u000e\u0010$\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\nJ\u0014\u0010%\u001a\u00020\r2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010J\u0014\u0010\'\u001a\u00020\r2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000b\u00a8\u0006("}, d2 = {"Lcom/woocommerce/android/widgets/WCProductImageGalleryView$ImageGalleryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/woocommerce/android/widgets/WCProductImageGalleryView$ImageViewHolder;", "Lcom/woocommerce/android/widgets/WCProductImageGalleryView;", "(Lcom/woocommerce/android/widgets/WCProductImageGalleryView;)V", "imageList", "", "Lcom/woocommerce/android/model/Product$Image;", "isDragging", "Landroidx/lifecycle/MutableLiveData;", "", "()Landroidx/lifecycle/MutableLiveData;", "clearImages", "", "clearPlaceholders", "getActualImages", "", "getImage", "position", "", "getItemCount", "getItemId", "", "getItemViewType", "getPlaceholderImages", "isPlaceholder", "isSameImageList", "images", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onViewAttachedToWindow", "onViewDetachedFromWindow", "setDraggingState", "setPlaceholderImages", "placeholders", "showImages", "WooCommerce_vanillaDebug"})
    final class ImageGalleryAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.woocommerce.android.widgets.WCProductImageGalleryView.ImageViewHolder> {
        private final java.util.List<com.woocommerce.android.model.Product.Image> imageList = null;
        @org.jetbrains.annotations.NotNull()
        private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isDragging = null;
        
        public ImageGalleryAdapter() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isDragging() {
            return null;
        }
        
        public final void clearImages() {
        }
        
        public final void showImages(@org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.model.Product.Image> images) {
        }
        
        public final void setDraggingState(boolean isDragging) {
        }
        
        /**
         * Returns the list of images without placeholders or the "add image" icon
         */
        private final java.util.List<com.woocommerce.android.model.Product.Image> getActualImages() {
            return null;
        }
        
        /**
         * Returns the list of placeholder images
         */
        private final java.util.List<com.woocommerce.android.model.Product.Image> getPlaceholderImages() {
            return null;
        }
        
        /**
         * Returns true if the passed list of images is the same as the adapter's list, taking
         * placeholders into account
         */
        private final boolean isSameImageList(java.util.List<com.woocommerce.android.model.Product.Image> images) {
            return false;
        }
        
        public final void setPlaceholderImages(@org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.model.Product.Image> placeholders) {
        }
        
        /**
         * Removes all placeholders, returns true only if any were removed
         */
        public final boolean clearPlaceholders() {
            return false;
        }
        
        public final boolean isPlaceholder(int position) {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.Product.Image getImage(int position) {
            return null;
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @java.lang.Override()
        public long getItemId(int position) {
            return 0L;
        }
        
        @java.lang.Override()
        public int getItemViewType(int position) {
            return 0;
        }
        
        @java.lang.Override()
        public void onViewAttachedToWindow(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.widgets.WCProductImageGalleryView.ImageViewHolder holder) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.woocommerce.android.widgets.WCProductImageGalleryView.ImageViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.widgets.WCProductImageGalleryView.ImageViewHolder holder, int position) {
        }
        
        @java.lang.Override()
        public void onViewDetachedFromWindow(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.widgets.WCProductImageGalleryView.ImageViewHolder holder) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0016\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u000eJ\u0006\u0010\u0017\u001a\u00020\u000eJ\b\u0010\u0018\u001a\u00020\u000eH\u0002R\u0010\u0010\b\u001a\u00020\t8\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0019"}, d2 = {"Lcom/woocommerce/android/widgets/WCProductImageGalleryView$ImageViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewBinding", "Lcom/woocommerce/android/databinding/ImageGalleryItemBinding;", "isDraggingEnabled", "Landroidx/lifecycle/LiveData;", "", "(Lcom/woocommerce/android/widgets/WCProductImageGalleryView;Lcom/woocommerce/android/databinding/ImageGalleryItemBinding;Landroidx/lifecycle/LiveData;)V", "dragOnTouchListener", "Landroid/view/View$OnTouchListener;", "onClickListener", "Landroid/view/View$OnClickListener;", "onDraggingEnabledChanged", "Lkotlin/Function1;", "", "getViewBinding", "()Lcom/woocommerce/android/databinding/ImageGalleryItemBinding;", "bind", "image", "Lcom/woocommerce/android/model/Product$Image;", "viewType", "", "onViewAttached", "onViewDetached", "setMargins", "WooCommerce_vanillaDebug"})
    final class ImageViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.databinding.ImageGalleryItemBinding viewBinding = null;
        private final androidx.lifecycle.LiveData<java.lang.Boolean> isDraggingEnabled = null;
        @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
        private final android.view.View.OnTouchListener dragOnTouchListener = null;
        private final android.view.View.OnClickListener onClickListener = null;
        private final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> onDraggingEnabledChanged = null;
        
        public ImageViewHolder(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.databinding.ImageGalleryItemBinding viewBinding, @org.jetbrains.annotations.NotNull()
        androidx.lifecycle.LiveData<java.lang.Boolean> isDraggingEnabled) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.databinding.ImageGalleryItemBinding getViewBinding() {
            return null;
        }
        
        public final void onViewAttached() {
        }
        
        public final void onViewDetached() {
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.Product.Image image, int viewType) {
        }
        
        private final void setMargins() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/woocommerce/android/widgets/WCProductImageGalleryView$Companion;", "", "()V", "ADD_IMAGE_ITEM_ID", "", "NUM_COLUMNS", "", "NUM_GRID_MARGINS", "VIEW_TYPE_ADD_IMAGE", "VIEW_TYPE_IMAGE", "VIEW_TYPE_PLACEHOLDER", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}