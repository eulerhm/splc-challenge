package com.google.samples.apps.iosched.shared.data.feed;

import java.lang.System;

/**
 * Returns hardcoded data for development and testing.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/google/samples/apps/iosched/shared/data/feed/FakeMomentDataSource;", "Lcom/google/samples/apps/iosched/shared/data/feed/MomentDataSource;", "()V", "imageBaseUrl", "", "moment", "Lcom/google/samples/apps/iosched/model/Moment;", "getMoments", "", "shared_staging"})
public final class FakeMomentDataSource implements com.google.samples.apps.iosched.shared.data.feed.MomentDataSource {
    private static final java.lang.String imageBaseUrl = "https://firebasestorage.googleapis.com/v0/b/io2019-festivus/o/images%2Fhome/";
    private static final com.google.samples.apps.iosched.model.Moment moment = null;
    public static final com.google.samples.apps.iosched.shared.data.feed.FakeMomentDataSource INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.google.samples.apps.iosched.model.Moment> getMoments() {
        return null;
    }
    
    private FakeMomentDataSource() {
        super();
    }
}