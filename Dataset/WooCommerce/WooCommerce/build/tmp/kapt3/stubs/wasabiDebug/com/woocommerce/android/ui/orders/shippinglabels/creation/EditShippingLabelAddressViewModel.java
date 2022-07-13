package com.woocommerce.android.ui.orders.shippinglabels.creation;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 D2\u00020\u0001:\u0007CDEFGHIB/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0002J\"\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\b\b\u0002\u00101\u001a\u000202H\u0002J\b\u00103\u001a\u00020,H\u0002J\u000e\u00104\u001a\u00020,2\u0006\u0010-\u001a\u00020.J\u0006\u00105\u001a\u00020,J\u000e\u00106\u001a\u00020,2\u0006\u00107\u001a\u00020*J\u0006\u00108\u001a\u00020,J\u0006\u00109\u001a\u00020,J\u000e\u0010:\u001a\u00020,2\u0006\u0010-\u001a\u00020.J\u0006\u0010;\u001a\u00020,J\u0016\u0010<\u001a\u00020,2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020*J\u0006\u0010@\u001a\u00020,J\u0006\u0010A\u001a\u00020,J\u0006\u0010B\u001a\u00020,R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R+\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001b0$\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&\u00a8\u0006J"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelAddressViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "addressValidator", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelAddressValidator;", "resourceProvider", "Lcom/woocommerce/android/viewmodel/ResourceProvider;", "dataStore", "Lorg/wordpress/android/fluxc/store/WCDataStore;", "site", "Lcom/woocommerce/android/tools/SelectedSite;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelAddressValidator;Lcom/woocommerce/android/viewmodel/ResourceProvider;Lorg/wordpress/android/fluxc/store/WCDataStore;Lcom/woocommerce/android/tools/SelectedSite;)V", "arguments", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelAddressFragmentArgs;", "getArguments", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelAddressFragmentArgs;", "arguments$delegate", "Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "countries", "", "Lcom/woocommerce/android/model/Location;", "getCountries", "()Ljava/util/List;", "states", "getStates", "<set-?>", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelAddressViewModel$ViewState;", "viewState", "getViewState", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelAddressViewModel$ViewState;", "setViewState", "(Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelAddressViewModel$ViewState;)V", "viewState$delegate", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "viewStateData", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getViewStateData", "()Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getAddressErrorStringRes", "", "message", "", "handleValidationResult", "", "address", "Lcom/woocommerce/android/model/Address;", "result", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelAddressValidator$ValidationResult;", "showToastErrors", "", "loadCountriesAndStates", "onAddressSelected", "onContactCustomerTapped", "onCountrySelected", "countryCode", "onCountrySpinnerTapped", "onDoneButtonClicked", "onEditRequested", "onExit", "onFieldEdited", "field", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelAddressViewModel$Field;", "content", "onOpenMapTapped", "onStateSpinnerTapped", "onUseAddressAsIsButtonClicked", "Address1Field", "Companion", "Field", "LocationField", "NameField", "PhoneField", "ViewState", "WooCommerce_wasabiDebug"})
public final class EditShippingLabelAddressViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressValidator addressValidator = null;
    private final com.woocommerce.android.viewmodel.ResourceProvider resourceProvider = null;
    private final org.wordpress.android.fluxc.store.WCDataStore dataStore = null;
    private final com.woocommerce.android.tools.SelectedSite site = null;
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String[] ACCEPTED_USPS_ORIGIN_COUNTRIES = {"US", "PR", "VI", "GU", "AS", "UM", "MH", "FM", "MP"};
    private final com.woocommerce.android.viewmodel.NavArgsLazy arguments$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.ViewState> viewStateData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate viewState$delegate = null;
    
    @javax.inject.Inject
    public EditShippingLabelAddressViewModel(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressValidator addressValidator, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.viewmodel.ResourceProvider resourceProvider, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.WCDataStore dataStore, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.SelectedSite site) {
        super(null);
    }
    
    private final com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressFragmentArgs getArguments() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.ViewState> getViewStateData() {
        return null;
    }
    
    private final com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.ViewState getViewState() {
        return null;
    }
    
    private final void setViewState(com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.ViewState p0) {
    }
    
    private final java.util.List<com.woocommerce.android.model.Location> getCountries() {
        return null;
    }
    
    private final java.util.List<com.woocommerce.android.model.Location> getStates() {
        return null;
    }
    
    public final void onDoneButtonClicked() {
    }
    
    private final void loadCountriesAndStates() {
    }
    
    private final void handleValidationResult(com.woocommerce.android.model.Address address, com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressValidator.ValidationResult result, boolean showToastErrors) {
    }
    
    public final void onUseAddressAsIsButtonClicked() {
    }
    
    public final void onCountrySpinnerTapped() {
    }
    
    public final void onStateSpinnerTapped() {
    }
    
    public final void onOpenMapTapped() {
    }
    
    public final void onContactCustomerTapped() {
    }
    
    public final void onCountrySelected(@org.jetbrains.annotations.NotNull
    java.lang.String countryCode) {
    }
    
    public final void onAddressSelected(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.Address address) {
    }
    
    public final void onEditRequested(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.Address address) {
    }
    
    public final void onFieldEdited(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.Field field, @org.jetbrains.annotations.NotNull
    java.lang.String content) {
    }
    
    public final void onExit() {
    }
    
    private final int getAddressErrorStringRes(java.lang.String message) {
        return 0;
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b2\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0091\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u00a2\u0006\u0002\u0010\u001eJ\t\u0010<\u001a\u00020\u0006H\u00c2\u0003J\t\u0010=\u001a\u00020\u0010H\u00c6\u0003J\t\u0010>\u001a\u00020\u0017H\u00c6\u0003J\t\u0010?\u001a\u00020\u0017H\u00c6\u0003J\t\u0010@\u001a\u00020\u001aH\u00c6\u0003J\t\u0010A\u001a\u00020\u001aH\u00c6\u0003J\u0010\u0010B\u001a\u0004\u0018\u00010\u001dH\u00c6\u0003\u00a2\u0006\u0002\u00109J\u000b\u0010C\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u00101J\u0010\u0010E\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u00101J\u0010\u0010F\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u00101J\t\u0010G\u001a\u00020\u000eH\u00c6\u0003J\t\u0010H\u001a\u00020\u0010H\u00c6\u0003J\t\u0010I\u001a\u00020\u0012H\u00c6\u0003J\t\u0010J\u001a\u00020\u0014H\u00c6\u0003J\u00ae\u0001\u0010K\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u00c6\u0001\u00a2\u0006\u0002\u0010LJ\t\u0010M\u001a\u00020\u001dH\u00d6\u0001J\u0013\u0010N\u001a\u00020\n2\b\u0010O\u001a\u0004\u0018\u00010PH\u00d6\u0003J\u0015\u0010Q\u001a\u0006\u0012\u0002\b\u00030R2\u0006\u0010S\u001a\u00020TH\u0086\u0002J\u0006\u0010U\u001a\u00020VJ\t\u0010W\u001a\u00020\u001dH\u00d6\u0001J\t\u0010X\u001a\u00020\bH\u00d6\u0001J\u0006\u0010Y\u001a\u00020\u0000J\u0019\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020]2\u0006\u0010^\u001a\u00020\u001dH\u00d6\u0001R\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0015\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010#\u001a\u00020\n8F\u00a2\u0006\f\u0012\u0004\b$\u0010%\u001a\u0004\b&\u0010\'R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0016\u001a\u00020\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\"R\u0011\u0010\u001b\u001a\u00020\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0017\u0010/\u001a\u00020\n8F\u00a2\u0006\f\u0012\u0004\b0\u0010%\u001a\u0004\b/\u0010\'R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\n\n\u0002\u00102\u001a\u0004\b\u000b\u00101R\u0015\u0010\f\u001a\u0004\u0018\u00010\n\u00a2\u0006\n\n\u0002\u00102\u001a\u0004\b\f\u00101R\u0015\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\n\n\u0002\u00102\u001a\u0004\b\t\u00101R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\u0019\u001a\u00020\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010.R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u00a2\u0006\n\n\u0002\u0010:\u001a\u0004\b8\u00109R\u0011\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010+\u00a8\u0006_"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelAddressViewModel$ViewState;", "Landroid/os/Parcelable;", "args", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelAddressFragmentArgs;", "(Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelAddressFragmentArgs;)V", "addressType", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelAddressValidator$AddressType;", "bannerMessage", "", "isValidationProgressDialogVisible", "", "isLoadingProgressDialogVisible", "isStateFieldSpinner", "nameField", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelAddressViewModel$NameField;", "companyField", "Lcom/woocommerce/android/ui/common/OptionalField;", "phoneField", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelAddressViewModel$PhoneField;", "address1Field", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelAddressViewModel$Address1Field;", "address2Field", "cityField", "Lcom/woocommerce/android/ui/common/RequiredField;", "zipField", "stateField", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelAddressViewModel$LocationField;", "countryField", "title", "", "(Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelAddressValidator$AddressType;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelAddressViewModel$NameField;Lcom/woocommerce/android/ui/common/OptionalField;Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelAddressViewModel$PhoneField;Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelAddressViewModel$Address1Field;Lcom/woocommerce/android/ui/common/OptionalField;Lcom/woocommerce/android/ui/common/RequiredField;Lcom/woocommerce/android/ui/common/RequiredField;Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelAddressViewModel$LocationField;Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelAddressViewModel$LocationField;Ljava/lang/Integer;)V", "getAddress1Field", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelAddressViewModel$Address1Field;", "getAddress2Field", "()Lcom/woocommerce/android/ui/common/OptionalField;", "areAllRequiredFieldsValid", "getAreAllRequiredFieldsValid$annotations", "()V", "getAreAllRequiredFieldsValid", "()Z", "getBannerMessage", "()Ljava/lang/String;", "getCityField", "()Lcom/woocommerce/android/ui/common/RequiredField;", "getCompanyField", "getCountryField", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelAddressViewModel$LocationField;", "isContactCustomerButtonVisible", "isContactCustomerButtonVisible$annotations", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getNameField", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelAddressViewModel$NameField;", "getPhoneField", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelAddressViewModel$PhoneField;", "getStateField", "getTitle", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getZipField", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelAddressValidator$AddressType;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelAddressViewModel$NameField;Lcom/woocommerce/android/ui/common/OptionalField;Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelAddressViewModel$PhoneField;Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelAddressViewModel$Address1Field;Lcom/woocommerce/android/ui/common/OptionalField;Lcom/woocommerce/android/ui/common/RequiredField;Lcom/woocommerce/android/ui/common/RequiredField;Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelAddressViewModel$LocationField;Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelAddressViewModel$LocationField;Ljava/lang/Integer;)Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelAddressViewModel$ViewState;", "describeContents", "equals", "other", "", "get", "Lcom/woocommerce/android/ui/common/InputField;", "field", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelAddressViewModel$Field;", "getAddress", "Lcom/woocommerce/android/model/Address;", "hashCode", "toString", "validateAllFields", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class ViewState implements android.os.Parcelable {
        private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressValidator.AddressType addressType = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String bannerMessage = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean isValidationProgressDialogVisible = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean isLoadingProgressDialogVisible = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean isStateFieldSpinner = null;
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.NameField nameField = null;
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.ui.common.OptionalField companyField = null;
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.PhoneField phoneField = null;
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.Address1Field address1Field = null;
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.ui.common.OptionalField address2Field = null;
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.ui.common.RequiredField cityField = null;
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.ui.common.RequiredField zipField = null;
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.LocationField stateField = null;
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.LocationField countryField = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Integer title = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.ViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.ViewState copy(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressValidator.AddressType addressType, @org.jetbrains.annotations.Nullable
        java.lang.String bannerMessage, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isValidationProgressDialogVisible, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isLoadingProgressDialogVisible, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isStateFieldSpinner, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.NameField nameField, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.common.OptionalField companyField, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.PhoneField phoneField, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.Address1Field address1Field, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.common.OptionalField address2Field, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.common.RequiredField cityField, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.common.RequiredField zipField, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.LocationField stateField, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.LocationField countryField, @org.jetbrains.annotations.Nullable
        @androidx.annotation.StringRes
        java.lang.Integer title) {
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
        
        public ViewState(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressValidator.AddressType addressType, @org.jetbrains.annotations.Nullable
        java.lang.String bannerMessage, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isValidationProgressDialogVisible, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isLoadingProgressDialogVisible, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isStateFieldSpinner, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.NameField nameField, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.common.OptionalField companyField, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.PhoneField phoneField, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.Address1Field address1Field, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.common.OptionalField address2Field, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.common.RequiredField cityField, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.common.RequiredField zipField, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.LocationField stateField, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.LocationField countryField, @org.jetbrains.annotations.Nullable
        @androidx.annotation.StringRes
        java.lang.Integer title) {
            super();
        }
        
        private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressValidator.AddressType component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getBannerMessage() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean isValidationProgressDialogVisible() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean isLoadingProgressDialogVisible() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean isStateFieldSpinner() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.NameField component6() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.NameField getNameField() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.common.OptionalField component7() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.common.OptionalField getCompanyField() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.PhoneField component8() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.PhoneField getPhoneField() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.Address1Field component9() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.Address1Field getAddress1Field() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.common.OptionalField component10() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.common.OptionalField getAddress2Field() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.common.RequiredField component11() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.common.RequiredField getCityField() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.common.RequiredField component12() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.common.RequiredField getZipField() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.LocationField component13() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.LocationField getStateField() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.LocationField component14() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.LocationField getCountryField() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer component15() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer getTitle() {
            return null;
        }
        
        public ViewState(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressFragmentArgs args) {
            super();
        }
        
        @kotlinx.parcelize.IgnoredOnParcel
        @java.lang.Deprecated
        public static void isContactCustomerButtonVisible$annotations() {
        }
        
        public final boolean isContactCustomerButtonVisible() {
            return false;
        }
        
        @kotlinx.parcelize.IgnoredOnParcel
        @java.lang.Deprecated
        public static void getAreAllRequiredFieldsValid$annotations() {
        }
        
        public final boolean getAreAllRequiredFieldsValid() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.common.InputField<?> get(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.Field field) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.ViewState validateAllFields() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.model.Address getAddress() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.ViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.ViewState createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.ViewState[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u0003H\u00d6\u0001J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rH\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0016"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelAddressViewModel$NameField;", "Lcom/woocommerce/android/ui/common/InputField;", "content", "", "companyContent", "(Ljava/lang/String;Ljava/lang/String;)V", "getCompanyContent", "()Ljava/lang/String;", "getContent", "component1", "component2", "copy", "describeContents", "", "toString", "validateInternal", "Lcom/woocommerce/android/model/UiString;", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class NameField extends com.woocommerce.android.ui.common.InputField<com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.NameField> {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String content = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String companyContent = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.NameField> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.NameField copy(@org.jetbrains.annotations.NotNull
        java.lang.String content, @org.jetbrains.annotations.NotNull
        java.lang.String companyContent) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public NameField(@org.jetbrains.annotations.NotNull
        java.lang.String content, @org.jetbrains.annotations.NotNull
        java.lang.String companyContent) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String getContent() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getCompanyContent() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        @java.lang.Override
        protected com.woocommerce.android.model.UiString validateInternal() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.NameField> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.NameField createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.NameField[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u0010\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0005H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0019"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelAddressViewModel$Address1Field;", "Lcom/woocommerce/android/ui/common/InputField;", "content", "", "validationError", "", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getContent", "()Ljava/lang/String;", "getValidationError", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelAddressViewModel$Address1Field;", "describeContents", "toString", "validateInternal", "Lcom/woocommerce/android/model/UiString;", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class Address1Field extends com.woocommerce.android.ui.common.InputField<com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.Address1Field> {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String content = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Integer validationError = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.Address1Field> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.Address1Field copy(@org.jetbrains.annotations.NotNull
        java.lang.String content, @org.jetbrains.annotations.Nullable
        @androidx.annotation.StringRes
        java.lang.Integer validationError) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public Address1Field(@org.jetbrains.annotations.NotNull
        java.lang.String content, @org.jetbrains.annotations.Nullable
        @androidx.annotation.StringRes
        java.lang.Integer validationError) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String getContent() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer getValidationError() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        @java.lang.Override
        protected com.woocommerce.android.model.UiString validateInternal() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.Address1Field> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.Address1Field createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.Address1Field[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001d"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelAddressViewModel$PhoneField;", "Lcom/woocommerce/android/ui/common/InputField;", "content", "", "needsValidation", "", "addressType", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelAddressValidator$AddressType;", "(Ljava/lang/String;ZLcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelAddressValidator$AddressType;)V", "getAddressType", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelAddressValidator$AddressType;", "getContent", "()Ljava/lang/String;", "getNeedsValidation", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "toString", "validateInternal", "Lcom/woocommerce/android/model/UiString;", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class PhoneField extends com.woocommerce.android.ui.common.InputField<com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.PhoneField> {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String content = null;
        private final boolean needsValidation = false;
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressValidator.AddressType addressType = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.PhoneField> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.PhoneField copy(@org.jetbrains.annotations.NotNull
        java.lang.String content, boolean needsValidation, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressValidator.AddressType addressType) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public PhoneField(@org.jetbrains.annotations.NotNull
        java.lang.String content, boolean needsValidation, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressValidator.AddressType addressType) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String getContent() {
            return null;
        }
        
        public final boolean component2() {
            return false;
        }
        
        public final boolean getNeedsValidation() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressValidator.AddressType component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressValidator.AddressType getAddressType() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        @java.lang.Override
        protected com.woocommerce.android.model.UiString validateInternal() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.PhoneField> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.PhoneField createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.PhoneField[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0018"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelAddressViewModel$LocationField;", "Lcom/woocommerce/android/ui/common/InputField;", "location", "Lcom/woocommerce/android/model/Location;", "isRequired", "", "(Lcom/woocommerce/android/model/Location;Z)V", "()Z", "getLocation", "()Lcom/woocommerce/android/model/Location;", "component1", "component2", "copy", "describeContents", "", "toString", "", "validateInternal", "Lcom/woocommerce/android/model/UiString;", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class LocationField extends com.woocommerce.android.ui.common.InputField<com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.LocationField> {
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.model.Location location = null;
        private final boolean isRequired = false;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.LocationField> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.LocationField copy(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.model.Location location, boolean isRequired) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public LocationField(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.model.Location location, boolean isRequired) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.model.Location component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.model.Location getLocation() {
            return null;
        }
        
        public final boolean component2() {
            return false;
        }
        
        public final boolean isRequired() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable
        @java.lang.Override
        protected com.woocommerce.android.model.UiString validateInternal() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.LocationField> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.LocationField createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel.LocationField[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b\u00a8\u0006\f"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelAddressViewModel$Field;", "", "(Ljava/lang/String;I)V", "Name", "Company", "Phone", "Address1", "Address2", "City", "State", "Zip", "Country", "WooCommerce_wasabiDebug"})
    public static enum Field {
        /*public static final*/ Name /* = new Name() */,
        /*public static final*/ Company /* = new Company() */,
        /*public static final*/ Phone /* = new Phone() */,
        /*public static final*/ Address1 /* = new Address1() */,
        /*public static final*/ Address2 /* = new Address2() */,
        /*public static final*/ City /* = new City() */,
        /*public static final*/ State /* = new State() */,
        /*public static final*/ Zip /* = new Zip() */,
        /*public static final*/ Country /* = new Country() */;
        
        Field() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\t"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelAddressViewModel$Companion;", "", "()V", "ACCEPTED_USPS_ORIGIN_COUNTRIES", "", "", "getACCEPTED_USPS_ORIGIN_COUNTRIES", "()[Ljava/lang/String;", "[Ljava/lang/String;", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String[] getACCEPTED_USPS_ORIGIN_COUNTRIES() {
            return null;
        }
    }
}