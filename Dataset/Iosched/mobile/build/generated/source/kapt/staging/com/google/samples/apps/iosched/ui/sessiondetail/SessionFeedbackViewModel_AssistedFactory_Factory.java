package com.google.samples.apps.iosched.ui.sessiondetail;

import com.google.samples.apps.iosched.shared.domain.sessions.LoadUserSessionUseCase;
import com.google.samples.apps.iosched.shared.domain.users.FeedbackUseCase;
import com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate;
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
public final class SessionFeedbackViewModel_AssistedFactory_Factory implements Factory<SessionFeedbackViewModel_AssistedFactory> {
  private final Provider<SignInViewModelDelegate> signInViewModelDelegateProvider;

  private final Provider<LoadUserSessionUseCase> loadUserSessionUseCaseProvider;

  private final Provider<FeedbackUseCase> feedbackUseCaseProvider;

  public SessionFeedbackViewModel_AssistedFactory_Factory(
      Provider<SignInViewModelDelegate> signInViewModelDelegateProvider,
      Provider<LoadUserSessionUseCase> loadUserSessionUseCaseProvider,
      Provider<FeedbackUseCase> feedbackUseCaseProvider) {
    this.signInViewModelDelegateProvider = signInViewModelDelegateProvider;
    this.loadUserSessionUseCaseProvider = loadUserSessionUseCaseProvider;
    this.feedbackUseCaseProvider = feedbackUseCaseProvider;
  }

  @Override
  public SessionFeedbackViewModel_AssistedFactory get() {
    return newInstance(signInViewModelDelegateProvider, loadUserSessionUseCaseProvider, feedbackUseCaseProvider);
  }

  public static SessionFeedbackViewModel_AssistedFactory_Factory create(
      Provider<SignInViewModelDelegate> signInViewModelDelegateProvider,
      Provider<LoadUserSessionUseCase> loadUserSessionUseCaseProvider,
      Provider<FeedbackUseCase> feedbackUseCaseProvider) {
    return new SessionFeedbackViewModel_AssistedFactory_Factory(signInViewModelDelegateProvider, loadUserSessionUseCaseProvider, feedbackUseCaseProvider);
  }

  public static SessionFeedbackViewModel_AssistedFactory newInstance(
      Provider<SignInViewModelDelegate> signInViewModelDelegate,
      Provider<LoadUserSessionUseCase> loadUserSessionUseCase,
      Provider<FeedbackUseCase> feedbackUseCase) {
    return new SessionFeedbackViewModel_AssistedFactory(signInViewModelDelegate, loadUserSessionUseCase, feedbackUseCase);
  }
}
