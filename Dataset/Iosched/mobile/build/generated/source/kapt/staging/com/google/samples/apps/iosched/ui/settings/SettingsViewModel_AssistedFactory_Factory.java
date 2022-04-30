package com.google.samples.apps.iosched.ui.settings;

import com.google.samples.apps.iosched.shared.domain.prefs.NotificationsPrefSaveActionUseCase;
import com.google.samples.apps.iosched.shared.domain.settings.GetAnalyticsSettingUseCase;
import com.google.samples.apps.iosched.shared.domain.settings.GetAvailableThemesUseCase;
import com.google.samples.apps.iosched.shared.domain.settings.GetNotificationsSettingUseCase;
import com.google.samples.apps.iosched.shared.domain.settings.GetThemeUseCase;
import com.google.samples.apps.iosched.shared.domain.settings.GetTimeZoneUseCase;
import com.google.samples.apps.iosched.shared.domain.settings.SetAnalyticsSettingUseCase;
import com.google.samples.apps.iosched.shared.domain.settings.SetThemeUseCase;
import com.google.samples.apps.iosched.shared.domain.settings.SetTimeZoneUseCase;
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
public final class SettingsViewModel_AssistedFactory_Factory implements Factory<SettingsViewModel_AssistedFactory> {
  private final Provider<SetTimeZoneUseCase> setTimeZoneUseCaseProvider;

  private final Provider<GetTimeZoneUseCase> getTimeZoneUseCaseProvider;

  private final Provider<NotificationsPrefSaveActionUseCase> notificationsPrefSaveActionUseCaseProvider;

  private final Provider<GetNotificationsSettingUseCase> getNotificationsSettingUseCaseProvider;

  private final Provider<SetAnalyticsSettingUseCase> setAnalyticsSettingUseCaseProvider;

  private final Provider<GetAnalyticsSettingUseCase> getAnalyticsSettingUseCaseProvider;

  private final Provider<SetThemeUseCase> setThemeUseCaseProvider;

  private final Provider<GetThemeUseCase> getThemeUseCaseProvider;

  private final Provider<GetAvailableThemesUseCase> getAvailableThemesUseCaseProvider;

  public SettingsViewModel_AssistedFactory_Factory(
      Provider<SetTimeZoneUseCase> setTimeZoneUseCaseProvider,
      Provider<GetTimeZoneUseCase> getTimeZoneUseCaseProvider,
      Provider<NotificationsPrefSaveActionUseCase> notificationsPrefSaveActionUseCaseProvider,
      Provider<GetNotificationsSettingUseCase> getNotificationsSettingUseCaseProvider,
      Provider<SetAnalyticsSettingUseCase> setAnalyticsSettingUseCaseProvider,
      Provider<GetAnalyticsSettingUseCase> getAnalyticsSettingUseCaseProvider,
      Provider<SetThemeUseCase> setThemeUseCaseProvider,
      Provider<GetThemeUseCase> getThemeUseCaseProvider,
      Provider<GetAvailableThemesUseCase> getAvailableThemesUseCaseProvider) {
    this.setTimeZoneUseCaseProvider = setTimeZoneUseCaseProvider;
    this.getTimeZoneUseCaseProvider = getTimeZoneUseCaseProvider;
    this.notificationsPrefSaveActionUseCaseProvider = notificationsPrefSaveActionUseCaseProvider;
    this.getNotificationsSettingUseCaseProvider = getNotificationsSettingUseCaseProvider;
    this.setAnalyticsSettingUseCaseProvider = setAnalyticsSettingUseCaseProvider;
    this.getAnalyticsSettingUseCaseProvider = getAnalyticsSettingUseCaseProvider;
    this.setThemeUseCaseProvider = setThemeUseCaseProvider;
    this.getThemeUseCaseProvider = getThemeUseCaseProvider;
    this.getAvailableThemesUseCaseProvider = getAvailableThemesUseCaseProvider;
  }

  @Override
  public SettingsViewModel_AssistedFactory get() {
    return newInstance(setTimeZoneUseCaseProvider, getTimeZoneUseCaseProvider, notificationsPrefSaveActionUseCaseProvider, getNotificationsSettingUseCaseProvider, setAnalyticsSettingUseCaseProvider, getAnalyticsSettingUseCaseProvider, setThemeUseCaseProvider, getThemeUseCaseProvider, getAvailableThemesUseCaseProvider);
  }

  public static SettingsViewModel_AssistedFactory_Factory create(
      Provider<SetTimeZoneUseCase> setTimeZoneUseCaseProvider,
      Provider<GetTimeZoneUseCase> getTimeZoneUseCaseProvider,
      Provider<NotificationsPrefSaveActionUseCase> notificationsPrefSaveActionUseCaseProvider,
      Provider<GetNotificationsSettingUseCase> getNotificationsSettingUseCaseProvider,
      Provider<SetAnalyticsSettingUseCase> setAnalyticsSettingUseCaseProvider,
      Provider<GetAnalyticsSettingUseCase> getAnalyticsSettingUseCaseProvider,
      Provider<SetThemeUseCase> setThemeUseCaseProvider,
      Provider<GetThemeUseCase> getThemeUseCaseProvider,
      Provider<GetAvailableThemesUseCase> getAvailableThemesUseCaseProvider) {
    return new SettingsViewModel_AssistedFactory_Factory(setTimeZoneUseCaseProvider, getTimeZoneUseCaseProvider, notificationsPrefSaveActionUseCaseProvider, getNotificationsSettingUseCaseProvider, setAnalyticsSettingUseCaseProvider, getAnalyticsSettingUseCaseProvider, setThemeUseCaseProvider, getThemeUseCaseProvider, getAvailableThemesUseCaseProvider);
  }

  public static SettingsViewModel_AssistedFactory newInstance(
      Provider<SetTimeZoneUseCase> setTimeZoneUseCase,
      Provider<GetTimeZoneUseCase> getTimeZoneUseCase,
      Provider<NotificationsPrefSaveActionUseCase> notificationsPrefSaveActionUseCase,
      Provider<GetNotificationsSettingUseCase> getNotificationsSettingUseCase,
      Provider<SetAnalyticsSettingUseCase> setAnalyticsSettingUseCase,
      Provider<GetAnalyticsSettingUseCase> getAnalyticsSettingUseCase,
      Provider<SetThemeUseCase> setThemeUseCase, Provider<GetThemeUseCase> getThemeUseCase,
      Provider<GetAvailableThemesUseCase> getAvailableThemesUseCase) {
    return new SettingsViewModel_AssistedFactory(setTimeZoneUseCase, getTimeZoneUseCase, notificationsPrefSaveActionUseCase, getNotificationsSettingUseCase, setAnalyticsSettingUseCase, getAnalyticsSettingUseCase, setThemeUseCase, getThemeUseCase, getAvailableThemesUseCase);
  }
}
