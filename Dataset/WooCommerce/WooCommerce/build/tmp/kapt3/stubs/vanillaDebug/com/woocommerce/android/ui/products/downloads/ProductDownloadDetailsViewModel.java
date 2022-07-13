package com.woocommerce.android.ui.products.downloads;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0002./B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\"\u001a\u00020\u001fJ\u0006\u0010#\u001a\u00020$J\u0006\u0010%\u001a\u00020$J\u000e\u0010&\u001a\u00020$2\u0006\u0010\'\u001a\u00020\u001bJ\u000e\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020\u001bJ\u0006\u0010*\u001a\u00020$J\u0010\u0010+\u001a\u00020$2\u0006\u0010,\u001a\u00020\u000eH\u0002J\f\u0010-\u001a\u00020\u000e*\u00020\u000eH\u0002R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u001a\u001a\u00020\u001b8F\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u001f8F\u00a2\u0006\u0006\u001a\u0004\b \u0010!\u00a8\u00060"}, d2 = {"Lcom/woocommerce/android/ui/products/downloads/ProductDownloadDetailsViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "resourceProvider", "Lcom/woocommerce/android/viewmodel/ResourceProvider;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/viewmodel/ResourceProvider;)V", "navArgs", "Lcom/woocommerce/android/ui/products/downloads/ProductDownloadDetailsFragmentArgs;", "getNavArgs", "()Lcom/woocommerce/android/ui/products/downloads/ProductDownloadDetailsFragmentArgs;", "navArgs$delegate", "Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "<set-?>", "Lcom/woocommerce/android/ui/products/downloads/ProductDownloadDetailsViewModel$ProductDownloadDetailsViewState;", "productDownloadDetailsViewState", "getProductDownloadDetailsViewState", "()Lcom/woocommerce/android/ui/products/downloads/ProductDownloadDetailsViewModel$ProductDownloadDetailsViewState;", "setProductDownloadDetailsViewState", "(Lcom/woocommerce/android/ui/products/downloads/ProductDownloadDetailsViewModel$ProductDownloadDetailsViewState;)V", "productDownloadDetailsViewState$delegate", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "productDownloadDetailsViewStateData", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getProductDownloadDetailsViewStateData", "()Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "screenTitle", "", "getScreenTitle", "()Ljava/lang/String;", "showDoneButton", "", "getShowDoneButton", "()Z", "onBackButtonClicked", "onDeleteButtonClicked", "", "onDoneOrUpdateClicked", "onFileNameChanged", "name", "onFileUrlChanged", "url", "triggerFileDeletion", "updateState", "updatedState", "validateInput", "ProductDownloadDetailsEvent", "ProductDownloadDetailsViewState", "WooCommerce_vanillaDebug"})
public final class ProductDownloadDetailsViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.viewmodel.ResourceProvider resourceProvider = null;
    private final com.woocommerce.android.viewmodel.NavArgsLazy navArgs$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.products.downloads.ProductDownloadDetailsViewModel.ProductDownloadDetailsViewState> productDownloadDetailsViewStateData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate productDownloadDetailsViewState$delegate = null;
    
    @javax.inject.Inject()
    public ProductDownloadDetailsViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.viewmodel.ResourceProvider resourceProvider) {
        super(null);
    }
    
    private final com.woocommerce.android.ui.products.downloads.ProductDownloadDetailsFragmentArgs getNavArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.products.downloads.ProductDownloadDetailsViewModel.ProductDownloadDetailsViewState> getProductDownloadDetailsViewStateData() {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.downloads.ProductDownloadDetailsViewModel.ProductDownloadDetailsViewState getProductDownloadDetailsViewState() {
        return null;
    }
    
    private final void setProductDownloadDetailsViewState(com.woocommerce.android.ui.products.downloads.ProductDownloadDetailsViewModel.ProductDownloadDetailsViewState p0) {
    }
    
    public final boolean getShowDoneButton() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getScreenTitle() {
        return null;
    }
    
    public final void onFileUrlChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    public final void onFileNameChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    public final void onDoneOrUpdateClicked() {
    }
    
    public final void onDeleteButtonClicked() {
    }
    
    public final boolean onBackButtonClicked() {
        return false;
    }
    
    private final void updateState(com.woocommerce.android.ui.products.downloads.ProductDownloadDetailsViewModel.ProductDownloadDetailsViewState updatedState) {
    }
    
    private final com.woocommerce.android.ui.products.downloads.ProductDownloadDetailsViewModel.ProductDownloadDetailsViewState validateInput(com.woocommerce.android.ui.products.downloads.ProductDownloadDetailsViewModel.ProductDownloadDetailsViewState $this$validateInput) {
        return null;
    }
    
    public final void triggerFileDeletion() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/woocommerce/android/ui/products/downloads/ProductDownloadDetailsViewModel$ProductDownloadDetailsEvent;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "()V", "AddFileAndExitEvent", "DeleteFileEvent", "UpdateFileAndExitEvent", "Lcom/woocommerce/android/ui/products/downloads/ProductDownloadDetailsViewModel$ProductDownloadDetailsEvent$UpdateFileAndExitEvent;", "Lcom/woocommerce/android/ui/products/downloads/ProductDownloadDetailsViewModel$ProductDownloadDetailsEvent$AddFileAndExitEvent;", "Lcom/woocommerce/android/ui/products/downloads/ProductDownloadDetailsViewModel$ProductDownloadDetailsEvent$DeleteFileEvent;", "WooCommerce_vanillaDebug"})
    public static abstract class ProductDownloadDetailsEvent extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        
        private ProductDownloadDetailsEvent() {
            super(false);
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/products/downloads/ProductDownloadDetailsViewModel$ProductDownloadDetailsEvent$UpdateFileAndExitEvent;", "Lcom/woocommerce/android/ui/products/downloads/ProductDownloadDetailsViewModel$ProductDownloadDetailsEvent;", "updatedFile", "Lcom/woocommerce/android/model/ProductFile;", "(Lcom/woocommerce/android/model/ProductFile;)V", "getUpdatedFile", "()Lcom/woocommerce/android/model/ProductFile;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
        public static final class UpdateFileAndExitEvent extends com.woocommerce.android.ui.products.downloads.ProductDownloadDetailsViewModel.ProductDownloadDetailsEvent {
            @org.jetbrains.annotations.NotNull()
            private final com.woocommerce.android.model.ProductFile updatedFile = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.products.downloads.ProductDownloadDetailsViewModel.ProductDownloadDetailsEvent.UpdateFileAndExitEvent copy(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.model.ProductFile updatedFile) {
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
            
            public UpdateFileAndExitEvent(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.model.ProductFile updatedFile) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.model.ProductFile component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.model.ProductFile getUpdatedFile() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/products/downloads/ProductDownloadDetailsViewModel$ProductDownloadDetailsEvent$AddFileAndExitEvent;", "Lcom/woocommerce/android/ui/products/downloads/ProductDownloadDetailsViewModel$ProductDownloadDetailsEvent;", "file", "Lcom/woocommerce/android/model/ProductFile;", "(Lcom/woocommerce/android/model/ProductFile;)V", "getFile", "()Lcom/woocommerce/android/model/ProductFile;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
        public static final class AddFileAndExitEvent extends com.woocommerce.android.ui.products.downloads.ProductDownloadDetailsViewModel.ProductDownloadDetailsEvent {
            @org.jetbrains.annotations.NotNull()
            private final com.woocommerce.android.model.ProductFile file = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.products.downloads.ProductDownloadDetailsViewModel.ProductDownloadDetailsEvent.AddFileAndExitEvent copy(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.model.ProductFile file) {
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
            
            public AddFileAndExitEvent(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.model.ProductFile file) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.model.ProductFile component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.model.ProductFile getFile() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/ui/products/downloads/ProductDownloadDetailsViewModel$ProductDownloadDetailsEvent$DeleteFileEvent;", "Lcom/woocommerce/android/ui/products/downloads/ProductDownloadDetailsViewModel$ProductDownloadDetailsEvent;", "file", "Lcom/woocommerce/android/model/ProductFile;", "(Lcom/woocommerce/android/model/ProductFile;)V", "getFile", "()Lcom/woocommerce/android/model/ProductFile;", "WooCommerce_vanillaDebug"})
        public static final class DeleteFileEvent extends com.woocommerce.android.ui.products.downloads.ProductDownloadDetailsViewModel.ProductDownloadDetailsEvent {
            @org.jetbrains.annotations.NotNull()
            private final com.woocommerce.android.model.ProductFile file = null;
            
            public DeleteFileEvent(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.model.ProductFile file) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.model.ProductFile getFile() {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ:\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0017J\t\u0010\u0018\u001a\u00020\u0007H\u00d6\u0001J\u0013\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\u0019\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0011\u0010\r\u00a8\u0006$"}, d2 = {"Lcom/woocommerce/android/ui/products/downloads/ProductDownloadDetailsViewModel$ProductDownloadDetailsViewState;", "Landroid/os/Parcelable;", "fileDraft", "Lcom/woocommerce/android/model/ProductFile;", "showDoneButton", "", "urlErrorMessage", "", "nameErrorMessage", "(Lcom/woocommerce/android/model/ProductFile;ZLjava/lang/Integer;Ljava/lang/Integer;)V", "getFileDraft", "()Lcom/woocommerce/android/model/ProductFile;", "getNameErrorMessage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getShowDoneButton", "()Z", "getUrlErrorMessage", "component1", "component2", "component3", "component4", "copy", "(Lcom/woocommerce/android/model/ProductFile;ZLjava/lang/Integer;Ljava/lang/Integer;)Lcom/woocommerce/android/ui/products/downloads/ProductDownloadDetailsViewModel$ProductDownloadDetailsViewState;", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
    public static final class ProductDownloadDetailsViewState implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.model.ProductFile fileDraft = null;
        private final boolean showDoneButton = false;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer urlErrorMessage = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer nameErrorMessage = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.products.downloads.ProductDownloadDetailsViewModel.ProductDownloadDetailsViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.downloads.ProductDownloadDetailsViewModel.ProductDownloadDetailsViewState copy(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.ProductFile fileDraft, boolean showDoneButton, @org.jetbrains.annotations.Nullable()
        java.lang.Integer urlErrorMessage, @org.jetbrains.annotations.Nullable()
        java.lang.Integer nameErrorMessage) {
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
        
        public ProductDownloadDetailsViewState(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.ProductFile fileDraft, boolean showDoneButton, @org.jetbrains.annotations.Nullable()
        java.lang.Integer urlErrorMessage, @org.jetbrains.annotations.Nullable()
        java.lang.Integer nameErrorMessage) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.ProductFile component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.ProductFile getFileDraft() {
            return null;
        }
        
        public final boolean component2() {
            return false;
        }
        
        public final boolean getShowDoneButton() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getUrlErrorMessage() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getNameErrorMessage() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.products.downloads.ProductDownloadDetailsViewModel.ProductDownloadDetailsViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.downloads.ProductDownloadDetailsViewModel.ProductDownloadDetailsViewState createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.downloads.ProductDownloadDetailsViewModel.ProductDownloadDetailsViewState[] newArray(int size) {
                return null;
            }
        }
    }
}