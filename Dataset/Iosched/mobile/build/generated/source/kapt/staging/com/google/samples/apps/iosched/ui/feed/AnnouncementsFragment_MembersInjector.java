package com.google.samples.apps.iosched.ui.feed;

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
public final class AnnouncementsFragment_MembersInjector implements MembersInjector<AnnouncementsFragment> {
  private final Provider<AnalyticsHelper> analyticsHelperProvider;

  public AnnouncementsFragment_MembersInjector(Provider<AnalyticsHelper> analyticsHelperProvider) {
    this.analyticsHelperProvider = analyticsHelperProvider;
  }

  public static MembersInjector<AnnouncementsFragment> create(
      Provider<AnalyticsHelper> analyticsHelperProvider) {
    return new AnnouncementsFragment_MembersInjector(analyticsHelperProvider);
  }

  @Override
  public void injectMembers(AnnouncementsFragment instance) {
    injectAnalyticsHelper(instance, analyticsHelperProvider.get());
  }

  @InjectedFieldSignature("com.google.samples.apps.iosched.ui.feed.AnnouncementsFragment.analyticsHelper")
  public static void injectAnalyticsHelper(AnnouncementsFragment instance,
      AnalyticsHelper analyticsHelper) {
    instance.analyticsHelper = analyticsHelper;
  }
}
