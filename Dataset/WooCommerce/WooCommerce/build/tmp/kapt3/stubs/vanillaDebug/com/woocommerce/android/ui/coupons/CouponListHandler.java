package com.woocommerce.android.ui.coupons;

import java.lang.System;

@kotlin.OptIn(markerClass = {kotlinx.coroutines.ExperimentalCoroutinesApi.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J8\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0018\u001a\u00020\u0006H\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\"\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0082@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u001f\u0010\u001dJ\"\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0082@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\b!\u0010\u001dR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006#"}, d2 = {"Lcom/woocommerce/android/ui/coupons/CouponListHandler;", "", "repository", "Lcom/woocommerce/android/ui/coupons/CouponRepository;", "(Lcom/woocommerce/android/ui/coupons/CouponRepository;)V", "canLoadMore", "", "couponsFlow", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/woocommerce/android/model/Coupon;", "getCouponsFlow", "()Lkotlinx/coroutines/flow/Flow;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "page", "", "searchQuery", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "searchResults", "fetchCoupons", "Lkotlin/Result;", "", "forceRefresh", "fetchCoupons-0E7RQCE", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadCoupons", "loadCoupons-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadMore", "loadMore-IoAF18A", "searchCoupons", "searchCoupons-IoAF18A", "Companion", "WooCommerce_vanillaDebug"})
public final class CouponListHandler {
    private final com.woocommerce.android.ui.coupons.CouponRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.coupons.CouponListHandler.Companion Companion = null;
    private static final int PAGE_SIZE = 10;
    private final kotlinx.coroutines.sync.Mutex mutex = null;
    private int page = 1;
    private boolean canLoadMore = true;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> searchQuery = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.woocommerce.android.model.Coupon>> searchResults = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.woocommerce.android.model.Coupon>> couponsFlow = null;
    
    @javax.inject.Inject()
    public CouponListHandler(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.coupons.CouponRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.woocommerce.android.model.Coupon>> getCouponsFlow() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/coupons/CouponListHandler$Companion;", "", "()V", "PAGE_SIZE", "", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}