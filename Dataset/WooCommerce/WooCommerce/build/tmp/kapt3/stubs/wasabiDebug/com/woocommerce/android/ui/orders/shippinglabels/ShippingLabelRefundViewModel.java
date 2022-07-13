package com.woocommerce.android.ui.orders.shippinglabels;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001$B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010!\u001a\u00020\"J\u0006\u0010#\u001a\u00020\"R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u000f\u001a\u00020\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00158B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 \u00a8\u0006%"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/ShippingLabelRefundViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "repository", "Lcom/woocommerce/android/ui/orders/shippinglabels/ShippingLabelRepository;", "networkStatus", "Lcom/woocommerce/android/tools/NetworkStatus;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/ui/orders/shippinglabels/ShippingLabelRepository;Lcom/woocommerce/android/tools/NetworkStatus;)V", "arguments", "Lcom/woocommerce/android/ui/orders/shippinglabels/ShippingLabelRefundFragmentArgs;", "getArguments", "()Lcom/woocommerce/android/ui/orders/shippinglabels/ShippingLabelRefundFragmentArgs;", "arguments$delegate", "Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "isRefundInProgress", "", "()Z", "refundJob", "Lkotlinx/coroutines/Job;", "<set-?>", "Lcom/woocommerce/android/ui/orders/shippinglabels/ShippingLabelRefundViewModel$ShippingLabelRefundViewState;", "shippingLabelRefundViewState", "getShippingLabelRefundViewState", "()Lcom/woocommerce/android/ui/orders/shippinglabels/ShippingLabelRefundViewModel$ShippingLabelRefundViewState;", "setShippingLabelRefundViewState", "(Lcom/woocommerce/android/ui/orders/shippinglabels/ShippingLabelRefundViewModel$ShippingLabelRefundViewState;)V", "shippingLabelRefundViewState$delegate", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "shippingLabelRefundViewStateData", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getShippingLabelRefundViewStateData", "()Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "onRefundShippingLabelButtonClicked", "", "start", "ShippingLabelRefundViewState", "WooCommerce_wasabiDebug"})
public final class ShippingLabelRefundViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.ui.orders.shippinglabels.ShippingLabelRepository repository = null;
    private final com.woocommerce.android.tools.NetworkStatus networkStatus = null;
    private kotlinx.coroutines.Job refundJob;
    private final com.woocommerce.android.viewmodel.NavArgsLazy arguments$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.shippinglabels.ShippingLabelRefundViewModel.ShippingLabelRefundViewState> shippingLabelRefundViewStateData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate shippingLabelRefundViewState$delegate = null;
    
    @javax.inject.Inject
    public ShippingLabelRefundViewModel(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.orders.shippinglabels.ShippingLabelRepository repository, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.NetworkStatus networkStatus) {
        super(null);
    }
    
    public final boolean isRefundInProgress() {
        return false;
    }
    
    private final com.woocommerce.android.ui.orders.shippinglabels.ShippingLabelRefundFragmentArgs getArguments() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.shippinglabels.ShippingLabelRefundViewModel.ShippingLabelRefundViewState> getShippingLabelRefundViewStateData() {
        return null;
    }
    
    private final com.woocommerce.android.ui.orders.shippinglabels.ShippingLabelRefundViewModel.ShippingLabelRefundViewState getShippingLabelRefundViewState() {
        return null;
    }
    
    private final void setShippingLabelRefundViewState(com.woocommerce.android.ui.orders.shippinglabels.ShippingLabelRefundViewModel.ShippingLabelRefundViewState p0) {
    }
    
    public final void start() {
    }
    
    public final void onRefundShippingLabelButtonClicked() {
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fH\u00d6\u0001R\u0017\u0010\u0005\u001a\u00020\u00068F\u00a2\u0006\f\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u001b"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/ShippingLabelRefundViewModel$ShippingLabelRefundViewState;", "Landroid/os/Parcelable;", "shippingLabel", "Lcom/woocommerce/android/model/ShippingLabel;", "(Lcom/woocommerce/android/model/ShippingLabel;)V", "isRefundExpired", "", "isRefundExpired$annotations", "()V", "()Z", "getShippingLabel", "()Lcom/woocommerce/android/model/ShippingLabel;", "component1", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class ShippingLabelRefundViewState implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable
        private final com.woocommerce.android.model.ShippingLabel shippingLabel = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.ShippingLabelRefundViewModel.ShippingLabelRefundViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.shippinglabels.ShippingLabelRefundViewModel.ShippingLabelRefundViewState copy(@org.jetbrains.annotations.Nullable
        com.woocommerce.android.model.ShippingLabel shippingLabel) {
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
        
        public ShippingLabelRefundViewState() {
            super();
        }
        
        public ShippingLabelRefundViewState(@org.jetbrains.annotations.Nullable
        com.woocommerce.android.model.ShippingLabel shippingLabel) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.woocommerce.android.model.ShippingLabel component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.woocommerce.android.model.ShippingLabel getShippingLabel() {
            return null;
        }
        
        @kotlinx.parcelize.IgnoredOnParcel
        @java.lang.Deprecated
        public static void isRefundExpired$annotations() {
        }
        
        public final boolean isRefundExpired() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.ShippingLabelRefundViewModel.ShippingLabelRefundViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.orders.shippinglabels.ShippingLabelRefundViewModel.ShippingLabelRefundViewState createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.orders.shippinglabels.ShippingLabelRefundViewModel.ShippingLabelRefundViewState[] newArray(int size) {
                return null;
            }
        }
    }
}