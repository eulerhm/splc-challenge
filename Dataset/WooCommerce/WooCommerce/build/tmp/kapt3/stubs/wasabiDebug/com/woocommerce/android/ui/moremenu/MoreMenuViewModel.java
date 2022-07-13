package com.woocommerce.android.ui.moremenu;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0002()B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\'\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001bH\u0002J\b\u0010\u001d\u001a\u00020\u001bH\u0002J\u0006\u0010\u001e\u001a\u00020\u001bJ\u0006\u0010\u001f\u001a\u00020\u001bJ\b\u0010 \u001a\u00020\u001bH\u0002J\b\u0010!\u001a\u00020\u001bH\u0002J\u0010\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020$H\u0002J\f\u0010%\u001a\u00020$*\u00020&H\u0002J\f\u0010\'\u001a\u00020$*\u00020&H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006*"}, d2 = {"Lcom/woocommerce/android/ui/moremenu/MoreMenuViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "accountStore", "Lorg/wordpress/android/fluxc/store/AccountStore;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "moreMenuRepository", "Lcom/woocommerce/android/ui/moremenu/domain/MoreMenuRepository;", "unseenReviewsCountHandler", "Lcom/woocommerce/android/push/UnseenReviewsCountHandler;", "(Landroidx/lifecycle/SavedStateHandle;Lorg/wordpress/android/fluxc/store/AccountStore;Lcom/woocommerce/android/tools/SelectedSite;Lcom/woocommerce/android/ui/moremenu/domain/MoreMenuRepository;Lcom/woocommerce/android/push/UnseenReviewsCountHandler;)V", "moreMenuViewState", "Landroidx/lifecycle/LiveData;", "Lcom/woocommerce/android/ui/moremenu/MoreMenuViewModel$MoreMenuViewState;", "getMoreMenuViewState", "()Landroidx/lifecycle/LiveData;", "generateMenuButtons", "", "Lcom/woocommerce/android/ui/moremenu/MenuUiButton;", "unseenReviewsCount", "", "isCouponsEnabled", "", "(IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCouponsButtonClick", "", "onInboxButtonClick", "onReviewsButtonClick", "onSettingsClick", "onSwitchStoreClick", "onViewAdminButtonClick", "onViewStoreButtonClick", "trackMoreMenuOptionSelected", "selectedOption", "", "getSelectedSiteAbsoluteUrl", "Lorg/wordpress/android/fluxc/model/SiteModel;", "getSelectedSiteName", "MoreMenuEvent", "MoreMenuViewState", "WooCommerce_wasabiDebug"})
public final class MoreMenuViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    private final com.woocommerce.android.ui.moremenu.domain.MoreMenuRepository moreMenuRepository = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.woocommerce.android.ui.moremenu.MoreMenuViewModel.MoreMenuViewState> moreMenuViewState = null;
    
    @javax.inject.Inject
    public MoreMenuViewModel(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.AccountStore accountStore, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.SelectedSite selectedSite, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.moremenu.domain.MoreMenuRepository moreMenuRepository, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.push.UnseenReviewsCountHandler unseenReviewsCountHandler) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.woocommerce.android.ui.moremenu.MoreMenuViewModel.MoreMenuViewState> getMoreMenuViewState() {
        return null;
    }
    
    private final java.lang.Object generateMenuButtons(int unseenReviewsCount, boolean isCouponsEnabled, kotlin.coroutines.Continuation<? super java.util.List<com.woocommerce.android.ui.moremenu.MenuUiButton>> continuation) {
        return null;
    }
    
    private final java.lang.String getSelectedSiteName(org.wordpress.android.fluxc.model.SiteModel $this$getSelectedSiteName) {
        return null;
    }
    
    private final java.lang.String getSelectedSiteAbsoluteUrl(org.wordpress.android.fluxc.model.SiteModel $this$getSelectedSiteAbsoluteUrl) {
        return null;
    }
    
    public final void onSettingsClick() {
    }
    
    public final void onSwitchStoreClick() {
    }
    
    private final void onViewAdminButtonClick() {
    }
    
    private final void onViewStoreButtonClick() {
    }
    
    private final void onCouponsButtonClick() {
    }
    
    private final void onReviewsButtonClick() {
    }
    
    private final void onInboxButtonClick() {
    }
    
    private final void trackMoreMenuOptionSelected(java.lang.String selectedOption) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0006H\u00c6\u0003J7\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0006H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r\u00a8\u0006\u001b"}, d2 = {"Lcom/woocommerce/android/ui/moremenu/MoreMenuViewModel$MoreMenuViewState;", "", "moreMenuItems", "", "Lcom/woocommerce/android/ui/moremenu/MenuUiButton;", "siteName", "", "siteUrl", "userAvatarUrl", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMoreMenuItems", "()Ljava/util/List;", "getSiteName", "()Ljava/lang/String;", "getSiteUrl", "getUserAvatarUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "WooCommerce_wasabiDebug"})
    public static final class MoreMenuViewState {
        @org.jetbrains.annotations.NotNull
        private final java.util.List<com.woocommerce.android.ui.moremenu.MenuUiButton> moreMenuItems = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String siteName = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String siteUrl = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String userAvatarUrl = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.moremenu.MoreMenuViewModel.MoreMenuViewState copy(@org.jetbrains.annotations.NotNull
        java.util.List<com.woocommerce.android.ui.moremenu.MenuUiButton> moreMenuItems, @org.jetbrains.annotations.NotNull
        java.lang.String siteName, @org.jetbrains.annotations.NotNull
        java.lang.String siteUrl, @org.jetbrains.annotations.NotNull
        java.lang.String userAvatarUrl) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public MoreMenuViewState() {
            super();
        }
        
        public MoreMenuViewState(@org.jetbrains.annotations.NotNull
        java.util.List<com.woocommerce.android.ui.moremenu.MenuUiButton> moreMenuItems, @org.jetbrains.annotations.NotNull
        java.lang.String siteName, @org.jetbrains.annotations.NotNull
        java.lang.String siteUrl, @org.jetbrains.annotations.NotNull
        java.lang.String userAvatarUrl) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.woocommerce.android.ui.moremenu.MenuUiButton> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.woocommerce.android.ui.moremenu.MenuUiButton> getMoreMenuItems() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getSiteName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getSiteUrl() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getUserAvatarUrl() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\tB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0007\n\u000b\f\r\u000e\u000f\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/moremenu/MoreMenuViewModel$MoreMenuEvent;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "()V", "NavigateToSettingsEvent", "StartSitePickerEvent", "ViewAdminEvent", "ViewCouponsEvent", "ViewInboxEvent", "ViewReviewsEvent", "ViewStoreEvent", "Lcom/woocommerce/android/ui/moremenu/MoreMenuViewModel$MoreMenuEvent$NavigateToSettingsEvent;", "Lcom/woocommerce/android/ui/moremenu/MoreMenuViewModel$MoreMenuEvent$StartSitePickerEvent;", "Lcom/woocommerce/android/ui/moremenu/MoreMenuViewModel$MoreMenuEvent$ViewAdminEvent;", "Lcom/woocommerce/android/ui/moremenu/MoreMenuViewModel$MoreMenuEvent$ViewStoreEvent;", "Lcom/woocommerce/android/ui/moremenu/MoreMenuViewModel$MoreMenuEvent$ViewReviewsEvent;", "Lcom/woocommerce/android/ui/moremenu/MoreMenuViewModel$MoreMenuEvent$ViewInboxEvent;", "Lcom/woocommerce/android/ui/moremenu/MoreMenuViewModel$MoreMenuEvent$ViewCouponsEvent;", "WooCommerce_wasabiDebug"})
    public static abstract class MoreMenuEvent extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        
        private MoreMenuEvent() {
            super(false);
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/moremenu/MoreMenuViewModel$MoreMenuEvent$NavigateToSettingsEvent;", "Lcom/woocommerce/android/ui/moremenu/MoreMenuViewModel$MoreMenuEvent;", "()V", "WooCommerce_wasabiDebug"})
        public static final class NavigateToSettingsEvent extends com.woocommerce.android.ui.moremenu.MoreMenuViewModel.MoreMenuEvent {
            @org.jetbrains.annotations.NotNull
            public static final com.woocommerce.android.ui.moremenu.MoreMenuViewModel.MoreMenuEvent.NavigateToSettingsEvent INSTANCE = null;
            
            private NavigateToSettingsEvent() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/moremenu/MoreMenuViewModel$MoreMenuEvent$StartSitePickerEvent;", "Lcom/woocommerce/android/ui/moremenu/MoreMenuViewModel$MoreMenuEvent;", "()V", "WooCommerce_wasabiDebug"})
        public static final class StartSitePickerEvent extends com.woocommerce.android.ui.moremenu.MoreMenuViewModel.MoreMenuEvent {
            @org.jetbrains.annotations.NotNull
            public static final com.woocommerce.android.ui.moremenu.MoreMenuViewModel.MoreMenuEvent.StartSitePickerEvent INSTANCE = null;
            
            private StartSitePickerEvent() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/woocommerce/android/ui/moremenu/MoreMenuViewModel$MoreMenuEvent$ViewAdminEvent;", "Lcom/woocommerce/android/ui/moremenu/MoreMenuViewModel$MoreMenuEvent;", "url", "", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_wasabiDebug"})
        public static final class ViewAdminEvent extends com.woocommerce.android.ui.moremenu.MoreMenuViewModel.MoreMenuEvent {
            @org.jetbrains.annotations.NotNull
            private final java.lang.String url = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.moremenu.MoreMenuViewModel.MoreMenuEvent.ViewAdminEvent copy(@org.jetbrains.annotations.NotNull
            java.lang.String url) {
                return null;
            }
            
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public ViewAdminEvent(@org.jetbrains.annotations.NotNull
            java.lang.String url) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getUrl() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/woocommerce/android/ui/moremenu/MoreMenuViewModel$MoreMenuEvent$ViewStoreEvent;", "Lcom/woocommerce/android/ui/moremenu/MoreMenuViewModel$MoreMenuEvent;", "url", "", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_wasabiDebug"})
        public static final class ViewStoreEvent extends com.woocommerce.android.ui.moremenu.MoreMenuViewModel.MoreMenuEvent {
            @org.jetbrains.annotations.NotNull
            private final java.lang.String url = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.moremenu.MoreMenuViewModel.MoreMenuEvent.ViewStoreEvent copy(@org.jetbrains.annotations.NotNull
            java.lang.String url) {
                return null;
            }
            
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public ViewStoreEvent(@org.jetbrains.annotations.NotNull
            java.lang.String url) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getUrl() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/moremenu/MoreMenuViewModel$MoreMenuEvent$ViewReviewsEvent;", "Lcom/woocommerce/android/ui/moremenu/MoreMenuViewModel$MoreMenuEvent;", "()V", "WooCommerce_wasabiDebug"})
        public static final class ViewReviewsEvent extends com.woocommerce.android.ui.moremenu.MoreMenuViewModel.MoreMenuEvent {
            @org.jetbrains.annotations.NotNull
            public static final com.woocommerce.android.ui.moremenu.MoreMenuViewModel.MoreMenuEvent.ViewReviewsEvent INSTANCE = null;
            
            private ViewReviewsEvent() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/moremenu/MoreMenuViewModel$MoreMenuEvent$ViewInboxEvent;", "Lcom/woocommerce/android/ui/moremenu/MoreMenuViewModel$MoreMenuEvent;", "()V", "WooCommerce_wasabiDebug"})
        public static final class ViewInboxEvent extends com.woocommerce.android.ui.moremenu.MoreMenuViewModel.MoreMenuEvent {
            @org.jetbrains.annotations.NotNull
            public static final com.woocommerce.android.ui.moremenu.MoreMenuViewModel.MoreMenuEvent.ViewInboxEvent INSTANCE = null;
            
            private ViewInboxEvent() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/moremenu/MoreMenuViewModel$MoreMenuEvent$ViewCouponsEvent;", "Lcom/woocommerce/android/ui/moremenu/MoreMenuViewModel$MoreMenuEvent;", "()V", "WooCommerce_wasabiDebug"})
        public static final class ViewCouponsEvent extends com.woocommerce.android.ui.moremenu.MoreMenuViewModel.MoreMenuEvent {
            @org.jetbrains.annotations.NotNull
            public static final com.woocommerce.android.ui.moremenu.MoreMenuViewModel.MoreMenuEvent.ViewCouponsEvent INSTANCE = null;
            
            private ViewCouponsEvent() {
                super();
            }
        }
    }
}