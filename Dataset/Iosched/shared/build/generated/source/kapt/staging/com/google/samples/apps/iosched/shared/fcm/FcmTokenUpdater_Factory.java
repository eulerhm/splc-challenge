package com.google.samples.apps.iosched.shared.fcm;

import com.google.firebase.firestore.FirebaseFirestore;
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
public final class FcmTokenUpdater_Factory implements Factory<FcmTokenUpdater> {
  private final Provider<CoroutineScope> externalScopeProvider;

  private final Provider<CoroutineDispatcher> mainDispatcherProvider;

  private final Provider<FirebaseFirestore> firestoreProvider;

  public FcmTokenUpdater_Factory(Provider<CoroutineScope> externalScopeProvider,
      Provider<CoroutineDispatcher> mainDispatcherProvider,
      Provider<FirebaseFirestore> firestoreProvider) {
    this.externalScopeProvider = externalScopeProvider;
    this.mainDispatcherProvider = mainDispatcherProvider;
    this.firestoreProvider = firestoreProvider;
  }

  @Override
  public FcmTokenUpdater get() {
    return newInstance(externalScopeProvider.get(), mainDispatcherProvider.get(), firestoreProvider.get());
  }

  public static FcmTokenUpdater_Factory create(Provider<CoroutineScope> externalScopeProvider,
      Provider<CoroutineDispatcher> mainDispatcherProvider,
      Provider<FirebaseFirestore> firestoreProvider) {
    return new FcmTokenUpdater_Factory(externalScopeProvider, mainDispatcherProvider, firestoreProvider);
  }

  public static FcmTokenUpdater newInstance(CoroutineScope externalScope,
      CoroutineDispatcher mainDispatcher, FirebaseFirestore firestore) {
    return new FcmTokenUpdater(externalScope, mainDispatcher, firestore);
  }
}
