// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.ui.cardreader.connect;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CardReaderConnectViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static CardReaderConnectViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(CardReaderConnectViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final CardReaderConnectViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new CardReaderConnectViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}