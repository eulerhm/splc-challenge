package com.google.samples.apps.iosched.shared.data.feed;

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
public final class FirestoreMomentDataSource_Factory implements Factory<FirestoreMomentDataSource> {
  private final Provider<FirebaseFirestore> firestoreProvider;

  public FirestoreMomentDataSource_Factory(Provider<FirebaseFirestore> firestoreProvider) {
    this.firestoreProvider = firestoreProvider;
  }

  @Override
  public FirestoreMomentDataSource get() {
    return newInstance(firestoreProvider.get());
  }

  public static FirestoreMomentDataSource_Factory create(
      Provider<FirebaseFirestore> firestoreProvider) {
    return new FirestoreMomentDataSource_Factory(firestoreProvider);
  }

  public static FirestoreMomentDataSource newInstance(FirebaseFirestore firestore) {
    return new FirestoreMomentDataSource(firestore);
  }
}
