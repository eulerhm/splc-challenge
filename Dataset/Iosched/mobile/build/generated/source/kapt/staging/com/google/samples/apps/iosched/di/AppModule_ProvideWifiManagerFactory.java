package com.google.samples.apps.iosched.di;

import android.content.Context;
import android.net.wifi.WifiManager;
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
public final class AppModule_ProvideWifiManagerFactory implements Factory<WifiManager> {
  private final AppModule module;

  private final Provider<Context> contextProvider;

  public AppModule_ProvideWifiManagerFactory(AppModule module, Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public WifiManager get() {
    return provideWifiManager(module, contextProvider.get());
  }

  public static AppModule_ProvideWifiManagerFactory create(AppModule module,
      Provider<Context> contextProvider) {
    return new AppModule_ProvideWifiManagerFactory(module, contextProvider);
  }

  public static WifiManager provideWifiManager(AppModule instance, Context context) {
    return Preconditions.checkNotNull(instance.provideWifiManager(context), "Cannot return null from a non-@Nullable @Provides method");
  }
}
