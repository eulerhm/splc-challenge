package com.google.samples.apps.iosched.di;

import com.google.samples.apps.iosched.shared.domain.internal.IOSchedHandler;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideMainThreadHandlerFactory implements Factory<IOSchedHandler> {
  private final AppModule module;

  public AppModule_ProvideMainThreadHandlerFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public IOSchedHandler get() {
    return provideMainThreadHandler(module);
  }

  public static AppModule_ProvideMainThreadHandlerFactory create(AppModule module) {
    return new AppModule_ProvideMainThreadHandlerFactory(module);
  }

  public static IOSchedHandler provideMainThreadHandler(AppModule instance) {
    return Preconditions.checkNotNull(instance.provideMainThreadHandler(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
