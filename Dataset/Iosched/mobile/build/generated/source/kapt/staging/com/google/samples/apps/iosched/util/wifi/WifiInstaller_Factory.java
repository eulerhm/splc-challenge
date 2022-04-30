package com.google.samples.apps.iosched.util.wifi;

import android.content.ClipboardManager;
import android.net.wifi.WifiManager;
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
public final class WifiInstaller_Factory implements Factory<WifiInstaller> {
  private final Provider<WifiManager> wifiManagerProvider;

  private final Provider<ClipboardManager> clipboardManagerProvider;

  public WifiInstaller_Factory(Provider<WifiManager> wifiManagerProvider,
      Provider<ClipboardManager> clipboardManagerProvider) {
    this.wifiManagerProvider = wifiManagerProvider;
    this.clipboardManagerProvider = clipboardManagerProvider;
  }

  @Override
  public WifiInstaller get() {
    return newInstance(wifiManagerProvider.get(), clipboardManagerProvider.get());
  }

  public static WifiInstaller_Factory create(Provider<WifiManager> wifiManagerProvider,
      Provider<ClipboardManager> clipboardManagerProvider) {
    return new WifiInstaller_Factory(wifiManagerProvider, clipboardManagerProvider);
  }

  public static WifiInstaller newInstance(WifiManager wifiManager,
      ClipboardManager clipboardManager) {
    return new WifiInstaller(wifiManager, clipboardManager);
  }
}
