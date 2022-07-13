package com.woocommerce.android.ui.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J0\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\f\u001a\u00020\u0003H&\u00a8\u0006\r"}, d2 = {"Lcom/woocommerce/android/ui/login/LoginNoJetpackListener;", "", "showEmailLoginScreen", "", "siteAddress", "", "showJetpackInstructions", "showJetpackTroubleshootingTips", "showUsernamePasswordScreen", "endpointAddress", "inputUsername", "inputPassword", "showWhatIsJetpackDialog", "WooCommerce_wasabiDebug"})
public abstract interface LoginNoJetpackListener {
    
    public abstract void showJetpackInstructions();
    
    public abstract void showJetpackTroubleshootingTips();
    
    public abstract void showWhatIsJetpackDialog();
    
    public abstract void showEmailLoginScreen(@org.jetbrains.annotations.Nullable
    java.lang.String siteAddress);
    
    public abstract void showUsernamePasswordScreen(@org.jetbrains.annotations.Nullable
    java.lang.String siteAddress, @org.jetbrains.annotations.Nullable
    java.lang.String endpointAddress, @org.jetbrains.annotations.Nullable
    java.lang.String inputUsername, @org.jetbrains.annotations.Nullable
    java.lang.String inputPassword);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
    }
}