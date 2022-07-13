package com.woocommerce.android.ui.cardreader;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 M2\u00020\u0001:\u0001MB\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u001c\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000eH\u0002J\u001c\u0010\u0010\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000eH\u0002J\u001c\u0010\u0011\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000eH\u0002J\u001c\u0010\u0012\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000eH\u0002J\u001c\u0010\u0013\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000eH\u0002J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J>\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001c2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000e2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000fH\u0007J\u0006\u0010\u001f\u001a\u00020\fJ\u0006\u0010 \u001a\u00020\fJ\u0006\u0010!\u001a\u00020\fJ\u0006\u0010\"\u001a\u00020\fJ\u0006\u0010#\u001a\u00020\fJ\u0006\u0010$\u001a\u00020\fJ\u0006\u0010%\u001a\u00020\fJ\u0006\u0010&\u001a\u00020\fJ\u0010\u0010\'\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000fJ\u0006\u0010(\u001a\u00020\fJ \u0010)\u001a\u00020\f2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u000f2\b\b\u0002\u0010\u001d\u001a\u00020-J\u0006\u0010.\u001a\u00020\fJ\u0010\u0010/\u001a\u00020\f2\b\u00100\u001a\u0004\u0018\u00010\u000fJ\u0006\u00101\u001a\u00020\fJ\u0006\u00102\u001a\u00020\fJ\u0006\u00103\u001a\u00020\fJ\u000e\u00104\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u00105\u001a\u00020\f2\b\u00106\u001a\u0004\u0018\u00010\u000fJ\u0018\u00107\u001a\u00020\f2\u0006\u0010,\u001a\u00020\u000f2\b\b\u0002\u0010\u001d\u001a\u000208J\u0006\u00109\u001a\u00020\fJ\u0006\u0010:\u001a\u00020\fJ\u0006\u0010;\u001a\u00020\fJ\u0006\u0010<\u001a\u00020\fJ\u0006\u0010=\u001a\u00020\fJ\u000e\u0010>\u001a\u00020\f2\u0006\u0010,\u001a\u00020\u000fJ\u000e\u0010?\u001a\u00020\f2\u0006\u0010@\u001a\u00020AJ\u000e\u0010B\u001a\u00020\f2\u0006\u0010C\u001a\u00020DJ$\u0010E\u001a\u00020\f2\u0006\u0010F\u001a\u00020\u001c2\u0006\u0010C\u001a\u00020D2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000fH\u0002J\u0016\u0010G\u001a\u00020\f2\u0006\u0010H\u001a\u00020I2\u0006\u0010C\u001a\u00020DJ\u000e\u0010J\u001a\u00020\f2\u0006\u0010C\u001a\u00020DJ\u000e\u0010K\u001a\u00020\f2\u0006\u0010C\u001a\u00020DJ\u0006\u0010L\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006N"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/CardReaderTracker;", "", "trackerWrapper", "Lcom/woocommerce/android/analytics/AnalyticsTrackerWrapper;", "appPrefsWrapper", "Lcom/woocommerce/android/AppPrefsWrapper;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "cardReaderTrackingInfoProvider", "Lcom/woocommerce/android/ui/cardreader/CardReaderTrackingInfoProvider;", "(Lcom/woocommerce/android/analytics/AnalyticsTrackerWrapper;Lcom/woocommerce/android/AppPrefsWrapper;Lcom/woocommerce/android/tools/SelectedSite;Lcom/woocommerce/android/ui/cardreader/CardReaderTrackingInfoProvider;)V", "addCardReaderModelProperty", "", "properties", "", "", "addCurrencyProperty", "addPaymentMethodTypeProperty", "addPreferredPluginSlugProperty", "addStoreCountryCodeProperty", "getOnboardingNotCompletedReason", "state", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingState;", "getPluginNameReasonPrefix", "pluginType", "Lcom/woocommerce/android/ui/cardreader/onboarding/PluginType;", "track", "stat", "Lcom/woocommerce/android/analytics/AnalyticsEvent;", "errorType", "errorDescription", "trackAutoConnectionStarted", "trackCollectPaymentTapped", "trackConnectionFailed", "trackConnectionSucceeded", "trackDisconnectTapped", "trackDiscoveryTapped", "trackEmailReceiptFailed", "trackEmailReceiptTapped", "trackFetchingLocationFailed", "trackFetchingLocationSucceeded", "trackInteracPaymentFailed", "orderId", "", "errorMessage", "Lcom/woocommerce/android/cardreader/payments/CardInteracRefundStatus$RefundStatusErrorType;", "trackInteracPaymentSucceeded", "trackInteracRefundCancelled", "currentRefundState", "trackMissingLocationTapped", "trackOnConnectTapped", "trackOnboardingLearnMoreTapped", "trackOnboardingState", "trackPaymentCancelled", "currentPaymentState", "trackPaymentFailed", "Lcom/woocommerce/android/cardreader/payments/CardPaymentStatus$CardPaymentStatusErrorType;", "trackPaymentSucceeded", "trackPrintReceiptCancelled", "trackPrintReceiptFailed", "trackPrintReceiptSucceeded", "trackPrintReceiptTapped", "trackReaderDiscoveryFailed", "trackReadersDiscovered", "count", "", "trackSoftwareUpdateCancelled", "requiredUpdate", "", "trackSoftwareUpdateEvent", "event", "trackSoftwareUpdateFailed", "status", "Lcom/woocommerce/android/cardreader/connection/event/SoftwareUpdateStatus$Failed;", "trackSoftwareUpdateStarted", "trackSoftwareUpdateSucceeded", "trackSoftwareUpdateUnknownStatus", "Companion", "WooCommerce_vanillaDebug"})
public final class CardReaderTracker {
    private final com.woocommerce.android.analytics.AnalyticsTrackerWrapper trackerWrapper = null;
    private final com.woocommerce.android.AppPrefsWrapper appPrefsWrapper = null;
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    private final com.woocommerce.android.ui.cardreader.CardReaderTrackingInfoProvider cardReaderTrackingInfoProvider = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.cardreader.CardReaderTracker.Companion Companion = null;
    private static final java.lang.String OPTIONAL_UPDATE = "Optional";
    private static final java.lang.String REQUIRED_UPDATE = "Required";
    
