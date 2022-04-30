package com.google.samples.apps.iosched.shared.data.feed;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/google/samples/apps/iosched/shared/data/feed/DefaultFeedRepository;", "Lcom/google/samples/apps/iosched/shared/data/feed/FeedRepository;", "announcementDataSource", "Lcom/google/samples/apps/iosched/shared/data/feed/AnnouncementDataSource;", "momentDataSource", "Lcom/google/samples/apps/iosched/shared/data/feed/MomentDataSource;", "(Lcom/google/samples/apps/iosched/shared/data/feed/AnnouncementDataSource;Lcom/google/samples/apps/iosched/shared/data/feed/MomentDataSource;)V", "getAnnouncements", "", "Lcom/google/samples/apps/iosched/model/Announcement;", "getMoments", "Lcom/google/samples/apps/iosched/model/Moment;", "shared_staging"})
@javax.inject.Singleton()
public class DefaultFeedRepository implements com.google.samples.apps.iosched.shared.data.feed.FeedRepository {
    private final com.google.samples.apps.iosched.shared.data.feed.AnnouncementDataSource announcementDataSource = null;
    private final com.google.samples.apps.iosched.shared.data.feed.MomentDataSource momentDataSource = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.google.samples.apps.iosched.model.Announcement> getAnnouncements() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.google.samples.apps.iosched.model.Moment> getMoments() {
        return null;
    }
    
    @javax.inject.Inject()
    public DefaultFeedRepository(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.data.feed.AnnouncementDataSource announcementDataSource, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.data.feed.MomentDataSource momentDataSource) {
        super();
    }
}