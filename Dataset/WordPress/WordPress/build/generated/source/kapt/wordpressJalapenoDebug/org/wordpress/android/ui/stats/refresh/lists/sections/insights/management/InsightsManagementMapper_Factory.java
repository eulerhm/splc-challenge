package org.wordpress.android.ui.stats.refresh.lists.sections.insights.management;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.Generated;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;
import org.wordpress.android.util.config.StatsRevampV2FeatureConfig;

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
public final class InsightsManagementMapper_Factory implements Factory<InsightsManagementMapper> {
  private final Provider<CoroutineDispatcher> bgDispatcherProvider;

  private final Provider<StatsRevampV2FeatureConfig> statsRevampV2FeatureConfigProvider;

  public InsightsManagementMapper_Factory(Provider<CoroutineDispatcher> bgDispatcherProvider,
      Provider<StatsRevampV2FeatureConfig> statsRevampV2FeatureConfigProvider) {
    this.bgDispatcherProvider = bgDispatcherProvider;
    this.statsRevampV2FeatureConfigProvider = statsRevampV2FeatureConfigProvider;
  }

  @Override
  public InsightsManagementMapper get() {
    return newInstance(bgDispatcherProvider.get(), statsRevampV2FeatureConfigProvider.get());
  }

  public static InsightsManagementMapper_Factory create(
      Provider<CoroutineDispatcher> bgDispatcherProvider,
      Provider<StatsRevampV2FeatureConfig> statsRevampV2FeatureConfigProvider) {
    return new InsightsManagementMapper_Factory(bgDispatcherProvider, statsRevampV2FeatureConfigProvider);
  }

  public static InsightsManagementMapper newInstance(CoroutineDispatcher bgDispatcher,
      StatsRevampV2FeatureConfig statsRevampV2FeatureConfig) {
    return new InsightsManagementMapper(bgDispatcher, statsRevampV2FeatureConfig);
  }
}
