package com.woocommerce.android.ui.orders.notes;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u00018B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010,\u001a\u00020-H\u0002J\u0006\u0010.\u001a\u00020-J\u000e\u0010/\u001a\u00020-2\u0006\u00100\u001a\u00020)J\u000e\u00101\u001a\u00020-2\u0006\u00102\u001a\u00020#J\u001e\u00103\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0006\u0012\u0004\u0018\u00010#042\u0006\u00105\u001a\u000206H\u0002J\u0006\u00107\u001a\u00020-R+\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020#8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b$\u0010%R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010&\u001a\u00020#8F\u00a2\u0006\u0006\u001a\u0004\b\'\u0010%R\u0011\u0010(\u001a\u00020)8F\u00a2\u0006\u0006\u001a\u0004\b*\u0010+\u00a8\u00069"}, d2 = {"Lcom/woocommerce/android/ui/orders/notes/AddOrderNoteViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "resourceProvider", "Lcom/woocommerce/android/viewmodel/ResourceProvider;", "networkStatus", "Lcom/woocommerce/android/tools/NetworkStatus;", "orderDetailRepository", "Lcom/woocommerce/android/ui/orders/details/OrderDetailRepository;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/viewmodel/ResourceProvider;Lcom/woocommerce/android/tools/NetworkStatus;Lcom/woocommerce/android/ui/orders/details/OrderDetailRepository;)V", "<set-?>", "Lcom/woocommerce/android/ui/orders/notes/AddOrderNoteViewModel$ViewState;", "addOrderNoteViewState", "getAddOrderNoteViewState", "()Lcom/woocommerce/android/ui/orders/notes/AddOrderNoteViewModel$ViewState;", "setAddOrderNoteViewState", "(Lcom/woocommerce/android/ui/orders/notes/AddOrderNoteViewModel$ViewState;)V", "addOrderNoteViewState$delegate", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "addOrderNoteViewStateData", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getAddOrderNoteViewStateData", "()Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "navArgs", "Lcom/woocommerce/android/ui/orders/notes/AddOrderNoteFragmentArgs;", "getNavArgs", "()Lcom/woocommerce/android/ui/orders/notes/AddOrderNoteFragmentArgs;", "navArgs$delegate", "Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "orderId", "", "getOrderId", "()J", "orderNumber", "", "getOrderNumber", "()Ljava/lang/String;", "screenTitle", "getScreenTitle", "shouldShowAddButton", "", "getShouldShowAddButton", "()Z", "checkIfHasBillingMail", "", "onBackPressed", "onIsCustomerCheckboxChanged", "isChecked", "onOrderTextEntered", "text", "prepareTracksEventsDetails", "", "exception", "Lcom/woocommerce/android/WooException;", "pushOrderNote", "ViewState", "WooCommerce_wasabiDebug"})
public final class AddOrderNoteViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.viewmodel.ResourceProvider resourceProvider = null;
    private final com.woocommerce.android.tools.NetworkStatus networkStatus = null;
    private final com.woocommerce.android.ui.orders.details.OrderDetailRepository orderDetailRepository = null;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.notes.AddOrderNoteViewModel.ViewState> addOrderNoteViewStateData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate addOrderNoteViewState$delegate = null;
    private final com.woocommerce.android.viewmodel.NavArgsLazy navArgs$delegate = null;
    
    @javax.inject.Inject
    public AddOrderNoteViewModel(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.viewmodel.ResourceProvider resourceProvider, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.NetworkStatus networkStatus, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.orders.details.OrderDetailRepository orderDetailRepository) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.notes.AddOrderNoteViewModel.ViewState> getAddOrderNoteViewStateData() {
        return null;
    }
    
    private final com.woocommerce.android.ui.orders.notes.AddOrderNoteViewModel.ViewState getAddOrderNoteViewState() {
        return null;
    }
    
    private final void setAddOrderNoteViewState(com.woocommerce.android.ui.orders.notes.AddOrderNoteViewModel.ViewState p0) {
    }
    
    private final com.woocommerce.android.ui.orders.notes.AddOrderNoteFragmentArgs getNavArgs() {
        return null;
    }
    
    private final long getOrderId() {
        return 0L;
    }
    
    private final java.lang.String getOrderNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getScreenTitle() {
        return null;
    }
    
    public final boolean getShouldShowAddButton() {
        return false;
    }
    
    public final void onOrderTextEntered(@org.jetbrains.annotations.NotNull
    java.lang.String text) {
    }
    
    public final void onIsCustomerCheckboxChanged(boolean isChecked) {
    }
    
    private final void checkIfHasBillingMail() {
    }
    
    public final void pushOrderNote() {
    }
    
    private final java.util.Map<java.lang.String, java.lang.String> prepareTracksEventsDetails(com.woocommerce.android.WooException exception) {
        return null;
    }
    
    public final void onBackPressed() {
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\b\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n\u00a8\u0006\u001f"}, d2 = {"Lcom/woocommerce/android/ui/orders/notes/AddOrderNoteViewModel$ViewState;", "Landroid/os/Parcelable;", "draftNote", "Lcom/woocommerce/android/model/OrderNote;", "showCustomerNoteSwitch", "", "isProgressDialogShown", "(Lcom/woocommerce/android/model/OrderNote;ZZ)V", "canAddNote", "getCanAddNote", "()Z", "getDraftNote", "()Lcom/woocommerce/android/model/OrderNote;", "getShowCustomerNoteSwitch", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class ViewState implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.model.OrderNote draftNote = null;
        private final boolean showCustomerNoteSwitch = false;
        private final boolean isProgressDialogShown = false;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.notes.AddOrderNoteViewModel.ViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.notes.AddOrderNoteViewModel.ViewState copy(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.model.OrderNote draftNote, boolean showCustomerNoteSwitch, boolean isProgressDialogShown) {
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
        
        public ViewState(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.model.OrderNote draftNote, boolean showCustomerNoteSwitch, boolean isProgressDialogShown) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.model.OrderNote component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.model.OrderNote getDraftNote() {
            return null;
        }
        
        public final boolean component2() {
            return false;
        }
        
        public final boolean getShowCustomerNoteSwitch() {
            return false;
        }
        
        public final boolean component3() {
            return false;
        }
        
        public final boolean isProgressDialogShown() {
            return false;
        }
        
        public final boolean getCanAddNote() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.notes.AddOrderNoteViewModel.ViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.orders.notes.AddOrderNoteViewModel.ViewState createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.orders.notes.AddOrderNoteViewModel.ViewState[] newArray(int size) {
                return null;
            }
        }
    }
}