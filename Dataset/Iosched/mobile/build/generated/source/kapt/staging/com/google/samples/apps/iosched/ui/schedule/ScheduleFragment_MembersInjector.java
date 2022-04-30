package com.google.samples.apps.iosched.ui.schedule;

import androidx.recyclerview.widget.RecyclerView;
import com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper;
import com.google.samples.apps.iosched.shared.di.SearchScheduleEnabledFlag;
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
public final class ScheduleFragment_MembersInjector implements MembersInjector<ScheduleFragment> {
  private final Provider<AnalyticsHelper> analyticsHelperProvider;

  private final Provider<RecyclerView.RecycledViewPool> tagViewPoolProvider;

  private final Provider<Boolean> searchScheduleFeatureEnabledProvider;

  private final Provider<SnackbarMessageManager> snackbarMessageManagerProvider;

  public ScheduleFragment_MembersInjector(Provider<AnalyticsHelper> analyticsHelperProvider,
      Provider<RecyclerView.RecycledViewPool> tagViewPoolProvider,
      Provider<Boolean> searchScheduleFeatureEnabledProvider,
      Provider<SnackbarMessageManager> snackbarMessageManagerProvider) {
    this.analyticsHelperProvider = analyticsHelperProvider;
    this.tagViewPoolProvider = tagViewPoolProvider;
    this.searchScheduleFeatureEnabledProvider = searchScheduleFeatureEnabledProvider;
    this.snackbarMessageManagerProvider = snackbarMessageManagerProvider;
  }

  public static MembersInjector<ScheduleFragment> create(
      Provider<AnalyticsHelper> analyticsHelperProvider,
      Provider<RecyclerView.RecycledViewPool> tagViewPoolProvider,
      Provider<Boolean> searchScheduleFeatureEnabledProvider,
      Provider<SnackbarMessageManager> snackbarMessageManagerProvider) {
    return new ScheduleFragment_MembersInjector(analyticsHelperProvider, tagViewPoolProvider, searchScheduleFeatureEnabledProvider, snackbarMessageManagerProvider);
  }

  @Override
  public void injectMembers(ScheduleFragment instance) {
    injectAnalyticsHelper(instance, analyticsHelperProvider.get());
    injectTagViewPool(instance, tagViewPoolProvider.get());
    injectSearchScheduleFeatureEnabled(instance, searchScheduleFeatureEnabledProvider.get());
    injectSnackbarMessageManager(instance, snackbarMessageManagerProvider.get());
  }

  @InjectedFieldSignature("com.google.samples.apps.iosched.ui.schedule.ScheduleFragment.analyticsHelper")
  public static void injectAnalyticsHelper(ScheduleFragment instance,
      AnalyticsHelper analyticsHelper) {
    instance.analyticsHelper = analyticsHelper;
  }

  @InjectedFieldSignature("com.google.samples.apps.iosched.ui.schedule.ScheduleFragment.tagViewPool")
  @Named("tagViewPool")
  public static void injectTagViewPool(ScheduleFragment instance,
      RecyclerView.RecycledViewPool tagViewPool) {
    instance.tagViewPool = tagViewPool;
  }

  @InjectedFieldSignature("com.google.samples.apps.iosched.ui.schedule.ScheduleFragment.searchScheduleFeatureEnabled")
  @SearchScheduleEnabledFlag
  public static void injectSearchScheduleFeatureEnabled(ScheduleFragment instance,
      boolean searchScheduleFeatureEnabled) {
    instance.searchScheduleFeatureEnabled = searchScheduleFeatureEnabled;
  }

  @InjectedFieldSignature("com.google.samples.apps.iosched.ui.schedule.ScheduleFragment.snackbarMessageManager")
  public static void injectSnackbarMessageManager(ScheduleFragment instance,
      SnackbarMessageManager snackbarMessageManager) {
    instance.snackbarMessageManager = snackbarMessageManager;
  }
}
