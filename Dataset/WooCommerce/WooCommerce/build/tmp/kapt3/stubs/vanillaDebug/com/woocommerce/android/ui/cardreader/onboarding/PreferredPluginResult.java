package com.woocommerce.android.ui.cardreader.onboarding;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/PreferredPluginResult;", "", "()V", "Error", "Success", "Lcom/woocommerce/android/ui/cardreader/onboarding/PreferredPluginResult$Success;", "Lcom/woocommerce/android/ui/cardreader/onboarding/PreferredPluginResult$Error;", "WooCommerce_vanillaDebug"})
public abstract class PreferredPluginResult {
    
    private PreferredPluginResult() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/PreferredPluginResult$Success;", "Lcom/woocommerce/android/ui/cardreader/onboarding/PreferredPluginResult;", "type", "Lcom/woocommerce/android/ui/cardreader/onboarding/PluginType;", "(Lcom/woocommerce/android/ui/cardreader/onboarding/PluginType;)V", "getType", "()Lcom/woocommerce/android/ui/cardreader/onboarding/PluginType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class Success extends com.woocommerce.android.ui.cardreader.onboarding.PreferredPluginResult {
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.ui.cardreader.onboarding.PluginType type = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.cardreader.onboarding.PreferredPluginResult.Success copy(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.cardreader.onboarding.PluginType type) {
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
        
        public Success(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.cardreader.onboarding.PluginType type) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.cardreader.onboarding.PluginType component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.cardreader.onboarding.PluginType getType() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/PreferredPluginResult$Error;", "Lcom/woocommerce/android/ui/cardreader/onboarding/PreferredPluginResult;", "()V", "WooCommerce_vanillaDebug"})
    public static final class Error extends com.woocommerce.android.ui.cardreader.onboarding.PreferredPluginResult {
        @org.jetbrains.annotations.NotNull()
        public static final com.woocommerce.android.ui.cardreader.onboarding.PreferredPluginResult.Error INSTANCE = null;
        
        private Error() {
            super();
        }
    }
}