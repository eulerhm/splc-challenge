package com.woocommerce.android.ui.orders.fulfill;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u0000 M2\u00020\u0001:\u0002MNB7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u0010\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u0014H\u0017J\u0010\u0010;\u001a\u0002092\u0006\u0010 \u001a\u00020\u001fH\u0012J\u0010\u0010<\u001a\u0002092\u0006\u0010 \u001a\u00020\u001fH\u0012J\b\u0010=\u001a\u000209H\u0012J\b\u0010>\u001a\u00020?H\u0016J\b\u0010@\u001a\u000209H\u0016J\b\u0010A\u001a\u000209H\u0016J\u0010\u0010B\u001a\u0002092\u0006\u0010C\u001a\u00020\u0017H\u0016J\u0010\u0010D\u001a\u0002092\u0006\u0010:\u001a\u00020\u0014H\u0012J\b\u0010E\u001a\u000209H\u0016J\u0010\u0010F\u001a\u0002092\u0006\u0010:\u001a\u00020\u0014H\u0016J$\u0010G\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0012\f\u0012\n I*\u0004\u0018\u00010\u00170\u00170H2\u0006\u0010J\u001a\u00020KH\u0012J\u0006\u0010L\u001a\u000209R\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00110\u0010X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0092\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0018\u001a\u00020\u00198RX\u0092\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R$\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001f8V@VX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R \u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110&X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u000e\u0010\n\u001a\u00020\u000bX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0092\u0004\u00a2\u0006\u0002\n\u0000R \u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00110&X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010(R+\u0010-\u001a\u00020,2\u0006\u0010+\u001a\u00020,8R@RX\u0092\u008e\u0002\u00a2\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0017\u00104\u001a\b\u0012\u0004\u0012\u00020,05\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u00107\u00a8\u0006O"}, d2 = {"Lcom/woocommerce/android/ui/orders/fulfill/OrderFulfillViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "appPrefs", "Lcom/woocommerce/android/AppPrefs;", "networkStatus", "Lcom/woocommerce/android/tools/NetworkStatus;", "resourceProvider", "Lcom/woocommerce/android/viewmodel/ResourceProvider;", "repository", "Lcom/woocommerce/android/ui/orders/details/OrderDetailRepository;", "analyticsTrackerWrapper", "Lcom/woocommerce/android/analytics/AnalyticsTrackerWrapper;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/AppPrefs;Lcom/woocommerce/android/tools/NetworkStatus;Lcom/woocommerce/android/viewmodel/ResourceProvider;Lcom/woocommerce/android/ui/orders/details/OrderDetailRepository;Lcom/woocommerce/android/analytics/AnalyticsTrackerWrapper;)V", "_productList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/woocommerce/android/model/Order$Item;", "_shipmentTrackings", "Lcom/woocommerce/android/model/OrderShipmentTracking;", "deletedOrderShipmentTrackingSet", "", "", "navArgs", "Lcom/woocommerce/android/ui/orders/fulfill/OrderFulfillFragmentArgs;", "getNavArgs", "()Lcom/woocommerce/android/ui/orders/fulfill/OrderFulfillFragmentArgs;", "navArgs$delegate", "Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "value", "Lcom/woocommerce/android/model/Order;", "order", "getOrder", "()Lcom/woocommerce/android/model/Order;", "setOrder", "(Lcom/woocommerce/android/model/Order;)V", "productList", "Landroidx/lifecycle/LiveData;", "getProductList", "()Landroidx/lifecycle/LiveData;", "shipmentTrackings", "getShipmentTrackings", "<set-?>", "Lcom/woocommerce/android/ui/orders/fulfill/OrderFulfillViewModel$ViewState;", "viewState", "getViewState", "()Lcom/woocommerce/android/ui/orders/fulfill/OrderFulfillViewModel$ViewState;", "setViewState", "(Lcom/woocommerce/android/ui/orders/fulfill/OrderFulfillViewModel$ViewState;)V", "viewState$delegate", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "viewStateData", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getViewStateData", "()Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "deleteOrderShipmentTracking", "", "shipmentTracking", "displayOrderDetails", "displayOrderProducts", "displayShipmentTrackings", "hasVirtualProductsOnly", "", "onAddShipmentTrackingClicked", "onBackButtonClicked", "onDeleteShipmentTrackingClicked", "trackingNumber", "onDeleteShipmentTrackingReverted", "onMarkOrderCompleteButtonClicked", "onNewShipmentTrackingAdded", "prepareTracksEventsDetails", "", "kotlin.jvm.PlatformType", "event", "Lorg/wordpress/android/fluxc/store/WCOrderStore$OnOrderChanged;", "start", "Companion", "ViewState", "WooCommerce_vanillaDebug"})
@com.woocommerce.android.annotations.OpenClassOnDebug()
public class OrderFulfillViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.AppPrefs appPrefs = null;
    private final com.woocommerce.android.tools.NetworkStatus networkStatus = null;
    private final com.woocommerce.android.viewmodel.ResourceProvider resourceProvider = null;
    private final com.woocommerce.android.ui.orders.details.OrderDetailRepository repository = null;
    private final com.woocommerce.android.analytics.AnalyticsTrackerWrapper analyticsTrackerWrapper = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.orders.fulfill.OrderFulfillViewModel.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_ORDER_FULFILL_RESULT = "key_order_fulfill_result";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_REFRESH_SHIPMENT_TRACKING_RESULT = "key_refresh_shipment_tracking_result";
    private final com.woocommerce.android.viewmodel.NavArgsLazy navArgs$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.fulfill.OrderFulfillViewModel.ViewState> viewStateData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate viewState$delegate = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.woocommerce.android.model.Order.Item>> _productList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.model.Order.Item>> productList = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.woocommerce.android.model.OrderShipmentTracking>> _shipmentTrackings = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.model.OrderShipmentTracking>> shipmentTrackings = null;
    private java.util.Set<java.lang.String> deletedOrderShipmentTrackingSet;
    
    @javax.inject.Inject()
    public OrderFulfillViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.AppPrefs appPrefs, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.tools.NetworkStatus networkStatus, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.viewmodel.ResourceProvider resourceProvider, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.orders.details.OrderDetailRepository repository, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.analytics.AnalyticsTrackerWrapper analyticsTrackerWrapper) {
        super(null);
    }
    
    private com.woocommerce.android.ui.orders.fulfill.OrderFulfillFragmentArgs getNavArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.fulfill.OrderFulfillViewModel.ViewState> getViewStateData() {
        return null;
    }
    
    private com.woocommerce.android.ui.orders.fulfill.OrderFulfillViewModel.ViewState getViewState() {
        return null;
    }
    
    private void setViewState(com.woocommerce.android.ui.orders.fulfill.OrderFulfillViewModel.ViewState p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.model.Order.Item>> getProductList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.model.OrderShipmentTracking>> getShipmentTrackings() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.woocommerce.android.model.Order getOrder() {
        return null;
    }
    
    public void setOrder(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.Order value) {
    }
    
    public final void start() {
    }
    
    private void displayOrderDetails(com.woocommerce.android.model.Order order) {
    }
    
    private void displayOrderProducts(com.woocommerce.android.model.Order order) {
    }
    
    private void displayShipmentTrackings() {
    }
    
    public boolean hasVirtualProductsOnly() {
        return false;
    }
    
    public void onMarkOrderCompleteButtonClicked() {
    }
    
    public void onAddShipmentTrackingClicked() {
    }
    
    public void onNewShipmentTrackingAdded(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.OrderShipmentTracking shipmentTracking) {
    }
    
    public void onDeleteShipmentTrackingClicked(@org.jetbrains.annotations.NotNull()
    java.lang.String trackingNumber) {
    }
    
    private void onDeleteShipmentTrackingReverted(com.woocommerce.android.model.OrderShipmentTracking shipmentTracking) {
    }
    
    @androidx.annotation.VisibleForTesting(otherwise = androidx.annotation.VisibleForTesting.PRIVATE)
    public void deleteOrderShipmentTracking(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.OrderShipmentTracking shipmentTracking) {
    }
    
    public void onBackButtonClicked() {
    }
    
    private java.util.Map<java.lang.String, java.lang.String> prepareTracksEventsDetails(org.wordpress.android.fluxc.store.WCOrderStore.OnOrderChanged event) {
        return null;
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0015\u001a\u00020\u0007H\u00c6\u0003J<\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0017J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0019H\u00d6\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0006\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006$"}, d2 = {"Lcom/woocommerce/android/ui/orders/fulfill/OrderFulfillViewModel$ViewState;", "Landroid/os/Parcelable;", "order", "Lcom/woocommerce/android/model/Order;", "toolbarTitle", "", "isShipmentTrackingAvailable", "", "shouldRefreshShipmentTracking", "(Lcom/woocommerce/android/model/Order;Ljava/lang/String;Ljava/lang/Boolean;Z)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOrder", "()Lcom/woocommerce/android/model/Order;", "getShouldRefreshShipmentTracking", "()Z", "getToolbarTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "(Lcom/woocommerce/android/model/Order;Ljava/lang/String;Ljava/lang/Boolean;Z)Lcom/woocommerce/android/ui/orders/fulfill/OrderFulfillViewModel$ViewState;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
    public static final class ViewState implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable()
        private final com.woocommerce.android.model.Order order = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String toolbarTitle = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isShipmentTrackingAvailable = null;
        private final boolean shouldRefreshShipmentTracking = false;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.fulfill.OrderFulfillViewModel.ViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.fulfill.OrderFulfillViewModel.ViewState copy(@org.jetbrains.annotations.Nullable()
        com.woocommerce.android.model.Order order, @org.jetbrains.annotations.Nullable()
        java.lang.String toolbarTitle, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isShipmentTrackingAvailable, boolean shouldRefreshShipmentTracking) {
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
        com.woocommerce.android.model.Order order, @org.jetbrains.annotations.Nullable()
        java.lang.String toolbarTitle, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isShipmentTrackingAvailable, boolean shouldRefreshShipmentTracking) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.woocommerce.android.model.Order component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.woocommerce.android.model.Order getOrder() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getToolbarTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isShipmentTrackingAvailable() {
            return null;
        }
        
        public final boolean component4() {
            return false;
        }
        
        public final boolean getShouldRefreshShipmentTracking() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.fulfill.OrderFulfillViewModel.ViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.orders.fulfill.OrderFulfillViewModel.ViewState createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.orders.fulfill.OrderFulfillViewModel.ViewState[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/woocommerce/android/ui/orders/fulfill/OrderFulfillViewModel$Companion;", "", "()V", "KEY_ORDER_FULFILL_RESULT", "", "KEY_REFRESH_SHIPMENT_TRACKING_RESULT", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}