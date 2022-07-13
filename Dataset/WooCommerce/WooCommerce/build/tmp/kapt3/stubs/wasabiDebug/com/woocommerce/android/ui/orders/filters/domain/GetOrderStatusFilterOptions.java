package com.woocommerce.android.ui.orders.filters.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/woocommerce/android/ui/orders/filters/domain/GetOrderStatusFilterOptions;", "", "orderListRepository", "Lcom/woocommerce/android/ui/orders/list/OrderListRepository;", "orderFiltersRepository", "Lcom/woocommerce/android/ui/orders/filters/data/OrderFiltersRepository;", "(Lcom/woocommerce/android/ui/orders/list/OrderListRepository;Lcom/woocommerce/android/ui/orders/filters/data/OrderFiltersRepository;)V", "checkIfSelected", "", "filterKey", "", "invoke", "", "Lcom/woocommerce/android/ui/orders/filters/data/OrderStatusOption;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "WooCommerce_wasabiDebug"})
public final class GetOrderStatusFilterOptions {
    private final com.woocommerce.android.ui.orders.list.OrderListRepository orderListRepository = null;
    private final com.woocommerce.android.ui.orders.filters.data.OrderFiltersRepository orderFiltersRepository = null;
    
    @javax.inject.Inject
    public GetOrderStatusFilterOptions(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.orders.list.OrderListRepository orderListRepository, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.orders.filters.data.OrderFiltersRepository orderFiltersRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.woocommerce.android.ui.orders.filters.data.OrderStatusOption>> continuation) {
        return null;
    }
    
    private final boolean checkIfSelected(java.lang.String filterKey) {
        return false;
    }
}