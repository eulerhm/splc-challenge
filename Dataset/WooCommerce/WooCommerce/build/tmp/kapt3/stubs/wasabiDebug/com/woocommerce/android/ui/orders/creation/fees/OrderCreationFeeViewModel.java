package com.woocommerce.android.ui.orders.creation.fees;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u0000 +2\u00020\u0001:\u0004+,-.B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\fH\u0002J\u0010\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\fH\u0002J\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\fJ\u000e\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020$J\u000e\u0010%\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\'J\u0006\u0010(\u001a\u00020\u001fJ\u0010\u0010)\u001a\u00020\'2\u0006\u0010*\u001a\u00020\fH\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006/"}, d2 = {"Lcom/woocommerce/android/ui/orders/creation/fees/OrderCreationFeeViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)V", "navArgs", "Lcom/woocommerce/android/ui/orders/creation/fees/OrderCreationFeeFragmentArgs;", "getNavArgs", "()Lcom/woocommerce/android/ui/orders/creation/fees/OrderCreationFeeFragmentArgs;", "navArgs$delegate", "Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "orderSubtotal", "Ljava/math/BigDecimal;", "<set-?>", "Lcom/woocommerce/android/ui/orders/creation/fees/OrderCreationFeeViewModel$ViewState;", "viewState", "getViewState", "()Lcom/woocommerce/android/ui/orders/creation/fees/OrderCreationFeeViewModel$ViewState;", "setViewState", "(Lcom/woocommerce/android/ui/orders/creation/fees/OrderCreationFeeViewModel$ViewState;)V", "viewState$delegate", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "viewStateData", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getViewStateData", "()Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "calculateFeePercentage", "percentage", "calculatePercentageFromValue", "value", "onDoneSelected", "", "onFeeAmountChanged", "feeAmount", "onFeePercentageChanged", "feePercentageRaw", "", "onPercentageSwitchChanged", "isChecked", "", "onRemoveFeeClicked", "shouldEnableDoneButtonForAmount", "amount", "Companion", "RemoveFee", "UpdateFee", "ViewState", "WooCommerce_wasabiDebug"})
public final class OrderCreationFeeViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.orders.creation.fees.OrderCreationFeeViewModel.Companion Companion = null;
    private static final int DEFAULT_SCALE_QUOTIENT = 4;
    private static final java.math.BigDecimal PERCENTAGE_BASE = null;
    private final com.woocommerce.android.viewmodel.NavArgsLazy navArgs$delegate = null;
    private final java.math.BigDecimal orderSubtotal = null;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.creation.fees.OrderCreationFeeViewModel.ViewState> viewStateData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate viewState$delegate = null;
    
    @javax.inject.Inject
    public OrderCreationFeeViewModel(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedState) {
        super(null);
    }
    
    private final com.woocommerce.android.ui.orders.creation.fees.OrderCreationFeeFragmentArgs getNavArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.creation.fees.OrderCreationFeeViewModel.ViewState> getViewStateData() {
        return null;
    }
    
    private final com.woocommerce.android.ui.orders.creation.fees.OrderCreationFeeViewModel.ViewState getViewState() {
        return null;
    }
    
    private final void setViewState(com.woocommerce.android.ui.orders.creation.fees.OrderCreationFeeViewModel.ViewState p0) {
    }
    
    private final java.math.BigDecimal calculateFeePercentage(java.math.BigDecimal percentage) {
        return null;
    }
    
    private final java.math.BigDecimal calculatePercentageFromValue(java.math.BigDecimal value) {
        return null;
    }
    
    public final void onDoneSelected() {
    }
    
    public final void onRemoveFeeClicked() {
    }
    
    public final void onPercentageSwitchChanged(boolean isChecked) {
    }
    
    public final void onFeeAmountChanged(@org.jetbrains.annotations.NotNull
    java.math.BigDecimal feeAmount) {
    }
    
    public final void onFeePercentageChanged(@org.jetbrains.annotations.NotNull
    java.lang.String feePercentageRaw) {
    }
    
    private final boolean shouldEnableDoneButtonForAmount(java.math.BigDecimal amount) {
        return false;
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0006H\u00c6\u0003JE\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006H\u00c6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\u0013\u0010\u001a\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e\u00a8\u0006%"}, d2 = {"Lcom/woocommerce/android/ui/orders/creation/fees/OrderCreationFeeViewModel$ViewState;", "Landroid/os/Parcelable;", "feeAmount", "Ljava/math/BigDecimal;", "feePercentage", "isPercentageSelected", "", "isDoneButtonEnabled", "shouldDisplayRemoveFeeButton", "shouldDisplayPercentageSwitch", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZZZZ)V", "getFeeAmount", "()Ljava/math/BigDecimal;", "getFeePercentage", "()Z", "getShouldDisplayPercentageSwitch", "getShouldDisplayRemoveFeeButton", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class ViewState implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull
        private final java.math.BigDecimal feeAmount = null;
        @org.jetbrains.annotations.NotNull
        private final java.math.BigDecimal feePercentage = null;
        private final boolean isPercentageSelected = false;
        private final boolean isDoneButtonEnabled = false;
        private final boolean shouldDisplayRemoveFeeButton = false;
        private final boolean shouldDisplayPercentageSwitch = false;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.creation.fees.OrderCreationFeeViewModel.ViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.creation.fees.OrderCreationFeeViewModel.ViewState copy(@org.jetbrains.annotations.NotNull
        java.math.BigDecimal feeAmount, @org.jetbrains.annotations.NotNull
        java.math.BigDecimal feePercentage, boolean isPercentageSelected, boolean isDoneButtonEnabled, boolean shouldDisplayRemoveFeeButton, boolean shouldDisplayPercentageSwitch) {
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
        java.math.BigDecimal feeAmount, @org.jetbrains.annotations.NotNull
        java.math.BigDecimal feePercentage, boolean isPercentageSelected, boolean isDoneButtonEnabled, boolean shouldDisplayRemoveFeeButton, boolean shouldDisplayPercentageSwitch) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigDecimal component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigDecimal getFeeAmount() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigDecimal component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigDecimal getFeePercentage() {
            return null;
        }
        
        public final boolean component3() {
            return false;
        }
        
        public final boolean isPercentageSelected() {
            return false;
        }
        
        public final boolean component4() {
            return false;
        }
        
        public final boolean isDoneButtonEnabled() {
            return false;
        }
        
        public final boolean component5() {
            return false;
        }
        
        public final boolean getShouldDisplayRemoveFeeButton() {
            return false;
        }
        
        public final boolean component6() {
            return false;
        }
        
        public final boolean getShouldDisplayPercentageSwitch() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.creation.fees.OrderCreationFeeViewModel.ViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.orders.creation.fees.OrderCreationFeeViewModel.ViewState createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.orders.creation.fees.OrderCreationFeeViewModel.ViewState[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/orders/creation/fees/OrderCreationFeeViewModel$UpdateFee;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "amount", "Ljava/math/BigDecimal;", "(Ljava/math/BigDecimal;)V", "getAmount", "()Ljava/math/BigDecimal;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
    public static final class UpdateFee extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        @org.jetbrains.annotations.NotNull
        private final java.math.BigDecimal amount = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.creation.fees.OrderCreationFeeViewModel.UpdateFee copy(@org.jetbrains.annotations.NotNull
        java.math.BigDecimal amount) {
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
        
        public UpdateFee(@org.jetbrains.annotations.NotNull
        java.math.BigDecimal amount) {
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
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/orders/creation/fees/OrderCreationFeeViewModel$RemoveFee;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "()V", "WooCommerce_wasabiDebug"})
    public static final class RemoveFee extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        @org.jetbrains.annotations.NotNull
        public static final com.woocommerce.android.ui.orders.creation.fees.OrderCreationFeeViewModel.RemoveFee INSTANCE = null;
        
        private RemoveFee() {
            super(false);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/ui/orders/creation/fees/OrderCreationFeeViewModel$Companion;", "", "()V", "DEFAULT_SCALE_QUOTIENT", "", "PERCENTAGE_BASE", "Ljava/math/BigDecimal;", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}