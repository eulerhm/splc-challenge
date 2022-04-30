package com.google.samples.apps.iosched.shared.data.prefs;

import java.lang.System;

/**
 * Storage for app and user preferences.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001f\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007R\u0018\u0010\u000b\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\f\u0010\u0005\"\u0004\b\r\u0010\u0007R\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001b\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u001c\u0010\u0005\"\u0004\b\u001d\u0010\u0007R\u0018\u0010\u001e\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u001f\u0010\u0005\"\u0004\b \u0010\u0007R\u0018\u0010!\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\"\u0010\u0005\"\u0004\b#\u0010\u0007R\u0018\u0010$\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b%\u0010\u0005\"\u0004\b&\u0010\u0007R\u0018\u0010\'\u001a\u00020\u0010X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0018\u0010,\u001a\u00020\u0010X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b-\u0010)\"\u0004\b.\u0010+R\u0018\u0010/\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b0\u0010\u0005\"\u0004\b1\u0010\u0007R\u0018\u00102\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b3\u0010\u0005\"\u0004\b4\u0010\u0007\u00a8\u00065"}, d2 = {"Lcom/google/samples/apps/iosched/shared/data/prefs/PreferenceStorage;", "", "codelabsInfoShown", "", "getCodelabsInfoShown", "()Z", "setCodelabsInfoShown", "(Z)V", "myLocationOptedIn", "getMyLocationOptedIn", "setMyLocationOptedIn", "notificationsPreferenceShown", "getNotificationsPreferenceShown", "setNotificationsPreferenceShown", "observableSelectedTheme", "Lkotlinx/coroutines/flow/Flow;", "", "getObservableSelectedTheme", "()Lkotlinx/coroutines/flow/Flow;", "setObservableSelectedTheme", "(Lkotlinx/coroutines/flow/Flow;)V", "observableSnackbarIsStopped", "Landroidx/lifecycle/LiveData;", "getObservableSnackbarIsStopped", "()Landroidx/lifecycle/LiveData;", "setObservableSnackbarIsStopped", "(Landroidx/lifecycle/LiveData;)V", "onboardingCompleted", "getOnboardingCompleted", "setOnboardingCompleted", "preferConferenceTimeZone", "getPreferConferenceTimeZone", "setPreferConferenceTimeZone", "preferToReceiveNotifications", "getPreferToReceiveNotifications", "setPreferToReceiveNotifications", "scheduleUiHintsShown", "getScheduleUiHintsShown", "setScheduleUiHintsShown", "selectedFilters", "getSelectedFilters", "()Ljava/lang/String;", "setSelectedFilters", "(Ljava/lang/String;)V", "selectedTheme", "getSelectedTheme", "setSelectedTheme", "sendUsageStatistics", "getSendUsageStatistics", "setSendUsageStatistics", "snackbarIsStopped", "getSnackbarIsStopped", "setSnackbarIsStopped", "shared_staging"})
public abstract interface PreferenceStorage {
    
    public abstract boolean getOnboardingCompleted();
    
    public abstract void setOnboardingCompleted(boolean p0);
    
    public abstract boolean getScheduleUiHintsShown();
    
    public abstract void setScheduleUiHintsShown(boolean p0);
    
    public abstract boolean getNotificationsPreferenceShown();
    
    public abstract void setNotificationsPreferenceShown(boolean p0);
    
    public abstract boolean getPreferToReceiveNotifications();
    
    public abstract void setPreferToReceiveNotifications(boolean p0);
    
    public abstract boolean getMyLocationOptedIn();
    
    public abstract void setMyLocationOptedIn(boolean p0);
    
    public abstract boolean getSnackbarIsStopped();
    
    public abstract void setSnackbarIsStopped(boolean p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.lang.Boolean> getObservableSnackbarIsStopped();
    
    public abstract void setObservableSnackbarIsStopped(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.lang.Boolean> p0);
    
    public abstract boolean getSendUsageStatistics();
    
    public abstract void setSendUsageStatistics(boolean p0);
    
    public abstract boolean getPreferConferenceTimeZone();
    
    public abstract void setPreferConferenceTimeZone(boolean p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getSelectedFilters();
    
    public abstract void setSelectedFilters(@org.jetbrains.annotations.NotNull()
    java.lang.String p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getSelectedTheme();
    
    public abstract void setSelectedTheme(@org.jetbrains.annotations.NotNull()
    java.lang.String p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.lang.String> getObservableSelectedTheme();
    
    public abstract void setObservableSelectedTheme(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.Flow<java.lang.String> p0);
    
    public abstract boolean getCodelabsInfoShown();
    
    public abstract void setCodelabsInfoShown(boolean p0);
}