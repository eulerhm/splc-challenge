package com.woocommerce.android.ui.orders.shippinglabels.creation;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00a4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 b2\u00020\u00012\u00020\u0002:\u0005bcdefB/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\u000e\u00102\u001a\b\u0012\u0004\u0012\u0002030\u0015H\u0002J\u0011\u00104\u001a\u000205H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00106J\b\u00107\u001a\u000208H\u0002J\u0006\u00109\u001a\u000208J\u0018\u0010:\u001a\u0002082\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u001aH\u0016J\u0018\u0010>\u001a\u0002082\u0006\u0010;\u001a\u00020<2\u0006\u0010?\u001a\u00020@H\u0016J\u0006\u0010A\u001a\u000208J \u0010B\u001a\u0002082\u0006\u0010C\u001a\u00020<2\u0006\u0010D\u001a\u00020<2\u0006\u0010E\u001a\u00020\u001aH\u0016J \u0010F\u001a\u0002082\u0006\u0010C\u001a\u00020<2\u0006\u0010D\u001a\u00020<2\u0006\u0010G\u001a\u00020\u001aH\u0016J \u0010H\u001a\u0002082\u0006\u0010C\u001a\u00020<2\u0006\u0010D\u001a\u00020<2\u0006\u0010I\u001a\u00020\u001aH\u0016J\u0018\u0010J\u001a\u0002082\u0006\u0010;\u001a\u00020<2\u0006\u0010K\u001a\u00020\u001aH\u0016J \u0010L\u001a\u0002082\u0006\u0010C\u001a\u00020<2\u0006\u0010D\u001a\u00020<2\u0006\u0010M\u001a\u00020\u0016H\u0016J\u0018\u0010N\u001a\u0002082\u0006\u0010;\u001a\u00020<2\u0006\u0010O\u001a\u000205H\u0016J\u0018\u0010P\u001a\u0002082\u0006\u0010;\u001a\u00020<2\u0006\u0010Q\u001a\u00020\u001aH\u0016J\u0018\u0010R\u001a\u0002082\u0006\u0010;\u001a\u00020<2\u0006\u0010S\u001a\u00020TH\u0016J\u0018\u0010U\u001a\u0002082\u0006\u0010;\u001a\u00020<2\u0006\u0010V\u001a\u000205H\u0016J \u0010W\u001a\u0002082\u0006\u0010C\u001a\u00020<2\u0006\u0010D\u001a\u00020<2\u0006\u0010X\u001a\u00020\u001aH\u0016J \u0010Y\u001a\u0002082\u0006\u0010C\u001a\u00020<2\u0006\u0010D\u001a\u00020<2\u0006\u0010Z\u001a\u00020[H\u0002J\u0018\u0010\\\u001a\u0002082\u0006\u0010;\u001a\u00020<2\u0006\u0010]\u001a\u000203H\u0002J\f\u0010^\u001a\u00020_*\u00020[H\u0002J\f\u0010^\u001a\u00020`*\u000203H\u0002J\u000e\u0010a\u001a\u0004\u0018\u00010\u001a*\u00020[H\u0002R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u001a8F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020$8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020$0-\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u00100\u001a\u00020\u001a8F\u00a2\u0006\u0006\u001a\u0004\b1\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006g"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCustomsViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCustomsFormListener;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "selectedSide", "Lcom/woocommerce/android/tools/SelectedSite;", "parameterRepository", "Lcom/woocommerce/android/ui/products/ParameterRepository;", "dataStore", "Lorg/wordpress/android/fluxc/store/WCDataStore;", "resourceProvider", "Lcom/woocommerce/android/viewmodel/ResourceProvider;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/tools/SelectedSite;Lcom/woocommerce/android/ui/products/ParameterRepository;Lorg/wordpress/android/fluxc/store/WCDataStore;Lcom/woocommerce/android/viewmodel/ResourceProvider;)V", "args", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCustomsFragmentArgs;", "getArgs", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCustomsFragmentArgs;", "args$delegate", "Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "countries", "", "Lcom/woocommerce/android/model/Location;", "getCountries", "()Ljava/util/List;", "currencyUnit", "", "getCurrencyUnit", "()Ljava/lang/String;", "parameters", "Lcom/woocommerce/android/ui/products/models/SiteParameters;", "getParameters", "()Lcom/woocommerce/android/ui/products/models/SiteParameters;", "parameters$delegate", "Lkotlin/Lazy;", "<set-?>", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCustomsViewModel$ViewState;", "viewState", "getViewState", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCustomsViewModel$ViewState;", "setViewState", "(Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCustomsViewModel$ViewState;)V", "viewState$delegate", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "viewStateData", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getViewStateData", "()Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "weightUnit", "getWeightUnit", "createDefaultCustomPackages", "Lcom/woocommerce/android/model/CustomsPackage;", "loadCountriesIfNeeded", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadData", "", "onBackButtonClicked", "onContentsDescriptionChanged", "position", "", "contentsDescription", "onContentsTypeChanged", "contentsType", "Lcom/woocommerce/android/model/ContentsType;", "onDoneButtonClicked", "onHsTariffNumberChanged", "packagePosition", "linePosition", "hsTariffNumber", "onItemDescriptionChanged", "description", "onItemValueChanged", "itemValue", "onItnChanged", "itn", "onOriginCountryChanged", "country", "onPackageExpandedChanged", "isExpanded", "onRestrictionDescriptionChanged", "restrictionDescription", "onRestrictionTypeChanged", "restrictionType", "Lcom/woocommerce/android/model/RestrictionType;", "onReturnToSenderChanged", "returnToSender", "onWeightChanged", "weight", "updateLine", "line", "Lcom/woocommerce/android/model/CustomsLine;", "updatePackage", "item", "validate", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCustomsViewModel$LineValidationState;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCustomsViewModel$PackageValidationState;", "validateHsTariff", "Companion", "CustomsPackageUiState", "LineValidationState", "PackageValidationState", "ViewState", "WooCommerce_vanillaDebug"})
public final class ShippingCustomsViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel implements com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsFormListener {
    private final com.woocommerce.android.tools.SelectedSite selectedSide = null;
    private final org.wordpress.android.fluxc.store.WCDataStore dataStore = null;
    private final com.woocommerce.android.viewmodel.ResourceProvider resourceProvider = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel.Companion Companion = null;
    private static final java.lang.String KEY_PARAMETERS = "key_parameters";
    @org.jetbrains.annotations.NotNull()
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel.ViewState> viewStateData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate viewState$delegate = null;
    private final com.woocommerce.android.viewmodel.NavArgsLazy args$delegate = null;
    private final kotlin.Lazy parameters$delegate = null;
    
    @javax.inject.Inject()
    public ShippingCustomsViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.tools.SelectedSite selectedSide, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.ParameterRepository parameterRepository, @org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.WCDataStore dataStore, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.viewmodel.ResourceProvider resourceProvider) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel.ViewState> getViewStateData() {
        return null;
    }
    
    private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel.ViewState getViewState() {
        return null;
    }
    
    private final void setViewState(com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel.ViewState p0) {
    }
    
    private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsFragmentArgs getArgs() {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.models.SiteParameters getParameters() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWeightUnit() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrencyUnit() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.woocommerce.android.model.Location> getCountries() {
        return null;
    }
    
    private final void loadData() {
    }
    
    private final java.util.List<com.woocommerce.android.model.CustomsPackage> createDefaultCustomPackages() {
        return null;
    }
    
    private final java.lang.Object loadCountriesIfNeeded(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    public final void onDoneButtonClicked() {
    }
    
    public final void onBackButtonClicked() {
    }
    
    @java.lang.Override()
    public void onPackageExpandedChanged(int position, boolean isExpanded) {
    }
    
    @java.lang.Override()
    public void onReturnToSenderChanged(int position, boolean returnToSender) {
    }
    
    @java.lang.Override()
    public void onContentsTypeChanged(int position, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.ContentsType contentsType) {
    }
    
    @java.lang.Override()
    public void onContentsDescriptionChanged(int position, @org.jetbrains.annotations.NotNull()
    java.lang.String contentsDescription) {
    }
    
    @java.lang.Override()
    public void onRestrictionTypeChanged(int position, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.RestrictionType restrictionType) {
    }
    
    @java.lang.Override()
    public void onRestrictionDescriptionChanged(int position, @org.jetbrains.annotations.NotNull()
    java.lang.String restrictionDescription) {
    }
    
    @java.lang.Override()
    public void onItnChanged(int position, @org.jetbrains.annotations.NotNull()
    java.lang.String itn) {
    }
    
    @java.lang.Override()
    public void onItemDescriptionChanged(int packagePosition, int linePosition, @org.jetbrains.annotations.NotNull()
    java.lang.String description) {
    }
    
    @java.lang.Override()
    public void onHsTariffNumberChanged(int packagePosition, int linePosition, @org.jetbrains.annotations.NotNull()
    java.lang.String hsTariffNumber) {
    }
    
    @java.lang.Override()
    public void onWeightChanged(int packagePosition, int linePosition, @org.jetbrains.annotations.NotNull()
    java.lang.String weight) {
    }
    
    @java.lang.Override()
    public void onItemValueChanged(int packagePosition, int linePosition, @org.jetbrains.annotations.NotNull()
    java.lang.String itemValue) {
    }
    
    @java.lang.Override()
    public void onOriginCountryChanged(int packagePosition, int linePosition, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.Location country) {
    }
    
    private final void updateLine(int packagePosition, int linePosition, com.woocommerce.android.model.CustomsLine line) {
    }
    
    private final void updatePackage(int position, com.woocommerce.android.model.CustomsPackage item) {
    }
    
    private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel.PackageValidationState validate(com.woocommerce.android.model.CustomsPackage $this$validate) {
        return null;
    }
    
    private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel.LineValidationState validate(com.woocommerce.android.model.CustomsLine $this$validate) {
        return null;
    }
    
    private final java.lang.String validateHsTariff(com.woocommerce.android.model.CustomsLine $this$validateHsTariff) {
        return null;
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0006H\u00c6\u0003J#\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013H\u00d6\u0001R\u0017\u0010\b\u001a\u00020\u00068F\u00a2\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\f\u00a8\u0006\u001f"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCustomsViewModel$ViewState;", "Landroid/os/Parcelable;", "customsPackages", "", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCustomsViewModel$CustomsPackageUiState;", "isProgressViewShown", "", "(Ljava/util/List;Z)V", "canSubmitForm", "getCanSubmitForm$annotations", "()V", "getCanSubmitForm", "()Z", "getCustomsPackages", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
    public static final class ViewState implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel.CustomsPackageUiState> customsPackages = null;
        private final boolean isProgressViewShown = false;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel.ViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel.ViewState copy(@org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel.CustomsPackageUiState> customsPackages, boolean isProgressViewShown) {
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
        java.util.List<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel.CustomsPackageUiState> customsPackages, boolean isProgressViewShown) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel.CustomsPackageUiState> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel.CustomsPackageUiState> getCustomsPackages() {
            return null;
        }
        
        public final boolean component2() {
            return false;
        }
        
        public final boolean isProgressViewShown() {
            return false;
        }
        
        @kotlinx.parcelize.IgnoredOnParcel()
        @java.lang.Deprecated()
        public static void getCanSubmitForm$annotations() {
        }
        
        public final boolean getCanSubmitForm() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel.ViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel.ViewState createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel.ViewState[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\u0013\u0010\u001c\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u001bH\u00d6\u0001J\t\u0010 \u001a\u00020!H\u00d6\u0001J\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bH\u00d6\u0001R\'\u0010\t\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bj\u0002`\u000e0\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006\'"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCustomsViewModel$CustomsPackageUiState;", "Landroid/os/Parcelable;", "data", "Lcom/woocommerce/android/model/CustomsPackage;", "validationState", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCustomsViewModel$PackageValidationState;", "isExpanded", "", "(Lcom/woocommerce/android/model/CustomsPackage;Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCustomsViewModel$PackageValidationState;Z)V", "customsLinesUiState", "", "Lkotlin/Pair;", "Lcom/woocommerce/android/model/CustomsLine;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCustomsViewModel$LineValidationState;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CustomsLineUiState;", "getCustomsLinesUiState", "()Ljava/util/List;", "getData", "()Lcom/woocommerce/android/model/CustomsPackage;", "()Z", "getValidationState", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCustomsViewModel$PackageValidationState;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
    public static final class CustomsPackageUiState implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.model.CustomsPackage data = null;
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel.PackageValidationState validationState = null;
        private final boolean isExpanded = false;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel.CustomsPackageUiState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel.CustomsPackageUiState copy(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.CustomsPackage data, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel.PackageValidationState validationState, boolean isExpanded) {
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
        
        public CustomsPackageUiState(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.CustomsPackage data, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel.PackageValidationState validationState, boolean isExpanded) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.CustomsPackage component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.CustomsPackage getData() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel.PackageValidationState component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel.PackageValidationState getValidationState() {
            return null;
        }
        
        public final boolean component3() {
            return false;
        }
        
        public final boolean isExpanded() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<kotlin.Pair<com.woocommerce.android.model.CustomsLine, com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel.LineValidationState>> getCustomsLinesUiState() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel.CustomsPackageUiState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel.CustomsPackageUiState createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel.CustomsPackageUiState[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J=\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\u0013\u0010\u001c\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u001bH\u00d6\u0001J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001bH\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\r8F\u00a2\u0006\f\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000b\u00a8\u0006&"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCustomsViewModel$PackageValidationState;", "Landroid/os/Parcelable;", "itnErrorMessage", "", "contentsDescriptionErrorMessage", "restrictionDescriptionErrorMessage", "linesValidationState", "", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCustomsViewModel$LineValidationState;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getContentsDescriptionErrorMessage", "()Ljava/lang/String;", "isValid", "", "isValid$annotations", "()V", "()Z", "getItnErrorMessage", "getLinesValidationState", "()Ljava/util/List;", "getRestrictionDescriptionErrorMessage", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
    public static final class PackageValidationState implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String itnErrorMessage = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String contentsDescriptionErrorMessage = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String restrictionDescriptionErrorMessage = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel.LineValidationState> linesValidationState = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel.PackageValidationState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel.PackageValidationState copy(@org.jetbrains.annotations.Nullable()
        java.lang.String itnErrorMessage, @org.jetbrains.annotations.Nullable()
        java.lang.String contentsDescriptionErrorMessage, @org.jetbrains.annotations.Nullable()
        java.lang.String restrictionDescriptionErrorMessage, @org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel.LineValidationState> linesValidationState) {
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
        
        public PackageValidationState() {
            super();
        }
        
        public PackageValidationState(@org.jetbrains.annotations.Nullable()
        java.lang.String itnErrorMessage, @org.jetbrains.annotations.Nullable()
        java.lang.String contentsDescriptionErrorMessage, @org.jetbrains.annotations.Nullable()
        java.lang.String restrictionDescriptionErrorMessage, @org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel.LineValidationState> linesValidationState) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getItnErrorMessage() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getContentsDescriptionErrorMessage() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getRestrictionDescriptionErrorMessage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel.LineValidationState> component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel.LineValidationState> getLinesValidationState() {
            return null;
        }
        
        @kotlinx.parcelize.IgnoredOnParcel()
        @java.lang.Deprecated()
        public static void isValid$annotations() {
        }
        
        public final boolean isValid() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel.PackageValidationState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel.PackageValidationState createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel.PackageValidationState[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0007J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J9\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\u0013\u0010\u0019\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0018H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\u00020\u000b8F\u00a2\u0006\f\u0012\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\t\u00a8\u0006#"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCustomsViewModel$LineValidationState;", "Landroid/os/Parcelable;", "itemDescriptionErrorMessage", "", "hsTariffErrorMessage", "weightErrorMessage", "valueErrorMessage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHsTariffErrorMessage", "()Ljava/lang/String;", "isValid", "", "isValid$annotations", "()V", "()Z", "getItemDescriptionErrorMessage", "getValueErrorMessage", "getWeightErrorMessage", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
    public static final class LineValidationState implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String itemDescriptionErrorMessage = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String hsTariffErrorMessage = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String weightErrorMessage = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String valueErrorMessage = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel.LineValidationState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel.LineValidationState copy(@org.jetbrains.annotations.Nullable()
        java.lang.String itemDescriptionErrorMessage, @org.jetbrains.annotations.Nullable()
        java.lang.String hsTariffErrorMessage, @org.jetbrains.annotations.Nullable()
        java.lang.String weightErrorMessage, @org.jetbrains.annotations.Nullable()
        java.lang.String valueErrorMessage) {
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
        
        public LineValidationState() {
            super();
        }
        
        public LineValidationState(@org.jetbrains.annotations.Nullable()
        java.lang.String itemDescriptionErrorMessage, @org.jetbrains.annotations.Nullable()
        java.lang.String hsTariffErrorMessage, @org.jetbrains.annotations.Nullable()
        java.lang.String weightErrorMessage, @org.jetbrains.annotations.Nullable()
        java.lang.String valueErrorMessage) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getItemDescriptionErrorMessage() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getHsTariffErrorMessage() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getWeightErrorMessage() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getValueErrorMessage() {
            return null;
        }
        
        @kotlinx.parcelize.IgnoredOnParcel()
        @java.lang.Deprecated()
        public static void isValid$annotations() {
        }
        
        public final boolean isValid() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel.LineValidationState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel.LineValidationState createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel.LineValidationState[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCustomsViewModel$Companion;", "", "()V", "KEY_PARAMETERS", "", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}