package com.google.samples.apps.iosched.shared.data.prefs;

import java.lang.System;

/**
 * [PreferenceStorage] impl backed by [android.content.SharedPreferences].
 */
@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlinx.coroutines.FlowPreview()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 W2\u00020\u0001:\u0001WB\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020\u0006R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR+\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b\u0012\u0010\rR+\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR0\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0!X\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\"2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\"8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R+\u0010(\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\b+\u0010\u000f\u001a\u0004\b)\u0010\u000b\"\u0004\b*\u0010\rR+\u0010,\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\b/\u0010\u000f\u001a\u0004\b-\u0010\u000b\"\u0004\b.\u0010\rR+\u00100\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\b3\u0010\u000f\u001a\u0004\b1\u0010\u000b\"\u0004\b2\u0010\rR\u0014\u00104\u001a\b\u0012\u0004\u0012\u00020605X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u00107\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\b:\u0010\u000f\u001a\u0004\b8\u0010\u000b\"\u0004\b9\u0010\rR+\u0010;\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u001a8V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R+\u0010B\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u001a8V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\bE\u0010A\u001a\u0004\bC\u0010=\"\u0004\bD\u0010?R!\u0010F\u001a\b\u0012\u0004\u0012\u00020\u001a0G8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bH\u0010IR+\u0010L\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\bO\u0010\u000f\u001a\u0004\bM\u0010\u000b\"\u0004\bN\u0010\rR+\u0010P\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\bS\u0010\u000f\u001a\u0004\bQ\u0010\u000b\"\u0004\bR\u0010\r\u00a8\u0006X"}, d2 = {"Lcom/google/samples/apps/iosched/shared/data/prefs/SharedPreferenceStorage;", "Lcom/google/samples/apps/iosched/shared/data/prefs/PreferenceStorage;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "changeListener", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "<set-?>", "", "codelabsInfoShown", "getCodelabsInfoShown", "()Z", "setCodelabsInfoShown", "(Z)V", "codelabsInfoShown$delegate", "Lcom/google/samples/apps/iosched/shared/data/prefs/BooleanPreference;", "myLocationOptedIn", "getMyLocationOptedIn", "setMyLocationOptedIn", "myLocationOptedIn$delegate", "notificationsPreferenceShown", "getNotificationsPreferenceShown", "setNotificationsPreferenceShown", "notificationsPreferenceShown$delegate", "<anonymous parameter 0>", "Lkotlinx/coroutines/flow/Flow;", "", "observableSelectedTheme", "getObservableSelectedTheme", "()Lkotlinx/coroutines/flow/Flow;", "setObservableSelectedTheme", "(Lkotlinx/coroutines/flow/Flow;)V", "observableShowSnackbarResult", "Landroidx/lifecycle/MutableLiveData;", "Landroidx/lifecycle/LiveData;", "observableSnackbarIsStopped", "getObservableSnackbarIsStopped", "()Landroidx/lifecycle/LiveData;", "setObservableSnackbarIsStopped", "(Landroidx/lifecycle/LiveData;)V", "onboardingCompleted", "getOnboardingCompleted", "setOnboardingCompleted", "onboardingCompleted$delegate", "preferConferenceTimeZone", "getPreferConferenceTimeZone", "setPreferConferenceTimeZone", "preferConferenceTimeZone$delegate", "preferToReceiveNotifications", "getPreferToReceiveNotifications", "setPreferToReceiveNotifications", "preferToReceiveNotifications$delegate", "prefs", "Lkotlin/Lazy;", "Landroid/content/SharedPreferences;", "scheduleUiHintsShown", "getScheduleUiHintsShown", "setScheduleUiHintsShown", "scheduleUiHintsShown$delegate", "selectedFilters", "getSelectedFilters", "()Ljava/lang/String;", "setSelectedFilters", "(Ljava/lang/String;)V", "selectedFilters$delegate", "Lcom/google/samples/apps/iosched/shared/data/prefs/StringPreference;", "selectedTheme", "getSelectedTheme", "setSelectedTheme", "selectedTheme$delegate", "selectedThemeChannel", "Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;", "getSelectedThemeChannel", "()Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;", "selectedThemeChannel$delegate", "Lkotlin/Lazy;", "sendUsageStatistics", "getSendUsageStatistics", "setSendUsageStatistics", "sendUsageStatistics$delegate", "snackbarIsStopped", "getSnackbarIsStopped", "setSnackbarIsStopped", "snackbarIsStopped$delegate", "registerOnPreferenceChangeListener", "", "listener", "Companion", "shared_staging"})
@javax.inject.Singleton()
public final class SharedPreferenceStorage implements com.google.samples.apps.iosched.shared.data.prefs.PreferenceStorage {
    private final kotlin.Lazy selectedThemeChannel$delegate = null;
    private final kotlin.Lazy<android.content.SharedPreferences> prefs = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> observableShowSnackbarResult = null;
    private final android.content.SharedPreferences.OnSharedPreferenceChangeListener changeListener = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.samples.apps.iosched.shared.data.prefs.BooleanPreference onboardingCompleted$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.samples.apps.iosched.shared.data.prefs.BooleanPreference scheduleUiHintsShown$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.samples.apps.iosched.shared.data.prefs.BooleanPreference notificationsPreferenceShown$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.samples.apps.iosched.shared.data.prefs.BooleanPreference preferToReceiveNotifications$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.samples.apps.iosched.shared.data.prefs.BooleanPreference myLocationOptedIn$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.samples.apps.iosched.shared.data.prefs.BooleanPreference snackbarIsStopped$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.samples.apps.iosched.shared.data.prefs.BooleanPreference sendUsageStatistics$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.samples.apps.iosched.shared.data.prefs.BooleanPreference preferConferenceTimeZone$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.samples.apps.iosched.shared.data.prefs.StringPreference selectedFilters$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.samples.apps.iosched.shared.data.prefs.StringPreference selectedTheme$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.samples.apps.iosched.shared.data.prefs.BooleanPreference codelabsInfoShown$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PREFS_NAME = "iosched";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PREF_ONBOARDING = "pref_onboarding";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PREF_SCHED_UI_HINTS_SHOWN = "pref_sched_ui_hints_shown";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PREF_NOTIFICATIONS_SHOWN = "pref_notifications_shown";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PREF_RECEIVE_NOTIFICATIONS = "pref_receive_notifications";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PREF_MY_LOCATION_OPTED_IN = "pref_my_location_opted_in";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PREF_SNACKBAR_IS_STOPPED = "pref_snackbar_is_stopped";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PREF_SEND_USAGE_STATISTICS = "pref_send_usage_statistics";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PREF_CONFERENCE_TIME_ZONE = "pref_conference_time_zone";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PREF_SELECTED_FILTERS = "pref_selected_filters";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PREF_DARK_MODE_ENABLED = "pref_dark_mode";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PREF_CODELABS_INFO_SHOWN = "pref_codelabs_info_shown";
    public static final com.google.samples.apps.iosched.shared.data.prefs.SharedPreferenceStorage.Companion Companion = null;
    
    private final kotlinx.coroutines.channels.ConflatedBroadcastChannel<java.lang.String> getSelectedThemeChannel() {
        return null;
    }
    
    @java.lang.Override()
    public boolean getOnboardingCompleted() {
        return false;
    }
    
    @java.lang.Override()
    public void setOnboardingCompleted(boolean p0) {
    }
    
    @java.lang.Override()
    public boolean getScheduleUiHintsShown() {
        return false;
    }
    
    @java.lang.Override()
    public void setScheduleUiHintsShown(boolean p0) {
    }
    
    @java.lang.Override()
    public boolean getNotificationsPreferenceShown() {
        return false;
    }
    
    @java.lang.Override()
    public void setNotificationsPreferenceShown(boolean p0) {
    }
    
    @java.lang.Override()
    public boolean getPreferToReceiveNotifications() {
        return false;
    }
    
    @java.lang.Override()
    public void setPreferToReceiveNotifications(boolean p0) {
    }
    
    @java.lang.Override()
    public boolean getMyLocationOptedIn() {
        return false;
    }
    
    @java.lang.Override()
    public void setMyLocationOptedIn(boolean p0) {
    }
    
    @java.lang.Override()
    public boolean getSnackbarIsStopped() {
        return false;
    }
    
    @java.lang.Override()
    public void setSnackbarIsStopped(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.lang.Boolean> getObservableSnackbarIsStopped() {
        return null;
    }
    
    @java.lang.Override()
    public void setObservableSnackbarIsStopped(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.lang.Boolean> $noName_0) {
    }
    
    @java.lang.Override()
    public boolean getSendUsageStatistics() {
        return false;
    }
    
    @java.lang.Override()
    public void setSendUsageStatistics(boolean p0) {
    }
    
    @java.lang.Override()
    public boolean getPreferConferenceTimeZone() {
        return false;
    }
    
    @java.lang.Override()
    public void setPreferConferenceTimeZone(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getSelectedFilters() {
        return null;
    }
    
    @java.lang.Override()
    public void setSelectedFilters(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getSelectedTheme() {
        return null;
    }
    
    @java.lang.Override()
    public void setSelectedTheme(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.lang.String> getObservableSelectedTheme() {
        return null;
    }
    
    @java.lang.Override()
    public void setObservableSelectedTheme(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.Flow<java.lang.String> $noName_0) {
    }
    
    @java.lang.Override()
    public boolean getCodelabsInfoShown() {
        return false;
    }
    
    @java.lang.Override()
    public void setCodelabsInfoShown(boolean p0) {
    }
    
    public final void registerOnPreferenceChangeListener(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences.OnSharedPreferenceChangeListener listener) {
    }
    
    @javax.inject.Inject()
    public SharedPreferenceStorage(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/google/samples/apps/iosched/shared/data/prefs/SharedPreferenceStorage$Companion;", "", "()V", "PREFS_NAME", "", "PREF_CODELABS_INFO_SHOWN", "PREF_CONFERENCE_TIME_ZONE", "PREF_DARK_MODE_ENABLED", "PREF_MY_LOCATION_OPTED_IN", "PREF_NOTIFICATIONS_SHOWN", "PREF_ONBOARDING", "PREF_RECEIVE_NOTIFICATIONS", "PREF_SCHED_UI_HINTS_SHOWN", "PREF_SELECTED_FILTERS", "PREF_SEND_USAGE_STATISTICS", "PREF_SNACKBAR_IS_STOPPED", "shared_staging"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}