package com.google.samples.apps.iosched.shared.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t\u00a8\u0006\n"}, d2 = {"Lcom/google/samples/apps/iosched/shared/data/ConferenceDataJsonParser;", "", "()V", "normalize", "Lcom/google/samples/apps/iosched/model/ConferenceData;", "data", "Lcom/google/samples/apps/iosched/shared/data/TempConferenceData;", "parseConferenceData", "unprocessedSessionData", "Ljava/io/InputStream;", "shared_staging"})
public final class ConferenceDataJsonParser {
    public static final com.google.samples.apps.iosched.shared.data.ConferenceDataJsonParser INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.samples.apps.iosched.model.ConferenceData parseConferenceData(@org.jetbrains.annotations.NotNull()
    java.io.InputStream unprocessedSessionData) throws com.google.gson.JsonIOException, com.google.gson.JsonSyntaxException {
        return null;
    }
    
    /**
     * Adds nested objects like `session.tags` to `sessions`
     */
    private final com.google.samples.apps.iosched.model.ConferenceData normalize(com.google.samples.apps.iosched.shared.data.TempConferenceData data) {
        return null;
    }
    
    private ConferenceDataJsonParser() {
        super();
    }
}