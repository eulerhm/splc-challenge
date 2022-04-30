package com.google.samples.apps.iosched.shared.data.tag;

import com.google.samples.apps.iosched.shared.data.ConferenceDataRepository;
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
public final class TagRepository_Factory implements Factory<TagRepository> {
  private final Provider<ConferenceDataRepository> conferenceDataRepositoryProvider;

  public TagRepository_Factory(
      Provider<ConferenceDataRepository> conferenceDataRepositoryProvider) {
    this.conferenceDataRepositoryProvider = conferenceDataRepositoryProvider;
  }

  @Override
  public TagRepository get() {
    return newInstance(conferenceDataRepositoryProvider.get());
  }

  public static TagRepository_Factory create(
      Provider<ConferenceDataRepository> conferenceDataRepositoryProvider) {
    return new TagRepository_Factory(conferenceDataRepositoryProvider);
  }

  public static TagRepository newInstance(ConferenceDataRepository conferenceDataRepository) {
    return new TagRepository(conferenceDataRepository);
  }
}
