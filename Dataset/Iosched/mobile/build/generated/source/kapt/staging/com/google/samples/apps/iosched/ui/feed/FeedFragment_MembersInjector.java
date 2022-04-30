package com.google.samples.apps.iosched.ui.feed;

import com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper;
import com.google.samples.apps.iosched.ui.messages.SnackbarMessageManager;
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
public final class FeedFragment_MembersInjector implements MembersInjector<FeedFragment> {
  private final Provider<SnackbarMessageManager> snackbarMessageManagerProvider;

  private final Provider<AnalyticsHelper> analyticsHelperProvider;

  public FeedFragment_MembersInjector(
      Provider<SnackbarMessageManager> snackbarMessageManagerProvider,
      Provider<AnalyticsHelper> analyticsHelperProvider) {
    this.snackbarMessageManagerProvider = snackbarMessageManagerProvider;
    this.analyticsHelperProvider = analyticsHelperProvider;
  }

  public static MembersInjector<FeedFragment> create(
      Provider<SnackbarMessageManager> snackbarMessageManagerProvider,
      Provider<AnalyticsHelper> analyticsHelperProvider) {
    return new FeedFragment_MembersInjector(snackbarMessageManagerProvider, analyticsHelperProvider);
  }

  @Override
  public void injectMembers(FeedFragment instance) {
    injectSnackbarMessageManager(instance, snackbarMessageManagerProvider.get());
    injectAnalyticsHelper(instance, analyticsHelperProvider.get());
  }

  @InjectedFieldSignature("com.google.samples.apps.iosched.ui.feed.FeedFragment.snackbarMessageManager")
  public static void injectSnackbarMessageManager(FeedFragment instance,
      SnackbarMessageManager snackbarMessageManager) {
    instance.snackbarMessageManager = snackbarMessageManager;
  }

  @InjectedFieldSignature("com.google.samples.apps.iosched.ui.feed.FeedFragment.analyticsHelper")
  public static void injectAnalyticsHelper(FeedFragment instance, AnalyticsHelper analyticsHelper) {
    instance.analyticsHelper = analyticsHelper;
  }
}
