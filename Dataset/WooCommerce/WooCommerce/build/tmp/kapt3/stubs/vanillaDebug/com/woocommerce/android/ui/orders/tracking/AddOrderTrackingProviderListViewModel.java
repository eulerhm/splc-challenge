package com.woocommerce.android.ui.orders.tracking;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001-B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\'\u001a\u00020(H\u0002J\u000e\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u0019J\u000e\u0010+\u001a\u00020(2\u0006\u0010,\u001a\u00020\fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001b0$\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&\u00a8\u0006."}, d2 = {"Lcom/woocommerce/android/ui/orders/tracking/AddOrderTrackingProviderListViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "shipmentProvidersRepository", "Lcom/woocommerce/android/ui/orders/tracking/OrderShipmentProvidersRepository;", "orderDetailRepository", "Lcom/woocommerce/android/ui/orders/details/OrderDetailRepository;", "resourceProvider", "Lcom/woocommerce/android/viewmodel/ResourceProvider;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/ui/orders/tracking/OrderShipmentProvidersRepository;Lcom/woocommerce/android/ui/orders/details/OrderDetailRepository;Lcom/woocommerce/android/viewmodel/ResourceProvider;)V", "countryCode", "", "getCountryCode", "()Ljava/lang/String;", "currentSelectedProvider", "getCurrentSelectedProvider", "navArgs", "Lcom/woocommerce/android/ui/orders/tracking/AddOrderTrackingProviderListFragmentArgs;", "getNavArgs", "()Lcom/woocommerce/android/ui/orders/tracking/AddOrderTrackingProviderListFragmentArgs;", "navArgs$delegate", "Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "providersList", "", "Lcom/woocommerce/android/model/OrderShipmentProvider;", "<set-?>", "Lcom/woocommerce/android/ui/orders/tracking/AddOrderTrackingProviderListViewModel$ViewState;", "trackingProviderListViewState", "getTrackingProviderListViewState", "()Lcom/woocommerce/android/ui/orders/tracking/AddOrderTrackingProviderListViewModel$ViewState;", "setTrackingProviderListViewState", "(Lcom/woocommerce/android/ui/orders/tracking/AddOrderTrackingProviderListViewModel$ViewState;)V", "trackingProviderListViewState$delegate", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "trackingProviderListViewStateData", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getTrackingProviderListViewStateData", "()Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "fetchProviders", "", "onProviderSelected", "provider", "onSearchQueryChanged", "query", "ViewState", "WooCommerce_vanillaDebug"})
public final class AddOrderTrackingProviderListViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.ui.orders.tracking.OrderShipmentProvidersRepository shipmentProvidersRepository = null;
    private final com.woocommerce.android.ui.orders.details.OrderDetailRepository orderDetailRepository = null;
    private final com.woocommerce.android.viewmodel.ResourceProvider resourceProvider = null;
    private final com.woocommerce.android.viewmodel.NavArgsLazy navArgs$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.tracking.AddOrderTrackingProviderListViewModel.ViewState> trackingProviderListViewStateData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate trackingProviderListViewState$delegate = null;
    private java.util.List<com.woocommerce.android.model.OrderShipmentProvider> providersList;
    
    @javax.inject.Inject()
    public AddOrderTrackingProviderListViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.orders.tracking.OrderShipmentProvidersRepository shipmentProvidersRepository, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.orders.details.OrderDetailRepository orderDetailRepository, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.viewmodel.ResourceProvider resourceProvider) {
        super(null);
    }
    
    private final com.woocommerce.android.ui.orders.tracking.AddOrderTrackingProviderListFragmentArgs getNavArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.tracking.AddOrderTrackingProviderListViewModel.ViewState> getTrackingProviderListViewStateData() {
        return null;
    }
    
    private final com.woocommerce.android.ui.orders.tracking.AddOrderTrackingProviderListViewModel.ViewState getTrackingProviderListViewState() {
        return null;
    }
    
    private final void setTrackingProviderListViewState(com.woocommerce.android.ui.orders.tracking.AddOrderTrackingProviderListViewModel.ViewState p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrentSelectedProvider() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCountryCode() {
        return null;
    }
    
    private final void fetchProviders() {
    }
    
    public final void onSearchQueryChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    public final void onProviderSelected(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.OrderShipmentProvider provider) {
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\bH\u00c6\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\bH\u00d6\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0015H\u00d6\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006 "}, d2 = {"Lcom/woocommerce/android/ui/orders/tracking/AddOrderTrackingProviderListViewModel$ViewState;", "Landroid/os/Parcelable;", "showSkeleton", "", "providersList", "", "Lcom/woocommerce/android/model/OrderShipmentProvider;", "query", "", "(ZLjava/util/List;Ljava/lang/String;)V", "getProvidersList", "()Ljava/util/List;", "getQuery", "()Ljava/lang/String;", "getShowSkeleton", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
    public static final class ViewState implements android.os.Parcelable {
        private final boolean showSkeleton = false;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.woocommerce.android.model.OrderShipmentProvider> providersList = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String query = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.tracking.AddOrderTrackingProviderListViewModel.ViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.tracking.AddOrderTrackingProviderListViewModel.ViewState copy(boolean showSkeleton, @org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.model.OrderShipmentProvider> providersList, @org.jetbrains.annotations.NotNull()
        java.lang.String query) {
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
        
        public ViewState(boolean showSkeleton, @org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.model.OrderShipmentProvider> providersList, @org.jetbrains.annotations.NotNull()
        java.lang.String query) {
            super();
        }
        
        public final boolean component1() {
            return false;
        }
        
        public final boolean getShowSkeleton() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.model.OrderShipmentProvider> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.model.OrderShipmentProvider> getProvidersList() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getQuery() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.tracking.AddOrderTrackingProviderListViewModel.ViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.orders.tracking.AddOrderTrackingProviderListViewModel.ViewState createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.orders.tracking.AddOrderTrackingProviderListViewModel.ViewState[] newArray(int size) {
                return null;
            }
        }
    }
}