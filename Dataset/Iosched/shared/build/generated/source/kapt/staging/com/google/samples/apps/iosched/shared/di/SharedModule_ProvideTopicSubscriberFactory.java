package com.google.samples.apps.iosched.shared.di;

import com.google.samples.apps.iosched.shared.fcm.TopicSubscriber;
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
public final class SharedModule_ProvideTopicSubscriberFactory implements Factory<TopicSubscriber> {
  private final SharedModule module;

  public SharedModule_ProvideTopicSubscriberFactory(SharedModule module) {
    this.module = module;
  }

  @Override
  public TopicSubscriber get() {
    return provideTopicSubscriber(module);
  }

  public static SharedModule_ProvideTopicSubscriberFactory create(SharedModule module) {
    return new SharedModule_ProvideTopicSubscriberFactory(module);
  }

  public static TopicSubscriber provideTopicSubscriber(SharedModule instance) {
    return Preconditions.checkNotNull(instance.provideTopicSubscriber(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
