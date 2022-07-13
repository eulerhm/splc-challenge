// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.ui.orders.simplepayments;

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
public final class SimplePaymentsDialog_MembersInjector implements MembersInjector<SimplePaymentsDialog> {
  private final Provider<CurrencyFormatter> currencyFormatterProvider;

  private final Provider<UIMessageResolver> uiMessageResolverProvider;

  public SimplePaymentsDialog_MembersInjector(Provider<CurrencyFormatter> currencyFormatterProvider,
      Provider<UIMessageResolver> uiMessageResolverProvider) {
    this.currencyFormatterProvider = currencyFormatterProvider;
    this.uiMessageResolverProvider = uiMessageResolverProvider;
  }

  public static MembersInjector<SimplePaymentsDialog> create(
      Provider<CurrencyFormatter> currencyFormatterProvider,
      Provider<UIMessageResolver> uiMessageResolverProvider) {
    return new SimplePaymentsDialog_MembersInjector(currencyFormatterProvider, uiMessageResolverProvider);
  }

  @Override
  public void injectMembers(SimplePaymentsDialog instance) {
    injectCurrencyFormatter(instance, currencyFormatterProvider.get());
    injectUiMessageResolver(instance, uiMessageResolverProvider.get());
  }

  @InjectedFieldSignature("com.woocommerce.android.ui.orders.simplepayments.SimplePaymentsDialog.currencyFormatter")
  public static void injectCurrencyFormatter(SimplePaymentsDialog instance,
      CurrencyFormatter currencyFormatter) {
    instance.currencyFormatter = currencyFormatter;
  }

  @InjectedFieldSignature("com.woocommerce.android.ui.orders.simplepayments.SimplePaymentsDialog.uiMessageResolver")
  public static void injectUiMessageResolver(SimplePaymentsDialog instance,
      UIMessageResolver uiMessageResolver) {
    instance.uiMessageResolver = uiMessageResolver;
  }
}