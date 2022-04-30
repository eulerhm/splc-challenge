package com.google.samples.apps.iosched.shared.notifications;

import com.google.samples.apps.iosched.shared.data.prefs.SharedPreferenceStorage;
import com.google.samples.apps.iosched.shared.data.signin.datasources.AuthIdDataSource;
import com.google.samples.apps.iosched.shared.di.ApplicationScope;
import com.google.samples.apps.iosched.shared.domain.sessions.LoadSessionOneShotUseCase;
import com.google.samples.apps.iosched.shared.domain.sessions.LoadUserSessionOneShotUseCase;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.Generated;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AlarmBroadcastReceiver_MembersInjector implements MembersInjector<AlarmBroadcastReceiver> {
  private final Provider<SharedPreferenceStorage> sharedPreferencesStorageProvider;

  private final Provider<LoadUserSessionOneShotUseCase> loadUserSessionProvider;

  private final Provider<LoadSessionOneShotUseCase> loadSessionProvider;

  private final Provider<SessionAlarmManager> alarmManagerProvider;

  private final Provider<AuthIdDataSource> authIdDataSourceProvider;

  private final Provider<CoroutineScope> externalScopeProvider;

  public AlarmBroadcastReceiver_MembersInjector(
      Provider<SharedPreferenceStorage> sharedPreferencesStorageProvider,
      Provider<LoadUserSessionOneShotUseCase> loadUserSessionProvider,
      Provider<LoadSessionOneShotUseCase> loadSessionProvider,
      Provider<SessionAlarmManager> alarmManagerProvider,
      Provider<AuthIdDataSource> authIdDataSourceProvider,
      Provider<CoroutineScope> externalScopeProvider) {
    this.sharedPreferencesStorageProvider = sharedPreferencesStorageProvider;
    this.loadUserSessionProvider = loadUserSessionProvider;
    this.loadSessionProvider = loadSessionProvider;
    this.alarmManagerProvider = alarmManagerProvider;
    this.authIdDataSourceProvider = authIdDataSourceProvider;
    this.externalScopeProvider = externalScopeProvider;
  }

  public static MembersInjector<AlarmBroadcastReceiver> create(
      Provider<SharedPreferenceStorage> sharedPreferencesStorageProvider,
      Provider<LoadUserSessionOneShotUseCase> loadUserSessionProvider,
      Provider<LoadSessionOneShotUseCase> loadSessionProvider,
      Provider<SessionAlarmManager> alarmManagerProvider,
      Provider<AuthIdDataSource> authIdDataSourceProvider,
      Provider<CoroutineScope> externalScopeProvider) {
    return new AlarmBroadcastReceiver_MembersInjector(sharedPreferencesStorageProvider, loadUserSessionProvider, loadSessionProvider, alarmManagerProvider, authIdDataSourceProvider, externalScopeProvider);}

  @Override
  public void injectMembers(AlarmBroadcastReceiver instance) {
    injectSharedPreferencesStorage(instance, sharedPreferencesStorageProvider.get());
    injectLoadUserSession(instance, loadUserSessionProvider.get());
    injectLoadSession(instance, loadSessionProvider.get());
    injectAlarmManager(instance, alarmManagerProvider.get());
    injectAuthIdDataSource(instance, authIdDataSourceProvider.get());
    injectExternalScope(instance, externalScopeProvider.get());
  }

  @InjectedFieldSignature("com.google.samples.apps.iosched.shared.notifications.AlarmBroadcastReceiver.sharedPreferencesStorage")
  public static void injectSharedPreferencesStorage(AlarmBroadcastReceiver instance,
      SharedPreferenceStorage sharedPreferencesStorage) {
    instance.sharedPreferencesStorage = sharedPreferencesStorage;
  }

  @InjectedFieldSignature("com.google.samples.apps.iosched.shared.notifications.AlarmBroadcastReceiver.loadUserSession")
  public static void injectLoadUserSession(AlarmBroadcastReceiver instance,
      LoadUserSessionOneShotUseCase loadUserSession) {
    instance.loadUserSession = loadUserSession;
  }

  @InjectedFieldSignature("com.google.samples.apps.iosched.shared.notifications.AlarmBroadcastReceiver.loadSession")
  public static void injectLoadSession(AlarmBroadcastReceiver instance,
      LoadSessionOneShotUseCase loadSession) {
    instance.loadSession = loadSession;
  }

  @InjectedFieldSignature("com.google.samples.apps.iosched.shared.notifications.AlarmBroadcastReceiver.alarmManager")
  public static void injectAlarmManager(AlarmBroadcastReceiver instance,
      SessionAlarmManager alarmManager) {
    instance.alarmManager = alarmManager;
  }

  @InjectedFieldSignature("com.google.samples.apps.iosched.shared.notifications.AlarmBroadcastReceiver.authIdDataSource")
  public static void injectAuthIdDataSource(AlarmBroadcastReceiver instance,
      AuthIdDataSource authIdDataSource) {
    instance.authIdDataSource = authIdDataSource;
  }

  @InjectedFieldSignature("com.google.samples.apps.iosched.shared.notifications.AlarmBroadcastReceiver.externalScope")
  @ApplicationScope
  public static void injectExternalScope(AlarmBroadcastReceiver instance,
      CoroutineScope externalScope) {
    instance.externalScope = externalScope;
  }
}
