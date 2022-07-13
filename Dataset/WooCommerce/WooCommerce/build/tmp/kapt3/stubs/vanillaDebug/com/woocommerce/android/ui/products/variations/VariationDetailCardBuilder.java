package com.woocommerce.android.ui.products.variations;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\f\u0010\u0016\u001a\u00020\u0017*\u00020\u0013H\u0002J\f\u0010\u0018\u001a\u00020\u0019*\u00020\u0013H\u0002J\f\u0010\u001a\u001a\u00020\u0019*\u00020\u0013H\u0002J\f\u0010\u001b\u001a\u00020\u0019*\u00020\u0013H\u0002J\u000e\u0010\u001c\u001a\u0004\u0018\u00010\u0019*\u00020\u0013H\u0002J\f\u0010\u001d\u001a\u00020\u0019*\u00020\u0013H\u0002J\f\u0010\u001e\u001a\u00020\u0019*\u00020\u0013H\u0002J\u000e\u0010\u001f\u001a\u0004\u0018\u00010\u0019*\u00020\u0013H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/woocommerce/android/ui/products/variations/VariationDetailCardBuilder;", "", "viewModel", "Lcom/woocommerce/android/ui/products/variations/VariationDetailViewModel;", "resources", "Lcom/woocommerce/android/viewmodel/ResourceProvider;", "currencyFormatter", "Lcom/woocommerce/android/util/CurrencyFormatter;", "parameters", "Lcom/woocommerce/android/ui/products/models/SiteParameters;", "(Lcom/woocommerce/android/ui/products/variations/VariationDetailViewModel;Lcom/woocommerce/android/viewmodel/ResourceProvider;Lcom/woocommerce/android/util/CurrencyFormatter;Lcom/woocommerce/android/ui/products/models/SiteParameters;)V", "originalSku", "", "parentProduct", "Lcom/woocommerce/android/model/Product;", "buildPropertyCards", "", "Lcom/woocommerce/android/ui/products/models/ProductPropertyCard;", "variation", "Lcom/woocommerce/android/model/ProductVariation;", "getPrimaryCard", "getSecondaryCard", "attributes", "Lcom/woocommerce/android/ui/products/models/ProductProperty$PropertyGroup;", "description", "Lcom/woocommerce/android/ui/products/models/ProductProperty;", "inventory", "price", "shipping", "title", "visibility", "warning", "WooCommerce_vanillaDebug"})
public final class VariationDetailCardBuilder {
    private final com.woocommerce.android.ui.products.variations.VariationDetailViewModel viewModel = null;
    private final com.woocommerce.android.viewmodel.ResourceProvider resources = null;
    private final com.woocommerce.android.util.CurrencyFormatter currencyFormatter = null;
    private final com.woocommerce.android.ui.products.models.SiteParameters parameters = null;
    private java.lang.String originalSku;
    private com.woocommerce.android.model.Product parentProduct;
    
    public VariationDetailCardBuilder(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.variations.VariationDetailViewModel viewModel, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.viewmodel.ResourceProvider resources, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.CurrencyFormatter currencyFormatter, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.models.SiteParameters parameters) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.woocommerce.android.ui.products.models.ProductPropertyCard> buildPropertyCards(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.ProductVariation variation, @org.jetbrains.annotations.NotNull()
    java.lang.String originalSku, @org.jetbrains.annotations.Nullable()
    com.woocommerce.android.model.Product parentProduct) {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.models.ProductPropertyCard getSecondaryCard(com.woocommerce.android.model.ProductVariation variation) {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.models.ProductPropertyCard getPrimaryCard(com.woocommerce.android.model.ProductVariation variation) {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.models.ProductProperty title(com.woocommerce.android.model.ProductVariation $this$title) {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.models.ProductProperty description(com.woocommerce.android.model.ProductVariation $this$description) {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.models.ProductProperty visibility(com.woocommerce.android.model.ProductVariation $this$visibility) {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.models.ProductProperty warning(com.woocommerce.android.model.ProductVariation $this$warning) {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.models.ProductProperty price(com.woocommerce.android.model.ProductVariation $this$price) {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.models.ProductProperty.PropertyGroup attributes(com.woocommerce.android.model.ProductVariation $this$attributes) {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.models.ProductProperty shipping(com.woocommerce.android.model.ProductVariation $this$shipping) {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.models.ProductProperty inventory(com.woocommerce.android.model.ProductVariation $this$inventory) {
        return null;
    }
}