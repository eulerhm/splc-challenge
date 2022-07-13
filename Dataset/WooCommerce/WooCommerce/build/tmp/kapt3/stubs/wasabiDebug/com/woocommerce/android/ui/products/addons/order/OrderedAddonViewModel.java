package com.woocommerce.android.ui.products.addons.order;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 J2\u00020\u0001:\u0003JKLB\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u001f\u0010(\u001a\u00020)2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010+J \u0010,\u001a\u0004\u0018\u00010\u000e2\u0006\u0010-\u001a\u00020.2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002J\u0011\u00100\u001a\u00020)H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00101J1\u00102\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u000204H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00107J*\u00108\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020.0\rH\u0002J\u0018\u0010;\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010=\u001a\u00020.H\u0002J\u0006\u0010>\u001a\u00020)J\u0006\u0010?\u001a\u00020)J\u0016\u0010@\u001a\b\u0012\u0004\u0012\u00020A0\r2\u0006\u0010=\u001a\u00020.H\u0002J\u001e\u0010B\u001a\u00020)2\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u000204J\u0016\u0010C\u001a\u00020)2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002J\u0010\u0010D\u001a\u00020)2\u0006\u0010E\u001a\u00020\u0010H\u0002J\u0014\u0010F\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010=\u001a\u00020.H\u0002J\u0016\u0010G\u001a\u0004\u0018\u00010\u000e*\u00020\u000e2\u0006\u0010H\u001a\u00020AH\u0002J\u0014\u0010I\u001a\u00020A*\u00020A2\u0006\u0010=\u001a\u00020.H\u0002R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00148BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR+\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001c8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001c0%\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006M"}, d2 = {"Lcom/woocommerce/android/ui/products/addons/order/OrderedAddonViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "dispatchers", "Lcom/woocommerce/android/util/CoroutineDispatchers;", "addonsRepository", "Lcom/woocommerce/android/ui/products/addons/AddonRepository;", "parameterRepository", "Lcom/woocommerce/android/ui/products/ParameterRepository;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/util/CoroutineDispatchers;Lcom/woocommerce/android/ui/products/addons/AddonRepository;Lcom/woocommerce/android/ui/products/ParameterRepository;)V", "_orderedAddons", "Landroidx/lifecycle/MutableLiveData;", "", "Lorg/wordpress/android/fluxc/domain/Addon;", "currencyCode", "", "getCurrencyCode", "()Ljava/lang/String;", "currentFeedbackSettings", "Lcom/woocommerce/android/model/FeatureFeedbackSettings;", "getCurrentFeedbackSettings", "()Lcom/woocommerce/android/model/FeatureFeedbackSettings;", "orderedAddonsData", "Landroidx/lifecycle/LiveData;", "getOrderedAddonsData", "()Landroidx/lifecycle/LiveData;", "<set-?>", "Lcom/woocommerce/android/ui/products/addons/order/OrderedAddonViewModel$ViewState;", "viewState", "getViewState", "()Lcom/woocommerce/android/ui/products/addons/order/OrderedAddonViewModel$ViewState;", "setViewState", "(Lcom/woocommerce/android/ui/products/addons/order/OrderedAddonViewModel$ViewState;)V", "viewState$delegate", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "viewStateLiveData", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getViewStateLiveData", "()Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "dispatchResult", "", "result", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findMatchingAddon", "matchingTo", "Lcom/woocommerce/android/model/Order$Item$Attribute;", "addons", "handleFailure", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadOrderAddonsData", "orderID", "", "orderItemID", "productID", "(JJJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mapAddonsFromOrderAttributes", "productAddons", "orderAttributes", "mergeOrderAttributeWithAddon", "addon", "attribute", "onDismissWIPCardClicked", "onGiveFeedbackClicked", "prepareAddonOptionBasedOnAttribute", "Lorg/wordpress/android/fluxc/domain/Addon$HasOptions$Option;", "start", "track", "trackFeedback", "feedbackAction", "asAddonWithSingleSelectedOption", "asSelectableAddon", "selectedOption", "handleOptionPriceType", "Companion", "ShowSurveyView", "ViewState", "WooCommerce_wasabiDebug"})
public final class OrderedAddonViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.util.CoroutineDispatchers dispatchers = null;
    private final com.woocommerce.android.ui.products.addons.AddonRepository addonsRepository = null;
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.products.addons.order.OrderedAddonViewModel.Companion Companion = null;
    private static final java.lang.String KEY_PRODUCT_PARAMETERS = "key_product_parameters";
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.products.addons.order.OrderedAddonViewModel.ViewState> viewStateLiveData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate viewState$delegate = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<org.wordpress.android.fluxc.domain.Addon>> _orderedAddons = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<org.wordpress.android.fluxc.domain.Addon>> orderedAddonsData = null;
    
    /**
     * Provides the currencyCode for views who requires display prices
     */
    @org.jetbrains.annotations.NotNull
    private final java.lang.String currencyCode = null;
    
    @javax.inject.Inject
    public OrderedAddonViewModel(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.CoroutineDispatchers dispatchers, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.addons.AddonRepository addonsRepository, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.ParameterRepository parameterRepository) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.products.addons.order.OrderedAddonViewModel.ViewState> getViewStateLiveData() {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.addons.order.OrderedAddonViewModel.ViewState getViewState() {
        return null;
    }
    
    private final void setViewState(com.woocommerce.android.ui.products.addons.order.OrderedAddonViewModel.ViewState p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<org.wordpress.android.fluxc.domain.Addon>> getOrderedAddonsData() {
        return null;
    }
    
    private final com.woocommerce.android.model.FeatureFeedbackSettings getCurrentFeedbackSettings() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCurrencyCode() {
        return null;
    }
    
    public final void start(long orderID, long orderItemID, long productID) {
    }
    
    public final void onGiveFeedbackClicked() {
    }
    
    public final void onDismissWIPCardClicked() {
    }
    
    private final java.lang.Object loadOrderAddonsData(long orderID, long orderItemID, long productID, kotlin.coroutines.Continuation<? super java.util.List<? extends org.wordpress.android.fluxc.domain.Addon>> continuation) {
        return null;
    }
    
    private final java.util.List<org.wordpress.android.fluxc.domain.Addon> mapAddonsFromOrderAttributes(java.util.List<? extends org.wordpress.android.fluxc.domain.Addon> productAddons, java.util.List<com.woocommerce.android.model.Order.Item.Attribute> orderAttributes) {
        return null;
    }
    
    private final org.wordpress.android.fluxc.domain.Addon findMatchingAddon(com.woocommerce.android.model.Order.Item.Attribute matchingTo, java.util.List<? extends org.wordpress.android.fluxc.domain.Addon> addons) {
        return null;
    }
    
    private final org.wordpress.android.fluxc.domain.Addon asAddonWithSingleSelectedOption(org.wordpress.android.fluxc.domain.Addon $this$asAddonWithSingleSelectedOption, com.woocommerce.android.model.Order.Item.Attribute attribute) {
        return null;
    }
    
    /**
     * When displaying the price of an Ordered addon with the PercentageBased price
     * we don't want to display the percentage itself, but the price applied through the percentage.
     *
     * In this method we verify if that's the scenario and replace the percentage value with the price
     * defined by the Order Attribute, if it's not the case, the Addon is returned untouched.
     */
    private final org.wordpress.android.fluxc.domain.Addon.HasOptions.Option handleOptionPriceType(org.wordpress.android.fluxc.domain.Addon.HasOptions.Option $this$handleOptionPriceType, com.woocommerce.android.model.Order.Item.Attribute attribute) {
        return null;
    }
    
    private final org.wordpress.android.fluxc.domain.Addon asSelectableAddon(org.wordpress.android.fluxc.domain.Addon $this$asSelectableAddon, org.wordpress.android.fluxc.domain.Addon.HasOptions.Option selectedOption) {
        return null;
    }
    
    /**
     * If it isn't possible to find the respective option
     * through [Order.Item.Attribute.value] matching we will
     * have to merge the [Addon] data with the Attribute in order
     * to display the Ordered addon correctly, which is exactly
     * what this method does.
     *
     * Also, in this scenario there's no way to infer the image
     * information since it's something contained inside the options only
     */
    private final org.wordpress.android.fluxc.domain.Addon mergeOrderAttributeWithAddon(org.wordpress.android.fluxc.domain.Addon addon, com.woocommerce.android.model.Order.Item.Attribute attribute) {
        return null;
    }
    
    private final java.util.List<org.wordpress.android.fluxc.domain.Addon.HasOptions.Option> prepareAddonOptionBasedOnAttribute(com.woocommerce.android.model.Order.Item.Attribute attribute) {
        return null;
    }
    
    private final java.lang.Object dispatchResult(java.util.List<? extends org.wordpress.android.fluxc.domain.Addon> result, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object handleFailure(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final void trackFeedback(java.lang.String feedbackAction) {
    }
    
    private final void track(java.util.List<? extends org.wordpress.android.fluxc.domain.Addon> addons) {
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\bJ\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J.\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007\u00a8\u0006\u001d"}, d2 = {"Lcom/woocommerce/android/ui/products/addons/order/OrderedAddonViewModel$ViewState;", "Landroid/os/Parcelable;", "isSkeletonShown", "", "isLoadingFailure", "shouldDisplayFeedbackCard", "(Ljava/lang/Boolean;ZZ)V", "()Z", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getShouldDisplayFeedbackCard", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;ZZ)Lcom/woocommerce/android/ui/products/addons/order/OrderedAddonViewModel$ViewState;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class ViewState implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean isSkeletonShown = null;
        private final boolean isLoadingFailure = false;
        private final boolean shouldDisplayFeedbackCard = false;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.products.addons.order.OrderedAddonViewModel.ViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.addons.order.OrderedAddonViewModel.ViewState copy(@org.jetbrains.annotations.Nullable
        java.lang.Boolean isSkeletonShown, boolean isLoadingFailure, boolean shouldDisplayFeedbackCard) {
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
        java.lang.Boolean isSkeletonShown, boolean isLoadingFailure, boolean shouldDisplayFeedbackCard) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean isSkeletonShown() {
            return null;
        }
        
        public final boolean component2() {
            return false;
        }
        
        public final boolean isLoadingFailure() {
            return false;
        }
        
        public final boolean component3() {
            return false;
        }
        
        public final boolean getShouldDisplayFeedbackCard() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.products.addons.order.OrderedAddonViewModel.ViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.products.addons.order.OrderedAddonViewModel.ViewState createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.products.addons.order.OrderedAddonViewModel.ViewState[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/products/addons/order/OrderedAddonViewModel$ShowSurveyView;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "()V", "WooCommerce_wasabiDebug"})
    public static final class ShowSurveyView extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        @org.jetbrains.annotations.NotNull
        public static final com.woocommerce.android.ui.products.addons.order.OrderedAddonViewModel.ShowSurveyView INSTANCE = null;
        
        private ShowSurveyView() {
            super(false);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/products/addons/order/OrderedAddonViewModel$Companion;", "", "()V", "KEY_PRODUCT_PARAMETERS", "", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}