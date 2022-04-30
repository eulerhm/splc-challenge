package com.google.samples.apps.iosched.shared.domain.search;

import java.lang.System;

/**
 * Sealed class that represents searchable contents.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/google/samples/apps/iosched/shared/domain/search/Searchable;", "", "()V", "SearchedCodelab", "SearchedSession", "SearchedSpeaker", "Lcom/google/samples/apps/iosched/shared/domain/search/Searchable$SearchedSession;", "Lcom/google/samples/apps/iosched/shared/domain/search/Searchable$SearchedSpeaker;", "Lcom/google/samples/apps/iosched/shared/domain/search/Searchable$SearchedCodelab;", "shared_staging"})
public abstract class Searchable {
    
    private Searchable() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/google/samples/apps/iosched/shared/domain/search/Searchable$SearchedSession;", "Lcom/google/samples/apps/iosched/shared/domain/search/Searchable;", "session", "Lcom/google/samples/apps/iosched/model/Session;", "(Lcom/google/samples/apps/iosched/model/Session;)V", "getSession", "()Lcom/google/samples/apps/iosched/model/Session;", "shared_staging"})
    public static final class SearchedSession extends com.google.samples.apps.iosched.shared.domain.search.Searchable {
        @org.jetbrains.annotations.NotNull()
        private final com.google.samples.apps.iosched.model.Session session = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.samples.apps.iosched.model.Session getSession() {
            return null;
        }
        
        public SearchedSession(@org.jetbrains.annotations.NotNull()
        com.google.samples.apps.iosched.model.Session session) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/google/samples/apps/iosched/shared/domain/search/Searchable$SearchedSpeaker;", "Lcom/google/samples/apps/iosched/shared/domain/search/Searchable;", "speaker", "Lcom/google/samples/apps/iosched/model/Speaker;", "(Lcom/google/samples/apps/iosched/model/Speaker;)V", "getSpeaker", "()Lcom/google/samples/apps/iosched/model/Speaker;", "shared_staging"})
    public static final class SearchedSpeaker extends com.google.samples.apps.iosched.shared.domain.search.Searchable {
        @org.jetbrains.annotations.NotNull()
        private final com.google.samples.apps.iosched.model.Speaker speaker = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.samples.apps.iosched.model.Speaker getSpeaker() {
            return null;
        }
        
        public SearchedSpeaker(@org.jetbrains.annotations.NotNull()
        com.google.samples.apps.iosched.model.Speaker speaker) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/google/samples/apps/iosched/shared/domain/search/Searchable$SearchedCodelab;", "Lcom/google/samples/apps/iosched/shared/domain/search/Searchable;", "codelab", "Lcom/google/samples/apps/iosched/model/Codelab;", "(Lcom/google/samples/apps/iosched/model/Codelab;)V", "getCodelab", "()Lcom/google/samples/apps/iosched/model/Codelab;", "shared_staging"})
    public static final class SearchedCodelab extends com.google.samples.apps.iosched.shared.domain.search.Searchable {
        @org.jetbrains.annotations.NotNull()
        private final com.google.samples.apps.iosched.model.Codelab codelab = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.samples.apps.iosched.model.Codelab getCodelab() {
            return null;
        }
        
        public SearchedCodelab(@org.jetbrains.annotations.NotNull()
        com.google.samples.apps.iosched.model.Codelab codelab) {
            super();
        }
    }
}