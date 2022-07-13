package com.woocommerce.android.ui.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\u001a\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0016\u0010\u0010\u001a\u00020\n*\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\u0013H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0015"}, d2 = {"Lcom/woocommerce/android/ui/common/InfoScreenFragment;", "Landroidx/fragment/app/Fragment;", "()V", "navArgs", "Lcom/woocommerce/android/ui/common/InfoScreenFragmentArgs;", "getNavArgs", "()Lcom/woocommerce/android/ui/common/InfoScreenFragmentArgs;", "navArgs$delegate", "Landroidx/navigation/NavArgsLazy;", "onResume", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "showTextOrHide", "Landroid/widget/TextView;", "stringRes", "", "InfoScreenLinkAction", "WooCommerce_vanillaDebug"})
public final class InfoScreenFragment extends androidx.fragment.app.Fragment {
    private final androidx.navigation.NavArgsLazy navArgs$delegate = null;
    
    public InfoScreenFragment() {
        super();
    }
    
    private final com.woocommerce.android.ui.common.InfoScreenFragmentArgs getNavArgs() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    private final void showTextOrHide(android.widget.TextView $this$showTextOrHide, @androidx.annotation.StringRes()
    int stringRes) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/common/InfoScreenFragment$InfoScreenLinkAction;", "Ljava/io/Serializable;", "()V", "LearnMoreAboutShippingLabels", "Lcom/woocommerce/android/ui/common/InfoScreenFragment$InfoScreenLinkAction$LearnMoreAboutShippingLabels;", "WooCommerce_vanillaDebug"})
    public static abstract class InfoScreenLinkAction implements java.io.Serializable {
        
        private InfoScreenLinkAction() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/common/InfoScreenFragment$InfoScreenLinkAction$LearnMoreAboutShippingLabels;", "Lcom/woocommerce/android/ui/common/InfoScreenFragment$InfoScreenLinkAction;", "()V", "LINK", "", "WooCommerce_vanillaDebug"})
        public static final class LearnMoreAboutShippingLabels extends com.woocommerce.android.ui.common.InfoScreenFragment.InfoScreenLinkAction {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.common.InfoScreenFragment.InfoScreenLinkAction.LearnMoreAboutShippingLabels INSTANCE = null;
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String LINK = "https://woocommerce.com/products/shipping/";
            
            private LearnMoreAboutShippingLabels() {
                super();
            }
        }
    }
}