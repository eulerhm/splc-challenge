package com.google.samples.apps.iosched.shared.domain.feed;

import java.lang.System;

/**
 * Loads all feed items into a list.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/google/samples/apps/iosched/shared/domain/feed/LoadAnnouncementsUseCase;", "Lcom/google/samples/apps/iosched/shared/domain/UseCase;", "Lorg/threeten/bp/Instant;", "", "Lcom/google/samples/apps/iosched/model/Announcement;", "repository", "Lcom/google/samples/apps/iosched/shared/data/feed/FeedRepository;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/google/samples/apps/iosched/shared/data/feed/FeedRepository;Lkotlinx/coroutines/CoroutineDispatcher;)V", "execute", "parameters", "(Lorg/threeten/bp/Instant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shared_staging"})
public class LoadAnnouncementsUseCase extends com.google.samples.apps.iosched.shared.domain.UseCase<org.threeten.bp.Instant, java.util.List<? extends com.google.samples.apps.iosched.model.Announcement>> {
    private final com.google.samples.apps.iosched.shared.data.feed.FeedRepository repository = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected java.lang.Object execute(@org.jetbrains.annotations.NotNull()
    org.threeten.bp.Instant p0, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.google.samples.apps.iosched.model.Announcement>> p1) {
        return null;
    }
    
    @javax.inject.Inject()
    public LoadAnnouncementsUseCase(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.data.feed.FeedRepository repository, @org.jetbrains.annotations.NotNull()
    @com.google.samples.apps.iosched.shared.di.IoDispatcher()
    kotlinx.coroutines.CoroutineDispatcher dispatcher) {
        super(null);
    }
}