package com.woocommerce.android.ui.orders.shippinglabels.creation;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0004$%&\'B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0019\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u0006\u0010\u001a\u001a\u00020\u0015J\u0006\u0010\u001b\u001a\u00020\u0015J\u0006\u0010\u001c\u001a\u00020\u0015J\u000e\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u0018J\u0006\u0010\u001f\u001a\u00020\u0015J\u000e\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\"J\u0006\u0010#\u001a\u00020\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006("}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelPaymentViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "shippingLabelRepository", "Lcom/woocommerce/android/ui/orders/shippinglabels/ShippingLabelRepository;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/ui/orders/shippinglabels/ShippingLabelRepository;)V", "<set-?>", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelPaymentViewModel$ViewState;", "viewState", "getViewState", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelPaymentViewModel$ViewState;", "setViewState", "(Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelPaymentViewModel$ViewState;)V", "viewState$delegate", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "viewStateData", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getViewStateData", "()Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "loadInitialData", "", "loadPaymentMethods", "forceRefresh", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onAddPaymentMethodClicked", "onBackButtonClicked", "onDoneButtonClicked", "onEmailReceiptsCheckboxChanged", "isChecked", "onPaymentMethodAdded", "onPaymentMethodSelected", "paymentMethod", "Lcom/woocommerce/android/model/PaymentMethod;", "refreshData", "AddPaymentMethod", "DataLoadState", "PaymentMethodUiModel", "ViewState", "WooCommerce_wasabiDebug"})
public final class EditShippingLabelPaymentViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.ui.orders.shippinglabels.ShippingLabelRepository shippingLabelRepository = null;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPaymentViewModel.ViewState> viewStateData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate viewState$delegate = null;
    
    @javax.inject.Inject
    public EditShippingLabelPaymentViewModel(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.orders.shippinglabels.ShippingLabelRepository shippingLabelRepository) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPaymentViewModel.ViewState> getViewStateData() {
        return null;
    }
    
    private final com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPaymentViewModel.ViewState getViewState() {
        return null;
    }
    
    private final void setViewState(com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPaymentViewModel.ViewState p0) {
    }
    
    private final void loadInitialData() {
    }
    
    private final java.lang.Object loadPaymentMethods(boolean forceRefresh, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public final void onEmailReceiptsCheckboxChanged(boolean isChecked) {
    }
    
    public final void onPaymentMethodSelected(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.PaymentMethod paymentMethod) {
    }
    
    public final void onAddPaymentMethodClicked() {
    }
    
    public final void onDoneButtonClicked() {
    }
    
    public final void onBackButtonClicked() {
    }
    
    public final void refreshData() {
    }
    
    public final void onPaymentMethodAdded() {
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0010J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010&\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0007H\u00c6\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u00c6\u0003J\t\u0010)\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\t\u0010+\u001a\u00020\u0007H\u00c6\u0003Je\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0007H\u00c6\u0001J\t\u0010-\u001a\u00020.H\u00d6\u0001J\u0013\u0010/\u001a\u00020\u00072\b\u00100\u001a\u0004\u0018\u000101H\u00d6\u0003J\t\u00102\u001a\u00020.H\u00d6\u0001J\t\u00103\u001a\u000204H\u00d6\u0001J\u0019\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020.H\u00d6\u0001R\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0014\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u0012R\u0011\u0010\u001f\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\b \u0010\u0012R\u0011\u0010\u000f\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0012R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#\u00a8\u0006:"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelPaymentViewModel$ViewState;", "Landroid/os/Parcelable;", "dataLoadState", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelPaymentViewModel$DataLoadState;", "currentAccountSettings", "Lcom/woocommerce/android/model/ShippingAccountSettings;", "canManagePayments", "", "canEditSettings", "paymentMethods", "", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelPaymentViewModel$PaymentMethodUiModel;", "emailReceipts", "storeOwnerDetails", "Lcom/woocommerce/android/model/StoreOwnerDetails;", "showSavingProgressDialog", "(Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelPaymentViewModel$DataLoadState;Lcom/woocommerce/android/model/ShippingAccountSettings;ZZLjava/util/List;ZLcom/woocommerce/android/model/StoreOwnerDetails;Z)V", "getCanEditSettings", "()Z", "getCanManagePayments", "canSave", "getCanSave", "getCurrentAccountSettings", "()Lcom/woocommerce/android/model/ShippingAccountSettings;", "getDataLoadState", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelPaymentViewModel$DataLoadState;", "getEmailReceipts", "getPaymentMethods", "()Ljava/util/List;", "showAddFirstPaymentButton", "getShowAddFirstPaymentButton", "showAddPaymentButton", "getShowAddPaymentButton", "getShowSavingProgressDialog", "getStoreOwnerDetails", "()Lcom/woocommerce/android/model/StoreOwnerDetails;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class ViewState implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable
        private final com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPaymentViewModel.DataLoadState dataLoadState = null;
        @org.jetbrains.annotations.Nullable
        private final com.woocommerce.android.model.ShippingAccountSettings currentAccountSettings = null;
        private final boolean canManagePayments = false;
        private final boolean canEditSettings = false;
        @org.jetbrains.annotations.NotNull
        private final java.util.List<com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPaymentViewModel.PaymentMethodUiModel> paymentMethods = null;
        private final boolean emailReceipts = false;
        @org.jetbrains.annotations.Nullable
        private final com.woocommerce.android.model.StoreOwnerDetails storeOwnerDetails = null;
        private final boolean showSavingProgressDialog = false;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPaymentViewModel.ViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPaymentViewModel.ViewState copy(@org.jetbrains.annotations.Nullable
        com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPaymentViewModel.DataLoadState dataLoadState, @org.jetbrains.annotations.Nullable
        com.woocommerce.android.model.ShippingAccountSettings currentAccountSettings, boolean canManagePayments, boolean canEditSettings, @org.jetbrains.annotations.NotNull
        java.util.List<com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPaymentViewModel.PaymentMethodUiModel> paymentMethods, boolean emailReceipts, @org.jetbrains.annotations.Nullable
        com.woocommerce.android.model.StoreOwnerDetails storeOwnerDetails, boolean showSavingProgressDialog) {
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
        
        public ViewState() {
            super();
        }
        
        public ViewState(@org.jetbrains.annotations.Nullable
        com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPaymentViewModel.DataLoadState dataLoadState, @org.jetbrains.annotations.Nullable
        com.woocommerce.android.model.ShippingAccountSettings currentAccountSettings, boolean canManagePayments, boolean canEditSettings, @org.jetbrains.annotations.NotNull
        java.util.List<com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPaymentViewModel.PaymentMethodUiModel> paymentMethods, boolean emailReceipts, @org.jetbrains.annotations.Nullable
        com.woocommerce.android.model.StoreOwnerDetails storeOwnerDetails, boolean showSavingProgressDialog) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPaymentViewModel.DataLoadState component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPaymentViewModel.DataLoadState getDataLoadState() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.woocommerce.android.model.ShippingAccountSettings component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.woocommerce.android.model.ShippingAccountSettings getCurrentAccountSettings() {
            return null;
        }
        
        public final boolean component3() {
            return false;
        }
        
        public final boolean getCanManagePayments() {
            return false;
        }
        
        public final boolean component4() {
            return false;
        }
        
        public final boolean getCanEditSettings() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPaymentViewModel.PaymentMethodUiModel> component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPaymentViewModel.PaymentMethodUiModel> getPaymentMethods() {
            return null;
        }
        
        public final boolean component6() {
            return false;
        }
        
        public final boolean getEmailReceipts() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.woocommerce.android.model.StoreOwnerDetails component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.woocommerce.android.model.StoreOwnerDetails getStoreOwnerDetails() {
            return null;
        }
        
        public final boolean component8() {
            return false;
        }
        
        public final boolean getShowSavingProgressDialog() {
            return false;
        }
        
        public final boolean getCanSave() {
            return false;
        }
        
        public final boolean getShowAddPaymentButton() {
            return false;
        }
        
        public final boolean getShowAddFirstPaymentButton() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPaymentViewModel.ViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPaymentViewModel.ViewState createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPaymentViewModel.ViewState[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelPaymentViewModel$DataLoadState;", "", "(Ljava/lang/String;I)V", "Loading", "Error", "Success", "WooCommerce_wasabiDebug"})
    public static enum DataLoadState {
        /*public static final*/ Loading /* = new Loading() */,
        /*public static final*/ Error /* = new Error() */,
        /*public static final*/ Success /* = new Success() */;
        
        DataLoadState() {
        }
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u001a"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelPaymentViewModel$PaymentMethodUiModel;", "Landroid/os/Parcelable;", "paymentMethod", "Lcom/woocommerce/android/model/PaymentMethod;", "isSelected", "", "(Lcom/woocommerce/android/model/PaymentMethod;Z)V", "()Z", "getPaymentMethod", "()Lcom/woocommerce/android/model/PaymentMethod;", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class PaymentMethodUiModel implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.model.PaymentMethod paymentMethod = null;
        private final boolean isSelected = false;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPaymentViewModel.PaymentMethodUiModel> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPaymentViewModel.PaymentMethodUiModel copy(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.model.PaymentMethod paymentMethod, boolean isSelected) {
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
        
        public PaymentMethodUiModel(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.model.PaymentMethod paymentMethod, boolean isSelected) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.model.PaymentMethod component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.model.PaymentMethod getPaymentMethod() {
            return null;
        }
        
        public final boolean component2() {
            return false;
        }
        
        public final boolean isSelected() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPaymentViewModel.PaymentMethodUiModel> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPaymentViewModel.PaymentMethodUiModel createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPaymentViewModel.PaymentMethodUiModel[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelPaymentViewModel$AddPaymentMethod;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "()V", "WooCommerce_wasabiDebug"})
    public static final class AddPaymentMethod extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        @org.jetbrains.annotations.NotNull
        public static final com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPaymentViewModel.AddPaymentMethod INSTANCE = null;
        
        private AddPaymentMethod() {
            super(false);
        }
    }
}