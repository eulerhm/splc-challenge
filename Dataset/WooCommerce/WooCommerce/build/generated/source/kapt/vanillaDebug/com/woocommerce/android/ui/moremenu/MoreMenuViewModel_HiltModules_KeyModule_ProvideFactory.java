// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.ui.moremenu;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MoreMenuViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static MoreMenuViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(MoreMenuViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final MoreMenuViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new MoreMenuViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}