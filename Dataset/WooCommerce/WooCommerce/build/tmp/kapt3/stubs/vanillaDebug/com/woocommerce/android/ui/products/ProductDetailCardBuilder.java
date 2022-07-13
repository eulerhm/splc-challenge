package com.woocommerce.android.ui.products;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\'\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0019\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u0019\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u001f*\u00020\u0015H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u000e\u0010 \u001a\u0004\u0018\u00010\u001f*\u00020\u0015H\u0002J\f\u0010!\u001a\u00020\u001f*\u00020\u0015H\u0002J\u000e\u0010\"\u001a\u0004\u0018\u00010\u001f*\u00020\u0015H\u0002J\f\u0010#\u001a\u00020$*\u00020\u0015H\u0002J\u000e\u0010%\u001a\u0004\u0018\u00010\u001f*\u00020\u0015H\u0002J\f\u0010&\u001a\u00020\u001f*\u00020\u0015H\u0002J\u0014\u0010\'\u001a\u00020\u001f*\u00020\u00152\u0006\u0010(\u001a\u00020)H\u0002J\u000e\u0010*\u001a\u0004\u0018\u00010\u001f*\u00020\u0015H\u0002J\f\u0010+\u001a\u00020\u001f*\u00020\u0015H\u0002J\u000e\u0010,\u001a\u0004\u0018\u00010\u001f*\u00020\u0015H\u0002J\f\u0010(\u001a\u00020\u001f*\u00020\u0015H\u0002J\f\u0010-\u001a\u00020\u0010*\u00020\u0015H\u0002J\u000e\u0010.\u001a\u0004\u0018\u00010\u001f*\u00020\u0015H\u0002J\u000e\u0010/\u001a\u0004\u0018\u00010\u001f*\u00020\u0015H\u0002J\u000e\u00100\u001a\u0004\u0018\u00010\u001f*\u00020\u0015H\u0002J\f\u00101\u001a\u00020\u001f*\u00020\u0015H\u0002J\u000e\u00102\u001a\u0004\u0018\u000103*\u00020\u0015H\u0002J\f\u00104\u001a\u00020\u001f*\u00020\u0015H\u0002J\u000e\u00105\u001a\u0004\u0018\u00010\u001f*\u00020\u0015H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00066"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductDetailCardBuilder;", "", "viewModel", "Lcom/woocommerce/android/ui/products/ProductDetailViewModel;", "resources", "Lcom/woocommerce/android/viewmodel/ResourceProvider;", "currencyFormatter", "Lcom/woocommerce/android/util/CurrencyFormatter;", "parameters", "Lcom/woocommerce/android/ui/products/models/SiteParameters;", "addonRepository", "Lcom/woocommerce/android/ui/products/addons/AddonRepository;", "variationRepository", "Lcom/woocommerce/android/ui/products/variations/VariationRepository;", "(Lcom/woocommerce/android/ui/products/ProductDetailViewModel;Lcom/woocommerce/android/viewmodel/ResourceProvider;Lcom/woocommerce/android/util/CurrencyFormatter;Lcom/woocommerce/android/ui/products/models/SiteParameters;Lcom/woocommerce/android/ui/products/addons/AddonRepository;Lcom/woocommerce/android/ui/products/variations/VariationRepository;)V", "originalSku", "", "buildPropertyCards", "", "Lcom/woocommerce/android/ui/products/models/ProductPropertyCard;", "product", "Lcom/woocommerce/android/model/Product;", "(Lcom/woocommerce/android/model/Product;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getExternalProductCard", "(Lcom/woocommerce/android/model/Product;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGroupedProductCard", "getOtherProductCard", "getPrimaryCard", "getSimpleProductCard", "getVariableProductCard", "addons", "Lcom/woocommerce/android/ui/products/models/ProductProperty;", "categories", "description", "downloads", "emptyVariations", "Lcom/woocommerce/android/ui/products/models/ProductProperty$ComplexProperty;", "externalLink", "groupedProducts", "inventory", "productType", "Lcom/woocommerce/android/ui/products/ProductType;", "linkedProducts", "price", "productReviews", "productTypeDisplayName", "shipping", "shortDescription", "tags", "title", "variationAttributes", "Lcom/woocommerce/android/ui/products/models/ProductProperty$PropertyGroup;", "variations", "warning", "WooCommerce_vanillaDebug"})
public final class ProductDetailCardBuilder {
    private final com.woocommerce.android.ui.products.ProductDetailViewModel viewModel = null;
    private final com.woocommerce.android.viewmodel.ResourceProvider resources = null;
    private final com.woocommerce.android.util.CurrencyFormatter currencyFormatter = null;
    private final com.woocommerce.android.ui.products.models.SiteParameters parameters = null;
    private final com.woocommerce.android.ui.products.addons.AddonRepository addonRepository = null;
    private final com.woocommerce.android.ui.products.variations.VariationRepository variationRepository = null;
    private java.lang.String originalSku;
    
