package com.woocommerce.android.ui.products;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001:\u0001\u001cB\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\fH\u0016J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\fH\u0012R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8RX\u0092\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0014X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001d"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductTypesBottomSheetViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "prefs", "Lcom/woocommerce/android/AppPrefs;", "productTypeBottomSheetBuilder", "Lcom/woocommerce/android/ui/products/ProductTypeBottomSheetBuilder;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/AppPrefs;Lcom/woocommerce/android/ui/products/ProductTypeBottomSheetBuilder;)V", "_productTypesBottomSheetList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/woocommerce/android/ui/products/ProductTypesBottomSheetViewModel$ProductTypesBottomSheetUiItem;", "navArgs", "Lcom/woocommerce/android/ui/products/ProductTypesBottomSheetFragmentArgs;", "getNavArgs", "()Lcom/woocommerce/android/ui/products/ProductTypesBottomSheetFragmentArgs;", "navArgs$delegate", "Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "productTypesBottomSheetList", "Landroidx/lifecycle/LiveData;", "getProductTypesBottomSheetList", "()Landroidx/lifecycle/LiveData;", "loadProductTypes", "", "onProductTypeSelected", "productTypeUiItem", "saveUserSelection", "ProductTypesBottomSheetUiItem", "WooCommerce_wasabiDebug"})
@com.woocommerce.android.annotations.OpenClassOnDebug
public class ProductTypesBottomSheetViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.AppPrefs prefs = null;
    private final com.woocommerce.android.ui.products.ProductTypeBottomSheetBuilder productTypeBottomSheetBuilder = null;
    private final com.woocommerce.android.viewmodel.NavArgsLazy navArgs$delegate = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.woocommerce.android.ui.products.ProductTypesBottomSheetViewModel.ProductTypesBottomSheetUiItem>> _productTypesBottomSheetList = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.ui.products.ProductTypesBottomSheetViewModel.ProductTypesBottomSheetUiItem>> productTypesBottomSheetList = null;
    
    @javax.inject.Inject
    public ProductTypesBottomSheetViewModel(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.AppPrefs prefs, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.ProductTypeBottomSheetBuilder productTypeBottomSheetBuilder) {
        super(null);
    }
    
    private com.woocommerce.android.ui.products.ProductTypesBottomSheetFragmentArgs getNavArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.ui.products.ProductTypesBottomSheetViewModel.ProductTypesBottomSheetUiItem>> getProductTypesBottomSheetList() {
        return null;
    }
    
    public void loadProductTypes() {
    }
    
    public void onProductTypeSelected(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.ProductTypesBottomSheetViewModel.ProductTypesBottomSheetUiItem productTypeUiItem) {
    }
    
    private void saveUserSelection(com.woocommerce.android.ui.products.ProductTypesBottomSheetViewModel.ProductTypesBottomSheetUiItem productTypeUiItem) {
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\tH\u00c6\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001J\t\u0010\u0018\u001a\u00020\u0005H\u00d6\u0001J\u0013\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\u0019\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006$"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductTypesBottomSheetViewModel$ProductTypesBottomSheetUiItem;", "Landroid/os/Parcelable;", "type", "Lcom/woocommerce/android/ui/products/ProductType;", "titleResource", "", "descResource", "iconResource", "isVirtual", "", "(Lcom/woocommerce/android/ui/products/ProductType;IIIZ)V", "getDescResource", "()I", "getIconResource", "()Z", "getTitleResource", "getType", "()Lcom/woocommerce/android/ui/products/ProductType;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class ProductTypesBottomSheetUiItem implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.ui.products.ProductType type = null;
        private final int titleResource = 0;
        private final int descResource = 0;
        private final int iconResource = 0;
        private final boolean isVirtual = false;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.products.ProductTypesBottomSheetViewModel.ProductTypesBottomSheetUiItem> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.ProductTypesBottomSheetViewModel.ProductTypesBottomSheetUiItem copy(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.products.ProductType type, @androidx.annotation.StringRes
        int titleResource, @androidx.annotation.StringRes
        int descResource, @androidx.annotation.DrawableRes
        int iconResource, boolean isVirtual) {
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
        
        public ProductTypesBottomSheetUiItem(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.products.ProductType type, @androidx.annotation.StringRes
        int titleResource, @androidx.annotation.StringRes
        int descResource, @androidx.annotation.DrawableRes
        int iconResource, boolean isVirtual) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.ProductType component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.ProductType getType() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int getTitleResource() {
            return 0;
        }
        
        public final int component3() {
            return 0;
        }
        
        public final int getDescResource() {
            return 0;
        }
        
        public final int component4() {
            return 0;
        }
        
        public final int getIconResource() {
            return 0;
        }
        
        public final boolean component5() {
            return false;
        }
        
        public final boolean isVirtual() {
            return false;
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.products.ProductTypesBottomSheetViewModel.ProductTypesBottomSheetUiItem> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.products.ProductTypesBottomSheetViewModel.ProductTypesBottomSheetUiItem createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.products.ProductTypesBottomSheetViewModel.ProductTypesBottomSheetUiItem[] newArray(int size) {
                return null;
            }
        }
    }
}