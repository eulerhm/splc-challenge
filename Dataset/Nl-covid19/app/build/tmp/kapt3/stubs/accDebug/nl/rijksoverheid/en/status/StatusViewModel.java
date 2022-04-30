package nl.rijksoverheid.en.status;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00a0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002?@B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ<\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010*\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u00102\u0006\u0010,\u001a\u00020-H\u0002J\u0011\u0010.\u001a\u00020/H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00100J*\u00101\u001a\u0004\u0018\u0001022\u0006\u0010%\u001a\u00020&2\u0006\u00103\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u0010H\u0002J[\u00104\u001a\b\u0012\u0004\u0012\u00020\"0!2\b\u0010\'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010,\u001a\u00020-2\u0006\u0010\u001a\u001a\u00020\u00102\u001e\u00101\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010206\u0012\u0006\u0012\u0004\u0018\u00010705H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00108J\u0006\u00109\u001a\u00020\u0010J\u0011\u0010:\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00100J\u0006\u0010;\u001a\u00020\u0010J\u0006\u0010<\u001a\u00020=J\u0006\u0010>\u001a\u00020=R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00100\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001cR\u0019\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u001d\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006A"}, d2 = {"Lnl/rijksoverheid/en/status/StatusViewModel;", "Landroidx/lifecycle/ViewModel;", "onboardingRepository", "Lnl/rijksoverheid/en/onboarding/OnboardingRepository;", "exposureNotificationsRepository", "Lnl/rijksoverheid/en/ExposureNotificationsRepository;", "notificationsRepository", "Lnl/rijksoverheid/en/notifier/NotificationsRepository;", "settingsRepository", "Lnl/rijksoverheid/en/settings/SettingsRepository;", "appConfigManager", "Lnl/rijksoverheid/en/config/AppConfigManager;", "clock", "Ljava/time/Clock;", "(Lnl/rijksoverheid/en/onboarding/OnboardingRepository;Lnl/rijksoverheid/en/ExposureNotificationsRepository;Lnl/rijksoverheid/en/notifier/NotificationsRepository;Lnl/rijksoverheid/en/settings/SettingsRepository;Lnl/rijksoverheid/en/config/AppConfigManager;Ljava/time/Clock;)V", "exposureDetected", "", "getExposureDetected", "()Z", "exposureNotificationApiUpdateRequired", "Landroidx/lifecycle/LiveData;", "getExposureNotificationApiUpdateRequired", "()Landroidx/lifecycle/LiveData;", "headerState", "Lnl/rijksoverheid/en/status/StatusViewModel$HeaderState;", "getHeaderState", "isIgnoringBatteryOptimizations", "Lkotlinx/coroutines/flow/MutableStateFlow;", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "lastKeysProcessed", "Ljava/time/LocalDateTime;", "getLastKeysProcessed", "notificationState", "", "Lnl/rijksoverheid/en/status/StatusViewModel$NotificationState;", "getNotificationState", "createHeaderState", "status", "Lnl/rijksoverheid/en/enapi/StatusResult;", "lastExposureDate", "Ljava/time/LocalDate;", "notificationReceivedDate", "keyProcessingOverdue", "isWifiOnlyOn", "pausedState", "Lnl/rijksoverheid/en/settings/Settings$PausedState;", "getAppointmentPhoneNumber", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getErrorState", "Lnl/rijksoverheid/en/status/StatusViewModel$NotificationState$Error;", "exposureNotificationsEnabled", "getNotificationStates", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Ljava/time/LocalDate;Ljava/time/LocalDate;Lnl/rijksoverheid/en/settings/Settings$PausedState;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasCompletedOnboarding", "hasIndependentKeySharing", "isPlayServicesUpToDate", "removeExposure", "", "resetErrorState", "HeaderState", "NotificationState", "app_accDebug"})
public final class StatusViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> isIgnoringBatteryOptimizations = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<nl.rijksoverheid.en.status.StatusViewModel.HeaderState> headerState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<nl.rijksoverheid.en.status.StatusViewModel.NotificationState>> notificationState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.time.LocalDateTime> lastKeysProcessed = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> exposureNotificationApiUpdateRequired = null;
    private final nl.rijksoverheid.en.onboarding.OnboardingRepository onboardingRepository = null;
    private final nl.rijksoverheid.en.ExposureNotificationsRepository exposureNotificationsRepository = null;
    private final nl.rijksoverheid.en.notifier.NotificationsRepository notificationsRepository = null;
    private final nl.rijksoverheid.en.config.AppConfigManager appConfigManager = null;
    private final java.time.Clock clock = null;
    
    public final boolean isPlayServicesUpToDate() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> isIgnoringBatteryOptimizations() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<nl.rijksoverheid.en.status.StatusViewModel.HeaderState> getHeaderState() {
        return null;
    }
    
    public final boolean getExposureDetected() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<nl.rijksoverheid.en.status.StatusViewModel.NotificationState>> getNotificationState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.time.LocalDateTime> getLastKeysProcessed() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getExposureNotificationApiUpdateRequired() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAppointmentPhoneNumber(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object hasIndependentKeySharing(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> p0) {
        return null;
    }
    
    public final boolean hasCompletedOnboarding() {
        return false;
    }
    
    private final nl.rijksoverheid.en.status.StatusViewModel.HeaderState createHeaderState(nl.rijksoverheid.en.enapi.StatusResult status, java.time.LocalDate lastExposureDate, java.time.LocalDate notificationReceivedDate, boolean keyProcessingOverdue, boolean isWifiOnlyOn, nl.rijksoverheid.en.settings.Settings.PausedState pausedState) {
        return null;
    }
    
    private final nl.rijksoverheid.en.status.StatusViewModel.NotificationState.Error getErrorState(nl.rijksoverheid.en.enapi.StatusResult status, boolean exposureNotificationsEnabled, boolean keyProcessingOverdue, boolean isWifiOnlyOn) {
        return null;
    }
    
    public final void removeExposure() {
    }
    
    public final void resetErrorState() {
    }
    
    public StatusViewModel(@org.jetbrains.annotations.NotNull()
    nl.rijksoverheid.en.onboarding.OnboardingRepository onboardingRepository, @org.jetbrains.annotations.NotNull()
    nl.rijksoverheid.en.ExposureNotificationsRepository exposureNotificationsRepository, @org.jetbrains.annotations.NotNull()
    nl.rijksoverheid.en.notifier.NotificationsRepository notificationsRepository, @org.jetbrains.annotations.NotNull()
    nl.rijksoverheid.en.settings.SettingsRepository settingsRepository, @org.jetbrains.annotations.NotNull()
    nl.rijksoverheid.en.config.AppConfigManager appConfigManager, @org.jetbrains.annotations.NotNull()
    java.time.Clock clock) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\nB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\b\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u00a8\u0006\u0013"}, d2 = {"Lnl/rijksoverheid/en/status/StatusViewModel$HeaderState;", "", "()V", "Active", "BluetoothDisabled", "Disabled", "Exposed", "LocationDisabled", "Paused", "SyncIssues", "SyncIssuesWifiOnly", "Lnl/rijksoverheid/en/status/StatusViewModel$HeaderState$Active;", "Lnl/rijksoverheid/en/status/StatusViewModel$HeaderState$BluetoothDisabled;", "Lnl/rijksoverheid/en/status/StatusViewModel$HeaderState$LocationDisabled;", "Lnl/rijksoverheid/en/status/StatusViewModel$HeaderState$Disabled;", "Lnl/rijksoverheid/en/status/StatusViewModel$HeaderState$SyncIssues;", "Lnl/rijksoverheid/en/status/StatusViewModel$HeaderState$SyncIssuesWifiOnly;", "Lnl/rijksoverheid/en/status/StatusViewModel$HeaderState$Paused;", "Lnl/rijksoverheid/en/status/StatusViewModel$HeaderState$Exposed;", "app_accDebug"})
    public static abstract class HeaderState {
        
        private HeaderState() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lnl/rijksoverheid/en/status/StatusViewModel$HeaderState$Active;", "Lnl/rijksoverheid/en/status/StatusViewModel$HeaderState;", "()V", "app_accDebug"})
        public static final class Active extends nl.rijksoverheid.en.status.StatusViewModel.HeaderState {
            @org.jetbrains.annotations.NotNull()
            public static final nl.rijksoverheid.en.status.StatusViewModel.HeaderState.Active INSTANCE = null;
            
            private Active() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lnl/rijksoverheid/en/status/StatusViewModel$HeaderState$BluetoothDisabled;", "Lnl/rijksoverheid/en/status/StatusViewModel$HeaderState;", "()V", "app_accDebug"})
        public static final class BluetoothDisabled extends nl.rijksoverheid.en.status.StatusViewModel.HeaderState {
            @org.jetbrains.annotations.NotNull()
            public static final nl.rijksoverheid.en.status.StatusViewModel.HeaderState.BluetoothDisabled INSTANCE = null;
            
            private BluetoothDisabled() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lnl/rijksoverheid/en/status/StatusViewModel$HeaderState$LocationDisabled;", "Lnl/rijksoverheid/en/status/StatusViewModel$HeaderState;", "()V", "app_accDebug"})
        public static final class LocationDisabled extends nl.rijksoverheid.en.status.StatusViewModel.HeaderState {
            @org.jetbrains.annotations.NotNull()
            public static final nl.rijksoverheid.en.status.StatusViewModel.HeaderState.LocationDisabled INSTANCE = null;
            
            private LocationDisabled() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lnl/rijksoverheid/en/status/StatusViewModel$HeaderState$Disabled;", "Lnl/rijksoverheid/en/status/StatusViewModel$HeaderState;", "()V", "app_accDebug"})
        public static final class Disabled extends nl.rijksoverheid.en.status.StatusViewModel.HeaderState {
            @org.jetbrains.annotations.NotNull()
            public static final nl.rijksoverheid.en.status.StatusViewModel.HeaderState.Disabled INSTANCE = null;
            
            private Disabled() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lnl/rijksoverheid/en/status/StatusViewModel$HeaderState$SyncIssues;", "Lnl/rijksoverheid/en/status/StatusViewModel$HeaderState;", "()V", "app_accDebug"})
        public static final class SyncIssues extends nl.rijksoverheid.en.status.StatusViewModel.HeaderState {
            @org.jetbrains.annotations.NotNull()
            public static final nl.rijksoverheid.en.status.StatusViewModel.HeaderState.SyncIssues INSTANCE = null;
            
            private SyncIssues() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lnl/rijksoverheid/en/status/StatusViewModel$HeaderState$SyncIssuesWifiOnly;", "Lnl/rijksoverheid/en/status/StatusViewModel$HeaderState;", "()V", "app_accDebug"})
        public static final class SyncIssuesWifiOnly extends nl.rijksoverheid.en.status.StatusViewModel.HeaderState {
            @org.jetbrains.annotations.NotNull()
            public static final nl.rijksoverheid.en.status.StatusViewModel.HeaderState.SyncIssuesWifiOnly INSTANCE = null;
            
            private SyncIssuesWifiOnly() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lnl/rijksoverheid/en/status/StatusViewModel$HeaderState$Paused;", "Lnl/rijksoverheid/en/status/StatusViewModel$HeaderState;", "pausedUntil", "Ljava/time/LocalDateTime;", "(Ljava/time/LocalDateTime;)V", "getPausedUntil", "()Ljava/time/LocalDateTime;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_accDebug"})
        public static final class Paused extends nl.rijksoverheid.en.status.StatusViewModel.HeaderState {
            @org.jetbrains.annotations.NotNull()
            private final java.time.LocalDateTime pausedUntil = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.time.LocalDateTime getPausedUntil() {
                return null;
            }
            
            public Paused(@org.jetbrains.annotations.NotNull()
            java.time.LocalDateTime pausedUntil) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.time.LocalDateTime component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final nl.rijksoverheid.en.status.StatusViewModel.HeaderState.Paused copy(@org.jetbrains.annotations.NotNull()
            java.time.LocalDateTime pausedUntil) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0006H\u00c6\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u00a8\u0006\u0019"}, d2 = {"Lnl/rijksoverheid/en/status/StatusViewModel$HeaderState$Exposed;", "Lnl/rijksoverheid/en/status/StatusViewModel$HeaderState;", "date", "Ljava/time/LocalDate;", "notificationReceivedDate", "clock", "Ljava/time/Clock;", "(Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/Clock;)V", "getClock", "()Ljava/time/Clock;", "getDate", "()Ljava/time/LocalDate;", "getNotificationReceivedDate", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_accDebug"})
        public static final class Exposed extends nl.rijksoverheid.en.status.StatusViewModel.HeaderState {
            @org.jetbrains.annotations.NotNull()
            private final java.time.LocalDate date = null;
            @org.jetbrains.annotations.Nullable()
            private final java.time.LocalDate notificationReceivedDate = null;
            @org.jetbrains.annotations.NotNull()
            private final java.time.Clock clock = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.time.LocalDate getDate() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.time.LocalDate getNotificationReceivedDate() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.time.Clock getClock() {
                return null;
            }
            
            public Exposed(@org.jetbrains.annotations.NotNull()
            java.time.LocalDate date, @org.jetbrains.annotations.Nullable()
            java.time.LocalDate notificationReceivedDate, @org.jetbrains.annotations.NotNull()
            java.time.Clock clock) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.time.LocalDate component1() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.time.LocalDate component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.time.Clock component3() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final nl.rijksoverheid.en.status.StatusViewModel.HeaderState.Exposed copy(@org.jetbrains.annotations.NotNull()
            java.time.LocalDate date, @org.jetbrains.annotations.Nullable()
            java.time.LocalDate notificationReceivedDate, @org.jetbrains.annotations.NotNull()
            java.time.Clock clock) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lnl/rijksoverheid/en/status/StatusViewModel$NotificationState;", "", "()V", "BatteryOptimizationEnabled", "Error", "ExposureOver14DaysAgo", "Paused", "Lnl/rijksoverheid/en/status/StatusViewModel$NotificationState$Paused;", "Lnl/rijksoverheid/en/status/StatusViewModel$NotificationState$ExposureOver14DaysAgo;", "Lnl/rijksoverheid/en/status/StatusViewModel$NotificationState$BatteryOptimizationEnabled;", "Lnl/rijksoverheid/en/status/StatusViewModel$NotificationState$Error;", "app_accDebug"})
    public static abstract class NotificationState {
        
        private NotificationState() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lnl/rijksoverheid/en/status/StatusViewModel$NotificationState$Paused;", "Lnl/rijksoverheid/en/status/StatusViewModel$NotificationState;", "pausedUntil", "Ljava/time/LocalDateTime;", "(Ljava/time/LocalDateTime;)V", "getPausedUntil", "()Ljava/time/LocalDateTime;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_accDebug"})
        public static final class Paused extends nl.rijksoverheid.en.status.StatusViewModel.NotificationState {
            @org.jetbrains.annotations.NotNull()
            private final java.time.LocalDateTime pausedUntil = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.time.LocalDateTime getPausedUntil() {
                return null;
            }
            
            public Paused(@org.jetbrains.annotations.NotNull()
            java.time.LocalDateTime pausedUntil) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.time.LocalDateTime component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final nl.rijksoverheid.en.status.StatusViewModel.NotificationState.Paused copy(@org.jetbrains.annotations.NotNull()
            java.time.LocalDateTime pausedUntil) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0006H\u00c6\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u00a8\u0006\u0019"}, d2 = {"Lnl/rijksoverheid/en/status/StatusViewModel$NotificationState$ExposureOver14DaysAgo;", "Lnl/rijksoverheid/en/status/StatusViewModel$NotificationState;", "exposureDate", "Ljava/time/LocalDate;", "notificationReceivedDate", "clock", "Ljava/time/Clock;", "(Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/Clock;)V", "getClock", "()Ljava/time/Clock;", "getExposureDate", "()Ljava/time/LocalDate;", "getNotificationReceivedDate", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_accDebug"})
        public static final class ExposureOver14DaysAgo extends nl.rijksoverheid.en.status.StatusViewModel.NotificationState {
            @org.jetbrains.annotations.NotNull()
            private final java.time.LocalDate exposureDate = null;
            @org.jetbrains.annotations.Nullable()
            private final java.time.LocalDate notificationReceivedDate = null;
            @org.jetbrains.annotations.NotNull()
            private final java.time.Clock clock = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.time.LocalDate getExposureDate() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.time.LocalDate getNotificationReceivedDate() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.time.Clock getClock() {
                return null;
            }
            
            public ExposureOver14DaysAgo(@org.jetbrains.annotations.NotNull()
            java.time.LocalDate exposureDate, @org.jetbrains.annotations.Nullable()
            java.time.LocalDate notificationReceivedDate, @org.jetbrains.annotations.NotNull()
            java.time.Clock clock) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.time.LocalDate component1() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.time.LocalDate component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.time.Clock component3() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final nl.rijksoverheid.en.status.StatusViewModel.NotificationState.ExposureOver14DaysAgo copy(@org.jetbrains.annotations.NotNull()
            java.time.LocalDate exposureDate, @org.jetbrains.annotations.Nullable()
            java.time.LocalDate notificationReceivedDate, @org.jetbrains.annotations.NotNull()
            java.time.Clock clock) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lnl/rijksoverheid/en/status/StatusViewModel$NotificationState$BatteryOptimizationEnabled;", "Lnl/rijksoverheid/en/status/StatusViewModel$NotificationState;", "()V", "app_accDebug"})
        public static final class BatteryOptimizationEnabled extends nl.rijksoverheid.en.status.StatusViewModel.NotificationState {
            @org.jetbrains.annotations.NotNull()
            public static final nl.rijksoverheid.en.status.StatusViewModel.NotificationState.BatteryOptimizationEnabled INSTANCE = null;
            
            private BatteryOptimizationEnabled() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e\u00a8\u0006\u000f"}, d2 = {"Lnl/rijksoverheid/en/status/StatusViewModel$NotificationState$Error;", "Lnl/rijksoverheid/en/status/StatusViewModel$NotificationState;", "()V", "BluetoothDisabled", "ConsentRequired", "LocationDisabled", "NotificationsDisabled", "SyncIssues", "SyncIssuesWifiOnly", "Lnl/rijksoverheid/en/status/StatusViewModel$NotificationState$Error$BluetoothDisabled;", "Lnl/rijksoverheid/en/status/StatusViewModel$NotificationState$Error$LocationDisabled;", "Lnl/rijksoverheid/en/status/StatusViewModel$NotificationState$Error$ConsentRequired;", "Lnl/rijksoverheid/en/status/StatusViewModel$NotificationState$Error$NotificationsDisabled;", "Lnl/rijksoverheid/en/status/StatusViewModel$NotificationState$Error$SyncIssues;", "Lnl/rijksoverheid/en/status/StatusViewModel$NotificationState$Error$SyncIssuesWifiOnly;", "app_accDebug"})
        public static abstract class Error extends nl.rijksoverheid.en.status.StatusViewModel.NotificationState {
            
            private Error() {
                super();
            }
            
            @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lnl/rijksoverheid/en/status/StatusViewModel$NotificationState$Error$BluetoothDisabled;", "Lnl/rijksoverheid/en/status/StatusViewModel$NotificationState$Error;", "()V", "app_accDebug"})
            public static final class BluetoothDisabled extends nl.rijksoverheid.en.status.StatusViewModel.NotificationState.Error {
                @org.jetbrains.annotations.NotNull()
                public static final nl.rijksoverheid.en.status.StatusViewModel.NotificationState.Error.BluetoothDisabled INSTANCE = null;
                
                private BluetoothDisabled() {
                    super();
                }
            }
            
            @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lnl/rijksoverheid/en/status/StatusViewModel$NotificationState$Error$LocationDisabled;", "Lnl/rijksoverheid/en/status/StatusViewModel$NotificationState$Error;", "()V", "app_accDebug"})
            public static final class LocationDisabled extends nl.rijksoverheid.en.status.StatusViewModel.NotificationState.Error {
                @org.jetbrains.annotations.NotNull()
                public static final nl.rijksoverheid.en.status.StatusViewModel.NotificationState.Error.LocationDisabled INSTANCE = null;
                
                private LocationDisabled() {
                    super();
                }
            }
            
            @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lnl/rijksoverheid/en/status/StatusViewModel$NotificationState$Error$ConsentRequired;", "Lnl/rijksoverheid/en/status/StatusViewModel$NotificationState$Error;", "()V", "app_accDebug"})
            public static final class ConsentRequired extends nl.rijksoverheid.en.status.StatusViewModel.NotificationState.Error {
                @org.jetbrains.annotations.NotNull()
                public static final nl.rijksoverheid.en.status.StatusViewModel.NotificationState.Error.ConsentRequired INSTANCE = null;
                
                private ConsentRequired() {
                    super();
                }
            }
            
            @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lnl/rijksoverheid/en/status/StatusViewModel$NotificationState$Error$NotificationsDisabled;", "Lnl/rijksoverheid/en/status/StatusViewModel$NotificationState$Error;", "()V", "app_accDebug"})
            public static final class NotificationsDisabled extends nl.rijksoverheid.en.status.StatusViewModel.NotificationState.Error {
                @org.jetbrains.annotations.NotNull()
                public static final nl.rijksoverheid.en.status.StatusViewModel.NotificationState.Error.NotificationsDisabled INSTANCE = null;
                
                private NotificationsDisabled() {
                    super();
                }
            }
            
            @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lnl/rijksoverheid/en/status/StatusViewModel$NotificationState$Error$SyncIssues;", "Lnl/rijksoverheid/en/status/StatusViewModel$NotificationState$Error;", "()V", "app_accDebug"})
            public static final class SyncIssues extends nl.rijksoverheid.en.status.StatusViewModel.NotificationState.Error {
                @org.jetbrains.annotations.NotNull()
                public static final nl.rijksoverheid.en.status.StatusViewModel.NotificationState.Error.SyncIssues INSTANCE = null;
                
                private SyncIssues() {
                    super();
                }
            }
            
            @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lnl/rijksoverheid/en/status/StatusViewModel$NotificationState$Error$SyncIssuesWifiOnly;", "Lnl/rijksoverheid/en/status/StatusViewModel$NotificationState$Error;", "()V", "app_accDebug"})
            public static final class SyncIssuesWifiOnly extends nl.rijksoverheid.en.status.StatusViewModel.NotificationState.Error {
                @org.jetbrains.annotations.NotNull()
                public static final nl.rijksoverheid.en.status.StatusViewModel.NotificationState.Error.SyncIssuesWifiOnly INSTANCE = null;
                
                private SyncIssuesWifiOnly() {
                    super();
                }
            }
        }
    }
}