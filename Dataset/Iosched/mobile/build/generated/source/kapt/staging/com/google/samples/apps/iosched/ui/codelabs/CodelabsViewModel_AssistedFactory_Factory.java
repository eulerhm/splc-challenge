package com.google.samples.apps.iosched.ui.codelabs;

import com.google.samples.apps.iosched.shared.domain.codelabs.GetCodelabsInfoCardShownUseCase;
import com.google.samples.apps.iosched.shared.domain.codelabs.LoadCodelabsUseCase;
import com.google.samples.apps.iosched.shared.domain.codelabs.SetCodelabsInfoCardShownUseCase;
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
public final class CodelabsViewModel_AssistedFactory_Factory implements Factory<CodelabsViewModel_AssistedFactory> {
  private final Provider<LoadCodelabsUseCase> loadCodelabsUseCaseProvider;

  private final Provider<GetCodelabsInfoCardShownUseCase> getCodelabsInfoCardShownUseCaseProvider;

  private final Provider<SetCodelabsInfoCardShownUseCase> setCodelabsInfoCardShownUseCaseProvider;

  public CodelabsViewModel_AssistedFactory_Factory(
      Provider<LoadCodelabsUseCase> loadCodelabsUseCaseProvider,
      Provider<GetCodelabsInfoCardShownUseCase> getCodelabsInfoCardShownUseCaseProvider,
      Provider<SetCodelabsInfoCardShownUseCase> setCodelabsInfoCardShownUseCaseProvider) {
    this.loadCodelabsUseCaseProvider = loadCodelabsUseCaseProvider;
    this.getCodelabsInfoCardShownUseCaseProvider = getCodelabsInfoCardShownUseCaseProvider;
    this.setCodelabsInfoCardShownUseCaseProvider = setCodelabsInfoCardShownUseCaseProvider;
  }

  @Override
  public CodelabsViewModel_AssistedFactory get() {
    return newInstance(loadCodelabsUseCaseProvider, getCodelabsInfoCardShownUseCaseProvider, setCodelabsInfoCardShownUseCaseProvider);
  }

  public static CodelabsViewModel_AssistedFactory_Factory create(
      Provider<LoadCodelabsUseCase> loadCodelabsUseCaseProvider,
      Provider<GetCodelabsInfoCardShownUseCase> getCodelabsInfoCardShownUseCaseProvider,
      Provider<SetCodelabsInfoCardShownUseCase> setCodelabsInfoCardShownUseCaseProvider) {
    return new CodelabsViewModel_AssistedFactory_Factory(loadCodelabsUseCaseProvider, getCodelabsInfoCardShownUseCaseProvider, setCodelabsInfoCardShownUseCaseProvider);
  }

  public static CodelabsViewModel_AssistedFactory newInstance(
      Provider<LoadCodelabsUseCase> loadCodelabsUseCase,
      Provider<GetCodelabsInfoCardShownUseCase> getCodelabsInfoCardShownUseCase,
      Provider<SetCodelabsInfoCardShownUseCase> setCodelabsInfoCardShownUseCase) {
    return new CodelabsViewModel_AssistedFactory(loadCodelabsUseCase, getCodelabsInfoCardShownUseCase, setCodelabsInfoCardShownUseCase);
  }
}
