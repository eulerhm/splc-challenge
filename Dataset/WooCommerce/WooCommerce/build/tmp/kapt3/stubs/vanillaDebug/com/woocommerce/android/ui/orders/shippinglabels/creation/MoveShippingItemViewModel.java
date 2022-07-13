package com.woocommerce.android.ui.orders.shippinglabels.creation;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0003&\'(B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010!\u001a\u00020\"J\u000e\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0007J\u0006\u0010%\u001a\u00020\"R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00158B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 \u00a8\u0006)"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/MoveShippingItemViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)V", "availableDestinations", "", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/MoveShippingItemViewModel$DestinationPackage;", "getAvailableDestinations", "()Ljava/util/List;", "currentPackage", "Lcom/woocommerce/android/model/ShippingLabelPackage;", "getCurrentPackage", "()Lcom/woocommerce/android/model/ShippingLabelPackage;", "navArgs", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/MoveShippingItemDialogArgs;", "getNavArgs", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/MoveShippingItemDialogArgs;", "navArgs$delegate", "Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "<set-?>", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/MoveShippingItemViewModel$ViewState;", "viewState", "getViewState", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/MoveShippingItemViewModel$ViewState;", "setViewState", "(Lcom/woocommerce/android/ui/orders/shippinglabels/creation/MoveShippingItemViewModel$ViewState;)V", "viewState$delegate", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "viewStateData", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getViewStateData", "()Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "onCancelButtonClicked", "", "onDestinationPackageSelected", "destinationPackage", "onMoveButtonClicked", "DestinationPackage", "MoveItemResult", "ViewState", "WooCommerce_vanillaDebug"})
public final class MoveShippingItemViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.viewmodel.NavArgsLazy navArgs$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.shippinglabels.creation.MoveShippingItemViewModel.ViewState> viewStateData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate viewState$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.woocommerce.android.ui.orders.shippinglabels.creation.MoveShippingItemViewModel.DestinationPackage> availableDestinations = null;
    @org.jetbrains.annotations.NotNull()
    private final com.woocommerce.android.model.ShippingLabelPackage currentPackage = null;
    
    @javax.inject.Inject()
    public MoveShippingItemViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedState) {
        super(null);
    }
    
    private final com.woocommerce.android.ui.orders.shippinglabels.creation.MoveShippingItemDialogArgs getNavArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.shippinglabels.creation.MoveShippingItemViewModel.ViewState> getViewStateData() {
        return null;
    }
    
    private final com.woocommerce.android.ui.orders.shippinglabels.creation.MoveShippingItemViewModel.ViewState getViewState() {
        return null;
    }
    
    private final void setViewState(com.woocommerce.android.ui.orders.shippinglabels.creation.MoveShippingItemViewModel.ViewState p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.woocommerce.android.ui.orders.shippinglabels.creation.MoveShippingItemViewModel.DestinationPackage> getAvailableDestinations() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.model.ShippingLabelPackage getCurrentPackage() {
        return null;
    }
    
    public final void onDestinationPackageSelected(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.orders.shippinglabels.creation.MoveShippingItemViewModel.DestinationPackage destinationPackage) {
    }
    
    public final void onMoveButtonClicked() {
    }
    
    public final void onCancelButtonClicked() {
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fH\u00d6\u0001R\u0017\u0010\u0005\u001a\u00020\u00068F\u00a2\u0006\f\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u001b"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/MoveShippingItemViewModel$ViewState;", "Landroid/os/Parcelable;", "selectedDestination", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/MoveShippingItemViewModel$DestinationPackage;", "(Lcom/woocommerce/android/ui/orders/shippinglabels/creation/MoveShippingItemViewModel$DestinationPackage;)V", "isMoveButtonEnabled", "", "isMoveButtonEnabled$annotations", "()V", "()Z", "getSelectedDestination", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/MoveShippingItemViewModel$DestinationPackage;", "component1", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
    public static final class ViewState implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable()
        private final com.woocommerce.android.ui.orders.shippinglabels.creation.MoveShippingItemViewModel.DestinationPackage selectedDestination = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.MoveShippingItemViewModel.ViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.MoveShippingItemViewModel.ViewState copy(@org.jetbrains.annotations.Nullable()
        com.woocommerce.android.ui.orders.shippinglabels.creation.MoveShippingItemViewModel.DestinationPackage selectedDestination) {
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
        com.woocommerce.android.ui.orders.shippinglabels.creation.MoveShippingItemViewModel.DestinationPackage selectedDestination) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.MoveShippingItemViewModel.DestinationPackage component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.MoveShippingItemViewModel.DestinationPackage getSelectedDestination() {
            return null;
        }
        
        @kotlinx.parcelize.IgnoredOnParcel()
        @java.lang.Deprecated()
        public static void isMoveButtonEnabled$annotations() {
        }
        
        public final boolean isMoveButtonEnabled() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.MoveShippingItemViewModel.ViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.MoveShippingItemViewModel.ViewState createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.MoveShippingItemViewModel.ViewState[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006!"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/MoveShippingItemViewModel$MoveItemResult;", "Landroid/os/Parcelable;", "item", "Lcom/woocommerce/android/model/ShippingLabelPackage$Item;", "currentPackage", "Lcom/woocommerce/android/model/ShippingLabelPackage;", "destination", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/MoveShippingItemViewModel$DestinationPackage;", "(Lcom/woocommerce/android/model/ShippingLabelPackage$Item;Lcom/woocommerce/android/model/ShippingLabelPackage;Lcom/woocommerce/android/ui/orders/shippinglabels/creation/MoveShippingItemViewModel$DestinationPackage;)V", "getCurrentPackage", "()Lcom/woocommerce/android/model/ShippingLabelPackage;", "getDestination", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/MoveShippingItemViewModel$DestinationPackage;", "getItem", "()Lcom/woocommerce/android/model/ShippingLabelPackage$Item;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
    public static final class MoveItemResult implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.model.ShippingLabelPackage.Item item = null;
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.model.ShippingLabelPackage currentPackage = null;
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.ui.orders.shippinglabels.creation.MoveShippingItemViewModel.DestinationPackage destination = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.MoveShippingItemViewModel.MoveItemResult> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.MoveShippingItemViewModel.MoveItemResult copy(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.ShippingLabelPackage.Item item, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.ShippingLabelPackage currentPackage, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.shippinglabels.creation.MoveShippingItemViewModel.DestinationPackage destination) {
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
        
        public MoveItemResult(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.ShippingLabelPackage.Item item, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.ShippingLabelPackage currentPackage, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.shippinglabels.creation.MoveShippingItemViewModel.DestinationPackage destination) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.ShippingLabelPackage.Item component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.ShippingLabelPackage.Item getItem() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.ShippingLabelPackage component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.ShippingLabelPackage getCurrentPackage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.MoveShippingItemViewModel.DestinationPackage component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.MoveShippingItemViewModel.DestinationPackage getDestination() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.MoveShippingItemViewModel.MoveItemResult> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.MoveShippingItemViewModel.MoveItemResult createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.MoveShippingItemViewModel.MoveItemResult[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/MoveShippingItemViewModel$DestinationPackage;", "Landroid/os/Parcelable;", "()V", "ExistingPackage", "NewPackage", "OriginalPackage", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/MoveShippingItemViewModel$DestinationPackage$NewPackage;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/MoveShippingItemViewModel$DestinationPackage$ExistingPackage;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/MoveShippingItemViewModel$DestinationPackage$OriginalPackage;", "WooCommerce_vanillaDebug"})
    public static abstract class DestinationPackage implements android.os.Parcelable {
        
        private DestinationPackage() {
            super();
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u00d6\u0001\u00a8\u0006\n"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/MoveShippingItemViewModel$DestinationPackage$NewPackage;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/MoveShippingItemViewModel$DestinationPackage;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
        public static final class NewPackage extends com.woocommerce.android.ui.orders.shippinglabels.creation.MoveShippingItemViewModel.DestinationPackage {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.orders.shippinglabels.creation.MoveShippingItemViewModel.DestinationPackage.NewPackage INSTANCE = null;
            public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.MoveShippingItemViewModel.DestinationPackage.NewPackage> CREATOR = null;
            
            private NewPackage() {
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
            public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.MoveShippingItemViewModel.DestinationPackage.NewPackage> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.ui.orders.shippinglabels.creation.MoveShippingItemViewModel.DestinationPackage.NewPackage createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.ui.orders.shippinglabels.creation.MoveShippingItemViewModel.DestinationPackage.NewPackage[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\nH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/MoveShippingItemViewModel$DestinationPackage$ExistingPackage;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/MoveShippingItemViewModel$DestinationPackage;", "destinationPackage", "Lcom/woocommerce/android/model/ShippingLabelPackage;", "(Lcom/woocommerce/android/model/ShippingLabelPackage;)V", "getDestinationPackage", "()Lcom/woocommerce/android/model/ShippingLabelPackage;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
        public static final class ExistingPackage extends com.woocommerce.android.ui.orders.shippinglabels.creation.MoveShippingItemViewModel.DestinationPackage {
            @org.jetbrains.annotations.NotNull()
            private final com.woocommerce.android.model.ShippingLabelPackage destinationPackage = null;
            public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.MoveShippingItemViewModel.DestinationPackage.ExistingPackage> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.MoveShippingItemViewModel.DestinationPackage.ExistingPackage copy(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.model.ShippingLabelPackage destinationPackage) {
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
            
            public ExistingPackage(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.model.ShippingLabelPackage destinationPackage) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.model.ShippingLabelPackage component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.model.ShippingLabelPackage getDestinationPackage() {
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
            public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.MoveShippingItemViewModel.DestinationPackage.ExistingPackage> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.ui.orders.shippinglabels.creation.MoveShippingItemViewModel.DestinationPackage.ExistingPackage createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.ui.orders.shippinglabels.creation.MoveShippingItemViewModel.DestinationPackage.ExistingPackage[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u00d6\u0001\u00a8\u0006\n"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/MoveShippingItemViewModel$DestinationPackage$OriginalPackage;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/MoveShippingItemViewModel$DestinationPackage;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
        public static final class OriginalPackage extends com.woocommerce.android.ui.orders.shippinglabels.creation.MoveShippingItemViewModel.DestinationPackage {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.orders.shippinglabels.creation.MoveShippingItemViewModel.DestinationPackage.OriginalPackage INSTANCE = null;
            public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.MoveShippingItemViewModel.DestinationPackage.OriginalPackage> CREATOR = null;
            
            private OriginalPackage() {
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
            public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.MoveShippingItemViewModel.DestinationPackage.OriginalPackage> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.ui.orders.shippinglabels.creation.MoveShippingItemViewModel.DestinationPackage.OriginalPackage createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.ui.orders.shippinglabels.creation.MoveShippingItemViewModel.DestinationPackage.OriginalPackage[] newArray(int size) {
                    return null;
                }
            }
        }
    }
}