package com.woocommerce.android.ui.cardreader.connect;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\fB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/connect/CardReaderLocationRepository;", "", "inPersonPaymentsStore", "Lorg/wordpress/android/fluxc/store/WCInPersonPaymentsStore;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "(Lorg/wordpress/android/fluxc/store/WCInPersonPaymentsStore;Lcom/woocommerce/android/tools/SelectedSite;)V", "getDefaultLocationId", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderLocationRepository$LocationIdFetchingResult;", "pluginType", "Lcom/woocommerce/android/ui/cardreader/onboarding/PluginType;", "(Lcom/woocommerce/android/ui/cardreader/onboarding/PluginType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LocationIdFetchingResult", "WooCommerce_wasabiDebug"})
public final class CardReaderLocationRepository {
    private final org.wordpress.android.fluxc.store.WCInPersonPaymentsStore inPersonPaymentsStore = null;
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    
    @javax.inject.Inject
    public CardReaderLocationRepository(@org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.WCInPersonPaymentsStore inPersonPaymentsStore, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.SelectedSite selectedSite) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getDefaultLocationId(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.cardreader.onboarding.PluginType pluginType, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.woocommerce.android.ui.cardreader.connect.CardReaderLocationRepository.LocationIdFetchingResult> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/connect/CardReaderLocationRepository$LocationIdFetchingResult;", "", "()V", "Error", "Success", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderLocationRepository$LocationIdFetchingResult$Error;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderLocationRepository$LocationIdFetchingResult$Success;", "WooCommerce_wasabiDebug"})
    public static abstract class LocationIdFetchingResult {
        
        private LocationIdFetchingResult() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/connect/CardReaderLocationRepository$LocationIdFetchingResult$Error;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderLocationRepository$LocationIdFetchingResult;", "()V", "InvalidPostalCode", "MissingAddress", "Other", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderLocationRepository$LocationIdFetchingResult$Error$MissingAddress;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderLocationRepository$LocationIdFetchingResult$Error$InvalidPostalCode;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderLocationRepository$LocationIdFetchingResult$Error$Other;", "WooCommerce_wasabiDebug"})
        public static abstract class Error extends com.woocommerce.android.ui.cardreader.connect.CardReaderLocationRepository.LocationIdFetchingResult {
            
            private Error() {
                super();
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/connect/CardReaderLocationRepository$LocationIdFetchingResult$Error$MissingAddress;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderLocationRepository$LocationIdFetchingResult$Error;", "url", "", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_wasabiDebug"})
            public static final class MissingAddress extends com.woocommerce.android.ui.cardreader.connect.CardReaderLocationRepository.LocationIdFetchingResult.Error {
                @org.jetbrains.annotations.NotNull
                private final java.lang.String url = null;
                
                @org.jetbrains.annotations.NotNull
                public final com.woocommerce.android.ui.cardreader.connect.CardReaderLocationRepository.LocationIdFetchingResult.Error.MissingAddress copy(@org.jetbrains.annotations.NotNull
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
                
                public MissingAddress(@org.jetbrains.annotations.NotNull
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
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/connect/CardReaderLocationRepository$LocationIdFetchingResult$Error$InvalidPostalCode;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderLocationRepository$LocationIdFetchingResult$Error;", "()V", "WooCommerce_wasabiDebug"})
            public static final class InvalidPostalCode extends com.woocommerce.android.ui.cardreader.connect.CardReaderLocationRepository.LocationIdFetchingResult.Error {
                @org.jetbrains.annotations.NotNull
                public static final com.woocommerce.android.ui.cardreader.connect.CardReaderLocationRepository.LocationIdFetchingResult.Error.InvalidPostalCode INSTANCE = null;
                
                private InvalidPostalCode() {
                    super();
                }
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/connect/CardReaderLocationRepository$LocationIdFetchingResult$Error$Other;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderLocationRepository$LocationIdFetchingResult$Error;", "error", "", "(Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_wasabiDebug"})
            public static final class Other extends com.woocommerce.android.ui.cardreader.connect.CardReaderLocationRepository.LocationIdFetchingResult.Error {
                @org.jetbrains.annotations.Nullable
                private final java.lang.String error = null;
                
                @org.jetbrains.annotations.NotNull
                public final com.woocommerce.android.ui.cardreader.connect.CardReaderLocationRepository.LocationIdFetchingResult.Error.Other copy(@org.jetbrains.annotations.Nullable
                java.lang.String error) {
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
                
                public Other(@org.jetbrains.annotations.Nullable
                java.lang.String error) {
                    super();
                }
                
                @org.jetbrains.annotations.Nullable
                public final java.lang.String component1() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable
                public final java.lang.String getError() {
                    return null;
                }
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/connect/CardReaderLocationRepository$LocationIdFetchingResult$Success;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderLocationRepository$LocationIdFetchingResult;", "locationId", "", "(Ljava/lang/String;)V", "getLocationId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_wasabiDebug"})
        public static final class Success extends com.woocommerce.android.ui.cardreader.connect.CardReaderLocationRepository.LocationIdFetchingResult {
            @org.jetbrains.annotations.NotNull
            private final java.lang.String locationId = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.cardreader.connect.CardReaderLocationRepository.LocationIdFetchingResult.Success copy(@org.jetbrains.annotations.NotNull
            java.lang.String locationId) {
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
            
            public Success(@org.jetbrains.annotations.NotNull
            java.lang.String locationId) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getLocationId() {
                return null;
            }
        }
    }
}