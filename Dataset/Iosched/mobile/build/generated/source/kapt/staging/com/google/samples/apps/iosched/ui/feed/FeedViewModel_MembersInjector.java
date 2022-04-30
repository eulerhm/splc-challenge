package com.google.samples.apps.iosched.ui.feed;

import com.google.samples.apps.iosched.shared.di.MapFeatureEnabledFlag;
import com.google.samples.apps.iosched.shared.di.ReservationEnabledFlag;
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
public final class FeedViewModel_MembersInjector implements MembersInjector<FeedViewModel> {
  private final Provider<Boolean> isReservationEnabledByRemoteConfigProvider;

  private final Provider<Boolean> isMapEnabledByRemoteConfigProvider;

  public FeedViewModel_MembersInjector(Provider<Boolean> isReservationEnabledByRemoteConfigProvider,
      Provider<Boolean> isMapEnabledByRemoteConfigProvider) {
    this.isReservationEnabledByRemoteConfigProvider = isReservationEnabledByRemoteConfigProvider;
    this.isMapEnabledByRemoteConfigProvider = isMapEnabledByRemoteConfigProvider;
  }

  public static MembersInjector<FeedViewModel> create(
      Provider<Boolean> isReservationEnabledByRemoteConfigProvider,
      Provider<Boolean> isMapEnabledByRemoteConfigProvider) {
    return new FeedViewModel_MembersInjector(isReservationEnabledByRemoteConfigProvider, isMapEnabledByRemoteConfigProvider);
  }

  @Override
  public void injectMembers(FeedViewModel instance) {
    injectIsReservationEnabledByRemoteConfig(instance, isReservationEnabledByRemoteConfigProvider.get());
    injectIsMapEnabledByRemoteConfig(instance, isMapEnabledByRemoteConfigProvider.get());
  }

  @InjectedFieldSignature("com.google.samples.apps.iosched.ui.feed.FeedViewModel.isReservationEnabledByRemoteConfig")
  @ReservationEnabledFlag
  public static void injectIsReservationEnabledByRemoteConfig(FeedViewModel instance,
      boolean isReservationEnabledByRemoteConfig) {
    instance.isReservationEnabledByRemoteConfig = isReservationEnabledByRemoteConfig;
  }

  @InjectedFieldSignature("com.google.samples.apps.iosched.ui.feed.FeedViewModel.isMapEnabledByRemoteConfig")
  @MapFeatureEnabledFlag
  public static void injectIsMapEnabledByRemoteConfig(FeedViewModel instance,
      boolean isMapEnabledByRemoteConfig) {
    instance.isMapEnabledByRemoteConfig = isMapEnabledByRemoteConfig;
  }
}
