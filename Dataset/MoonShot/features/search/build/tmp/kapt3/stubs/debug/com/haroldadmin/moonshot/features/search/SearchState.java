package com.haroldadmin.moonshot.features.search;

import com.haroldadmin.moonshot.base.MoonShotState;
import com.haroldadmin.moonshot.core.Resource;
import com.haroldadmin.moonshot.models.launch.Launch;
import com.haroldadmin.moonshot.models.LaunchPad;
import com.haroldadmin.moonshot.models.Rocket;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00060\u0005\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00060\u0005\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\u0015\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H\u00c6\u0003J\u0015\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00060\u0005H\u00c6\u0003J\u0015\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00060\u0005H\u00c6\u0003JU\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00060\u00052\u0014\b\u0002\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00060\u0005H\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u00d6\u0003J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001J\t\u0010!\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\r\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u000fR\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012\u00a8\u0006\""}, d2 = {"Lcom/haroldadmin/moonshot/features/search/SearchState;", "Lcom/haroldadmin/moonshot/base/MoonShotState;", "query", "", "launches", "Lcom/haroldadmin/moonshot/core/Resource;", "", "Lcom/haroldadmin/moonshot/models/launch/Launch;", "rockets", "Lcom/haroldadmin/moonshot/models/Rocket;", "launchPads", "Lcom/haroldadmin/moonshot/models/LaunchPad;", "(Ljava/lang/String;Lcom/haroldadmin/moonshot/core/Resource;Lcom/haroldadmin/moonshot/core/Resource;Lcom/haroldadmin/moonshot/core/Resource;)V", "isLoading", "", "()Z", "isUninitialized", "getLaunchPads", "()Lcom/haroldadmin/moonshot/core/Resource;", "getLaunches", "getQuery", "()Ljava/lang/String;", "getRockets", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "search_debug"})
public final class SearchState implements com.haroldadmin.moonshot.base.MoonShotState {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String query = null;
    @org.jetbrains.annotations.NotNull()
    private final com.haroldadmin.moonshot.core.Resource<java.util.List<com.haroldadmin.moonshot.models.launch.Launch>> launches = null;
    @org.jetbrains.annotations.NotNull()
    private final com.haroldadmin.moonshot.core.Resource<java.util.List<com.haroldadmin.moonshot.models.Rocket>> rockets = null;
    @org.jetbrains.annotations.NotNull()
    private final com.haroldadmin.moonshot.core.Resource<java.util.List<com.haroldadmin.moonshot.models.LaunchPad>> launchPads = null;
    
    public final boolean isLoading() {
        return false;
    }
    
    public final boolean isUninitialized() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getQuery() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.core.Resource<java.util.List<com.haroldadmin.moonshot.models.launch.Launch>> getLaunches() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.core.Resource<java.util.List<com.haroldadmin.moonshot.models.Rocket>> getRockets() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.core.Resource<java.util.List<com.haroldadmin.moonshot.models.LaunchPad>> getLaunchPads() {
        return null;
    }
    
    public SearchState(@org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshot.core.Resource<? extends java.util.List<com.haroldadmin.moonshot.models.launch.Launch>> launches, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshot.core.Resource<? extends java.util.List<com.haroldadmin.moonshot.models.Rocket>> rockets, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshot.core.Resource<? extends java.util.List<com.haroldadmin.moonshot.models.LaunchPad>> launchPads) {
        super();
    }
    
    public SearchState() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.core.Resource<java.util.List<com.haroldadmin.moonshot.models.launch.Launch>> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.core.Resource<java.util.List<com.haroldadmin.moonshot.models.Rocket>> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.core.Resource<java.util.List<com.haroldadmin.moonshot.models.LaunchPad>> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.features.search.SearchState copy(@org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshot.core.Resource<? extends java.util.List<com.haroldadmin.moonshot.models.launch.Launch>> launches, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshot.core.Resource<? extends java.util.List<com.haroldadmin.moonshot.models.Rocket>> rockets, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshot.core.Resource<? extends java.util.List<com.haroldadmin.moonshot.models.LaunchPad>> launchPads) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}