package com.woocommerce.android.ui.orders.shippinglabels.creation;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 :2\u00020\u0001:\u0002:;B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020(0\rH\u0002J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002J\u0011\u0010-\u001a\u00020.H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010/J\b\u00100\u001a\u00020.H\u0002J\u0006\u00101\u001a\u00020.J\u0006\u00102\u001a\u00020.J\u000e\u00103\u001a\u00020.2\u0006\u00104\u001a\u000205J\u0016\u00106\u001a\u00020.2\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002J\u000e\u00107\u001a\u000208*\u0004\u0018\u000109H\u0002R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R+\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001a8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001a0#\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006<"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCarrierRatesViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "shippingLabelRepository", "Lcom/woocommerce/android/ui/orders/shippinglabels/ShippingLabelRepository;", "resourceProvider", "Lcom/woocommerce/android/viewmodel/ResourceProvider;", "currencyFormatter", "Lcom/woocommerce/android/util/CurrencyFormatter;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/ui/orders/shippinglabels/ShippingLabelRepository;Lcom/woocommerce/android/viewmodel/ResourceProvider;Lcom/woocommerce/android/util/CurrencyFormatter;)V", "_shippingRates", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCarrierRatesAdapter$PackageRateListItem;", "arguments", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCarrierRatesFragmentArgs;", "getArguments", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCarrierRatesFragmentArgs;", "arguments$delegate", "Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "shippingRates", "Landroidx/lifecycle/LiveData;", "getShippingRates", "()Landroidx/lifecycle/LiveData;", "<set-?>", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCarrierRatesViewModel$ViewState;", "viewState", "getViewState", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCarrierRatesViewModel$ViewState;", "setViewState", "(Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCarrierRatesViewModel$ViewState;)V", "viewState$delegate", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "viewStateData", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getViewStateData", "()Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "generateRateModels", "packageRates", "Lorg/wordpress/android/fluxc/model/shippinglabels/WCShippingRatesResult$ShippingPackage;", "getCarrier", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCarrierRatesAdapter$ShippingRateItem$ShippingCarrier;", "it", "Lorg/wordpress/android/fluxc/network/rest/wpcom/wc/shippinglabels/ShippingLabelRestClient$ShippingRatesApiResponse$ShippingOption$Rate;", "loadRates", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadShippingRates", "onDoneButtonClicked", "onExit", "onShippingRateSelected", "rate", "Lcom/woocommerce/android/model/ShippingRate;", "updateRates", "format", "", "Ljava/math/BigDecimal;", "Companion", "ViewState", "WooCommerce_wasabiDebug"})
public final class ShippingCarrierRatesViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.ui.orders.shippinglabels.ShippingLabelRepository shippingLabelRepository = null;
    private final com.woocommerce.android.viewmodel.ResourceProvider resourceProvider = null;
    private final com.woocommerce.android.util.CurrencyFormatter currencyFormatter = null;
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCarrierRatesViewModel.Companion Companion = null;
    private static final java.lang.String DEFAULT_RATE_OPTION = "default";
    private static final java.lang.String SIGNATURE_RATE_OPTION = "signature_required";
    private static final java.lang.String ADULT_SIGNATURE_RATE_OPTION = "adult_signature_required";
    private static final java.lang.String CARRIER_USPS_KEY = "usps";
    private static final java.lang.String CARRIER_UPS_KEY = "ups";
    private static final java.lang.String CARRIER_FEDEX_KEY = "fedex";
    private static final java.lang.String CARRIER_DHL_EXPRESS_KEY = "dhlexpress";
    private static final java.lang.String CARRIER_DHL_ECOMMERCE_KEY = "dhlecommerce";
    private static final java.lang.String CARRIER_DHL_ECOMMERCE_ASIA_KEY = "dhlecommerceasia";
    private final com.woocommerce.android.viewmodel.NavArgsLazy arguments$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCarrierRatesViewModel.ViewState> viewStateData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate viewState$delegate = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCarrierRatesAdapter.PackageRateListItem>> _shippingRates = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCarrierRatesAdapter.PackageRateListItem>> shippingRates = null;
    
    @javax.inject.Inject
    public ShippingCarrierRatesViewModel(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.orders.shippinglabels.ShippingLabelRepository shippingLabelRepository, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.viewmodel.ResourceProvider resourceProvider, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.CurrencyFormatter currencyFormatter) {
        super(null);
    }
    
    private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCarrierRatesFragmentArgs getArguments() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCarrierRatesViewModel.ViewState> getViewStateData() {
        return null;
    }
    
    private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCarrierRatesViewModel.ViewState getViewState() {
        return null;
    }
    
    private final void setViewState(com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCarrierRatesViewModel.ViewState p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCarrierRatesAdapter.PackageRateListItem>> getShippingRates() {
        return null;
    }
    
    private final void loadShippingRates() {
    }
    
    private final java.lang.Object loadRates(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    private final java.util.List<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCarrierRatesAdapter.PackageRateListItem> generateRateModels(java.util.List<org.wordpress.android.fluxc.model.shippinglabels.WCShippingRatesResult.ShippingPackage> packageRates) {
        return null;
    }
    
    private final java.lang.String format(java.math.BigDecimal $this$format) {
        return null;
    }
    
    private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCarrierRatesAdapter.ShippingRateItem.ShippingCarrier getCarrier(org.wordpress.android.fluxc.network.rest.wpcom.wc.shippinglabels.ShippingLabelRestClient.ShippingRatesApiResponse.ShippingOption.Rate it) {
        return null;
    }
    
    public final void onShippingRateSelected(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.ShippingRate rate) {
    }
    
    private final void updateRates(java.util.List<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCarrierRatesAdapter.PackageRateListItem> packageRates) {
    }
    
    public final void onDoneButtonClicked() {
    }
    
    public final void onExit() {
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\bJ\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J3\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u00c6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0012H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000b\u00a8\u0006\u001d"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCarrierRatesViewModel$ViewState;", "Landroid/os/Parcelable;", "bannerMessage", "", "isSkeletonVisible", "", "isEmptyViewVisible", "isDoneButtonVisible", "(Ljava/lang/String;ZZZ)V", "getBannerMessage", "()Ljava/lang/String;", "()Z", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class ViewState implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable
        private final java.lang.String bannerMessage = null;
        private final boolean isSkeletonVisible = false;
        private final boolean isEmptyViewVisible = false;
        private final boolean isDoneButtonVisible = false;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCarrierRatesViewModel.ViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCarrierRatesViewModel.ViewState copy(@org.jetbrains.annotations.Nullable
        java.lang.String bannerMessage, boolean isSkeletonVisible, boolean isEmptyViewVisible, boolean isDoneButtonVisible) {
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
        java.lang.String bannerMessage, boolean isSkeletonVisible, boolean isEmptyViewVisible, boolean isDoneButtonVisible) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getBannerMessage() {
            return null;
        }
        
        public final boolean component2() {
            return false;
        }
        
        public final boolean isSkeletonVisible() {
            return false;
        }
        
        public final boolean component3() {
            return false;
        }
        
        public final boolean isEmptyViewVisible() {
            return false;
        }
        
        public final boolean component4() {
            return false;
        }
        
        public final boolean isDoneButtonVisible() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCarrierRatesViewModel.ViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCarrierRatesViewModel.ViewState createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCarrierRatesViewModel.ViewState[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCarrierRatesViewModel$Companion;", "", "()V", "ADULT_SIGNATURE_RATE_OPTION", "", "CARRIER_DHL_ECOMMERCE_ASIA_KEY", "CARRIER_DHL_ECOMMERCE_KEY", "CARRIER_DHL_EXPRESS_KEY", "CARRIER_FEDEX_KEY", "CARRIER_UPS_KEY", "CARRIER_USPS_KEY", "DEFAULT_RATE_OPTION", "SIGNATURE_RATE_OPTION", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}