package com.woocommerce.android.ui.orders.details;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00fe\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\b\u00ab\u0001\u00ac\u0001\u00ad\u0001\u00ae\u0001Bo\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u00a2\u0006\u0002\u0010\u001dJ\u0016\u0010S\u001a\u00020T2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020%0 H\u0012J\u0012\u0010V\u001a\u00020W2\b\u00105\u001a\u0004\u0018\u000104H\u0012J\u0010\u0010X\u001a\u00020T2\u0006\u0010Y\u001a\u00020\'H\u0012J\u0011\u0010Z\u001a\u00020TH\u0092@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010[J\b\u0010\\\u001a\u00020TH\u0012J\u0011\u0010]\u001a\u00020TH\u0092@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010[J\u0019\u0010^\u001a\u00020T2\u0006\u0010_\u001a\u00020WH\u0092@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010`J\b\u0010a\u001a\u00020TH\u0012J\u000e\u0010b\u001a\b\u0012\u0004\u0012\u00020T0cH\u0012J\u0014\u0010d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0 0cH\u0012J\u0014\u0010e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0 0cH\u0012J\u0011\u0010f\u001a\u00020TH\u0092@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010[J\u000e\u0010g\u001a\b\u0012\u0004\u0012\u00020T0cH\u0012J\u000e\u0010h\u001a\b\u0012\u0004\u0012\u00020T0cH\u0012J\b\u0010i\u001a\u00020WH\u0016J\u0019\u0010j\u001a\u00020W2\u0006\u00105\u001a\u000204H\u0092@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010kJ\b\u0010l\u001a\u00020TH\u0012J\u001c\u0010m\u001a\b\u0012\u0004\u0012\u00020%0n2\f\u0010o\u001a\b\u0012\u0004\u0012\u00020#0nH\u0012J\u000e\u0010p\u001a\b\u0012\u0004\u0012\u00020#0nH\u0012J\u000e\u0010q\u001a\b\u0012\u0004\u0012\u00020)0nH\u0012J\n\u0010r\u001a\u0004\u0018\u00010,H\u0012J\u001c\u0010s\u001a\b\u0012\u0004\u0012\u00020\'0n2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020)0nH\u0012J\b\u0010t\u001a\u00020TH\u0016J\b\u0010u\u001a\u00020TH\u0016J\b\u0010v\u001a\u00020TH\u0016J\b\u0010w\u001a\u00020TH\u0016J\b\u0010x\u001a\u00020TH\u0014J\b\u0010y\u001a\u00020TH\u0016J\u0010\u0010z\u001a\u00020T2\u0006\u0010{\u001a\u00020,H\u0016J\u0010\u0010|\u001a\u00020T2\u0006\u0010Y\u001a\u00020\'H\u0012J\b\u0010}\u001a\u00020TH\u0016J\b\u0010~\u001a\u00020TH\u0016J\b\u0010\u007f\u001a\u00020TH\u0016J\t\u0010\u0080\u0001\u001a\u00020TH\u0016J\t\u0010\u0081\u0001\u001a\u00020TH\u0016J\u0012\u0010\u0082\u0001\u001a\u00020T2\u0007\u0010\u0083\u0001\u001a\u00020!H\u0016J\u0011\u0010\u0084\u0001\u001a\u00020T2\u0006\u0010Y\u001a\u00020\'H\u0016J\u0015\u0010\u0085\u0001\u001a\u00020T2\n\b\u0001\u0010\u0086\u0001\u001a\u00030\u0087\u0001H\u0016J\t\u0010\u0088\u0001\u001a\u00020TH\u0016J\t\u0010\u0089\u0001\u001a\u00020TH\u0016J\u0013\u0010\u008a\u0001\u001a\u00020T2\b\u0010\u008b\u0001\u001a\u00030\u008c\u0001H\u0016J\u0012\u0010\u008d\u0001\u001a\u00020T2\u0007\u0010\u008e\u0001\u001a\u00020)H\u0016J\u0013\u0010\u008f\u0001\u001a\u00020T2\b\u0010\u0090\u0001\u001a\u00030\u0091\u0001H\u0016J\t\u0010\u0092\u0001\u001a\u00020TH\u0016J\u0013\u0010\u0093\u0001\u001a\u00020T2\b\u0010\u0094\u0001\u001a\u00030\u0091\u0001H\u0016J\t\u0010\u0095\u0001\u001a\u00020TH\u0016J\u0013\u0010\u0096\u0001\u001a\u00020T2\b\u0010\u0090\u0001\u001a\u00030\u0091\u0001H\u0016J\t\u0010\u0097\u0001\u001a\u00020TH\u0016J\t\u0010\u0098\u0001\u001a\u00020TH\u0016J\t\u0010\u0099\u0001\u001a\u00020TH\u0016J\t\u0010\u009a\u0001\u001a\u00020TH\u0016J\t\u0010\u009b\u0001\u001a\u00020TH\u0016J\u0012\u0010\u009c\u0001\u001a\u00020T2\u0007\u0010\u009d\u0001\u001a\u00020%H\u0016J\t\u0010\u009e\u0001\u001a\u00020TH\u0016J\t\u0010\u009f\u0001\u001a\u00020TH\u0016J)\u0010\u00a0\u0001\u001a\u0018\u0012\u0004\u0012\u00020,\u0012\r\u0012\u000b \u00a2\u0001*\u0004\u0018\u00010,0,0\u00a1\u00012\b\u0010\u00a3\u0001\u001a\u00030\u00a4\u0001H\u0012J\t\u0010\u00a5\u0001\u001a\u00020TH\u0016J\t\u0010\u00a6\u0001\u001a\u00020TH\u0012J\t\u0010\u00a7\u0001\u001a\u00020TH\u0016J\u0012\u0010\u00a8\u0001\u001a\u00020TH\u0092@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010[J\u0012\u0010\u00a9\u0001\u001a\u00020T2\u0007\u0010\u00aa\u0001\u001a\u00020,H\u0012R\u001a\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u001fX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0 0\u001fX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0 0\u001fX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\'0 0\u001fX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0 0\u001fX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+X\u0092\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010-\u001a\u00020.8RX\u0092\u0084\u0002\u00a2\u0006\f\n\u0004\b1\u00102\u001a\u0004\b/\u00100R\u000e\u0010\t\u001a\u00020\nX\u0092\u0004\u00a2\u0006\u0002\n\u0000R$\u00105\u001a\u0002042\u0006\u00103\u001a\u0002048V@VX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u000e\u0010\r\u001a\u00020\u000eX\u0092\u0004\u00a2\u0006\u0002\n\u0000R \u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0;X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010=R \u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0 0;X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010=R\u000e\u0010\u0015\u001a\u00020\u0016X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0092\u0004\u00a2\u0006\u0002\n\u0000R \u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0 0;X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010=R\u000e\u0010\u000b\u001a\u00020\fX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0092\u0004\u00a2\u0006\u0002\n\u0000R \u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\'0 0;X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010=R\u000e\u0010\u001b\u001a\u00020\u001cX\u0092\u0004\u00a2\u0006\u0002\n\u0000R \u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0 0;X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010=R\u000e\u0010\u0019\u001a\u00020\u001aX\u0092\u0004\u00a2\u0006\u0002\n\u0000R+\u0010H\u001a\u00020G2\u0006\u0010F\u001a\u00020G8R@RX\u0092\u008e\u0002\u00a2\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u0017\u0010O\u001a\b\u0012\u0004\u0012\u00020G0P\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u0010R\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u00af\u0001"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/OrderDetailViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "Lcom/woocommerce/android/tools/ProductImageMap$OnProductFetchedListener;", "coroutineDispatchers", "Lcom/woocommerce/android/util/CoroutineDispatchers;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "appPrefs", "Lcom/woocommerce/android/AppPrefs;", "networkStatus", "Lcom/woocommerce/android/tools/NetworkStatus;", "resourceProvider", "Lcom/woocommerce/android/viewmodel/ResourceProvider;", "orderDetailRepository", "Lcom/woocommerce/android/ui/orders/details/OrderDetailRepository;", "addonsRepository", "Lcom/woocommerce/android/ui/products/addons/AddonRepository;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "productImageMap", "Lcom/woocommerce/android/tools/ProductImageMap;", "paymentCollectibilityChecker", "Lcom/woocommerce/android/ui/cardreader/payment/CardReaderPaymentCollectibilityChecker;", "cardReaderTracker", "Lcom/woocommerce/android/ui/cardreader/CardReaderTracker;", "trackerWrapper", "Lcom/woocommerce/android/analytics/AnalyticsTrackerWrapper;", "shippingLabelOnboardingRepository", "Lcom/woocommerce/android/ui/orders/details/ShippingLabelOnboardingRepository;", "(Lcom/woocommerce/android/util/CoroutineDispatchers;Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/AppPrefs;Lcom/woocommerce/android/tools/NetworkStatus;Lcom/woocommerce/android/viewmodel/ResourceProvider;Lcom/woocommerce/android/ui/orders/details/OrderDetailRepository;Lcom/woocommerce/android/ui/products/addons/AddonRepository;Lcom/woocommerce/android/tools/SelectedSite;Lcom/woocommerce/android/tools/ProductImageMap;Lcom/woocommerce/android/ui/cardreader/payment/CardReaderPaymentCollectibilityChecker;Lcom/woocommerce/android/ui/cardreader/CardReaderTracker;Lcom/woocommerce/android/analytics/AnalyticsTrackerWrapper;Lcom/woocommerce/android/ui/orders/details/ShippingLabelOnboardingRepository;)V", "_orderNotes", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/woocommerce/android/model/OrderNote;", "_orderRefunds", "Lcom/woocommerce/android/model/Refund;", "_productList", "Lcom/woocommerce/android/model/Order$Item;", "_shipmentTrackings", "Lcom/woocommerce/android/model/OrderShipmentTracking;", "_shippingLabels", "Lcom/woocommerce/android/model/ShippingLabel;", "deletedOrderShipmentTrackingSet", "", "", "navArgs", "Lcom/woocommerce/android/ui/orders/details/OrderDetailFragmentArgs;", "getNavArgs", "()Lcom/woocommerce/android/ui/orders/details/OrderDetailFragmentArgs;", "navArgs$delegate", "Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "value", "Lcom/woocommerce/android/model/Order;", "order", "getOrder", "()Lcom/woocommerce/android/model/Order;", "setOrder", "(Lcom/woocommerce/android/model/Order;)V", "orderNotes", "Landroidx/lifecycle/LiveData;", "getOrderNotes", "()Landroidx/lifecycle/LiveData;", "orderRefunds", "getOrderRefunds", "productList", "getProductList", "shipmentTrackings", "getShipmentTrackings", "shippingLabels", "getShippingLabels", "<set-?>", "Lcom/woocommerce/android/ui/orders/details/OrderDetailViewModel$ViewState;", "viewState", "getViewState", "()Lcom/woocommerce/android/ui/orders/details/OrderDetailViewModel$ViewState;", "setViewState", "(Lcom/woocommerce/android/ui/orders/details/OrderDetailViewModel$ViewState;)V", "viewState$delegate", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "viewStateData", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getViewStateData", "()Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "checkAddonAvailability", "", "products", "checkIfFetchNeeded", "", "deleteOrderShipmentTracking", "shipmentTracking", "displayOrderDetails", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "displayProductAndShippingDetails", "fetchAndDisplayOrderDetails", "fetchOrder", "showSkeleton", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchOrderNotes", "fetchOrderProductsAsync", "Lkotlinx/coroutines/Deferred;", "fetchOrderRefundsAsync", "fetchOrderShippingLabelsAsync", "fetchProductAndShippingDetails", "fetchSLCreationEligibilityAsync", "fetchShipmentTrackingAsync", "hasVirtualProductsOnly", "isPaymentCollectable", "(Lcom/woocommerce/android/model/Order;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadOrderNotes", "loadOrderProducts", "Lcom/woocommerce/android/ui/orders/details/OrderDetailViewModel$ListInfo;", "refunds", "loadOrderRefunds", "loadOrderShippingLabels", "loadReceiptUrl", "loadShipmentTracking", "onAcceptCardPresentPaymentClicked", "onAddOrderNoteClicked", "onAddShipmentTrackingClicked", "onCardReaderPaymentCompleted", "onCleared", "onCreateShippingLabelButtonTapped", "onDeleteShipmentTrackingClicked", "trackingNumber", "onDeleteShipmentTrackingReverted", "onEditClicked", "onEditOrderStatusSelected", "onGetWcShippingClicked", "onIssueOrderRefundClicked", "onMarkOrderCompleteButtonTapped", "onNewOrderNoteAdded", "orderNote", "onNewShipmentTrackingAdded", "onOrderEditFailed", "message", "", "onOrderEdited", "onOrderItemRefunded", "onOrderStatusChanged", "updateSource", "Lcom/woocommerce/android/ui/orders/details/OrderDetailViewModel$OrderStatusUpdateSource;", "onPrintCustomsFormClicked", "shippingLabel", "onPrintShippingLabelClicked", "shippingLabelId", "", "onPrintingInstructionsClicked", "onProductFetched", "remoteProductId", "onRefreshRequested", "onRefundShippingLabelClick", "onSeeReceiptClicked", "onSharePaymentUrlClicked", "onShippingLabelNoticeTapped", "onShippingLabelRefunded", "onShippingLabelsPurchased", "onViewOrderedAddonButtonTapped", "orderItem", "onViewRefundedProductsClicked", "onWcShippingBannerDismissed", "prepareTracksEventsDetails", "", "kotlin.jvm.PlatformType", "event", "Lorg/wordpress/android/fluxc/store/WCOrderStore$OnOrderChanged;", "refreshShipmentTracking", "reloadOrderDetails", "start", "updateOrderState", "updateOrderStatus", "newStatus", "ListInfo", "OrderInfo", "OrderStatusUpdateSource", "ViewState", "WooCommerce_wasabiDebug"})
@com.woocommerce.android.annotations.OpenClassOnDebug
public final class OrderDetailViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel implements com.woocommerce.android.tools.ProductImageMap.OnProductFetchedListener {
    private final com.woocommerce.android.util.CoroutineDispatchers coroutineDispatchers = null;
    private final com.woocommerce.android.AppPrefs appPrefs = null;
    private final com.woocommerce.android.tools.NetworkStatus networkStatus = null;
    private final com.woocommerce.android.viewmodel.ResourceProvider resourceProvider = null;
    private final com.woocommerce.android.ui.orders.details.OrderDetailRepository orderDetailRepository = null;
    private final com.woocommerce.android.ui.products.addons.AddonRepository addonsRepository = null;
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    private final com.woocommerce.android.tools.ProductImageMap productImageMap = null;
    private final com.woocommerce.android.ui.cardreader.payment.CardReaderPaymentCollectibilityChecker paymentCollectibilityChecker = null;
    private final com.woocommerce.android.ui.cardreader.CardReaderTracker cardReaderTracker = null;
    private final com.woocommerce.android.analytics.AnalyticsTrackerWrapper trackerWrapper = null;
    private final com.woocommerce.android.ui.orders.details.ShippingLabelOnboardingRepository shippingLabelOnboardingRepository = null;
    private final com.woocommerce.android.viewmodel.NavArgsLazy navArgs$delegate = null;
    private java.util.Set<java.lang.String> deletedOrderShipmentTrackingSet;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.details.OrderDetailViewModel.ViewState> viewStateData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate viewState$delegate = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.woocommerce.android.model.OrderNote>> _orderNotes = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.model.OrderNote>> orderNotes = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.woocommerce.android.model.Refund>> _orderRefunds = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.model.Refund>> orderRefunds = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.woocommerce.android.model.Order.Item>> _productList = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.model.Order.Item>> productList = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.woocommerce.android.model.OrderShipmentTracking>> _shipmentTrackings = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.model.OrderShipmentTracking>> shipmentTrackings = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.woocommerce.android.model.ShippingLabel>> _shippingLabels = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.model.ShippingLabel>> shippingLabels = null;
    
