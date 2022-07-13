package com.woocommerce.android.ui.orders.shippinglabels.creation;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 (2\u00020\u0001:\u0003()*B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\"\u001a\u00020#H\u0002J\u0006\u0010$\u001a\u00020#J\u000e\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020\'R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00168B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00160\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!\u00a8\u0006+"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingPackageSelectorViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "parameterRepository", "Lcom/woocommerce/android/ui/products/ParameterRepository;", "shippingLabelRepository", "Lcom/woocommerce/android/ui/orders/shippinglabels/ShippingLabelRepository;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/ui/products/ParameterRepository;Lcom/woocommerce/android/ui/orders/shippinglabels/ShippingLabelRepository;)V", "arguments", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingPackageSelectorFragmentArgs;", "getArguments", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingPackageSelectorFragmentArgs;", "arguments$delegate", "Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "dimensionUnit", "", "getDimensionUnit", "()Ljava/lang/String;", "dimensionUnit$delegate", "Lkotlin/Lazy;", "<set-?>", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingPackageSelectorViewModel$ViewState;", "viewState", "getViewState", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingPackageSelectorViewModel$ViewState;", "setViewState", "(Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingPackageSelectorViewModel$ViewState;)V", "viewState$delegate", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "viewStateData", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getViewStateData", "()Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "loadPackages", "", "onCreateNewPackageButtonClicked", "onPackageSelected", "shippingPackage", "Lcom/woocommerce/android/model/ShippingPackage;", "Companion", "ShowCreatePackageScreen", "ViewState", "WooCommerce_vanillaDebug"})
public final class ShippingPackageSelectorViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.ui.orders.shippinglabels.ShippingLabelRepository shippingLabelRepository = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingPackageSelectorViewModel.Companion Companion = null;
    private static final java.lang.String KEY_PARAMETERS = "key_parameters";
    private final com.woocommerce.android.viewmodel.NavArgsLazy arguments$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingPackageSelectorViewModel.ViewState> viewStateData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate viewState$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy dimensionUnit$delegate = null;
    
    @javax.inject.Inject()
    public ShippingPackageSelectorViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.ParameterRepository parameterRepository, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.orders.shippinglabels.ShippingLabelRepository shippingLabelRepository) {
        super(null);
    }
    
    private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingPackageSelectorFragmentArgs getArguments() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingPackageSelectorViewModel.ViewState> getViewStateData() {
        return null;
    }
    
    private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingPackageSelectorViewModel.ViewState getViewState() {
        return null;
    }
    
    private final void setViewState(com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingPackageSelectorViewModel.ViewState p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDimensionUnit() {
        return null;
    }
    
    private final void loadPackages() {
    }
    
    public final void onPackageSelected(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.ShippingPackage shippingPackage) {
    }
    
    public final void onCreateNewPackageButtonClicked() {
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0006H\u00c6\u0003J#\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001b"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingPackageSelectorViewModel$ViewState;", "Landroid/os/Parcelable;", "packagesList", "", "Lcom/woocommerce/android/model/ShippingPackage;", "isLoading", "", "(Ljava/util/List;Z)V", "()Z", "getPackagesList", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
    public static final class ViewState implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.woocommerce.android.model.ShippingPackage> packagesList = null;
        private final boolean isLoading = false;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingPackageSelectorViewModel.ViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingPackageSelectorViewModel.ViewState copy(@org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.model.ShippingPackage> packagesList, boolean isLoading) {
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
        java.util.List<com.woocommerce.android.model.ShippingPackage> packagesList, boolean isLoading) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.model.ShippingPackage> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.model.ShippingPackage> getPackagesList() {
            return null;
        }
        
        public final boolean component2() {
            return false;
        }
        
        public final boolean isLoading() {
            return false;
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingPackageSelectorViewModel.ViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingPackageSelectorViewModel.ViewState createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingPackageSelectorViewModel.ViewState[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingPackageSelectorViewModel$ShowCreatePackageScreen;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "position", "", "(I)V", "getPosition", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class ShowCreatePackageScreen extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        private final int position = 0;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingPackageSelectorViewModel.ShowCreatePackageScreen copy(int position) {
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
        
        public ShowCreatePackageScreen(int position) {
            super(false);
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getPosition() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingPackageSelectorViewModel$Companion;", "", "()V", "KEY_PARAMETERS", "", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}