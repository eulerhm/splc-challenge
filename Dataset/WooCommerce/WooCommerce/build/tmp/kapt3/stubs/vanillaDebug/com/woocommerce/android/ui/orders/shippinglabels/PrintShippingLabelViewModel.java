package com.woocommerce.android.ui.orders.shippinglabels;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001>B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u0011\u0010-\u001a\u00020.H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010/J\u0006\u00100\u001a\u00020.J\u000e\u00101\u001a\u00020.2\u0006\u00102\u001a\u000203J\u0006\u00104\u001a\u00020.J\u0006\u00105\u001a\u00020.J\u0006\u00106\u001a\u00020.J\u0006\u00107\u001a\u00020.J\u0006\u00108\u001a\u00020.J\u0016\u00109\u001a\u00020.2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u001c\u001a\u00020\u001d8F\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR+\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020!8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\'\u0010(\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020!0*\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006?"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/PrintShippingLabelViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "dispatchers", "Lcom/woocommerce/android/util/CoroutineDispatchers;", "repository", "Lcom/woocommerce/android/ui/orders/shippinglabels/ShippingLabelRepository;", "networkStatus", "Lcom/woocommerce/android/tools/NetworkStatus;", "fileUtils", "Lcom/woocommerce/android/media/FileUtils;", "base64Decoder", "Lcom/woocommerce/android/util/Base64Decoder;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/util/CoroutineDispatchers;Lcom/woocommerce/android/ui/orders/shippinglabels/ShippingLabelRepository;Lcom/woocommerce/android/tools/NetworkStatus;Lcom/woocommerce/android/media/FileUtils;Lcom/woocommerce/android/util/Base64Decoder;)V", "arguments", "Lcom/woocommerce/android/ui/orders/shippinglabels/PrintShippingLabelFragmentArgs;", "getArguments", "()Lcom/woocommerce/android/ui/orders/shippinglabels/PrintShippingLabelFragmentArgs;", "arguments$delegate", "Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "labels", "", "Lcom/woocommerce/android/model/ShippingLabel;", "getLabels", "()Ljava/util/List;", "labels$delegate", "Lkotlin/Lazy;", "screenTitle", "", "getScreenTitle", "()I", "<set-?>", "Lcom/woocommerce/android/ui/orders/shippinglabels/PrintShippingLabelViewModel$PrintShippingLabelViewState;", "viewState", "getViewState", "()Lcom/woocommerce/android/ui/orders/shippinglabels/PrintShippingLabelViewModel$PrintShippingLabelViewState;", "setViewState", "(Lcom/woocommerce/android/ui/orders/shippinglabels/PrintShippingLabelViewModel$PrintShippingLabelViewState;)V", "viewState$delegate", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "viewStateData", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getViewStateData", "()Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "handlePreviewError", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPaperSizeOptionsSelected", "onPaperSizeSelected", "paperSize", "Lcom/woocommerce/android/ui/orders/shippinglabels/ShippingLabelPaperSizeSelectorDialog$ShippingLabelPaperSize;", "onPreviewLabelCompleted", "onPrintShippingLabelClicked", "onPrintShippingLabelInfoSelected", "onSaveForLaterClicked", "onViewLabelFormatOptionsClicked", "writeShippingLabelToFile", "storageDir", "Ljava/io/File;", "shippingLabelPreview", "", "PrintShippingLabelViewState", "WooCommerce_vanillaDebug"})
public final class PrintShippingLabelViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.util.CoroutineDispatchers dispatchers = null;
    private final com.woocommerce.android.ui.orders.shippinglabels.ShippingLabelRepository repository = null;
    private final com.woocommerce.android.tools.NetworkStatus networkStatus = null;
    private final com.woocommerce.android.media.FileUtils fileUtils = null;
    private final com.woocommerce.android.util.Base64Decoder base64Decoder = null;
    private final com.woocommerce.android.viewmodel.NavArgsLazy arguments$delegate = null;
    private final kotlin.Lazy labels$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.shippinglabels.PrintShippingLabelViewModel.PrintShippingLabelViewState> viewStateData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate viewState$delegate = null;
    
    @javax.inject.Inject()
    public PrintShippingLabelViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.CoroutineDispatchers dispatchers, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.orders.shippinglabels.ShippingLabelRepository repository, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.tools.NetworkStatus networkStatus, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.media.FileUtils fileUtils, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.Base64Decoder base64Decoder) {
        super(null);
    }
    
    private final com.woocommerce.android.ui.orders.shippinglabels.PrintShippingLabelFragmentArgs getArguments() {
        return null;
    }
    
    private final java.util.List<com.woocommerce.android.model.ShippingLabel> getLabels() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.shippinglabels.PrintShippingLabelViewModel.PrintShippingLabelViewState> getViewStateData() {
        return null;
    }
    
    private final com.woocommerce.android.ui.orders.shippinglabels.PrintShippingLabelViewModel.PrintShippingLabelViewState getViewState() {
        return null;
    }
    
    private final void setViewState(com.woocommerce.android.ui.orders.shippinglabels.PrintShippingLabelViewModel.PrintShippingLabelViewState p0) {
    }
    
    public final int getScreenTitle() {
        return 0;
    }
    
    public final void onPrintShippingLabelInfoSelected() {
    }
    
    public final void onViewLabelFormatOptionsClicked() {
    }
    
    public final void onPaperSizeOptionsSelected() {
    }
    
    public final void onPaperSizeSelected(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.orders.shippinglabels.ShippingLabelPaperSizeSelectorDialog.ShippingLabelPaperSize paperSize) {
    }
    
    public final void onSaveForLaterClicked() {
    }
    
    public final void onPrintShippingLabelClicked() {
    }
    
    public final void writeShippingLabelToFile(@org.jetbrains.annotations.NotNull()
    java.io.File storageDir, @org.jetbrains.annotations.NotNull()
    java.lang.String shippingLabelPreview) {
    }
    
    public final void onPreviewLabelCompleted() {
    }
    
    private final java.lang.Object handlePreviewError(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\nH\u00c6\u0003JF\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001bJ\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\u0013\u0010\u001e\u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u00d6\u0003J\t\u0010!\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\"\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u001dH\u00d6\u0001R\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0004\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006("}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/PrintShippingLabelViewModel$PrintShippingLabelViewState;", "Landroid/os/Parcelable;", "paperSize", "Lcom/woocommerce/android/ui/orders/shippinglabels/ShippingLabelPaperSizeSelectorDialog$ShippingLabelPaperSize;", "isProgressDialogShown", "", "previewShippingLabel", "", "isLabelExpired", "tempFile", "Ljava/io/File;", "(Lcom/woocommerce/android/ui/orders/shippinglabels/ShippingLabelPaperSizeSelectorDialog$ShippingLabelPaperSize;Ljava/lang/Boolean;Ljava/lang/String;ZLjava/io/File;)V", "()Z", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPaperSize", "()Lcom/woocommerce/android/ui/orders/shippinglabels/ShippingLabelPaperSizeSelectorDialog$ShippingLabelPaperSize;", "getPreviewShippingLabel", "()Ljava/lang/String;", "getTempFile", "()Ljava/io/File;", "component1", "component2", "component3", "component4", "component5", "copy", "(Lcom/woocommerce/android/ui/orders/shippinglabels/ShippingLabelPaperSizeSelectorDialog$ShippingLabelPaperSize;Ljava/lang/Boolean;Ljava/lang/String;ZLjava/io/File;)Lcom/woocommerce/android/ui/orders/shippinglabels/PrintShippingLabelViewModel$PrintShippingLabelViewState;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
    public static final class PrintShippingLabelViewState implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.ui.orders.shippinglabels.ShippingLabelPaperSizeSelectorDialog.ShippingLabelPaperSize paperSize = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isProgressDialogShown = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String previewShippingLabel = null;
        private final boolean isLabelExpired = false;
        @org.jetbrains.annotations.Nullable()
        private final java.io.File tempFile = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.PrintShippingLabelViewModel.PrintShippingLabelViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.shippinglabels.PrintShippingLabelViewModel.PrintShippingLabelViewState copy(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.shippinglabels.ShippingLabelPaperSizeSelectorDialog.ShippingLabelPaperSize paperSize, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isProgressDialogShown, @org.jetbrains.annotations.Nullable()
        java.lang.String previewShippingLabel, boolean isLabelExpired, @org.jetbrains.annotations.Nullable()
        java.io.File tempFile) {
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
        
        public PrintShippingLabelViewState() {
            super();
        }
        
        public PrintShippingLabelViewState(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.shippinglabels.ShippingLabelPaperSizeSelectorDialog.ShippingLabelPaperSize paperSize, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isProgressDialogShown, @org.jetbrains.annotations.Nullable()
        java.lang.String previewShippingLabel, boolean isLabelExpired, @org.jetbrains.annotations.Nullable()
        java.io.File tempFile) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.shippinglabels.ShippingLabelPaperSizeSelectorDialog.ShippingLabelPaperSize component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.shippinglabels.ShippingLabelPaperSizeSelectorDialog.ShippingLabelPaperSize getPaperSize() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isProgressDialogShown() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPreviewShippingLabel() {
            return null;
        }
        
        public final boolean component4() {
            return false;
        }
        
        public final boolean isLabelExpired() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.io.File component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.io.File getTempFile() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.PrintShippingLabelViewModel.PrintShippingLabelViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.orders.shippinglabels.PrintShippingLabelViewModel.PrintShippingLabelViewState createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.orders.shippinglabels.PrintShippingLabelViewModel.PrintShippingLabelViewState[] newArray(int size) {
                return null;
            }
        }
    }
}