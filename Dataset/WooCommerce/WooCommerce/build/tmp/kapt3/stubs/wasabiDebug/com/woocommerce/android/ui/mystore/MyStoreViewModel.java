package com.woocommerce.android.ui.mystore;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00dc\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0018\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 d2\u00020\u0001:\u0006defghiBW\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\u0002\u0010\u0016J\u0006\u0010=\u001a\u00020>J\u0018\u0010?\u001a\u00020>2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020>H\u0002J\u0019\u0010C\u001a\u0002062\u0006\u0010D\u001a\u00020\u0019H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010EJ\u0019\u0010F\u001a\u0002062\u0006\u0010D\u001a\u00020\u0019H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010EJ\b\u0010G\u001a\u000206H\u0002J\b\u0010H\u001a\u000206H\u0014J\u0010\u0010I\u001a\u0002062\u0006\u0010J\u001a\u00020KH\u0007J\b\u0010L\u001a\u000206H\u0002J\u0018\u0010M\u001a\u0002062\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020\u0019H\u0002J\u000e\u0010Q\u001a\u0002062\u0006\u0010D\u001a\u00020\u0019J\u0006\u0010R\u001a\u000206J\u0010\u0010S\u001a\u0002062\u0006\u0010T\u001a\u00020UH\u0002J\b\u0010V\u001a\u000206H\u0002J\u0014\u0010W\u001a\n X*\u0004\u0018\u00010>0>*\u00020>H\u0002J\u0018\u0010Y\u001a\b\u0012\u0004\u0012\u00020[0Z*\b\u0012\u0004\u0012\u00020\\0ZH\u0002J\f\u0010]\u001a\u00020^*\u00020_H\u0002J\u0018\u0010`\u001a\b\u0012\u0004\u0012\u00020a0Z*\b\u0012\u0004\u0012\u00020b0ZH\u0002J\f\u0010c\u001a\u00020a*\u00020bH\u0002R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00190$\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u001c0$\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010&R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010+\u001a\u00020,8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001c\u00101\u001a\u00020,8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b2\u0010.\u001a\u0004\b3\u00100R\u0014\u00104\u001a\b\u0012\u0004\u0012\u00020605X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u00107\u001a\b\u0012\u0004\u0012\u00020\u001e0$\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010&R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u00109\u001a\b\u0012\u0004\u0012\u00020 0$\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010&R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010;\u001a\b\u0012\u0004\u0012\u00020\"0$\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010&R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006j"}, d2 = {"Lcom/woocommerce/android/ui/mystore/MyStoreViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "networkStatus", "Lcom/woocommerce/android/tools/NetworkStatus;", "resourceProvider", "Lcom/woocommerce/android/viewmodel/ResourceProvider;", "wooCommerceStore", "Lorg/wordpress/android/fluxc/store/WooCommerceStore;", "getStats", "Lcom/woocommerce/android/ui/mystore/domain/GetStats;", "getTopPerformers", "Lcom/woocommerce/android/ui/mystore/domain/GetTopPerformers;", "currencyFormatter", "Lcom/woocommerce/android/util/CurrencyFormatter;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "appPrefsWrapper", "Lcom/woocommerce/android/AppPrefsWrapper;", "usageTracksEventEmitter", "Lcom/woocommerce/android/ui/mystore/MyStoreStatsUsageTracksEventEmitter;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/tools/NetworkStatus;Lcom/woocommerce/android/viewmodel/ResourceProvider;Lorg/wordpress/android/fluxc/store/WooCommerceStore;Lcom/woocommerce/android/ui/mystore/domain/GetStats;Lcom/woocommerce/android/ui/mystore/domain/GetTopPerformers;Lcom/woocommerce/android/util/CurrencyFormatter;Lcom/woocommerce/android/tools/SelectedSite;Lcom/woocommerce/android/AppPrefsWrapper;Lcom/woocommerce/android/ui/mystore/MyStoreStatsUsageTracksEventEmitter;)V", "_activeStatsGranularity", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/wordpress/android/fluxc/store/WCStatsStore$StatsGranularity;", "_hasOrders", "Landroidx/lifecycle/MutableLiveData;", "Lcom/woocommerce/android/ui/mystore/MyStoreViewModel$OrderState;", "_revenueStatsState", "Lcom/woocommerce/android/ui/mystore/MyStoreViewModel$RevenueStatsViewState;", "_topPerformersState", "Lcom/woocommerce/android/ui/mystore/MyStoreViewModel$TopPerformersViewState;", "_visitorStatsState", "Lcom/woocommerce/android/ui/mystore/MyStoreViewModel$VisitorStatsViewState;", "activeStatsGranularity", "Landroidx/lifecycle/LiveData;", "getActiveStatsGranularity", "()Landroidx/lifecycle/LiveData;", "hasOrders", "getHasOrders", "jetpackMonitoringJob", "Lkotlinx/coroutines/Job;", "refreshStoreStats", "", "getRefreshStoreStats$annotations", "()V", "getRefreshStoreStats", "()[Z", "refreshTopPerformerStats", "getRefreshTopPerformerStats$annotations", "getRefreshTopPerformerStats", "refreshTrigger", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "revenueStatsState", "getRevenueStatsState", "topPerformersState", "getTopPerformersState", "visitorStatsState", "getVisitorStatsState", "getSelectedSiteName", "", "getTotalSpendFormatted", "totalSpend", "Ljava/math/BigDecimal;", "currency", "loadStoreStats", "granularity", "(Lorg/wordpress/android/fluxc/store/WCStatsStore$StatsGranularity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadTopPerformersStats", "monitorJetpackInstallation", "onCleared", "onEventMainThread", "event", "Lcom/woocommerce/android/network/ConnectionChangeReceiver$ConnectionChangeEvent;", "onJetPackCpConnected", "onRevenueStatsSuccess", "it", "Lcom/woocommerce/android/ui/mystore/domain/GetStats$LoadStatsResult$RevenueStatsSuccess;", "selectedGranularity", "onStatsGranularityChanged", "onSwipeToRefresh", "onTopPerformerSelected", "productId", "", "resetForceRefresh", "toImageUrl", "kotlin.jvm.PlatformType", "toStatsIntervalUiModelList", "", "Lcom/woocommerce/android/ui/mystore/StatsIntervalUiModel;", "Lorg/wordpress/android/fluxc/model/WCRevenueStatsModel$Interval;", "toStoreStatsUiModel", "Lcom/woocommerce/android/ui/mystore/RevenueStatsUiModel;", "Lorg/wordpress/android/fluxc/model/WCRevenueStatsModel;", "toTopPerformersUiList", "Lcom/woocommerce/android/ui/mystore/TopPerformerProductUiModel;", "Lorg/wordpress/android/fluxc/model/leaderboards/WCTopPerformerProductModel;", "toTopPerformersUiModel", "Companion", "MyStoreEvent", "OrderState", "RevenueStatsViewState", "TopPerformersViewState", "VisitorStatsViewState", "WooCommerce_wasabiDebug"})
public final class MyStoreViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.tools.NetworkStatus networkStatus = null;
    private final com.woocommerce.android.viewmodel.ResourceProvider resourceProvider = null;
    private final org.wordpress.android.fluxc.store.WooCommerceStore wooCommerceStore = null;
    private final com.woocommerce.android.ui.mystore.domain.GetStats getStats = null;
    private final com.woocommerce.android.ui.mystore.domain.GetTopPerformers getTopPerformers = null;
    private final com.woocommerce.android.util.CurrencyFormatter currencyFormatter = null;
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    private final com.woocommerce.android.AppPrefsWrapper appPrefsWrapper = null;
    private final com.woocommerce.android.ui.mystore.MyStoreStatsUsageTracksEventEmitter usageTracksEventEmitter = null;
    @org.jetbrains.annotations.NotNull
    private static final com.woocommerce.android.ui.mystore.MyStoreViewModel.Companion Companion = null;
    @java.lang.Deprecated
    public static final int NUM_TOP_PERFORMERS = 5;
    @java.lang.Deprecated
    public static final int DAYS_TO_REDISPLAY_JP_BENEFITS_BANNER = 5;
    @org.jetbrains.annotations.NotNull
    @java.lang.Deprecated
    public static final java.lang.String ACTIVE_STATS_GRANULARITY_KEY = "active_stats_granularity_key";
    private androidx.lifecycle.MutableLiveData<com.woocommerce.android.ui.mystore.MyStoreViewModel.RevenueStatsViewState> _revenueStatsState;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.woocommerce.android.ui.mystore.MyStoreViewModel.RevenueStatsViewState> revenueStatsState = null;
    private androidx.lifecycle.MutableLiveData<com.woocommerce.android.ui.mystore.MyStoreViewModel.VisitorStatsViewState> _visitorStatsState;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.woocommerce.android.ui.mystore.MyStoreViewModel.VisitorStatsViewState> visitorStatsState = null;
    private androidx.lifecycle.MutableLiveData<com.woocommerce.android.ui.mystore.MyStoreViewModel.TopPerformersViewState> _topPerformersState;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.woocommerce.android.ui.mystore.MyStoreViewModel.TopPerformersViewState> topPerformersState = null;
    private androidx.lifecycle.MutableLiveData<com.woocommerce.android.ui.mystore.MyStoreViewModel.OrderState> _hasOrders;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.woocommerce.android.ui.mystore.MyStoreViewModel.OrderState> hasOrders = null;
    private final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> refreshTrigger = null;
    private kotlinx.coroutines.flow.MutableStateFlow<org.wordpress.android.fluxc.store.WCStatsStore.StatsGranularity> _activeStatsGranularity;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<org.wordpress.android.fluxc.store.WCStatsStore.StatsGranularity> activeStatsGranularity = null;
    @org.jetbrains.annotations.NotNull
    private final boolean[] refreshStoreStats = null;
    @org.jetbrains.annotations.NotNull
    private final boolean[] refreshTopPerformerStats = null;
    private kotlinx.coroutines.Job jetpackMonitoringJob;
    
    @javax.inject.Inject
    public MyStoreViewModel(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.NetworkStatus networkStatus, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.viewmodel.ResourceProvider resourceProvider, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.WooCommerceStore wooCommerceStore, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.mystore.domain.GetStats getStats, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.mystore.domain.GetTopPerformers getTopPerformers, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.CurrencyFormatter currencyFormatter, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.SelectedSite selectedSite, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.AppPrefsWrapper appPrefsWrapper, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.mystore.MyStoreStatsUsageTracksEventEmitter usageTracksEventEmitter) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.woocommerce.android.ui.mystore.MyStoreViewModel.RevenueStatsViewState> getRevenueStatsState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.woocommerce.android.ui.mystore.MyStoreViewModel.VisitorStatsViewState> getVisitorStatsState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.woocommerce.android.ui.mystore.MyStoreViewModel.TopPerformersViewState> getTopPerformersState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.woocommerce.android.ui.mystore.MyStoreViewModel.OrderState> getHasOrders() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<org.wordpress.android.fluxc.store.WCStatsStore.StatsGranularity> getActiveStatsGranularity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final boolean[] getRefreshStoreStats() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting
    @java.lang.Deprecated
    public static void getRefreshStoreStats$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final boolean[] getRefreshTopPerformerStats() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting
    @java.lang.Deprecated
    public static void getRefreshTopPerformerStats$annotations() {
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    @kotlin.Suppress(names = {"unused"})
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onEventMainThread(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.network.ConnectionChangeReceiver.ConnectionChangeEvent event) {
    }
    
    public final void onStatsGranularityChanged(@org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.WCStatsStore.StatsGranularity granularity) {
    }
    
    public final void onSwipeToRefresh() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSelectedSiteName() {
        return null;
    }
    
    private final java.lang.Object loadStoreStats(org.wordpress.android.fluxc.store.WCStatsStore.StatsGranularity granularity, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final void onRevenueStatsSuccess(com.woocommerce.android.ui.mystore.domain.GetStats.LoadStatsResult.RevenueStatsSuccess it, org.wordpress.android.fluxc.store.WCStatsStore.StatsGranularity selectedGranularity) {
    }
    
    private final void onJetPackCpConnected() {
    }
    
    private final void monitorJetpackInstallation() {
    }
    
    private final java.lang.Object loadTopPerformersStats(org.wordpress.android.fluxc.store.WCStatsStore.StatsGranularity granularity, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final void resetForceRefresh() {
    }
    
    private final void onTopPerformerSelected(long productId) {
    }
    
    private final com.woocommerce.android.ui.mystore.RevenueStatsUiModel toStoreStatsUiModel(org.wordpress.android.fluxc.model.WCRevenueStatsModel $this$toStoreStatsUiModel) {
        return null;
    }
    
    private final java.util.List<com.woocommerce.android.ui.mystore.StatsIntervalUiModel> toStatsIntervalUiModelList(java.util.List<org.wordpress.android.fluxc.model.WCRevenueStatsModel.Interval> $this$toStatsIntervalUiModelList) {
        return null;
    }
    
    private final java.util.List<com.woocommerce.android.ui.mystore.TopPerformerProductUiModel> toTopPerformersUiList(java.util.List<org.wordpress.android.fluxc.model.leaderboards.WCTopPerformerProductModel> $this$toTopPerformersUiList) {
        return null;
    }
    
    private final com.woocommerce.android.ui.mystore.TopPerformerProductUiModel toTopPerformersUiModel(org.wordpress.android.fluxc.model.leaderboards.WCTopPerformerProductModel $this$toTopPerformersUiModel) {
        return null;
    }
    
    private final java.lang.String getTotalSpendFormatted(java.math.BigDecimal totalSpend, java.lang.String currency) {
        return null;
    }
    
    private final java.lang.String toImageUrl(java.lang.String $this$toImageUrl) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/woocommerce/android/ui/mystore/MyStoreViewModel$RevenueStatsViewState;", "", "()V", "Content", "GenericError", "Loading", "PluginNotActiveError", "Lcom/woocommerce/android/ui/mystore/MyStoreViewModel$RevenueStatsViewState$Loading;", "Lcom/woocommerce/android/ui/mystore/MyStoreViewModel$RevenueStatsViewState$GenericError;", "Lcom/woocommerce/android/ui/mystore/MyStoreViewModel$RevenueStatsViewState$PluginNotActiveError;", "Lcom/woocommerce/android/ui/mystore/MyStoreViewModel$RevenueStatsViewState$Content;", "WooCommerce_wasabiDebug"})
    public static abstract class RevenueStatsViewState {
        
        private RevenueStatsViewState() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/mystore/MyStoreViewModel$RevenueStatsViewState$Loading;", "Lcom/woocommerce/android/ui/mystore/MyStoreViewModel$RevenueStatsViewState;", "()V", "WooCommerce_wasabiDebug"})
        public static final class Loading extends com.woocommerce.android.ui.mystore.MyStoreViewModel.RevenueStatsViewState {
            @org.jetbrains.annotations.NotNull
            public static final com.woocommerce.android.ui.mystore.MyStoreViewModel.RevenueStatsViewState.Loading INSTANCE = null;
            
            private Loading() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/mystore/MyStoreViewModel$RevenueStatsViewState$GenericError;", "Lcom/woocommerce/android/ui/mystore/MyStoreViewModel$RevenueStatsViewState;", "()V", "WooCommerce_wasabiDebug"})
        public static final class GenericError extends com.woocommerce.android.ui.mystore.MyStoreViewModel.RevenueStatsViewState {
            @org.jetbrains.annotations.NotNull
            public static final com.woocommerce.android.ui.mystore.MyStoreViewModel.RevenueStatsViewState.GenericError INSTANCE = null;
            
            private GenericError() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/mystore/MyStoreViewModel$RevenueStatsViewState$PluginNotActiveError;", "Lcom/woocommerce/android/ui/mystore/MyStoreViewModel$RevenueStatsViewState;", "()V", "WooCommerce_wasabiDebug"})
        public static final class PluginNotActiveError extends com.woocommerce.android.ui.mystore.MyStoreViewModel.RevenueStatsViewState {
            @org.jetbrains.annotations.NotNull
            public static final com.woocommerce.android.ui.mystore.MyStoreViewModel.RevenueStatsViewState.PluginNotActiveError INSTANCE = null;
            
            private PluginNotActiveError() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0016"}, d2 = {"Lcom/woocommerce/android/ui/mystore/MyStoreViewModel$RevenueStatsViewState$Content;", "Lcom/woocommerce/android/ui/mystore/MyStoreViewModel$RevenueStatsViewState;", "revenueStats", "Lcom/woocommerce/android/ui/mystore/RevenueStatsUiModel;", "granularity", "Lorg/wordpress/android/fluxc/store/WCStatsStore$StatsGranularity;", "(Lcom/woocommerce/android/ui/mystore/RevenueStatsUiModel;Lorg/wordpress/android/fluxc/store/WCStatsStore$StatsGranularity;)V", "getGranularity", "()Lorg/wordpress/android/fluxc/store/WCStatsStore$StatsGranularity;", "getRevenueStats", "()Lcom/woocommerce/android/ui/mystore/RevenueStatsUiModel;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
        public static final class Content extends com.woocommerce.android.ui.mystore.MyStoreViewModel.RevenueStatsViewState {
            @org.jetbrains.annotations.Nullable
            private final com.woocommerce.android.ui.mystore.RevenueStatsUiModel revenueStats = null;
            @org.jetbrains.annotations.NotNull
            private final org.wordpress.android.fluxc.store.WCStatsStore.StatsGranularity granularity = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.mystore.MyStoreViewModel.RevenueStatsViewState.Content copy(@org.jetbrains.annotations.Nullable
            com.woocommerce.android.ui.mystore.RevenueStatsUiModel revenueStats, @org.jetbrains.annotations.NotNull
            org.wordpress.android.fluxc.store.WCStatsStore.StatsGranularity granularity) {
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
            
            public Content(@org.jetbrains.annotations.Nullable
            com.woocommerce.android.ui.mystore.RevenueStatsUiModel revenueStats, @org.jetbrains.annotations.NotNull
            org.wordpress.android.fluxc.store.WCStatsStore.StatsGranularity granularity) {
                super();
            }
            
            @org.jetbrains.annotations.Nullable
            public final com.woocommerce.android.ui.mystore.RevenueStatsUiModel component1() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final com.woocommerce.android.ui.mystore.RevenueStatsUiModel getRevenueStats() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final org.wordpress.android.fluxc.store.WCStatsStore.StatsGranularity component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final org.wordpress.android.fluxc.store.WCStatsStore.StatsGranularity getGranularity() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/woocommerce/android/ui/mystore/MyStoreViewModel$VisitorStatsViewState;", "", "()V", "Content", "Error", "JetpackCpConnected", "Lcom/woocommerce/android/ui/mystore/MyStoreViewModel$VisitorStatsViewState$Error;", "Lcom/woocommerce/android/ui/mystore/MyStoreViewModel$VisitorStatsViewState$JetpackCpConnected;", "Lcom/woocommerce/android/ui/mystore/MyStoreViewModel$VisitorStatsViewState$Content;", "WooCommerce_wasabiDebug"})
    public static abstract class VisitorStatsViewState {
        
        private VisitorStatsViewState() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/mystore/MyStoreViewModel$VisitorStatsViewState$Error;", "Lcom/woocommerce/android/ui/mystore/MyStoreViewModel$VisitorStatsViewState;", "()V", "WooCommerce_wasabiDebug"})
        public static final class Error extends com.woocommerce.android.ui.mystore.MyStoreViewModel.VisitorStatsViewState {
            @org.jetbrains.annotations.NotNull
            public static final com.woocommerce.android.ui.mystore.MyStoreViewModel.VisitorStatsViewState.Error INSTANCE = null;
            
            private Error() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/mystore/MyStoreViewModel$VisitorStatsViewState$JetpackCpConnected;", "Lcom/woocommerce/android/ui/mystore/MyStoreViewModel$VisitorStatsViewState;", "benefitsBanner", "Lcom/woocommerce/android/ui/mystore/BenefitsBannerUiModel;", "(Lcom/woocommerce/android/ui/mystore/BenefitsBannerUiModel;)V", "getBenefitsBanner", "()Lcom/woocommerce/android/ui/mystore/BenefitsBannerUiModel;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
        public static final class JetpackCpConnected extends com.woocommerce.android.ui.mystore.MyStoreViewModel.VisitorStatsViewState {
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.ui.mystore.BenefitsBannerUiModel benefitsBanner = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.mystore.MyStoreViewModel.VisitorStatsViewState.JetpackCpConnected copy(@org.jetbrains.annotations.NotNull
            com.woocommerce.android.ui.mystore.BenefitsBannerUiModel benefitsBanner) {
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
            
            public JetpackCpConnected(@org.jetbrains.annotations.NotNull
            com.woocommerce.android.ui.mystore.BenefitsBannerUiModel benefitsBanner) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.mystore.BenefitsBannerUiModel component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.mystore.BenefitsBannerUiModel getBenefitsBanner() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\u0010\u0006J\u0015\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u00c6\u0003J\u001f\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u00c6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0004H\u00d6\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/mystore/MyStoreViewModel$VisitorStatsViewState$Content;", "Lcom/woocommerce/android/ui/mystore/MyStoreViewModel$VisitorStatsViewState;", "stats", "", "", "", "(Ljava/util/Map;)V", "getStats", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "WooCommerce_wasabiDebug"})
        public static final class Content extends com.woocommerce.android.ui.mystore.MyStoreViewModel.VisitorStatsViewState {
            @org.jetbrains.annotations.NotNull
            private final java.util.Map<java.lang.String, java.lang.Integer> stats = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.mystore.MyStoreViewModel.VisitorStatsViewState.Content copy(@org.jetbrains.annotations.NotNull
            java.util.Map<java.lang.String, java.lang.Integer> stats) {
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
            
            public Content(@org.jetbrains.annotations.NotNull
            java.util.Map<java.lang.String, java.lang.Integer> stats) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.util.Map<java.lang.String, java.lang.Integer> component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.util.Map<java.lang.String, java.lang.Integer> getStats() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/woocommerce/android/ui/mystore/MyStoreViewModel$TopPerformersViewState;", "", "()V", "Content", "Error", "Loading", "Lcom/woocommerce/android/ui/mystore/MyStoreViewModel$TopPerformersViewState$Loading;", "Lcom/woocommerce/android/ui/mystore/MyStoreViewModel$TopPerformersViewState$Error;", "Lcom/woocommerce/android/ui/mystore/MyStoreViewModel$TopPerformersViewState$Content;", "WooCommerce_wasabiDebug"})
    public static abstract class TopPerformersViewState {
        
        private TopPerformersViewState() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/mystore/MyStoreViewModel$TopPerformersViewState$Loading;", "Lcom/woocommerce/android/ui/mystore/MyStoreViewModel$TopPerformersViewState;", "()V", "WooCommerce_wasabiDebug"})
        public static final class Loading extends com.woocommerce.android.ui.mystore.MyStoreViewModel.TopPerformersViewState {
            @org.jetbrains.annotations.NotNull
            public static final com.woocommerce.android.ui.mystore.MyStoreViewModel.TopPerformersViewState.Loading INSTANCE = null;
            
            private Loading() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/mystore/MyStoreViewModel$TopPerformersViewState$Error;", "Lcom/woocommerce/android/ui/mystore/MyStoreViewModel$TopPerformersViewState;", "()V", "WooCommerce_wasabiDebug"})
        public static final class Error extends com.woocommerce.android.ui.mystore.MyStoreViewModel.TopPerformersViewState {
            @org.jetbrains.annotations.NotNull
            public static final com.woocommerce.android.ui.mystore.MyStoreViewModel.TopPerformersViewState.Error INSTANCE = null;
            
            private Error() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0006H\u00c6\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lcom/woocommerce/android/ui/mystore/MyStoreViewModel$TopPerformersViewState$Content;", "Lcom/woocommerce/android/ui/mystore/MyStoreViewModel$TopPerformersViewState;", "topPerformers", "", "Lcom/woocommerce/android/ui/mystore/TopPerformerProductUiModel;", "granularity", "Lorg/wordpress/android/fluxc/store/WCStatsStore$StatsGranularity;", "(Ljava/util/List;Lorg/wordpress/android/fluxc/store/WCStatsStore$StatsGranularity;)V", "getGranularity", "()Lorg/wordpress/android/fluxc/store/WCStatsStore$StatsGranularity;", "getTopPerformers", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
        public static final class Content extends com.woocommerce.android.ui.mystore.MyStoreViewModel.TopPerformersViewState {
            @org.jetbrains.annotations.NotNull
            private final java.util.List<com.woocommerce.android.ui.mystore.TopPerformerProductUiModel> topPerformers = null;
            @org.jetbrains.annotations.NotNull
            private final org.wordpress.android.fluxc.store.WCStatsStore.StatsGranularity granularity = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.mystore.MyStoreViewModel.TopPerformersViewState.Content copy(@org.jetbrains.annotations.NotNull
            java.util.List<com.woocommerce.android.ui.mystore.TopPerformerProductUiModel> topPerformers, @org.jetbrains.annotations.NotNull
            org.wordpress.android.fluxc.store.WCStatsStore.StatsGranularity granularity) {
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
            
            public Content(@org.jetbrains.annotations.NotNull
            java.util.List<com.woocommerce.android.ui.mystore.TopPerformerProductUiModel> topPerformers, @org.jetbrains.annotations.NotNull
            org.wordpress.android.fluxc.store.WCStatsStore.StatsGranularity granularity) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.util.List<com.woocommerce.android.ui.mystore.TopPerformerProductUiModel> component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.util.List<com.woocommerce.android.ui.mystore.TopPerformerProductUiModel> getTopPerformers() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final org.wordpress.android.fluxc.store.WCStatsStore.StatsGranularity component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final org.wordpress.android.fluxc.store.WCStatsStore.StatsGranularity getGranularity() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/ui/mystore/MyStoreViewModel$OrderState;", "", "()V", "AtLeastOne", "Empty", "Lcom/woocommerce/android/ui/mystore/MyStoreViewModel$OrderState$Empty;", "Lcom/woocommerce/android/ui/mystore/MyStoreViewModel$OrderState$AtLeastOne;", "WooCommerce_wasabiDebug"})
    public static abstract class OrderState {
        
        private OrderState() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/mystore/MyStoreViewModel$OrderState$Empty;", "Lcom/woocommerce/android/ui/mystore/MyStoreViewModel$OrderState;", "()V", "WooCommerce_wasabiDebug"})
        public static final class Empty extends com.woocommerce.android.ui.mystore.MyStoreViewModel.OrderState {
            @org.jetbrains.annotations.NotNull
            public static final com.woocommerce.android.ui.mystore.MyStoreViewModel.OrderState.Empty INSTANCE = null;
            
            private Empty() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/mystore/MyStoreViewModel$OrderState$AtLeastOne;", "Lcom/woocommerce/android/ui/mystore/MyStoreViewModel$OrderState;", "()V", "WooCommerce_wasabiDebug"})
        public static final class AtLeastOne extends com.woocommerce.android.ui.mystore.MyStoreViewModel.OrderState {
            @org.jetbrains.annotations.NotNull
            public static final com.woocommerce.android.ui.mystore.MyStoreViewModel.OrderState.AtLeastOne INSTANCE = null;
            
            private AtLeastOne() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/mystore/MyStoreViewModel$MyStoreEvent;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "()V", "OpenTopPerformer", "Lcom/woocommerce/android/ui/mystore/MyStoreViewModel$MyStoreEvent$OpenTopPerformer;", "WooCommerce_wasabiDebug"})
    public static abstract class MyStoreEvent extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        
        private MyStoreEvent() {
            super(false);
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/mystore/MyStoreViewModel$MyStoreEvent$OpenTopPerformer;", "Lcom/woocommerce/android/ui/mystore/MyStoreViewModel$MyStoreEvent;", "productId", "", "(J)V", "getProductId", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
        public static final class OpenTopPerformer extends com.woocommerce.android.ui.mystore.MyStoreViewModel.MyStoreEvent {
            private final long productId = 0L;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.mystore.MyStoreViewModel.MyStoreEvent.OpenTopPerformer copy(long productId) {
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
            
            public OpenTopPerformer(long productId) {
                super();
            }
            
            public final long component1() {
                return 0L;
            }
            
            public final long getProductId() {
                return 0L;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/woocommerce/android/ui/mystore/MyStoreViewModel$Companion;", "", "()V", "ACTIVE_STATS_GRANULARITY_KEY", "", "DAYS_TO_REDISPLAY_JP_BENEFITS_BANNER", "", "NUM_TOP_PERFORMERS", "WooCommerce_wasabiDebug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}