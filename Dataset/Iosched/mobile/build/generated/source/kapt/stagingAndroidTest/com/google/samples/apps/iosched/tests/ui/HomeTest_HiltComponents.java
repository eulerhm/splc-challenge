package com.google.samples.apps.iosched.tests.ui;

import androidx.hilt.lifecycle.ViewModelFactoryModules;
import com.google.samples.apps.iosched.MainApplication_GeneratedInjector;
import com.google.samples.apps.iosched.di.AppModule;
import com.google.samples.apps.iosched.di.SignInModule;
import com.google.samples.apps.iosched.shared.data.job.ConferenceDataService_GeneratedInjector;
import com.google.samples.apps.iosched.shared.di.FeatureFlagsModule;
import com.google.samples.apps.iosched.shared.di.SharedModule;
import com.google.samples.apps.iosched.shared.notifications.AlarmBroadcastReceiver_GeneratedInjector;
import com.google.samples.apps.iosched.shared.notifications.CancelNotificationBroadcastReceiver_GeneratedInjector;
import com.google.samples.apps.iosched.tests.SetPreferencesRule;
import com.google.samples.apps.iosched.tests.di.TestCoroutinesModule;
import com.google.samples.apps.iosched.ui.LaunchViewModel_HiltModule;
import com.google.samples.apps.iosched.ui.LauncherActivity_GeneratedInjector;
import com.google.samples.apps.iosched.ui.MainActivityViewModel_HiltModule;
import com.google.samples.apps.iosched.ui.MainActivity_GeneratedInjector;
import com.google.samples.apps.iosched.ui.agenda.AgendaFragment_GeneratedInjector;
import com.google.samples.apps.iosched.ui.agenda.AgendaViewModel_HiltModule;
import com.google.samples.apps.iosched.ui.codelabs.CodelabsFragment_GeneratedInjector;
import com.google.samples.apps.iosched.ui.codelabs.CodelabsViewModel_HiltModule;
import com.google.samples.apps.iosched.ui.feed.AnnouncementsFragment_GeneratedInjector;
import com.google.samples.apps.iosched.ui.feed.AnnouncementsViewModel_HiltModule;
import com.google.samples.apps.iosched.ui.feed.FeedFragment_GeneratedInjector;
import com.google.samples.apps.iosched.ui.feed.FeedViewModel_HiltModule;
import com.google.samples.apps.iosched.ui.filters.FiltersViewModelDelegateModule;
import com.google.samples.apps.iosched.ui.info.EventFragment_GeneratedInjector;
import com.google.samples.apps.iosched.ui.info.EventInfoViewModel_HiltModule;
import com.google.samples.apps.iosched.ui.info.FaqFragment_GeneratedInjector;
import com.google.samples.apps.iosched.ui.info.InfoFragment_GeneratedInjector;
import com.google.samples.apps.iosched.ui.info.TravelFragment_GeneratedInjector;
import com.google.samples.apps.iosched.ui.map.MapFragment_GeneratedInjector;
import com.google.samples.apps.iosched.ui.map.MapVariantSelectionDialogFragment_GeneratedInjector;
import com.google.samples.apps.iosched.ui.map.MapViewModel_HiltModule;
import com.google.samples.apps.iosched.ui.onboarding.OnboardingActivity_GeneratedInjector;
import com.google.samples.apps.iosched.ui.onboarding.OnboardingFragment_GeneratedInjector;
import com.google.samples.apps.iosched.ui.onboarding.OnboardingSignInFragment_GeneratedInjector;
import com.google.samples.apps.iosched.ui.onboarding.OnboardingViewModel_HiltModule;
import com.google.samples.apps.iosched.ui.onboarding.WelcomeDuringConferenceFragment_GeneratedInjector;
import com.google.samples.apps.iosched.ui.onboarding.WelcomePreConferenceFragment_GeneratedInjector;
import com.google.samples.apps.iosched.ui.prefs.SnackbarPreferenceViewModel_HiltModule;
import com.google.samples.apps.iosched.ui.reservation.RemoveReservationDialogFragment_GeneratedInjector;
import com.google.samples.apps.iosched.ui.reservation.RemoveReservationViewModel_HiltModule;
import com.google.samples.apps.iosched.ui.reservation.SwapReservationDialogFragment_GeneratedInjector;
import com.google.samples.apps.iosched.ui.schedule.ScheduleFragment_GeneratedInjector;
import com.google.samples.apps.iosched.ui.schedule.ScheduleUiHintsDialogFragment_GeneratedInjector;
import com.google.samples.apps.iosched.ui.schedule.ScheduleViewModel_HiltModule;
import com.google.samples.apps.iosched.ui.search.SearchFilterFragment_GeneratedInjector;
import com.google.samples.apps.iosched.ui.search.SearchFragment_GeneratedInjector;
import com.google.samples.apps.iosched.ui.search.SearchViewModel_HiltModule;
import com.google.samples.apps.iosched.ui.sessioncommon.EventActionsViewModelDelegateModule;
import com.google.samples.apps.iosched.ui.sessioncommon.SessionViewPoolModule;
import com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailActivity_GeneratedInjector;
import com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailFragment_GeneratedInjector;
import com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailViewModel_HiltModule;
import com.google.samples.apps.iosched.ui.sessiondetail.SessionFeedbackFragment_GeneratedInjector;
import com.google.samples.apps.iosched.ui.sessiondetail.SessionFeedbackViewModel_HiltModule;
import com.google.samples.apps.iosched.ui.settings.SettingsFragment_GeneratedInjector;
import com.google.samples.apps.iosched.ui.settings.SettingsViewModel_HiltModule;
import com.google.samples.apps.iosched.ui.settings.ThemeSettingDialogFragment_GeneratedInjector;
import com.google.samples.apps.iosched.ui.signin.NotificationsPreferenceDialogFragment_GeneratedInjector;
import com.google.samples.apps.iosched.ui.signin.SignInDialogFragment_GeneratedInjector;
import com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegateModule;
import com.google.samples.apps.iosched.ui.signin.SignInViewModel_HiltModule;
import com.google.samples.apps.iosched.ui.signin.SignOutDialogFragment_GeneratedInjector;
import com.google.samples.apps.iosched.ui.speaker.SpeakerFragment_GeneratedInjector;
import com.google.samples.apps.iosched.ui.speaker.SpeakerViewModel_HiltModule;
import com.google.samples.apps.iosched.ui.theme.ThemeViewModel_HiltModule;
import com.google.samples.apps.iosched.ui.theme.ThemedActivityDelegateModule;
import dagger.Binds;
import dagger.Component;
import dagger.Module;
import dagger.Subcomponent;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.components.ApplicationComponent;
import dagger.hilt.android.components.FragmentComponent;
import dagger.hilt.android.components.ServiceComponent;
import dagger.hilt.android.components.ViewComponent;
import dagger.hilt.android.components.ViewWithFragmentComponent;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_LifecycleComponentBuilderEntryPoint;
import dagger.hilt.android.internal.managers.ServiceComponentManager;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.HiltWrapper_ActivityModule;
import dagger.hilt.android.scopes.ActivityRetainedScoped;
import dagger.hilt.android.scopes.ActivityScoped;
import dagger.hilt.android.scopes.FragmentScoped;
import dagger.hilt.android.scopes.ServiceScoped;
import dagger.hilt.android.scopes.ViewScoped;
import dagger.hilt.internal.GeneratedComponent;
import dagger.hilt.migration.DisableInstallInCheck;
import javax.annotation.Generated;
import javax.inject.Singleton;

