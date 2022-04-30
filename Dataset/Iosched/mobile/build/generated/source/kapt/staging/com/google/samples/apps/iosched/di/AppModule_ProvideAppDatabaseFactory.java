package com.google.samples.apps.iosched.di;

import android.content.Context;
import com.google.samples.apps.iosched.shared.data.db.AppDatabase;
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
public final class AppModule_ProvideAppDatabaseFactory implements Factory<AppDatabase> {
  private final AppModule module;

  private final Provider<Context> contextProvider;

  public AppModule_ProvideAppDatabaseFactory(AppModule module, Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public AppDatabase get() {
    return provideAppDatabase(module, contextProvider.get());
  }

  public static AppModule_ProvideAppDatabaseFactory create(AppModule module,
      Provider<Context> contextProvider) {
    return new AppModule_ProvideAppDatabaseFactory(module, contextProvider);
  }

  public static AppDatabase provideAppDatabase(AppModule instance, Context context) {
    return Preconditions.checkNotNull(instance.provideAppDatabase(context), "Cannot return null from a non-@Nullable @Provides method");
  }
}
