package com.google.samples.apps.iosched.ui.signin;

import com.google.samples.apps.iosched.shared.domain.prefs.NotificationsPrefSaveActionUseCase;
import com.google.samples.apps.iosched.shared.domain.prefs.NotificationsPrefShownActionUseCase;
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
public final class NotificationsPreferenceDialogFragment_MembersInjector implements MembersInjector<NotificationsPreferenceDialogFragment> {
  private final Provider<NotificationsPrefSaveActionUseCase> notificationsPrefSaveActionUseCaseProvider;

  private final Provider<NotificationsPrefShownActionUseCase> notificationsPrefShownActionUseCaseProvider;

  public NotificationsPreferenceDialogFragment_MembersInjector(
      Provider<NotificationsPrefSaveActionUseCase> notificationsPrefSaveActionUseCaseProvider,
      Provider<NotificationsPrefShownActionUseCase> notificationsPrefShownActionUseCaseProvider) {
    this.notificationsPrefSaveActionUseCaseProvider = notificationsPrefSaveActionUseCaseProvider;
    this.notificationsPrefShownActionUseCaseProvider = notificationsPrefShownActionUseCaseProvider;
  }

  public static MembersInjector<NotificationsPreferenceDialogFragment> create(
      Provider<NotificationsPrefSaveActionUseCase> notificationsPrefSaveActionUseCaseProvider,
      Provider<NotificationsPrefShownActionUseCase> notificationsPrefShownActionUseCaseProvider) {
    return new NotificationsPreferenceDialogFragment_MembersInjector(notificationsPrefSaveActionUseCaseProvider, notificationsPrefShownActionUseCaseProvider);
  }

  @Override
  public void injectMembers(NotificationsPreferenceDialogFragment instance) {
    injectNotificationsPrefSaveActionUseCase(instance, notificationsPrefSaveActionUseCaseProvider.get());
    injectNotificationsPrefShownActionUseCase(instance, notificationsPrefShownActionUseCaseProvider.get());
  }

  @InjectedFieldSignature("com.google.samples.apps.iosched.ui.signin.NotificationsPreferenceDialogFragment.notificationsPrefSaveActionUseCase")
  public static void injectNotificationsPrefSaveActionUseCase(
      NotificationsPreferenceDialogFragment instance,
      NotificationsPrefSaveActionUseCase notificationsPrefSaveActionUseCase) {
    instance.notificationsPrefSaveActionUseCase = notificationsPrefSaveActionUseCase;
  }

  @InjectedFieldSignature("com.google.samples.apps.iosched.ui.signin.NotificationsPreferenceDialogFragment.notificationsPrefShownActionUseCase")
  public static void injectNotificationsPrefShownActionUseCase(
      NotificationsPreferenceDialogFragment instance,
      NotificationsPrefShownActionUseCase notificationsPrefShownActionUseCase) {
    instance.notificationsPrefShownActionUseCase = notificationsPrefShownActionUseCase;
  }
}
