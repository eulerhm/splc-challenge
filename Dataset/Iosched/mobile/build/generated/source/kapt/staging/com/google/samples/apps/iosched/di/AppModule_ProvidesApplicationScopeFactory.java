package com.google.samples.apps.iosched.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvidesApplicationScopeFactory implements Factory<CoroutineScope> {
  private final AppModule module;

  private final Provider<CoroutineDispatcher> defaultDispatcherProvider;

  public AppModule_ProvidesApplicationScopeFactory(AppModule module,
      Provider<CoroutineDispatcher> defaultDispatcherProvider) {
    this.module = module;
    this.defaultDispatcherProvider = defaultDispatcherProvider;
  }

  @Override
  public CoroutineScope get() {
    return providesApplicationScope(module, defaultDispatcherProvider.get());
  }

  public static AppModule_ProvidesApplicationScopeFactory create(AppModule module,
      Provider<CoroutineDispatcher> defaultDispatcherProvider) {
    return new AppModule_ProvidesApplicationScopeFactory(module, defaultDispatcherProvider);
  }

  public static CoroutineScope providesApplicationScope(AppModule instance,
      CoroutineDispatcher defaultDispatcher) {
    return Preconditions.checkNotNull(instance.providesApplicationScope(defaultDispatcher), "Cannot return null from a non-@Nullable @Provides method");
  }
}
