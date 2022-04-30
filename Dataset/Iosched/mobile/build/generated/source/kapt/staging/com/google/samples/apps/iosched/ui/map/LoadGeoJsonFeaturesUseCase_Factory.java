package com.google.samples.apps.iosched.ui.map;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LoadGeoJsonFeaturesUseCase_Factory implements Factory<LoadGeoJsonFeaturesUseCase> {
  private final Provider<Context> contextProvider;

  private final Provider<CoroutineDispatcher> dispatcherProvider;

  public LoadGeoJsonFeaturesUseCase_Factory(Provider<Context> contextProvider,
      Provider<CoroutineDispatcher> dispatcherProvider) {
    this.contextProvider = contextProvider;
    this.dispatcherProvider = dispatcherProvider;
  }

  @Override
  public LoadGeoJsonFeaturesUseCase get() {
    return newInstance(contextProvider.get(), dispatcherProvider.get());
  }

  public static LoadGeoJsonFeaturesUseCase_Factory create(Provider<Context> contextProvider,
      Provider<CoroutineDispatcher> dispatcherProvider) {
    return new LoadGeoJsonFeaturesUseCase_Factory(contextProvider, dispatcherProvider);
  }

  public static LoadGeoJsonFeaturesUseCase newInstance(Context context,
      CoroutineDispatcher dispatcher) {
    return new LoadGeoJsonFeaturesUseCase(context, dispatcher);
  }
}
