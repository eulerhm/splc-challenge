// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.media;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class FileUtils_Factory implements Factory<FileUtils> {
  @Override
  public FileUtils get() {
    return newInstance();
  }

  public static FileUtils_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static FileUtils newInstance() {
    return new FileUtils();
  }

  private static final class InstanceHolder {
    private static final FileUtils_Factory INSTANCE = new FileUtils_Factory();
  }
}