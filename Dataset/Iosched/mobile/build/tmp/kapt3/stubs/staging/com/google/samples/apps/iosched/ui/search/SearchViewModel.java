package com.google.samples.apps.iosched.ui.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00b6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B7\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u000fJ\t\u0010Q\u001a\u00020RH\u0096\u0001J\b\u0010S\u001a\u00020RH\u0002J\u0011\u0010T\u001a\u00020RH\u0096A\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010UJ\u0011\u0010V\u001a\u00020RH\u0096A\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010UJ\b\u0010W\u001a\u00020RH\u0002J\u000b\u0010X\u001a\u0004\u0018\u00010\u0016H\u0096\u0001J\t\u0010Y\u001a\u00020\u0012H\u0096\u0001J\t\u0010Z\u001a\u00020\u0012H\u0096\u0001J\u000f\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00120!H\u0096\u0001J\u000f\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00120!H\u0096\u0001J\b\u0010]\u001a\u00020RH\u0014J\u000e\u0010^\u001a\u00020R2\u0006\u0010_\u001a\u00020\u0016J\u0010\u0010`\u001a\u00020R2\u0006\u0010a\u001a\u00020\u001dH\u0016J\u0014\u0010b\u001a\u00020R2\n\u0010c\u001a\u00060\u0016j\u0002`\u0018H\u0016J\u001c\u0010d\u001a\u00020R2\u0012\u0010e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0fH\u0002J\u0017\u0010g\u001a\u00020R2\f\u0010h\u001a\b\u0012\u0004\u0012\u00020D0\u001cH\u0096\u0001J\u0019\u0010i\u001a\u00020R2\u0006\u0010j\u001a\u00020D2\u0006\u0010k\u001a\u00020\u0012H\u0096\u0001R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0016j\u0002`\u00180\u00150\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0016j\u0002`\u001a0\u00150\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0!X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b#\u0010$R\u001a\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0!X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\'\u0010$R\u0016\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0)X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u001c0!X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b,\u0010$R\u0018\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00120!X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b.\u0010$R\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00120!\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010$R\u001d\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150!\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010$R!\u00102\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0016j\u0002`\u00180\u00150!\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010$R!\u00104\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0016j\u0002`\u001a0\u00150!\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010$R\u001e\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002070\u00150\u0014X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b8\u00109R\u0018\u0010:\u001a\b\u0012\u0004\u0012\u00020;0\u0014X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b<\u00109R\u0010\u0010=\u001a\u0004\u0018\u00010>X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0!\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010$R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u001c0!X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\bB\u0010$R\u001e\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020D0\u001c0!X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\bE\u0010$R\u001a\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020D0\u001c0)X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00150!X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\bH\u0010$R\u0018\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00120!X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\bJ\u0010$R\"\u0010K\u001a\u0010\u0012\f\u0012\n L*\u0004\u0018\u00010\u00120\u00120\u0014X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u00109R\u000e\u0010N\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010O\u001a\b\u0012\u0004\u0012\u00020\u001f0!8F\u00a2\u0006\u0006\u001a\u0004\bP\u0010$\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006l"}, d2 = {"Lcom/google/samples/apps/iosched/ui/search/SearchViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/google/samples/apps/iosched/ui/sessioncommon/EventActions;", "Lcom/google/samples/apps/iosched/ui/signin/SignInViewModelDelegate;", "Lcom/google/samples/apps/iosched/ui/filters/FiltersViewModelDelegate;", "analyticsHelper", "Lcom/google/samples/apps/iosched/shared/analytics/AnalyticsHelper;", "searchUseCase", "Lcom/google/samples/apps/iosched/shared/domain/search/SessionSearchUseCase;", "getTimeZoneUseCase", "Lcom/google/samples/apps/iosched/shared/domain/settings/GetTimeZoneUseCase;", "loadFiltersUseCase", "Lcom/google/samples/apps/iosched/shared/domain/search/LoadSearchFiltersUseCase;", "signInViewModelDelegate", "filtersViewModelDelegate", "(Lcom/google/samples/apps/iosched/shared/analytics/AnalyticsHelper;Lcom/google/samples/apps/iosched/shared/domain/search/SessionSearchUseCase;Lcom/google/samples/apps/iosched/shared/domain/settings/GetTimeZoneUseCase;Lcom/google/samples/apps/iosched/shared/domain/search/LoadSearchFiltersUseCase;Lcom/google/samples/apps/iosched/ui/signin/SignInViewModelDelegate;Lcom/google/samples/apps/iosched/ui/filters/FiltersViewModelDelegate;)V", "_isEmpty", "Landroidx/lifecycle/MediatorLiveData;", "", "_navigateToCodelabAction", "Landroidx/lifecycle/MutableLiveData;", "Lcom/google/samples/apps/iosched/shared/result/Event;", "", "_navigateToSessionAction", "Lcom/google/samples/apps/iosched/model/SessionId;", "_navigateToSpeakerAction", "Lcom/google/samples/apps/iosched/model/SpeakerId;", "_searchResults", "", "Lcom/google/samples/apps/iosched/model/userdata/UserSession;", "_timeZoneId", "Lorg/threeten/bp/ZoneId;", "currentUserImageUri", "Landroidx/lifecycle/LiveData;", "Landroid/net/Uri;", "getCurrentUserImageUri", "()Landroidx/lifecycle/LiveData;", "currentUserInfo", "Lcom/google/samples/apps/iosched/shared/data/signin/AuthenticatedUserInfo;", "getCurrentUserInfo", "currentUserObserver", "Landroidx/lifecycle/Observer;", "filterChips", "Lcom/google/samples/apps/iosched/ui/filters/FilterChip;", "getFilterChips", "hasAnyFilters", "getHasAnyFilters", "isEmpty", "navigateToCodelabAction", "getNavigateToCodelabAction", "navigateToSessionAction", "getNavigateToSessionAction", "navigateToSpeakerAction", "getNavigateToSpeakerAction", "performSignInEvent", "Lcom/google/samples/apps/iosched/ui/signin/SignInEvent;", "getPerformSignInEvent", "()Landroidx/lifecycle/MutableLiveData;", "resultCount", "", "getResultCount", "searchJob", "Lkotlinx/coroutines/Job;", "searchResults", "getSearchResults", "selectedFilterChips", "getSelectedFilterChips", "selectedFilters", "Lcom/google/samples/apps/iosched/model/filters/Filter;", "getSelectedFilters", "selectedFiltersObserver", "shouldShowNotificationsPrefAction", "getShouldShowNotificationsPrefAction", "showReservations", "getShowReservations", "showResultCount", "kotlin.jvm.PlatformType", "getShowResultCount", "textQuery", "timeZoneId", "getTimeZoneId", "clearFilters", "", "clearSearchResults", "emitSignInRequest", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emitSignOutRequest", "executeSearch", "getUserId", "isRegistered", "isSignedIn", "observeRegisteredUser", "observeSignedInUser", "onCleared", "onSearchQueryChanged", "query", "onStarClicked", "userSession", "openEventDetail", "id", "processSearchResult", "searchResult", "Lcom/google/samples/apps/iosched/shared/result/Result;", "setSupportedFilters", "filters", "toggleFilter", "filter", "enabled", "mobile_staging"})
public final class SearchViewModel extends androidx.lifecycle.ViewModel implements com.google.samples.apps.iosched.ui.sessioncommon.EventActions, com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate, com.google.samples.apps.iosched.ui.filters.FiltersViewModelDelegate {
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> _navigateToSessionAction = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> navigateToSessionAction = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> _navigateToSpeakerAction = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> navigateToSpeakerAction = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> _navigateToCodelabAction = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> navigateToCodelabAction = null;
    private final androidx.lifecycle.MediatorLiveData<java.util.List<com.google.samples.apps.iosched.model.userdata.UserSession>> _searchResults = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.google.samples.apps.iosched.model.userdata.UserSession>> searchResults = null;
    private final androidx.lifecycle.MediatorLiveData<java.lang.Boolean> _isEmpty = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isEmpty = null;
    private kotlinx.coroutines.Job searchJob;
    private final androidx.lifecycle.MutableLiveData<org.threeten.bp.ZoneId> _timeZoneId = null;
    private java.lang.String textQuery = "";
    private final androidx.lifecycle.Observer<java.util.List<com.google.samples.apps.iosched.model.filters.Filter>> selectedFiltersObserver = null;
    private final androidx.lifecycle.Observer<com.google.samples.apps.iosched.shared.data.signin.AuthenticatedUserInfo> currentUserObserver = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> showResultCount = null;
    private final com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper analyticsHelper = null;
    private final com.google.samples.apps.iosched.shared.domain.search.SessionSearchUseCase searchUseCase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> getNavigateToSessionAction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> getNavigateToSpeakerAction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> getNavigateToCodelabAction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.google.samples.apps.iosched.model.userdata.UserSession>> getSearchResults() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isEmpty() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<org.threeten.bp.ZoneId> getTimeZoneId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowResultCount() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public final void onSearchQueryChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    private final void executeSearch() {
    }
    
