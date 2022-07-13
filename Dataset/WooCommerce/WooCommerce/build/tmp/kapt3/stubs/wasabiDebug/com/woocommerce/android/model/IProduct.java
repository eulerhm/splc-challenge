package com.woocommerce.android.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010\u000f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\rH\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005\u00a8\u0006\u0012"}, d2 = {"Lcom/woocommerce/android/model/IProduct;", "", "height", "", "getHeight", "()F", "length", "getLength", "weight", "getWeight", "width", "getWidth", "getSizeWithUnits", "", "dimensionUnit", "getWeightWithUnits", "weightUnit", "Companion", "WooCommerce_wasabiDebug"})
public abstract interface IProduct {
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.model.IProduct.Companion Companion = null;
    
    public abstract float getLength();
    
    public abstract float getWidth();
    
    public abstract float getHeight();
    
    public abstract float getWeight();
    
    /**
     * Formats the [Product] weight with the given [weightUnit]
     * for display purposes.
     * Eg: 12oz
     */
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getWeightWithUnits(@org.jetbrains.annotations.Nullable
    java.lang.String weightUnit);
    
    /**
     * Formats the [Product] size (length, width, height) with the given [dimensionUnit]
     * if all the dimensions are available.
     * Eg: 12 x 15 x 13 in
     */
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getSizeWithUnits(@org.jetbrains.annotations.Nullable
    java.lang.String dimensionUnit);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
        
        /**
         * Formats the [Product] weight with the given [weightUnit]
         * for display purposes.
         * Eg: 12oz
         */
        @org.jetbrains.annotations.NotNull
        public static java.lang.String getWeightWithUnits(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.model.IProduct $this, @org.jetbrains.annotations.Nullable
        java.lang.String weightUnit) {
            return null;
        }
        
        /**
         * Formats the [Product] size (length, width, height) with the given [dimensionUnit]
         * if all the dimensions are available.
         * Eg: 12 x 15 x 13 in
         */
        @org.jetbrains.annotations.NotNull
        public static java.lang.String getSizeWithUnits(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.model.IProduct $this, @org.jetbrains.annotations.Nullable
        java.lang.String dimensionUnit) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/woocommerce/android/model/IProduct$Companion;", "", "()V", "EMPTY", "", "NO_DIMENSIONS", "", "ONE_DIMENSIONAL", "SPACE", "THREE_DIMENSIONAL", "TWO_DIMENSIONAL", "X", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        private static final java.lang.String EMPTY = "";
        private static final java.lang.String SPACE = " ";
        private static final java.lang.String X = " x ";
        private static final int NO_DIMENSIONS = 0;
        private static final int ONE_DIMENSIONAL = 1;
        private static final int TWO_DIMENSIONAL = 2;
        private static final int THREE_DIMENSIONAL = 3;
        
        private Companion() {
            super();
        }
    }
}