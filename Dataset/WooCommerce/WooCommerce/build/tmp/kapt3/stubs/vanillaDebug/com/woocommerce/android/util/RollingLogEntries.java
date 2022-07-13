package com.woocommerce.android.util;

import java.lang.System;

/**
 * Fix-sized list of log entries
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/woocommerce/android/util/RollingLogEntries;", "Ljava/util/LinkedList;", "Lcom/woocommerce/android/util/RollingLogEntries$LogEntry;", "limit", "", "(I)V", "add", "", "element", "toString", "", "LogEntry", "WooCommerce_vanillaDebug"})
public final class RollingLogEntries extends java.util.LinkedList<com.woocommerce.android.util.RollingLogEntries.LogEntry> {
    private final int limit = 0;
    
    public RollingLogEntries(int limit) {
        super();
    }
    
    @kotlin.jvm.Synchronized()
    @java.lang.Override()
    public synchronized boolean add(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.RollingLogEntries.LogEntry element) {
        return false;
    }
    
    /**
     * Returns the log entries as a single string with each entry on a new line. Works with a copy of the log
     * entries in case they're modified while traversing them.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public boolean contains(com.woocommerce.android.util.RollingLogEntries.LogEntry element) {
        return false;
    }
    
    @java.lang.Override()
    public final boolean contains(java.lang.Object element) {
        return false;
    }
    
    @java.lang.Override()
    public int getSize() {
        return 0;
    }
    
    @java.lang.Override()
    public int indexOf(com.woocommerce.android.util.RollingLogEntries.LogEntry element) {
        return 0;
    }
    
    @java.lang.Override()
    public final int indexOf(java.lang.Object element) {
        return 0;
    }
    
    @java.lang.Override()
    public int lastIndexOf(com.woocommerce.android.util.RollingLogEntries.LogEntry element) {
        return 0;
    }
    
    @java.lang.Override()
    public final int lastIndexOf(java.lang.Object element) {
        return 0;
    }
    
    @java.lang.Override()
    public final com.woocommerce.android.util.RollingLogEntries.LogEntry remove(int p0) {
        return null;
    }
    
    @java.lang.Override()
    public boolean remove(com.woocommerce.android.util.RollingLogEntries.LogEntry element) {
        return false;
    }
    
    @java.lang.Override()
    public final boolean remove(java.lang.Object element) {
        return false;
    }
    
    @java.lang.Override()
    public com.woocommerce.android.util.RollingLogEntries.LogEntry removeAt(int p0) {
        return null;
    }
    
    @java.lang.Override()
    public final int size() {
        return 0;
    }
    
    /**
     * Individual log entry
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0011\u001a\u00020\u0007H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0012"}, d2 = {"Lcom/woocommerce/android/util/RollingLogEntries$LogEntry;", "", "tag", "Lcom/woocommerce/android/util/WooLog$T;", "level", "Lcom/woocommerce/android/util/WooLog$LogLevel;", "text", "", "(Lcom/woocommerce/android/util/WooLog$T;Lcom/woocommerce/android/util/WooLog$LogLevel;Ljava/lang/String;)V", "getLevel", "()Lcom/woocommerce/android/util/WooLog$LogLevel;", "logDate", "Ljava/util/Date;", "getTag", "()Lcom/woocommerce/android/util/WooLog$T;", "getText", "()Ljava/lang/String;", "toString", "WooCommerce_vanillaDebug"})
    public static final class LogEntry {
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.util.WooLog.T tag = null;
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.util.WooLog.LogLevel level = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String text = null;
        private final java.util.Date logDate = null;
        
        public LogEntry(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.util.WooLog.T tag, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.util.WooLog.LogLevel level, @org.jetbrains.annotations.Nullable()
        java.lang.String text) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.util.WooLog.T getTag() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.util.WooLog.LogLevel getLevel() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getText() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
    }
}