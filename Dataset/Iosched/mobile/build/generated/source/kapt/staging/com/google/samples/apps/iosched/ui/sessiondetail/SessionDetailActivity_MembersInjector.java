package com.google.samples.apps.iosched.ui.sessiondetail;

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
public final class SessionDetailActivity_MembersInjector implements MembersInjector<SessionDetailActivity> {
  private final Provider<SnackbarMessageManager> snackbarMessageManagerProvider;

  public SessionDetailActivity_MembersInjector(
      Provider<SnackbarMessageManager> snackbarMessageManagerProvider) {
    this.snackbarMessageManagerProvider = snackbarMessageManagerProvider;
  }

  public static MembersInjector<SessionDetailActivity> create(
      Provider<SnackbarMessageManager> snackbarMessageManagerProvider) {
    return new SessionDetailActivity_MembersInjector(snackbarMessageManagerProvider);
  }

  @Override
  public void injectMembers(SessionDetailActivity instance) {
    injectSnackbarMessageManager(instance, snackbarMessageManagerProvider.get());
  }

  @InjectedFieldSignature("com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailActivity.snackbarMessageManager")
  public static void injectSnackbarMessageManager(SessionDetailActivity instance,
      SnackbarMessageManager snackbarMessageManager) {
    instance.snackbarMessageManager = snackbarMessageManager;
  }
}
