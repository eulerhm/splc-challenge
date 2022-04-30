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
public final class FirestoreAnnouncementDataSource_Factory implements Factory<FirestoreAnnouncementDataSource> {
  private final Provider<FirebaseFirestore> firestoreProvider;

  public FirestoreAnnouncementDataSource_Factory(Provider<FirebaseFirestore> firestoreProvider) {
    this.firestoreProvider = firestoreProvider;
  }

  @Override
  public FirestoreAnnouncementDataSource get() {
    return newInstance(firestoreProvider.get());
  }

  public static FirestoreAnnouncementDataSource_Factory create(
      Provider<FirebaseFirestore> firestoreProvider) {
    return new FirestoreAnnouncementDataSource_Factory(firestoreProvider);
  }

  public static FirestoreAnnouncementDataSource newInstance(FirebaseFirestore firestore) {
    return new FirestoreAnnouncementDataSource(firestore);
  }
}
