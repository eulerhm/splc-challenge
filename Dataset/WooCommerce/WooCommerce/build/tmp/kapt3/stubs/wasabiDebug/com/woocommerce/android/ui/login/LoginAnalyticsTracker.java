package com.woocommerce.android.ui.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b=\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0010H\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0016J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J0\u0010\u0018\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001aH\u0016J\u0012\u0010\u001e\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u001a\u0010\u001f\u001a\u00020\u00102\u0010\u0010 \u001a\f\u0012\u0004\u0012\u00020\u001a\u0012\u0002\b\u00030!H\u0016J\b\u0010\"\u001a\u00020\u0010H\u0016J$\u0010#\u001a\u00020\u00102\b\u0010$\u001a\u0004\u0018\u00010\u001a2\b\u0010%\u001a\u0004\u0018\u00010\u001a2\u0006\u0010&\u001a\u00020\'H\u0016J\b\u0010(\u001a\u00020\u0010H\u0016J\b\u0010)\u001a\u00020\u0010H\u0016J\u0012\u0010*\u001a\u00020\u00102\b\u0010+\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010,\u001a\u00020\u0010H\u0016J\b\u0010-\u001a\u00020\u0010H\u0016J\b\u0010.\u001a\u00020\u0010H\u0016J\b\u0010/\u001a\u00020\u0010H\u0016J&\u00100\u001a\u00020\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u00101\u001a\u00020\u0010H\u0016J\b\u00102\u001a\u00020\u0010H\u0016J\b\u00103\u001a\u00020\u0010H\u0016J\b\u00104\u001a\u00020\u0010H\u0016J\b\u00105\u001a\u00020\u0010H\u0016J\b\u00106\u001a\u00020\u0010H\u0016J\b\u00107\u001a\u00020\u0010H\u0016J\b\u00108\u001a\u00020\u0010H\u0016J\b\u00109\u001a\u00020\u0010H\u0016J\u001a\u0010:\u001a\u00020\u00102\u0010\u0010 \u001a\f\u0012\u0004\u0012\u00020\u001a\u0012\u0002\b\u00030!H\u0016J\b\u0010;\u001a\u00020\u0010H\u0016J\b\u0010<\u001a\u00020\u0010H\u0016J\u0010\u0010=\u001a\u00020\u00102\u0006\u0010>\u001a\u00020\u0017H\u0016J\b\u0010?\u001a\u00020\u0010H\u0016J\b\u0010@\u001a\u00020\u0010H\u0016J\b\u0010A\u001a\u00020\u0010H\u0016J\b\u0010B\u001a\u00020\u0010H\u0016J\b\u0010C\u001a\u00020\u0010H\u0016J\b\u0010D\u001a\u00020\u0010H\u0016J\b\u0010E\u001a\u00020\u0010H\u0016J\b\u0010F\u001a\u00020\u0010H\u0016J\b\u0010G\u001a\u00020\u0010H\u0016J\b\u0010H\u001a\u00020\u0010H\u0016J\b\u0010I\u001a\u00020\u0010H\u0016J\b\u0010J\u001a\u00020\u0010H\u0016J\b\u0010K\u001a\u00020\u0010H\u0016J\b\u0010L\u001a\u00020\u0010H\u0016J\b\u0010M\u001a\u00020\u0010H\u0016J\b\u0010N\u001a\u00020\u0010H\u0016J\b\u0010O\u001a\u00020\u0010H\u0016J\b\u0010P\u001a\u00020\u0010H\u0016J\b\u0010Q\u001a\u00020\u0010H\u0016J\b\u0010R\u001a\u00020\u0010H\u0016J\b\u0010S\u001a\u00020\u0010H\u0016J\b\u0010T\u001a\u00020\u0010H\u0016J\b\u0010U\u001a\u00020\u0010H\u0016J\b\u0010V\u001a\u00020\u0010H\u0016J\b\u0010W\u001a\u00020\u0010H\u0016J\b\u0010X\u001a\u00020\u0010H\u0016J\b\u0010Y\u001a\u00020\u0010H\u0016J&\u0010Z\u001a\u00020\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010[\u001a\u00020\u0010H\u0016J\b\u0010\\\u001a\u00020\u0010H\u0016J\b\u0010]\u001a\u00020\u0010H\u0016J\b\u0010^\u001a\u00020\u0010H\u0016J\b\u0010_\u001a\u00020\u0010H\u0016J\b\u0010`\u001a\u00020\u0010H\u0016J\b\u0010a\u001a\u00020\u0010H\u0016J\u001a\u0010b\u001a\u00020\u00102\u0010\u0010 \u001a\f\u0012\u0004\u0012\u00020\u001a\u0012\u0002\b\u00030!H\u0016J\b\u0010c\u001a\u00020\u0010H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006d"}, d2 = {"Lcom/woocommerce/android/ui/login/LoginAnalyticsTracker;", "Lorg/wordpress/android/login/LoginAnalyticsListener;", "accountStore", "Lorg/wordpress/android/fluxc/store/AccountStore;", "siteStore", "Lorg/wordpress/android/fluxc/store/SiteStore;", "unifiedLoginTracker", "Lcom/woocommerce/android/ui/login/UnifiedLoginTracker;", "(Lorg/wordpress/android/fluxc/store/AccountStore;Lorg/wordpress/android/fluxc/store/SiteStore;Lcom/woocommerce/android/ui/login/UnifiedLoginTracker;)V", "getAccountStore", "()Lorg/wordpress/android/fluxc/store/AccountStore;", "getSiteStore", "()Lorg/wordpress/android/fluxc/store/SiteStore;", "getUnifiedLoginTracker", "()Lcom/woocommerce/android/ui/login/UnifiedLoginTracker;", "emailFormScreenResumed", "", "emailPasswordFormScreenResumed", "magicLinkRequestScreenResumed", "magicLinkSentScreenResumed", "siteAddressFormScreenResumed", "trackAnalyticsSignIn", "isWpcomLogin", "", "trackConnectedSiteInfoFailed", "url", "", "errorContext", "errorType", "errorDescription", "trackConnectedSiteInfoRequested", "trackConnectedSiteInfoSucceeded", "properties", "", "trackCreateAccountClick", "trackCreatedAccount", "username", "email", "source", "Lorg/wordpress/android/login/LoginAnalyticsListener$CreatedAccountSource;", "trackDismissDialog", "trackEmailFormViewed", "trackFailure", "message", "trackInsertedInvalidUrl", "trackLoginAccessed", "trackLoginAutofillCredentialsFilled", "trackLoginAutofillCredentialsUpdated", "trackLoginFailed", "trackLoginForgotPasswordClicked", "trackLoginMagicLinkExited", "trackLoginMagicLinkOpenEmailClientClicked", "trackLoginMagicLinkOpenEmailClientViewed", "trackLoginMagicLinkOpened", "trackLoginMagicLinkSucceeded", "trackLoginSocial2faNeeded", "trackLoginSocialSuccess", "trackLoginWithPasswordClick", "trackMagicLinkFailed", "trackMagicLinkRequestFormViewed", "trackMagicLinkRequested", "trackPasswordFormViewed", "isSocialChallenge", "trackPickEmailFromHint", "trackRequestMagicLinkClick", "trackSelectEmailField", "trackSendCodeWithTextClicked", "trackShowEmailHints", "trackShowHelpClick", "trackSignupCanceled", "trackSignupEmailButtonTapped", "trackSignupEmailToLogin", "trackSignupGoogleButtonTapped", "trackSignupMagicLinkFailed", "trackSignupMagicLinkOpenEmailClientClicked", "trackSignupMagicLinkOpenEmailClientViewed", "trackSignupMagicLinkOpened", "trackSignupMagicLinkSent", "trackSignupMagicLinkSucceeded", "trackSignupSocialAccountsNeedConnecting", "trackSignupSocialButtonFailure", "trackSignupSocialToLogin", "trackSignupTermsOfServiceTapped", "trackSocialAccountsNeedConnecting", "trackSocialButtonClick", "trackSocialButtonFailure", "trackSocialButtonStart", "trackSocialConnectFailure", "trackSocialConnectSuccess", "trackSocialErrorUnknownUser", "trackSocialFailure", "trackSocialSignupConfirmationViewed", "trackSubmit2faCodeClicked", "trackSubmitClicked", "trackTwoFactorFormViewed", "trackUrlFormViewed", "trackUrlHelpScreenViewed", "trackUsernamePasswordFormViewed", "trackWpComBackgroundServiceUpdate", "usernamePasswordScreenResumed", "WooCommerce_wasabiDebug"})
@javax.inject.Singleton
public final class LoginAnalyticsTracker implements org.wordpress.android.login.LoginAnalyticsListener {
    @org.jetbrains.annotations.NotNull
    private final org.wordpress.android.fluxc.store.AccountStore accountStore = null;
    @org.jetbrains.annotations.NotNull
    private final org.wordpress.android.fluxc.store.SiteStore siteStore = null;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.ui.login.UnifiedLoginTracker unifiedLoginTracker = null;
    
