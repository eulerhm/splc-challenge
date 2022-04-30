package com.google.samples.apps.iosched.shared.di;

import com.google.samples.apps.iosched.shared.data.ar.ArDebugFlagEndpoint;
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
public final class SharedModule_ProvideArDebugFlagEndpointFactory implements Factory<ArDebugFlagEndpoint> {
  private final SharedModule module;

  public SharedModule_ProvideArDebugFlagEndpointFactory(SharedModule module) {
    this.module = module;
  }

  @Override
  public ArDebugFlagEndpoint get() {
    return provideArDebugFlagEndpoint(module);
  }

  public static SharedModule_ProvideArDebugFlagEndpointFactory create(SharedModule module) {
    return new SharedModule_ProvideArDebugFlagEndpointFactory(module);
  }

  public static ArDebugFlagEndpoint provideArDebugFlagEndpoint(SharedModule instance) {
    return Preconditions.checkNotNull(instance.provideArDebugFlagEndpoint(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
