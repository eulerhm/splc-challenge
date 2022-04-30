package com.google.samples.apps.iosched.ui.info;

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
public final class InfoFragment_MembersInjector implements MembersInjector<InfoFragment> {
  private final Provider<AnalyticsHelper> analyticsHelperProvider;

  public InfoFragment_MembersInjector(Provider<AnalyticsHelper> analyticsHelperProvider) {
    this.analyticsHelperProvider = analyticsHelperProvider;
  }

  public static MembersInjector<InfoFragment> create(
      Provider<AnalyticsHelper> analyticsHelperProvider) {
    return new InfoFragment_MembersInjector(analyticsHelperProvider);
  }

  @Override
  public void injectMembers(InfoFragment instance) {
    injectAnalyticsHelper(instance, analyticsHelperProvider.get());
  }

  @InjectedFieldSignature("com.google.samples.apps.iosched.ui.info.InfoFragment.analyticsHelper")
  public static void injectAnalyticsHelper(InfoFragment instance, AnalyticsHelper analyticsHelper) {
    instance.analyticsHelper = analyticsHelper;
  }
}
