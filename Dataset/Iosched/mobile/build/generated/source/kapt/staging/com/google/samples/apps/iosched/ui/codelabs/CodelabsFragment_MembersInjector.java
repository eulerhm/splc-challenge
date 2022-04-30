package com.google.samples.apps.iosched.ui.codelabs;

import androidx.recyclerview.widget.RecyclerView;
import com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper;
import com.google.samples.apps.iosched.shared.di.MapFeatureEnabledFlag;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.Generated;
import javax.inject.Named;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CodelabsFragment_MembersInjector implements MembersInjector<CodelabsFragment> {
  private final Provider<RecyclerView.RecycledViewPool> tagRecycledViewPoolProvider;

  private final Provider<Boolean> mapFeatureEnabledProvider;

  private final Provider<AnalyticsHelper> analyticsHelperProvider;

  public CodelabsFragment_MembersInjector(
      Provider<RecyclerView.RecycledViewPool> tagRecycledViewPoolProvider,
      Provider<Boolean> mapFeatureEnabledProvider,
      Provider<AnalyticsHelper> analyticsHelperProvider) {
    this.tagRecycledViewPoolProvider = tagRecycledViewPoolProvider;
    this.mapFeatureEnabledProvider = mapFeatureEnabledProvider;
    this.analyticsHelperProvider = analyticsHelperProvider;
  }

  public static MembersInjector<CodelabsFragment> create(
      Provider<RecyclerView.RecycledViewPool> tagRecycledViewPoolProvider,
      Provider<Boolean> mapFeatureEnabledProvider,
      Provider<AnalyticsHelper> analyticsHelperProvider) {
    return new CodelabsFragment_MembersInjector(tagRecycledViewPoolProvider, mapFeatureEnabledProvider, analyticsHelperProvider);
  }

  @Override
  public void injectMembers(CodelabsFragment instance) {
    injectTagRecycledViewPool(instance, tagRecycledViewPoolProvider.get());
    injectMapFeatureEnabled(instance, mapFeatureEnabledProvider.get());
    injectAnalyticsHelper(instance, analyticsHelperProvider.get());
  }

  @InjectedFieldSignature("com.google.samples.apps.iosched.ui.codelabs.CodelabsFragment.tagRecycledViewPool")
  @Named("tagViewPool")
  public static void injectTagRecycledViewPool(CodelabsFragment instance,
      RecyclerView.RecycledViewPool tagRecycledViewPool) {
    instance.tagRecycledViewPool = tagRecycledViewPool;
  }

  @InjectedFieldSignature("com.google.samples.apps.iosched.ui.codelabs.CodelabsFragment.mapFeatureEnabled")
  @MapFeatureEnabledFlag
  public static void injectMapFeatureEnabled(CodelabsFragment instance, boolean mapFeatureEnabled) {
    instance.mapFeatureEnabled = mapFeatureEnabled;
  }

  @InjectedFieldSignature("com.google.samples.apps.iosched.ui.codelabs.CodelabsFragment.analyticsHelper")
  public static void injectAnalyticsHelper(CodelabsFragment instance,
      AnalyticsHelper analyticsHelper) {
    instance.analyticsHelper = analyticsHelper;
  }
}
