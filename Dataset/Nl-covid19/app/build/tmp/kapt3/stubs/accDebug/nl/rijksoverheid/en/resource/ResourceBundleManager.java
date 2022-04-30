package nl.rijksoverheid.en.resource;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ)\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0013H\u0002J\u0011\u0010\u0016\u001a\u00020\u0013H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J0\u0010\u0017\u001a\u00020\u0018*\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00180\u001bH\u0002J\u001e\u0010\u001c\u001a\u00020\u0018*\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001d"}, d2 = {"Lnl/rijksoverheid/en/resource/ResourceBundleManager;", "", "context", "Landroid/content/Context;", "cdnService", "Lnl/rijksoverheid/en/api/CdnService;", "clock", "Ljava/time/Clock;", "useDefaultGuidance", "", "(Landroid/content/Context;Lnl/rijksoverheid/en/api/CdnService;Ljava/time/Clock;Z)V", "getExposureNotificationGuidance", "", "Lnl/rijksoverheid/en/api/model/ResourceBundle$Guidance$Element;", "exposureDate", "Ljava/time/LocalDate;", "notificationReceiveDate", "(Ljava/time/LocalDate;Ljava/time/LocalDate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getResourceBundleFromCacheOrNetwork", "Lnl/rijksoverheid/en/api/model/ResourceBundle;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadDefaultResourceBundle", "loadResourceBundle", "replaceExposureDateWithOffset", "", "token", "block", "Lkotlin/Function1;", "replacePlaceHolders", "app_accDebug"})
public final class ResourceBundleManager {
    private final android.content.Context context = null;
    private final nl.rijksoverheid.en.api.CdnService cdnService = null;
    private final java.time.Clock clock = null;
    private final boolean useDefaultGuidance = false;
    
    private final nl.rijksoverheid.en.api.model.ResourceBundle loadDefaultResourceBundle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getExposureNotificationGuidance(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate exposureDate, @org.jetbrains.annotations.Nullable()
    java.time.LocalDate notificationReceiveDate, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<? extends nl.rijksoverheid.en.api.model.ResourceBundle.Guidance.Element>> p2) {
        return null;
    }
    
    private final java.lang.String replacePlaceHolders(java.lang.String $this$replacePlaceHolders, java.time.LocalDate exposureDate, java.time.LocalDate notificationReceiveDate) {
        return null;
    }
    
    private final java.lang.String replaceExposureDateWithOffset(java.lang.String $this$replaceExposureDateWithOffset, java.time.LocalDate exposureDate, java.lang.String token, kotlin.jvm.functions.Function1<? super java.time.LocalDate, java.lang.String> block) {
        return null;
    }
    
    public ResourceBundleManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    nl.rijksoverheid.en.api.CdnService cdnService, @org.jetbrains.annotations.NotNull()
    java.time.Clock clock, boolean useDefaultGuidance) {
        super();
    }
}