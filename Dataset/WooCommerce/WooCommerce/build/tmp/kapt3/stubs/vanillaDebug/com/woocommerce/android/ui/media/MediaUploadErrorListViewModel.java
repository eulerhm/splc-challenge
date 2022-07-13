package com.woocommerce.android.ui.media;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006\u001e"}, d2 = {"Lcom/woocommerce/android/ui/media/MediaUploadErrorListViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "resourceProvider", "Lcom/woocommerce/android/viewmodel/ResourceProvider;", "mediaFileUploadHandler", "Lcom/woocommerce/android/ui/media/MediaFileUploadHandler;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/woocommerce/android/viewmodel/ResourceProvider;Lcom/woocommerce/android/ui/media/MediaFileUploadHandler;Landroidx/lifecycle/SavedStateHandle;)V", "navArgs", "Lcom/woocommerce/android/ui/media/MediaUploadErrorListFragmentArgs;", "getNavArgs", "()Lcom/woocommerce/android/ui/media/MediaUploadErrorListFragmentArgs;", "navArgs$delegate", "Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "<set-?>", "Lcom/woocommerce/android/ui/media/MediaUploadErrorListViewModel$ViewState;", "viewState", "getViewState", "()Lcom/woocommerce/android/ui/media/MediaUploadErrorListViewModel$ViewState;", "setViewState", "(Lcom/woocommerce/android/ui/media/MediaUploadErrorListViewModel$ViewState;)V", "viewState$delegate", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "viewStateData", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getViewStateData", "()Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "ErrorUiModel", "ViewState", "WooCommerce_vanillaDebug"})
public final class MediaUploadErrorListViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.viewmodel.ResourceProvider resourceProvider = null;
    private final com.woocommerce.android.viewmodel.NavArgsLazy navArgs$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.media.MediaUploadErrorListViewModel.ViewState> viewStateData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate viewState$delegate = null;
    
    @javax.inject.Inject()
    public MediaUploadErrorListViewModel(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.viewmodel.ResourceProvider resourceProvider, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.media.MediaFileUploadHandler mediaFileUploadHandler, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedState) {
        super(null);
    }
    
    private final com.woocommerce.android.ui.media.MediaUploadErrorListFragmentArgs getNavArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.media.MediaUploadErrorListViewModel.ViewState> getViewStateData() {
        return null;
    }
    
    private final com.woocommerce.android.ui.media.MediaUploadErrorListViewModel.ViewState getViewState() {
        return null;
    }
    
    private final void setViewState(com.woocommerce.android.ui.media.MediaUploadErrorListViewModel.ViewState p0) {
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0006H\u00c6\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0006H\u00d6\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u001c"}, d2 = {"Lcom/woocommerce/android/ui/media/MediaUploadErrorListViewModel$ViewState;", "Landroid/os/Parcelable;", "uploadErrorList", "", "Lcom/woocommerce/android/ui/media/MediaUploadErrorListViewModel$ErrorUiModel;", "toolBarTitle", "", "(Ljava/util/List;Ljava/lang/String;)V", "getToolBarTitle", "()Ljava/lang/String;", "getUploadErrorList", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
    public static final class ViewState implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.woocommerce.android.ui.media.MediaUploadErrorListViewModel.ErrorUiModel> uploadErrorList = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String toolBarTitle = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.media.MediaUploadErrorListViewModel.ViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.media.MediaUploadErrorListViewModel.ViewState copy(@org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.ui.media.MediaUploadErrorListViewModel.ErrorUiModel> uploadErrorList, @org.jetbrains.annotations.NotNull()
        java.lang.String toolBarTitle) {
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
        
        public ViewState() {
            super();
        }
        
        public ViewState(@org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.ui.media.MediaUploadErrorListViewModel.ErrorUiModel> uploadErrorList, @org.jetbrains.annotations.NotNull()
        java.lang.String toolBarTitle) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.ui.media.MediaUploadErrorListViewModel.ErrorUiModel> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.ui.media.MediaUploadErrorListViewModel.ErrorUiModel> getUploadErrorList() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getToolBarTitle() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.media.MediaUploadErrorListViewModel.ViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.media.MediaUploadErrorListViewModel.ViewState createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.media.MediaUploadErrorListViewModel.ViewState[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u00c6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0006H\u00d6\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b\u00a8\u0006\u001f"}, d2 = {"Lcom/woocommerce/android/ui/media/MediaUploadErrorListViewModel$ErrorUiModel;", "Landroid/os/Parcelable;", "state", "Lcom/woocommerce/android/ui/media/MediaFileUploadHandler$UploadStatus$Failed;", "(Lcom/woocommerce/android/ui/media/MediaFileUploadHandler$UploadStatus$Failed;)V", "fileName", "", "errorMessage", "filePath", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getErrorMessage", "()Ljava/lang/String;", "getFileName", "getFilePath", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
    public static final class ErrorUiModel implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String fileName = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String errorMessage = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String filePath = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.media.MediaUploadErrorListViewModel.ErrorUiModel> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.media.MediaUploadErrorListViewModel.ErrorUiModel copy(@org.jetbrains.annotations.NotNull()
        java.lang.String fileName, @org.jetbrains.annotations.NotNull()
        java.lang.String errorMessage, @org.jetbrains.annotations.NotNull()
        java.lang.String filePath) {
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
        
        public ErrorUiModel(@org.jetbrains.annotations.NotNull()
        java.lang.String fileName, @org.jetbrains.annotations.NotNull()
        java.lang.String errorMessage, @org.jetbrains.annotations.NotNull()
        java.lang.String filePath) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFileName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getErrorMessage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFilePath() {
            return null;
        }
        
        public ErrorUiModel(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.media.MediaFileUploadHandler.UploadStatus.Failed state) {
            super();
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.media.MediaUploadErrorListViewModel.ErrorUiModel> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.media.MediaUploadErrorListViewModel.ErrorUiModel createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.media.MediaUploadErrorListViewModel.ErrorUiModel[] newArray(int size) {
                return null;
            }
        }
    }
}