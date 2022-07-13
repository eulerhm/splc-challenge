// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.ui.products.variations;

import com.woocommerce.android.ui.base.UIMessageResolver;
import com.woocommerce.android.util.CurrencyFormatter;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class VariationsBulkUpdatePriceFragment_MembersInjector implements MembersInjector<VariationsBulkUpdatePriceFragment> {
  private final Provider<UIMessageResolver> uiMessageResolverProvider;

  private final Provider<CurrencyFormatter> currencyFormatterProvider;

  public VariationsBulkUpdatePriceFragment_MembersInjector(
      Provider<UIMessageResolver> uiMessageResolverProvider,
      Provider<CurrencyFormatter> currencyFormatterProvider) {
    this.uiMessageResolverProvider = uiMessageResolverProvider;
    this.currencyFormatterProvider = currencyFormatterProvider;
  }

  public static MembersInjector<VariationsBulkUpdatePriceFragment> create(
      Provider<UIMessageResolver> uiMessageResolverProvider,
      Provider<CurrencyFormatter> currencyFormatterProvider) {
    return new VariationsBulkUpdatePriceFragment_MembersInjector(uiMessageResolverProvider, currencyFormatterProvider);
  }

  @Override
  public void injectMembers(VariationsBulkUpdatePriceFragment instance) {
    injectUiMessageResolver(instance, uiMessageResolverProvider.get());
    injectCurrencyFormatter(instance, currencyFormatterProvider.get());
  }

  @InjectedFieldSignature("com.woocommerce.android.ui.products.variations.VariationsBulkUpdatePriceFragment.uiMessageResolver")
  public static void injectUiMessageResolver(VariationsBulkUpdatePriceFragment instance,
      UIMessageResolver uiMessageResolver) {
    instance.uiMessageResolver = uiMessageResolver;
  }

  @InjectedFieldSignature("com.woocommerce.android.ui.products.variations.VariationsBulkUpdatePriceFragment.currencyFormatter")
  public static void injectCurrencyFormatter(VariationsBulkUpdatePriceFragment instance,
      CurrencyFormatter currencyFormatter) {
    instance.currencyFormatter = currencyFormatter;
  }
}