package com.woocommerce.android.ui.orders.shippinglabels.creation;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 82\u00020\u0001:\u000489:;B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\fH\u0002J\u0006\u0010&\u001a\u00020\'J\u000e\u0010(\u001a\u00020\'2\u0006\u0010)\u001a\u00020*J\u0016\u0010+\u001a\u00020\'2\u0006\u0010,\u001a\u00020\f2\u0006\u0010-\u001a\u00020.J\u001f\u0010/\u001a\u00020\'2\u0006\u0010-\u001a\u00020.2\b\u00100\u001a\u0004\u0018\u00010\u0010H\u0002\u00a2\u0006\u0002\u00101J\u0018\u00102\u001a\u00020\'2\u0006\u0010%\u001a\u00020\f2\u0006\u0010-\u001a\u00020.H\u0002J\"\u00103\u001a\u00020\'2\u0006\u0010%\u001a\u00020\f2\u0006\u00104\u001a\u00020.2\b\b\u0002\u00105\u001a\u000206H\u0002J\u0010\u00107\u001a\u00020\'2\u0006\u0010%\u001a\u00020\fH\u0002R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00158B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u000e\u00a8\u0006<"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelCreateCustomPackageViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "resourceProvider", "Lcom/woocommerce/android/viewmodel/ResourceProvider;", "shippingLabelRepository", "Lcom/woocommerce/android/ui/orders/shippinglabels/ShippingLabelRepository;", "parameterRepository", "Lcom/woocommerce/android/ui/products/ParameterRepository;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/viewmodel/ResourceProvider;Lcom/woocommerce/android/ui/orders/shippinglabels/ShippingLabelRepository;Lcom/woocommerce/android/ui/products/ParameterRepository;)V", "dimensionUnit", "", "getDimensionUnit", "()Ljava/lang/String;", "emptyInputError", "", "invalidInputError", "parameters", "Lcom/woocommerce/android/ui/products/models/SiteParameters;", "<set-?>", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelCreateCustomPackageViewModel$ShippingLabelCreateCustomPackageViewState;", "viewState", "getViewState", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelCreateCustomPackageViewModel$ShippingLabelCreateCustomPackageViewState;", "setViewState", "(Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelCreateCustomPackageViewModel$ShippingLabelCreateCustomPackageViewState;)V", "viewState$delegate", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "viewStateData", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getViewStateData", "()Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "weightUnit", "getWeightUnit", "inputToFloat", "", "input", "onCustomFormDoneMenuClicked", "", "onCustomPackageTypeSelected", "selectedPackageType", "Lcom/woocommerce/android/model/CustomPackageType;", "onFieldTextChanged", "value", "field", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelCreateCustomPackageViewModel$InputName;", "updateErrorInViewState", "errorMsg", "(Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelCreateCustomPackageViewModel$InputName;Ljava/lang/Integer;)V", "updateInputInViewState", "validateFloatInput", "name", "isZeroAllowed", "", "validateNameField", "Companion", "InputName", "PackageSuccessfullyMadeEvent", "ShippingLabelCreateCustomPackageViewState", "WooCommerce_wasabiDebug"})
public final class ShippingLabelCreateCustomPackageViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.viewmodel.ResourceProvider resourceProvider = null;
    private final com.woocommerce.android.ui.orders.shippinglabels.ShippingLabelRepository shippingLabelRepository = null;
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateCustomPackageViewModel.Companion Companion = null;
    private static final java.lang.String KEY_PARAMETERS = "key_parameters";
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateCustomPackageViewModel.ShippingLabelCreateCustomPackageViewState> viewStateData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate viewState$delegate = null;
    private final int emptyInputError = com.woocommerce.android.R.string.shipping_label_create_custom_package_field_empty_hint;
    private final int invalidInputError = com.woocommerce.android.R.string.shipping_label_create_custom_package_field_invalid_hint;
    private final com.woocommerce.android.ui.products.models.SiteParameters parameters = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String weightUnit = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String dimensionUnit = null;
    
    @javax.inject.Inject
    public ShippingLabelCreateCustomPackageViewModel(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.viewmodel.ResourceProvider resourceProvider, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.orders.shippinglabels.ShippingLabelRepository shippingLabelRepository, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.ParameterRepository parameterRepository) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateCustomPackageViewModel.ShippingLabelCreateCustomPackageViewState> getViewStateData() {
        return null;
    }
    
    private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateCustomPackageViewModel.ShippingLabelCreateCustomPackageViewState getViewState() {
        return null;
    }
    
    private final void setViewState(com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateCustomPackageViewModel.ShippingLabelCreateCustomPackageViewState p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getWeightUnit() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDimensionUnit() {
        return null;
    }
    
    public final void onCustomPackageTypeSelected(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.CustomPackageType selectedPackageType) {
    }
    
    public final void onFieldTextChanged(@org.jetbrains.annotations.NotNull
    java.lang.String value, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateCustomPackageViewModel.InputName field) {
    }
    
    private final void validateNameField(java.lang.String input) {
    }
    
    private final void validateFloatInput(java.lang.String input, com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateCustomPackageViewModel.InputName name, boolean isZeroAllowed) {
    }
    
    private final void updateInputInViewState(java.lang.String input, com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateCustomPackageViewModel.InputName field) {
    }
    
    private final void updateErrorInViewState(com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateCustomPackageViewModel.InputName field, java.lang.Integer errorMsg) {
    }
    
    public final void onCustomFormDoneMenuClicked() {
    }
    
    private final float inputToFloat(java.lang.String input) {
        return 0.0F;
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b+\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0002\u0010\u0014J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\u0010\u0010/\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\u0010\u00100\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\u0010\u00101\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003\u00a2\u0006\u0002\u0010!J\t\u00102\u001a\u00020\u0005H\u00c6\u0003J\t\u00103\u001a\u00020\u0007H\u00c6\u0003J\t\u00104\u001a\u00020\u0007H\u00c6\u0003J\t\u00105\u001a\u00020\u0007H\u00c6\u0003J\t\u00106\u001a\u00020\u0007H\u00c6\u0003J\t\u00107\u001a\u00020\u0007H\u00c6\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\u0010\u00109\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\u009e\u0001\u0010:\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00c6\u0001\u00a2\u0006\u0002\u0010;J\t\u0010<\u001a\u00020\rH\u00d6\u0001J\u0013\u0010=\u001a\u00020\u00132\b\u0010>\u001a\u0004\u0018\u00010?H\u00d6\u0003J\t\u0010@\u001a\u00020\rH\u00d6\u0001J\t\u0010A\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020\rH\u00d6\u0001R\u0017\u0010\u0015\u001a\u00020\u00138F\u00a2\u0006\f\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\n\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\r\u00a2\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\n\n\u0002\u0010\"\u001a\u0004\b\u0012\u0010!R\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\n\n\u0002\u0010 \u001a\u0004\b$\u0010\u001fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0015\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\n\n\u0002\u0010 \u001a\u0004\b&\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u0011\u0010\u000b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001dR\u0015\u0010\u0011\u001a\u0004\u0018\u00010\r\u00a2\u0006\n\n\u0002\u0010 \u001a\u0004\b*\u0010\u001fR\u0011\u0010\t\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001dR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\r\u00a2\u0006\n\n\u0002\u0010 \u001a\u0004\b,\u0010\u001f\u00a8\u0006G"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelCreateCustomPackageViewModel$ShippingLabelCreateCustomPackageViewState;", "Landroid/os/Parcelable;", "customPackage", "Lcom/woocommerce/android/model/ShippingPackage;", "type", "Lcom/woocommerce/android/model/CustomPackageType;", "name", "", "length", "width", "height", "weight", "nameErrorMessage", "", "lengthErrorMessage", "widthErrorMessage", "heightErrorMessage", "weightErrorMessage", "isSavingProgressDialogVisible", "", "(Lcom/woocommerce/android/model/ShippingPackage;Lcom/woocommerce/android/model/CustomPackageType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "areAllRequiredFieldsValid", "getAreAllRequiredFieldsValid$annotations", "()V", "getAreAllRequiredFieldsValid", "()Z", "getCustomPackage", "()Lcom/woocommerce/android/model/ShippingPackage;", "getHeight", "()Ljava/lang/String;", "getHeightErrorMessage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLength", "getLengthErrorMessage", "getName", "getNameErrorMessage", "getType", "()Lcom/woocommerce/android/model/CustomPackageType;", "getWeight", "getWeightErrorMessage", "getWidth", "getWidthErrorMessage", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/woocommerce/android/model/ShippingPackage;Lcom/woocommerce/android/model/CustomPackageType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelCreateCustomPackageViewModel$ShippingLabelCreateCustomPackageViewState;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class ShippingLabelCreateCustomPackageViewState implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable
        private final com.woocommerce.android.model.ShippingPackage customPackage = null;
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.model.CustomPackageType type = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String name = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String length = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String width = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String height = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String weight = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Integer nameErrorMessage = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Integer lengthErrorMessage = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Integer widthErrorMessage = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Integer heightErrorMessage = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Integer weightErrorMessage = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean isSavingProgressDialogVisible = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateCustomPackageViewModel.ShippingLabelCreateCustomPackageViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateCustomPackageViewModel.ShippingLabelCreateCustomPackageViewState copy(@org.jetbrains.annotations.Nullable
        com.woocommerce.android.model.ShippingPackage customPackage, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.model.CustomPackageType type, @org.jetbrains.annotations.NotNull
        java.lang.String name, @org.jetbrains.annotations.NotNull
        java.lang.String length, @org.jetbrains.annotations.NotNull
        java.lang.String width, @org.jetbrains.annotations.NotNull
        java.lang.String height, @org.jetbrains.annotations.NotNull
        java.lang.String weight, @org.jetbrains.annotations.Nullable
        java.lang.Integer nameErrorMessage, @org.jetbrains.annotations.Nullable
        java.lang.Integer lengthErrorMessage, @org.jetbrains.annotations.Nullable
        java.lang.Integer widthErrorMessage, @org.jetbrains.annotations.Nullable
        java.lang.Integer heightErrorMessage, @org.jetbrains.annotations.Nullable
        java.lang.Integer weightErrorMessage, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isSavingProgressDialogVisible) {
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
        
        public ShippingLabelCreateCustomPackageViewState() {
            super();
        }
        
        public ShippingLabelCreateCustomPackageViewState(@org.jetbrains.annotations.Nullable
        com.woocommerce.android.model.ShippingPackage customPackage, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.model.CustomPackageType type, @org.jetbrains.annotations.NotNull
        java.lang.String name, @org.jetbrains.annotations.NotNull
        java.lang.String length, @org.jetbrains.annotations.NotNull
        java.lang.String width, @org.jetbrains.annotations.NotNull
        java.lang.String height, @org.jetbrains.annotations.NotNull
        java.lang.String weight, @org.jetbrains.annotations.Nullable
        java.lang.Integer nameErrorMessage, @org.jetbrains.annotations.Nullable
        java.lang.Integer lengthErrorMessage, @org.jetbrains.annotations.Nullable
        java.lang.Integer widthErrorMessage, @org.jetbrains.annotations.Nullable
        java.lang.Integer heightErrorMessage, @org.jetbrains.annotations.Nullable
        java.lang.Integer weightErrorMessage, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isSavingProgressDialogVisible) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.woocommerce.android.model.ShippingPackage component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.woocommerce.android.model.ShippingPackage getCustomPackage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.model.CustomPackageType component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.model.CustomPackageType getType() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getLength() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getWidth() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getHeight() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component7() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getWeight() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer component8() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer getNameErrorMessage() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer component9() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer getLengthErrorMessage() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer component10() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer getWidthErrorMessage() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer component11() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer getHeightErrorMessage() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer component12() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer getWeightErrorMessage() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component13() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean isSavingProgressDialogVisible() {
            return null;
        }
        
        @kotlinx.parcelize.IgnoredOnParcel
        @java.lang.Deprecated
        public static void getAreAllRequiredFieldsValid$annotations() {
        }
        
        public final boolean getAreAllRequiredFieldsValid() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateCustomPackageViewModel.ShippingLabelCreateCustomPackageViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateCustomPackageViewModel.ShippingLabelCreateCustomPackageViewState createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateCustomPackageViewModel.ShippingLabelCreateCustomPackageViewState[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelCreateCustomPackageViewModel$InputName;", "", "(Ljava/lang/String;I)V", "NAME", "LENGTH", "WIDTH", "HEIGHT", "EMPTY_WEIGHT", "WooCommerce_wasabiDebug"})
    public static enum InputName {
        /*public static final*/ NAME /* = new NAME() */,
        /*public static final*/ LENGTH /* = new LENGTH() */,
        /*public static final*/ WIDTH /* = new WIDTH() */,
        /*public static final*/ HEIGHT /* = new HEIGHT() */,
        /*public static final*/ EMPTY_WEIGHT /* = new EMPTY_WEIGHT() */;
        
        InputName() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelCreateCustomPackageViewModel$PackageSuccessfullyMadeEvent;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "madePackage", "Lcom/woocommerce/android/model/ShippingPackage;", "(Lcom/woocommerce/android/model/ShippingPackage;)V", "getMadePackage", "()Lcom/woocommerce/android/model/ShippingPackage;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
    public static final class PackageSuccessfullyMadeEvent extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.model.ShippingPackage madePackage = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateCustomPackageViewModel.PackageSuccessfullyMadeEvent copy(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.model.ShippingPackage madePackage) {
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
        
        public PackageSuccessfullyMadeEvent(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.model.ShippingPackage madePackage) {
            super(false);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.model.ShippingPackage component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.model.ShippingPackage getMadePackage() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelCreateCustomPackageViewModel$Companion;", "", "()V", "KEY_PARAMETERS", "", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}