package com.google.samples.apps.iosched.ui.sessiondetail;

import java.lang.System;

/**
 * Loads [Session] data and exposes it to the session detail view.
 */
@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00f8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\"\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004Bk\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0001\u0010\u001a\u001a\u00020\u001b\u00a2\u0006\u0002\u0010\u001cJ\u0011\u0010u\u001a\u00020(H\u0096A\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010vJ\u0011\u0010w\u001a\u00020(H\u0096A\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010vJ\u0010\u0010x\u001a\n\u0018\u00010 j\u0004\u0018\u0001`%H\u0002J\u000b\u0010y\u001a\u0004\u0018\u00010 H\u0096\u0001J\t\u0010z\u001a\u00020\u0019H\u0096\u0001J\t\u0010{\u001a\u00020\u0019H\u0096\u0001J#\u0010|\u001a\u00020(2\u0010\u0010}\u001a\f\u0012\b\u0012\u00060 j\u0002`%0~H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u007fJ\u0015\u0010\u0080\u0001\u001a\u00020(2\n\u0010a\u001a\u00060 j\u0002`%H\u0002J\u0010\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020\u001908H\u0096\u0001J\u0010\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020\u001908H\u0096\u0001J\t\u0010\u0083\u0001\u001a\u00020(H\u0016J\t\u0010\u0084\u0001\u001a\u00020(H\u0016J\u0007\u0010\u0085\u0001\u001a\u00020(J\t\u0010\u0086\u0001\u001a\u00020(H\u0016J\u0016\u0010\u0087\u0001\u001a\u00020(2\u000b\u0010\u0088\u0001\u001a\u00060 j\u0002`*H\u0016J\t\u0010\u0089\u0001\u001a\u00020(H\u0016J\u0012\u0010\u0089\u0001\u001a\u00020(2\u0007\u0010\u008a\u0001\u001a\u00020/H\u0016J\u0016\u0010\u008b\u0001\u001a\u00020(2\u000b\u0010\u008c\u0001\u001a\u00060 j\u0002`%H\u0016J\t\u0010\u008d\u0001\u001a\u00020(H\u0002J\u0018\u0010\u008e\u0001\u001a\u00020(2\u000f\u0010\u008f\u0001\u001a\n\u0018\u00010 j\u0004\u0018\u0001`%J\t\u0010\u0090\u0001\u001a\u00020\u0019H\u0002R\u001a\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u001f0\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010$\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060 j\u0002`%0\u001f0\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010&\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060 j\u0002`%0\u001f0\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u001f0\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010)\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060 j\u0002`*0\u001f0\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\u001f0\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0.0\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u00100\u001a\b\u0012\u0004\u0012\u0002010\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u00102\u001a\b\u0012\u0004\u0012\u00020\u00190\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002040\u001f0\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u00105\u001a\b\u0012\u0004\u0012\u0002060\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010908X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b:\u0010;R\u001a\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010=08X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b>\u0010;R\u001d\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f08\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010;R\u0017\u0010A\u001a\b\u0012\u0004\u0012\u00020\u001908\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010;R\u001d\u0010B\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u00190C\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010DR\u0011\u0010\u0018\u001a\u00020\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010ER\u0010\u0010F\u001a\u0004\u0018\u00010GX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010H\u001a\u0004\u0018\u00010GX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u001f088F\u00a2\u0006\u0006\u001a\u0004\bJ\u0010;R!\u0010K\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060 j\u0002`%0\u001f088F\u00a2\u0006\u0006\u001a\u0004\bL\u0010;R!\u0010M\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060 j\u0002`%0\u001f088F\u00a2\u0006\u0006\u001a\u0004\bN\u0010;R\u001d\u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u001f08\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u0010;R!\u0010Q\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060 j\u0002`*0\u001f088F\u00a2\u0006\u0006\u001a\u0004\bR\u0010;R\u001d\u0010S\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\u001f088F\u00a2\u0006\u0006\u001a\u0004\bT\u0010;R\u001d\u0010U\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\"\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u0010WR\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010X\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Y0\u001f0\"X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\bZ\u0010WR\u001d\u0010[\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0.088F\u00a2\u0006\u0006\u001a\u0004\b\\\u0010;R\u0014\u0010]\u001a\b\u0012\u0004\u0012\u00020^0\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010_\u001a\b\u0012\u0004\u0012\u00020108\u00a2\u0006\b\n\u0000\u001a\u0004\b`\u0010;R\u001c\u0010a\u001a\u0010\u0012\f\u0012\n\u0018\u00010 j\u0004\u0018\u0001`%0\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u001f08X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\bc\u0010;R\u0017\u0010d\u001a\b\u0012\u0004\u0012\u00020\u001908\u00a2\u0006\b\n\u0000\u001a\u0004\be\u0010;R\u0017\u0010f\u001a\b\u0012\u0004\u0012\u00020\u001908\u00a2\u0006\b\n\u0000\u001a\u0004\bg\u0010;R\u0014\u0010h\u001a\b\u0012\u0004\u0012\u00020\u001908X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010i\u001a\b\u0012\u0004\u0012\u00020\u001908X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\bj\u0010;R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010k\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002040\u001f08\u00a2\u0006\b\n\u0000\u001a\u0004\bl\u0010;R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010m\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020n0C\u00a2\u0006\b\n\u0000\u001a\u0004\bo\u0010DR\u0017\u0010p\u001a\b\u0012\u0004\u0012\u00020q08\u00a2\u0006\b\n\u0000\u001a\u0004\br\u0010;R\u0017\u0010s\u001a\b\u0012\u0004\u0012\u00020608\u00a2\u0006\b\n\u0000\u001a\u0004\bt\u0010;\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0091\u0001"}, d2 = {"Lcom/google/samples/apps/iosched/ui/sessiondetail/SessionDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/google/samples/apps/iosched/ui/sessiondetail/SessionDetailEventListener;", "Lcom/google/samples/apps/iosched/ui/sessioncommon/EventActions;", "Lcom/google/samples/apps/iosched/ui/signin/SignInViewModelDelegate;", "signInViewModelDelegate", "loadUserSessionUseCase", "Lcom/google/samples/apps/iosched/shared/domain/sessions/LoadUserSessionUseCase;", "loadRelatedSessionUseCase", "Lcom/google/samples/apps/iosched/shared/domain/sessions/LoadUserSessionsUseCase;", "starEventUseCase", "Lcom/google/samples/apps/iosched/shared/domain/users/StarEventAndNotifyUseCase;", "reservationActionUseCase", "Lcom/google/samples/apps/iosched/shared/domain/users/ReservationActionUseCase;", "getTimeZoneUseCase", "Lcom/google/samples/apps/iosched/shared/domain/settings/GetTimeZoneUseCase;", "snackbarMessageManager", "Lcom/google/samples/apps/iosched/ui/messages/SnackbarMessageManager;", "timeProvider", "Lcom/google/samples/apps/iosched/shared/time/TimeProvider;", "networkUtils", "Lcom/google/samples/apps/iosched/shared/util/NetworkUtils;", "analyticsHelper", "Lcom/google/samples/apps/iosched/shared/analytics/AnalyticsHelper;", "isReservationEnabledByRemoteConfig", "", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/google/samples/apps/iosched/ui/signin/SignInViewModelDelegate;Lcom/google/samples/apps/iosched/shared/domain/sessions/LoadUserSessionUseCase;Lcom/google/samples/apps/iosched/shared/domain/sessions/LoadUserSessionsUseCase;Lcom/google/samples/apps/iosched/shared/domain/users/StarEventAndNotifyUseCase;Lcom/google/samples/apps/iosched/shared/domain/users/ReservationActionUseCase;Lcom/google/samples/apps/iosched/shared/domain/settings/GetTimeZoneUseCase;Lcom/google/samples/apps/iosched/ui/messages/SnackbarMessageManager;Lcom/google/samples/apps/iosched/shared/time/TimeProvider;Lcom/google/samples/apps/iosched/shared/util/NetworkUtils;Lcom/google/samples/apps/iosched/shared/analytics/AnalyticsHelper;ZLkotlinx/coroutines/CoroutineDispatcher;)V", "_errorMessage", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/google/samples/apps/iosched/shared/result/Event;", "", "_navigateToRemoveReservationDialogAction", "Landroidx/lifecycle/MutableLiveData;", "Lcom/google/samples/apps/iosched/ui/reservation/RemoveReservationDialogParameters;", "_navigateToSessionAction", "Lcom/google/samples/apps/iosched/model/SessionId;", "_navigateToSessionFeedbackAction", "_navigateToSignInDialogAction", "", "_navigateToSpeakerDetail", "Lcom/google/samples/apps/iosched/model/SpeakerId;", "_navigateToSwapReservationDialogAction", "Lcom/google/samples/apps/iosched/shared/domain/users/SwapRequestParameters;", "_relatedUserSessions", "", "Lcom/google/samples/apps/iosched/model/userdata/UserSession;", "_session", "Lcom/google/samples/apps/iosched/model/Session;", "_shouldShowStarInBottomNav", "_snackBarMessage", "Lcom/google/samples/apps/iosched/ui/SnackbarMessage;", "_userEvent", "Lcom/google/samples/apps/iosched/model/userdata/UserEvent;", "currentUserImageUri", "Landroidx/lifecycle/LiveData;", "Landroid/net/Uri;", "getCurrentUserImageUri", "()Landroidx/lifecycle/LiveData;", "currentUserInfo", "Lcom/google/samples/apps/iosched/shared/data/signin/AuthenticatedUserInfo;", "getCurrentUserInfo", "errorMessage", "getErrorMessage", "isReservable", "isReservationDeniedByCutoff", "Lcom/google/samples/apps/iosched/shared/util/IntervalMediatorLiveData;", "()Lcom/google/samples/apps/iosched/shared/util/IntervalMediatorLiveData;", "()Z", "loadRelatedSessionJob", "Lkotlinx/coroutines/Job;", "loadUserSessionJob", "navigateToRemoveReservationDialogAction", "getNavigateToRemoveReservationDialogAction", "navigateToSessionAction", "getNavigateToSessionAction", "navigateToSessionFeedbackAction", "getNavigateToSessionFeedbackAction", "navigateToSignInDialogAction", "getNavigateToSignInDialogAction", "navigateToSpeakerDetail", "getNavigateToSpeakerDetail", "navigateToSwapReservationDialogAction", "getNavigateToSwapReservationDialogAction", "navigateToYouTubeAction", "getNavigateToYouTubeAction", "()Landroidx/lifecycle/MutableLiveData;", "performSignInEvent", "Lcom/google/samples/apps/iosched/ui/signin/SignInEvent;", "getPerformSignInEvent", "relatedUserSessions", "getRelatedUserSessions", "reservationActionResult", "Lcom/google/samples/apps/iosched/shared/domain/users/ReservationRequestAction;", "session", "getSession", "sessionId", "shouldShowNotificationsPrefAction", "getShouldShowNotificationsPrefAction", "shouldShowStarInBottomNav", "getShouldShowStarInBottomNav", "showFeedbackButton", "getShowFeedbackButton", "showInConferenceTimeZone", "showReservations", "getShowReservations", "snackBarMessage", "getSnackBarMessage", "timeUntilStart", "Lorg/threeten/bp/Duration;", "getTimeUntilStart", "timeZoneId", "Lorg/threeten/bp/ZoneId;", "getTimeZoneId", "userEvent", "getUserEvent", "emitSignInRequest", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emitSignOutRequest", "getSessionId", "getUserId", "isRegistered", "isSignedIn", "listenForRelatedSessions", "related", "", "(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "listenForUserSessionChanges", "observeRegisteredUser", "observeSignedInUser", "onFeedbackClicked", "onLoginClicked", "onPlayVideo", "onReservationClicked", "onSpeakerClicked", "speakerId", "onStarClicked", "userSession", "openEventDetail", "id", "refreshUserSession", "setSessionId", "newSessionId", "showStarInBottomNav", "mobile_staging"})
public final class SessionDetailViewModel extends androidx.lifecycle.ViewModel implements com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailEventListener, com.google.samples.apps.iosched.ui.sessioncommon.EventActions, com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate {
    private kotlinx.coroutines.Job loadUserSessionJob;
    private kotlinx.coroutines.Job loadRelatedSessionJob;
    private final androidx.lifecycle.MediatorLiveData<java.util.List<com.google.samples.apps.iosched.model.userdata.UserSession>> _relatedUserSessions = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.domain.users.ReservationRequestAction> reservationActionResult = null;
    private final androidx.lifecycle.MediatorLiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> _errorMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> errorMessage = null;
    private final androidx.lifecycle.MediatorLiveData<com.google.samples.apps.iosched.shared.result.Event<com.google.samples.apps.iosched.ui.SnackbarMessage>> _snackBarMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<com.google.samples.apps.iosched.ui.SnackbarMessage>> snackBarMessage = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Event<kotlin.Unit>> _navigateToSignInDialogAction = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<kotlin.Unit>> navigateToSignInDialogAction = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> navigateToYouTubeAction = null;
    private final androidx.lifecycle.MediatorLiveData<com.google.samples.apps.iosched.model.Session> _session = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.model.Session> session = null;
    private final androidx.lifecycle.MediatorLiveData<com.google.samples.apps.iosched.model.userdata.UserEvent> _userEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.model.userdata.UserEvent> userEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> showFeedbackButton = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.samples.apps.iosched.shared.util.IntervalMediatorLiveData<com.google.samples.apps.iosched.model.Session, org.threeten.bp.Duration> timeUntilStart = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.samples.apps.iosched.shared.util.IntervalMediatorLiveData<com.google.samples.apps.iosched.model.Session, java.lang.Boolean> isReservationDeniedByCutoff = null;
    private final androidx.lifecycle.MediatorLiveData<java.lang.Boolean> _shouldShowStarInBottomNav = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> shouldShowStarInBottomNav = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> sessionId = null;
    private final androidx.lifecycle.LiveData<java.lang.Boolean> showInConferenceTimeZone = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<org.threeten.bp.ZoneId> timeZoneId = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Event<com.google.samples.apps.iosched.ui.reservation.RemoveReservationDialogParameters>> _navigateToRemoveReservationDialogAction = null;
    private final androidx.lifecycle.MediatorLiveData<com.google.samples.apps.iosched.shared.result.Event<com.google.samples.apps.iosched.shared.domain.users.SwapRequestParameters>> _navigateToSwapReservationDialogAction = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> _navigateToSessionAction = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> _navigateToSpeakerDetail = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> _navigateToSessionFeedbackAction = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isReservable = null;
    private final com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate signInViewModelDelegate = null;
    private final com.google.samples.apps.iosched.shared.domain.sessions.LoadUserSessionUseCase loadUserSessionUseCase = null;
    private final com.google.samples.apps.iosched.shared.domain.sessions.LoadUserSessionsUseCase loadRelatedSessionUseCase = null;
    private final com.google.samples.apps.iosched.shared.domain.users.StarEventAndNotifyUseCase starEventUseCase = null;
    private final com.google.samples.apps.iosched.shared.domain.users.ReservationActionUseCase reservationActionUseCase = null;
    private final com.google.samples.apps.iosched.ui.messages.SnackbarMessageManager snackbarMessageManager = null;
    private final com.google.samples.apps.iosched.shared.util.NetworkUtils networkUtils = null;
    private final com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper analyticsHelper = null;
    private final boolean isReservationEnabledByRemoteConfig = false;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.google.samples.apps.iosched.model.userdata.UserSession>> getRelatedUserSessions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> getErrorMessage() {
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
    public final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> getNavigateToYouTubeAction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.model.Session> getSession() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.model.userdata.UserEvent> getUserEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getShowFeedbackButton() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.samples.apps.iosched.shared.util.IntervalMediatorLiveData<com.google.samples.apps.iosched.model.Session, org.threeten.bp.Duration> getTimeUntilStart() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.samples.apps.iosched.shared.util.IntervalMediatorLiveData<com.google.samples.apps.iosched.model.Session, java.lang.Boolean> isReservationDeniedByCutoff() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getShouldShowStarInBottomNav() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<org.threeten.bp.ZoneId> getTimeZoneId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<com.google.samples.apps.iosched.ui.reservation.RemoveReservationDialogParameters>> getNavigateToRemoveReservationDialogAction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<com.google.samples.apps.iosched.shared.domain.users.SwapRequestParameters>> getNavigateToSwapReservationDialogAction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> getNavigateToSessionAction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> getNavigateToSpeakerDetail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> getNavigateToSessionFeedbackAction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isReservable() {
        return null;
    }
    
    private final void refreshUserSession() {
    }
    
    private final void listenForUserSessionChanges(java.lang.String sessionId) {
    }
    
    public final void setSessionId(@org.jetbrains.annotations.Nullable()
    java.lang.String newSessionId) {
    }
    
    /**
     * Called by the UI when play button is clicked
     */
    public final void onPlayVideo() {
    }
    
    @java.lang.Override()
    public void onStarClicked() {
    }
    
    @java.lang.Override()
    public void onReservationClicked() {
    }
    
    @java.lang.Override()
    public void onLoginClicked() {
    }
    
    @java.lang.Override()
    public void openEventDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    @java.lang.Override()
    public void onStarClicked(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.model.userdata.UserSession userSession) {
    }
    
    @java.lang.Override()
    public void onSpeakerClicked(@org.jetbrains.annotations.NotNull()
    java.lang.String speakerId) {
    }
    
    @java.lang.Override()
    public void onFeedbackClicked() {
    }
    
    /**
     * Returns the current session ID or null if not available.
     */
    private final java.lang.String getSessionId() {
        return null;
    }
    
    private final boolean showStarInBottomNav() {
        return false;
    }
    
    public final boolean isReservationEnabledByRemoteConfig() {
        return false;
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public SessionDetailViewModel(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate signInViewModelDelegate, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.sessions.LoadUserSessionUseCase loadUserSessionUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.sessions.LoadUserSessionsUseCase loadRelatedSessionUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.users.StarEventAndNotifyUseCase starEventUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.users.ReservationActionUseCase reservationActionUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.settings.GetTimeZoneUseCase getTimeZoneUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.messages.SnackbarMessageManager snackbarMessageManager, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.time.TimeProvider timeProvider, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.util.NetworkUtils networkUtils, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper analyticsHelper, @com.google.samples.apps.iosched.shared.di.ReservationEnabledFlag()
    boolean isReservationEnabledByRemoteConfig, @org.jetbrains.annotations.NotNull()
    @com.google.samples.apps.iosched.shared.di.DefaultDispatcher()
    kotlinx.coroutines.CoroutineDispatcher defaultDispatcher) {
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