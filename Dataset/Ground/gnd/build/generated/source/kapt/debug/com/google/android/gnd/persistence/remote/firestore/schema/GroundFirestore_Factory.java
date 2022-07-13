// Generated by Dagger (https://dagger.dev).
package com.google.android.gnd.persistence.remote.firestore.schema;

import com.google.firebase.firestore.FirebaseFirestore;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GroundFirestore_Factory implements Factory<GroundFirestore> {
  private final Provider<FirebaseFirestore> dbProvider;

  public GroundFirestore_Factory(Provider<FirebaseFirestore> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public GroundFirestore get() {
    return newInstance(dbProvider.get());
  }

  public static GroundFirestore_Factory create(Provider<FirebaseFirestore> dbProvider) {
    return new GroundFirestore_Factory(dbProvider);
  }

  public static GroundFirestore newInstance(FirebaseFirestore db) {
    return new GroundFirestore(db);
  }
}