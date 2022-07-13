package com.woocommerce.android.ui.shipping;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0006\u0013\u0014\u0015\u0016\u0017\u0018B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0019"}, d2 = {"Lcom/woocommerce/android/ui/shipping/InstallWcShippingFlowViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)V", "installWcShippingFlowState", "Landroidx/lifecycle/LiveData;", "Lcom/woocommerce/android/ui/shipping/InstallWcShippingFlowViewModel$InstallWcShippingState;", "getInstallWcShippingFlowState", "()Landroidx/lifecycle/LiveData;", "getBulletPointsForInstallingWcShippingFlow", "", "Lcom/woocommerce/android/ui/shipping/InstallWcShippingFlowViewModel$InstallWcShippingOnboardingBulletUi;", "onDismissWcShippingFlowClicked", "", "onInstallWcShippingClicked", "onLinkClicked", "url", "", "Companion", "InstallWcShipping", "InstallWcShippingFlowEvent", "InstallWcShippingOnboardingBulletUi", "InstallWcShippingOnboardingUi", "InstallWcShippingState", "WooCommerce_vanillaDebug"})
public final class InstallWcShippingFlowViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    @org.jetbrains.annotations.NotNull()
    private static final com.woocommerce.android.ui.shipping.InstallWcShippingFlowViewModel.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    @java.lang.Deprecated()
    public static final java.lang.String WC_SHIPPING_INFO_URL = "https://woocommerce.com/woocommerce-shipping/";
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.woocommerce.android.ui.shipping.InstallWcShippingFlowViewModel.InstallWcShippingState> installWcShippingFlowState = null;
    
    @javax.inject.Inject()
    public InstallWcShippingFlowViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedState) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.woocommerce.android.ui.shipping.InstallWcShippingFlowViewModel.InstallWcShippingState> getInstallWcShippingFlowState() {
        return null;
    }
    
    private final java.util.List<com.woocommerce.android.ui.shipping.InstallWcShippingFlowViewModel.InstallWcShippingOnboardingBulletUi> getBulletPointsForInstallingWcShippingFlow() {
        return null;
    }
    
    private final void onInstallWcShippingClicked() {
    }
    
    private final void onDismissWcShippingFlowClicked() {
    }
    
    private final void onLinkClicked(java.lang.String url) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/ui/shipping/InstallWcShippingFlowViewModel$InstallWcShippingFlowEvent;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "()V", "ExitInstallFlowEvent", "OpenLinkEvent", "Lcom/woocommerce/android/ui/shipping/InstallWcShippingFlowViewModel$InstallWcShippingFlowEvent$ExitInstallFlowEvent;", "Lcom/woocommerce/android/ui/shipping/InstallWcShippingFlowViewModel$InstallWcShippingFlowEvent$OpenLinkEvent;", "WooCommerce_vanillaDebug"})
    public static abstract class InstallWcShippingFlowEvent extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        
        private InstallWcShippingFlowEvent() {
            super(false);
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/shipping/InstallWcShippingFlowViewModel$InstallWcShippingFlowEvent$ExitInstallFlowEvent;", "Lcom/woocommerce/android/ui/shipping/InstallWcShippingFlowViewModel$InstallWcShippingFlowEvent;", "()V", "WooCommerce_vanillaDebug"})
        public static final class ExitInstallFlowEvent extends com.woocommerce.android.ui.shipping.InstallWcShippingFlowViewModel.InstallWcShippingFlowEvent {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.shipping.InstallWcShippingFlowViewModel.InstallWcShippingFlowEvent.ExitInstallFlowEvent INSTANCE = null;
            
            private ExitInstallFlowEvent() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/woocommerce/android/ui/shipping/InstallWcShippingFlowViewModel$InstallWcShippingFlowEvent$OpenLinkEvent;", "Lcom/woocommerce/android/ui/shipping/InstallWcShippingFlowViewModel$InstallWcShippingFlowEvent;", "url", "", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_vanillaDebug"})
        public static final class OpenLinkEvent extends com.woocommerce.android.ui.shipping.InstallWcShippingFlowViewModel.InstallWcShippingFlowEvent {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String url = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.shipping.InstallWcShippingFlowViewModel.InstallWcShippingFlowEvent.OpenLinkEvent copy(@org.jetbrains.annotations.NotNull()
            java.lang.String url) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public OpenLinkEvent(@org.jetbrains.annotations.NotNull()
            java.lang.String url) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getUrl() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/woocommerce/android/ui/shipping/InstallWcShippingFlowViewModel$InstallWcShippingState;", "", "installWcShippingOnboardingUi", "Lcom/woocommerce/android/ui/shipping/InstallWcShippingFlowViewModel$InstallWcShippingOnboardingUi;", "(Lcom/woocommerce/android/ui/shipping/InstallWcShippingFlowViewModel$InstallWcShippingOnboardingUi;)V", "getInstallWcShippingOnboardingUi", "()Lcom/woocommerce/android/ui/shipping/InstallWcShippingFlowViewModel$InstallWcShippingOnboardingUi;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class InstallWcShippingState {
        @org.jetbrains.annotations.Nullable()
        private final com.woocommerce.android.ui.shipping.InstallWcShippingFlowViewModel.InstallWcShippingOnboardingUi installWcShippingOnboardingUi = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.shipping.InstallWcShippingFlowViewModel.InstallWcShippingState copy(@org.jetbrains.annotations.Nullable()
        com.woocommerce.android.ui.shipping.InstallWcShippingFlowViewModel.InstallWcShippingOnboardingUi installWcShippingOnboardingUi) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public InstallWcShippingState() {
            super();
        }
        
        public InstallWcShippingState(@org.jetbrains.annotations.Nullable()
        com.woocommerce.android.ui.shipping.InstallWcShippingFlowViewModel.InstallWcShippingOnboardingUi installWcShippingOnboardingUi) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.woocommerce.android.ui.shipping.InstallWcShippingFlowViewModel.InstallWcShippingOnboardingUi component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.woocommerce.android.ui.shipping.InstallWcShippingFlowViewModel.InstallWcShippingOnboardingUi getInstallWcShippingOnboardingUi() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000f\u00a2\u0006\u0002\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J\t\u0010 \u001a\u00020\tH\u00c6\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u00c6\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u00c6\u0003J\u0015\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000fH\u00c6\u0003Jm\u0010$\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000fH\u00c6\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010(\u001a\u00020\u0003H\u00d6\u0001J\t\u0010)\u001a\u00020\tH\u00d6\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001b\u00a8\u0006*"}, d2 = {"Lcom/woocommerce/android/ui/shipping/InstallWcShippingFlowViewModel$InstallWcShippingOnboardingUi;", "", "title", "", "subtitle", "bullets", "", "Lcom/woocommerce/android/ui/shipping/InstallWcShippingFlowViewModel$InstallWcShippingOnboardingBulletUi;", "linkUrl", "", "onInstallClicked", "Lkotlin/Function0;", "", "onDismissFlowClicked", "onLinkClicked", "Lkotlin/Function1;", "(IILjava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "getBullets", "()Ljava/util/List;", "getLinkUrl", "()Ljava/lang/String;", "getOnDismissFlowClicked", "()Lkotlin/jvm/functions/Function0;", "getOnInstallClicked", "getOnLinkClicked", "()Lkotlin/jvm/functions/Function1;", "getSubtitle", "()I", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "WooCommerce_vanillaDebug"})
    public static final class InstallWcShippingOnboardingUi {
        private final int title = 0;
        private final int subtitle = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.woocommerce.android.ui.shipping.InstallWcShippingFlowViewModel.InstallWcShippingOnboardingBulletUi> bullets = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String linkUrl = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function0<kotlin.Unit> onInstallClicked = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function0<kotlin.Unit> onDismissFlowClicked = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> onLinkClicked = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.shipping.InstallWcShippingFlowViewModel.InstallWcShippingOnboardingUi copy(@androidx.annotation.StringRes()
        int title, @androidx.annotation.StringRes()
        int subtitle, @org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.ui.shipping.InstallWcShippingFlowViewModel.InstallWcShippingOnboardingBulletUi> bullets, @org.jetbrains.annotations.NotNull()
        java.lang.String linkUrl, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onInstallClicked, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onDismissFlowClicked, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onLinkClicked) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public InstallWcShippingOnboardingUi(@androidx.annotation.StringRes()
        int title, @androidx.annotation.StringRes()
        int subtitle, @org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.ui.shipping.InstallWcShippingFlowViewModel.InstallWcShippingOnboardingBulletUi> bullets, @org.jetbrains.annotations.NotNull()
        java.lang.String linkUrl, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onInstallClicked, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onDismissFlowClicked, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onLinkClicked) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getTitle() {
            return 0;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int getSubtitle() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.ui.shipping.InstallWcShippingFlowViewModel.InstallWcShippingOnboardingBulletUi> component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.ui.shipping.InstallWcShippingFlowViewModel.InstallWcShippingOnboardingBulletUi> getBullets() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLinkUrl() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function0<kotlin.Unit> component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnInstallClicked() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function0<kotlin.Unit> component6() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnDismissFlowClicked() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> component7() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOnLinkClicked() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/woocommerce/android/ui/shipping/InstallWcShippingFlowViewModel$InstallWcShippingOnboardingBulletUi;", "", "title", "", "description", "icon", "(III)V", "getDescription", "()I", "getIcon", "getTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class InstallWcShippingOnboardingBulletUi {
        private final int title = 0;
        private final int description = 0;
        private final int icon = 0;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.shipping.InstallWcShippingFlowViewModel.InstallWcShippingOnboardingBulletUi copy(@androidx.annotation.StringRes()
        int title, @androidx.annotation.StringRes()
        int description, @androidx.annotation.DrawableRes()
        int icon) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public InstallWcShippingOnboardingBulletUi(@androidx.annotation.StringRes()
        int title, @androidx.annotation.StringRes()
        int description, @androidx.annotation.DrawableRes()
        int icon) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getTitle() {
            return 0;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int getDescription() {
            return 0;
        }
        
        public final int component3() {
            return 0;
        }
        
        public final int getIcon() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/shipping/InstallWcShippingFlowViewModel$InstallWcShipping;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "()V", "WooCommerce_vanillaDebug"})
    public static final class InstallWcShipping extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        @org.jetbrains.annotations.NotNull()
        public static final com.woocommerce.android.ui.shipping.InstallWcShippingFlowViewModel.InstallWcShipping INSTANCE = null;
        
        private InstallWcShipping() {
            super(false);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/shipping/InstallWcShippingFlowViewModel$Companion;", "", "()V", "WC_SHIPPING_INFO_URL", "", "WooCommerce_vanillaDebug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}