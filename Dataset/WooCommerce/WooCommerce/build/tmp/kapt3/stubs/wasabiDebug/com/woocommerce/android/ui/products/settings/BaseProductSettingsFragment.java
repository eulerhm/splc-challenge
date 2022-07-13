package com.woocommerce.android.ui.products.settings;

import java.lang.System;

/**
 * All fragments shown from the main product settings fragment should extend this class.
 * The main settings fragment extends from BaseProductFragment and handles all the
 * communication with the shared product ViewModel. Fragments which extend this are
 * expected to be lightweight.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0003B\u0011\b\u0016\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\fH\u0017J\b\u0010\u0010\u001a\u00020\u000eH\u0017J\b\u0010\u0011\u001a\u00020\fH&\u00a8\u0006\u0012"}, d2 = {"Lcom/woocommerce/android/ui/products/settings/BaseProductSettingsFragment;", "Lcom/woocommerce/android/ui/base/BaseFragment;", "Lcom/woocommerce/android/ui/main/MainActivity$Companion$BackPressListener;", "()V", "layoutId", "", "(I)V", "getChangesResult", "Lkotlin/Pair;", "", "", "hasChanges", "", "navigateBackWithResult", "", "onRequestAllowBackPress", "onStop", "validateChanges", "WooCommerce_wasabiDebug"})
public abstract class BaseProductSettingsFragment extends com.woocommerce.android.ui.base.BaseFragment implements com.woocommerce.android.ui.main.MainActivity.Companion.BackPressListener {
    
    public BaseProductSettingsFragment() {
        super();
    }
    
    public BaseProductSettingsFragment(@androidx.annotation.LayoutRes
    int layoutId) {
        super();
    }
    
    @androidx.annotation.CallSuper
    @java.lang.Override
    public void onStop() {
    }
    
    @androidx.annotation.CallSuper
    @java.lang.Override
    public boolean onRequestAllowBackPress() {
        return false;
    }
    
    /**
     * Navigates back to the main product settings fragment and passes it a bundle containing the changes
     */
    private final void navigateBackWithResult() {
    }
    
    /**
     * Descendants should override this to return a Pair with a key and the result to pass
     */
    @org.jetbrains.annotations.NotNull
    public abstract kotlin.Pair<java.lang.String, java.lang.Object> getChangesResult();
    
    /**
     * Descendants should override this to return true if changes have been made
     */
    public abstract boolean hasChanges();
    
    /**
     * Descendants should override this to validate any changes and return true if validation passes
     */
    public abstract boolean validateChanges();
}