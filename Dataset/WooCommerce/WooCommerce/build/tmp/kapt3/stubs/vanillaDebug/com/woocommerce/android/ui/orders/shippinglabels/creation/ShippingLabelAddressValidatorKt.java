package com.woocommerce.android.ui.orders.shippinglabels.creation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"isValidPhoneNumber", "", "", "addressType", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelAddressValidator$AddressType;", "WooCommerce_vanillaDebug"})
public final class ShippingLabelAddressValidatorKt {
    
    /**
     * Checks whether the phone number is valid or not, depending on the [addressType], the check is:
     * - [ORIGIN]: Checks whether the phone number contains 10 digits exactly after deleting an optional 1 as
     *            the area code.
     * - [DESTINATION]: Checks whether the phone has any digits.
     *
     * As EasyPost is permissive for the presence of other characters, we delete all other characters before checking,
     * and that's similar to what the web client does.
     * Source: https://github.com/Automattic/woocommerce-services/issues/1351
     */
    @kotlin.Suppress(names = {"MagicNumber"})
    public static final boolean isValidPhoneNumber(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$isValidPhoneNumber, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressValidator.AddressType addressType) {
        return false;
    }
}