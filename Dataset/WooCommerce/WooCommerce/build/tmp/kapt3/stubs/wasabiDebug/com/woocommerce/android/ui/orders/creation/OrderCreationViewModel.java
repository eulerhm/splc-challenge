package com.woocommerce.android.ui.orders.creation;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00c2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0007\u0018\u0000 l2\u00020\u0001:\u0003lmnBG\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\u000e\u0010=\u001a\u00020+2\u0006\u0010>\u001a\u00020?J\b\u0010@\u001a\u00020/H\u0002J\u0006\u0010A\u001a\u00020/J\u0006\u0010B\u001a\u00020/J\u000e\u0010C\u001a\u00020/2\u0006\u0010D\u001a\u00020\u0015J\u0016\u0010E\u001a\u00020/2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020GJ\u0006\u0010I\u001a\u00020/J\u0006\u0010J\u001a\u00020/J\u000e\u0010K\u001a\u00020/2\u0006\u0010L\u001a\u00020MJ\u000e\u0010N\u001a\u00020/2\u0006\u0010O\u001a\u00020PJ\u000e\u0010Q\u001a\u00020/2\u0006\u0010R\u001a\u00020\'J\u0006\u0010S\u001a\u00020/J\u000e\u0010T\u001a\u00020/2\u0006\u0010U\u001a\u00020VJ\u0006\u0010W\u001a\u00020/J\u000e\u0010X\u001a\u00020/2\u0006\u0010O\u001a\u00020PJ\u000e\u0010Y\u001a\u00020/2\u0006\u0010Z\u001a\u00020[J\u000e\u0010\\\u001a\u00020/2\u0006\u0010>\u001a\u00020?J\u001f\u0010]\u001a\u00020/2\u0006\u0010^\u001a\u00020P2\n\b\u0002\u0010_\u001a\u0004\u0018\u00010P\u00a2\u0006\u0002\u0010`J\u000e\u0010a\u001a\u00020/2\u0006\u0010>\u001a\u00020?J\u0006\u0010b\u001a\u00020/J\u0006\u0010c\u001a\u00020/J\u0016\u0010d\u001a\u00020/2\u0006\u0010e\u001a\u00020V2\u0006\u0010f\u001a\u00020MJ\u0006\u0010g\u001a\u00020/J\b\u0010h\u001a\u00020/H\u0002J\u0010\u0010i\u001a\u00020/2\u0006\u0010j\u001a\u00020kH\u0002R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u001c\u001a\u00020\u00158F\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00150#\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\'0#\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010%R\u001d\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0*0#\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010%R\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u00102\u001a\u0002012\u0006\u00100\u001a\u0002018B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0017\u00109\u001a\b\u0012\u0004\u0012\u0002010:\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010<\u00a8\u0006o"}, d2 = {"Lcom/woocommerce/android/ui/orders/creation/OrderCreationViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "dispatchers", "Lcom/woocommerce/android/util/CoroutineDispatchers;", "orderDetailRepository", "Lcom/woocommerce/android/ui/orders/details/OrderDetailRepository;", "orderCreationRepository", "Lcom/woocommerce/android/ui/orders/creation/OrderCreationRepository;", "mapItemToProductUiModel", "Lcom/woocommerce/android/ui/orders/creation/MapItemToProductUiModel;", "createOrUpdateOrderDraft", "Lcom/woocommerce/android/ui/orders/creation/CreateOrUpdateOrderDraft;", "createOrderItem", "Lcom/woocommerce/android/ui/orders/creation/CreateOrderItem;", "parameterRepository", "Lcom/woocommerce/android/ui/products/ParameterRepository;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/util/CoroutineDispatchers;Lcom/woocommerce/android/ui/orders/details/OrderDetailRepository;Lcom/woocommerce/android/ui/orders/creation/OrderCreationRepository;Lcom/woocommerce/android/ui/orders/creation/MapItemToProductUiModel;Lcom/woocommerce/android/ui/orders/creation/CreateOrUpdateOrderDraft;Lcom/woocommerce/android/ui/orders/creation/CreateOrderItem;Lcom/woocommerce/android/ui/products/ParameterRepository;)V", "_orderDraft", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/woocommerce/android/model/Order;", "args", "Lcom/woocommerce/android/ui/orders/creation/OrderCreationFormFragmentArgs;", "getArgs", "()Lcom/woocommerce/android/ui/orders/creation/OrderCreationFormFragmentArgs;", "args$delegate", "Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "currentDraft", "getCurrentDraft", "()Lcom/woocommerce/android/model/Order;", "initialOrder", "mode", "Lcom/woocommerce/android/ui/orders/creation/OrderCreationViewModel$Mode;", "orderDraft", "Landroidx/lifecycle/LiveData;", "getOrderDraft", "()Landroidx/lifecycle/LiveData;", "orderStatusData", "Lcom/woocommerce/android/model/Order$OrderStatus;", "getOrderStatusData", "products", "", "Lcom/woocommerce/android/ui/orders/creation/ProductUIModel;", "getProducts", "retryOrderDraftUpdateTrigger", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "<set-?>", "Lcom/woocommerce/android/ui/orders/creation/OrderCreationViewModel$ViewState;", "viewState", "getViewState", "()Lcom/woocommerce/android/ui/orders/creation/OrderCreationViewModel$ViewState;", "setViewState", "(Lcom/woocommerce/android/ui/orders/creation/OrderCreationViewModel$ViewState;)V", "viewState$delegate", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "viewStateData", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getViewStateData", "()Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getProductUIModelFromItem", "item", "Lcom/woocommerce/android/model/Order$Item;", "monitorOrderChanges", "onAddProductClicked", "onBackButtonClicked", "onCreateOrderClicked", "order", "onCustomerAddressEdited", "billingAddress", "Lcom/woocommerce/android/model/Address;", "shippingAddress", "onCustomerClicked", "onCustomerNoteClicked", "onCustomerNoteEdited", "newNote", "", "onDecreaseProductsQuantity", "id", "", "onEditOrderStatusClicked", "currentStatus", "onFeeButtonClicked", "onFeeEdited", "feeValue", "Ljava/math/BigDecimal;", "onFeeRemoved", "onIncreaseProductsQuantity", "onOrderStatusChanged", "status", "Lcom/woocommerce/android/model/Order$Status;", "onProductClicked", "onProductSelected", "remoteProductId", "variationId", "(JLjava/lang/Long;)V", "onRemoveProduct", "onRetryPaymentsClicked", "onShippingButtonClicked", "onShippingEdited", "amount", "name", "onShippingRemoved", "trackCreateOrderButtonClick", "trackOrderCreationFailure", "it", "", "Companion", "Mode", "ViewState", "WooCommerce_wasabiDebug"})
public final class OrderCreationViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.util.CoroutineDispatchers dispatchers = null;
    private final com.woocommerce.android.ui.orders.details.OrderDetailRepository orderDetailRepository = null;
    private final com.woocommerce.android.ui.orders.creation.OrderCreationRepository orderCreationRepository = null;
    private final com.woocommerce.android.ui.orders.creation.MapItemToProductUiModel mapItemToProductUiModel = null;
    private final com.woocommerce.android.ui.orders.creation.CreateOrUpdateOrderDraft createOrUpdateOrderDraft = null;
    private final com.woocommerce.android.ui.orders.creation.CreateOrderItem createOrderItem = null;
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.orders.creation.OrderCreationViewModel.Companion Companion = null;
    private static final java.lang.String PARAMETERS_KEY = "parameters_key";
    private static final java.lang.String ORDER_CUSTOM_FEE_NAME = "order_custom_fee";
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.creation.OrderCreationViewModel.ViewState> viewStateData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate viewState$delegate = null;
    private final com.woocommerce.android.viewmodel.NavArgsLazy args$delegate = null;
    private final com.woocommerce.android.ui.orders.creation.OrderCreationViewModel.Mode mode = null;
    private com.woocommerce.android.model.Order initialOrder;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.woocommerce.android.model.Order> _orderDraft = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.woocommerce.android.model.Order> orderDraft = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.woocommerce.android.model.Order.OrderStatus> orderStatusData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.ui.orders.creation.ProductUIModel>> products = null;
    private final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> retryOrderDraftUpdateTrigger = null;
    
    @javax.inject.Inject
    public OrderCreationViewModel(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.CoroutineDispatchers dispatchers, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.orders.details.OrderDetailRepository orderDetailRepository, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.orders.creation.OrderCreationRepository orderCreationRepository, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.orders.creation.MapItemToProductUiModel mapItemToProductUiModel, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.orders.creation.CreateOrUpdateOrderDraft createOrUpdateOrderDraft, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.orders.creation.CreateOrderItem createOrderItem, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.ParameterRepository parameterRepository) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.creation.OrderCreationViewModel.ViewState> getViewStateData() {
        return null;
    }
    
    private final com.woocommerce.android.ui.orders.creation.OrderCreationViewModel.ViewState getViewState() {
        return null;
    }
    
    private final void setViewState(com.woocommerce.android.ui.orders.creation.OrderCreationViewModel.ViewState p0) {
    }
    
    private final com.woocommerce.android.ui.orders.creation.OrderCreationFormFragmentArgs getArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.woocommerce.android.model.Order> getOrderDraft() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.woocommerce.android.model.Order.OrderStatus> getOrderStatusData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.ui.orders.creation.ProductUIModel>> getProducts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.ui.orders.creation.ProductUIModel getProductUIModelFromItem(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.Order.Item item) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.model.Order getCurrentDraft() {
        return null;
    }
    
    public final void onCustomerNoteEdited(@org.jetbrains.annotations.NotNull
    java.lang.String newNote) {
    }
    
    public final void onIncreaseProductsQuantity(long id) {
    }
    
    public final void onDecreaseProductsQuantity(long id) {
    }
    
    public final void onOrderStatusChanged(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.Order.Status status) {
    }
    
    public final void onRemoveProduct(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.Order.Item item) {
    }
    
    public final void onProductSelected(long remoteProductId, @org.jetbrains.annotations.Nullable
    java.lang.Long variationId) {
    }
    
    public final void onCustomerAddressEdited(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.Address billingAddress, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.Address shippingAddress) {
    }
    
    public final void onEditOrderStatusClicked(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.Order.OrderStatus currentStatus) {
    }
    
    public final void onCustomerClicked() {
    }
    
    public final void onCustomerNoteClicked() {
    }
    
    public final void onAddProductClicked() {
    }
    
    public final void onProductClicked(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.Order.Item item) {
    }
    
    public final void onRetryPaymentsClicked() {
    }
    
    public final void onFeeButtonClicked() {
    }
    
    public final void onShippingButtonClicked() {
    }
    
    public final void onCreateOrderClicked(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.Order order) {
    }
    
    public final void onBackButtonClicked() {
    }
    
    /**
     * Monitor order changes, and update the remote draft to update price totals
     */
    private final void monitorOrderChanges() {
    }
    
    private final void trackOrderCreationFailure(java.lang.Throwable it) {
    }
    
    private final void trackCreateOrderButtonClick() {
    }
    
    public final void onShippingEdited(@org.jetbrains.annotations.NotNull
    java.math.BigDecimal amount, @org.jetbrains.annotations.NotNull
    java.lang.String name) {
    }
    
    public final void onShippingRemoved() {
    }
    
    public final void onFeeEdited(@org.jetbrains.annotations.NotNull
    java.math.BigDecimal feeValue) {
    }
    
    public final void onFeeRemoved() {
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019H\u00d6\u0001R\u0017\u0010\t\u001a\u00020\u0003\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\rR\u0017\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\r\u00a8\u0006%"}, d2 = {"Lcom/woocommerce/android/ui/orders/creation/OrderCreationViewModel$ViewState;", "Landroid/os/Parcelable;", "isProgressDialogShown", "", "willUpdateOrderDraft", "isUpdatingOrderDraft", "showOrderUpdateSnackbar", "isEditable", "(ZZZZZ)V", "canCreateOrder", "getCanCreateOrder$annotations", "()V", "getCanCreateOrder", "()Z", "isIdle", "isIdle$annotations", "getShowOrderUpdateSnackbar", "getWillUpdateOrderDraft", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class ViewState implements android.os.Parcelable {
        private final boolean isProgressDialogShown = false;
        private final boolean willUpdateOrderDraft = false;
        private final boolean isUpdatingOrderDraft = false;
        private final boolean showOrderUpdateSnackbar = false;
        private final boolean isEditable = false;
        private final boolean canCreateOrder = false;
        private final boolean isIdle = false;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.creation.OrderCreationViewModel.ViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.creation.OrderCreationViewModel.ViewState copy(boolean isProgressDialogShown, boolean willUpdateOrderDraft, boolean isUpdatingOrderDraft, boolean showOrderUpdateSnackbar, boolean isEditable) {
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
        
        public ViewState(boolean isProgressDialogShown, boolean willUpdateOrderDraft, boolean isUpdatingOrderDraft, boolean showOrderUpdateSnackbar, boolean isEditable) {
            super();
        }
        
        public final boolean component1() {
            return false;
        }
        
        public final boolean isProgressDialogShown() {
            return false;
        }
        
        public final boolean component2() {
            return false;
        }
        
        public final boolean getWillUpdateOrderDraft() {
            return false;
        }
        
        public final boolean component3() {
            return false;
        }
        
        public final boolean isUpdatingOrderDraft() {
            return false;
        }
        
        public final boolean component4() {
            return false;
        }
        
        public final boolean getShowOrderUpdateSnackbar() {
            return false;
        }
        
        public final boolean component5() {
            return false;
        }
        
        public final boolean isEditable() {
            return false;
        }
        
        public final boolean getCanCreateOrder() {
            return false;
        }
        
        @kotlinx.parcelize.IgnoredOnParcel
        @java.lang.Deprecated
        public static void getCanCreateOrder$annotations() {
        }
        
        public final boolean isIdle() {
            return false;
        }
        
        @kotlinx.parcelize.IgnoredOnParcel
        @java.lang.Deprecated
        public static void isIdle$annotations() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.creation.OrderCreationViewModel.ViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.orders.creation.OrderCreationViewModel.ViewState createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.orders.creation.OrderCreationViewModel.ViewState[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/ui/orders/creation/OrderCreationViewModel$Mode;", "Landroid/os/Parcelable;", "()V", "Creation", "Edit", "Lcom/woocommerce/android/ui/orders/creation/OrderCreationViewModel$Mode$Creation;", "Lcom/woocommerce/android/ui/orders/creation/OrderCreationViewModel$Mode$Edit;", "WooCommerce_wasabiDebug"})
    public static abstract class Mode implements android.os.Parcelable {
        
        private Mode() {
            super();
        }
        
        @kotlinx.parcelize.Parcelize
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u00d6\u0001\u00a8\u0006\n"}, d2 = {"Lcom/woocommerce/android/ui/orders/creation/OrderCreationViewModel$Mode$Creation;", "Lcom/woocommerce/android/ui/orders/creation/OrderCreationViewModel$Mode;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
        public static final class Creation extends com.woocommerce.android.ui.orders.creation.OrderCreationViewModel.Mode {
            @org.jetbrains.annotations.NotNull
            public static final com.woocommerce.android.ui.orders.creation.OrderCreationViewModel.Mode.Creation INSTANCE = null;
            public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.creation.OrderCreationViewModel.Mode.Creation> CREATOR = null;
            
            private Creation() {
                super();
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
            public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.creation.OrderCreationViewModel.Mode.Creation> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public final com.woocommerce.android.ui.orders.creation.OrderCreationViewModel.Mode.Creation createFromParcel(@org.jetbrains.annotations.NotNull
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public final com.woocommerce.android.ui.orders.creation.OrderCreationViewModel.Mode.Creation[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\nH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Lcom/woocommerce/android/ui/orders/creation/OrderCreationViewModel$Mode$Edit;", "Lcom/woocommerce/android/ui/orders/creation/OrderCreationViewModel$Mode;", "orderId", "", "(J)V", "getOrderId", "()J", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
        public static final class Edit extends com.woocommerce.android.ui.orders.creation.OrderCreationViewModel.Mode {
            private final long orderId = 0L;
            public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.creation.OrderCreationViewModel.Mode.Edit> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.orders.creation.OrderCreationViewModel.Mode.Edit copy(long orderId) {
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
            
            public Edit(long orderId) {
                super();
            }
            
            public final long component1() {
                return 0L;
            }
            
            public final long getOrderId() {
                return 0L;
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
            public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.creation.OrderCreationViewModel.Mode.Edit> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public final com.woocommerce.android.ui.orders.creation.OrderCreationViewModel.Mode.Edit createFromParcel(@org.jetbrains.annotations.NotNull
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public final com.woocommerce.android.ui.orders.creation.OrderCreationViewModel.Mode.Edit[] newArray(int size) {
                    return null;
                }
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/woocommerce/android/ui/orders/creation/OrderCreationViewModel$Companion;", "", "()V", "ORDER_CUSTOM_FEE_NAME", "", "PARAMETERS_KEY", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}