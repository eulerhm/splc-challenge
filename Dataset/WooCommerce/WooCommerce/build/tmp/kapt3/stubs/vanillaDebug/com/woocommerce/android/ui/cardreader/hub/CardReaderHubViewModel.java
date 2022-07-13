package com.woocommerce.android.ui.cardreader.hub;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003$%&B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020!H\u0002J\b\u0010#\u001a\u00020!H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d\u00a8\u0006\'"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/hub/CardReaderHubViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "inPersonPaymentsCanadaFeatureFlag", "Lcom/woocommerce/android/ui/cardreader/InPersonPaymentsCanadaFeatureFlag;", "appPrefsWrapper", "Lcom/woocommerce/android/AppPrefsWrapper;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/ui/cardreader/InPersonPaymentsCanadaFeatureFlag;Lcom/woocommerce/android/AppPrefsWrapper;Lcom/woocommerce/android/tools/SelectedSite;)V", "arguments", "Lcom/woocommerce/android/ui/cardreader/hub/CardReaderHubFragmentArgs;", "getArguments", "()Lcom/woocommerce/android/ui/cardreader/hub/CardReaderHubFragmentArgs;", "arguments$delegate", "Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "cardReaderPurchaseUrl", "", "getCardReaderPurchaseUrl", "()Ljava/lang/String;", "cardReaderPurchaseUrl$delegate", "Lkotlin/Lazy;", "viewState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/woocommerce/android/ui/cardreader/hub/CardReaderHubViewModel$CardReaderHubViewState;", "viewStateData", "Landroidx/lifecycle/LiveData;", "getViewStateData", "()Landroidx/lifecycle/LiveData;", "createInitialState", "Lcom/woocommerce/android/ui/cardreader/hub/CardReaderHubViewModel$CardReaderHubViewState$Content;", "onCardReaderManualsClicked", "", "onManageCardReaderClicked", "onPurchaseCardReaderClicked", "CardReaderHubEvents", "CardReaderHubListItemViewState", "CardReaderHubViewState", "WooCommerce_vanillaDebug"})
public final class CardReaderHubViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.ui.cardreader.InPersonPaymentsCanadaFeatureFlag inPersonPaymentsCanadaFeatureFlag = null;
    private final com.woocommerce.android.AppPrefsWrapper appPrefsWrapper = null;
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    private final com.woocommerce.android.viewmodel.NavArgsLazy arguments$delegate = null;
    private final kotlin.Lazy cardReaderPurchaseUrl$delegate = null;
    private final androidx.lifecycle.MutableLiveData<com.woocommerce.android.ui.cardreader.hub.CardReaderHubViewModel.CardReaderHubViewState> viewState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.woocommerce.android.ui.cardreader.hub.CardReaderHubViewModel.CardReaderHubViewState> viewStateData = null;
    
    @javax.inject.Inject()
    public CardReaderHubViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.cardreader.InPersonPaymentsCanadaFeatureFlag inPersonPaymentsCanadaFeatureFlag, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.AppPrefsWrapper appPrefsWrapper, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.tools.SelectedSite selectedSite) {
        super(null);
    }
    
    private final com.woocommerce.android.ui.cardreader.hub.CardReaderHubFragmentArgs getArguments() {
        return null;
    }
    
    private final java.lang.String getCardReaderPurchaseUrl() {
        return null;
    }
    
    private final com.woocommerce.android.ui.cardreader.hub.CardReaderHubViewModel.CardReaderHubViewState.Content createInitialState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.woocommerce.android.ui.cardreader.hub.CardReaderHubViewModel.CardReaderHubViewState> getViewStateData() {
        return null;
    }
    
    private final void onManageCardReaderClicked() {
    }
    
    private final void onPurchaseCardReaderClicked() {
    }
    
    private final void onCardReaderManualsClicked() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/hub/CardReaderHubViewModel$CardReaderHubEvents;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "()V", "NavigateToCardReaderDetail", "NavigateToCardReaderManualsScreen", "NavigateToPurchaseCardReaderFlow", "Lcom/woocommerce/android/ui/cardreader/hub/CardReaderHubViewModel$CardReaderHubEvents$NavigateToCardReaderDetail;", "Lcom/woocommerce/android/ui/cardreader/hub/CardReaderHubViewModel$CardReaderHubEvents$NavigateToPurchaseCardReaderFlow;", "Lcom/woocommerce/android/ui/cardreader/hub/CardReaderHubViewModel$CardReaderHubEvents$NavigateToCardReaderManualsScreen;", "WooCommerce_vanillaDebug"})
    public static abstract class CardReaderHubEvents extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        
        private CardReaderHubEvents() {
            super(false);
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/hub/CardReaderHubViewModel$CardReaderHubEvents$NavigateToCardReaderDetail;", "Lcom/woocommerce/android/ui/cardreader/hub/CardReaderHubViewModel$CardReaderHubEvents;", "cardReaderFlowParam", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderFlowParam;", "(Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderFlowParam;)V", "getCardReaderFlowParam", "()Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderFlowParam;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
        public static final class NavigateToCardReaderDetail extends com.woocommerce.android.ui.cardreader.hub.CardReaderHubViewModel.CardReaderHubEvents {
            @org.jetbrains.annotations.NotNull()
            private final com.woocommerce.android.ui.cardreader.onboarding.CardReaderFlowParam cardReaderFlowParam = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.cardreader.hub.CardReaderHubViewModel.CardReaderHubEvents.NavigateToCardReaderDetail copy(@org.jetbrains.annotations.NotNull()
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
            
            public NavigateToCardReaderDetail(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.ui.cardreader.onboarding.CardReaderFlowParam cardReaderFlowParam) {
                super();
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
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/hub/CardReaderHubViewModel$CardReaderHubEvents$NavigateToPurchaseCardReaderFlow;", "Lcom/woocommerce/android/ui/cardreader/hub/CardReaderHubViewModel$CardReaderHubEvents;", "url", "", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_vanillaDebug"})
        public static final class NavigateToPurchaseCardReaderFlow extends com.woocommerce.android.ui.cardreader.hub.CardReaderHubViewModel.CardReaderHubEvents {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String url = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.cardreader.hub.CardReaderHubViewModel.CardReaderHubEvents.NavigateToPurchaseCardReaderFlow copy(@org.jetbrains.annotations.NotNull()
            java.lang.String url) {
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
            
            public NavigateToPurchaseCardReaderFlow(@org.jetbrains.annotations.NotNull()
            java.lang.String url) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getUrl() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/hub/CardReaderHubViewModel$CardReaderHubEvents$NavigateToCardReaderManualsScreen;", "Lcom/woocommerce/android/ui/cardreader/hub/CardReaderHubViewModel$CardReaderHubEvents;", "()V", "WooCommerce_vanillaDebug"})
        public static final class NavigateToCardReaderManualsScreen extends com.woocommerce.android.ui.cardreader.hub.CardReaderHubViewModel.CardReaderHubEvents {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.cardreader.hub.CardReaderHubViewModel.CardReaderHubEvents.NavigateToCardReaderManualsScreen INSTANCE = null;
            
            private NavigateToCardReaderManualsScreen() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\bB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0001\t\u00a8\u0006\n"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/hub/CardReaderHubViewModel$CardReaderHubViewState;", "", "()V", "rows", "", "Lcom/woocommerce/android/ui/cardreader/hub/CardReaderHubViewModel$CardReaderHubListItemViewState;", "getRows", "()Ljava/util/List;", "Content", "Lcom/woocommerce/android/ui/cardreader/hub/CardReaderHubViewModel$CardReaderHubViewState$Content;", "WooCommerce_vanillaDebug"})
    public static abstract class CardReaderHubViewState {
        
        private CardReaderHubViewState() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.util.List<com.woocommerce.android.ui.cardreader.hub.CardReaderHubViewModel.CardReaderHubListItemViewState> getRows();
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/hub/CardReaderHubViewModel$CardReaderHubViewState$Content;", "Lcom/woocommerce/android/ui/cardreader/hub/CardReaderHubViewModel$CardReaderHubViewState;", "rows", "", "Lcom/woocommerce/android/ui/cardreader/hub/CardReaderHubViewModel$CardReaderHubListItemViewState;", "(Ljava/util/List;)V", "getRows", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
        public static final class Content extends com.woocommerce.android.ui.cardreader.hub.CardReaderHubViewModel.CardReaderHubViewState {
            @org.jetbrains.annotations.NotNull()
            private final java.util.List<com.woocommerce.android.ui.cardreader.hub.CardReaderHubViewModel.CardReaderHubListItemViewState> rows = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.cardreader.hub.CardReaderHubViewModel.CardReaderHubViewState.Content copy(@org.jetbrains.annotations.NotNull()
            java.util.List<com.woocommerce.android.ui.cardreader.hub.CardReaderHubViewModel.CardReaderHubListItemViewState> rows) {
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
            
            public Content(@org.jetbrains.annotations.NotNull()
            java.util.List<com.woocommerce.android.ui.cardreader.hub.CardReaderHubViewModel.CardReaderHubListItemViewState> rows) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<com.woocommerce.android.ui.cardreader.hub.CardReaderHubViewModel.CardReaderHubListItemViewState> component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.util.List<com.woocommerce.android.ui.cardreader.hub.CardReaderHubViewModel.CardReaderHubListItemViewState> getRows() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001a"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/hub/CardReaderHubViewModel$CardReaderHubListItemViewState;", "", "icon", "", "label", "Lcom/woocommerce/android/model/UiString;", "onItemClicked", "Lkotlin/Function0;", "", "(ILcom/woocommerce/android/model/UiString;Lkotlin/jvm/functions/Function0;)V", "getIcon", "()I", "getLabel", "()Lcom/woocommerce/android/model/UiString;", "getOnItemClicked", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class CardReaderHubListItemViewState {
        private final int icon = 0;
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.model.UiString label = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function0<kotlin.Unit> onItemClicked = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.cardreader.hub.CardReaderHubViewModel.CardReaderHubListItemViewState copy(@androidx.annotation.DrawableRes()
        int icon, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.UiString label, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onItemClicked) {
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
        
        public CardReaderHubListItemViewState(@androidx.annotation.DrawableRes()
        int icon, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.UiString label, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onItemClicked) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getIcon() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.UiString component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.UiString getLabel() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function0<kotlin.Unit> component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnItemClicked() {
            return null;
        }
    }
}