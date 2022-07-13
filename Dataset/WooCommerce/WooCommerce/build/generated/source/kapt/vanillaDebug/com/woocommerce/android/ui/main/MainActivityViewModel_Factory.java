// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.ui.main;

import androidx.lifecycle.SavedStateHandle;
import com.woocommerce.android.AppPrefs;
import com.woocommerce.android.push.NotificationMessageHandler;
import com.woocommerce.android.push.UnseenReviewsCountHandler;
import com.woocommerce.android.tools.SelectedSite;
import com.woocommerce.android.ui.whatsnew.FeatureAnnouncementRepository;
import com.woocommerce.android.util.BuildConfigWrapper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.wordpress.android.fluxc.store.SiteStore;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainActivityViewModel_Factory implements Factory<MainActivityViewModel> {
  private final Provider<SavedStateHandle> savedStateProvider;

  private final Provider<SiteStore> siteStoreProvider;

  private final Provider<SelectedSite> selectedSiteProvider;

  private final Provider<NotificationMessageHandler> notificationHandlerProvider;

  private final Provider<FeatureAnnouncementRepository> featureAnnouncementRepositoryProvider;

  private final Provider<BuildConfigWrapper> buildConfigWrapperProvider;

  private final Provider<AppPrefs> prefsProvider;

  private final Provider<UnseenReviewsCountHandler> unseenReviewsCountHandlerProvider;

  public MainActivityViewModel_Factory(Provider<SavedStateHandle> savedStateProvider,
      Provider<SiteStore> siteStoreProvider, Provider<SelectedSite> selectedSiteProvider,
      Provider<NotificationMessageHandler> notificationHandlerProvider,
      Provider<FeatureAnnouncementRepository> featureAnnouncementRepositoryProvider,
      Provider<BuildConfigWrapper> buildConfigWrapperProvider, Provider<AppPrefs> prefsProvider,
      Provider<UnseenReviewsCountHandler> unseenReviewsCountHandlerProvider) {
    this.savedStateProvider = savedStateProvider;
    this.siteStoreProvider = siteStoreProvider;
    this.selectedSiteProvider = selectedSiteProvider;
    this.notificationHandlerProvider = notificationHandlerProvider;
    this.featureAnnouncementRepositoryProvider = featureAnnouncementRepositoryProvider;
    this.buildConfigWrapperProvider = buildConfigWrapperProvider;
    this.prefsProvider = prefsProvider;
    this.unseenReviewsCountHandlerProvider = unseenReviewsCountHandlerProvider;
  }

  @Override
  public MainActivityViewModel get() {
    return newInstance(savedStateProvider.get(), siteStoreProvider.get(), selectedSiteProvider.get(), notificationHandlerProvider.get(), featureAnnouncementRepositoryProvider.get(), buildConfigWrapperProvider.get(), prefsProvider.get(), unseenReviewsCountHandlerProvider.get());
  }

  public static MainActivityViewModel_Factory create(Provider<SavedStateHandle> savedStateProvider,
      Provider<SiteStore> siteStoreProvider, Provider<SelectedSite> selectedSiteProvider,
      Provider<NotificationMessageHandler> notificationHandlerProvider,
      Provider<FeatureAnnouncementRepository> featureAnnouncementRepositoryProvider,
      Provider<BuildConfigWrapper> buildConfigWrapperProvider, Provider<AppPrefs> prefsProvider,
      Provider<UnseenReviewsCountHandler> unseenReviewsCountHandlerProvider) {
    return new MainActivityViewModel_Factory(savedStateProvider, siteStoreProvider, selectedSiteProvider, notificationHandlerProvider, featureAnnouncementRepositoryProvider, buildConfigWrapperProvider, prefsProvider, unseenReviewsCountHandlerProvider);
  }

  public static MainActivityViewModel newInstance(SavedStateHandle savedState, SiteStore siteStore,
      SelectedSite selectedSite, NotificationMessageHandler notificationHandler,
      FeatureAnnouncementRepository featureAnnouncementRepository,
      BuildConfigWrapper buildConfigWrapper, AppPrefs prefs,
      UnseenReviewsCountHandler unseenReviewsCountHandler) {
    return new MainActivityViewModel(savedState, siteStore, selectedSite, notificationHandler, featureAnnouncementRepository, buildConfigWrapper, prefs, unseenReviewsCountHandler);
  }
}