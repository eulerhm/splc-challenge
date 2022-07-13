package com.woocommerce.android.widgets.sectionedrecyclerview;

import java.lang.System;

/**
 * Class used as constructor parameters of [Section].
 *
 * Original version: https://github.com/luizgrp/SectionedRecyclerViewAdapter
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0015B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\r\u0010\bR\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u000f\u0010\bR\u0016\u0010\u0010\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0014\u0010\b\u00a8\u0006\u0016"}, d2 = {"Lcom/woocommerce/android/widgets/sectionedrecyclerview/SectionParameters;", "", "builder", "Lcom/woocommerce/android/widgets/sectionedrecyclerview/SectionParameters$Builder;", "(Lcom/woocommerce/android/widgets/sectionedrecyclerview/SectionParameters$Builder;)V", "emptyResourceId", "", "getEmptyResourceId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "failedResourceId", "getFailedResourceId", "footerResourceId", "getFooterResourceId", "headerResourceId", "getHeaderResourceId", "itemResourceId", "getItemResourceId", "()I", "loadingResourceId", "getLoadingResourceId", "Builder", "WooCommerce_wasabiDebug"})
public final class SectionParameters {
    @org.jetbrains.annotations.Nullable
    @androidx.annotation.LayoutRes
    private final java.lang.Integer headerResourceId = null;
    @org.jetbrains.annotations.Nullable
    @androidx.annotation.LayoutRes
    private final java.lang.Integer footerResourceId = null;
    @androidx.annotation.LayoutRes
    private final int itemResourceId = 0;
    @org.jetbrains.annotations.Nullable
    @androidx.annotation.LayoutRes
    private final java.lang.Integer loadingResourceId = null;
    @org.jetbrains.annotations.Nullable
    @androidx.annotation.LayoutRes
    private final java.lang.Integer failedResourceId = null;
    @org.jetbrains.annotations.Nullable
    @androidx.annotation.LayoutRes
    private final java.lang.Integer emptyResourceId = null;
    
    private SectionParameters(com.woocommerce.android.widgets.sectionedrecyclerview.SectionParameters.Builder builder) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getHeaderResourceId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getFooterResourceId() {
        return null;
    }
    
    public final int getItemResourceId() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getLoadingResourceId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getFailedResourceId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getEmptyResourceId() {
        return null;
    }
    
    /**
     * Builder of [SectionParameters]
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0010\u0010\u0005\u001a\u00020\u00002\b\b\u0001\u0010\u0005\u001a\u00020\u0003J\u0010\u0010\u000b\u001a\u00020\u00002\b\b\u0001\u0010\u000b\u001a\u00020\u0003J\u0010\u0010\u000e\u001a\u00020\u00002\b\b\u0001\u0010\u000e\u001a\u00020\u0003J\u0010\u0010\u0011\u001a\u00020\u00002\b\b\u0001\u0010\u0011\u001a\u00020\u0003J\u0010\u0010\u0014\u001a\u00020\u00002\b\b\u0001\u0010\u0014\u001a\u00020\u0003R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR\"\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u000f\u0010\u0007\"\u0004\b\u0010\u0010\tR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\tR\"\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0015\u0010\u0007\"\u0004\b\u0016\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006\u001b"}, d2 = {"Lcom/woocommerce/android/widgets/sectionedrecyclerview/SectionParameters$Builder;", "", "mItemResourceId", "", "(I)V", "emptyResourceId", "getEmptyResourceId", "()Ljava/lang/Integer;", "setEmptyResourceId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "failedResourceId", "getFailedResourceId", "setFailedResourceId", "footerResourceId", "getFooterResourceId", "setFooterResourceId", "headerResourceId", "getHeaderResourceId", "setHeaderResourceId", "loadingResourceId", "getLoadingResourceId", "setLoadingResourceId", "getMItemResourceId", "()I", "build", "Lcom/woocommerce/android/widgets/sectionedrecyclerview/SectionParameters;", "WooCommerce_wasabiDebug"})
    public static final class Builder {
        private final int mItemResourceId = 0;
        @org.jetbrains.annotations.Nullable
        @androidx.annotation.LayoutRes
        private java.lang.Integer headerResourceId;
        @org.jetbrains.annotations.Nullable
        @androidx.annotation.LayoutRes
        private java.lang.Integer footerResourceId;
        @org.jetbrains.annotations.Nullable
        @androidx.annotation.LayoutRes
        private java.lang.Integer loadingResourceId;
        @org.jetbrains.annotations.Nullable
        @androidx.annotation.LayoutRes
        private java.lang.Integer failedResourceId;
        @org.jetbrains.annotations.Nullable
        @androidx.annotation.LayoutRes
        private java.lang.Integer emptyResourceId;
        
        public Builder(@androidx.annotation.LayoutRes
        int mItemResourceId) {
            super();
        }
        
        public final int getMItemResourceId() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer getHeaderResourceId() {
            return null;
        }
        
        public final void setHeaderResourceId(@org.jetbrains.annotations.Nullable
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer getFooterResourceId() {
            return null;
        }
        
        public final void setFooterResourceId(@org.jetbrains.annotations.Nullable
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer getLoadingResourceId() {
            return null;
        }
        
        public final void setLoadingResourceId(@org.jetbrains.annotations.Nullable
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer getFailedResourceId() {
            return null;
        }
        
        public final void setFailedResourceId(@org.jetbrains.annotations.Nullable
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer getEmptyResourceId() {
            return null;
        }
        
        public final void setEmptyResourceId(@org.jetbrains.annotations.Nullable
        java.lang.Integer p0) {
        }
        
        /**
         * Set layout resource for Section's header
         * @param headerResourceId layout resource for Section's header
         * @return this builder
         */
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.widgets.sectionedrecyclerview.SectionParameters.Builder headerResourceId(@androidx.annotation.LayoutRes
        int headerResourceId) {
            return null;
        }
        
        /**
         * Set layout resource for Section's footer
         * @param footerResourceId layout resource for Section's footer
         * @return this builder
         */
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.widgets.sectionedrecyclerview.SectionParameters.Builder footerResourceId(@androidx.annotation.LayoutRes
        int footerResourceId) {
            return null;
        }
        
        /**
         * Set layout resource for Section's loading state
         * @param loadingResourceId layout resource for Section's loading state
         * @return this builder
         */
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.widgets.sectionedrecyclerview.SectionParameters.Builder loadingResourceId(@androidx.annotation.LayoutRes
        int loadingResourceId) {
            return null;
        }
        
        /**
         * Set layout resource for Section's failed state
         * @param failedResourceId layout resource for Section's failed state
         * @return this builder
         */
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.widgets.sectionedrecyclerview.SectionParameters.Builder failedResourceId(@androidx.annotation.LayoutRes
        int failedResourceId) {
            return null;
        }
        
        /**
         * Set layout resource for Section's empty state
         * @param emptyResourceId layout resource for Section's empty state
         * @return this builder
         */
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.widgets.sectionedrecyclerview.SectionParameters.Builder emptyResourceId(@androidx.annotation.LayoutRes
        int emptyResourceId) {
            return null;
        }
        
        /**
         * Build an instance of SectionParameters
         * @return an instance of SectionParameters
         */
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.widgets.sectionedrecyclerview.SectionParameters build() {
            return null;
        }
    }
}