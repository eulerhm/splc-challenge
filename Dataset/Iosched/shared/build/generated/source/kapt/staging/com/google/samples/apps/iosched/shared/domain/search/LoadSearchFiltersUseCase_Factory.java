package com.google.samples.apps.iosched.shared.domain.search;

import com.google.samples.apps.iosched.shared.data.ConferenceDataRepository;
import com.google.samples.apps.iosched.shared.data.tag.TagRepository;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LoadSearchFiltersUseCase_Factory implements Factory<LoadSearchFiltersUseCase> {
  private final Provider<ConferenceDataRepository> conferenceRepositoryProvider;

  private final Provider<TagRepository> tagRepositoryProvider;

  private final Provider<CoroutineDispatcher> dispatcherProvider;

  public LoadSearchFiltersUseCase_Factory(
      Provider<ConferenceDataRepository> conferenceRepositoryProvider,
      Provider<TagRepository> tagRepositoryProvider,
      Provider<CoroutineDispatcher> dispatcherProvider) {
    this.conferenceRepositoryProvider = conferenceRepositoryProvider;
    this.tagRepositoryProvider = tagRepositoryProvider;
    this.dispatcherProvider = dispatcherProvider;
  }

  @Override
  public LoadSearchFiltersUseCase get() {
    return newInstance(conferenceRepositoryProvider.get(), tagRepositoryProvider.get(), dispatcherProvider.get());
  }

  public static LoadSearchFiltersUseCase_Factory create(
      Provider<ConferenceDataRepository> conferenceRepositoryProvider,
      Provider<TagRepository> tagRepositoryProvider,
      Provider<CoroutineDispatcher> dispatcherProvider) {
    return new LoadSearchFiltersUseCase_Factory(conferenceRepositoryProvider, tagRepositoryProvider, dispatcherProvider);
  }

  public static LoadSearchFiltersUseCase newInstance(ConferenceDataRepository conferenceRepository,
      TagRepository tagRepository, CoroutineDispatcher dispatcher) {
    return new LoadSearchFiltersUseCase(conferenceRepository, tagRepository, dispatcher);
  }
}
