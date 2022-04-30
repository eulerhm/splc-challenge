package com.google.samples.apps.iosched.shared.util;

import android.content.Context;
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
public final class NetworkUtils_Factory implements Factory<NetworkUtils> {
  private final Provider<Context> contextProvider;

  public NetworkUtils_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public NetworkUtils get() {
    return newInstance(contextProvider.get());
  }

  public static NetworkUtils_Factory create(Provider<Context> contextProvider) {
    return new NetworkUtils_Factory(contextProvider);
  }

  public static NetworkUtils newInstance(Context context) {
    return new NetworkUtils(context);
  }
}