    public ProductDetailCardBuilder(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.ProductDetailViewModel viewModel, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.viewmodel.ResourceProvider resources, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.CurrencyFormatter currencyFormatter, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.models.SiteParameters parameters, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.addons.AddonRepository addonRepository, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.variations.VariationRepository variationRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object buildPropertyCards(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.Product product, @org.jetbrains.annotations.NotNull()
    java.lang.String originalSku, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.woocommerce.android.ui.products.models.ProductPropertyCard>> continuation) {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.models.ProductPropertyCard getPrimaryCard(com.woocommerce.android.model.Product product) {
        return null;
    }
    
    private final java.lang.Object getSimpleProductCard(com.woocommerce.android.model.Product product, kotlin.coroutines.Continuation<? super com.woocommerce.android.ui.products.models.ProductPropertyCard> continuation) {
        return null;
    }
    
    private final java.lang.Object getGroupedProductCard(com.woocommerce.android.model.Product product, kotlin.coroutines.Continuation<? super com.woocommerce.android.ui.products.models.ProductPropertyCard> continuation) {
        return null;
    }
    
    private final java.lang.Object getExternalProductCard(com.woocommerce.android.model.Product product, kotlin.coroutines.Continuation<? super com.woocommerce.android.ui.products.models.ProductPropertyCard> continuation) {
        return null;
    }
    
    private final java.lang.Object getVariableProductCard(com.woocommerce.android.model.Product product, kotlin.coroutines.Continuation<? super com.woocommerce.android.ui.products.models.ProductPropertyCard> continuation) {
        return null;
    }
    
    /**
     * Used for product types the app doesn't support yet (ex: subscriptions), uses a subset
     * of properties since we can't be sure pricing, shipping, etc., are applicable
     */
    private final java.lang.Object getOtherProductCard(com.woocommerce.android.model.Product product, kotlin.coroutines.Continuation<? super com.woocommerce.android.ui.products.models.ProductPropertyCard> continuation) {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.models.ProductProperty downloads(com.woocommerce.android.model.Product $this$downloads) {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.models.ProductProperty shortDescription(com.woocommerce.android.model.Product $this$shortDescription) {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.models.ProductProperty inventory(com.woocommerce.android.model.Product $this$inventory, com.woocommerce.android.ui.products.ProductType productType) {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.models.ProductProperty shipping(com.woocommerce.android.model.Product $this$shipping) {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.models.ProductProperty externalLink(com.woocommerce.android.model.Product $this$externalLink) {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.models.ProductProperty price(com.woocommerce.android.model.Product $this$price) {
        return null;
    }
    
    private final java.lang.String productTypeDisplayName(com.woocommerce.android.model.Product $this$productTypeDisplayName) {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.models.ProductProperty productType(com.woocommerce.android.model.Product $this$productType) {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.models.ProductProperty productReviews(com.woocommerce.android.model.Product $this$productReviews) {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.models.ProductProperty groupedProducts(com.woocommerce.android.model.Product $this$groupedProducts) {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.models.ProductProperty linkedProducts(com.woocommerce.android.model.Product $this$linkedProducts) {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.models.ProductProperty title(com.woocommerce.android.model.Product $this$title) {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.models.ProductProperty description(com.woocommerce.android.model.Product $this$description) {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.models.ProductProperty variations(com.woocommerce.android.model.Product $this$variations) {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.models.ProductProperty.ComplexProperty emptyVariations(com.woocommerce.android.model.Product $this$emptyVariations) {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.models.ProductProperty.PropertyGroup variationAttributes(com.woocommerce.android.model.Product $this$variationAttributes) {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.models.ProductProperty categories(com.woocommerce.android.model.Product $this$categories) {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.models.ProductProperty tags(com.woocommerce.android.model.Product $this$tags) {
        return null;
    }
    
    private final java.lang.Object addons(com.woocommerce.android.model.Product $this$addons, kotlin.coroutines.Continuation<? super com.woocommerce.android.ui.products.models.ProductProperty> p1) {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.models.ProductProperty warning(com.woocommerce.android.model.Product $this$warning) {
        return null;
    }
}