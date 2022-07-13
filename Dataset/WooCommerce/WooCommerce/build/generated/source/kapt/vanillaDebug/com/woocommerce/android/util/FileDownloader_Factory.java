// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.util;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class FileDownloader_Factory implements Factory<FileDownloader> {
  private final Provider<CoroutineDispatchers> dispatchersProvider;

  public FileDownloader_Factory(Provider<CoroutineDispatchers> dispatchersProvider) {
    this.dispatchersProvider = dispatchersProvider;
  }

  @Override
  public FileDownloader get() {
    return newInstance(dispatchersProvider.get());
  }

  public static FileDownloader_Factory create(Provider<CoroutineDispatchers> dispatchersProvider) {
    return new FileDownloader_Factory(dispatchersProvider);
  }

  public static FileDownloader newInstance(CoroutineDispatchers dispatchers) {
    return new FileDownloader(dispatchers);
  }
}