package com.google.samples.apps.iosched.shared.data.userevent;

import java.lang.System;

/**
 * Enum of messages notified to the end user.
 * Need to be ordered by importance
 * (e.g. CHANGE_IN_RESERVATIONS is more important than CHANGES_IN_WAITLIST)
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f\u00a8\u0006\r"}, d2 = {"Lcom/google/samples/apps/iosched/shared/data/userevent/UserEventMessageChangeType;", "", "(Ljava/lang/String;I)V", "CHANGES_IN_RESERVATIONS", "RESERVATIONS_REPLACED", "CHANGES_IN_WAITLIST", "RESERVATION_CANCELED", "WAITLIST_CANCELED", "RESERVATION_DENIED_CUTOFF", "RESERVATION_DENIED_CLASH", "RESERVATION_DENIED_UNKNOWN", "CANCELLATION_DENIED_CUTOFF", "CANCELLATION_DENIED_UNKNOWN", "shared_staging"})
public enum UserEventMessageChangeType {
    /*public static final*/ CHANGES_IN_RESERVATIONS /* = new CHANGES_IN_RESERVATIONS() */,
    /*public static final*/ RESERVATIONS_REPLACED /* = new RESERVATIONS_REPLACED() */,
    /*public static final*/ CHANGES_IN_WAITLIST /* = new CHANGES_IN_WAITLIST() */,
    /*public static final*/ RESERVATION_CANCELED /* = new RESERVATION_CANCELED() */,
    /*public static final*/ WAITLIST_CANCELED /* = new WAITLIST_CANCELED() */,
    /*public static final*/ RESERVATION_DENIED_CUTOFF /* = new RESERVATION_DENIED_CUTOFF() */,
    /*public static final*/ RESERVATION_DENIED_CLASH /* = new RESERVATION_DENIED_CLASH() */,
    /*public static final*/ RESERVATION_DENIED_UNKNOWN /* = new RESERVATION_DENIED_UNKNOWN() */,
    /*public static final*/ CANCELLATION_DENIED_CUTOFF /* = new CANCELLATION_DENIED_CUTOFF() */,
    /*public static final*/ CANCELLATION_DENIED_UNKNOWN /* = new CANCELLATION_DENIED_UNKNOWN() */;
    
    UserEventMessageChangeType() {
    }
}