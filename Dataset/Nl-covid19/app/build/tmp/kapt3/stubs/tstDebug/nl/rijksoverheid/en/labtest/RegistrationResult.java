package nl.rijksoverheid.en.labtest;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lnl/rijksoverheid/en/labtest/RegistrationResult;", "", "()V", "Success", "UnknownError", "Lnl/rijksoverheid/en/labtest/RegistrationResult$Success;", "Lnl/rijksoverheid/en/labtest/RegistrationResult$UnknownError;", "app_tstDebug"})
public abstract class RegistrationResult {
    
    private RegistrationResult() {
        super();
    }
    
    /**
     * Returns the code to show to the user in the UI
     */
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lnl/rijksoverheid/en/labtest/RegistrationResult$Success;", "Lnl/rijksoverheid/en/labtest/RegistrationResult;", "code", "", "(Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_tstDebug"})
    public static final class Success extends nl.rijksoverheid.en.labtest.RegistrationResult {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String code = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCode() {
            return null;
        }
        
        public Success(@org.jetbrains.annotations.NotNull()
        java.lang.String code) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        /**
         * Returns the code to show to the user in the UI
         */
        @org.jetbrains.annotations.NotNull()
        public final nl.rijksoverheid.en.labtest.RegistrationResult.Success copy(@org.jetbrains.annotations.NotNull()
        java.lang.String code) {
            return null;
        }
        
        /**
         * Returns the code to show to the user in the UI
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        /**
         * Returns the code to show to the user in the UI
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * Returns the code to show to the user in the UI
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    /**
     * The code could not be retrieved due to an error
     */
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lnl/rijksoverheid/en/labtest/RegistrationResult$UnknownError;", "Lnl/rijksoverheid/en/labtest/RegistrationResult;", "()V", "app_tstDebug"})
    public static final class UnknownError extends nl.rijksoverheid.en.labtest.RegistrationResult {
        @org.jetbrains.annotations.NotNull()
        public static final nl.rijksoverheid.en.labtest.RegistrationResult.UnknownError INSTANCE = null;
        
        private UnknownError() {
            super();
        }
    }
}