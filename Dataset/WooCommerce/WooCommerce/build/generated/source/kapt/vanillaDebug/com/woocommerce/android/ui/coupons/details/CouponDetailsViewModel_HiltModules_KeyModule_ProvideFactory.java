// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.ui.coupons.details;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CouponDetailsViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static CouponDetailsViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(CouponDetailsViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final CouponDetailsViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new CouponDetailsViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}