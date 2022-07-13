// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import okhttp3.Interceptor;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class InterceptorModule_ProvideNetworkInterceptorFactory implements Factory<Interceptor> {
  private final InterceptorModule module;

  public InterceptorModule_ProvideNetworkInterceptorFactory(InterceptorModule module) {
    this.module = module;
  }

  @Override
  public Interceptor get() {
    return provideNetworkInterceptor(module);
  }

  public static InterceptorModule_ProvideNetworkInterceptorFactory create(
      InterceptorModule module) {
    return new InterceptorModule_ProvideNetworkInterceptorFactory(module);
  }

  public static Interceptor provideNetworkInterceptor(InterceptorModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideNetworkInterceptor());
  }
}