package com.google.samples.apps.iosched.shared.di;

import com.google.samples.apps.iosched.shared.data.feedback.FeedbackEndpoint;
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
public final class SharedModule_ProvideFeedbackEndpointFactory implements Factory<FeedbackEndpoint> {
  private final SharedModule module;

  public SharedModule_ProvideFeedbackEndpointFactory(SharedModule module) {
    this.module = module;
  }

  @Override
  public FeedbackEndpoint get() {
    return provideFeedbackEndpoint(module);
  }

  public static SharedModule_ProvideFeedbackEndpointFactory create(SharedModule module) {
    return new SharedModule_ProvideFeedbackEndpointFactory(module);
  }

  public static FeedbackEndpoint provideFeedbackEndpoint(SharedModule instance) {
    return Preconditions.checkNotNull(instance.provideFeedbackEndpoint(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
