package com.woocommerce.android.ui.cardreader.payment;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0080\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001:\u0006\u0081\u0001\u0082\u0001\u0083\u0001B\u007f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u00a2\u0006\u0002\u0010 J\u0017\u0010:\u001a\u0004\u0018\u00010(2\u0006\u0010;\u001a\u00020<H\u0002\u00a2\u0006\u0002\u0010=J!\u0010>\u001a\u00020?2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010@\u001a\u00020AH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010BJ\u001a\u0010C\u001a\u00020?2\b\u0010D\u001a\u0004\u0018\u00010<2\u0006\u0010E\u001a\u00020FH\u0002J(\u0010G\u001a\u00020?2\u0006\u0010\'\u001a\u00020(2\u0006\u0010H\u001a\u00020<2\u0006\u0010E\u001a\u00020I2\u0006\u0010D\u001a\u00020<H\u0002J\u0012\u0010J\u001a\u00020?2\b\b\u0001\u0010K\u001a\u00020LH\u0002J\u0013\u0010M\u001a\u0004\u0018\u00010AH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010NJ\u0010\u0010O\u001a\u00020<2\u0006\u0010\'\u001a\u00020(H\u0002J\u0011\u0010P\u001a\u00020<H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010NJ\u0010\u0010Q\u001a\u00020?2\u0006\u0010R\u001a\u00020SH\u0002J\u0010\u0010T\u001a\u00020?2\u0006\u0010U\u001a\u00020VH\u0002J\u0010\u0010W\u001a\u00020?2\u0006\u0010U\u001a\u00020VH\u0002J\u0010\u0010X\u001a\u00020V2\u0006\u0010Y\u001a\u00020ZH\u0002J\u0011\u0010[\u001a\u00020?H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010NJ\u0006\u0010\\\u001a\u00020?J\b\u0010]\u001a\u00020?H\u0017J\u0006\u0010^\u001a\u00020?J\u0018\u0010_\u001a\u00020?2\u0006\u0010`\u001a\u00020a2\u0006\u0010\'\u001a\u00020(H\u0002J(\u0010b\u001a\u00020?2\u0006\u0010\'\u001a\u00020(2\u0006\u0010H\u001a\u00020<2\u0006\u0010`\u001a\u00020c2\u0006\u0010D\u001a\u00020<H\u0002J \u0010d\u001a\u00020?2\u0006\u0010e\u001a\u00020<2\u0006\u0010f\u001a\u00020<2\u0006\u0010g\u001a\u00020<H\u0002J\u000e\u0010h\u001a\u00020?2\u0006\u0010i\u001a\u00020jJ\u0018\u0010k\u001a\u00020?2\u0006\u0010l\u001a\u00020m2\u0006\u0010D\u001a\u00020<H\u0002J\b\u0010n\u001a\u00020?H\u0002J\u0018\u0010o\u001a\u00020?2\u0006\u0010f\u001a\u00020<2\u0006\u0010H\u001a\u00020<H\u0002J\u0006\u0010p\u001a\u00020?J\b\u0010q\u001a\u00020?H\u0007J!\u0010r\u001a\u00020?2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010@\u001a\u00020AH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010BJ&\u0010s\u001a\u00020?2\u0006\u0010\'\u001a\u00020(2\u0006\u0010H\u001a\u00020<2\u0006\u0010t\u001a\u00020*2\u0006\u0010D\u001a\u00020<J\u0006\u0010u\u001a\u00020?J\b\u0010v\u001a\u00020?H\u0002J\u0006\u0010w\u001a\u00020?J\b\u0010x\u001a\u00020?H\u0002J\u0018\u0010y\u001a\u00020?2\u0006\u0010\'\u001a\u00020(2\u0006\u0010f\u001a\u00020<H\u0002J\u0010\u0010z\u001a\u00020?2\u0006\u0010{\u001a\u000205H\u0002J\f\u0010|\u001a\u00020<*\u00020AH\u0002J\f\u0010}\u001a\u00020<*\u00020AH\u0002J\f\u0010~\u001a\u00020<*\u00020AH\u0002J\u0015\u0010\u007f\u001a\u00020L*\u00020S2\u0007\u0010\u0080\u0001\u001a\u00020VH\u0003R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010!\u001a\u00020\"8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b#\u0010$R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020(X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u0004\u0018\u00010,X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010.\u001a\u00020/8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b0\u00101R\u0010\u00102\u001a\u0004\u0018\u00010,X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u00103\u001a\b\u0012\u0004\u0012\u00020504X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u00106\u001a\b\u0012\u0004\u0012\u00020507\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0084\u0001"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/payment/CardReaderPaymentViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "cardReaderManager", "Lcom/woocommerce/android/cardreader/CardReaderManager;", "orderRepository", "Lcom/woocommerce/android/ui/orders/details/OrderDetailRepository;", "resourceProvider", "Lcom/woocommerce/android/viewmodel/ResourceProvider;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "appPrefsWrapper", "Lcom/woocommerce/android/AppPrefsWrapper;", "paymentCollectibilityChecker", "Lcom/woocommerce/android/ui/cardreader/payment/CardReaderPaymentCollectibilityChecker;", "interacRefundableChecker", "Lcom/woocommerce/android/ui/cardreader/payment/CardReaderInteracRefundableChecker;", "tracker", "Lcom/woocommerce/android/ui/cardreader/CardReaderTracker;", "currencyFormatter", "Lcom/woocommerce/android/util/CurrencyFormatter;", "errorMapper", "Lcom/woocommerce/android/ui/cardreader/payment/CardReaderPaymentErrorMapper;", "interacRefundErrorMapper", "Lcom/woocommerce/android/ui/cardreader/payment/CardReaderInteracRefundErrorMapper;", "wooStore", "Lorg/wordpress/android/fluxc/store/WooCommerceStore;", "dispatchers", "Lcom/woocommerce/android/util/CoroutineDispatchers;", "cardReaderTrackingInfoKeeper", "Lcom/woocommerce/android/ui/cardreader/CardReaderTrackingInfoKeeper;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/cardreader/CardReaderManager;Lcom/woocommerce/android/ui/orders/details/OrderDetailRepository;Lcom/woocommerce/android/viewmodel/ResourceProvider;Lcom/woocommerce/android/tools/SelectedSite;Lcom/woocommerce/android/AppPrefsWrapper;Lcom/woocommerce/android/ui/cardreader/payment/CardReaderPaymentCollectibilityChecker;Lcom/woocommerce/android/ui/cardreader/payment/CardReaderInteracRefundableChecker;Lcom/woocommerce/android/ui/cardreader/CardReaderTracker;Lcom/woocommerce/android/util/CurrencyFormatter;Lcom/woocommerce/android/ui/cardreader/payment/CardReaderPaymentErrorMapper;Lcom/woocommerce/android/ui/cardreader/payment/CardReaderInteracRefundErrorMapper;Lorg/wordpress/android/fluxc/store/WooCommerceStore;Lcom/woocommerce/android/util/CoroutineDispatchers;Lcom/woocommerce/android/ui/cardreader/CardReaderTrackingInfoKeeper;)V", "arguments", "Lcom/woocommerce/android/ui/cardreader/payment/CardReaderPaymentDialogFragmentArgs;", "getArguments", "()Lcom/woocommerce/android/ui/cardreader/payment/CardReaderPaymentDialogFragmentArgs;", "arguments$delegate", "Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "orderId", "", "paymentDataForRetry", "Lcom/woocommerce/android/cardreader/payments/PaymentData;", "paymentFlowJob", "Lkotlinx/coroutines/Job;", "refetchOrderJob", "refundAmount", "Ljava/math/BigDecimal;", "getRefundAmount", "()Ljava/math/BigDecimal;", "refundFlowJob", "viewState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/woocommerce/android/ui/cardreader/payment/ViewState;", "viewStateData", "Landroidx/lifecycle/LiveData;", "getViewStateData", "()Landroidx/lifecycle/LiveData;", "calculateFeeInCents", "countryCode", "", "(Ljava/lang/String;)Ljava/lang/Long;", "collectPaymentFlow", "", "order", "Lcom/woocommerce/android/model/Order;", "(Lcom/woocommerce/android/cardreader/CardReaderManager;Lcom/woocommerce/android/model/Order;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emitFailedInteracRefundState", "amountLabel", "error", "Lcom/woocommerce/android/cardreader/payments/CardInteracRefundStatus$InteracRefundFailure;", "emitFailedPaymentState", "billingEmail", "Lcom/woocommerce/android/cardreader/payments/CardPaymentStatus$PaymentFailed;", "exitWithSnackbar", "message", "", "fetchOrder", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getReceiptUrl", "getStoreCountryCode", "handleAdditionalInfo", "type", "Lcom/woocommerce/android/cardreader/payments/CardPaymentStatus$AdditionalInfoType;", "initPaymentFlow", "isRetry", "", "initRefundFlow", "isPluginCanSendReceipt", "site", "Lorg/wordpress/android/fluxc/model/SiteModel;", "listenForBluetoothCardReaderMessages", "onBackPressed", "onCleared", "onEmailActivityNotFound", "onPaymentCompleted", "paymentStatus", "Lcom/woocommerce/android/cardreader/payments/CardPaymentStatus$PaymentCompleted;", "onPaymentStatusChanged", "Lcom/woocommerce/android/cardreader/payments/CardPaymentStatus;", "onPrintReceiptClicked", "amountWithCurrencyLabel", "receiptUrl", "documentName", "onPrintResult", "result", "Lcom/woocommerce/android/util/PrintHtmlHelper$PrintJobResult;", "onRefundStatusChanged", "refundStatus", "Lcom/woocommerce/android/cardreader/payments/CardInteracRefundStatus;", "onSaveForLaterClicked", "onSendReceiptClicked", "onViewCreated", "reFetchOrder", "refundPaymentFlow", "retry", "paymentData", "retryInteracRefund", "showPaymentSuccessfulState", "start", "startPrintingFlow", "storeReceiptUrl", "trackCancelledFlow", "state", "getAmountLabel", "getPaymentDescription", "getReceiptDocumentName", "toHintLabel", "isInteracRefund", "InteracRefundSuccessful", "PlayChaChing", "ShowSnackbarInDialog", "WooCommerce_wasabiDebug"})
public final class CardReaderPaymentViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.cardreader.CardReaderManager cardReaderManager = null;
    private final com.woocommerce.android.ui.orders.details.OrderDetailRepository orderRepository = null;
    private final com.woocommerce.android.viewmodel.ResourceProvider resourceProvider = null;
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    private final com.woocommerce.android.AppPrefsWrapper appPrefsWrapper = null;
    private final com.woocommerce.android.ui.cardreader.payment.CardReaderPaymentCollectibilityChecker paymentCollectibilityChecker = null;
    private final com.woocommerce.android.ui.cardreader.payment.CardReaderInteracRefundableChecker interacRefundableChecker = null;
    private final com.woocommerce.android.ui.cardreader.CardReaderTracker tracker = null;
    private final com.woocommerce.android.util.CurrencyFormatter currencyFormatter = null;
    private final com.woocommerce.android.ui.cardreader.payment.CardReaderPaymentErrorMapper errorMapper = null;
    private final com.woocommerce.android.ui.cardreader.payment.CardReaderInteracRefundErrorMapper interacRefundErrorMapper = null;
    private final org.wordpress.android.fluxc.store.WooCommerceStore wooStore = null;
    private final com.woocommerce.android.util.CoroutineDispatchers dispatchers = null;
    private final com.woocommerce.android.ui.cardreader.CardReaderTrackingInfoKeeper cardReaderTrackingInfoKeeper = null;
    private final com.woocommerce.android.viewmodel.NavArgsLazy arguments$delegate = null;
    private final long orderId = 0L;
    private final androidx.lifecycle.MutableLiveData<com.woocommerce.android.ui.cardreader.payment.ViewState> viewState = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.woocommerce.android.ui.cardreader.payment.ViewState> viewStateData = null;
    private kotlinx.coroutines.Job paymentFlowJob;
    private kotlinx.coroutines.Job refundFlowJob;
    private com.woocommerce.android.cardreader.payments.PaymentData paymentDataForRetry;
    private kotlinx.coroutines.Job refetchOrderJob;
    
    @javax.inject.Inject
    public CardReaderPaymentViewModel(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.cardreader.CardReaderManager cardReaderManager, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.orders.details.OrderDetailRepository orderRepository, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.viewmodel.ResourceProvider resourceProvider, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.SelectedSite selectedSite, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.AppPrefsWrapper appPrefsWrapper, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.cardreader.payment.CardReaderPaymentCollectibilityChecker paymentCollectibilityChecker, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.cardreader.payment.CardReaderInteracRefundableChecker interacRefundableChecker, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.cardreader.CardReaderTracker tracker, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.CurrencyFormatter currencyFormatter, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.cardreader.payment.CardReaderPaymentErrorMapper errorMapper, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.cardreader.payment.CardReaderInteracRefundErrorMapper interacRefundErrorMapper, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.WooCommerceStore wooStore, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.CoroutineDispatchers dispatchers, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.cardreader.CardReaderTrackingInfoKeeper cardReaderTrackingInfoKeeper) {
        super(null);
    }
    
    private final com.woocommerce.android.ui.cardreader.payment.CardReaderPaymentDialogFragmentArgs getArguments() {
        return null;
    }
    
    private final java.math.BigDecimal getRefundAmount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.woocommerce.android.ui.cardreader.payment.ViewState> getViewStateData() {
        return null;
    }
    
    public final void start() {
    }
    
    private final java.lang.Object listenForBluetoothCardReaderMessages(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final void initPaymentFlow(boolean isRetry) {
    }
    
    private final void initRefundFlow(boolean isRetry) {
    }
    
    public final void retry(long orderId, @org.jetbrains.annotations.NotNull
    java.lang.String billingEmail, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.cardreader.payments.PaymentData paymentData, @org.jetbrains.annotations.NotNull
    java.lang.String amountLabel) {
    }
    
    public final void retryInteracRefund() {
    }
    
    private final java.lang.Object collectPaymentFlow(com.woocommerce.android.cardreader.CardReaderManager cardReaderManager, com.woocommerce.android.model.Order order, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final void onPaymentStatusChanged(long orderId, java.lang.String billingEmail, com.woocommerce.android.cardreader.payments.CardPaymentStatus paymentStatus, java.lang.String amountLabel) {
    }
    
    private final java.lang.Object refundPaymentFlow(com.woocommerce.android.cardreader.CardReaderManager cardReaderManager, com.woocommerce.android.model.Order order, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final void onRefundStatusChanged(com.woocommerce.android.cardreader.payments.CardInteracRefundStatus refundStatus, java.lang.String amountLabel) {
    }
    
    private final void onPaymentCompleted(com.woocommerce.android.cardreader.payments.CardPaymentStatus.PaymentCompleted paymentStatus, long orderId) {
    }
    
    @androidx.annotation.VisibleForTesting
    public final void reFetchOrder() {
    }
    
    private final java.lang.Object fetchOrder(kotlin.coroutines.Continuation<? super com.woocommerce.android.model.Order> continuation) {
        return null;
    }
    
    private final void emitFailedInteracRefundState(java.lang.String amountLabel, com.woocommerce.android.cardreader.payments.CardInteracRefundStatus.InteracRefundFailure error) {
    }
    
    private final void emitFailedPaymentState(long orderId, java.lang.String billingEmail, com.woocommerce.android.cardreader.payments.CardPaymentStatus.PaymentFailed error, java.lang.String amountLabel) {
    }
    
    private final void showPaymentSuccessfulState() {
    }
    
    private final void handleAdditionalInfo(com.woocommerce.android.cardreader.payments.CardPaymentStatus.AdditionalInfoType type) {
    }
    
    @androidx.annotation.StringRes
    private final int toHintLabel(com.woocommerce.android.cardreader.payments.CardPaymentStatus.AdditionalInfoType $this$toHintLabel, boolean isInteracRefund) {
        return 0;
    }
    
    private final void onSaveForLaterClicked() {
    }
    
    private final void onPrintReceiptClicked(java.lang.String amountWithCurrencyLabel, java.lang.String receiptUrl, java.lang.String documentName) {
    }
    
    public final void onViewCreated() {
    }
    
    private final void startPrintingFlow() {
    }
    
    private final void onSendReceiptClicked(java.lang.String receiptUrl, java.lang.String billingEmail) {
    }
    
    public final void onEmailActivityNotFound() {
    }
    
    public final void onPrintResult(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.PrintHtmlHelper.PrintJobResult result) {
    }
    
    @androidx.annotation.VisibleForTesting(otherwise = androidx.annotation.VisibleForTesting.PROTECTED)
    @java.lang.Override
    public void onCleared() {
    }
    
    public final void onBackPressed() {
    }
    
    private final void trackCancelledFlow(com.woocommerce.android.ui.cardreader.payment.ViewState state) {
    }
    
    private final void exitWithSnackbar(@androidx.annotation.StringRes
    int message) {
    }
    
    private final void storeReceiptUrl(long orderId, java.lang.String receiptUrl) {
    }
    
    private final java.lang.String getReceiptUrl(long orderId) {
        return null;
    }
    
    private final java.lang.String getPaymentDescription(com.woocommerce.android.model.Order $this$getPaymentDescription) {
        return null;
    }
    
    private final java.lang.String getAmountLabel(com.woocommerce.android.model.Order $this$getAmountLabel) {
        return null;
    }
    
    private final java.lang.String getReceiptDocumentName(com.woocommerce.android.model.Order $this$getReceiptDocumentName) {
        return null;
    }
    
    private final java.lang.Object getStoreCountryCode(kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return null;
    }
    
    private final java.lang.Long calculateFeeInCents(java.lang.String countryCode) {
        return null;
    }
    
    private final boolean isPluginCanSendReceipt(org.wordpress.android.fluxc.model.SiteModel site) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/payment/CardReaderPaymentViewModel$ShowSnackbarInDialog;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "message", "", "(I)V", "getMessage", "()I", "WooCommerce_wasabiDebug"})
    public static final class ShowSnackbarInDialog extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        private final int message = 0;
        
        public ShowSnackbarInDialog(@androidx.annotation.StringRes
        int message) {
            super(false);
        }
        
        public final int getMessage() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/payment/CardReaderPaymentViewModel$PlayChaChing;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "()V", "WooCommerce_wasabiDebug"})
    public static final class PlayChaChing extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        @org.jetbrains.annotations.NotNull
        public static final com.woocommerce.android.ui.cardreader.payment.CardReaderPaymentViewModel.PlayChaChing INSTANCE = null;
        
        private PlayChaChing() {
            super(false);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/payment/CardReaderPaymentViewModel$InteracRefundSuccessful;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "()V", "WooCommerce_wasabiDebug"})
    public static final class InteracRefundSuccessful extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        @org.jetbrains.annotations.NotNull
        public static final com.woocommerce.android.ui.cardreader.payment.CardReaderPaymentViewModel.InteracRefundSuccessful INSTANCE = null;
        
        private InteracRefundSuccessful() {
            super(false);
        }
    }
}