    @javax.inject.Inject
    public OrderDetailViewModel(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.CoroutineDispatchers coroutineDispatchers, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.AppPrefs appPrefs, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.NetworkStatus networkStatus, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.viewmodel.ResourceProvider resourceProvider, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.orders.details.OrderDetailRepository orderDetailRepository, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.addons.AddonRepository addonsRepository, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.SelectedSite selectedSite, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.ProductImageMap productImageMap, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.cardreader.payment.CardReaderPaymentCollectibilityChecker paymentCollectibilityChecker, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.cardreader.CardReaderTracker cardReaderTracker, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.analytics.AnalyticsTrackerWrapper trackerWrapper, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.orders.details.ShippingLabelOnboardingRepository shippingLabelOnboardingRepository) {
        super(null);
    }
    
    private com.woocommerce.android.ui.orders.details.OrderDetailFragmentArgs getNavArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public com.woocommerce.android.model.Order getOrder() {
        return null;
    }
    
    public void setOrder(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.Order value) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.details.OrderDetailViewModel.ViewState> getViewStateData() {
        return null;
    }
    
    private com.woocommerce.android.ui.orders.details.OrderDetailViewModel.ViewState getViewState() {
        return null;
    }
    
    private void setViewState(com.woocommerce.android.ui.orders.details.OrderDetailViewModel.ViewState p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.model.OrderNote>> getOrderNotes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.model.Refund>> getOrderRefunds() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.model.Order.Item>> getProductList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.model.OrderShipmentTracking>> getShipmentTrackings() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.model.ShippingLabel>> getShippingLabels() {
        return null;
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    public void start() {
    }
    
    private java.lang.Object fetchAndDisplayOrderDetails(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private java.lang.Object displayOrderDetails(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private java.lang.Object fetchOrder(boolean showSkeleton, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private boolean checkIfFetchNeeded(com.woocommerce.android.model.Order order) {
        return false;
    }
    
    public void onRefreshRequested() {
    }
    
    public boolean hasVirtualProductsOnly() {
        return false;
    }
    
    public void onEditOrderStatusSelected() {
    }
    
    public void onIssueOrderRefundClicked() {
    }
    
    public void onSharePaymentUrlClicked() {
    }
    
    public void onEditClicked() {
    }
    
    public void onAcceptCardPresentPaymentClicked() {
    }
    
    public void onSeeReceiptClicked() {
    }
    
    public void onPrintingInstructionsClicked() {
    }
    
    public void onGetWcShippingClicked() {
    }
    
    /**
     * This is triggered when the user taps "Done" on any of the order editing fragments
     */
    public void onOrderEdited() {
    }
    
    /**
     * This is triggered when the above network request to edit an order fails
     */
    public void onOrderEditFailed(@androidx.annotation.StringRes
    int message) {
    }
    
    private java.lang.String loadReceiptUrl() {
        return null;
    }
    
    public void onViewRefundedProductsClicked() {
    }
    
    public void onAddOrderNoteClicked() {
    }
    
    public void onRefundShippingLabelClick(long shippingLabelId) {
    }
    
    public void onPrintShippingLabelClicked(long shippingLabelId) {
    }
    
    public void onPrintCustomsFormClicked(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.ShippingLabel shippingLabel) {
    }
    
    public void onAddShipmentTrackingClicked() {
    }
    
    public void onNewShipmentTrackingAdded(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.OrderShipmentTracking shipmentTracking) {
    }
    
    public void refreshShipmentTracking() {
    }
    
    public void onShippingLabelRefunded() {
    }
    
    public void onShippingLabelsPurchased() {
    }
    
    public void onOrderItemRefunded() {
    }
    
    public void onOrderStatusChanged(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.orders.details.OrderDetailViewModel.OrderStatusUpdateSource updateSource) {
    }
    
    public void onNewOrderNoteAdded(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.OrderNote orderNote) {
    }
    
    public void onDeleteShipmentTrackingClicked(@org.jetbrains.annotations.NotNull
    java.lang.String trackingNumber) {
    }
    
    private void onDeleteShipmentTrackingReverted(com.woocommerce.android.model.OrderShipmentTracking shipmentTracking) {
    }
    
    private void deleteOrderShipmentTracking(com.woocommerce.android.model.OrderShipmentTracking shipmentTracking) {
    }
    
    private void updateOrderStatus(java.lang.String newStatus) {
    }
    
    public void onShippingLabelNoticeTapped() {
    }
    
    public void onCreateShippingLabelButtonTapped() {
    }
    
    public void onMarkOrderCompleteButtonTapped() {
    }
    
    public void onViewOrderedAddonButtonTapped(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.Order.Item orderItem) {
    }
    
    private java.lang.Object updateOrderState(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private java.lang.Object isPaymentCollectable(com.woocommerce.android.model.Order order, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    private void loadOrderNotes() {
    }
    
    private void fetchOrderNotes() {
    }
    
    private com.woocommerce.android.ui.orders.details.OrderDetailViewModel.ListInfo<com.woocommerce.android.model.Refund> loadOrderRefunds() {
        return null;
    }
    
    private com.woocommerce.android.ui.orders.details.OrderDetailViewModel.ListInfo<com.woocommerce.android.model.Order.Item> loadOrderProducts(com.woocommerce.android.ui.orders.details.OrderDetailViewModel.ListInfo<com.woocommerce.android.model.Refund> refunds) {
        return null;
    }
    
    private void checkAddonAvailability(java.util.List<com.woocommerce.android.model.Order.Item> products) {
    }
    
    private kotlinx.coroutines.Deferred<kotlin.Unit> fetchOrderProductsAsync() {
        return null;
    }
    
    private kotlinx.coroutines.Deferred<kotlin.Unit> fetchSLCreationEligibilityAsync() {
        return null;
    }
    
    private com.woocommerce.android.ui.orders.details.OrderDetailViewModel.ListInfo<com.woocommerce.android.model.OrderShipmentTracking> loadShipmentTracking(com.woocommerce.android.ui.orders.details.OrderDetailViewModel.ListInfo<com.woocommerce.android.model.ShippingLabel> shippingLabels) {
        return null;
    }
    
    private kotlinx.coroutines.Deferred<java.util.List<com.woocommerce.android.model.Refund>> fetchOrderRefundsAsync() {
        return null;
    }
    
    private kotlinx.coroutines.Deferred<kotlin.Unit> fetchShipmentTrackingAsync() {
        return null;
    }
    
    private kotlinx.coroutines.Deferred<java.util.List<com.woocommerce.android.model.ShippingLabel>> fetchOrderShippingLabelsAsync() {
        return null;
    }
    
    private com.woocommerce.android.ui.orders.details.OrderDetailViewModel.ListInfo<com.woocommerce.android.model.ShippingLabel> loadOrderShippingLabels() {
        return null;
    }
    
    private java.lang.Object fetchProductAndShippingDetails(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private void displayProductAndShippingDetails() {
    }
    
    @java.lang.Override
    public void onProductFetched(long remoteProductId) {
    }
    
    private java.util.Map<java.lang.String, java.lang.String> prepareTracksEventsDetails(org.wordpress.android.fluxc.store.WCOrderStore.OnOrderChanged event) {
        return null;
    }
    
    public void onCardReaderPaymentCompleted() {
    }
    
    private void reloadOrderDetails() {
    }
    
    public void onWcShippingBannerDismissed() {
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\'\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00a1\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\u0014J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016J\u0010\u0010\'\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016J\u0010\u0010(\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016J\u0010\u0010)\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016J\u0010\u0010-\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016J\u0010\u0010.\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016J\u0010\u0010/\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0002\u0010 J\u0010\u00100\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016J\u0010\u00101\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016J\u00aa\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\tH\u00c6\u0001\u00a2\u0006\u0002\u00103J\t\u00104\u001a\u000205H\u00d6\u0001J\u0013\u00106\u001a\u00020\t2\b\u00107\u001a\u0004\u0018\u000108H\u00d6\u0003J\t\u00109\u001a\u000205H\u00d6\u0001J\t\u0010:\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u000205H\u00d6\u0001R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0018\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u000e\u0010\u0016R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\t8F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016R\u0015\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\b\u0010\u0016R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0011\u0010\u0016R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u000f\u0010\u0016R\u0015\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\n\u0010\u0016R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0012\u0010\u0016R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u000b\u0010\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b$\u0010\u0016\u00a8\u0006@"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/OrderDetailViewModel$ViewState;", "Landroid/os/Parcelable;", "orderInfo", "Lcom/woocommerce/android/ui/orders/details/OrderDetailViewModel$OrderInfo;", "toolbarTitle", "", "orderStatus", "Lcom/woocommerce/android/model/Order$OrderStatus;", "isOrderDetailSkeletonShown", "", "isRefreshing", "isShipmentTrackingAvailable", "refreshedProductId", "", "isCreateShippingLabelButtonVisible", "isProductListVisible", "areShippingLabelsVisible", "isProductListMenuVisible", "isSharePaymentLinkVisible", "wcShippingBannerVisible", "(Lcom/woocommerce/android/ui/orders/details/OrderDetailViewModel$OrderInfo;Ljava/lang/String;Lcom/woocommerce/android/model/Order$OrderStatus;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getAreShippingLabelsVisible", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "isCreateShippingLabelBannerVisible", "()Z", "isMarkOrderCompleteButtonVisible", "getOrderInfo", "()Lcom/woocommerce/android/ui/orders/details/OrderDetailViewModel$OrderInfo;", "getOrderStatus", "()Lcom/woocommerce/android/model/Order$OrderStatus;", "getRefreshedProductId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getToolbarTitle", "()Ljava/lang/String;", "getWcShippingBannerVisible", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/woocommerce/android/ui/orders/details/OrderDetailViewModel$OrderInfo;Ljava/lang/String;Lcom/woocommerce/android/model/Order$OrderStatus;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/woocommerce/android/ui/orders/details/OrderDetailViewModel$ViewState;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class ViewState implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable
        private final com.woocommerce.android.ui.orders.details.OrderDetailViewModel.OrderInfo orderInfo = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String toolbarTitle = null;
        @org.jetbrains.annotations.Nullable
        private final com.woocommerce.android.model.Order.OrderStatus orderStatus = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean isOrderDetailSkeletonShown = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean isRefreshing = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean isShipmentTrackingAvailable = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Long refreshedProductId = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean isCreateShippingLabelButtonVisible = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean isProductListVisible = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean areShippingLabelsVisible = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean isProductListMenuVisible = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean isSharePaymentLinkVisible = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean wcShippingBannerVisible = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.details.OrderDetailViewModel.ViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.details.OrderDetailViewModel.ViewState copy(@org.jetbrains.annotations.Nullable
        com.woocommerce.android.ui.orders.details.OrderDetailViewModel.OrderInfo orderInfo, @org.jetbrains.annotations.Nullable
        java.lang.String toolbarTitle, @org.jetbrains.annotations.Nullable
        com.woocommerce.android.model.Order.OrderStatus orderStatus, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isOrderDetailSkeletonShown, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isRefreshing, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isShipmentTrackingAvailable, @org.jetbrains.annotations.Nullable
        java.lang.Long refreshedProductId, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isCreateShippingLabelButtonVisible, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isProductListVisible, @org.jetbrains.annotations.Nullable
        java.lang.Boolean areShippingLabelsVisible, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isProductListMenuVisible, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isSharePaymentLinkVisible, @org.jetbrains.annotations.Nullable
        java.lang.Boolean wcShippingBannerVisible) {
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
        com.woocommerce.android.ui.orders.details.OrderDetailViewModel.OrderInfo orderInfo, @org.jetbrains.annotations.Nullable
        java.lang.String toolbarTitle, @org.jetbrains.annotations.Nullable
        com.woocommerce.android.model.Order.OrderStatus orderStatus, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isOrderDetailSkeletonShown, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isRefreshing, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isShipmentTrackingAvailable, @org.jetbrains.annotations.Nullable
        java.lang.Long refreshedProductId, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isCreateShippingLabelButtonVisible, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isProductListVisible, @org.jetbrains.annotations.Nullable
        java.lang.Boolean areShippingLabelsVisible, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isProductListMenuVisible, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isSharePaymentLinkVisible, @org.jetbrains.annotations.Nullable
        java.lang.Boolean wcShippingBannerVisible) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.woocommerce.android.ui.orders.details.OrderDetailViewModel.OrderInfo component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.woocommerce.android.ui.orders.details.OrderDetailViewModel.OrderInfo getOrderInfo() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getToolbarTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.woocommerce.android.model.Order.OrderStatus component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.woocommerce.android.model.Order.OrderStatus getOrderStatus() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean isOrderDetailSkeletonShown() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean isRefreshing() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean isShipmentTrackingAvailable() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Long component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Long getRefreshedProductId() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component8() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean isCreateShippingLabelButtonVisible() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component9() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean isProductListVisible() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component10() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean getAreShippingLabelsVisible() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component11() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean isProductListMenuVisible() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component12() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean isSharePaymentLinkVisible() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component13() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean getWcShippingBannerVisible() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean isMarkOrderCompleteButtonVisible() {
            return null;
        }
        
        public final boolean isCreateShippingLabelBannerVisible() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.details.OrderDetailViewModel.ViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.orders.details.OrderDetailViewModel.ViewState createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.orders.details.OrderDetailViewModel.ViewState[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J)\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001c"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/OrderDetailViewModel$OrderInfo;", "Landroid/os/Parcelable;", "order", "Lcom/woocommerce/android/model/Order;", "isPaymentCollectableWithCardReader", "", "isReceiptButtonsVisible", "(Lcom/woocommerce/android/model/Order;ZZ)V", "()Z", "getOrder", "()Lcom/woocommerce/android/model/Order;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class OrderInfo implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable
        private final com.woocommerce.android.model.Order order = null;
        private final boolean isPaymentCollectableWithCardReader = false;
        private final boolean isReceiptButtonsVisible = false;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.details.OrderDetailViewModel.OrderInfo> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.details.OrderDetailViewModel.OrderInfo copy(@org.jetbrains.annotations.Nullable
        com.woocommerce.android.model.Order order, boolean isPaymentCollectableWithCardReader, boolean isReceiptButtonsVisible) {
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
        
        public OrderInfo() {
            super();
        }
        
        public OrderInfo(@org.jetbrains.annotations.Nullable
        com.woocommerce.android.model.Order order, boolean isPaymentCollectableWithCardReader, boolean isReceiptButtonsVisible) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.woocommerce.android.model.Order component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.woocommerce.android.model.Order getOrder() {
            return null;
        }
        
        public final boolean component2() {
            return false;
        }
        
        public final boolean isPaymentCollectableWithCardReader() {
            return false;
        }
        
        public final boolean component3() {
            return false;
        }
        
        public final boolean isReceiptButtonsVisible() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.details.OrderDetailViewModel.OrderInfo> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.orders.details.OrderDetailViewModel.OrderInfo createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.orders.details.OrderDetailViewModel.OrderInfo[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\t\nB\u0017\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u0082\u0001\u0002\u000b\f\u00a8\u0006\r"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/OrderDetailViewModel$OrderStatusUpdateSource;", "Landroid/os/Parcelable;", "oldStatus", "", "newStatus", "(Ljava/lang/String;Ljava/lang/String;)V", "getNewStatus", "()Ljava/lang/String;", "getOldStatus", "Dialog", "FullFillScreen", "Lcom/woocommerce/android/ui/orders/details/OrderDetailViewModel$OrderStatusUpdateSource$FullFillScreen;", "Lcom/woocommerce/android/ui/orders/details/OrderDetailViewModel$OrderStatusUpdateSource$Dialog;", "WooCommerce_wasabiDebug"})
    public static abstract class OrderStatusUpdateSource implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String oldStatus = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String newStatus = null;
        
        private OrderStatusUpdateSource(java.lang.String oldStatus, java.lang.String newStatus) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public java.lang.String getOldStatus() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public java.lang.String getNewStatus() {
            return null;
        }
        
        @kotlinx.parcelize.Parcelize
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\nH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nH\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0016"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/OrderDetailViewModel$OrderStatusUpdateSource$FullFillScreen;", "Lcom/woocommerce/android/ui/orders/details/OrderDetailViewModel$OrderStatusUpdateSource;", "oldStatus", "", "(Ljava/lang/String;)V", "getOldStatus", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
        public static final class FullFillScreen extends com.woocommerce.android.ui.orders.details.OrderDetailViewModel.OrderStatusUpdateSource {
            @org.jetbrains.annotations.NotNull
            private final java.lang.String oldStatus = null;
            public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.details.OrderDetailViewModel.OrderStatusUpdateSource.FullFillScreen> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.orders.details.OrderDetailViewModel.OrderStatusUpdateSource.FullFillScreen copy(@org.jetbrains.annotations.NotNull
            java.lang.String oldStatus) {
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
            
            public FullFillScreen(@org.jetbrains.annotations.NotNull
            java.lang.String oldStatus) {
                super(null, null);
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String getOldStatus() {
                return null;
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
            public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.details.OrderDetailViewModel.OrderStatusUpdateSource.FullFillScreen> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public final com.woocommerce.android.ui.orders.details.OrderDetailViewModel.OrderStatusUpdateSource.FullFillScreen createFromParcel(@org.jetbrains.annotations.NotNull
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public final com.woocommerce.android.ui.orders.details.OrderDetailViewModel.OrderStatusUpdateSource.FullFillScreen[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\rH\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rH\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0019"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/OrderDetailViewModel$OrderStatusUpdateSource$Dialog;", "Lcom/woocommerce/android/ui/orders/details/OrderDetailViewModel$OrderStatusUpdateSource;", "oldStatus", "", "newStatus", "(Ljava/lang/String;Ljava/lang/String;)V", "getNewStatus", "()Ljava/lang/String;", "getOldStatus", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
        public static final class Dialog extends com.woocommerce.android.ui.orders.details.OrderDetailViewModel.OrderStatusUpdateSource {
            @org.jetbrains.annotations.NotNull
            private final java.lang.String oldStatus = null;
            @org.jetbrains.annotations.NotNull
            private final java.lang.String newStatus = null;
            public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.details.OrderDetailViewModel.OrderStatusUpdateSource.Dialog> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.orders.details.OrderDetailViewModel.OrderStatusUpdateSource.Dialog copy(@org.jetbrains.annotations.NotNull
            java.lang.String oldStatus, @org.jetbrains.annotations.NotNull
            java.lang.String newStatus) {
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
            
            public Dialog(@org.jetbrains.annotations.NotNull
            java.lang.String oldStatus, @org.jetbrains.annotations.NotNull
            java.lang.String newStatus) {
                super(null, null);
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String getOldStatus() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String getNewStatus() {
                return null;
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
            public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.details.OrderDetailViewModel.OrderStatusUpdateSource.Dialog> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public final com.woocommerce.android.ui.orders.details.OrderDetailViewModel.OrderStatusUpdateSource.Dialog createFromParcel(@org.jetbrains.annotations.NotNull
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public final com.woocommerce.android.ui.orders.details.OrderDetailViewModel.OrderStatusUpdateSource.Dialog[] newArray(int size) {
                    return null;
                }
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0004H\u00c6\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u00c6\u0003J)\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/OrderDetailViewModel$ListInfo;", "T", "", "isVisible", "", "list", "", "(ZLjava/util/List;)V", "()Z", "getList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
    public static final class ListInfo<T extends java.lang.Object> {
        private final boolean isVisible = false;
        @org.jetbrains.annotations.NotNull
        private final java.util.List<T> list = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.details.OrderDetailViewModel.ListInfo<T> copy(boolean isVisible, @org.jetbrains.annotations.NotNull
        java.util.List<? extends T> list) {
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
        
        public ListInfo() {
            super();
        }
        
        public ListInfo(boolean isVisible, @org.jetbrains.annotations.NotNull
        java.util.List<? extends T> list) {
            super();
        }
        
        public final boolean component1() {
            return false;
        }
        
        public final boolean isVisible() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<T> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<T> getList() {
            return null;
        }
    }
}