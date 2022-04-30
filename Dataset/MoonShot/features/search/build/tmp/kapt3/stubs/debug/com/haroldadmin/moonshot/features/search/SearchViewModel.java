package com.haroldadmin.moonshot.features.search;

import com.haroldadmin.moonshot.base.MoonShotViewModel;
import com.haroldadmin.moonshot.core.Resource;
import com.haroldadmin.moonshot.models.SearchQuery;
import com.haroldadmin.moonshotRepository.search.SearchLaunchesUseCase;
import com.haroldadmin.moonshotRepository.search.SearchLaunchpadsUseCase;
import com.haroldadmin.moonshotRepository.search.SearchRocketsUseCase;
import com.squareup.inject.assisted.Assisted;
import com.squareup.inject.assisted.AssistedInject;
import kotlinx.coroutines.ExperimentalCoroutinesApi;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B)\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010J!\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J!\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J!\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/haroldadmin/moonshot/features/search/SearchViewModel;", "Lcom/haroldadmin/moonshot/base/MoonShotViewModel;", "Lcom/haroldadmin/moonshot/features/search/SearchState;", "initState", "searchLaunchesUseCase", "Lcom/haroldadmin/moonshotRepository/search/SearchLaunchesUseCase;", "searchRocketsUseCase", "Lcom/haroldadmin/moonshotRepository/search/SearchRocketsUseCase;", "searchLaunchpadsUseCase", "Lcom/haroldadmin/moonshotRepository/search/SearchLaunchpadsUseCase;", "(Lcom/haroldadmin/moonshot/features/search/SearchState;Lcom/haroldadmin/moonshotRepository/search/SearchLaunchesUseCase;Lcom/haroldadmin/moonshotRepository/search/SearchRocketsUseCase;Lcom/haroldadmin/moonshotRepository/search/SearchLaunchpadsUseCase;)V", "searchFor", "Lkotlinx/coroutines/Job;", "searchQuery", "", "limit", "", "searchLaunches", "query", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchLaunchpads", "searchRockets", "Factory", "search_debug"})
public final class SearchViewModel extends com.haroldadmin.moonshot.base.MoonShotViewModel<com.haroldadmin.moonshot.features.search.SearchState> {
    private final com.haroldadmin.moonshotRepository.search.SearchLaunchesUseCase searchLaunchesUseCase = null;
    private final com.haroldadmin.moonshotRepository.search.SearchRocketsUseCase searchRocketsUseCase = null;
    private final com.haroldadmin.moonshotRepository.search.SearchLaunchpadsUseCase searchLaunchpadsUseCase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job searchFor(@org.jetbrains.annotations.NotNull()
    java.lang.String searchQuery, int limit) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object searchLaunches(@org.jetbrains.annotations.NotNull()
    java.lang.String query, int limit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.Job> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object searchRockets(@org.jetbrains.annotations.NotNull()
    java.lang.String query, int limit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.Job> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object searchLaunchpads(@org.jetbrains.annotations.NotNull()
    java.lang.String query, int limit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.Job> p2) {
        return null;
    }
    
    @com.squareup.inject.assisted.AssistedInject()
    public SearchViewModel(@org.jetbrains.annotations.NotNull()
    @com.squareup.inject.assisted.Assisted()
    com.haroldadmin.moonshot.features.search.SearchState initState, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshotRepository.search.SearchLaunchesUseCase searchLaunchesUseCase, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshotRepository.search.SearchRocketsUseCase searchRocketsUseCase, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshotRepository.search.SearchLaunchpadsUseCase searchLaunchpadsUseCase) {
        super(null, null);
    }
    
    @com.squareup.inject.assisted.AssistedInject.Factory()
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/haroldadmin/moonshot/features/search/SearchViewModel$Factory;", "", "create", "Lcom/haroldadmin/moonshot/features/search/SearchViewModel;", "initState", "Lcom/haroldadmin/moonshot/features/search/SearchState;", "search_debug"})
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.haroldadmin.moonshot.features.search.SearchViewModel create(@org.jetbrains.annotations.NotNull()
        com.haroldadmin.moonshot.features.search.SearchState initState);
    }
}