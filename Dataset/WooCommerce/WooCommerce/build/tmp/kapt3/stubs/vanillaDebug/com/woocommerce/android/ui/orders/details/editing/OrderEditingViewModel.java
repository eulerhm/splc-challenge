package com.woocommerce.android.ui.orders.details.editing;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0003BCDB/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010&\u001a\u00020\'H\u0002J\u000e\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\'J1\u0010+\u001a\u00020\'2\u001e\b\u0004\u0010,\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0.\u0012\u0006\u0012\u0004\u0018\u00010/0-H\u0082\b\u00f8\u0001\u0000\u00a2\u0006\u0002\u00100J\u001f\u00101\u001a\b\u0012\u0004\u0012\u000203022\u0006\u00104\u001a\u000205H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00106J\u0006\u00107\u001a\u00020)J\u000e\u00108\u001a\u00020\'2\u0006\u00109\u001a\u000205J\u000e\u0010:\u001a\u00020\'2\u0006\u0010;\u001a\u00020<J\u000e\u0010=\u001a\u00020\'2\u0006\u0010>\u001a\u000205J#\u0010?\u001a\u00020)*\b\u0012\u0004\u0012\u000203022\u0006\u0010@\u001a\u00020<H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010AR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001a8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001a0#\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006E"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/editing/OrderEditingViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "dispatchers", "Lcom/woocommerce/android/util/CoroutineDispatchers;", "orderDetailRepository", "Lcom/woocommerce/android/ui/orders/details/OrderDetailRepository;", "orderEditingRepository", "Lcom/woocommerce/android/ui/orders/details/editing/OrderEditingRepository;", "networkStatus", "Lcom/woocommerce/android/tools/NetworkStatus;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/util/CoroutineDispatchers;Lcom/woocommerce/android/ui/orders/details/OrderDetailRepository;Lcom/woocommerce/android/ui/orders/details/editing/OrderEditingRepository;Lcom/woocommerce/android/tools/NetworkStatus;)V", "navArgs", "Lcom/woocommerce/android/ui/orders/details/OrderDetailFragmentArgs;", "getNavArgs", "()Lcom/woocommerce/android/ui/orders/details/OrderDetailFragmentArgs;", "navArgs$delegate", "Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "order", "Lcom/woocommerce/android/model/Order;", "getOrder", "()Lcom/woocommerce/android/model/Order;", "setOrder", "(Lcom/woocommerce/android/model/Order;)V", "<set-?>", "Lcom/woocommerce/android/ui/orders/details/editing/OrderEditingViewModel$ViewState;", "viewState", "getViewState", "()Lcom/woocommerce/android/ui/orders/details/editing/OrderEditingViewModel$ViewState;", "setViewState", "(Lcom/woocommerce/android/ui/orders/details/editing/OrderEditingViewModel$ViewState;)V", "viewState$delegate", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "viewStateData", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getViewStateData", "()Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "checkConnectionAndResetState", "", "onReplicateAddressSwitchChanged", "", "enabled", "runWhenUpdateIsPossible", "action", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;)Z", "sendReplicateShippingAndBillingAddressesWith", "Lkotlinx/coroutines/flow/Flow;", "Lorg/wordpress/android/fluxc/store/WCOrderStore$UpdateOrderResult;", "orderAddress", "Lcom/woocommerce/android/model/Address;", "(Lcom/woocommerce/android/model/Address;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "start", "updateBillingAddress", "updatedBillingAddress", "updateCustomerOrderNote", "updatedNote", "", "updateShippingAddress", "updatedShippingAddress", "collectOrderUpdate", "editingSubject", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "OrderEditFailed", "OrderEdited", "ViewState", "WooCommerce_vanillaDebug"})
public final class OrderEditingViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.util.CoroutineDispatchers dispatchers = null;
    private final com.woocommerce.android.ui.orders.details.OrderDetailRepository orderDetailRepository = null;
    private final com.woocommerce.android.ui.orders.details.editing.OrderEditingRepository orderEditingRepository = null;
    private final com.woocommerce.android.tools.NetworkStatus networkStatus = null;
    private final com.woocommerce.android.viewmodel.NavArgsLazy navArgs$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.details.editing.OrderEditingViewModel.ViewState> viewStateData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate viewState$delegate = null;
    public com.woocommerce.android.model.Order order;
    
    @javax.inject.Inject()
    public OrderEditingViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.CoroutineDispatchers dispatchers, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.orders.details.OrderDetailRepository orderDetailRepository, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.orders.details.editing.OrderEditingRepository orderEditingRepository, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.tools.NetworkStatus networkStatus) {
        super(null);
    }
    
    private final com.woocommerce.android.ui.orders.details.OrderDetailFragmentArgs getNavArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.details.editing.OrderEditingViewModel.ViewState> getViewStateData() {
        return null;
    }
    
    private final com.woocommerce.android.ui.orders.details.editing.OrderEditingViewModel.ViewState getViewState() {
        return null;
    }
    
    private final void setViewState(com.woocommerce.android.ui.orders.details.editing.OrderEditingViewModel.ViewState p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.model.Order getOrder() {
        return null;
    }
    
    public final void setOrder(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.Order p0) {
    }
    
    public final void start() {
    }
    
    private final boolean checkConnectionAndResetState() {
        return false;
    }
    
    public final boolean updateCustomerOrderNote(@org.jetbrains.annotations.NotNull()
    java.lang.String updatedNote) {
        return false;
    }
    
    public final boolean updateShippingAddress(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.Address updatedShippingAddress) {
        return false;
    }
    
    public final boolean updateBillingAddress(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.Address updatedBillingAddress) {
        return false;
    }
    
    private final java.lang.Object sendReplicateShippingAndBillingAddressesWith(com.woocommerce.android.model.Address orderAddress, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends org.wordpress.android.fluxc.store.WCOrderStore.UpdateOrderResult>> continuation) {
        return null;
    }
    
    public final void onReplicateAddressSwitchChanged(boolean enabled) {
    }
    
    private final java.lang.Object collectOrderUpdate(kotlinx.coroutines.flow.Flow<? extends org.wordpress.android.fluxc.store.WCOrderStore.UpdateOrderResult> $this$collectOrderUpdate, java.lang.String editingSubject, kotlin.coroutines.Continuation<? super kotlin.Unit> p2) {
        return null;
    }
    
    private final boolean runWhenUpdateIsPossible(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> action) {
        return false;
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\nJ\t\u0010\u000b\u001a\u00020\fH\u00d6\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\fH\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fH\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0018"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/editing/OrderEditingViewModel$ViewState;", "Landroid/os/Parcelable;", "replicateBothAddressesToggleActivated", "", "(Ljava/lang/Boolean;)V", "getReplicateBothAddressesToggleActivated", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "copy", "(Ljava/lang/Boolean;)Lcom/woocommerce/android/ui/orders/details/editing/OrderEditingViewModel$ViewState;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
    public static final class ViewState implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean replicateBothAddressesToggleActivated = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.details.editing.OrderEditingViewModel.ViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.details.editing.OrderEditingViewModel.ViewState copy(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean replicateBothAddressesToggleActivated) {
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
        java.lang.Boolean replicateBothAddressesToggleActivated) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean getReplicateBothAddressesToggleActivated() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.details.editing.OrderEditingViewModel.ViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.orders.details.editing.OrderEditingViewModel.ViewState createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.orders.details.editing.OrderEditingViewModel.ViewState[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/editing/OrderEditingViewModel$OrderEdited;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "()V", "WooCommerce_vanillaDebug"})
    public static final class OrderEdited extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        @org.jetbrains.annotations.NotNull()
        public static final com.woocommerce.android.ui.orders.details.editing.OrderEditingViewModel.OrderEdited INSTANCE = null;
        
        private OrderEdited() {
            super(false);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/editing/OrderEditingViewModel$OrderEditFailed;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "message", "", "(I)V", "getMessage", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class OrderEditFailed extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        private final int message = 0;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.details.editing.OrderEditingViewModel.OrderEditFailed copy(@androidx.annotation.StringRes()
        int message) {
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
        
        public OrderEditFailed(@androidx.annotation.StringRes()
        int message) {
            super(false);
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getMessage() {
            return 0;
        }
    }
}