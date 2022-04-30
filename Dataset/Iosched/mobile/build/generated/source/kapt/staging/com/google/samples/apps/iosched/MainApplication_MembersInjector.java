package com.google.samples.apps.iosched;

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
public final class MainApplication_MembersInjector implements MembersInjector<MainApplication> {
  private final Provider<AnalyticsHelper> analyticsHelperProvider;

  public MainApplication_MembersInjector(Provider<AnalyticsHelper> analyticsHelperProvider) {
    this.analyticsHelperProvider = analyticsHelperProvider;
  }

  public static MembersInjector<MainApplication> create(
      Provider<AnalyticsHelper> analyticsHelperProvider) {
    return new MainApplication_MembersInjector(analyticsHelperProvider);
  }

  @Override
  public void injectMembers(MainApplication instance) {
    injectAnalyticsHelper(instance, analyticsHelperProvider.get());
  }

  @InjectedFieldSignature("com.google.samples.apps.iosched.MainApplication.analyticsHelper")
  public static void injectAnalyticsHelper(MainApplication instance,
      AnalyticsHelper analyticsHelper) {
    instance.analyticsHelper = analyticsHelper;
  }
}
