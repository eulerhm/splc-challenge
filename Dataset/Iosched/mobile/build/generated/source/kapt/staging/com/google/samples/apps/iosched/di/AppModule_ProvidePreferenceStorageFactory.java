package com.google.samples.apps.iosched.di;

import android.content.Context;
import com.google.samples.apps.iosched.shared.data.prefs.PreferenceStorage;
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
public final class AppModule_ProvidePreferenceStorageFactory implements Factory<PreferenceStorage> {
  private final AppModule module;

  private final Provider<Context> contextProvider;

  public AppModule_ProvidePreferenceStorageFactory(AppModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public PreferenceStorage get() {
    return providePreferenceStorage(module, contextProvider.get());
  }

  public static AppModule_ProvidePreferenceStorageFactory create(AppModule module,
      Provider<Context> contextProvider) {
    return new AppModule_ProvidePreferenceStorageFactory(module, contextProvider);
  }

  public static PreferenceStorage providePreferenceStorage(AppModule instance, Context context) {
    return Preconditions.checkNotNull(instance.providePreferenceStorage(context), "Cannot return null from a non-@Nullable @Provides method");
  }
}
