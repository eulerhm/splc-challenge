package com.woocommerce.android.ui.analytics;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u000fH\u0016J\u001a\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u000fH\u0002J\b\u0010 \u001a\u00020\u000fH\u0016J\u0010\u0010!\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\tH\u0002J\b\u0010\"\u001a\u00020#H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u00a8\u0006%"}, d2 = {"Lcom/woocommerce/android/ui/analytics/AnalyticsFragment;", "Lcom/woocommerce/android/ui/base/TopLevelFragment;", "()V", "_binding", "Lcom/woocommerce/android/databinding/FragmentAnalyticsBinding;", "binding", "getBinding", "()Lcom/woocommerce/android/databinding/FragmentAnalyticsBinding;", "viewModel", "Lcom/woocommerce/android/ui/analytics/AnalyticsViewModel;", "getViewModel", "()Lcom/woocommerce/android/ui/analytics/AnalyticsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "bind", "", "view", "Landroid/view/View;", "buildDialogDateRangeSelectorArguments", "Landroidx/navigation/NavDirections;", "getDateRangeSelectorViewState", "Lcom/woocommerce/android/ui/analytics/daterangeselector/AnalyticsDateRangeSelectorViewState;", "getFragmentTitle", "", "handleStateChange", "viewState", "Lcom/woocommerce/android/ui/analytics/AnalyticsViewState;", "onDestroyView", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "openDateRangeSelector", "scrollToTop", "setupResultHandlers", "shouldExpandToolbar", "", "Companion", "WooCommerce_vanillaDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class AnalyticsFragment extends com.woocommerce.android.ui.base.TopLevelFragment {
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.analytics.AnalyticsFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_DATE_RANGE_SELECTOR_RESULT = "key_order_status_result";
    private final kotlin.Lazy viewModel$delegate = null;
    private com.woocommerce.android.databinding.FragmentAnalyticsBinding _binding;
    
    public AnalyticsFragment() {
        super();
    }
    
    private final com.woocommerce.android.ui.analytics.AnalyticsViewModel getViewModel() {
        return null;
    }
    
    private final com.woocommerce.android.databinding.FragmentAnalyticsBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getFragmentTitle() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public boolean shouldExpandToolbar() {
        return false;
    }
    
    @java.lang.Override()
    public void scrollToTop() {
    }
    
    private final void openDateRangeSelector() {
    }
    
    private final androidx.navigation.NavDirections buildDialogDateRangeSelectorArguments() {
        return null;
    }
    
    private final void setupResultHandlers(com.woocommerce.android.ui.analytics.AnalyticsViewModel viewModel) {
    }
    
    private final void bind(android.view.View view) {
    }
    
    private final void handleStateChange(com.woocommerce.android.ui.analytics.AnalyticsViewState viewState) {
    }
    
    private final com.woocommerce.android.ui.analytics.daterangeselector.AnalyticsDateRangeSelectorViewState getDateRangeSelectorViewState() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/analytics/AnalyticsFragment$Companion;", "", "()V", "KEY_DATE_RANGE_SELECTOR_RESULT", "", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}