    public LoginAnalyticsTracker(@org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.AccountStore accountStore, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.SiteStore siteStore, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.login.UnifiedLoginTracker unifiedLoginTracker) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.wordpress.android.fluxc.store.AccountStore getAccountStore() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.wordpress.android.fluxc.store.SiteStore getSiteStore() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.ui.login.UnifiedLoginTracker getUnifiedLoginTracker() {
        return null;
    }
    
    @java.lang.Override
    public void trackAnalyticsSignIn(boolean isWpcomLogin) {
    }
    
    @java.lang.Override
    public void trackCreatedAccount(@org.jetbrains.annotations.Nullable
    java.lang.String username, @org.jetbrains.annotations.Nullable
    java.lang.String email, @org.jetbrains.annotations.NotNull
    org.wordpress.android.login.LoginAnalyticsListener.CreatedAccountSource source) {
    }
    
    @java.lang.Override
    public void trackEmailFormViewed() {
    }
    
    @java.lang.Override
    public void trackInsertedInvalidUrl() {
    }
    
    @java.lang.Override
    public void trackLoginAccessed() {
    }
    
    @java.lang.Override
    public void trackLoginAutofillCredentialsFilled() {
    }
    
    @java.lang.Override
    public void trackLoginAutofillCredentialsUpdated() {
    }
    
