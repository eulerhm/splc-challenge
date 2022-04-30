package com.google.samples.apps.iosched.shared.data.signin.datasources;

import com.google.firebase.firestore.FirebaseFirestore;
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
public final class FirestoreRegisteredUserDataSource_Factory implements Factory<FirestoreRegisteredUserDataSource> {
  private final Provider<FirebaseFirestore> firestoreProvider;

  public FirestoreRegisteredUserDataSource_Factory(Provider<FirebaseFirestore> firestoreProvider) {
    this.firestoreProvider = firestoreProvider;
  }

  @Override
  public FirestoreRegisteredUserDataSource get() {
    return newInstance(firestoreProvider.get());
  }

  public static FirestoreRegisteredUserDataSource_Factory create(
      Provider<FirebaseFirestore> firestoreProvider) {
    return new FirestoreRegisteredUserDataSource_Factory(firestoreProvider);
  }

  public static FirestoreRegisteredUserDataSource newInstance(FirebaseFirestore firestore) {
    return new FirestoreRegisteredUserDataSource(firestore);
  }
}
