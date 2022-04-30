package com.google.samples.apps.iosched.shared.data;

import java.lang.System;

/**
 * Downloads session data.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/google/samples/apps/iosched/shared/data/ConferenceDataDownloader;", "", "context", "Landroid/content/Context;", "bootstrapVersion", "", "(Landroid/content/Context;Ljava/lang/String;)V", "client", "Lokhttp3/OkHttpClient;", "getClient", "()Lokhttp3/OkHttpClient;", "client$delegate", "Lkotlin/Lazy;", "fetch", "Lokhttp3/Response;", "fetchCached", "shared_staging"})
public final class ConferenceDataDownloader {
    private final kotlin.Lazy client$delegate = null;
    private final android.content.Context context = null;
    private final java.lang.String bootstrapVersion = null;
    
    private final okhttp3.OkHttpClient getClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.WorkerThread()
    public final okhttp3.Response fetch() throws java.io.IOException {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.Response fetchCached() {
        return null;
    }
    
    public ConferenceDataDownloader(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String bootstrapVersion) {
        super();
    }
}