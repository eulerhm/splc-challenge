package com.google.samples.apps.iosched.di;

import android.content.Context;
import android.net.ConnectivityManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class AppModule_ProvideConnectivityManagerFactory implements Factory<ConnectivityManager> {
  private final AppModule module;

  private final Provider<Context> contextProvider;

  public AppModule_ProvideConnectivityManagerFactory(AppModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public ConnectivityManager get() {
    return provideConnectivityManager(module, contextProvider.get());
  }

  public static AppModule_ProvideConnectivityManagerFactory create(AppModule module,
      Provider<Context> contextProvider) {
    return new AppModule_ProvideConnectivityManagerFactory(module, contextProvider);
  }

  public static ConnectivityManager provideConnectivityManager(AppModule instance,
      Context context) {
    return Preconditions.checkNotNull(instance.provideConnectivityManager(context), "Cannot return null from a non-@Nullable @Provides method");
  }
}
