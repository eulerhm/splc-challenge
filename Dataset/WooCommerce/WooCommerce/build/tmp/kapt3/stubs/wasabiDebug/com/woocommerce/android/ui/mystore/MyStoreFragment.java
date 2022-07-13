package com.woocommerce.android.ui.mystore;

import java.lang.System;

@kotlin.Suppress(names = {"ForbiddenComment"})
@kotlinx.coroutines.ExperimentalCoroutinesApi
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00bc\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 s2\u00020\u0001:\u0001sB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010F\u001a\u00020GH\u0002J\b\u0010H\u001a\u00020IH\u0016J\b\u0010J\u001a\u00020IH\u0016J\b\u0010K\u001a\u00020GH\u0002J\b\u0010L\u001a\u00020GH\u0002J\b\u0010M\u001a\u00020GH\u0002J\b\u0010N\u001a\u00020GH\u0016J\u0010\u0010O\u001a\u00020G2\u0006\u0010P\u001a\u00020QH\u0002J\b\u0010R\u001a\u00020GH\u0016J\b\u0010S\u001a\u00020GH\u0016J\u001a\u0010T\u001a\u00020G2\u0006\u0010U\u001a\u00020V2\b\u0010W\u001a\u0004\u0018\u00010XH\u0016J\b\u0010Y\u001a\u00020GH\u0002J\b\u0010Z\u001a\u00020GH\u0002J\b\u0010[\u001a\u00020GH\u0016J\b\u0010\\\u001a\u00020GH\u0002J\b\u0010]\u001a\u00020GH\u0002J\b\u0010^\u001a\u00020#H\u0016J\u0010\u0010_\u001a\u00020G2\u0006\u0010`\u001a\u00020#H\u0002J\u0010\u0010a\u001a\u00020G2\u0006\u0010`\u001a\u00020#H\u0002J\b\u0010b\u001a\u00020GH\u0002J\b\u0010c\u001a\u00020GH\u0002J\u0012\u0010d\u001a\u00020G2\b\u0010e\u001a\u0004\u0018\u00010fH\u0002J\b\u0010g\u001a\u00020GH\u0002J\u0016\u0010h\u001a\u00020G2\f\u0010i\u001a\b\u0012\u0004\u0012\u00020k0jH\u0002J\b\u0010l\u001a\u00020GH\u0002J\b\u0010m\u001a\u00020GH\u0002J\u001c\u0010n\u001a\u00020G2\u0012\u0010o\u001a\u000e\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020q0pH\u0002J\b\u0010r\u001a\u00020GH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010$\u001a\u0004\u0018\u00010%8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b&\u0010\'R\u001e\u0010(\u001a\u00020)8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b/\u00100R\u000e\u00101\u001a\u000202X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u00103\u001a\u0002048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001e\u00109\u001a\u00020:8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001b\u0010?\u001a\u00020@8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bA\u0010BR\u000e\u0010E\u001a\u00020#X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006t"}, d2 = {"Lcom/woocommerce/android/ui/mystore/MyStoreFragment;", "Lcom/woocommerce/android/ui/base/TopLevelFragment;", "()V", "_binding", "Lcom/woocommerce/android/databinding/FragmentMyStoreBinding;", "_tabLayout", "Lcom/google/android/material/tabs/TabLayout;", "activityAppBarStatus", "Lcom/woocommerce/android/ui/main/AppBarStatus;", "getActivityAppBarStatus", "()Lcom/woocommerce/android/ui/main/AppBarStatus;", "appBarLayout", "Lcom/google/android/material/appbar/AppBarLayout;", "getAppBarLayout", "()Lcom/google/android/material/appbar/AppBarLayout;", "binding", "getBinding", "()Lcom/woocommerce/android/databinding/FragmentMyStoreBinding;", "currencyFormatter", "Lcom/woocommerce/android/util/CurrencyFormatter;", "getCurrencyFormatter", "()Lcom/woocommerce/android/util/CurrencyFormatter;", "setCurrencyFormatter", "(Lcom/woocommerce/android/util/CurrencyFormatter;)V", "dateUtils", "Lcom/woocommerce/android/util/DateUtils;", "getDateUtils", "()Lcom/woocommerce/android/util/DateUtils;", "setDateUtils", "(Lcom/woocommerce/android/util/DateUtils;)V", "errorSnackbar", "Lcom/google/android/material/snackbar/Snackbar;", "handler", "Landroid/os/Handler;", "isEmptyViewVisible", "", "mainNavigationRouter", "Lcom/woocommerce/android/ui/main/MainNavigationRouter;", "getMainNavigationRouter", "()Lcom/woocommerce/android/ui/main/MainNavigationRouter;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "getSelectedSite", "()Lcom/woocommerce/android/tools/SelectedSite;", "setSelectedSite", "(Lcom/woocommerce/android/tools/SelectedSite;)V", "tabLayout", "getTabLayout", "()Lcom/google/android/material/tabs/TabLayout;", "tabSelectedListener", "Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;", "uiMessageResolver", "Lcom/woocommerce/android/ui/base/UIMessageResolver;", "getUiMessageResolver", "()Lcom/woocommerce/android/ui/base/UIMessageResolver;", "setUiMessageResolver", "(Lcom/woocommerce/android/ui/base/UIMessageResolver;)V", "usageTracksEventEmitter", "Lcom/woocommerce/android/ui/mystore/MyStoreStatsUsageTracksEventEmitter;", "getUsageTracksEventEmitter", "()Lcom/woocommerce/android/ui/mystore/MyStoreStatsUsageTracksEventEmitter;", "setUsageTracksEventEmitter", "(Lcom/woocommerce/android/ui/mystore/MyStoreStatsUsageTracksEventEmitter;)V", "viewModel", "Lcom/woocommerce/android/ui/mystore/MyStoreViewModel;", "getViewModel", "()Lcom/woocommerce/android/ui/mystore/MyStoreViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "wasPreviouslyStopped", "addTabLayoutToAppBar", "", "getFragmentSubtitle", "", "getFragmentTitle", "handleFeedbackRequestCardState", "handleFeedbackRequestPositiveClick", "initTabLayout", "onDestroyView", "onJetpackCpConnected", "benefitsBanner", "Lcom/woocommerce/android/ui/mystore/BenefitsBannerUiModel;", "onResume", "onStop", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "prepareJetpackBenefitsBanner", "removeTabLayoutFromAppBar", "scrollToTop", "setupFeedbackRequestCard", "setupStateObservers", "shouldExpandToolbar", "showChartSkeleton", "show", "showEmptyView", "showEmptyVisitorStatsForJetpackCP", "showErrorSnack", "showStats", "revenueStatsModel", "Lcom/woocommerce/android/ui/mystore/RevenueStatsUiModel;", "showStatsError", "showTopPerformers", "topPerformers", "", "Lcom/woocommerce/android/ui/mystore/TopPerformerProductUiModel;", "showTopPerformersError", "showTopPerformersLoading", "showVisitorStats", "visitorStats", "", "", "updateStatsAvailabilityError", "Companion", "WooCommerce_wasabiDebug"})
@dagger.hilt.android.AndroidEntryPoint
public final class MyStoreFragment extends com.woocommerce.android.ui.base.TopLevelFragment {
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.mystore.MyStoreFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String TAG = null;
    @org.jetbrains.annotations.NotNull
    private static final org.wordpress.android.fluxc.store.WCStatsStore.StatsGranularity DEFAULT_STATS_GRANULARITY = org.wordpress.android.fluxc.store.WCStatsStore.StatsGranularity.DAYS;
    private final kotlin.Lazy viewModel$delegate = null;
    @javax.inject.Inject
    public com.woocommerce.android.tools.SelectedSite selectedSite;
    @javax.inject.Inject
    public com.woocommerce.android.util.CurrencyFormatter currencyFormatter;
    @javax.inject.Inject
    public com.woocommerce.android.ui.base.UIMessageResolver uiMessageResolver;
    @javax.inject.Inject
    public com.woocommerce.android.util.DateUtils dateUtils;
    @javax.inject.Inject
    public com.woocommerce.android.ui.mystore.MyStoreStatsUsageTracksEventEmitter usageTracksEventEmitter;
    private com.woocommerce.android.databinding.FragmentMyStoreBinding _binding;
    private com.google.android.material.snackbar.Snackbar errorSnackbar;
    private com.google.android.material.tabs.TabLayout _tabLayout;
    private boolean isEmptyViewVisible = false;
    private boolean wasPreviouslyStopped = false;
    private final com.google.android.material.tabs.TabLayout.OnTabSelectedListener tabSelectedListener = null;
    private final android.os.Handler handler = null;
    
