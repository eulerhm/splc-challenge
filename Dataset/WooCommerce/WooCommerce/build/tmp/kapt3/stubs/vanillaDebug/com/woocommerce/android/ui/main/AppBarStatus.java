package com.woocommerce.android.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/ui/main/AppBarStatus;", "", "()V", "Hidden", "Visible", "Lcom/woocommerce/android/ui/main/AppBarStatus$Hidden;", "Lcom/woocommerce/android/ui/main/AppBarStatus$Visible;", "WooCommerce_vanillaDebug"})
public abstract class AppBarStatus {
    
    private AppBarStatus() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/main/AppBarStatus$Hidden;", "Lcom/woocommerce/android/ui/main/AppBarStatus;", "()V", "WooCommerce_vanillaDebug"})
    public static final class Hidden extends com.woocommerce.android.ui.main.AppBarStatus {
        @org.jetbrains.annotations.NotNull()
        public static final com.woocommerce.android.ui.main.AppBarStatus.Hidden INSTANCE = null;
        
        private Hidden() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\fJ\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J.\u0010\u0011\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0019"}, d2 = {"Lcom/woocommerce/android/ui/main/AppBarStatus$Visible;", "Lcom/woocommerce/android/ui/main/AppBarStatus;", "navigationIcon", "", "hasShadow", "", "hasDivider", "(Ljava/lang/Integer;ZZ)V", "getHasDivider", "()Z", "getHasShadow", "getNavigationIcon", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;ZZ)Lcom/woocommerce/android/ui/main/AppBarStatus$Visible;", "equals", "other", "", "hashCode", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class Visible extends com.woocommerce.android.ui.main.AppBarStatus {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer navigationIcon = null;
        private final boolean hasShadow = false;
        private final boolean hasDivider = false;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.main.AppBarStatus.Visible copy(@org.jetbrains.annotations.Nullable()
        @androidx.annotation.DrawableRes()
        java.lang.Integer navigationIcon, boolean hasShadow, boolean hasDivider) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Visible() {
            super();
        }
        
        public Visible(@org.jetbrains.annotations.Nullable()
        @androidx.annotation.DrawableRes()
        java.lang.Integer navigationIcon, boolean hasShadow, boolean hasDivider) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getNavigationIcon() {
            return null;
        }
        
        public final boolean component2() {
            return false;
        }
        
        public final boolean getHasShadow() {
            return false;
        }
        
        public final boolean component3() {
            return false;
        }
        
        public final boolean getHasDivider() {
            return false;
        }
    }
}