    @javax.inject.Inject()
    public CardReaderTracker(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.analytics.AnalyticsTrackerWrapper trackerWrapper, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.AppPrefsWrapper appPrefsWrapper, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.tools.SelectedSite selectedSite, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.cardreader.CardReaderTrackingInfoProvider cardReaderTrackingInfoProvider) {
        super();
    }
    
    @androidx.annotation.VisibleForTesting()
    public final void track(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.analytics.AnalyticsEvent stat, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.Object> properties, @org.jetbrains.annotations.Nullable()
    java.lang.String errorType, @org.jetbrains.annotations.Nullable()
    java.lang.String errorDescription) {
    }
    
    private final void addPreferredPluginSlugProperty(java.util.Map<java.lang.String, java.lang.Object> properties) {
    }
    
    private final void addStoreCountryCodeProperty(java.util.Map<java.lang.String, java.lang.Object> properties) {
    }
    
    private final void addCurrencyProperty(java.util.Map<java.lang.String, java.lang.Object> properties) {
    }
    
    private final void addPaymentMethodTypeProperty(java.util.Map<java.lang.String, java.lang.Object> properties) {
    }
    
    private final void addCardReaderModelProperty(java.util.Map<java.lang.String, java.lang.Object> properties) {
    }
    
    @kotlin.Suppress(names = {"ComplexMethod"})
    private final java.lang.String getOnboardingNotCompletedReason(com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState state) {
        return null;
    }
    
    private final java.lang.String getPluginNameReasonPrefix(com.woocommerce.android.ui.cardreader.onboarding.PluginType pluginType) {
        return null;
    }
    
    public final void trackOnboardingLearnMoreTapped() {
    }
    
    public final void trackOnboardingState(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState state) {
    }
    
    public final void trackSoftwareUpdateStarted(boolean requiredUpdate) {
    }
    
    public final void trackSoftwareUpdateUnknownStatus() {
    }
    
    public final void trackSoftwareUpdateSucceeded(boolean requiredUpdate) {
    }
    
    public final void trackSoftwareUpdateFailed(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.cardreader.connection.event.SoftwareUpdateStatus.Failed status, boolean requiredUpdate) {
    }
    
    public final void trackSoftwareUpdateCancelled(boolean requiredUpdate) {
    }
    
    public final void trackReadersDiscovered(int count) {
    }
    
    public final void trackReaderDiscoveryFailed(@org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage) {
    }
    
    public final void trackDiscoveryTapped() {
    }
    
    public final void trackAutoConnectionStarted() {
    }
    
    public final void trackOnConnectTapped() {
    }
    
    public final void trackFetchingLocationSucceeded() {
    }
    
    public final void trackFetchingLocationFailed(@org.jetbrains.annotations.Nullable()
    java.lang.String errorDescription) {
    }
    
    public final void trackMissingLocationTapped() {
    }
    
    public final void trackConnectionFailed() {
    }
    
    public final void trackConnectionSucceeded() {
    }
    
    public final void trackPaymentFailed(@org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.cardreader.payments.CardPaymentStatus.CardPaymentStatusErrorType errorType) {
    }
    
    public final void trackPaymentSucceeded() {
    }
    
    public final void trackInteracPaymentSucceeded() {
    }
    
    public final void trackInteracPaymentFailed(long orderId, @org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.cardreader.payments.CardInteracRefundStatus.RefundStatusErrorType errorType) {
    }
    
    public final void trackPrintReceiptTapped() {
    }
    
    public final void trackEmailReceiptTapped() {
    }
    
    public final void trackEmailReceiptFailed() {
    }
    
    public final void trackPrintReceiptCancelled() {
    }
    
    public final void trackPrintReceiptFailed() {
    }
    
    public final void trackPrintReceiptSucceeded() {
    }
    
    public final void trackPaymentCancelled(@org.jetbrains.annotations.Nullable()
    java.lang.String currentPaymentState) {
    }
    
    public final void trackCollectPaymentTapped() {
    }
    
    public final void trackDisconnectTapped() {
    }
    
    private final void trackSoftwareUpdateEvent(com.woocommerce.android.analytics.AnalyticsEvent event, boolean requiredUpdate, java.lang.String errorDescription) {
    }
    
    public final void trackInteracRefundCancelled(@org.jetbrains.annotations.Nullable()
    java.lang.String currentRefundState) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/CardReaderTracker$Companion;", "", "()V", "OPTIONAL_UPDATE", "", "REQUIRED_UPDATE", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}