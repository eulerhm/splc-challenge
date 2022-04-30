package com.google.samples.apps.iosched.ui.codelabs;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.google.samples.apps.iosched.shared.domain.codelabs.GetCodelabsInfoCardShownUseCase;
import com.google.samples.apps.iosched.shared.domain.codelabs.LoadCodelabsUseCase;
import com.google.samples.apps.iosched.shared.domain.codelabs.SetCodelabsInfoCardShownUseCase;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class CodelabsViewModel_AssistedFactory implements ViewModelAssistedFactory<CodelabsViewModel> {
  private final Provider<LoadCodelabsUseCase> loadCodelabsUseCase;

  private final Provider<GetCodelabsInfoCardShownUseCase> getCodelabsInfoCardShownUseCase;

  private final Provider<SetCodelabsInfoCardShownUseCase> setCodelabsInfoCardShownUseCase;

  @Inject
  CodelabsViewModel_AssistedFactory(Provider<LoadCodelabsUseCase> loadCodelabsUseCase,
      Provider<GetCodelabsInfoCardShownUseCase> getCodelabsInfoCardShownUseCase,
      Provider<SetCodelabsInfoCardShownUseCase> setCodelabsInfoCardShownUseCase) {
    this.loadCodelabsUseCase = loadCodelabsUseCase;
    this.getCodelabsInfoCardShownUseCase = getCodelabsInfoCardShownUseCase;
    this.setCodelabsInfoCardShownUseCase = setCodelabsInfoCardShownUseCase;
  }

  @Override
  @NonNull
  public CodelabsViewModel create(@NonNull SavedStateHandle arg0) {
    return new CodelabsViewModel(loadCodelabsUseCase.get(), getCodelabsInfoCardShownUseCase.get(),
        setCodelabsInfoCardShownUseCase.get());
  }
}
