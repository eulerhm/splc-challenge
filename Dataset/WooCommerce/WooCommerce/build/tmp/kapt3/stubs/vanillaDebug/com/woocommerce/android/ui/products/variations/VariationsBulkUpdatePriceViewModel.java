package com.woocommerce.android.ui.products.variations;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003345B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010)\u001a\u00020*H\u0002J\u0006\u0010+\u001a\u00020,J\u000e\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020/J\u0014\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010201*\u00020\u0012H\u0002R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001d8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001d0&\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(\u00a8\u00066"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/VariationsBulkUpdatePriceViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "parameterRepository", "Lcom/woocommerce/android/ui/products/ParameterRepository;", "variationRepository", "Lcom/woocommerce/android/ui/products/variations/VariationRepository;", "dispatchers", "Lcom/woocommerce/android/util/CoroutineDispatchers;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/ui/products/ParameterRepository;Lcom/woocommerce/android/ui/products/variations/VariationRepository;Lcom/woocommerce/android/util/CoroutineDispatchers;)V", "args", "Lcom/woocommerce/android/ui/products/variations/VariationsBulkUpdatePriceFragmentArgs;", "getArgs", "()Lcom/woocommerce/android/ui/products/variations/VariationsBulkUpdatePriceFragmentArgs;", "args$delegate", "Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "data", "Lcom/woocommerce/android/ui/products/variations/VariationsBulkUpdatePriceViewModel$PriceUpdateData;", "parameters", "Lcom/woocommerce/android/ui/products/models/SiteParameters;", "getParameters", "()Lcom/woocommerce/android/ui/products/models/SiteParameters;", "parameters$delegate", "Lkotlin/Lazy;", "variationsToUpdate", "", "Lcom/woocommerce/android/model/ProductVariation;", "<set-?>", "Lcom/woocommerce/android/ui/products/variations/VariationsBulkUpdatePriceViewModel$ViewState;", "viewState", "getViewState", "()Lcom/woocommerce/android/ui/products/variations/VariationsBulkUpdatePriceViewModel$ViewState;", "setViewState", "(Lcom/woocommerce/android/ui/products/variations/VariationsBulkUpdatePriceViewModel$ViewState;)V", "viewState$delegate", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "viewStateData", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getViewStateData", "()Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getDoneClickedAnalyticsEvent", "Lcom/woocommerce/android/analytics/AnalyticsEvent;", "onDoneClicked", "", "onPriceEntered", "price", "", "getPriceCollection", "", "Ljava/math/BigDecimal;", "PriceType", "PriceUpdateData", "ViewState", "WooCommerce_vanillaDebug"})
public final class VariationsBulkUpdatePriceViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.ui.products.variations.VariationRepository variationRepository = null;
    private final com.woocommerce.android.util.CoroutineDispatchers dispatchers = null;
    private final com.woocommerce.android.viewmodel.NavArgsLazy args$delegate = null;
    private final com.woocommerce.android.ui.products.variations.VariationsBulkUpdatePriceViewModel.PriceUpdateData data = null;
    private final java.util.List<com.woocommerce.android.model.ProductVariation> variationsToUpdate = null;
    private final kotlin.Lazy parameters$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.products.variations.VariationsBulkUpdatePriceViewModel.ViewState> viewStateData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate viewState$delegate = null;
    
    @javax.inject.Inject()
    public VariationsBulkUpdatePriceViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.ParameterRepository parameterRepository, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.variations.VariationRepository variationRepository, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.CoroutineDispatchers dispatchers) {
        super(null);
    }
    
    private final com.woocommerce.android.ui.products.variations.VariationsBulkUpdatePriceFragmentArgs getArgs() {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.models.SiteParameters getParameters() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.products.variations.VariationsBulkUpdatePriceViewModel.ViewState> getViewStateData() {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.variations.VariationsBulkUpdatePriceViewModel.ViewState getViewState() {
        return null;
    }
    
    private final void setViewState(com.woocommerce.android.ui.products.variations.VariationsBulkUpdatePriceViewModel.ViewState p0) {
    }
    
    public final void onDoneClicked() {
    }
    
    public final void onPriceEntered(@org.jetbrains.annotations.NotNull()
    java.lang.String price) {
    }
    
    private final com.woocommerce.android.analytics.AnalyticsEvent getDoneClickedAnalyticsEvent() {
        return null;
    }
    
    private final java.util.Collection<java.math.BigDecimal> getPriceCollection(com.woocommerce.android.ui.products.variations.VariationsBulkUpdatePriceViewModel.PriceUpdateData $this$getPriceCollection) {
        return null;
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\t\u0010\u001e\u001a\u00020\fH\u00c6\u0003JR\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u00c6\u0001\u00a2\u0006\u0002\u0010 J\t\u0010!\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\"\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010$H\u00d6\u0003J\t\u0010%\u001a\u00020\nH\u00d6\u0001J\t\u0010&\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\nH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006,"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/VariationsBulkUpdatePriceViewModel$ViewState;", "Landroid/os/Parcelable;", "currency", "", "price", "priceType", "Lcom/woocommerce/android/ui/products/variations/VariationsBulkUpdatePriceViewModel$PriceType;", "pricesGroupType", "Lcom/woocommerce/android/ui/products/variations/ValuesGroupType;", "variationsToUpdateCount", "", "isProgressDialogShown", "", "(Ljava/lang/String;Ljava/lang/String;Lcom/woocommerce/android/ui/products/variations/VariationsBulkUpdatePriceViewModel$PriceType;Lcom/woocommerce/android/ui/products/variations/ValuesGroupType;Ljava/lang/Integer;Z)V", "getCurrency", "()Ljava/lang/String;", "()Z", "getPrice", "getPriceType", "()Lcom/woocommerce/android/ui/products/variations/VariationsBulkUpdatePriceViewModel$PriceType;", "getPricesGroupType", "()Lcom/woocommerce/android/ui/products/variations/ValuesGroupType;", "getVariationsToUpdateCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/woocommerce/android/ui/products/variations/VariationsBulkUpdatePriceViewModel$PriceType;Lcom/woocommerce/android/ui/products/variations/ValuesGroupType;Ljava/lang/Integer;Z)Lcom/woocommerce/android/ui/products/variations/VariationsBulkUpdatePriceViewModel$ViewState;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
    public static final class ViewState implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String currency = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String price = null;
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.ui.products.variations.VariationsBulkUpdatePriceViewModel.PriceType priceType = null;
        @org.jetbrains.annotations.Nullable()
        private final com.woocommerce.android.ui.products.variations.ValuesGroupType pricesGroupType = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer variationsToUpdateCount = null;
        private final boolean isProgressDialogShown = false;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.products.variations.VariationsBulkUpdatePriceViewModel.ViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.variations.VariationsBulkUpdatePriceViewModel.ViewState copy(@org.jetbrains.annotations.Nullable()
        java.lang.String currency, @org.jetbrains.annotations.Nullable()
        java.lang.String price, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.products.variations.VariationsBulkUpdatePriceViewModel.PriceType priceType, @org.jetbrains.annotations.Nullable()
        com.woocommerce.android.ui.products.variations.ValuesGroupType pricesGroupType, @org.jetbrains.annotations.Nullable()
        java.lang.Integer variationsToUpdateCount, boolean isProgressDialogShown) {
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
        
        public ViewState(@org.jetbrains.annotations.Nullable()
        java.lang.String currency, @org.jetbrains.annotations.Nullable()
        java.lang.String price, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.products.variations.VariationsBulkUpdatePriceViewModel.PriceType priceType, @org.jetbrains.annotations.Nullable()
        com.woocommerce.android.ui.products.variations.ValuesGroupType pricesGroupType, @org.jetbrains.annotations.Nullable()
        java.lang.Integer variationsToUpdateCount, boolean isProgressDialogShown) {
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
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPrice() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.variations.VariationsBulkUpdatePriceViewModel.PriceType component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.variations.VariationsBulkUpdatePriceViewModel.PriceType getPriceType() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.woocommerce.android.ui.products.variations.ValuesGroupType component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.woocommerce.android.ui.products.variations.ValuesGroupType getPricesGroupType() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getVariationsToUpdateCount() {
            return null;
        }
        
        public final boolean component6() {
            return false;
        }
        
        public final boolean isProgressDialogShown() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.products.variations.VariationsBulkUpdatePriceViewModel.ViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.variations.VariationsBulkUpdatePriceViewModel.ViewState createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.variations.VariationsBulkUpdatePriceViewModel.ViewState[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0006H\u00c6\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u001d"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/VariationsBulkUpdatePriceViewModel$PriceUpdateData;", "Landroid/os/Parcelable;", "variationsToUpdate", "", "Lcom/woocommerce/android/model/ProductVariation;", "priceType", "Lcom/woocommerce/android/ui/products/variations/VariationsBulkUpdatePriceViewModel$PriceType;", "(Ljava/util/List;Lcom/woocommerce/android/ui/products/variations/VariationsBulkUpdatePriceViewModel$PriceType;)V", "getPriceType", "()Lcom/woocommerce/android/ui/products/variations/VariationsBulkUpdatePriceViewModel$PriceType;", "getVariationsToUpdate", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
    public static final class PriceUpdateData implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.woocommerce.android.model.ProductVariation> variationsToUpdate = null;
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.ui.products.variations.VariationsBulkUpdatePriceViewModel.PriceType priceType = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.products.variations.VariationsBulkUpdatePriceViewModel.PriceUpdateData> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.variations.VariationsBulkUpdatePriceViewModel.PriceUpdateData copy(@org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.model.ProductVariation> variationsToUpdate, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.products.variations.VariationsBulkUpdatePriceViewModel.PriceType priceType) {
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
        
        public PriceUpdateData(@org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.model.ProductVariation> variationsToUpdate, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.products.variations.VariationsBulkUpdatePriceViewModel.PriceType priceType) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.model.ProductVariation> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.model.ProductVariation> getVariationsToUpdate() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.variations.VariationsBulkUpdatePriceViewModel.PriceType component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.variations.VariationsBulkUpdatePriceViewModel.PriceType getPriceType() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.products.variations.VariationsBulkUpdatePriceViewModel.PriceUpdateData> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.variations.VariationsBulkUpdatePriceViewModel.PriceUpdateData createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.variations.VariationsBulkUpdatePriceViewModel.PriceUpdateData[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/VariationsBulkUpdatePriceViewModel$PriceType;", "", "(Ljava/lang/String;I)V", "Regular", "Sale", "WooCommerce_vanillaDebug"})
    public static enum PriceType {
        /*public static final*/ Regular /* = new Regular() */,
        /*public static final*/ Sale /* = new Sale() */;
        
        PriceType() {
        }
    }
}