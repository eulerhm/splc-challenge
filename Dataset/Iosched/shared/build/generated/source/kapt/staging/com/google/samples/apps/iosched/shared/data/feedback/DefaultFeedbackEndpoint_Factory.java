package com.google.samples.apps.iosched.shared.data.feedback;

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
public final class DefaultFeedbackEndpoint_Factory implements Factory<DefaultFeedbackEndpoint> {
  private final Provider<FirebaseFunctions> functionsProvider;

  public DefaultFeedbackEndpoint_Factory(Provider<FirebaseFunctions> functionsProvider) {
    this.functionsProvider = functionsProvider;
  }

  @Override
  public DefaultFeedbackEndpoint get() {
    return newInstance(functionsProvider.get());
  }

  public static DefaultFeedbackEndpoint_Factory create(
      Provider<FirebaseFunctions> functionsProvider) {
    return new DefaultFeedbackEndpoint_Factory(functionsProvider);
  }

  public static DefaultFeedbackEndpoint newInstance(FirebaseFunctions functions) {
    return new DefaultFeedbackEndpoint(functions);
  }
}
