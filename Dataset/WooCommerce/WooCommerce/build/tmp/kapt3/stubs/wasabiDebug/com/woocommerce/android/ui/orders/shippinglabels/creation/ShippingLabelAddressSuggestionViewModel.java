package com.woocommerce.android.ui.orders.shippinglabels.creation;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001!B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0019J\u000e\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\u0019J\b\u0010\u001f\u001a\u00020\u0019H\u0002J\b\u0010 \u001a\u00020\u0019H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR+\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006\""}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelAddressSuggestionViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)V", "arguments", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelAddressSuggestionFragmentArgs;", "getArguments", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelAddressSuggestionFragmentArgs;", "arguments$delegate", "Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "<set-?>", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelAddressSuggestionViewModel$ViewState;", "viewState", "getViewState", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelAddressSuggestionViewModel$ViewState;", "setViewState", "(Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelAddressSuggestionViewModel$ViewState;)V", "viewState$delegate", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "viewStateData", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getViewStateData", "()Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "onEditSelectedAddressTapped", "", "onExit", "onSelectedAddressChanged", "isSuggestedAddress", "", "onUseSelectedAddressTapped", "trackEditAddressEvent", "trackUseAddressEvent", "ViewState", "WooCommerce_wasabiDebug"})
public final class ShippingLabelAddressSuggestionViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.viewmodel.NavArgsLazy arguments$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressSuggestionViewModel.ViewState> viewStateData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate viewState$delegate = null;
    
    @javax.inject.Inject
    public ShippingLabelAddressSuggestionViewModel(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedState) {
        super(null);
    }
    
    private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressSuggestionFragmentArgs getArguments() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressSuggestionViewModel.ViewState> getViewStateData() {
        return null;
    }
    
    private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressSuggestionViewModel.ViewState getViewState() {
        return null;
    }
    
    private final void setViewState(com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressSuggestionViewModel.ViewState p0) {
    }
    
    public final void onUseSelectedAddressTapped() {
    }
    
    private final void trackUseAddressEvent() {
    }
    
    public final void onEditSelectedAddressTapped() {
    }
    
    private final void trackEditAddressEvent() {
    }
    
    public final void onSelectedAddressChanged(boolean isSuggestedAddress) {
    }
    
    public final void onExit() {
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J>\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u001bJ\t\u0010\u001c\u001a\u00020\u0007H\u00d6\u0001J\u0013\u0010\u001d\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u00d6\u0003J\t\u0010 \u001a\u00020\u0007H\u00d6\u0001J\t\u0010!\u001a\u00020\"H\u00d6\u0001J\u0019\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u0007H\u00d6\u0001R\u0017\u0010\t\u001a\u00020\n\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006("}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelAddressSuggestionViewModel$ViewState;", "Landroid/os/Parcelable;", "enteredAddress", "Lcom/woocommerce/android/model/Address;", "suggestedAddress", "selectedAddress", "title", "", "(Lcom/woocommerce/android/model/Address;Lcom/woocommerce/android/model/Address;Lcom/woocommerce/android/model/Address;Ljava/lang/Integer;)V", "areButtonsEnabled", "", "getAreButtonsEnabled$annotations", "()V", "getAreButtonsEnabled", "()Z", "getEnteredAddress", "()Lcom/woocommerce/android/model/Address;", "getSelectedAddress", "getSuggestedAddress", "getTitle", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Lcom/woocommerce/android/model/Address;Lcom/woocommerce/android/model/Address;Lcom/woocommerce/android/model/Address;Ljava/lang/Integer;)Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelAddressSuggestionViewModel$ViewState;", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class ViewState implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable
        private final com.woocommerce.android.model.Address enteredAddress = null;
        @org.jetbrains.annotations.Nullable
        private final com.woocommerce.android.model.Address suggestedAddress = null;
        @org.jetbrains.annotations.Nullable
        private final com.woocommerce.android.model.Address selectedAddress = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Integer title = null;
        private final boolean areButtonsEnabled = false;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressSuggestionViewModel.ViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressSuggestionViewModel.ViewState copy(@org.jetbrains.annotations.Nullable
        com.woocommerce.android.model.Address enteredAddress, @org.jetbrains.annotations.Nullable
        com.woocommerce.android.model.Address suggestedAddress, @org.jetbrains.annotations.Nullable
        com.woocommerce.android.model.Address selectedAddress, @org.jetbrains.annotations.Nullable
        @androidx.annotation.StringRes
        java.lang.Integer title) {
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
        
        public ViewState(@org.jetbrains.annotations.Nullable
        com.woocommerce.android.model.Address enteredAddress, @org.jetbrains.annotations.Nullable
        com.woocommerce.android.model.Address suggestedAddress, @org.jetbrains.annotations.Nullable
        com.woocommerce.android.model.Address selectedAddress, @org.jetbrains.annotations.Nullable
        @androidx.annotation.StringRes
        java.lang.Integer title) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.woocommerce.android.model.Address component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.woocommerce.android.model.Address getEnteredAddress() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.woocommerce.android.model.Address component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.woocommerce.android.model.Address getSuggestedAddress() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.woocommerce.android.model.Address component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.woocommerce.android.model.Address getSelectedAddress() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer getTitle() {
            return null;
        }
        
        public final boolean getAreButtonsEnabled() {
            return false;
        }
        
        @kotlinx.parcelize.IgnoredOnParcel
        @java.lang.Deprecated
        public static void getAreButtonsEnabled$annotations() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressSuggestionViewModel.ViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressSuggestionViewModel.ViewState createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressSuggestionViewModel.ViewState[] newArray(int size) {
                return null;
            }
        }
    }
}