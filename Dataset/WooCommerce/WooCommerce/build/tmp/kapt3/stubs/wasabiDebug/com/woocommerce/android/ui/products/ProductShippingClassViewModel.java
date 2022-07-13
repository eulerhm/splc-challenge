package com.woocommerce.android.ui.products;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001%B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\nJ\u0016\u0010 \u001a\u00020\u001b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\"H\u0002J\u0011\u0010#\u001a\u00020\u001bH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006&"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductShippingClassViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "productRepository", "Lcom/woocommerce/android/ui/products/ProductShippingClassRepository;", "resourceProvider", "Lcom/woocommerce/android/viewmodel/ResourceProvider;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/ui/products/ProductShippingClassRepository;Lcom/woocommerce/android/viewmodel/ResourceProvider;)V", "noShippingClass", "Lcom/woocommerce/android/model/ShippingClass;", "shippingClassLoadJob", "Lkotlinx/coroutines/Job;", "<set-?>", "Lcom/woocommerce/android/ui/products/ProductShippingClassViewModel$ViewState;", "viewState", "getViewState", "()Lcom/woocommerce/android/ui/products/ProductShippingClassViewModel$ViewState;", "setViewState", "(Lcom/woocommerce/android/ui/products/ProductShippingClassViewModel$ViewState;)V", "viewState$delegate", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "viewStateData", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getViewStateData", "()Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "loadShippingClasses", "", "loadMore", "", "onShippingClassClicked", "shippingClass", "updateShippingClasses", "shippingClasses", "", "waitForExistingShippingClassFetch", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ViewState", "WooCommerce_wasabiDebug"})
public final class ProductShippingClassViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.ui.products.ProductShippingClassRepository productRepository = null;
    private final com.woocommerce.android.model.ShippingClass noShippingClass = null;
    private kotlinx.coroutines.Job shippingClassLoadJob;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.products.ProductShippingClassViewModel.ViewState> viewStateData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate viewState$delegate = null;
    
    @javax.inject.Inject
    public ProductShippingClassViewModel(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.ProductShippingClassRepository productRepository, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.viewmodel.ResourceProvider resourceProvider) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.products.ProductShippingClassViewModel.ViewState> getViewStateData() {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.ProductShippingClassViewModel.ViewState getViewState() {
        return null;
    }
    
    private final void setViewState(com.woocommerce.android.ui.products.ProductShippingClassViewModel.ViewState p0) {
    }
    
    /**
     * Load & fetch the shipping classes for the current site, optionally performing a "load more" to
     * load the next page of shipping classes
     */
    public final void loadShippingClasses(boolean loadMore) {
    }
    
    private final void updateShippingClasses(java.util.List<com.woocommerce.android.model.ShippingClass> shippingClasses) {
    }
    
    /**
     * If shipping classes are already being fetched, wait for the current fetch to complete - this is
     * used above to avoid fetching multiple pages of shipping classes in unison
     */
    private final java.lang.Object waitForExistingShippingClassFetch(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public final void onShippingClassClicked(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.ShippingClass shippingClass) {
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\bJ\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u00c6\u0003J/\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u00c6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u001d"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductShippingClassViewModel$ViewState;", "Landroid/os/Parcelable;", "isLoadingProgressShown", "", "isLoadingMoreProgressShown", "shippingClassList", "", "Lcom/woocommerce/android/model/ShippingClass;", "(ZZLjava/util/List;)V", "()Z", "getShippingClassList", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class ViewState implements android.os.Parcelable {
        private final boolean isLoadingProgressShown = false;
        private final boolean isLoadingMoreProgressShown = false;
        @org.jetbrains.annotations.Nullable
        private final java.util.List<com.woocommerce.android.model.ShippingClass> shippingClassList = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.products.ProductShippingClassViewModel.ViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.ProductShippingClassViewModel.ViewState copy(boolean isLoadingProgressShown, boolean isLoadingMoreProgressShown, @org.jetbrains.annotations.Nullable
        java.util.List<com.woocommerce.android.model.ShippingClass> shippingClassList) {
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
        
        public ViewState() {
            super();
        }
        
        public ViewState(boolean isLoadingProgressShown, boolean isLoadingMoreProgressShown, @org.jetbrains.annotations.Nullable
        java.util.List<com.woocommerce.android.model.ShippingClass> shippingClassList) {
            super();
        }
        
        public final boolean component1() {
            return false;
        }
        
        public final boolean isLoadingProgressShown() {
            return false;
        }
        
        public final boolean component2() {
            return false;
        }
        
        public final boolean isLoadingMoreProgressShown() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<com.woocommerce.android.model.ShippingClass> component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<com.woocommerce.android.model.ShippingClass> getShippingClassList() {
            return null;
        }
        
        @java.lang.Override
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override
        public void writeToParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.products.ProductShippingClassViewModel.ViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.products.ProductShippingClassViewModel.ViewState createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.products.ProductShippingClassViewModel.ViewState[] newArray(int size) {
                return null;
            }
        }
    }
}