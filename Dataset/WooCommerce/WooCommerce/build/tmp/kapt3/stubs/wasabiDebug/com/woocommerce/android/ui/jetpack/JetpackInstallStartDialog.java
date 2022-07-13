package com.woocommerce.android.ui.jetpack;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u000f\u001a\u00020\fH\u0016J\u001a\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lcom/woocommerce/android/ui/jetpack/JetpackInstallStartDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "getSelectedSite", "()Lcom/woocommerce/android/tools/SelectedSite;", "setSelectedSite", "(Lcom/woocommerce/android/tools/SelectedSite;)V", "isTabletLandscape", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onViewCreated", "view", "Landroid/view/View;", "Companion", "WooCommerce_wasabiDebug"})
@dagger.hilt.android.AndroidEntryPoint
public final class JetpackInstallStartDialog extends androidx.fragment.app.DialogFragment {
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.jetpack.JetpackInstallStartDialog.Companion Companion = null;
    private static final float TABLET_LANDSCAPE_WIDTH_RATIO = 0.35F;
    private static final float TABLET_LANDSCAPE_HEIGHT_RATIO = 0.8F;
    @javax.inject.Inject
    public com.woocommerce.android.tools.SelectedSite selectedSite;
    
    public JetpackInstallStartDialog() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.tools.SelectedSite getSelectedSite() {
        return null;
    }
    
    public final void setSelectedSite(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.SelectedSite p0) {
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onStart() {
    }
    
    private final boolean isTabletLandscape() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/woocommerce/android/ui/jetpack/JetpackInstallStartDialog$Companion;", "", "()V", "TABLET_LANDSCAPE_HEIGHT_RATIO", "", "TABLET_LANDSCAPE_WIDTH_RATIO", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}