package com.woocommerce.android.ui.orders.shippinglabels.creation;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u0000 #2\u00020\u0001:\u0004#$%&B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u001e\u001a\u00020\u001fH\u0002J\u0006\u0010 \u001a\u00020\u001fJ\u000e\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\fR\u001b\u0010\u000b\u001a\u00020\f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00128B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00120\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d\u00a8\u0006\'"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelCreateServicePackageViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "resourceProvider", "Lcom/woocommerce/android/viewmodel/ResourceProvider;", "shippingLabelRepository", "Lcom/woocommerce/android/ui/orders/shippinglabels/ShippingLabelRepository;", "parameterRepository", "Lcom/woocommerce/android/ui/products/ParameterRepository;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/viewmodel/ResourceProvider;Lcom/woocommerce/android/ui/orders/shippinglabels/ShippingLabelRepository;Lcom/woocommerce/android/ui/products/ParameterRepository;)V", "dimensionUnit", "", "getDimensionUnit", "()Ljava/lang/String;", "dimensionUnit$delegate", "Lkotlin/Lazy;", "<set-?>", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelCreateServicePackageViewModel$ViewState;", "viewState", "getViewState", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelCreateServicePackageViewModel$ViewState;", "setViewState", "(Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelCreateServicePackageViewModel$ViewState;)V", "viewState$delegate", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "viewStateData", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getViewStateData", "()Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getSelectableServicePackages", "", "onCustomFormDoneMenuClicked", "onPackageSelected", "id", "Companion", "PackageSuccessfullyMadeEvent", "ServicePackageUiModel", "ViewState", "WooCommerce_vanillaDebug"})
public final class ShippingLabelCreateServicePackageViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.viewmodel.ResourceProvider resourceProvider = null;
    private final com.woocommerce.android.ui.orders.shippinglabels.ShippingLabelRepository shippingLabelRepository = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateServicePackageViewModel.Companion Companion = null;
    private static final java.lang.String KEY_PARAMETERS = "key_parameters";
    @org.jetbrains.annotations.NotNull()
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateServicePackageViewModel.ViewState> viewStateData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate viewState$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy dimensionUnit$delegate = null;
    
    @javax.inject.Inject()
    public ShippingLabelCreateServicePackageViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.viewmodel.ResourceProvider resourceProvider, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.orders.shippinglabels.ShippingLabelRepository shippingLabelRepository, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.ParameterRepository parameterRepository) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateServicePackageViewModel.ViewState> getViewStateData() {
        return null;
    }
    
    private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateServicePackageViewModel.ViewState getViewState() {
        return null;
    }
    
    private final void setViewState(com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateServicePackageViewModel.ViewState p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDimensionUnit() {
        return null;
    }
    
    private final void getSelectableServicePackages() {
    }
    
    public final void onPackageSelected(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    public final void onCustomFormDoneMenuClicked() {
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J>\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0016J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\u0019\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018H\u00d6\u0001R\u0011\u0010\n\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0005\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006$"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelCreateServicePackageViewModel$ViewState;", "Landroid/os/Parcelable;", "isEmpty", "", "isLoading", "isSavingProgressDialogVisible", "uiModels", "", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelCreateServicePackageViewModel$ServicePackageUiModel;", "(ZZLjava/lang/Boolean;Ljava/util/List;)V", "canSave", "getCanSave", "()Z", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getUiModels", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "(ZZLjava/lang/Boolean;Ljava/util/List;)Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelCreateServicePackageViewModel$ViewState;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
    public static final class ViewState implements android.os.Parcelable {
        private final boolean isEmpty = false;
        private final boolean isLoading = false;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isSavingProgressDialogVisible = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateServicePackageViewModel.ServicePackageUiModel> uiModels = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateServicePackageViewModel.ViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateServicePackageViewModel.ViewState copy(boolean isEmpty, boolean isLoading, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isSavingProgressDialogVisible, @org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateServicePackageViewModel.ServicePackageUiModel> uiModels) {
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
        
        public ViewState(boolean isEmpty, boolean isLoading, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isSavingProgressDialogVisible, @org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateServicePackageViewModel.ServicePackageUiModel> uiModels) {
            super();
        }
        
        public final boolean component1() {
            return false;
        }
        
        public final boolean isEmpty() {
            return false;
        }
        
        public final boolean component2() {
            return false;
        }
        
        public final boolean isLoading() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isSavingProgressDialogVisible() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateServicePackageViewModel.ServicePackageUiModel> component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateServicePackageViewModel.ServicePackageUiModel> getUiModels() {
            return null;
        }
        
        public final boolean getCanSave() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateServicePackageViewModel.ViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateServicePackageViewModel.ViewState createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateServicePackageViewModel.ViewState[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\t\u00a8\u0006\u001a"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelCreateServicePackageViewModel$ServicePackageUiModel;", "Landroid/os/Parcelable;", "data", "Lcom/woocommerce/android/model/ShippingPackage;", "isChecked", "", "(Lcom/woocommerce/android/model/ShippingPackage;Z)V", "getData", "()Lcom/woocommerce/android/model/ShippingPackage;", "()Z", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
    public static final class ServicePackageUiModel implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.model.ShippingPackage data = null;
        private final boolean isChecked = false;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateServicePackageViewModel.ServicePackageUiModel> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateServicePackageViewModel.ServicePackageUiModel copy(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.ShippingPackage data, boolean isChecked) {
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
        
        public ServicePackageUiModel(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.ShippingPackage data, boolean isChecked) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.ShippingPackage component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.ShippingPackage getData() {
            return null;
        }
        
        public final boolean component2() {
            return false;
        }
        
        public final boolean isChecked() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateServicePackageViewModel.ServicePackageUiModel> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateServicePackageViewModel.ServicePackageUiModel createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateServicePackageViewModel.ServicePackageUiModel[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelCreateServicePackageViewModel$PackageSuccessfullyMadeEvent;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "madePackage", "Lcom/woocommerce/android/model/ShippingPackage;", "(Lcom/woocommerce/android/model/ShippingPackage;)V", "getMadePackage", "()Lcom/woocommerce/android/model/ShippingPackage;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class PackageSuccessfullyMadeEvent extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.model.ShippingPackage madePackage = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateServicePackageViewModel.PackageSuccessfullyMadeEvent copy(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.ShippingPackage madePackage) {
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
        
        public PackageSuccessfullyMadeEvent(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.ShippingPackage madePackage) {
            super(false);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.ShippingPackage component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.ShippingPackage getMadePackage() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelCreateServicePackageViewModel$Companion;", "", "()V", "KEY_PARAMETERS", "", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}