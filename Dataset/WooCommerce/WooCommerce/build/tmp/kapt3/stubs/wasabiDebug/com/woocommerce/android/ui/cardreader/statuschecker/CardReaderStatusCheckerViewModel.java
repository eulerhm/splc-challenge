package com.woocommerce.android.ui.cardreader.statuschecker;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001#B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0011\u0010\u001c\u001a\u00020\u001dH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\u0019\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0019X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006$"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/statuschecker/CardReaderStatusCheckerViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "cardReaderManager", "Lcom/woocommerce/android/cardreader/CardReaderManager;", "cardReaderChecker", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingChecker;", "cardReaderTracker", "Lcom/woocommerce/android/ui/cardreader/CardReaderTracker;", "appPrefsWrapper", "Lcom/woocommerce/android/AppPrefsWrapper;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/cardreader/CardReaderManager;Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingChecker;Lcom/woocommerce/android/ui/cardreader/CardReaderTracker;Lcom/woocommerce/android/AppPrefsWrapper;)V", "_event", "Lcom/woocommerce/android/viewmodel/SingleLiveEvent;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "get_event", "()Lcom/woocommerce/android/viewmodel/SingleLiveEvent;", "arguments", "Lcom/woocommerce/android/ui/cardreader/statuschecker/CardReaderStatusCheckerDialogFragmentArgs;", "getArguments", "()Lcom/woocommerce/android/ui/cardreader/statuschecker/CardReaderStatusCheckerDialogFragmentArgs;", "arguments$delegate", "Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "event", "Landroidx/lifecycle/LiveData;", "getEvent", "()Landroidx/lifecycle/LiveData;", "checkStatus", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleOnboardingStatus", "param", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderFlowParam;", "(Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderFlowParam;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "StatusCheckerEvent", "WooCommerce_wasabiDebug"})
public final class CardReaderStatusCheckerViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.cardreader.CardReaderManager cardReaderManager = null;
    private final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingChecker cardReaderChecker = null;
    private final com.woocommerce.android.ui.cardreader.CardReaderTracker cardReaderTracker = null;
    private final com.woocommerce.android.AppPrefsWrapper appPrefsWrapper = null;
    private final com.woocommerce.android.viewmodel.NavArgsLazy arguments$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.viewmodel.SingleLiveEvent<com.woocommerce.android.viewmodel.MultiLiveEvent.Event> _event = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.woocommerce.android.viewmodel.MultiLiveEvent.Event> event = null;
    
    @javax.inject.Inject
    public CardReaderStatusCheckerViewModel(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.cardreader.CardReaderManager cardReaderManager, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingChecker cardReaderChecker, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.cardreader.CardReaderTracker cardReaderTracker, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.AppPrefsWrapper appPrefsWrapper) {
        super(null);
    }
    
    private final com.woocommerce.android.ui.cardreader.statuschecker.CardReaderStatusCheckerDialogFragmentArgs getArguments() {
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
    
    private final java.lang.Object checkStatus(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object handleOnboardingStatus(com.woocommerce.android.ui.cardreader.onboarding.CardReaderFlowParam param, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/statuschecker/CardReaderStatusCheckerViewModel$StatusCheckerEvent;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "()V", "NavigateToConnection", "NavigateToOnboarding", "NavigateToPayment", "NavigateToWelcome", "WooCommerce_wasabiDebug"})
    public static abstract class StatusCheckerEvent extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        
        private StatusCheckerEvent() {
            super(false);
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/statuschecker/CardReaderStatusCheckerViewModel$StatusCheckerEvent$NavigateToWelcome;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "cardReaderFlowParam", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderFlowParam;", "(Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderFlowParam;)V", "getCardReaderFlowParam", "()Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderFlowParam;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
        public static final class NavigateToWelcome extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.ui.cardreader.onboarding.CardReaderFlowParam cardReaderFlowParam = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.cardreader.statuschecker.CardReaderStatusCheckerViewModel.StatusCheckerEvent.NavigateToWelcome copy(@org.jetbrains.annotations.NotNull
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
            
            public NavigateToWelcome(@org.jetbrains.annotations.NotNull
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
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/statuschecker/CardReaderStatusCheckerViewModel$StatusCheckerEvent$NavigateToConnection;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "cardReaderFlowParam", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderFlowParam;", "(Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderFlowParam;)V", "getCardReaderFlowParam", "()Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderFlowParam;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
        public static final class NavigateToConnection extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.ui.cardreader.onboarding.CardReaderFlowParam cardReaderFlowParam = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.cardreader.statuschecker.CardReaderStatusCheckerViewModel.StatusCheckerEvent.NavigateToConnection copy(@org.jetbrains.annotations.NotNull
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
            
            public NavigateToConnection(@org.jetbrains.annotations.NotNull
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
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/statuschecker/CardReaderStatusCheckerViewModel$StatusCheckerEvent$NavigateToPayment;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "cardReaderFlowParam", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderFlowParam;", "(Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderFlowParam;)V", "getCardReaderFlowParam", "()Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderFlowParam;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
        public static final class NavigateToPayment extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.ui.cardreader.onboarding.CardReaderFlowParam cardReaderFlowParam = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.cardreader.statuschecker.CardReaderStatusCheckerViewModel.StatusCheckerEvent.NavigateToPayment copy(@org.jetbrains.annotations.NotNull
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
            
            public NavigateToPayment(@org.jetbrains.annotations.NotNull
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
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/statuschecker/CardReaderStatusCheckerViewModel$StatusCheckerEvent$NavigateToOnboarding;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "cardReaderOnboardingParams", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingParams;", "(Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingParams;)V", "getCardReaderOnboardingParams", "()Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingParams;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
        public static final class NavigateToOnboarding extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingParams cardReaderOnboardingParams = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.cardreader.statuschecker.CardReaderStatusCheckerViewModel.StatusCheckerEvent.NavigateToOnboarding copy(@org.jetbrains.annotations.NotNull
            com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingParams cardReaderOnboardingParams) {
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
            
            public NavigateToOnboarding(@org.jetbrains.annotations.NotNull
            com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingParams cardReaderOnboardingParams) {
                super(false);
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingParams component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingParams getCardReaderOnboardingParams() {
                return null;
            }
        }
    }
}