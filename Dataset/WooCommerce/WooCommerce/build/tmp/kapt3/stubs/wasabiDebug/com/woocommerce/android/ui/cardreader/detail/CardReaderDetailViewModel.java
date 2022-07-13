package com.woocommerce.android.ui.cardreader.detail;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003;<=B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020 H\u0002J\u0010\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020 H\u0002J\u0010\u0010&\u001a\u00020 2\u0006\u0010\'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020 H\u0002J\b\u0010*\u001a\u00020 H\u0002J\b\u0010+\u001a\u00020 H\u0002J\u0012\u0010,\u001a\u00020 2\b\u0010-\u001a\u0004\u0018\u00010.H\u0002J\b\u0010/\u001a\u00020 H\u0002J\u000e\u00100\u001a\u00020 2\u0006\u00101\u001a\u000202J\u001a\u00103\u001a\u00020 2\u0006\u00104\u001a\u0002052\b\b\u0002\u00106\u001a\u000207H\u0002J\u0010\u00108\u001a\u00020 2\u0006\u00109\u001a\u00020:H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e\u00a8\u0006>"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/detail/CardReaderDetailViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "cardReaderManager", "Lcom/woocommerce/android/cardreader/CardReaderManager;", "tracker", "Lcom/woocommerce/android/ui/cardreader/CardReaderTracker;", "appPrefsWrapper", "Lcom/woocommerce/android/AppPrefsWrapper;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/woocommerce/android/cardreader/CardReaderManager;Lcom/woocommerce/android/ui/cardreader/CardReaderTracker;Lcom/woocommerce/android/AppPrefsWrapper;Lcom/woocommerce/android/tools/SelectedSite;Landroidx/lifecycle/SavedStateHandle;)V", "arguments", "Lcom/woocommerce/android/ui/cardreader/detail/CardReaderDetailFragmentArgs;", "getArguments", "()Lcom/woocommerce/android/ui/cardreader/detail/CardReaderDetailFragmentArgs;", "arguments$delegate", "Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "batteryStatusUpdateJob", "Lkotlinx/coroutines/Job;", "getCardReaderManager", "()Lcom/woocommerce/android/cardreader/CardReaderManager;", "softwareUpdateAvailabilityJob", "viewState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/woocommerce/android/ui/cardreader/detail/CardReaderDetailViewModel$ViewState;", "viewStateData", "Landroidx/lifecycle/LiveData;", "getViewStateData", "()Landroidx/lifecycle/LiveData;", "cancelConnectedScopeJobs", "", "clearLastKnowReader", "handleBatteryStatusChange", "newStatus", "Lcom/woocommerce/android/cardreader/connection/event/CardReaderBatteryStatus;", "handleNotConnectedState", "handleSoftwareUpdateAvailability", "updateStatus", "Lcom/woocommerce/android/cardreader/connection/event/SoftwareUpdateAvailability;", "onConnectBtnClicked", "onDisconnectClicked", "onLearnMoreClicked", "onReadersNameLongClick", "readersName", "", "onUpdateReaderClicked", "onUpdateReaderResult", "updateResult", "Lcom/woocommerce/android/ui/cardreader/update/CardReaderUpdateViewModel$UpdateResult;", "showConnectedState", "readerStatus", "Lcom/woocommerce/android/cardreader/connection/CardReaderStatus$Connected;", "updateAvailable", "", "updateBatteryLevelOnConnectedState", "newBatteryLevel", "", "CardReaderDetailEvent", "NavigationTarget", "ViewState", "WooCommerce_wasabiDebug"})
public final class CardReaderDetailViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.cardreader.CardReaderManager cardReaderManager = null;
    private final com.woocommerce.android.ui.cardreader.CardReaderTracker tracker = null;
    private final com.woocommerce.android.AppPrefsWrapper appPrefsWrapper = null;
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    private final com.woocommerce.android.viewmodel.NavArgsLazy arguments$delegate = null;
    private final androidx.lifecycle.MutableLiveData<com.woocommerce.android.ui.cardreader.detail.CardReaderDetailViewModel.ViewState> viewState = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.woocommerce.android.ui.cardreader.detail.CardReaderDetailViewModel.ViewState> viewStateData = null;
    private kotlinx.coroutines.Job softwareUpdateAvailabilityJob;
    private kotlinx.coroutines.Job batteryStatusUpdateJob;
    
    @javax.inject.Inject
    public CardReaderDetailViewModel(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.cardreader.CardReaderManager cardReaderManager, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.cardreader.CardReaderTracker tracker, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.AppPrefsWrapper appPrefsWrapper, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.SelectedSite selectedSite, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedState) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.cardreader.CardReaderManager getCardReaderManager() {
        return null;
    }
    
    private final com.woocommerce.android.ui.cardreader.detail.CardReaderDetailFragmentArgs getArguments() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.woocommerce.android.ui.cardreader.detail.CardReaderDetailViewModel.ViewState> getViewStateData() {
        return null;
    }
    
    public final void onUpdateReaderResult(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.cardreader.update.CardReaderUpdateViewModel.UpdateResult updateResult) {
    }
    
    private final void handleNotConnectedState() {
    }
    
    private final void cancelConnectedScopeJobs() {
    }
    
    private final void showConnectedState(com.woocommerce.android.cardreader.connection.CardReaderStatus.Connected readerStatus, boolean updateAvailable) {
    }
    
    private final void updateBatteryLevelOnConnectedState(float newBatteryLevel) {
    }
    
    private final void onLearnMoreClicked() {
    }
    
    private final void onConnectBtnClicked() {
    }
    
    private final void onUpdateReaderClicked() {
    }
    
    private final void onDisconnectClicked() {
    }
    
    private final void handleSoftwareUpdateAvailability(com.woocommerce.android.cardreader.connection.event.SoftwareUpdateAvailability updateStatus) {
    }
    
    private final void handleBatteryStatusChange(com.woocommerce.android.cardreader.connection.event.CardReaderBatteryStatus newStatus) {
    }
    
    private final void clearLastKnowReader() {
    }
    
    private final void onReadersNameLongClick(java.lang.String readersName) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/detail/CardReaderDetailViewModel$NavigationTarget;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "()V", "CardReaderConnectScreen", "CardReaderUpdateScreen", "Lcom/woocommerce/android/ui/cardreader/detail/CardReaderDetailViewModel$NavigationTarget$CardReaderConnectScreen;", "Lcom/woocommerce/android/ui/cardreader/detail/CardReaderDetailViewModel$NavigationTarget$CardReaderUpdateScreen;", "WooCommerce_wasabiDebug"})
    public static abstract class NavigationTarget extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        
        private NavigationTarget() {
            super(false);
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/detail/CardReaderDetailViewModel$NavigationTarget$CardReaderConnectScreen;", "Lcom/woocommerce/android/ui/cardreader/detail/CardReaderDetailViewModel$NavigationTarget;", "cardReaderFlowParam", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderFlowParam;", "(Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderFlowParam;)V", "getCardReaderFlowParam", "()Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderFlowParam;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
        public static final class CardReaderConnectScreen extends com.woocommerce.android.ui.cardreader.detail.CardReaderDetailViewModel.NavigationTarget {
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.ui.cardreader.onboarding.CardReaderFlowParam cardReaderFlowParam = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.cardreader.detail.CardReaderDetailViewModel.NavigationTarget.CardReaderConnectScreen copy(@org.jetbrains.annotations.NotNull
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
            
            public CardReaderConnectScreen(@org.jetbrains.annotations.NotNull
            com.woocommerce.android.ui.cardreader.onboarding.CardReaderFlowParam cardReaderFlowParam) {
                super();
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
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/detail/CardReaderDetailViewModel$NavigationTarget$CardReaderUpdateScreen;", "Lcom/woocommerce/android/ui/cardreader/detail/CardReaderDetailViewModel$NavigationTarget;", "()V", "WooCommerce_wasabiDebug"})
        public static final class CardReaderUpdateScreen extends com.woocommerce.android.ui.cardreader.detail.CardReaderDetailViewModel.NavigationTarget {
            @org.jetbrains.annotations.NotNull
            public static final com.woocommerce.android.ui.cardreader.detail.CardReaderDetailViewModel.NavigationTarget.CardReaderUpdateScreen INSTANCE = null;
            
            private CardReaderUpdateScreen() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/detail/CardReaderDetailViewModel$CardReaderDetailEvent;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "()V", "CardReaderConnected", "CardReaderDisconnected", "CopyReadersNameToClipboard", "NavigateToUrlInGenericWebView", "Lcom/woocommerce/android/ui/cardreader/detail/CardReaderDetailViewModel$CardReaderDetailEvent$NavigateToUrlInGenericWebView;", "Lcom/woocommerce/android/ui/cardreader/detail/CardReaderDetailViewModel$CardReaderDetailEvent$CopyReadersNameToClipboard;", "Lcom/woocommerce/android/ui/cardreader/detail/CardReaderDetailViewModel$CardReaderDetailEvent$CardReaderDisconnected;", "Lcom/woocommerce/android/ui/cardreader/detail/CardReaderDetailViewModel$CardReaderDetailEvent$CardReaderConnected;", "WooCommerce_wasabiDebug"})
    public static abstract class CardReaderDetailEvent extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        
        private CardReaderDetailEvent() {
            super(false);
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/detail/CardReaderDetailViewModel$CardReaderDetailEvent$NavigateToUrlInGenericWebView;", "Lcom/woocommerce/android/ui/cardreader/detail/CardReaderDetailViewModel$CardReaderDetailEvent;", "url", "", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_wasabiDebug"})
        public static final class NavigateToUrlInGenericWebView extends com.woocommerce.android.ui.cardreader.detail.CardReaderDetailViewModel.CardReaderDetailEvent {
            @org.jetbrains.annotations.NotNull
            private final java.lang.String url = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.cardreader.detail.CardReaderDetailViewModel.CardReaderDetailEvent.NavigateToUrlInGenericWebView copy(@org.jetbrains.annotations.NotNull
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
                super();
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
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/detail/CardReaderDetailViewModel$CardReaderDetailEvent$CopyReadersNameToClipboard;", "Lcom/woocommerce/android/ui/cardreader/detail/CardReaderDetailViewModel$CardReaderDetailEvent;", "readersName", "", "(Ljava/lang/String;)V", "getReadersName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_wasabiDebug"})
        public static final class CopyReadersNameToClipboard extends com.woocommerce.android.ui.cardreader.detail.CardReaderDetailViewModel.CardReaderDetailEvent {
            @org.jetbrains.annotations.NotNull
            private final java.lang.String readersName = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.cardreader.detail.CardReaderDetailViewModel.CardReaderDetailEvent.CopyReadersNameToClipboard copy(@org.jetbrains.annotations.NotNull
            java.lang.String readersName) {
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
            
            public CopyReadersNameToClipboard(@org.jetbrains.annotations.NotNull
            java.lang.String readersName) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getReadersName() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/detail/CardReaderDetailViewModel$CardReaderDetailEvent$CardReaderDisconnected;", "Lcom/woocommerce/android/ui/cardreader/detail/CardReaderDetailViewModel$CardReaderDetailEvent;", "accessibilityDisconnectedText", "", "(I)V", "getAccessibilityDisconnectedText", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "WooCommerce_wasabiDebug"})
        public static final class CardReaderDisconnected extends com.woocommerce.android.ui.cardreader.detail.CardReaderDetailViewModel.CardReaderDetailEvent {
            private final int accessibilityDisconnectedText = 0;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.cardreader.detail.CardReaderDetailViewModel.CardReaderDetailEvent.CardReaderDisconnected copy(@androidx.annotation.StringRes
            int accessibilityDisconnectedText) {
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
            
            public CardReaderDisconnected() {
                super();
            }
            
            public CardReaderDisconnected(@androidx.annotation.StringRes
            int accessibilityDisconnectedText) {
                super();
            }
            
            public final int component1() {
                return 0;
            }
            
            public final int getAccessibilityDisconnectedText() {
                return 0;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/detail/CardReaderDetailViewModel$CardReaderDetailEvent$CardReaderConnected;", "Lcom/woocommerce/android/ui/cardreader/detail/CardReaderDetailViewModel$CardReaderDetailEvent;", "accessibilityConnectedText", "", "(I)V", "getAccessibilityConnectedText", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "WooCommerce_wasabiDebug"})
        public static final class CardReaderConnected extends com.woocommerce.android.ui.cardreader.detail.CardReaderDetailViewModel.CardReaderDetailEvent {
            private final int accessibilityConnectedText = 0;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.cardreader.detail.CardReaderDetailViewModel.CardReaderDetailEvent.CardReaderConnected copy(@androidx.annotation.StringRes
            int accessibilityConnectedText) {
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
            
            public CardReaderConnected() {
                super();
            }
            
            public CardReaderConnected(@androidx.annotation.StringRes
            int accessibilityConnectedText) {
                super();
            }
            
            public final int component1() {
                return 0;
            }
            
            public final int getAccessibilityConnectedText() {
                return 0;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/detail/CardReaderDetailViewModel$ViewState;", "", "()V", "ConnectedState", "Loading", "NotConnectedState", "Lcom/woocommerce/android/ui/cardreader/detail/CardReaderDetailViewModel$ViewState$NotConnectedState;", "Lcom/woocommerce/android/ui/cardreader/detail/CardReaderDetailViewModel$ViewState$ConnectedState;", "Lcom/woocommerce/android/ui/cardreader/detail/CardReaderDetailViewModel$ViewState$Loading;", "WooCommerce_wasabiDebug"})
    public static abstract class ViewState {
        
        private ViewState() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0006J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J)\u0010&\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u00d6\u0003J\t\u0010+\u001a\u00020\u0014H\u00d6\u0001J\t\u0010,\u001a\u00020-H\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\nR\u0016\u0010\u0013\u001a\u00020\u00148\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u001c\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\nR\u0011\u0010\u001e\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0010R\u0011\u0010 \u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\nR\u0011\u0010\"\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0010\u00a8\u0006."}, d2 = {"Lcom/woocommerce/android/ui/cardreader/detail/CardReaderDetailViewModel$ViewState$NotConnectedState;", "Lcom/woocommerce/android/ui/cardreader/detail/CardReaderDetailViewModel$ViewState;", "onPrimaryActionClicked", "Lkotlin/Function0;", "", "onLearnMoreClicked", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "connectBtnLabel", "Lcom/woocommerce/android/model/UiString$UiStringRes;", "getConnectBtnLabel", "()Lcom/woocommerce/android/model/UiString$UiStringRes;", "firstHintLabel", "getFirstHintLabel", "firstHintNumber", "Lcom/woocommerce/android/model/UiString$UiStringText;", "getFirstHintNumber", "()Lcom/woocommerce/android/model/UiString$UiStringText;", "headerLabel", "getHeaderLabel", "illustration", "", "getIllustration", "()I", "learnMoreLabel", "getLearnMoreLabel", "getOnLearnMoreClicked", "()Lkotlin/jvm/functions/Function0;", "getOnPrimaryActionClicked", "secondHintLabel", "getSecondHintLabel", "secondHintNumber", "getSecondHintNumber", "thirdHintLabel", "getThirdHintLabel", "thirdHintNumber", "getThirdHintNumber", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "WooCommerce_wasabiDebug"})
        public static final class NotConnectedState extends com.woocommerce.android.ui.cardreader.detail.CardReaderDetailViewModel.ViewState {
            @org.jetbrains.annotations.NotNull
            private final kotlin.jvm.functions.Function0<kotlin.Unit> onPrimaryActionClicked = null;
            @org.jetbrains.annotations.NotNull
            private final kotlin.jvm.functions.Function0<kotlin.Unit> onLearnMoreClicked = null;
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.model.UiString.UiStringRes headerLabel = null;
            @androidx.annotation.DrawableRes
            private final int illustration = com.woocommerce.android.R.drawable.img_card_reader_not_connected;
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.model.UiString.UiStringText firstHintNumber = null;
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.model.UiString.UiStringText secondHintNumber = null;
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.model.UiString.UiStringText thirdHintNumber = null;
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.model.UiString.UiStringRes firstHintLabel = null;
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.model.UiString.UiStringRes secondHintLabel = null;
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.model.UiString.UiStringRes thirdHintLabel = null;
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.model.UiString.UiStringRes connectBtnLabel = null;
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.model.UiString.UiStringRes learnMoreLabel = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.cardreader.detail.CardReaderDetailViewModel.ViewState.NotConnectedState copy(@org.jetbrains.annotations.NotNull
            kotlin.jvm.functions.Function0<kotlin.Unit> onPrimaryActionClicked, @org.jetbrains.annotations.NotNull
            kotlin.jvm.functions.Function0<kotlin.Unit> onLearnMoreClicked) {
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
            
            public NotConnectedState(@org.jetbrains.annotations.NotNull
            kotlin.jvm.functions.Function0<kotlin.Unit> onPrimaryActionClicked, @org.jetbrains.annotations.NotNull
            kotlin.jvm.functions.Function0<kotlin.Unit> onLearnMoreClicked) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final kotlin.jvm.functions.Function0<kotlin.Unit> component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnPrimaryActionClicked() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final kotlin.jvm.functions.Function0<kotlin.Unit> component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnLearnMoreClicked() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.model.UiString.UiStringRes getHeaderLabel() {
                return null;
            }
            
            public final int getIllustration() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.model.UiString.UiStringText getFirstHintNumber() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.model.UiString.UiStringText getSecondHintNumber() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.model.UiString.UiStringText getThirdHintNumber() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.model.UiString.UiStringRes getFirstHintLabel() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.model.UiString.UiStringRes getSecondHintLabel() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.model.UiString.UiStringRes getThirdHintLabel() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.model.UiString.UiStringRes getConnectBtnLabel() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.model.UiString.UiStringRes getLearnMoreLabel() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001/BY\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\u0002\u0010\u000eJ\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u00c6\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u00c6\u0003Jm\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u00c6\u0001J\u0013\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u00d6\u0003J\t\u0010+\u001a\u00020,H\u00d6\u0001J\t\u0010-\u001a\u00020.H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019\u00a8\u00060"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/detail/CardReaderDetailViewModel$ViewState$ConnectedState;", "Lcom/woocommerce/android/ui/cardreader/detail/CardReaderDetailViewModel$ViewState;", "enforceReaderUpdate", "Lcom/woocommerce/android/model/UiString;", "readerName", "readerBattery", "readerFirmwareVersion", "primaryButtonState", "Lcom/woocommerce/android/ui/cardreader/detail/CardReaderDetailViewModel$ViewState$ConnectedState$ButtonState;", "secondaryButtonState", "onReaderNameLongClick", "Lkotlin/Function0;", "", "onLearnMoreClicked", "(Lcom/woocommerce/android/model/UiString;Lcom/woocommerce/android/model/UiString;Lcom/woocommerce/android/model/UiString;Lcom/woocommerce/android/model/UiString;Lcom/woocommerce/android/ui/cardreader/detail/CardReaderDetailViewModel$ViewState$ConnectedState$ButtonState;Lcom/woocommerce/android/ui/cardreader/detail/CardReaderDetailViewModel$ViewState$ConnectedState$ButtonState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getEnforceReaderUpdate", "()Lcom/woocommerce/android/model/UiString;", "learnMoreLabel", "Lcom/woocommerce/android/model/UiString$UiStringRes;", "getLearnMoreLabel", "()Lcom/woocommerce/android/model/UiString$UiStringRes;", "getOnLearnMoreClicked", "()Lkotlin/jvm/functions/Function0;", "getOnReaderNameLongClick", "getPrimaryButtonState", "()Lcom/woocommerce/android/ui/cardreader/detail/CardReaderDetailViewModel$ViewState$ConnectedState$ButtonState;", "getReaderBattery", "getReaderFirmwareVersion", "getReaderName", "getSecondaryButtonState", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ButtonState", "WooCommerce_wasabiDebug"})
        public static final class ConnectedState extends com.woocommerce.android.ui.cardreader.detail.CardReaderDetailViewModel.ViewState {
            @org.jetbrains.annotations.Nullable
            private final com.woocommerce.android.model.UiString enforceReaderUpdate = null;
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.model.UiString readerName = null;
            @org.jetbrains.annotations.Nullable
            private final com.woocommerce.android.model.UiString readerBattery = null;
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.model.UiString readerFirmwareVersion = null;
            @org.jetbrains.annotations.Nullable
            private final com.woocommerce.android.ui.cardreader.detail.CardReaderDetailViewModel.ViewState.ConnectedState.ButtonState primaryButtonState = null;
            @org.jetbrains.annotations.Nullable
            private final com.woocommerce.android.ui.cardreader.detail.CardReaderDetailViewModel.ViewState.ConnectedState.ButtonState secondaryButtonState = null;
            @org.jetbrains.annotations.NotNull
            private final kotlin.jvm.functions.Function0<kotlin.Unit> onReaderNameLongClick = null;
            @org.jetbrains.annotations.NotNull
            private final kotlin.jvm.functions.Function0<kotlin.Unit> onLearnMoreClicked = null;
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.model.UiString.UiStringRes learnMoreLabel = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.cardreader.detail.CardReaderDetailViewModel.ViewState.ConnectedState copy(@org.jetbrains.annotations.Nullable
            com.woocommerce.android.model.UiString enforceReaderUpdate, @org.jetbrains.annotations.NotNull
            com.woocommerce.android.model.UiString readerName, @org.jetbrains.annotations.Nullable
            com.woocommerce.android.model.UiString readerBattery, @org.jetbrains.annotations.NotNull
            com.woocommerce.android.model.UiString readerFirmwareVersion, @org.jetbrains.annotations.Nullable
            com.woocommerce.android.ui.cardreader.detail.CardReaderDetailViewModel.ViewState.ConnectedState.ButtonState primaryButtonState, @org.jetbrains.annotations.Nullable
            com.woocommerce.android.ui.cardreader.detail.CardReaderDetailViewModel.ViewState.ConnectedState.ButtonState secondaryButtonState, @org.jetbrains.annotations.NotNull
            kotlin.jvm.functions.Function0<kotlin.Unit> onReaderNameLongClick, @org.jetbrains.annotations.NotNull
            kotlin.jvm.functions.Function0<kotlin.Unit> onLearnMoreClicked) {
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
            
            public ConnectedState(@org.jetbrains.annotations.Nullable
            com.woocommerce.android.model.UiString enforceReaderUpdate, @org.jetbrains.annotations.NotNull
            com.woocommerce.android.model.UiString readerName, @org.jetbrains.annotations.Nullable
            com.woocommerce.android.model.UiString readerBattery, @org.jetbrains.annotations.NotNull
            com.woocommerce.android.model.UiString readerFirmwareVersion, @org.jetbrains.annotations.Nullable
            com.woocommerce.android.ui.cardreader.detail.CardReaderDetailViewModel.ViewState.ConnectedState.ButtonState primaryButtonState, @org.jetbrains.annotations.Nullable
            com.woocommerce.android.ui.cardreader.detail.CardReaderDetailViewModel.ViewState.ConnectedState.ButtonState secondaryButtonState, @org.jetbrains.annotations.NotNull
            kotlin.jvm.functions.Function0<kotlin.Unit> onReaderNameLongClick, @org.jetbrains.annotations.NotNull
            kotlin.jvm.functions.Function0<kotlin.Unit> onLearnMoreClicked) {
                super();
            }
            
            @org.jetbrains.annotations.Nullable
            public final com.woocommerce.android.model.UiString component1() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final com.woocommerce.android.model.UiString getEnforceReaderUpdate() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.model.UiString component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.model.UiString getReaderName() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final com.woocommerce.android.model.UiString component3() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final com.woocommerce.android.model.UiString getReaderBattery() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.model.UiString component4() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.model.UiString getReaderFirmwareVersion() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final com.woocommerce.android.ui.cardreader.detail.CardReaderDetailViewModel.ViewState.ConnectedState.ButtonState component5() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final com.woocommerce.android.ui.cardreader.detail.CardReaderDetailViewModel.ViewState.ConnectedState.ButtonState getPrimaryButtonState() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final com.woocommerce.android.ui.cardreader.detail.CardReaderDetailViewModel.ViewState.ConnectedState.ButtonState component6() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final com.woocommerce.android.ui.cardreader.detail.CardReaderDetailViewModel.ViewState.ConnectedState.ButtonState getSecondaryButtonState() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final kotlin.jvm.functions.Function0<kotlin.Unit> component7() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnReaderNameLongClick() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final kotlin.jvm.functions.Function0<kotlin.Unit> component8() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnLearnMoreClicked() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.model.UiString.UiStringRes getLearnMoreLabel() {
                return null;
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0006H\u00c6\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/detail/CardReaderDetailViewModel$ViewState$ConnectedState$ButtonState;", "", "onActionClicked", "Lkotlin/Function0;", "", "text", "Lcom/woocommerce/android/model/UiString;", "(Lkotlin/jvm/functions/Function0;Lcom/woocommerce/android/model/UiString;)V", "getOnActionClicked", "()Lkotlin/jvm/functions/Function0;", "getText", "()Lcom/woocommerce/android/model/UiString;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
            public static final class ButtonState {
                @org.jetbrains.annotations.NotNull
                private final kotlin.jvm.functions.Function0<kotlin.Unit> onActionClicked = null;
                @org.jetbrains.annotations.NotNull
                private final com.woocommerce.android.model.UiString text = null;
                
                @org.jetbrains.annotations.NotNull
                public final com.woocommerce.android.ui.cardreader.detail.CardReaderDetailViewModel.ViewState.ConnectedState.ButtonState copy(@org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> onActionClicked, @org.jetbrains.annotations.NotNull
                com.woocommerce.android.model.UiString text) {
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
                
                public ButtonState(@org.jetbrains.annotations.NotNull
                kotlin.jvm.functions.Function0<kotlin.Unit> onActionClicked, @org.jetbrains.annotations.NotNull
                com.woocommerce.android.model.UiString text) {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull
                public final kotlin.jvm.functions.Function0<kotlin.Unit> component1() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnActionClicked() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                public final com.woocommerce.android.model.UiString component2() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                public final com.woocommerce.android.model.UiString getText() {
                    return null;
                }
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/detail/CardReaderDetailViewModel$ViewState$Loading;", "Lcom/woocommerce/android/ui/cardreader/detail/CardReaderDetailViewModel$ViewState;", "()V", "WooCommerce_wasabiDebug"})
        public static final class Loading extends com.woocommerce.android.ui.cardreader.detail.CardReaderDetailViewModel.ViewState {
            @org.jetbrains.annotations.NotNull
            public static final com.woocommerce.android.ui.cardreader.detail.CardReaderDetailViewModel.ViewState.Loading INSTANCE = null;
            
            private Loading() {
                super();
            }
        }
    }
}