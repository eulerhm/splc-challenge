package com.google.samples.apps.iosched.shared.data.feed;

import java.lang.System;

/**
 * Feed data source backed by items in a FireStore collection.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Lcom/google/samples/apps/iosched/shared/data/feed/FirestoreAnnouncementDataSource;", "Lcom/google/samples/apps/iosched/shared/data/feed/AnnouncementDataSource;", "firestore", "Lcom/google/firebase/firestore/FirebaseFirestore;", "(Lcom/google/firebase/firestore/FirebaseFirestore;)V", "getFirestore", "()Lcom/google/firebase/firestore/FirebaseFirestore;", "getAnnouncements", "", "Lcom/google/samples/apps/iosched/model/Announcement;", "parseFeedItem", "snapshot", "Lcom/google/firebase/firestore/DocumentSnapshot;", "Companion", "shared_staging"})
public final class FirestoreAnnouncementDataSource implements com.google.samples.apps.iosched.shared.data.feed.AnnouncementDataSource {
    @org.jetbrains.annotations.NotNull()
    private final com.google.firebase.firestore.FirebaseFirestore firestore = null;
    
    /**
     * Firestore constants.
     */
    private static final java.lang.String FEED_COLLECTION = "feed";
    private static final java.lang.String ACTIVE = "active";
    private static final java.lang.String CATEGORY = "category";
    private static final java.lang.String COLOR = "color";
    private static final java.lang.String TIMESTAMP = "timeStamp";
    private static final java.lang.String IMAGE_URL = "imageUrl";
    private static final java.lang.String MESSAGE = "message";
    private static final java.lang.String PRIORITY = "priority";
    private static final java.lang.String TITLE = "title";
    private static final java.lang.String EMERGENCY = "emergency";
    public static final com.google.samples.apps.iosched.shared.data.feed.FirestoreAnnouncementDataSource.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.google.samples.apps.iosched.model.Announcement> getAnnouncements() {
        return null;
    }
    
    private final com.google.samples.apps.iosched.model.Announcement parseFeedItem(com.google.firebase.firestore.DocumentSnapshot snapshot) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.firestore.FirebaseFirestore getFirestore() {
        return null;
    }
    
    @javax.inject.Inject()
    public FirestoreAnnouncementDataSource(@org.jetbrains.annotations.NotNull()
    com.google.firebase.firestore.FirebaseFirestore firestore) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/google/samples/apps/iosched/shared/data/feed/FirestoreAnnouncementDataSource$Companion;", "", "()V", "ACTIVE", "", "CATEGORY", "COLOR", "EMERGENCY", "FEED_COLLECTION", "IMAGE_URL", "MESSAGE", "PRIORITY", "TIMESTAMP", "TITLE", "shared_staging"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}