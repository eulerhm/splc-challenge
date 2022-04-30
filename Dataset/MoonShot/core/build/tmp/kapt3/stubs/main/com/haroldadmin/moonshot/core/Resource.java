package com.haroldadmin.moonshot.core;

import java.lang.System;

/**
 * A sealed class to represent UI states associated with a resource.
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0004\u000b\f\r\u000eB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0013\u0010\u0007\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u00a6\u0002J\b\u0010\t\u001a\u00020\nH&R\u0012\u0010\u0004\u001a\u00020\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006\u0082\u0001\u0004\u000f\u0010\u0011\u0012\u00a8\u0006\u0013"}, d2 = {"Lcom/haroldadmin/moonshot/core/Resource;", "T", "", "()V", "isComplete", "", "()Z", "equals", "other", "hashCode", "", "Error", "Loading", "Success", "Uninitialized", "Lcom/haroldadmin/moonshot/core/Resource$Success;", "Lcom/haroldadmin/moonshot/core/Resource$Error;", "Lcom/haroldadmin/moonshot/core/Resource$Loading;", "Lcom/haroldadmin/moonshot/core/Resource$Uninitialized;", "core"})
public abstract class Resource<T extends java.lang.Object> {
    
    @java.lang.Override()
    public abstract int hashCode();
    
    @java.lang.Override()
    public abstract boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other);
    
    /**
     * A property to determine whether this Resource has reached a terminal status or not.
     * A Resource is in a terminal status if it is [Success] or [Error]
     */
    public abstract boolean isComplete();
    
    private Resource() {
        super();
    }
    
    /**
     * A data class to represent the scenario where the resource is available without any errors
     *
     * This is a terminal state, and the Resource object is considered to be completed when it is in this state
     */
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\f\u001a\u00028\u0001H\u00c6\u0003\u00a2\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\u000e\u0010\u0015\u001a\u00028\u0001H\u0086\u0002\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0013\u0010\u0003\u001a\u00028\u0001\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u0014\u0010\u000b\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n\u00a8\u0006\u0018"}, d2 = {"Lcom/haroldadmin/moonshot/core/Resource$Success;", "T", "Lcom/haroldadmin/moonshot/core/Resource;", "data", "isCached", "", "(Ljava/lang/Object;Z)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "()Z", "isComplete", "component1", "component2", "copy", "(Ljava/lang/Object;Z)Lcom/haroldadmin/moonshot/core/Resource$Success;", "equals", "other", "", "hashCode", "", "invoke", "toString", "", "core"})
    public static final class Success<T extends java.lang.Object> extends com.haroldadmin.moonshot.core.Resource<T> {
        private final boolean isComplete = false;
        private final T data = null;
        private final boolean isCached = false;
        
        @java.lang.Override()
        public boolean isComplete() {
            return false;
        }
        
        public final T invoke() {
            return null;
        }
        
        public final T getData() {
            return null;
        }
        
        public final boolean isCached() {
            return false;
        }
        
        public Success(T data, boolean isCached) {
            super();
        }
        
        public final T component1() {
            return null;
        }
        
        public final boolean component2() {
            return false;
        }
        
        /**
         * A data class to represent the scenario where the resource is available without any errors
         *
         * This is a terminal state, and the Resource object is considered to be completed when it is in this state
         */
        @org.jetbrains.annotations.NotNull()
        public final com.haroldadmin.moonshot.core.Resource.Success<T> copy(T data, boolean isCached) {
            return null;
        }
        
        /**
         * A data class to represent the scenario where the resource is available without any errors
         *
         * This is a terminal state, and the Resource object is considered to be completed when it is in this state
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        /**
         * A data class to represent the scenario where the resource is available without any errors
         *
         * This is a terminal state, and the Resource object is considered to be completed when it is in this state
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * A data class to represent the scenario where the resource is available without any errors
         *
         * This is a terminal state, and the Resource object is considered to be completed when it is in this state
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    /**
     * A data class to represent the scenario where a resource may or may not be available due to an error
     *
     * This is a terminal state, and the Resource object is considered to be completed when it is in this state
     */
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u0001*\u0006\b\u0002\u0010\u0002 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0002\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000e\u001a\u0004\u0018\u00018\u0001H\u00c6\u0003\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00018\u0002H\u00c6\u0003\u00a2\u0006\u0002\u0010\bJ2\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00018\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0002H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0002\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\fX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\r\u00a8\u0006\u0019"}, d2 = {"Lcom/haroldadmin/moonshot/core/Resource$Error;", "T", "E", "Lcom/haroldadmin/moonshot/core/Resource;", "data", "error", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getError", "isComplete", "", "()Z", "component1", "component2", "copy", "(Ljava/lang/Object;Ljava/lang/Object;)Lcom/haroldadmin/moonshot/core/Resource$Error;", "equals", "other", "", "hashCode", "", "toString", "", "core"})
    public static final class Error<T extends java.lang.Object, E extends java.lang.Object> extends com.haroldadmin.moonshot.core.Resource<T> {
        private final boolean isComplete = true;
        @org.jetbrains.annotations.Nullable()
        private final T data = null;
        @org.jetbrains.annotations.Nullable()
        private final E error = null;
        
        @java.lang.Override()
        public boolean isComplete() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final T getData() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final E getError() {
            return null;
        }
        
        public Error(@org.jetbrains.annotations.Nullable()
        T data, @org.jetbrains.annotations.Nullable()
        E error) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final T component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final E component2() {
            return null;
        }
        
        /**
         * A data class to represent the scenario where a resource may or may not be available due to an error
         *
         * This is a terminal state, and the Resource object is considered to be completed when it is in this state
         */
        @org.jetbrains.annotations.NotNull()
        public final com.haroldadmin.moonshot.core.Resource.Error<T, E> copy(@org.jetbrains.annotations.Nullable()
        T data, @org.jetbrains.annotations.Nullable()
        E error) {
            return null;
        }
        
        /**
         * A data class to represent the scenario where a resource may or may not be available due to an error
         *
         * This is a terminal state, and the Resource object is considered to be completed when it is in this state
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        /**
         * A data class to represent the scenario where a resource may or may not be available due to an error
         *
         * This is a terminal state, and the Resource object is considered to be completed when it is in this state
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * A data class to represent the scenario where a resource may or may not be available due to an error
         *
         * This is a terminal state, and the Resource object is considered to be completed when it is in this state
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    /**
     * A class to represent the loading state of an object
     *
     * This is a non-terminal state.
     */
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0013\u0010\u0007\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0006\u00a8\u0006\f"}, d2 = {"Lcom/haroldadmin/moonshot/core/Resource$Loading;", "Lcom/haroldadmin/moonshot/core/Resource;", "", "()V", "isComplete", "", "()Z", "equals", "other", "", "hashCode", "", "core"})
    public static final class Loading extends com.haroldadmin.moonshot.core.Resource {
        private static final boolean isComplete = false;
        public static final com.haroldadmin.moonshot.core.Resource.Loading INSTANCE = null;
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public boolean isComplete() {
            return false;
        }
        
        private Loading() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0013\u0010\u0007\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0006\u00a8\u0006\f"}, d2 = {"Lcom/haroldadmin/moonshot/core/Resource$Uninitialized;", "Lcom/haroldadmin/moonshot/core/Resource;", "", "()V", "isComplete", "", "()Z", "equals", "other", "", "hashCode", "", "core"})
    public static final class Uninitialized extends com.haroldadmin.moonshot.core.Resource {
        private static final boolean isComplete = false;
        public static final com.haroldadmin.moonshot.core.Resource.Uninitialized INSTANCE = null;
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public boolean isComplete() {
            return false;
        }
        
        private Uninitialized() {
            super();
        }
    }
}