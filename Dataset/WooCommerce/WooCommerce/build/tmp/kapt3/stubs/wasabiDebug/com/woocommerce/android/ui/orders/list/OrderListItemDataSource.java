package com.woocommerce.android.ui.orders.list;

import java.lang.System;

/**
 * Works with a [androidx.paging.PagedList] by providing the logic needed to fetch the data used to populate
 * the order list view.
 *
 * @see [ListItemDataSourceInterface] and [org.wordpress.android.fluxc.model.list.datasource.InternalPagedListDataSource]
 * in FluxC to get a better understanding of how this works with the underlying internal list management code.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B-\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J,\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00162\u0006\u0010\u0012\u001a\u00020\u00022\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00162\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J$\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162\u0006\u0010\u0012\u001a\u00020\u00022\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/woocommerce/android/ui/orders/list/OrderListItemDataSource;", "Lorg/wordpress/android/fluxc/model/list/datasource/ListItemDataSourceInterface;", "Lorg/wordpress/android/fluxc/model/WCOrderListDescriptor;", "Lcom/woocommerce/android/ui/orders/list/OrderListItemIdentifier;", "Lcom/woocommerce/android/ui/orders/list/OrderListItemUIType;", "dispatcher", "Lorg/wordpress/android/fluxc/Dispatcher;", "orderStore", "Lorg/wordpress/android/fluxc/store/WCOrderStore;", "networkStatus", "Lcom/woocommerce/android/tools/NetworkStatus;", "fetcher", "Lorg/wordpress/android/fluxc/store/WCOrderFetcher;", "resourceProvider", "Lcom/woocommerce/android/viewmodel/ResourceProvider;", "(Lorg/wordpress/android/fluxc/Dispatcher;Lorg/wordpress/android/fluxc/store/WCOrderStore;Lcom/woocommerce/android/tools/NetworkStatus;Lorg/wordpress/android/fluxc/store/WCOrderFetcher;Lcom/woocommerce/android/viewmodel/ResourceProvider;)V", "fetchList", "", "listDescriptor", "offset", "", "getItemIdentifiers", "", "remoteItemIds", "Lorg/wordpress/android/fluxc/model/LocalOrRemoteId$RemoteId;", "isListFullyFetched", "", "getItemsAndFetchIfNecessary", "itemIdentifiers", "WooCommerce_wasabiDebug"})
public final class OrderListItemDataSource implements org.wordpress.android.fluxc.model.list.datasource.ListItemDataSourceInterface<org.wordpress.android.fluxc.model.WCOrderListDescriptor, com.woocommerce.android.ui.orders.list.OrderListItemIdentifier, com.woocommerce.android.ui.orders.list.OrderListItemUIType> {
    private final org.wordpress.android.fluxc.Dispatcher dispatcher = null;
    private final org.wordpress.android.fluxc.store.WCOrderStore orderStore = null;
    private final com.woocommerce.android.tools.NetworkStatus networkStatus = null;
    private final org.wordpress.android.fluxc.store.WCOrderFetcher fetcher = null;
    private final com.woocommerce.android.viewmodel.ResourceProvider resourceProvider = null;
    
    public OrderListItemDataSource(@org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.Dispatcher dispatcher, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.WCOrderStore orderStore, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.NetworkStatus networkStatus, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.WCOrderFetcher fetcher, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.viewmodel.ResourceProvider resourceProvider) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.util.List<com.woocommerce.android.ui.orders.list.OrderListItemUIType> getItemsAndFetchIfNecessary(@org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.model.WCOrderListDescriptor listDescriptor, @org.jetbrains.annotations.NotNull
    java.util.List<? extends com.woocommerce.android.ui.orders.list.OrderListItemIdentifier> itemIdentifiers) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.Suppress(names = {"LongMethod", "ComplexMethod"})
    @java.lang.Override
    public java.util.List<com.woocommerce.android.ui.orders.list.OrderListItemIdentifier> getItemIdentifiers(@org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.model.WCOrderListDescriptor listDescriptor, @org.jetbrains.annotations.NotNull
    java.util.List<org.wordpress.android.fluxc.model.LocalOrRemoteId.RemoteId> remoteItemIds, boolean isListFullyFetched) {
        return null;
    }
    
    @java.lang.Override
    public void fetchList(@org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.model.WCOrderListDescriptor listDescriptor, long offset) {
    }
}