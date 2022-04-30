package com.google.samples.apps.iosched.shared.data.codelabs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/google/samples/apps/iosched/shared/data/codelabs/CodelabsRepository;", "", "conferenceDataRepository", "Lcom/google/samples/apps/iosched/shared/data/ConferenceDataRepository;", "(Lcom/google/samples/apps/iosched/shared/data/ConferenceDataRepository;)V", "getCodelabs", "", "Lcom/google/samples/apps/iosched/model/Codelab;", "shared_staging"})
@javax.inject.Singleton()
public class CodelabsRepository {
    private final com.google.samples.apps.iosched.shared.data.ConferenceDataRepository conferenceDataRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.google.samples.apps.iosched.model.Codelab> getCodelabs() {
        return null;
    }
    
    @javax.inject.Inject()
    public CodelabsRepository(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.data.ConferenceDataRepository conferenceDataRepository) {
        super();
    }
}