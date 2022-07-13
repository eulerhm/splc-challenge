// Generated by Dagger (https://dagger.dev).
package com.google.android.gnd.persistence.mbtiles;

import com.google.android.gnd.persistence.uuid.OfflineUuidGenerator;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MbtilesFootprintParser_Factory implements Factory<MbtilesFootprintParser> {
  private final Provider<OfflineUuidGenerator> uuidGeneratorProvider;

  public MbtilesFootprintParser_Factory(Provider<OfflineUuidGenerator> uuidGeneratorProvider) {
    this.uuidGeneratorProvider = uuidGeneratorProvider;
  }

  @Override
  public MbtilesFootprintParser get() {
    return newInstance(uuidGeneratorProvider.get());
  }

  public static MbtilesFootprintParser_Factory create(
      Provider<OfflineUuidGenerator> uuidGeneratorProvider) {
    return new MbtilesFootprintParser_Factory(uuidGeneratorProvider);
  }

  public static MbtilesFootprintParser newInstance(OfflineUuidGenerator uuidGenerator) {
    return new MbtilesFootprintParser(uuidGenerator);
  }
}