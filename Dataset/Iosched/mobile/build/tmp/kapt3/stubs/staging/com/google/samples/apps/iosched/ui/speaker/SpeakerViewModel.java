package com.google.samples.apps.iosched.ui.speaker;

import java.lang.System;

/**
 * Loads a [Speaker] and their sessions, handles event actions.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00a2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B7\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u0011\u0010=\u001a\u00020#H\u0096A\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010>J\u0011\u0010?\u001a\u00020#H\u0096A\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010>J\u000b\u0010@\u001a\u0004\u0018\u00010\u001fH\u0096\u0001J\t\u0010A\u001a\u00020\u0018H\u0096\u0001J\t\u0010B\u001a\u00020\u0018H\u0096\u0001J\u000f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00180\u0010H\u0096\u0001J\u000f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00180\u0010H\u0096\u0001J\u0010\u0010E\u001a\u00020#2\u0006\u0010F\u001a\u000207H\u0016J\u0015\u0010G\u001a\u00020#2\n\u0010H\u001a\u00060\u001fj\u0002` H\u0096\u0001J\u0012\u0010I\u001a\u00020#2\n\u0010H\u001a\u00060\u001fj\u0002`JR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0010X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0013R\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u001d\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u001fj\u0002` 0\u001e0\u0010X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b!\u0010\u0013R\u001e\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u001e0\u0010X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b$\u0010\u0013R\u001e\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\'0\u001e0&X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b(\u0010)R\u001e\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u001e0\u0010X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b+\u0010\u0013R\u0018\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00180\u0010X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b-\u0010\u0013R\u001e\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\u001e0\u0010X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b0\u0010\u0013R\u0019\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010\u0013R\u0014\u00104\u001a\b\u0012\u0004\u0012\u00020\u001f0&X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000207060\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010\u0013R\u001f\u00109\u001a\u0010\u0012\f\u0012\n ;*\u0004\u0018\u00010:0:0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006K"}, d2 = {"Lcom/google/samples/apps/iosched/ui/speaker/SpeakerViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/google/samples/apps/iosched/ui/signin/SignInViewModelDelegate;", "Lcom/google/samples/apps/iosched/ui/sessioncommon/EventActionsViewModelDelegate;", "loadSpeakerUseCase", "Lcom/google/samples/apps/iosched/shared/domain/speakers/LoadSpeakerUseCase;", "loadSpeakerSessionsUseCase", "Lcom/google/samples/apps/iosched/shared/domain/sessions/LoadUserSessionsUseCase;", "getTimeZoneUseCase", "Lcom/google/samples/apps/iosched/shared/domain/settings/GetTimeZoneUseCase;", "signInViewModelDelegate", "eventActionsViewModelDelegate", "analyticsHelper", "Lcom/google/samples/apps/iosched/shared/analytics/AnalyticsHelper;", "(Lcom/google/samples/apps/iosched/shared/domain/speakers/LoadSpeakerUseCase;Lcom/google/samples/apps/iosched/shared/domain/sessions/LoadUserSessionsUseCase;Lcom/google/samples/apps/iosched/shared/domain/settings/GetTimeZoneUseCase;Lcom/google/samples/apps/iosched/ui/signin/SignInViewModelDelegate;Lcom/google/samples/apps/iosched/ui/sessioncommon/EventActionsViewModelDelegate;Lcom/google/samples/apps/iosched/shared/analytics/AnalyticsHelper;)V", "currentUserImageUri", "Landroidx/lifecycle/LiveData;", "Landroid/net/Uri;", "getCurrentUserImageUri", "()Landroidx/lifecycle/LiveData;", "currentUserInfo", "Lcom/google/samples/apps/iosched/shared/data/signin/AuthenticatedUserInfo;", "getCurrentUserInfo", "hasNoProfileImage", "", "getHasNoProfileImage", "loadSpeakerUseCaseResult", "Lcom/google/samples/apps/iosched/shared/result/Result;", "Lcom/google/samples/apps/iosched/shared/domain/speakers/LoadSpeakerUseCaseResult;", "navigateToEventAction", "Lcom/google/samples/apps/iosched/shared/result/Event;", "", "Lcom/google/samples/apps/iosched/model/SessionId;", "getNavigateToEventAction", "navigateToSignInDialogAction", "", "getNavigateToSignInDialogAction", "performSignInEvent", "Landroidx/lifecycle/MutableLiveData;", "Lcom/google/samples/apps/iosched/ui/signin/SignInEvent;", "getPerformSignInEvent", "()Landroidx/lifecycle/MutableLiveData;", "shouldShowNotificationsPrefAction", "getShouldShowNotificationsPrefAction", "showReservations", "getShowReservations", "snackBarMessage", "Lcom/google/samples/apps/iosched/ui/SnackbarMessage;", "getSnackBarMessage", "speaker", "Lcom/google/samples/apps/iosched/model/Speaker;", "getSpeaker", "speakerId", "speakerUserSessions", "", "Lcom/google/samples/apps/iosched/model/userdata/UserSession;", "getSpeakerUserSessions", "timeZoneId", "Lorg/threeten/bp/ZoneId;", "kotlin.jvm.PlatformType", "getTimeZoneId", "emitSignInRequest", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emitSignOutRequest", "getUserId", "isRegistered", "isSignedIn", "observeRegisteredUser", "observeSignedInUser", "onStarClicked", "userSession", "openEventDetail", "id", "setSpeakerId", "Lcom/google/samples/apps/iosched/model/SpeakerId;", "mobile_staging"})
public final class SpeakerViewModel extends androidx.lifecycle.ViewModel implements com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate, com.google.samples.apps.iosched.ui.sessioncommon.EventActionsViewModelDelegate {
    private final androidx.lifecycle.MutableLiveData<java.lang.String> speakerId = null;
    private final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Result<com.google.samples.apps.iosched.shared.domain.speakers.LoadSpeakerUseCaseResult>> loadSpeakerUseCaseResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.google.samples.apps.iosched.model.userdata.UserSession>> speakerUserSessions = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.model.Speaker> speaker = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> hasNoProfileImage = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<org.threeten.bp.ZoneId> timeZoneId = null;
    private final com.google.samples.apps.iosched.shared.domain.speakers.LoadSpeakerUseCase loadSpeakerUseCase = null;
    private final com.google.samples.apps.iosched.shared.domain.sessions.LoadUserSessionsUseCase loadSpeakerSessionsUseCase = null;
    private final com.google.samples.apps.iosched.ui.sessioncommon.EventActionsViewModelDelegate eventActionsViewModelDelegate = null;
    private final com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper analyticsHelper = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.google.samples.apps.iosched.model.userdata.UserSession>> getSpeakerUserSessions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.model.Speaker> getSpeaker() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getHasNoProfileImage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<org.threeten.bp.ZoneId> getTimeZoneId() {
        return null;
    }
    
    /**
     * Provides the speaker ID which initiates all data loading.
     */
    public final void setSpeakerId(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    @java.lang.Override()
    public void onStarClicked(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.model.userdata.UserSession userSession) {
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public SpeakerViewModel(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.speakers.LoadSpeakerUseCase loadSpeakerUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.sessions.LoadUserSessionsUseCase loadSpeakerSessionsUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.settings.GetTimeZoneUseCase getTimeZoneUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate signInViewModelDelegate, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.sessioncommon.EventActionsViewModelDelegate eventActionsViewModelDelegate, @org.jetbrains.annotations.NotNull()
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
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> getNavigateToEventAction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<kotlin.Unit>> getNavigateToSignInDialogAction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<com.google.samples.apps.iosched.ui.SnackbarMessage>> getSnackBarMessage() {
        return null;
    }
    
    @java.lang.Override()
    public void openEventDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
}