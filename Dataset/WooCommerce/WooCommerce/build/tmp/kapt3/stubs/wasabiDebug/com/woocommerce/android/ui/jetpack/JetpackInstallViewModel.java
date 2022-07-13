package com.woocommerce.android.ui.jetpack;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u0000  2\u00020\u0001:\u0004 !\"#B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001bJ\b\u0010\u001c\u001a\u00020\u0019H\u0002J\u0011\u0010\u001d\u001a\u00020\u001bH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\b\u0010\u001f\u001a\u00020\u0019H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006$"}, d2 = {"Lcom/woocommerce/android/ui/jetpack/JetpackInstallViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "repository", "Lcom/woocommerce/android/ui/jetpack/PluginRepository;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "wooCommerceStore", "Lorg/wordpress/android/fluxc/store/WooCommerceStore;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/ui/jetpack/PluginRepository;Lcom/woocommerce/android/tools/SelectedSite;Lorg/wordpress/android/fluxc/store/WooCommerceStore;)V", "<set-?>", "Lcom/woocommerce/android/ui/jetpack/JetpackInstallViewModel$JetpackInstallProgressViewState;", "viewState", "getViewState", "()Lcom/woocommerce/android/ui/jetpack/JetpackInstallViewModel$JetpackInstallProgressViewState;", "setViewState", "(Lcom/woocommerce/android/ui/jetpack/JetpackInstallViewModel$JetpackInstallProgressViewState;)V", "viewState$delegate", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "viewStateLiveData", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getViewStateLiveData", "()Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "checkJetpackConnection", "", "retry", "", "installJetpackPlugin", "isJetpackConnectedAfterInstallation", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCleared", "Companion", "FailureType", "InstallStatus", "JetpackInstallProgressViewState", "WooCommerce_wasabiDebug"})
public final class JetpackInstallViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.ui.jetpack.PluginRepository repository = null;
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    private final org.wordpress.android.fluxc.store.WooCommerceStore wooCommerceStore = null;
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.jetpack.JetpackInstallViewModel.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String JETPACK_SLUG = "jetpack";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String JETPACK_NAME = "jetpack/jetpack";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CONNECTION_ERROR = "Connection error.";
    public static final int ATTEMPT_LIMIT = 2;
    public static final long SYNC_CHECK_DELAY = 3000L;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.jetpack.JetpackInstallViewModel.JetpackInstallProgressViewState> viewStateLiveData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate viewState$delegate = null;
    
    @javax.inject.Inject
    public JetpackInstallViewModel(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.jetpack.PluginRepository repository, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.SelectedSite selectedSite, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.WooCommerceStore wooCommerceStore) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.jetpack.JetpackInstallViewModel.JetpackInstallProgressViewState> getViewStateLiveData() {
        return null;
    }
    
    private final com.woocommerce.android.ui.jetpack.JetpackInstallViewModel.JetpackInstallProgressViewState getViewState() {
        return null;
    }
    
    private final void setViewState(com.woocommerce.android.ui.jetpack.JetpackInstallViewModel.JetpackInstallProgressViewState p0) {
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    private final void installJetpackPlugin() {
    }
    
    public final void checkJetpackConnection(boolean retry) {
    }
    
    private final java.lang.Object isJetpackConnectedAfterInstallation(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\nH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Lcom/woocommerce/android/ui/jetpack/JetpackInstallViewModel$JetpackInstallProgressViewState;", "Landroid/os/Parcelable;", "installStatus", "Lcom/woocommerce/android/ui/jetpack/JetpackInstallViewModel$InstallStatus;", "(Lcom/woocommerce/android/ui/jetpack/JetpackInstallViewModel$InstallStatus;)V", "getInstallStatus", "()Lcom/woocommerce/android/ui/jetpack/JetpackInstallViewModel$InstallStatus;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class JetpackInstallProgressViewState implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable
        private final com.woocommerce.android.ui.jetpack.JetpackInstallViewModel.InstallStatus installStatus = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.jetpack.JetpackInstallViewModel.JetpackInstallProgressViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.jetpack.JetpackInstallViewModel.JetpackInstallProgressViewState copy(@org.jetbrains.annotations.Nullable
        com.woocommerce.android.ui.jetpack.JetpackInstallViewModel.InstallStatus installStatus) {
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
        
        public JetpackInstallProgressViewState() {
            super();
        }
        
        public JetpackInstallProgressViewState(@org.jetbrains.annotations.Nullable
        com.woocommerce.android.ui.jetpack.JetpackInstallViewModel.InstallStatus installStatus) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.woocommerce.android.ui.jetpack.JetpackInstallViewModel.InstallStatus component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.woocommerce.android.ui.jetpack.JetpackInstallViewModel.InstallStatus getInstallStatus() {
            return null;
        }
        
        @java.lang.Override
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override
        public void writeToParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.jetpack.JetpackInstallViewModel.JetpackInstallProgressViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.jetpack.JetpackInstallViewModel.JetpackInstallProgressViewState createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.jetpack.JetpackInstallViewModel.JetpackInstallProgressViewState[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f\u00a8\u0006\r"}, d2 = {"Lcom/woocommerce/android/ui/jetpack/JetpackInstallViewModel$InstallStatus;", "Landroid/os/Parcelable;", "()V", "Activating", "Connecting", "Failed", "Finished", "Installing", "Lcom/woocommerce/android/ui/jetpack/JetpackInstallViewModel$InstallStatus$Installing;", "Lcom/woocommerce/android/ui/jetpack/JetpackInstallViewModel$InstallStatus$Activating;", "Lcom/woocommerce/android/ui/jetpack/JetpackInstallViewModel$InstallStatus$Connecting;", "Lcom/woocommerce/android/ui/jetpack/JetpackInstallViewModel$InstallStatus$Finished;", "Lcom/woocommerce/android/ui/jetpack/JetpackInstallViewModel$InstallStatus$Failed;", "WooCommerce_wasabiDebug"})
    public static abstract class InstallStatus implements android.os.Parcelable {
        
        private InstallStatus() {
            super();
        }
        
        @kotlinx.parcelize.Parcelize
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u00d6\u0001\u00a8\u0006\n"}, d2 = {"Lcom/woocommerce/android/ui/jetpack/JetpackInstallViewModel$InstallStatus$Installing;", "Lcom/woocommerce/android/ui/jetpack/JetpackInstallViewModel$InstallStatus;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
        public static final class Installing extends com.woocommerce.android.ui.jetpack.JetpackInstallViewModel.InstallStatus {
            @org.jetbrains.annotations.NotNull
            public static final com.woocommerce.android.ui.jetpack.JetpackInstallViewModel.InstallStatus.Installing INSTANCE = null;
            public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.jetpack.JetpackInstallViewModel.InstallStatus.Installing> CREATOR = null;
            
            private Installing() {
                super();
            }
            
            @java.lang.Override
            public int describeContents() {
                return 0;
            }
            
            @java.lang.Override
            public void writeToParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel parcel, int flags) {
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
            public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.jetpack.JetpackInstallViewModel.InstallStatus.Installing> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public final com.woocommerce.android.ui.jetpack.JetpackInstallViewModel.InstallStatus.Installing createFromParcel(@org.jetbrains.annotations.NotNull
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public final com.woocommerce.android.ui.jetpack.JetpackInstallViewModel.InstallStatus.Installing[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u00d6\u0001\u00a8\u0006\n"}, d2 = {"Lcom/woocommerce/android/ui/jetpack/JetpackInstallViewModel$InstallStatus$Activating;", "Lcom/woocommerce/android/ui/jetpack/JetpackInstallViewModel$InstallStatus;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
        public static final class Activating extends com.woocommerce.android.ui.jetpack.JetpackInstallViewModel.InstallStatus {
            @org.jetbrains.annotations.NotNull
            public static final com.woocommerce.android.ui.jetpack.JetpackInstallViewModel.InstallStatus.Activating INSTANCE = null;
            public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.jetpack.JetpackInstallViewModel.InstallStatus.Activating> CREATOR = null;
            
            private Activating() {
                super();
            }
            
            @java.lang.Override
            public int describeContents() {
                return 0;
            }
            
            @java.lang.Override
            public void writeToParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel parcel, int flags) {
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
            public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.jetpack.JetpackInstallViewModel.InstallStatus.Activating> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public final com.woocommerce.android.ui.jetpack.JetpackInstallViewModel.InstallStatus.Activating createFromParcel(@org.jetbrains.annotations.NotNull
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public final com.woocommerce.android.ui.jetpack.JetpackInstallViewModel.InstallStatus.Activating[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\nH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0016"}, d2 = {"Lcom/woocommerce/android/ui/jetpack/JetpackInstallViewModel$InstallStatus$Connecting;", "Lcom/woocommerce/android/ui/jetpack/JetpackInstallViewModel$InstallStatus;", "retry", "", "(Z)V", "getRetry", "()Z", "component1", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
        public static final class Connecting extends com.woocommerce.android.ui.jetpack.JetpackInstallViewModel.InstallStatus {
            private final boolean retry = false;
            public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.jetpack.JetpackInstallViewModel.InstallStatus.Connecting> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.jetpack.JetpackInstallViewModel.InstallStatus.Connecting copy(boolean retry) {
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
            
            public Connecting() {
                super();
            }
            
            public Connecting(boolean retry) {
                super();
            }
            
            public final boolean component1() {
                return false;
            }
            
            public final boolean getRetry() {
                return false;
            }
            
            @java.lang.Override
            public int describeContents() {
                return 0;
            }
            
            @java.lang.Override
            public void writeToParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel parcel, int flags) {
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
            public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.jetpack.JetpackInstallViewModel.InstallStatus.Connecting> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public final com.woocommerce.android.ui.jetpack.JetpackInstallViewModel.InstallStatus.Connecting createFromParcel(@org.jetbrains.annotations.NotNull
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public final com.woocommerce.android.ui.jetpack.JetpackInstallViewModel.InstallStatus.Connecting[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u00d6\u0001\u00a8\u0006\n"}, d2 = {"Lcom/woocommerce/android/ui/jetpack/JetpackInstallViewModel$InstallStatus$Finished;", "Lcom/woocommerce/android/ui/jetpack/JetpackInstallViewModel$InstallStatus;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
        public static final class Finished extends com.woocommerce.android.ui.jetpack.JetpackInstallViewModel.InstallStatus {
            @org.jetbrains.annotations.NotNull
            public static final com.woocommerce.android.ui.jetpack.JetpackInstallViewModel.InstallStatus.Finished INSTANCE = null;
            public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.jetpack.JetpackInstallViewModel.InstallStatus.Finished> CREATOR = null;
            
            private Finished() {
                super();
            }
            
            @java.lang.Override
            public int describeContents() {
                return 0;
            }
            
            @java.lang.Override
            public void writeToParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel parcel, int flags) {
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
            public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.jetpack.JetpackInstallViewModel.InstallStatus.Finished> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public final com.woocommerce.android.ui.jetpack.JetpackInstallViewModel.InstallStatus.Finished createFromParcel(@org.jetbrains.annotations.NotNull
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public final com.woocommerce.android.ui.jetpack.JetpackInstallViewModel.InstallStatus.Finished[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001b"}, d2 = {"Lcom/woocommerce/android/ui/jetpack/JetpackInstallViewModel$InstallStatus$Failed;", "Lcom/woocommerce/android/ui/jetpack/JetpackInstallViewModel$InstallStatus;", "errorType", "Lcom/woocommerce/android/ui/jetpack/JetpackInstallViewModel$FailureType;", "errorDescription", "", "(Lcom/woocommerce/android/ui/jetpack/JetpackInstallViewModel$FailureType;Ljava/lang/String;)V", "getErrorDescription", "()Ljava/lang/String;", "getErrorType", "()Lcom/woocommerce/android/ui/jetpack/JetpackInstallViewModel$FailureType;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
        public static final class Failed extends com.woocommerce.android.ui.jetpack.JetpackInstallViewModel.InstallStatus {
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.ui.jetpack.JetpackInstallViewModel.FailureType errorType = null;
            @org.jetbrains.annotations.NotNull
            private final java.lang.String errorDescription = null;
            public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.jetpack.JetpackInstallViewModel.InstallStatus.Failed> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.jetpack.JetpackInstallViewModel.InstallStatus.Failed copy(@org.jetbrains.annotations.NotNull
            com.woocommerce.android.ui.jetpack.JetpackInstallViewModel.FailureType errorType, @org.jetbrains.annotations.NotNull
            java.lang.String errorDescription) {
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
            
            public Failed(@org.jetbrains.annotations.NotNull
            com.woocommerce.android.ui.jetpack.JetpackInstallViewModel.FailureType errorType, @org.jetbrains.annotations.NotNull
            java.lang.String errorDescription) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.jetpack.JetpackInstallViewModel.FailureType component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.jetpack.JetpackInstallViewModel.FailureType getErrorType() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getErrorDescription() {
                return null;
            }
            
            @java.lang.Override
            public int describeContents() {
                return 0;
            }
            
            @java.lang.Override
            public void writeToParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel parcel, int flags) {
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
            public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.jetpack.JetpackInstallViewModel.InstallStatus.Failed> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public final com.woocommerce.android.ui.jetpack.JetpackInstallViewModel.InstallStatus.Failed createFromParcel(@org.jetbrains.annotations.NotNull
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public final com.woocommerce.android.ui.jetpack.JetpackInstallViewModel.InstallStatus.Failed[] newArray(int size) {
                    return null;
                }
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/woocommerce/android/ui/jetpack/JetpackInstallViewModel$FailureType;", "", "(Ljava/lang/String;I)V", "INSTALLATION", "ACTIVATION", "CONNECTION", "WooCommerce_wasabiDebug"})
    public static enum FailureType {
        /*public static final*/ INSTALLATION /* = new INSTALLATION() */,
        /*public static final*/ ACTIVATION /* = new ACTIVATION() */,
        /*public static final*/ CONNECTION /* = new CONNECTION() */;
        
        FailureType() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/woocommerce/android/ui/jetpack/JetpackInstallViewModel$Companion;", "", "()V", "ATTEMPT_LIMIT", "", "CONNECTION_ERROR", "", "JETPACK_NAME", "JETPACK_SLUG", "SYNC_CHECK_DELAY", "", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}