package com.woocommerce.android.ui.products;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0002:;B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020\bH\u0002J\b\u0010+\u001a\u00020)H\u0014JS\u0010,\u001a\u00020)2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\b2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\b2\n\b\u0002\u00102\u001a\u0004\u0018\u0001032\n\b\u0002\u00104\u001a\u0004\u0018\u000105\u00a2\u0006\u0002\u00106J\u0006\u00107\u001a\u00020)J\u000e\u00108\u001a\u00020)2\u0006\u0010-\u001a\u00020\u0018J\b\u00109\u001a\u00020)H\u0002R\u0014\u0010\u0007\u001a\u00020\b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0016\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R+\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001c8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001c0%\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'\u00a8\u0006<"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductInventoryViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "productRepository", "Lcom/woocommerce/android/ui/products/ProductDetailRepository;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/ui/products/ProductDetailRepository;)V", "hasChanges", "", "getHasChanges", "()Z", "inventoryData", "Lcom/woocommerce/android/ui/products/ProductInventoryViewModel$InventoryData;", "getInventoryData", "()Lcom/woocommerce/android/ui/products/ProductInventoryViewModel$InventoryData;", "isProduct", "navArgs", "Lcom/woocommerce/android/ui/products/ProductInventoryFragmentArgs;", "getNavArgs", "()Lcom/woocommerce/android/ui/products/ProductInventoryFragmentArgs;", "navArgs$delegate", "Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "originalInventoryData", "originalSku", "", "skuVerificationJob", "Lkotlinx/coroutines/Job;", "<set-?>", "Lcom/woocommerce/android/ui/products/ProductInventoryViewModel$ViewState;", "viewState", "getViewState", "()Lcom/woocommerce/android/ui/products/ProductInventoryViewModel$ViewState;", "setViewState", "(Lcom/woocommerce/android/ui/products/ProductInventoryViewModel$ViewState;)V", "viewState$delegate", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "viewStateData", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getViewStateData", "()Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "clearSkuError", "", "hasSkuError", "onCleared", "onDataChanged", "sku", "backorderStatus", "Lcom/woocommerce/android/ui/products/ProductBackorderStatus;", "isSoldIndividually", "isStockManaged", "stockQuantity", "", "stockStatus", "Lcom/woocommerce/android/ui/products/ProductStockStatus;", "(Ljava/lang/String;Lcom/woocommerce/android/ui/products/ProductBackorderStatus;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Double;Lcom/woocommerce/android/ui/products/ProductStockStatus;)V", "onExit", "onSkuChanged", "showSkuError", "InventoryData", "ViewState", "WooCommerce_vanillaDebug"})
public final class ProductInventoryViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.ui.products.ProductDetailRepository productRepository = null;
    private final com.woocommerce.android.viewmodel.NavArgsLazy navArgs$delegate = null;
    private final boolean isProduct = false;
    @org.jetbrains.annotations.NotNull()
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.products.ProductInventoryViewModel.ViewState> viewStateData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate viewState$delegate = null;
    private kotlinx.coroutines.Job skuVerificationJob;
    private final java.lang.String originalSku = null;
    private final com.woocommerce.android.ui.products.ProductInventoryViewModel.InventoryData originalInventoryData = null;
    
    @javax.inject.Inject()
    public ProductInventoryViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.ProductDetailRepository productRepository) {
        super(null);
    }
    
    private final com.woocommerce.android.ui.products.ProductInventoryFragmentArgs getNavArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.products.ProductInventoryViewModel.ViewState> getViewStateData() {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.ProductInventoryViewModel.ViewState getViewState() {
        return null;
    }
    
    private final void setViewState(com.woocommerce.android.ui.products.ProductInventoryViewModel.ViewState p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.ui.products.ProductInventoryViewModel.InventoryData getInventoryData() {
        return null;
    }
    
    private final boolean getHasChanges() {
        return false;
    }
    
    /**
     * Called when user modifies the SKU field. Currently checks if the entered sku is available
     * in the local db. Only if it is not available, the API verification call is initiated.
     */
    public final void onSkuChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String sku) {
    }
    
    public final void onDataChanged(@org.jetbrains.annotations.Nullable()
    java.lang.String sku, @org.jetbrains.annotations.Nullable()
    com.woocommerce.android.ui.products.ProductBackorderStatus backorderStatus, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isSoldIndividually, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isStockManaged, @org.jetbrains.annotations.Nullable()
    java.lang.Double stockQuantity, @org.jetbrains.annotations.Nullable()
    com.woocommerce.android.ui.products.ProductStockStatus stockStatus) {
    }
    
    public final void onExit() {
    }
    
    private final void clearSkuError() {
    }
    
    private final void showSkuError() {
    }
    
    private final boolean hasSkuError() {
        return false;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJT\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u001aJ\t\u0010\u001b\u001a\u00020\u0005H\u00d6\u0001J\u0013\u0010\u001c\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00d6\u0001J\t\u0010 \u001a\u00020!H\u00d6\u0001J\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0006\u0010\u000eR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\t\u0010\u000eR\u0015\u0010\n\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\n\u0010\u000eR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\b\u0010\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\'"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductInventoryViewModel$ViewState;", "Landroid/os/Parcelable;", "inventoryData", "Lcom/woocommerce/android/ui/products/ProductInventoryViewModel$InventoryData;", "skuErrorMessage", "", "isIndividualSaleSwitchVisible", "", "isStockStatusVisible", "isStockManagementVisible", "isStockQuantityEditable", "(Lcom/woocommerce/android/ui/products/ProductInventoryViewModel$InventoryData;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getInventoryData", "()Lcom/woocommerce/android/ui/products/ProductInventoryViewModel$InventoryData;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSkuErrorMessage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lcom/woocommerce/android/ui/products/ProductInventoryViewModel$InventoryData;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/woocommerce/android/ui/products/ProductInventoryViewModel$ViewState;", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
    public static final class ViewState implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.ui.products.ProductInventoryViewModel.InventoryData inventoryData = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer skuErrorMessage = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isIndividualSaleSwitchVisible = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isStockStatusVisible = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isStockManagementVisible = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isStockQuantityEditable = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.products.ProductInventoryViewModel.ViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.ProductInventoryViewModel.ViewState copy(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.products.ProductInventoryViewModel.InventoryData inventoryData, @org.jetbrains.annotations.Nullable()
        java.lang.Integer skuErrorMessage, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isIndividualSaleSwitchVisible, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isStockStatusVisible, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isStockManagementVisible, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isStockQuantityEditable) {
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
        
        public ViewState(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.products.ProductInventoryViewModel.InventoryData inventoryData, @org.jetbrains.annotations.Nullable()
        java.lang.Integer skuErrorMessage, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isIndividualSaleSwitchVisible, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isStockStatusVisible, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isStockManagementVisible, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isStockQuantityEditable) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.ProductInventoryViewModel.InventoryData component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.ProductInventoryViewModel.InventoryData getInventoryData() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getSkuErrorMessage() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isIndividualSaleSwitchVisible() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isStockStatusVisible() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isStockManagementVisible() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isStockQuantityEditable() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.products.ProductInventoryViewModel.ViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.ProductInventoryViewModel.ViewState createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.ProductInventoryViewModel.ViewState[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\fH\u00c6\u0003JV\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00c6\u0001\u00a2\u0006\u0002\u0010 J\t\u0010!\u001a\u00020\"H\u00d6\u0001J\u0013\u0010#\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010%H\u00d6\u0003J\t\u0010&\u001a\u00020\"H\u00d6\u0001J\t\u0010\'\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\"H\u00d6\u0001R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0006\u0010\u0010R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0004\u0010\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006-"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductInventoryViewModel$InventoryData;", "Landroid/os/Parcelable;", "sku", "", "isStockManaged", "", "isSoldIndividually", "stockStatus", "Lcom/woocommerce/android/ui/products/ProductStockStatus;", "stockQuantity", "", "backorderStatus", "Lcom/woocommerce/android/ui/products/ProductBackorderStatus;", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/woocommerce/android/ui/products/ProductStockStatus;Ljava/lang/Double;Lcom/woocommerce/android/ui/products/ProductBackorderStatus;)V", "getBackorderStatus", "()Lcom/woocommerce/android/ui/products/ProductBackorderStatus;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSku", "()Ljava/lang/String;", "getStockQuantity", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getStockStatus", "()Lcom/woocommerce/android/ui/products/ProductStockStatus;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/woocommerce/android/ui/products/ProductStockStatus;Ljava/lang/Double;Lcom/woocommerce/android/ui/products/ProductBackorderStatus;)Lcom/woocommerce/android/ui/products/ProductInventoryViewModel$InventoryData;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
    public static final class InventoryData implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String sku = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isStockManaged = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isSoldIndividually = null;
        @org.jetbrains.annotations.Nullable()
        private final com.woocommerce.android.ui.products.ProductStockStatus stockStatus = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Double stockQuantity = null;
        @org.jetbrains.annotations.Nullable()
        private final com.woocommerce.android.ui.products.ProductBackorderStatus backorderStatus = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.products.ProductInventoryViewModel.InventoryData> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.ProductInventoryViewModel.InventoryData copy(@org.jetbrains.annotations.Nullable()
        java.lang.String sku, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isStockManaged, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isSoldIndividually, @org.jetbrains.annotations.Nullable()
        com.woocommerce.android.ui.products.ProductStockStatus stockStatus, @org.jetbrains.annotations.Nullable()
        java.lang.Double stockQuantity, @org.jetbrains.annotations.Nullable()
        com.woocommerce.android.ui.products.ProductBackorderStatus backorderStatus) {
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
        
        public InventoryData() {
            super();
        }
        
        public InventoryData(@org.jetbrains.annotations.Nullable()
        java.lang.String sku, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isStockManaged, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isSoldIndividually, @org.jetbrains.annotations.Nullable()
        com.woocommerce.android.ui.products.ProductStockStatus stockStatus, @org.jetbrains.annotations.Nullable()
        java.lang.Double stockQuantity, @org.jetbrains.annotations.Nullable()
        com.woocommerce.android.ui.products.ProductBackorderStatus backorderStatus) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSku() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isStockManaged() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isSoldIndividually() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.woocommerce.android.ui.products.ProductStockStatus component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.woocommerce.android.ui.products.ProductStockStatus getStockStatus() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double getStockQuantity() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.woocommerce.android.ui.products.ProductBackorderStatus component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.woocommerce.android.ui.products.ProductBackorderStatus getBackorderStatus() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.products.ProductInventoryViewModel.InventoryData> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.ProductInventoryViewModel.InventoryData createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.ProductInventoryViewModel.InventoryData[] newArray(int size) {
                return null;
            }
        }
    }
}