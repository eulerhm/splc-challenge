package com.google.samples.apps.iosched.ui.info;

import com.google.samples.apps.iosched.shared.di.AssistantAppEnabledFlag;
import com.google.samples.apps.iosched.ui.messages.SnackbarMessageManager;
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
public final class EventFragment_MembersInjector implements MembersInjector<EventFragment> {
  private final Provider<SnackbarMessageManager> snackbarMessageManagerProvider;

  private final Provider<Boolean> assistantAppEnabledProvider;

  public EventFragment_MembersInjector(
      Provider<SnackbarMessageManager> snackbarMessageManagerProvider,
      Provider<Boolean> assistantAppEnabledProvider) {
    this.snackbarMessageManagerProvider = snackbarMessageManagerProvider;
    this.assistantAppEnabledProvider = assistantAppEnabledProvider;
  }

  public static MembersInjector<EventFragment> create(
      Provider<SnackbarMessageManager> snackbarMessageManagerProvider,
      Provider<Boolean> assistantAppEnabledProvider) {
    return new EventFragment_MembersInjector(snackbarMessageManagerProvider, assistantAppEnabledProvider);
  }

  @Override
  public void injectMembers(EventFragment instance) {
    injectSnackbarMessageManager(instance, snackbarMessageManagerProvider.get());
    injectAssistantAppEnabled(instance, assistantAppEnabledProvider.get());
  }

  @InjectedFieldSignature("com.google.samples.apps.iosched.ui.info.EventFragment.snackbarMessageManager")
  public static void injectSnackbarMessageManager(EventFragment instance,
      SnackbarMessageManager snackbarMessageManager) {
    instance.snackbarMessageManager = snackbarMessageManager;
  }

  @InjectedFieldSignature("com.google.samples.apps.iosched.ui.info.EventFragment.assistantAppEnabled")
  @AssistantAppEnabledFlag
  public static void injectAssistantAppEnabled(EventFragment instance,
      boolean assistantAppEnabled) {
    instance.assistantAppEnabled = assistantAppEnabled;
  }
}
