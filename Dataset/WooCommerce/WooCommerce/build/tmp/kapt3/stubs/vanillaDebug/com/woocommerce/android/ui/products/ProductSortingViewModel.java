package com.woocommerce.android.ui.products;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000f\u0010B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductSortingViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "productListRepository", "Lcom/woocommerce/android/ui/products/ProductListRepository;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/ui/products/ProductListRepository;)V", "<set-?>", "Lorg/wordpress/android/fluxc/store/WCProductStore$ProductSorting;", "sortingChoice", "getSortingChoice", "()Lorg/wordpress/android/fluxc/store/WCProductStore$ProductSorting;", "onSortingOptionChanged", "", "option", "Companion", "SortingListItemUIModel", "WooCommerce_vanillaDebug"})
public final class ProductSortingViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.ui.products.ProductListRepository productListRepository = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.products.ProductSortingViewModel.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<com.woocommerce.android.ui.products.ProductSortingViewModel.SortingListItemUIModel> SORTING_OPTIONS = null;
    @org.jetbrains.annotations.NotNull()
    private org.wordpress.android.fluxc.store.WCProductStore.ProductSorting sortingChoice;
    
    @javax.inject.Inject()
    public ProductSortingViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.ProductListRepository productListRepository) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wordpress.android.fluxc.store.WCProductStore.ProductSorting getSortingChoice() {
        return null;
    }
    
    public final void onSortingOptionChanged(@org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.WCProductStore.ProductSorting option) {
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\t\u0010\u000e\u001a\u00020\u0003H\u00d6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001b"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductSortingViewModel$SortingListItemUIModel;", "Landroid/os/Parcelable;", "stringResource", "", "value", "Lorg/wordpress/android/fluxc/store/WCProductStore$ProductSorting;", "(ILorg/wordpress/android/fluxc/store/WCProductStore$ProductSorting;)V", "getStringResource", "()I", "getValue", "()Lorg/wordpress/android/fluxc/store/WCProductStore$ProductSorting;", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
    public static final class SortingListItemUIModel implements android.os.Parcelable {
        private final int stringResource = 0;
        @org.jetbrains.annotations.NotNull()
        private final org.wordpress.android.fluxc.store.WCProductStore.ProductSorting value = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.products.ProductSortingViewModel.SortingListItemUIModel> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.ProductSortingViewModel.SortingListItemUIModel copy(@androidx.annotation.StringRes()
        int stringResource, @org.jetbrains.annotations.NotNull()
        org.wordpress.android.fluxc.store.WCProductStore.ProductSorting value) {
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
        
        public SortingListItemUIModel(@androidx.annotation.StringRes()
        int stringResource, @org.jetbrains.annotations.NotNull()
        org.wordpress.android.fluxc.store.WCProductStore.ProductSorting value) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getStringResource() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wordpress.android.fluxc.store.WCProductStore.ProductSorting component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wordpress.android.fluxc.store.WCProductStore.ProductSorting getValue() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.products.ProductSortingViewModel.SortingListItemUIModel> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.ProductSortingViewModel.SortingListItemUIModel createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.ProductSortingViewModel.SortingListItemUIModel[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductSortingViewModel$Companion;", "", "()V", "SORTING_OPTIONS", "", "Lcom/woocommerce/android/ui/products/ProductSortingViewModel$SortingListItemUIModel;", "getSORTING_OPTIONS", "()Ljava/util/List;", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.ui.products.ProductSortingViewModel.SortingListItemUIModel> getSORTING_OPTIONS() {
            return null;
        }
    }
}