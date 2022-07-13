package com.woocommerce.android.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/ui/main/AppUpgradeActivityView;", "", "showAppUpdateFailedSnack", "", "actionListener", "Landroid/view/View$OnClickListener;", "showAppUpdateSuccessSnack", "WooCommerce_vanillaDebug"})
public abstract interface AppUpgradeActivityView {
    
    /**
     * Method to display a snackBar once the [AppUpdateType.FLEXIBLE] upgrade
     * is completed successfully
     */
    public abstract void showAppUpdateSuccessSnack(@org.jetbrains.annotations.NotNull()
    android.view.View.OnClickListener actionListener);
    
    /**
     * Method to display a snackBar once the [AppUpdateType.FLEXIBLE] upgrade
     * results in error
     */
    public abstract void showAppUpdateFailedSnack(@org.jetbrains.annotations.NotNull()
    android.view.View.OnClickListener actionListener);
}