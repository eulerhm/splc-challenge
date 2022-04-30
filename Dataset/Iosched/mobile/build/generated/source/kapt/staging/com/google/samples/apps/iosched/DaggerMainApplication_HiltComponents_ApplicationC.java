package com.google.samples.apps.iosched;

import android.app.Activity;
import android.app.Service;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.gson.Gson;
import com.google.samples.apps.iosched.di.AppModule;
import com.google.samples.apps.iosched.di.AppModule_ProvideAgendaRepositoryFactory;
import com.google.samples.apps.iosched.di.AppModule_ProvideAnalyticsHelperFactory;
import com.google.samples.apps.iosched.di.AppModule_ProvideAppDatabaseFactory;
import com.google.samples.apps.iosched.di.AppModule_ProvideClipboardManagerFactory;
import com.google.samples.apps.iosched.di.AppModule_ProvideConnectivityManagerFactory;
import com.google.samples.apps.iosched.di.AppModule_ProvideGsonFactory;
import com.google.samples.apps.iosched.di.AppModule_ProvidePreferenceStorageFactory;
import com.google.samples.apps.iosched.di.AppModule_ProvideWifiManagerFactory;
import com.google.samples.apps.iosched.di.AppModule_ProvidesApplicationScopeFactory;
import com.google.samples.apps.iosched.di.CoroutinesModule;
import com.google.samples.apps.iosched.di.CoroutinesModule_ProvidesDefaultDispatcherFactory;
import com.google.samples.apps.iosched.di.CoroutinesModule_ProvidesIoDispatcherFactory;
import com.google.samples.apps.iosched.di.CoroutinesModule_ProvidesMainDispatcherFactory;
import com.google.samples.apps.iosched.di.CoroutinesModule_ProvidesMainImmediateDispatcherFactory;
import com.google.samples.apps.iosched.di.SignInModule;
import com.google.samples.apps.iosched.di.SignInModule_ProvideAuthStateUserDataSourceFactory;
import com.google.samples.apps.iosched.di.SignInModule_ProvideRegisteredUserDataSourceFactory;
import com.google.samples.apps.iosched.di.SignInModule_ProvideSignInHandlerFactory;
import com.google.samples.apps.iosched.di.SignInModule_ProvidesAuthIdDataSourceFactory;
import com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper;
import com.google.samples.apps.iosched.shared.data.ConferenceDataRepository;
import com.google.samples.apps.iosched.shared.data.ConferenceDataSource;
import com.google.samples.apps.iosched.shared.data.agenda.AgendaRepository;
import com.google.samples.apps.iosched.shared.data.ar.ArDebugFlagEndpoint;
import com.google.samples.apps.iosched.shared.data.codelabs.CodelabsRepository;
import com.google.samples.apps.iosched.shared.data.config.AppConfigDataSource;
import com.google.samples.apps.iosched.shared.data.db.AppDatabase;
import com.google.samples.apps.iosched.shared.data.feed.AnnouncementDataSource;
import com.google.samples.apps.iosched.shared.data.feed.FeedRepository;
import com.google.samples.apps.iosched.shared.data.feed.MomentDataSource;
import com.google.samples.apps.iosched.shared.data.feedback.FeedbackEndpoint;
import com.google.samples.apps.iosched.shared.data.job.ConferenceDataService;
import com.google.samples.apps.iosched.shared.data.job.ConferenceDataService_MembersInjector;
import com.google.samples.apps.iosched.shared.data.prefs.PreferenceStorage;
import com.google.samples.apps.iosched.shared.data.prefs.SharedPreferenceStorage;
import com.google.samples.apps.iosched.shared.data.session.SessionRepository;
import com.google.samples.apps.iosched.shared.data.signin.datasources.AuthIdDataSource;
import com.google.samples.apps.iosched.shared.data.signin.datasources.AuthStateUserDataSource;
import com.google.samples.apps.iosched.shared.data.signin.datasources.RegisteredUserDataSource;
import com.google.samples.apps.iosched.shared.data.tag.TagRepository;
import com.google.samples.apps.iosched.shared.data.userevent.DefaultSessionAndUserEventRepository;
import com.google.samples.apps.iosched.shared.data.userevent.SessionAndUserEventRepository;
import com.google.samples.apps.iosched.shared.data.userevent.UserEventDataSource;
import com.google.samples.apps.iosched.shared.di.FeatureFlagsModule;
import com.google.samples.apps.iosched.shared.di.SharedModule;
import com.google.samples.apps.iosched.shared.di.SharedModule_ProvideAnnouncementDataSourceFactory;
import com.google.samples.apps.iosched.shared.di.SharedModule_ProvideAppConfigDataSourceFactory;
import com.google.samples.apps.iosched.shared.di.SharedModule_ProvideArDebugFlagEndpointFactory;
import com.google.samples.apps.iosched.shared.di.SharedModule_ProvideBootstrapRemoteSessionDataSourceFactory;
import com.google.samples.apps.iosched.shared.di.SharedModule_ProvideConferenceDataRepositoryFactory;
import com.google.samples.apps.iosched.shared.di.SharedModule_ProvideConferenceDataSourceFactory;
import com.google.samples.apps.iosched.shared.di.SharedModule_ProvideFeedRepositoryFactory;
import com.google.samples.apps.iosched.shared.di.SharedModule_ProvideFeedbackEndpointFactory;
import com.google.samples.apps.iosched.shared.di.SharedModule_ProvideMomentDataSourceFactory;
import com.google.samples.apps.iosched.shared.di.SharedModule_ProvideSessionAndUserEventRepositoryFactory;
import com.google.samples.apps.iosched.shared.di.SharedModule_ProvideSessionRepositoryFactory;
import com.google.samples.apps.iosched.shared.di.SharedModule_ProvideSessionTextMatchStrategyFactory;
import com.google.samples.apps.iosched.shared.di.SharedModule_ProvideTimeProviderFactory;
import com.google.samples.apps.iosched.shared.di.SharedModule_ProvideTopicSubscriberFactory;
import com.google.samples.apps.iosched.shared.di.SharedModule_ProvideUserEventDataSourceFactory;
import com.google.samples.apps.iosched.shared.domain.RefreshConferenceDataUseCase;
import com.google.samples.apps.iosched.shared.domain.agenda.LoadAgendaUseCase;
import com.google.samples.apps.iosched.shared.domain.ar.LoadArDebugFlagUseCase;
import com.google.samples.apps.iosched.shared.domain.auth.ObserveUserAuthStateUseCase;
import com.google.samples.apps.iosched.shared.domain.codelabs.GetCodelabsInfoCardShownUseCase;
import com.google.samples.apps.iosched.shared.domain.codelabs.LoadCodelabsUseCase;
import com.google.samples.apps.iosched.shared.domain.codelabs.SetCodelabsInfoCardShownUseCase;
import com.google.samples.apps.iosched.shared.domain.feed.GetConferenceStateUseCase;
import com.google.samples.apps.iosched.shared.domain.feed.LoadAnnouncementsUseCase;
import com.google.samples.apps.iosched.shared.domain.feed.LoadCurrentMomentUseCase;
import com.google.samples.apps.iosched.shared.domain.logistics.LoadWifiInfoUseCase;
import com.google.samples.apps.iosched.shared.domain.prefs.MarkScheduleUiHintsShownUseCase;
import com.google.samples.apps.iosched.shared.domain.prefs.MyLocationOptedInUseCase;
import com.google.samples.apps.iosched.shared.domain.prefs.NotificationsPrefIsShownUseCase;
import com.google.samples.apps.iosched.shared.domain.prefs.NotificationsPrefSaveActionUseCase;
import com.google.samples.apps.iosched.shared.domain.prefs.NotificationsPrefShownActionUseCase;
import com.google.samples.apps.iosched.shared.domain.prefs.OnboardingCompleteActionUseCase;
import com.google.samples.apps.iosched.shared.domain.prefs.OnboardingCompletedUseCase;
import com.google.samples.apps.iosched.shared.domain.prefs.OptIntoMyLocationUseCase;
import com.google.samples.apps.iosched.shared.domain.prefs.ScheduleUiHintsShownUseCase;
import com.google.samples.apps.iosched.shared.domain.prefs.StopSnackbarActionUseCase;
import com.google.samples.apps.iosched.shared.domain.search.LoadSearchFiltersUseCase;
import com.google.samples.apps.iosched.shared.domain.search.SessionSearchUseCase;
import com.google.samples.apps.iosched.shared.domain.search.SessionTextMatchStrategy;
import com.google.samples.apps.iosched.shared.domain.sessions.LoadPinnedSessionsJsonUseCase;
import com.google.samples.apps.iosched.shared.domain.sessions.LoadScheduleUserSessionsUseCase;
import com.google.samples.apps.iosched.shared.domain.sessions.LoadSessionOneShotUseCase;
import com.google.samples.apps.iosched.shared.domain.sessions.LoadStarredAndReservedSessionsUseCase;
import com.google.samples.apps.iosched.shared.domain.sessions.LoadUserSessionOneShotUseCase;
import com.google.samples.apps.iosched.shared.domain.sessions.LoadUserSessionUseCase;
import com.google.samples.apps.iosched.shared.domain.sessions.LoadUserSessionsUseCase;
import com.google.samples.apps.iosched.shared.domain.sessions.NotificationAlarmUpdater;
import com.google.samples.apps.iosched.shared.domain.sessions.ObserveConferenceDataUseCase;
import com.google.samples.apps.iosched.shared.domain.sessions.StarReserveNotificationAlarmUpdater;
import com.google.samples.apps.iosched.shared.domain.settings.GetAnalyticsSettingUseCase;
import com.google.samples.apps.iosched.shared.domain.settings.GetAvailableThemesUseCase;
import com.google.samples.apps.iosched.shared.domain.settings.GetNotificationsSettingUseCase;
import com.google.samples.apps.iosched.shared.domain.settings.GetThemeUseCase;
import com.google.samples.apps.iosched.shared.domain.settings.GetTimeZoneUseCase;
import com.google.samples.apps.iosched.shared.domain.settings.ObserveThemeModeUseCase;
import com.google.samples.apps.iosched.shared.domain.settings.SetAnalyticsSettingUseCase;
import com.google.samples.apps.iosched.shared.domain.settings.SetThemeUseCase;
import com.google.samples.apps.iosched.shared.domain.settings.SetTimeZoneUseCase;
import com.google.samples.apps.iosched.shared.domain.speakers.LoadSpeakerUseCase;
import com.google.samples.apps.iosched.shared.domain.users.FeedbackUseCase;
import com.google.samples.apps.iosched.shared.domain.users.ReservationActionUseCase;
import com.google.samples.apps.iosched.shared.domain.users.StarEventAndNotifyUseCase;
import com.google.samples.apps.iosched.shared.domain.users.SwapActionUseCase;
import com.google.samples.apps.iosched.shared.fcm.TopicSubscriber;
import com.google.samples.apps.iosched.shared.notifications.AlarmBroadcastReceiver;
import com.google.samples.apps.iosched.shared.notifications.AlarmBroadcastReceiver_MembersInjector;
import com.google.samples.apps.iosched.shared.notifications.CancelNotificationBroadcastReceiver;
import com.google.samples.apps.iosched.shared.notifications.CancelNotificationBroadcastReceiver_MembersInjector;
import com.google.samples.apps.iosched.shared.notifications.SessionAlarmManager;
import com.google.samples.apps.iosched.shared.time.TimeProvider;
import com.google.samples.apps.iosched.shared.util.NetworkUtils;
import com.google.samples.apps.iosched.ui.LaunchViewModel_AssistedFactory;
import com.google.samples.apps.iosched.ui.LaunchViewModel_AssistedFactory_Factory;
import com.google.samples.apps.iosched.ui.LauncherActivity;
import com.google.samples.apps.iosched.ui.MainActivity;
import com.google.samples.apps.iosched.ui.MainActivityViewModel_AssistedFactory;
import com.google.samples.apps.iosched.ui.MainActivityViewModel_AssistedFactory_Factory;
import com.google.samples.apps.iosched.ui.MainActivity_MembersInjector;
import com.google.samples.apps.iosched.ui.agenda.AgendaFragment;
import com.google.samples.apps.iosched.ui.agenda.AgendaViewModel_AssistedFactory;
import com.google.samples.apps.iosched.ui.agenda.AgendaViewModel_AssistedFactory_Factory;
import com.google.samples.apps.iosched.ui.codelabs.CodelabsFragment;
import com.google.samples.apps.iosched.ui.codelabs.CodelabsFragment_MembersInjector;
import com.google.samples.apps.iosched.ui.codelabs.CodelabsViewModel_AssistedFactory;
import com.google.samples.apps.iosched.ui.codelabs.CodelabsViewModel_AssistedFactory_Factory;
import com.google.samples.apps.iosched.ui.feed.AnnouncementsFragment;
import com.google.samples.apps.iosched.ui.feed.AnnouncementsFragment_MembersInjector;
import com.google.samples.apps.iosched.ui.feed.AnnouncementsViewModel_AssistedFactory;
import com.google.samples.apps.iosched.ui.feed.AnnouncementsViewModel_AssistedFactory_Factory;
import com.google.samples.apps.iosched.ui.feed.FeedFragment;
import com.google.samples.apps.iosched.ui.feed.FeedFragment_MembersInjector;
import com.google.samples.apps.iosched.ui.feed.FeedViewModel_AssistedFactory;
import com.google.samples.apps.iosched.ui.feed.FeedViewModel_AssistedFactory_Factory;
import com.google.samples.apps.iosched.ui.filters.FiltersViewModelDelegate;
import com.google.samples.apps.iosched.ui.filters.FiltersViewModelDelegateModule;
import com.google.samples.apps.iosched.ui.filters.FiltersViewModelDelegateModule_ProvideFiltersViewModelDelegateFactory;
import com.google.samples.apps.iosched.ui.info.EventFragment;
import com.google.samples.apps.iosched.ui.info.EventFragment_MembersInjector;
import com.google.samples.apps.iosched.ui.info.EventInfoViewModel_AssistedFactory;
import com.google.samples.apps.iosched.ui.info.EventInfoViewModel_AssistedFactory_Factory;
import com.google.samples.apps.iosched.ui.info.FaqFragment;
import com.google.samples.apps.iosched.ui.info.InfoFragment;
import com.google.samples.apps.iosched.ui.info.InfoFragment_MembersInjector;
import com.google.samples.apps.iosched.ui.info.TravelFragment;
import com.google.samples.apps.iosched.ui.map.LoadGeoJsonFeaturesUseCase;
import com.google.samples.apps.iosched.ui.map.MapFragment;
import com.google.samples.apps.iosched.ui.map.MapFragment_MembersInjector;
import com.google.samples.apps.iosched.ui.map.MapVariantSelectionDialogFragment;
import com.google.samples.apps.iosched.ui.map.MapViewModel_AssistedFactory;
import com.google.samples.apps.iosched.ui.map.MapViewModel_AssistedFactory_Factory;
import com.google.samples.apps.iosched.ui.messages.SnackbarMessageManager;
import com.google.samples.apps.iosched.ui.onboarding.OnboardingActivity;
import com.google.samples.apps.iosched.ui.onboarding.OnboardingFragment;
import com.google.samples.apps.iosched.ui.onboarding.OnboardingSignInFragment;
import com.google.samples.apps.iosched.ui.onboarding.OnboardingViewModel_AssistedFactory;
import com.google.samples.apps.iosched.ui.onboarding.OnboardingViewModel_AssistedFactory_Factory;
import com.google.samples.apps.iosched.ui.onboarding.WelcomeDuringConferenceFragment;
import com.google.samples.apps.iosched.ui.onboarding.WelcomePreConferenceFragment;
import com.google.samples.apps.iosched.ui.prefs.SnackbarPreferenceViewModel_AssistedFactory;
import com.google.samples.apps.iosched.ui.prefs.SnackbarPreferenceViewModel_AssistedFactory_Factory;
import com.google.samples.apps.iosched.ui.reservation.RemoveReservationDialogFragment;
import com.google.samples.apps.iosched.ui.reservation.RemoveReservationViewModel_AssistedFactory;
import com.google.samples.apps.iosched.ui.reservation.RemoveReservationViewModel_AssistedFactory_Factory;
import com.google.samples.apps.iosched.ui.reservation.SwapReservationDialogFragment;
import com.google.samples.apps.iosched.ui.reservation.SwapReservationDialogFragment_MembersInjector;
import com.google.samples.apps.iosched.ui.schedule.ScheduleFragment;
import com.google.samples.apps.iosched.ui.schedule.ScheduleFragment_MembersInjector;
import com.google.samples.apps.iosched.ui.schedule.ScheduleUiHintsDialogFragment;
import com.google.samples.apps.iosched.ui.schedule.ScheduleUiHintsDialogFragment_MembersInjector;
import com.google.samples.apps.iosched.ui.schedule.ScheduleViewModel_AssistedFactory;
import com.google.samples.apps.iosched.ui.schedule.ScheduleViewModel_AssistedFactory_Factory;
import com.google.samples.apps.iosched.ui.search.SearchFilterFragment;
import com.google.samples.apps.iosched.ui.search.SearchFragment;
import com.google.samples.apps.iosched.ui.search.SearchFragment_MembersInjector;
import com.google.samples.apps.iosched.ui.search.SearchViewModel_AssistedFactory;
import com.google.samples.apps.iosched.ui.search.SearchViewModel_AssistedFactory_Factory;
import com.google.samples.apps.iosched.ui.sessioncommon.EventActionsViewModelDelegate;
import com.google.samples.apps.iosched.ui.sessioncommon.EventActionsViewModelDelegateModule;
import com.google.samples.apps.iosched.ui.sessioncommon.EventActionsViewModelDelegateModule_ProvideEventActionsViewModelDelegateFactory;
import com.google.samples.apps.iosched.ui.sessioncommon.SessionViewPoolModule;
import com.google.samples.apps.iosched.ui.sessioncommon.SessionViewPoolModule_ProvidesTagViewPoolFactory;
import com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailActivity;
import com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailActivity_MembersInjector;
import com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailFragment;
import com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailFragment_MembersInjector;
import com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailViewModel_AssistedFactory;
import com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailViewModel_AssistedFactory_Factory;
import com.google.samples.apps.iosched.ui.sessiondetail.SessionFeedbackFragment;
import com.google.samples.apps.iosched.ui.sessiondetail.SessionFeedbackViewModel_AssistedFactory;
import com.google.samples.apps.iosched.ui.sessiondetail.SessionFeedbackViewModel_AssistedFactory_Factory;
import com.google.samples.apps.iosched.ui.settings.SettingsFragment;
import com.google.samples.apps.iosched.ui.settings.SettingsViewModel_AssistedFactory;
import com.google.samples.apps.iosched.ui.settings.SettingsViewModel_AssistedFactory_Factory;
import com.google.samples.apps.iosched.ui.settings.ThemeSettingDialogFragment;
import com.google.samples.apps.iosched.ui.signin.NotificationsPreferenceDialogFragment;
import com.google.samples.apps.iosched.ui.signin.NotificationsPreferenceDialogFragment_MembersInjector;
import com.google.samples.apps.iosched.ui.signin.SignInDialogFragment;
import com.google.samples.apps.iosched.ui.signin.SignInDialogFragment_MembersInjector;
import com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate;
import com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegateModule;
import com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegateModule_ProvideSignInViewModelDelegateFactory;
import com.google.samples.apps.iosched.ui.signin.SignInViewModel_AssistedFactory;
import com.google.samples.apps.iosched.ui.signin.SignInViewModel_AssistedFactory_Factory;
import com.google.samples.apps.iosched.ui.signin.SignOutDialogFragment;
import com.google.samples.apps.iosched.ui.signin.SignOutDialogFragment_MembersInjector;
import com.google.samples.apps.iosched.ui.speaker.SpeakerFragment;
import com.google.samples.apps.iosched.ui.speaker.SpeakerFragment_MembersInjector;
import com.google.samples.apps.iosched.ui.speaker.SpeakerViewModel_AssistedFactory;
import com.google.samples.apps.iosched.ui.speaker.SpeakerViewModel_AssistedFactory_Factory;
import com.google.samples.apps.iosched.ui.theme.ThemeViewModel_AssistedFactory;
import com.google.samples.apps.iosched.ui.theme.ThemeViewModel_AssistedFactory_Factory;
import com.google.samples.apps.iosched.ui.theme.ThemedActivityDelegate;
import com.google.samples.apps.iosched.ui.theme.ThemedActivityDelegateImpl;
import com.google.samples.apps.iosched.util.signin.SignInHandler;
import com.google.samples.apps.iosched.util.wifi.WifiInstaller;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerMainApplication_HiltComponents_ApplicationC extends MainApplication_HiltComponents.ApplicationC {
  private final AppModule appModule;

  private final ApplicationContextModule applicationContextModule;

  private final SignInModule signInModule;

  private final SharedModule sharedModule;

  private final FeatureFlagsModule featureFlagsModule;

  private final SignInViewModelDelegateModule signInViewModelDelegateModule;

  private final FiltersViewModelDelegateModule filtersViewModelDelegateModule;

  private volatile Object applicationScopeCoroutineScope = new MemoizedSentinel();

  private volatile Object registeredUserDataSource = new MemoizedSentinel();

  private volatile Object userEventDataSource = new MemoizedSentinel();

  private volatile Object namedConferenceDataSource = new MemoizedSentinel();

  private volatile Object namedConferenceDataSource2 = new MemoizedSentinel();

  private volatile Object appDatabase = new MemoizedSentinel();

  private volatile Object conferenceDataRepository = new MemoizedSentinel();

  private volatile Object sessionRepository = new MemoizedSentinel();

  private volatile Object sessionAndUserEventRepository = new MemoizedSentinel();

  private volatile Object notificationAlarmUpdater = new MemoizedSentinel();

  private volatile Object authStateUserDataSource = new MemoizedSentinel();

  private volatile Object topicSubscriber = new MemoizedSentinel();

  private volatile Object observeUserAuthStateUseCase = new MemoizedSentinel();

  private volatile Object preferenceStorage = new MemoizedSentinel();

  private volatile Object appConfigDataSource = new MemoizedSentinel();

  private volatile Object signInViewModelDelegate = new MemoizedSentinel();

  private volatile Object analyticsHelper = new MemoizedSentinel();

  private volatile Object sharedPreferenceStorage = new MemoizedSentinel();

  private volatile Object defaultSessionAndUserEventRepository = new MemoizedSentinel();

  private volatile Object authIdDataSource = new MemoizedSentinel();

  private volatile Object snackbarMessageManager = new MemoizedSentinel();

  private volatile Object exploreArEnabledFlagBoolean = new MemoizedSentinel();

  private volatile Object agendaRepository = new MemoizedSentinel();

  private volatile Object announcementDataSource = new MemoizedSentinel();

  private volatile Object momentDataSource = new MemoizedSentinel();

  private volatile Object feedRepository = new MemoizedSentinel();

  private volatile Object timeProvider = new MemoizedSentinel();

  private volatile Provider<TimeProvider> provideTimeProvider;

  private volatile Object codelabsRepository = new MemoizedSentinel();

  private volatile Object loadWifiInfoUseCase = new MemoizedSentinel();

  private volatile Provider<LoadWifiInfoUseCase> loadWifiInfoUseCaseProvider;

  private volatile Provider<AnalyticsHelper> provideAnalyticsHelperProvider;

  private volatile Provider<SignInViewModelDelegate> provideSignInViewModelDelegateProvider;

  private volatile Object themedActivityDelegate = new MemoizedSentinel();

  private volatile Provider<ThemedActivityDelegate> provideThemedActivityDelegateProvider;

  private volatile Object gson = new MemoizedSentinel();

  private volatile Object arDebugFlagEndpoint = new MemoizedSentinel();

  private volatile Provider<Context> provideContextProvider;

  private volatile Object starReserveNotificationAlarmUpdater = new MemoizedSentinel();

  private volatile Provider<TopicSubscriber> provideTopicSubscriberProvider;

  private volatile Provider<SnackbarMessageManager> snackbarMessageManagerProvider;

  private volatile Object sessionTextMatchStrategy = new MemoizedSentinel();

  private volatile Object tagRepository = new MemoizedSentinel();

  private volatile Provider<FiltersViewModelDelegate> provideFiltersViewModelDelegateProvider;

  private volatile Provider<Boolean> provideReservationEnabledFlagProvider;

  private volatile Provider<CoroutineDispatcher> providesDefaultDispatcherProvider;

  private volatile Object feedbackEndpoint = new MemoizedSentinel();

  private volatile Provider<GetThemeUseCase> getThemeUseCaseProvider;

  private DaggerMainApplication_HiltComponents_ApplicationC(AppModule appModuleParam,
      ApplicationContextModule applicationContextModuleParam,
      FeatureFlagsModule featureFlagsModuleParam,
      FiltersViewModelDelegateModule filtersViewModelDelegateModuleParam,
      SharedModule sharedModuleParam, SignInModule signInModuleParam,
      SignInViewModelDelegateModule signInViewModelDelegateModuleParam) {
    this.appModule = appModuleParam;
    this.applicationContextModule = applicationContextModuleParam;
    this.signInModule = signInModuleParam;
    this.sharedModule = sharedModuleParam;
    this.featureFlagsModule = featureFlagsModuleParam;
    this.signInViewModelDelegateModule = signInViewModelDelegateModuleParam;
    this.filtersViewModelDelegateModule = filtersViewModelDelegateModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  private CoroutineScope getApplicationScopeCoroutineScope() {
    Object local = applicationScopeCoroutineScope;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = applicationScopeCoroutineScope;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvidesApplicationScopeFactory.providesApplicationScope(appModule, CoroutinesModule_ProvidesDefaultDispatcherFactory.providesDefaultDispatcher());
          applicationScopeCoroutineScope = DoubleCheck.reentrantCheck(applicationScopeCoroutineScope, local);
        }
      }
    }
    return (CoroutineScope) local;
  }

  private RegisteredUserDataSource getRegisteredUserDataSource() {
    Object local = registeredUserDataSource;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = registeredUserDataSource;
        if (local instanceof MemoizedSentinel) {
          local = SignInModule_ProvideRegisteredUserDataSourceFactory.provideRegisteredUserDataSource(signInModule, ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
          registeredUserDataSource = DoubleCheck.reentrantCheck(registeredUserDataSource, local);
        }
      }
    }
    return (RegisteredUserDataSource) local;
  }

  private SessionAlarmManager getSessionAlarmManager() {
    return new SessionAlarmManager(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
  }

  private UserEventDataSource getUserEventDataSource() {
    Object local = userEventDataSource;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = userEventDataSource;
        if (local instanceof MemoizedSentinel) {
          local = SharedModule_ProvideUserEventDataSourceFactory.provideUserEventDataSource(sharedModule);
          userEventDataSource = DoubleCheck.reentrantCheck(userEventDataSource, local);
        }
      }
    }
    return (UserEventDataSource) local;
  }

  private ConferenceDataSource getNamedConferenceDataSource() {
    Object local = namedConferenceDataSource;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = namedConferenceDataSource;
        if (local instanceof MemoizedSentinel) {
          local = SharedModule_ProvideConferenceDataSourceFactory.provideConferenceDataSource(sharedModule);
          namedConferenceDataSource = DoubleCheck.reentrantCheck(namedConferenceDataSource, local);
        }
      }
    }
    return (ConferenceDataSource) local;
  }

  private ConferenceDataSource getNamedConferenceDataSource2() {
    Object local = namedConferenceDataSource2;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = namedConferenceDataSource2;
        if (local instanceof MemoizedSentinel) {
          local = SharedModule_ProvideBootstrapRemoteSessionDataSourceFactory.provideBootstrapRemoteSessionDataSource(sharedModule);
          namedConferenceDataSource2 = DoubleCheck.reentrantCheck(namedConferenceDataSource2, local);
        }
      }
    }
    return (ConferenceDataSource) local;
  }

  private AppDatabase getAppDatabase() {
    Object local = appDatabase;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = appDatabase;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvideAppDatabaseFactory.provideAppDatabase(appModule, ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
          appDatabase = DoubleCheck.reentrantCheck(appDatabase, local);
        }
      }
    }
    return (AppDatabase) local;
  }

  private ConferenceDataRepository getConferenceDataRepository() {
    Object local = conferenceDataRepository;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = conferenceDataRepository;
        if (local instanceof MemoizedSentinel) {
          local = SharedModule_ProvideConferenceDataRepositoryFactory.provideConferenceDataRepository(sharedModule, getNamedConferenceDataSource(), getNamedConferenceDataSource2(), getAppDatabase());
          conferenceDataRepository = DoubleCheck.reentrantCheck(conferenceDataRepository, local);
        }
      }
    }
    return (ConferenceDataRepository) local;
  }

  private SessionRepository getSessionRepository() {
    Object local = sessionRepository;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = sessionRepository;
        if (local instanceof MemoizedSentinel) {
          local = SharedModule_ProvideSessionRepositoryFactory.provideSessionRepository(sharedModule, getConferenceDataRepository());
          sessionRepository = DoubleCheck.reentrantCheck(sessionRepository, local);
        }
      }
    }
    return (SessionRepository) local;
  }

  private SessionAndUserEventRepository getSessionAndUserEventRepository() {
    Object local = sessionAndUserEventRepository;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = sessionAndUserEventRepository;
        if (local instanceof MemoizedSentinel) {
          local = SharedModule_ProvideSessionAndUserEventRepositoryFactory.provideSessionAndUserEventRepository(sharedModule, getUserEventDataSource(), getSessionRepository());
          sessionAndUserEventRepository = DoubleCheck.reentrantCheck(sessionAndUserEventRepository, local);
        }
      }
    }
    return (SessionAndUserEventRepository) local;
  }

  private NotificationAlarmUpdater getNotificationAlarmUpdater() {
    Object local = notificationAlarmUpdater;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = notificationAlarmUpdater;
        if (local instanceof MemoizedSentinel) {
          local = new NotificationAlarmUpdater(getSessionAlarmManager(), getSessionAndUserEventRepository(), getApplicationScopeCoroutineScope());
          notificationAlarmUpdater = DoubleCheck.reentrantCheck(notificationAlarmUpdater, local);
        }
      }
    }
    return (NotificationAlarmUpdater) local;
  }

  private AuthStateUserDataSource getAuthStateUserDataSource() {
    Object local = authStateUserDataSource;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = authStateUserDataSource;
        if (local instanceof MemoizedSentinel) {
          local = SignInModule_ProvideAuthStateUserDataSourceFactory.provideAuthStateUserDataSource(signInModule, ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule), getNotificationAlarmUpdater());
          authStateUserDataSource = DoubleCheck.reentrantCheck(authStateUserDataSource, local);
        }
      }
    }
    return (AuthStateUserDataSource) local;
  }

  private TopicSubscriber getTopicSubscriber() {
    Object local = topicSubscriber;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = topicSubscriber;
        if (local instanceof MemoizedSentinel) {
          local = SharedModule_ProvideTopicSubscriberFactory.provideTopicSubscriber(sharedModule);
          topicSubscriber = DoubleCheck.reentrantCheck(topicSubscriber, local);
        }
      }
    }
    return (TopicSubscriber) local;
  }

  private ObserveUserAuthStateUseCase getObserveUserAuthStateUseCase() {
    Object local = observeUserAuthStateUseCase;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = observeUserAuthStateUseCase;
        if (local instanceof MemoizedSentinel) {
          local = new ObserveUserAuthStateUseCase(getRegisteredUserDataSource(), getAuthStateUserDataSource(), getTopicSubscriber(), getApplicationScopeCoroutineScope(), CoroutinesModule_ProvidesIoDispatcherFactory.providesIoDispatcher());
          observeUserAuthStateUseCase = DoubleCheck.reentrantCheck(observeUserAuthStateUseCase, local);
        }
      }
    }
    return (ObserveUserAuthStateUseCase) local;
  }

  private PreferenceStorage getPreferenceStorage() {
    Object local = preferenceStorage;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = preferenceStorage;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvidePreferenceStorageFactory.providePreferenceStorage(appModule, ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
          preferenceStorage = DoubleCheck.reentrantCheck(preferenceStorage, local);
        }
      }
    }
    return (PreferenceStorage) local;
  }

  private NotificationsPrefIsShownUseCase getNotificationsPrefIsShownUseCase() {
    return new NotificationsPrefIsShownUseCase(getPreferenceStorage(), CoroutinesModule_ProvidesIoDispatcherFactory.providesIoDispatcher());
  }

  private AppConfigDataSource getAppConfigDataSource() {
    Object local = appConfigDataSource;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = appConfigDataSource;
        if (local instanceof MemoizedSentinel) {
          local = SharedModule_ProvideAppConfigDataSourceFactory.provideAppConfigDataSource(sharedModule);
          appConfigDataSource = DoubleCheck.reentrantCheck(appConfigDataSource, local);
        }
      }
    }
    return (AppConfigDataSource) local;
  }

  private boolean getReservationEnabledFlagBoolean() {
    return featureFlagsModule.provideReservationEnabledFlag(getAppConfigDataSource());
  }

  private SignInViewModelDelegate getSignInViewModelDelegate() {
    Object local = signInViewModelDelegate;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = signInViewModelDelegate;
        if (local instanceof MemoizedSentinel) {
          local = SignInViewModelDelegateModule_ProvideSignInViewModelDelegateFactory.provideSignInViewModelDelegate(signInViewModelDelegateModule, getObserveUserAuthStateUseCase(), getNotificationsPrefIsShownUseCase(), CoroutinesModule_ProvidesIoDispatcherFactory.providesIoDispatcher(), CoroutinesModule_ProvidesMainDispatcherFactory.providesMainDispatcher(), getReservationEnabledFlagBoolean());
          signInViewModelDelegate = DoubleCheck.reentrantCheck(signInViewModelDelegate, local);
        }
      }
    }
    return (SignInViewModelDelegate) local;
  }

  private AnalyticsHelper getAnalyticsHelper() {
    Object local = analyticsHelper;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = analyticsHelper;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvideAnalyticsHelperFactory.provideAnalyticsHelper(appModule, getApplicationScopeCoroutineScope(), ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule), getSignInViewModelDelegate(), getPreferenceStorage());
          analyticsHelper = DoubleCheck.reentrantCheck(analyticsHelper, local);
        }
      }
    }
    return (AnalyticsHelper) local;
  }

  private SharedPreferenceStorage getSharedPreferenceStorage() {
    Object local = sharedPreferenceStorage;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = sharedPreferenceStorage;
        if (local instanceof MemoizedSentinel) {
          local = new SharedPreferenceStorage(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
          sharedPreferenceStorage = DoubleCheck.reentrantCheck(sharedPreferenceStorage, local);
        }
      }
    }
    return (SharedPreferenceStorage) local;
  }

  private DefaultSessionAndUserEventRepository getDefaultSessionAndUserEventRepository() {
    Object local = defaultSessionAndUserEventRepository;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = defaultSessionAndUserEventRepository;
        if (local instanceof MemoizedSentinel) {
          local = new DefaultSessionAndUserEventRepository(getUserEventDataSource(), getSessionRepository());
          defaultSessionAndUserEventRepository = DoubleCheck.reentrantCheck(defaultSessionAndUserEventRepository, local);
        }
      }
    }
    return (DefaultSessionAndUserEventRepository) local;
  }

  private LoadUserSessionOneShotUseCase getLoadUserSessionOneShotUseCase() {
    return new LoadUserSessionOneShotUseCase(getDefaultSessionAndUserEventRepository(), CoroutinesModule_ProvidesIoDispatcherFactory.providesIoDispatcher());
  }

  private LoadSessionOneShotUseCase getLoadSessionOneShotUseCase() {
    return new LoadSessionOneShotUseCase(getSessionRepository(), CoroutinesModule_ProvidesIoDispatcherFactory.providesIoDispatcher());
  }

  private AuthIdDataSource getAuthIdDataSource() {
    Object local = authIdDataSource;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = authIdDataSource;
        if (local instanceof MemoizedSentinel) {
          local = SignInModule_ProvidesAuthIdDataSourceFactory.providesAuthIdDataSource(signInModule);
          authIdDataSource = DoubleCheck.reentrantCheck(authIdDataSource, local);
        }
      }
    }
    return (AuthIdDataSource) local;
  }

  private SnackbarMessageManager getSnackbarMessageManager() {
    Object local = snackbarMessageManager;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = snackbarMessageManager;
        if (local instanceof MemoizedSentinel) {
          local = new SnackbarMessageManager(getPreferenceStorage());
          snackbarMessageManager = DoubleCheck.reentrantCheck(snackbarMessageManager, local);
        }
      }
    }
    return (SnackbarMessageManager) local;
  }

  private ConnectivityManager getConnectivityManager() {
    return AppModule_ProvideConnectivityManagerFactory.provideConnectivityManager(appModule, ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
  }

  private boolean getMapFeatureEnabledFlagBoolean() {
    return featureFlagsModule.provideMapFeatureEnabledFlag(getAppConfigDataSource());
  }

  private boolean getCodelabsEnabledFlagBoolean() {
    return featureFlagsModule.provideCodelabsEnabledFlag(getAppConfigDataSource());
  }

  private boolean getExploreArEnabledFlagBoolean() {
    Object local = exploreArEnabledFlagBoolean;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = exploreArEnabledFlagBoolean;
        if (local instanceof MemoizedSentinel) {
          local = featureFlagsModule.provideEnableExploreArFlag(getAppConfigDataSource());
          exploreArEnabledFlagBoolean = DoubleCheck.reentrantCheck(exploreArEnabledFlagBoolean, local);
        }
      }
    }
    return (boolean) local;
  }

  private AgendaRepository getAgendaRepository() {
    Object local = agendaRepository;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = agendaRepository;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvideAgendaRepositoryFactory.provideAgendaRepository(appModule, getAppConfigDataSource());
          agendaRepository = DoubleCheck.reentrantCheck(agendaRepository, local);
        }
      }
    }
    return (AgendaRepository) local;
  }

  private AnnouncementDataSource getAnnouncementDataSource() {
    Object local = announcementDataSource;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = announcementDataSource;
        if (local instanceof MemoizedSentinel) {
          local = SharedModule_ProvideAnnouncementDataSourceFactory.provideAnnouncementDataSource(sharedModule);
          announcementDataSource = DoubleCheck.reentrantCheck(announcementDataSource, local);
        }
      }
    }
    return (AnnouncementDataSource) local;
  }

  private MomentDataSource getMomentDataSource() {
    Object local = momentDataSource;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = momentDataSource;
        if (local instanceof MemoizedSentinel) {
          local = SharedModule_ProvideMomentDataSourceFactory.provideMomentDataSource(sharedModule);
          momentDataSource = DoubleCheck.reentrantCheck(momentDataSource, local);
        }
      }
    }
    return (MomentDataSource) local;
  }

  private FeedRepository getFeedRepository() {
    Object local = feedRepository;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = feedRepository;
        if (local instanceof MemoizedSentinel) {
          local = SharedModule_ProvideFeedRepositoryFactory.provideFeedRepository(sharedModule, getAnnouncementDataSource(), getMomentDataSource());
          feedRepository = DoubleCheck.reentrantCheck(feedRepository, local);
        }
      }
    }
    return (FeedRepository) local;
  }

  private TimeProvider getTimeProvider() {
    Object local = timeProvider;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = timeProvider;
        if (local instanceof MemoizedSentinel) {
          local = SharedModule_ProvideTimeProviderFactory.provideTimeProvider(sharedModule);
          timeProvider = DoubleCheck.reentrantCheck(timeProvider, local);
        }
      }
    }
    return (TimeProvider) local;
  }

  private Provider<TimeProvider> getTimeProviderProvider() {
    Object local = provideTimeProvider;
    if (local == null) {
      local = new SwitchingProvider<>(0);
      provideTimeProvider = (Provider<TimeProvider>) local;
    }
    return (Provider<TimeProvider>) local;
  }

  private CodelabsRepository getCodelabsRepository() {
    Object local = codelabsRepository;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = codelabsRepository;
        if (local instanceof MemoizedSentinel) {
          local = new CodelabsRepository(getConferenceDataRepository());
          codelabsRepository = DoubleCheck.reentrantCheck(codelabsRepository, local);
        }
      }
    }
    return (CodelabsRepository) local;
  }

  private LoadWifiInfoUseCase getLoadWifiInfoUseCase() {
    Object local = loadWifiInfoUseCase;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = loadWifiInfoUseCase;
        if (local instanceof MemoizedSentinel) {
          local = new LoadWifiInfoUseCase(getAppConfigDataSource(), CoroutinesModule_ProvidesIoDispatcherFactory.providesIoDispatcher());
          loadWifiInfoUseCase = DoubleCheck.reentrantCheck(loadWifiInfoUseCase, local);
        }
      }
    }
    return (LoadWifiInfoUseCase) local;
  }

  private Provider<LoadWifiInfoUseCase> getLoadWifiInfoUseCaseProvider() {
    Object local = loadWifiInfoUseCaseProvider;
    if (local == null) {
      local = new SwitchingProvider<>(1);
      loadWifiInfoUseCaseProvider = (Provider<LoadWifiInfoUseCase>) local;
    }
    return (Provider<LoadWifiInfoUseCase>) local;
  }

  private WifiManager getWifiManager() {
    return AppModule_ProvideWifiManagerFactory.provideWifiManager(appModule, ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
  }

  private ClipboardManager getClipboardManager() {
    return AppModule_ProvideClipboardManagerFactory.provideClipboardManager(appModule, ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
  }

  private Provider<AnalyticsHelper> getAnalyticsHelperProvider() {
    Object local = provideAnalyticsHelperProvider;
    if (local == null) {
      local = new SwitchingProvider<>(2);
      provideAnalyticsHelperProvider = (Provider<AnalyticsHelper>) local;
    }
    return (Provider<AnalyticsHelper>) local;
  }

  private Provider<SignInViewModelDelegate> getSignInViewModelDelegateProvider() {
    Object local = provideSignInViewModelDelegateProvider;
    if (local == null) {
      local = new SwitchingProvider<>(3);
      provideSignInViewModelDelegateProvider = (Provider<SignInViewModelDelegate>) local;
    }
    return (Provider<SignInViewModelDelegate>) local;
  }

  private ObserveThemeModeUseCase getObserveThemeModeUseCase() {
    return new ObserveThemeModeUseCase(getPreferenceStorage(), CoroutinesModule_ProvidesDefaultDispatcherFactory.providesDefaultDispatcher());
  }

  private GetThemeUseCase getGetThemeUseCase() {
    return new GetThemeUseCase(getPreferenceStorage(), CoroutinesModule_ProvidesIoDispatcherFactory.providesIoDispatcher());
  }

  private ThemedActivityDelegateImpl getThemedActivityDelegateImpl() {
    return new ThemedActivityDelegateImpl(getObserveThemeModeUseCase(), getGetThemeUseCase());
  }

  private ThemedActivityDelegate getThemedActivityDelegate() {
    Object local = themedActivityDelegate;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = themedActivityDelegate;
        if (local instanceof MemoizedSentinel) {
          local = getThemedActivityDelegateImpl();
          themedActivityDelegate = DoubleCheck.reentrantCheck(themedActivityDelegate, local);
        }
      }
    }
    return (ThemedActivityDelegate) local;
  }

  private Provider<ThemedActivityDelegate> getThemedActivityDelegateProvider() {
    Object local = provideThemedActivityDelegateProvider;
    if (local == null) {
      local = new SwitchingProvider<>(4);
      provideThemedActivityDelegateProvider = (Provider<ThemedActivityDelegate>) local;
    }
    return (Provider<ThemedActivityDelegate>) local;
  }

  private Gson getGson() {
    Object local = gson;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = gson;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvideGsonFactory.provideGson(appModule);
          gson = DoubleCheck.reentrantCheck(gson, local);
        }
      }
    }
    return (Gson) local;
  }

  private ArDebugFlagEndpoint getArDebugFlagEndpoint() {
    Object local = arDebugFlagEndpoint;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = arDebugFlagEndpoint;
        if (local instanceof MemoizedSentinel) {
          local = SharedModule_ProvideArDebugFlagEndpointFactory.provideArDebugFlagEndpoint(sharedModule);
          arDebugFlagEndpoint = DoubleCheck.reentrantCheck(arDebugFlagEndpoint, local);
        }
      }
    }
    return (ArDebugFlagEndpoint) local;
  }

  private Provider<Context> getApplicationContextContextProvider() {
    Object local = provideContextProvider;
    if (local == null) {
      local = new SwitchingProvider<>(5);
      provideContextProvider = (Provider<Context>) local;
    }
    return (Provider<Context>) local;
  }

  private StarReserveNotificationAlarmUpdater getStarReserveNotificationAlarmUpdater() {
    Object local = starReserveNotificationAlarmUpdater;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = starReserveNotificationAlarmUpdater;
        if (local instanceof MemoizedSentinel) {
          local = new StarReserveNotificationAlarmUpdater(getSessionAlarmManager());
          starReserveNotificationAlarmUpdater = DoubleCheck.reentrantCheck(starReserveNotificationAlarmUpdater, local);
        }
      }
    }
    return (StarReserveNotificationAlarmUpdater) local;
  }

  private Provider<TopicSubscriber> getTopicSubscriberProvider() {
    Object local = provideTopicSubscriberProvider;
    if (local == null) {
      local = new SwitchingProvider<>(6);
      provideTopicSubscriberProvider = (Provider<TopicSubscriber>) local;
    }
    return (Provider<TopicSubscriber>) local;
  }

  private Provider<SnackbarMessageManager> getSnackbarMessageManagerProvider() {
    Object local = snackbarMessageManagerProvider;
    if (local == null) {
      local = new SwitchingProvider<>(7);
      snackbarMessageManagerProvider = (Provider<SnackbarMessageManager>) local;
    }
    return (Provider<SnackbarMessageManager>) local;
  }

  private boolean getSearchUsingRoomEnabledFlagBoolean() {
    return featureFlagsModule.provideSearchUsingRoomEnabledFlag(getAppConfigDataSource());
  }

  private SessionTextMatchStrategy getSessionTextMatchStrategy() {
    Object local = sessionTextMatchStrategy;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = sessionTextMatchStrategy;
        if (local instanceof MemoizedSentinel) {
          local = SharedModule_ProvideSessionTextMatchStrategyFactory.provideSessionTextMatchStrategy(sharedModule, getSearchUsingRoomEnabledFlagBoolean(), getAppDatabase());
          sessionTextMatchStrategy = DoubleCheck.reentrantCheck(sessionTextMatchStrategy, local);
        }
      }
    }
    return (SessionTextMatchStrategy) local;
  }

  private TagRepository getTagRepository() {
    Object local = tagRepository;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = tagRepository;
        if (local instanceof MemoizedSentinel) {
          local = new TagRepository(getConferenceDataRepository());
          tagRepository = DoubleCheck.reentrantCheck(tagRepository, local);
        }
      }
    }
    return (TagRepository) local;
  }

  private Provider<FiltersViewModelDelegate> getFiltersViewModelDelegateProvider() {
    Object local = provideFiltersViewModelDelegateProvider;
    if (local == null) {
      local = new SwitchingProvider<>(8);
      provideFiltersViewModelDelegateProvider = (Provider<FiltersViewModelDelegate>) local;
    }
    return (Provider<FiltersViewModelDelegate>) local;
  }

  private Provider<Boolean> getReservationEnabledFlagBooleanProvider() {
    Object local = provideReservationEnabledFlagProvider;
    if (local == null) {
      local = new SwitchingProvider<>(9);
      provideReservationEnabledFlagProvider = (Provider<Boolean>) local;
    }
    return (Provider<Boolean>) local;
  }

  private Provider<CoroutineDispatcher> getDefaultDispatcherCoroutineDispatcherProvider() {
    Object local = providesDefaultDispatcherProvider;
    if (local == null) {
      local = new SwitchingProvider<>(10);
      providesDefaultDispatcherProvider = (Provider<CoroutineDispatcher>) local;
    }
    return (Provider<CoroutineDispatcher>) local;
  }

  private FeedbackEndpoint getFeedbackEndpoint() {
    Object local = feedbackEndpoint;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = feedbackEndpoint;
        if (local instanceof MemoizedSentinel) {
          local = SharedModule_ProvideFeedbackEndpointFactory.provideFeedbackEndpoint(sharedModule);
          feedbackEndpoint = DoubleCheck.reentrantCheck(feedbackEndpoint, local);
        }
      }
    }
    return (FeedbackEndpoint) local;
  }

  private Provider<GetThemeUseCase> getGetThemeUseCaseProvider() {
    Object local = getThemeUseCaseProvider;
    if (local == null) {
      local = new SwitchingProvider<>(11);
      getThemeUseCaseProvider = (Provider<GetThemeUseCase>) local;
    }
    return (Provider<GetThemeUseCase>) local;
  }

  private boolean getAssistantAppEnabledFlagBoolean() {
    return featureFlagsModule.provideAssistantAppEnabledFlag(getAppConfigDataSource());
  }

  private boolean getSearchScheduleEnabledFlagBoolean() {
    return featureFlagsModule.provideSearchScheduleEnabledFlag(getAppConfigDataSource());
  }

  private SignInHandler getSignInHandler() {
    return SignInModule_ProvideSignInHandlerFactory.provideSignInHandler(signInModule, ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
  }

  @Override
  public void injectMainApplication(MainApplication mainApplication) {
    injectMainApplication2(mainApplication);
  }

  @Override
  public void injectAlarmBroadcastReceiver(AlarmBroadcastReceiver arg0) {
    injectAlarmBroadcastReceiver2(arg0);
  }

  @Override
  public void injectCancelNotificationBroadcastReceiver(CancelNotificationBroadcastReceiver arg0) {
    injectCancelNotificationBroadcastReceiver2(arg0);
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();
  }

  @CanIgnoreReturnValue
  private MainApplication injectMainApplication2(MainApplication instance) {
    MainApplication_MembersInjector.injectAnalyticsHelper(instance, getAnalyticsHelper());
    return instance;
  }

  @CanIgnoreReturnValue
  private AlarmBroadcastReceiver injectAlarmBroadcastReceiver2(AlarmBroadcastReceiver instance) {
    AlarmBroadcastReceiver_MembersInjector.injectSharedPreferencesStorage(instance, getSharedPreferenceStorage());
    AlarmBroadcastReceiver_MembersInjector.injectLoadUserSession(instance, getLoadUserSessionOneShotUseCase());
    AlarmBroadcastReceiver_MembersInjector.injectLoadSession(instance, getLoadSessionOneShotUseCase());
    AlarmBroadcastReceiver_MembersInjector.injectAlarmManager(instance, getSessionAlarmManager());
    AlarmBroadcastReceiver_MembersInjector.injectAuthIdDataSource(instance, getAuthIdDataSource());
    AlarmBroadcastReceiver_MembersInjector.injectExternalScope(instance, getApplicationScopeCoroutineScope());
    return instance;
  }

  @CanIgnoreReturnValue
  private CancelNotificationBroadcastReceiver injectCancelNotificationBroadcastReceiver2(
      CancelNotificationBroadcastReceiver instance) {
    CancelNotificationBroadcastReceiver_MembersInjector.injectContext(instance, ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
    return instance;
  }

  public static final class Builder {
    private AppModule appModule;

    private ApplicationContextModule applicationContextModule;

    private FeatureFlagsModule featureFlagsModule;

    private FiltersViewModelDelegateModule filtersViewModelDelegateModule;

    private SharedModule sharedModule;

    private SignInModule signInModule;

    private SignInViewModelDelegateModule signInViewModelDelegateModule;

    private Builder() {
    }

    public Builder appModule(AppModule appModule) {
      this.appModule = Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder coroutinesModule(CoroutinesModule coroutinesModule) {
      Preconditions.checkNotNull(coroutinesModule);
      return this;
    }

    public Builder featureFlagsModule(FeatureFlagsModule featureFlagsModule) {
      this.featureFlagsModule = Preconditions.checkNotNull(featureFlagsModule);
      return this;
    }

    public Builder filtersViewModelDelegateModule(
        FiltersViewModelDelegateModule filtersViewModelDelegateModule) {
      this.filtersViewModelDelegateModule = Preconditions.checkNotNull(filtersViewModelDelegateModule);
      return this;
    }

    public Builder sharedModule(SharedModule sharedModule) {
      this.sharedModule = Preconditions.checkNotNull(sharedModule);
      return this;
    }

    public Builder signInModule(SignInModule signInModule) {
      this.signInModule = Preconditions.checkNotNull(signInModule);
      return this;
    }

    public Builder signInViewModelDelegateModule(
        SignInViewModelDelegateModule signInViewModelDelegateModule) {
      this.signInViewModelDelegateModule = Preconditions.checkNotNull(signInViewModelDelegateModule);
      return this;
    }

    public MainApplication_HiltComponents.ApplicationC build() {
      if (appModule == null) {
        this.appModule = new AppModule();
      }
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      if (featureFlagsModule == null) {
        this.featureFlagsModule = new FeatureFlagsModule();
      }
      if (filtersViewModelDelegateModule == null) {
        this.filtersViewModelDelegateModule = new FiltersViewModelDelegateModule();
      }
      if (sharedModule == null) {
        this.sharedModule = new SharedModule();
      }
      if (signInModule == null) {
        this.signInModule = new SignInModule();
      }
      if (signInViewModelDelegateModule == null) {
        this.signInViewModelDelegateModule = new SignInViewModelDelegateModule();
      }
      return new DaggerMainApplication_HiltComponents_ApplicationC(appModule, applicationContextModule, featureFlagsModule, filtersViewModelDelegateModule, sharedModule, signInModule, signInViewModelDelegateModule);
    }
  }

  private final class ActivityRetainedCBuilder implements MainApplication_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public MainApplication_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends MainApplication_HiltComponents.ActivityRetainedC {
    private ActivityRetainedCImpl() {

    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();
    }

    private final class ActivityCBuilder implements MainApplication_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity activity) {
        this.activity = Preconditions.checkNotNull(activity);
        return this;
      }

      @Override
      public MainApplication_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(new EventActionsViewModelDelegateModule(), activity);
      }
    }

    private final class ActivityCImpl extends MainApplication_HiltComponents.ActivityC {
      private final Activity activity;

      private final EventActionsViewModelDelegateModule eventActionsViewModelDelegateModule;

      private volatile Provider<LoadAgendaUseCase> loadAgendaUseCaseProvider;

      private volatile Provider<GetTimeZoneUseCase> getTimeZoneUseCaseProvider;

      private volatile Provider<AgendaViewModel_AssistedFactory> agendaViewModel_AssistedFactoryProvider;

      private volatile Provider<LoadAnnouncementsUseCase> loadAnnouncementsUseCaseProvider;

      private volatile Provider<AnnouncementsViewModel_AssistedFactory> announcementsViewModel_AssistedFactoryProvider;

      private volatile Provider<LoadCodelabsUseCase> loadCodelabsUseCaseProvider;

      private volatile Provider<GetCodelabsInfoCardShownUseCase> getCodelabsInfoCardShownUseCaseProvider;

      private volatile Provider<SetCodelabsInfoCardShownUseCase> setCodelabsInfoCardShownUseCaseProvider;

      private volatile Provider<CodelabsViewModel_AssistedFactory> codelabsViewModel_AssistedFactoryProvider;

      private volatile Provider<WifiInstaller> wifiInstallerProvider;

      private volatile Provider<EventInfoViewModel_AssistedFactory> eventInfoViewModel_AssistedFactoryProvider;

      private volatile Provider<LoadCurrentMomentUseCase> loadCurrentMomentUseCaseProvider;

      private volatile Provider<LoadStarredAndReservedSessionsUseCase> loadStarredAndReservedSessionsUseCaseProvider;

      private volatile Provider<GetConferenceStateUseCase> getConferenceStateUseCaseProvider;

      private volatile Provider<FeedViewModel_AssistedFactory> feedViewModel_AssistedFactoryProvider;

      private volatile Provider<OnboardingCompletedUseCase> onboardingCompletedUseCaseProvider;

      private volatile Provider<LaunchViewModel_AssistedFactory> launchViewModel_AssistedFactoryProvider;

      private volatile Provider<LoadPinnedSessionsJsonUseCase> loadPinnedSessionsJsonUseCaseProvider;

      private volatile Provider<LoadArDebugFlagUseCase> loadArDebugFlagUseCaseProvider;

      private volatile Provider<MainActivityViewModel_AssistedFactory> mainActivityViewModel_AssistedFactoryProvider;

      private volatile Provider<LoadGeoJsonFeaturesUseCase> loadGeoJsonFeaturesUseCaseProvider;

      private volatile Provider<OptIntoMyLocationUseCase> optIntoMyLocationUseCaseProvider;

      private volatile Provider<MyLocationOptedInUseCase> myLocationOptedInUseCaseProvider;

      private volatile Provider<MapViewModel_AssistedFactory> mapViewModel_AssistedFactoryProvider;

      private volatile Provider<OnboardingCompleteActionUseCase> onboardingCompleteActionUseCaseProvider;

      private volatile Provider<OnboardingViewModel_AssistedFactory> onboardingViewModel_AssistedFactoryProvider;

      private volatile Provider<LoadUserSessionUseCase> loadUserSessionUseCaseProvider;

      private volatile Provider<ReservationActionUseCase> reservationActionUseCaseProvider;

      private volatile Provider<RemoveReservationViewModel_AssistedFactory> removeReservationViewModel_AssistedFactoryProvider;

      private volatile Provider<LoadScheduleUserSessionsUseCase> loadScheduleUserSessionsUseCaseProvider;

      private volatile Provider<StarEventAndNotifyUseCase> starEventAndNotifyUseCaseProvider;

      private volatile Provider<ScheduleUiHintsShownUseCase> scheduleUiHintsShownUseCaseProvider;

      private volatile Provider<RefreshConferenceDataUseCase> refreshConferenceDataUseCaseProvider;

      private volatile Provider<ObserveConferenceDataUseCase> observeConferenceDataUseCaseProvider;

      private volatile Provider<ScheduleViewModel_AssistedFactory> scheduleViewModel_AssistedFactoryProvider;

      private volatile Provider<SessionSearchUseCase> sessionSearchUseCaseProvider;

      private volatile Provider<LoadSearchFiltersUseCase> loadSearchFiltersUseCaseProvider;

      private volatile Provider<SearchViewModel_AssistedFactory> searchViewModel_AssistedFactoryProvider;

      private volatile Provider<LoadUserSessionsUseCase> loadUserSessionsUseCaseProvider;

      private volatile Provider<NetworkUtils> networkUtilsProvider;

      private volatile Provider<SessionDetailViewModel_AssistedFactory> sessionDetailViewModel_AssistedFactoryProvider;

      private volatile Provider<FeedbackUseCase> feedbackUseCaseProvider;

      private volatile Provider<SessionFeedbackViewModel_AssistedFactory> sessionFeedbackViewModel_AssistedFactoryProvider;

      private volatile Provider<SetTimeZoneUseCase> setTimeZoneUseCaseProvider;

      private volatile Provider<NotificationsPrefSaveActionUseCase> notificationsPrefSaveActionUseCaseProvider;

      private volatile Provider<GetNotificationsSettingUseCase> getNotificationsSettingUseCaseProvider;

      private volatile Provider<SetAnalyticsSettingUseCase> setAnalyticsSettingUseCaseProvider;

      private volatile Provider<GetAnalyticsSettingUseCase> getAnalyticsSettingUseCaseProvider;

      private volatile Provider<SetThemeUseCase> setThemeUseCaseProvider;

      private volatile Provider<GetAvailableThemesUseCase> getAvailableThemesUseCaseProvider;

      private volatile Provider<SettingsViewModel_AssistedFactory> settingsViewModel_AssistedFactoryProvider;

      private volatile Provider<SignInViewModel_AssistedFactory> signInViewModel_AssistedFactoryProvider;

      private volatile Provider<StopSnackbarActionUseCase> stopSnackbarActionUseCaseProvider;

      private volatile Provider<SnackbarPreferenceViewModel_AssistedFactory> snackbarPreferenceViewModel_AssistedFactoryProvider;

      private volatile Provider<LoadSpeakerUseCase> loadSpeakerUseCaseProvider;

      private volatile Provider<EventActionsViewModelDelegate> provideEventActionsViewModelDelegateProvider;

      private volatile Provider<SpeakerViewModel_AssistedFactory> speakerViewModel_AssistedFactoryProvider;

      private volatile Provider<ThemeViewModel_AssistedFactory> themeViewModel_AssistedFactoryProvider;

      private ActivityCImpl(
          EventActionsViewModelDelegateModule eventActionsViewModelDelegateModuleParam,
          Activity activityParam) {
        this.activity = activityParam;
        this.eventActionsViewModelDelegateModule = eventActionsViewModelDelegateModuleParam;
      }

      private LoadAgendaUseCase getLoadAgendaUseCase() {
        return new LoadAgendaUseCase(DaggerMainApplication_HiltComponents_ApplicationC.this.getAgendaRepository(), CoroutinesModule_ProvidesIoDispatcherFactory.providesIoDispatcher());
      }

      private Provider<LoadAgendaUseCase> getLoadAgendaUseCaseProvider() {
        Object local = loadAgendaUseCaseProvider;
        if (local == null) {
          local = new SwitchingProvider<>(1);
          loadAgendaUseCaseProvider = (Provider<LoadAgendaUseCase>) local;
        }
        return (Provider<LoadAgendaUseCase>) local;
      }

      private GetTimeZoneUseCase getGetTimeZoneUseCase() {
        return new GetTimeZoneUseCase(DaggerMainApplication_HiltComponents_ApplicationC.this.getPreferenceStorage(), CoroutinesModule_ProvidesIoDispatcherFactory.providesIoDispatcher());
      }

      private Provider<GetTimeZoneUseCase> getGetTimeZoneUseCaseProvider() {
        Object local = getTimeZoneUseCaseProvider;
        if (local == null) {
          local = new SwitchingProvider<>(2);
          getTimeZoneUseCaseProvider = (Provider<GetTimeZoneUseCase>) local;
        }
        return (Provider<GetTimeZoneUseCase>) local;
      }

      private AgendaViewModel_AssistedFactory getAgendaViewModel_AssistedFactory() {
        return AgendaViewModel_AssistedFactory_Factory.newInstance(getLoadAgendaUseCaseProvider(), getGetTimeZoneUseCaseProvider());
      }

      private Provider<AgendaViewModel_AssistedFactory> getAgendaViewModel_AssistedFactoryProvider(
          ) {
        Object local = agendaViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(0);
          agendaViewModel_AssistedFactoryProvider = (Provider<AgendaViewModel_AssistedFactory>) local;
        }
        return (Provider<AgendaViewModel_AssistedFactory>) local;
      }

      private LoadAnnouncementsUseCase getLoadAnnouncementsUseCase() {
        return new LoadAnnouncementsUseCase(DaggerMainApplication_HiltComponents_ApplicationC.this.getFeedRepository(), CoroutinesModule_ProvidesIoDispatcherFactory.providesIoDispatcher());
      }

      private Provider<LoadAnnouncementsUseCase> getLoadAnnouncementsUseCaseProvider() {
        Object local = loadAnnouncementsUseCaseProvider;
        if (local == null) {
          local = new SwitchingProvider<>(4);
          loadAnnouncementsUseCaseProvider = (Provider<LoadAnnouncementsUseCase>) local;
        }
        return (Provider<LoadAnnouncementsUseCase>) local;
      }

      private AnnouncementsViewModel_AssistedFactory getAnnouncementsViewModel_AssistedFactory() {
        return AnnouncementsViewModel_AssistedFactory_Factory.newInstance(getLoadAnnouncementsUseCaseProvider(), getGetTimeZoneUseCaseProvider(), DaggerMainApplication_HiltComponents_ApplicationC.this.getTimeProviderProvider());
      }

      private Provider<AnnouncementsViewModel_AssistedFactory> getAnnouncementsViewModel_AssistedFactoryProvider(
          ) {
        Object local = announcementsViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(3);
          announcementsViewModel_AssistedFactoryProvider = (Provider<AnnouncementsViewModel_AssistedFactory>) local;
        }
        return (Provider<AnnouncementsViewModel_AssistedFactory>) local;
      }

      private LoadCodelabsUseCase getLoadCodelabsUseCase() {
        return new LoadCodelabsUseCase(DaggerMainApplication_HiltComponents_ApplicationC.this.getCodelabsRepository(), CoroutinesModule_ProvidesIoDispatcherFactory.providesIoDispatcher());
      }

      private Provider<LoadCodelabsUseCase> getLoadCodelabsUseCaseProvider() {
        Object local = loadCodelabsUseCaseProvider;
        if (local == null) {
          local = new SwitchingProvider<>(6);
          loadCodelabsUseCaseProvider = (Provider<LoadCodelabsUseCase>) local;
        }
        return (Provider<LoadCodelabsUseCase>) local;
      }

      private GetCodelabsInfoCardShownUseCase getGetCodelabsInfoCardShownUseCase() {
        return new GetCodelabsInfoCardShownUseCase(DaggerMainApplication_HiltComponents_ApplicationC.this.getPreferenceStorage(), CoroutinesModule_ProvidesIoDispatcherFactory.providesIoDispatcher());
      }

      private Provider<GetCodelabsInfoCardShownUseCase> getGetCodelabsInfoCardShownUseCaseProvider(
          ) {
        Object local = getCodelabsInfoCardShownUseCaseProvider;
        if (local == null) {
          local = new SwitchingProvider<>(7);
          getCodelabsInfoCardShownUseCaseProvider = (Provider<GetCodelabsInfoCardShownUseCase>) local;
        }
        return (Provider<GetCodelabsInfoCardShownUseCase>) local;
      }

      private SetCodelabsInfoCardShownUseCase getSetCodelabsInfoCardShownUseCase() {
        return new SetCodelabsInfoCardShownUseCase(DaggerMainApplication_HiltComponents_ApplicationC.this.getPreferenceStorage(), CoroutinesModule_ProvidesIoDispatcherFactory.providesIoDispatcher());
      }

      private Provider<SetCodelabsInfoCardShownUseCase> getSetCodelabsInfoCardShownUseCaseProvider(
          ) {
        Object local = setCodelabsInfoCardShownUseCaseProvider;
        if (local == null) {
          local = new SwitchingProvider<>(8);
          setCodelabsInfoCardShownUseCaseProvider = (Provider<SetCodelabsInfoCardShownUseCase>) local;
        }
        return (Provider<SetCodelabsInfoCardShownUseCase>) local;
      }

      private CodelabsViewModel_AssistedFactory getCodelabsViewModel_AssistedFactory() {
        return CodelabsViewModel_AssistedFactory_Factory.newInstance(getLoadCodelabsUseCaseProvider(), getGetCodelabsInfoCardShownUseCaseProvider(), getSetCodelabsInfoCardShownUseCaseProvider());
      }

      private Provider<CodelabsViewModel_AssistedFactory> getCodelabsViewModel_AssistedFactoryProvider(
          ) {
        Object local = codelabsViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(5);
          codelabsViewModel_AssistedFactoryProvider = (Provider<CodelabsViewModel_AssistedFactory>) local;
        }
        return (Provider<CodelabsViewModel_AssistedFactory>) local;
      }

      private WifiInstaller getWifiInstaller() {
        return new WifiInstaller(DaggerMainApplication_HiltComponents_ApplicationC.this.getWifiManager(), DaggerMainApplication_HiltComponents_ApplicationC.this.getClipboardManager());
      }

      private Provider<WifiInstaller> getWifiInstallerProvider() {
        Object local = wifiInstallerProvider;
        if (local == null) {
          local = new SwitchingProvider<>(10);
          wifiInstallerProvider = (Provider<WifiInstaller>) local;
        }
        return (Provider<WifiInstaller>) local;
      }

      private EventInfoViewModel_AssistedFactory getEventInfoViewModel_AssistedFactory() {
        return EventInfoViewModel_AssistedFactory_Factory.newInstance(DaggerMainApplication_HiltComponents_ApplicationC.this.getLoadWifiInfoUseCaseProvider(), getWifiInstallerProvider(), DaggerMainApplication_HiltComponents_ApplicationC.this.getAnalyticsHelperProvider());
      }

      private Provider<EventInfoViewModel_AssistedFactory> getEventInfoViewModel_AssistedFactoryProvider(
          ) {
        Object local = eventInfoViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(9);
          eventInfoViewModel_AssistedFactoryProvider = (Provider<EventInfoViewModel_AssistedFactory>) local;
        }
        return (Provider<EventInfoViewModel_AssistedFactory>) local;
      }

      private LoadCurrentMomentUseCase getLoadCurrentMomentUseCase() {
        return new LoadCurrentMomentUseCase(DaggerMainApplication_HiltComponents_ApplicationC.this.getFeedRepository(), CoroutinesModule_ProvidesIoDispatcherFactory.providesIoDispatcher());
      }

      private Provider<LoadCurrentMomentUseCase> getLoadCurrentMomentUseCaseProvider() {
        Object local = loadCurrentMomentUseCaseProvider;
        if (local == null) {
          local = new SwitchingProvider<>(12);
          loadCurrentMomentUseCaseProvider = (Provider<LoadCurrentMomentUseCase>) local;
        }
        return (Provider<LoadCurrentMomentUseCase>) local;
      }

      private LoadStarredAndReservedSessionsUseCase getLoadStarredAndReservedSessionsUseCase() {
        return new LoadStarredAndReservedSessionsUseCase(DaggerMainApplication_HiltComponents_ApplicationC.this.getDefaultSessionAndUserEventRepository(), CoroutinesModule_ProvidesIoDispatcherFactory.providesIoDispatcher());
      }

      private Provider<LoadStarredAndReservedSessionsUseCase> getLoadStarredAndReservedSessionsUseCaseProvider(
          ) {
        Object local = loadStarredAndReservedSessionsUseCaseProvider;
        if (local == null) {
          local = new SwitchingProvider<>(13);
          loadStarredAndReservedSessionsUseCaseProvider = (Provider<LoadStarredAndReservedSessionsUseCase>) local;
        }
        return (Provider<LoadStarredAndReservedSessionsUseCase>) local;
      }

      private GetConferenceStateUseCase getGetConferenceStateUseCase() {
        return new GetConferenceStateUseCase(CoroutinesModule_ProvidesMainDispatcherFactory.providesMainDispatcher(), DaggerMainApplication_HiltComponents_ApplicationC.this.getTimeProvider());
      }

      private Provider<GetConferenceStateUseCase> getGetConferenceStateUseCaseProvider() {
        Object local = getConferenceStateUseCaseProvider;
        if (local == null) {
          local = new SwitchingProvider<>(14);
          getConferenceStateUseCaseProvider = (Provider<GetConferenceStateUseCase>) local;
        }
        return (Provider<GetConferenceStateUseCase>) local;
      }

      private FeedViewModel_AssistedFactory getFeedViewModel_AssistedFactory() {
        return FeedViewModel_AssistedFactory_Factory.newInstance(getLoadCurrentMomentUseCaseProvider(), getLoadAnnouncementsUseCaseProvider(), getLoadStarredAndReservedSessionsUseCaseProvider(), getGetTimeZoneUseCaseProvider(), getGetConferenceStateUseCaseProvider(), DaggerMainApplication_HiltComponents_ApplicationC.this.getTimeProviderProvider(), DaggerMainApplication_HiltComponents_ApplicationC.this.getAnalyticsHelperProvider(), DaggerMainApplication_HiltComponents_ApplicationC.this.getSignInViewModelDelegateProvider(), DaggerMainApplication_HiltComponents_ApplicationC.this.getThemedActivityDelegateProvider());
      }

      private Provider<FeedViewModel_AssistedFactory> getFeedViewModel_AssistedFactoryProvider() {
        Object local = feedViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(11);
          feedViewModel_AssistedFactoryProvider = (Provider<FeedViewModel_AssistedFactory>) local;
        }
        return (Provider<FeedViewModel_AssistedFactory>) local;
      }

      private OnboardingCompletedUseCase getOnboardingCompletedUseCase() {
        return new OnboardingCompletedUseCase(DaggerMainApplication_HiltComponents_ApplicationC.this.getPreferenceStorage(), CoroutinesModule_ProvidesIoDispatcherFactory.providesIoDispatcher());
      }

      private Provider<OnboardingCompletedUseCase> getOnboardingCompletedUseCaseProvider() {
        Object local = onboardingCompletedUseCaseProvider;
        if (local == null) {
          local = new SwitchingProvider<>(16);
          onboardingCompletedUseCaseProvider = (Provider<OnboardingCompletedUseCase>) local;
        }
        return (Provider<OnboardingCompletedUseCase>) local;
      }

      private LaunchViewModel_AssistedFactory getLaunchViewModel_AssistedFactory() {
        return LaunchViewModel_AssistedFactory_Factory.newInstance(getOnboardingCompletedUseCaseProvider());
      }

      private Provider<LaunchViewModel_AssistedFactory> getLaunchViewModel_AssistedFactoryProvider(
          ) {
        Object local = launchViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(15);
          launchViewModel_AssistedFactoryProvider = (Provider<LaunchViewModel_AssistedFactory>) local;
        }
        return (Provider<LaunchViewModel_AssistedFactory>) local;
      }

      private LoadPinnedSessionsJsonUseCase getLoadPinnedSessionsJsonUseCase() {
        return new LoadPinnedSessionsJsonUseCase(DaggerMainApplication_HiltComponents_ApplicationC.this.getDefaultSessionAndUserEventRepository(), DaggerMainApplication_HiltComponents_ApplicationC.this.getGson(), CoroutinesModule_ProvidesIoDispatcherFactory.providesIoDispatcher());
      }

      private Provider<LoadPinnedSessionsJsonUseCase> getLoadPinnedSessionsJsonUseCaseProvider() {
        Object local = loadPinnedSessionsJsonUseCaseProvider;
        if (local == null) {
          local = new SwitchingProvider<>(18);
          loadPinnedSessionsJsonUseCaseProvider = (Provider<LoadPinnedSessionsJsonUseCase>) local;
        }
        return (Provider<LoadPinnedSessionsJsonUseCase>) local;
      }

      private LoadArDebugFlagUseCase getLoadArDebugFlagUseCase() {
        return new LoadArDebugFlagUseCase(DaggerMainApplication_HiltComponents_ApplicationC.this.getArDebugFlagEndpoint(), CoroutinesModule_ProvidesIoDispatcherFactory.providesIoDispatcher());
      }

      private Provider<LoadArDebugFlagUseCase> getLoadArDebugFlagUseCaseProvider() {
        Object local = loadArDebugFlagUseCaseProvider;
        if (local == null) {
          local = new SwitchingProvider<>(19);
          loadArDebugFlagUseCaseProvider = (Provider<LoadArDebugFlagUseCase>) local;
        }
        return (Provider<LoadArDebugFlagUseCase>) local;
      }

      private MainActivityViewModel_AssistedFactory getMainActivityViewModel_AssistedFactory() {
        return MainActivityViewModel_AssistedFactory_Factory.newInstance(DaggerMainApplication_HiltComponents_ApplicationC.this.getSignInViewModelDelegateProvider(), DaggerMainApplication_HiltComponents_ApplicationC.this.getThemedActivityDelegateProvider(), getLoadPinnedSessionsJsonUseCaseProvider(), getLoadArDebugFlagUseCaseProvider(), DaggerMainApplication_HiltComponents_ApplicationC.this.getApplicationContextContextProvider());
      }

      private Provider<MainActivityViewModel_AssistedFactory> getMainActivityViewModel_AssistedFactoryProvider(
          ) {
        Object local = mainActivityViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(17);
          mainActivityViewModel_AssistedFactoryProvider = (Provider<MainActivityViewModel_AssistedFactory>) local;
        }
        return (Provider<MainActivityViewModel_AssistedFactory>) local;
      }

      private LoadGeoJsonFeaturesUseCase getLoadGeoJsonFeaturesUseCase() {
        return new LoadGeoJsonFeaturesUseCase(ApplicationContextModule_ProvideContextFactory.provideContext(DaggerMainApplication_HiltComponents_ApplicationC.this.applicationContextModule), CoroutinesModule_ProvidesIoDispatcherFactory.providesIoDispatcher());
      }

      private Provider<LoadGeoJsonFeaturesUseCase> getLoadGeoJsonFeaturesUseCaseProvider() {
        Object local = loadGeoJsonFeaturesUseCaseProvider;
        if (local == null) {
          local = new SwitchingProvider<>(21);
          loadGeoJsonFeaturesUseCaseProvider = (Provider<LoadGeoJsonFeaturesUseCase>) local;
        }
        return (Provider<LoadGeoJsonFeaturesUseCase>) local;
      }

      private OptIntoMyLocationUseCase getOptIntoMyLocationUseCase() {
        return new OptIntoMyLocationUseCase(DaggerMainApplication_HiltComponents_ApplicationC.this.getPreferenceStorage(), CoroutinesModule_ProvidesIoDispatcherFactory.providesIoDispatcher());
      }

      private Provider<OptIntoMyLocationUseCase> getOptIntoMyLocationUseCaseProvider() {
        Object local = optIntoMyLocationUseCaseProvider;
        if (local == null) {
          local = new SwitchingProvider<>(22);
          optIntoMyLocationUseCaseProvider = (Provider<OptIntoMyLocationUseCase>) local;
        }
        return (Provider<OptIntoMyLocationUseCase>) local;
      }

      private MyLocationOptedInUseCase getMyLocationOptedInUseCase() {
        return new MyLocationOptedInUseCase(DaggerMainApplication_HiltComponents_ApplicationC.this.getPreferenceStorage(), CoroutinesModule_ProvidesIoDispatcherFactory.providesIoDispatcher());
      }

      private Provider<MyLocationOptedInUseCase> getMyLocationOptedInUseCaseProvider() {
        Object local = myLocationOptedInUseCaseProvider;
        if (local == null) {
          local = new SwitchingProvider<>(23);
          myLocationOptedInUseCaseProvider = (Provider<MyLocationOptedInUseCase>) local;
        }
        return (Provider<MyLocationOptedInUseCase>) local;
      }

      private MapViewModel_AssistedFactory getMapViewModel_AssistedFactory() {
        return MapViewModel_AssistedFactory_Factory.newInstance(getLoadGeoJsonFeaturesUseCaseProvider(), DaggerMainApplication_HiltComponents_ApplicationC.this.getAnalyticsHelperProvider(), DaggerMainApplication_HiltComponents_ApplicationC.this.getSignInViewModelDelegateProvider(), getOptIntoMyLocationUseCaseProvider(), getMyLocationOptedInUseCaseProvider());
      }

      private Provider<MapViewModel_AssistedFactory> getMapViewModel_AssistedFactoryProvider() {
        Object local = mapViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(20);
          mapViewModel_AssistedFactoryProvider = (Provider<MapViewModel_AssistedFactory>) local;
        }
        return (Provider<MapViewModel_AssistedFactory>) local;
      }

      private OnboardingCompleteActionUseCase getOnboardingCompleteActionUseCase() {
        return new OnboardingCompleteActionUseCase(DaggerMainApplication_HiltComponents_ApplicationC.this.getPreferenceStorage(), CoroutinesModule_ProvidesIoDispatcherFactory.providesIoDispatcher());
      }

      private Provider<OnboardingCompleteActionUseCase> getOnboardingCompleteActionUseCaseProvider(
          ) {
        Object local = onboardingCompleteActionUseCaseProvider;
        if (local == null) {
          local = new SwitchingProvider<>(25);
          onboardingCompleteActionUseCaseProvider = (Provider<OnboardingCompleteActionUseCase>) local;
        }
        return (Provider<OnboardingCompleteActionUseCase>) local;
      }

      private OnboardingViewModel_AssistedFactory getOnboardingViewModel_AssistedFactory() {
        return OnboardingViewModel_AssistedFactory_Factory.newInstance(getOnboardingCompleteActionUseCaseProvider(), DaggerMainApplication_HiltComponents_ApplicationC.this.getSignInViewModelDelegateProvider());
      }

      private Provider<OnboardingViewModel_AssistedFactory> getOnboardingViewModel_AssistedFactoryProvider(
          ) {
        Object local = onboardingViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(24);
          onboardingViewModel_AssistedFactoryProvider = (Provider<OnboardingViewModel_AssistedFactory>) local;
        }
        return (Provider<OnboardingViewModel_AssistedFactory>) local;
      }

      private LoadUserSessionUseCase getLoadUserSessionUseCase() {
        return new LoadUserSessionUseCase(DaggerMainApplication_HiltComponents_ApplicationC.this.getDefaultSessionAndUserEventRepository(), CoroutinesModule_ProvidesIoDispatcherFactory.providesIoDispatcher());
      }

      private Provider<LoadUserSessionUseCase> getLoadUserSessionUseCaseProvider() {
        Object local = loadUserSessionUseCaseProvider;
        if (local == null) {
          local = new SwitchingProvider<>(27);
          loadUserSessionUseCaseProvider = (Provider<LoadUserSessionUseCase>) local;
        }
        return (Provider<LoadUserSessionUseCase>) local;
      }

      private ReservationActionUseCase getReservationActionUseCase() {
        return new ReservationActionUseCase(DaggerMainApplication_HiltComponents_ApplicationC.this.getSessionAndUserEventRepository(), DaggerMainApplication_HiltComponents_ApplicationC.this.getStarReserveNotificationAlarmUpdater(), CoroutinesModule_ProvidesIoDispatcherFactory.providesIoDispatcher());
      }

      private Provider<ReservationActionUseCase> getReservationActionUseCaseProvider() {
        Object local = reservationActionUseCaseProvider;
        if (local == null) {
          local = new SwitchingProvider<>(28);
          reservationActionUseCaseProvider = (Provider<ReservationActionUseCase>) local;
        }
        return (Provider<ReservationActionUseCase>) local;
      }

      private RemoveReservationViewModel_AssistedFactory getRemoveReservationViewModel_AssistedFactory(
          ) {
        return RemoveReservationViewModel_AssistedFactory_Factory.newInstance(DaggerMainApplication_HiltComponents_ApplicationC.this.getSignInViewModelDelegateProvider(), getLoadUserSessionUseCaseProvider(), getReservationActionUseCaseProvider());
      }

      private Provider<RemoveReservationViewModel_AssistedFactory> getRemoveReservationViewModel_AssistedFactoryProvider(
          ) {
        Object local = removeReservationViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(26);
          removeReservationViewModel_AssistedFactoryProvider = (Provider<RemoveReservationViewModel_AssistedFactory>) local;
        }
        return (Provider<RemoveReservationViewModel_AssistedFactory>) local;
      }

      private LoadScheduleUserSessionsUseCase getLoadScheduleUserSessionsUseCase() {
        return new LoadScheduleUserSessionsUseCase(DaggerMainApplication_HiltComponents_ApplicationC.this.getDefaultSessionAndUserEventRepository(), CoroutinesModule_ProvidesIoDispatcherFactory.providesIoDispatcher());
      }

      private Provider<LoadScheduleUserSessionsUseCase> getLoadScheduleUserSessionsUseCaseProvider(
          ) {
        Object local = loadScheduleUserSessionsUseCaseProvider;
        if (local == null) {
          local = new SwitchingProvider<>(30);
          loadScheduleUserSessionsUseCaseProvider = (Provider<LoadScheduleUserSessionsUseCase>) local;
        }
        return (Provider<LoadScheduleUserSessionsUseCase>) local;
      }

      private StarEventAndNotifyUseCase getStarEventAndNotifyUseCase() {
        return new StarEventAndNotifyUseCase(DaggerMainApplication_HiltComponents_ApplicationC.this.getSessionAndUserEventRepository(), DaggerMainApplication_HiltComponents_ApplicationC.this.getStarReserveNotificationAlarmUpdater(), CoroutinesModule_ProvidesIoDispatcherFactory.providesIoDispatcher());
      }

      private Provider<StarEventAndNotifyUseCase> getStarEventAndNotifyUseCaseProvider() {
        Object local = starEventAndNotifyUseCaseProvider;
        if (local == null) {
          local = new SwitchingProvider<>(31);
          starEventAndNotifyUseCaseProvider = (Provider<StarEventAndNotifyUseCase>) local;
        }
        return (Provider<StarEventAndNotifyUseCase>) local;
      }

      private ScheduleUiHintsShownUseCase getScheduleUiHintsShownUseCase() {
        return new ScheduleUiHintsShownUseCase(DaggerMainApplication_HiltComponents_ApplicationC.this.getPreferenceStorage(), CoroutinesModule_ProvidesIoDispatcherFactory.providesIoDispatcher());
      }

      private Provider<ScheduleUiHintsShownUseCase> getScheduleUiHintsShownUseCaseProvider() {
        Object local = scheduleUiHintsShownUseCaseProvider;
        if (local == null) {
          local = new SwitchingProvider<>(32);
          scheduleUiHintsShownUseCaseProvider = (Provider<ScheduleUiHintsShownUseCase>) local;
        }
        return (Provider<ScheduleUiHintsShownUseCase>) local;
      }

      private RefreshConferenceDataUseCase getRefreshConferenceDataUseCase() {
        return new RefreshConferenceDataUseCase(DaggerMainApplication_HiltComponents_ApplicationC.this.getConferenceDataRepository(), CoroutinesModule_ProvidesIoDispatcherFactory.providesIoDispatcher());
      }

      private Provider<RefreshConferenceDataUseCase> getRefreshConferenceDataUseCaseProvider() {
        Object local = refreshConferenceDataUseCaseProvider;
        if (local == null) {
          local = new SwitchingProvider<>(33);
          refreshConferenceDataUseCaseProvider = (Provider<RefreshConferenceDataUseCase>) local;
        }
        return (Provider<RefreshConferenceDataUseCase>) local;
      }

      private ObserveConferenceDataUseCase getObserveConferenceDataUseCase() {
        return new ObserveConferenceDataUseCase(DaggerMainApplication_HiltComponents_ApplicationC.this.getConferenceDataRepository(), CoroutinesModule_ProvidesIoDispatcherFactory.providesIoDispatcher());
      }

      private Provider<ObserveConferenceDataUseCase> getObserveConferenceDataUseCaseProvider() {
        Object local = observeConferenceDataUseCaseProvider;
        if (local == null) {
          local = new SwitchingProvider<>(34);
          observeConferenceDataUseCaseProvider = (Provider<ObserveConferenceDataUseCase>) local;
        }
        return (Provider<ObserveConferenceDataUseCase>) local;
      }

      private ScheduleViewModel_AssistedFactory getScheduleViewModel_AssistedFactory() {
        return ScheduleViewModel_AssistedFactory_Factory.newInstance(getLoadScheduleUserSessionsUseCaseProvider(), DaggerMainApplication_HiltComponents_ApplicationC.this.getSignInViewModelDelegateProvider(), getStarEventAndNotifyUseCaseProvider(), getScheduleUiHintsShownUseCaseProvider(), DaggerMainApplication_HiltComponents_ApplicationC.this.getTopicSubscriberProvider(), DaggerMainApplication_HiltComponents_ApplicationC.this.getSnackbarMessageManagerProvider(), getGetTimeZoneUseCaseProvider(), getRefreshConferenceDataUseCaseProvider(), getObserveConferenceDataUseCaseProvider(), DaggerMainApplication_HiltComponents_ApplicationC.this.getAnalyticsHelperProvider());
      }

      private Provider<ScheduleViewModel_AssistedFactory> getScheduleViewModel_AssistedFactoryProvider(
          ) {
        Object local = scheduleViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(29);
          scheduleViewModel_AssistedFactoryProvider = (Provider<ScheduleViewModel_AssistedFactory>) local;
        }
        return (Provider<ScheduleViewModel_AssistedFactory>) local;
      }

      private SessionSearchUseCase getSessionSearchUseCase() {
        return new SessionSearchUseCase(DaggerMainApplication_HiltComponents_ApplicationC.this.getSessionAndUserEventRepository(), DaggerMainApplication_HiltComponents_ApplicationC.this.getSessionTextMatchStrategy(), CoroutinesModule_ProvidesIoDispatcherFactory.providesIoDispatcher());
      }

      private Provider<SessionSearchUseCase> getSessionSearchUseCaseProvider() {
        Object local = sessionSearchUseCaseProvider;
        if (local == null) {
          local = new SwitchingProvider<>(36);
          sessionSearchUseCaseProvider = (Provider<SessionSearchUseCase>) local;
        }
        return (Provider<SessionSearchUseCase>) local;
      }

      private LoadSearchFiltersUseCase getLoadSearchFiltersUseCase() {
        return new LoadSearchFiltersUseCase(DaggerMainApplication_HiltComponents_ApplicationC.this.getConferenceDataRepository(), DaggerMainApplication_HiltComponents_ApplicationC.this.getTagRepository(), CoroutinesModule_ProvidesIoDispatcherFactory.providesIoDispatcher());
      }

      private Provider<LoadSearchFiltersUseCase> getLoadSearchFiltersUseCaseProvider() {
        Object local = loadSearchFiltersUseCaseProvider;
        if (local == null) {
          local = new SwitchingProvider<>(37);
          loadSearchFiltersUseCaseProvider = (Provider<LoadSearchFiltersUseCase>) local;
        }
        return (Provider<LoadSearchFiltersUseCase>) local;
      }

      private SearchViewModel_AssistedFactory getSearchViewModel_AssistedFactory() {
        return SearchViewModel_AssistedFactory_Factory.newInstance(DaggerMainApplication_HiltComponents_ApplicationC.this.getAnalyticsHelperProvider(), getSessionSearchUseCaseProvider(), getGetTimeZoneUseCaseProvider(), getLoadSearchFiltersUseCaseProvider(), DaggerMainApplication_HiltComponents_ApplicationC.this.getSignInViewModelDelegateProvider(), DaggerMainApplication_HiltComponents_ApplicationC.this.getFiltersViewModelDelegateProvider());
      }

      private Provider<SearchViewModel_AssistedFactory> getSearchViewModel_AssistedFactoryProvider(
          ) {
        Object local = searchViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(35);
          searchViewModel_AssistedFactoryProvider = (Provider<SearchViewModel_AssistedFactory>) local;
        }
        return (Provider<SearchViewModel_AssistedFactory>) local;
      }

      private LoadUserSessionsUseCase getLoadUserSessionsUseCase() {
        return new LoadUserSessionsUseCase(DaggerMainApplication_HiltComponents_ApplicationC.this.getDefaultSessionAndUserEventRepository(), CoroutinesModule_ProvidesIoDispatcherFactory.providesIoDispatcher());
      }

      private Provider<LoadUserSessionsUseCase> getLoadUserSessionsUseCaseProvider() {
        Object local = loadUserSessionsUseCaseProvider;
        if (local == null) {
          local = new SwitchingProvider<>(39);
          loadUserSessionsUseCaseProvider = (Provider<LoadUserSessionsUseCase>) local;
        }
        return (Provider<LoadUserSessionsUseCase>) local;
      }

      private NetworkUtils getNetworkUtils() {
        return new NetworkUtils(ApplicationContextModule_ProvideContextFactory.provideContext(DaggerMainApplication_HiltComponents_ApplicationC.this.applicationContextModule));
      }

      private Provider<NetworkUtils> getNetworkUtilsProvider() {
        Object local = networkUtilsProvider;
        if (local == null) {
          local = new SwitchingProvider<>(40);
          networkUtilsProvider = (Provider<NetworkUtils>) local;
        }
        return (Provider<NetworkUtils>) local;
      }

      private SessionDetailViewModel_AssistedFactory getSessionDetailViewModel_AssistedFactory() {
        return SessionDetailViewModel_AssistedFactory_Factory.newInstance(DaggerMainApplication_HiltComponents_ApplicationC.this.getSignInViewModelDelegateProvider(), getLoadUserSessionUseCaseProvider(), getLoadUserSessionsUseCaseProvider(), getStarEventAndNotifyUseCaseProvider(), getReservationActionUseCaseProvider(), getGetTimeZoneUseCaseProvider(), DaggerMainApplication_HiltComponents_ApplicationC.this.getSnackbarMessageManagerProvider(), DaggerMainApplication_HiltComponents_ApplicationC.this.getTimeProviderProvider(), getNetworkUtilsProvider(), DaggerMainApplication_HiltComponents_ApplicationC.this.getAnalyticsHelperProvider(), DaggerMainApplication_HiltComponents_ApplicationC.this.getReservationEnabledFlagBooleanProvider(), DaggerMainApplication_HiltComponents_ApplicationC.this.getDefaultDispatcherCoroutineDispatcherProvider());
      }

      private Provider<SessionDetailViewModel_AssistedFactory> getSessionDetailViewModel_AssistedFactoryProvider(
          ) {
        Object local = sessionDetailViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(38);
          sessionDetailViewModel_AssistedFactoryProvider = (Provider<SessionDetailViewModel_AssistedFactory>) local;
        }
        return (Provider<SessionDetailViewModel_AssistedFactory>) local;
      }

      private FeedbackUseCase getFeedbackUseCase() {
        return new FeedbackUseCase(DaggerMainApplication_HiltComponents_ApplicationC.this.getFeedbackEndpoint(), DaggerMainApplication_HiltComponents_ApplicationC.this.getSessionAndUserEventRepository(), CoroutinesModule_ProvidesIoDispatcherFactory.providesIoDispatcher());
      }

      private Provider<FeedbackUseCase> getFeedbackUseCaseProvider() {
        Object local = feedbackUseCaseProvider;
        if (local == null) {
          local = new SwitchingProvider<>(42);
          feedbackUseCaseProvider = (Provider<FeedbackUseCase>) local;
        }
        return (Provider<FeedbackUseCase>) local;
      }

      private SessionFeedbackViewModel_AssistedFactory getSessionFeedbackViewModel_AssistedFactory(
          ) {
        return SessionFeedbackViewModel_AssistedFactory_Factory.newInstance(DaggerMainApplication_HiltComponents_ApplicationC.this.getSignInViewModelDelegateProvider(), getLoadUserSessionUseCaseProvider(), getFeedbackUseCaseProvider());
      }

      private Provider<SessionFeedbackViewModel_AssistedFactory> getSessionFeedbackViewModel_AssistedFactoryProvider(
          ) {
        Object local = sessionFeedbackViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(41);
          sessionFeedbackViewModel_AssistedFactoryProvider = (Provider<SessionFeedbackViewModel_AssistedFactory>) local;
        }
        return (Provider<SessionFeedbackViewModel_AssistedFactory>) local;
      }

      private SetTimeZoneUseCase getSetTimeZoneUseCase() {
        return new SetTimeZoneUseCase(DaggerMainApplication_HiltComponents_ApplicationC.this.getPreferenceStorage(), CoroutinesModule_ProvidesIoDispatcherFactory.providesIoDispatcher());
      }

      private Provider<SetTimeZoneUseCase> getSetTimeZoneUseCaseProvider() {
        Object local = setTimeZoneUseCaseProvider;
        if (local == null) {
          local = new SwitchingProvider<>(44);
          setTimeZoneUseCaseProvider = (Provider<SetTimeZoneUseCase>) local;
        }
        return (Provider<SetTimeZoneUseCase>) local;
      }

      private NotificationsPrefSaveActionUseCase getNotificationsPrefSaveActionUseCase() {
        return new NotificationsPrefSaveActionUseCase(DaggerMainApplication_HiltComponents_ApplicationC.this.getPreferenceStorage(), CoroutinesModule_ProvidesIoDispatcherFactory.providesIoDispatcher());
      }

      private Provider<NotificationsPrefSaveActionUseCase> getNotificationsPrefSaveActionUseCaseProvider(
          ) {
        Object local = notificationsPrefSaveActionUseCaseProvider;
        if (local == null) {
          local = new SwitchingProvider<>(45);
          notificationsPrefSaveActionUseCaseProvider = (Provider<NotificationsPrefSaveActionUseCase>) local;
        }
        return (Provider<NotificationsPrefSaveActionUseCase>) local;
      }

      private GetNotificationsSettingUseCase getGetNotificationsSettingUseCase() {
        return new GetNotificationsSettingUseCase(DaggerMainApplication_HiltComponents_ApplicationC.this.getPreferenceStorage(), CoroutinesModule_ProvidesIoDispatcherFactory.providesIoDispatcher());
      }

      private Provider<GetNotificationsSettingUseCase> getGetNotificationsSettingUseCaseProvider() {
        Object local = getNotificationsSettingUseCaseProvider;
        if (local == null) {
          local = new SwitchingProvider<>(46);
          getNotificationsSettingUseCaseProvider = (Provider<GetNotificationsSettingUseCase>) local;
        }
        return (Provider<GetNotificationsSettingUseCase>) local;
      }

      private SetAnalyticsSettingUseCase getSetAnalyticsSettingUseCase() {
        return new SetAnalyticsSettingUseCase(DaggerMainApplication_HiltComponents_ApplicationC.this.getPreferenceStorage(), CoroutinesModule_ProvidesIoDispatcherFactory.providesIoDispatcher());
      }

      private Provider<SetAnalyticsSettingUseCase> getSetAnalyticsSettingUseCaseProvider() {
        Object local = setAnalyticsSettingUseCaseProvider;
        if (local == null) {
          local = new SwitchingProvider<>(47);
          setAnalyticsSettingUseCaseProvider = (Provider<SetAnalyticsSettingUseCase>) local;
        }
        return (Provider<SetAnalyticsSettingUseCase>) local;
      }

      private GetAnalyticsSettingUseCase getGetAnalyticsSettingUseCase() {
        return new GetAnalyticsSettingUseCase(DaggerMainApplication_HiltComponents_ApplicationC.this.getPreferenceStorage(), CoroutinesModule_ProvidesIoDispatcherFactory.providesIoDispatcher());
      }

      private Provider<GetAnalyticsSettingUseCase> getGetAnalyticsSettingUseCaseProvider() {
        Object local = getAnalyticsSettingUseCaseProvider;
        if (local == null) {
          local = new SwitchingProvider<>(48);
          getAnalyticsSettingUseCaseProvider = (Provider<GetAnalyticsSettingUseCase>) local;
        }
        return (Provider<GetAnalyticsSettingUseCase>) local;
      }

      private SetThemeUseCase getSetThemeUseCase() {
        return new SetThemeUseCase(DaggerMainApplication_HiltComponents_ApplicationC.this.getPreferenceStorage(), CoroutinesModule_ProvidesIoDispatcherFactory.providesIoDispatcher());
      }

      private Provider<SetThemeUseCase> getSetThemeUseCaseProvider() {
        Object local = setThemeUseCaseProvider;
        if (local == null) {
          local = new SwitchingProvider<>(49);
          setThemeUseCaseProvider = (Provider<SetThemeUseCase>) local;
        }
        return (Provider<SetThemeUseCase>) local;
      }

      private GetAvailableThemesUseCase getGetAvailableThemesUseCase() {
        return new GetAvailableThemesUseCase(CoroutinesModule_ProvidesMainImmediateDispatcherFactory.providesMainImmediateDispatcher());
      }

      private Provider<GetAvailableThemesUseCase> getGetAvailableThemesUseCaseProvider() {
        Object local = getAvailableThemesUseCaseProvider;
        if (local == null) {
          local = new SwitchingProvider<>(50);
          getAvailableThemesUseCaseProvider = (Provider<GetAvailableThemesUseCase>) local;
        }
        return (Provider<GetAvailableThemesUseCase>) local;
      }

      private SettingsViewModel_AssistedFactory getSettingsViewModel_AssistedFactory() {
        return SettingsViewModel_AssistedFactory_Factory.newInstance(getSetTimeZoneUseCaseProvider(), getGetTimeZoneUseCaseProvider(), getNotificationsPrefSaveActionUseCaseProvider(), getGetNotificationsSettingUseCaseProvider(), getSetAnalyticsSettingUseCaseProvider(), getGetAnalyticsSettingUseCaseProvider(), getSetThemeUseCaseProvider(), DaggerMainApplication_HiltComponents_ApplicationC.this.getGetThemeUseCaseProvider(), getGetAvailableThemesUseCaseProvider());
      }

      private Provider<SettingsViewModel_AssistedFactory> getSettingsViewModel_AssistedFactoryProvider(
          ) {
        Object local = settingsViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(43);
          settingsViewModel_AssistedFactoryProvider = (Provider<SettingsViewModel_AssistedFactory>) local;
        }
        return (Provider<SettingsViewModel_AssistedFactory>) local;
      }

      private SignInViewModel_AssistedFactory getSignInViewModel_AssistedFactory() {
        return SignInViewModel_AssistedFactory_Factory.newInstance(DaggerMainApplication_HiltComponents_ApplicationC.this.getSignInViewModelDelegateProvider());
      }

      private Provider<SignInViewModel_AssistedFactory> getSignInViewModel_AssistedFactoryProvider(
          ) {
        Object local = signInViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(51);
          signInViewModel_AssistedFactoryProvider = (Provider<SignInViewModel_AssistedFactory>) local;
        }
        return (Provider<SignInViewModel_AssistedFactory>) local;
      }

      private StopSnackbarActionUseCase getStopSnackbarActionUseCase() {
        return new StopSnackbarActionUseCase(DaggerMainApplication_HiltComponents_ApplicationC.this.getPreferenceStorage(), CoroutinesModule_ProvidesIoDispatcherFactory.providesIoDispatcher());
      }

      private Provider<StopSnackbarActionUseCase> getStopSnackbarActionUseCaseProvider() {
        Object local = stopSnackbarActionUseCaseProvider;
        if (local == null) {
          local = new SwitchingProvider<>(53);
          stopSnackbarActionUseCaseProvider = (Provider<StopSnackbarActionUseCase>) local;
        }
        return (Provider<StopSnackbarActionUseCase>) local;
      }

      private SnackbarPreferenceViewModel_AssistedFactory getSnackbarPreferenceViewModel_AssistedFactory(
          ) {
        return SnackbarPreferenceViewModel_AssistedFactory_Factory.newInstance(getStopSnackbarActionUseCaseProvider());
      }

      private Provider<SnackbarPreferenceViewModel_AssistedFactory> getSnackbarPreferenceViewModel_AssistedFactoryProvider(
          ) {
        Object local = snackbarPreferenceViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(52);
          snackbarPreferenceViewModel_AssistedFactoryProvider = (Provider<SnackbarPreferenceViewModel_AssistedFactory>) local;
        }
        return (Provider<SnackbarPreferenceViewModel_AssistedFactory>) local;
      }

      private LoadSpeakerUseCase getLoadSpeakerUseCase() {
        return new LoadSpeakerUseCase(DaggerMainApplication_HiltComponents_ApplicationC.this.getConferenceDataRepository(), CoroutinesModule_ProvidesIoDispatcherFactory.providesIoDispatcher());
      }

      private Provider<LoadSpeakerUseCase> getLoadSpeakerUseCaseProvider() {
        Object local = loadSpeakerUseCaseProvider;
        if (local == null) {
          local = new SwitchingProvider<>(55);
          loadSpeakerUseCaseProvider = (Provider<LoadSpeakerUseCase>) local;
        }
        return (Provider<LoadSpeakerUseCase>) local;
      }

      private EventActionsViewModelDelegate getEventActionsViewModelDelegate() {
        return EventActionsViewModelDelegateModule_ProvideEventActionsViewModelDelegateFactory.provideEventActionsViewModelDelegate(eventActionsViewModelDelegateModule, DaggerMainApplication_HiltComponents_ApplicationC.this.getSignInViewModelDelegate(), getStarEventAndNotifyUseCase(), DaggerMainApplication_HiltComponents_ApplicationC.this.getSnackbarMessageManager(), DaggerMainApplication_HiltComponents_ApplicationC.this.getApplicationScopeCoroutineScope(), CoroutinesModule_ProvidesMainDispatcherFactory.providesMainDispatcher());
      }

      private Provider<EventActionsViewModelDelegate> getEventActionsViewModelDelegateProvider() {
        Object local = provideEventActionsViewModelDelegateProvider;
        if (local == null) {
          local = new SwitchingProvider<>(56);
          provideEventActionsViewModelDelegateProvider = (Provider<EventActionsViewModelDelegate>) local;
        }
        return (Provider<EventActionsViewModelDelegate>) local;
      }

      private SpeakerViewModel_AssistedFactory getSpeakerViewModel_AssistedFactory() {
        return SpeakerViewModel_AssistedFactory_Factory.newInstance(getLoadSpeakerUseCaseProvider(), getLoadUserSessionsUseCaseProvider(), getGetTimeZoneUseCaseProvider(), DaggerMainApplication_HiltComponents_ApplicationC.this.getSignInViewModelDelegateProvider(), getEventActionsViewModelDelegateProvider(), DaggerMainApplication_HiltComponents_ApplicationC.this.getAnalyticsHelperProvider());
      }

      private Provider<SpeakerViewModel_AssistedFactory> getSpeakerViewModel_AssistedFactoryProvider(
          ) {
        Object local = speakerViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(54);
          speakerViewModel_AssistedFactoryProvider = (Provider<SpeakerViewModel_AssistedFactory>) local;
        }
        return (Provider<SpeakerViewModel_AssistedFactory>) local;
      }

      private ThemeViewModel_AssistedFactory getThemeViewModel_AssistedFactory() {
        return ThemeViewModel_AssistedFactory_Factory.newInstance(DaggerMainApplication_HiltComponents_ApplicationC.this.getThemedActivityDelegateProvider());
      }

      private Provider<ThemeViewModel_AssistedFactory> getThemeViewModel_AssistedFactoryProvider() {
        Object local = themeViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(57);
          themeViewModel_AssistedFactoryProvider = (Provider<ThemeViewModel_AssistedFactory>) local;
        }
        return (Provider<ThemeViewModel_AssistedFactory>) local;
      }

      private Map<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>> getMapOfStringAndProviderOfViewModelAssistedFactoryOf(
          ) {
        return ImmutableMap.<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>>builderWithExpectedSize(19).put("com.google.samples.apps.iosched.ui.agenda.AgendaViewModel", (Provider) getAgendaViewModel_AssistedFactoryProvider()).put("com.google.samples.apps.iosched.ui.feed.AnnouncementsViewModel", (Provider) getAnnouncementsViewModel_AssistedFactoryProvider()).put("com.google.samples.apps.iosched.ui.codelabs.CodelabsViewModel", (Provider) getCodelabsViewModel_AssistedFactoryProvider()).put("com.google.samples.apps.iosched.ui.info.EventInfoViewModel", (Provider) getEventInfoViewModel_AssistedFactoryProvider()).put("com.google.samples.apps.iosched.ui.feed.FeedViewModel", (Provider) getFeedViewModel_AssistedFactoryProvider()).put("com.google.samples.apps.iosched.ui.LaunchViewModel", (Provider) getLaunchViewModel_AssistedFactoryProvider()).put("com.google.samples.apps.iosched.ui.MainActivityViewModel", (Provider) getMainActivityViewModel_AssistedFactoryProvider()).put("com.google.samples.apps.iosched.ui.map.MapViewModel", (Provider) getMapViewModel_AssistedFactoryProvider()).put("com.google.samples.apps.iosched.ui.onboarding.OnboardingViewModel", (Provider) getOnboardingViewModel_AssistedFactoryProvider()).put("com.google.samples.apps.iosched.ui.reservation.RemoveReservationViewModel", (Provider) getRemoveReservationViewModel_AssistedFactoryProvider()).put("com.google.samples.apps.iosched.ui.schedule.ScheduleViewModel", (Provider) getScheduleViewModel_AssistedFactoryProvider()).put("com.google.samples.apps.iosched.ui.search.SearchViewModel", (Provider) getSearchViewModel_AssistedFactoryProvider()).put("com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailViewModel", (Provider) getSessionDetailViewModel_AssistedFactoryProvider()).put("com.google.samples.apps.iosched.ui.sessiondetail.SessionFeedbackViewModel", (Provider) getSessionFeedbackViewModel_AssistedFactoryProvider()).put("com.google.samples.apps.iosched.ui.settings.SettingsViewModel", (Provider) getSettingsViewModel_AssistedFactoryProvider()).put("com.google.samples.apps.iosched.ui.signin.SignInViewModel", (Provider) getSignInViewModel_AssistedFactoryProvider()).put("com.google.samples.apps.iosched.ui.prefs.SnackbarPreferenceViewModel", (Provider) getSnackbarPreferenceViewModel_AssistedFactoryProvider()).put("com.google.samples.apps.iosched.ui.speaker.SpeakerViewModel", (Provider) getSpeakerViewModel_AssistedFactoryProvider()).put("com.google.samples.apps.iosched.ui.theme.ThemeViewModel", (Provider) getThemeViewModel_AssistedFactoryProvider()).build();
      }

      private ViewModelProvider.Factory getProvideFactory() {
        return ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory.provideFactory(activity, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerMainApplication_HiltComponents_ApplicationC.this.applicationContextModule), getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
      }

      @Override
      public void injectLauncherActivity(LauncherActivity launcherActivity) {
      }

      @Override
      public void injectMainActivity(MainActivity mainActivity) {
        injectMainActivity2(mainActivity);
      }

      @Override
      public void injectOnboardingActivity(OnboardingActivity onboardingActivity) {
      }

      @Override
      public void injectSessionDetailActivity(SessionDetailActivity sessionDetailActivity) {
        injectSessionDetailActivity2(sessionDetailActivity);
      }

      @Override
      public Set<ViewModelProvider.Factory> getActivityViewModelFactory() {
        return ImmutableSet.<ViewModelProvider.Factory>of(getProvideFactory());
      }

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();
      }

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();
      }

      @CanIgnoreReturnValue
      private MainActivity injectMainActivity2(MainActivity instance) {
        MainActivity_MembersInjector.injectSnackbarMessageManager(instance, DaggerMainApplication_HiltComponents_ApplicationC.this.getSnackbarMessageManager());
        MainActivity_MembersInjector.injectConnectivityManager(instance, DaggerMainApplication_HiltComponents_ApplicationC.this.getConnectivityManager());
        MainActivity_MembersInjector.injectAnalyticsHelper(instance, DaggerMainApplication_HiltComponents_ApplicationC.this.getAnalyticsHelper());
        MainActivity_MembersInjector.injectMapFeatureEnabled(instance, DaggerMainApplication_HiltComponents_ApplicationC.this.getMapFeatureEnabledFlagBoolean());
        MainActivity_MembersInjector.injectCodelabsFeatureEnabled(instance, DaggerMainApplication_HiltComponents_ApplicationC.this.getCodelabsEnabledFlagBoolean());
        MainActivity_MembersInjector.injectExploreArFeatureEnabled(instance, DaggerMainApplication_HiltComponents_ApplicationC.this.getExploreArEnabledFlagBoolean());
        return instance;
      }

      @CanIgnoreReturnValue
      private SessionDetailActivity injectSessionDetailActivity2(SessionDetailActivity instance) {
        SessionDetailActivity_MembersInjector.injectSnackbarMessageManager(instance, DaggerMainApplication_HiltComponents_ApplicationC.this.getSnackbarMessageManager());
        return instance;
      }

      private final class FragmentCBuilder implements MainApplication_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment fragment) {
          this.fragment = Preconditions.checkNotNull(fragment);
          return this;
        }

        @Override
        public MainApplication_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCImpl(new SessionViewPoolModule(), fragment);
        }
      }

      private final class FragmentCImpl extends MainApplication_HiltComponents.FragmentC {
        private final SessionViewPoolModule sessionViewPoolModule;

        private final Fragment fragment;

        private volatile Object namedRecycledViewPool = new MemoizedSentinel();

        private FragmentCImpl(SessionViewPoolModule sessionViewPoolModuleParam,
            Fragment fragmentParam) {
          this.sessionViewPoolModule = sessionViewPoolModuleParam;
          this.fragment = fragmentParam;
        }

        private RecyclerView.RecycledViewPool getNamedRecycledViewPool() {
          Object local = namedRecycledViewPool;
          if (local instanceof MemoizedSentinel) {
            synchronized (local) {
              local = namedRecycledViewPool;
              if (local instanceof MemoizedSentinel) {
                local = SessionViewPoolModule_ProvidesTagViewPoolFactory.providesTagViewPool(sessionViewPoolModule);
                namedRecycledViewPool = DoubleCheck.reentrantCheck(namedRecycledViewPool, local);
              }
            }
          }
          return (RecyclerView.RecycledViewPool) local;
        }

        private SwapActionUseCase getSwapActionUseCase() {
          return new SwapActionUseCase(DaggerMainApplication_HiltComponents_ApplicationC.this.getSessionAndUserEventRepository(), CoroutinesModule_ProvidesIoDispatcherFactory.providesIoDispatcher());
        }

        private MarkScheduleUiHintsShownUseCase getMarkScheduleUiHintsShownUseCase() {
          return new MarkScheduleUiHintsShownUseCase(DaggerMainApplication_HiltComponents_ApplicationC.this.getPreferenceStorage(), CoroutinesModule_ProvidesIoDispatcherFactory.providesIoDispatcher());
        }

        private NotificationsPrefShownActionUseCase getNotificationsPrefShownActionUseCase() {
          return new NotificationsPrefShownActionUseCase(DaggerMainApplication_HiltComponents_ApplicationC.this.getPreferenceStorage(), CoroutinesModule_ProvidesIoDispatcherFactory.providesIoDispatcher());
        }

        private ViewModelProvider.Factory getProvideFactory() {
          return ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory.provideFactory(fragment, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerMainApplication_HiltComponents_ApplicationC.this.applicationContextModule), ActivityCImpl.this.getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
        }

        @Override
        public void injectAgendaFragment(AgendaFragment agendaFragment) {
        }

        @Override
        public void injectCodelabsFragment(CodelabsFragment codelabsFragment) {
          injectCodelabsFragment2(codelabsFragment);
        }

        @Override
        public void injectAnnouncementsFragment(AnnouncementsFragment announcementsFragment) {
          injectAnnouncementsFragment2(announcementsFragment);
        }

        @Override
        public void injectFeedFragment(FeedFragment feedFragment) {
          injectFeedFragment2(feedFragment);
        }

        @Override
        public void injectEventFragment(EventFragment eventFragment) {
          injectEventFragment2(eventFragment);
        }

        @Override
        public void injectFaqFragment(FaqFragment faqFragment) {
        }

        @Override
        public void injectInfoFragment(InfoFragment infoFragment) {
          injectInfoFragment2(infoFragment);
        }

        @Override
        public void injectTravelFragment(TravelFragment travelFragment) {
        }

        @Override
        public void injectMapFragment(MapFragment mapFragment) {
          injectMapFragment2(mapFragment);
        }

        @Override
        public void injectMapVariantSelectionDialogFragment(
            MapVariantSelectionDialogFragment mapVariantSelectionDialogFragment) {
        }

        @Override
        public void injectOnboardingFragment(OnboardingFragment onboardingFragment) {
        }

        @Override
        public void injectOnboardingSignInFragment(
            OnboardingSignInFragment onboardingSignInFragment) {
        }

        @Override
        public void injectWelcomeDuringConferenceFragment(
            WelcomeDuringConferenceFragment welcomeDuringConferenceFragment) {
        }

        @Override
        public void injectWelcomePreConferenceFragment(
            WelcomePreConferenceFragment welcomePreConferenceFragment) {
        }

        @Override
        public void injectRemoveReservationDialogFragment(
            RemoveReservationDialogFragment removeReservationDialogFragment) {
        }

        @Override
        public void injectSwapReservationDialogFragment(
            SwapReservationDialogFragment swapReservationDialogFragment) {
          injectSwapReservationDialogFragment2(swapReservationDialogFragment);
        }

        @Override
        public void injectScheduleFragment(ScheduleFragment scheduleFragment) {
          injectScheduleFragment2(scheduleFragment);
        }

        @Override
        public void injectScheduleUiHintsDialogFragment(
            ScheduleUiHintsDialogFragment scheduleUiHintsDialogFragment) {
          injectScheduleUiHintsDialogFragment2(scheduleUiHintsDialogFragment);
        }

        @Override
        public void injectSearchFilterFragment(SearchFilterFragment searchFilterFragment) {
        }

        @Override
        public void injectSearchFragment(SearchFragment searchFragment) {
          injectSearchFragment2(searchFragment);
        }

        @Override
        public void injectSessionDetailFragment(SessionDetailFragment sessionDetailFragment) {
          injectSessionDetailFragment2(sessionDetailFragment);
        }

        @Override
        public void injectSessionFeedbackFragment(SessionFeedbackFragment sessionFeedbackFragment) {
        }

        @Override
        public void injectSettingsFragment(SettingsFragment settingsFragment) {
        }

        @Override
        public void injectThemeSettingDialogFragment(
            ThemeSettingDialogFragment themeSettingDialogFragment) {
        }

        @Override
        public void injectNotificationsPreferenceDialogFragment(
            NotificationsPreferenceDialogFragment notificationsPreferenceDialogFragment) {
          injectNotificationsPreferenceDialogFragment2(notificationsPreferenceDialogFragment);
        }

        @Override
        public void injectSignInDialogFragment(SignInDialogFragment signInDialogFragment) {
          injectSignInDialogFragment2(signInDialogFragment);
        }

        @Override
        public void injectSignOutDialogFragment(SignOutDialogFragment signOutDialogFragment) {
          injectSignOutDialogFragment2(signOutDialogFragment);
        }

        @Override
        public void injectSpeakerFragment(SpeakerFragment speakerFragment) {
          injectSpeakerFragment2(speakerFragment);
        }

        @Override
        public Set<ViewModelProvider.Factory> getFragmentViewModelFactory() {
          return ImmutableSet.<ViewModelProvider.Factory>of(getProvideFactory());
        }

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();
        }

        @CanIgnoreReturnValue
        private CodelabsFragment injectCodelabsFragment2(CodelabsFragment instance) {
          CodelabsFragment_MembersInjector.injectTagRecycledViewPool(instance, getNamedRecycledViewPool());
          CodelabsFragment_MembersInjector.injectMapFeatureEnabled(instance, DaggerMainApplication_HiltComponents_ApplicationC.this.getMapFeatureEnabledFlagBoolean());
          CodelabsFragment_MembersInjector.injectAnalyticsHelper(instance, DaggerMainApplication_HiltComponents_ApplicationC.this.getAnalyticsHelper());
          return instance;
        }

        @CanIgnoreReturnValue
        private AnnouncementsFragment injectAnnouncementsFragment2(AnnouncementsFragment instance) {
          AnnouncementsFragment_MembersInjector.injectAnalyticsHelper(instance, DaggerMainApplication_HiltComponents_ApplicationC.this.getAnalyticsHelper());
          return instance;
        }

        @CanIgnoreReturnValue
        private FeedFragment injectFeedFragment2(FeedFragment instance) {
          FeedFragment_MembersInjector.injectSnackbarMessageManager(instance, DaggerMainApplication_HiltComponents_ApplicationC.this.getSnackbarMessageManager());
          FeedFragment_MembersInjector.injectAnalyticsHelper(instance, DaggerMainApplication_HiltComponents_ApplicationC.this.getAnalyticsHelper());
          return instance;
        }

        @CanIgnoreReturnValue
        private EventFragment injectEventFragment2(EventFragment instance) {
          EventFragment_MembersInjector.injectSnackbarMessageManager(instance, DaggerMainApplication_HiltComponents_ApplicationC.this.getSnackbarMessageManager());
          EventFragment_MembersInjector.injectAssistantAppEnabled(instance, DaggerMainApplication_HiltComponents_ApplicationC.this.getAssistantAppEnabledFlagBoolean());
          return instance;
        }

        @CanIgnoreReturnValue
        private InfoFragment injectInfoFragment2(InfoFragment instance) {
          InfoFragment_MembersInjector.injectAnalyticsHelper(instance, DaggerMainApplication_HiltComponents_ApplicationC.this.getAnalyticsHelper());
          return instance;
        }

        @CanIgnoreReturnValue
        private MapFragment injectMapFragment2(MapFragment instance) {
          MapFragment_MembersInjector.injectAnalyticsHelper(instance, DaggerMainApplication_HiltComponents_ApplicationC.this.getAnalyticsHelper());
          return instance;
        }

        @CanIgnoreReturnValue
        private SwapReservationDialogFragment injectSwapReservationDialogFragment2(
            SwapReservationDialogFragment instance) {
          SwapReservationDialogFragment_MembersInjector.injectSwapActionUseCase(instance, getSwapActionUseCase());
          return instance;
        }

        @CanIgnoreReturnValue
        private ScheduleFragment injectScheduleFragment2(ScheduleFragment instance) {
          ScheduleFragment_MembersInjector.injectAnalyticsHelper(instance, DaggerMainApplication_HiltComponents_ApplicationC.this.getAnalyticsHelper());
          ScheduleFragment_MembersInjector.injectTagViewPool(instance, getNamedRecycledViewPool());
          ScheduleFragment_MembersInjector.injectSearchScheduleFeatureEnabled(instance, DaggerMainApplication_HiltComponents_ApplicationC.this.getSearchScheduleEnabledFlagBoolean());
          ScheduleFragment_MembersInjector.injectSnackbarMessageManager(instance, DaggerMainApplication_HiltComponents_ApplicationC.this.getSnackbarMessageManager());
          return instance;
        }

        @CanIgnoreReturnValue
        private ScheduleUiHintsDialogFragment injectScheduleUiHintsDialogFragment2(
            ScheduleUiHintsDialogFragment instance) {
          ScheduleUiHintsDialogFragment_MembersInjector.injectMarkScheduleUiHintsShownUseCase(instance, getMarkScheduleUiHintsShownUseCase());
          return instance;
        }

        @CanIgnoreReturnValue
        private SearchFragment injectSearchFragment2(SearchFragment instance) {
          SearchFragment_MembersInjector.injectAnalyticsHelper(instance, DaggerMainApplication_HiltComponents_ApplicationC.this.getAnalyticsHelper());
          SearchFragment_MembersInjector.injectTagViewPool(instance, getNamedRecycledViewPool());
          return instance;
        }

        @CanIgnoreReturnValue
        private SessionDetailFragment injectSessionDetailFragment2(SessionDetailFragment instance) {
          SessionDetailFragment_MembersInjector.injectSnackbarMessageManager(instance, DaggerMainApplication_HiltComponents_ApplicationC.this.getSnackbarMessageManager());
          SessionDetailFragment_MembersInjector.injectAnalyticsHelper(instance, DaggerMainApplication_HiltComponents_ApplicationC.this.getAnalyticsHelper());
          SessionDetailFragment_MembersInjector.injectTagRecycledViewPool(instance, getNamedRecycledViewPool());
          SessionDetailFragment_MembersInjector.injectIsMapEnabled(instance, DaggerMainApplication_HiltComponents_ApplicationC.this.getMapFeatureEnabledFlagBoolean());
          return instance;
        }

        @CanIgnoreReturnValue
        private NotificationsPreferenceDialogFragment injectNotificationsPreferenceDialogFragment2(
            NotificationsPreferenceDialogFragment instance) {
          NotificationsPreferenceDialogFragment_MembersInjector.injectNotificationsPrefSaveActionUseCase(instance, ActivityCImpl.this.getNotificationsPrefSaveActionUseCase());
          NotificationsPreferenceDialogFragment_MembersInjector.injectNotificationsPrefShownActionUseCase(instance, getNotificationsPrefShownActionUseCase());
          return instance;
        }

        @CanIgnoreReturnValue
        private SignInDialogFragment injectSignInDialogFragment2(SignInDialogFragment instance) {
          SignInDialogFragment_MembersInjector.injectSignInHandler(instance, DaggerMainApplication_HiltComponents_ApplicationC.this.getSignInHandler());
          return instance;
        }

        @CanIgnoreReturnValue
        private SignOutDialogFragment injectSignOutDialogFragment2(SignOutDialogFragment instance) {
          SignOutDialogFragment_MembersInjector.injectSignInHandler(instance, DaggerMainApplication_HiltComponents_ApplicationC.this.getSignInHandler());
          return instance;
        }

        @CanIgnoreReturnValue
        private SpeakerFragment injectSpeakerFragment2(SpeakerFragment instance) {
          SpeakerFragment_MembersInjector.injectSnackbarMessageManager(instance, DaggerMainApplication_HiltComponents_ApplicationC.this.getSnackbarMessageManager());
          SpeakerFragment_MembersInjector.injectAnalyticsHelper(instance, DaggerMainApplication_HiltComponents_ApplicationC.this.getAnalyticsHelper());
          SpeakerFragment_MembersInjector.injectTagRecycledViewPool(instance, getNamedRecycledViewPool());
          return instance;
        }

        private final class ViewWithFragmentCBuilder implements MainApplication_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View view) {
            this.view = Preconditions.checkNotNull(view);
            return this;
          }

          @Override
          public MainApplication_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCImpl(view);
          }
        }

        private final class ViewWithFragmentCImpl extends MainApplication_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCImpl(View view) {

          }
        }
      }

      private final class ViewCBuilder implements MainApplication_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View view) {
          this.view = Preconditions.checkNotNull(view);
          return this;
        }

        @Override
        public MainApplication_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCImpl(view);
        }
      }

      private final class ViewCImpl extends MainApplication_HiltComponents.ViewC {
        private ViewCImpl(View view) {

        }
      }

      private final class SwitchingProvider<T> implements Provider<T> {
        private final int id;

        SwitchingProvider(int id) {
          this.id = id;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T get() {
          switch (id) {
            case 0: // com.google.samples.apps.iosched.ui.agenda.AgendaViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getAgendaViewModel_AssistedFactory();

            case 1: // com.google.samples.apps.iosched.shared.domain.agenda.LoadAgendaUseCase 
            return (T) ActivityCImpl.this.getLoadAgendaUseCase();

            case 2: // com.google.samples.apps.iosched.shared.domain.settings.GetTimeZoneUseCase 
            return (T) ActivityCImpl.this.getGetTimeZoneUseCase();

            case 3: // com.google.samples.apps.iosched.ui.feed.AnnouncementsViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getAnnouncementsViewModel_AssistedFactory();

            case 4: // com.google.samples.apps.iosched.shared.domain.feed.LoadAnnouncementsUseCase 
            return (T) ActivityCImpl.this.getLoadAnnouncementsUseCase();

            case 5: // com.google.samples.apps.iosched.ui.codelabs.CodelabsViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getCodelabsViewModel_AssistedFactory();

            case 6: // com.google.samples.apps.iosched.shared.domain.codelabs.LoadCodelabsUseCase 
            return (T) ActivityCImpl.this.getLoadCodelabsUseCase();

            case 7: // com.google.samples.apps.iosched.shared.domain.codelabs.GetCodelabsInfoCardShownUseCase 
            return (T) ActivityCImpl.this.getGetCodelabsInfoCardShownUseCase();

            case 8: // com.google.samples.apps.iosched.shared.domain.codelabs.SetCodelabsInfoCardShownUseCase 
            return (T) ActivityCImpl.this.getSetCodelabsInfoCardShownUseCase();

            case 9: // com.google.samples.apps.iosched.ui.info.EventInfoViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getEventInfoViewModel_AssistedFactory();

            case 10: // com.google.samples.apps.iosched.util.wifi.WifiInstaller 
            return (T) ActivityCImpl.this.getWifiInstaller();

            case 11: // com.google.samples.apps.iosched.ui.feed.FeedViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getFeedViewModel_AssistedFactory();

            case 12: // com.google.samples.apps.iosched.shared.domain.feed.LoadCurrentMomentUseCase 
            return (T) ActivityCImpl.this.getLoadCurrentMomentUseCase();

            case 13: // com.google.samples.apps.iosched.shared.domain.sessions.LoadStarredAndReservedSessionsUseCase 
            return (T) ActivityCImpl.this.getLoadStarredAndReservedSessionsUseCase();

            case 14: // com.google.samples.apps.iosched.shared.domain.feed.GetConferenceStateUseCase 
            return (T) ActivityCImpl.this.getGetConferenceStateUseCase();

            case 15: // com.google.samples.apps.iosched.ui.LaunchViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getLaunchViewModel_AssistedFactory();

            case 16: // com.google.samples.apps.iosched.shared.domain.prefs.OnboardingCompletedUseCase 
            return (T) ActivityCImpl.this.getOnboardingCompletedUseCase();

            case 17: // com.google.samples.apps.iosched.ui.MainActivityViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getMainActivityViewModel_AssistedFactory();

            case 18: // com.google.samples.apps.iosched.shared.domain.sessions.LoadPinnedSessionsJsonUseCase 
            return (T) ActivityCImpl.this.getLoadPinnedSessionsJsonUseCase();

            case 19: // com.google.samples.apps.iosched.shared.domain.ar.LoadArDebugFlagUseCase 
            return (T) ActivityCImpl.this.getLoadArDebugFlagUseCase();

            case 20: // com.google.samples.apps.iosched.ui.map.MapViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getMapViewModel_AssistedFactory();

            case 21: // com.google.samples.apps.iosched.ui.map.LoadGeoJsonFeaturesUseCase 
            return (T) ActivityCImpl.this.getLoadGeoJsonFeaturesUseCase();

            case 22: // com.google.samples.apps.iosched.shared.domain.prefs.OptIntoMyLocationUseCase 
            return (T) ActivityCImpl.this.getOptIntoMyLocationUseCase();

            case 23: // com.google.samples.apps.iosched.shared.domain.prefs.MyLocationOptedInUseCase 
            return (T) ActivityCImpl.this.getMyLocationOptedInUseCase();

            case 24: // com.google.samples.apps.iosched.ui.onboarding.OnboardingViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getOnboardingViewModel_AssistedFactory();

            case 25: // com.google.samples.apps.iosched.shared.domain.prefs.OnboardingCompleteActionUseCase 
            return (T) ActivityCImpl.this.getOnboardingCompleteActionUseCase();

            case 26: // com.google.samples.apps.iosched.ui.reservation.RemoveReservationViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getRemoveReservationViewModel_AssistedFactory();

            case 27: // com.google.samples.apps.iosched.shared.domain.sessions.LoadUserSessionUseCase 
            return (T) ActivityCImpl.this.getLoadUserSessionUseCase();

            case 28: // com.google.samples.apps.iosched.shared.domain.users.ReservationActionUseCase 
            return (T) ActivityCImpl.this.getReservationActionUseCase();

            case 29: // com.google.samples.apps.iosched.ui.schedule.ScheduleViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getScheduleViewModel_AssistedFactory();

            case 30: // com.google.samples.apps.iosched.shared.domain.sessions.LoadScheduleUserSessionsUseCase 
            return (T) ActivityCImpl.this.getLoadScheduleUserSessionsUseCase();

            case 31: // com.google.samples.apps.iosched.shared.domain.users.StarEventAndNotifyUseCase 
            return (T) ActivityCImpl.this.getStarEventAndNotifyUseCase();

            case 32: // com.google.samples.apps.iosched.shared.domain.prefs.ScheduleUiHintsShownUseCase 
            return (T) ActivityCImpl.this.getScheduleUiHintsShownUseCase();

            case 33: // com.google.samples.apps.iosched.shared.domain.RefreshConferenceDataUseCase 
            return (T) ActivityCImpl.this.getRefreshConferenceDataUseCase();

            case 34: // com.google.samples.apps.iosched.shared.domain.sessions.ObserveConferenceDataUseCase 
            return (T) ActivityCImpl.this.getObserveConferenceDataUseCase();

            case 35: // com.google.samples.apps.iosched.ui.search.SearchViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getSearchViewModel_AssistedFactory();

            case 36: // com.google.samples.apps.iosched.shared.domain.search.SessionSearchUseCase 
            return (T) ActivityCImpl.this.getSessionSearchUseCase();

            case 37: // com.google.samples.apps.iosched.shared.domain.search.LoadSearchFiltersUseCase 
            return (T) ActivityCImpl.this.getLoadSearchFiltersUseCase();

            case 38: // com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getSessionDetailViewModel_AssistedFactory();

            case 39: // com.google.samples.apps.iosched.shared.domain.sessions.LoadUserSessionsUseCase 
            return (T) ActivityCImpl.this.getLoadUserSessionsUseCase();

            case 40: // com.google.samples.apps.iosched.shared.util.NetworkUtils 
            return (T) ActivityCImpl.this.getNetworkUtils();

            case 41: // com.google.samples.apps.iosched.ui.sessiondetail.SessionFeedbackViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getSessionFeedbackViewModel_AssistedFactory();

            case 42: // com.google.samples.apps.iosched.shared.domain.users.FeedbackUseCase 
            return (T) ActivityCImpl.this.getFeedbackUseCase();

            case 43: // com.google.samples.apps.iosched.ui.settings.SettingsViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getSettingsViewModel_AssistedFactory();

            case 44: // com.google.samples.apps.iosched.shared.domain.settings.SetTimeZoneUseCase 
            return (T) ActivityCImpl.this.getSetTimeZoneUseCase();

            case 45: // com.google.samples.apps.iosched.shared.domain.prefs.NotificationsPrefSaveActionUseCase 
            return (T) ActivityCImpl.this.getNotificationsPrefSaveActionUseCase();

            case 46: // com.google.samples.apps.iosched.shared.domain.settings.GetNotificationsSettingUseCase 
            return (T) ActivityCImpl.this.getGetNotificationsSettingUseCase();

            case 47: // com.google.samples.apps.iosched.shared.domain.settings.SetAnalyticsSettingUseCase 
            return (T) ActivityCImpl.this.getSetAnalyticsSettingUseCase();

            case 48: // com.google.samples.apps.iosched.shared.domain.settings.GetAnalyticsSettingUseCase 
            return (T) ActivityCImpl.this.getGetAnalyticsSettingUseCase();

            case 49: // com.google.samples.apps.iosched.shared.domain.settings.SetThemeUseCase 
            return (T) ActivityCImpl.this.getSetThemeUseCase();

            case 50: // com.google.samples.apps.iosched.shared.domain.settings.GetAvailableThemesUseCase 
            return (T) ActivityCImpl.this.getGetAvailableThemesUseCase();

            case 51: // com.google.samples.apps.iosched.ui.signin.SignInViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getSignInViewModel_AssistedFactory();

            case 52: // com.google.samples.apps.iosched.ui.prefs.SnackbarPreferenceViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getSnackbarPreferenceViewModel_AssistedFactory();

            case 53: // com.google.samples.apps.iosched.shared.domain.prefs.StopSnackbarActionUseCase 
            return (T) ActivityCImpl.this.getStopSnackbarActionUseCase();

            case 54: // com.google.samples.apps.iosched.ui.speaker.SpeakerViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getSpeakerViewModel_AssistedFactory();

            case 55: // com.google.samples.apps.iosched.shared.domain.speakers.LoadSpeakerUseCase 
            return (T) ActivityCImpl.this.getLoadSpeakerUseCase();

            case 56: // com.google.samples.apps.iosched.ui.sessioncommon.EventActionsViewModelDelegate 
            return (T) ActivityCImpl.this.getEventActionsViewModelDelegate();

            case 57: // com.google.samples.apps.iosched.ui.theme.ThemeViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getThemeViewModel_AssistedFactory();

            default: throw new AssertionError(id);
          }
        }
      }
    }
  }

  private final class ServiceCBuilder implements MainApplication_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public MainApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends MainApplication_HiltComponents.ServiceC {
    private ServiceCImpl(Service service) {

    }

    private RefreshConferenceDataUseCase getRefreshConferenceDataUseCase() {
      return new RefreshConferenceDataUseCase(DaggerMainApplication_HiltComponents_ApplicationC.this.getConferenceDataRepository(), CoroutinesModule_ProvidesIoDispatcherFactory.providesIoDispatcher());
    }

    @Override
    public void injectConferenceDataService(ConferenceDataService arg0) {
      injectConferenceDataService2(arg0);
    }

    @CanIgnoreReturnValue
    private ConferenceDataService injectConferenceDataService2(ConferenceDataService instance) {
      ConferenceDataService_MembersInjector.injectRefreshEventDataUseCase(instance, getRefreshConferenceDataUseCase());
      return instance;
    }
  }

  private final class SwitchingProvider<T> implements Provider<T> {
    private final int id;

    SwitchingProvider(int id) {
      this.id = id;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get() {
      switch (id) {
        case 0: // com.google.samples.apps.iosched.shared.time.TimeProvider 
        return (T) DaggerMainApplication_HiltComponents_ApplicationC.this.getTimeProvider();

        case 1: // com.google.samples.apps.iosched.shared.domain.logistics.LoadWifiInfoUseCase 
        return (T) DaggerMainApplication_HiltComponents_ApplicationC.this.getLoadWifiInfoUseCase();

        case 2: // com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper 
        return (T) DaggerMainApplication_HiltComponents_ApplicationC.this.getAnalyticsHelper();

        case 3: // com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate 
        return (T) DaggerMainApplication_HiltComponents_ApplicationC.this.getSignInViewModelDelegate();

        case 4: // com.google.samples.apps.iosched.ui.theme.ThemedActivityDelegate 
        return (T) DaggerMainApplication_HiltComponents_ApplicationC.this.getThemedActivityDelegate();

        case 5: // @dagger.hilt.android.qualifiers.ApplicationContext android.content.Context 
        return (T) ApplicationContextModule_ProvideContextFactory.provideContext(DaggerMainApplication_HiltComponents_ApplicationC.this.applicationContextModule);

        case 6: // com.google.samples.apps.iosched.shared.fcm.TopicSubscriber 
        return (T) DaggerMainApplication_HiltComponents_ApplicationC.this.getTopicSubscriber();

        case 7: // com.google.samples.apps.iosched.ui.messages.SnackbarMessageManager 
        return (T) DaggerMainApplication_HiltComponents_ApplicationC.this.getSnackbarMessageManager();

        case 8: // com.google.samples.apps.iosched.ui.filters.FiltersViewModelDelegate 
        return (T) FiltersViewModelDelegateModule_ProvideFiltersViewModelDelegateFactory.provideFiltersViewModelDelegate(DaggerMainApplication_HiltComponents_ApplicationC.this.filtersViewModelDelegateModule);

        case 9: // @com.google.samples.apps.iosched.shared.di.ReservationEnabledFlag java.lang.Boolean 
        return (T) (Boolean) DaggerMainApplication_HiltComponents_ApplicationC.this.getReservationEnabledFlagBoolean();

        case 10: // @com.google.samples.apps.iosched.shared.di.DefaultDispatcher kotlinx.coroutines.CoroutineDispatcher 
        return (T) CoroutinesModule_ProvidesDefaultDispatcherFactory.providesDefaultDispatcher();

        case 11: // com.google.samples.apps.iosched.shared.domain.settings.GetThemeUseCase 
        return (T) DaggerMainApplication_HiltComponents_ApplicationC.this.getGetThemeUseCase();

        default: throw new AssertionError(id);
      }
    }
  }
}
