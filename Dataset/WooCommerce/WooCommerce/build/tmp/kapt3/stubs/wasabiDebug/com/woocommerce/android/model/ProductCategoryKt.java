package com.woocommerce.android.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002\u001a\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\t\u001a\u00020\n\u001a\n\u0010\u000b\u001a\u00020\u0003*\u00020\f\u00a8\u0006\r"}, d2 = {"containsCategory", "", "", "Lcom/woocommerce/android/model/ProductCategory;", "category", "sortByNameAndParent", "", "Lcom/woocommerce/android/ui/products/categories/ProductCategoryItemUiModel;", "sortCategories", "resourceProvider", "Lcom/woocommerce/android/viewmodel/ResourceProvider;", "toProductCategory", "Lorg/wordpress/android/fluxc/model/WCProductCategoryModel;", "WooCommerce_wasabiDebug"})
public final class ProductCategoryKt {
    
    /**
     * Returns true if the passed category is in the current list of categories
     */
    public static final boolean containsCategory(@org.jetbrains.annotations.NotNull
    java.util.List<com.woocommerce.android.model.ProductCategory> $this$containsCategory, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.ProductCategory category) {
        return false;
    }
    
    /**
     * The method does a Depth First Traversal of the Product Categories and returns an ordered list, which
     * is grouped by their Parent id. The sort is stable, which means that it should return the same list
     * when new categories are updated, and the sort is relative to the update.
     *
     * @return [Set<ProductCategoryItemUiModel>] a sorted set of view holder models containing category view data
     */
    private static final java.util.Set<com.woocommerce.android.ui.products.categories.ProductCategoryItemUiModel> sortByNameAndParent(java.util.List<com.woocommerce.android.model.ProductCategory> $this$sortByNameAndParent) {
        return null;
    }
    
    /**
     * The method takes in a list of product categories and calculates the order and grouping of categories
     * by their parent ids. This creates a stable sorted list of categories by name. The returned list also
     * has margin data, which can be used to visually represent categories in a hierarchy under their
     * parent ids.
     *
     * @return [List<ProductCategoryItemUiModel>] the sorted styled list of categories
     */
    @org.jetbrains.annotations.NotNull
    public static final java.util.List<com.woocommerce.android.ui.products.categories.ProductCategoryItemUiModel> sortCategories(@org.jetbrains.annotations.NotNull
    java.util.List<com.woocommerce.android.model.ProductCategory> $this$sortCategories, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.viewmodel.ResourceProvider resourceProvider) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.model.ProductCategory toProductCategory(@org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.model.WCProductCategoryModel $this$toProductCategory) {
        return null;
    }
}