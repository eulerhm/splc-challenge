package com.google.samples.apps.iosched.ui.sessiondetail;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.google.samples.apps.iosched.shared.domain.sessions.LoadUserSessionUseCase;
import com.google.samples.apps.iosched.shared.domain.users.FeedbackUseCase;
import com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class SessionFeedbackViewModel_AssistedFactory implements ViewModelAssistedFactory<SessionFeedbackViewModel> {
  private final Provider<SignInViewModelDelegate> signInViewModelDelegate;

  private final Provider<LoadUserSessionUseCase> loadUserSessionUseCase;

  private final Provider<FeedbackUseCase> feedbackUseCase;

  @Inject
  SessionFeedbackViewModel_AssistedFactory(
      Provider<SignInViewModelDelegate> signInViewModelDelegate,
      Provider<LoadUserSessionUseCase> loadUserSessionUseCase,
      Provider<FeedbackUseCase> feedbackUseCase) {
    this.signInViewModelDelegate = signInViewModelDelegate;
    this.loadUserSessionUseCase = loadUserSessionUseCase;
    this.feedbackUseCase = feedbackUseCase;
  }

  @Override
  @NonNull
  public SessionFeedbackViewModel create(@NonNull SavedStateHandle arg0) {
    return new SessionFeedbackViewModel(signInViewModelDelegate.get(), loadUserSessionUseCase.get(),
        feedbackUseCase.get());
  }
}
