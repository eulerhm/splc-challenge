package com.woocommerce.android.ui.cardreader.connect;

import java.lang.System;

@kotlin.Suppress(names = {"LongParameterList"})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\r!\"#$%&\'()*+,-B_\b\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\t\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u001f\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b \u0010\u0011\u0082\u0001\r./0123456789:\u00a8\u0006;"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewState;", "", "headerLabel", "Lcom/woocommerce/android/model/UiString;", "illustration", "", "hintLabel", "primaryActionLabel", "secondaryActionLabel", "illustrationTopMargin", "listItems", "", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewModel$ListItemViewState;", "(Lcom/woocommerce/android/model/UiString;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/util/List;)V", "getHeaderLabel", "()Lcom/woocommerce/android/model/UiString;", "getHintLabel", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getIllustration", "getIllustrationTopMargin", "()I", "getListItems", "()Ljava/util/List;", "onPrimaryActionClicked", "Lkotlin/Function0;", "", "getOnPrimaryActionClicked", "()Lkotlin/jvm/functions/Function0;", "onSecondaryActionClicked", "getOnSecondaryActionClicked", "getPrimaryActionLabel", "getSecondaryActionLabel", "BluetoothDisabledError", "ConnectingFailedState", "ConnectingState", "InvalidMerchantAddressPostCodeError", "LocationDisabledError", "LocationPermissionRationale", "MissingBluetoothPermissionsError", "MissingLocationPermissionsError", "MissingMerchantAddressError", "MultipleReadersFoundState", "ReaderFoundState", "ScanningFailedState", "ScanningState", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewState$ScanningState;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewState$ReaderFoundState;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewState$MultipleReadersFoundState;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewState$ConnectingState;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewState$ScanningFailedState;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewState$ConnectingFailedState;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewState$LocationPermissionRationale;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewState$MissingLocationPermissionsError;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewState$LocationDisabledError;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewState$BluetoothDisabledError;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewState$MissingBluetoothPermissionsError;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewState$MissingMerchantAddressError;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewState$InvalidMerchantAddressPostCodeError;", "WooCommerce_vanillaDebug"})
public abstract class CardReaderConnectViewState {
    @org.jetbrains.annotations.Nullable()
    private final com.woocommerce.android.model.UiString headerLabel = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer illustration = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer hintLabel = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer primaryActionLabel = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer secondaryActionLabel = null;
    private final int illustrationTopMargin = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewModel.ListItemViewState> listItems = null;
    @org.jetbrains.annotations.Nullable()
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onPrimaryActionClicked = null;
    @org.jetbrains.annotations.Nullable()
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onSecondaryActionClicked = null;
    
    private CardReaderConnectViewState(com.woocommerce.android.model.UiString headerLabel, @androidx.annotation.DrawableRes()
    java.lang.Integer illustration, @androidx.annotation.StringRes()
    java.lang.Integer hintLabel, java.lang.Integer primaryActionLabel, java.lang.Integer secondaryActionLabel, @androidx.annotation.DimenRes()
    int illustrationTopMargin, java.util.List<? extends com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewModel.ListItemViewState> listItems) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.woocommerce.android.model.UiString getHeaderLabel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getIllustration() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getHintLabel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPrimaryActionLabel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSecondaryActionLabel() {
        return null;
    }
    
