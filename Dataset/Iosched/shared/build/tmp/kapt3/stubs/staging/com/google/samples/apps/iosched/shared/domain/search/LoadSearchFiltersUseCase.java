package com.google.samples.apps.iosched.shared.domain.search;

import java.lang.System;

/**
 * Loads filters for the Search screen.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/google/samples/apps/iosched/shared/domain/search/LoadSearchFiltersUseCase;", "Lcom/google/samples/apps/iosched/shared/domain/UseCase;", "", "", "Lcom/google/samples/apps/iosched/model/filters/Filter;", "conferenceRepository", "Lcom/google/samples/apps/iosched/shared/data/ConferenceDataRepository;", "tagRepository", "Lcom/google/samples/apps/iosched/shared/data/tag/TagRepository;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/google/samples/apps/iosched/shared/data/ConferenceDataRepository;Lcom/google/samples/apps/iosched/shared/data/tag/TagRepository;Lkotlinx/coroutines/CoroutineDispatcher;)V", "execute", "parameters", "(Lkotlin/Unit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shared_staging"})
public final class LoadSearchFiltersUseCase extends com.google.samples.apps.iosched.shared.domain.UseCase<kotlin.Unit, java.util.List<? extends com.google.samples.apps.iosched.model.filters.Filter>> {
    private final com.google.samples.apps.iosched.shared.data.ConferenceDataRepository conferenceRepository = null;
    private final com.google.samples.apps.iosched.shared.data.tag.TagRepository tagRepository = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected java.lang.Object execute(@org.jetbrains.annotations.NotNull()
    kotlin.Unit parameters, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<? extends com.google.samples.apps.iosched.model.filters.Filter>> p1) {
        return null;
    }
    
    @javax.inject.Inject()
    public LoadSearchFiltersUseCase(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.data.ConferenceDataRepository conferenceRepository, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.data.tag.TagRepository tagRepository, @org.jetbrains.annotations.NotNull()
    @com.google.samples.apps.iosched.shared.di.IoDispatcher()
    kotlinx.coroutines.CoroutineDispatcher dispatcher) {
        super(null);
    }
}