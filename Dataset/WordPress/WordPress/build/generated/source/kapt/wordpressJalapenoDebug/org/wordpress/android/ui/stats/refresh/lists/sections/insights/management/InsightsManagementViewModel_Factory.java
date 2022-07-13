package org.wordpress.android.ui.stats.refresh.lists.sections.insights.management;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.Generated;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;
import org.wordpress.android.fluxc.store.StatsStore;
import org.wordpress.android.ui.stats.refresh.lists.BaseListUseCase;
import org.wordpress.android.ui.stats.refresh.utils.StatsSiteProvider;
import org.wordpress.android.util.analytics.AnalyticsTrackerWrapper;

@ScopeMetadata
@QualifierMetadata("javax.inject.Named")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class InsightsManagementViewModel_Factory implements Factory<InsightsManagementViewModel> {
  private final Provider<CoroutineDispatcher> mainDispatcherProvider;

  private final Provider<CoroutineDispatcher> defaultDispatcherProvider;

  private final Provider<BaseListUseCase> insightsUseCaseProvider;

  private final Provider<StatsSiteProvider> siteProvider;

  private final Provider<StatsStore> statsStoreProvider;

  private final Provider<InsightsManagementMapper> insightsManagementMapperProvider;

  private final Provider<AnalyticsTrackerWrapper> analyticsTrackerWrapperProvider;

  public InsightsManagementViewModel_Factory(Provider<CoroutineDispatcher> mainDispatcherProvider,
      Provider<CoroutineDispatcher> defaultDispatcherProvider,
      Provider<BaseListUseCase> insightsUseCaseProvider, Provider<StatsSiteProvider> siteProvider,
      Provider<StatsStore> statsStoreProvider,
      Provider<InsightsManagementMapper> insightsManagementMapperProvider,
      Provider<AnalyticsTrackerWrapper> analyticsTrackerWrapperProvider) {
    this.mainDispatcherProvider = mainDispatcherProvider;
    this.defaultDispatcherProvider = defaultDispatcherProvider;
    this.insightsUseCaseProvider = insightsUseCaseProvider;
    this.siteProvider = siteProvider;
    this.statsStoreProvider = statsStoreProvider;
    this.insightsManagementMapperProvider = insightsManagementMapperProvider;
    this.analyticsTrackerWrapperProvider = analyticsTrackerWrapperProvider;
  }

  @Override
  public InsightsManagementViewModel get() {
    return newInstance(mainDispatcherProvider.get(), defaultDispatcherProvider.get(), insightsUseCaseProvider.get(), siteProvider.get(), statsStoreProvider.get(), insightsManagementMapperProvider.get(), analyticsTrackerWrapperProvider.get());
  }

  public static InsightsManagementViewModel_Factory create(
      Provider<CoroutineDispatcher> mainDispatcherProvider,
      Provider<CoroutineDispatcher> defaultDispatcherProvider,
      Provider<BaseListUseCase> insightsUseCaseProvider, Provider<StatsSiteProvider> siteProvider,
      Provider<StatsStore> statsStoreProvider,
      Provider<InsightsManagementMapper> insightsManagementMapperProvider,
      Provider<AnalyticsTrackerWrapper> analyticsTrackerWrapperProvider) {
    return new InsightsManagementViewModel_Factory(mainDispatcherProvider, defaultDispatcherProvider, insightsUseCaseProvider, siteProvider, statsStoreProvider, insightsManagementMapperProvider, analyticsTrackerWrapperProvider);
  }

  public static InsightsManagementViewModel newInstance(CoroutineDispatcher mainDispatcher,
      CoroutineDispatcher defaultDispatcher, BaseListUseCase insightsUseCase,
      StatsSiteProvider siteProvider, StatsStore statsStore,
      InsightsManagementMapper insightsManagementMapper,
      AnalyticsTrackerWrapper analyticsTrackerWrapper) {
    return new InsightsManagementViewModel(mainDispatcher, defaultDispatcher, insightsUseCase, siteProvider, statsStore, insightsManagementMapper, analyticsTrackerWrapper);
  }
}
