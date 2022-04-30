package com.google.samples.apps.iosched.ui.map;

import com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MapFragment_MembersInjector implements MembersInjector<MapFragment> {
  private final Provider<AnalyticsHelper> analyticsHelperProvider;

  public MapFragment_MembersInjector(Provider<AnalyticsHelper> analyticsHelperProvider) {
    this.analyticsHelperProvider = analyticsHelperProvider;
  }

  public static MembersInjector<MapFragment> create(
      Provider<AnalyticsHelper> analyticsHelperProvider) {
    return new MapFragment_MembersInjector(analyticsHelperProvider);
  }

  @Override
  public void injectMembers(MapFragment instance) {
    injectAnalyticsHelper(instance, analyticsHelperProvider.get());
  }

  @InjectedFieldSignature("com.google.samples.apps.iosched.ui.map.MapFragment.analyticsHelper")
  public static void injectAnalyticsHelper(MapFragment instance, AnalyticsHelper analyticsHelper) {
    instance.analyticsHelper = analyticsHelper;
  }
}
