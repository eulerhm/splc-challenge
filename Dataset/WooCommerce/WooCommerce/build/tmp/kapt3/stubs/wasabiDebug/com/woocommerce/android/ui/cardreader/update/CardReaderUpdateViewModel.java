package com.woocommerce.android.ui.cardreader.update;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0003123B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0017\u0010 \u001a\u00020\u00172\b\u0010!\u001a\u0004\u0018\u00010\u001bH\u0002\u00a2\u0006\u0002\u0010\"J\b\u0010#\u001a\u00020\u0019H\u0002J\u0011\u0010$\u001a\u00020\u001dH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%J\u0006\u0010&\u001a\u00020\u001dJ\b\u0010\'\u001a\u00020\u001dH\u0002J\u0010\u0010(\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020*H\u0002J\b\u0010+\u001a\u00020\u001dH\u0002J\b\u0010,\u001a\u00020\u001dH\u0002J\u0010\u0010-\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020/H\u0002J\u001a\u00100\u001a\u00020\u001d2\b\u0010.\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00064"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/update/CardReaderUpdateViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "cardReaderManager", "Lcom/woocommerce/android/cardreader/CardReaderManager;", "tracker", "Lcom/woocommerce/android/ui/cardreader/CardReaderTracker;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/woocommerce/android/cardreader/CardReaderManager;Lcom/woocommerce/android/ui/cardreader/CardReaderTracker;Landroidx/lifecycle/SavedStateHandle;)V", "navArgs", "Lcom/woocommerce/android/ui/cardreader/update/CardReaderUpdateDialogFragmentArgs;", "getNavArgs", "()Lcom/woocommerce/android/ui/cardreader/update/CardReaderUpdateDialogFragmentArgs;", "navArgs$delegate", "Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "viewState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/woocommerce/android/ui/cardreader/update/CardReaderUpdateViewModel$ViewState;", "viewStateData", "Landroidx/lifecycle/LiveData;", "getViewStateData", "()Landroidx/lifecycle/LiveData;", "buildProgressText", "Lcom/woocommerce/android/model/UiString$UiStringRes;", "progress", "", "convertToPercentage", "", "finishFlow", "", "result", "Lcom/woocommerce/android/ui/cardreader/update/CardReaderUpdateViewModel$UpdateResult;", "getLowBatteryErrorDescription", "currentBatteryLevel", "(Ljava/lang/Float;)Lcom/woocommerce/android/model/UiString$UiStringRes;", "getWarningDescriptionStringRes", "listenToSoftwareUpdateStatus", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onBackPressed", "onCancelClicked", "onUpdateFailed", "status", "Lcom/woocommerce/android/cardreader/connection/event/SoftwareUpdateStatus$Failed;", "onUpdateStatusUnknown", "onUpdateSucceeded", "showCancelAnywayButton", "currentState", "Lcom/woocommerce/android/ui/cardreader/update/CardReaderUpdateViewModel$ViewState$UpdatingState;", "updateProgress", "CardReaderUpdateEvent", "UpdateResult", "ViewState", "WooCommerce_wasabiDebug"})
public final class CardReaderUpdateViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.cardreader.CardReaderManager cardReaderManager = null;
    private final com.woocommerce.android.ui.cardreader.CardReaderTracker tracker = null;
    private final androidx.lifecycle.MutableLiveData<com.woocommerce.android.ui.cardreader.update.CardReaderUpdateViewModel.ViewState> viewState = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.woocommerce.android.ui.cardreader.update.CardReaderUpdateViewModel.ViewState> viewStateData = null;
    private final com.woocommerce.android.viewmodel.NavArgsLazy navArgs$delegate = null;
    
    @javax.inject.Inject
    public CardReaderUpdateViewModel(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.cardreader.CardReaderManager cardReaderManager, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.cardreader.CardReaderTracker tracker, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedState) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.woocommerce.android.ui.cardreader.update.CardReaderUpdateViewModel.ViewState> getViewStateData() {
        return null;
    }
    
    private final com.woocommerce.android.ui.cardreader.update.CardReaderUpdateDialogFragmentArgs getNavArgs() {
        return null;
    }
    
    public final void onBackPressed() {
    }
    
    private final java.lang.Object listenToSoftwareUpdateStatus(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final void onUpdateStatusUnknown() {
    }
    
    private final void onUpdateSucceeded() {
    }
    
    private final void onUpdateFailed(com.woocommerce.android.cardreader.connection.event.SoftwareUpdateStatus.Failed status) {
    }
    
    private final void finishFlow(com.woocommerce.android.ui.cardreader.update.CardReaderUpdateViewModel.UpdateResult result) {
    }
    
    private final void updateProgress(com.woocommerce.android.ui.cardreader.update.CardReaderUpdateViewModel.ViewState currentState, int progress) {
    }
    
    private final void showCancelAnywayButton(com.woocommerce.android.ui.cardreader.update.CardReaderUpdateViewModel.ViewState.UpdatingState currentState) {
    }
    
    private final void onCancelClicked() {
    }
    
    private final int convertToPercentage(float progress) {
        return 0;
    }
    
    private final int getWarningDescriptionStringRes() {
        return 0;
    }
    
    private final com.woocommerce.android.model.UiString.UiStringRes getLowBatteryErrorDescription(java.lang.Float currentBatteryLevel) {
        return null;
    }
    
    private final com.woocommerce.android.model.UiString.UiStringRes buildProgressText(int progress) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/update/CardReaderUpdateViewModel$CardReaderUpdateEvent;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "()V", "SoftwareUpdateAboutToStart", "SoftwareUpdateProgress", "WooCommerce_wasabiDebug"})
    public static abstract class CardReaderUpdateEvent extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        
        private CardReaderUpdateEvent() {
            super(false);
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/update/CardReaderUpdateViewModel$CardReaderUpdateEvent$SoftwareUpdateProgress;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "progress", "Lcom/woocommerce/android/model/UiString;", "(Lcom/woocommerce/android/model/UiString;)V", "getProgress", "()Lcom/woocommerce/android/model/UiString;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
        public static final class SoftwareUpdateProgress extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.model.UiString progress = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.cardreader.update.CardReaderUpdateViewModel.CardReaderUpdateEvent.SoftwareUpdateProgress copy(@org.jetbrains.annotations.NotNull
            com.woocommerce.android.model.UiString progress) {
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
            
            public SoftwareUpdateProgress(@org.jetbrains.annotations.NotNull
            com.woocommerce.android.model.UiString progress) {
                super(false);
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.model.UiString component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.model.UiString getProgress() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/update/CardReaderUpdateViewModel$CardReaderUpdateEvent$SoftwareUpdateAboutToStart;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "accessibilityText", "", "(I)V", "getAccessibilityText", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "WooCommerce_wasabiDebug"})
        public static final class SoftwareUpdateAboutToStart extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
            private final int accessibilityText = 0;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.cardreader.update.CardReaderUpdateViewModel.CardReaderUpdateEvent.SoftwareUpdateAboutToStart copy(@androidx.annotation.StringRes
            int accessibilityText) {
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
            
            public SoftwareUpdateAboutToStart(@androidx.annotation.StringRes
            int accessibilityText) {
                super(false);
            }
            
            public final int component1() {
                return 0;
            }
            
            public final int getAccessibilityText() {
                return 0;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0017\u0018\u0019\u001a\u001b\u001cBM\b\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bR\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000f\u0082\u0001\u0004\u001d\u001e\u001f \u00a8\u0006!"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/update/CardReaderUpdateViewModel$ViewState;", "", "title", "Lcom/woocommerce/android/model/UiString;", "illustration", "", "description", "progress", "progressText", "button", "Lcom/woocommerce/android/ui/cardreader/update/CardReaderUpdateViewModel$ViewState$ButtonState;", "(Lcom/woocommerce/android/model/UiString;ILcom/woocommerce/android/model/UiString;Ljava/lang/Integer;Lcom/woocommerce/android/model/UiString;Lcom/woocommerce/android/ui/cardreader/update/CardReaderUpdateViewModel$ViewState$ButtonState;)V", "getButton", "()Lcom/woocommerce/android/ui/cardreader/update/CardReaderUpdateViewModel$ViewState$ButtonState;", "getDescription", "()Lcom/woocommerce/android/model/UiString;", "getIllustration", "()I", "getProgress", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getProgressText", "getTitle", "ButtonState", "StateWithProgress", "UpdateAboutToStart", "UpdateFailedBatteryLow", "UpdatingCancelingState", "UpdatingState", "Lcom/woocommerce/android/ui/cardreader/update/CardReaderUpdateViewModel$ViewState$UpdateAboutToStart;", "Lcom/woocommerce/android/ui/cardreader/update/CardReaderUpdateViewModel$ViewState$UpdatingState;", "Lcom/woocommerce/android/ui/cardreader/update/CardReaderUpdateViewModel$ViewState$UpdatingCancelingState;", "Lcom/woocommerce/android/ui/cardreader/update/CardReaderUpdateViewModel$ViewState$UpdateFailedBatteryLow;", "WooCommerce_wasabiDebug"})
    public static abstract class ViewState {
        @org.jetbrains.annotations.Nullable
        private final com.woocommerce.android.model.UiString title = null;
        private final int illustration = 0;
        @org.jetbrains.annotations.Nullable
        private final com.woocommerce.android.model.UiString description = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Integer progress = null;
        @org.jetbrains.annotations.Nullable
        private final com.woocommerce.android.model.UiString progressText = null;
        @org.jetbrains.annotations.Nullable
        private final com.woocommerce.android.ui.cardreader.update.CardReaderUpdateViewModel.ViewState.ButtonState button = null;
        
        private ViewState(com.woocommerce.android.model.UiString title, @androidx.annotation.DrawableRes
        int illustration, com.woocommerce.android.model.UiString description, java.lang.Integer progress, com.woocommerce.android.model.UiString progressText, com.woocommerce.android.ui.cardreader.update.CardReaderUpdateViewModel.ViewState.ButtonState button) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.woocommerce.android.model.UiString getTitle() {
            return null;
        }
        
        public final int getIllustration() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable
        public com.woocommerce.android.model.UiString getDescription() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public java.lang.Integer getProgress() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public com.woocommerce.android.model.UiString getProgressText() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public com.woocommerce.android.ui.cardreader.update.CardReaderUpdateViewModel.ViewState.ButtonState getButton() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/update/CardReaderUpdateViewModel$ViewState$UpdateAboutToStart;", "Lcom/woocommerce/android/ui/cardreader/update/CardReaderUpdateViewModel$ViewState;", "progressText", "Lcom/woocommerce/android/model/UiString;", "(Lcom/woocommerce/android/model/UiString;)V", "getProgressText", "()Lcom/woocommerce/android/model/UiString;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
        public static final class UpdateAboutToStart extends com.woocommerce.android.ui.cardreader.update.CardReaderUpdateViewModel.ViewState {
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.model.UiString progressText = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.cardreader.update.CardReaderUpdateViewModel.ViewState.UpdateAboutToStart copy(@org.jetbrains.annotations.NotNull
            com.woocommerce.android.model.UiString progressText) {
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
            
            public UpdateAboutToStart(@org.jetbrains.annotations.NotNull
            com.woocommerce.android.model.UiString progressText) {
                super(null, 0, null, null, null, null);
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.model.UiString component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public com.woocommerce.android.model.UiString getProgressText() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\bH\u00c6\u0003J\'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0018\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0004H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001c"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/update/CardReaderUpdateViewModel$ViewState$UpdatingState;", "Lcom/woocommerce/android/ui/cardreader/update/CardReaderUpdateViewModel$ViewState$StateWithProgress;", "Lcom/woocommerce/android/ui/cardreader/update/CardReaderUpdateViewModel$ViewState;", "progress", "", "progressText", "Lcom/woocommerce/android/model/UiString;", "description", "Lcom/woocommerce/android/model/UiString$UiStringRes;", "(ILcom/woocommerce/android/model/UiString;Lcom/woocommerce/android/model/UiString$UiStringRes;)V", "getDescription", "()Lcom/woocommerce/android/model/UiString$UiStringRes;", "getProgress", "()Ljava/lang/Integer;", "getProgressText", "()Lcom/woocommerce/android/model/UiString;", "component1", "component2", "component3", "copy", "copyWithUpdatedProgress", "equals", "", "other", "", "hashCode", "toString", "", "WooCommerce_wasabiDebug"})
        public static final class UpdatingState extends com.woocommerce.android.ui.cardreader.update.CardReaderUpdateViewModel.ViewState implements com.woocommerce.android.ui.cardreader.update.CardReaderUpdateViewModel.ViewState.StateWithProgress<com.woocommerce.android.ui.cardreader.update.CardReaderUpdateViewModel.ViewState.UpdatingState> {
            private final int progress = 0;
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.model.UiString progressText = null;
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.model.UiString.UiStringRes description = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.cardreader.update.CardReaderUpdateViewModel.ViewState.UpdatingState copy(int progress, @org.jetbrains.annotations.NotNull
            com.woocommerce.android.model.UiString progressText, @org.jetbrains.annotations.NotNull
            com.woocommerce.android.model.UiString.UiStringRes description) {
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
            
            public UpdatingState(int progress, @org.jetbrains.annotations.NotNull
            com.woocommerce.android.model.UiString progressText, @org.jetbrains.annotations.NotNull
            com.woocommerce.android.model.UiString.UiStringRes description) {
                super(null, 0, null, null, null, null);
            }
            
            public final int component1() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.Integer getProgress() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.model.UiString component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public com.woocommerce.android.model.UiString getProgressText() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.model.UiString.UiStringRes component3() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public com.woocommerce.android.model.UiString.UiStringRes getDescription() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public com.woocommerce.android.ui.cardreader.update.CardReaderUpdateViewModel.ViewState.UpdatingState copyWithUpdatedProgress(int progress, @org.jetbrains.annotations.NotNull
            com.woocommerce.android.model.UiString progressText) {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\bH\u00c6\u0003J\t\u0010\u0017\u001a\u00020\nH\u00c6\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\u0018\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u0004H\u00d6\u0001J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006!"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/update/CardReaderUpdateViewModel$ViewState$UpdatingCancelingState;", "Lcom/woocommerce/android/ui/cardreader/update/CardReaderUpdateViewModel$ViewState$StateWithProgress;", "Lcom/woocommerce/android/ui/cardreader/update/CardReaderUpdateViewModel$ViewState;", "progress", "", "progressText", "Lcom/woocommerce/android/model/UiString;", "button", "Lcom/woocommerce/android/ui/cardreader/update/CardReaderUpdateViewModel$ViewState$ButtonState;", "description", "Lcom/woocommerce/android/model/UiString$UiStringRes;", "(ILcom/woocommerce/android/model/UiString;Lcom/woocommerce/android/ui/cardreader/update/CardReaderUpdateViewModel$ViewState$ButtonState;Lcom/woocommerce/android/model/UiString$UiStringRes;)V", "getButton", "()Lcom/woocommerce/android/ui/cardreader/update/CardReaderUpdateViewModel$ViewState$ButtonState;", "getDescription", "()Lcom/woocommerce/android/model/UiString$UiStringRes;", "getProgress", "()Ljava/lang/Integer;", "getProgressText", "()Lcom/woocommerce/android/model/UiString;", "component1", "component2", "component3", "component4", "copy", "copyWithUpdatedProgress", "equals", "", "other", "", "hashCode", "toString", "", "WooCommerce_wasabiDebug"})
        public static final class UpdatingCancelingState extends com.woocommerce.android.ui.cardreader.update.CardReaderUpdateViewModel.ViewState implements com.woocommerce.android.ui.cardreader.update.CardReaderUpdateViewModel.ViewState.StateWithProgress<com.woocommerce.android.ui.cardreader.update.CardReaderUpdateViewModel.ViewState.UpdatingCancelingState> {
            private final int progress = 0;
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.model.UiString progressText = null;
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.ui.cardreader.update.CardReaderUpdateViewModel.ViewState.ButtonState button = null;
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.model.UiString.UiStringRes description = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.cardreader.update.CardReaderUpdateViewModel.ViewState.UpdatingCancelingState copy(int progress, @org.jetbrains.annotations.NotNull
            com.woocommerce.android.model.UiString progressText, @org.jetbrains.annotations.NotNull
            com.woocommerce.android.ui.cardreader.update.CardReaderUpdateViewModel.ViewState.ButtonState button, @org.jetbrains.annotations.NotNull
            com.woocommerce.android.model.UiString.UiStringRes description) {
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
            
            public UpdatingCancelingState(int progress, @org.jetbrains.annotations.NotNull
            com.woocommerce.android.model.UiString progressText, @org.jetbrains.annotations.NotNull
            com.woocommerce.android.ui.cardreader.update.CardReaderUpdateViewModel.ViewState.ButtonState button, @org.jetbrains.annotations.NotNull
            com.woocommerce.android.model.UiString.UiStringRes description) {
                super(null, 0, null, null, null, null);
            }
            
            public final int component1() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.Integer getProgress() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.model.UiString component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public com.woocommerce.android.model.UiString getProgressText() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.cardreader.update.CardReaderUpdateViewModel.ViewState.ButtonState component3() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public com.woocommerce.android.ui.cardreader.update.CardReaderUpdateViewModel.ViewState.ButtonState getButton() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.model.UiString.UiStringRes component4() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public com.woocommerce.android.model.UiString.UiStringRes getDescription() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public com.woocommerce.android.ui.cardreader.update.CardReaderUpdateViewModel.ViewState.UpdatingCancelingState copyWithUpdatedProgress(int progress, @org.jetbrains.annotations.NotNull
            com.woocommerce.android.model.UiString progressText) {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0016"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/update/CardReaderUpdateViewModel$ViewState$UpdateFailedBatteryLow;", "Lcom/woocommerce/android/ui/cardreader/update/CardReaderUpdateViewModel$ViewState;", "description", "Lcom/woocommerce/android/model/UiString;", "button", "Lcom/woocommerce/android/ui/cardreader/update/CardReaderUpdateViewModel$ViewState$ButtonState;", "(Lcom/woocommerce/android/model/UiString;Lcom/woocommerce/android/ui/cardreader/update/CardReaderUpdateViewModel$ViewState$ButtonState;)V", "getButton", "()Lcom/woocommerce/android/ui/cardreader/update/CardReaderUpdateViewModel$ViewState$ButtonState;", "getDescription", "()Lcom/woocommerce/android/model/UiString;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
        public static final class UpdateFailedBatteryLow extends com.woocommerce.android.ui.cardreader.update.CardReaderUpdateViewModel.ViewState {
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.model.UiString description = null;
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.ui.cardreader.update.CardReaderUpdateViewModel.ViewState.ButtonState button = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.cardreader.update.CardReaderUpdateViewModel.ViewState.UpdateFailedBatteryLow copy(@org.jetbrains.annotations.NotNull
            com.woocommerce.android.model.UiString description, @org.jetbrains.annotations.NotNull
            com.woocommerce.android.ui.cardreader.update.CardReaderUpdateViewModel.ViewState.ButtonState button) {
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
            
            public UpdateFailedBatteryLow(@org.jetbrains.annotations.NotNull
            com.woocommerce.android.model.UiString description, @org.jetbrains.annotations.NotNull
            com.woocommerce.android.ui.cardreader.update.CardReaderUpdateViewModel.ViewState.ButtonState button) {
                super(null, 0, null, null, null, null);
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.model.UiString component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public com.woocommerce.android.model.UiString getDescription() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.cardreader.update.CardReaderUpdateViewModel.ViewState.ButtonState component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public com.woocommerce.android.ui.cardreader.update.CardReaderUpdateViewModel.ViewState.ButtonState getButton() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0006H\u00c6\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/update/CardReaderUpdateViewModel$ViewState$ButtonState;", "", "onActionClicked", "Lkotlin/Function0;", "", "text", "Lcom/woocommerce/android/model/UiString;", "(Lkotlin/jvm/functions/Function0;Lcom/woocommerce/android/model/UiString;)V", "getOnActionClicked", "()Lkotlin/jvm/functions/Function0;", "getText", "()Lcom/woocommerce/android/model/UiString;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
        public static final class ButtonState {
            @org.jetbrains.annotations.NotNull
            private final kotlin.jvm.functions.Function0<kotlin.Unit> onActionClicked = null;
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.model.UiString text = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.cardreader.update.CardReaderUpdateViewModel.ViewState.ButtonState copy(@org.jetbrains.annotations.NotNull
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
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\u001d\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&\u00a2\u0006\u0002\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/update/CardReaderUpdateViewModel$ViewState$StateWithProgress;", "T", "Lcom/woocommerce/android/ui/cardreader/update/CardReaderUpdateViewModel$ViewState;", "", "copyWithUpdatedProgress", "progress", "", "progressText", "Lcom/woocommerce/android/model/UiString;", "(ILcom/woocommerce/android/model/UiString;)Lcom/woocommerce/android/ui/cardreader/update/CardReaderUpdateViewModel$ViewState;", "WooCommerce_wasabiDebug"})
        public static abstract interface StateWithProgress<T extends com.woocommerce.android.ui.cardreader.update.CardReaderUpdateViewModel.ViewState> {
            
            @org.jetbrains.annotations.NotNull
            public abstract T copyWithUpdatedProgress(int progress, @org.jetbrains.annotations.NotNull
            com.woocommerce.android.model.UiString progressText);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/update/CardReaderUpdateViewModel$UpdateResult;", "", "(Ljava/lang/String;I)V", "SUCCESS", "FAILED", "WooCommerce_wasabiDebug"})
    public static enum UpdateResult {
        /*public static final*/ SUCCESS /* = new SUCCESS() */,
        /*public static final*/ FAILED /* = new FAILED() */;
        
        UpdateResult() {
        }
    }
}