package com.woocommerce.android.ui.products.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\n\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u00a8\u0006\u001e"}, d2 = {"Lcom/woocommerce/android/ui/products/models/ProductProperty;", "", "type", "Lcom/woocommerce/android/ui/products/models/ProductProperty$Type;", "(Lcom/woocommerce/android/ui/products/models/ProductProperty$Type;)V", "getType", "()Lcom/woocommerce/android/ui/products/models/ProductProperty$Type;", "isNotEmpty", "", "ComplexProperty", "Divider", "Editable", "Link", "Property", "PropertyGroup", "RatingBar", "ReadMore", "Switch", "Type", "Warning", "Lcom/woocommerce/android/ui/products/models/ProductProperty$Divider;", "Lcom/woocommerce/android/ui/products/models/ProductProperty$Property;", "Lcom/woocommerce/android/ui/products/models/ProductProperty$RatingBar;", "Lcom/woocommerce/android/ui/products/models/ProductProperty$ComplexProperty;", "Lcom/woocommerce/android/ui/products/models/ProductProperty$Link;", "Lcom/woocommerce/android/ui/products/models/ProductProperty$Editable;", "Lcom/woocommerce/android/ui/products/models/ProductProperty$ReadMore;", "Lcom/woocommerce/android/ui/products/models/ProductProperty$PropertyGroup;", "Lcom/woocommerce/android/ui/products/models/ProductProperty$Switch;", "Lcom/woocommerce/android/ui/products/models/ProductProperty$Warning;", "WooCommerce_wasabiDebug"})
public abstract class ProductProperty {
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.ui.products.models.ProductProperty.Type type = null;
    
    private ProductProperty(com.woocommerce.android.ui.products.models.ProductProperty.Type type) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.ui.products.models.ProductProperty.Type getType() {
        return null;
    }
    
    public boolean isNotEmpty() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f\u00a8\u0006\r"}, d2 = {"Lcom/woocommerce/android/ui/products/models/ProductProperty$Type;", "", "(Ljava/lang/String;I)V", "DIVIDER", "PROPERTY", "COMPLEX_PROPERTY", "RATING_BAR", "EDITABLE", "PROPERTY_GROUP", "LINK", "READ_MORE", "SWITCH", "WARNING", "WooCommerce_wasabiDebug"})
    public static enum Type {
        /*public static final*/ DIVIDER /* = new DIVIDER() */,
        /*public static final*/ PROPERTY /* = new PROPERTY() */,
        /*public static final*/ COMPLEX_PROPERTY /* = new COMPLEX_PROPERTY() */,
        /*public static final*/ RATING_BAR /* = new RATING_BAR() */,
        /*public static final*/ EDITABLE /* = new EDITABLE() */,
        /*public static final*/ PROPERTY_GROUP /* = new PROPERTY_GROUP() */,
        /*public static final*/ LINK /* = new LINK() */,
        /*public static final*/ READ_MORE /* = new READ_MORE() */,
        /*public static final*/ SWITCH /* = new SWITCH() */,
        /*public static final*/ WARNING /* = new WARNING() */;
        
        Type() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/products/models/ProductProperty$Divider;", "Lcom/woocommerce/android/ui/products/models/ProductProperty;", "()V", "WooCommerce_wasabiDebug"})
    public static final class Divider extends com.woocommerce.android.ui.products.models.ProductProperty {
        @org.jetbrains.annotations.NotNull
        public static final com.woocommerce.android.ui.products.models.ProductProperty.Divider INSTANCE = null;
        
