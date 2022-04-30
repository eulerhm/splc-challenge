package com.google.samples.apps.iosched.ui.search;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper;
import com.google.samples.apps.iosched.shared.domain.search.LoadSearchFiltersUseCase;
import com.google.samples.apps.iosched.shared.domain.search.SessionSearchUseCase;
import com.google.samples.apps.iosched.shared.domain.settings.GetTimeZoneUseCase;
import com.google.samples.apps.iosched.ui.filters.FiltersViewModelDelegate;
import com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class SearchViewModel_AssistedFactory implements ViewModelAssistedFactory<SearchViewModel> {
  private final Provider<AnalyticsHelper> analyticsHelper;

  private final Provider<SessionSearchUseCase> searchUseCase;

  private final Provider<GetTimeZoneUseCase> getTimeZoneUseCase;

  private final Provider<LoadSearchFiltersUseCase> loadFiltersUseCase;

  private final Provider<SignInViewModelDelegate> signInViewModelDelegate;

  private final Provider<FiltersViewModelDelegate> filtersViewModelDelegate;

  @Inject
  SearchViewModel_AssistedFactory(Provider<AnalyticsHelper> analyticsHelper,
      Provider<SessionSearchUseCase> searchUseCase, Provider<GetTimeZoneUseCase> getTimeZoneUseCase,
      Provider<LoadSearchFiltersUseCase> loadFiltersUseCase,
      Provider<SignInViewModelDelegate> signInViewModelDelegate,
      Provider<FiltersViewModelDelegate> filtersViewModelDelegate) {
    this.analyticsHelper = analyticsHelper;
    this.searchUseCase = searchUseCase;
    this.getTimeZoneUseCase = getTimeZoneUseCase;
    this.loadFiltersUseCase = loadFiltersUseCase;
    this.signInViewModelDelegate = signInViewModelDelegate;
    this.filtersViewModelDelegate = filtersViewModelDelegate;
  }

  @Override
  @NonNull
  public SearchViewModel create(@NonNull SavedStateHandle arg0) {
    return new SearchViewModel(analyticsHelper.get(), searchUseCase.get(), getTimeZoneUseCase.get(),
        loadFiltersUseCase.get(), signInViewModelDelegate.get(), filtersViewModelDelegate.get());
  }
}
