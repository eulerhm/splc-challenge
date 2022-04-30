package com.google.samples.apps.iosched.shared.domain.sessions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0002j\u0002`\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/google/samples/apps/iosched/shared/domain/sessions/LoadSessionUseCase;", "Lcom/google/samples/apps/iosched/shared/domain/MediatorUseCase;", "", "Lcom/google/samples/apps/iosched/model/Session;", "repository", "Lcom/google/samples/apps/iosched/shared/data/session/SessionRepository;", "(Lcom/google/samples/apps/iosched/shared/data/session/SessionRepository;)V", "execute", "", "parameters", "Lcom/google/samples/apps/iosched/model/SessionId;", "shared_staging"})
public class LoadSessionUseCase extends com.google.samples.apps.iosched.shared.domain.MediatorUseCase<java.lang.String, com.google.samples.apps.iosched.model.Session> {
    private final com.google.samples.apps.iosched.shared.data.session.SessionRepository repository = null;
    
    @java.lang.Override()
    public void execute(@org.jetbrains.annotations.NotNull()
    java.lang.String parameters) {
    }
    
    @javax.inject.Inject()
    public LoadSessionUseCase(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.data.session.SessionRepository repository) {
        super();
    }
}