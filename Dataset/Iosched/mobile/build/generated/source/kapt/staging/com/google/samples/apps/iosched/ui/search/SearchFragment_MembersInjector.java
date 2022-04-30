package com.google.samples.apps.iosched.ui.search;

import androidx.recyclerview.widget.RecyclerView;
import com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.Generated;
import javax.inject.Named;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SearchFragment_MembersInjector implements MembersInjector<SearchFragment> {
  private final Provider<AnalyticsHelper> analyticsHelperProvider;

  private final Provider<RecyclerView.RecycledViewPool> tagViewPoolProvider;

  public SearchFragment_MembersInjector(Provider<AnalyticsHelper> analyticsHelperProvider,
      Provider<RecyclerView.RecycledViewPool> tagViewPoolProvider) {
    this.analyticsHelperProvider = analyticsHelperProvider;
    this.tagViewPoolProvider = tagViewPoolProvider;
  }

  public static MembersInjector<SearchFragment> create(
      Provider<AnalyticsHelper> analyticsHelperProvider,
      Provider<RecyclerView.RecycledViewPool> tagViewPoolProvider) {
    return new SearchFragment_MembersInjector(analyticsHelperProvider, tagViewPoolProvider);
  }

  @Override
  public void injectMembers(SearchFragment instance) {
    injectAnalyticsHelper(instance, analyticsHelperProvider.get());
    injectTagViewPool(instance, tagViewPoolProvider.get());
  }

  @InjectedFieldSignature("com.google.samples.apps.iosched.ui.search.SearchFragment.analyticsHelper")
  public static void injectAnalyticsHelper(SearchFragment instance,
      AnalyticsHelper analyticsHelper) {
    instance.analyticsHelper = analyticsHelper;
  }

  @InjectedFieldSignature("com.google.samples.apps.iosched.ui.search.SearchFragment.tagViewPool")
  @Named("tagViewPool")
  public static void injectTagViewPool(SearchFragment instance,
      RecyclerView.RecycledViewPool tagViewPool) {
    instance.tagViewPool = tagViewPool;
  }
}
