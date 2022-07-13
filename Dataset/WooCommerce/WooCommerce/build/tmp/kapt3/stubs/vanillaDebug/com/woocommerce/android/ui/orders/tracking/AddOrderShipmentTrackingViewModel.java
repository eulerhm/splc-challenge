package com.woocommerce.android.ui.orders.tracking;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u000256B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010 \u001a\u00020!J\u0006\u0010\"\u001a\u00020#J\u0006\u0010$\u001a\u00020!J\u000e\u0010%\u001a\u00020!2\u0006\u0010&\u001a\u00020\'J\u000e\u0010(\u001a\u00020!2\u0006\u0010)\u001a\u00020\u0017J\u000e\u0010*\u001a\u00020!2\u0006\u0010+\u001a\u00020\u0017J\u000e\u0010,\u001a\u00020!2\u0006\u0010-\u001a\u00020\u0017J\u000e\u0010.\u001a\u00020!2\u0006\u0010/\u001a\u00020\u0017J$\u00100\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0012\f\u0012\n 2*\u0004\u0018\u00010\u00170\u0017012\u0006\u00103\u001a\u000204H\u0002R+\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00178F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00067"}, d2 = {"Lcom/woocommerce/android/ui/orders/tracking/AddOrderShipmentTrackingViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "networkStatus", "Lcom/woocommerce/android/tools/NetworkStatus;", "orderDetailRepository", "Lcom/woocommerce/android/ui/orders/details/OrderDetailRepository;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/tools/NetworkStatus;Lcom/woocommerce/android/ui/orders/details/OrderDetailRepository;)V", "<set-?>", "Lcom/woocommerce/android/ui/orders/tracking/AddOrderShipmentTrackingViewModel$ViewState;", "addOrderShipmentTrackingViewState", "getAddOrderShipmentTrackingViewState", "()Lcom/woocommerce/android/ui/orders/tracking/AddOrderShipmentTrackingViewModel$ViewState;", "setAddOrderShipmentTrackingViewState", "(Lcom/woocommerce/android/ui/orders/tracking/AddOrderShipmentTrackingViewModel$ViewState;)V", "addOrderShipmentTrackingViewState$delegate", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "addOrderShipmentTrackingViewStateData", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getAddOrderShipmentTrackingViewStateData", "()Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "currentSelectedDate", "", "getCurrentSelectedDate", "()Ljava/lang/String;", "navArgs", "Lcom/woocommerce/android/ui/orders/tracking/AddOrderShipmentTrackingFragmentArgs;", "getNavArgs", "()Lcom/woocommerce/android/ui/orders/tracking/AddOrderShipmentTrackingFragmentArgs;", "navArgs$delegate", "Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "onAddButtonTapped", "", "onBackButtonPressed", "", "onCarrierClicked", "onCarrierSelected", "carrier", "Lcom/woocommerce/android/ui/orders/tracking/Carrier;", "onCustomCarrierNameEntered", "name", "onDateChanged", "date", "onTrackingLinkEntered", "trackingLink", "onTrackingNumberEntered", "trackingNumber", "prepareTracksEventsDetails", "", "kotlin.jvm.PlatformType", "event", "Lorg/wordpress/android/fluxc/store/WCOrderStore$OnOrderChanged;", "SaveTrackingPrefsEvent", "ViewState", "WooCommerce_vanillaDebug"})
public final class AddOrderShipmentTrackingViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.tools.NetworkStatus networkStatus = null;
    private final com.woocommerce.android.ui.orders.details.OrderDetailRepository orderDetailRepository = null;
    private final com.woocommerce.android.viewmodel.NavArgsLazy navArgs$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.tracking.AddOrderShipmentTrackingViewModel.ViewState> addOrderShipmentTrackingViewStateData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate addOrderShipmentTrackingViewState$delegate = null;
    
    @javax.inject.Inject()
    public AddOrderShipmentTrackingViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.tools.NetworkStatus networkStatus, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.orders.details.OrderDetailRepository orderDetailRepository) {
        super(null);
    }
    
    private final com.woocommerce.android.ui.orders.tracking.AddOrderShipmentTrackingFragmentArgs getNavArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.tracking.AddOrderShipmentTrackingViewModel.ViewState> getAddOrderShipmentTrackingViewStateData() {
        return null;
    }
    
    private final com.woocommerce.android.ui.orders.tracking.AddOrderShipmentTrackingViewModel.ViewState getAddOrderShipmentTrackingViewState() {
        return null;
    }
    
    private final void setAddOrderShipmentTrackingViewState(com.woocommerce.android.ui.orders.tracking.AddOrderShipmentTrackingViewModel.ViewState p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrentSelectedDate() {
        return null;
    }
    
    public final void onCarrierSelected(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.orders.tracking.Carrier carrier) {
    }
    
    public final void onCustomCarrierNameEntered(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    public final void onTrackingNumberEntered(@org.jetbrains.annotations.NotNull()
    java.lang.String trackingNumber) {
    }
    
    public final void onTrackingLinkEntered(@org.jetbrains.annotations.NotNull()
    java.lang.String trackingLink) {
    }
    
    public final void onDateChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String date) {
    }
    
    public final void onCarrierClicked() {
    }
    
    public final void onAddButtonTapped() {
    }
    
    @kotlin.Suppress(names = {"ComplexCondition"})
    public final boolean onBackButtonPressed() {
        return false;
    }
    
    private final java.util.Map<java.lang.String, java.lang.String> prepareTracksEventsDetails(org.wordpress.android.fluxc.store.WCOrderStore.OnOrderChanged event) {
        return null;
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0007H\u00c6\u0003J\t\u0010 \u001a\u00020\u0007H\u00c6\u0003J\t\u0010!\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0013J\u0010\u0010$\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0013J\u0010\u0010%\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0013Jn\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\fH\u00c6\u0001\u00a2\u0006\u0002\u0010\'J\t\u0010(\u001a\u00020\fH\u00d6\u0001J\u0013\u0010)\u001a\u00020\u00032\b\u0010*\u001a\u0004\u0018\u00010+H\u00d6\u0003J\t\u0010,\u001a\u00020\fH\u00d6\u0001J\t\u0010-\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\fH\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\r\u001a\u0004\u0018\u00010\f\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0018R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\f\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001c\u0010\u0013\u00a8\u00063"}, d2 = {"Lcom/woocommerce/android/ui/orders/tracking/AddOrderShipmentTrackingViewModel$ViewState;", "Landroid/os/Parcelable;", "isSelectedProviderCustom", "", "carrier", "Lcom/woocommerce/android/ui/orders/tracking/Carrier;", "trackingNumber", "", "trackingLink", "date", "showLoadingProgress", "carrierError", "", "customCarrierNameError", "trackingNumberError", "(ZLcom/woocommerce/android/ui/orders/tracking/Carrier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getCarrier", "()Lcom/woocommerce/android/ui/orders/tracking/Carrier;", "getCarrierError", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCustomCarrierNameError", "getDate", "()Ljava/lang/String;", "()Z", "getShowLoadingProgress", "getTrackingLink", "getTrackingNumber", "getTrackingNumberError", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ZLcom/woocommerce/android/ui/orders/tracking/Carrier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/woocommerce/android/ui/orders/tracking/AddOrderShipmentTrackingViewModel$ViewState;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
    public static final class ViewState implements android.os.Parcelable {
        private final boolean isSelectedProviderCustom = false;
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.ui.orders.tracking.Carrier carrier = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String trackingNumber = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String trackingLink = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String date = null;
        private final boolean showLoadingProgress = false;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer carrierError = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer customCarrierNameError = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer trackingNumberError = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.tracking.AddOrderShipmentTrackingViewModel.ViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.tracking.AddOrderShipmentTrackingViewModel.ViewState copy(boolean isSelectedProviderCustom, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.tracking.Carrier carrier, @org.jetbrains.annotations.NotNull()
        java.lang.String trackingNumber, @org.jetbrains.annotations.NotNull()
        java.lang.String trackingLink, @org.jetbrains.annotations.NotNull()
        java.lang.String date, boolean showLoadingProgress, @org.jetbrains.annotations.Nullable()
        java.lang.Integer carrierError, @org.jetbrains.annotations.Nullable()
        java.lang.Integer customCarrierNameError, @org.jetbrains.annotations.Nullable()
        java.lang.Integer trackingNumberError) {
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
        
        public ViewState(boolean isSelectedProviderCustom, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.tracking.Carrier carrier, @org.jetbrains.annotations.NotNull()
        java.lang.String trackingNumber, @org.jetbrains.annotations.NotNull()
        java.lang.String trackingLink, @org.jetbrains.annotations.NotNull()
        java.lang.String date, boolean showLoadingProgress, @org.jetbrains.annotations.Nullable()
        java.lang.Integer carrierError, @org.jetbrains.annotations.Nullable()
        java.lang.Integer customCarrierNameError, @org.jetbrains.annotations.Nullable()
        java.lang.Integer trackingNumberError) {
            super();
        }
        
        public final boolean component1() {
            return false;
        }
        
        public final boolean isSelectedProviderCustom() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.tracking.Carrier component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.tracking.Carrier getCarrier() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTrackingNumber() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTrackingLink() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDate() {
            return null;
        }
        
        public final boolean component6() {
            return false;
        }
        
        public final boolean getShowLoadingProgress() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getCarrierError() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component8() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getCustomCarrierNameError() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component9() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getTrackingNumberError() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.tracking.AddOrderShipmentTrackingViewModel.ViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.orders.tracking.AddOrderShipmentTrackingViewModel.ViewState createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.orders.tracking.AddOrderShipmentTrackingViewModel.ViewState[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/orders/tracking/AddOrderShipmentTrackingViewModel$SaveTrackingPrefsEvent;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "carrier", "Lcom/woocommerce/android/ui/orders/tracking/Carrier;", "(Lcom/woocommerce/android/ui/orders/tracking/Carrier;)V", "getCarrier", "()Lcom/woocommerce/android/ui/orders/tracking/Carrier;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class SaveTrackingPrefsEvent extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.ui.orders.tracking.Carrier carrier = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.tracking.AddOrderShipmentTrackingViewModel.SaveTrackingPrefsEvent copy(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.tracking.Carrier carrier) {
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
        
        public SaveTrackingPrefsEvent(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.tracking.Carrier carrier) {
            super(false);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.tracking.Carrier component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.tracking.Carrier getCarrier() {
            return null;
        }
    }
}