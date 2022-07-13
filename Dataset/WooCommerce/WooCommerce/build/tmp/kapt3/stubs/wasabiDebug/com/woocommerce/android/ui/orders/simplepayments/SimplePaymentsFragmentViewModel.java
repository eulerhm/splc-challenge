package com.woocommerce.android.ui.orders.simplepayments;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001:\u0004:;<=B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010(\u001a\u00020)2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010*\u001a\u00020)H\u0016J\u0010\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020-H\u0016J\u0010\u0010.\u001a\u00020)2\u0006\u0010/\u001a\u000200H\u0016J\u0010\u00101\u001a\u00020)2\u0006\u00102\u001a\u00020-H\u0016J\b\u00103\u001a\u00020)H\u0016J\b\u00104\u001a\u00020)H\u0016J\u0010\u00105\u001a\u00020)2\u0006\u0010/\u001a\u000200H\u0012J\u001b\u00106\u001a\u00020)*\b\u0012\u0004\u0012\u00020807H\u0092@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00109R\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108RX\u0092\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u00168RX\u0092\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\b\u001a\u00020\tX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001c8@@@X\u0080\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001c0%\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006>"}, d2 = {"Lcom/woocommerce/android/ui/orders/simplepayments/SimplePaymentsFragmentViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "simplePaymentsRepository", "Lcom/woocommerce/android/ui/orders/simplepayments/SimplePaymentsRepository;", "networkStatus", "Lcom/woocommerce/android/tools/NetworkStatus;", "orderCreationRepository", "Lcom/woocommerce/android/ui/orders/creation/OrderCreationRepository;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/ui/orders/simplepayments/SimplePaymentsRepository;Lcom/woocommerce/android/tools/NetworkStatus;Lcom/woocommerce/android/ui/orders/creation/OrderCreationRepository;)V", "feeLineTotal", "Ljava/math/BigDecimal;", "getFeeLineTotal", "()Ljava/math/BigDecimal;", "navArgs", "Lcom/woocommerce/android/ui/orders/simplepayments/SimplePaymentsFragmentArgs;", "getNavArgs", "()Lcom/woocommerce/android/ui/orders/simplepayments/SimplePaymentsFragmentArgs;", "navArgs$delegate", "Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "order", "Lcom/woocommerce/android/model/Order;", "getOrder", "()Lcom/woocommerce/android/model/Order;", "orderDraft", "getOrderDraft", "<set-?>", "Lcom/woocommerce/android/ui/orders/simplepayments/SimplePaymentsFragmentViewModel$ViewState;", "viewState", "getViewState$WooCommerce_wasabiDebug", "()Lcom/woocommerce/android/ui/orders/simplepayments/SimplePaymentsFragmentViewModel$ViewState;", "setViewState$WooCommerce_wasabiDebug", "(Lcom/woocommerce/android/ui/orders/simplepayments/SimplePaymentsFragmentViewModel$ViewState;)V", "viewState$delegate", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "viewStateLiveData", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getViewStateLiveData", "()Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "deleteDraftOrder", "", "onBackButtonClicked", "onBillingEmailChanged", "email", "", "onChargeTaxesChanged", "chargeTaxes", "", "onCustomerNoteChanged", "customerNote", "onCustomerNoteClicked", "onDoneButtonClicked", "updateViewState", "collectUpdate", "Lkotlinx/coroutines/flow/Flow;", "Lorg/wordpress/android/fluxc/store/WCOrderStore$UpdateOrderResult;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "CancelSimplePayment", "ShowCustomerNoteEditor", "ShowTakePaymentScreen", "ViewState", "WooCommerce_wasabiDebug"})
@com.woocommerce.android.annotations.OpenClassOnDebug
public class SimplePaymentsFragmentViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.ui.orders.simplepayments.SimplePaymentsRepository simplePaymentsRepository = null;
    private final com.woocommerce.android.tools.NetworkStatus networkStatus = null;
    private final com.woocommerce.android.ui.orders.creation.OrderCreationRepository orderCreationRepository = null;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.simplepayments.SimplePaymentsFragmentViewModel.ViewState> viewStateLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.viewmodel.LiveDataDelegate viewState$delegate = null;
    private final com.woocommerce.android.viewmodel.NavArgsLazy navArgs$delegate = null;
    
    @javax.inject.Inject
    public SimplePaymentsFragmentViewModel(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.orders.simplepayments.SimplePaymentsRepository simplePaymentsRepository, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.NetworkStatus networkStatus, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.orders.creation.OrderCreationRepository orderCreationRepository) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.simplepayments.SimplePaymentsFragmentViewModel.ViewState> getViewStateLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.ui.orders.simplepayments.SimplePaymentsFragmentViewModel.ViewState getViewState$WooCommerce_wasabiDebug() {
        return null;
    }
    
    public final void setViewState$WooCommerce_wasabiDebug(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.orders.simplepayments.SimplePaymentsFragmentViewModel.ViewState p0) {
    }
    
    private com.woocommerce.android.ui.orders.simplepayments.SimplePaymentsFragmentArgs getNavArgs() {
        return null;
    }
    
    private com.woocommerce.android.model.Order getOrder() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public com.woocommerce.android.model.Order getOrderDraft() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.math.BigDecimal getFeeLineTotal() {
        return null;
    }
    
    private void updateViewState(boolean chargeTaxes) {
    }
    
    public void onChargeTaxesChanged(boolean chargeTaxes) {
    }
    
    public void onCustomerNoteClicked() {
    }
    
    public void onCustomerNoteChanged(@org.jetbrains.annotations.NotNull
    java.lang.String customerNote) {
    }
    
    public void onBillingEmailChanged(@org.jetbrains.annotations.NotNull
    java.lang.String email) {
    }
    
    public void onDoneButtonClicked() {
    }
    
    private java.lang.Object collectUpdate(kotlinx.coroutines.flow.Flow<? extends org.wordpress.android.fluxc.store.WCOrderStore.UpdateOrderResult> $this$collectUpdate, kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    public void deleteDraftOrder(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.Order order) {
    }
    
    public void onBackButtonClicked() {
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u000bH\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u000bH\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003JU\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u0003H\u00c6\u0001J\t\u0010!\u001a\u00020\"H\u00d6\u0001J\u0013\u0010#\u001a\u00020\u00032\b\u0010$\u001a\u0004\u0018\u00010%H\u00d6\u0003J\t\u0010&\u001a\u00020\"H\u00d6\u0001J\t\u0010\'\u001a\u00020\u000bH\u00d6\u0001J\u0019\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\"H\u00d6\u0001R\u0011\u0010\f\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015\u00a8\u0006-"}, d2 = {"Lcom/woocommerce/android/ui/orders/simplepayments/SimplePaymentsFragmentViewModel$ViewState;", "Landroid/os/Parcelable;", "chargeTaxes", "", "orderSubtotal", "Ljava/math/BigDecimal;", "orderTaxes", "", "Lcom/woocommerce/android/model/Order$TaxLine;", "orderTotal", "customerNote", "", "billingEmail", "isBillingEmailValid", "(ZLjava/math/BigDecimal;Ljava/util/List;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Z)V", "getBillingEmail", "()Ljava/lang/String;", "getChargeTaxes", "()Z", "getCustomerNote", "getOrderSubtotal", "()Ljava/math/BigDecimal;", "getOrderTaxes", "()Ljava/util/List;", "getOrderTotal", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class ViewState implements android.os.Parcelable {
        private final boolean chargeTaxes = false;
        @org.jetbrains.annotations.NotNull
        private final java.math.BigDecimal orderSubtotal = null;
        @org.jetbrains.annotations.NotNull
        private final java.util.List<com.woocommerce.android.model.Order.TaxLine> orderTaxes = null;
        @org.jetbrains.annotations.NotNull
        private final java.math.BigDecimal orderTotal = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String customerNote = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String billingEmail = null;
        private final boolean isBillingEmailValid = false;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.simplepayments.SimplePaymentsFragmentViewModel.ViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.simplepayments.SimplePaymentsFragmentViewModel.ViewState copy(boolean chargeTaxes, @org.jetbrains.annotations.NotNull
        java.math.BigDecimal orderSubtotal, @org.jetbrains.annotations.NotNull
        java.util.List<com.woocommerce.android.model.Order.TaxLine> orderTaxes, @org.jetbrains.annotations.NotNull
        java.math.BigDecimal orderTotal, @org.jetbrains.annotations.NotNull
        java.lang.String customerNote, @org.jetbrains.annotations.NotNull
        java.lang.String billingEmail, boolean isBillingEmailValid) {
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
        
        public ViewState(boolean chargeTaxes, @org.jetbrains.annotations.NotNull
        java.math.BigDecimal orderSubtotal, @org.jetbrains.annotations.NotNull
        java.util.List<com.woocommerce.android.model.Order.TaxLine> orderTaxes, @org.jetbrains.annotations.NotNull
        java.math.BigDecimal orderTotal, @org.jetbrains.annotations.NotNull
        java.lang.String customerNote, @org.jetbrains.annotations.NotNull
        java.lang.String billingEmail, boolean isBillingEmailValid) {
            super();
        }
        
        public final boolean component1() {
            return false;
        }
        
        public final boolean getChargeTaxes() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigDecimal component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigDecimal getOrderSubtotal() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.woocommerce.android.model.Order.TaxLine> component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.woocommerce.android.model.Order.TaxLine> getOrderTaxes() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigDecimal component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigDecimal getOrderTotal() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getCustomerNote() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getBillingEmail() {
            return null;
        }
        
        public final boolean component7() {
            return false;
        }
        
        public final boolean isBillingEmailValid() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.simplepayments.SimplePaymentsFragmentViewModel.ViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.orders.simplepayments.SimplePaymentsFragmentViewModel.ViewState createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.orders.simplepayments.SimplePaymentsFragmentViewModel.ViewState[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/orders/simplepayments/SimplePaymentsFragmentViewModel$ShowCustomerNoteEditor;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "()V", "WooCommerce_wasabiDebug"})
    public static final class ShowCustomerNoteEditor extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        @org.jetbrains.annotations.NotNull
        public static final com.woocommerce.android.ui.orders.simplepayments.SimplePaymentsFragmentViewModel.ShowCustomerNoteEditor INSTANCE = null;
        
        private ShowCustomerNoteEditor() {
            super(false);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/orders/simplepayments/SimplePaymentsFragmentViewModel$ShowTakePaymentScreen;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "()V", "WooCommerce_wasabiDebug"})
    public static final class ShowTakePaymentScreen extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        @org.jetbrains.annotations.NotNull
        public static final com.woocommerce.android.ui.orders.simplepayments.SimplePaymentsFragmentViewModel.ShowTakePaymentScreen INSTANCE = null;
        
        private ShowTakePaymentScreen() {
            super(false);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/orders/simplepayments/SimplePaymentsFragmentViewModel$CancelSimplePayment;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "()V", "WooCommerce_wasabiDebug"})
    public static final class CancelSimplePayment extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        @org.jetbrains.annotations.NotNull
        public static final com.woocommerce.android.ui.orders.simplepayments.SimplePaymentsFragmentViewModel.CancelSimplePayment INSTANCE = null;
        
        private CancelSimplePayment() {
            super(false);
        }
    }
}