@Generated("dagger.hilt.processor.internal.root.RootProcessor")
public final class HomeTest_HiltComponents {
  private HomeTest_HiltComponents() {
  }

  @Module(
      subcomponents = ActivityC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ActivityCBuilderModule {
    @Binds
    ActivityComponentBuilder bind(ActivityC.Builder builder);
  }

  @Module(
      subcomponents = ActivityRetainedC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ActivityRetainedCBuilderModule {
    @Binds
    ActivityRetainedComponentBuilder bind(ActivityRetainedC.Builder builder);
  }

  @Module(
      subcomponents = FragmentC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface FragmentCBuilderModule {
    @Binds
    FragmentComponentBuilder bind(FragmentC.Builder builder);
  }

  @Module(
      subcomponents = ServiceC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ServiceCBuilderModule {
    @Binds
    ServiceComponentBuilder bind(ServiceC.Builder builder);
  }

  @Module(
      subcomponents = ViewC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ViewCBuilderModule {
    @Binds
    ViewComponentBuilder bind(ViewC.Builder builder);
  }

  @Module(
      subcomponents = ViewWithFragmentC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ViewWithFragmentCBuilderModule {
    @Binds
    ViewWithFragmentComponentBuilder bind(ViewWithFragmentC.Builder builder);
  }

  @Subcomponent(
      modules = {
          DefaultViewModelFactories.ActivityModule.class,
          EventActionsViewModelDelegateModule.class,
          HiltWrapper_ActivityModule.class,
          FragmentCBuilderModule.class,
          ViewCBuilderModule.class,
          ViewModelFactoryModules.ActivityModule.class
      }
  )
  @ActivityScoped
  public abstract static class ActivityC implements LauncherActivity_GeneratedInjector,
      MainActivity_GeneratedInjector,
      OnboardingActivity_GeneratedInjector,
      SessionDetailActivity_GeneratedInjector,
      ActivityComponent,
      DefaultViewModelFactories.ActivityEntryPoint,
      FragmentComponentManager.FragmentComponentBuilderEntryPoint,
      ViewComponentManager.ViewComponentBuilderEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ActivityComponentBuilder {
    }
  }

  @Subcomponent(
      modules = {
          AgendaViewModel_HiltModule.class,
          AnnouncementsViewModel_HiltModule.class,
          CodelabsViewModel_HiltModule.class,
          EventInfoViewModel_HiltModule.class,
          FeedViewModel_HiltModule.class,
          ActivityCBuilderModule.class,
          LaunchViewModel_HiltModule.class,
          MainActivityViewModel_HiltModule.class,
          MapViewModel_HiltModule.class,
          OnboardingViewModel_HiltModule.class,
          RemoveReservationViewModel_HiltModule.class,
          ScheduleViewModel_HiltModule.class,
          SearchViewModel_HiltModule.class,
          SessionDetailViewModel_HiltModule.class,
          SessionFeedbackViewModel_HiltModule.class,
          SettingsViewModel_HiltModule.class,
          SignInViewModel_HiltModule.class,
          SnackbarPreferenceViewModel_HiltModule.class,
          SpeakerViewModel_HiltModule.class,
          ThemeViewModel_HiltModule.class
      }
  )
  @ActivityRetainedScoped
  public abstract static class ActivityRetainedC implements ActivityRetainedComponent,
      ActivityComponentManager.ActivityComponentBuilderEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ActivityRetainedComponentBuilder {
    }
  }

  @Component(
      modules = {
          AppModule.class,
          ApplicationContextModule.class,
          FeatureFlagsModule.class,
          FiltersViewModelDelegateModule.class,
          ActivityRetainedCBuilderModule.class,
          ServiceCBuilderModule.class,
          SharedModule.class,
          SignInModule.class,
          SignInViewModelDelegateModule.class,
          TestCoroutinesModule.class,
          ThemedActivityDelegateModule.class
      }
  )
  @Singleton
  public abstract static class ApplicationC implements MainApplication_GeneratedInjector,
      AlarmBroadcastReceiver_GeneratedInjector,
      CancelNotificationBroadcastReceiver_GeneratedInjector,
      SetPreferencesRule.SetPreferencesRuleEntryPoint,
      HomeTest_GeneratedInjector,
      ApplicationComponent,
      HiltWrapper_ActivityRetainedComponentManager_LifecycleComponentBuilderEntryPoint,
      ServiceComponentManager.ServiceComponentBuilderEntryPoint,
      GeneratedComponent {
  }

  @Subcomponent(
      modules = {
          DefaultViewModelFactories.FragmentModule.class,
          ViewWithFragmentCBuilderModule.class,
          SessionViewPoolModule.class,
          ViewModelFactoryModules.FragmentModule.class
      }
  )
  @FragmentScoped
  public abstract static class FragmentC implements AgendaFragment_GeneratedInjector,
      CodelabsFragment_GeneratedInjector,
      AnnouncementsFragment_GeneratedInjector,
      FeedFragment_GeneratedInjector,
      EventFragment_GeneratedInjector,
      FaqFragment_GeneratedInjector,
      InfoFragment_GeneratedInjector,
      TravelFragment_GeneratedInjector,
      MapFragment_GeneratedInjector,
      MapVariantSelectionDialogFragment_GeneratedInjector,
      OnboardingFragment_GeneratedInjector,
      OnboardingSignInFragment_GeneratedInjector,
      WelcomeDuringConferenceFragment_GeneratedInjector,
      WelcomePreConferenceFragment_GeneratedInjector,
      RemoveReservationDialogFragment_GeneratedInjector,
      SwapReservationDialogFragment_GeneratedInjector,
      ScheduleFragment_GeneratedInjector,
      ScheduleUiHintsDialogFragment_GeneratedInjector,
      SearchFilterFragment_GeneratedInjector,
      SearchFragment_GeneratedInjector,
      SessionDetailFragment_GeneratedInjector,
      SessionFeedbackFragment_GeneratedInjector,
      SettingsFragment_GeneratedInjector,
      ThemeSettingDialogFragment_GeneratedInjector,
      NotificationsPreferenceDialogFragment_GeneratedInjector,
      SignInDialogFragment_GeneratedInjector,
      SignOutDialogFragment_GeneratedInjector,
      SpeakerFragment_GeneratedInjector,
      FragmentComponent,
      DefaultViewModelFactories.FragmentEntryPoint,
      ViewComponentManager.ViewWithFragmentComponentBuilderEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends FragmentComponentBuilder {
    }
  }

  @Subcomponent
  @ServiceScoped
  public abstract static class ServiceC implements ConferenceDataService_GeneratedInjector,
      ServiceComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ServiceComponentBuilder {
    }
  }

  @Subcomponent
  @ViewScoped
  public abstract static class ViewC implements ViewComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewComponentBuilder {
    }
  }

  @Subcomponent
  @ViewScoped
  public abstract static class ViewWithFragmentC implements ViewWithFragmentComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewWithFragmentComponentBuilder {
    }
  }
}
