package com.woocommerce.android.helpers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0017R\u001a\u0010\u0003\u001a\u00020\u0004X\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/woocommerce/android/helpers/TestBase;", "Lcom/woocommerce/android/SensorConditionsTest;", "()V", "appContext", "Landroid/app/Application;", "getAppContext", "()Landroid/app/Application;", "setAppContext", "(Landroid/app/Application;)V", "wireMockRule", "Lcom/github/tomakehurst/wiremock/junit/WireMockRule;", "setup", "", "Companion", "WooCommerce_vanillaDebug"})
public class TestBase extends com.woocommerce.android.SensorConditionsTest {
    protected android.app.Application appContext;
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.helpers.TestBase.Companion Companion = null;
    private static final int wireMockPort = 8080;
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmField()
    @org.junit.Rule()
    public final com.github.tomakehurst.wiremock.junit.WireMockRule wireMockRule = null;
    
    public TestBase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final android.app.Application getAppContext() {
        return null;
    }
    
    protected final void setAppContext(@org.jetbrains.annotations.NotNull()
    android.app.Application p0) {
    }
    
    @org.junit.Before()
    public void setup() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/helpers/TestBase$Companion;", "", "()V", "wireMockPort", "", "getWireMockPort", "()I", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final int getWireMockPort() {
            return 0;
        }
    }
}