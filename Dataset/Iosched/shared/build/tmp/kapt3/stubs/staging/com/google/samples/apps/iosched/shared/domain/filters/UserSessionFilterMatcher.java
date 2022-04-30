package com.google.samples.apps.iosched.shared.domain.filters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0000\u00a2\u0006\u0002\b\u0011R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00030\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/google/samples/apps/iosched/shared/domain/filters/UserSessionFilterMatcher;", "", "filters", "", "Lcom/google/samples/apps/iosched/model/filters/Filter;", "(Ljava/util/List;)V", "days", "Lcom/google/samples/apps/iosched/model/ConferenceDay;", "mySchedule", "", "tagsByCategory", "", "", "Lcom/google/samples/apps/iosched/model/Tag;", "matches", "userSession", "Lcom/google/samples/apps/iosched/model/userdata/UserSession;", "matches$shared_staging", "shared_staging"})
public final class UserSessionFilterMatcher {
    private final boolean mySchedule = false;
    private final java.util.List<com.google.samples.apps.iosched.model.ConferenceDay> days = null;
    private final java.util.Map<java.lang.String, java.util.List<com.google.samples.apps.iosched.model.Tag>> tagsByCategory = null;
    
    public final boolean matches$shared_staging(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.model.userdata.UserSession userSession) {
        return false;
    }
    
    public UserSessionFilterMatcher(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.google.samples.apps.iosched.model.filters.Filter> filters) {
        super();
    }
}