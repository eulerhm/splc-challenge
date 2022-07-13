package com.woocommerce.android.ui.products.variations;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0002"}, d2 = {"BULK_UPDATE_VARIATIONS_LIMIT", "", "WooCommerce_wasabiDebug"})
public final class VariationListViewModelKt {
    
    /**
     * [Product] and [ProductVariation] are two models fetched in separate endpoints,
     * but to allow us to create and delete variations correctly, consistency between
     * site and app data around both models is necessary to handle the correct flow
     * to the user.
     *
     * This happens because when any change happens at the variation list
     * from a product, the [Product.numVariations] is also updated by the site,
     * causing the need to fetch the product data after that, allowing
     * us to be able to tell at any Product view if we shall make available
     * the first variation creation flow or just allow the user the access the variation
     * list view directly without affecting the ability of the Fragment to manage drafts.
     *
     * With that said, when we update the Variation list, we should also update the
     * [ViewState.parentProduct] so the correct information is returned [onExit]
     */
    private static final int BULK_UPDATE_VARIATIONS_LIMIT = 100;
}