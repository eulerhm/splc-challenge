package com.google.samples.apps.iosched.ui.schedule;

import com.google.samples.apps.iosched.shared.domain.prefs.MarkScheduleUiHintsShownUseCase;
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
public final class ScheduleUiHintsDialogFragment_MembersInjector implements MembersInjector<ScheduleUiHintsDialogFragment> {
  private final Provider<MarkScheduleUiHintsShownUseCase> markScheduleUiHintsShownUseCaseProvider;

  public ScheduleUiHintsDialogFragment_MembersInjector(
      Provider<MarkScheduleUiHintsShownUseCase> markScheduleUiHintsShownUseCaseProvider) {
    this.markScheduleUiHintsShownUseCaseProvider = markScheduleUiHintsShownUseCaseProvider;
  }

  public static MembersInjector<ScheduleUiHintsDialogFragment> create(
      Provider<MarkScheduleUiHintsShownUseCase> markScheduleUiHintsShownUseCaseProvider) {
    return new ScheduleUiHintsDialogFragment_MembersInjector(markScheduleUiHintsShownUseCaseProvider);
  }

  @Override
  public void injectMembers(ScheduleUiHintsDialogFragment instance) {
    injectMarkScheduleUiHintsShownUseCase(instance, markScheduleUiHintsShownUseCaseProvider.get());
  }

  @InjectedFieldSignature("com.google.samples.apps.iosched.ui.schedule.ScheduleUiHintsDialogFragment.markScheduleUiHintsShownUseCase")
  public static void injectMarkScheduleUiHintsShownUseCase(ScheduleUiHintsDialogFragment instance,
      MarkScheduleUiHintsShownUseCase markScheduleUiHintsShownUseCase) {
    instance.markScheduleUiHintsShownUseCase = markScheduleUiHintsShownUseCase;
  }
}