    public MyStoreFragment() {
        super();
    }
    
    private final com.woocommerce.android.ui.mystore.MyStoreViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.tools.SelectedSite getSelectedSite() {
        return null;
    }
    
    public final void setSelectedSite(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.SelectedSite p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.util.CurrencyFormatter getCurrencyFormatter() {
        return null;
    }
    
    public final void setCurrencyFormatter(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.CurrencyFormatter p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.ui.base.UIMessageResolver getUiMessageResolver() {
        return null;
    }
    
    public final void setUiMessageResolver(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.base.UIMessageResolver p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.util.DateUtils getDateUtils() {
        return null;
    }
    
    public final void setDateUtils(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.DateUtils p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.ui.mystore.MyStoreStatsUsageTracksEventEmitter getUsageTracksEventEmitter() {
        return null;
    }
    
    public final void setUsageTracksEventEmitter(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.mystore.MyStoreStatsUsageTracksEventEmitter p0) {
    }
    
    private final com.woocommerce.android.databinding.FragmentMyStoreBinding getBinding() {
        return null;
    }
    
    private final com.google.android.material.tabs.TabLayout getTabLayout() {
        return null;
    }
    
    private final com.google.android.material.appbar.AppBarLayout getAppBarLayout() {
        return null;
    }
    
    private final com.woocommerce.android.ui.main.MainNavigationRouter getMainNavigationRouter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.woocommerce.android.ui.main.AppBarStatus getActivityAppBarStatus() {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @kotlin.Suppress(names = {"ComplexMethod", "MagicNumber"})
    private final void setupStateObservers() {
    }
    
    private final void onJetpackCpConnected(com.woocommerce.android.ui.mystore.BenefitsBannerUiModel benefitsBanner) {
    }
    
    private final void showTopPerformersLoading() {
    }
    
    @kotlin.Suppress(names = {"ForbiddenComment"})
    private final void prepareJetpackBenefitsBanner() {
    }
    
    private final void initTabLayout() {
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    @java.lang.Override
    public void onStop() {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    private final void showStats(com.woocommerce.android.ui.mystore.RevenueStatsUiModel revenueStatsModel) {
    }
    
    private final void showStatsError() {
    }
    
    private final void updateStatsAvailabilityError() {
    }
    
    private final void showTopPerformers(java.util.List<com.woocommerce.android.ui.mystore.TopPerformerProductUiModel> topPerformers) {
    }
    
    private final void showTopPerformersError() {
    }
    
    private final void showVisitorStats(java.util.Map<java.lang.String, java.lang.Integer> visitorStats) {
    }
    
    private final void showEmptyVisitorStatsForJetpackCP() {
    }
    
    private final void showErrorSnack() {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getFragmentTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getFragmentSubtitle() {
        return null;
    }
    
    @java.lang.Override
    public void scrollToTop() {
    }
    
    private final void showChartSkeleton(boolean show) {
    }
    
    /**
     * This method verifies if the feedback card should be visible.
     *
     * If it should but it's not, the feedback card is reconfigured and presented
     * If should not and it's visible, the card visibility is changed to gone
     * If should be and it's already visible, nothing happens
     */
    private final void handleFeedbackRequestCardState() {
    }
    
    private final void setupFeedbackRequestCard() {
    }
    
    private final void handleFeedbackRequestPositiveClick() {
    }
    
    private final void showEmptyView(boolean show) {
    }
    
    private final void addTabLayoutToAppBar() {
    }
    
    private final void removeTabLayoutFromAppBar() {
    }
    
    @java.lang.Override
    public boolean shouldExpandToolbar() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\r"}, d2 = {"Lcom/woocommerce/android/ui/mystore/MyStoreFragment$Companion;", "", "()V", "DEFAULT_STATS_GRANULARITY", "Lorg/wordpress/android/fluxc/store/WCStatsStore$StatsGranularity;", "getDEFAULT_STATS_GRANULARITY", "()Lorg/wordpress/android/fluxc/store/WCStatsStore$StatsGranularity;", "TAG", "", "getTAG", "()Ljava/lang/String;", "newInstance", "Lcom/woocommerce/android/ui/mystore/MyStoreFragment;", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getTAG() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.mystore.MyStoreFragment newInstance() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final org.wordpress.android.fluxc.store.WCStatsStore.StatsGranularity getDEFAULT_STATS_GRANULARITY() {
            return null;
        }
    }
}