        private Divider() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001J\b\u0010\u0016\u001a\u00020\u0007H\u0016J\t\u0010\u0017\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0018"}, d2 = {"Lcom/woocommerce/android/ui/products/models/ProductProperty$Property;", "Lcom/woocommerce/android/ui/products/models/ProductProperty;", "title", "", "value", "", "isDividerVisible", "", "(ILjava/lang/String;Z)V", "()Z", "getTitle", "()I", "getValue", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "isNotEmpty", "toString", "WooCommerce_wasabiDebug"})
    public static final class Property extends com.woocommerce.android.ui.products.models.ProductProperty {
        private final int title = 0;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String value = null;
        private final boolean isDividerVisible = false;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.models.ProductProperty.Property copy(@androidx.annotation.StringRes
        int title, @org.jetbrains.annotations.NotNull
        java.lang.String value, boolean isDividerVisible) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public Property(@androidx.annotation.StringRes
        int title, @org.jetbrains.annotations.NotNull
        java.lang.String value, boolean isDividerVisible) {
            super(null);
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getTitle() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getValue() {
            return null;
        }
        
        public final boolean component3() {
            return false;
        }
        
        public final boolean isDividerVisible() {
            return false;
        }
        
        @java.lang.Override
        public boolean isNotEmpty() {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u00c6\u0003JC\u0010\u001b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u00d6\u0003J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001J\b\u0010!\u001a\u00020\u001dH\u0016J\t\u0010\"\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006#"}, d2 = {"Lcom/woocommerce/android/ui/products/models/ProductProperty$RatingBar;", "Lcom/woocommerce/android/ui/products/models/ProductProperty;", "title", "", "value", "", "rating", "", "icon", "onClick", "Lkotlin/Function0;", "", "(ILjava/lang/String;FILkotlin/jvm/functions/Function0;)V", "getIcon", "()I", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "getRating", "()F", "getTitle", "getValue", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "isNotEmpty", "toString", "WooCommerce_wasabiDebug"})
    public static final class RatingBar extends com.woocommerce.android.ui.products.models.ProductProperty {
        private final int title = 0;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String value = null;
        private final float rating = 0.0F;
        private final int icon = 0;
        @org.jetbrains.annotations.Nullable
        private final kotlin.jvm.functions.Function0<kotlin.Unit> onClick = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.models.ProductProperty.RatingBar copy(@androidx.annotation.StringRes
        int title, @org.jetbrains.annotations.NotNull
        java.lang.String value, float rating, @androidx.annotation.DrawableRes
        int icon, @org.jetbrains.annotations.Nullable
        kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public RatingBar(@androidx.annotation.StringRes
        int title, @org.jetbrains.annotations.NotNull
        java.lang.String value, float rating, @androidx.annotation.DrawableRes
        int icon, @org.jetbrains.annotations.Nullable
        kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
            super(null);
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getTitle() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getValue() {
            return null;
        }
        
        public final float component3() {
            return 0.0F;
        }
        
        public final float getRating() {
            return 0.0F;
        }
        
        public final int component4() {
            return 0;
        }
        
        public final int getIcon() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable
        public final kotlin.jvm.functions.Function0<kotlin.Unit> component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnClick() {
            return null;
        }
        
        @java.lang.Override
        public boolean isNotEmpty() {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u00c6\u0003JV\u0010 \u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u00c6\u0001\u00a2\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010$H\u00d6\u0003J\t\u0010%\u001a\u00020\u0003H\u00d6\u0001J\b\u0010&\u001a\u00020\bH\u0016J\t\u0010\'\u001a\u00020\u0005H\u00d6\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0017\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006("}, d2 = {"Lcom/woocommerce/android/ui/products/models/ProductProperty$ComplexProperty;", "Lcom/woocommerce/android/ui/products/models/ProductProperty;", "title", "", "value", "", "icon", "showTitle", "", "maxLines", "onClick", "Lkotlin/Function0;", "", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;ZILkotlin/jvm/functions/Function0;)V", "getIcon", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMaxLines", "()I", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "getShowTitle", "()Z", "getTitle", "getValue", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;ZILkotlin/jvm/functions/Function0;)Lcom/woocommerce/android/ui/products/models/ProductProperty$ComplexProperty;", "equals", "other", "", "hashCode", "isNotEmpty", "toString", "WooCommerce_wasabiDebug"})
    public static final class ComplexProperty extends com.woocommerce.android.ui.products.models.ProductProperty {
        @org.jetbrains.annotations.Nullable
        private final java.lang.Integer title = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String value = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Integer icon = null;
        private final boolean showTitle = false;
        private final int maxLines = 0;
        @org.jetbrains.annotations.Nullable
        private final kotlin.jvm.functions.Function0<kotlin.Unit> onClick = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.models.ProductProperty.ComplexProperty copy(@org.jetbrains.annotations.Nullable
        @androidx.annotation.StringRes
        java.lang.Integer title, @org.jetbrains.annotations.NotNull
        java.lang.String value, @org.jetbrains.annotations.Nullable
        @androidx.annotation.DrawableRes
        java.lang.Integer icon, boolean showTitle, int maxLines, @org.jetbrains.annotations.Nullable
        kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public ComplexProperty(@org.jetbrains.annotations.Nullable
        @androidx.annotation.StringRes
        java.lang.Integer title, @org.jetbrains.annotations.NotNull
        java.lang.String value, @org.jetbrains.annotations.Nullable
        @androidx.annotation.DrawableRes
        java.lang.Integer icon, boolean showTitle, int maxLines, @org.jetbrains.annotations.Nullable
        kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
            super(null);
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getValue() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer getIcon() {
            return null;
        }
        
        public final boolean component4() {
            return false;
        }
        
        public final boolean getShowTitle() {
            return false;
        }
        
        public final int component5() {
            return 0;
        }
        
        public final int getMaxLines() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable
        public final kotlin.jvm.functions.Function0<kotlin.Unit> component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnClick() {
            return null;
        }
        
        @java.lang.Override
        public boolean isNotEmpty() {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lcom/woocommerce/android/ui/products/models/ProductProperty$Link;", "Lcom/woocommerce/android/ui/products/models/ProductProperty;", "title", "", "onClick", "Lkotlin/Function0;", "", "(ILkotlin/jvm/functions/Function0;)V", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "getTitle", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "WooCommerce_wasabiDebug"})
    public static final class Link extends com.woocommerce.android.ui.products.models.ProductProperty {
        private final int title = 0;
        @org.jetbrains.annotations.Nullable
        private final kotlin.jvm.functions.Function0<kotlin.Unit> onClick = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.models.ProductProperty.Link copy(@androidx.annotation.StringRes
        int title, @org.jetbrains.annotations.Nullable
        kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public Link(@androidx.annotation.StringRes
        int title, @org.jetbrains.annotations.Nullable
        kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
            super(null);
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getTitle() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable
        public final kotlin.jvm.functions.Function0<kotlin.Unit> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnClick() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010 \u001a\u00020\u0007H\u00c6\u0003J\t\u0010!\u001a\u00020\u0007H\u00c6\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010#\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\u0017\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u00c6\u0003Jf\u0010%\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u00c6\u0001\u00a2\u0006\u0002\u0010&J\u0013\u0010\'\u001a\u00020\u00072\b\u0010(\u001a\u0004\u0018\u00010)H\u00d6\u0003J\t\u0010*\u001a\u00020\u0003H\u00d6\u0001J\t\u0010+\u001a\u00020\u0005H\u00d6\u0001R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d\u00a8\u0006,"}, d2 = {"Lcom/woocommerce/android/ui/products/models/ProductProperty$Editable;", "Lcom/woocommerce/android/ui/products/models/ProductProperty;", "hint", "", "text", "", "shouldFocus", "", "isReadOnly", "badgeText", "badgeColor", "onTextChanged", "Lkotlin/Function1;", "", "(ILjava/lang/String;ZZLjava/lang/Integer;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)V", "getBadgeColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBadgeText", "getHint", "()I", "()Z", "setReadOnly", "(Z)V", "getOnTextChanged", "()Lkotlin/jvm/functions/Function1;", "getShouldFocus", "setShouldFocus", "getText", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(ILjava/lang/String;ZZLjava/lang/Integer;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)Lcom/woocommerce/android/ui/products/models/ProductProperty$Editable;", "equals", "other", "", "hashCode", "toString", "WooCommerce_wasabiDebug"})
    public static final class Editable extends com.woocommerce.android.ui.products.models.ProductProperty {
        private final int hint = 0;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String text = null;
        private boolean shouldFocus;
        private boolean isReadOnly;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Integer badgeText = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Integer badgeColor = null;
        @org.jetbrains.annotations.Nullable
        private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> onTextChanged = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.models.ProductProperty.Editable copy(@androidx.annotation.StringRes
        int hint, @org.jetbrains.annotations.NotNull
        java.lang.String text, boolean shouldFocus, boolean isReadOnly, @org.jetbrains.annotations.Nullable
        @androidx.annotation.StringRes
        java.lang.Integer badgeText, @org.jetbrains.annotations.Nullable
        @androidx.annotation.ColorRes
        java.lang.Integer badgeColor, @org.jetbrains.annotations.Nullable
        kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onTextChanged) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public Editable(@androidx.annotation.StringRes
        int hint, @org.jetbrains.annotations.NotNull
        java.lang.String text, boolean shouldFocus, boolean isReadOnly, @org.jetbrains.annotations.Nullable
        @androidx.annotation.StringRes
        java.lang.Integer badgeText, @org.jetbrains.annotations.Nullable
        @androidx.annotation.ColorRes
        java.lang.Integer badgeColor, @org.jetbrains.annotations.Nullable
        kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onTextChanged) {
            super(null);
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getHint() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getText() {
            return null;
        }
        
        public final boolean component3() {
            return false;
        }
        
        public final boolean getShouldFocus() {
            return false;
        }
        
        public final void setShouldFocus(boolean p0) {
        }
        
        public final boolean component4() {
            return false;
        }
        
        public final boolean isReadOnly() {
            return false;
        }
        
        public final void setReadOnly(boolean p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer getBadgeText() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer getBadgeColor() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOnTextChanged() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\u0017"}, d2 = {"Lcom/woocommerce/android/ui/products/models/ProductProperty$ReadMore;", "Lcom/woocommerce/android/ui/products/models/ProductProperty;", "caption", "", "content", "", "maxLines", "(ILjava/lang/String;I)V", "getCaption", "()I", "getContent", "()Ljava/lang/String;", "getMaxLines", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "WooCommerce_wasabiDebug"})
    public static final class ReadMore extends com.woocommerce.android.ui.products.models.ProductProperty {
        private final int caption = 0;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String content = null;
        private final int maxLines = 0;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.models.ProductProperty.ReadMore copy(@androidx.annotation.StringRes
        int caption, @org.jetbrains.annotations.NotNull
        java.lang.String content, int maxLines) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public ReadMore(@androidx.annotation.StringRes
        int caption, @org.jetbrains.annotations.NotNull
        java.lang.String content, int maxLines) {
            super(null);
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getCaption() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getContent() {
            return null;
        }
        
        public final int component3() {
            return 0;
        }
        
        public final int getMaxLines() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0003\u0010\f\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u00a2\u0006\u0002\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\u0015\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J\t\u0010 \u001a\u00020\tH\u00c6\u0003J\t\u0010!\u001a\u00020\tH\u00c6\u0003J\t\u0010\"\u001a\u00020\tH\u00c6\u0003J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u00c6\u0003Jt\u0010%\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0003\u0010\f\u001a\u00020\u00032\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u00c6\u0001\u00a2\u0006\u0002\u0010&J\u0013\u0010\'\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010)H\u00d6\u0003J\t\u0010*\u001a\u00020\u0003H\u00d6\u0001J\b\u0010+\u001a\u00020\tH\u0016J\t\u0010,\u001a\u00020\u0006H\u00d6\u0001R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0014R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001a\u00a8\u0006-"}, d2 = {"Lcom/woocommerce/android/ui/products/models/ProductProperty$PropertyGroup;", "Lcom/woocommerce/android/ui/products/models/ProductProperty;", "title", "", "properties", "", "", "icon", "showTitle", "", "isDividerVisible", "isHighlighted", "propertyFormat", "onClick", "Lkotlin/Function0;", "", "(ILjava/util/Map;Ljava/lang/Integer;ZZZILkotlin/jvm/functions/Function0;)V", "getIcon", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Z", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "getProperties", "()Ljava/util/Map;", "getPropertyFormat", "()I", "getShowTitle", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(ILjava/util/Map;Ljava/lang/Integer;ZZZILkotlin/jvm/functions/Function0;)Lcom/woocommerce/android/ui/products/models/ProductProperty$PropertyGroup;", "equals", "other", "", "hashCode", "isNotEmpty", "toString", "WooCommerce_wasabiDebug"})
    public static final class PropertyGroup extends com.woocommerce.android.ui.products.models.ProductProperty {
        private final int title = 0;
        @org.jetbrains.annotations.NotNull
        private final java.util.Map<java.lang.String, java.lang.String> properties = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Integer icon = null;
        private final boolean showTitle = false;
        private final boolean isDividerVisible = false;
        private final boolean isHighlighted = false;
        private final int propertyFormat = 0;
        @org.jetbrains.annotations.Nullable
        private final kotlin.jvm.functions.Function0<kotlin.Unit> onClick = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.models.ProductProperty.PropertyGroup copy(@androidx.annotation.StringRes
        int title, @org.jetbrains.annotations.NotNull
        java.util.Map<java.lang.String, java.lang.String> properties, @org.jetbrains.annotations.Nullable
        @androidx.annotation.DrawableRes
        java.lang.Integer icon, boolean showTitle, boolean isDividerVisible, boolean isHighlighted, @androidx.annotation.StringRes
        int propertyFormat, @org.jetbrains.annotations.Nullable
        kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public PropertyGroup(@androidx.annotation.StringRes
        int title, @org.jetbrains.annotations.NotNull
        java.util.Map<java.lang.String, java.lang.String> properties, @org.jetbrains.annotations.Nullable
        @androidx.annotation.DrawableRes
        java.lang.Integer icon, boolean showTitle, boolean isDividerVisible, boolean isHighlighted, @androidx.annotation.StringRes
        int propertyFormat, @org.jetbrains.annotations.Nullable
        kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
            super(null);
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getTitle() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.Map<java.lang.String, java.lang.String> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.Map<java.lang.String, java.lang.String> getProperties() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer getIcon() {
            return null;
        }
        
        public final boolean component4() {
            return false;
        }
        
        public final boolean getShowTitle() {
            return false;
        }
        
        public final boolean component5() {
            return false;
        }
        
        public final boolean isDividerVisible() {
            return false;
        }
        
        public final boolean component6() {
            return false;
        }
        
        public final boolean isHighlighted() {
            return false;
        }
        
        public final int component7() {
            return 0;
        }
        
        public final int getPropertyFormat() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable
        public final kotlin.jvm.functions.Function0<kotlin.Unit> component8() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnClick() {
            return null;
        }
        
        @java.lang.Override
        public boolean isNotEmpty() {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\fJ\u0017\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u00c6\u0003JF\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u00c6\u0001\u00a2\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000eR\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001f"}, d2 = {"Lcom/woocommerce/android/ui/products/models/ProductProperty$Switch;", "Lcom/woocommerce/android/ui/products/models/ProductProperty;", "title", "", "isOn", "", "icon", "onStateChanged", "Lkotlin/Function1;", "", "(IZLjava/lang/Integer;Lkotlin/jvm/functions/Function1;)V", "getIcon", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Z", "getOnStateChanged", "()Lkotlin/jvm/functions/Function1;", "getTitle", "()I", "component1", "component2", "component3", "component4", "copy", "(IZLjava/lang/Integer;Lkotlin/jvm/functions/Function1;)Lcom/woocommerce/android/ui/products/models/ProductProperty$Switch;", "equals", "other", "", "hashCode", "toString", "", "WooCommerce_wasabiDebug"})
    public static final class Switch extends com.woocommerce.android.ui.products.models.ProductProperty {
        private final int title = 0;
        private final boolean isOn = false;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Integer icon = null;
        @org.jetbrains.annotations.Nullable
        private final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> onStateChanged = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.models.ProductProperty.Switch copy(@androidx.annotation.StringRes
        int title, boolean isOn, @org.jetbrains.annotations.Nullable
        @androidx.annotation.DrawableRes
        java.lang.Integer icon, @org.jetbrains.annotations.Nullable
        kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onStateChanged) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public Switch(@androidx.annotation.StringRes
        int title, boolean isOn, @org.jetbrains.annotations.Nullable
        @androidx.annotation.DrawableRes
        java.lang.Integer icon, @org.jetbrains.annotations.Nullable
        kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onStateChanged) {
            super(null);
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getTitle() {
            return 0;
        }
        
        public final boolean component2() {
            return false;
        }
        
        public final boolean isOn() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer getIcon() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> getOnStateChanged() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/woocommerce/android/ui/products/models/ProductProperty$Warning;", "Lcom/woocommerce/android/ui/products/models/ProductProperty;", "content", "", "(Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_wasabiDebug"})
    public static final class Warning extends com.woocommerce.android.ui.products.models.ProductProperty {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String content = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.models.ProductProperty.Warning copy(@org.jetbrains.annotations.NotNull
        java.lang.String content) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public Warning() {
            super(null);
        }
        
        public Warning(@org.jetbrains.annotations.NotNull
        java.lang.String content) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getContent() {
            return null;
        }
    }
}