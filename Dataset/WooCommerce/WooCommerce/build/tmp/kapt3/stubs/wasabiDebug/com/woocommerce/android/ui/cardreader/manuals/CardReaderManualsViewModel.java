package com.woocommerce.android.ui.cardreader.manuals;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u000f\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0012"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/manuals/CardReaderManualsViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "inPersonPaymentsCanadaFeatureFlag", "Lcom/woocommerce/android/ui/cardreader/InPersonPaymentsCanadaFeatureFlag;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/ui/cardreader/InPersonPaymentsCanadaFeatureFlag;)V", "manualState", "", "Lcom/woocommerce/android/ui/cardreader/manuals/CardReaderManualsViewModel$ManualItem;", "getManualState", "()Ljava/util/List;", "onBbposManualClicked", "", "onM2ManualClicked", "onWisePad3ManualCardReaderClicked", "ManualEvents", "ManualItem", "WooCommerce_wasabiDebug"})
public final class CardReaderManualsViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.ui.cardreader.InPersonPaymentsCanadaFeatureFlag inPersonPaymentsCanadaFeatureFlag = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.woocommerce.android.ui.cardreader.manuals.CardReaderManualsViewModel.ManualItem> manualState = null;
    
    @javax.inject.Inject
    public CardReaderManualsViewModel(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.cardreader.InPersonPaymentsCanadaFeatureFlag inPersonPaymentsCanadaFeatureFlag) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.woocommerce.android.ui.cardreader.manuals.CardReaderManualsViewModel.ManualItem> getManualState() {
        return null;
    }
    
    private final void onBbposManualClicked() {
    }
    
    private final void onM2ManualClicked() {
    }
    
    private final void onWisePad3ManualCardReaderClicked() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/manuals/CardReaderManualsViewModel$ManualEvents;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "()V", "NavigateToCardReaderManualLink", "Lcom/woocommerce/android/ui/cardreader/manuals/CardReaderManualsViewModel$ManualEvents$NavigateToCardReaderManualLink;", "WooCommerce_wasabiDebug"})
    public static abstract class ManualEvents extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        
        private ManualEvents() {
            super(false);
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/manuals/CardReaderManualsViewModel$ManualEvents$NavigateToCardReaderManualLink;", "Lcom/woocommerce/android/ui/cardreader/manuals/CardReaderManualsViewModel$ManualEvents;", "url", "", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_wasabiDebug"})
        public static final class NavigateToCardReaderManualLink extends com.woocommerce.android.ui.cardreader.manuals.CardReaderManualsViewModel.ManualEvents {
            @org.jetbrains.annotations.NotNull
            private final java.lang.String url = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.cardreader.manuals.CardReaderManualsViewModel.ManualEvents.NavigateToCardReaderManualLink copy(@org.jetbrains.annotations.NotNull
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
            
            public NavigateToCardReaderManualLink(@org.jetbrains.annotations.NotNull
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
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0018"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/manuals/CardReaderManualsViewModel$ManualItem;", "", "icon", "", "label", "onManualClicked", "Lkotlin/Function0;", "", "(IILkotlin/jvm/functions/Function0;)V", "getIcon", "()I", "getLabel", "getOnManualClicked", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "WooCommerce_wasabiDebug"})
    public static final class ManualItem {
        private final int icon = 0;
        private final int label = 0;
        @org.jetbrains.annotations.NotNull
        private final kotlin.jvm.functions.Function0<kotlin.Unit> onManualClicked = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.cardreader.manuals.CardReaderManualsViewModel.ManualItem copy(int icon, int label, @org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function0<kotlin.Unit> onManualClicked) {
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
        
        public ManualItem(int icon, int label, @org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function0<kotlin.Unit> onManualClicked) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getIcon() {
            return 0;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int getLabel() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        public final kotlin.jvm.functions.Function0<kotlin.Unit> component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnManualClicked() {
            return null;
        }
    }
}