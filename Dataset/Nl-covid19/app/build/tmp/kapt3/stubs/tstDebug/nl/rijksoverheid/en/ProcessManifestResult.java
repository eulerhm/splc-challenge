package nl.rijksoverheid.en;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lnl/rijksoverheid/en/ProcessManifestResult;", "", "()V", "Disabled", "Error", "Success", "Lnl/rijksoverheid/en/ProcessManifestResult$Success;", "Lnl/rijksoverheid/en/ProcessManifestResult$Disabled;", "Lnl/rijksoverheid/en/ProcessManifestResult$Error;", "app_tstDebug"})
public abstract class ProcessManifestResult {
    
    private ProcessManifestResult() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lnl/rijksoverheid/en/ProcessManifestResult$Success;", "Lnl/rijksoverheid/en/ProcessManifestResult;", "nextIntervalMinutes", "", "(I)V", "getNextIntervalMinutes", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_tstDebug"})
    public static final class Success extends nl.rijksoverheid.en.ProcessManifestResult {
        private final int nextIntervalMinutes = 0;
        
        public final int getNextIntervalMinutes() {
            return 0;
        }
        
        public Success(int nextIntervalMinutes) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final nl.rijksoverheid.en.ProcessManifestResult.Success copy(int nextIntervalMinutes) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lnl/rijksoverheid/en/ProcessManifestResult$Disabled;", "Lnl/rijksoverheid/en/ProcessManifestResult;", "()V", "app_tstDebug"})
    public static final class Disabled extends nl.rijksoverheid.en.ProcessManifestResult {
        @org.jetbrains.annotations.NotNull()
        public static final nl.rijksoverheid.en.ProcessManifestResult.Disabled INSTANCE = null;
        
        private Disabled() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lnl/rijksoverheid/en/ProcessManifestResult$Error;", "Lnl/rijksoverheid/en/ProcessManifestResult;", "()V", "app_tstDebug"})
    public static final class Error extends nl.rijksoverheid.en.ProcessManifestResult {
        @org.jetbrains.annotations.NotNull()
        public static final nl.rijksoverheid.en.ProcessManifestResult.Error INSTANCE = null;
        
        private Error() {
            super();
        }
    }
}