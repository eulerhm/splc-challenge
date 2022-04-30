package nl.rijksoverheid.en.onboarding;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\t\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006R\u0018\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lnl/rijksoverheid/en/onboarding/OnboardingRepository;", "", "sharedPreferences", "Landroid/content/SharedPreferences;", "googlePlayServicesUpToDateChecker", "Lkotlin/Function0;", "", "Lnl/rijksoverheid/en/onboarding/GooglePlayServicesUpToDateChecker;", "(Landroid/content/SharedPreferences;Lkotlin/jvm/functions/Function0;)V", "hasCompletedOnboarding", "isGooglePlayServicesUpToDate", "setHasCompletedOnboarding", "", "value", "app_accDebug"})
public final class OnboardingRepository {
    private final android.content.SharedPreferences sharedPreferences = null;
    private final kotlin.jvm.functions.Function0<java.lang.Boolean> googlePlayServicesUpToDateChecker = null;
    
    public final boolean hasCompletedOnboarding() {
        return false;
    }
    
    public final void setHasCompletedOnboarding(boolean value) {
    }
    
    public final boolean isGooglePlayServicesUpToDate() {
        return false;
    }
    
    public OnboardingRepository(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPreferences, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<java.lang.Boolean> googlePlayServicesUpToDateChecker) {
        super();
    }
}