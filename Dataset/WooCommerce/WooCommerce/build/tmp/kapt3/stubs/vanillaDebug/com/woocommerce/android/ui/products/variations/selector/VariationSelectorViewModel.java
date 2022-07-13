package com.woocommerce.android.ui.products.variations.selector;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.OptIn(markerClass = {kotlinx.coroutines.FlowPreview.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 62\u00020\u0001:\u00056789:B?\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\u0006\u0010+\u001a\u00020,J\u0006\u0010-\u001a\u00020,J\u0006\u0010.\u001a\u00020,J\u000e\u0010/\u001a\u00020,2\u0006\u00100\u001a\u000201J#\u00102\u001a\u000201*\u0002032\f\u00104\u001a\b\u0012\u0004\u0012\u00020%0$H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00105R\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0!X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$0\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020(0\'\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006;"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/selector/VariationSelectorViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "repository", "Lcom/woocommerce/android/ui/products/variations/selector/VariationSelectorRepository;", "currencyFormatter", "Lcom/woocommerce/android/util/CurrencyFormatter;", "wooCommerceStore", "Lorg/wordpress/android/fluxc/store/WooCommerceStore;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "variationListHandler", "Lcom/woocommerce/android/ui/products/variations/selector/VariationListHandler;", "resourceProvider", "Lcom/woocommerce/android/viewmodel/ResourceProvider;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/ui/products/variations/selector/VariationSelectorRepository;Lcom/woocommerce/android/util/CurrencyFormatter;Lorg/wordpress/android/fluxc/store/WooCommerceStore;Lcom/woocommerce/android/tools/SelectedSite;Lcom/woocommerce/android/ui/products/variations/selector/VariationListHandler;Lcom/woocommerce/android/viewmodel/ResourceProvider;)V", "currencyCode", "", "getCurrencyCode", "()Ljava/lang/String;", "currencyCode$delegate", "Lkotlin/Lazy;", "loadingState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/woocommerce/android/ui/products/variations/selector/VariationSelectorViewModel$LoadingState;", "navArgs", "Lcom/woocommerce/android/ui/products/variations/selector/VariationSelectorFragmentArgs;", "getNavArgs", "()Lcom/woocommerce/android/ui/products/variations/selector/VariationSelectorFragmentArgs;", "navArgs$delegate", "Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "product", "Lkotlinx/coroutines/Deferred;", "Lcom/woocommerce/android/model/Product;", "selectedVariationIds", "", "", "viewSate", "Landroidx/lifecycle/LiveData;", "Lcom/woocommerce/android/ui/products/variations/selector/VariationSelectorViewModel$ViewState;", "getViewSate", "()Landroidx/lifecycle/LiveData;", "onBackPress", "", "onClearButtonClick", "onLoadMore", "onVariationClick", "item", "Lcom/woocommerce/android/ui/products/variations/selector/VariationSelectorViewModel$VariationListItem;", "toUiModel", "Lcom/woocommerce/android/model/ProductVariation;", "selectedIds", "(Lcom/woocommerce/android/model/ProductVariation;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "LoadingState", "VariationListItem", "VariationSelectionResult", "ViewState", "WooCommerce_vanillaDebug"})
public final class VariationSelectorViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.ui.products.variations.selector.VariationSelectorRepository repository = null;
    private final com.woocommerce.android.util.CurrencyFormatter currencyFormatter = null;
    private final org.wordpress.android.fluxc.store.WooCommerceStore wooCommerceStore = null;
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    private final com.woocommerce.android.ui.products.variations.selector.VariationListHandler variationListHandler = null;
    private final com.woocommerce.android.viewmodel.ResourceProvider resourceProvider = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.products.variations.selector.VariationSelectorViewModel.Companion Companion = null;
    private static final long STATE_UPDATE_DELAY = 100L;
    private final kotlin.Lazy currencyCode$delegate = null;
    private final com.woocommerce.android.viewmodel.NavArgsLazy navArgs$delegate = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.woocommerce.android.ui.products.variations.selector.VariationSelectorViewModel.LoadingState> loadingState = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.Set<java.lang.Long>> selectedVariationIds = null;
    private final kotlinx.coroutines.Deferred<com.woocommerce.android.model.Product> product = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.woocommerce.android.ui.products.variations.selector.VariationSelectorViewModel.ViewState> viewSate = null;
    
    @javax.inject.Inject()
    public VariationSelectorViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.variations.selector.VariationSelectorRepository repository, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.CurrencyFormatter currencyFormatter, @org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.WooCommerceStore wooCommerceStore, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.tools.SelectedSite selectedSite, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.variations.selector.VariationListHandler variationListHandler, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.viewmodel.ResourceProvider resourceProvider) {
        super(null);
    }
    
    private final java.lang.String getCurrencyCode() {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.variations.selector.VariationSelectorFragmentArgs getNavArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.woocommerce.android.ui.products.variations.selector.VariationSelectorViewModel.ViewState> getViewSate() {
        return null;
    }
    
    private final java.lang.Object toUiModel(com.woocommerce.android.model.ProductVariation $this$toUiModel, java.util.Set<java.lang.Long> selectedIds, kotlin.coroutines.Continuation<? super com.woocommerce.android.ui.products.variations.selector.VariationSelectorViewModel.VariationListItem> p2) {
        return null;
    }
    
    public final void onClearButtonClick() {
    }
    
    public final void onVariationClick(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.variations.selector.VariationSelectorViewModel.VariationListItem item) {
    }
    
    public final void onLoadMore() {
    }
    
    public final void onBackPress() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\nH\u00c6\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\nH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001e"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/selector/VariationSelectorViewModel$ViewState;", "", "loadingState", "Lcom/woocommerce/android/ui/products/variations/selector/VariationSelectorViewModel$LoadingState;", "productName", "", "variations", "", "Lcom/woocommerce/android/ui/products/variations/selector/VariationSelectorViewModel$VariationListItem;", "selectedItemsCount", "", "(Lcom/woocommerce/android/ui/products/variations/selector/VariationSelectorViewModel$LoadingState;Ljava/lang/String;Ljava/util/List;I)V", "getLoadingState", "()Lcom/woocommerce/android/ui/products/variations/selector/VariationSelectorViewModel$LoadingState;", "getProductName", "()Ljava/lang/String;", "getSelectedItemsCount", "()I", "getVariations", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "WooCommerce_vanillaDebug"})
    public static final class ViewState {
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.ui.products.variations.selector.VariationSelectorViewModel.LoadingState loadingState = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String productName = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.woocommerce.android.ui.products.variations.selector.VariationSelectorViewModel.VariationListItem> variations = null;
        private final int selectedItemsCount = 0;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.variations.selector.VariationSelectorViewModel.ViewState copy(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.products.variations.selector.VariationSelectorViewModel.LoadingState loadingState, @org.jetbrains.annotations.NotNull()
        java.lang.String productName, @org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.ui.products.variations.selector.VariationSelectorViewModel.VariationListItem> variations, int selectedItemsCount) {
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
        com.woocommerce.android.ui.products.variations.selector.VariationSelectorViewModel.LoadingState loadingState, @org.jetbrains.annotations.NotNull()
        java.lang.String productName, @org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.ui.products.variations.selector.VariationSelectorViewModel.VariationListItem> variations, int selectedItemsCount) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.variations.selector.VariationSelectorViewModel.LoadingState component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.variations.selector.VariationSelectorViewModel.LoadingState getLoadingState() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getProductName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.ui.products.variations.selector.VariationSelectorViewModel.VariationListItem> component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.ui.products.variations.selector.VariationSelectorViewModel.VariationListItem> getVariations() {
            return null;
        }
        
        public final int component4() {
            return 0;
        }
        
        public final int getSelectedItemsCount() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\nH\u00c6\u0003JK\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001J\t\u0010!\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f\u00a8\u0006\""}, d2 = {"Lcom/woocommerce/android/ui/products/variations/selector/VariationSelectorViewModel$VariationListItem;", "", "id", "", "title", "", "imageUrl", "stockAndPrice", "sku", "selectionState", "Lcom/woocommerce/android/ui/products/selector/SelectionState;", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/woocommerce/android/ui/products/selector/SelectionState;)V", "getId", "()J", "getImageUrl", "()Ljava/lang/String;", "getSelectionState", "()Lcom/woocommerce/android/ui/products/selector/SelectionState;", "getSku", "getStockAndPrice", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "WooCommerce_vanillaDebug"})
    public static final class VariationListItem {
        private final long id = 0L;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String title = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String imageUrl = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String stockAndPrice = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String sku = null;
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.ui.products.selector.SelectionState selectionState = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.variations.selector.VariationSelectorViewModel.VariationListItem copy(long id, @org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.Nullable()
        java.lang.String imageUrl, @org.jetbrains.annotations.Nullable()
        java.lang.String stockAndPrice, @org.jetbrains.annotations.Nullable()
        java.lang.String sku, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.products.selector.SelectionState selectionState) {
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
        
        public VariationListItem(long id, @org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.Nullable()
        java.lang.String imageUrl, @org.jetbrains.annotations.Nullable()
        java.lang.String stockAndPrice, @org.jetbrains.annotations.Nullable()
        java.lang.String sku, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.products.selector.SelectionState selectionState) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getId() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getImageUrl() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getStockAndPrice() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSku() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.selector.SelectionState component6() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.selector.SelectionState getSelectionState() {
            return null;
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0003J#\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001c"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/selector/VariationSelectorViewModel$VariationSelectionResult;", "Landroid/os/Parcelable;", "productId", "", "selectedVariationIds", "", "(JLjava/util/Set;)V", "getProductId", "()J", "getSelectedVariationIds", "()Ljava/util/Set;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
    public static final class VariationSelectionResult implements android.os.Parcelable {
        private final long productId = 0L;
        @org.jetbrains.annotations.NotNull()
        private final java.util.Set<java.lang.Long> selectedVariationIds = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.products.variations.selector.VariationSelectorViewModel.VariationSelectionResult> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.variations.selector.VariationSelectorViewModel.VariationSelectionResult copy(long productId, @org.jetbrains.annotations.NotNull()
        java.util.Set<java.lang.Long> selectedVariationIds) {
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
        
        public VariationSelectionResult(long productId, @org.jetbrains.annotations.NotNull()
        java.util.Set<java.lang.Long> selectedVariationIds) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getProductId() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Set<java.lang.Long> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Set<java.lang.Long> getSelectedVariationIds() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.products.variations.selector.VariationSelectorViewModel.VariationSelectionResult> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.variations.selector.VariationSelectorViewModel.VariationSelectionResult createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.variations.selector.VariationSelectorViewModel.VariationSelectionResult[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/selector/VariationSelectorViewModel$LoadingState;", "", "(Ljava/lang/String;I)V", "IDLE", "LOADING", "APPENDING", "WooCommerce_vanillaDebug"})
    public static enum LoadingState {
        /*public static final*/ IDLE /* = new IDLE() */,
        /*public static final*/ LOADING /* = new LOADING() */,
        /*public static final*/ APPENDING /* = new APPENDING() */;
        
        LoadingState() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/selector/VariationSelectorViewModel$Companion;", "", "()V", "STATE_UPDATE_DELAY", "", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}