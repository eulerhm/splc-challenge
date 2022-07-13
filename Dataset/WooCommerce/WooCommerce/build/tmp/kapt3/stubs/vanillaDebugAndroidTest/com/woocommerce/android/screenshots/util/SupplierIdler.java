package com.woocommerce.android.screenshots.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\b\u0016\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/screenshots/util/SupplierIdler;", "Lcom/woocommerce/android/screenshots/util/TestIdler;", "supplier", "Ljava/util/function/Supplier;", "", "(Ljava/util/function/Supplier;)V", "checkCondition", "WooCommerce_vanillaDebug"})
public final class SupplierIdler extends com.woocommerce.android.screenshots.util.TestIdler {
    private java.util.function.Supplier<java.lang.Boolean> supplier;
    
    public SupplierIdler(@org.jetbrains.annotations.NotNull()
    java.util.function.Supplier<java.lang.Boolean> supplier) {
        super();
    }
    
    @java.lang.Override()
    public boolean checkCondition() {
        return false;
    }
}