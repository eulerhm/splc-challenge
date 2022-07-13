package com.woocommerce.android.ui.orders.shippinglabels;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0002/0B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'H\u0002J\u001b\u0010(\u001a\u0004\u0018\u00010\u00122\u0006\u0010&\u001a\u00020\'H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)J\u0006\u0010*\u001a\u00020%J\u0006\u0010+\u001a\u00020%J\u000e\u0010,\u001a\u00020%2\u0006\u0010&\u001a\u00020\'J\u0006\u0010-\u001a\u00020%J\u0006\u0010.\u001a\u00020%R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R+\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00188B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00180!\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00061"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/PrintShippingLabelCustomsFormViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "fileUtils", "Lcom/woocommerce/android/media/FileUtils;", "fileDownloader", "Lcom/woocommerce/android/util/FileDownloader;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/media/FileUtils;Lcom/woocommerce/android/util/FileDownloader;)V", "navArgs", "Lcom/woocommerce/android/ui/orders/shippinglabels/PrintShippingLabelCustomsFormFragmentArgs;", "getNavArgs", "()Lcom/woocommerce/android/ui/orders/shippinglabels/PrintShippingLabelCustomsFormFragmentArgs;", "navArgs$delegate", "Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "printJob", "Lkotlinx/coroutines/Job;", "storageDirectory", "Ljava/io/File;", "getStorageDirectory", "()Ljava/io/File;", "setStorageDirectory", "(Ljava/io/File;)V", "<set-?>", "Lcom/woocommerce/android/ui/orders/shippinglabels/PrintShippingLabelCustomsFormViewModel$ViewState;", "viewState", "getViewState", "()Lcom/woocommerce/android/ui/orders/shippinglabels/PrintShippingLabelCustomsFormViewModel$ViewState;", "setViewState", "(Lcom/woocommerce/android/ui/orders/shippinglabels/PrintShippingLabelCustomsFormViewModel$ViewState;)V", "viewState$delegate", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "viewStateData", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getViewStateData", "()Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "downloadAndPrintInvoice", "", "invoiceUrl", "", "downloadInvoice", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onBackButtonClicked", "onDownloadCanceled", "onInvoicePrintButtonClicked", "onPrintButtonClicked", "onSaveForLaterClicked", "PrintCustomsForm", "ViewState", "WooCommerce_vanillaDebug"})
public final class PrintShippingLabelCustomsFormViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.media.FileUtils fileUtils = null;
    private final com.woocommerce.android.util.FileDownloader fileDownloader = null;
    private kotlinx.coroutines.Job printJob;
    private final com.woocommerce.android.viewmodel.NavArgsLazy navArgs$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.shippinglabels.PrintShippingLabelCustomsFormViewModel.ViewState> viewStateData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate viewState$delegate = null;
    public java.io.File storageDirectory;
    
    @javax.inject.Inject()
    public PrintShippingLabelCustomsFormViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.media.FileUtils fileUtils, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.FileDownloader fileDownloader) {
        super(null);
    }
    
    private final com.woocommerce.android.ui.orders.shippinglabels.PrintShippingLabelCustomsFormFragmentArgs getNavArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.shippinglabels.PrintShippingLabelCustomsFormViewModel.ViewState> getViewStateData() {
        return null;
    }
    
    private final com.woocommerce.android.ui.orders.shippinglabels.PrintShippingLabelCustomsFormViewModel.ViewState getViewState() {
        return null;
    }
    
    private final void setViewState(com.woocommerce.android.ui.orders.shippinglabels.PrintShippingLabelCustomsFormViewModel.ViewState p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.io.File getStorageDirectory() {
        return null;
    }
    
    public final void setStorageDirectory(@org.jetbrains.annotations.NotNull()
    java.io.File p0) {
    }
    
    public final void onInvoicePrintButtonClicked(@org.jetbrains.annotations.NotNull()
    java.lang.String invoiceUrl) {
    }
    
    public final void onPrintButtonClicked() {
    }
    
    public final void onSaveForLaterClicked() {
    }
    
    public final void onBackButtonClicked() {
    }
    
    public final void onDownloadCanceled() {
    }
    
    private final void downloadAndPrintInvoice(java.lang.String invoiceUrl) {
    }
    
    private final java.lang.Object downloadInvoice(java.lang.String invoiceUrl, kotlin.coroutines.Continuation<? super java.io.File> continuation) {
        return null;
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0006H\u00c6\u0003J#\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0013H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\nR\u0017\u0010\u000b\u001a\u00020\u00068F\u00a2\u0006\f\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\n\u00a8\u0006\u001e"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/PrintShippingLabelCustomsFormViewModel$ViewState;", "Landroid/os/Parcelable;", "commercialInvoices", "", "", "isProgressDialogShown", "", "(Ljava/util/List;Z)V", "getCommercialInvoices", "()Ljava/util/List;", "()Z", "showInvoicesAsAList", "getShowInvoicesAsAList$annotations", "()V", "getShowInvoicesAsAList", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
    public static final class ViewState implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.String> commercialInvoices = null;
        private final boolean isProgressDialogShown = false;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.PrintShippingLabelCustomsFormViewModel.ViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.shippinglabels.PrintShippingLabelCustomsFormViewModel.ViewState copy(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> commercialInvoices, boolean isProgressDialogShown) {
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
        
        public ViewState(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> commercialInvoices, boolean isProgressDialogShown) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getCommercialInvoices() {
            return null;
        }
        
        public final boolean component2() {
            return false;
        }
        
        public final boolean isProgressDialogShown() {
            return false;
        }
        
        @kotlinx.parcelize.IgnoredOnParcel()
        @java.lang.Deprecated()
        public static void getShowInvoicesAsAList$annotations() {
        }
        
        public final boolean getShowInvoicesAsAList() {
            return false;
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.PrintShippingLabelCustomsFormViewModel.ViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.orders.shippinglabels.PrintShippingLabelCustomsFormViewModel.ViewState createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.orders.shippinglabels.PrintShippingLabelCustomsFormViewModel.ViewState[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/PrintShippingLabelCustomsFormViewModel$PrintCustomsForm;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "file", "Ljava/io/File;", "(Ljava/io/File;)V", "getFile", "()Ljava/io/File;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class PrintCustomsForm extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        @org.jetbrains.annotations.NotNull()
        private final java.io.File file = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.shippinglabels.PrintShippingLabelCustomsFormViewModel.PrintCustomsForm copy(@org.jetbrains.annotations.NotNull()
        java.io.File file) {
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
        
        public PrintCustomsForm(@org.jetbrains.annotations.NotNull()
        java.io.File file) {
            super(false);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.io.File component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.io.File getFile() {
            return null;
        }
    }
}