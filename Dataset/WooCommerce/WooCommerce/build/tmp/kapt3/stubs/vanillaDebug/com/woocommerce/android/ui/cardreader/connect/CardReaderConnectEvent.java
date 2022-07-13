package com.woocommerce.android.ui.cardreader.connect;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000f\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u000f\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f \u00a8\u0006!"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectEvent;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "()V", "CheckBluetoothEnabled", "CheckBluetoothPermissionsGiven", "CheckLocationEnabled", "CheckLocationPermissions", "OpenGenericWebView", "OpenLocationSettings", "OpenPermissionsSettings", "OpenWPComWebView", "RequestBluetoothRuntimePermissions", "RequestEnableBluetooth", "RequestLocationPermissions", "ShowCardReaderTutorial", "ShowToast", "ShowToastString", "ShowUpdateInProgress", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectEvent$CheckLocationPermissions;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectEvent$CheckLocationEnabled;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectEvent$CheckBluetoothEnabled;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectEvent$CheckBluetoothPermissionsGiven;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectEvent$RequestEnableBluetooth;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectEvent$RequestBluetoothRuntimePermissions;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectEvent$RequestLocationPermissions;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectEvent$OpenPermissionsSettings;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectEvent$OpenLocationSettings;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectEvent$ShowCardReaderTutorial;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectEvent$ShowUpdateInProgress;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectEvent$ShowToast;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectEvent$ShowToastString;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectEvent$OpenWPComWebView;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectEvent$OpenGenericWebView;", "WooCommerce_vanillaDebug"})
public abstract class CardReaderConnectEvent extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
    
    private CardReaderConnectEvent() {
        super(false);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B=\u00126\u0010\u0002\u001a2\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0003\u00a2\u0006\u0002\u0010\nJ9\u0010\r\u001a2\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0003H\u00c6\u0003JC\u0010\u000e\u001a\u00020\u000028\b\u0002\u0010\u0002\u001a2\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001RA\u0010\u0002\u001a2\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0016"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectEvent$CheckLocationPermissions;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectEvent;", "onLocationPermissionsCheckResult", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "permissionGranted", "showRationale", "", "(Lkotlin/jvm/functions/Function2;)V", "getOnLocationPermissionsCheckResult", "()Lkotlin/jvm/functions/Function2;", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class CheckLocationPermissions extends com.woocommerce.android.ui.cardreader.connect.CardReaderConnectEvent {
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function2<java.lang.Boolean, java.lang.Boolean, kotlin.Unit> onLocationPermissionsCheckResult = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.cardreader.connect.CardReaderConnectEvent.CheckLocationPermissions copy(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.Boolean, kotlin.Unit> onLocationPermissionsCheckResult) {
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
        
        public CheckLocationPermissions(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.Boolean, kotlin.Unit> onLocationPermissionsCheckResult) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function2<java.lang.Boolean, java.lang.Boolean, kotlin.Unit> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function2<java.lang.Boolean, java.lang.Boolean, kotlin.Unit> getOnLocationPermissionsCheckResult() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\u0010\u0006J\u0015\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u00c6\u0003J\u001f\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u00c6\u0001J\u0013\u0010\u000b\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0012"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectEvent$CheckLocationEnabled;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectEvent;", "onLocationEnabledCheckResult", "Lkotlin/Function1;", "", "", "(Lkotlin/jvm/functions/Function1;)V", "getOnLocationEnabledCheckResult", "()Lkotlin/jvm/functions/Function1;", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class CheckLocationEnabled extends com.woocommerce.android.ui.cardreader.connect.CardReaderConnectEvent {
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> onLocationEnabledCheckResult = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.cardreader.connect.CardReaderConnectEvent.CheckLocationEnabled copy(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onLocationEnabledCheckResult) {
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
        
        public CheckLocationEnabled(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onLocationEnabledCheckResult) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> getOnLocationEnabledCheckResult() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\u0010\u0006J\u0015\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u00c6\u0003J\u001f\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u00c6\u0001J\u0013\u0010\u000b\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0012"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectEvent$CheckBluetoothEnabled;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectEvent;", "onBluetoothCheckResult", "Lkotlin/Function1;", "", "", "(Lkotlin/jvm/functions/Function1;)V", "getOnBluetoothCheckResult", "()Lkotlin/jvm/functions/Function1;", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class CheckBluetoothEnabled extends com.woocommerce.android.ui.cardreader.connect.CardReaderConnectEvent {
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> onBluetoothCheckResult = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.cardreader.connect.CardReaderConnectEvent.CheckBluetoothEnabled copy(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onBluetoothCheckResult) {
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
        
        public CheckBluetoothEnabled(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onBluetoothCheckResult) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> getOnBluetoothCheckResult() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\u0010\u0006J\u0015\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u00c6\u0003J\u001f\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u00c6\u0001J\u0013\u0010\u000b\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0012"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectEvent$CheckBluetoothPermissionsGiven;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectEvent;", "onBluetoothPermissionsGivenCheckResult", "Lkotlin/Function1;", "", "", "(Lkotlin/jvm/functions/Function1;)V", "getOnBluetoothPermissionsGivenCheckResult", "()Lkotlin/jvm/functions/Function1;", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class CheckBluetoothPermissionsGiven extends com.woocommerce.android.ui.cardreader.connect.CardReaderConnectEvent {
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> onBluetoothPermissionsGivenCheckResult = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.cardreader.connect.CardReaderConnectEvent.CheckBluetoothPermissionsGiven copy(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onBluetoothPermissionsGivenCheckResult) {
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
        
        public CheckBluetoothPermissionsGiven(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onBluetoothPermissionsGivenCheckResult) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> getOnBluetoothPermissionsGivenCheckResult() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\u0010\u0006J\u0015\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u00c6\u0003J\u001f\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u00c6\u0001J\u0013\u0010\u000b\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0012"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectEvent$RequestEnableBluetooth;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectEvent;", "onEnableBluetoothRequestResult", "Lkotlin/Function1;", "", "", "(Lkotlin/jvm/functions/Function1;)V", "getOnEnableBluetoothRequestResult", "()Lkotlin/jvm/functions/Function1;", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class RequestEnableBluetooth extends com.woocommerce.android.ui.cardreader.connect.CardReaderConnectEvent {
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> onEnableBluetoothRequestResult = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.cardreader.connect.CardReaderConnectEvent.RequestEnableBluetooth copy(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onEnableBluetoothRequestResult) {
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
        
        public RequestEnableBluetooth(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onEnableBluetoothRequestResult) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> getOnEnableBluetoothRequestResult() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\u0010\u0006J\u0015\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u00c6\u0003J\u001f\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u00c6\u0001J\u0013\u0010\u000b\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0012"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectEvent$RequestBluetoothRuntimePermissions;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectEvent;", "onBluetoothRuntimePermissionsRequestResult", "Lkotlin/Function1;", "", "", "(Lkotlin/jvm/functions/Function1;)V", "getOnBluetoothRuntimePermissionsRequestResult", "()Lkotlin/jvm/functions/Function1;", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class RequestBluetoothRuntimePermissions extends com.woocommerce.android.ui.cardreader.connect.CardReaderConnectEvent {
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> onBluetoothRuntimePermissionsRequestResult = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.cardreader.connect.CardReaderConnectEvent.RequestBluetoothRuntimePermissions copy(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onBluetoothRuntimePermissionsRequestResult) {
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
        
        public RequestBluetoothRuntimePermissions(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onBluetoothRuntimePermissionsRequestResult) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> getOnBluetoothRuntimePermissionsRequestResult() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\u0010\u0006J\u0015\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u00c6\u0003J\u001f\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u00c6\u0001J\u0013\u0010\u000b\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0012"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectEvent$RequestLocationPermissions;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectEvent;", "onPermissionsRequestResult", "Lkotlin/Function1;", "", "", "(Lkotlin/jvm/functions/Function1;)V", "getOnPermissionsRequestResult", "()Lkotlin/jvm/functions/Function1;", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class RequestLocationPermissions extends com.woocommerce.android.ui.cardreader.connect.CardReaderConnectEvent {
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> onPermissionsRequestResult = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.cardreader.connect.CardReaderConnectEvent.RequestLocationPermissions copy(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onPermissionsRequestResult) {
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
        
        public RequestLocationPermissions(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onPermissionsRequestResult) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> getOnPermissionsRequestResult() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectEvent$OpenPermissionsSettings;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectEvent;", "()V", "WooCommerce_vanillaDebug"})
    public static final class OpenPermissionsSettings extends com.woocommerce.android.ui.cardreader.connect.CardReaderConnectEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.woocommerce.android.ui.cardreader.connect.CardReaderConnectEvent.OpenPermissionsSettings INSTANCE = null;
        
        private OpenPermissionsSettings() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectEvent$OpenLocationSettings;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectEvent;", "onLocationSettingsClosed", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "getOnLocationSettingsClosed", "()Lkotlin/jvm/functions/Function0;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class OpenLocationSettings extends com.woocommerce.android.ui.cardreader.connect.CardReaderConnectEvent {
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function0<kotlin.Unit> onLocationSettingsClosed = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.cardreader.connect.CardReaderConnectEvent.OpenLocationSettings copy(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onLocationSettingsClosed) {
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
        
        public OpenLocationSettings(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onLocationSettingsClosed) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function0<kotlin.Unit> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnLocationSettingsClosed() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectEvent$ShowCardReaderTutorial;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectEvent;", "cardReaderFlowParam", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderFlowParam;", "(Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderFlowParam;)V", "getCardReaderFlowParam", "()Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderFlowParam;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class ShowCardReaderTutorial extends com.woocommerce.android.ui.cardreader.connect.CardReaderConnectEvent {
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.ui.cardreader.onboarding.CardReaderFlowParam cardReaderFlowParam = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.cardreader.connect.CardReaderConnectEvent.ShowCardReaderTutorial copy(@org.jetbrains.annotations.NotNull()
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
        
        public ShowCardReaderTutorial(@org.jetbrains.annotations.NotNull()
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
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectEvent$ShowUpdateInProgress;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectEvent;", "()V", "WooCommerce_vanillaDebug"})
    public static final class ShowUpdateInProgress extends com.woocommerce.android.ui.cardreader.connect.CardReaderConnectEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.woocommerce.android.ui.cardreader.connect.CardReaderConnectEvent.ShowUpdateInProgress INSTANCE = null;
        
        private ShowUpdateInProgress() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectEvent$ShowToast;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectEvent;", "message", "", "(I)V", "getMessage", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class ShowToast extends com.woocommerce.android.ui.cardreader.connect.CardReaderConnectEvent {
        private final int message = 0;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.cardreader.connect.CardReaderConnectEvent.ShowToast copy(@androidx.annotation.StringRes()
        int message) {
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
        
        public ShowToast(@androidx.annotation.StringRes()
        int message) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getMessage() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectEvent$ShowToastString;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectEvent;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_vanillaDebug"})
    public static final class ShowToastString extends com.woocommerce.android.ui.cardreader.connect.CardReaderConnectEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String message = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.cardreader.connect.CardReaderConnectEvent.ShowToastString copy(@org.jetbrains.annotations.NotNull()
        java.lang.String message) {
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
        
        public ShowToastString(@org.jetbrains.annotations.NotNull()
        java.lang.String message) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMessage() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectEvent$OpenWPComWebView;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectEvent;", "url", "", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_vanillaDebug"})
    public static final class OpenWPComWebView extends com.woocommerce.android.ui.cardreader.connect.CardReaderConnectEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String url = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.cardreader.connect.CardReaderConnectEvent.OpenWPComWebView copy(@org.jetbrains.annotations.NotNull()
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
        
        public OpenWPComWebView(@org.jetbrains.annotations.NotNull()
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
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectEvent$OpenGenericWebView;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectEvent;", "url", "", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_vanillaDebug"})
    public static final class OpenGenericWebView extends com.woocommerce.android.ui.cardreader.connect.CardReaderConnectEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String url = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.cardreader.connect.CardReaderConnectEvent.OpenGenericWebView copy(@org.jetbrains.annotations.NotNull()
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
        
        public OpenGenericWebView(@org.jetbrains.annotations.NotNull()
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