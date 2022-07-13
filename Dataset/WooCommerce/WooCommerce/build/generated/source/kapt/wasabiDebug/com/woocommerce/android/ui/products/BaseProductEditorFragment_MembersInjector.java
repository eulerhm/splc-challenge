// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.ui.products;

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
public final class BaseProductEditorFragment_MembersInjector implements MembersInjector<BaseProductEditorFragment> {
  private final Provider<CurrencyFormatter> currencyFormatterProvider;

  private final Provider<UIMessageResolver> uiMessageResolverProvider;

  public BaseProductEditorFragment_MembersInjector(
      Provider<CurrencyFormatter> currencyFormatterProvider,
      Provider<UIMessageResolver> uiMessageResolverProvider) {
    this.currencyFormatterProvider = currencyFormatterProvider;
    this.uiMessageResolverProvider = uiMessageResolverProvider;
  }

  public static MembersInjector<BaseProductEditorFragment> create(
      Provider<CurrencyFormatter> currencyFormatterProvider,
      Provider<UIMessageResolver> uiMessageResolverProvider) {
    return new BaseProductEditorFragment_MembersInjector(currencyFormatterProvider, uiMessageResolverProvider);
  }

  @Override
  public void injectMembers(BaseProductEditorFragment instance) {
    injectCurrencyFormatter(instance, currencyFormatterProvider.get());
    injectUiMessageResolver(instance, uiMessageResolverProvider.get());
  }

  @InjectedFieldSignature("com.woocommerce.android.ui.products.BaseProductEditorFragment.currencyFormatter")
  public static void injectCurrencyFormatter(BaseProductEditorFragment instance,
      CurrencyFormatter currencyFormatter) {
    instance.currencyFormatter = currencyFormatter;
  }

  @InjectedFieldSignature("com.woocommerce.android.ui.products.BaseProductEditorFragment.uiMessageResolver")
  public static void injectUiMessageResolver(BaseProductEditorFragment instance,
      UIMessageResolver uiMessageResolver) {
    instance.uiMessageResolver = uiMessageResolver;
  }
}