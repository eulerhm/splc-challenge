package nl.rijksoverheid.en;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lnl/rijksoverheid/en/ProcessExposureKeysResult;", "", "()V", "Error", "ExposureApiError", "ServerError", "Success", "Lnl/rijksoverheid/en/ProcessExposureKeysResult$Success;", "Lnl/rijksoverheid/en/ProcessExposureKeysResult$ServerError;", "Lnl/rijksoverheid/en/ProcessExposureKeysResult$ExposureApiError;", "Lnl/rijksoverheid/en/ProcessExposureKeysResult$Error;", "app_accDebug"})
public abstract class ProcessExposureKeysResult {
    
    private ProcessExposureKeysResult() {
        super();
    }
    
    /**
     * Keys processed successfully
     */
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lnl/rijksoverheid/en/ProcessExposureKeysResult$Success;", "Lnl/rijksoverheid/en/ProcessExposureKeysResult;", "()V", "app_accDebug"})
    public static final class Success extends nl.rijksoverheid.en.ProcessExposureKeysResult {
        @org.jetbrains.annotations.NotNull()
        public static final nl.rijksoverheid.en.ProcessExposureKeysResult.Success INSTANCE = null;
        
        private Success() {
            super();
        }
    }
    
    /**
     * A server error occurred
     */
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lnl/rijksoverheid/en/ProcessExposureKeysResult$ServerError;", "Lnl/rijksoverheid/en/ProcessExposureKeysResult;", "()V", "app_accDebug"})
    public static final class ServerError extends nl.rijksoverheid.en.ProcessExposureKeysResult {
        @org.jetbrains.annotations.NotNull()
        public static final nl.rijksoverheid.en.ProcessExposureKeysResult.ServerError INSTANCE = null;
        
        private ServerError() {
            super();
        }
    }
    
    /**
     * Error while processing through the exposure notifications API
     */
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lnl/rijksoverheid/en/ProcessExposureKeysResult$ExposureApiError;", "Lnl/rijksoverheid/en/ProcessExposureKeysResult;", "diagnosisKeysResult", "Lnl/rijksoverheid/en/enapi/DiagnosisKeysResult;", "(Lnl/rijksoverheid/en/enapi/DiagnosisKeysResult;)V", "getDiagnosisKeysResult", "()Lnl/rijksoverheid/en/enapi/DiagnosisKeysResult;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_accDebug"})
    public static final class ExposureApiError extends nl.rijksoverheid.en.ProcessExposureKeysResult {
        @org.jetbrains.annotations.NotNull()
        private final nl.rijksoverheid.en.enapi.DiagnosisKeysResult diagnosisKeysResult = null;
        
        @org.jetbrains.annotations.NotNull()
        public final nl.rijksoverheid.en.enapi.DiagnosisKeysResult getDiagnosisKeysResult() {
            return null;
        }
        
        public ExposureApiError(@org.jetbrains.annotations.NotNull()
        nl.rijksoverheid.en.enapi.DiagnosisKeysResult diagnosisKeysResult) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final nl.rijksoverheid.en.enapi.DiagnosisKeysResult component1() {
            return null;
        }
        
        /**
         * Error while processing through the exposure notifications API
         */
        @org.jetbrains.annotations.NotNull()
        public final nl.rijksoverheid.en.ProcessExposureKeysResult.ExposureApiError copy(@org.jetbrains.annotations.NotNull()
        nl.rijksoverheid.en.enapi.DiagnosisKeysResult diagnosisKeysResult) {
            return null;
        }
        
        /**
         * Error while processing through the exposure notifications API
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        /**
         * Error while processing through the exposure notifications API
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * Error while processing through the exposure notifications API
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    /**
     * An error occurred
     */
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u00a2\u0006\u0002\u0010\u0005J\r\u0010\b\u001a\u00060\u0003j\u0002`\u0004H\u00c6\u0003J\u0017\u0010\t\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lnl/rijksoverheid/en/ProcessExposureKeysResult$Error;", "Lnl/rijksoverheid/en/ProcessExposureKeysResult;", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;)V", "getException", "()Ljava/lang/Exception;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_accDebug"})
    public static final class Error extends nl.rijksoverheid.en.ProcessExposureKeysResult {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.Exception exception = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Exception getException() {
            return null;
        }
        
        public Error(@org.jetbrains.annotations.NotNull()
        java.lang.Exception exception) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Exception component1() {
            return null;
        }
        
        /**
         * An error occurred
         */
        @org.jetbrains.annotations.NotNull()
        public final nl.rijksoverheid.en.ProcessExposureKeysResult.Error copy(@org.jetbrains.annotations.NotNull()
        java.lang.Exception exception) {
            return null;
        }
        
        /**
         * An error occurred
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        /**
         * An error occurred
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * An error occurred
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
}