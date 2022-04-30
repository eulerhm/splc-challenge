package com.google.samples.apps.iosched.ui.search;

import com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper;
import com.google.samples.apps.iosched.shared.domain.search.LoadSearchFiltersUseCase;
import com.google.samples.apps.iosched.shared.domain.search.SessionSearchUseCase;
import com.google.samples.apps.iosched.shared.domain.settings.GetTimeZoneUseCase;
import com.google.samples.apps.iosched.ui.filters.FiltersViewModelDelegate;
import com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SearchViewModel_AssistedFactory_Factory implements Factory<SearchViewModel_AssistedFactory> {
  private final Provider<AnalyticsHelper> analyticsHelperProvider;

  private final Provider<SessionSearchUseCase> searchUseCaseProvider;

  private final Provider<GetTimeZoneUseCase> getTimeZoneUseCaseProvider;

  private final Provider<LoadSearchFiltersUseCase> loadFiltersUseCaseProvider;

  private final Provider<SignInViewModelDelegate> signInViewModelDelegateProvider;

  private final Provider<FiltersViewModelDelegate> filtersViewModelDelegateProvider;

  public SearchViewModel_AssistedFactory_Factory(Provider<AnalyticsHelper> analyticsHelperProvider,
      Provider<SessionSearchUseCase> searchUseCaseProvider,
      Provider<GetTimeZoneUseCase> getTimeZoneUseCaseProvider,
      Provider<LoadSearchFiltersUseCase> loadFiltersUseCaseProvider,
      Provider<SignInViewModelDelegate> signInViewModelDelegateProvider,
      Provider<FiltersViewModelDelegate> filtersViewModelDelegateProvider) {
    this.analyticsHelperProvider = analyticsHelperProvider;
    this.searchUseCaseProvider = searchUseCaseProvider;
    this.getTimeZoneUseCaseProvider = getTimeZoneUseCaseProvider;
    this.loadFiltersUseCaseProvider = loadFiltersUseCaseProvider;
    this.signInViewModelDelegateProvider = signInViewModelDelegateProvider;
    this.filtersViewModelDelegateProvider = filtersViewModelDelegateProvider;
  }

  @Override
  public SearchViewModel_AssistedFactory get() {
    return newInstance(analyticsHelperProvider, searchUseCaseProvider, getTimeZoneUseCaseProvider, loadFiltersUseCaseProvider, signInViewModelDelegateProvider, filtersViewModelDelegateProvider);
  }

  public static SearchViewModel_AssistedFactory_Factory create(
      Provider<AnalyticsHelper> analyticsHelperProvider,
      Provider<SessionSearchUseCase> searchUseCaseProvider,
      Provider<GetTimeZoneUseCase> getTimeZoneUseCaseProvider,
      Provider<LoadSearchFiltersUseCase> loadFiltersUseCaseProvider,
      Provider<SignInViewModelDelegate> signInViewModelDelegateProvider,
      Provider<FiltersViewModelDelegate> filtersViewModelDelegateProvider) {
    return new SearchViewModel_AssistedFactory_Factory(analyticsHelperProvider, searchUseCaseProvider, getTimeZoneUseCaseProvider, loadFiltersUseCaseProvider, signInViewModelDelegateProvider, filtersViewModelDelegateProvider);
  }

  public static SearchViewModel_AssistedFactory newInstance(
      Provider<AnalyticsHelper> analyticsHelper, Provider<SessionSearchUseCase> searchUseCase,
      Provider<GetTimeZoneUseCase> getTimeZoneUseCase,
      Provider<LoadSearchFiltersUseCase> loadFiltersUseCase,
      Provider<SignInViewModelDelegate> signInViewModelDelegate,
      Provider<FiltersViewModelDelegate> filtersViewModelDelegate) {
    return new SearchViewModel_AssistedFactory(analyticsHelper, searchUseCase, getTimeZoneUseCase, loadFiltersUseCase, signInViewModelDelegate, filtersViewModelDelegate);
  }
}
