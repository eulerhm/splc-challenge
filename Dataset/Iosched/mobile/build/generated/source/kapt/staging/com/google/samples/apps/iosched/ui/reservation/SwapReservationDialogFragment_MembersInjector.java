package com.google.samples.apps.iosched.ui.reservation;

import com.google.samples.apps.iosched.shared.domain.users.SwapActionUseCase;
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
public final class SwapReservationDialogFragment_MembersInjector implements MembersInjector<SwapReservationDialogFragment> {
  private final Provider<SwapActionUseCase> swapActionUseCaseProvider;

  public SwapReservationDialogFragment_MembersInjector(
      Provider<SwapActionUseCase> swapActionUseCaseProvider) {
    this.swapActionUseCaseProvider = swapActionUseCaseProvider;
  }

  public static MembersInjector<SwapReservationDialogFragment> create(
      Provider<SwapActionUseCase> swapActionUseCaseProvider) {
    return new SwapReservationDialogFragment_MembersInjector(swapActionUseCaseProvider);
  }

  @Override
  public void injectMembers(SwapReservationDialogFragment instance) {
    injectSwapActionUseCase(instance, swapActionUseCaseProvider.get());
  }

  @InjectedFieldSignature("com.google.samples.apps.iosched.ui.reservation.SwapReservationDialogFragment.swapActionUseCase")
  public static void injectSwapActionUseCase(SwapReservationDialogFragment instance,
      SwapActionUseCase swapActionUseCase) {
    instance.swapActionUseCase = swapActionUseCase;
  }
}
