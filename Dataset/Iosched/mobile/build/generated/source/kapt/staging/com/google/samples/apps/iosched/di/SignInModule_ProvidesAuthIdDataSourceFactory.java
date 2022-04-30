package com.google.samples.apps.iosched.di;

import com.google.samples.apps.iosched.shared.data.signin.datasources.AuthIdDataSource;
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
public final class SignInModule_ProvidesAuthIdDataSourceFactory implements Factory<AuthIdDataSource> {
  private final SignInModule module;

  public SignInModule_ProvidesAuthIdDataSourceFactory(SignInModule module) {
    this.module = module;
  }

  @Override
  public AuthIdDataSource get() {
    return providesAuthIdDataSource(module);
  }

  public static SignInModule_ProvidesAuthIdDataSourceFactory create(SignInModule module) {
    return new SignInModule_ProvidesAuthIdDataSourceFactory(module);
  }

  public static AuthIdDataSource providesAuthIdDataSource(SignInModule instance) {
    return Preconditions.checkNotNull(instance.providesAuthIdDataSource(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
