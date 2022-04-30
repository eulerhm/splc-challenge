package nl.rijksoverheid.en;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002 !B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0014\u001a\u00020\u0015J\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0015J\u0006\u0010\u001b\u001a\u00020\u0015J\u0006\u0010\u001c\u001a\u00020\u0015J\u0010\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u0012H\u0002J\u0010\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u0011\u0010\u0007\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lnl/rijksoverheid/en/ExposureNotificationsViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lnl/rijksoverheid/en/ExposureNotificationsRepository;", "settingsRepository", "Lnl/rijksoverheid/en/settings/SettingsRepository;", "(Lnl/rijksoverheid/en/ExposureNotificationsRepository;Lnl/rijksoverheid/en/settings/SettingsRepository;)V", "locationPreconditionSatisfied", "", "getLocationPreconditionSatisfied", "()Z", "notificationState", "Landroidx/lifecycle/LiveData;", "Lnl/rijksoverheid/en/ExposureNotificationsViewModel$NotificationsState;", "getNotificationState", "()Landroidx/lifecycle/LiveData;", "notificationsResult", "Lnl/rijksoverheid/en/lifecyle/Event;", "Lnl/rijksoverheid/en/ExposureNotificationsViewModel$NotificationsStatusResult;", "getNotificationsResult", "disableExposureNotifications", "", "observeLocationPreconditionSatisfied", "Lkotlinx/coroutines/flow/Flow;", "context", "Landroid/content/Context;", "requestEnableNotifications", "requestEnableNotificationsForcingConsent", "rescheduleBackgroundJobs", "updateResult", "result", "Lnl/rijksoverheid/en/enapi/EnableNotificationsResult;", "NotificationsState", "NotificationsStatusResult", "app_tstDebug"})
public final class ExposureNotificationsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<nl.rijksoverheid.en.ExposureNotificationsViewModel.NotificationsState> notificationState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<nl.rijksoverheid.en.lifecyle.Event<nl.rijksoverheid.en.ExposureNotificationsViewModel.NotificationsStatusResult>> notificationsResult = null;
    private final nl.rijksoverheid.en.ExposureNotificationsRepository repository = null;
    private final nl.rijksoverheid.en.settings.SettingsRepository settingsRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<nl.rijksoverheid.en.ExposureNotificationsViewModel.NotificationsState> getNotificationState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<nl.rijksoverheid.en.lifecyle.Event<nl.rijksoverheid.en.ExposureNotificationsViewModel.NotificationsStatusResult>> getNotificationsResult() {
        return null;
    }
    
    public final boolean getLocationPreconditionSatisfied() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<kotlin.Unit> observeLocationPreconditionSatisfied(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    public final void requestEnableNotifications() {
    }
    
    public final void requestEnableNotificationsForcingConsent() {
    }
    
    private final void updateResult(nl.rijksoverheid.en.enapi.EnableNotificationsResult result) {
    }
    
    private final void updateResult(nl.rijksoverheid.en.ExposureNotificationsViewModel.NotificationsStatusResult result) {
    }
    
    public final void disableExposureNotifications() {
    }
    
    public final void rescheduleBackgroundJobs() {
    }
    
    public ExposureNotificationsViewModel(@org.jetbrains.annotations.NotNull()
    nl.rijksoverheid.en.ExposureNotificationsRepository repository, @org.jetbrains.annotations.NotNull()
    nl.rijksoverheid.en.settings.SettingsRepository settingsRepository) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f\u00a8\u0006\r"}, d2 = {"Lnl/rijksoverheid/en/ExposureNotificationsViewModel$NotificationsState;", "", "()V", "BluetoothDisabled", "Disabled", "Enabled", "LocationPreconditionNotSatisfied", "Unavailable", "Lnl/rijksoverheid/en/ExposureNotificationsViewModel$NotificationsState$Enabled;", "Lnl/rijksoverheid/en/ExposureNotificationsViewModel$NotificationsState$BluetoothDisabled;", "Lnl/rijksoverheid/en/ExposureNotificationsViewModel$NotificationsState$LocationPreconditionNotSatisfied;", "Lnl/rijksoverheid/en/ExposureNotificationsViewModel$NotificationsState$Disabled;", "Lnl/rijksoverheid/en/ExposureNotificationsViewModel$NotificationsState$Unavailable;", "app_tstDebug"})
    public static abstract class NotificationsState {
        
        private NotificationsState() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lnl/rijksoverheid/en/ExposureNotificationsViewModel$NotificationsState$Enabled;", "Lnl/rijksoverheid/en/ExposureNotificationsViewModel$NotificationsState;", "()V", "app_tstDebug"})
        public static final class Enabled extends nl.rijksoverheid.en.ExposureNotificationsViewModel.NotificationsState {
            @org.jetbrains.annotations.NotNull()
            public static final nl.rijksoverheid.en.ExposureNotificationsViewModel.NotificationsState.Enabled INSTANCE = null;
            
            private Enabled() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lnl/rijksoverheid/en/ExposureNotificationsViewModel$NotificationsState$BluetoothDisabled;", "Lnl/rijksoverheid/en/ExposureNotificationsViewModel$NotificationsState;", "()V", "app_tstDebug"})
        public static final class BluetoothDisabled extends nl.rijksoverheid.en.ExposureNotificationsViewModel.NotificationsState {
            @org.jetbrains.annotations.NotNull()
            public static final nl.rijksoverheid.en.ExposureNotificationsViewModel.NotificationsState.BluetoothDisabled INSTANCE = null;
            
            private BluetoothDisabled() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lnl/rijksoverheid/en/ExposureNotificationsViewModel$NotificationsState$LocationPreconditionNotSatisfied;", "Lnl/rijksoverheid/en/ExposureNotificationsViewModel$NotificationsState;", "()V", "app_tstDebug"})
        public static final class LocationPreconditionNotSatisfied extends nl.rijksoverheid.en.ExposureNotificationsViewModel.NotificationsState {
            @org.jetbrains.annotations.NotNull()
            public static final nl.rijksoverheid.en.ExposureNotificationsViewModel.NotificationsState.LocationPreconditionNotSatisfied INSTANCE = null;
            
            private LocationPreconditionNotSatisfied() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lnl/rijksoverheid/en/ExposureNotificationsViewModel$NotificationsState$Disabled;", "Lnl/rijksoverheid/en/ExposureNotificationsViewModel$NotificationsState;", "()V", "app_tstDebug"})
        public static final class Disabled extends nl.rijksoverheid.en.ExposureNotificationsViewModel.NotificationsState {
            @org.jetbrains.annotations.NotNull()
            public static final nl.rijksoverheid.en.ExposureNotificationsViewModel.NotificationsState.Disabled INSTANCE = null;
            
            private Disabled() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lnl/rijksoverheid/en/ExposureNotificationsViewModel$NotificationsState$Unavailable;", "Lnl/rijksoverheid/en/ExposureNotificationsViewModel$NotificationsState;", "()V", "app_tstDebug"})
        public static final class Unavailable extends nl.rijksoverheid.en.ExposureNotificationsViewModel.NotificationsState {
            @org.jetbrains.annotations.NotNull()
            public static final nl.rijksoverheid.en.ExposureNotificationsViewModel.NotificationsState.Unavailable INSTANCE = null;
            
            private Unavailable() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lnl/rijksoverheid/en/ExposureNotificationsViewModel$NotificationsStatusResult;", "", "()V", "ConsentRequired", "Unavailable", "UnknownError", "Lnl/rijksoverheid/en/ExposureNotificationsViewModel$NotificationsStatusResult$ConsentRequired;", "Lnl/rijksoverheid/en/ExposureNotificationsViewModel$NotificationsStatusResult$Unavailable;", "Lnl/rijksoverheid/en/ExposureNotificationsViewModel$NotificationsStatusResult$UnknownError;", "app_tstDebug"})
    public static abstract class NotificationsStatusResult {
        
        private NotificationsStatusResult() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lnl/rijksoverheid/en/ExposureNotificationsViewModel$NotificationsStatusResult$ConsentRequired;", "Lnl/rijksoverheid/en/ExposureNotificationsViewModel$NotificationsStatusResult;", "intent", "Landroid/app/PendingIntent;", "(Landroid/app/PendingIntent;)V", "getIntent", "()Landroid/app/PendingIntent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_tstDebug"})
        public static final class ConsentRequired extends nl.rijksoverheid.en.ExposureNotificationsViewModel.NotificationsStatusResult {
            @org.jetbrains.annotations.NotNull()
            private final android.app.PendingIntent intent = null;
            
            @org.jetbrains.annotations.NotNull()
            public final android.app.PendingIntent getIntent() {
                return null;
            }
            
            public ConsentRequired(@org.jetbrains.annotations.NotNull()
            android.app.PendingIntent intent) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.app.PendingIntent component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final nl.rijksoverheid.en.ExposureNotificationsViewModel.NotificationsStatusResult.ConsentRequired copy(@org.jetbrains.annotations.NotNull()
            android.app.PendingIntent intent) {
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
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lnl/rijksoverheid/en/ExposureNotificationsViewModel$NotificationsStatusResult$Unavailable;", "Lnl/rijksoverheid/en/ExposureNotificationsViewModel$NotificationsStatusResult;", "statusCode", "", "(I)V", "getStatusCode", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_tstDebug"})
        public static final class Unavailable extends nl.rijksoverheid.en.ExposureNotificationsViewModel.NotificationsStatusResult {
            private final int statusCode = 0;
            
            public final int getStatusCode() {
                return 0;
            }
            
            public Unavailable(int statusCode) {
                super();
            }
            
            public final int component1() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final nl.rijksoverheid.en.ExposureNotificationsViewModel.NotificationsStatusResult.Unavailable copy(int statusCode) {
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
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u00a2\u0006\u0002\u0010\u0005J\r\u0010\b\u001a\u00060\u0003j\u0002`\u0004H\u00c6\u0003J\u0017\u0010\t\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lnl/rijksoverheid/en/ExposureNotificationsViewModel$NotificationsStatusResult$UnknownError;", "Lnl/rijksoverheid/en/ExposureNotificationsViewModel$NotificationsStatusResult;", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;)V", "getException", "()Ljava/lang/Exception;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_tstDebug"})
        public static final class UnknownError extends nl.rijksoverheid.en.ExposureNotificationsViewModel.NotificationsStatusResult {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.Exception exception = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.Exception getException() {
                return null;
            }
            
            public UnknownError(@org.jetbrains.annotations.NotNull()
            java.lang.Exception exception) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.Exception component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final nl.rijksoverheid.en.ExposureNotificationsViewModel.NotificationsStatusResult.UnknownError copy(@org.jetbrains.annotations.NotNull()
            java.lang.Exception exception) {
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
}