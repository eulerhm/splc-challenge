package com.google.samples.apps.iosched.shared.domain.auth;

import com.google.samples.apps.iosched.shared.data.signin.datasources.AuthStateUserDataSource;
import com.google.samples.apps.iosched.shared.data.signin.datasources.RegisteredUserDataSource;
import com.google.samples.apps.iosched.shared.fcm.TopicSubscriber;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ObserveUserAuthStateUseCase_Factory implements Factory<ObserveUserAuthStateUseCase> {
  private final Provider<RegisteredUserDataSource> registeredUserDataSourceProvider;

  private final Provider<AuthStateUserDataSource> authStateUserDataSourceProvider;

  private final Provider<TopicSubscriber> topicSubscriberProvider;

  private final Provider<CoroutineScope> externalScopeProvider;

  private final Provider<CoroutineDispatcher> ioDispatcherProvider;

  public ObserveUserAuthStateUseCase_Factory(
      Provider<RegisteredUserDataSource> registeredUserDataSourceProvider,
      Provider<AuthStateUserDataSource> authStateUserDataSourceProvider,
      Provider<TopicSubscriber> topicSubscriberProvider,
      Provider<CoroutineScope> externalScopeProvider,
      Provider<CoroutineDispatcher> ioDispatcherProvider) {
    this.registeredUserDataSourceProvider = registeredUserDataSourceProvider;
    this.authStateUserDataSourceProvider = authStateUserDataSourceProvider;
    this.topicSubscriberProvider = topicSubscriberProvider;
    this.externalScopeProvider = externalScopeProvider;
    this.ioDispatcherProvider = ioDispatcherProvider;
  }

  @Override
  public ObserveUserAuthStateUseCase get() {
    return newInstance(registeredUserDataSourceProvider.get(), authStateUserDataSourceProvider.get(), topicSubscriberProvider.get(), externalScopeProvider.get(), ioDispatcherProvider.get());
  }

  public static ObserveUserAuthStateUseCase_Factory create(
      Provider<RegisteredUserDataSource> registeredUserDataSourceProvider,
      Provider<AuthStateUserDataSource> authStateUserDataSourceProvider,
      Provider<TopicSubscriber> topicSubscriberProvider,
      Provider<CoroutineScope> externalScopeProvider,
      Provider<CoroutineDispatcher> ioDispatcherProvider) {
    return new ObserveUserAuthStateUseCase_Factory(registeredUserDataSourceProvider, authStateUserDataSourceProvider, topicSubscriberProvider, externalScopeProvider, ioDispatcherProvider);
  }

  public static ObserveUserAuthStateUseCase newInstance(
      RegisteredUserDataSource registeredUserDataSource,
      AuthStateUserDataSource authStateUserDataSource, TopicSubscriber topicSubscriber,
      CoroutineScope externalScope, CoroutineDispatcher ioDispatcher) {
    return new ObserveUserAuthStateUseCase(registeredUserDataSource, authStateUserDataSource, topicSubscriber, externalScope, ioDispatcher);
  }
}
