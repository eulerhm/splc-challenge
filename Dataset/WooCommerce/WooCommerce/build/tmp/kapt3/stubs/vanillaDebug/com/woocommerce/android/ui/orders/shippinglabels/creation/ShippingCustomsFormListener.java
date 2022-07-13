package com.woocommerce.android.ui.orders.shippinglabels.creation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH&J \u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0007H&J \u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0007H&J \u0010\u0011\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0007H&J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0007H&J \u0010\u0015\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0017H&J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001aH&J\u0018\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0007H&J\u0018\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001fH&J\u0018\u0010 \u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u001aH&J \u0010\"\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0007H&\u00a8\u0006$"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCustomsFormListener;", "", "onContentsDescriptionChanged", "", "position", "", "contentsDescription", "", "onContentsTypeChanged", "contentsType", "Lcom/woocommerce/android/model/ContentsType;", "onHsTariffNumberChanged", "packagePosition", "linePosition", "hsTariffNumber", "onItemDescriptionChanged", "description", "onItemValueChanged", "itemValue", "onItnChanged", "itn", "onOriginCountryChanged", "country", "Lcom/woocommerce/android/model/Location;", "onPackageExpandedChanged", "isExpanded", "", "onRestrictionDescriptionChanged", "restrictionDescription", "onRestrictionTypeChanged", "restrictionType", "Lcom/woocommerce/android/model/RestrictionType;", "onReturnToSenderChanged", "returnToSender", "onWeightChanged", "weight", "WooCommerce_vanillaDebug"})
public abstract interface ShippingCustomsFormListener {
    
    public abstract void onPackageExpandedChanged(int position, boolean isExpanded);
    
    public abstract void onReturnToSenderChanged(int position, boolean returnToSender);
    
    public abstract void onContentsTypeChanged(int position, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.ContentsType contentsType);
    
    public abstract void onContentsDescriptionChanged(int position, @org.jetbrains.annotations.NotNull()
    java.lang.String contentsDescription);
    
    public abstract void onRestrictionTypeChanged(int position, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.RestrictionType restrictionType);
    
    public abstract void onRestrictionDescriptionChanged(int position, @org.jetbrains.annotations.NotNull()
    java.lang.String restrictionDescription);
    
    public abstract void onItnChanged(int position, @org.jetbrains.annotations.NotNull()
    java.lang.String itn);
    
    public abstract void onItemDescriptionChanged(int packagePosition, int linePosition, @org.jetbrains.annotations.NotNull()
    java.lang.String description);
    
    public abstract void onHsTariffNumberChanged(int packagePosition, int linePosition, @org.jetbrains.annotations.NotNull()
    java.lang.String hsTariffNumber);
    
    public abstract void onWeightChanged(int packagePosition, int linePosition, @org.jetbrains.annotations.NotNull()
    java.lang.String weight);
    
    public abstract void onItemValueChanged(int packagePosition, int linePosition, @org.jetbrains.annotations.NotNull()
    java.lang.String itemValue);
    
    public abstract void onOriginCountryChanged(int packagePosition, int linePosition, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.Location country);
}