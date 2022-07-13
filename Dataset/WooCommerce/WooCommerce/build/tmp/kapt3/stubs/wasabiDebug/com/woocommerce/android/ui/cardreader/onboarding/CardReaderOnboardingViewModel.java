package com.woocommerce.android.ui.cardreader.onboarding;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u000256B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002J\u001a\u0010\'\u001a\n (*\u0004\u0018\u00010&0&2\b\u0010)\u001a\u0004\u0018\u00010&H\u0002J\u0010\u0010*\u001a\u00020&2\u0006\u0010+\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020$H\u0002J\b\u0010.\u001a\u00020$H\u0002J\u0010\u0010/\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002J\b\u00100\u001a\u00020$H\u0002J\b\u00101\u001a\u00020$H\u0002J\u0010\u00102\u001a\u00020$2\u0006\u0010+\u001a\u000203H\u0002J\b\u00104\u001a\u00020$H\u0002R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u001bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001d\u00a8\u00067"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "cardReaderChecker", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingChecker;", "cardReaderTracker", "Lcom/woocommerce/android/ui/cardreader/CardReaderTracker;", "userEligibilityFetcher", "Lcom/woocommerce/android/ui/common/UserEligibilityFetcher;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "appPrefsWrapper", "Lcom/woocommerce/android/AppPrefsWrapper;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingChecker;Lcom/woocommerce/android/ui/cardreader/CardReaderTracker;Lcom/woocommerce/android/ui/common/UserEligibilityFetcher;Lcom/woocommerce/android/tools/SelectedSite;Lcom/woocommerce/android/AppPrefsWrapper;)V", "_event", "Lcom/woocommerce/android/viewmodel/SingleLiveEvent;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "get_event", "()Lcom/woocommerce/android/viewmodel/SingleLiveEvent;", "arguments", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingFragmentArgs;", "getArguments", "()Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingFragmentArgs;", "arguments$delegate", "Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "event", "Landroidx/lifecycle/LiveData;", "getEvent", "()Landroidx/lifecycle/LiveData;", "viewState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState;", "viewStateData", "getViewStateData", "continueFlow", "", "storeCountryCode", "", "convertCountryCodeToCountry", "kotlin.jvm.PlatformType", "countryCode", "formatDueDate", "state", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingState$StripeAccountPendingRequirement;", "onContactSupportClicked", "onLearnMoreClicked", "onSkipPendingRequirementsClicked", "onWPAdminActionClicked", "refreshState", "showOnboardingState", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingState;", "updateUiWithWcPayAndStripeActivated", "OnboardingEvent", "OnboardingViewState", "WooCommerce_wasabiDebug"})
public final class CardReaderOnboardingViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingChecker cardReaderChecker = null;
    private final com.woocommerce.android.ui.cardreader.CardReaderTracker cardReaderTracker = null;
    private final com.woocommerce.android.ui.common.UserEligibilityFetcher userEligibilityFetcher = null;
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    private final com.woocommerce.android.AppPrefsWrapper appPrefsWrapper = null;
    private final com.woocommerce.android.viewmodel.NavArgsLazy arguments$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.viewmodel.SingleLiveEvent<com.woocommerce.android.viewmodel.MultiLiveEvent.Event> _event = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.woocommerce.android.viewmodel.MultiLiveEvent.Event> event = null;
    private final androidx.lifecycle.MutableLiveData<com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel.OnboardingViewState> viewState = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel.OnboardingViewState> viewStateData = null;
    
    @javax.inject.Inject
    public CardReaderOnboardingViewModel(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingChecker cardReaderChecker, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.cardreader.CardReaderTracker cardReaderTracker, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.common.UserEligibilityFetcher userEligibilityFetcher, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.SelectedSite selectedSite, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.AppPrefsWrapper appPrefsWrapper) {
        super(null);
    }
    
    private final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingFragmentArgs getArguments() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected com.woocommerce.android.viewmodel.SingleLiveEvent<com.woocommerce.android.viewmodel.MultiLiveEvent.Event> get_event() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.lifecycle.LiveData<com.woocommerce.android.viewmodel.MultiLiveEvent.Event> getEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel.OnboardingViewState> getViewStateData() {
        return null;
    }
    
    private final void refreshState() {
    }
    
    @kotlin.Suppress(names = {"LongMethod", "ComplexMethod"})
    private final void showOnboardingState(com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState state) {
    }
    
    private final void updateUiWithWcPayAndStripeActivated() {
    }
    
    private final void onWPAdminActionClicked() {
    }
    
    private final void onContactSupportClicked() {
    }
    
    private final void onLearnMoreClicked() {
    }
    
    private final void onSkipPendingRequirementsClicked(java.lang.String storeCountryCode) {
    }
    
    private final void continueFlow(java.lang.String storeCountryCode) {
    }
    
    private final java.lang.String convertCountryCodeToCountry(java.lang.String countryCode) {
        return null;
    }
    
    private final java.lang.String formatDueDate(com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.StripeAccountPendingRequirement state) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\b"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingEvent;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "()V", "ContinueToConnection", "ContinueToHub", "NavigateToSupport", "NavigateToUrlInGenericWebView", "NavigateToUrlInWPComWebView", "WooCommerce_wasabiDebug"})
    public static abstract class OnboardingEvent extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        
        private OnboardingEvent() {
            super(false);
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingEvent$NavigateToSupport;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "()V", "WooCommerce_wasabiDebug"})
        public static final class NavigateToSupport extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
            @org.jetbrains.annotations.NotNull
            public static final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel.OnboardingEvent.NavigateToSupport INSTANCE = null;
            
            private NavigateToSupport() {
                super(false);
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingEvent$NavigateToUrlInWPComWebView;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "url", "", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_wasabiDebug"})
        public static final class NavigateToUrlInWPComWebView extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
            @org.jetbrains.annotations.NotNull
            private final java.lang.String url = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel.OnboardingEvent.NavigateToUrlInWPComWebView copy(@org.jetbrains.annotations.NotNull
            java.lang.String url) {
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
            
            public NavigateToUrlInWPComWebView(@org.jetbrains.annotations.NotNull
            java.lang.String url) {
                super(false);
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getUrl() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingEvent$NavigateToUrlInGenericWebView;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "url", "", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_wasabiDebug"})
        public static final class NavigateToUrlInGenericWebView extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
            @org.jetbrains.annotations.NotNull
            private final java.lang.String url = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel.OnboardingEvent.NavigateToUrlInGenericWebView copy(@org.jetbrains.annotations.NotNull
            java.lang.String url) {
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
            
            public NavigateToUrlInGenericWebView(@org.jetbrains.annotations.NotNull
            java.lang.String url) {
                super(false);
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getUrl() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingEvent$ContinueToHub;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "cardReaderFlowParam", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderFlowParam;", "storeCountryCode", "", "(Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderFlowParam;Ljava/lang/String;)V", "getCardReaderFlowParam", "()Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderFlowParam;", "getStoreCountryCode", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_wasabiDebug"})
        public static final class ContinueToHub extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.ui.cardreader.onboarding.CardReaderFlowParam cardReaderFlowParam = null;
            @org.jetbrains.annotations.NotNull
            private final java.lang.String storeCountryCode = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel.OnboardingEvent.ContinueToHub copy(@org.jetbrains.annotations.NotNull
            com.woocommerce.android.ui.cardreader.onboarding.CardReaderFlowParam cardReaderFlowParam, @org.jetbrains.annotations.NotNull
            java.lang.String storeCountryCode) {
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
            
            public ContinueToHub(@org.jetbrains.annotations.NotNull
            com.woocommerce.android.ui.cardreader.onboarding.CardReaderFlowParam cardReaderFlowParam, @org.jetbrains.annotations.NotNull
            java.lang.String storeCountryCode) {
                super(false);
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderFlowParam component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderFlowParam getCardReaderFlowParam() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getStoreCountryCode() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingEvent$ContinueToConnection;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "cardReaderFlowParam", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderFlowParam;", "(Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderFlowParam;)V", "getCardReaderFlowParam", "()Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderFlowParam;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
        public static final class ContinueToConnection extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.ui.cardreader.onboarding.CardReaderFlowParam cardReaderFlowParam = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel.OnboardingEvent.ContinueToConnection copy(@org.jetbrains.annotations.NotNull
            com.woocommerce.android.ui.cardreader.onboarding.CardReaderFlowParam cardReaderFlowParam) {
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
            
            public ContinueToConnection(@org.jetbrains.annotations.NotNull
            com.woocommerce.android.ui.cardreader.onboarding.CardReaderFlowParam cardReaderFlowParam) {
                super(false);
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderFlowParam component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderFlowParam getCardReaderFlowParam() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0007\b\t\n\u000b\f\r\u000eB\u0011\b\u0004\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\b\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u00a8\u0006\u0017"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState;", "", "layoutRes", "", "(I)V", "getLayoutRes", "()I", "GenericErrorState", "LoadingState", "NoConnectionErrorState", "StripeAcountError", "StripeExtensionError", "UnsupportedErrorState", "WCPayError", "WcPayAndStripeInstalledState", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$LoadingState;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$GenericErrorState;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$WcPayAndStripeInstalledState;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$NoConnectionErrorState;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$UnsupportedErrorState;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$StripeAcountError;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$WCPayError;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$StripeExtensionError;", "WooCommerce_wasabiDebug"})
    public static abstract class OnboardingViewState {
        private final int layoutRes = 0;
        
        private OnboardingViewState(@androidx.annotation.LayoutRes
        int layoutRes) {
            super();
        }
        
        public final int getLayoutRes() {
            return 0;
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$LoadingState;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState;", "()V", "headerLabel", "Lcom/woocommerce/android/model/UiString;", "getHeaderLabel", "()Lcom/woocommerce/android/model/UiString;", "hintLabel", "getHintLabel", "illustration", "", "getIllustration", "()I", "WooCommerce_wasabiDebug"})
        public static final class LoadingState extends com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel.OnboardingViewState {
            @org.jetbrains.annotations.NotNull
            public static final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel.OnboardingViewState.LoadingState INSTANCE = null;
            @org.jetbrains.annotations.NotNull
            private static final com.woocommerce.android.model.UiString headerLabel = null;
            @org.jetbrains.annotations.NotNull
            private static final com.woocommerce.android.model.UiString hintLabel = null;
            @androidx.annotation.DrawableRes
            private static final int illustration = com.woocommerce.android.R.drawable.img_hot_air_balloon;
            
            private LoadingState() {
                super(0);
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.model.UiString getHeaderLabel() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.model.UiString getHintLabel() {
                return null;
            }
            
            public final int getIllustration() {
                return 0;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012\u00a8\u0006\u0014"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$GenericErrorState;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState;", "onContactSupportActionClicked", "Lkotlin/Function0;", "", "onLearnMoreActionClicked", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "contactSupportLabel", "Lcom/woocommerce/android/model/UiString$UiStringRes;", "getContactSupportLabel", "()Lcom/woocommerce/android/model/UiString$UiStringRes;", "illustration", "", "getIllustration", "()I", "learnMoreLabel", "getLearnMoreLabel", "getOnContactSupportActionClicked", "()Lkotlin/jvm/functions/Function0;", "getOnLearnMoreActionClicked", "WooCommerce_wasabiDebug"})
        public static final class GenericErrorState extends com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel.OnboardingViewState {
            @org.jetbrains.annotations.NotNull
            private final kotlin.jvm.functions.Function0<kotlin.Unit> onContactSupportActionClicked = null;
            @org.jetbrains.annotations.NotNull
            private final kotlin.jvm.functions.Function0<kotlin.Unit> onLearnMoreActionClicked = null;
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.model.UiString.UiStringRes contactSupportLabel = null;
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.model.UiString.UiStringRes learnMoreLabel = null;
            private final int illustration = com.woocommerce.android.R.drawable.img_products_error;
            
            public GenericErrorState(@org.jetbrains.annotations.NotNull
            kotlin.jvm.functions.Function0<kotlin.Unit> onContactSupportActionClicked, @org.jetbrains.annotations.NotNull
            kotlin.jvm.functions.Function0<kotlin.Unit> onLearnMoreActionClicked) {
                super(0);
            }
            
            @org.jetbrains.annotations.NotNull
            public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnContactSupportActionClicked() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnLearnMoreActionClicked() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.model.UiString.UiStringRes getContactSupportLabel() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.model.UiString.UiStringRes getLearnMoreLabel() {
                return null;
            }
            
            public final int getIllustration() {
                return 0;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\nJ\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0003JU\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101H\u00d6\u0003J\t\u00102\u001a\u00020\u001aH\u00d6\u0001J\t\u00103\u001a\u000204H\u00d6\u0001R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000eR\u0011\u0010\u0017\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000eR\u0014\u0010\u0019\u001a\u00020\u001aX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0013\u0010$\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u000eR\u0011\u0010&\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u000e\u00a8\u00065"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$WcPayAndStripeInstalledState;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState;", "hintLabel", "Lcom/woocommerce/android/model/UiString;", "onContactSupportActionClicked", "Lkotlin/Function0;", "", "onLearnMoreActionClicked", "onRefreshAfterUpdatingClicked", "openWPAdminActionClicked", "(Lcom/woocommerce/android/model/UiString;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "contactSupportLabel", "Lcom/woocommerce/android/model/UiString$UiStringRes;", "getContactSupportLabel", "()Lcom/woocommerce/android/model/UiString$UiStringRes;", "headerLabel", "getHeaderLabel", "getHintLabel", "()Lcom/woocommerce/android/model/UiString;", "hintOrLabel", "getHintOrLabel", "hintPluginOneLabel", "getHintPluginOneLabel", "hintPluginTwoLabel", "getHintPluginTwoLabel", "illustration", "", "getIllustration", "()I", "learnMoreLabel", "getLearnMoreLabel", "getOnContactSupportActionClicked", "()Lkotlin/jvm/functions/Function0;", "getOnLearnMoreActionClicked", "getOnRefreshAfterUpdatingClicked", "getOpenWPAdminActionClicked", "openWPAdminLabel", "getOpenWPAdminLabel", "refreshButtonLabel", "getRefreshButtonLabel", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "", "WooCommerce_wasabiDebug"})
        public static final class WcPayAndStripeInstalledState extends com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel.OnboardingViewState {
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.model.UiString hintLabel = null;
            @org.jetbrains.annotations.NotNull
            private final kotlin.jvm.functions.Function0<kotlin.Unit> onContactSupportActionClicked = null;
            @org.jetbrains.annotations.NotNull
            private final kotlin.jvm.functions.Function0<kotlin.Unit> onLearnMoreActionClicked = null;
            @org.jetbrains.annotations.NotNull
            private final kotlin.jvm.functions.Function0<kotlin.Unit> onRefreshAfterUpdatingClicked = null;
            @org.jetbrains.annotations.Nullable
            private final kotlin.jvm.functions.Function0<kotlin.Unit> openWPAdminActionClicked = null;
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.model.UiString.UiStringRes headerLabel = null;
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.model.UiString.UiStringRes hintPluginOneLabel = null;
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.model.UiString.UiStringRes hintPluginTwoLabel = null;
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.model.UiString hintOrLabel = null;
            private final int illustration = com.woocommerce.android.R.drawable.img_products_error;
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.model.UiString.UiStringRes contactSupportLabel = null;
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.model.UiString.UiStringRes learnMoreLabel = null;
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.model.UiString.UiStringRes refreshButtonLabel = null;
            @org.jetbrains.annotations.Nullable
            private final com.woocommerce.android.model.UiString.UiStringRes openWPAdminLabel = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel.OnboardingViewState.WcPayAndStripeInstalledState copy(@org.jetbrains.annotations.NotNull
            com.woocommerce.android.model.UiString hintLabel, @org.jetbrains.annotations.NotNull
            kotlin.jvm.functions.Function0<kotlin.Unit> onContactSupportActionClicked, @org.jetbrains.annotations.NotNull
            kotlin.jvm.functions.Function0<kotlin.Unit> onLearnMoreActionClicked, @org.jetbrains.annotations.NotNull
            kotlin.jvm.functions.Function0<kotlin.Unit> onRefreshAfterUpdatingClicked, @org.jetbrains.annotations.Nullable
            kotlin.jvm.functions.Function0<kotlin.Unit> openWPAdminActionClicked) {
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
            
            public WcPayAndStripeInstalledState(@org.jetbrains.annotations.NotNull
            com.woocommerce.android.model.UiString hintLabel, @org.jetbrains.annotations.NotNull
            kotlin.jvm.functions.Function0<kotlin.Unit> onContactSupportActionClicked, @org.jetbrains.annotations.NotNull
            kotlin.jvm.functions.Function0<kotlin.Unit> onLearnMoreActionClicked, @org.jetbrains.annotations.NotNull
            kotlin.jvm.functions.Function0<kotlin.Unit> onRefreshAfterUpdatingClicked, @org.jetbrains.annotations.Nullable
            kotlin.jvm.functions.Function0<kotlin.Unit> openWPAdminActionClicked) {
                super(0);
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.model.UiString component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.model.UiString getHintLabel() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final kotlin.jvm.functions.Function0<kotlin.Unit> component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnContactSupportActionClicked() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final kotlin.jvm.functions.Function0<kotlin.Unit> component3() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnLearnMoreActionClicked() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final kotlin.jvm.functions.Function0<kotlin.Unit> component4() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnRefreshAfterUpdatingClicked() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final kotlin.jvm.functions.Function0<kotlin.Unit> component5() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final kotlin.jvm.functions.Function0<kotlin.Unit> getOpenWPAdminActionClicked() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.model.UiString.UiStringRes getHeaderLabel() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.model.UiString.UiStringRes getHintPluginOneLabel() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.model.UiString.UiStringRes getHintPluginTwoLabel() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.model.UiString getHintOrLabel() {
                return null;
            }
            
            public final int getIllustration() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.model.UiString.UiStringRes getContactSupportLabel() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.model.UiString.UiStringRes getLearnMoreLabel() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.model.UiString.UiStringRes getRefreshButtonLabel() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final com.woocommerce.android.model.UiString.UiStringRes getOpenWPAdminLabel() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$NoConnectionErrorState;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState;", "onRetryButtonActionClicked", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "illustration", "", "getIllustration", "()I", "getOnRetryButtonActionClicked", "()Lkotlin/jvm/functions/Function0;", "WooCommerce_wasabiDebug"})
        public static final class NoConnectionErrorState extends com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel.OnboardingViewState {
            @org.jetbrains.annotations.NotNull
            private final kotlin.jvm.functions.Function0<kotlin.Unit> onRetryButtonActionClicked = null;
            private final int illustration = com.woocommerce.android.R.drawable.ic_woo_error_state;
            
            public NoConnectionErrorState(@org.jetbrains.annotations.NotNull
            kotlin.jvm.functions.Function0<kotlin.Unit> onRetryButtonActionClicked) {
                super(0);
            }
            
            @org.jetbrains.annotations.NotNull
            public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnRetryButtonActionClicked() {
                return null;
            }
            
            public final int getIllustration() {
                return 0;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u001a\u001b\u001c\u001dB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0014\u0010\r\u001a\u00020\u000eX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\bR\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017\u0082\u0001\u0004\u001e\u001f !\u00a8\u0006\""}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$UnsupportedErrorState;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState;", "headerLabel", "Lcom/woocommerce/android/model/UiString;", "(Lcom/woocommerce/android/model/UiString;)V", "contactSupportLabel", "Lcom/woocommerce/android/model/UiString$UiStringRes;", "getContactSupportLabel", "()Lcom/woocommerce/android/model/UiString$UiStringRes;", "getHeaderLabel", "()Lcom/woocommerce/android/model/UiString;", "hintLabel", "getHintLabel", "illustration", "", "getIllustration", "()I", "learnMoreLabel", "getLearnMoreLabel", "onContactSupportActionClicked", "Lkotlin/Function0;", "", "getOnContactSupportActionClicked", "()Lkotlin/jvm/functions/Function0;", "onLearnMoreActionClicked", "getOnLearnMoreActionClicked", "Country", "StripeAccountInUnsupportedCountry", "StripeInCountry", "WcPayInCountry", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$UnsupportedErrorState$Country;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$UnsupportedErrorState$StripeInCountry;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$UnsupportedErrorState$WcPayInCountry;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$UnsupportedErrorState$StripeAccountInUnsupportedCountry;", "WooCommerce_wasabiDebug"})
        public static abstract class UnsupportedErrorState extends com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel.OnboardingViewState {
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.model.UiString headerLabel = null;
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.model.UiString.UiStringRes contactSupportLabel = null;
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.model.UiString.UiStringRes learnMoreLabel = null;
            private final int illustration = com.woocommerce.android.R.drawable.img_hot_air_balloon;
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.model.UiString.UiStringRes hintLabel = null;
            
            private UnsupportedErrorState(com.woocommerce.android.model.UiString headerLabel) {
                super(0);
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.model.UiString getHeaderLabel() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public abstract kotlin.jvm.functions.Function0<kotlin.Unit> getOnContactSupportActionClicked();
            
            @org.jetbrains.annotations.NotNull
            public abstract kotlin.jvm.functions.Function0<kotlin.Unit> getOnLearnMoreActionClicked();
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.model.UiString.UiStringRes getContactSupportLabel() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.model.UiString.UiStringRes getLearnMoreLabel() {
                return null;
            }
            
            public final int getIllustration() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.model.UiString.UiStringRes getHintLabel() {
                return null;
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J3\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f\u00a8\u0006\u0019"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$UnsupportedErrorState$Country;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$UnsupportedErrorState;", "countryDisplayName", "", "onContactSupportActionClicked", "Lkotlin/Function0;", "", "onLearnMoreActionClicked", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getCountryDisplayName", "()Ljava/lang/String;", "getOnContactSupportActionClicked", "()Lkotlin/jvm/functions/Function0;", "getOnLearnMoreActionClicked", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_wasabiDebug"})
            public static final class Country extends com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel.OnboardingViewState.UnsupportedErrorState {
                @org.jetbrains.annotations.NotNull
                private final java.lang.String countryDisplayName = null;
                @org.jetbrains.annotations.NotNull
                private final kotlin.jvm.functions.Function0<kotlin.Unit> onContactSupportActionClicked = null;
                @org.jetbrains.annotations.NotNull
                private final kotlin.jvm.functions.Function0<kotlin.Unit> onLearnMoreActionClicked = null;
                
                @org.jetbrains.annotations.NotNull
                public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel.OnboardingViewState.UnsupportedErrorState.Country copy(@org.jetbrains.annotations.NotNull
                java.lang.String countryDisplayName, @org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> onContactSupportActionClicked, @org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> onLearnMoreActionClicked) {
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
                
                public Country(@org.jetbrains.annotations.NotNull
                java.lang.String countryDisplayName, @org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> onContactSupportActionClicked, @org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> onLearnMoreActionClicked) {
                    super(null);
                }
                
                @org.jetbrains.annotations.NotNull
                public final java.lang.String component1() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                public final java.lang.String getCountryDisplayName() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                public final kotlin.jvm.functions.Function0<kotlin.Unit> component2() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public kotlin.jvm.functions.Function0<kotlin.Unit> getOnContactSupportActionClicked() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                public final kotlin.jvm.functions.Function0<kotlin.Unit> component3() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public kotlin.jvm.functions.Function0<kotlin.Unit> getOnLearnMoreActionClicked() {
                    return null;
                }
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J3\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f\u00a8\u0006\u0019"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$UnsupportedErrorState$StripeInCountry;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$UnsupportedErrorState;", "countryDisplayName", "", "onContactSupportActionClicked", "Lkotlin/Function0;", "", "onLearnMoreActionClicked", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getCountryDisplayName", "()Ljava/lang/String;", "getOnContactSupportActionClicked", "()Lkotlin/jvm/functions/Function0;", "getOnLearnMoreActionClicked", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_wasabiDebug"})
            public static final class StripeInCountry extends com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel.OnboardingViewState.UnsupportedErrorState {
                @org.jetbrains.annotations.NotNull
                private final java.lang.String countryDisplayName = null;
                @org.jetbrains.annotations.NotNull
                private final kotlin.jvm.functions.Function0<kotlin.Unit> onContactSupportActionClicked = null;
                @org.jetbrains.annotations.NotNull
                private final kotlin.jvm.functions.Function0<kotlin.Unit> onLearnMoreActionClicked = null;
                
                @org.jetbrains.annotations.NotNull
                public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel.OnboardingViewState.UnsupportedErrorState.StripeInCountry copy(@org.jetbrains.annotations.NotNull
                java.lang.String countryDisplayName, @org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> onContactSupportActionClicked, @org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> onLearnMoreActionClicked) {
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
                
                public StripeInCountry(@org.jetbrains.annotations.NotNull
                java.lang.String countryDisplayName, @org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> onContactSupportActionClicked, @org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> onLearnMoreActionClicked) {
                    super(null);
                }
                
                @org.jetbrains.annotations.NotNull
                public final java.lang.String component1() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                public final java.lang.String getCountryDisplayName() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                public final kotlin.jvm.functions.Function0<kotlin.Unit> component2() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public kotlin.jvm.functions.Function0<kotlin.Unit> getOnContactSupportActionClicked() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                public final kotlin.jvm.functions.Function0<kotlin.Unit> component3() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public kotlin.jvm.functions.Function0<kotlin.Unit> getOnLearnMoreActionClicked() {
                    return null;
                }
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J3\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f\u00a8\u0006\u0019"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$UnsupportedErrorState$WcPayInCountry;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$UnsupportedErrorState;", "countryDisplayName", "", "onContactSupportActionClicked", "Lkotlin/Function0;", "", "onLearnMoreActionClicked", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getCountryDisplayName", "()Ljava/lang/String;", "getOnContactSupportActionClicked", "()Lkotlin/jvm/functions/Function0;", "getOnLearnMoreActionClicked", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_wasabiDebug"})
            public static final class WcPayInCountry extends com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel.OnboardingViewState.UnsupportedErrorState {
                @org.jetbrains.annotations.NotNull
                private final java.lang.String countryDisplayName = null;
                @org.jetbrains.annotations.NotNull
                private final kotlin.jvm.functions.Function0<kotlin.Unit> onContactSupportActionClicked = null;
                @org.jetbrains.annotations.NotNull
                private final kotlin.jvm.functions.Function0<kotlin.Unit> onLearnMoreActionClicked = null;
                
                @org.jetbrains.annotations.NotNull
                public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel.OnboardingViewState.UnsupportedErrorState.WcPayInCountry copy(@org.jetbrains.annotations.NotNull
                java.lang.String countryDisplayName, @org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> onContactSupportActionClicked, @org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> onLearnMoreActionClicked) {
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
                
                public WcPayInCountry(@org.jetbrains.annotations.NotNull
                java.lang.String countryDisplayName, @org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> onContactSupportActionClicked, @org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> onLearnMoreActionClicked) {
                    super(null);
                }
                
                @org.jetbrains.annotations.NotNull
                public final java.lang.String component1() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                public final java.lang.String getCountryDisplayName() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                public final kotlin.jvm.functions.Function0<kotlin.Unit> component2() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public kotlin.jvm.functions.Function0<kotlin.Unit> getOnContactSupportActionClicked() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                public final kotlin.jvm.functions.Function0<kotlin.Unit> component3() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public kotlin.jvm.functions.Function0<kotlin.Unit> getOnLearnMoreActionClicked() {
                    return null;
                }
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J3\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f\u00a8\u0006\u0019"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$UnsupportedErrorState$StripeAccountInUnsupportedCountry;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$UnsupportedErrorState;", "countryDisplayName", "", "onContactSupportActionClicked", "Lkotlin/Function0;", "", "onLearnMoreActionClicked", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getCountryDisplayName", "()Ljava/lang/String;", "getOnContactSupportActionClicked", "()Lkotlin/jvm/functions/Function0;", "getOnLearnMoreActionClicked", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_wasabiDebug"})
            public static final class StripeAccountInUnsupportedCountry extends com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel.OnboardingViewState.UnsupportedErrorState {
                @org.jetbrains.annotations.NotNull
                private final java.lang.String countryDisplayName = null;
                @org.jetbrains.annotations.NotNull
                private final kotlin.jvm.functions.Function0<kotlin.Unit> onContactSupportActionClicked = null;
                @org.jetbrains.annotations.NotNull
                private final kotlin.jvm.functions.Function0<kotlin.Unit> onLearnMoreActionClicked = null;
                
                @org.jetbrains.annotations.NotNull
                public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel.OnboardingViewState.UnsupportedErrorState.StripeAccountInUnsupportedCountry copy(@org.jetbrains.annotations.NotNull
                java.lang.String countryDisplayName, @org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> onContactSupportActionClicked, @org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> onLearnMoreActionClicked) {
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
                
                public StripeAccountInUnsupportedCountry(@org.jetbrains.annotations.NotNull
                java.lang.String countryDisplayName, @org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> onContactSupportActionClicked, @org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> onLearnMoreActionClicked) {
                    super(null);
                }
                
                @org.jetbrains.annotations.NotNull
                public final java.lang.String component1() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                public final java.lang.String getCountryDisplayName() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                public final kotlin.jvm.functions.Function0<kotlin.Unit> component2() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public kotlin.jvm.functions.Function0<kotlin.Unit> getOnContactSupportActionClicked() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                public final kotlin.jvm.functions.Function0<kotlin.Unit> component3() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public kotlin.jvm.functions.Function0<kotlin.Unit> getOnLearnMoreActionClicked() {
                    return null;
                }
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u001e\u001f !\"B#\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0006R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\fR\u001e\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\u0016X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0018\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u0019\u0082\u0001\u0005#$%&\'\u00a8\u0006("}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$StripeAcountError;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState;", "headerLabel", "Lcom/woocommerce/android/model/UiString;", "hintLabel", "buttonLabel", "(Lcom/woocommerce/android/model/UiString;Lcom/woocommerce/android/model/UiString;Lcom/woocommerce/android/model/UiString;)V", "getButtonLabel", "()Lcom/woocommerce/android/model/UiString;", "contactSupportLabel", "Lcom/woocommerce/android/model/UiString$UiStringRes;", "getContactSupportLabel", "()Lcom/woocommerce/android/model/UiString$UiStringRes;", "getHeaderLabel", "getHintLabel", "illustration", "", "getIllustration", "()I", "learnMoreLabel", "getLearnMoreLabel", "onButtonActionClicked", "Lkotlin/Function0;", "", "getOnButtonActionClicked", "()Lkotlin/jvm/functions/Function0;", "onContactSupportActionClicked", "getOnContactSupportActionClicked", "onLearnMoreActionClicked", "getOnLearnMoreActionClicked", "PluginInTestModeWithLiveAccountState", "StripeAccountOverdueRequirementsState", "StripeAccountPendingRequirementsState", "StripeAccountRejectedState", "StripeAccountUnderReviewState", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$StripeAcountError$StripeAccountUnderReviewState;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$StripeAcountError$StripeAccountRejectedState;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$StripeAcountError$StripeAccountOverdueRequirementsState;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$StripeAcountError$PluginInTestModeWithLiveAccountState;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$StripeAcountError$StripeAccountPendingRequirementsState;", "WooCommerce_wasabiDebug"})
        public static abstract class StripeAcountError extends com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel.OnboardingViewState {
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.model.UiString headerLabel = null;
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.model.UiString hintLabel = null;
            @org.jetbrains.annotations.Nullable
            private final com.woocommerce.android.model.UiString buttonLabel = null;
            @org.jetbrains.annotations.Nullable
            private final kotlin.jvm.functions.Function0<kotlin.Unit> onButtonActionClicked = null;
            @androidx.annotation.DrawableRes
            private final int illustration = com.woocommerce.android.R.drawable.img_products_error;
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.model.UiString.UiStringRes contactSupportLabel = null;
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.model.UiString.UiStringRes learnMoreLabel = null;
            
            private StripeAcountError(com.woocommerce.android.model.UiString headerLabel, com.woocommerce.android.model.UiString hintLabel, com.woocommerce.android.model.UiString buttonLabel) {
                super(0);
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.model.UiString getHeaderLabel() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.model.UiString getHintLabel() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final com.woocommerce.android.model.UiString getButtonLabel() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public abstract kotlin.jvm.functions.Function0<kotlin.Unit> getOnContactSupportActionClicked();
            
            @org.jetbrains.annotations.NotNull
            public abstract kotlin.jvm.functions.Function0<kotlin.Unit> getOnLearnMoreActionClicked();
            
            @org.jetbrains.annotations.Nullable
            public kotlin.jvm.functions.Function0<kotlin.Unit> getOnButtonActionClicked() {
                return null;
            }
            
            public final int getIllustration() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.model.UiString.UiStringRes getContactSupportLabel() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.model.UiString.UiStringRes getLearnMoreLabel() {
                return null;
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J)\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$StripeAcountError$StripeAccountUnderReviewState;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$StripeAcountError;", "onContactSupportActionClicked", "Lkotlin/Function0;", "", "onLearnMoreActionClicked", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getOnContactSupportActionClicked", "()Lkotlin/jvm/functions/Function0;", "getOnLearnMoreActionClicked", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
            public static final class StripeAccountUnderReviewState extends com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel.OnboardingViewState.StripeAcountError {
                @org.jetbrains.annotations.NotNull
                private final kotlin.jvm.functions.Function0<kotlin.Unit> onContactSupportActionClicked = null;
                @org.jetbrains.annotations.NotNull
                private final kotlin.jvm.functions.Function0<kotlin.Unit> onLearnMoreActionClicked = null;
                
                @org.jetbrains.annotations.NotNull
                public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel.OnboardingViewState.StripeAcountError.StripeAccountUnderReviewState copy(@org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> onContactSupportActionClicked, @org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> onLearnMoreActionClicked) {
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
                
                public StripeAccountUnderReviewState(@org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> onContactSupportActionClicked, @org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> onLearnMoreActionClicked) {
                    super(null, null, null);
                }
                
                @org.jetbrains.annotations.NotNull
                public final kotlin.jvm.functions.Function0<kotlin.Unit> component1() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public kotlin.jvm.functions.Function0<kotlin.Unit> getOnContactSupportActionClicked() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                public final kotlin.jvm.functions.Function0<kotlin.Unit> component2() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public kotlin.jvm.functions.Function0<kotlin.Unit> getOnLearnMoreActionClicked() {
                    return null;
                }
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J)\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$StripeAcountError$StripeAccountRejectedState;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$StripeAcountError;", "onContactSupportActionClicked", "Lkotlin/Function0;", "", "onLearnMoreActionClicked", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getOnContactSupportActionClicked", "()Lkotlin/jvm/functions/Function0;", "getOnLearnMoreActionClicked", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
            public static final class StripeAccountRejectedState extends com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel.OnboardingViewState.StripeAcountError {
                @org.jetbrains.annotations.NotNull
                private final kotlin.jvm.functions.Function0<kotlin.Unit> onContactSupportActionClicked = null;
                @org.jetbrains.annotations.NotNull
                private final kotlin.jvm.functions.Function0<kotlin.Unit> onLearnMoreActionClicked = null;
                
                @org.jetbrains.annotations.NotNull
                public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel.OnboardingViewState.StripeAcountError.StripeAccountRejectedState copy(@org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> onContactSupportActionClicked, @org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> onLearnMoreActionClicked) {
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
                
                public StripeAccountRejectedState(@org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> onContactSupportActionClicked, @org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> onLearnMoreActionClicked) {
                    super(null, null, null);
                }
                
                @org.jetbrains.annotations.NotNull
                public final kotlin.jvm.functions.Function0<kotlin.Unit> component1() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public kotlin.jvm.functions.Function0<kotlin.Unit> getOnContactSupportActionClicked() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                public final kotlin.jvm.functions.Function0<kotlin.Unit> component2() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public kotlin.jvm.functions.Function0<kotlin.Unit> getOnLearnMoreActionClicked() {
                    return null;
                }
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J)\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$StripeAcountError$StripeAccountOverdueRequirementsState;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$StripeAcountError;", "onContactSupportActionClicked", "Lkotlin/Function0;", "", "onLearnMoreActionClicked", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getOnContactSupportActionClicked", "()Lkotlin/jvm/functions/Function0;", "getOnLearnMoreActionClicked", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
            public static final class StripeAccountOverdueRequirementsState extends com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel.OnboardingViewState.StripeAcountError {
                @org.jetbrains.annotations.NotNull
                private final kotlin.jvm.functions.Function0<kotlin.Unit> onContactSupportActionClicked = null;
                @org.jetbrains.annotations.NotNull
                private final kotlin.jvm.functions.Function0<kotlin.Unit> onLearnMoreActionClicked = null;
                
                @org.jetbrains.annotations.NotNull
                public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel.OnboardingViewState.StripeAcountError.StripeAccountOverdueRequirementsState copy(@org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> onContactSupportActionClicked, @org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> onLearnMoreActionClicked) {
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
                
                public StripeAccountOverdueRequirementsState(@org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> onContactSupportActionClicked, @org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> onLearnMoreActionClicked) {
                    super(null, null, null);
                }
                
                @org.jetbrains.annotations.NotNull
                public final kotlin.jvm.functions.Function0<kotlin.Unit> component1() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public kotlin.jvm.functions.Function0<kotlin.Unit> getOnContactSupportActionClicked() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                public final kotlin.jvm.functions.Function0<kotlin.Unit> component2() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public kotlin.jvm.functions.Function0<kotlin.Unit> getOnLearnMoreActionClicked() {
                    return null;
                }
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J)\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$StripeAcountError$PluginInTestModeWithLiveAccountState;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$StripeAcountError;", "onContactSupportActionClicked", "Lkotlin/Function0;", "", "onLearnMoreActionClicked", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getOnContactSupportActionClicked", "()Lkotlin/jvm/functions/Function0;", "getOnLearnMoreActionClicked", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
            public static final class PluginInTestModeWithLiveAccountState extends com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel.OnboardingViewState.StripeAcountError {
                @org.jetbrains.annotations.NotNull
                private final kotlin.jvm.functions.Function0<kotlin.Unit> onContactSupportActionClicked = null;
                @org.jetbrains.annotations.NotNull
                private final kotlin.jvm.functions.Function0<kotlin.Unit> onLearnMoreActionClicked = null;
                
                @org.jetbrains.annotations.NotNull
                public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel.OnboardingViewState.StripeAcountError.PluginInTestModeWithLiveAccountState copy(@org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> onContactSupportActionClicked, @org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> onLearnMoreActionClicked) {
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
                
                public PluginInTestModeWithLiveAccountState(@org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> onContactSupportActionClicked, @org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> onLearnMoreActionClicked) {
                    super(null, null, null);
                }
                
                @org.jetbrains.annotations.NotNull
                public final kotlin.jvm.functions.Function0<kotlin.Unit> component1() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public kotlin.jvm.functions.Function0<kotlin.Unit> getOnContactSupportActionClicked() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                public final kotlin.jvm.functions.Function0<kotlin.Unit> component2() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public kotlin.jvm.functions.Function0<kotlin.Unit> getOnLearnMoreActionClicked() {
                    return null;
                }
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\bH\u00c6\u0003JC\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\bH\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r\u00a8\u0006\u001c"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$StripeAcountError$StripeAccountPendingRequirementsState;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$StripeAcountError;", "onContactSupportActionClicked", "Lkotlin/Function0;", "", "onLearnMoreActionClicked", "onButtonActionClicked", "dueDate", "", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;)V", "getDueDate", "()Ljava/lang/String;", "getOnButtonActionClicked", "()Lkotlin/jvm/functions/Function0;", "getOnContactSupportActionClicked", "getOnLearnMoreActionClicked", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_wasabiDebug"})
            public static final class StripeAccountPendingRequirementsState extends com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel.OnboardingViewState.StripeAcountError {
                @org.jetbrains.annotations.NotNull
                private final kotlin.jvm.functions.Function0<kotlin.Unit> onContactSupportActionClicked = null;
                @org.jetbrains.annotations.NotNull
                private final kotlin.jvm.functions.Function0<kotlin.Unit> onLearnMoreActionClicked = null;
                @org.jetbrains.annotations.NotNull
                private final kotlin.jvm.functions.Function0<kotlin.Unit> onButtonActionClicked = null;
                @org.jetbrains.annotations.NotNull
                private final java.lang.String dueDate = null;
                
                @org.jetbrains.annotations.NotNull
                public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel.OnboardingViewState.StripeAcountError.StripeAccountPendingRequirementsState copy(@org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> onContactSupportActionClicked, @org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> onLearnMoreActionClicked, @org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> onButtonActionClicked, @org.jetbrains.annotations.NotNull
                java.lang.String dueDate) {
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
                
                public StripeAccountPendingRequirementsState(@org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> onContactSupportActionClicked, @org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> onLearnMoreActionClicked, @org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> onButtonActionClicked, @org.jetbrains.annotations.NotNull
                java.lang.String dueDate) {
                    super(null, null, null);
                }
                
                @org.jetbrains.annotations.NotNull
                public final kotlin.jvm.functions.Function0<kotlin.Unit> component1() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public kotlin.jvm.functions.Function0<kotlin.Unit> getOnContactSupportActionClicked() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                public final kotlin.jvm.functions.Function0<kotlin.Unit> component2() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public kotlin.jvm.functions.Function0<kotlin.Unit> getOnLearnMoreActionClicked() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                public final kotlin.jvm.functions.Function0<kotlin.Unit> component3() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public kotlin.jvm.functions.Function0<kotlin.Unit> getOnButtonActionClicked() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                public final java.lang.String component4() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                public final java.lang.String getDueDate() {
                    return null;
                }
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0018\u0019\u001a\u001bB\'\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tR\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\t\u0082\u0001\u0004\u001c\u001d\u001e\u001f\u00a8\u0006 "}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$WCPayError;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState;", "headerLabel", "Lcom/woocommerce/android/model/UiString;", "hintLabel", "learnMoreLabel", "refreshButtonLabel", "(Lcom/woocommerce/android/model/UiString;Lcom/woocommerce/android/model/UiString;Lcom/woocommerce/android/model/UiString;Lcom/woocommerce/android/model/UiString;)V", "getHeaderLabel", "()Lcom/woocommerce/android/model/UiString;", "getHintLabel", "illustration", "", "getIllustration", "()I", "getLearnMoreLabel", "onLearnMoreActionClicked", "Lkotlin/Function0;", "", "getOnLearnMoreActionClicked", "()Lkotlin/jvm/functions/Function0;", "refreshButtonAction", "getRefreshButtonAction", "getRefreshButtonLabel", "WCPayNotActivatedState", "WCPayNotInstalledState", "WCPayNotSetupState", "WCPayUnsupportedVersionState", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$WCPayError$WCPayNotInstalledState;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$WCPayError$WCPayNotActivatedState;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$WCPayError$WCPayNotSetupState;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$WCPayError$WCPayUnsupportedVersionState;", "WooCommerce_wasabiDebug"})
        public static abstract class WCPayError extends com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel.OnboardingViewState {
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.model.UiString headerLabel = null;
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.model.UiString hintLabel = null;
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.model.UiString learnMoreLabel = null;
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.model.UiString refreshButtonLabel = null;
            @androidx.annotation.DrawableRes
            private final int illustration = com.woocommerce.android.R.drawable.img_woo_payments;
            
            private WCPayError(com.woocommerce.android.model.UiString headerLabel, com.woocommerce.android.model.UiString hintLabel, com.woocommerce.android.model.UiString learnMoreLabel, com.woocommerce.android.model.UiString refreshButtonLabel) {
                super(0);
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.model.UiString getHeaderLabel() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.model.UiString getHintLabel() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.model.UiString getLearnMoreLabel() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.model.UiString getRefreshButtonLabel() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public abstract kotlin.jvm.functions.Function0<kotlin.Unit> getRefreshButtonAction();
            
            @org.jetbrains.annotations.NotNull
            public abstract kotlin.jvm.functions.Function0<kotlin.Unit> getOnLearnMoreActionClicked();
            
            public final int getIllustration() {
                return 0;
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J)\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$WCPayError$WCPayNotInstalledState;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$WCPayError;", "refreshButtonAction", "Lkotlin/Function0;", "", "onLearnMoreActionClicked", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getOnLearnMoreActionClicked", "()Lkotlin/jvm/functions/Function0;", "getRefreshButtonAction", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
            public static final class WCPayNotInstalledState extends com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel.OnboardingViewState.WCPayError {
                @org.jetbrains.annotations.NotNull
                private final kotlin.jvm.functions.Function0<kotlin.Unit> refreshButtonAction = null;
                @org.jetbrains.annotations.NotNull
                private final kotlin.jvm.functions.Function0<kotlin.Unit> onLearnMoreActionClicked = null;
                
                @org.jetbrains.annotations.NotNull
                public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel.OnboardingViewState.WCPayError.WCPayNotInstalledState copy(@org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> refreshButtonAction, @org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> onLearnMoreActionClicked) {
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
                
                public WCPayNotInstalledState(@org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> refreshButtonAction, @org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> onLearnMoreActionClicked) {
                    super(null, null, null, null);
                }
                
                @org.jetbrains.annotations.NotNull
                public final kotlin.jvm.functions.Function0<kotlin.Unit> component1() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public kotlin.jvm.functions.Function0<kotlin.Unit> getRefreshButtonAction() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                public final kotlin.jvm.functions.Function0<kotlin.Unit> component2() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public kotlin.jvm.functions.Function0<kotlin.Unit> getOnLearnMoreActionClicked() {
                    return null;
                }
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J)\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$WCPayError$WCPayNotActivatedState;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$WCPayError;", "refreshButtonAction", "Lkotlin/Function0;", "", "onLearnMoreActionClicked", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getOnLearnMoreActionClicked", "()Lkotlin/jvm/functions/Function0;", "getRefreshButtonAction", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
            public static final class WCPayNotActivatedState extends com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel.OnboardingViewState.WCPayError {
                @org.jetbrains.annotations.NotNull
                private final kotlin.jvm.functions.Function0<kotlin.Unit> refreshButtonAction = null;
                @org.jetbrains.annotations.NotNull
                private final kotlin.jvm.functions.Function0<kotlin.Unit> onLearnMoreActionClicked = null;
                
                @org.jetbrains.annotations.NotNull
                public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel.OnboardingViewState.WCPayError.WCPayNotActivatedState copy(@org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> refreshButtonAction, @org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> onLearnMoreActionClicked) {
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
                
                public WCPayNotActivatedState(@org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> refreshButtonAction, @org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> onLearnMoreActionClicked) {
                    super(null, null, null, null);
                }
                
                @org.jetbrains.annotations.NotNull
                public final kotlin.jvm.functions.Function0<kotlin.Unit> component1() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public kotlin.jvm.functions.Function0<kotlin.Unit> getRefreshButtonAction() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                public final kotlin.jvm.functions.Function0<kotlin.Unit> component2() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public kotlin.jvm.functions.Function0<kotlin.Unit> getOnLearnMoreActionClicked() {
                    return null;
                }
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J)\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$WCPayError$WCPayNotSetupState;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$WCPayError;", "refreshButtonAction", "Lkotlin/Function0;", "", "onLearnMoreActionClicked", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getOnLearnMoreActionClicked", "()Lkotlin/jvm/functions/Function0;", "getRefreshButtonAction", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
            public static final class WCPayNotSetupState extends com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel.OnboardingViewState.WCPayError {
                @org.jetbrains.annotations.NotNull
                private final kotlin.jvm.functions.Function0<kotlin.Unit> refreshButtonAction = null;
                @org.jetbrains.annotations.NotNull
                private final kotlin.jvm.functions.Function0<kotlin.Unit> onLearnMoreActionClicked = null;
                
                @org.jetbrains.annotations.NotNull
                public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel.OnboardingViewState.WCPayError.WCPayNotSetupState copy(@org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> refreshButtonAction, @org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> onLearnMoreActionClicked) {
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
                
                public WCPayNotSetupState(@org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> refreshButtonAction, @org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> onLearnMoreActionClicked) {
                    super(null, null, null, null);
                }
                
                @org.jetbrains.annotations.NotNull
                public final kotlin.jvm.functions.Function0<kotlin.Unit> component1() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public kotlin.jvm.functions.Function0<kotlin.Unit> getRefreshButtonAction() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                public final kotlin.jvm.functions.Function0<kotlin.Unit> component2() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public kotlin.jvm.functions.Function0<kotlin.Unit> getOnLearnMoreActionClicked() {
                    return null;
                }
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J)\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$WCPayError$WCPayUnsupportedVersionState;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$WCPayError;", "refreshButtonAction", "Lkotlin/Function0;", "", "onLearnMoreActionClicked", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getOnLearnMoreActionClicked", "()Lkotlin/jvm/functions/Function0;", "getRefreshButtonAction", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
            public static final class WCPayUnsupportedVersionState extends com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel.OnboardingViewState.WCPayError {
                @org.jetbrains.annotations.NotNull
                private final kotlin.jvm.functions.Function0<kotlin.Unit> refreshButtonAction = null;
                @org.jetbrains.annotations.NotNull
                private final kotlin.jvm.functions.Function0<kotlin.Unit> onLearnMoreActionClicked = null;
                
                @org.jetbrains.annotations.NotNull
                public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel.OnboardingViewState.WCPayError.WCPayUnsupportedVersionState copy(@org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> refreshButtonAction, @org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> onLearnMoreActionClicked) {
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
                
                public WCPayUnsupportedVersionState(@org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> refreshButtonAction, @org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> onLearnMoreActionClicked) {
                    super(null, null, null, null);
                }
                
                @org.jetbrains.annotations.NotNull
                public final kotlin.jvm.functions.Function0<kotlin.Unit> component1() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public kotlin.jvm.functions.Function0<kotlin.Unit> getRefreshButtonAction() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                public final kotlin.jvm.functions.Function0<kotlin.Unit> component2() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public kotlin.jvm.functions.Function0<kotlin.Unit> getOnLearnMoreActionClicked() {
                    return null;
                }
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\'\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tR\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\t\u0082\u0001\u0002\u001a\u001b\u00a8\u0006\u001c"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$StripeExtensionError;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState;", "headerLabel", "Lcom/woocommerce/android/model/UiString;", "hintLabel", "learnMoreLabel", "refreshButtonLabel", "(Lcom/woocommerce/android/model/UiString;Lcom/woocommerce/android/model/UiString;Lcom/woocommerce/android/model/UiString;Lcom/woocommerce/android/model/UiString;)V", "getHeaderLabel", "()Lcom/woocommerce/android/model/UiString;", "getHintLabel", "illustration", "", "getIllustration", "()I", "getLearnMoreLabel", "onLearnMoreActionClicked", "Lkotlin/Function0;", "", "getOnLearnMoreActionClicked", "()Lkotlin/jvm/functions/Function0;", "refreshButtonAction", "getRefreshButtonAction", "getRefreshButtonLabel", "StripeExtensionNotSetupState", "StripeExtensionUnsupportedVersionState", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$StripeExtensionError$StripeExtensionNotSetupState;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$StripeExtensionError$StripeExtensionUnsupportedVersionState;", "WooCommerce_wasabiDebug"})
        public static abstract class StripeExtensionError extends com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel.OnboardingViewState {
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.model.UiString headerLabel = null;
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.model.UiString hintLabel = null;
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.model.UiString learnMoreLabel = null;
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.model.UiString refreshButtonLabel = null;
            @androidx.annotation.DrawableRes
            private final int illustration = com.woocommerce.android.R.drawable.img_stripe_extension;
            
            private StripeExtensionError(com.woocommerce.android.model.UiString headerLabel, com.woocommerce.android.model.UiString hintLabel, com.woocommerce.android.model.UiString learnMoreLabel, com.woocommerce.android.model.UiString refreshButtonLabel) {
                super(0);
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.model.UiString getHeaderLabel() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.model.UiString getHintLabel() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.model.UiString getLearnMoreLabel() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.model.UiString getRefreshButtonLabel() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public abstract kotlin.jvm.functions.Function0<kotlin.Unit> getRefreshButtonAction();
            
            @org.jetbrains.annotations.NotNull
            public abstract kotlin.jvm.functions.Function0<kotlin.Unit> getOnLearnMoreActionClicked();
            
            public final int getIllustration() {
                return 0;
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J)\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$StripeExtensionError$StripeExtensionNotSetupState;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$StripeExtensionError;", "refreshButtonAction", "Lkotlin/Function0;", "", "onLearnMoreActionClicked", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getOnLearnMoreActionClicked", "()Lkotlin/jvm/functions/Function0;", "getRefreshButtonAction", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
            public static final class StripeExtensionNotSetupState extends com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel.OnboardingViewState.StripeExtensionError {
                @org.jetbrains.annotations.NotNull
                private final kotlin.jvm.functions.Function0<kotlin.Unit> refreshButtonAction = null;
                @org.jetbrains.annotations.NotNull
                private final kotlin.jvm.functions.Function0<kotlin.Unit> onLearnMoreActionClicked = null;
                
                @org.jetbrains.annotations.NotNull
                public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel.OnboardingViewState.StripeExtensionError.StripeExtensionNotSetupState copy(@org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> refreshButtonAction, @org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> onLearnMoreActionClicked) {
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
                
                public StripeExtensionNotSetupState(@org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> refreshButtonAction, @org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> onLearnMoreActionClicked) {
                    super(null, null, null, null);
                }
                
                @org.jetbrains.annotations.NotNull
                public final kotlin.jvm.functions.Function0<kotlin.Unit> component1() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public kotlin.jvm.functions.Function0<kotlin.Unit> getRefreshButtonAction() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                public final kotlin.jvm.functions.Function0<kotlin.Unit> component2() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public kotlin.jvm.functions.Function0<kotlin.Unit> getOnLearnMoreActionClicked() {
                    return null;
                }
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J)\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$StripeExtensionError$StripeExtensionUnsupportedVersionState;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$StripeExtensionError;", "refreshButtonAction", "Lkotlin/Function0;", "", "onLearnMoreActionClicked", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getOnLearnMoreActionClicked", "()Lkotlin/jvm/functions/Function0;", "getRefreshButtonAction", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
            public static final class StripeExtensionUnsupportedVersionState extends com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel.OnboardingViewState.StripeExtensionError {
                @org.jetbrains.annotations.NotNull
                private final kotlin.jvm.functions.Function0<kotlin.Unit> refreshButtonAction = null;
                @org.jetbrains.annotations.NotNull
                private final kotlin.jvm.functions.Function0<kotlin.Unit> onLearnMoreActionClicked = null;
                
                @org.jetbrains.annotations.NotNull
                public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel.OnboardingViewState.StripeExtensionError.StripeExtensionUnsupportedVersionState copy(@org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> refreshButtonAction, @org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> onLearnMoreActionClicked) {
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
                
                public StripeExtensionUnsupportedVersionState(@org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> refreshButtonAction, @org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> onLearnMoreActionClicked) {
                    super(null, null, null, null);
                }
                
                @org.jetbrains.annotations.NotNull
                public final kotlin.jvm.functions.Function0<kotlin.Unit> component1() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public kotlin.jvm.functions.Function0<kotlin.Unit> getRefreshButtonAction() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                public final kotlin.jvm.functions.Function0<kotlin.Unit> component2() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public kotlin.jvm.functions.Function0<kotlin.Unit> getOnLearnMoreActionClicked() {
                    return null;
                }
            }
        }
    }
}