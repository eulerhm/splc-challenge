package com.google.samples.apps.iosched.shared.data.signin.datasources;

import com.google.firebase.auth.FirebaseAuth;
import com.google.samples.apps.iosched.shared.domain.sessions.NotificationAlarmUpdater;
import com.google.samples.apps.iosched.shared.fcm.FcmTokenUpdater;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class FirebaseAuthStateUserDataSource_Factory implements Factory<FirebaseAuthStateUserDataSource> {
  private final Provider<FirebaseAuth> firebaseProvider;

  private final Provider<FcmTokenUpdater> tokenUpdaterProvider;

  private final Provider<NotificationAlarmUpdater> notificationAlarmUpdaterProvider;

  private final Provider<CoroutineDispatcher> ioDispatcherProvider;

  public FirebaseAuthStateUserDataSource_Factory(Provider<FirebaseAuth> firebaseProvider,
      Provider<FcmTokenUpdater> tokenUpdaterProvider,
      Provider<NotificationAlarmUpdater> notificationAlarmUpdaterProvider,
      Provider<CoroutineDispatcher> ioDispatcherProvider) {
    this.firebaseProvider = firebaseProvider;
    this.tokenUpdaterProvider = tokenUpdaterProvider;
    this.notificationAlarmUpdaterProvider = notificationAlarmUpdaterProvider;
    this.ioDispatcherProvider = ioDispatcherProvider;
  }

  @Override
  public FirebaseAuthStateUserDataSource get() {
    return newInstance(firebaseProvider.get(), tokenUpdaterProvider.get(), notificationAlarmUpdaterProvider.get(), ioDispatcherProvider.get());
  }

  public static FirebaseAuthStateUserDataSource_Factory create(
      Provider<FirebaseAuth> firebaseProvider, Provider<FcmTokenUpdater> tokenUpdaterProvider,
      Provider<NotificationAlarmUpdater> notificationAlarmUpdaterProvider,
      Provider<CoroutineDispatcher> ioDispatcherProvider) {
    return new FirebaseAuthStateUserDataSource_Factory(firebaseProvider, tokenUpdaterProvider, notificationAlarmUpdaterProvider, ioDispatcherProvider);
  }

  public static FirebaseAuthStateUserDataSource newInstance(FirebaseAuth firebase,
      FcmTokenUpdater tokenUpdater, NotificationAlarmUpdater notificationAlarmUpdater,
      CoroutineDispatcher ioDispatcher) {
    return new FirebaseAuthStateUserDataSource(firebase, tokenUpdater, notificationAlarmUpdater, ioDispatcher);
  }
}
