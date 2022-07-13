package com.woocommerce.android.ui.products.variations;

import java.lang.System;

/**
 * Responsible for calculating view state - [ProductVariation] attribute subtitles
 * which are represented by [ValuesGroupType] class.
 */
@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u001bR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006\u001f"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/VariationsBulkUpdateAttrPickerViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "parameterRepository", "Lcom/woocommerce/android/ui/products/ParameterRepository;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/ui/products/ParameterRepository;)V", "_viewState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/woocommerce/android/ui/products/variations/VariationsBulkUpdateAttrPickerViewModel$ViewState;", "args", "Lcom/woocommerce/android/ui/products/variations/VariationsBulkUpdateAttrPickerDialogArgs;", "getArgs", "()Lcom/woocommerce/android/ui/products/variations/VariationsBulkUpdateAttrPickerDialogArgs;", "args$delegate", "Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "parameters", "Lcom/woocommerce/android/ui/products/models/SiteParameters;", "getParameters", "()Lcom/woocommerce/android/ui/products/models/SiteParameters;", "parameters$delegate", "Lkotlin/Lazy;", "viewState", "Landroidx/lifecycle/LiveData;", "getViewState", "()Landroidx/lifecycle/LiveData;", "onRegularPriceUpdateClicked", "", "onSalePriceUpdateClicked", "OpenVariationsBulkUpdatePrice", "ViewState", "WooCommerce_wasabiDebug"})
public final class VariationsBulkUpdateAttrPickerViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.viewmodel.NavArgsLazy args$delegate = null;
    private final kotlin.Lazy parameters$delegate = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.woocommerce.android.ui.products.variations.VariationsBulkUpdateAttrPickerViewModel.ViewState> _viewState = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.woocommerce.android.ui.products.variations.VariationsBulkUpdateAttrPickerViewModel.ViewState> viewState = null;
    
    @javax.inject.Inject
    public VariationsBulkUpdateAttrPickerViewModel(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.ParameterRepository parameterRepository) {
        super(null);
    }
    
    private final com.woocommerce.android.ui.products.variations.VariationsBulkUpdateAttrPickerDialogArgs getArgs() {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.models.SiteParameters getParameters() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.woocommerce.android.ui.products.variations.VariationsBulkUpdateAttrPickerViewModel.ViewState> getViewState() {
        return null;
    }
    
    public final void onRegularPriceUpdateClicked() {
    }
    
    public final void onSalePriceUpdateClicked() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J)\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/VariationsBulkUpdateAttrPickerViewModel$ViewState;", "", "currency", "", "regularPriceGroupType", "Lcom/woocommerce/android/ui/products/variations/ValuesGroupType;", "salePriceGroupType", "(Ljava/lang/String;Lcom/woocommerce/android/ui/products/variations/ValuesGroupType;Lcom/woocommerce/android/ui/products/variations/ValuesGroupType;)V", "getCurrency", "()Ljava/lang/String;", "getRegularPriceGroupType", "()Lcom/woocommerce/android/ui/products/variations/ValuesGroupType;", "getSalePriceGroupType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "WooCommerce_wasabiDebug"})
    public static final class ViewState {
        @org.jetbrains.annotations.Nullable
        private final java.lang.String currency = null;
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.ui.products.variations.ValuesGroupType regularPriceGroupType = null;
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.ui.products.variations.ValuesGroupType salePriceGroupType = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.variations.VariationsBulkUpdateAttrPickerViewModel.ViewState copy(@org.jetbrains.annotations.Nullable
        java.lang.String currency, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.products.variations.ValuesGroupType regularPriceGroupType, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.products.variations.ValuesGroupType salePriceGroupType) {
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
        java.lang.String currency, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.products.variations.ValuesGroupType regularPriceGroupType, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.products.variations.ValuesGroupType salePriceGroupType) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getCurrency() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.variations.ValuesGroupType component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.variations.ValuesGroupType getRegularPriceGroupType() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.variations.ValuesGroupType component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.variations.ValuesGroupType getSalePriceGroupType() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/VariationsBulkUpdateAttrPickerViewModel$OpenVariationsBulkUpdatePrice;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "data", "Lcom/woocommerce/android/ui/products/variations/VariationsBulkUpdatePriceViewModel$PriceUpdateData;", "(Lcom/woocommerce/android/ui/products/variations/VariationsBulkUpdatePriceViewModel$PriceUpdateData;)V", "getData", "()Lcom/woocommerce/android/ui/products/variations/VariationsBulkUpdatePriceViewModel$PriceUpdateData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
    public static final class OpenVariationsBulkUpdatePrice extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.ui.products.variations.VariationsBulkUpdatePriceViewModel.PriceUpdateData data = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.variations.VariationsBulkUpdateAttrPickerViewModel.OpenVariationsBulkUpdatePrice copy(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.products.variations.VariationsBulkUpdatePriceViewModel.PriceUpdateData data) {
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
        
        public OpenVariationsBulkUpdatePrice(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.products.variations.VariationsBulkUpdatePriceViewModel.PriceUpdateData data) {
            super(false);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.variations.VariationsBulkUpdatePriceViewModel.PriceUpdateData component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.variations.VariationsBulkUpdatePriceViewModel.PriceUpdateData getData() {
            return null;
        }
    }
}