    public final int getIllustrationTopMargin() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.util.List<com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewModel.ListItemViewState> getListItems() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public kotlin.jvm.functions.Function0<kotlin.Unit> getOnPrimaryActionClicked() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public kotlin.jvm.functions.Function0<kotlin.Unit> getOnSecondaryActionClicked() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewState$ScanningState;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewState;", "onSecondaryActionClicked", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "getOnSecondaryActionClicked", "()Lkotlin/jvm/functions/Function0;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class ScanningState extends com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewState {
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function0<kotlin.Unit> onSecondaryActionClicked = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewState.ScanningState copy(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onSecondaryActionClicked) {
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
        
        public ScanningState(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onSecondaryActionClicked) {
            super(null, null, null, null, null, 0, null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function0<kotlin.Unit> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlin.jvm.functions.Function0<kotlin.Unit> getOnSecondaryActionClicked() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0007H\u00c6\u0003J3\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0007H\u00d6\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0019"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewState$ReaderFoundState;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewState;", "onPrimaryActionClicked", "Lkotlin/Function0;", "", "onSecondaryActionClicked", "readerId", "", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;)V", "getOnPrimaryActionClicked", "()Lkotlin/jvm/functions/Function0;", "getOnSecondaryActionClicked", "getReaderId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_vanillaDebug"})
    public static final class ReaderFoundState extends com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewState {
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function0<kotlin.Unit> onPrimaryActionClicked = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function0<kotlin.Unit> onSecondaryActionClicked = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String readerId = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewState.ReaderFoundState copy(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onPrimaryActionClicked, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onSecondaryActionClicked, @org.jetbrains.annotations.NotNull()
        java.lang.String readerId) {
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
        
        public ReaderFoundState(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onPrimaryActionClicked, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onSecondaryActionClicked, @org.jetbrains.annotations.NotNull()
        java.lang.String readerId) {
            super(null, null, null, null, null, 0, null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function0<kotlin.Unit> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlin.jvm.functions.Function0<kotlin.Unit> getOnPrimaryActionClicked() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function0<kotlin.Unit> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlin.jvm.functions.Function0<kotlin.Unit> getOnSecondaryActionClicked() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReaderId() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J)\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0018"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewState$MultipleReadersFoundState;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewState;", "listItems", "", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewModel$ListItemViewState;", "onSecondaryActionClicked", "Lkotlin/Function0;", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;)V", "getListItems", "()Ljava/util/List;", "getOnSecondaryActionClicked", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class MultipleReadersFoundState extends com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewState {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewModel.ListItemViewState> listItems = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function0<kotlin.Unit> onSecondaryActionClicked = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewState.MultipleReadersFoundState copy(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewModel.ListItemViewState> listItems, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onSecondaryActionClicked) {
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
        
        public MultipleReadersFoundState(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewModel.ListItemViewState> listItems, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onSecondaryActionClicked) {
            super(null, null, null, null, null, 0, null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewModel.ListItemViewState> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.util.List<com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewModel.ListItemViewState> getListItems() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function0<kotlin.Unit> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlin.jvm.functions.Function0<kotlin.Unit> getOnSecondaryActionClicked() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewState$ConnectingState;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewState;", "onSecondaryActionClicked", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "getOnSecondaryActionClicked", "()Lkotlin/jvm/functions/Function0;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class ConnectingState extends com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewState {
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function0<kotlin.Unit> onSecondaryActionClicked = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewState.ConnectingState copy(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onSecondaryActionClicked) {
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
        
        public ConnectingState(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onSecondaryActionClicked) {
            super(null, null, null, null, null, 0, null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function0<kotlin.Unit> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlin.jvm.functions.Function0<kotlin.Unit> getOnSecondaryActionClicked() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J)\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewState$ScanningFailedState;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewState;", "onPrimaryActionClicked", "Lkotlin/Function0;", "", "onSecondaryActionClicked", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getOnPrimaryActionClicked", "()Lkotlin/jvm/functions/Function0;", "getOnSecondaryActionClicked", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class ScanningFailedState extends com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewState {
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function0<kotlin.Unit> onPrimaryActionClicked = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function0<kotlin.Unit> onSecondaryActionClicked = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewState.ScanningFailedState copy(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onPrimaryActionClicked, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onSecondaryActionClicked) {
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
        
        public ScanningFailedState(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onPrimaryActionClicked, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onSecondaryActionClicked) {
            super(null, null, null, null, null, 0, null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function0<kotlin.Unit> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlin.jvm.functions.Function0<kotlin.Unit> getOnPrimaryActionClicked() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function0<kotlin.Unit> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlin.jvm.functions.Function0<kotlin.Unit> getOnSecondaryActionClicked() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J)\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewState$ConnectingFailedState;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewState;", "onPrimaryActionClicked", "Lkotlin/Function0;", "", "onSecondaryActionClicked", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getOnPrimaryActionClicked", "()Lkotlin/jvm/functions/Function0;", "getOnSecondaryActionClicked", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class ConnectingFailedState extends com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewState {
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function0<kotlin.Unit> onPrimaryActionClicked = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function0<kotlin.Unit> onSecondaryActionClicked = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewState.ConnectingFailedState copy(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onPrimaryActionClicked, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onSecondaryActionClicked) {
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
        
        public ConnectingFailedState(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onPrimaryActionClicked, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onSecondaryActionClicked) {
            super(null, null, null, null, null, 0, null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function0<kotlin.Unit> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlin.jvm.functions.Function0<kotlin.Unit> getOnPrimaryActionClicked() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function0<kotlin.Unit> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlin.jvm.functions.Function0<kotlin.Unit> getOnSecondaryActionClicked() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewState$LocationPermissionRationale;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewState;", "onPrimaryActionClicked", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "getOnPrimaryActionClicked", "()Lkotlin/jvm/functions/Function0;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class LocationPermissionRationale extends com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewState {
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function0<kotlin.Unit> onPrimaryActionClicked = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewState.LocationPermissionRationale copy(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onPrimaryActionClicked) {
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
        
        public LocationPermissionRationale(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onPrimaryActionClicked) {
            super(null, null, null, null, null, 0, null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function0<kotlin.Unit> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlin.jvm.functions.Function0<kotlin.Unit> getOnPrimaryActionClicked() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J)\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewState$MissingLocationPermissionsError;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewState;", "onPrimaryActionClicked", "Lkotlin/Function0;", "", "onSecondaryActionClicked", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getOnPrimaryActionClicked", "()Lkotlin/jvm/functions/Function0;", "getOnSecondaryActionClicked", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class MissingLocationPermissionsError extends com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewState {
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function0<kotlin.Unit> onPrimaryActionClicked = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function0<kotlin.Unit> onSecondaryActionClicked = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewState.MissingLocationPermissionsError copy(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onPrimaryActionClicked, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onSecondaryActionClicked) {
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
        
        public MissingLocationPermissionsError(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onPrimaryActionClicked, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onSecondaryActionClicked) {
            super(null, null, null, null, null, 0, null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function0<kotlin.Unit> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlin.jvm.functions.Function0<kotlin.Unit> getOnPrimaryActionClicked() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function0<kotlin.Unit> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlin.jvm.functions.Function0<kotlin.Unit> getOnSecondaryActionClicked() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J)\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewState$LocationDisabledError;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewState;", "onPrimaryActionClicked", "Lkotlin/Function0;", "", "onSecondaryActionClicked", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getOnPrimaryActionClicked", "()Lkotlin/jvm/functions/Function0;", "getOnSecondaryActionClicked", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class LocationDisabledError extends com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewState {
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function0<kotlin.Unit> onPrimaryActionClicked = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function0<kotlin.Unit> onSecondaryActionClicked = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewState.LocationDisabledError copy(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onPrimaryActionClicked, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onSecondaryActionClicked) {
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
        
        public LocationDisabledError(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onPrimaryActionClicked, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onSecondaryActionClicked) {
            super(null, null, null, null, null, 0, null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function0<kotlin.Unit> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlin.jvm.functions.Function0<kotlin.Unit> getOnPrimaryActionClicked() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function0<kotlin.Unit> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlin.jvm.functions.Function0<kotlin.Unit> getOnSecondaryActionClicked() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J)\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewState$BluetoothDisabledError;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewState;", "onPrimaryActionClicked", "Lkotlin/Function0;", "", "onSecondaryActionClicked", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getOnPrimaryActionClicked", "()Lkotlin/jvm/functions/Function0;", "getOnSecondaryActionClicked", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class BluetoothDisabledError extends com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewState {
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function0<kotlin.Unit> onPrimaryActionClicked = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function0<kotlin.Unit> onSecondaryActionClicked = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewState.BluetoothDisabledError copy(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onPrimaryActionClicked, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onSecondaryActionClicked) {
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
        
        public BluetoothDisabledError(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onPrimaryActionClicked, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onSecondaryActionClicked) {
            super(null, null, null, null, null, 0, null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function0<kotlin.Unit> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlin.jvm.functions.Function0<kotlin.Unit> getOnPrimaryActionClicked() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function0<kotlin.Unit> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlin.jvm.functions.Function0<kotlin.Unit> getOnSecondaryActionClicked() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J)\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewState$MissingBluetoothPermissionsError;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewState;", "onPrimaryActionClicked", "Lkotlin/Function0;", "", "onSecondaryActionClicked", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getOnPrimaryActionClicked", "()Lkotlin/jvm/functions/Function0;", "getOnSecondaryActionClicked", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class MissingBluetoothPermissionsError extends com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewState {
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function0<kotlin.Unit> onPrimaryActionClicked = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function0<kotlin.Unit> onSecondaryActionClicked = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewState.MissingBluetoothPermissionsError copy(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onPrimaryActionClicked, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onSecondaryActionClicked) {
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
        
        public MissingBluetoothPermissionsError(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onPrimaryActionClicked, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onSecondaryActionClicked) {
            super(null, null, null, null, null, 0, null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function0<kotlin.Unit> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlin.jvm.functions.Function0<kotlin.Unit> getOnPrimaryActionClicked() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function0<kotlin.Unit> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlin.jvm.functions.Function0<kotlin.Unit> getOnSecondaryActionClicked() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J)\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewState$MissingMerchantAddressError;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewState;", "onPrimaryActionClicked", "Lkotlin/Function0;", "", "onSecondaryActionClicked", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getOnPrimaryActionClicked", "()Lkotlin/jvm/functions/Function0;", "getOnSecondaryActionClicked", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class MissingMerchantAddressError extends com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewState {
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function0<kotlin.Unit> onPrimaryActionClicked = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function0<kotlin.Unit> onSecondaryActionClicked = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewState.MissingMerchantAddressError copy(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onPrimaryActionClicked, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onSecondaryActionClicked) {
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
        
        public MissingMerchantAddressError(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onPrimaryActionClicked, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onSecondaryActionClicked) {
            super(null, null, null, null, null, 0, null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function0<kotlin.Unit> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlin.jvm.functions.Function0<kotlin.Unit> getOnPrimaryActionClicked() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function0<kotlin.Unit> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlin.jvm.functions.Function0<kotlin.Unit> getOnSecondaryActionClicked() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewState$InvalidMerchantAddressPostCodeError;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewState;", "onPrimaryActionClicked", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "getOnPrimaryActionClicked", "()Lkotlin/jvm/functions/Function0;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class InvalidMerchantAddressPostCodeError extends com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewState {
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function0<kotlin.Unit> onPrimaryActionClicked = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewState.InvalidMerchantAddressPostCodeError copy(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onPrimaryActionClicked) {
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
        
        public InvalidMerchantAddressPostCodeError(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onPrimaryActionClicked) {
            super(null, null, null, null, null, 0, null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function0<kotlin.Unit> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlin.jvm.functions.Function0<kotlin.Unit> getOnPrimaryActionClicked() {
            return null;
        }
    }
}