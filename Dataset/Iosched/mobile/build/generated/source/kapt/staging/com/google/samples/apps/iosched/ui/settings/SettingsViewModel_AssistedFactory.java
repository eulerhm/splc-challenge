package com.google.samples.apps.iosched.ui.settings;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.google.samples.apps.iosched.shared.domain.prefs.NotificationsPrefSaveActionUseCase;
import com.google.samples.apps.iosched.shared.domain.settings.GetAnalyticsSettingUseCase;
import com.google.samples.apps.iosched.shared.domain.settings.GetAvailableThemesUseCase;
import com.google.samples.apps.iosched.shared.domain.settings.GetNotificationsSettingUseCase;
import com.google.samples.apps.iosched.shared.domain.settings.GetThemeUseCase;
import com.google.samples.apps.iosched.shared.domain.settings.GetTimeZoneUseCase;
import com.google.samples.apps.iosched.shared.domain.settings.SetAnalyticsSettingUseCase;
import com.google.samples.apps.iosched.shared.domain.settings.SetThemeUseCase;
import com.google.samples.apps.iosched.shared.domain.settings.SetTimeZoneUseCase;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class SettingsViewModel_AssistedFactory implements ViewModelAssistedFactory<SettingsViewModel> {
  private final Provider<SetTimeZoneUseCase> setTimeZoneUseCase;

  private final Provider<GetTimeZoneUseCase> getTimeZoneUseCase;

  private final Provider<NotificationsPrefSaveActionUseCase> notificationsPrefSaveActionUseCase;

  private final Provider<GetNotificationsSettingUseCase> getNotificationsSettingUseCase;

  private final Provider<SetAnalyticsSettingUseCase> setAnalyticsSettingUseCase;

  private final Provider<GetAnalyticsSettingUseCase> getAnalyticsSettingUseCase;

  private final Provider<SetThemeUseCase> setThemeUseCase;

  private final Provider<GetThemeUseCase> getThemeUseCase;

  private final Provider<GetAvailableThemesUseCase> getAvailableThemesUseCase;

  @Inject
  SettingsViewModel_AssistedFactory(Provider<SetTimeZoneUseCase> setTimeZoneUseCase,
      Provider<GetTimeZoneUseCase> getTimeZoneUseCase,
      Provider<NotificationsPrefSaveActionUseCase> notificationsPrefSaveActionUseCase,
      Provider<GetNotificationsSettingUseCase> getNotificationsSettingUseCase,
      Provider<SetAnalyticsSettingUseCase> setAnalyticsSettingUseCase,
      Provider<GetAnalyticsSettingUseCase> getAnalyticsSettingUseCase,
      Provider<SetThemeUseCase> setThemeUseCase, Provider<GetThemeUseCase> getThemeUseCase,
      Provider<GetAvailableThemesUseCase> getAvailableThemesUseCase) {
    this.setTimeZoneUseCase = setTimeZoneUseCase;
    this.getTimeZoneUseCase = getTimeZoneUseCase;
    this.notificationsPrefSaveActionUseCase = notificationsPrefSaveActionUseCase;
    this.getNotificationsSettingUseCase = getNotificationsSettingUseCase;
    this.setAnalyticsSettingUseCase = setAnalyticsSettingUseCase;
    this.getAnalyticsSettingUseCase = getAnalyticsSettingUseCase;
    this.setThemeUseCase = setThemeUseCase;
    this.getThemeUseCase = getThemeUseCase;
    this.getAvailableThemesUseCase = getAvailableThemesUseCase;
  }

  @Override
  @NonNull
  public SettingsViewModel create(@NonNull SavedStateHandle arg0) {
    return new SettingsViewModel(setTimeZoneUseCase.get(), getTimeZoneUseCase.get(),
        notificationsPrefSaveActionUseCase.get(), getNotificationsSettingUseCase.get(),
        setAnalyticsSettingUseCase.get(), getAnalyticsSettingUseCase.get(), setThemeUseCase.get(),
        getThemeUseCase.get(), getAvailableThemesUseCase.get());
  }
}
