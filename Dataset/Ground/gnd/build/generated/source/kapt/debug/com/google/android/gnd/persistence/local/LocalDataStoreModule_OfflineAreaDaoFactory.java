// Generated by Dagger (https://dagger.dev).
package com.google.android.gnd.persistence.local;

import com.google.android.gnd.persistence.local.room.LocalDatabase;
import com.google.android.gnd.persistence.local.room.dao.OfflineAreaDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LocalDataStoreModule_OfflineAreaDaoFactory implements Factory<OfflineAreaDao> {
  private final Provider<LocalDatabase> localDatabaseProvider;

  public LocalDataStoreModule_OfflineAreaDaoFactory(Provider<LocalDatabase> localDatabaseProvider) {
    this.localDatabaseProvider = localDatabaseProvider;
  }

  @Override
  public OfflineAreaDao get() {
    return offlineAreaDao(localDatabaseProvider.get());
  }

  public static LocalDataStoreModule_OfflineAreaDaoFactory create(
      Provider<LocalDatabase> localDatabaseProvider) {
    return new LocalDataStoreModule_OfflineAreaDaoFactory(localDatabaseProvider);
  }

  public static OfflineAreaDao offlineAreaDao(LocalDatabase localDatabase) {
    return Preconditions.checkNotNullFromProvides(LocalDataStoreModule.offlineAreaDao(localDatabase));
  }
}