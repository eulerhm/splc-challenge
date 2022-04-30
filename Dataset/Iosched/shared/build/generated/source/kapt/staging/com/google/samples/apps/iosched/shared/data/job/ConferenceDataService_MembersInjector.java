package com.google.samples.apps.iosched.shared.data.job;

import com.google.samples.apps.iosched.shared.domain.RefreshConferenceDataUseCase;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
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
public final class ConferenceDataService_MembersInjector implements MembersInjector<ConferenceDataService> {
  private final Provider<RefreshConferenceDataUseCase> refreshEventDataUseCaseProvider;

  public ConferenceDataService_MembersInjector(
      Provider<RefreshConferenceDataUseCase> refreshEventDataUseCaseProvider) {
    this.refreshEventDataUseCaseProvider = refreshEventDataUseCaseProvider;
  }

  public static MembersInjector<ConferenceDataService> create(
      Provider<RefreshConferenceDataUseCase> refreshEventDataUseCaseProvider) {
    return new ConferenceDataService_MembersInjector(refreshEventDataUseCaseProvider);}

  @Override
  public void injectMembers(ConferenceDataService instance) {
    injectRefreshEventDataUseCase(instance, refreshEventDataUseCaseProvider.get());
  }

  @InjectedFieldSignature("com.google.samples.apps.iosched.shared.data.job.ConferenceDataService.refreshEventDataUseCase")
  public static void injectRefreshEventDataUseCase(ConferenceDataService instance,
      RefreshConferenceDataUseCase refreshEventDataUseCase) {
    instance.refreshEventDataUseCase = refreshEventDataUseCase;
  }
}
