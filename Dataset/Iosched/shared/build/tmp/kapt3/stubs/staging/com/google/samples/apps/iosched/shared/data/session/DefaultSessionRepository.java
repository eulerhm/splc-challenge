package com.google.samples.apps.iosched.shared.data.session;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0014\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u00060\u000bj\u0002`\fH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/google/samples/apps/iosched/shared/data/session/DefaultSessionRepository;", "Lcom/google/samples/apps/iosched/shared/data/session/SessionRepository;", "conferenceDataRepository", "Lcom/google/samples/apps/iosched/shared/data/ConferenceDataRepository;", "(Lcom/google/samples/apps/iosched/shared/data/ConferenceDataRepository;)V", "getConferenceDays", "", "Lcom/google/samples/apps/iosched/model/ConferenceDay;", "getSession", "Lcom/google/samples/apps/iosched/model/Session;", "eventId", "", "Lcom/google/samples/apps/iosched/model/SessionId;", "getSessions", "shared_staging"})
public final class DefaultSessionRepository implements com.google.samples.apps.iosched.shared.data.session.SessionRepository {
    private final com.google.samples.apps.iosched.shared.data.ConferenceDataRepository conferenceDataRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.google.samples.apps.iosched.model.Session> getSessions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.google.samples.apps.iosched.model.Session getSession(@org.jetbrains.annotations.NotNull()
    java.lang.String eventId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.google.samples.apps.iosched.model.ConferenceDay> getConferenceDays() {
        return null;
    }
    
    @javax.inject.Inject()
    public DefaultSessionRepository(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.data.ConferenceDataRepository conferenceDataRepository) {
        super();
    }
}