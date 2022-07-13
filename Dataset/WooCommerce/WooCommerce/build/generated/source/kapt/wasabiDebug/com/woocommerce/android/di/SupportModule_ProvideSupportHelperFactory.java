// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.di;

import com.woocommerce.android.support.SupportHelper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SupportModule_ProvideSupportHelperFactory implements Factory<SupportHelper> {
  private final SupportModule module;

  public SupportModule_ProvideSupportHelperFactory(SupportModule module) {
    this.module = module;
  }

  @Override
  public SupportHelper get() {
    return provideSupportHelper(module);
  }

  public static SupportModule_ProvideSupportHelperFactory create(SupportModule module) {
    return new SupportModule_ProvideSupportHelperFactory(module);
  }

  public static SupportHelper provideSupportHelper(SupportModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideSupportHelper());
  }
}