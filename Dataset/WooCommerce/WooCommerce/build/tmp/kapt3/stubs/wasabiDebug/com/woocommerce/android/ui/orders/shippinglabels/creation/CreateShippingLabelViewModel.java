package com.woocommerce.android.ui.orders.shippinglabels.creation;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlinx.coroutines.ExperimentalCoroutinesApi
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00ae\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u0097\u00012\u00020\u0001:\u000e\u0097\u0001\u0098\u0001\u0099\u0001\u009a\u0001\u009b\u0001\u009c\u0001\u009d\u0001Bg\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u00a2\u0006\u0002\u0010\u001aJ\u0010\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020BH\u0002J\b\u0010C\u001a\u00020@H\u0002JC\u0010D\u001a\u00020E2\b\b\u0003\u0010F\u001a\u00020G2\b\b\u0003\u0010H\u001a\u00020G2\u001c\u0010I\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020L0K\u0012\u0006\u0012\u0004\u0018\u00010M0JH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010NJ\b\u0010O\u001a\u00020EH\u0002J\u0019\u0010P\u001a\u00020L2\u0006\u0010Q\u001a\u00020RH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010SJ\u0006\u0010T\u001a\u00020EJ\u000e\u0010U\u001a\u00020E2\u0006\u0010V\u001a\u00020@J\u0006\u0010W\u001a\u00020EJ\b\u0010X\u001a\u00020EH\u0014J\u000e\u0010Y\u001a\u00020E2\u0006\u0010Z\u001a\u00020[J\u0006\u0010\\\u001a\u00020EJ\u0014\u0010]\u001a\u00020E2\f\u0010^\u001a\b\u0012\u0004\u0012\u00020`0_J\u000e\u0010a\u001a\u00020E2\u0006\u0010Z\u001a\u00020[J\u0006\u0010b\u001a\u00020EJ\u0014\u0010c\u001a\u00020E2\f\u0010d\u001a\b\u0012\u0004\u0012\u00020e0_J\u0006\u0010f\u001a\u00020EJ\u000e\u0010g\u001a\u00020E2\u0006\u0010h\u001a\u00020iJ\u000e\u0010j\u001a\u00020E2\u0006\u0010k\u001a\u00020lJ\u0006\u0010m\u001a\u00020EJ\u0014\u0010n\u001a\u00020E2\f\u0010o\u001a\b\u0012\u0004\u0012\u00020p0_J\u000e\u0010q\u001a\u00020E2\u0006\u0010V\u001a\u00020@J\u0006\u0010r\u001a\u00020EJ\u000e\u0010s\u001a\u00020E2\u0006\u0010V\u001a\u00020@J\u0006\u0010t\u001a\u00020EJ4\u0010u\u001a\u00020E2\u0006\u0010v\u001a\u0002052\u0006\u0010w\u001a\u0002052\f\u0010x\u001a\b\u0012\u0004\u0012\u00020e0_2\f\u0010^\u001a\b\u0012\u0004\u0012\u00020`0_H\u0002J\u0016\u0010y\u001a\u00020E2\f\u0010z\u001a\b\u0012\u0004\u0012\u00020e0_H\u0002J\b\u0010{\u001a\u00020EH\u0002J\u001e\u0010|\u001a\u00020E2\u0006\u0010Q\u001a\u00020R2\f\u0010}\u001a\b\u0012\u0004\u0012\u00020~0_H\u0002J\u0012\u0010\u007f\u001a\u00020E2\b\u0010\u0080\u0001\u001a\u00030\u0081\u0001H\u0002J%\u0010\u0082\u0001\u001a\u00020L2\b\u0010\u0080\u0001\u001a\u00030\u0081\u00012\u0006\u0010k\u001a\u00020lH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0083\u0001J\u0007\u0010\u0084\u0001\u001a\u00020EJ\u0013\u0010\u0085\u0001\u001a\u00020E2\b\u0010\u0086\u0001\u001a\u00030\u0087\u0001H\u0002J\u0016\u0010\u0088\u0001\u001a\u00020E2\u000b\u0010Z\u001a\u0007\u0012\u0002\b\u00030\u0089\u0001H\u0002J\t\u0010\u008a\u0001\u001a\u00020EH\u0002J\u001b\u0010\u008b\u0001\u001a\u00020E2\b\u0010\u008c\u0001\u001a\u00030\u008d\u00012\u0006\u0010k\u001a\u00020lH\u0002J\u0011\u0010\u008e\u0001\u001a\u00020E2\u0006\u0010Z\u001a\u00020[H\u0002J\u0013\u0010\u008f\u0001\u001a\u00020E2\b\u0010\u0090\u0001\u001a\u00030\u0081\u0001H\u0002J.\u0010\u0091\u0001\u001a\u00020L2\u0006\u0010V\u001a\u00020@2\b\u0010\u0092\u0001\u001a\u00030\u0093\u00012\u0007\u0010\u0094\u0001\u001a\u00020lH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0095\u0001J\u000e\u0010\u0096\u0001\u001a\u000205*\u00030\u008d\u0001H\u0002R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010!\u001a\u00020\"8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b#\u0010$R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010)\u001a\u00020(2\u0006\u0010\'\u001a\u00020(8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020(01\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u00104\u001a\u000205*\u0002068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b7\u00108R\u0018\u00104\u001a\u000205*\u0002098BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b7\u0010:R\u0018\u00104\u001a\u000205*\u00020;8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b7\u0010<R\u001a\u00104\u001a\u0004\u0018\u000105*\u00020=8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b7\u0010>\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u009e\u0001"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "parameterRepository", "Lcom/woocommerce/android/ui/products/ParameterRepository;", "orderDetailRepository", "Lcom/woocommerce/android/ui/orders/details/OrderDetailRepository;", "shippingLabelRepository", "Lcom/woocommerce/android/ui/orders/shippinglabels/ShippingLabelRepository;", "stateMachine", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine;", "addressValidator", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelAddressValidator;", "site", "Lcom/woocommerce/android/tools/SelectedSite;", "wooStore", "Lorg/wordpress/android/fluxc/store/WooCommerceStore;", "accountStore", "Lorg/wordpress/android/fluxc/store/AccountStore;", "resourceProvider", "Lcom/woocommerce/android/viewmodel/ResourceProvider;", "currencyFormatter", "Lcom/woocommerce/android/util/CurrencyFormatter;", "getLocations", "Lcom/woocommerce/android/model/GetLocations;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/ui/products/ParameterRepository;Lcom/woocommerce/android/ui/orders/details/OrderDetailRepository;Lcom/woocommerce/android/ui/orders/shippinglabels/ShippingLabelRepository;Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine;Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelAddressValidator;Lcom/woocommerce/android/tools/SelectedSite;Lorg/wordpress/android/fluxc/store/WooCommerceStore;Lorg/wordpress/android/fluxc/store/AccountStore;Lcom/woocommerce/android/viewmodel/ResourceProvider;Lcom/woocommerce/android/util/CurrencyFormatter;Lcom/woocommerce/android/model/GetLocations;)V", "arguments", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelFragmentArgs;", "getArguments", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelFragmentArgs;", "arguments$delegate", "Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "parameters", "Lcom/woocommerce/android/ui/products/models/SiteParameters;", "getParameters", "()Lcom/woocommerce/android/ui/products/models/SiteParameters;", "parameters$delegate", "Lkotlin/Lazy;", "<set-?>", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelViewModel$ViewState;", "viewState", "getViewState", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelViewModel$ViewState;", "setViewState", "(Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelViewModel$ViewState;)V", "viewState$delegate", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "viewStateData", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getViewStateData", "()Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "stepDescription", "", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Step$CarrierStep;", "getStepDescription", "(Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Step$CarrierStep;)Ljava/lang/String;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Step$CustomsStep;", "(Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Step$CustomsStep;)Ljava/lang/String;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Step$PackagingStep;", "(Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Step$PackagingStep;)Ljava/lang/String;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Step$PaymentsStep;", "(Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Step$PaymentsStep;)Ljava/lang/String;", "getShippingAddress", "Lcom/woocommerce/android/model/Address;", "order", "Lcom/woocommerce/android/model/Order;", "getStoreAddress", "handleResult", "", "progressDialogTitle", "", "progressDialogMessage", "action", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event;", "", "(IILkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initializeStateMachine", "loadData", "orderId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onAddressEditCanceled", "onAddressEditConfirmed", "address", "onBackButtonClicked", "onCleared", "onContinueButtonTapped", "step", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelViewModel$FlowStep;", "onCustomsEditCanceled", "onCustomsFilledOut", "customsPackages", "", "Lcom/woocommerce/android/model/CustomsPackage;", "onEditButtonTapped", "onPackagesEditCanceled", "onPackagesUpdated", "packages", "Lcom/woocommerce/android/model/ShippingLabelPackage;", "onPaymentsEditCanceled", "onPaymentsUpdated", "paymentMethod", "Lcom/woocommerce/android/model/PaymentMethod;", "onPurchaseButtonClicked", "fulfillOrder", "", "onShippingCarrierSelectionCanceled", "onShippingCarriersSelected", "rates", "Lcom/woocommerce/android/model/ShippingRate;", "onSuggestedAddressAccepted", "onSuggestedAddressDiscarded", "onSuggestedAddressEditRequested", "onWooDiscountInfoClicked", "openCustomsForm", "originCountryCode", "destinationCountryCode", "shippingPackages", "openPackagesDetails", "currentShippingPackages", "openPaymentDetails", "openPrintLabelsScreen", "labels", "Lcom/woocommerce/android/model/ShippingLabel;", "openShippingCarrierRates", "data", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StateMachineData;", "purchaseLabels", "(Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StateMachineData;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retry", "showError", "error", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Error;", "trackCompletedStep", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Step;", "trackFlowStart", "trackPurchaseInitiated", "amount", "Ljava/math/BigDecimal;", "trackStartedStep", "updateViewState", "stateMachineData", "validateAddress", "type", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelAddressValidator$AddressType;", "isCustomsFormRequired", "(Lcom/woocommerce/android/model/Address;Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelAddressValidator$AddressType;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "format", "Companion", "FlowStep", "OrderSummaryState", "ProgressDialogState", "StepUiState", "UiState", "ViewState", "WooCommerce_wasabiDebug"})
public final class CreateShippingLabelViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.ui.orders.details.OrderDetailRepository orderDetailRepository = null;
    private final com.woocommerce.android.ui.orders.shippinglabels.ShippingLabelRepository shippingLabelRepository = null;
    private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine stateMachine = null;
    private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressValidator addressValidator = null;
    private final com.woocommerce.android.tools.SelectedSite site = null;
    private final org.wordpress.android.fluxc.store.WooCommerceStore wooStore = null;
    private final org.wordpress.android.fluxc.store.AccountStore accountStore = null;
    private final com.woocommerce.android.viewmodel.ResourceProvider resourceProvider = null;
    private final com.woocommerce.android.util.CurrencyFormatter currencyFormatter = null;
    private final com.woocommerce.android.model.GetLocations getLocations = null;
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.Companion Companion = null;
    private static final java.lang.String STATE_KEY = "state";
    private static final java.lang.String KEY_SHIPPING_LABELS_PARAMETERS = "key_shipping_labels_parameters";
    private final kotlin.Lazy parameters$delegate = null;
    private final com.woocommerce.android.viewmodel.NavArgsLazy arguments$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.ViewState> viewStateData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate viewState$delegate = null;
    
    @javax.inject.Inject
    public CreateShippingLabelViewModel(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.ParameterRepository parameterRepository, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.orders.details.OrderDetailRepository orderDetailRepository, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.orders.shippinglabels.ShippingLabelRepository shippingLabelRepository, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine stateMachine, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressValidator addressValidator, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.SelectedSite site, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.WooCommerceStore wooStore, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.AccountStore accountStore, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.viewmodel.ResourceProvider resourceProvider, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.CurrencyFormatter currencyFormatter, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.GetLocations getLocations) {
        super(null);
    }
    
    private final com.woocommerce.android.ui.products.models.SiteParameters getParameters() {
        return null;
    }
    
    private final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelFragmentArgs getArguments() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.ViewState> getViewStateData() {
        return null;
    }
    
    private final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.ViewState getViewState() {
        return null;
    }
    
    private final void setViewState(com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.ViewState p0) {
    }
    
    private final void initializeStateMachine() {
    }
    
    private final void trackFlowStart() {
    }
    
    private final void trackPurchaseInitiated(java.math.BigDecimal amount, boolean fulfillOrder) {
    }
    
    private final void trackCompletedStep(com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step<?> step) {
    }
    
    private final void trackStartedStep(com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.FlowStep step) {
    }
    
    private final java.lang.Object handleResult(@androidx.annotation.StringRes
    int progressDialogTitle, @androidx.annotation.StringRes
    int progressDialogMessage, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event>, ? extends java.lang.Object> action, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final void openShippingCarrierRates(com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData data) {
    }
    
    private final void openPackagesDetails(java.util.List<com.woocommerce.android.model.ShippingLabelPackage> currentShippingPackages) {
    }
    
    private final void openCustomsForm(java.lang.String originCountryCode, java.lang.String destinationCountryCode, java.util.List<com.woocommerce.android.model.ShippingLabelPackage> shippingPackages, java.util.List<com.woocommerce.android.model.CustomsPackage> customsPackages) {
    }
    
    private final void openPaymentDetails() {
    }
    
    private final void openPrintLabelsScreen(long orderId, java.util.List<com.woocommerce.android.model.ShippingLabel> labels) {
    }
    
    private final void updateViewState(com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData stateMachineData) {
    }
    
    private final void showError(com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Error error) {
    }
    
    private final java.lang.Object loadData(long orderId, kotlin.coroutines.Continuation<? super com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event> continuation) {
        return null;
    }
    
    private final com.woocommerce.android.model.Address getStoreAddress() {
        return null;
    }
    
    private final com.woocommerce.android.model.Address getShippingAddress(com.woocommerce.android.model.Order order) {
        return null;
    }
    
    private final java.lang.Object validateAddress(com.woocommerce.android.model.Address address, com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressValidator.AddressType type, boolean isCustomsFormRequired, kotlin.coroutines.Continuation<? super com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event> continuation) {
        return null;
    }
    
    private final java.lang.Object purchaseLabels(com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData data, boolean fulfillOrder, kotlin.coroutines.Continuation<? super com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event> continuation) {
        return null;
    }
    
    private final java.lang.String getStepDescription(com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.PackagingStep $this$stepDescription) {
        return null;
    }
    
    private final java.lang.String getStepDescription(com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.PaymentsStep $this$stepDescription) {
        return null;
    }
    
    private final java.lang.String getStepDescription(com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.CarrierStep $this$stepDescription) {
        return null;
    }
    
    private final java.lang.String getStepDescription(com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.CustomsStep $this$stepDescription) {
        return null;
    }
    
    public final void retry() {
    }
    
    public final void onAddressEditConfirmed(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.Address address) {
    }
    
    public final void onAddressEditCanceled() {
    }
    
    public final void onSuggestedAddressDiscarded() {
    }
    
    public final void onSuggestedAddressAccepted(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.Address address) {
    }
    
    public final void onSuggestedAddressEditRequested(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.Address address) {
    }
    
    public final void onPackagesUpdated(@org.jetbrains.annotations.NotNull
    java.util.List<com.woocommerce.android.model.ShippingLabelPackage> packages) {
    }
    
    public final void onPackagesEditCanceled() {
    }
    
    public final void onPaymentsUpdated(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.PaymentMethod paymentMethod) {
    }
    
    public final void onPaymentsEditCanceled() {
    }
    
    public final void onShippingCarriersSelected(@org.jetbrains.annotations.NotNull
    java.util.List<com.woocommerce.android.model.ShippingRate> rates) {
    }
    
    public final void onShippingCarrierSelectionCanceled() {
    }
    
    public final void onCustomsFilledOut(@org.jetbrains.annotations.NotNull
    java.util.List<com.woocommerce.android.model.CustomsPackage> customsPackages) {
    }
    
    public final void onCustomsEditCanceled() {
    }
    
    public final void onWooDiscountInfoClicked() {
    }
    
    public final void onPurchaseButtonClicked(boolean fulfillOrder) {
    }
    
    public final void onEditButtonTapped(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.FlowStep step) {
    }
    
    public final void onContinueButtonTapped(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.FlowStep step) {
    }
    
    public final void onBackButtonClicked() {
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    private final java.lang.String format(java.math.BigDecimal $this$format) {
        return null;
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010$\u001a\u00020\fH\u00c6\u0003J\t\u0010%\u001a\u00020\u000eH\u00c6\u0003Jo\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u00c6\u0001J\t\u0010\'\u001a\u00020(H\u00d6\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u00d6\u0003J\t\u0010-\u001a\u00020(H\u00d6\u0001J\t\u0010.\u001a\u00020/H\u00d6\u0001J\u0019\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020(H\u00d6\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c\u00a8\u00065"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelViewModel$ViewState;", "Landroid/os/Parcelable;", "uiState", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelViewModel$UiState;", "originAddressStep", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelViewModel$StepUiState;", "shippingAddressStep", "packagingDetailsStep", "customsStep", "carrierStep", "paymentStep", "orderSummaryState", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelViewModel$OrderSummaryState;", "progressDialogState", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelViewModel$ProgressDialogState;", "(Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelViewModel$UiState;Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelViewModel$StepUiState;Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelViewModel$StepUiState;Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelViewModel$StepUiState;Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelViewModel$StepUiState;Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelViewModel$StepUiState;Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelViewModel$StepUiState;Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelViewModel$OrderSummaryState;Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelViewModel$ProgressDialogState;)V", "getCarrierStep", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelViewModel$StepUiState;", "getCustomsStep", "getOrderSummaryState", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelViewModel$OrderSummaryState;", "getOriginAddressStep", "getPackagingDetailsStep", "getPaymentStep", "getProgressDialogState", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelViewModel$ProgressDialogState;", "getShippingAddressStep", "getUiState", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelViewModel$UiState;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class ViewState implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.UiState uiState = null;
        @org.jetbrains.annotations.Nullable
        private final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.StepUiState originAddressStep = null;
        @org.jetbrains.annotations.Nullable
        private final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.StepUiState shippingAddressStep = null;
        @org.jetbrains.annotations.Nullable
        private final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.StepUiState packagingDetailsStep = null;
        @org.jetbrains.annotations.Nullable
        private final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.StepUiState customsStep = null;
        @org.jetbrains.annotations.Nullable
        private final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.StepUiState carrierStep = null;
        @org.jetbrains.annotations.Nullable
        private final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.StepUiState paymentStep = null;
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.OrderSummaryState orderSummaryState = null;
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.ProgressDialogState progressDialogState = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.ViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.ViewState copy(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.UiState uiState, @org.jetbrains.annotations.Nullable
        com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.StepUiState originAddressStep, @org.jetbrains.annotations.Nullable
        com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.StepUiState shippingAddressStep, @org.jetbrains.annotations.Nullable
        com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.StepUiState packagingDetailsStep, @org.jetbrains.annotations.Nullable
        com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.StepUiState customsStep, @org.jetbrains.annotations.Nullable
        com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.StepUiState carrierStep, @org.jetbrains.annotations.Nullable
        com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.StepUiState paymentStep, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.OrderSummaryState orderSummaryState, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.ProgressDialogState progressDialogState) {
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
        
        public ViewState(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.UiState uiState, @org.jetbrains.annotations.Nullable
        com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.StepUiState originAddressStep, @org.jetbrains.annotations.Nullable
        com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.StepUiState shippingAddressStep, @org.jetbrains.annotations.Nullable
        com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.StepUiState packagingDetailsStep, @org.jetbrains.annotations.Nullable
        com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.StepUiState customsStep, @org.jetbrains.annotations.Nullable
        com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.StepUiState carrierStep, @org.jetbrains.annotations.Nullable
        com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.StepUiState paymentStep, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.OrderSummaryState orderSummaryState, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.ProgressDialogState progressDialogState) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.UiState component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.UiState getUiState() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.StepUiState component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.StepUiState getOriginAddressStep() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.StepUiState component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.StepUiState getShippingAddressStep() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.StepUiState component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.StepUiState getPackagingDetailsStep() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.StepUiState component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.StepUiState getCustomsStep() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.StepUiState component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.StepUiState getCarrierStep() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.StepUiState component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.StepUiState getPaymentStep() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.OrderSummaryState component8() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.OrderSummaryState getOrderSummaryState() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.ProgressDialogState component9() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.ProgressDialogState getProgressDialogState() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.ViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.ViewState createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.ViewState[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelViewModel$UiState;", "", "(Ljava/lang/String;I)V", "Loading", "Failed", "WaitingForInput", "WooCommerce_wasabiDebug"})
    public static enum UiState {
        /*public static final*/ Loading /* = new Loading() */,
        /*public static final*/ Failed /* = new Failed() */,
        /*public static final*/ WaitingForInput /* = new WaitingForInput() */;
        
        UiState() {
        }
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\t\u0010\u0010\u001a\u00020\u0005H\u00d6\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n\u00a8\u0006\u001c"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelViewModel$ProgressDialogState;", "Landroid/os/Parcelable;", "isShown", "", "title", "", "message", "(ZII)V", "()Z", "getMessage", "()I", "getTitle", "component1", "component2", "component3", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class ProgressDialogState implements android.os.Parcelable {
        private final boolean isShown = false;
        private final int title = 0;
        private final int message = 0;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.ProgressDialogState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.ProgressDialogState copy(boolean isShown, @androidx.annotation.StringRes
        int title, @androidx.annotation.StringRes
        int message) {
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
        
        public ProgressDialogState() {
            super();
        }
        
        public ProgressDialogState(boolean isShown, @androidx.annotation.StringRes
        int title, @androidx.annotation.StringRes
        int message) {
            super();
        }
        
        public final boolean component1() {
            return false;
        }
        
        public final boolean isShown() {
            return false;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int getTitle() {
            return 0;
        }
        
        public final int component3() {
            return 0;
        }
        
        public final int getMessage() {
            return 0;
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.ProgressDialogState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.ProgressDialogState createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.ProgressDialogState[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\u0015\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003JI\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\u0013\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u00d6\u0003J\t\u0010 \u001a\u00020\u001cH\u00d6\u0001J\t\u0010!\u001a\u00020\u000bH\u00d6\u0001J\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001cH\u00d6\u0001R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010\u00a8\u0006\'"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelViewModel$OrderSummaryState;", "Landroid/os/Parcelable;", "isVisible", "", "individualPackagesPrices", "", "Lcom/woocommerce/android/model/ShippingLabelPackage;", "Ljava/math/BigDecimal;", "price", "discount", "currency", "", "(ZLjava/util/Map;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;)V", "getCurrency", "()Ljava/lang/String;", "getDiscount", "()Ljava/math/BigDecimal;", "getIndividualPackagesPrices", "()Ljava/util/Map;", "()Z", "getPrice", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class OrderSummaryState implements android.os.Parcelable {
        private final boolean isVisible = false;
        @org.jetbrains.annotations.NotNull
        private final java.util.Map<com.woocommerce.android.model.ShippingLabelPackage, java.math.BigDecimal> individualPackagesPrices = null;
        @org.jetbrains.annotations.NotNull
        private final java.math.BigDecimal price = null;
        @org.jetbrains.annotations.NotNull
        private final java.math.BigDecimal discount = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String currency = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.OrderSummaryState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.OrderSummaryState copy(boolean isVisible, @org.jetbrains.annotations.NotNull
        java.util.Map<com.woocommerce.android.model.ShippingLabelPackage, ? extends java.math.BigDecimal> individualPackagesPrices, @org.jetbrains.annotations.NotNull
        java.math.BigDecimal price, @org.jetbrains.annotations.NotNull
        java.math.BigDecimal discount, @org.jetbrains.annotations.Nullable
        java.lang.String currency) {
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
        
        public OrderSummaryState() {
            super();
        }
        
        public OrderSummaryState(boolean isVisible, @org.jetbrains.annotations.NotNull
        java.util.Map<com.woocommerce.android.model.ShippingLabelPackage, ? extends java.math.BigDecimal> individualPackagesPrices, @org.jetbrains.annotations.NotNull
        java.math.BigDecimal price, @org.jetbrains.annotations.NotNull
        java.math.BigDecimal discount, @org.jetbrains.annotations.Nullable
        java.lang.String currency) {
            super();
        }
        
        public final boolean component1() {
            return false;
        }
        
        public final boolean isVisible() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.Map<com.woocommerce.android.model.ShippingLabelPackage, java.math.BigDecimal> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.Map<com.woocommerce.android.model.ShippingLabelPackage, java.math.BigDecimal> getIndividualPackagesPrices() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigDecimal component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigDecimal getPrice() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigDecimal component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigDecimal getDiscount() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getCurrency() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.OrderSummaryState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.OrderSummaryState createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.OrderSummaryState[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0001$BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJT\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0017J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0019H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0007\u0010\rR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\b\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0006\u0010\rR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\t\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000f\u00a8\u0006%"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelViewModel$StepUiState;", "Landroid/os/Parcelable;", "isVisible", "", "details", "", "isEnabled", "isContinueButtonVisible", "isEditButtonVisible", "isHighlighted", "(ZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getDetails", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(ZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelViewModel$StepUiState;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "WooCommerce_wasabiDebug"})
    public static final class StepUiState implements android.os.Parcelable {
        private final boolean isVisible = false;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String details = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean isEnabled = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean isContinueButtonVisible = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean isEditButtonVisible = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean isHighlighted = null;
        @org.jetbrains.annotations.NotNull
        public static final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.StepUiState.Companion Companion = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.StepUiState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.StepUiState copy(boolean isVisible, @org.jetbrains.annotations.Nullable
        java.lang.String details, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isEnabled, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isContinueButtonVisible, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isEditButtonVisible, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isHighlighted) {
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
        
        public StepUiState() {
            super();
        }
        
        public StepUiState(boolean isVisible, @org.jetbrains.annotations.Nullable
        java.lang.String details, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isEnabled, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isContinueButtonVisible, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isEditButtonVisible, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isHighlighted) {
            super();
        }
        
        public final boolean component1() {
            return false;
        }
        
        public final boolean isVisible() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getDetails() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean isEnabled() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean isContinueButtonVisible() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean isEditButtonVisible() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean isHighlighted() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.StepUiState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.StepUiState createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.StepUiState[] newArray(int size) {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0006\u0010\b\u001a\u00020\u0004J\u0012\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a8\u0006\n"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelViewModel$StepUiState$Companion;", "", "()V", "current", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelViewModel$StepUiState;", "newDetails", "", "done", "hide", "notDone", "WooCommerce_wasabiDebug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.StepUiState hide() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.StepUiState notDone(@org.jetbrains.annotations.Nullable
            java.lang.String newDetails) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.StepUiState current(@org.jetbrains.annotations.Nullable
            java.lang.String newDetails) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.StepUiState done(@org.jetbrains.annotations.Nullable
            java.lang.String newDetails) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelViewModel$FlowStep;", "", "(Ljava/lang/String;I)V", "ORIGIN_ADDRESS", "SHIPPING_ADDRESS", "PACKAGING", "CUSTOMS", "CARRIER", "PAYMENT", "WooCommerce_wasabiDebug"})
    public static enum FlowStep {
        /*public static final*/ ORIGIN_ADDRESS /* = new ORIGIN_ADDRESS() */,
        /*public static final*/ SHIPPING_ADDRESS /* = new SHIPPING_ADDRESS() */,
        /*public static final*/ PACKAGING /* = new PACKAGING() */,
        /*public static final*/ CUSTOMS /* = new CUSTOMS() */,
        /*public static final*/ CARRIER /* = new CARRIER() */,
        /*public static final*/ PAYMENT /* = new PAYMENT() */;
        
        FlowStep() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelViewModel$Companion;", "", "()V", "KEY_SHIPPING_LABELS_PARAMETERS", "", "STATE_KEY", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}