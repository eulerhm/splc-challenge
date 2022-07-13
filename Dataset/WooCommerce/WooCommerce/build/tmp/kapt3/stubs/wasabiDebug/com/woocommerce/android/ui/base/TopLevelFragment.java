package com.woocommerce.android.ui.base;

import java.lang.System;

/**
 * The main fragments hosted by the bottom bar should extend this class
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0003B\u0011\b\u0016\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\u000eH&R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0010"}, d2 = {"Lcom/woocommerce/android/ui/base/TopLevelFragment;", "Lcom/woocommerce/android/ui/base/BaseFragment;", "Lcom/woocommerce/android/ui/base/TopLevelFragmentView;", "()V", "layoutId", "", "(I)V", "activityAppBarStatus", "Lcom/woocommerce/android/ui/main/AppBarStatus;", "getActivityAppBarStatus", "()Lcom/woocommerce/android/ui/main/AppBarStatus;", "onSearchViewActiveChanged", "", "isActive", "", "shouldExpandToolbar", "WooCommerce_wasabiDebug"})
public abstract class TopLevelFragment extends com.woocommerce.android.ui.base.BaseFragment implements com.woocommerce.android.ui.base.TopLevelFragmentView {
    
    public TopLevelFragment() {
        super();
    }
    
    public TopLevelFragment(@androidx.annotation.LayoutRes
    int layoutId) {
        super();
    }
    
    public abstract boolean shouldExpandToolbar();
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.woocommerce.android.ui.main.AppBarStatus getActivityAppBarStatus() {
        return null;
    }
    
    /**
     * Called when the fragment shows or hides a search view so we can properly disable the collapsing
     * toolbar when a search is active
     */
    public final void onSearchViewActiveChanged(boolean isActive) {
    }
}