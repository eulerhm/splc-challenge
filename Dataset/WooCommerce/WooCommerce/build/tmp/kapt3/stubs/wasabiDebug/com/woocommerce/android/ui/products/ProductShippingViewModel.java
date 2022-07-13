package com.woocommerce.android.ui.products;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\b\u0007\u0018\u0000 ;2\u00020\u0001:\u0003;<=B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.J\b\u0010/\u001a\u000200H\u0014JS\u00101\u001a\u0002002\n\b\u0002\u00102\u001a\u0004\u0018\u0001032\n\b\u0002\u00104\u001a\u0004\u0018\u0001032\n\b\u0002\u00105\u001a\u0004\u0018\u0001032\n\b\u0002\u00106\u001a\u0004\u0018\u0001032\n\b\u0002\u00107\u001a\u0004\u0018\u00010,2\n\b\u0002\u00108\u001a\u0004\u0018\u00010.\u00a2\u0006\u0002\u00109J\u0006\u0010:\u001a\u000200R\u0014\u0010\t\u001a\u00020\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u001b\u001a\u00020\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR+\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001f8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0017\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u001f0(\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*\u00a8\u0006>"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductShippingViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "parameterRepository", "Lcom/woocommerce/android/ui/products/ParameterRepository;", "productRepository", "Lcom/woocommerce/android/ui/products/ProductDetailRepository;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/ui/products/ParameterRepository;Lcom/woocommerce/android/ui/products/ProductDetailRepository;)V", "hasChanges", "", "getHasChanges", "()Z", "navArgs", "Lcom/woocommerce/android/ui/products/ProductShippingFragmentArgs;", "getNavArgs", "()Lcom/woocommerce/android/ui/products/ProductShippingFragmentArgs;", "navArgs$delegate", "Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "originalShippingData", "Lcom/woocommerce/android/ui/products/ProductShippingViewModel$ShippingData;", "parameters", "Lcom/woocommerce/android/ui/products/models/SiteParameters;", "getParameters", "()Lcom/woocommerce/android/ui/products/models/SiteParameters;", "parameters$delegate", "Lkotlin/Lazy;", "shippingData", "getShippingData", "()Lcom/woocommerce/android/ui/products/ProductShippingViewModel$ShippingData;", "<set-?>", "Lcom/woocommerce/android/ui/products/ProductShippingViewModel$ViewState;", "viewState", "getViewState", "()Lcom/woocommerce/android/ui/products/ProductShippingViewModel$ViewState;", "setViewState", "(Lcom/woocommerce/android/ui/products/ProductShippingViewModel$ViewState;)V", "viewState$delegate", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "viewStateData", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getViewStateData", "()Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getShippingClassByRemoteShippingClassId", "", "remoteShippingClassId", "", "onCleared", "", "onDataChanged", "weight", "", "length", "width", "height", "shippingClassSlug", "shippingClassId", "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Long;)V", "onExit", "Companion", "ShippingData", "ViewState", "WooCommerce_wasabiDebug"})
public final class ProductShippingViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.ui.products.ProductDetailRepository productRepository = null;
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.products.ProductShippingViewModel.Companion Companion = null;
    private static final java.lang.String KEY_PRODUCT_PARAMETERS = "key_product_parameters";
    private final com.woocommerce.android.viewmodel.NavArgsLazy navArgs$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.products.ProductShippingViewModel.ViewState> viewStateData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate viewState$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy parameters$delegate = null;
    private final com.woocommerce.android.ui.products.ProductShippingViewModel.ShippingData originalShippingData = null;
    
    @javax.inject.Inject
    public ProductShippingViewModel(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.ParameterRepository parameterRepository, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.ProductDetailRepository productRepository) {
        super(null);
    }
    
    private final com.woocommerce.android.ui.products.ProductShippingFragmentArgs getNavArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.products.ProductShippingViewModel.ViewState> getViewStateData() {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.ProductShippingViewModel.ViewState getViewState() {
        return null;
    }
    
    private final void setViewState(com.woocommerce.android.ui.products.ProductShippingViewModel.ViewState p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.ui.products.models.SiteParameters getParameters() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.ui.products.ProductShippingViewModel.ShippingData getShippingData() {
        return null;
    }
    
    private final boolean getHasChanges() {
        return false;
    }
    
    public final void onDataChanged(@org.jetbrains.annotations.Nullable
    java.lang.Float weight, @org.jetbrains.annotations.Nullable
    java.lang.Float length, @org.jetbrains.annotations.Nullable
    java.lang.Float width, @org.jetbrains.annotations.Nullable
    java.lang.Float height, @org.jetbrains.annotations.Nullable
    java.lang.String shippingClassSlug, @org.jetbrains.annotations.Nullable
    java.lang.Long shippingClassId) {
    }
    
    public final void onExit() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getShippingClassByRemoteShippingClassId(long remoteShippingClassId) {
        return null;
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0007J$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010H\u00d6\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0004\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001c"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductShippingViewModel$ViewState;", "Landroid/os/Parcelable;", "shippingData", "Lcom/woocommerce/android/ui/products/ProductShippingViewModel$ShippingData;", "isShippingClassSectionVisible", "", "(Lcom/woocommerce/android/ui/products/ProductShippingViewModel$ShippingData;Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getShippingData", "()Lcom/woocommerce/android/ui/products/ProductShippingViewModel$ShippingData;", "component1", "component2", "copy", "(Lcom/woocommerce/android/ui/products/ProductShippingViewModel$ShippingData;Ljava/lang/Boolean;)Lcom/woocommerce/android/ui/products/ProductShippingViewModel$ViewState;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class ViewState implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.ui.products.ProductShippingViewModel.ShippingData shippingData = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean isShippingClassSectionVisible = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.products.ProductShippingViewModel.ViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.ProductShippingViewModel.ViewState copy(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.products.ProductShippingViewModel.ShippingData shippingData, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isShippingClassSectionVisible) {
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
        
        public ViewState(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.products.ProductShippingViewModel.ShippingData shippingData, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isShippingClassSectionVisible) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.ProductShippingViewModel.ShippingData component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.ProductShippingViewModel.ShippingData getShippingData() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean isShippingClassSectionVisible() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.products.ProductShippingViewModel.ViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.products.ProductShippingViewModel.ViewState createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.products.ProductShippingViewModel.ViewState[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011JV\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001eJ\t\u0010\u001f\u001a\u00020 H\u00d6\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u00d6\u0003J\t\u0010%\u001a\u00020 H\u00d6\u0001J\t\u0010&\u001a\u00020\bH\u00d6\u0001J\u0019\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020 H\u00d6\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0015\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0015\u0010\rR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0016\u0010\r\u00a8\u0006,"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductShippingViewModel$ShippingData;", "Landroid/os/Parcelable;", "weight", "", "length", "width", "height", "shippingClassSlug", "", "shippingClassId", "", "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Long;)V", "getHeight", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getLength", "getShippingClassId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getShippingClassSlug", "()Ljava/lang/String;", "getWeight", "getWidth", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Long;)Lcom/woocommerce/android/ui/products/ProductShippingViewModel$ShippingData;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class ShippingData implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable
        private final java.lang.Float weight = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Float length = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Float width = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Float height = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String shippingClassSlug = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Long shippingClassId = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.products.ProductShippingViewModel.ShippingData> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.ProductShippingViewModel.ShippingData copy(@org.jetbrains.annotations.Nullable
        java.lang.Float weight, @org.jetbrains.annotations.Nullable
        java.lang.Float length, @org.jetbrains.annotations.Nullable
        java.lang.Float width, @org.jetbrains.annotations.Nullable
        java.lang.Float height, @org.jetbrains.annotations.Nullable
        java.lang.String shippingClassSlug, @org.jetbrains.annotations.Nullable
        java.lang.Long shippingClassId) {
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
        
        public ShippingData() {
            super();
        }
        
        public ShippingData(@org.jetbrains.annotations.Nullable
        java.lang.Float weight, @org.jetbrains.annotations.Nullable
        java.lang.Float length, @org.jetbrains.annotations.Nullable
        java.lang.Float width, @org.jetbrains.annotations.Nullable
        java.lang.Float height, @org.jetbrains.annotations.Nullable
        java.lang.String shippingClassSlug, @org.jetbrains.annotations.Nullable
        java.lang.Long shippingClassId) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Float component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Float getWeight() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Float component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Float getLength() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Float component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Float getWidth() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Float component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Float getHeight() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getShippingClassSlug() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Long component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Long getShippingClassId() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.products.ProductShippingViewModel.ShippingData> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.products.ProductShippingViewModel.ShippingData createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.products.ProductShippingViewModel.ShippingData[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductShippingViewModel$Companion;", "", "()V", "KEY_PRODUCT_PARAMETERS", "", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}