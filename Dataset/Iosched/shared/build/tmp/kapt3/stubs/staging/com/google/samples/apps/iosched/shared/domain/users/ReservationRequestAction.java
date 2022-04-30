package com.google.samples.apps.iosched.shared.domain.users;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/google/samples/apps/iosched/shared/domain/users/ReservationRequestAction;", "", "()V", "CancelAction", "RequestAction", "SwapAction", "Lcom/google/samples/apps/iosched/shared/domain/users/ReservationRequestAction$RequestAction;", "Lcom/google/samples/apps/iosched/shared/domain/users/ReservationRequestAction$CancelAction;", "Lcom/google/samples/apps/iosched/shared/domain/users/ReservationRequestAction$SwapAction;", "shared_staging"})
public abstract class ReservationRequestAction {
    
    private ReservationRequestAction() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lcom/google/samples/apps/iosched/shared/domain/users/ReservationRequestAction$RequestAction;", "Lcom/google/samples/apps/iosched/shared/domain/users/ReservationRequestAction;", "()V", "equals", "", "other", "", "hashCode", "", "shared_staging"})
    public static final class RequestAction extends com.google.samples.apps.iosched.shared.domain.users.ReservationRequestAction {
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @kotlin.Suppress(names = {"redundant"})
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        public RequestAction() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lcom/google/samples/apps/iosched/shared/domain/users/ReservationRequestAction$CancelAction;", "Lcom/google/samples/apps/iosched/shared/domain/users/ReservationRequestAction;", "()V", "equals", "", "other", "", "hashCode", "", "shared_staging"})
    public static final class CancelAction extends com.google.samples.apps.iosched.shared.domain.users.ReservationRequestAction {
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @kotlin.Suppress(names = {"redundant"})
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        public CancelAction() {
            super();
        }
    }
    
    /**
     * The action when the user is trying to reserve a session, but there is already an overlapping
     * reservation.
     */
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/google/samples/apps/iosched/shared/domain/users/ReservationRequestAction$SwapAction;", "Lcom/google/samples/apps/iosched/shared/domain/users/ReservationRequestAction;", "parameters", "Lcom/google/samples/apps/iosched/shared/domain/users/SwapRequestParameters;", "(Lcom/google/samples/apps/iosched/shared/domain/users/SwapRequestParameters;)V", "getParameters", "()Lcom/google/samples/apps/iosched/shared/domain/users/SwapRequestParameters;", "shared_staging"})
    public static final class SwapAction extends com.google.samples.apps.iosched.shared.domain.users.ReservationRequestAction {
        @org.jetbrains.annotations.NotNull()
        private final com.google.samples.apps.iosched.shared.domain.users.SwapRequestParameters parameters = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.samples.apps.iosched.shared.domain.users.SwapRequestParameters getParameters() {
            return null;
        }
        
        public SwapAction(@org.jetbrains.annotations.NotNull()
        com.google.samples.apps.iosched.shared.domain.users.SwapRequestParameters parameters) {
            super();
        }
    }
}