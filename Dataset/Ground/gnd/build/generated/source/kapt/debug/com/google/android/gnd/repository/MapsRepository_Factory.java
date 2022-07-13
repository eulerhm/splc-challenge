// Generated by Dagger (https://dagger.dev).
package com.google.android.gnd.repository;

import com.google.android.gnd.persistence.local.LocalValueStore;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MapsRepository_Factory implements Factory<MapsRepository> {
  private final Provider<LocalValueStore> localValueStoreProvider;

  public MapsRepository_Factory(Provider<LocalValueStore> localValueStoreProvider) {
    this.localValueStoreProvider = localValueStoreProvider;
  }

  @Override
  public MapsRepository get() {
    return newInstance(localValueStoreProvider.get());
  }

  public static MapsRepository_Factory create(Provider<LocalValueStore> localValueStoreProvider) {
    return new MapsRepository_Factory(localValueStoreProvider);
  }

  public static MapsRepository newInstance(LocalValueStore localValueStore) {
    return new MapsRepository(localValueStore);
  }
}