package com.woocommerce.android.widgets;

import java.lang.System;

/**
 * The default behavior of a bottom sheet in landscape causes it to be cut off after the first item,
 * which makes sense for phones but not large tablets since there's usually plenty of room to show
 * more items. This simple BottomSheetDialogFragment wrapper resolves this by showing the entire
 * sheet on large landscape tablets.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0017\u00a8\u0006\t"}, d2 = {"Lcom/woocommerce/android/widgets/WCBottomSheetDialogFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "()V", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "WooCommerce_wasabiDebug"})
public class WCBottomSheetDialogFragment extends com.google.android.material.bottomsheet.BottomSheetDialogFragment {
    
    public WCBottomSheetDialogFragment() {
        super();
    }
    
    @androidx.annotation.CallSuper
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
}