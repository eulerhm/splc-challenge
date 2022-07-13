// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.push;

import com.woocommerce.android.AppPrefsWrapper;
import com.woocommerce.android.support.ZendeskHelper;
import com.woocommerce.android.util.NotificationsParser;
import com.woocommerce.android.util.WooLogWrapper;
import com.woocommerce.android.viewmodel.ResourceProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.wordpress.android.fluxc.Dispatcher;
import org.wordpress.android.fluxc.store.AccountStore;
import org.wordpress.android.fluxc.store.SiteStore;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NotificationMessageHandler_Factory implements Factory<NotificationMessageHandler> {
  private final Provider<AccountStore> accountStoreProvider;

  private final Provider<WooLogWrapper> wooLogWrapperProvider;

  private final Provider<Dispatcher> dispatcherProvider;

  private final Provider<SiteStore> siteStoreProvider;

  private final Provider<AppPrefsWrapper> appPrefsWrapperProvider;

  private final Provider<ResourceProvider> resourceProvider;

  private final Provider<WooNotificationBuilder> notificationBuilderProvider;

  private final Provider<NotificationAnalyticsTracker> analyticsTrackerProvider;

  private final Provider<ZendeskHelper> zendeskHelperProvider;

  private final Provider<NotificationsParser> notificationsParserProvider;

  public NotificationMessageHandler_Factory(Provider<AccountStore> accountStoreProvider,
      Provider<WooLogWrapper> wooLogWrapperProvider, Provider<Dispatcher> dispatcherProvider,
      Provider<SiteStore> siteStoreProvider, Provider<AppPrefsWrapper> appPrefsWrapperProvider,
      Provider<ResourceProvider> resourceProvider,
      Provider<WooNotificationBuilder> notificationBuilderProvider,
      Provider<NotificationAnalyticsTracker> analyticsTrackerProvider,
      Provider<ZendeskHelper> zendeskHelperProvider,
      Provider<NotificationsParser> notificationsParserProvider) {
    this.accountStoreProvider = accountStoreProvider;
    this.wooLogWrapperProvider = wooLogWrapperProvider;
    this.dispatcherProvider = dispatcherProvider;
    this.siteStoreProvider = siteStoreProvider;
    this.appPrefsWrapperProvider = appPrefsWrapperProvider;
    this.resourceProvider = resourceProvider;
    this.notificationBuilderProvider = notificationBuilderProvider;
    this.analyticsTrackerProvider = analyticsTrackerProvider;
    this.zendeskHelperProvider = zendeskHelperProvider;
    this.notificationsParserProvider = notificationsParserProvider;
  }

  @Override
  public NotificationMessageHandler get() {
    return newInstance(accountStoreProvider.get(), wooLogWrapperProvider.get(), dispatcherProvider.get(), siteStoreProvider.get(), appPrefsWrapperProvider.get(), resourceProvider.get(), notificationBuilderProvider.get(), analyticsTrackerProvider.get(), zendeskHelperProvider.get(), notificationsParserProvider.get());
  }

  public static NotificationMessageHandler_Factory create(
      Provider<AccountStore> accountStoreProvider, Provider<WooLogWrapper> wooLogWrapperProvider,
      Provider<Dispatcher> dispatcherProvider, Provider<SiteStore> siteStoreProvider,
      Provider<AppPrefsWrapper> appPrefsWrapperProvider,
      Provider<ResourceProvider> resourceProvider,
      Provider<WooNotificationBuilder> notificationBuilderProvider,
      Provider<NotificationAnalyticsTracker> analyticsTrackerProvider,
      Provider<ZendeskHelper> zendeskHelperProvider,
      Provider<NotificationsParser> notificationsParserProvider) {
    return new NotificationMessageHandler_Factory(accountStoreProvider, wooLogWrapperProvider, dispatcherProvider, siteStoreProvider, appPrefsWrapperProvider, resourceProvider, notificationBuilderProvider, analyticsTrackerProvider, zendeskHelperProvider, notificationsParserProvider);
  }

  public static NotificationMessageHandler newInstance(AccountStore accountStore,
      WooLogWrapper wooLogWrapper, Dispatcher dispatcher, SiteStore siteStore,
      AppPrefsWrapper appPrefsWrapper, ResourceProvider resourceProvider,
      WooNotificationBuilder notificationBuilder, NotificationAnalyticsTracker analyticsTracker,
      ZendeskHelper zendeskHelper, NotificationsParser notificationsParser) {
    return new NotificationMessageHandler(accountStore, wooLogWrapper, dispatcher, siteStore, appPrefsWrapper, resourceProvider, notificationBuilder, analyticsTracker, zendeskHelper, notificationsParser);
  }
}