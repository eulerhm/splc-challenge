package com.google.samples.apps.iosched.ui.schedule;

import java.lang.System;

/**
 * Loads data and exposes it to the view.
 * By annotating the constructor with [@Inject], Dagger will use that constructor when needing to
 * create the object, so defining a [@Provides] method for this class won't be needed.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00da\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BW\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u00a2\u0006\u0002\u0010\u0017J\u0011\u0010]\u001a\u00020\u001fH\u0096A\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010^J\u0011\u0010_\u001a\u00020\u001fH\u0096A\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010^J\u000b\u0010`\u001a\u0004\u0018\u00010\u001bH\u0096\u0001J\t\u0010a\u001a\u000205H\u0096\u0001J\t\u0010b\u001a\u000205H\u0096\u0001J\u000f\u0010c\u001a\b\u0012\u0004\u0012\u0002050&H\u0096\u0001J\u000f\u0010d\u001a\b\u0012\u0004\u0012\u0002050&H\u0096\u0001J\u0010\u0010e\u001a\u00020\u001f2\u0006\u0010f\u001a\u00020gH\u0016J\u0006\u0010h\u001a\u00020\u001fJ\u0014\u0010i\u001a\u00020\u001f2\n\u0010j\u001a\u00060\u001bj\u0002`kH\u0016J\b\u0010l\u001a\u00020\u001fH\u0002J\u000e\u0010m\u001a\u00020\u001f2\u0006\u0010n\u001a\u00020oJ\u0006\u0010p\u001a\u00020\u001fJ\u0006\u0010q\u001a\u00020\u001fR\u001a\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001a0\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001a0\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u001a0\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u001a0\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\'0&X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0&X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b+\u0010,R\u001a\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0&X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b/\u0010,R\u000e\u00100\u001a\u000201X\u0082.\u00a2\u0006\u0002\n\u0000R\u001d\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0&\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010,R\u0017\u00104\u001a\b\u0012\u0004\u0012\u0002050&\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010,R\u0017\u00106\u001a\b\u0012\u0004\u0012\u0002050&\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010,R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002080\'0&X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0&8F\u00a2\u0006\u0006\u001a\u0004\b:\u0010,R\u001d\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001a0&8F\u00a2\u0006\u0006\u001a\u0004\b<\u0010,R\u001d\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001a0&8F\u00a2\u0006\u0006\u001a\u0004\b>\u0010,R\u001e\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0\u001a0\u001dX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\bA\u0010BR\u001a\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\'0&X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010D\u001a\b\u0012\u0004\u0012\u00020E0&\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u0010,R\u001d\u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\u001a0&\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u0010,R\u001d\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u001a0&\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010,R\u001e\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\u001a0&X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\bL\u0010,R\u0018\u0010M\u001a\b\u0012\u0004\u0012\u0002050&X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\bN\u0010,R\u001d\u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u001a0&\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u0010,R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010Q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\'0\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010R\u001a\b\u0012\u0004\u0012\u0002050&\u00a2\u0006\b\n\u0000\u001a\u0004\bS\u0010,R\u0017\u0010T\u001a\b\u0012\u0004\u0012\u00020U0&\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u0010,R\u001a\u0010W\u001a\u000205X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u0014\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006r"}, d2 = {"Lcom/google/samples/apps/iosched/ui/schedule/ScheduleViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/google/samples/apps/iosched/ui/sessioncommon/EventActions;", "Lcom/google/samples/apps/iosched/ui/signin/SignInViewModelDelegate;", "loadScheduleUserSessionsUseCase", "Lcom/google/samples/apps/iosched/shared/domain/sessions/LoadScheduleUserSessionsUseCase;", "signInViewModelDelegate", "starEventUseCase", "Lcom/google/samples/apps/iosched/shared/domain/users/StarEventAndNotifyUseCase;", "scheduleUiHintsShownUseCase", "Lcom/google/samples/apps/iosched/shared/domain/prefs/ScheduleUiHintsShownUseCase;", "topicSubscriber", "Lcom/google/samples/apps/iosched/shared/fcm/TopicSubscriber;", "snackbarMessageManager", "Lcom/google/samples/apps/iosched/ui/messages/SnackbarMessageManager;", "getTimeZoneUseCase", "Lcom/google/samples/apps/iosched/shared/domain/settings/GetTimeZoneUseCase;", "refreshConferenceDataUseCase", "Lcom/google/samples/apps/iosched/shared/domain/RefreshConferenceDataUseCase;", "observeConferenceDataUseCase", "Lcom/google/samples/apps/iosched/shared/domain/sessions/ObserveConferenceDataUseCase;", "analyticsHelper", "Lcom/google/samples/apps/iosched/shared/analytics/AnalyticsHelper;", "(Lcom/google/samples/apps/iosched/shared/domain/sessions/LoadScheduleUserSessionsUseCase;Lcom/google/samples/apps/iosched/ui/signin/SignInViewModelDelegate;Lcom/google/samples/apps/iosched/shared/domain/users/StarEventAndNotifyUseCase;Lcom/google/samples/apps/iosched/shared/domain/prefs/ScheduleUiHintsShownUseCase;Lcom/google/samples/apps/iosched/shared/fcm/TopicSubscriber;Lcom/google/samples/apps/iosched/ui/messages/SnackbarMessageManager;Lcom/google/samples/apps/iosched/shared/domain/settings/GetTimeZoneUseCase;Lcom/google/samples/apps/iosched/shared/domain/RefreshConferenceDataUseCase;Lcom/google/samples/apps/iosched/shared/domain/sessions/ObserveConferenceDataUseCase;Lcom/google/samples/apps/iosched/shared/analytics/AnalyticsHelper;)V", "_errorMessage", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/google/samples/apps/iosched/shared/result/Event;", "", "_navigateToSessionAction", "Landroidx/lifecycle/MutableLiveData;", "_navigateToSignInDialogAction", "", "_navigateToSignOutDialogAction", "_scrollToEvent", "Lcom/google/samples/apps/iosched/ui/schedule/ScheduleScrollEvent;", "_snackBarMessage", "Lcom/google/samples/apps/iosched/ui/SnackbarMessage;", "conferenceDataAvailable", "Landroidx/lifecycle/LiveData;", "Lcom/google/samples/apps/iosched/shared/result/Result;", "", "currentUserImageUri", "Landroid/net/Uri;", "getCurrentUserImageUri", "()Landroidx/lifecycle/LiveData;", "currentUserInfo", "Lcom/google/samples/apps/iosched/shared/data/signin/AuthenticatedUserInfo;", "getCurrentUserInfo", "dayIndexer", "Lcom/google/samples/apps/iosched/shared/domain/sessions/ConferenceDayIndexer;", "errorMessage", "getErrorMessage", "isConferenceTimeZone", "", "isLoading", "loadSessionsResult", "Lcom/google/samples/apps/iosched/shared/domain/sessions/LoadScheduleUserSessionsResult;", "navigateToSessionAction", "getNavigateToSessionAction", "navigateToSignInDialogAction", "getNavigateToSignInDialogAction", "navigateToSignOutDialogAction", "getNavigateToSignOutDialogAction", "performSignInEvent", "Lcom/google/samples/apps/iosched/ui/signin/SignInEvent;", "getPerformSignInEvent", "()Landroidx/lifecycle/MutableLiveData;", "preferConferenceTimeZoneResult", "scheduleUiData", "Lcom/google/samples/apps/iosched/ui/schedule/ScheduleUiData;", "getScheduleUiData", "scheduleUiHintsShown", "getScheduleUiHintsShown", "scrollToEvent", "getScrollToEvent", "shouldShowNotificationsPrefAction", "getShouldShowNotificationsPrefAction", "showReservations", "getShowReservations", "snackBarMessage", "getSnackBarMessage", "swipeRefreshResult", "swipeRefreshing", "getSwipeRefreshing", "timeZoneId", "Lorg/threeten/bp/ZoneId;", "getTimeZoneId", "userHasInteracted", "getUserHasInteracted", "()Z", "setUserHasInteracted", "(Z)V", "userSessionsNeedRefresh", "emitSignInRequest", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emitSignOutRequest", "getUserId", "isRegistered", "isSignedIn", "observeRegisteredUser", "observeSignedInUser", "onStarClicked", "userSession", "Lcom/google/samples/apps/iosched/model/userdata/UserSession;", "onSwipeRefresh", "openEventDetail", "id", "Lcom/google/samples/apps/iosched/model/SessionId;", "refreshUserSessions", "scrollToStartOfDay", "day", "Lcom/google/samples/apps/iosched/model/ConferenceDay;", "showAllEvents", "showMySchedule", "mobile_staging"})
public final class ScheduleViewModel extends androidx.lifecycle.ViewModel implements com.google.samples.apps.iosched.ui.sessioncommon.EventActions, com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate {
    private final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Result<java.lang.Boolean>> preferConferenceTimeZoneResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<org.threeten.bp.ZoneId> timeZoneId = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isConferenceTimeZone = null;
    private com.google.samples.apps.iosched.shared.domain.sessions.ConferenceDayIndexer dayIndexer;
    private final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Result<java.lang.Long>> conferenceDataAvailable = null;
    private final androidx.lifecycle.MediatorLiveData<kotlin.Unit> userSessionsNeedRefresh = null;
    private final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Result<com.google.samples.apps.iosched.shared.domain.sessions.LoadScheduleUserSessionsResult>> loadSessionsResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isLoading = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.ui.schedule.ScheduleUiData> scheduleUiData = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Result<java.lang.Boolean>> swipeRefreshResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> swipeRefreshing = null;
    
    /**
     * LiveData for Actions and Events
     */
    private final androidx.lifecycle.MediatorLiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> _errorMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> errorMessage = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> _navigateToSessionAction = null;
    private final androidx.lifecycle.MediatorLiveData<com.google.samples.apps.iosched.shared.result.Event<com.google.samples.apps.iosched.ui.SnackbarMessage>> _snackBarMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<com.google.samples.apps.iosched.ui.SnackbarMessage>> snackBarMessage = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Event<kotlin.Unit>> _navigateToSignInDialogAction = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Event<kotlin.Unit>> _navigateToSignOutDialogAction = null;
    
    /**
     * Indicates if the UI hints for the schedule have been shown
     */
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.Boolean>> scheduleUiHintsShown = null;
    private boolean userHasInteracted = false;
    private final androidx.lifecycle.MediatorLiveData<com.google.samples.apps.iosched.shared.result.Event<com.google.samples.apps.iosched.ui.schedule.ScheduleScrollEvent>> _scrollToEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<com.google.samples.apps.iosched.ui.schedule.ScheduleScrollEvent>> scrollToEvent = null;
    private final com.google.samples.apps.iosched.shared.domain.sessions.LoadScheduleUserSessionsUseCase loadScheduleUserSessionsUseCase = null;
    private final com.google.samples.apps.iosched.shared.domain.users.StarEventAndNotifyUseCase starEventUseCase = null;
    private final com.google.samples.apps.iosched.ui.messages.SnackbarMessageManager snackbarMessageManager = null;
    private final com.google.samples.apps.iosched.shared.domain.RefreshConferenceDataUseCase refreshConferenceDataUseCase = null;
    private final com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper analyticsHelper = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<org.threeten.bp.ZoneId> getTimeZoneId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isConferenceTimeZone() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.ui.schedule.ScheduleUiData> getScheduleUiData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getSwipeRefreshing() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> getErrorMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> getNavigateToSessionAction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<com.google.samples.apps.iosched.ui.SnackbarMessage>> getSnackBarMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<kotlin.Unit>> getNavigateToSignInDialogAction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<kotlin.Unit>> getNavigateToSignOutDialogAction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.Boolean>> getScheduleUiHintsShown() {
        return null;
    }
    
    public final boolean getUserHasInteracted() {
        return false;
    }
    
    public final void setUserHasInteracted(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<com.google.samples.apps.iosched.ui.schedule.ScheduleScrollEvent>> getScrollToEvent() {
        return null;
    }
    
    public final void showMySchedule() {
    }
    
    public final void showAllEvents() {
    }
    
    @java.lang.Override()
    public void openEventDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    public final void onSwipeRefresh() {
    }
    
    private final void refreshUserSessions() {
    }
    
    @java.lang.Override()
    public void onStarClicked(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.model.userdata.UserSession userSession) {
    }
    
    public final void scrollToStartOfDay(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.model.ConferenceDay day) {
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public ScheduleViewModel(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.sessions.LoadScheduleUserSessionsUseCase loadScheduleUserSessionsUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate signInViewModelDelegate, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.users.StarEventAndNotifyUseCase starEventUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.prefs.ScheduleUiHintsShownUseCase scheduleUiHintsShownUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.fcm.TopicSubscriber topicSubscriber, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.messages.SnackbarMessageManager snackbarMessageManager, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.settings.GetTimeZoneUseCase getTimeZoneUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.RefreshConferenceDataUseCase refreshConferenceDataUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.sessions.ObserveConferenceDataUseCase observeConferenceDataUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper analyticsHelper) {
        super();
    }
    
    /**
     * Live updated value of the current firebase users image url
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<android.net.Uri> getCurrentUserImageUri() {
        return null;
    }
    
    /**
     * Live updated value of the current firebase user
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.data.signin.AuthenticatedUserInfo> getCurrentUserInfo() {
        return null;
    }
    
    /**
     * Emits Events when a sign-in event should be attempted
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Event<com.google.samples.apps.iosched.ui.signin.SignInEvent>> getPerformSignInEvent() {
        return null;
    }
    
    /**
     * Emits an non-null Event when the dialog to ask the user notifications preference should be
     * shown.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.Boolean>> getShouldShowNotificationsPrefAction() {
        return null;
    }
    
    /**
     * Emits whether or not to show reservations for the current user
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.lang.Boolean> getShowReservations() {
        return null;
    }
    
    /**
     * Emit an Event on performSignInEvent to request sign-in
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object emitSignInRequest(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    /**
     * Emit an Event on performSignInEvent to request sign-out
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object emitSignOutRequest(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    /**
     * Returns the current user ID or null if not available.
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getUserId() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isRegistered() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isSignedIn() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.lang.Boolean> observeRegisteredUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.lang.Boolean> observeSignedInUser() {
        return null;
    }
}