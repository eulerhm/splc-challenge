package com.woocommerce.android.ui.products;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 K2\u00020\u0001:\u0003KLMB/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u001e\u00100\u001a\u0004\u0018\u0001012\b\u00102\u001a\u0004\u0018\u0001012\b\u00103\u001a\u0004\u0018\u000101H\u0002J\u0010\u00104\u001a\u0004\u0018\u0001052\u0006\u00106\u001a\u000207J\b\u00108\u001a\u000209H\u0014J_\u0010:\u001a\u0002092\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010<2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010?\u001a\u0004\u0018\u0001012\n\b\u0002\u0010@\u001a\u0004\u0018\u0001012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B2\n\b\u0002\u0010C\u001a\u0004\u0018\u000107\u00a2\u0006\u0002\u0010DJ\u0006\u0010E\u001a\u000209J\u0010\u0010F\u001a\u0002092\b\u0010G\u001a\u0004\u0018\u00010<J\u0006\u0010H\u001a\u000209J\u0010\u0010I\u001a\u0002092\b\u0010G\u001a\u0004\u0018\u00010<J\u000e\u0010J\u001a\u0002092\u0006\u0010>\u001a\u00020\u000eR\u0014\u0010\r\u001a\u00020\u000e8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010 \u001a\u00020\u00198F\u00a2\u0006\u0006\u001a\u0004\b!\u0010\"R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020$8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020$0-\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010/\u00a8\u0006N"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductPricingViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "productRepository", "Lcom/woocommerce/android/ui/products/ProductDetailRepository;", "wooCommerceStore", "Lorg/wordpress/android/fluxc/store/WooCommerceStore;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "parameterRepository", "Lcom/woocommerce/android/ui/products/ParameterRepository;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/ui/products/ProductDetailRepository;Lorg/wordpress/android/fluxc/store/WooCommerceStore;Lcom/woocommerce/android/tools/SelectedSite;Lcom/woocommerce/android/ui/products/ParameterRepository;)V", "hasChanges", "", "getHasChanges", "()Z", "isProductPricing", "navArgs", "Lcom/woocommerce/android/ui/products/ProductPricingFragmentArgs;", "getNavArgs", "()Lcom/woocommerce/android/ui/products/ProductPricingFragmentArgs;", "navArgs$delegate", "Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "originalPricingData", "Lcom/woocommerce/android/ui/products/ProductPricingViewModel$PricingData;", "parameters", "Lcom/woocommerce/android/ui/products/models/SiteParameters;", "getParameters", "()Lcom/woocommerce/android/ui/products/models/SiteParameters;", "parameters$delegate", "Lkotlin/Lazy;", "pricingData", "getPricingData", "()Lcom/woocommerce/android/ui/products/ProductPricingViewModel$PricingData;", "<set-?>", "Lcom/woocommerce/android/ui/products/ProductPricingViewModel$ViewState;", "viewState", "getViewState", "()Lcom/woocommerce/android/ui/products/ProductPricingViewModel$ViewState;", "setViewState", "(Lcom/woocommerce/android/ui/products/ProductPricingViewModel$ViewState;)V", "viewState$delegate", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "viewStateData", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getViewStateData", "()Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "fixEndDateIfNecessary", "Ljava/util/Date;", "startDate", "endDate", "getTaxClassBySlug", "Lcom/woocommerce/android/model/TaxClass;", "slug", "", "onCleared", "", "onDataChanged", "regularPrice", "Ljava/math/BigDecimal;", "salePrice", "isSaleScheduled", "saleStartDate", "saleEndDate", "taxStatus", "Lcom/woocommerce/android/ui/products/ProductTaxStatus;", "taxClass", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/util/Date;Ljava/util/Date;Lcom/woocommerce/android/ui/products/ProductTaxStatus;Ljava/lang/String;)V", "onExit", "onRegularPriceEntered", "inputValue", "onRemoveEndDateClicked", "onSalePriceEntered", "onScheduledSaleChanged", "Companion", "PricingData", "ViewState", "WooCommerce_vanillaDebug"})
public final class ProductPricingViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.ui.products.ProductDetailRepository productRepository = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.products.ProductPricingViewModel.Companion Companion = null;
    private static final int DEFAULT_DECIMAL_PRECISION = 2;
    private static final java.lang.String KEY_PRODUCT_PARAMETERS = "key_product_parameters";
    private com.woocommerce.android.ui.products.ProductPricingViewModel.PricingData originalPricingData;
    private final com.woocommerce.android.viewmodel.NavArgsLazy navArgs$delegate = null;
    private final boolean isProductPricing = false;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy parameters$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.products.ProductPricingViewModel.ViewState> viewStateData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate viewState$delegate = null;
    
    @javax.inject.Inject()
    public ProductPricingViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.ProductDetailRepository productRepository, @org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.WooCommerceStore wooCommerceStore, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.tools.SelectedSite selectedSite, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.ParameterRepository parameterRepository) {
        super(null);
    }
    
    private final com.woocommerce.android.ui.products.ProductPricingFragmentArgs getNavArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.ui.products.models.SiteParameters getParameters() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.products.ProductPricingViewModel.ViewState> getViewStateData() {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.ProductPricingViewModel.ViewState getViewState() {
        return null;
    }
    
    private final void setViewState(com.woocommerce.android.ui.products.ProductPricingViewModel.ViewState p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.ui.products.ProductPricingViewModel.PricingData getPricingData() {
        return null;
    }
    
    private final boolean getHasChanges() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.woocommerce.android.model.TaxClass getTaxClassBySlug(@org.jetbrains.annotations.NotNull()
    java.lang.String slug) {
        return null;
    }
    
    public final void onDataChanged(@org.jetbrains.annotations.Nullable()
    java.math.BigDecimal regularPrice, @org.jetbrains.annotations.Nullable()
    java.math.BigDecimal salePrice, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isSaleScheduled, @org.jetbrains.annotations.Nullable()
    java.util.Date saleStartDate, @org.jetbrains.annotations.Nullable()
    java.util.Date saleEndDate, @org.jetbrains.annotations.Nullable()
    com.woocommerce.android.ui.products.ProductTaxStatus taxStatus, @org.jetbrains.annotations.Nullable()
    java.lang.String taxClass) {
    }
    
    public final void onRegularPriceEntered(@org.jetbrains.annotations.Nullable()
    java.math.BigDecimal inputValue) {
    }
    
    public final void onScheduledSaleChanged(boolean isSaleScheduled) {
    }
    
    public final void onSalePriceEntered(@org.jetbrains.annotations.Nullable()
    java.math.BigDecimal inputValue) {
    }
    
    private final java.util.Date fixEndDateIfNecessary(java.util.Date startDate, java.util.Date endDate) {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public final void onExit() {
    }
    
    public final void onRemoveEndDateClicked() {
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0002\u0010\u0010J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0005H\u00c6\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u00c6\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\t\u0010\'\u001a\u00020\u000bH\u00c6\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u000b\u0010)\u001a\u0004\u0018\u00010\u000fH\u00c2\u0003Jd\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00c6\u0001\u00a2\u0006\u0002\u0010+J\t\u0010,\u001a\u00020\u0005H\u00d6\u0001J\u0013\u0010-\u001a\u00020\r2\b\u0010.\u001a\u0004\u0018\u00010/H\u00d6\u0003J\t\u00100\u001a\u00020\u0005H\u00d6\u0001J\t\u00101\u001a\u00020\u0003H\u00d6\u0001J\u0019\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0011\u001a\u00020\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\u0019\u001a\u00020\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u0013R\u0015\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\f\u0010\u001aR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"\u00a8\u00067"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductPricingViewModel$ViewState;", "Landroid/os/Parcelable;", "currency", "", "decimals", "", "taxClassList", "", "Lcom/woocommerce/android/model/TaxClass;", "salePriceErrorMessage", "pricingData", "Lcom/woocommerce/android/ui/products/ProductPricingViewModel$PricingData;", "isTaxSectionVisible", "", "currencyPosition", "Lorg/wordpress/android/fluxc/model/WCSettingsModel$CurrencyPosition;", "(Ljava/lang/String;ILjava/util/List;Ljava/lang/Integer;Lcom/woocommerce/android/ui/products/ProductPricingViewModel$PricingData;Ljava/lang/Boolean;Lorg/wordpress/android/fluxc/model/WCSettingsModel$CurrencyPosition;)V", "canSaveChanges", "getCanSaveChanges", "()Z", "getCurrency", "()Ljava/lang/String;", "getDecimals", "()I", "isCurrencyPrefix", "isRemoveEndDateButtonVisible", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPricingData", "()Lcom/woocommerce/android/ui/products/ProductPricingViewModel$PricingData;", "getSalePriceErrorMessage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTaxClassList", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;ILjava/util/List;Ljava/lang/Integer;Lcom/woocommerce/android/ui/products/ProductPricingViewModel$PricingData;Ljava/lang/Boolean;Lorg/wordpress/android/fluxc/model/WCSettingsModel$CurrencyPosition;)Lcom/woocommerce/android/ui/products/ProductPricingViewModel$ViewState;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
    public static final class ViewState implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String currency = null;
        private final int decimals = 0;
        @org.jetbrains.annotations.Nullable()
        private final java.util.List<com.woocommerce.android.model.TaxClass> taxClassList = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer salePriceErrorMessage = null;
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.ui.products.ProductPricingViewModel.PricingData pricingData = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isTaxSectionVisible = null;
        private final org.wordpress.android.fluxc.model.WCSettingsModel.CurrencyPosition currencyPosition = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.products.ProductPricingViewModel.ViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.ProductPricingViewModel.ViewState copy(@org.jetbrains.annotations.Nullable()
        java.lang.String currency, int decimals, @org.jetbrains.annotations.Nullable()
        java.util.List<com.woocommerce.android.model.TaxClass> taxClassList, @org.jetbrains.annotations.Nullable()
        java.lang.Integer salePriceErrorMessage, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.products.ProductPricingViewModel.PricingData pricingData, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isTaxSectionVisible, @org.jetbrains.annotations.Nullable()
        org.wordpress.android.fluxc.model.WCSettingsModel.CurrencyPosition currencyPosition) {
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
        
        public ViewState(@org.jetbrains.annotations.Nullable()
        java.lang.String currency, int decimals, @org.jetbrains.annotations.Nullable()
        java.util.List<com.woocommerce.android.model.TaxClass> taxClassList, @org.jetbrains.annotations.Nullable()
        java.lang.Integer salePriceErrorMessage, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.products.ProductPricingViewModel.PricingData pricingData, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isTaxSectionVisible, @org.jetbrains.annotations.Nullable()
        org.wordpress.android.fluxc.model.WCSettingsModel.CurrencyPosition currencyPosition) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCurrency() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int getDecimals() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.woocommerce.android.model.TaxClass> component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.woocommerce.android.model.TaxClass> getTaxClassList() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getSalePriceErrorMessage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.ProductPricingViewModel.PricingData component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.ProductPricingViewModel.PricingData getPricingData() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isTaxSectionVisible() {
            return null;
        }
        
        private final org.wordpress.android.fluxc.model.WCSettingsModel.CurrencyPosition component7() {
            return null;
        }
        
        public final boolean isRemoveEndDateButtonVisible() {
            return false;
        }
        
        public final boolean getCanSaveChanges() {
            return false;
        }
        
        public final boolean isCurrencyPrefix() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.products.ProductPricingViewModel.ViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.ProductPricingViewModel.ViewState createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.ProductPricingViewModel.ViewState[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\u000eJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u000b\u0010\u001e\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\fH\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\fH\u00c6\u0003Jb\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u00c6\u0001\u00a2\u0006\u0002\u0010#J\t\u0010$\u001a\u00020%H\u00d6\u0001J\u0013\u0010&\u001a\u00020\u00072\b\u0010\'\u001a\u0004\u0018\u00010(H\u0096\u0002J\b\u0010)\u001a\u00020%H\u0016J\t\u0010*\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020%H\u00d6\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0006\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\r\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a\u00a8\u00060"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductPricingViewModel$PricingData;", "Landroid/os/Parcelable;", "taxClass", "", "taxStatus", "Lcom/woocommerce/android/ui/products/ProductTaxStatus;", "isSaleScheduled", "", "saleStartDate", "Ljava/util/Date;", "saleEndDate", "regularPrice", "Ljava/math/BigDecimal;", "salePrice", "(Ljava/lang/String;Lcom/woocommerce/android/ui/products/ProductTaxStatus;Ljava/lang/Boolean;Ljava/util/Date;Ljava/util/Date;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRegularPrice", "()Ljava/math/BigDecimal;", "getSaleEndDate", "()Ljava/util/Date;", "getSalePrice", "getSaleStartDate", "getTaxClass", "()Ljava/lang/String;", "getTaxStatus", "()Lcom/woocommerce/android/ui/products/ProductTaxStatus;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Lcom/woocommerce/android/ui/products/ProductTaxStatus;Ljava/lang/Boolean;Ljava/util/Date;Ljava/util/Date;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lcom/woocommerce/android/ui/products/ProductPricingViewModel$PricingData;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
    public static final class PricingData implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String taxClass = null;
        @org.jetbrains.annotations.Nullable()
        private final com.woocommerce.android.ui.products.ProductTaxStatus taxStatus = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isSaleScheduled = null;
        @org.jetbrains.annotations.Nullable()
        private final java.util.Date saleStartDate = null;
        @org.jetbrains.annotations.Nullable()
        private final java.util.Date saleEndDate = null;
        @org.jetbrains.annotations.Nullable()
        private final java.math.BigDecimal regularPrice = null;
        @org.jetbrains.annotations.Nullable()
        private final java.math.BigDecimal salePrice = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.products.ProductPricingViewModel.PricingData> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.ProductPricingViewModel.PricingData copy(@org.jetbrains.annotations.Nullable()
        java.lang.String taxClass, @org.jetbrains.annotations.Nullable()
        com.woocommerce.android.ui.products.ProductTaxStatus taxStatus, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isSaleScheduled, @org.jetbrains.annotations.Nullable()
        java.util.Date saleStartDate, @org.jetbrains.annotations.Nullable()
        java.util.Date saleEndDate, @org.jetbrains.annotations.Nullable()
        java.math.BigDecimal regularPrice, @org.jetbrains.annotations.Nullable()
        java.math.BigDecimal salePrice) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public PricingData() {
            super();
        }
        
        public PricingData(@org.jetbrains.annotations.Nullable()
        java.lang.String taxClass, @org.jetbrains.annotations.Nullable()
        com.woocommerce.android.ui.products.ProductTaxStatus taxStatus, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isSaleScheduled, @org.jetbrains.annotations.Nullable()
        java.util.Date saleStartDate, @org.jetbrains.annotations.Nullable()
        java.util.Date saleEndDate, @org.jetbrains.annotations.Nullable()
        java.math.BigDecimal regularPrice, @org.jetbrains.annotations.Nullable()
        java.math.BigDecimal salePrice) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTaxClass() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.woocommerce.android.ui.products.ProductTaxStatus component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.woocommerce.android.ui.products.ProductTaxStatus getTaxStatus() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isSaleScheduled() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.Date component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.Date getSaleStartDate() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.Date component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.Date getSaleEndDate() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.math.BigDecimal component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.math.BigDecimal getRegularPrice() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.math.BigDecimal component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.math.BigDecimal getSalePrice() {
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
        
        @java.lang.Override()
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.products.ProductPricingViewModel.PricingData> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.ProductPricingViewModel.PricingData createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.ProductPricingViewModel.PricingData[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductPricingViewModel$Companion;", "", "()V", "DEFAULT_DECIMAL_PRECISION", "", "KEY_PRODUCT_PARAMETERS", "", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}