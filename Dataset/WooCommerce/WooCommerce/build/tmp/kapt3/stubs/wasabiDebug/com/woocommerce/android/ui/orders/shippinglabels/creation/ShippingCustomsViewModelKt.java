package com.woocommerce.android.ui.orders.shippinglabels.creation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0006*\"\u0010\u0007\"\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u00a8\u0006\u000b"}, d2 = {"HS_TARIFF_NUMBER_REGEX", "Lkotlin/text/Regex;", "ITN_REGEX", "USPS_ITN_REQUIRED_DESTINATIONS", "", "", "[Ljava/lang/String;", "CustomsLineUiState", "Lkotlin/Pair;", "Lcom/woocommerce/android/model/CustomsLine;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCustomsViewModel$LineValidationState;", "WooCommerce_wasabiDebug"})
public final class ShippingCustomsViewModelKt {
    
    /**
     * For information regarding the format of the ITN, check the Appendix A of
     * [Export Compliance Customs Data Requirements](https://postalpro.usps.com/node/3973)
     */
    private static final kotlin.text.Regex ITN_REGEX = null;
    
    /**
     * HS tariff number has to be 6 digits number.
     */
    private static final kotlin.text.Regex HS_TARIFF_NUMBER_REGEX = null;
    private static final java.lang.String[] USPS_ITN_REQUIRED_DESTINATIONS = {"IR", "SY", "KP", "CU", "SD"};
}