    @java.lang.Override
    public void trackLoginFailed(@org.jetbrains.annotations.Nullable
    java.lang.String errorContext, @org.jetbrains.annotations.Nullable
    java.lang.String errorType, @org.jetbrains.annotations.Nullable
    java.lang.String errorDescription) {
    }
    
    @java.lang.Override
    public void trackLoginForgotPasswordClicked() {
    }
    
    @java.lang.Override
    public void trackLoginMagicLinkExited() {
    }
    
    @java.lang.Override
    public void trackLoginMagicLinkOpened() {
    }
    
    @java.lang.Override
    public void trackLoginMagicLinkOpenEmailClientClicked() {
    }
    
    @java.lang.Override
    public void trackLoginMagicLinkSucceeded() {
    }
    
    @java.lang.Override
    public void trackLoginSocial2faNeeded() {
    }
    
    @java.lang.Override
    public void trackLoginSocialSuccess() {
    }
    
    @java.lang.Override
    public void trackMagicLinkFailed(@org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.String, ?> properties) {
    }
    
    @java.lang.Override
    public void trackMagicLinkRequested() {
    }
    
    @java.lang.Override
    public void trackMagicLinkRequestFormViewed() {
    }
    
    @java.lang.Override
    public void trackPasswordFormViewed(boolean isSocialChallenge) {
    }
    
    @java.lang.Override
    public void trackSignupCanceled() {
    }
    
    @java.lang.Override
    public void trackSignupEmailButtonTapped() {
    }
    
    @java.lang.Override
    public void trackSignupEmailToLogin() {
    }
    
    @java.lang.Override
    public void trackSignupGoogleButtonTapped() {
    }
    
    @java.lang.Override
    public void trackSignupMagicLinkFailed() {
    }
    
    @java.lang.Override
    public void trackSignupMagicLinkOpened() {
    }
    
    @java.lang.Override
    public void trackSignupMagicLinkOpenEmailClientClicked() {
    }
    
    @java.lang.Override
    public void trackSignupMagicLinkSent() {
    }
    
    @java.lang.Override
    public void trackSignupMagicLinkSucceeded() {
    }
    
