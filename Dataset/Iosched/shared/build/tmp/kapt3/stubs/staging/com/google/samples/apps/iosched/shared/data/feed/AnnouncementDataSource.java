package com.google.samples.apps.iosched.shared.data.feed;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lcom/google/samples/apps/iosched/shared/data/feed/AnnouncementDataSource;", "", "getAnnouncements", "", "Lcom/google/samples/apps/iosched/model/Announcement;", "shared_staging"})
public abstract interface AnnouncementDataSource {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.google.samples.apps.iosched.model.Announcement> getAnnouncements();
}