package com.google.samples.apps.iosched.di;

import android.content.ClipboardManager;
import android.content.Context;
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
public final class AppModule_ProvideClipboardManagerFactory implements Factory<ClipboardManager> {
  private final AppModule module;

  private final Provider<Context> contextProvider;

  public AppModule_ProvideClipboardManagerFactory(AppModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public ClipboardManager get() {
    return provideClipboardManager(module, contextProvider.get());
  }

  public static AppModule_ProvideClipboardManagerFactory create(AppModule module,
      Provider<Context> contextProvider) {
    return new AppModule_ProvideClipboardManagerFactory(module, contextProvider);
  }

  public static ClipboardManager provideClipboardManager(AppModule instance, Context context) {
    return Preconditions.checkNotNull(instance.provideClipboardManager(context), "Cannot return null from a non-@Nullable @Provides method");
  }
}
