// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.mediapicker;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MediaPickerSetupFactory_Factory implements Factory<MediaPickerSetupFactory> {
  @Override
  public MediaPickerSetupFactory get() {
    return newInstance();
  }

  public static MediaPickerSetupFactory_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static MediaPickerSetupFactory newInstance() {
    return new MediaPickerSetupFactory();
  }

  private static final class InstanceHolder {
    private static final MediaPickerSetupFactory_Factory INSTANCE = new MediaPickerSetupFactory_Factory();
  }
}