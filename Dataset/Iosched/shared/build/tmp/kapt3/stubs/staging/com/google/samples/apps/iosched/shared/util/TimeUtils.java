package com.google.samples.apps.iosched.shared.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001-B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0014J\u000e\u0010\u0016\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0018\u001a\u00020\u000fJ\b\u0010\u0019\u001a\u0004\u0018\u00010\tJ\u0006\u0010\u001a\u001a\u00020\u000fJ\u001a\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u001e\u001a\u00020\u0014H\u0007J\u001a\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u000f2\b\b\u0002\u0010\u001e\u001a\u00020\u0014H\u0007J\u001a\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010%\u001a\u00020\u000fJ\u001a\u0010&\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u001e\u001a\u00020\u0014H\u0007J\u0010\u0010\'\u001a\u00020\u00142\b\b\u0002\u0010(\u001a\u00020\u0004J \u0010)\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\u000f2\b\b\u0002\u0010+\u001a\u00020\u0014J\u0018\u0010,\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000f2\b\b\u0002\u0010(\u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006."}, d2 = {"Lcom/google/samples/apps/iosched/shared/util/TimeUtils;", "", "()V", "CONFERENCE_TIMEZONE", "Lorg/threeten/bp/ZoneId;", "getCONFERENCE_TIMEZONE", "()Lorg/threeten/bp/ZoneId;", "ConferenceDays", "", "Lcom/google/samples/apps/iosched/model/ConferenceDay;", "getConferenceDays", "()Ljava/util/List;", "abbreviatedDayForAr", "", "startTime", "Lorg/threeten/bp/ZonedDateTime;", "abbreviatedTimeForAnnouncements", "abbreviatedTimeForAr", "abbreviatedTimeString", "conferenceHasEnded", "", "conferenceHasStarted", "dateString", "dateTimeString", "getConferenceEndTime", "getCurrentConferenceDay", "getKeynoteStartTime", "getLabelResForDay", "", "day", "inConferenceTimeZone", "getLabelResForTime", "time", "getSessionState", "Lcom/google/samples/apps/iosched/shared/util/TimeUtils$SessionRelativeTimeState;", "session", "Lcom/google/samples/apps/iosched/model/Session;", "currentTime", "getShortLabelResForDay", "isConferenceTimeZone", "zoneId", "timeString", "endTime", "withDate", "zonedTime", "SessionRelativeTimeState", "shared_staging"})
public final class TimeUtils {
    @org.jetbrains.annotations.NotNull()
    private static final org.threeten.bp.ZoneId CONFERENCE_TIMEZONE = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<com.google.samples.apps.iosched.model.ConferenceDay> ConferenceDays = null;
    public static final com.google.samples.apps.iosched.shared.util.TimeUtils INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final org.threeten.bp.ZoneId getCONFERENCE_TIMEZONE() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.google.samples.apps.iosched.model.ConferenceDay> getConferenceDays() {
        return null;
    }
    
    /**
     * Determine whether the current time is before, during, or after a Session's time slot
     */
    @org.jetbrains.annotations.NotNull()
    public final com.google.samples.apps.iosched.shared.util.TimeUtils.SessionRelativeTimeState getSessionState(@org.jetbrains.annotations.Nullable()
    com.google.samples.apps.iosched.model.Session session, @org.jetbrains.annotations.NotNull()
    org.threeten.bp.ZonedDateTime currentTime) {
        return null;
    }
    
    /**
     * Return a string resource to use for the label of this day, e.g. "Tuesday, May 7".
     */
    @androidx.annotation.StringRes()
    public final int getLabelResForDay(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.model.ConferenceDay day, boolean inConferenceTimeZone) {
        return 0;
    }
    
    /**
     * Return a short string resource to use for the label of this day, e.g. "May 7".
     */
    @androidx.annotation.StringRes()
    public final int getShortLabelResForDay(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.model.ConferenceDay day, boolean inConferenceTimeZone) {
        return 0;
    }
    
    /**
     * Return a string resource to use for the nearest day to the given time.
     */
    @androidx.annotation.StringRes()
    public final int getLabelResForTime(@org.jetbrains.annotations.NotNull()
    org.threeten.bp.ZonedDateTime time, boolean inConferenceTimeZone) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.threeten.bp.ZonedDateTime zonedTime(@org.jetbrains.annotations.NotNull()
    org.threeten.bp.ZonedDateTime time, @org.jetbrains.annotations.NotNull()
    org.threeten.bp.ZoneId zoneId) {
        return null;
    }
    
    public final boolean isConferenceTimeZone(@org.jetbrains.annotations.NotNull()
    org.threeten.bp.ZoneId zoneId) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String abbreviatedTimeString(@org.jetbrains.annotations.NotNull()
    org.threeten.bp.ZonedDateTime startTime) {
        return null;
    }
    
    /**
     * Format a time to show month and day, e.g. "May 7"
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String dateString(@org.jetbrains.annotations.NotNull()
    org.threeten.bp.ZonedDateTime startTime) {
        return null;
    }
    
    /**
     * Format a time to show month, day, and time, e.g. "May 7, 10:00 AM"
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String dateTimeString(@org.jetbrains.annotations.NotNull()
    org.threeten.bp.ZonedDateTime startTime) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String timeString(@org.jetbrains.annotations.NotNull()
    org.threeten.bp.ZonedDateTime startTime, @org.jetbrains.annotations.NotNull()
    org.threeten.bp.ZonedDateTime endTime, boolean withDate) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String abbreviatedDayForAr(@org.jetbrains.annotations.NotNull()
    org.threeten.bp.ZonedDateTime startTime) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String abbreviatedTimeForAr(@org.jetbrains.annotations.NotNull()
    org.threeten.bp.ZonedDateTime startTime) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String abbreviatedTimeForAnnouncements(@org.jetbrains.annotations.NotNull()
    org.threeten.bp.ZonedDateTime startTime) {
        return null;
    }
    
    public final boolean conferenceHasStarted() {
        return false;
    }
    
    public final boolean conferenceHasEnded() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.threeten.bp.ZonedDateTime getKeynoteStartTime() {
        return null;
    }
    
    /**
     * @return the current day of the conference. Returns null if the conference is yet to start or
     * has ended.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.google.samples.apps.iosched.model.ConferenceDay getCurrentConferenceDay() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.threeten.bp.ZonedDateTime getConferenceEndTime() {
        return null;
    }
    
    private TimeUtils() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/google/samples/apps/iosched/shared/util/TimeUtils$SessionRelativeTimeState;", "", "(Ljava/lang/String;I)V", "BEFORE", "DURING", "AFTER", "UNKNOWN", "shared_staging"})
    public static enum SessionRelativeTimeState {
        /*public static final*/ BEFORE /* = new BEFORE() */,
        /*public static final*/ DURING /* = new DURING() */,
        /*public static final*/ AFTER /* = new AFTER() */,
        /*public static final*/ UNKNOWN /* = new UNKNOWN() */;
        
        SessionRelativeTimeState() {
        }
    }
}