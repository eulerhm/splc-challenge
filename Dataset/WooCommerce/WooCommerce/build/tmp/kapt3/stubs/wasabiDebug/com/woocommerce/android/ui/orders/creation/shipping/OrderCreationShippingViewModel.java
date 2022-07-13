package com.woocommerce.android.ui.orders.creation.shipping;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0003!\"#B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u0019J\u000e\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020\u0019R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR+\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006$"}, d2 = {"Lcom/woocommerce/android/ui/orders/creation/shipping/OrderCreationShippingViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)V", "navArgs", "Lcom/woocommerce/android/ui/orders/creation/shipping/OrderCreationShippingFragmentArgs;", "getNavArgs", "()Lcom/woocommerce/android/ui/orders/creation/shipping/OrderCreationShippingFragmentArgs;", "navArgs$delegate", "Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "<set-?>", "Lcom/woocommerce/android/ui/orders/creation/shipping/OrderCreationShippingViewModel$ViewState;", "viewState", "getViewState", "()Lcom/woocommerce/android/ui/orders/creation/shipping/OrderCreationShippingViewModel$ViewState;", "setViewState", "(Lcom/woocommerce/android/ui/orders/creation/shipping/OrderCreationShippingViewModel$ViewState;)V", "viewState$delegate", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "viewStateData", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getViewStateData", "()Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "onAmountEdited", "", "amount", "Ljava/math/BigDecimal;", "onDoneButtonClicked", "onNameEdited", "name", "", "onRemoveShippingClicked", "RemoveShipping", "UpdateShipping", "ViewState", "WooCommerce_wasabiDebug"})
public final class OrderCreationShippingViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.viewmodel.NavArgsLazy navArgs$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.creation.shipping.OrderCreationShippingViewModel.ViewState> viewStateData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate viewState$delegate = null;
    
    @javax.inject.Inject
    public OrderCreationShippingViewModel(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super(null);
    }
    
    private final com.woocommerce.android.ui.orders.creation.shipping.OrderCreationShippingFragmentArgs getNavArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.creation.shipping.OrderCreationShippingViewModel.ViewState> getViewStateData() {
        return null;
    }
    
    private final com.woocommerce.android.ui.orders.creation.shipping.OrderCreationShippingViewModel.ViewState getViewState() {
        return null;
    }
    
    private final void setViewState(com.woocommerce.android.ui.orders.creation.shipping.OrderCreationShippingViewModel.ViewState p0) {
    }
    
    public final void onAmountEdited(@org.jetbrains.annotations.NotNull
    java.math.BigDecimal amount) {
    }
    
    public final void onNameEdited(@org.jetbrains.annotations.NotNull
    java.lang.String name) {
    }
    
    public final void onDoneButtonClicked() {
    }
    
    public final void onRemoveShippingClicked() {
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0007H\u00c6\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u001e"}, d2 = {"Lcom/woocommerce/android/ui/orders/creation/shipping/OrderCreationShippingViewModel$ViewState;", "Landroid/os/Parcelable;", "amount", "Ljava/math/BigDecimal;", "name", "", "isEditFlow", "", "(Ljava/math/BigDecimal;Ljava/lang/String;Z)V", "getAmount", "()Ljava/math/BigDecimal;", "()Z", "getName", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class ViewState implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull
        private final java.math.BigDecimal amount = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String name = null;
        private final boolean isEditFlow = false;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.creation.shipping.OrderCreationShippingViewModel.ViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.creation.shipping.OrderCreationShippingViewModel.ViewState copy(@org.jetbrains.annotations.NotNull
        java.math.BigDecimal amount, @org.jetbrains.annotations.Nullable
        java.lang.String name, boolean isEditFlow) {
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
        
        public ViewState(@org.jetbrains.annotations.NotNull
        java.math.BigDecimal amount, @org.jetbrains.annotations.Nullable
        java.lang.String name, boolean isEditFlow) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigDecimal component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigDecimal getAmount() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getName() {
            return null;
        }
        
        public final boolean component3() {
            return false;
        }
        
        public final boolean isEditFlow() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.creation.shipping.OrderCreationShippingViewModel.ViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.orders.creation.shipping.OrderCreationShippingViewModel.ViewState createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.orders.creation.shipping.OrderCreationShippingViewModel.ViewState[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/woocommerce/android/ui/orders/creation/shipping/OrderCreationShippingViewModel$UpdateShipping;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "amount", "Ljava/math/BigDecimal;", "name", "", "(Ljava/math/BigDecimal;Ljava/lang/String;)V", "getAmount", "()Ljava/math/BigDecimal;", "getName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_wasabiDebug"})
    public static final class UpdateShipping extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        @org.jetbrains.annotations.NotNull
        private final java.math.BigDecimal amount = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String name = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.creation.shipping.OrderCreationShippingViewModel.UpdateShipping copy(@org.jetbrains.annotations.NotNull
        java.math.BigDecimal amount, @org.jetbrains.annotations.NotNull
        java.lang.String name) {
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
        
        public UpdateShipping(@org.jetbrains.annotations.NotNull
        java.math.BigDecimal amount, @org.jetbrains.annotations.NotNull
        java.lang.String name) {
            super(false);
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigDecimal component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigDecimal getAmount() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getName() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/orders/creation/shipping/OrderCreationShippingViewModel$RemoveShipping;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "()V", "WooCommerce_wasabiDebug"})
    public static final class RemoveShipping extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        @org.jetbrains.annotations.NotNull
        public static final com.woocommerce.android.ui.orders.creation.shipping.OrderCreationShippingViewModel.RemoveShipping INSTANCE = null;
        
        private RemoveShipping() {
            super(false);
        }
    }
}