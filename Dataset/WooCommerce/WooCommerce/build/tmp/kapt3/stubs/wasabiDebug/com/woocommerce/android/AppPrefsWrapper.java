package com.woocommerce.android;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J \u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010J(\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\fJ \u0010\u0015\u001a\u0004\u0018\u00010\u00132\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0016\u001a\u00020\u0013J\u0006\u0010\u0017\u001a\u00020\u0010J\b\u0010\u0018\u001a\u0004\u0018\u00010\u0013J\b\u0010\u0019\u001a\u0004\u0018\u00010\u0013J\u001a\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u001b2\u0006\u0010\u001c\u001a\u00020\u000eJ\u0016\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u0013J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u00132\u0006\u0010 \u001a\u00020\u000eJ&\u0010!\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0010J\b\u0010#\u001a\u0004\u0018\u00010\u0013J\u000e\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u000eJ\u001e\u0010&\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\'\u001a\u00020\u0004J\u0006\u0010(\u001a\u00020\u0004J\u0006\u0010)\u001a\u00020\u0004J\u0006\u0010*\u001a\u00020\u0004J\u0006\u0010+\u001a\u00020\u0004J\f\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-J\u0006\u0010/\u001a\u00020.J\u0006\u00100\u001a\u00020.J\u0006\u00101\u001a\u00020.J&\u00102\u001a\u00020.2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u00103\u001a\u000204J(\u00105\u001a\u00020.2\b\u00106\u001a\u0004\u0018\u00010\u00132\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u00107\u001a\u00020.J\u000e\u00108\u001a\u00020.2\u0006\u00109\u001a\u00020\u0013J\u000e\u0010:\u001a\u00020.2\u0006\u0010;\u001a\u00020\u0013J\u001e\u0010<\u001a\u00020.2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010=\u001a\u00020\u00102\u0006\u0010>\u001a\u00020\u0010J\u001e\u0010?\u001a\u00020.2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010@\u001a\u00020\u0013J\u0016\u0010A\u001a\u00020.2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010B\u001a\u00020\u0013J.\u0010C\u001a\u00020.2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010D\u001a\u00020\u0013J\u000e\u0010E\u001a\u00020.2\u0006\u0010F\u001a\u00020\u0004J\u0016\u0010G\u001a\u00020.2\u0006\u0010H\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u000eR+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006I"}, d2 = {"Lcom/woocommerce/android/AppPrefsWrapper;", "", "()V", "<set-?>", "", "isCouponsEnabled", "()Z", "setCouponsEnabled", "(Z)V", "isCouponsEnabled$delegate", "Lkotlin/reflect/KMutableProperty0;", "getCardReaderPreferredPlugin", "Lcom/woocommerce/android/ui/cardreader/onboarding/PluginType;", "localSiteId", "", "remoteSiteId", "", "selfHostedSiteId", "getCardReaderPreferredPluginVersion", "", "preferredPlugin", "getCardReaderStatementDescriptor", "getFCMToken", "getJetpackBenefitsDismissalDate", "getLastConnectedCardReaderId", "getLoginSiteAddress", "getOrderFilterCustomDateRange", "Lkotlin/Pair;", "selectedSiteId", "getOrderFilters", "filterCategory", "getProductSortingChoice", "siteId", "getReceiptUrl", "orderId", "getUnifiedLoginLastSource", "getWcShippingBannerDismissed", "currentSiteId", "isCardReaderOnboardingCompleted", "isCardReaderWelcomeDialogShown", "isOrderNotificationsChaChingEnabled", "isOrderNotificationsEnabled", "isReviewNotificationsEnabled", "isUserEligible", "observePrefs", "Lkotlinx/coroutines/flow/Flow;", "", "recordJetpackBenefitsDismissal", "removeLastConnectedCardReaderId", "removeLoginSiteAddress", "setCardReaderOnboardingData", "data", "Lcom/woocommerce/android/ui/cardreader/onboarding/PersistentOnboardingData;", "setCardReaderStatementDescriptor", "statementDescriptor", "setCardReaderWelcomeDialogShown", "setFCMToken", "token", "setLastConnectedCardReaderId", "readerId", "setOrderFilterCustomDateRange", "startDateMillis", "endDateMillis", "setOrderFilters", "filterValue", "setProductSortingChoice", "value", "setReceiptUrl", "url", "setV4StatsSupported", "supported", "setWcShippingBannerDismissed", "dismissed", "WooCommerce_wasabiDebug"})
public final class AppPrefsWrapper {
    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.KMutableProperty0 isCouponsEnabled$delegate = null;
    
    @javax.inject.Inject
    public AppPrefsWrapper() {
        super();
    }
    
    public final boolean isCouponsEnabled() {
        return false;
    }
    
    public final void setCouponsEnabled(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getReceiptUrl(int localSiteId, long remoteSiteId, long selfHostedSiteId, long orderId) {
        return null;
    }
    
    public final void setReceiptUrl(int localSiteId, long remoteSiteId, long selfHostedSiteId, long orderId, @org.jetbrains.annotations.NotNull
    java.lang.String url) {
    }
    
    public final boolean isCardReaderOnboardingCompleted(int localSiteId, long remoteSiteId, long selfHostedSiteId) {
        return false;
    }
    
    public final boolean isCardReaderWelcomeDialogShown() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.woocommerce.android.ui.cardreader.onboarding.PluginType getCardReaderPreferredPlugin(int localSiteId, long remoteSiteId, long selfHostedSiteId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCardReaderPreferredPluginVersion(int localSiteId, long remoteSiteId, long selfHostedSiteId, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.cardreader.onboarding.PluginType preferredPlugin) {
        return null;
    }
    
    public final void setCardReaderOnboardingData(int localSiteId, long remoteSiteId, long selfHostedSiteId, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.cardreader.onboarding.PersistentOnboardingData data) {
    }
    
    public final void setCardReaderStatementDescriptor(@org.jetbrains.annotations.Nullable
    java.lang.String statementDescriptor, int localSiteId, long remoteSiteId, long selfHostedSiteId) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCardReaderStatementDescriptor(int localSiteId, long remoteSiteId, long selfHostedSiteId) {
        return null;
    }
    
    public final void setLastConnectedCardReaderId(@org.jetbrains.annotations.NotNull
    java.lang.String readerId) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLastConnectedCardReaderId() {
        return null;
    }
    
    public final void setCardReaderWelcomeDialogShown() {
    }
    
    public final void removeLastConnectedCardReaderId() {
    }
    
    public final boolean isOrderNotificationsEnabled() {
        return false;
    }
    
    public final boolean isReviewNotificationsEnabled() {
        return false;
    }
    
    public final boolean isOrderNotificationsChaChingEnabled() {
        return false;
    }
    
    public final long getJetpackBenefitsDismissalDate() {
        return 0L;
    }
    
    public final void recordJetpackBenefitsDismissal() {
    }
    
    public final void setOrderFilters(int selectedSiteId, @org.jetbrains.annotations.NotNull
    java.lang.String filterCategory, @org.jetbrains.annotations.NotNull
    java.lang.String filterValue) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getOrderFilters(int selectedSiteId, @org.jetbrains.annotations.NotNull
    java.lang.String filterCategory) {
        return null;
    }
    
    public final void setOrderFilterCustomDateRange(int selectedSiteId, long startDateMillis, long endDateMillis) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlin.Pair<java.lang.Long, java.lang.Long> getOrderFilterCustomDateRange(int selectedSiteId) {
        return null;
    }
    
    public final void setV4StatsSupported(boolean supported) {
    }
    
    public final boolean isUserEligible() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFCMToken() {
        return null;
    }
    
    public final void setFCMToken(@org.jetbrains.annotations.NotNull
    java.lang.String token) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getProductSortingChoice(int siteId) {
        return null;
    }
    
    public final void setProductSortingChoice(int siteId, @org.jetbrains.annotations.NotNull
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUnifiedLoginLastSource() {
        return null;
    }
    
    public final void removeLoginSiteAddress() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLoginSiteAddress() {
        return null;
    }
    
    public final void setWcShippingBannerDismissed(boolean dismissed, int currentSiteId) {
    }
    
    public final boolean getWcShippingBannerDismissed(int currentSiteId) {
        return false;
    }
    
    /**
     * Observes changes to the preferences
     */
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<kotlin.Unit> observePrefs() {
        return null;
    }
}