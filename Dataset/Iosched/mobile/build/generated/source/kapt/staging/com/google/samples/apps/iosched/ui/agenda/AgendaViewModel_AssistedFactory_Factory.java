package com.google.samples.apps.iosched.ui.agenda;

import com.google.samples.apps.iosched.shared.domain.agenda.LoadAgendaUseCase;
import com.google.samples.apps.iosched.shared.domain.settings.GetTimeZoneUseCase;
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
public final class AgendaViewModel_AssistedFactory_Factory implements Factory<AgendaViewModel_AssistedFactory> {
  private final Provider<LoadAgendaUseCase> loadAgendaUseCaseProvider;

  private final Provider<GetTimeZoneUseCase> getTimeZoneUseCaseProvider;

  public AgendaViewModel_AssistedFactory_Factory(
      Provider<LoadAgendaUseCase> loadAgendaUseCaseProvider,
      Provider<GetTimeZoneUseCase> getTimeZoneUseCaseProvider) {
    this.loadAgendaUseCaseProvider = loadAgendaUseCaseProvider;
    this.getTimeZoneUseCaseProvider = getTimeZoneUseCaseProvider;
  }

  @Override
  public AgendaViewModel_AssistedFactory get() {
    return newInstance(loadAgendaUseCaseProvider, getTimeZoneUseCaseProvider);
  }

  public static AgendaViewModel_AssistedFactory_Factory create(
      Provider<LoadAgendaUseCase> loadAgendaUseCaseProvider,
      Provider<GetTimeZoneUseCase> getTimeZoneUseCaseProvider) {
    return new AgendaViewModel_AssistedFactory_Factory(loadAgendaUseCaseProvider, getTimeZoneUseCaseProvider);
  }

  public static AgendaViewModel_AssistedFactory newInstance(
      Provider<LoadAgendaUseCase> loadAgendaUseCase,
      Provider<GetTimeZoneUseCase> getTimeZoneUseCase) {
    return new AgendaViewModel_AssistedFactory(loadAgendaUseCase, getTimeZoneUseCase);
  }
}
