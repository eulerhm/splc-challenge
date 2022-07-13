package com.woocommerce.android.ui.cardreader.onboarding;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0010\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016B\u0013\b\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0010\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&\u00a8\u0006\'"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingState;", "Landroid/os/Parcelable;", "preferredPlugin", "Lcom/woocommerce/android/ui/cardreader/onboarding/PluginType;", "(Lcom/woocommerce/android/ui/cardreader/onboarding/PluginType;)V", "getPreferredPlugin", "()Lcom/woocommerce/android/ui/cardreader/onboarding/PluginType;", "GenericError", "NoConnectionError", "OnboardingCompleted", "PluginInTestModeWithLiveStripeAccount", "PluginIsNotSupportedInTheCountry", "PluginUnsupportedVersion", "SetupNotCompleted", "StoreCountryNotSupported", "StripeAccountCountryNotSupported", "StripeAccountOverdueRequirement", "StripeAccountPendingRequirement", "StripeAccountRejected", "StripeAccountUnderReview", "WcpayAndStripeActivated", "WcpayNotActivated", "WcpayNotInstalled", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingState$OnboardingCompleted;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingState$StoreCountryNotSupported;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingState$PluginIsNotSupportedInTheCountry;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingState$WcpayNotInstalled;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingState$PluginUnsupportedVersion;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingState$WcpayNotActivated;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingState$SetupNotCompleted;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingState$WcpayAndStripeActivated;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingState$PluginInTestModeWithLiveStripeAccount;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingState$StripeAccountUnderReview;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingState$StripeAccountPendingRequirement;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingState$StripeAccountOverdueRequirement;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingState$StripeAccountRejected;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingState$StripeAccountCountryNotSupported;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingState$GenericError;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingState$NoConnectionError;", "WooCommerce_wasabiDebug"})
public abstract class CardReaderOnboardingState implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable
    private final com.woocommerce.android.ui.cardreader.onboarding.PluginType preferredPlugin = null;
    
    private CardReaderOnboardingState(com.woocommerce.android.ui.cardreader.onboarding.PluginType preferredPlugin) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public com.woocommerce.android.ui.cardreader.onboarding.PluginType getPreferredPlugin() {
        return null;
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\u001e"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingState$OnboardingCompleted;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingState;", "preferredPlugin", "Lcom/woocommerce/android/ui/cardreader/onboarding/PluginType;", "version", "", "countryCode", "(Lcom/woocommerce/android/ui/cardreader/onboarding/PluginType;Ljava/lang/String;Ljava/lang/String;)V", "getCountryCode", "()Ljava/lang/String;", "getPreferredPlugin", "()Lcom/woocommerce/android/ui/cardreader/onboarding/PluginType;", "getVersion", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class OnboardingCompleted extends com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState {
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.ui.cardreader.onboarding.PluginType preferredPlugin = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String version = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String countryCode = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.OnboardingCompleted> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.OnboardingCompleted copy(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.cardreader.onboarding.PluginType preferredPlugin, @org.jetbrains.annotations.Nullable
        java.lang.String version, @org.jetbrains.annotations.NotNull
        java.lang.String countryCode) {
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
        
        public OnboardingCompleted(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.cardreader.onboarding.PluginType preferredPlugin, @org.jetbrains.annotations.Nullable
        java.lang.String version, @org.jetbrains.annotations.NotNull
        java.lang.String countryCode) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.cardreader.onboarding.PluginType component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public com.woocommerce.android.ui.cardreader.onboarding.PluginType getPreferredPlugin() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getVersion() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getCountryCode() {
            return null;
        }
        
        @java.lang.Override
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override
        public void writeToParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.OnboardingCompleted> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.OnboardingCompleted createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.OnboardingCompleted[] newArray(int size) {
                return null;
            }
        }
    }
    
    /**
     * Store is not located in one of the supported countries.
     */
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\nH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0016"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingState$StoreCountryNotSupported;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingState;", "countryCode", "", "(Ljava/lang/String;)V", "getCountryCode", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class StoreCountryNotSupported extends com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState {
        @org.jetbrains.annotations.Nullable
        private final java.lang.String countryCode = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.StoreCountryNotSupported> CREATOR = null;
        
        /**
         * Store is not located in one of the supported countries.
         */
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.StoreCountryNotSupported copy(@org.jetbrains.annotations.Nullable
        java.lang.String countryCode) {
            return null;
        }
        
        /**
         * Store is not located in one of the supported countries.
         */
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        /**
         * Store is not located in one of the supported countries.
         */
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        /**
         * Store is not located in one of the supported countries.
         */
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public StoreCountryNotSupported(@org.jetbrains.annotations.Nullable
        java.lang.String countryCode) {
            super(null);
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getCountryCode() {
            return null;
        }
        
        @java.lang.Override
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override
        public void writeToParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.StoreCountryNotSupported> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.StoreCountryNotSupported createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.StoreCountryNotSupported[] newArray(int size) {
                return null;
            }
        }
    }
    
    /**
     * Preferred Plugin is not supported in the country
     */
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001b"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingState$PluginIsNotSupportedInTheCountry;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingState;", "preferredPlugin", "Lcom/woocommerce/android/ui/cardreader/onboarding/PluginType;", "countryCode", "", "(Lcom/woocommerce/android/ui/cardreader/onboarding/PluginType;Ljava/lang/String;)V", "getCountryCode", "()Ljava/lang/String;", "getPreferredPlugin", "()Lcom/woocommerce/android/ui/cardreader/onboarding/PluginType;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class PluginIsNotSupportedInTheCountry extends com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState {
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.ui.cardreader.onboarding.PluginType preferredPlugin = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String countryCode = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.PluginIsNotSupportedInTheCountry> CREATOR = null;
        
        /**
         * Preferred Plugin is not supported in the country
         */
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.PluginIsNotSupportedInTheCountry copy(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.cardreader.onboarding.PluginType preferredPlugin, @org.jetbrains.annotations.NotNull
        java.lang.String countryCode) {
            return null;
        }
        
        /**
         * Preferred Plugin is not supported in the country
         */
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        /**
         * Preferred Plugin is not supported in the country
         */
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        /**
         * Preferred Plugin is not supported in the country
         */
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public PluginIsNotSupportedInTheCountry(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.cardreader.onboarding.PluginType preferredPlugin, @org.jetbrains.annotations.NotNull
        java.lang.String countryCode) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.cardreader.onboarding.PluginType component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public com.woocommerce.android.ui.cardreader.onboarding.PluginType getPreferredPlugin() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getCountryCode() {
            return null;
        }
        
        @java.lang.Override
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override
        public void writeToParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.PluginIsNotSupportedInTheCountry> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.PluginIsNotSupportedInTheCountry createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.PluginIsNotSupportedInTheCountry[] newArray(int size) {
                return null;
            }
        }
    }
    
    /**
     * WCPay plugin is not installed on the store.
     */
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u00d6\u0001\u00a8\u0006\n"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingState$WcpayNotInstalled;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingState;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class WcpayNotInstalled extends com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState {
        @org.jetbrains.annotations.NotNull
        public static final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.WcpayNotInstalled INSTANCE = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.WcpayNotInstalled> CREATOR = null;
        
        private WcpayNotInstalled() {
            super(null);
        }
        
        @java.lang.Override
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override
        public void writeToParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.WcpayNotInstalled> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.WcpayNotInstalled createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.WcpayNotInstalled[] newArray(int size) {
                return null;
            }
        }
    }
    
    /**
     * Plugin is installed on the store, but the version is out-dated and doesn't contain required APIs
     * for card present payments.
     */
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\nH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingState$PluginUnsupportedVersion;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingState;", "preferredPlugin", "Lcom/woocommerce/android/ui/cardreader/onboarding/PluginType;", "(Lcom/woocommerce/android/ui/cardreader/onboarding/PluginType;)V", "getPreferredPlugin", "()Lcom/woocommerce/android/ui/cardreader/onboarding/PluginType;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class PluginUnsupportedVersion extends com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState {
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.ui.cardreader.onboarding.PluginType preferredPlugin = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.PluginUnsupportedVersion> CREATOR = null;
        
        /**
         * Plugin is installed on the store, but the version is out-dated and doesn't contain required APIs
         * for card present payments.
         */
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.PluginUnsupportedVersion copy(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.cardreader.onboarding.PluginType preferredPlugin) {
            return null;
        }
        
        /**
         * Plugin is installed on the store, but the version is out-dated and doesn't contain required APIs
         * for card present payments.
         */
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        /**
         * Plugin is installed on the store, but the version is out-dated and doesn't contain required APIs
         * for card present payments.
         */
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        /**
         * Plugin is installed on the store, but the version is out-dated and doesn't contain required APIs
         * for card present payments.
         */
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public PluginUnsupportedVersion(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.cardreader.onboarding.PluginType preferredPlugin) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.cardreader.onboarding.PluginType component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public com.woocommerce.android.ui.cardreader.onboarding.PluginType getPreferredPlugin() {
            return null;
        }
        
        @java.lang.Override
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override
        public void writeToParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.PluginUnsupportedVersion> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.PluginUnsupportedVersion createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.PluginUnsupportedVersion[] newArray(int size) {
                return null;
            }
        }
    }
    
    /**
     * WCPay is installed on the store but is not activated.
     */
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u00d6\u0001\u00a8\u0006\n"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingState$WcpayNotActivated;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingState;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class WcpayNotActivated extends com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState {
        @org.jetbrains.annotations.NotNull
        public static final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.WcpayNotActivated INSTANCE = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.WcpayNotActivated> CREATOR = null;
        
        private WcpayNotActivated() {
            super(null);
        }
        
        @java.lang.Override
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override
        public void writeToParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.WcpayNotActivated> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.WcpayNotActivated createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.WcpayNotActivated[] newArray(int size) {
                return null;
            }
        }
    }
    
    /**
     * Plugin is installed and activated but requires to be setup first.
     */
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\nH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingState$SetupNotCompleted;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingState;", "preferredPlugin", "Lcom/woocommerce/android/ui/cardreader/onboarding/PluginType;", "(Lcom/woocommerce/android/ui/cardreader/onboarding/PluginType;)V", "getPreferredPlugin", "()Lcom/woocommerce/android/ui/cardreader/onboarding/PluginType;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class SetupNotCompleted extends com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState {
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.ui.cardreader.onboarding.PluginType preferredPlugin = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.SetupNotCompleted> CREATOR = null;
        
        /**
         * Plugin is installed and activated but requires to be setup first.
         */
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.SetupNotCompleted copy(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.cardreader.onboarding.PluginType preferredPlugin) {
            return null;
        }
        
        /**
         * Plugin is installed and activated but requires to be setup first.
         */
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        /**
         * Plugin is installed and activated but requires to be setup first.
         */
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        /**
         * Plugin is installed and activated but requires to be setup first.
         */
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public SetupNotCompleted(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.cardreader.onboarding.PluginType preferredPlugin) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.cardreader.onboarding.PluginType component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public com.woocommerce.android.ui.cardreader.onboarding.PluginType getPreferredPlugin() {
            return null;
        }
        
        @java.lang.Override
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override
        public void writeToParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.SetupNotCompleted> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.SetupNotCompleted createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.SetupNotCompleted[] newArray(int size) {
                return null;
            }
        }
    }
    
    /**
     * Both plugins are installed and activated on the site. IPP are not supported in this state.
     */
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u00d6\u0001\u00a8\u0006\n"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingState$WcpayAndStripeActivated;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingState;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class WcpayAndStripeActivated extends com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState {
        @org.jetbrains.annotations.NotNull
        public static final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.WcpayAndStripeActivated INSTANCE = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.WcpayAndStripeActivated> CREATOR = null;
        
        private WcpayAndStripeActivated() {
            super(null);
        }
        
        @java.lang.Override
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override
        public void writeToParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.WcpayAndStripeActivated> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.WcpayAndStripeActivated createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.WcpayAndStripeActivated[] newArray(int size) {
                return null;
            }
        }
    }
    
    /**
     * This is a bit special case: WCPay is set to "dev mode" but the connected Stripe account is in live mode.
     * Connecting to a reader or accepting payments is not supported in this state.
     */
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\nH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingState$PluginInTestModeWithLiveStripeAccount;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingState;", "preferredPlugin", "Lcom/woocommerce/android/ui/cardreader/onboarding/PluginType;", "(Lcom/woocommerce/android/ui/cardreader/onboarding/PluginType;)V", "getPreferredPlugin", "()Lcom/woocommerce/android/ui/cardreader/onboarding/PluginType;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class PluginInTestModeWithLiveStripeAccount extends com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState {
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.ui.cardreader.onboarding.PluginType preferredPlugin = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.PluginInTestModeWithLiveStripeAccount> CREATOR = null;
        
        /**
         * This is a bit special case: WCPay is set to "dev mode" but the connected Stripe account is in live mode.
         * Connecting to a reader or accepting payments is not supported in this state.
         */
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.PluginInTestModeWithLiveStripeAccount copy(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.cardreader.onboarding.PluginType preferredPlugin) {
            return null;
        }
        
        /**
         * This is a bit special case: WCPay is set to "dev mode" but the connected Stripe account is in live mode.
         * Connecting to a reader or accepting payments is not supported in this state.
         */
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        /**
         * This is a bit special case: WCPay is set to "dev mode" but the connected Stripe account is in live mode.
         * Connecting to a reader or accepting payments is not supported in this state.
         */
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        /**
         * This is a bit special case: WCPay is set to "dev mode" but the connected Stripe account is in live mode.
         * Connecting to a reader or accepting payments is not supported in this state.
         */
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public PluginInTestModeWithLiveStripeAccount(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.cardreader.onboarding.PluginType preferredPlugin) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.cardreader.onboarding.PluginType component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public com.woocommerce.android.ui.cardreader.onboarding.PluginType getPreferredPlugin() {
            return null;
        }
        
        @java.lang.Override
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override
        public void writeToParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.PluginInTestModeWithLiveStripeAccount> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.PluginInTestModeWithLiveStripeAccount createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.PluginInTestModeWithLiveStripeAccount[] newArray(int size) {
                return null;
            }
        }
    }
    
    /**
     * The connected Stripe account has not been reviewed by Stripe yet. This is a temporary state and
     * the user needs to wait.
     */
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\nH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingState$StripeAccountUnderReview;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingState;", "preferredPlugin", "Lcom/woocommerce/android/ui/cardreader/onboarding/PluginType;", "(Lcom/woocommerce/android/ui/cardreader/onboarding/PluginType;)V", "getPreferredPlugin", "()Lcom/woocommerce/android/ui/cardreader/onboarding/PluginType;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class StripeAccountUnderReview extends com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState {
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.ui.cardreader.onboarding.PluginType preferredPlugin = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.StripeAccountUnderReview> CREATOR = null;
        
        /**
         * The connected Stripe account has not been reviewed by Stripe yet. This is a temporary state and
         * the user needs to wait.
         */
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.StripeAccountUnderReview copy(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.cardreader.onboarding.PluginType preferredPlugin) {
            return null;
        }
        
        /**
         * The connected Stripe account has not been reviewed by Stripe yet. This is a temporary state and
         * the user needs to wait.
         */
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        /**
         * The connected Stripe account has not been reviewed by Stripe yet. This is a temporary state and
         * the user needs to wait.
         */
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        /**
         * The connected Stripe account has not been reviewed by Stripe yet. This is a temporary state and
         * the user needs to wait.
         */
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public StripeAccountUnderReview(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.cardreader.onboarding.PluginType preferredPlugin) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.cardreader.onboarding.PluginType component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public com.woocommerce.android.ui.cardreader.onboarding.PluginType getPreferredPlugin() {
            return null;
        }
        
        @java.lang.Override
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override
        public void writeToParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.StripeAccountUnderReview> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.StripeAccountUnderReview createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.StripeAccountUnderReview[] newArray(int size) {
                return null;
            }
        }
    }
    
    /**
     * There are some pending requirements on the connected Stripe account. The merchant still has some time before the
     * deadline to fix them expires. In-Person Payments should work without issues. We pass along a PluginType for which
     * the Stripe account requirement is pending
     */
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0007H\u00c6\u0003J:\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0017J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019H\u00d6\u0001R\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000b\u00a8\u0006%"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingState$StripeAccountPendingRequirement;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingState;", "dueDate", "", "preferredPlugin", "Lcom/woocommerce/android/ui/cardreader/onboarding/PluginType;", "version", "", "countryCode", "(Ljava/lang/Long;Lcom/woocommerce/android/ui/cardreader/onboarding/PluginType;Ljava/lang/String;Ljava/lang/String;)V", "getCountryCode", "()Ljava/lang/String;", "getDueDate", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPreferredPlugin", "()Lcom/woocommerce/android/ui/cardreader/onboarding/PluginType;", "getVersion", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Long;Lcom/woocommerce/android/ui/cardreader/onboarding/PluginType;Ljava/lang/String;Ljava/lang/String;)Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingState$StripeAccountPendingRequirement;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class StripeAccountPendingRequirement extends com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState {
        @org.jetbrains.annotations.Nullable
        private final java.lang.Long dueDate = null;
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.ui.cardreader.onboarding.PluginType preferredPlugin = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String version = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String countryCode = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.StripeAccountPendingRequirement> CREATOR = null;
        
        /**
         * There are some pending requirements on the connected Stripe account. The merchant still has some time before the
         * deadline to fix them expires. In-Person Payments should work without issues. We pass along a PluginType for which
         * the Stripe account requirement is pending
         */
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.StripeAccountPendingRequirement copy(@org.jetbrains.annotations.Nullable
        java.lang.Long dueDate, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.cardreader.onboarding.PluginType preferredPlugin, @org.jetbrains.annotations.Nullable
        java.lang.String version, @org.jetbrains.annotations.NotNull
        java.lang.String countryCode) {
            return null;
        }
        
        /**
         * There are some pending requirements on the connected Stripe account. The merchant still has some time before the
         * deadline to fix them expires. In-Person Payments should work without issues. We pass along a PluginType for which
         * the Stripe account requirement is pending
         */
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        /**
         * There are some pending requirements on the connected Stripe account. The merchant still has some time before the
         * deadline to fix them expires. In-Person Payments should work without issues. We pass along a PluginType for which
         * the Stripe account requirement is pending
         */
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        /**
         * There are some pending requirements on the connected Stripe account. The merchant still has some time before the
         * deadline to fix them expires. In-Person Payments should work without issues. We pass along a PluginType for which
         * the Stripe account requirement is pending
         */
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public StripeAccountPendingRequirement(@org.jetbrains.annotations.Nullable
        java.lang.Long dueDate, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.cardreader.onboarding.PluginType preferredPlugin, @org.jetbrains.annotations.Nullable
        java.lang.String version, @org.jetbrains.annotations.NotNull
        java.lang.String countryCode) {
            super(null);
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Long component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Long getDueDate() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.cardreader.onboarding.PluginType component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public com.woocommerce.android.ui.cardreader.onboarding.PluginType getPreferredPlugin() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getVersion() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getCountryCode() {
            return null;
        }
        
        @java.lang.Override
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override
        public void writeToParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.StripeAccountPendingRequirement> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.StripeAccountPendingRequirement createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.StripeAccountPendingRequirement[] newArray(int size) {
                return null;
            }
        }
    }
    
    /**
     * There are some overdue requirements on the connected Stripe account. Connecting to a reader or accepting
     * payments is not supported in this state.
     */
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\nH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingState$StripeAccountOverdueRequirement;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingState;", "preferredPlugin", "Lcom/woocommerce/android/ui/cardreader/onboarding/PluginType;", "(Lcom/woocommerce/android/ui/cardreader/onboarding/PluginType;)V", "getPreferredPlugin", "()Lcom/woocommerce/android/ui/cardreader/onboarding/PluginType;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class StripeAccountOverdueRequirement extends com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState {
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.ui.cardreader.onboarding.PluginType preferredPlugin = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.StripeAccountOverdueRequirement> CREATOR = null;
        
        /**
         * There are some overdue requirements on the connected Stripe account. Connecting to a reader or accepting
         * payments is not supported in this state.
         */
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.StripeAccountOverdueRequirement copy(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.cardreader.onboarding.PluginType preferredPlugin) {
            return null;
        }
        
        /**
         * There are some overdue requirements on the connected Stripe account. Connecting to a reader or accepting
         * payments is not supported in this state.
         */
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        /**
         * There are some overdue requirements on the connected Stripe account. Connecting to a reader or accepting
         * payments is not supported in this state.
         */
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        /**
         * There are some overdue requirements on the connected Stripe account. Connecting to a reader or accepting
         * payments is not supported in this state.
         */
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public StripeAccountOverdueRequirement(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.cardreader.onboarding.PluginType preferredPlugin) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.cardreader.onboarding.PluginType component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public com.woocommerce.android.ui.cardreader.onboarding.PluginType getPreferredPlugin() {
            return null;
        }
        
        @java.lang.Override
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override
        public void writeToParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.StripeAccountOverdueRequirement> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.StripeAccountOverdueRequirement createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.StripeAccountOverdueRequirement[] newArray(int size) {
                return null;
            }
        }
    }
    
    /**
     * The Stripe account was rejected by Stripe. This can happen for example when the account is flagged as fraudulent
     * or the merchant violates the terms of service
     */
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\nH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingState$StripeAccountRejected;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingState;", "preferredPlugin", "Lcom/woocommerce/android/ui/cardreader/onboarding/PluginType;", "(Lcom/woocommerce/android/ui/cardreader/onboarding/PluginType;)V", "getPreferredPlugin", "()Lcom/woocommerce/android/ui/cardreader/onboarding/PluginType;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class StripeAccountRejected extends com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState {
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.ui.cardreader.onboarding.PluginType preferredPlugin = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.StripeAccountRejected> CREATOR = null;
        
        /**
         * The Stripe account was rejected by Stripe. This can happen for example when the account is flagged as fraudulent
         * or the merchant violates the terms of service
         */
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.StripeAccountRejected copy(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.cardreader.onboarding.PluginType preferredPlugin) {
            return null;
        }
        
        /**
         * The Stripe account was rejected by Stripe. This can happen for example when the account is flagged as fraudulent
         * or the merchant violates the terms of service
         */
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        /**
         * The Stripe account was rejected by Stripe. This can happen for example when the account is flagged as fraudulent
         * or the merchant violates the terms of service
         */
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        /**
         * The Stripe account was rejected by Stripe. This can happen for example when the account is flagged as fraudulent
         * or the merchant violates the terms of service
         */
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public StripeAccountRejected(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.cardreader.onboarding.PluginType preferredPlugin) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.cardreader.onboarding.PluginType component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public com.woocommerce.android.ui.cardreader.onboarding.PluginType getPreferredPlugin() {
            return null;
        }
        
        @java.lang.Override
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override
        public void writeToParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.StripeAccountRejected> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.StripeAccountRejected createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.StripeAccountRejected[] newArray(int size) {
                return null;
            }
        }
    }
    
    /**
     * The Stripe account is attached to an address in one of the unsupported countries.
     */
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fH\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001b"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingState$StripeAccountCountryNotSupported;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingState;", "preferredPlugin", "Lcom/woocommerce/android/ui/cardreader/onboarding/PluginType;", "countryCode", "", "(Lcom/woocommerce/android/ui/cardreader/onboarding/PluginType;Ljava/lang/String;)V", "getCountryCode", "()Ljava/lang/String;", "getPreferredPlugin", "()Lcom/woocommerce/android/ui/cardreader/onboarding/PluginType;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class StripeAccountCountryNotSupported extends com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState {
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.ui.cardreader.onboarding.PluginType preferredPlugin = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String countryCode = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.StripeAccountCountryNotSupported> CREATOR = null;
        
        /**
         * The Stripe account is attached to an address in one of the unsupported countries.
         */
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.StripeAccountCountryNotSupported copy(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.cardreader.onboarding.PluginType preferredPlugin, @org.jetbrains.annotations.Nullable
        java.lang.String countryCode) {
            return null;
        }
        
        /**
         * The Stripe account is attached to an address in one of the unsupported countries.
         */
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        /**
         * The Stripe account is attached to an address in one of the unsupported countries.
         */
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        /**
         * The Stripe account is attached to an address in one of the unsupported countries.
         */
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public StripeAccountCountryNotSupported(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.cardreader.onboarding.PluginType preferredPlugin, @org.jetbrains.annotations.Nullable
        java.lang.String countryCode) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.cardreader.onboarding.PluginType component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public com.woocommerce.android.ui.cardreader.onboarding.PluginType getPreferredPlugin() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getCountryCode() {
            return null;
        }
        
        @java.lang.Override
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override
        public void writeToParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.StripeAccountCountryNotSupported> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.StripeAccountCountryNotSupported createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.StripeAccountCountryNotSupported[] newArray(int size) {
                return null;
            }
        }
    }
    
    /**
     * Generic error - for example, one of the requests failed.
     */
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u00d6\u0001\u00a8\u0006\n"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingState$GenericError;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingState;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class GenericError extends com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState {
        @org.jetbrains.annotations.NotNull
        public static final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.GenericError INSTANCE = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.GenericError> CREATOR = null;
        
        private GenericError() {
            super(null);
        }
        
        @java.lang.Override
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override
        public void writeToParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.GenericError> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.GenericError createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.GenericError[] newArray(int size) {
                return null;
            }
        }
    }
    
    /**
     * Internet connection is not available.
     */
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u00d6\u0001\u00a8\u0006\n"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingState$NoConnectionError;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingState;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class NoConnectionError extends com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState {
        @org.jetbrains.annotations.NotNull
        public static final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.NoConnectionError INSTANCE = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.NoConnectionError> CREATOR = null;
        
        private NoConnectionError() {
            super(null);
        }
        
        @java.lang.Override
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override
        public void writeToParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.NoConnectionError> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.NoConnectionError createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState.NoConnectionError[] newArray(int size) {
                return null;
            }
        }
    }
}