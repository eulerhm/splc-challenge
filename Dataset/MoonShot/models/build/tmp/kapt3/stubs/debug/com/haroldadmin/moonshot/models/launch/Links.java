package com.haroldadmin.moonshot.models.launch;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f\u00a2\u0006\u0002\u0010\u0010J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fH\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u009f\u0001\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fH\u00c6\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010/\u001a\u000200H\u00d6\u0001J\t\u00101\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012\u00a8\u00062"}, d2 = {"Lcom/haroldadmin/moonshot/models/launch/Links;", "", "missionPatch", "", "missionPatchSmall", "redditCampaign", "redditLaunch", "redditRecovery", "redditMedia", "presskit", "article", "wikipedia", "video", "youtubeKey", "flickrImages", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getArticle", "()Ljava/lang/String;", "getFlickrImages", "()Ljava/util/List;", "getMissionPatch", "getMissionPatchSmall", "getPresskit", "getRedditCampaign", "getRedditLaunch", "getRedditMedia", "getRedditRecovery", "getVideo", "getWikipedia", "getYoutubeKey", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "models_debug"})
public final class Links {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String missionPatch = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String missionPatchSmall = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String redditCampaign = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String redditLaunch = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String redditRecovery = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String redditMedia = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String presskit = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String article = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String wikipedia = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String video = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String youtubeKey = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<java.lang.String> flickrImages = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMissionPatch() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMissionPatchSmall() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRedditCampaign() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRedditLaunch() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRedditRecovery() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRedditMedia() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPresskit() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getArticle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getWikipedia() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getVideo() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getYoutubeKey() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getFlickrImages() {
        return null;
    }
    
    public Links(@org.jetbrains.annotations.Nullable()
    java.lang.String missionPatch, @org.jetbrains.annotations.Nullable()
    java.lang.String missionPatchSmall, @org.jetbrains.annotations.Nullable()
    java.lang.String redditCampaign, @org.jetbrains.annotations.Nullable()
    java.lang.String redditLaunch, @org.jetbrains.annotations.Nullable()
    java.lang.String redditRecovery, @org.jetbrains.annotations.Nullable()
    java.lang.String redditMedia, @org.jetbrains.annotations.Nullable()
    java.lang.String presskit, @org.jetbrains.annotations.Nullable()
    java.lang.String article, @org.jetbrains.annotations.Nullable()
    java.lang.String wikipedia, @org.jetbrains.annotations.Nullable()
    java.lang.String video, @org.jetbrains.annotations.Nullable()
    java.lang.String youtubeKey, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> flickrImages) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.models.launch.Links copy(@org.jetbrains.annotations.Nullable()
    java.lang.String missionPatch, @org.jetbrains.annotations.Nullable()
    java.lang.String missionPatchSmall, @org.jetbrains.annotations.Nullable()
    java.lang.String redditCampaign, @org.jetbrains.annotations.Nullable()
    java.lang.String redditLaunch, @org.jetbrains.annotations.Nullable()
    java.lang.String redditRecovery, @org.jetbrains.annotations.Nullable()
    java.lang.String redditMedia, @org.jetbrains.annotations.Nullable()
    java.lang.String presskit, @org.jetbrains.annotations.Nullable()
    java.lang.String article, @org.jetbrains.annotations.Nullable()
    java.lang.String wikipedia, @org.jetbrains.annotations.Nullable()
    java.lang.String video, @org.jetbrains.annotations.Nullable()
    java.lang.String youtubeKey, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> flickrImages) {
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