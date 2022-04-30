package com.google.samples.apps.iosched.shared.data.ar;

import com.google.firebase.functions.FirebaseFunctions;
import dagger.internal.Factory;
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
public final class DefaultArDebugFlagEndpoint_Factory implements Factory<DefaultArDebugFlagEndpoint> {
  private final Provider<FirebaseFunctions> functionsProvider;

  public DefaultArDebugFlagEndpoint_Factory(Provider<FirebaseFunctions> functionsProvider) {
    this.functionsProvider = functionsProvider;
  }

  @Override
  public DefaultArDebugFlagEndpoint get() {
    return newInstance(functionsProvider.get());
  }

  public static DefaultArDebugFlagEndpoint_Factory create(
      Provider<FirebaseFunctions> functionsProvider) {
    return new DefaultArDebugFlagEndpoint_Factory(functionsProvider);
  }

  public static DefaultArDebugFlagEndpoint newInstance(FirebaseFunctions functions) {
    return new DefaultArDebugFlagEndpoint(functions);
  }
}
