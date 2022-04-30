package com.google.samples.apps.iosched.shared.data.db;

import java.lang.System;

/**
 * The [Room] database for this app.
 */
@androidx.room.Database(entities = {com.google.samples.apps.iosched.shared.data.db.SessionFtsEntity.class, com.google.samples.apps.iosched.shared.data.db.SpeakerFtsEntity.class, com.google.samples.apps.iosched.shared.data.db.CodelabFtsEntity.class}, version = 3, exportSchema = false)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\n"}, d2 = {"Lcom/google/samples/apps/iosched/shared/data/db/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "codelabFtsDao", "Lcom/google/samples/apps/iosched/shared/data/db/CodelabFtsDao;", "sessionFtsDao", "Lcom/google/samples/apps/iosched/shared/data/db/SessionFtsDao;", "speakerFtsDao", "Lcom/google/samples/apps/iosched/shared/data/db/SpeakerFtsDao;", "Companion", "shared_staging"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    private static final java.lang.String databaseName = "iosched-db";
    public static final com.google.samples.apps.iosched.shared.data.db.AppDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.google.samples.apps.iosched.shared.data.db.SessionFtsDao sessionFtsDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.google.samples.apps.iosched.shared.data.db.SpeakerFtsDao speakerFtsDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.google.samples.apps.iosched.shared.data.db.CodelabFtsDao codelabFtsDao();
    
    public AppDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/google/samples/apps/iosched/shared/data/db/AppDatabase$Companion;", "", "()V", "databaseName", "", "buildDatabase", "Lcom/google/samples/apps/iosched/shared/data/db/AppDatabase;", "context", "Landroid/content/Context;", "shared_staging"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.samples.apps.iosched.shared.data.db.AppDatabase buildDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}