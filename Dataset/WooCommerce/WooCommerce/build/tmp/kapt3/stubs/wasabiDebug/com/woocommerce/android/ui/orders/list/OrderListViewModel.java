package com.woocommerce.android.ui.orders.list;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Suppress(names = {"LeakingThis"})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00f6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0088\u0001\u0089\u0001Bo\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u00a2\u0006\u0002\u0010\u001dJ \u0010i\u001a\u00020j2\f\u0010k\u001a\b\u0012\u0004\u0012\u000201032\b\b\u0002\u0010l\u001a\u00020\'H\u0012J\u0018\u0010m\u001a\u00020j2\u000e\u0010k\u001a\n\u0012\u0004\u0012\u000201\u0018\u000103H\u0012J\u0016\u0010n\u001a\u00020j2\f\u0010o\u001a\b\u0012\u0004\u0012\u00020103H\u0017J\b\u0010p\u001a\u00020jH\u0016J\b\u0010q\u001a\u00020jH\u0016J\u0011\u0010r\u001a\u00020jH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010sJ\b\u0010t\u001a\u00020uH\u0016J\b\u0010v\u001a\u00020\'H\u0016J\u0016\u0010w\u001a\u00020j2\f\u0010o\u001a\b\u0012\u0004\u0012\u00020103H\u0012J\b\u0010x\u001a\u00020jH\u0016J\b\u0010y\u001a\u00020jH\u0014J\u0010\u0010z\u001a\u00020j2\u0006\u0010{\u001a\u00020|H\u0017J\b\u0010}\u001a\u00020jH\u0016J\u0010\u0010~\u001a\u00020j2\u0006\u0010{\u001a\u00020\u007fH\u0017J\u0012\u0010\u0080\u0001\u001a\u00020j2\u0007\u0010{\u001a\u00030\u0081\u0001H\u0017J\u0012\u0010\u0082\u0001\u001a\u00020j2\u0007\u0010{\u001a\u00030\u0083\u0001H\u0017J\t\u0010\u0084\u0001\u001a\u00020jH\u0016J\u0011\u0010\u0085\u0001\u001a\u00020-2\u0006\u0010W\u001a\u00020-H\u0012J\t\u0010\u0086\u0001\u001a\u00020jH\u0012J\u0011\u0010\u0087\u0001\u001a\u00020j2\u0006\u0010W\u001a\u00020-H\u0016R#\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u001f8RX\u0092\u0084\u0002\u00a2\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\'0&X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020\'0&X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020\'0&X\u0092\u0004\u00a2\u0006\u0002\n\u0000R \u0010*\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020.0,0+X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000201000&X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\"\u00102\u001a\n\u0012\u0004\u0012\u000201\u0018\u000103X\u0090\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u000e\u0010\u0017\u001a\u00020\u0018X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u00108\u001a\u0002098RX\u0092\u0084\u0002\u00a2\u0006\f\n\u0004\b<\u0010$\u001a\u0004\b:\u0010;R\u000e\u0010\u000f\u001a\u00020\u0010X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0>X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u000e\u0010\u0013\u001a\u00020\u0014X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\'0>X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010@R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\'0>X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010@R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\'0>X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010@R\u001a\u0010D\u001a\u00020\'X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001b\u0010H\u001a\u00020I8TX\u0094\u0084\u0002\u00a2\u0006\f\n\u0004\bL\u0010$\u001a\u0004\bJ\u0010KR\u000e\u0010\u000b\u001a\u00020\fX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u0010NR&\u0010O\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020.0,0>X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u0010@R\u000e\u0010\t\u001a\u00020\nX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010Q\u001a\n\u0012\u0004\u0012\u000201\u0018\u000103X\u0090\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u00105\"\u0004\bS\u00107R$\u0010T\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020100j\u0002`U0>X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u0010@R\u000e\u0010\u0015\u001a\u00020\u0016X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010W\u001a\u00020-X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u000e\u0010\u0011\u001a\u00020\u0012X\u0092\u0004\u00a2\u0006\u0002\n\u0000R+\u0010^\u001a\u00020]2\u0006\u0010\\\u001a\u00020]8P@PX\u0090\u008e\u0002\u00a2\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u0017\u0010e\u001a\b\u0012\u0004\u0012\u00020]0f\u00a2\u0006\b\n\u0000\u001a\u0004\bg\u0010h\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u008a\u0001"}, d2 = {"Lcom/woocommerce/android/ui/orders/list/OrderListViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "Landroidx/lifecycle/LifecycleOwner;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "dispatchers", "Lcom/woocommerce/android/util/CoroutineDispatchers;", "orderListRepository", "Lcom/woocommerce/android/ui/orders/list/OrderListRepository;", "orderStore", "Lorg/wordpress/android/fluxc/store/WCOrderStore;", "listStore", "Lorg/wordpress/android/fluxc/store/ListStore;", "networkStatus", "Lcom/woocommerce/android/tools/NetworkStatus;", "dispatcher", "Lorg/wordpress/android/fluxc/Dispatcher;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "fetcher", "Lorg/wordpress/android/fluxc/store/WCOrderFetcher;", "resourceProvider", "Lcom/woocommerce/android/viewmodel/ResourceProvider;", "appPrefsWrapper", "Lcom/woocommerce/android/AppPrefsWrapper;", "getWCOrderListDescriptorWithFilters", "Lcom/woocommerce/android/ui/orders/filters/domain/GetWCOrderListDescriptorWithFilters;", "getSelectedOrderFiltersCount", "Lcom/woocommerce/android/ui/orders/filters/domain/GetSelectedOrderFiltersCount;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/util/CoroutineDispatchers;Lcom/woocommerce/android/ui/orders/list/OrderListRepository;Lorg/wordpress/android/fluxc/store/WCOrderStore;Lorg/wordpress/android/fluxc/store/ListStore;Lcom/woocommerce/android/tools/NetworkStatus;Lorg/wordpress/android/fluxc/Dispatcher;Lcom/woocommerce/android/tools/SelectedSite;Lorg/wordpress/android/fluxc/store/WCOrderFetcher;Lcom/woocommerce/android/viewmodel/ResourceProvider;Lcom/woocommerce/android/AppPrefsWrapper;Lcom/woocommerce/android/ui/orders/filters/domain/GetWCOrderListDescriptorWithFilters;Lcom/woocommerce/android/ui/orders/filters/domain/GetSelectedOrderFiltersCount;)V", "_emptyViewType", "Lcom/woocommerce/android/util/ThrottleLiveData;", "Lcom/woocommerce/android/widgets/WCEmptyView$EmptyViewType;", "get_emptyViewType", "()Lcom/woocommerce/android/util/ThrottleLiveData;", "_emptyViewType$delegate", "Lkotlin/Lazy;", "_isEmpty", "Landroidx/lifecycle/MediatorLiveData;", "", "_isFetchingFirstPage", "_isLoadingMore", "_orderStatusOptions", "Landroidx/lifecycle/MutableLiveData;", "", "", "Lorg/wordpress/android/fluxc/model/WCOrderStatusModel;", "_pagedListData", "Landroidx/paging/PagedList;", "Lcom/woocommerce/android/ui/orders/list/OrderListItemUIType;", "activePagedListWrapper", "Lorg/wordpress/android/fluxc/model/list/PagedListWrapper;", "getActivePagedListWrapper$WooCommerce_wasabiDebug", "()Lorg/wordpress/android/fluxc/model/list/PagedListWrapper;", "setActivePagedListWrapper$WooCommerce_wasabiDebug", "(Lorg/wordpress/android/fluxc/model/list/PagedListWrapper;)V", "dataSource", "Lcom/woocommerce/android/ui/orders/list/OrderListItemDataSource;", "getDataSource", "()Lcom/woocommerce/android/ui/orders/list/OrderListItemDataSource;", "dataSource$delegate", "emptyViewType", "Landroidx/lifecycle/LiveData;", "getEmptyViewType", "()Landroidx/lifecycle/LiveData;", "isEmpty", "isFetchingFirstPage", "isLoadingMore", "isSearching", "()Z", "setSearching", "(Z)V", "lifecycleRegistry", "Landroidx/lifecycle/LifecycleRegistry;", "getLifecycleRegistry", "()Landroidx/lifecycle/LifecycleRegistry;", "lifecycleRegistry$delegate", "getOrderListRepository", "()Lcom/woocommerce/android/ui/orders/list/OrderListRepository;", "orderStatusOptions", "getOrderStatusOptions", "ordersPagedListWrapper", "getOrdersPagedListWrapper$WooCommerce_wasabiDebug", "setOrdersPagedListWrapper$WooCommerce_wasabiDebug", "pagedListData", "Lcom/woocommerce/android/ui/orders/list/PagedOrdersList;", "getPagedListData", "searchQuery", "getSearchQuery", "()Ljava/lang/String;", "setSearchQuery", "(Ljava/lang/String;)V", "<set-?>", "Lcom/woocommerce/android/ui/orders/list/OrderListViewModel$ViewState;", "viewState", "getViewState$WooCommerce_wasabiDebug", "()Lcom/woocommerce/android/ui/orders/list/OrderListViewModel$ViewState;", "setViewState$WooCommerce_wasabiDebug", "(Lcom/woocommerce/android/ui/orders/list/OrderListViewModel$ViewState;)V", "viewState$delegate", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "viewStateLiveData", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getViewStateLiveData", "()Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "activatePagedListWrapper", "", "pagedListWrapper", "isFirstInit", "clearLiveDataSources", "createAndPostEmptyViewType", "wrapper", "fetchOrderStatusOptions", "fetchOrdersAndOrderDependencies", "fetchPaymentGateways", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLifecycle", "Landroidx/lifecycle/Lifecycle;", "isCardReaderOnboardingCompleted", "listenToEmptyViewStateLiveData", "loadOrders", "onCleared", "onEventMainThread", "event", "Lcom/woocommerce/android/network/ConnectionChangeReceiver$ConnectionChangeEvent;", "onFiltersButtonTapped", "onNotificationReceived", "Lcom/woocommerce/android/extensions/NotificationReceivedEvent;", "onOrderChanged", "Lorg/wordpress/android/fluxc/store/WCOrderStore$OnOrderChanged;", "onOrderSummariesFetched", "Lorg/wordpress/android/fluxc/store/WCOrderStore$OnOrderSummariesFetched;", "onSearchClosed", "sanitizeSearchQuery", "showOfflineSnack", "submitSearchOrFilter", "OrderListEvent", "ViewState", "WooCommerce_wasabiDebug"})
@com.woocommerce.android.annotations.OpenClassOnDebug
public class OrderListViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel implements androidx.lifecycle.LifecycleOwner {
    private final com.woocommerce.android.util.CoroutineDispatchers dispatchers = null;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.ui.orders.list.OrderListRepository orderListRepository = null;
    private final org.wordpress.android.fluxc.store.WCOrderStore orderStore = null;
    private final org.wordpress.android.fluxc.store.ListStore listStore = null;
    private final com.woocommerce.android.tools.NetworkStatus networkStatus = null;
    private final org.wordpress.android.fluxc.Dispatcher dispatcher = null;
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    private final org.wordpress.android.fluxc.store.WCOrderFetcher fetcher = null;
    private final com.woocommerce.android.viewmodel.ResourceProvider resourceProvider = null;
    private final com.woocommerce.android.AppPrefsWrapper appPrefsWrapper = null;
    private final com.woocommerce.android.ui.orders.filters.domain.GetWCOrderListDescriptorWithFilters getWCOrderListDescriptorWithFilters = null;
    private final com.woocommerce.android.ui.orders.filters.domain.GetSelectedOrderFiltersCount getSelectedOrderFiltersCount = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy lifecycleRegistry$delegate = null;
    @org.jetbrains.annotations.Nullable
    private org.wordpress.android.fluxc.model.list.PagedListWrapper<com.woocommerce.android.ui.orders.list.OrderListItemUIType> ordersPagedListWrapper;
    @org.jetbrains.annotations.Nullable
    private org.wordpress.android.fluxc.model.list.PagedListWrapper<com.woocommerce.android.ui.orders.list.OrderListItemUIType> activePagedListWrapper;
    private final kotlin.Lazy dataSource$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.list.OrderListViewModel.ViewState> viewStateLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.viewmodel.LiveDataDelegate viewState$delegate = null;
    private final androidx.lifecycle.MediatorLiveData<androidx.paging.PagedList<com.woocommerce.android.ui.orders.list.OrderListItemUIType>> _pagedListData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<androidx.paging.PagedList<com.woocommerce.android.ui.orders.list.OrderListItemUIType>> pagedListData = null;
    private final androidx.lifecycle.MediatorLiveData<java.lang.Boolean> _isLoadingMore = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isLoadingMore = null;
    private final androidx.lifecycle.MediatorLiveData<java.lang.Boolean> _isFetchingFirstPage = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isFetchingFirstPage = null;
    private final androidx.lifecycle.MutableLiveData<java.util.Map<java.lang.String, org.wordpress.android.fluxc.model.WCOrderStatusModel>> _orderStatusOptions = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.Map<java.lang.String, org.wordpress.android.fluxc.model.WCOrderStatusModel>> orderStatusOptions = null;
    private final androidx.lifecycle.MediatorLiveData<java.lang.Boolean> _isEmpty = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isEmpty = null;
    private final kotlin.Lazy _emptyViewType$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.woocommerce.android.widgets.WCEmptyView.EmptyViewType> emptyViewType = null;
    private boolean isSearching = false;
    @org.jetbrains.annotations.NotNull
    private java.lang.String searchQuery = "";
    