    private final void clearSearchResults() {
    }
    
    private final void processSearchResult(com.google.samples.apps.iosched.shared.result.Result<? extends java.util.List<com.google.samples.apps.iosched.model.userdata.UserSession>> searchResult) {
    }
    
    @java.lang.Override()
    public void openEventDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    @java.lang.Override()
    public void onStarClicked(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.model.userdata.UserSession userSession) {
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public SearchViewModel(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper analyticsHelper, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.search.SessionSearchUseCase searchUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.settings.GetTimeZoneUseCase getTimeZoneUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.search.LoadSearchFiltersUseCase loadFiltersUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate signInViewModelDelegate, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.filters.FiltersViewModelDelegate filtersViewModelDelegate) {
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
    
    /**
     * The full list of filter chips.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.google.samples.apps.iosched.ui.filters.FilterChip>> getFilterChips() {
        return null;
    }
    
    /**
     * True if there are any selected filters.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.lang.Boolean> getHasAnyFilters() {
        return null;
    }
    
    /**
     * Number of results from applying filters. Can be set by implementers.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.MutableLiveData<java.lang.Integer> getResultCount() {
        return null;
    }
    
    /**
     * The list of selected filter chips.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.google.samples.apps.iosched.ui.filters.FilterChip>> getSelectedFilterChips() {
        return null;
    }
    
    /**
     * The list of selected filters.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.google.samples.apps.iosched.model.filters.Filter>> getSelectedFilters() {
        return null;
    }
    
    /**
     * Clear all selected filters.
     */
    @java.lang.Override()
    public void clearFilters() {
    }
    
    /**
     * Set the list of filters.
     */
    @java.lang.Override()
    public void setSupportedFilters(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.google.samples.apps.iosched.model.filters.Filter> filters) {
    }
    
    /**
     * Set the selected state of the filter. Must be one of the supported filters.
     */
    @java.lang.Override()
    public void toggleFilter(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.model.filters.Filter filter, boolean enabled) {
    }
}