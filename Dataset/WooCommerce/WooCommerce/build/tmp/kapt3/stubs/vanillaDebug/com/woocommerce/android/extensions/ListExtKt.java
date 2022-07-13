package com.woocommerce.android.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000:\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aC\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00032\u001d\u0010\u0005\u001a\u0019\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0006\u00a2\u0006\u0002\b\u0007\u001a\u001e\u0010\b\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\t0\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0003\u001a\u001e\u0010\u000b\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\f0\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u001a!\u0010\u000e\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\f0\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\f0\u0003H\u0086\u0004\u001a\"\u0010\u000f\u001a\u00020\u0010*\b\u0012\u0004\u0012\u00020\u00100\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010\u001aT\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0014\"\u0004\b\u0002\u0010\u0015*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\u00150\u00160\u00032\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u00020\u0006H\u0086\b\u00f8\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u0018"}, d2 = {"areSameAs", "", "T", "", "otherList", "isSameAs", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "areSameImagesAs", "Lcom/woocommerce/android/model/Product$Image;", "images", "areSameProductsAs", "Lcom/woocommerce/android/model/Product;", "products", "differsFrom", "joinToString", "", "separator", "lastSeparator", "pairMap", "R", "V", "Lkotlin/Pair;", "transform", "WooCommerce_vanillaDebug"})
public final class ListExtKt {
    
    public static final <T extends java.lang.Object>boolean areSameAs(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> $this$areSameAs, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> otherList, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super T, ? super T, java.lang.Boolean> isSameAs) {
        return false;
    }
    
    public static final boolean areSameImagesAs(@org.jetbrains.annotations.NotNull()
    java.util.List<com.woocommerce.android.model.Product.Image> $this$areSameImagesAs, @org.jetbrains.annotations.NotNull()
    java.util.List<com.woocommerce.android.model.Product.Image> images) {
        return false;
    }
    
    public static final boolean areSameProductsAs(@org.jetbrains.annotations.NotNull()
    java.util.List<com.woocommerce.android.model.Product> $this$areSameProductsAs, @org.jetbrains.annotations.NotNull()
    java.util.List<com.woocommerce.android.model.Product> products) {
        return false;
    }
    
    public static final boolean differsFrom(@org.jetbrains.annotations.NotNull()
    java.util.List<com.woocommerce.android.model.Product> $this$differsFrom, @org.jetbrains.annotations.NotNull()
    java.util.List<com.woocommerce.android.model.Product> otherList) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String joinToString(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> $this$joinToString, @org.jetbrains.annotations.NotNull()
    java.lang.String separator, @org.jetbrains.annotations.NotNull()
    java.lang.String lastSeparator) {
        return null;
    }
    
    /**
     * Returns a list containing the results of applying the given [transform] function
     * to each [Pair.first] and [Pair.second] in the original collection.
     *
     * This method extend a map operation to be able to take a List of Pairs and map both values declared
     * in a explicit parameter form. The objective of this is to improve the readability when composing
     * complex data through the usage of [Pair]. So instead of access the Pair using [Pair.first] and [Pair.second]
     * this method allow us to define better naming for the map operation by wrapping the object in two parameters
     * inside the [transform] HOF declaration of the caller
     */
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object, R extends java.lang.Object, V extends java.lang.Object>java.util.List<T> pairMap(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends kotlin.Pair<? extends R, ? extends V>> $this$pairMap, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super R, ? super V, ? extends T> transform) {
        return null;
    }
}