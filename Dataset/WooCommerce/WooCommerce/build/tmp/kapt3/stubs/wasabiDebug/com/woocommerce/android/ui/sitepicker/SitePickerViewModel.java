package com.woocommerce.android.ui.sitepicker;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00a8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0005YZ[\\]BG\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\u0016\u00100\u001a\u0002012\f\u0010,\u001a\b\u0012\u0004\u0012\u0002020\u0015H\u0002J\u0019\u00103\u001a\u0002012\u0006\u00104\u001a\u000205H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00106J\u000e\u00107\u001a\b\u0012\u0004\u0012\u0002020\u0015H\u0002J\b\u00108\u001a\u000209H\u0002J\u0010\u0010:\u001a\u0002012\u0006\u0010;\u001a\u00020\u0018H\u0002J\b\u0010<\u001a\u000201H\u0002J\b\u0010=\u001a\u000201H\u0002J\b\u0010>\u001a\u000201H\u0002J\u001e\u0010?\u001a\u0002012\f\u0010,\u001a\b\u0012\u0004\u0012\u0002020\u00152\u0006\u0010@\u001a\u00020AH\u0002J\b\u0010B\u001a\u000201H\u0002J\u0010\u0010C\u001a\u0002012\u0006\u0010;\u001a\u00020\u0018H\u0002J\b\u0010D\u001a\u000201H\u0014J\u0010\u0010E\u001a\u0002012\b\b\u0002\u0010F\u001a\u000205J\u0006\u0010G\u001a\u000201J\u0006\u0010H\u001a\u000201J\u0006\u0010I\u001a\u000201J\u0006\u0010J\u001a\u000201J\u000e\u0010K\u001a\u0002012\u0006\u0010L\u001a\u000202J\u0006\u0010M\u001a\u000201J\u0006\u0010N\u001a\u000201J\u0006\u0010O\u001a\u000201J\u0010\u0010P\u001a\u0002012\u0006\u0010;\u001a\u00020\u0018H\u0002J,\u0010Q\u001a\u0002012\n\b\u0002\u0010R\u001a\u0004\u0018\u00010S2\n\b\u0002\u0010T\u001a\u0004\u0018\u00010U2\n\b\u0002\u0010V\u001a\u0004\u0018\u00010WH\u0002J\b\u0010X\u001a\u000201H\u0002R\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020 8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b&\u0010\'\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020 0)\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u001d\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150-\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006^"}, d2 = {"Lcom/woocommerce/android/ui/sitepicker/SitePickerViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "repository", "Lcom/woocommerce/android/ui/sitepicker/SitePickerRepository;", "resourceProvider", "Lcom/woocommerce/android/viewmodel/ResourceProvider;", "appPrefsWrapper", "Lcom/woocommerce/android/AppPrefsWrapper;", "unifiedLoginTracker", "Lcom/woocommerce/android/ui/login/UnifiedLoginTracker;", "analyticsTrackerWrapper", "Lcom/woocommerce/android/analytics/AnalyticsTrackerWrapper;", "userEligibilityFetcher", "Lcom/woocommerce/android/ui/common/UserEligibilityFetcher;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/tools/SelectedSite;Lcom/woocommerce/android/ui/sitepicker/SitePickerRepository;Lcom/woocommerce/android/viewmodel/ResourceProvider;Lcom/woocommerce/android/AppPrefsWrapper;Lcom/woocommerce/android/ui/login/UnifiedLoginTracker;Lcom/woocommerce/android/analytics/AnalyticsTrackerWrapper;Lcom/woocommerce/android/ui/common/UserEligibilityFetcher;)V", "_sites", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/woocommerce/android/ui/sitepicker/SitePickerViewModel$SiteUiModel;", "loginSiteAddress", "", "navArgs", "Lcom/woocommerce/android/ui/sitepicker/SitePickerFragmentArgs;", "getNavArgs", "()Lcom/woocommerce/android/ui/sitepicker/SitePickerFragmentArgs;", "navArgs$delegate", "Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "<set-?>", "Lcom/woocommerce/android/ui/sitepicker/SitePickerViewModel$SitePickerViewState;", "sitePickerViewState", "getSitePickerViewState", "()Lcom/woocommerce/android/ui/sitepicker/SitePickerViewModel$SitePickerViewState;", "setSitePickerViewState", "(Lcom/woocommerce/android/ui/sitepicker/SitePickerViewModel$SitePickerViewState;)V", "sitePickerViewState$delegate", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "sitePickerViewStateData", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getSitePickerViewStateData", "()Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "sites", "Landroidx/lifecycle/LiveData;", "getSites", "()Landroidx/lifecycle/LiveData;", "displaySites", "", "Lorg/wordpress/android/fluxc/model/SiteModel;", "fetchSitesFromApi", "showSkeleton", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSitesFromDb", "getUserInfo", "Lcom/woocommerce/android/ui/sitepicker/SitePickerViewModel$UserInfo;", "loadAccountMismatchView", "url", "loadAndDisplaySites", "loadLoginView", "loadNoStoreView", "loadStoreListView", "duration", "", "loadStorePickerView", "loadWooNotFoundView", "onCleared", "onContinueButtonClick", "isAutoLogin", "onHelpButtonClick", "onLearnMoreAboutJetpackButtonClick", "onNeedHelpFindingEmailButtonClick", "onRefreshButtonClick", "onSiteSelected", "siteModel", "onTryAnotherAccountButtonClick", "onViewConnectedStoresButtonClick", "onWhatIsJetpackButtonClick", "processLoginSiteAddress", "trackLoginEvent", "currentFlow", "Lcom/woocommerce/android/ui/login/UnifiedLoginTracker$Flow;", "currentStep", "Lcom/woocommerce/android/ui/login/UnifiedLoginTracker$Step;", "clickEvent", "Lcom/woocommerce/android/ui/login/UnifiedLoginTracker$Click;", "updateSiteViewDetails", "SitePickerEvent", "SitePickerState", "SitePickerViewState", "SiteUiModel", "UserInfo", "WooCommerce_wasabiDebug"})
public final class SitePickerViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    private final com.woocommerce.android.ui.sitepicker.SitePickerRepository repository = null;
    private final com.woocommerce.android.viewmodel.ResourceProvider resourceProvider = null;
    private final com.woocommerce.android.AppPrefsWrapper appPrefsWrapper = null;
    private final com.woocommerce.android.ui.login.UnifiedLoginTracker unifiedLoginTracker = null;
    private final com.woocommerce.android.analytics.AnalyticsTrackerWrapper analyticsTrackerWrapper = null;
    private final com.woocommerce.android.ui.common.UserEligibilityFetcher userEligibilityFetcher = null;
    private final com.woocommerce.android.viewmodel.NavArgsLazy navArgs$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.sitepicker.SitePickerViewModel.SitePickerViewState> sitePickerViewStateData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate sitePickerViewState$delegate = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.woocommerce.android.ui.sitepicker.SitePickerViewModel.SiteUiModel>> _sites = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.ui.sitepicker.SitePickerViewModel.SiteUiModel>> sites = null;
    private final java.lang.String loginSiteAddress = null;
    
    @javax.inject.Inject
    public SitePickerViewModel(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.SelectedSite selectedSite, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.sitepicker.SitePickerRepository repository, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.viewmodel.ResourceProvider resourceProvider, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.AppPrefsWrapper appPrefsWrapper, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.login.UnifiedLoginTracker unifiedLoginTracker, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.analytics.AnalyticsTrackerWrapper analyticsTrackerWrapper, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.common.UserEligibilityFetcher userEligibilityFetcher) {
        super(null);
    }
    
    private final com.woocommerce.android.ui.sitepicker.SitePickerFragmentArgs getNavArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.sitepicker.SitePickerViewModel.SitePickerViewState> getSitePickerViewStateData() {
        return null;
    }
    
    private final com.woocommerce.android.ui.sitepicker.SitePickerViewModel.SitePickerViewState getSitePickerViewState() {
        return null;
    }
    
    private final void setSitePickerViewState(com.woocommerce.android.ui.sitepicker.SitePickerViewModel.SitePickerViewState p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.ui.sitepicker.SitePickerViewModel.SiteUiModel>> getSites() {
        return null;
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    private final void updateSiteViewDetails() {
    }
    
    private final void loadAndDisplaySites() {
    }
    
    private final java.lang.Object fetchSitesFromApi(boolean showSkeleton, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.util.List<org.wordpress.android.fluxc.model.SiteModel> getSitesFromDb() {
        return null;
    }
    
    private final void loadLoginView() {
    }
    
    private final void loadStorePickerView() {
    }
    
    private final void loadStoreListView(java.util.List<? extends org.wordpress.android.fluxc.model.SiteModel> sites, long duration) {
    }
    
    private final void displaySites(java.util.List<? extends org.wordpress.android.fluxc.model.SiteModel> sites) {
    }
    
    /**
     * Signin M1: User logged in with a URL. Here we check that login url to see
     * if the site is (in this order):
     * - Connected to the same account the user logged in with
     * - Has WooCommerce installed
     */
    private final void processLoginSiteAddress(java.lang.String url) {
    }
    
    private final void loadNoStoreView() {
    }
    
    /**
     * SignIn M1: The url the user submitted during login belongs
     * to a site that is not connected to the account the user logged
     * in with.
     */
    private final void loadAccountMismatchView(java.lang.String url) {
    }
    
    private final void loadWooNotFoundView(java.lang.String url) {
    }
    
    private final com.woocommerce.android.ui.sitepicker.SitePickerViewModel.UserInfo getUserInfo() {
        return null;
    }
    
    public final void onSiteSelected(@org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.model.SiteModel siteModel) {
    }
    
    public final void onViewConnectedStoresButtonClick() {
    }
    
    public final void onNeedHelpFindingEmailButtonClick() {
    }
    
    public final void onRefreshButtonClick() {
    }
    
    public final void onWhatIsJetpackButtonClick() {
    }
    
    public final void onLearnMoreAboutJetpackButtonClick() {
    }
    
    public final void onTryAnotherAccountButtonClick() {
    }
    
    public final void onHelpButtonClick() {
    }
    
    public final void onContinueButtonClick(boolean isAutoLogin) {
    }
    
    private final void trackLoginEvent(com.woocommerce.android.ui.login.UnifiedLoginTracker.Flow currentFlow, com.woocommerce.android.ui.login.UnifiedLoginTracker.Step currentStep, com.woocommerce.android.ui.login.UnifiedLoginTracker.Click clickEvent) {
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00b5\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\u0002\u0010\u0016J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0007H\u00c6\u0003J\t\u0010(\u001a\u00020\u0007H\u00c6\u0003J\t\u0010)\u001a\u00020\u0007H\u00c6\u0003J\t\u0010*\u001a\u00020\u0007H\u00c6\u0003J\t\u0010+\u001a\u00020\u0007H\u00c6\u0003J\t\u0010,\u001a\u00020\u0007H\u00c6\u0003J\t\u0010-\u001a\u00020\u0015H\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u000b\u00100\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u00103\u001a\u00020\u0007H\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u00be\u0001\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u00c6\u0001\u00a2\u0006\u0002\u00107J\t\u00108\u001a\u000209H\u00d6\u0001J\u0013\u0010:\u001a\u00020\u00072\b\u0010;\u001a\u0004\u0018\u00010<H\u00d6\u0003J\t\u0010=\u001a\u000209H\u00d6\u0001J\t\u0010>\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u000209H\u00d6\u0001R\u0011\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001cR\u0011\u0010\u0012\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u001cR\u0011\u0010\u0011\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u001cR\u0011\u0010\u0013\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u001cR\u0011\u0010\u0010\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%\u00a8\u0006D"}, d2 = {"Lcom/woocommerce/android/ui/sitepicker/SitePickerViewModel$SitePickerViewState;", "Landroid/os/Parcelable;", "userInfo", "Lcom/woocommerce/android/ui/sitepicker/SitePickerViewModel$UserInfo;", "toolbarTitle", "", "hasConnectedStores", "", "sitePickerLabelText", "primaryBtnText", "secondaryBtnText", "isNoStoresViewVisible", "noStoresLabelText", "noStoresBtnText", "isHelpBtnVisible", "isSkeletonViewVisible", "isToolbarVisible", "isProgressDiaLogVisible", "isPrimaryBtnVisible", "isSecondaryBtnVisible", "currentSitePickerState", "Lcom/woocommerce/android/ui/sitepicker/SitePickerViewModel$SitePickerState;", "(Lcom/woocommerce/android/ui/sitepicker/SitePickerViewModel$UserInfo;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZZZZZLcom/woocommerce/android/ui/sitepicker/SitePickerViewModel$SitePickerState;)V", "getCurrentSitePickerState", "()Lcom/woocommerce/android/ui/sitepicker/SitePickerViewModel$SitePickerState;", "getHasConnectedStores", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "()Z", "getNoStoresBtnText", "()Ljava/lang/String;", "getNoStoresLabelText", "getPrimaryBtnText", "getSecondaryBtnText", "getSitePickerLabelText", "getToolbarTitle", "getUserInfo", "()Lcom/woocommerce/android/ui/sitepicker/SitePickerViewModel$UserInfo;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/woocommerce/android/ui/sitepicker/SitePickerViewModel$UserInfo;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZZZZZLcom/woocommerce/android/ui/sitepicker/SitePickerViewModel$SitePickerState;)Lcom/woocommerce/android/ui/sitepicker/SitePickerViewModel$SitePickerViewState;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class SitePickerViewState implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable
        private final com.woocommerce.android.ui.sitepicker.SitePickerViewModel.UserInfo userInfo = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String toolbarTitle = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean hasConnectedStores = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String sitePickerLabelText = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String primaryBtnText = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String secondaryBtnText = null;
        private final boolean isNoStoresViewVisible = false;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String noStoresLabelText = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String noStoresBtnText = null;
        private final boolean isHelpBtnVisible = false;
        private final boolean isSkeletonViewVisible = false;
        private final boolean isToolbarVisible = false;
        private final boolean isProgressDiaLogVisible = false;
        private final boolean isPrimaryBtnVisible = false;
        private final boolean isSecondaryBtnVisible = false;
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.ui.sitepicker.SitePickerViewModel.SitePickerState currentSitePickerState = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.sitepicker.SitePickerViewModel.SitePickerViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.sitepicker.SitePickerViewModel.SitePickerViewState copy(@org.jetbrains.annotations.Nullable
        com.woocommerce.android.ui.sitepicker.SitePickerViewModel.UserInfo userInfo, @org.jetbrains.annotations.Nullable
        java.lang.String toolbarTitle, @org.jetbrains.annotations.Nullable
        java.lang.Boolean hasConnectedStores, @org.jetbrains.annotations.Nullable
        java.lang.String sitePickerLabelText, @org.jetbrains.annotations.Nullable
        java.lang.String primaryBtnText, @org.jetbrains.annotations.Nullable
        java.lang.String secondaryBtnText, boolean isNoStoresViewVisible, @org.jetbrains.annotations.Nullable
        java.lang.String noStoresLabelText, @org.jetbrains.annotations.Nullable
        java.lang.String noStoresBtnText, boolean isHelpBtnVisible, boolean isSkeletonViewVisible, boolean isToolbarVisible, boolean isProgressDiaLogVisible, boolean isPrimaryBtnVisible, boolean isSecondaryBtnVisible, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.sitepicker.SitePickerViewModel.SitePickerState currentSitePickerState) {
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
        
        public SitePickerViewState() {
            super();
        }
        
        public SitePickerViewState(@org.jetbrains.annotations.Nullable
        com.woocommerce.android.ui.sitepicker.SitePickerViewModel.UserInfo userInfo, @org.jetbrains.annotations.Nullable
        java.lang.String toolbarTitle, @org.jetbrains.annotations.Nullable
        java.lang.Boolean hasConnectedStores, @org.jetbrains.annotations.Nullable
        java.lang.String sitePickerLabelText, @org.jetbrains.annotations.Nullable
        java.lang.String primaryBtnText, @org.jetbrains.annotations.Nullable
        java.lang.String secondaryBtnText, boolean isNoStoresViewVisible, @org.jetbrains.annotations.Nullable
        java.lang.String noStoresLabelText, @org.jetbrains.annotations.Nullable
        java.lang.String noStoresBtnText, boolean isHelpBtnVisible, boolean isSkeletonViewVisible, boolean isToolbarVisible, boolean isProgressDiaLogVisible, boolean isPrimaryBtnVisible, boolean isSecondaryBtnVisible, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.sitepicker.SitePickerViewModel.SitePickerState currentSitePickerState) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.woocommerce.android.ui.sitepicker.SitePickerViewModel.UserInfo component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.woocommerce.android.ui.sitepicker.SitePickerViewModel.UserInfo getUserInfo() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getToolbarTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean getHasConnectedStores() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getSitePickerLabelText() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getPrimaryBtnText() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getSecondaryBtnText() {
            return null;
        }
        
        public final boolean component7() {
            return false;
        }
        
        public final boolean isNoStoresViewVisible() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component8() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getNoStoresLabelText() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component9() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getNoStoresBtnText() {
            return null;
        }
        
        public final boolean component10() {
            return false;
        }
        
        public final boolean isHelpBtnVisible() {
            return false;
        }
        
        public final boolean component11() {
            return false;
        }
        
        public final boolean isSkeletonViewVisible() {
            return false;
        }
        
        public final boolean component12() {
            return false;
        }
        
        public final boolean isToolbarVisible() {
            return false;
        }
        
        public final boolean component13() {
            return false;
        }
        
        public final boolean isProgressDiaLogVisible() {
            return false;
        }
        
        public final boolean component14() {
            return false;
        }
        
        public final boolean isPrimaryBtnVisible() {
            return false;
        }
        
        public final boolean component15() {
            return false;
        }
        
        public final boolean isSecondaryBtnVisible() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.sitepicker.SitePickerViewModel.SitePickerState component16() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.sitepicker.SitePickerViewModel.SitePickerState getCurrentSitePickerState() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.sitepicker.SitePickerViewModel.SitePickerViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.sitepicker.SitePickerViewModel.SitePickerViewState createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.sitepicker.SitePickerViewModel.SitePickerViewState[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u001c"}, d2 = {"Lcom/woocommerce/android/ui/sitepicker/SitePickerViewModel$UserInfo;", "Landroid/os/Parcelable;", "displayName", "", "username", "userAvatarUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDisplayName", "()Ljava/lang/String;", "getUserAvatarUrl", "getUsername", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class UserInfo implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String displayName = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String username = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String userAvatarUrl = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.sitepicker.SitePickerViewModel.UserInfo> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.sitepicker.SitePickerViewModel.UserInfo copy(@org.jetbrains.annotations.NotNull
        java.lang.String displayName, @org.jetbrains.annotations.NotNull
        java.lang.String username, @org.jetbrains.annotations.NotNull
        java.lang.String userAvatarUrl) {
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
        
        public UserInfo(@org.jetbrains.annotations.NotNull
        java.lang.String displayName, @org.jetbrains.annotations.NotNull
        java.lang.String username, @org.jetbrains.annotations.NotNull
        java.lang.String userAvatarUrl) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getDisplayName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getUsername() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getUserAvatarUrl() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.sitepicker.SitePickerViewModel.UserInfo> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.sitepicker.SitePickerViewModel.UserInfo createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.sitepicker.SitePickerViewModel.UserInfo[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u001a"}, d2 = {"Lcom/woocommerce/android/ui/sitepicker/SitePickerViewModel$SiteUiModel;", "Landroid/os/Parcelable;", "site", "Lorg/wordpress/android/fluxc/model/SiteModel;", "isSelected", "", "(Lorg/wordpress/android/fluxc/model/SiteModel;Z)V", "()Z", "getSite", "()Lorg/wordpress/android/fluxc/model/SiteModel;", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class SiteUiModel implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull
        private final org.wordpress.android.fluxc.model.SiteModel site = null;
        private final boolean isSelected = false;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.sitepicker.SitePickerViewModel.SiteUiModel> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.sitepicker.SitePickerViewModel.SiteUiModel copy(@org.jetbrains.annotations.NotNull
        org.wordpress.android.fluxc.model.SiteModel site, boolean isSelected) {
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
        
        public SiteUiModel(@org.jetbrains.annotations.NotNull
        org.wordpress.android.fluxc.model.SiteModel site, boolean isSelected) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final org.wordpress.android.fluxc.model.SiteModel component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final org.wordpress.android.fluxc.model.SiteModel getSite() {
            return null;
        }
        
        public final boolean component2() {
            return false;
        }
        
        public final boolean isSelected() {
            return false;
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.sitepicker.SitePickerViewModel.SiteUiModel> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.sitepicker.SitePickerViewModel.SiteUiModel createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.sitepicker.SitePickerViewModel.SiteUiModel[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/woocommerce/android/ui/sitepicker/SitePickerViewModel$SitePickerEvent;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "()V", "NavigateToEmailHelpDialogEvent", "NavigateToMainActivityEvent", "NavigationToHelpFragmentEvent", "NavigationToLearnMoreAboutJetpackEvent", "NavigationToWhatIsJetpackFragmentEvent", "ShowWooUpgradeDialogEvent", "Lcom/woocommerce/android/ui/sitepicker/SitePickerViewModel$SitePickerEvent$ShowWooUpgradeDialogEvent;", "Lcom/woocommerce/android/ui/sitepicker/SitePickerViewModel$SitePickerEvent$NavigateToMainActivityEvent;", "Lcom/woocommerce/android/ui/sitepicker/SitePickerViewModel$SitePickerEvent$NavigateToEmailHelpDialogEvent;", "Lcom/woocommerce/android/ui/sitepicker/SitePickerViewModel$SitePickerEvent$NavigationToHelpFragmentEvent;", "Lcom/woocommerce/android/ui/sitepicker/SitePickerViewModel$SitePickerEvent$NavigationToWhatIsJetpackFragmentEvent;", "Lcom/woocommerce/android/ui/sitepicker/SitePickerViewModel$SitePickerEvent$NavigationToLearnMoreAboutJetpackEvent;", "WooCommerce_wasabiDebug"})
    public static abstract class SitePickerEvent extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        
        private SitePickerEvent() {
            super(false);
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/sitepicker/SitePickerViewModel$SitePickerEvent$ShowWooUpgradeDialogEvent;", "Lcom/woocommerce/android/ui/sitepicker/SitePickerViewModel$SitePickerEvent;", "()V", "WooCommerce_wasabiDebug"})
        public static final class ShowWooUpgradeDialogEvent extends com.woocommerce.android.ui.sitepicker.SitePickerViewModel.SitePickerEvent {
            @org.jetbrains.annotations.NotNull
            public static final com.woocommerce.android.ui.sitepicker.SitePickerViewModel.SitePickerEvent.ShowWooUpgradeDialogEvent INSTANCE = null;
            
            private ShowWooUpgradeDialogEvent() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/sitepicker/SitePickerViewModel$SitePickerEvent$NavigateToMainActivityEvent;", "Lcom/woocommerce/android/ui/sitepicker/SitePickerViewModel$SitePickerEvent;", "()V", "WooCommerce_wasabiDebug"})
        public static final class NavigateToMainActivityEvent extends com.woocommerce.android.ui.sitepicker.SitePickerViewModel.SitePickerEvent {
            @org.jetbrains.annotations.NotNull
            public static final com.woocommerce.android.ui.sitepicker.SitePickerViewModel.SitePickerEvent.NavigateToMainActivityEvent INSTANCE = null;
            
            private NavigateToMainActivityEvent() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/sitepicker/SitePickerViewModel$SitePickerEvent$NavigateToEmailHelpDialogEvent;", "Lcom/woocommerce/android/ui/sitepicker/SitePickerViewModel$SitePickerEvent;", "()V", "WooCommerce_wasabiDebug"})
        public static final class NavigateToEmailHelpDialogEvent extends com.woocommerce.android.ui.sitepicker.SitePickerViewModel.SitePickerEvent {
            @org.jetbrains.annotations.NotNull
            public static final com.woocommerce.android.ui.sitepicker.SitePickerViewModel.SitePickerEvent.NavigateToEmailHelpDialogEvent INSTANCE = null;
            
            private NavigateToEmailHelpDialogEvent() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/sitepicker/SitePickerViewModel$SitePickerEvent$NavigationToHelpFragmentEvent;", "Lcom/woocommerce/android/ui/sitepicker/SitePickerViewModel$SitePickerEvent;", "()V", "WooCommerce_wasabiDebug"})
        public static final class NavigationToHelpFragmentEvent extends com.woocommerce.android.ui.sitepicker.SitePickerViewModel.SitePickerEvent {
            @org.jetbrains.annotations.NotNull
            public static final com.woocommerce.android.ui.sitepicker.SitePickerViewModel.SitePickerEvent.NavigationToHelpFragmentEvent INSTANCE = null;
            
            private NavigationToHelpFragmentEvent() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/sitepicker/SitePickerViewModel$SitePickerEvent$NavigationToWhatIsJetpackFragmentEvent;", "Lcom/woocommerce/android/ui/sitepicker/SitePickerViewModel$SitePickerEvent;", "()V", "WooCommerce_wasabiDebug"})
        public static final class NavigationToWhatIsJetpackFragmentEvent extends com.woocommerce.android.ui.sitepicker.SitePickerViewModel.SitePickerEvent {
            @org.jetbrains.annotations.NotNull
            public static final com.woocommerce.android.ui.sitepicker.SitePickerViewModel.SitePickerEvent.NavigationToWhatIsJetpackFragmentEvent INSTANCE = null;
            
            private NavigationToWhatIsJetpackFragmentEvent() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/sitepicker/SitePickerViewModel$SitePickerEvent$NavigationToLearnMoreAboutJetpackEvent;", "Lcom/woocommerce/android/ui/sitepicker/SitePickerViewModel$SitePickerEvent;", "()V", "WooCommerce_wasabiDebug"})
        public static final class NavigationToLearnMoreAboutJetpackEvent extends com.woocommerce.android.ui.sitepicker.SitePickerViewModel.SitePickerEvent {
            @org.jetbrains.annotations.NotNull
            public static final com.woocommerce.android.ui.sitepicker.SitePickerViewModel.SitePickerEvent.NavigationToLearnMoreAboutJetpackEvent INSTANCE = null;
            
            private NavigationToLearnMoreAboutJetpackEvent() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/ui/sitepicker/SitePickerViewModel$SitePickerState;", "", "(Ljava/lang/String;I)V", "StoreListState", "NoStoreState", "AccountMismatchState", "WooNotFoundState", "WooCommerce_wasabiDebug"})
    public static enum SitePickerState {
        /*public static final*/ StoreListState /* = new StoreListState() */,
        /*public static final*/ NoStoreState /* = new NoStoreState() */,
        /*public static final*/ AccountMismatchState /* = new AccountMismatchState() */,
        /*public static final*/ WooNotFoundState /* = new WooNotFoundState() */;
        
        SitePickerState() {
        }
    }
}