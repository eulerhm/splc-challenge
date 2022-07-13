// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.ui.reviews;

import com.woocommerce.android.tools.ProductImageMap;
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
public final class ReviewDetailFragment_MembersInjector implements MembersInjector<ReviewDetailFragment> {
  private final Provider<UIMessageResolver> uiMessageResolverProvider;

  private final Provider<ProductImageMap> productImageMapProvider;

  public ReviewDetailFragment_MembersInjector(Provider<UIMessageResolver> uiMessageResolverProvider,
      Provider<ProductImageMap> productImageMapProvider) {
    this.uiMessageResolverProvider = uiMessageResolverProvider;
    this.productImageMapProvider = productImageMapProvider;
  }

  public static MembersInjector<ReviewDetailFragment> create(
      Provider<UIMessageResolver> uiMessageResolverProvider,
      Provider<ProductImageMap> productImageMapProvider) {
    return new ReviewDetailFragment_MembersInjector(uiMessageResolverProvider, productImageMapProvider);
  }

  @Override
  public void injectMembers(ReviewDetailFragment instance) {
    injectUiMessageResolver(instance, uiMessageResolverProvider.get());
    injectProductImageMap(instance, productImageMapProvider.get());
  }

  @InjectedFieldSignature("com.woocommerce.android.ui.reviews.ReviewDetailFragment.uiMessageResolver")
  public static void injectUiMessageResolver(ReviewDetailFragment instance,
      UIMessageResolver uiMessageResolver) {
    instance.uiMessageResolver = uiMessageResolver;
  }

  @InjectedFieldSignature("com.woocommerce.android.ui.reviews.ReviewDetailFragment.productImageMap")
  public static void injectProductImageMap(ReviewDetailFragment instance,
      ProductImageMap productImageMap) {
    instance.productImageMap = productImageMap;
  }
}