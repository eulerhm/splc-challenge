package com.woocommerce.android.ui.prefs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\u001a\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\f\u0010\u0010\u001a\u00020\n*\u00020\u0011H\u0002J\f\u0010\u0012\u001a\u00020\n*\u00020\u0011H\u0002J\u001c\u0010\u0013\u001a\u00020\n*\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u001d\u0010\u0003\u001a\u0004\u0018\u00010\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0019"}, d2 = {"Lcom/woocommerce/android/ui/prefs/BetaFeaturesFragment;", "Landroidx/fragment/app/Fragment;", "()V", "settingsListener", "Lcom/woocommerce/android/ui/prefs/MainSettingsFragment$AppSettingsListener;", "getSettingsListener", "()Lcom/woocommerce/android/ui/prefs/MainSettingsFragment$AppSettingsListener;", "settingsListener$delegate", "Lkotlin/Lazy;", "onResume", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "bindCouponsToggle", "Lcom/woocommerce/android/databinding/FragmentSettingsBetaBinding;", "bindProductAddonsToggle", "handleToggleChangeFailure", "switch", "Landroid/widget/CompoundButton;", "isChecked", "", "Companion", "WooCommerce_vanillaDebug"})
public final class BetaFeaturesFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.prefs.BetaFeaturesFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "beta-features";
    private final kotlin.Lazy settingsListener$delegate = null;
    
    public BetaFeaturesFragment() {
        super();
    }
    
    private final com.woocommerce.android.ui.prefs.MainSettingsFragment.AppSettingsListener getSettingsListener() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void bindProductAddonsToggle(com.woocommerce.android.databinding.FragmentSettingsBetaBinding $this$bindProductAddonsToggle) {
    }
    
    private final void bindCouponsToggle(com.woocommerce.android.databinding.FragmentSettingsBetaBinding $this$bindCouponsToggle) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    private final void handleToggleChangeFailure(com.woocommerce.android.databinding.FragmentSettingsBetaBinding $this$handleToggleChangeFailure, android.widget.CompoundButton p1_1702747034, boolean isChecked) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/prefs/BetaFeaturesFragment$Companion;", "", "()V", "TAG", "", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}