package com.woocommerce.android.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J-\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\n\u0010\t\u001a\u00060\nj\u0002`\u000b2\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/woocommerce/android/model/GetLocations;", "", "locationStore", "Lorg/wordpress/android/fluxc/store/WCDataStore;", "(Lorg/wordpress/android/fluxc/store/WCDataStore;)V", "invoke", "Lkotlin/Pair;", "Lcom/woocommerce/android/model/Location;", "Lcom/woocommerce/android/model/AmbiguousLocation;", "countryCode", "", "Lcom/woocommerce/android/ui/orders/details/editing/address/LocationCode;", "stateCode", "WooCommerce_vanillaDebug"})
public final class GetLocations {
    private final org.wordpress.android.fluxc.store.WCDataStore locationStore = null;
    
    @javax.inject.Inject()
    public GetLocations(@org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.WCDataStore locationStore) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Pair<com.woocommerce.android.model.Location, com.woocommerce.android.model.AmbiguousLocation> invoke(@org.jetbrains.annotations.NotNull()
    java.lang.String countryCode, @org.jetbrains.annotations.NotNull()
    java.lang.String stateCode) {
        return null;
    }
}