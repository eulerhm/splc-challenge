package com.woocommerce.android.ui.whatsnew;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001b\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\n\u0010\u000e\u001a\u00020\t*\u00020\u000fJ\n\u0010\u000e\u001a\u00020\u0010*\u00020\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/woocommerce/android/ui/whatsnew/FeatureAnnouncementRepository;", "", "whatsNewStore", "Lorg/wordpress/android/fluxc/store/WhatsNewStore;", "buildConfigWrapper", "Lcom/woocommerce/android/util/BuildConfigWrapper;", "(Lorg/wordpress/android/fluxc/store/WhatsNewStore;Lcom/woocommerce/android/util/BuildConfigWrapper;)V", "getFeatureAnnouncements", "", "Lcom/woocommerce/android/model/FeatureAnnouncement;", "fromCache", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLatestFeatureAnnouncement", "build", "Lorg/wordpress/android/fluxc/model/whatsnew/WhatsNewAnnouncementModel;", "Lcom/woocommerce/android/model/FeatureAnnouncementItem;", "Lorg/wordpress/android/fluxc/model/whatsnew/WhatsNewAnnouncementModel$WhatsNewAnnouncementFeature;", "WooCommerce_wasabiDebug"})
public final class FeatureAnnouncementRepository {
    private final org.wordpress.android.fluxc.store.WhatsNewStore whatsNewStore = null;
    private final com.woocommerce.android.util.BuildConfigWrapper buildConfigWrapper = null;
    
    @javax.inject.Inject
    public FeatureAnnouncementRepository(@org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.WhatsNewStore whatsNewStore, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.BuildConfigWrapper buildConfigWrapper) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getLatestFeatureAnnouncement(boolean fromCache, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.woocommerce.android.model.FeatureAnnouncement> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getFeatureAnnouncements(boolean fromCache, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.woocommerce.android.model.FeatureAnnouncement>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.model.FeatureAnnouncement build(@org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.model.whatsnew.WhatsNewAnnouncementModel $this$build) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.model.FeatureAnnouncementItem build(@org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.model.whatsnew.WhatsNewAnnouncementModel.WhatsNewAnnouncementFeature $this$build) {
        return null;
    }
}