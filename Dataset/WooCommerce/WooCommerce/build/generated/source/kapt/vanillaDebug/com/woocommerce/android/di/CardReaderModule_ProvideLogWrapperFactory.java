// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.di;

import com.woocommerce.android.cardreader.LogWrapper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CardReaderModule_ProvideLogWrapperFactory implements Factory<LogWrapper> {
  private final CardReaderModule module;

  public CardReaderModule_ProvideLogWrapperFactory(CardReaderModule module) {
    this.module = module;
  }

  @Override
  public LogWrapper get() {
    return provideLogWrapper(module);
  }

  public static CardReaderModule_ProvideLogWrapperFactory create(CardReaderModule module) {
    return new CardReaderModule_ProvideLogWrapperFactory(module);
  }

  public static LogWrapper provideLogWrapper(CardReaderModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideLogWrapper());
  }
}