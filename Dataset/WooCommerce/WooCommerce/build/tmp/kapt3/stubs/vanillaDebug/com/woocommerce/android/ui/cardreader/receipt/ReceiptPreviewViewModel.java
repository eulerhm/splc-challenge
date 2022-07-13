package com.woocommerce.android.ui.cardreader.receipt;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u001e\u001fB\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0017J\u000e\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u0017J\u0006\u0010\u001d\u001a\u00020\u0017R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006 "}, d2 = {"Lcom/woocommerce/android/ui/cardreader/receipt/ReceiptPreviewViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "tracker", "Lcom/woocommerce/android/analytics/AnalyticsTrackerWrapper;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/analytics/AnalyticsTrackerWrapper;Lcom/woocommerce/android/tools/SelectedSite;)V", "args", "Lcom/woocommerce/android/ui/cardreader/receipt/ReceiptPreviewFragmentArgs;", "getArgs", "()Lcom/woocommerce/android/ui/cardreader/receipt/ReceiptPreviewFragmentArgs;", "args$delegate", "Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "viewState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/woocommerce/android/ui/cardreader/receipt/ReceiptPreviewViewModel$ReceiptPreviewViewState;", "viewStateData", "Landroidx/lifecycle/LiveData;", "getViewStateData", "()Landroidx/lifecycle/LiveData;", "onEmailActivityNotFound", "", "onPrintClicked", "onPrintResult", "result", "Lcom/woocommerce/android/util/PrintHtmlHelper$PrintJobResult;", "onReceiptLoaded", "onSendEmailClicked", "ReceiptPreviewEvent", "ReceiptPreviewViewState", "WooCommerce_vanillaDebug"})
public final class ReceiptPreviewViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.analytics.AnalyticsTrackerWrapper tracker = null;
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    private final com.woocommerce.android.viewmodel.NavArgsLazy args$delegate = null;
    private final androidx.lifecycle.MutableLiveData<com.woocommerce.android.ui.cardreader.receipt.ReceiptPreviewViewModel.ReceiptPreviewViewState> viewState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.woocommerce.android.ui.cardreader.receipt.ReceiptPreviewViewModel.ReceiptPreviewViewState> viewStateData = null;
    
    @javax.inject.Inject()
    public ReceiptPreviewViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.analytics.AnalyticsTrackerWrapper tracker, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.tools.SelectedSite selectedSite) {
        super(null);
    }
    
    private final com.woocommerce.android.ui.cardreader.receipt.ReceiptPreviewFragmentArgs getArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.woocommerce.android.ui.cardreader.receipt.ReceiptPreviewViewModel.ReceiptPreviewViewState> getViewStateData() {
        return null;
    }
    
    public final void onReceiptLoaded() {
    }
    
    public final void onPrintClicked() {
    }
    
    public final void onSendEmailClicked() {
    }
    
    public final void onEmailActivityNotFound() {
    }
    
    public final void onPrintResult(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.PrintHtmlHelper.PrintJobResult result) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u001b\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006\u0082\u0001\u0002\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/receipt/ReceiptPreviewViewModel$ReceiptPreviewViewState;", "", "isProgressVisible", "", "isContentVisible", "(ZZ)V", "()Z", "Content", "Loading", "Lcom/woocommerce/android/ui/cardreader/receipt/ReceiptPreviewViewModel$ReceiptPreviewViewState$Loading;", "Lcom/woocommerce/android/ui/cardreader/receipt/ReceiptPreviewViewModel$ReceiptPreviewViewState$Content;", "WooCommerce_vanillaDebug"})
    public static abstract class ReceiptPreviewViewState {
        private final boolean isProgressVisible = false;
        private final boolean isContentVisible = false;
        
        private ReceiptPreviewViewState(boolean isProgressVisible, boolean isContentVisible) {
            super();
        }
        
        public final boolean isProgressVisible() {
            return false;
        }
        
        public final boolean isContentVisible() {
            return false;
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/receipt/ReceiptPreviewViewModel$ReceiptPreviewViewState$Loading;", "Lcom/woocommerce/android/ui/cardreader/receipt/ReceiptPreviewViewModel$ReceiptPreviewViewState;", "()V", "WooCommerce_vanillaDebug"})
        public static final class Loading extends com.woocommerce.android.ui.cardreader.receipt.ReceiptPreviewViewModel.ReceiptPreviewViewState {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.cardreader.receipt.ReceiptPreviewViewModel.ReceiptPreviewViewState.Loading INSTANCE = null;
            
            private Loading() {
                super(false, false);
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/receipt/ReceiptPreviewViewModel$ReceiptPreviewViewState$Content;", "Lcom/woocommerce/android/ui/cardreader/receipt/ReceiptPreviewViewModel$ReceiptPreviewViewState;", "()V", "WooCommerce_vanillaDebug"})
        public static final class Content extends com.woocommerce.android.ui.cardreader.receipt.ReceiptPreviewViewModel.ReceiptPreviewViewState {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.cardreader.receipt.ReceiptPreviewViewModel.ReceiptPreviewViewState.Content INSTANCE = null;
            
            private Content() {
                super(false, false);
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/receipt/ReceiptPreviewViewModel$ReceiptPreviewEvent;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "()V", "LoadUrl", "Lcom/woocommerce/android/ui/cardreader/receipt/ReceiptPreviewViewModel$ReceiptPreviewEvent$LoadUrl;", "WooCommerce_vanillaDebug"})
    public static abstract class ReceiptPreviewEvent extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        
        private ReceiptPreviewEvent() {
            super(false);
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/receipt/ReceiptPreviewViewModel$ReceiptPreviewEvent$LoadUrl;", "Lcom/woocommerce/android/ui/cardreader/receipt/ReceiptPreviewViewModel$ReceiptPreviewEvent;", "url", "", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_vanillaDebug"})
        public static final class LoadUrl extends com.woocommerce.android.ui.cardreader.receipt.ReceiptPreviewViewModel.ReceiptPreviewEvent {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String url = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.cardreader.receipt.ReceiptPreviewViewModel.ReceiptPreviewEvent.LoadUrl copy(@org.jetbrains.annotations.NotNull()
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
            
            public LoadUrl(@org.jetbrains.annotations.NotNull()
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
    }
}