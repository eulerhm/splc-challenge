package com.google.samples.apps.iosched.shared.data;

import android.content.Context;
import com.google.samples.apps.iosched.shared.util.NetworkUtils;
import dagger.internal.Factory;
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
public final class NetworkConferenceDataSource_Factory implements Factory<NetworkConferenceDataSource> {
  private final Provider<Context> contextProvider;

  private final Provider<NetworkUtils> networkUtilsProvider;

  public NetworkConferenceDataSource_Factory(Provider<Context> contextProvider,
      Provider<NetworkUtils> networkUtilsProvider) {
    this.contextProvider = contextProvider;
    this.networkUtilsProvider = networkUtilsProvider;
  }

  @Override
  public NetworkConferenceDataSource get() {
    return newInstance(contextProvider.get(), networkUtilsProvider.get());
  }

  public static NetworkConferenceDataSource_Factory create(Provider<Context> contextProvider,
      Provider<NetworkUtils> networkUtilsProvider) {
    return new NetworkConferenceDataSource_Factory(contextProvider, networkUtilsProvider);
  }

  public static NetworkConferenceDataSource newInstance(Context context,
      NetworkUtils networkUtils) {
    return new NetworkConferenceDataSource(context, networkUtils);
  }
}
