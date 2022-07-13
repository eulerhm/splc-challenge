package com.woocommerce.android.ui.orders.details.editing.address;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001:\bDEFGHIJKB\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u001c\u0010+\u001a\u00020,2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015H\u0002J\u001a\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u00162\n\u0010/\u001a\u000600j\u0002`1J\u000e\u00102\u001a\u00020,2\u0006\u0010.\u001a\u00020\u0016J\u000e\u00103\u001a\u00020,2\u0006\u00104\u001a\u00020\rJ\u0017\u00105\u001a\u00020,2\n\b\u0002\u00106\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0002\u00107J\u001e\u00108\u001a\u00020,2\u0006\u00109\u001a\u00020\u00162\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u000200J\u0006\u0010=\u001a\u00020,J\u001a\u0010>\u001a\u00020,2\u0006\u0010.\u001a\u00020\u00162\n\u0010?\u001a\u000600j\u0002`1J\u000e\u0010@\u001a\u00020,2\u0006\u0010.\u001a\u00020\u0016J\u001a\u0010A\u001a\u00020,2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015J\u0016\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010.\u001a\u00020\u0016H\u0002J\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\n\u0010/\u001a\u000600j\u0002`1H\u0002R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR+\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001f8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0017\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u001f0(\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*\u00a8\u0006L"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/editing/address/AddressViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "dataStore", "Lorg/wordpress/android/fluxc/store/WCDataStore;", "getLocations", "Lcom/woocommerce/android/model/GetLocations;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/tools/SelectedSite;Lorg/wordpress/android/fluxc/store/WCDataStore;Lcom/woocommerce/android/model/GetLocations;)V", "_isDifferentShippingAddressChecked", "Landroidx/lifecycle/MutableLiveData;", "", "countries", "", "Lcom/woocommerce/android/model/Location;", "getCountries", "()Ljava/util/List;", "hasStarted", "initialState", "", "Lcom/woocommerce/android/ui/orders/details/editing/address/AddressViewModel$AddressType;", "Lcom/woocommerce/android/model/Address;", "isAnyAddressEdited", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "isDifferentShippingAddressChecked", "shouldEnableDoneButton", "getShouldEnableDoneButton", "<set-?>", "Lcom/woocommerce/android/ui/orders/details/editing/address/AddressViewModel$ViewState;", "viewState", "getViewState", "()Lcom/woocommerce/android/ui/orders/details/editing/address/AddressViewModel$ViewState;", "setViewState", "(Lcom/woocommerce/android/ui/orders/details/editing/address/AddressViewModel$ViewState;)V", "viewState$delegate", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "viewStateData", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getViewStateData", "()Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "initialize", "", "onCountrySelected", "type", "countryCode", "", "Lcom/woocommerce/android/ui/orders/details/editing/address/LocationCode;", "onCountrySpinnerClicked", "onDifferentShippingAddressChecked", "checked", "onDoneSelected", "addDifferentShippingChecked", "(Ljava/lang/Boolean;)V", "onFieldEdited", "addressType", "field", "Lcom/woocommerce/android/ui/orders/details/editing/address/AddressViewModel$Field;", "value", "onScreenDetached", "onStateSelected", "selectedStateCode", "onStateSpinnerClicked", "start", "statesAvailableFor", "statesFor", "AddressSelectionState", "AddressType", "Exit", "Field", "ShowCountrySelector", "ShowStateSelector", "StateSpinnerStatus", "ViewState", "WooCommerce_vanillaDebug"})
public final class AddressViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    private final org.wordpress.android.fluxc.store.WCDataStore dataStore = null;
    private final com.woocommerce.android.model.GetLocations getLocations = null;
    @org.jetbrains.annotations.NotNull()
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.ViewState> viewStateData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate viewState$delegate = null;
    private boolean hasStarted = false;
    private java.util.Map<com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.AddressType, com.woocommerce.android.model.Address> initialState;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isAnyAddressEdited = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isDifferentShippingAddressChecked = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isDifferentShippingAddressChecked = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> shouldEnableDoneButton = null;
    
    @javax.inject.Inject()
    public AddressViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.tools.SelectedSite selectedSite, @org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.WCDataStore dataStore, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.GetLocations getLocations) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.ViewState> getViewStateData() {
        return null;
    }
    
    private final com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.ViewState getViewState() {
        return null;
    }
    
    private final void setViewState(com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.ViewState p0) {
    }
    
    private final java.util.List<com.woocommerce.android.model.Location> getCountries() {
        return null;
    }
    
    private final java.util.List<com.woocommerce.android.model.Location> statesAvailableFor(com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.AddressType type) {
        return null;
    }
    
    private final java.util.List<com.woocommerce.android.model.Location> statesFor(java.lang.String countryCode) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isAnyAddressEdited() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isDifferentShippingAddressChecked() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getShouldEnableDoneButton() {
        return null;
    }
    
    /**
     * The start method is called when the view is created. When the view is recreated (e.g. navigating to country
     * search and back) we don't want this method to be called again, otherwise the ViewModel will replace the newly
     * selected country or state with the previously saved values.
     */
    public final void start(@org.jetbrains.annotations.NotNull()
    java.util.Map<com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.AddressType, com.woocommerce.android.model.Address> initialState) {
    }
    
    private final void initialize(java.util.Map<com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.AddressType, com.woocommerce.android.model.Address> initialState) {
    }
    
    public final void onDifferentShippingAddressChecked(boolean checked) {
    }
    
    /**
     * Even when the [BaseAddressEditingFragment] instance is destroyed the instance of [AddressViewModel] will still
     * be alive. That means if the user have selected a country or state, discarded the change and navigated again to
     * [BaseAddressEditingFragment] the discarded values of country and state will be used. Because of that, when the
     * Fragment is detached we must clear these values from the ViewModel. We should also allow the [start] method
     * to be called again.
     */
    public final void onScreenDetached() {
    }
    
    public final void onCountrySelected(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.AddressType type, @org.jetbrains.annotations.NotNull()
    java.lang.String countryCode) {
    }
    
    public final void onStateSelected(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.AddressType type, @org.jetbrains.annotations.NotNull()
    java.lang.String selectedStateCode) {
    }
    
    public final void onCountrySpinnerClicked(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.AddressType type) {
    }
    
    public final void onStateSpinnerClicked(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.AddressType type) {
    }
    
    public final void onDoneSelected(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean addDifferentShippingChecked) {
    }
    
    public final void onFieldEdited(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.AddressType addressType, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.Field field, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0015\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0007H\u00c6\u0003J)\u0010\u000e\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\u0013\u0010\u0011\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010H\u00d6\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000b\u00a8\u0006\u001c"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/editing/address/AddressViewModel$ViewState;", "Landroid/os/Parcelable;", "addressSelectionStates", "", "Lcom/woocommerce/android/ui/orders/details/editing/address/AddressViewModel$AddressType;", "Lcom/woocommerce/android/ui/orders/details/editing/address/AddressViewModel$AddressSelectionState;", "isLoading", "", "(Ljava/util/Map;Z)V", "getAddressSelectionStates", "()Ljava/util/Map;", "()Z", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
    public static final class ViewState implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        private final java.util.Map<com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.AddressType, com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.AddressSelectionState> addressSelectionStates = null;
        private final boolean isLoading = false;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.ViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.ViewState copy(@org.jetbrains.annotations.NotNull()
        java.util.Map<com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.AddressType, com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.AddressSelectionState> addressSelectionStates, boolean isLoading) {
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
        java.util.Map<com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.AddressType, com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.AddressSelectionState> addressSelectionStates, boolean isLoading) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Map<com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.AddressType, com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.AddressSelectionState> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Map<com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.AddressType, com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.AddressSelectionState> getAddressSelectionStates() {
            return null;
        }
        
        public final boolean component2() {
            return false;
        }
        
        public final boolean isLoading() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.ViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.ViewState createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.ViewState[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/editing/address/AddressViewModel$AddressType;", "", "(Ljava/lang/String;I)V", "SHIPPING", "BILLING", "WooCommerce_vanillaDebug"})
    public static enum AddressType {
        /*public static final*/ SHIPPING /* = new SHIPPING() */,
        /*public static final*/ BILLING /* = new BILLING() */;
        
        AddressType() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/editing/address/AddressViewModel$StateSpinnerStatus;", "", "(Ljava/lang/String;I)V", "HAVING_LOCATIONS", "RAW_VALUE", "DISABLED", "WooCommerce_vanillaDebug"})
    public static enum StateSpinnerStatus {
        /*public static final*/ HAVING_LOCATIONS /* = new HAVING_LOCATIONS() */,
        /*public static final*/ RAW_VALUE /* = new RAW_VALUE() */,
        /*public static final*/ DISABLED /* = new DISABLED() */;
        
        StateSpinnerStatus() {
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001c"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/editing/address/AddressViewModel$AddressSelectionState;", "Landroid/os/Parcelable;", "address", "Lcom/woocommerce/android/model/Address;", "stateSpinnerStatus", "Lcom/woocommerce/android/ui/orders/details/editing/address/AddressViewModel$StateSpinnerStatus;", "(Lcom/woocommerce/android/model/Address;Lcom/woocommerce/android/ui/orders/details/editing/address/AddressViewModel$StateSpinnerStatus;)V", "getAddress", "()Lcom/woocommerce/android/model/Address;", "getStateSpinnerStatus", "()Lcom/woocommerce/android/ui/orders/details/editing/address/AddressViewModel$StateSpinnerStatus;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
    public static final class AddressSelectionState implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.model.Address address = null;
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.StateSpinnerStatus stateSpinnerStatus = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.AddressSelectionState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.AddressSelectionState copy(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.Address address, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.StateSpinnerStatus stateSpinnerStatus) {
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
        
        public AddressSelectionState(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.Address address, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.StateSpinnerStatus stateSpinnerStatus) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.Address component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.Address getAddress() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.StateSpinnerStatus component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.StateSpinnerStatus getStateSpinnerStatus() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.AddressSelectionState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.AddressSelectionState createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.AddressSelectionState[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/editing/address/AddressViewModel$ShowCountrySelector;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "type", "Lcom/woocommerce/android/ui/orders/details/editing/address/AddressViewModel$AddressType;", "countries", "", "Lcom/woocommerce/android/model/Location;", "(Lcom/woocommerce/android/ui/orders/details/editing/address/AddressViewModel$AddressType;Ljava/util/List;)V", "getCountries", "()Ljava/util/List;", "getType", "()Lcom/woocommerce/android/ui/orders/details/editing/address/AddressViewModel$AddressType;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class ShowCountrySelector extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.AddressType type = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.woocommerce.android.model.Location> countries = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.ShowCountrySelector copy(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.AddressType type, @org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.model.Location> countries) {
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
        
        public ShowCountrySelector(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.AddressType type, @org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.model.Location> countries) {
            super(false);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.AddressType component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.AddressType getType() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.model.Location> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.model.Location> getCountries() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/editing/address/AddressViewModel$ShowStateSelector;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "type", "Lcom/woocommerce/android/ui/orders/details/editing/address/AddressViewModel$AddressType;", "states", "", "Lcom/woocommerce/android/model/Location;", "(Lcom/woocommerce/android/ui/orders/details/editing/address/AddressViewModel$AddressType;Ljava/util/List;)V", "getStates", "()Ljava/util/List;", "getType", "()Lcom/woocommerce/android/ui/orders/details/editing/address/AddressViewModel$AddressType;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class ShowStateSelector extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.AddressType type = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.woocommerce.android.model.Location> states = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.ShowStateSelector copy(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.AddressType type, @org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.model.Location> states) {
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
        
        public ShowStateSelector(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.AddressType type, @org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.model.Location> states) {
            super(false);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.AddressType component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.AddressType getType() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.model.Location> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.model.Location> getStates() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\u0010\u0006J\u0015\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u00c6\u0003J\u001f\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u00c6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/editing/address/AddressViewModel$Exit;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "addresses", "", "Lcom/woocommerce/android/ui/orders/details/editing/address/AddressViewModel$AddressType;", "Lcom/woocommerce/android/model/Address;", "(Ljava/util/Map;)V", "getAddresses", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class Exit extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        @org.jetbrains.annotations.NotNull()
        private final java.util.Map<com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.AddressType, com.woocommerce.android.model.Address> addresses = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.Exit copy(@org.jetbrains.annotations.NotNull()
        java.util.Map<com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.AddressType, com.woocommerce.android.model.Address> addresses) {
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
        
        public Exit(@org.jetbrains.annotations.NotNull()
        java.util.Map<com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.AddressType, com.woocommerce.android.model.Address> addresses) {
            super(false);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Map<com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.AddressType, com.woocommerce.android.model.Address> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Map<com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel.AddressType, com.woocommerce.android.model.Address> getAddresses() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f\u00a8\u0006\r"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/editing/address/AddressViewModel$Field;", "", "(Ljava/lang/String;I)V", "FirstName", "LastName", "Company", "Phone", "Address1", "Address2", "City", "State", "Zip", "Email", "WooCommerce_vanillaDebug"})
    public static enum Field {
        /*public static final*/ FirstName /* = new FirstName() */,
        /*public static final*/ LastName /* = new LastName() */,
        /*public static final*/ Company /* = new Company() */,
        /*public static final*/ Phone /* = new Phone() */,
        /*public static final*/ Address1 /* = new Address1() */,
        /*public static final*/ Address2 /* = new Address2() */,
        /*public static final*/ City /* = new City() */,
        /*public static final*/ State /* = new State() */,
        /*public static final*/ Zip /* = new Zip() */,
        /*public static final*/ Email /* = new Email() */;
        
        Field() {
        }
    }
}