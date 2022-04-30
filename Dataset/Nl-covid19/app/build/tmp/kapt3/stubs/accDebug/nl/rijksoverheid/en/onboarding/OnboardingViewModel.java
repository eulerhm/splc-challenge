package nl.rijksoverheid.en.onboarding;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\n\u001a\u00020\rJ\u0006\u0010\u0017\u001a\u00020\rJ\u0006\u0010\u0018\u001a\u00020\rJ\u0006\u0010\u0019\u001a\u00020\rJ\u0006\u0010\u001a\u001a\u00020\rR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u001d\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000f\u00a8\u0006\u001b"}, d2 = {"Lnl/rijksoverheid/en/onboarding/OnboardingViewModel;", "Landroidx/lifecycle/ViewModel;", "onboardingRepository", "Lnl/rijksoverheid/en/onboarding/OnboardingRepository;", "exposureNotificationsRepository", "Lnl/rijksoverheid/en/ExposureNotificationsRepository;", "(Lnl/rijksoverheid/en/onboarding/OnboardingRepository;Lnl/rijksoverheid/en/ExposureNotificationsRepository;)V", "_isExposureNotificationApiUpToDate", "Landroidx/lifecycle/MutableLiveData;", "", "continueOnboarding", "Landroidx/lifecycle/LiveData;", "Lnl/rijksoverheid/en/lifecyle/Event;", "", "getContinueOnboarding", "()Landroidx/lifecycle/LiveData;", "isExposureNotificationApiUpToDate", "onboardingComplete", "getOnboardingComplete", "privacyPolicyConsentGiven", "getPrivacyPolicyConsentGiven", "skipConsentConfirmation", "getSkipConsentConfirmation", "finishOnboarding", "refreshExposureNotificationApiUpToDate", "skipConsent", "togglePrivacyPolicyConsent", "app_accDebug"})
public final class OnboardingViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<nl.rijksoverheid.en.lifecyle.Event<kotlin.Unit>> onboardingComplete = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<nl.rijksoverheid.en.lifecyle.Event<kotlin.Unit>> continueOnboarding = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<nl.rijksoverheid.en.lifecyle.Event<kotlin.Unit>> skipConsentConfirmation = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> privacyPolicyConsentGiven = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isExposureNotificationApiUpToDate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isExposureNotificationApiUpToDate = null;
    private final nl.rijksoverheid.en.onboarding.OnboardingRepository onboardingRepository = null;
    private final nl.rijksoverheid.en.ExposureNotificationsRepository exposureNotificationsRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<nl.rijksoverheid.en.lifecyle.Event<kotlin.Unit>> getOnboardingComplete() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<nl.rijksoverheid.en.lifecyle.Event<kotlin.Unit>> getContinueOnboarding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<nl.rijksoverheid.en.lifecyle.Event<kotlin.Unit>> getSkipConsentConfirmation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getPrivacyPolicyConsentGiven() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isExposureNotificationApiUpToDate() {
        return null;
    }
    
    public final void finishOnboarding() {
    }
    
    public final void skipConsent() {
    }
    
    public final void togglePrivacyPolicyConsent() {
    }
    
    public final void continueOnboarding() {
    }
    
    public final void refreshExposureNotificationApiUpToDate() {
    }
    
    public OnboardingViewModel(@org.jetbrains.annotations.NotNull()
    nl.rijksoverheid.en.onboarding.OnboardingRepository onboardingRepository, @org.jetbrains.annotations.NotNull()
    nl.rijksoverheid.en.ExposureNotificationsRepository exposureNotificationsRepository) {
        super();
    }
}