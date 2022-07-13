package com.woocommerce.android.ui.cardreader.onboarding;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0015\u001a\u00020\u0016H\u0002R\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0019"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderWelcomeViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "appPrefsWrapper", "Lcom/woocommerce/android/AppPrefsWrapper;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/AppPrefsWrapper;)V", "_viewState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderWelcomeViewModel$ViewState;", "kotlin.jvm.PlatformType", "arguments", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderWelcomeDialogFragmentArgs;", "getArguments", "()Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderWelcomeDialogFragmentArgs;", "arguments$delegate", "Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "viewState", "Landroidx/lifecycle/LiveData;", "getViewState", "()Landroidx/lifecycle/LiveData;", "onButtonClick", "", "CardReaderWelcomeDialogEvent", "ViewState", "WooCommerce_vanillaDebug"})
public final class CardReaderWelcomeViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.viewmodel.NavArgsLazy arguments$delegate = null;
    private final androidx.lifecycle.MutableLiveData<com.woocommerce.android.ui.cardreader.onboarding.CardReaderWelcomeViewModel.ViewState> _viewState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.woocommerce.android.ui.cardreader.onboarding.CardReaderWelcomeViewModel.ViewState> viewState = null;
    
    @javax.inject.Inject()
    public CardReaderWelcomeViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.AppPrefsWrapper appPrefsWrapper) {
        super(null);
    }
    
    private final com.woocommerce.android.ui.cardreader.onboarding.CardReaderWelcomeDialogFragmentArgs getArguments() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.woocommerce.android.ui.cardreader.onboarding.CardReaderWelcomeViewModel.ViewState> getViewState() {
        return null;
    }
    
    private final void onButtonClick() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderWelcomeViewModel$CardReaderWelcomeDialogEvent;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "()V", "NavigateToOnboardingFlow", "WooCommerce_vanillaDebug"})
    public static abstract class CardReaderWelcomeDialogEvent extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        
        private CardReaderWelcomeDialogEvent() {
            super(false);
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderWelcomeViewModel$CardReaderWelcomeDialogEvent$NavigateToOnboardingFlow;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "cardReaderFlowParam", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderFlowParam;", "(Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderFlowParam;)V", "getCardReaderFlowParam", "()Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderFlowParam;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
        public static final class NavigateToOnboardingFlow extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
            @org.jetbrains.annotations.NotNull()
            private final com.woocommerce.android.ui.cardreader.onboarding.CardReaderFlowParam cardReaderFlowParam = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderWelcomeViewModel.CardReaderWelcomeDialogEvent.NavigateToOnboardingFlow copy(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.ui.cardreader.onboarding.CardReaderFlowParam cardReaderFlowParam) {
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
            
            public NavigateToOnboardingFlow(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.ui.cardreader.onboarding.CardReaderFlowParam cardReaderFlowParam) {
                super(false);
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderFlowParam component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderFlowParam getCardReaderFlowParam() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u000fX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000b\u00a8\u0006\u001c"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderWelcomeViewModel$ViewState;", "", "buttonAction", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "getButtonAction", "()Lkotlin/jvm/functions/Function0;", "buttonLabel", "Lcom/woocommerce/android/model/UiString$UiStringRes;", "getButtonLabel", "()Lcom/woocommerce/android/model/UiString$UiStringRes;", "header", "getHeader", "img", "", "getImg", "()I", "text", "getText", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class ViewState {
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function0<kotlin.Unit> buttonAction = null;
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.model.UiString.UiStringRes header = null;
        private final int img = com.woocommerce.android.R.drawable.img_woman_payment_card;
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.model.UiString.UiStringRes text = null;
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.model.UiString.UiStringRes buttonLabel = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderWelcomeViewModel.ViewState copy(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> buttonAction) {
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
        
        public ViewState(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> buttonAction) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function0<kotlin.Unit> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function0<kotlin.Unit> getButtonAction() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.UiString.UiStringRes getHeader() {
            return null;
        }
        
        public final int getImg() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.UiString.UiStringRes getText() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.UiString.UiStringRes getButtonLabel() {
            return null;
        }
    }
}