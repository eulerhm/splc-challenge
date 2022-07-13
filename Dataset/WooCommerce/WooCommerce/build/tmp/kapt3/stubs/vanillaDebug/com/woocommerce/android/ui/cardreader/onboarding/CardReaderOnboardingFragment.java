package com.woocommerce.android.ui.cardreader.onboarding;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u001a\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0018\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0018H\u0002J\u0018\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u001aH\u0002J\u0018\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u001cH\u0002J\u0018\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u001eH\u0002J\u0018\u0010\u001f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020 H\u0002J\u0018\u0010!\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\"H\u0002J\u0018\u0010#\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020$H\u0002J\u0018\u0010%\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020&H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\'"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingFragment;", "Lcom/woocommerce/android/ui/base/BaseFragment;", "()V", "viewModel", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel;", "getViewModel", "()Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getFragmentTitle", "", "initObservers", "", "binding", "Lcom/woocommerce/android/databinding/FragmentCardReaderOnboardingBinding;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "showBothPluginsInstalledState", "state", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$WcPayAndStripeInstalledState;", "showCountryNotSupportedState", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$UnsupportedErrorState;", "showGenericErrorState", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$GenericErrorState;", "showLoadingState", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$LoadingState;", "showNetworkErrorState", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$NoConnectionErrorState;", "showOnboardingLayout", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState;", "showStripeAccountError", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$StripeAcountError;", "showStripeExtensionErrorState", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$StripeExtensionError;", "showWCPayErrorState", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingViewModel$OnboardingViewState$WCPayError;", "WooCommerce_vanillaDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class CardReaderOnboardingFragment extends com.woocommerce.android.ui.base.BaseFragment {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    
    public CardReaderOnboardingFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initObservers(com.woocommerce.android.databinding.FragmentCardReaderOnboardingBinding binding) {
    }
    
    private final void showOnboardingLayout(com.woocommerce.android.databinding.FragmentCardReaderOnboardingBinding binding, com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel.OnboardingViewState state) {
    }
    
    private final void showBothPluginsInstalledState(android.view.View view, com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel.OnboardingViewState.WcPayAndStripeInstalledState state) {
    }
    
    private final void showLoadingState(android.view.View view, com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel.OnboardingViewState.LoadingState state) {
    }
    
    private final void showGenericErrorState(android.view.View view, com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel.OnboardingViewState.GenericErrorState state) {
    }
    
    private final void showNetworkErrorState(android.view.View view, com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel.OnboardingViewState.NoConnectionErrorState state) {
    }
    
    private final void showStripeAccountError(android.view.View view, com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel.OnboardingViewState.StripeAcountError state) {
    }
    
    private final void showWCPayErrorState(android.view.View view, com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel.OnboardingViewState.WCPayError state) {
    }
    
    private final void showStripeExtensionErrorState(android.view.View view, com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel.OnboardingViewState.StripeExtensionError state) {
    }
    
    private final void showCountryNotSupportedState(android.view.View view, com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel.OnboardingViewState.UnsupportedErrorState state) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getFragmentTitle() {
        return null;
    }
}