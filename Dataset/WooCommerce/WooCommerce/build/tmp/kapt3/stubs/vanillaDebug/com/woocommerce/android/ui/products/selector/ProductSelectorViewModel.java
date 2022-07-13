package com.woocommerce.android.ui.products.selector;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.OptIn(markerClass = {kotlinx.coroutines.FlowPreview.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 52\u00020\u0001:\u00045678B?\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\u0006\u0010(\u001a\u00020)J\u0006\u0010*\u001a\u00020)J\u0006\u0010+\u001a\u00020)J\u000e\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020.J\u000e\u0010/\u001a\u00020)2\u0006\u00100\u001a\u000201J\u001a\u00102\u001a\u00020.*\u0002032\f\u00104\u001a\b\u0012\u0004\u0012\u00020\"0!H\u0002R\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00069"}, d2 = {"Lcom/woocommerce/android/ui/products/selector/ProductSelectorViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "currencyFormatter", "Lcom/woocommerce/android/util/CurrencyFormatter;", "wooCommerceStore", "Lorg/wordpress/android/fluxc/store/WooCommerceStore;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "productListHandler", "Lcom/woocommerce/android/ui/products/selector/ProductListHandler;", "variationSelectorRepository", "Lcom/woocommerce/android/ui/products/variations/selector/VariationSelectorRepository;", "resourceProvider", "Lcom/woocommerce/android/viewmodel/ResourceProvider;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/util/CurrencyFormatter;Lorg/wordpress/android/fluxc/store/WooCommerceStore;Lcom/woocommerce/android/tools/SelectedSite;Lcom/woocommerce/android/ui/products/selector/ProductListHandler;Lcom/woocommerce/android/ui/products/variations/selector/VariationSelectorRepository;Lcom/woocommerce/android/viewmodel/ResourceProvider;)V", "currencyCode", "", "getCurrencyCode", "()Ljava/lang/String;", "currencyCode$delegate", "Lkotlin/Lazy;", "loadingState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/woocommerce/android/ui/products/selector/ProductSelectorViewModel$LoadingState;", "navArgs", "Lcom/woocommerce/android/ui/products/selector/ProductSelectorFragmentArgs;", "getNavArgs", "()Lcom/woocommerce/android/ui/products/selector/ProductSelectorFragmentArgs;", "navArgs$delegate", "Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "selectedProductIds", "", "", "viewSate", "Landroidx/lifecycle/LiveData;", "Lcom/woocommerce/android/ui/products/selector/ProductSelectorViewModel$ViewState;", "getViewSate", "()Landroidx/lifecycle/LiveData;", "onClearButtonClick", "", "onDoneButtonClick", "onLoadMore", "onProductClick", "item", "Lcom/woocommerce/android/ui/products/selector/ProductSelectorViewModel$ProductListItem;", "onSelectedVariationsUpdated", "result", "Lcom/woocommerce/android/ui/products/variations/selector/VariationSelectorViewModel$VariationSelectionResult;", "toUiModel", "Lcom/woocommerce/android/model/Product;", "selectedIds", "Companion", "LoadingState", "ProductListItem", "ViewState", "WooCommerce_vanillaDebug"})
public final class ProductSelectorViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.util.CurrencyFormatter currencyFormatter = null;
    private final org.wordpress.android.fluxc.store.WooCommerceStore wooCommerceStore = null;
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    private final com.woocommerce.android.ui.products.selector.ProductListHandler productListHandler = null;
    private final com.woocommerce.android.ui.products.variations.selector.VariationSelectorRepository variationSelectorRepository = null;
    private final com.woocommerce.android.viewmodel.ResourceProvider resourceProvider = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.products.selector.ProductSelectorViewModel.Companion Companion = null;
    private static final long STATE_UPDATE_DELAY = 100L;
    private final kotlin.Lazy currencyCode$delegate = null;
    private final com.woocommerce.android.viewmodel.NavArgsLazy navArgs$delegate = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.woocommerce.android.ui.products.selector.ProductSelectorViewModel.LoadingState> loadingState = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.Set<java.lang.Long>> selectedProductIds = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.woocommerce.android.ui.products.selector.ProductSelectorViewModel.ViewState> viewSate = null;
    
    @javax.inject.Inject()
    public ProductSelectorViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.CurrencyFormatter currencyFormatter, @org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.WooCommerceStore wooCommerceStore, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.tools.SelectedSite selectedSite, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.selector.ProductListHandler productListHandler, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.variations.selector.VariationSelectorRepository variationSelectorRepository, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.viewmodel.ResourceProvider resourceProvider) {
        super(null);
    }
    
    private final java.lang.String getCurrencyCode() {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.selector.ProductSelectorFragmentArgs getNavArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.woocommerce.android.ui.products.selector.ProductSelectorViewModel.ViewState> getViewSate() {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.selector.ProductSelectorViewModel.ProductListItem toUiModel(com.woocommerce.android.model.Product $this$toUiModel, java.util.Set<java.lang.Long> selectedIds) {
        return null;
    }
    
    public final void onClearButtonClick() {
    }
    
    public final void onProductClick(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.selector.ProductSelectorViewModel.ProductListItem item) {
    }
    
    public final void onDoneButtonClick() {
    }
    
    public final void onLoadMore() {
    }
    
    public final void onSelectedVariationsUpdated(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.variations.selector.VariationSelectorViewModel.VariationSelectionResult result) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\bH\u00c6\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\bH\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001a"}, d2 = {"Lcom/woocommerce/android/ui/products/selector/ProductSelectorViewModel$ViewState;", "", "loadingState", "Lcom/woocommerce/android/ui/products/selector/ProductSelectorViewModel$LoadingState;", "products", "", "Lcom/woocommerce/android/ui/products/selector/ProductSelectorViewModel$ProductListItem;", "selectedItemsCount", "", "(Lcom/woocommerce/android/ui/products/selector/ProductSelectorViewModel$LoadingState;Ljava/util/List;I)V", "getLoadingState", "()Lcom/woocommerce/android/ui/products/selector/ProductSelectorViewModel$LoadingState;", "getProducts", "()Ljava/util/List;", "getSelectedItemsCount", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class ViewState {
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.ui.products.selector.ProductSelectorViewModel.LoadingState loadingState = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.woocommerce.android.ui.products.selector.ProductSelectorViewModel.ProductListItem> products = null;
        private final int selectedItemsCount = 0;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.selector.ProductSelectorViewModel.ViewState copy(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.products.selector.ProductSelectorViewModel.LoadingState loadingState, @org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.ui.products.selector.ProductSelectorViewModel.ProductListItem> products, int selectedItemsCount) {
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
        com.woocommerce.android.ui.products.selector.ProductSelectorViewModel.LoadingState loadingState, @org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.ui.products.selector.ProductSelectorViewModel.ProductListItem> products, int selectedItemsCount) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.selector.ProductSelectorViewModel.LoadingState component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.selector.ProductSelectorViewModel.LoadingState getLoadingState() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.ui.products.selector.ProductSelectorViewModel.ProductListItem> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.ui.products.selector.ProductSelectorViewModel.ProductListItem> getProducts() {
            return null;
        }
        
        public final int component3() {
            return 0;
        }
        
        public final int getSelectedItemsCount() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0005H\u00c6\u0003J\t\u0010#\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010%\u001a\u00020\nH\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eH\u00c6\u0003J\t\u0010)\u001a\u00020\u0010H\u00c6\u0003Jo\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u00c6\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010.\u001a\u00020\nH\u00d6\u0001J\t\u0010/\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 \u00a8\u00060"}, d2 = {"Lcom/woocommerce/android/ui/products/selector/ProductSelectorViewModel$ProductListItem;", "", "id", "", "title", "", "type", "Lcom/woocommerce/android/ui/products/ProductType;", "imageUrl", "numVariations", "", "stockAndPrice", "sku", "selectedVariationIds", "", "selectionState", "Lcom/woocommerce/android/ui/products/selector/SelectionState;", "(JLjava/lang/String;Lcom/woocommerce/android/ui/products/ProductType;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/Set;Lcom/woocommerce/android/ui/products/selector/SelectionState;)V", "getId", "()J", "getImageUrl", "()Ljava/lang/String;", "getNumVariations", "()I", "getSelectedVariationIds", "()Ljava/util/Set;", "getSelectionState", "()Lcom/woocommerce/android/ui/products/selector/SelectionState;", "getSku", "getStockAndPrice", "getTitle", "getType", "()Lcom/woocommerce/android/ui/products/ProductType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "WooCommerce_vanillaDebug"})
    public static final class ProductListItem {
        private final long id = 0L;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String title = null;
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.ui.products.ProductType type = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String imageUrl = null;
        private final int numVariations = 0;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String stockAndPrice = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String sku = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.Set<java.lang.Long> selectedVariationIds = null;
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.ui.products.selector.SelectionState selectionState = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.selector.ProductSelectorViewModel.ProductListItem copy(long id, @org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.products.ProductType type, @org.jetbrains.annotations.Nullable()
        java.lang.String imageUrl, int numVariations, @org.jetbrains.annotations.Nullable()
        java.lang.String stockAndPrice, @org.jetbrains.annotations.Nullable()
        java.lang.String sku, @org.jetbrains.annotations.NotNull()
        java.util.Set<java.lang.Long> selectedVariationIds, @org.jetbrains.annotations.NotNull()
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
        
        public ProductListItem(long id, @org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.products.ProductType type, @org.jetbrains.annotations.Nullable()
        java.lang.String imageUrl, int numVariations, @org.jetbrains.annotations.Nullable()
        java.lang.String stockAndPrice, @org.jetbrains.annotations.Nullable()
        java.lang.String sku, @org.jetbrains.annotations.NotNull()
        java.util.Set<java.lang.Long> selectedVariationIds, @org.jetbrains.annotations.NotNull()
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
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.ProductType component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.ProductType getType() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getImageUrl() {
            return null;
        }
        
        public final int component5() {
            return 0;
        }
        
        public final int getNumVariations() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getStockAndPrice() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSku() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Set<java.lang.Long> component8() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Set<java.lang.Long> getSelectedVariationIds() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.selector.SelectionState component9() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.selector.SelectionState getSelectionState() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/woocommerce/android/ui/products/selector/ProductSelectorViewModel$LoadingState;", "", "(Ljava/lang/String;I)V", "IDLE", "LOADING", "APPENDING", "WooCommerce_vanillaDebug"})
    public static enum LoadingState {
        /*public static final*/ IDLE /* = new IDLE() */,
        /*public static final*/ LOADING /* = new LOADING() */,
        /*public static final*/ APPENDING /* = new APPENDING() */;
        
        LoadingState() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/products/selector/ProductSelectorViewModel$Companion;", "", "()V", "STATE_UPDATE_DELAY", "", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}