package com.woocommerce.android.ui.orders.creation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u0002\u0014\u0015B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\nH\u0002J+\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\rH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/woocommerce/android/ui/orders/creation/CreateOrUpdateOrderDraft;", "", "dispatchers", "Lcom/woocommerce/android/util/CoroutineDispatchers;", "orderCreationRepository", "Lcom/woocommerce/android/ui/orders/creation/OrderCreationRepository;", "(Lcom/woocommerce/android/util/CoroutineDispatchers;Lcom/woocommerce/android/ui/orders/creation/OrderCreationRepository;)V", "areEquivalent", "", "old", "Lcom/woocommerce/android/model/Order;", "new", "createOrUpdateDraft", "Lkotlinx/coroutines/flow/Flow;", "Lcom/woocommerce/android/ui/orders/creation/CreateOrUpdateOrderDraft$OrderDraftUpdateStatus;", "order", "invoke", "changes", "retryTrigger", "", "Companion", "OrderDraftUpdateStatus", "WooCommerce_vanillaDebug"})
public final class CreateOrUpdateOrderDraft {
    private final com.woocommerce.android.util.CoroutineDispatchers dispatchers = null;
    private final com.woocommerce.android.ui.orders.creation.OrderCreationRepository orderCreationRepository = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.orders.creation.CreateOrUpdateOrderDraft.Companion Companion = null;
    public static final long DEBOUNCE_DURATION_MS = 500L;
    
    @javax.inject.Inject()
    public CreateOrUpdateOrderDraft(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.CoroutineDispatchers dispatchers, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.orders.creation.OrderCreationRepository orderCreationRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.ExperimentalCoroutinesApi.class})
    public final kotlinx.coroutines.flow.Flow<com.woocommerce.android.ui.orders.creation.CreateOrUpdateOrderDraft.OrderDraftUpdateStatus> invoke(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.Flow<com.woocommerce.android.model.Order> changes, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.Flow<kotlin.Unit> retryTrigger) {
        return null;
    }
    
    private final kotlinx.coroutines.flow.Flow<com.woocommerce.android.ui.orders.creation.CreateOrUpdateOrderDraft.OrderDraftUpdateStatus> createOrUpdateDraft(com.woocommerce.android.model.Order order) {
        return null;
    }
    
    private final boolean areEquivalent(com.woocommerce.android.model.Order old, com.woocommerce.android.model.Order p1_54480) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t\u00a8\u0006\n"}, d2 = {"Lcom/woocommerce/android/ui/orders/creation/CreateOrUpdateOrderDraft$OrderDraftUpdateStatus;", "", "Failed", "Ongoing", "PendingDebounce", "Succeeded", "Lcom/woocommerce/android/ui/orders/creation/CreateOrUpdateOrderDraft$OrderDraftUpdateStatus$PendingDebounce;", "Lcom/woocommerce/android/ui/orders/creation/CreateOrUpdateOrderDraft$OrderDraftUpdateStatus$Ongoing;", "Lcom/woocommerce/android/ui/orders/creation/CreateOrUpdateOrderDraft$OrderDraftUpdateStatus$Succeeded;", "Lcom/woocommerce/android/ui/orders/creation/CreateOrUpdateOrderDraft$OrderDraftUpdateStatus$Failed;", "WooCommerce_vanillaDebug"})
    public static abstract interface OrderDraftUpdateStatus {
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/orders/creation/CreateOrUpdateOrderDraft$OrderDraftUpdateStatus$PendingDebounce;", "Lcom/woocommerce/android/ui/orders/creation/CreateOrUpdateOrderDraft$OrderDraftUpdateStatus;", "()V", "WooCommerce_vanillaDebug"})
        public static final class PendingDebounce implements com.woocommerce.android.ui.orders.creation.CreateOrUpdateOrderDraft.OrderDraftUpdateStatus {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.orders.creation.CreateOrUpdateOrderDraft.OrderDraftUpdateStatus.PendingDebounce INSTANCE = null;
            
            private PendingDebounce() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/orders/creation/CreateOrUpdateOrderDraft$OrderDraftUpdateStatus$Ongoing;", "Lcom/woocommerce/android/ui/orders/creation/CreateOrUpdateOrderDraft$OrderDraftUpdateStatus;", "()V", "WooCommerce_vanillaDebug"})
        public static final class Ongoing implements com.woocommerce.android.ui.orders.creation.CreateOrUpdateOrderDraft.OrderDraftUpdateStatus {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.orders.creation.CreateOrUpdateOrderDraft.OrderDraftUpdateStatus.Ongoing INSTANCE = null;
            
            private Ongoing() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/orders/creation/CreateOrUpdateOrderDraft$OrderDraftUpdateStatus$Succeeded;", "Lcom/woocommerce/android/ui/orders/creation/CreateOrUpdateOrderDraft$OrderDraftUpdateStatus;", "order", "Lcom/woocommerce/android/model/Order;", "(Lcom/woocommerce/android/model/Order;)V", "getOrder", "()Lcom/woocommerce/android/model/Order;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
        public static final class Succeeded implements com.woocommerce.android.ui.orders.creation.CreateOrUpdateOrderDraft.OrderDraftUpdateStatus {
            @org.jetbrains.annotations.NotNull()
            private final com.woocommerce.android.model.Order order = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.creation.CreateOrUpdateOrderDraft.OrderDraftUpdateStatus.Succeeded copy(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.model.Order order) {
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
            
            public Succeeded(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.model.Order order) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.model.Order component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.model.Order getOrder() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/orders/creation/CreateOrUpdateOrderDraft$OrderDraftUpdateStatus$Failed;", "Lcom/woocommerce/android/ui/orders/creation/CreateOrUpdateOrderDraft$OrderDraftUpdateStatus;", "()V", "WooCommerce_vanillaDebug"})
        public static final class Failed implements com.woocommerce.android.ui.orders.creation.CreateOrUpdateOrderDraft.OrderDraftUpdateStatus {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.orders.creation.CreateOrUpdateOrderDraft.OrderDraftUpdateStatus.Failed INSTANCE = null;
            
            private Failed() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/orders/creation/CreateOrUpdateOrderDraft$Companion;", "", "()V", "DEBOUNCE_DURATION_MS", "", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}