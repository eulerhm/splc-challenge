package com.google.samples.apps.iosched.shared.data.userevent;

import com.google.firebase.firestore.FirebaseFirestore;
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
public final class FirestoreUserEventDataSource_Factory implements Factory<FirestoreUserEventDataSource> {
  private final Provider<FirebaseFirestore> firestoreProvider;

  private final Provider<CoroutineDispatcher> ioDispatcherProvider;

  public FirestoreUserEventDataSource_Factory(Provider<FirebaseFirestore> firestoreProvider,
      Provider<CoroutineDispatcher> ioDispatcherProvider) {
    this.firestoreProvider = firestoreProvider;
    this.ioDispatcherProvider = ioDispatcherProvider;
  }

  @Override
  public FirestoreUserEventDataSource get() {
    return newInstance(firestoreProvider.get(), ioDispatcherProvider.get());
  }

  public static FirestoreUserEventDataSource_Factory create(
      Provider<FirebaseFirestore> firestoreProvider,
      Provider<CoroutineDispatcher> ioDispatcherProvider) {
    return new FirestoreUserEventDataSource_Factory(firestoreProvider, ioDispatcherProvider);
  }

  public static FirestoreUserEventDataSource newInstance(FirebaseFirestore firestore,
      CoroutineDispatcher ioDispatcher) {
    return new FirestoreUserEventDataSource(firestore, ioDispatcher);
  }
}
