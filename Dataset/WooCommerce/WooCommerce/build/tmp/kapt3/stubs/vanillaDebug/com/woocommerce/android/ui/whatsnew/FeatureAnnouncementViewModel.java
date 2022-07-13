package com.woocommerce.android.ui.whatsnew;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001bB\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001c"}, d2 = {"Lcom/woocommerce/android/ui/whatsnew/FeatureAnnouncementViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "prefs", "Lcom/woocommerce/android/AppPrefs;", "buildConfigWrapper", "Lcom/woocommerce/android/util/BuildConfigWrapper;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/AppPrefs;Lcom/woocommerce/android/util/BuildConfigWrapper;)V", "<set-?>", "Lcom/woocommerce/android/ui/whatsnew/FeatureAnnouncementViewModel$FeatureAnnouncementViewState;", "viewState", "getViewState", "()Lcom/woocommerce/android/ui/whatsnew/FeatureAnnouncementViewModel$FeatureAnnouncementViewState;", "setViewState", "(Lcom/woocommerce/android/ui/whatsnew/FeatureAnnouncementViewModel$FeatureAnnouncementViewState;)V", "viewState$delegate", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "viewStateData", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getViewStateData", "()Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "handleAnnouncementIsViewed", "", "setAnnouncementData", "announcement", "Lcom/woocommerce/android/model/FeatureAnnouncement;", "FeatureAnnouncementViewState", "WooCommerce_vanillaDebug"})
public final class FeatureAnnouncementViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.AppPrefs prefs = null;
    private final com.woocommerce.android.util.BuildConfigWrapper buildConfigWrapper = null;
    @org.jetbrains.annotations.NotNull()
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.whatsnew.FeatureAnnouncementViewModel.FeatureAnnouncementViewState> viewStateData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate viewState$delegate = null;
    
    @javax.inject.Inject()
    public FeatureAnnouncementViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.AppPrefs prefs, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.BuildConfigWrapper buildConfigWrapper) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.whatsnew.FeatureAnnouncementViewModel.FeatureAnnouncementViewState> getViewStateData() {
        return null;
    }
    
    private final com.woocommerce.android.ui.whatsnew.FeatureAnnouncementViewModel.FeatureAnnouncementViewState getViewState() {
        return null;
    }
    
    private final void setViewState(com.woocommerce.android.ui.whatsnew.FeatureAnnouncementViewModel.FeatureAnnouncementViewState p0) {
    }
    
    public final void setAnnouncementData(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.FeatureAnnouncement announcement) {
    }
    
    public final void handleAnnouncementIsViewed() {
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\nH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Lcom/woocommerce/android/ui/whatsnew/FeatureAnnouncementViewModel$FeatureAnnouncementViewState;", "Landroid/os/Parcelable;", "announcement", "Lcom/woocommerce/android/model/FeatureAnnouncement;", "(Lcom/woocommerce/android/model/FeatureAnnouncement;)V", "getAnnouncement", "()Lcom/woocommerce/android/model/FeatureAnnouncement;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
    public static final class FeatureAnnouncementViewState implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable()
        private final com.woocommerce.android.model.FeatureAnnouncement announcement = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.whatsnew.FeatureAnnouncementViewModel.FeatureAnnouncementViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.whatsnew.FeatureAnnouncementViewModel.FeatureAnnouncementViewState copy(@org.jetbrains.annotations.Nullable()
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
        
        public FeatureAnnouncementViewState() {
            super();
        }
        
        public FeatureAnnouncementViewState(@org.jetbrains.annotations.Nullable()
        com.woocommerce.android.model.FeatureAnnouncement announcement) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.woocommerce.android.model.FeatureAnnouncement component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.woocommerce.android.model.FeatureAnnouncement getAnnouncement() {
            return null;
        }
        
        @java.lang.Override()
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.whatsnew.FeatureAnnouncementViewModel.FeatureAnnouncementViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.whatsnew.FeatureAnnouncementViewModel.FeatureAnnouncementViewState createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.whatsnew.FeatureAnnouncementViewModel.FeatureAnnouncementViewState[] newArray(int size) {
                return null;
            }
        }
    }
}