package com.woocommerce.android.ui.products.categories.selector;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.OptIn(markerClass = {kotlinx.coroutines.FlowPreview.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 )2\u00020\u0001:\u0004()*+B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\u0006\u0010 \u001a\u00020\u001fJ\u0006\u0010!\u001a\u00020\u001fJ\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u0015J\u001a\u0010&\u001a\u00020\'*\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d\u00a8\u0006,"}, d2 = {"Lcom/woocommerce/android/ui/products/categories/selector/ProductCategorySelectorViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "listHandler", "Lcom/woocommerce/android/ui/products/categories/selector/ProductCategoryListHandler;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/ui/products/categories/selector/ProductCategoryListHandler;)V", "categories", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/woocommerce/android/ui/products/categories/selector/ProductCategoryTreeItem;", "loadingState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/woocommerce/android/ui/products/categories/selector/ProductCategorySelectorViewModel$LoadingState;", "navArgs", "Lcom/woocommerce/android/ui/products/categories/selector/ProductCategorySelectorFragmentArgs;", "getNavArgs", "()Lcom/woocommerce/android/ui/products/categories/selector/ProductCategorySelectorFragmentArgs;", "navArgs$delegate", "Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "searchQuery", "", "selectedCategories", "", "", "viewState", "Landroidx/lifecycle/LiveData;", "Lcom/woocommerce/android/ui/products/categories/selector/ProductCategorySelectorViewModel$ViewState;", "getViewState", "()Landroidx/lifecycle/LiveData;", "monitorSearchQuery", "", "onClearSelectionClick", "onDoneClick", "onLoadMore", "Lkotlinx/coroutines/Job;", "onSearchQueryChanged", "query", "toUiModel", "Lcom/woocommerce/android/ui/products/categories/selector/ProductCategorySelectorViewModel$CategoryUiModel;", "CategoryUiModel", "Companion", "LoadingState", "ViewState", "WooCommerce_wasabiDebug"})
public final class ProductCategorySelectorViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.ui.products.categories.selector.ProductCategoryListHandler listHandler = null;
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.products.categories.selector.ProductCategorySelectorViewModel.Companion Companion = null;
    private static final long LOADING_STATE_DELAY = 100L;
    private final com.woocommerce.android.viewmodel.NavArgsLazy navArgs$delegate = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> searchQuery = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.Set<java.lang.Long>> selectedCategories = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.woocommerce.android.ui.products.categories.selector.ProductCategorySelectorViewModel.LoadingState> loadingState = null;
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.woocommerce.android.ui.products.categories.selector.ProductCategoryTreeItem>> categories = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.woocommerce.android.ui.products.categories.selector.ProductCategorySelectorViewModel.ViewState> viewState = null;
    
    @javax.inject.Inject
    public ProductCategorySelectorViewModel(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.categories.selector.ProductCategoryListHandler listHandler) {
        super(null);
    }
    
    private final com.woocommerce.android.ui.products.categories.selector.ProductCategorySelectorFragmentArgs getNavArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.woocommerce.android.ui.products.categories.selector.ProductCategorySelectorViewModel.ViewState> getViewState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job onLoadMore() {
        return null;
    }
    
    public final void onClearSelectionClick() {
    }
    
    public final void onSearchQueryChanged(@org.jetbrains.annotations.NotNull
    java.lang.String query) {
    }
    
    public final void onDoneClick() {
    }
    
    private final void monitorSearchQuery() {
    }
    
    private final com.woocommerce.android.ui.products.categories.selector.ProductCategorySelectorViewModel.CategoryUiModel toUiModel(com.woocommerce.android.ui.products.categories.selector.ProductCategoryTreeItem $this$toUiModel, java.util.Set<java.lang.Long> selectedCategories) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00000\u0007H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\tH\u00c6\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u00c6\u0003JG\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001J\t\u0010!\u001a\u00020\u0005H\u00d6\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\""}, d2 = {"Lcom/woocommerce/android/ui/products/categories/selector/ProductCategorySelectorViewModel$CategoryUiModel;", "", "id", "", "title", "", "children", "", "isSelected", "", "onItemClick", "Lkotlin/Function0;", "", "(JLjava/lang/String;Ljava/util/List;ZLkotlin/jvm/functions/Function0;)V", "getChildren", "()Ljava/util/List;", "getId", "()J", "()Z", "getOnItemClick", "()Lkotlin/jvm/functions/Function0;", "getTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "WooCommerce_wasabiDebug"})
    public static final class CategoryUiModel {
        private final long id = 0L;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String title = null;
        @org.jetbrains.annotations.NotNull
        private final java.util.List<com.woocommerce.android.ui.products.categories.selector.ProductCategorySelectorViewModel.CategoryUiModel> children = null;
        private final boolean isSelected = false;
        @org.jetbrains.annotations.NotNull
        private final kotlin.jvm.functions.Function0<kotlin.Unit> onItemClick = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.categories.selector.ProductCategorySelectorViewModel.CategoryUiModel copy(long id, @org.jetbrains.annotations.NotNull
        java.lang.String title, @org.jetbrains.annotations.NotNull
        java.util.List<com.woocommerce.android.ui.products.categories.selector.ProductCategorySelectorViewModel.CategoryUiModel> children, boolean isSelected, @org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function0<kotlin.Unit> onItemClick) {
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
        
        public CategoryUiModel(long id, @org.jetbrains.annotations.NotNull
        java.lang.String title, @org.jetbrains.annotations.NotNull
        java.util.List<com.woocommerce.android.ui.products.categories.selector.ProductCategorySelectorViewModel.CategoryUiModel> children, boolean isSelected, @org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function0<kotlin.Unit> onItemClick) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getId() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.woocommerce.android.ui.products.categories.selector.ProductCategorySelectorViewModel.CategoryUiModel> component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.woocommerce.android.ui.products.categories.selector.ProductCategorySelectorViewModel.CategoryUiModel> getChildren() {
            return null;
        }
        
        public final boolean component4() {
            return false;
        }
        
        public final boolean isSelected() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull
        public final kotlin.jvm.functions.Function0<kotlin.Unit> component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnItemClick() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\bH\u00c6\u0003J\t\u0010\u0017\u001a\u00020\nH\u00c6\u0003J7\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\bH\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001e"}, d2 = {"Lcom/woocommerce/android/ui/products/categories/selector/ProductCategorySelectorViewModel$ViewState;", "", "categories", "", "Lcom/woocommerce/android/ui/products/categories/selector/ProductCategorySelectorViewModel$CategoryUiModel;", "selectedCategoriesCount", "", "searchQuery", "", "loadingState", "Lcom/woocommerce/android/ui/products/categories/selector/ProductCategorySelectorViewModel$LoadingState;", "(Ljava/util/List;ILjava/lang/String;Lcom/woocommerce/android/ui/products/categories/selector/ProductCategorySelectorViewModel$LoadingState;)V", "getCategories", "()Ljava/util/List;", "getLoadingState", "()Lcom/woocommerce/android/ui/products/categories/selector/ProductCategorySelectorViewModel$LoadingState;", "getSearchQuery", "()Ljava/lang/String;", "getSelectedCategoriesCount", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "WooCommerce_wasabiDebug"})
    public static final class ViewState {
        @org.jetbrains.annotations.NotNull
        private final java.util.List<com.woocommerce.android.ui.products.categories.selector.ProductCategorySelectorViewModel.CategoryUiModel> categories = null;
        private final int selectedCategoriesCount = 0;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String searchQuery = null;
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.ui.products.categories.selector.ProductCategorySelectorViewModel.LoadingState loadingState = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.categories.selector.ProductCategorySelectorViewModel.ViewState copy(@org.jetbrains.annotations.NotNull
        java.util.List<com.woocommerce.android.ui.products.categories.selector.ProductCategorySelectorViewModel.CategoryUiModel> categories, int selectedCategoriesCount, @org.jetbrains.annotations.NotNull
        java.lang.String searchQuery, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.products.categories.selector.ProductCategorySelectorViewModel.LoadingState loadingState) {
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
        java.util.List<com.woocommerce.android.ui.products.categories.selector.ProductCategorySelectorViewModel.CategoryUiModel> categories, int selectedCategoriesCount, @org.jetbrains.annotations.NotNull
        java.lang.String searchQuery, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.products.categories.selector.ProductCategorySelectorViewModel.LoadingState loadingState) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.woocommerce.android.ui.products.categories.selector.ProductCategorySelectorViewModel.CategoryUiModel> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.woocommerce.android.ui.products.categories.selector.ProductCategorySelectorViewModel.CategoryUiModel> getCategories() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int getSelectedCategoriesCount() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getSearchQuery() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.categories.selector.ProductCategorySelectorViewModel.LoadingState component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.categories.selector.ProductCategorySelectorViewModel.LoadingState getLoadingState() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/woocommerce/android/ui/products/categories/selector/ProductCategorySelectorViewModel$LoadingState;", "", "(Ljava/lang/String;I)V", "Idle", "Loading", "Appending", "WooCommerce_wasabiDebug"})
    public static enum LoadingState {
        /*public static final*/ Idle /* = new Idle() */,
        /*public static final*/ Loading /* = new Loading() */,
        /*public static final*/ Appending /* = new Appending() */;
        
        LoadingState() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/products/categories/selector/ProductCategorySelectorViewModel$Companion;", "", "()V", "LOADING_STATE_DELAY", "", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}