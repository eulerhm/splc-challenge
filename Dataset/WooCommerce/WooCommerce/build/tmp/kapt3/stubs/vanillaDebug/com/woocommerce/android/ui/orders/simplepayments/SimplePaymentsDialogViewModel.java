package com.woocommerce.android.ui.orders.simplepayments;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001:\u0001 B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u001d\u001a\u00020\u001eH\u0012J\b\u0010\u001f\u001a\u00020\u001eH\u0016R$\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118P@PX\u0090\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006!"}, d2 = {"Lcom/woocommerce/android/ui/orders/simplepayments/SimplePaymentsDialogViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "networkStatus", "Lcom/woocommerce/android/tools/NetworkStatus;", "orderCreationRepository", "Lcom/woocommerce/android/ui/orders/creation/OrderCreationRepository;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/tools/NetworkStatus;Lcom/woocommerce/android/ui/orders/creation/OrderCreationRepository;)V", "value", "Ljava/math/BigDecimal;", "currentPrice", "getCurrentPrice", "()Ljava/math/BigDecimal;", "setCurrentPrice", "(Ljava/math/BigDecimal;)V", "<set-?>", "Lcom/woocommerce/android/ui/orders/simplepayments/SimplePaymentsDialogViewModel$ViewState;", "viewState", "getViewState$WooCommerce_vanillaDebug", "()Lcom/woocommerce/android/ui/orders/simplepayments/SimplePaymentsDialogViewModel$ViewState;", "setViewState$WooCommerce_vanillaDebug", "(Lcom/woocommerce/android/ui/orders/simplepayments/SimplePaymentsDialogViewModel$ViewState;)V", "viewState$delegate", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "viewStateLiveData", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getViewStateLiveData", "()Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "createSimplePaymentsOrder", "", "onDoneButtonClicked", "ViewState", "WooCommerce_vanillaDebug"})
@com.woocommerce.android.annotations.OpenClassOnDebug()
public class SimplePaymentsDialogViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.tools.NetworkStatus networkStatus = null;
    private final com.woocommerce.android.ui.orders.creation.OrderCreationRepository orderCreationRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.simplepayments.SimplePaymentsDialogViewModel.ViewState> viewStateLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final com.woocommerce.android.viewmodel.LiveDataDelegate viewState$delegate = null;
    
    @javax.inject.Inject()
    public SimplePaymentsDialogViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.tools.NetworkStatus networkStatus, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.orders.creation.OrderCreationRepository orderCreationRepository) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.simplepayments.SimplePaymentsDialogViewModel.ViewState> getViewStateLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.woocommerce.android.ui.orders.simplepayments.SimplePaymentsDialogViewModel.ViewState getViewState$WooCommerce_vanillaDebug() {
        return null;
    }
    
    public void setViewState$WooCommerce_vanillaDebug(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.orders.simplepayments.SimplePaymentsDialogViewModel.ViewState p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.math.BigDecimal getCurrentPrice() {
        return null;
    }
    
    public void setCurrentPrice(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal value) {
    }
    
    public void onDoneButtonClicked() {
    }
    
    private void createSimplePaymentsOrder() {
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bH\u00c6\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00c6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015H\u00d6\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e\u00a8\u0006!"}, d2 = {"Lcom/woocommerce/android/ui/orders/simplepayments/SimplePaymentsDialogViewModel$ViewState;", "Landroid/os/Parcelable;", "currentPrice", "Ljava/math/BigDecimal;", "isDoneButtonEnabled", "", "isProgressShowing", "createdOrder", "Lcom/woocommerce/android/model/Order;", "(Ljava/math/BigDecimal;ZZLcom/woocommerce/android/model/Order;)V", "getCreatedOrder", "()Lcom/woocommerce/android/model/Order;", "getCurrentPrice", "()Ljava/math/BigDecimal;", "()Z", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
    public static final class ViewState implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        private final java.math.BigDecimal currentPrice = null;
        private final boolean isDoneButtonEnabled = false;
        private final boolean isProgressShowing = false;
        @org.jetbrains.annotations.Nullable()
        private final com.woocommerce.android.model.Order createdOrder = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.simplepayments.SimplePaymentsDialogViewModel.ViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.simplepayments.SimplePaymentsDialogViewModel.ViewState copy(@org.jetbrains.annotations.NotNull()
        java.math.BigDecimal currentPrice, boolean isDoneButtonEnabled, boolean isProgressShowing, @org.jetbrains.annotations.Nullable()
        com.woocommerce.android.model.Order createdOrder) {
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
        java.math.BigDecimal currentPrice, boolean isDoneButtonEnabled, boolean isProgressShowing, @org.jetbrains.annotations.Nullable()
        com.woocommerce.android.model.Order createdOrder) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.math.BigDecimal component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.math.BigDecimal getCurrentPrice() {
            return null;
        }
        
        public final boolean component2() {
            return false;
        }
        
        public final boolean isDoneButtonEnabled() {
            return false;
        }
        
        public final boolean component3() {
            return false;
        }
        
        public final boolean isProgressShowing() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.woocommerce.android.model.Order component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.woocommerce.android.model.Order getCreatedOrder() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.simplepayments.SimplePaymentsDialogViewModel.ViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.orders.simplepayments.SimplePaymentsDialogViewModel.ViewState createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.orders.simplepayments.SimplePaymentsDialogViewModel.ViewState[] newArray(int size) {
                return null;
            }
        }
    }
}