    @javax.inject.Inject
    public OrderListViewModel(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.CoroutineDispatchers dispatchers, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.orders.list.OrderListRepository orderListRepository, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.WCOrderStore orderStore, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.ListStore listStore, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.NetworkStatus networkStatus, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.Dispatcher dispatcher, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.SelectedSite selectedSite, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.WCOrderFetcher fetcher, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.viewmodel.ResourceProvider resourceProvider, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.AppPrefsWrapper appPrefsWrapper, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.orders.filters.domain.GetWCOrderListDescriptorWithFilters getWCOrderListDescriptorWithFilters, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.orders.filters.domain.GetSelectedOrderFiltersCount getSelectedOrderFiltersCount) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    protected com.woocommerce.android.ui.orders.list.OrderListRepository getOrderListRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected androidx.lifecycle.LifecycleRegistry getLifecycleRegistry() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.lifecycle.Lifecycle getLifecycle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public org.wordpress.android.fluxc.model.list.PagedListWrapper<com.woocommerce.android.ui.orders.list.OrderListItemUIType> getOrdersPagedListWrapper$WooCommerce_wasabiDebug() {
        return null;
    }
    
    public void setOrdersPagedListWrapper$WooCommerce_wasabiDebug(@org.jetbrains.annotations.Nullable
    org.wordpress.android.fluxc.model.list.PagedListWrapper<com.woocommerce.android.ui.orders.list.OrderListItemUIType> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public org.wordpress.android.fluxc.model.list.PagedListWrapper<com.woocommerce.android.ui.orders.list.OrderListItemUIType> getActivePagedListWrapper$WooCommerce_wasabiDebug() {
        return null;
    }
    
    public void setActivePagedListWrapper$WooCommerce_wasabiDebug(@org.jetbrains.annotations.Nullable
    org.wordpress.android.fluxc.model.list.PagedListWrapper<com.woocommerce.android.ui.orders.list.OrderListItemUIType> p0) {
    }
    
    private com.woocommerce.android.ui.orders.list.OrderListItemDataSource getDataSource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.list.OrderListViewModel.ViewState> getViewStateLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public com.woocommerce.android.ui.orders.list.OrderListViewModel.ViewState getViewState$WooCommerce_wasabiDebug() {
        return null;
    }
    
    public void setViewState$WooCommerce_wasabiDebug(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.orders.list.OrderListViewModel.ViewState p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public androidx.lifecycle.LiveData<androidx.paging.PagedList<com.woocommerce.android.ui.orders.list.OrderListItemUIType>> getPagedListData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public androidx.lifecycle.LiveData<java.lang.Boolean> isLoadingMore() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public androidx.lifecycle.LiveData<java.lang.Boolean> isFetchingFirstPage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public androidx.lifecycle.LiveData<java.util.Map<java.lang.String, org.wordpress.android.fluxc.model.WCOrderStatusModel>> getOrderStatusOptions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public androidx.lifecycle.LiveData<java.lang.Boolean> isEmpty() {
        return null;
    }
    
    private com.woocommerce.android.util.ThrottleLiveData<com.woocommerce.android.widgets.WCEmptyView.EmptyViewType> get_emptyViewType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public androidx.lifecycle.LiveData<com.woocommerce.android.widgets.WCEmptyView.EmptyViewType> getEmptyViewType() {
        return null;
    }
    
    public boolean isSearching() {
        return false;
    }
    
    public void setSearching(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public java.lang.String getSearchQuery() {
        return null;
    }
    
    public void setSearchQuery(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public void loadOrders() {
    }
    
    /**
     * Creates and activates a new list with the search and filter params provided. This should only be used
     * by the search component portion of the order list view.
     *
     * NOTE: Although technically the "PROCESSING" tab is a filtered list, it should not use this method. The
     * processing list will always use the same [processingPagedListWrapper].
     */
    public void submitSearchOrFilter(@org.jetbrains.annotations.NotNull
    java.lang.String searchQuery) {
    }
    
    /**
     * Removes the `#` from the start of the search keyword, if present.
     *
     * This allows searching for an order with `#123` and getting the results for order `123`.
     * See https://github.com/woocommerce/woocommerce-android/issues/2621
     */
    private java.lang.String sanitizeSearchQuery(java.lang.String searchQuery) {
        return null;
    }
    
    /**
     * Refresh the active order list with fresh data from the API as well as refresh order status
     * options and payment gateways if the network is available.
     */
    public void fetchOrdersAndOrderDependencies() {
    }
    
    /**
     * Fetch payment gateways so they are available for order refunds later
     */
    @org.jetbrains.annotations.Nullable
    public java.lang.Object fetchPaymentGateways(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    /**
     * Refresh the order count by order status list with fresh data from the API
     */
    public void fetchOrderStatusOptions() {
    }
    
    /**
     * Activates the provided list by first removing the LiveData sources for the active list,
     * then creating new LiveData sources for the provided [pagedListWrapper] and setting it as
     * the active list. If [isFirstInit] is true, then this [pagedListWrapper] is freshly created
     * so we'll need to call `fetchOrdersAndOrderDependencies` to initialize it.
     */
    private void activatePagedListWrapper(org.wordpress.android.fluxc.model.list.PagedListWrapper<com.woocommerce.android.ui.orders.list.OrderListItemUIType> pagedListWrapper, boolean isFirstInit) {
    }
    
    private void clearLiveDataSources(org.wordpress.android.fluxc.model.list.PagedListWrapper<com.woocommerce.android.ui.orders.list.OrderListItemUIType> pagedListWrapper) {
    }
    
    /**
     * Builds the function for handling empty view state scenarios and links the various [LiveData] feeds as
     * a source for the [_emptyViewType] LivData object.
     */
    private void listenToEmptyViewStateLiveData(org.wordpress.android.fluxc.model.list.PagedListWrapper<com.woocommerce.android.ui.orders.list.OrderListItemUIType> wrapper) {
    }
    
    @androidx.annotation.VisibleForTesting(otherwise = androidx.annotation.VisibleForTesting.PRIVATE)
    public void createAndPostEmptyViewType(@org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.model.list.PagedListWrapper<com.woocommerce.android.ui.orders.list.OrderListItemUIType> wrapper) {
    }
    
    private void showOfflineSnack() {
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    @kotlin.Suppress(names = {"unused"})
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public void onOrderChanged(@org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.WCOrderStore.OnOrderChanged event) {
    }
    
    @kotlin.Suppress(names = {"unused"})
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public void onEventMainThread(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.network.ConnectionChangeReceiver.ConnectionChangeEvent event) {
    }
    
    @kotlin.Suppress(names = {"unused"})
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public void onNotificationReceived(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.extensions.NotificationReceivedEvent event) {
    }
    
    @java.lang.SuppressWarnings(value = {"unused"})
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public void onOrderSummariesFetched(@org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.WCOrderStore.OnOrderSummariesFetched event) {
    }
    
    public void onFiltersButtonTapped() {
    }
    
    public void onSearchClosed() {
    }
    
    public boolean isCardReaderOnboardingCompleted() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/ui/orders/list/OrderListViewModel$OrderListEvent;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "()V", "ShowErrorSnack", "ShowOrderFilters", "Lcom/woocommerce/android/ui/orders/list/OrderListViewModel$OrderListEvent$ShowErrorSnack;", "Lcom/woocommerce/android/ui/orders/list/OrderListViewModel$OrderListEvent$ShowOrderFilters;", "WooCommerce_wasabiDebug"})
    public static abstract class OrderListEvent extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        
        private OrderListEvent() {
            super(false);
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/woocommerce/android/ui/orders/list/OrderListViewModel$OrderListEvent$ShowErrorSnack;", "Lcom/woocommerce/android/ui/orders/list/OrderListViewModel$OrderListEvent;", "messageRes", "", "(I)V", "getMessageRes", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "WooCommerce_wasabiDebug"})
        public static final class ShowErrorSnack extends com.woocommerce.android.ui.orders.list.OrderListViewModel.OrderListEvent {
            private final int messageRes = 0;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.orders.list.OrderListViewModel.OrderListEvent.ShowErrorSnack copy(@androidx.annotation.StringRes
            int messageRes) {
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
            
            public ShowErrorSnack(@androidx.annotation.StringRes
            int messageRes) {
                super();
            }
            
            public final int component1() {
                return 0;
            }
            
            public final int getMessageRes() {
                return 0;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/orders/list/OrderListViewModel$OrderListEvent$ShowOrderFilters;", "Lcom/woocommerce/android/ui/orders/list/OrderListViewModel$OrderListEvent;", "()V", "WooCommerce_wasabiDebug"})
        public static final class ShowOrderFilters extends com.woocommerce.android.ui.orders.list.OrderListViewModel.OrderListEvent {
            @org.jetbrains.annotations.NotNull
            public static final com.woocommerce.android.ui.orders.list.OrderListViewModel.OrderListEvent.ShowOrderFilters INSTANCE = null;
            
            private ShowOrderFilters() {
                super();
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\t\u0010\u0010\u001a\u00020\u0006H\u00d6\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\t\u00a8\u0006\u001c"}, d2 = {"Lcom/woocommerce/android/ui/orders/list/OrderListViewModel$ViewState;", "Landroid/os/Parcelable;", "isRefreshPending", "", "arePaymentGatewaysFetched", "filterCount", "", "(ZZI)V", "getArePaymentGatewaysFetched", "()Z", "getFilterCount", "()I", "component1", "component2", "component3", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class ViewState implements android.os.Parcelable {
        private final boolean isRefreshPending = false;
        private final boolean arePaymentGatewaysFetched = false;
        private final int filterCount = 0;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.list.OrderListViewModel.ViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.list.OrderListViewModel.ViewState copy(boolean isRefreshPending, boolean arePaymentGatewaysFetched, int filterCount) {
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
        
        public ViewState(boolean isRefreshPending, boolean arePaymentGatewaysFetched, int filterCount) {
            super();
        }
        
        public final boolean component1() {
            return false;
        }
        
        public final boolean isRefreshPending() {
            return false;
        }
        
        public final boolean component2() {
            return false;
        }
        
        public final boolean getArePaymentGatewaysFetched() {
            return false;
        }
        
        public final int component3() {
            return 0;
        }
        
        public final int getFilterCount() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.list.OrderListViewModel.ViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.orders.list.OrderListViewModel.ViewState createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.orders.list.OrderListViewModel.ViewState[] newArray(int size) {
                return null;
            }
        }
    }
}