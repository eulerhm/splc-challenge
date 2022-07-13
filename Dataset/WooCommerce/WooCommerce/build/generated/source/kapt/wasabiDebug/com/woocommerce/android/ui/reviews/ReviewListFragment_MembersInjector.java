// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.ui.reviews;

import com.woocommerce.android.tools.SelectedSite;
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
public final class ReviewListFragment_MembersInjector implements MembersInjector<ReviewListFragment> {
  private final Provider<UIMessageResolver> uiMessageResolverProvider;

  private final Provider<SelectedSite> selectedSiteProvider;

  public ReviewListFragment_MembersInjector(Provider<UIMessageResolver> uiMessageResolverProvider,
      Provider<SelectedSite> selectedSiteProvider) {
    this.uiMessageResolverProvider = uiMessageResolverProvider;
    this.selectedSiteProvider = selectedSiteProvider;
  }

  public static MembersInjector<ReviewListFragment> create(
      Provider<UIMessageResolver> uiMessageResolverProvider,
      Provider<SelectedSite> selectedSiteProvider) {
    return new ReviewListFragment_MembersInjector(uiMessageResolverProvider, selectedSiteProvider);
  }

  @Override
  public void injectMembers(ReviewListFragment instance) {
    injectUiMessageResolver(instance, uiMessageResolverProvider.get());
    injectSelectedSite(instance, selectedSiteProvider.get());
  }

  @InjectedFieldSignature("com.woocommerce.android.ui.reviews.ReviewListFragment.uiMessageResolver")
  public static void injectUiMessageResolver(ReviewListFragment instance,
      UIMessageResolver uiMessageResolver) {
    instance.uiMessageResolver = uiMessageResolver;
  }

  @InjectedFieldSignature("com.woocommerce.android.ui.reviews.ReviewListFragment.selectedSite")
  public static void injectSelectedSite(ReviewListFragment instance, SelectedSite selectedSite) {
    instance.selectedSite = selectedSite;
  }
}