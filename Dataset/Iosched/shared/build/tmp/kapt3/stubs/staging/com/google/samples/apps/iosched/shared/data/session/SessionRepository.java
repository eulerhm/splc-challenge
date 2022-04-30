package com.google.samples.apps.iosched.shared.data.session;

import java.lang.System;

/**
 * Single point of access to session data for the presentation layer.
 *
 * The session data is loaded from the bootstrap file.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0014\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\bj\u0002`\tH&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H&\u00a8\u0006\u000b"}, d2 = {"Lcom/google/samples/apps/iosched/shared/data/session/SessionRepository;", "", "getConferenceDays", "", "Lcom/google/samples/apps/iosched/model/ConferenceDay;", "getSession", "Lcom/google/samples/apps/iosched/model/Session;", "eventId", "", "Lcom/google/samples/apps/iosched/model/SessionId;", "getSessions", "shared_staging"})
public abstract interface SessionRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.google.samples.apps.iosched.model.Session> getSessions();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.google.samples.apps.iosched.model.Session getSession(@org.jetbrains.annotations.NotNull()
    java.lang.String eventId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.google.samples.apps.iosched.model.ConferenceDay> getConferenceDays();
}