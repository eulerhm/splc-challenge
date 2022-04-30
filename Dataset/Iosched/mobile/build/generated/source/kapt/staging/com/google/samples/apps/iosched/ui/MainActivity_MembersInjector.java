package com.google.samples.apps.iosched.ui;

import android.net.ConnectivityManager;
import com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper;
import com.google.samples.apps.iosched.shared.di.CodelabsEnabledFlag;
import com.google.samples.apps.iosched.shared.di.ExploreArEnabledFlag;
import com.google.samples.apps.iosched.shared.di.MapFeatureEnabledFlag;
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
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<SnackbarMessageManager> snackbarMessageManagerProvider;

  private final Provider<ConnectivityManager> connectivityManagerProvider;

  private final Provider<AnalyticsHelper> analyticsHelperProvider;

  private final Provider<Boolean> mapFeatureEnabledProvider;

  private final Provider<Boolean> codelabsFeatureEnabledProvider;

  private final Provider<Boolean> exploreArFeatureEnabledProvider;

  public MainActivity_MembersInjector(
      Provider<SnackbarMessageManager> snackbarMessageManagerProvider,
      Provider<ConnectivityManager> connectivityManagerProvider,
      Provider<AnalyticsHelper> analyticsHelperProvider,
      Provider<Boolean> mapFeatureEnabledProvider, Provider<Boolean> codelabsFeatureEnabledProvider,
      Provider<Boolean> exploreArFeatureEnabledProvider) {
    this.snackbarMessageManagerProvider = snackbarMessageManagerProvider;
    this.connectivityManagerProvider = connectivityManagerProvider;
    this.analyticsHelperProvider = analyticsHelperProvider;
    this.mapFeatureEnabledProvider = mapFeatureEnabledProvider;
    this.codelabsFeatureEnabledProvider = codelabsFeatureEnabledProvider;
    this.exploreArFeatureEnabledProvider = exploreArFeatureEnabledProvider;
  }

  public static MembersInjector<MainActivity> create(
      Provider<SnackbarMessageManager> snackbarMessageManagerProvider,
      Provider<ConnectivityManager> connectivityManagerProvider,
      Provider<AnalyticsHelper> analyticsHelperProvider,
      Provider<Boolean> mapFeatureEnabledProvider, Provider<Boolean> codelabsFeatureEnabledProvider,
      Provider<Boolean> exploreArFeatureEnabledProvider) {
    return new MainActivity_MembersInjector(snackbarMessageManagerProvider, connectivityManagerProvider, analyticsHelperProvider, mapFeatureEnabledProvider, codelabsFeatureEnabledProvider, exploreArFeatureEnabledProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    injectSnackbarMessageManager(instance, snackbarMessageManagerProvider.get());
    injectConnectivityManager(instance, connectivityManagerProvider.get());
    injectAnalyticsHelper(instance, analyticsHelperProvider.get());
    injectMapFeatureEnabled(instance, mapFeatureEnabledProvider.get());
    injectCodelabsFeatureEnabled(instance, codelabsFeatureEnabledProvider.get());
    injectExploreArFeatureEnabled(instance, exploreArFeatureEnabledProvider.get());
  }

  @InjectedFieldSignature("com.google.samples.apps.iosched.ui.MainActivity.snackbarMessageManager")
  public static void injectSnackbarMessageManager(MainActivity instance,
      SnackbarMessageManager snackbarMessageManager) {
    instance.snackbarMessageManager = snackbarMessageManager;
  }

  @InjectedFieldSignature("com.google.samples.apps.iosched.ui.MainActivity.connectivityManager")
  public static void injectConnectivityManager(MainActivity instance,
      ConnectivityManager connectivityManager) {
    instance.connectivityManager = connectivityManager;
  }

  @InjectedFieldSignature("com.google.samples.apps.iosched.ui.MainActivity.analyticsHelper")
  public static void injectAnalyticsHelper(MainActivity instance, AnalyticsHelper analyticsHelper) {
    instance.analyticsHelper = analyticsHelper;
  }

  @InjectedFieldSignature("com.google.samples.apps.iosched.ui.MainActivity.mapFeatureEnabled")
  @MapFeatureEnabledFlag
  public static void injectMapFeatureEnabled(MainActivity instance, boolean mapFeatureEnabled) {
    instance.mapFeatureEnabled = mapFeatureEnabled;
  }

  @InjectedFieldSignature("com.google.samples.apps.iosched.ui.MainActivity.codelabsFeatureEnabled")
  @CodelabsEnabledFlag
  public static void injectCodelabsFeatureEnabled(MainActivity instance,
      boolean codelabsFeatureEnabled) {
    instance.codelabsFeatureEnabled = codelabsFeatureEnabled;
  }

  @InjectedFieldSignature("com.google.samples.apps.iosched.ui.MainActivity.exploreArFeatureEnabled")
  @ExploreArEnabledFlag
  public static void injectExploreArFeatureEnabled(MainActivity instance,
      boolean exploreArFeatureEnabled) {
    instance.exploreArFeatureEnabled = exploreArFeatureEnabled;
  }
}
