package com.woocommerce.android.ui.cardreader.onboarding;

import java.lang.System;

/**
 * This class is used to check if the selected store is ready to accept In Person Payments. The app should check store's
 * eligibility every time it attempts to connect to a card reader.
 *
 * This class contains a side-effect, it stores "onboarding completed"/"onboarding not completed"/"onboarding pending"
 * and Preferred Plugin (either WCPay or Stripe Extension) into shared preferences.
 *
 * Onboarding Pending means that the store is ready to accept in person payments, but the Stripe account contains some
 * pending requirements and will be disabled if the requirements are not met.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001BG\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\u0011\u0010\u0013\u001a\u00020\u0014H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0011\u0010\u0016\u001a\u00020\u0017H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0011\u0010\u001e\u001a\u00020\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u001c\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0002J\u0013\u0010$\u001a\u0004\u0018\u00010\u0019H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u001c\u0010%\u001a\u00020&2\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0002J\u0010\u0010\'\u001a\u00020&2\u0006\u0010(\u001a\u00020)H\u0002J\u0012\u0010*\u001a\u00020&2\b\u0010+\u001a\u0004\u0018\u00010\"H\u0002J\u0010\u0010,\u001a\u00020&2\u0006\u0010-\u001a\u00020)H\u0002J\u0010\u0010.\u001a\u00020&2\u0006\u0010/\u001a\u00020 H\u0002J\u0010\u00100\u001a\u00020&2\u0006\u0010(\u001a\u00020)H\u0002J\u0018\u00101\u001a\u00020&2\u0006\u00102\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0018\u00103\u001a\u00020&2\u0006\u0010/\u001a\u00020 2\u0006\u00104\u001a\u00020\u0019H\u0002J\u0010\u00105\u001a\u00020&2\u0006\u0010(\u001a\u00020)H\u0002J\u0010\u00106\u001a\u00020&2\u0006\u0010(\u001a\u00020)H\u0002J\u0010\u00107\u001a\u00020&2\u0006\u0010(\u001a\u00020)H\u0002J\u0010\u00108\u001a\u00020&2\u0006\u0010(\u001a\u00020)H\u0002J\u0012\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010\u0019H\u0002J$\u0010<\u001a\u00020:2\u0006\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010\u001b2\b\u0010@\u001a\u0004\u0018\u00010\u0019H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006A"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingChecker;", "", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "appPrefsWrapper", "Lcom/woocommerce/android/AppPrefsWrapper;", "wooStore", "Lorg/wordpress/android/fluxc/store/WooCommerceStore;", "inPersonPaymentsStore", "Lorg/wordpress/android/fluxc/store/WCInPersonPaymentsStore;", "dispatchers", "Lcom/woocommerce/android/util/CoroutineDispatchers;", "networkStatus", "Lcom/woocommerce/android/tools/NetworkStatus;", "cardReaderTrackingInfoKeeper", "Lcom/woocommerce/android/ui/cardreader/CardReaderTrackingInfoKeeper;", "cardReaderCountryConfigProvider", "Lcom/woocommerce/android/ui/cardreader/CardReaderCountryConfigProvider;", "(Lcom/woocommerce/android/tools/SelectedSite;Lcom/woocommerce/android/AppPrefsWrapper;Lorg/wordpress/android/fluxc/store/WooCommerceStore;Lorg/wordpress/android/fluxc/store/WCInPersonPaymentsStore;Lcom/woocommerce/android/util/CoroutineDispatchers;Lcom/woocommerce/android/tools/NetworkStatus;Lcom/woocommerce/android/ui/cardreader/CardReaderTrackingInfoKeeper;Lcom/woocommerce/android/ui/cardreader/CardReaderCountryConfigProvider;)V", "fetchOnboardingState", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingState;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchPreferredPlugin", "Lcom/woocommerce/android/ui/cardreader/onboarding/PreferredPluginResult;", "getMinimumSupportedVersionForPlugin", "", "preferredPluginType", "Lcom/woocommerce/android/ui/cardreader/onboarding/PluginType;", "cardReaderConfig", "Lcom/woocommerce/android/cardreader/internal/config/CardReaderConfigForSupportedCountry;", "getOnboardingState", "getPreferredPlugin", "Lcom/woocommerce/android/ui/cardreader/onboarding/PluginWrapper;", "stripePluginInfo", "Lorg/wordpress/android/fluxc/model/plugin/SitePluginModel;", "wcPayPluginInfo", "getStoreCountryCode", "isBothPluginsActivated", "", "isInUndefinedState", "paymentAccount", "Lorg/wordpress/android/fluxc/model/payments/inperson/WCPaymentAccountResult;", "isPluginActivated", "pluginInfo", "isPluginInTestModeWithLiveStripeAccount", "account", "isPluginInstalled", "plugin", "isPluginSetupCompleted", "isPluginSupportedInCountry", "pluginType", "isPluginVersionSupported", "minimumSupportedVersion", "isStripeAccountOverdueRequirements", "isStripeAccountPendingRequirements", "isStripeAccountRejected", "isStripeAccountUnderReview", "saveStatementDescriptor", "", "statementDescriptor", "updateSharedPreferences", "status", "Lcom/woocommerce/android/AppPrefs$CardReaderOnboardingStatus;", "preferredPlugin", "version", "WooCommerce_vanillaDebug"})
public final class CardReaderOnboardingChecker {
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    private final com.woocommerce.android.AppPrefsWrapper appPrefsWrapper = null;
    private final org.wordpress.android.fluxc.store.WooCommerceStore wooStore = null;
    private final org.wordpress.android.fluxc.store.WCInPersonPaymentsStore inPersonPaymentsStore = null;
    private final com.woocommerce.android.util.CoroutineDispatchers dispatchers = null;
    private final com.woocommerce.android.tools.NetworkStatus networkStatus = null;
    private final com.woocommerce.android.ui.cardreader.CardReaderTrackingInfoKeeper cardReaderTrackingInfoKeeper = null;
    private final com.woocommerce.android.ui.cardreader.CardReaderCountryConfigProvider cardReaderCountryConfigProvider = null;
    
    @javax.inject.Inject()
    public CardReaderOnboardingChecker(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.tools.SelectedSite selectedSite, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.AppPrefsWrapper appPrefsWrapper, @org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.WooCommerceStore wooStore, @org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.WCInPersonPaymentsStore inPersonPaymentsStore, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.CoroutineDispatchers dispatchers, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.tools.NetworkStatus networkStatus, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.cardreader.CardReaderTrackingInfoKeeper cardReaderTrackingInfoKeeper, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.cardreader.CardReaderCountryConfigProvider cardReaderCountryConfigProvider) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getOnboardingState(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchPreferredPlugin(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.woocommerce.android.ui.cardreader.onboarding.PreferredPluginResult> continuation) {
        return null;
    }
    
    @kotlin.Suppress(names = {"ReturnCount", "ComplexMethod", "LongMethod"})
    private final java.lang.Object fetchOnboardingState(kotlin.coroutines.Continuation<? super com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingState> continuation) {
        return null;
    }
    
    private final boolean isPluginSupportedInCountry(com.woocommerce.android.ui.cardreader.onboarding.PluginType pluginType, com.woocommerce.android.cardreader.internal.config.CardReaderConfigForSupportedCountry cardReaderConfig) {
        return false;
    }
    
    private final java.lang.String getMinimumSupportedVersionForPlugin(com.woocommerce.android.ui.cardreader.onboarding.PluginType preferredPluginType, com.woocommerce.android.cardreader.internal.config.CardReaderConfigForSupportedCountry cardReaderConfig) {
        return null;
    }
    
    private final void saveStatementDescriptor(java.lang.String statementDescriptor) {
    }
    
    private final boolean isBothPluginsActivated(org.wordpress.android.fluxc.model.plugin.SitePluginModel wcPayPluginInfo, org.wordpress.android.fluxc.model.plugin.SitePluginModel stripePluginInfo) {
        return false;
    }
    
    private final com.woocommerce.android.ui.cardreader.onboarding.PluginWrapper getPreferredPlugin(org.wordpress.android.fluxc.model.plugin.SitePluginModel stripePluginInfo, org.wordpress.android.fluxc.model.plugin.SitePluginModel wcPayPluginInfo) {
        return null;
    }
    
    private final java.lang.Object getStoreCountryCode(kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return null;
    }
    
    private final boolean isPluginInstalled(com.woocommerce.android.ui.cardreader.onboarding.PluginWrapper plugin) {
        return false;
    }
    
    private final boolean isPluginVersionSupported(com.woocommerce.android.ui.cardreader.onboarding.PluginWrapper plugin, java.lang.String minimumSupportedVersion) {
        return false;
    }
    
    private final boolean isPluginActivated(org.wordpress.android.fluxc.model.plugin.SitePluginModel pluginInfo) {
        return false;
    }
    
    private final boolean isPluginSetupCompleted(org.wordpress.android.fluxc.model.payments.inperson.WCPaymentAccountResult paymentAccount) {
        return false;
    }
    
    private final boolean isPluginInTestModeWithLiveStripeAccount(org.wordpress.android.fluxc.model.payments.inperson.WCPaymentAccountResult account) {
        return false;
    }
    
    private final boolean isStripeAccountUnderReview(org.wordpress.android.fluxc.model.payments.inperson.WCPaymentAccountResult paymentAccount) {
        return false;
    }
    
    private final boolean isStripeAccountPendingRequirements(org.wordpress.android.fluxc.model.payments.inperson.WCPaymentAccountResult paymentAccount) {
        return false;
    }
    
    private final boolean isStripeAccountOverdueRequirements(org.wordpress.android.fluxc.model.payments.inperson.WCPaymentAccountResult paymentAccount) {
        return false;
    }
    
    private final boolean isStripeAccountRejected(org.wordpress.android.fluxc.model.payments.inperson.WCPaymentAccountResult paymentAccount) {
        return false;
    }
    
    private final boolean isInUndefinedState(org.wordpress.android.fluxc.model.payments.inperson.WCPaymentAccountResult paymentAccount) {
        return false;
    }
    
    private final void updateSharedPreferences(com.woocommerce.android.AppPrefs.CardReaderOnboardingStatus status, com.woocommerce.android.ui.cardreader.onboarding.PluginType preferredPlugin, java.lang.String version) {
    }
}