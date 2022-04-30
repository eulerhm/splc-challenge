package nl.rijksoverheid.en;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lnl/rijksoverheid/en/AddExposureResult;", "", "()V", "Error", "Notify", "Processed", "Lnl/rijksoverheid/en/AddExposureResult$Processed;", "Lnl/rijksoverheid/en/AddExposureResult$Error;", "Lnl/rijksoverheid/en/AddExposureResult$Notify;", "app_tstDebug"})
public abstract class AddExposureResult {
    
    private AddExposureResult() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lnl/rijksoverheid/en/AddExposureResult$Processed;", "Lnl/rijksoverheid/en/AddExposureResult;", "()V", "app_tstDebug"})
    public static final class Processed extends nl.rijksoverheid.en.AddExposureResult {
        @org.jetbrains.annotations.NotNull()
        public static final nl.rijksoverheid.en.AddExposureResult.Processed INSTANCE = null;
        
        private Processed() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lnl/rijksoverheid/en/AddExposureResult$Error;", "Lnl/rijksoverheid/en/AddExposureResult;", "()V", "app_tstDebug"})
    public static final class Error extends nl.rijksoverheid.en.AddExposureResult {
        @org.jetbrains.annotations.NotNull()
        public static final nl.rijksoverheid.en.AddExposureResult.Error INSTANCE = null;
        
        private Error() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"Lnl/rijksoverheid/en/AddExposureResult$Notify;", "Lnl/rijksoverheid/en/AddExposureResult;", "dateOfLastExposure", "Ljava/time/LocalDate;", "notificationReceivedDate", "(Ljava/time/LocalDate;Ljava/time/LocalDate;)V", "getDateOfLastExposure", "()Ljava/time/LocalDate;", "getNotificationReceivedDate", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_tstDebug"})
    public static final class Notify extends nl.rijksoverheid.en.AddExposureResult {
        @org.jetbrains.annotations.NotNull()
        private final java.time.LocalDate dateOfLastExposure = null;
        @org.jetbrains.annotations.NotNull()
        private final java.time.LocalDate notificationReceivedDate = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.time.LocalDate getDateOfLastExposure() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.time.LocalDate getNotificationReceivedDate() {
            return null;
        }
        
        public Notify(@org.jetbrains.annotations.NotNull()
        java.time.LocalDate dateOfLastExposure, @org.jetbrains.annotations.NotNull()
        java.time.LocalDate notificationReceivedDate) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.time.LocalDate component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.time.LocalDate component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final nl.rijksoverheid.en.AddExposureResult.Notify copy(@org.jetbrains.annotations.NotNull()
        java.time.LocalDate dateOfLastExposure, @org.jetbrains.annotations.NotNull()
        java.time.LocalDate notificationReceivedDate) {
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
}