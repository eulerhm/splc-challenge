package com.woocommerce.android.ui.products.categories.selector;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a:\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0003\u001a\b\u0010\b\u001a\u00020\u0001H\u0003\u001a\u0010\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000bH\u0003\u001a\b\u0010\f\u001a\u00020\u0001H\u0003\u001a\u0010\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000fH\u0007\u001aV\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\u00112\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u001a\u001e\u0010\u0012\u001a\u00020\u0001*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0002\u00a8\u0006\u0018"}, d2 = {"CategoriesList", "", "viewState", "Lcom/woocommerce/android/ui/products/categories/selector/ProductCategorySelectorViewModel$ViewState;", "onLoadMore", "Lkotlin/Function0;", "onClearSelectionClick", "onDoneClick", "CategoriesSkeleton", "EmptyCategoriesList", "searchQuery", "", "PreviewProductCategorySelector", "ProductCategorySelectorScreen", "viewModel", "Lcom/woocommerce/android/ui/products/categories/selector/ProductCategorySelectorViewModel;", "onSearchQueryChanged", "Lkotlin/Function1;", "categoryItem", "Landroidx/compose/foundation/lazy/LazyListScope;", "item", "Lcom/woocommerce/android/ui/products/categories/selector/ProductCategorySelectorViewModel$CategoryUiModel;", "depth", "", "WooCommerce_vanillaDebug"})
public final class ProductCategorySelectorScreenKt {
    
    @androidx.compose.runtime.Composable()
    public static final void ProductCategorySelectorScreen(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.categories.selector.ProductCategorySelectorViewModel viewModel) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void ProductCategorySelectorScreen(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.categories.selector.ProductCategorySelectorViewModel.ViewState viewState, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onLoadMore, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClearSelectionClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onSearchQueryChanged, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onDoneClick) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void CategoriesList(com.woocommerce.android.ui.products.categories.selector.ProductCategorySelectorViewModel.ViewState viewState, kotlin.jvm.functions.Function0<kotlin.Unit> onLoadMore, kotlin.jvm.functions.Function0<kotlin.Unit> onClearSelectionClick, kotlin.jvm.functions.Function0<kotlin.Unit> onDoneClick) {
    }
    
    private static final void categoryItem(androidx.compose.foundation.lazy.LazyListScope $this$categoryItem, com.woocommerce.android.ui.products.categories.selector.ProductCategorySelectorViewModel.CategoryUiModel item, int depth) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void EmptyCategoriesList(java.lang.String searchQuery) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void CategoriesSkeleton() {
    }
    
    @androidx.compose.runtime.Composable()
    @androidx.compose.ui.tooling.preview.Preview()
    private static final void PreviewProductCategorySelector() {
    }
}