package nl.rijksoverheid.en.beagle;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002()B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\u0018\u0010%\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020$2\u0006\u0010&\u001a\u00020\'H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R&\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0007X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082T\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@RX\u0096\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\rX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\t\"\u0004\b\u0019\u0010\u000bR\u001e\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u0016@RX\u0096\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006*"}, d2 = {"Lnl/rijksoverheid/en/beagle/BeagleHelperImpl;", "Lnl/rijksoverheid/en/beagle/BeagleHelper;", "()V", "debugFeatureFlags", "", "Lnl/rijksoverheid/en/api/model/FeatureFlag;", "getDebugFeatureFlags", "Lkotlin/Function0;", "getGetDebugFeatureFlags", "()Lkotlin/jvm/functions/Function0;", "setGetDebugFeatureFlags", "(Lkotlin/jvm/functions/Function0;)V", "keySharingHeaderId", "", "previouslyKnownExposureDateId", "<set-?>", "", "testExposureDaysAgo", "getTestExposureDaysAgo", "()I", "testNotificationExposureDaysAgoId", "useDebugFeatureFlagSetting", "", "useDebugFeatureFlags", "getUseDebugFeatureFlags", "setUseDebugFeatureFlags", "useDefaultGuidance", "getUseDefaultGuidance", "()Z", "initialize", "", "application", "Landroid/app/Application;", "observePreviousExposureDate", "Lkotlinx/coroutines/Job;", "context", "Landroid/content/Context;", "setBeagleModules", "labTestRepository", "Lnl/rijksoverheid/en/labtest/LabTestRepository;", "FeatureFlagGroupOption", "RadioGroupOption", "app_tstDebug"})
public final class BeagleHelperImpl implements nl.rijksoverheid.en.beagle.BeagleHelper {
    private static boolean useDefaultGuidance = false;
    private static boolean useDebugFeatureFlagSetting = false;
    @org.jetbrains.annotations.NotNull()
    private static kotlin.jvm.functions.Function0<java.lang.Boolean> useDebugFeatureFlags;
    private static int testExposureDaysAgo = 5;
    private static java.util.List<nl.rijksoverheid.en.api.model.FeatureFlag> debugFeatureFlags;
    @org.jetbrains.annotations.NotNull()
    private static kotlin.jvm.functions.Function0<? extends java.util.List<nl.rijksoverheid.en.api.model.FeatureFlag>> getDebugFeatureFlags;
    private static final java.lang.String testNotificationExposureDaysAgoId = "testNotificationExposureDaysAgo";
    private static final java.lang.String previouslyKnownExposureDateId = "previouslyKnownExposureDate";
    private static final java.lang.String keySharingHeaderId = "keySharingHeader";
    @org.jetbrains.annotations.NotNull()
    public static final nl.rijksoverheid.en.beagle.BeagleHelperImpl INSTANCE = null;
    
    @java.lang.Override()
    public boolean getUseDefaultGuidance() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.jvm.functions.Function0<java.lang.Boolean> getUseDebugFeatureFlags() {
        return null;
    }
    
    public void setUseDebugFeatureFlags(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<java.lang.Boolean> p0) {
    }
    
    @java.lang.Override()
    public int getTestExposureDaysAgo() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.jvm.functions.Function0<java.util.List<nl.rijksoverheid.en.api.model.FeatureFlag>> getGetDebugFeatureFlags() {
        return null;
    }
    
    public void setGetDebugFeatureFlags(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends java.util.List<nl.rijksoverheid.en.api.model.FeatureFlag>> p0) {
    }
    
    @java.lang.Override()
    public void initialize(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
    }
    
    private final void setBeagleModules(android.content.Context context, nl.rijksoverheid.en.labtest.LabTestRepository labTestRepository) {
    }
    
    private final kotlinx.coroutines.Job observePreviousExposureDate(android.content.Context context) {
        return null;
    }
    
    private BeagleHelperImpl() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0018"}, d2 = {"Lnl/rijksoverheid/en/beagle/BeagleHelperImpl$RadioGroupOption;", "Lcom/pandulapeter/beagle/common/contracts/BeagleListItemContract;", "id", "", "value", "", "(Ljava/lang/String;I)V", "getId", "()Ljava/lang/String;", "title", "Lcom/pandulapeter/beagle/common/configuration/Text;", "getTitle", "()Lcom/pandulapeter/beagle/common/configuration/Text;", "getValue", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "app_tstDebug"})
    public static final class RadioGroupOption implements com.pandulapeter.beagle.common.contracts.BeagleListItemContract {
        @org.jetbrains.annotations.NotNull()
        private final com.pandulapeter.beagle.common.configuration.Text title = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String id = null;
        private final int value = 0;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.pandulapeter.beagle.common.configuration.Text getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getId() {
            return null;
        }
        
        public final int getValue() {
            return 0;
        }
        
        public RadioGroupOption(@org.jetbrains.annotations.NotNull()
        java.lang.String id, int value) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final nl.rijksoverheid.en.beagle.BeagleHelperImpl.RadioGroupOption copy(@org.jetbrains.annotations.NotNull()
        java.lang.String id, int value) {
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
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\bH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0018"}, d2 = {"Lnl/rijksoverheid/en/beagle/BeagleHelperImpl$FeatureFlagGroupOption;", "Lcom/pandulapeter/beagle/common/contracts/BeagleListItemContract;", "featureFlagOption", "Lnl/rijksoverheid/en/api/model/FeatureFlagOption;", "(Lnl/rijksoverheid/en/api/model/FeatureFlagOption;)V", "getFeatureFlagOption", "()Lnl/rijksoverheid/en/api/model/FeatureFlagOption;", "id", "", "getId", "()Ljava/lang/String;", "title", "Lcom/pandulapeter/beagle/common/configuration/Text;", "getTitle", "()Lcom/pandulapeter/beagle/common/configuration/Text;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_tstDebug"})
    public static final class FeatureFlagGroupOption implements com.pandulapeter.beagle.common.contracts.BeagleListItemContract {
        @org.jetbrains.annotations.NotNull()
        private final com.pandulapeter.beagle.common.configuration.Text title = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String id = null;
        @org.jetbrains.annotations.NotNull()
        private final nl.rijksoverheid.en.api.model.FeatureFlagOption featureFlagOption = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.pandulapeter.beagle.common.configuration.Text getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final nl.rijksoverheid.en.api.model.FeatureFlagOption getFeatureFlagOption() {
            return null;
        }
        
        public FeatureFlagGroupOption(@org.jetbrains.annotations.NotNull()
        nl.rijksoverheid.en.api.model.FeatureFlagOption featureFlagOption) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final nl.rijksoverheid.en.api.model.FeatureFlagOption component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final nl.rijksoverheid.en.beagle.BeagleHelperImpl.FeatureFlagGroupOption copy(@org.jetbrains.annotations.NotNull()
        nl.rijksoverheid.en.api.model.FeatureFlagOption featureFlagOption) {
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