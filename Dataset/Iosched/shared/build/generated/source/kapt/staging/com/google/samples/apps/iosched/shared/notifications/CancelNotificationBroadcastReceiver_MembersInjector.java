package com.google.samples.apps.iosched.shared.notifications;

import android.content.Context;
import dagger.MembersInjector;
import dagger.hilt.android.qualifiers.ApplicationContext;
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
public final class CancelNotificationBroadcastReceiver_MembersInjector implements MembersInjector<CancelNotificationBroadcastReceiver> {
  private final Provider<Context> contextProvider;

  public CancelNotificationBroadcastReceiver_MembersInjector(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  public static MembersInjector<CancelNotificationBroadcastReceiver> create(
      Provider<Context> contextProvider) {
    return new CancelNotificationBroadcastReceiver_MembersInjector(contextProvider);}

  @Override
  public void injectMembers(CancelNotificationBroadcastReceiver instance) {
    injectContext(instance, contextProvider.get());
  }

  @InjectedFieldSignature("com.google.samples.apps.iosched.shared.notifications.CancelNotificationBroadcastReceiver.context")
  @ApplicationContext
  public static void injectContext(CancelNotificationBroadcastReceiver instance, Context context) {
    instance.context = context;
  }
}
