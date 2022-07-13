package com.woocommerce.android.ui.orders.creation.variations;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001 B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u001f\u001a\u00020\rR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00180\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e\u00a8\u0006!"}, d2 = {"Lcom/woocommerce/android/ui/orders/creation/variations/OrderCreationVariationSelectionViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "variationRepository", "Lcom/woocommerce/android/ui/products/variations/VariationRepository;", "productRepository", "Lcom/woocommerce/android/ui/products/ProductDetailRepository;", "dispatchers", "Lcom/woocommerce/android/util/CoroutineDispatchers;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/ui/products/variations/VariationRepository;Lcom/woocommerce/android/ui/products/ProductDetailRepository;Lcom/woocommerce/android/util/CoroutineDispatchers;)V", "loadMoreTrigger", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "navArgs", "Lcom/woocommerce/android/ui/orders/creation/variations/OrderCreationVariationSelectionFragmentArgs;", "getNavArgs", "()Lcom/woocommerce/android/ui/orders/creation/variations/OrderCreationVariationSelectionFragmentArgs;", "navArgs$delegate", "Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "parentProductFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/woocommerce/android/model/Product;", "variationsListFlow", "", "Lcom/woocommerce/android/model/ProductVariation;", "viewState", "Landroidx/lifecycle/LiveData;", "Lcom/woocommerce/android/ui/orders/creation/variations/OrderCreationVariationSelectionViewModel$ViewState;", "getViewState", "()Landroidx/lifecycle/LiveData;", "onLoadMore", "ViewState", "WooCommerce_wasabiDebug"})
public final class OrderCreationVariationSelectionViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.ui.products.variations.VariationRepository variationRepository = null;
    private final com.woocommerce.android.ui.products.ProductDetailRepository productRepository = null;
    private final com.woocommerce.android.util.CoroutineDispatchers dispatchers = null;
    private final com.woocommerce.android.viewmodel.NavArgsLazy navArgs$delegate = null;
    private final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> loadMoreTrigger = null;
    private final kotlinx.coroutines.flow.Flow<com.woocommerce.android.model.Product> parentProductFlow = null;
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.woocommerce.android.model.ProductVariation>> variationsListFlow = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.woocommerce.android.ui.orders.creation.variations.OrderCreationVariationSelectionViewModel.ViewState> viewState = null;
    
    @javax.inject.Inject
    public OrderCreationVariationSelectionViewModel(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedStateHandle, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.variations.VariationRepository variationRepository, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.ProductDetailRepository productRepository, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.CoroutineDispatchers dispatchers) {
        super(null);
    }
    
    private final com.woocommerce.android.ui.orders.creation.variations.OrderCreationVariationSelectionFragmentArgs getNavArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.woocommerce.android.ui.orders.creation.variations.OrderCreationVariationSelectionViewModel.ViewState> getViewState() {
        return null;
    }
    
    public final void onLoadMore() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0007J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0003J\'\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0018"}, d2 = {"Lcom/woocommerce/android/ui/orders/creation/variations/OrderCreationVariationSelectionViewModel$ViewState;", "", "parentProduct", "Lcom/woocommerce/android/model/Product;", "variationsList", "", "Lcom/woocommerce/android/model/ProductVariation;", "(Lcom/woocommerce/android/model/Product;Ljava/util/List;)V", "isSkeletonShown", "", "()Z", "getParentProduct", "()Lcom/woocommerce/android/model/Product;", "getVariationsList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
    public static final class ViewState {
        @org.jetbrains.annotations.Nullable
        private final com.woocommerce.android.model.Product parentProduct = null;
        @org.jetbrains.annotations.Nullable
        private final java.util.List<com.woocommerce.android.model.ProductVariation> variationsList = null;
        private final boolean isSkeletonShown = false;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.creation.variations.OrderCreationVariationSelectionViewModel.ViewState copy(@org.jetbrains.annotations.Nullable
        com.woocommerce.android.model.Product parentProduct, @org.jetbrains.annotations.Nullable
        java.util.List<com.woocommerce.android.model.ProductVariation> variationsList) {
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
        
        public ViewState(@org.jetbrains.annotations.Nullable
        com.woocommerce.android.model.Product parentProduct, @org.jetbrains.annotations.Nullable
        java.util.List<com.woocommerce.android.model.ProductVariation> variationsList) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.woocommerce.android.model.Product component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.woocommerce.android.model.Product getParentProduct() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<com.woocommerce.android.model.ProductVariation> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<com.woocommerce.android.model.ProductVariation> getVariationsList() {
            return null;
        }
        
        public final boolean isSkeletonShown() {
            return false;
        }
    }
}