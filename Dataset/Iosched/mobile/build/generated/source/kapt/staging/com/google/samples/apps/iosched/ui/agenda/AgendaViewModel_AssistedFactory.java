package com.google.samples.apps.iosched.ui.agenda;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.google.samples.apps.iosched.shared.domain.agenda.LoadAgendaUseCase;
import com.google.samples.apps.iosched.shared.domain.settings.GetTimeZoneUseCase;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class AgendaViewModel_AssistedFactory implements ViewModelAssistedFactory<AgendaViewModel> {
  private final Provider<LoadAgendaUseCase> loadAgendaUseCase;

  private final Provider<GetTimeZoneUseCase> getTimeZoneUseCase;

  @Inject
  AgendaViewModel_AssistedFactory(Provider<LoadAgendaUseCase> loadAgendaUseCase,
      Provider<GetTimeZoneUseCase> getTimeZoneUseCase) {
    this.loadAgendaUseCase = loadAgendaUseCase;
    this.getTimeZoneUseCase = getTimeZoneUseCase;
  }

  @Override
  @NonNull
  public AgendaViewModel create(@NonNull SavedStateHandle arg0) {
    return new AgendaViewModel(loadAgendaUseCase.get(), getTimeZoneUseCase.get());
  }
}