    @java.lang.Override
    public void trackSignupSocialAccountsNeedConnecting() {
    }
    
    @java.lang.Override
    public void trackSignupSocialButtonFailure() {
    }
    
    @java.lang.Override
    public void trackSignupSocialToLogin() {
    }
    
    @java.lang.Override
    public void trackSignupTermsOfServiceTapped() {
    }
    
    @java.lang.Override
    public void trackSocialAccountsNeedConnecting() {
    }
    
    @java.lang.Override
    public void trackSocialButtonClick() {
    }
    
    @java.lang.Override
    public void trackSocialButtonFailure() {
    }
    
    @java.lang.Override
    public void trackSocialConnectFailure() {
    }
    
    @java.lang.Override
    public void trackSocialConnectSuccess() {
    }
    
    @java.lang.Override
    public void trackSocialErrorUnknownUser() {
    }
    
    @java.lang.Override
    public void trackSocialFailure(@org.jetbrains.annotations.Nullable
    java.lang.String errorContext, @org.jetbrains.annotations.Nullable
    java.lang.String errorType, @org.jetbrains.annotations.Nullable
    java.lang.String errorDescription) {
    }
    
    @java.lang.Override
    public void trackTwoFactorFormViewed() {
    }
    
    @java.lang.Override
    public void trackUrlFormViewed() {
    }
    
    @java.lang.Override
    public void trackUrlHelpScreenViewed() {
    }
    
    @java.lang.Override
    public void trackUsernamePasswordFormViewed() {
    }
    
    @java.lang.Override
    public void trackWpComBackgroundServiceUpdate(@org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.String, ?> properties) {
    }
    
    @java.lang.Override
    public void trackConnectedSiteInfoRequested(@org.jetbrains.annotations.Nullable
    java.lang.String url) {
    }
    
    @java.lang.Override
    public void trackConnectedSiteInfoFailed(@org.jetbrains.annotations.Nullable
    java.lang.String url, @org.jetbrains.annotations.Nullable
    java.lang.String errorContext, @org.jetbrains.annotations.Nullable
    java.lang.String errorType, @org.jetbrains.annotations.Nullable
    java.lang.String errorDescription) {
    }
    
    @java.lang.Override
    public void trackConnectedSiteInfoSucceeded(@org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.String, ?> properties) {
    }
    
    @java.lang.Override
    public void trackSignupMagicLinkOpenEmailClientViewed() {
    }
    
    @java.lang.Override
    public void trackLoginMagicLinkOpenEmailClientViewed() {
    }
    
    @java.lang.Override
    public void trackSocialButtonStart() {
    }
    
    @java.lang.Override
    public void trackFailure(@org.jetbrains.annotations.Nullable
    java.lang.String message) {
    }
    
    @java.lang.Override
    public void trackSendCodeWithTextClicked() {
    }
    
    @java.lang.Override
    public void trackSubmit2faCodeClicked() {
    }
    
    @java.lang.Override
    public void trackSubmitClicked() {
    }
    
    @java.lang.Override
    public void trackRequestMagicLinkClick() {
    }
    
    @java.lang.Override
    public void trackLoginWithPasswordClick() {
    }
    
    @java.lang.Override
    public void trackShowHelpClick() {
    }
    
    @java.lang.Override
    public void trackDismissDialog() {
    }
    
    @java.lang.Override
    public void trackSelectEmailField() {
    }
    
    @java.lang.Override
    public void trackPickEmailFromHint() {
    }
    
    @java.lang.Override
    public void trackShowEmailHints() {
    }
    
    @java.lang.Override
    public void emailFormScreenResumed() {
    }
    
    @java.lang.Override
    public void trackSocialSignupConfirmationViewed() {
    }
    
    @java.lang.Override
    public void trackCreateAccountClick() {
    }
    
    @java.lang.Override
    public void emailPasswordFormScreenResumed() {
    }
    
    @java.lang.Override
    public void siteAddressFormScreenResumed() {
    }
    
    @java.lang.Override
    public void magicLinkRequestScreenResumed() {
    }
    
    @java.lang.Override
    public void magicLinkSentScreenResumed() {
    }
    
    @java.lang.Override
    public void usernamePasswordScreenResumed() {
    }
}