// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.ui.products.categories;

import com.woocommerce.android.ui.base.UIMessageResolver;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AddProductCategoryFragment_MembersInjector implements MembersInjector<AddProductCategoryFragment> {
  private final Provider<UIMessageResolver> uiMessageResolverProvider;

  public AddProductCategoryFragment_MembersInjector(
      Provider<UIMessageResolver> uiMessageResolverProvider) {
    this.uiMessageResolverProvider = uiMessageResolverProvider;
  }

  public static MembersInjector<AddProductCategoryFragment> create(
      Provider<UIMessageResolver> uiMessageResolverProvider) {
    return new AddProductCategoryFragment_MembersInjector(uiMessageResolverProvider);
  }

  @Override
  public void injectMembers(AddProductCategoryFragment instance) {
    injectUiMessageResolver(instance, uiMessageResolverProvider.get());
  }

  @InjectedFieldSignature("com.woocommerce.android.ui.products.categories.AddProductCategoryFragment.uiMessageResolver")
  public static void injectUiMessageResolver(AddProductCategoryFragment instance,
      UIMessageResolver uiMessageResolver) {
    instance.uiMessageResolver = uiMessageResolver;
  }
}