package com.woocommerce.android.ui.products.variations;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0006LMNOPQB7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u001c\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002J#\u0010-\u001a\u00020.2\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010/\u001a\u00020\u0014H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00100J\u001f\u00101\u001a\b\u0012\u0004\u0012\u00020\u0012022\u0006\u0010\u0018\u001a\u00020\u0019H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00103J\u0012\u00104\u001a\u00020\u00172\b\b\u0002\u00105\u001a\u00020\u0014H\u0002J\u0010\u00106\u001a\u00020.2\u0006\u00107\u001a\u00020\u0019H\u0002J$\u00108\u001a\u00020.2\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010/\u001a\u00020\u00142\b\b\u0002\u00109\u001a\u00020\u0014H\u0002J\u0006\u0010:\u001a\u00020.J\u0006\u0010;\u001a\u00020.J\u0006\u0010<\u001a\u00020.J\u0006\u0010=\u001a\u00020.J\u000e\u0010>\u001a\u00020.2\u0006\u0010?\u001a\u00020\u0012J\u000e\u0010@\u001a\u00020.2\u0006\u0010\u0018\u001a\u00020\u0019J\u0016\u0010A\u001a\u00020\u00172\u0006\u00107\u001a\u00020\u00192\u0006\u0010B\u001a\u00020\u0019J\u000e\u0010C\u001a\u00020.2\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010D\u001a\u00020.2\u0006\u0010\u0018\u001a\u00020\u0019J\u0019\u0010E\u001a\u00020.2\u0006\u00107\u001a\u00020\u0019H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00103J\u0010\u0010F\u001a\u00020.2\u0006\u0010G\u001a\u00020HH\u0002J\u0017\u0010I\u001a\u0004\u0018\u00010\u0012*\u00020JH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010KR\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001f8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0017\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u001f0(\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006R"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/VariationListViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "variationRepository", "Lcom/woocommerce/android/ui/products/variations/VariationRepository;", "productRepository", "Lcom/woocommerce/android/ui/products/ProductDetailRepository;", "networkStatus", "Lcom/woocommerce/android/tools/NetworkStatus;", "currencyFormatter", "Lcom/woocommerce/android/util/CurrencyFormatter;", "dispatchers", "Lcom/woocommerce/android/util/CoroutineDispatchers;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/ui/products/variations/VariationRepository;Lcom/woocommerce/android/ui/products/ProductDetailRepository;Lcom/woocommerce/android/tools/NetworkStatus;Lcom/woocommerce/android/util/CurrencyFormatter;Lcom/woocommerce/android/util/CoroutineDispatchers;)V", "_variationList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/woocommerce/android/model/ProductVariation;", "isEmpty", "", "()Z", "loadingJob", "Lkotlinx/coroutines/Job;", "remoteProductId", "", "variationList", "Landroidx/lifecycle/LiveData;", "getVariationList", "()Landroidx/lifecycle/LiveData;", "<set-?>", "Lcom/woocommerce/android/ui/products/variations/VariationListViewModel$ViewState;", "viewState", "getViewState", "()Lcom/woocommerce/android/ui/products/variations/VariationListViewModel$ViewState;", "setViewState", "(Lcom/woocommerce/android/ui/products/variations/VariationListViewModel$ViewState;)V", "viewState$delegate", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "viewStateLiveData", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getViewStateLiveData", "()Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "combineData", "variations", "fetchVariations", "", "loadMore", "(JZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllVariations", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleVariationCreation", "openVariationDetails", "handleVariationLoading", "productID", "loadVariations", "withSkeletonView", "onBulkUpdateClicked", "onCreateEmptyVariationClick", "onCreateFirstVariationRequested", "onExit", "onItemClick", "variation", "onLoadMoreRequested", "onVariationDeleted", "variationID", "refreshVariations", "start", "syncProductToVariations", "trackWithProductId", "event", "Lcom/woocommerce/android/analytics/AnalyticsEvent;", "createVariation", "Lcom/woocommerce/android/model/Product;", "(Lcom/woocommerce/android/model/Product;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ShowAddAttributeView", "ShowBulkUpdateAttrPicker", "ShowBulkUpdateLimitExceededWarning", "ShowVariationDetail", "VariationListData", "ViewState", "WooCommerce_vanillaDebug"})
public final class VariationListViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.ui.products.variations.VariationRepository variationRepository = null;
    private final com.woocommerce.android.ui.products.ProductDetailRepository productRepository = null;
    private final com.woocommerce.android.tools.NetworkStatus networkStatus = null;
    private final com.woocommerce.android.util.CurrencyFormatter currencyFormatter = null;
    private final com.woocommerce.android.util.CoroutineDispatchers dispatchers = null;
    private long remoteProductId = 0L;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.woocommerce.android.model.ProductVariation>> _variationList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.model.ProductVariation>> variationList = null;
    @org.jetbrains.annotations.NotNull()
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.products.variations.VariationListViewModel.ViewState> viewStateLiveData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate viewState$delegate = null;
    private kotlinx.coroutines.Job loadingJob;
    
    @javax.inject.Inject()
    public VariationListViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.variations.VariationRepository variationRepository, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.ProductDetailRepository productRepository, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.tools.NetworkStatus networkStatus, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.CurrencyFormatter currencyFormatter, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.CoroutineDispatchers dispatchers) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.model.ProductVariation>> getVariationList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.products.variations.VariationListViewModel.ViewState> getViewStateLiveData() {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.variations.VariationListViewModel.ViewState getViewState() {
        return null;
    }
    
    private final void setViewState(com.woocommerce.android.ui.products.variations.VariationListViewModel.ViewState p0) {
    }
    
    public final boolean isEmpty() {
        return false;
    }
    
    public final void start(long remoteProductId) {
    }
    
    public final void onLoadMoreRequested(long remoteProductId) {
    }
    
    public final void onBulkUpdateClicked() {
    }
    
    public final void onItemClick(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.ProductVariation variation) {
    }
    
    public final void onCreateEmptyVariationClick() {
    }
    
    public final void onCreateFirstVariationRequested() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job onVariationDeleted(long productID, long variationID) {
        return null;
    }
    
    public final void onExit() {
    }
    
    public final void refreshVariations(long remoteProductId) {
    }
    
    private final void handleVariationLoading(long productID) {
    }
    
    private final kotlinx.coroutines.Job handleVariationCreation(boolean openVariationDetails) {
        return null;
    }
    
    private final java.lang.Object createVariation(com.woocommerce.android.model.Product $this$createVariation, kotlin.coroutines.Continuation<? super com.woocommerce.android.model.ProductVariation> p1) {
        return null;
    }
    
    private final java.lang.Object syncProductToVariations(long productID, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final void loadVariations(long remoteProductId, boolean loadMore, boolean withSkeletonView) {
    }
    
    private final java.lang.Object fetchVariations(long remoteProductId, boolean loadMore, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object getAllVariations(long remoteProductId, kotlin.coroutines.Continuation<? super java.util.Collection<com.woocommerce.android.model.ProductVariation>> continuation) {
        return null;
    }
    
    private final java.util.List<com.woocommerce.android.model.ProductVariation> combineData(java.util.List<com.woocommerce.android.model.ProductVariation> variations) {
        return null;
    }
    
    private final void trackWithProductId(com.woocommerce.android.analytics.AnalyticsEvent event) {
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\u0082\u0001\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010 J\t\u0010!\u001a\u00020\"H\u00d6\u0001J\u0013\u0010#\u001a\u00020\u00032\b\u0010$\u001a\u0004\u0018\u00010%H\u00d6\u0003J\t\u0010&\u001a\u00020\"H\u00d6\u0001J\t\u0010\'\u001a\u00020(H\u00d6\u0001J\u0019\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\"H\u00d6\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0012R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0007\u0010\u0010R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0005\u0010\u0010R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\t\u0010\u0010R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0004\u0010\u0010R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0002\u0010\u0010R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0012R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\b\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006."}, d2 = {"Lcom/woocommerce/android/ui/products/variations/VariationListViewModel$ViewState;", "Landroid/os/Parcelable;", "isSkeletonShown", "", "isRefreshing", "isLoadingMore", "canLoadMore", "isEmptyViewVisible", "isWarningVisible", "isProgressDialogShown", "parentProduct", "Lcom/woocommerce/android/model/Product;", "isVariationsOptionsMenuEnabled", "isBulkUpdateProgressDialogShown", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/woocommerce/android/model/Product;ZZ)V", "getCanLoadMore", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "()Z", "getParentProduct", "()Lcom/woocommerce/android/model/Product;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/woocommerce/android/model/Product;ZZ)Lcom/woocommerce/android/ui/products/variations/VariationListViewModel$ViewState;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
    public static final class ViewState implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isSkeletonShown = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isRefreshing = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isLoadingMore = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean canLoadMore = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isEmptyViewVisible = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isWarningVisible = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isProgressDialogShown = null;
        @org.jetbrains.annotations.Nullable()
        private final com.woocommerce.android.model.Product parentProduct = null;
        private final boolean isVariationsOptionsMenuEnabled = false;
        private final boolean isBulkUpdateProgressDialogShown = false;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.products.variations.VariationListViewModel.ViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.variations.VariationListViewModel.ViewState copy(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean isSkeletonShown, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isRefreshing, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isLoadingMore, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean canLoadMore, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isEmptyViewVisible, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isWarningVisible, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isProgressDialogShown, @org.jetbrains.annotations.Nullable()
        com.woocommerce.android.model.Product parentProduct, boolean isVariationsOptionsMenuEnabled, boolean isBulkUpdateProgressDialogShown) {
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
        
        public ViewState() {
            super();
        }
        
        public ViewState(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean isSkeletonShown, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isRefreshing, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isLoadingMore, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean canLoadMore, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isEmptyViewVisible, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isWarningVisible, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isProgressDialogShown, @org.jetbrains.annotations.Nullable()
        com.woocommerce.android.model.Product parentProduct, boolean isVariationsOptionsMenuEnabled, boolean isBulkUpdateProgressDialogShown) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isSkeletonShown() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isRefreshing() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isLoadingMore() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean getCanLoadMore() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isEmptyViewVisible() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isWarningVisible() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isProgressDialogShown() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.woocommerce.android.model.Product component8() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.woocommerce.android.model.Product getParentProduct() {
            return null;
        }
        
        public final boolean component9() {
            return false;
        }
        
        public final boolean isVariationsOptionsMenuEnabled() {
            return false;
        }
        
        public final boolean component10() {
            return false;
        }
        
        public final boolean isBulkUpdateProgressDialogShown() {
            return false;
        }
        
        @java.lang.Override()
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.products.variations.VariationListViewModel.ViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.variations.VariationListViewModel.ViewState createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.variations.VariationListViewModel.ViewState[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\nJ\t\u0010\u000b\u001a\u00020\u0003H\u00d6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0018"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/VariationListViewModel$VariationListData;", "Landroid/os/Parcelable;", "currentVariationAmount", "", "(Ljava/lang/Integer;)V", "getCurrentVariationAmount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "copy", "(Ljava/lang/Integer;)Lcom/woocommerce/android/ui/products/variations/VariationListViewModel$VariationListData;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
    public static final class VariationListData implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer currentVariationAmount = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.products.variations.VariationListViewModel.VariationListData> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.variations.VariationListViewModel.VariationListData copy(@org.jetbrains.annotations.Nullable()
        java.lang.Integer currentVariationAmount) {
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
        
        public VariationListData() {
            super();
        }
        
        public VariationListData(@org.jetbrains.annotations.Nullable()
        java.lang.Integer currentVariationAmount) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getCurrentVariationAmount() {
            return null;
        }
        
        @java.lang.Override()
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.products.variations.VariationListViewModel.VariationListData> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.variations.VariationListViewModel.VariationListData createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.variations.VariationListViewModel.VariationListData[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/VariationListViewModel$ShowVariationDetail;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "variation", "Lcom/woocommerce/android/model/ProductVariation;", "(Lcom/woocommerce/android/model/ProductVariation;)V", "getVariation", "()Lcom/woocommerce/android/model/ProductVariation;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class ShowVariationDetail extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.model.ProductVariation variation = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.variations.VariationListViewModel.ShowVariationDetail copy(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.ProductVariation variation) {
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
        
        public ShowVariationDetail(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.ProductVariation variation) {
            super(false);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.ProductVariation component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.ProductVariation getVariation() {
            return null;
        }
    }
    
    /**
     * Represents event responsible for displaying [VariationsBulkUpdateAttrPickerDialog].
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/VariationListViewModel$ShowBulkUpdateAttrPicker;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "variationsToUpdate", "", "Lcom/woocommerce/android/model/ProductVariation;", "(Ljava/util/Collection;)V", "getVariationsToUpdate", "()Ljava/util/Collection;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class ShowBulkUpdateAttrPicker extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        @org.jetbrains.annotations.NotNull()
        private final java.util.Collection<com.woocommerce.android.model.ProductVariation> variationsToUpdate = null;
        
        /**
         * Represents event responsible for displaying [VariationsBulkUpdateAttrPickerDialog].
         */
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.variations.VariationListViewModel.ShowBulkUpdateAttrPicker copy(@org.jetbrains.annotations.NotNull()
        java.util.Collection<com.woocommerce.android.model.ProductVariation> variationsToUpdate) {
            return null;
        }
        
        /**
         * Represents event responsible for displaying [VariationsBulkUpdateAttrPickerDialog].
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * Represents event responsible for displaying [VariationsBulkUpdateAttrPickerDialog].
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * Represents event responsible for displaying [VariationsBulkUpdateAttrPickerDialog].
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public ShowBulkUpdateAttrPicker(@org.jetbrains.annotations.NotNull()
        java.util.Collection<com.woocommerce.android.model.ProductVariation> variationsToUpdate) {
            super(false);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Collection<com.woocommerce.android.model.ProductVariation> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Collection<com.woocommerce.android.model.ProductVariation> getVariationsToUpdate() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/VariationListViewModel$ShowAddAttributeView;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "()V", "WooCommerce_vanillaDebug"})
    public static final class ShowAddAttributeView extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        @org.jetbrains.annotations.NotNull()
        public static final com.woocommerce.android.ui.products.variations.VariationListViewModel.ShowAddAttributeView INSTANCE = null;
        
        private ShowAddAttributeView() {
            super(false);
        }
    }
    
    /**
     * Informs about exceeded limit of 100 variations bulk update.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/VariationListViewModel$ShowBulkUpdateLimitExceededWarning;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "()V", "WooCommerce_vanillaDebug"})
    public static final class ShowBulkUpdateLimitExceededWarning extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        @org.jetbrains.annotations.NotNull()
        public static final com.woocommerce.android.ui.products.variations.VariationListViewModel.ShowBulkUpdateLimitExceededWarning INSTANCE = null;
        
        private ShowBulkUpdateLimitExceededWarning() {
            super(false);
        }
    }
}