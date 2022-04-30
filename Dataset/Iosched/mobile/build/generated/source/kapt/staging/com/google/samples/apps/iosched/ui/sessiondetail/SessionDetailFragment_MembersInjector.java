package com.google.samples.apps.iosched.ui.sessiondetail;

import androidx.recyclerview.widget.RecyclerView;
import com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper;
import com.google.samples.apps.iosched.shared.di.MapFeatureEnabledFlag;
import com.google.samples.apps.iosched.ui.messages.SnackbarMessageManager;
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
public final class SessionDetailFragment_MembersInjector implements MembersInjector<SessionDetailFragment> {
  private final Provider<SnackbarMessageManager> snackbarMessageManagerProvider;

  private final Provider<AnalyticsHelper> analyticsHelperProvider;

  private final Provider<RecyclerView.RecycledViewPool> tagRecycledViewPoolProvider;

  private final Provider<Boolean> isMapEnabledProvider;

  public SessionDetailFragment_MembersInjector(
      Provider<SnackbarMessageManager> snackbarMessageManagerProvider,
      Provider<AnalyticsHelper> analyticsHelperProvider,
      Provider<RecyclerView.RecycledViewPool> tagRecycledViewPoolProvider,
      Provider<Boolean> isMapEnabledProvider) {
    this.snackbarMessageManagerProvider = snackbarMessageManagerProvider;
    this.analyticsHelperProvider = analyticsHelperProvider;
    this.tagRecycledViewPoolProvider = tagRecycledViewPoolProvider;
    this.isMapEnabledProvider = isMapEnabledProvider;
  }

  public static MembersInjector<SessionDetailFragment> create(
      Provider<SnackbarMessageManager> snackbarMessageManagerProvider,
      Provider<AnalyticsHelper> analyticsHelperProvider,
      Provider<RecyclerView.RecycledViewPool> tagRecycledViewPoolProvider,
      Provider<Boolean> isMapEnabledProvider) {
    return new SessionDetailFragment_MembersInjector(snackbarMessageManagerProvider, analyticsHelperProvider, tagRecycledViewPoolProvider, isMapEnabledProvider);
  }

  @Override
  public void injectMembers(SessionDetailFragment instance) {
    injectSnackbarMessageManager(instance, snackbarMessageManagerProvider.get());
    injectAnalyticsHelper(instance, analyticsHelperProvider.get());
    injectTagRecycledViewPool(instance, tagRecycledViewPoolProvider.get());
    injectIsMapEnabled(instance, isMapEnabledProvider.get());
  }

  @InjectedFieldSignature("com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailFragment.snackbarMessageManager")
  public static void injectSnackbarMessageManager(SessionDetailFragment instance,
      SnackbarMessageManager snackbarMessageManager) {
    instance.snackbarMessageManager = snackbarMessageManager;
  }

  @InjectedFieldSignature("com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailFragment.analyticsHelper")
  public static void injectAnalyticsHelper(SessionDetailFragment instance,
      AnalyticsHelper analyticsHelper) {
    instance.analyticsHelper = analyticsHelper;
  }

  @InjectedFieldSignature("com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailFragment.tagRecycledViewPool")
  @Named("tagViewPool")
  public static void injectTagRecycledViewPool(SessionDetailFragment instance,
      RecyclerView.RecycledViewPool tagRecycledViewPool) {
    instance.tagRecycledViewPool = tagRecycledViewPool;
  }

  @InjectedFieldSignature("com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailFragment.isMapEnabled")
  @MapFeatureEnabledFlag
  public static void injectIsMapEnabled(SessionDetailFragment instance, boolean isMapEnabled) {
    instance.isMapEnabled = isMapEnabled;
  }
}
