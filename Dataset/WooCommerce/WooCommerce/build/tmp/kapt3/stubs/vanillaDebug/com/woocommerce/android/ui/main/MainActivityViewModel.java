package com.woocommerce.android.ui.main;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001:\b*+,-./01BG\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00142\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ\u0018\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\u0018\u0010%\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0018\u0010&\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\'\u001a\u00020$H\u0002J\u0006\u0010(\u001a\u00020\u001cJ\u0006\u0010)\u001a\u00020\u001cR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a\u00a8\u00062"}, d2 = {"Lcom/woocommerce/android/ui/main/MainActivityViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "siteStore", "Lorg/wordpress/android/fluxc/store/SiteStore;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "notificationHandler", "Lcom/woocommerce/android/push/NotificationMessageHandler;", "featureAnnouncementRepository", "Lcom/woocommerce/android/ui/whatsnew/FeatureAnnouncementRepository;", "buildConfigWrapper", "Lcom/woocommerce/android/util/BuildConfigWrapper;", "prefs", "Lcom/woocommerce/android/AppPrefs;", "unseenReviewsCountHandler", "Lcom/woocommerce/android/push/UnseenReviewsCountHandler;", "(Landroidx/lifecycle/SavedStateHandle;Lorg/wordpress/android/fluxc/store/SiteStore;Lcom/woocommerce/android/tools/SelectedSite;Lcom/woocommerce/android/push/NotificationMessageHandler;Lcom/woocommerce/android/ui/whatsnew/FeatureAnnouncementRepository;Lcom/woocommerce/android/util/BuildConfigWrapper;Lcom/woocommerce/android/AppPrefs;Lcom/woocommerce/android/push/UnseenReviewsCountHandler;)V", "startDestination", "", "getStartDestination", "()I", "unseenReviewsCount", "Landroidx/lifecycle/LiveData;", "getUnseenReviewsCount", "()Landroidx/lifecycle/LiveData;", "handleIncomingNotification", "", "localPushId", "notification", "Lcom/woocommerce/android/model/Notification;", "onGroupMessageOpened", "notificationChannelType", "Lcom/woocommerce/android/push/NotificationChannelType;", "remoteSiteId", "", "onSingleNotificationOpened", "onZendeskNotificationOpened", "remoteNoteId", "removeOrderNotifications", "showFeatureAnnouncementIfNeeded", "RestartActivityForNotification", "ShowFeatureAnnouncement", "ViewMyStoreStats", "ViewOrderDetail", "ViewOrderList", "ViewReviewDetail", "ViewReviewList", "ViewZendeskTickets", "WooCommerce_vanillaDebug"})
public final class MainActivityViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final org.wordpress.android.fluxc.store.SiteStore siteStore = null;
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    private final com.woocommerce.android.push.NotificationMessageHandler notificationHandler = null;
    private final com.woocommerce.android.ui.whatsnew.FeatureAnnouncementRepository featureAnnouncementRepository = null;
    private final com.woocommerce.android.util.BuildConfigWrapper buildConfigWrapper = null;
    private final com.woocommerce.android.AppPrefs prefs = null;
    private final int startDestination = 0;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> unseenReviewsCount = null;
    
    @javax.inject.Inject()
    public MainActivityViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.SiteStore siteStore, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.tools.SelectedSite selectedSite, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.push.NotificationMessageHandler notificationHandler, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.whatsnew.FeatureAnnouncementRepository featureAnnouncementRepository, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.BuildConfigWrapper buildConfigWrapper, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.AppPrefs prefs, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.push.UnseenReviewsCountHandler unseenReviewsCountHandler) {
        super(null);
    }
    
    public final int getStartDestination() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getUnseenReviewsCount() {
        return null;
    }
    
    public final void removeOrderNotifications() {
    }
    
    public final void handleIncomingNotification(int localPushId, @org.jetbrains.annotations.Nullable()
    com.woocommerce.android.model.Notification notification) {
    }
    
    private final void onGroupMessageOpened(com.woocommerce.android.push.NotificationChannelType notificationChannelType, long remoteSiteId) {
    }
    
    private final void onZendeskNotificationOpened(int localPushId, long remoteNoteId) {
    }
    
    private final void onSingleNotificationOpened(int localPushId, com.woocommerce.android.model.Notification notification) {
    }
    
    public final void showFeatureAnnouncementIfNeeded() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/main/MainActivityViewModel$ViewOrderList;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "()V", "WooCommerce_vanillaDebug"})
    public static final class ViewOrderList extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        @org.jetbrains.annotations.NotNull()
        public static final com.woocommerce.android.ui.main.MainActivityViewModel.ViewOrderList INSTANCE = null;
        
        private ViewOrderList() {
            super(false);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/main/MainActivityViewModel$ViewReviewList;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "()V", "WooCommerce_vanillaDebug"})
    public static final class ViewReviewList extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        @org.jetbrains.annotations.NotNull()
        public static final com.woocommerce.android.ui.main.MainActivityViewModel.ViewReviewList INSTANCE = null;
        
        private ViewReviewList() {
            super(false);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/main/MainActivityViewModel$ViewMyStoreStats;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "()V", "WooCommerce_vanillaDebug"})
    public static final class ViewMyStoreStats extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        @org.jetbrains.annotations.NotNull()
        public static final com.woocommerce.android.ui.main.MainActivityViewModel.ViewMyStoreStats INSTANCE = null;
        
        private ViewMyStoreStats() {
            super(false);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/main/MainActivityViewModel$ViewZendeskTickets;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "()V", "WooCommerce_vanillaDebug"})
    public static final class ViewZendeskTickets extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        @org.jetbrains.annotations.NotNull()
        public static final com.woocommerce.android.ui.main.MainActivityViewModel.ViewZendeskTickets INSTANCE = null;
        
        private ViewZendeskTickets() {
            super(false);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/woocommerce/android/ui/main/MainActivityViewModel$RestartActivityForNotification;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "pushId", "", "notification", "Lcom/woocommerce/android/model/Notification;", "(ILcom/woocommerce/android/model/Notification;)V", "getNotification", "()Lcom/woocommerce/android/model/Notification;", "getPushId", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class RestartActivityForNotification extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        private final int pushId = 0;
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.model.Notification notification = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.main.MainActivityViewModel.RestartActivityForNotification copy(int pushId, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.Notification notification) {
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
        
        public RestartActivityForNotification(int pushId, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.Notification notification) {
            super(false);
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getPushId() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.Notification component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.Notification getNotification() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/main/MainActivityViewModel$ShowFeatureAnnouncement;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "announcement", "Lcom/woocommerce/android/model/FeatureAnnouncement;", "(Lcom/woocommerce/android/model/FeatureAnnouncement;)V", "getAnnouncement", "()Lcom/woocommerce/android/model/FeatureAnnouncement;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class ShowFeatureAnnouncement extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.model.FeatureAnnouncement announcement = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.main.MainActivityViewModel.ShowFeatureAnnouncement copy(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.FeatureAnnouncement announcement) {
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
        
        public ShowFeatureAnnouncement(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.FeatureAnnouncement announcement) {
            super(false);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.FeatureAnnouncement component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.FeatureAnnouncement getAnnouncement() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/main/MainActivityViewModel$ViewReviewDetail;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "uniqueId", "", "(J)V", "getUniqueId", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class ViewReviewDetail extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        private final long uniqueId = 0L;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.main.MainActivityViewModel.ViewReviewDetail copy(long uniqueId) {
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
        
        public ViewReviewDetail(long uniqueId) {
            super(false);
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getUniqueId() {
            return 0L;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"Lcom/woocommerce/android/ui/main/MainActivityViewModel$ViewOrderDetail;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "uniqueId", "", "remoteNoteId", "(JJ)V", "getRemoteNoteId", "()J", "getUniqueId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class ViewOrderDetail extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        private final long uniqueId = 0L;
        private final long remoteNoteId = 0L;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.main.MainActivityViewModel.ViewOrderDetail copy(long uniqueId, long remoteNoteId) {
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
        
        public ViewOrderDetail(long uniqueId, long remoteNoteId) {
            super(false);
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getUniqueId() {
            return 0L;
        }
        
        public final long component2() {
            return 0L;
        }
        
        public final long getRemoteNoteId() {
            return 0L;
        }
    }
}