package com.woocommerce.android.widgets.sectionedrecyclerview;

import java.lang.System;

/**
 * Abstract Section to be used with [SectionedRecyclerViewAdapter].
 *
 * Original version: https://github.com/luizgrp/SectionedRecyclerViewAdapter
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\f\b&\u0018\u00002\u00020\u0001:\u0001>B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010(\u001a\u00020\u0006H&J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0016J\u0010\u0010-\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0016J\u0010\u0010.\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0016J\u0010\u0010/\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0016J\u0010\u00100\u001a\u00020*2\u0006\u0010+\u001a\u00020,H&J\u0010\u00101\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0016J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0014\u001a\u00020\u000fJ\u0016\u00102\u001a\u0002032\u0006\u00104\u001a\u00020*2\u0006\u00105\u001a\u00020\u0006J\u0010\u00106\u001a\u0002032\u0006\u00104\u001a\u00020*H\u0016J\u0010\u00107\u001a\u0002032\u0006\u00104\u001a\u00020*H\u0016J\u0010\u00108\u001a\u0002032\u0006\u00104\u001a\u00020*H\u0016J\u0010\u00109\u001a\u0002032\u0006\u00104\u001a\u00020*H\u0016J\u0018\u0010:\u001a\u0002032\u0006\u00104\u001a\u00020*2\u0006\u00105\u001a\u00020\u0006H&J\u0010\u0010;\u001a\u0002032\u0006\u00104\u001a\u00020*H\u0016J\u000e\u0010<\u001a\u0002032\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010=\u001a\u0002032\u0006\u0010\u0014\u001a\u00020\u000fR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\r\u0010\bR\u001a\u0010\u000e\u001a\u00020\u000fX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000fX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0018\u0010\bR\u001a\u0010\u0019\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0011\"\u0004\b\u001a\u0010\u0013R\u0016\u0010\u001b\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u001f\u0010\bR\u0011\u0010 \u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b!\u0010\u001dR$\u0010\"\u001a\u00020#2\u0006\u0010\"\u001a\u00020#@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'\u00a8\u0006?"}, d2 = {"Lcom/woocommerce/android/widgets/sectionedrecyclerview/Section;", "", "sectionParameters", "Lcom/woocommerce/android/widgets/sectionedrecyclerview/SectionParameters;", "(Lcom/woocommerce/android/widgets/sectionedrecyclerview/SectionParameters;)V", "emptyResourceId", "", "getEmptyResourceId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "failedResourceId", "getFailedResourceId", "footerResourceId", "getFooterResourceId", "hasFooter", "", "getHasFooter$WooCommerce_wasabiDebug", "()Z", "setHasFooter$WooCommerce_wasabiDebug", "(Z)V", "hasHeader", "getHasHeader$WooCommerce_wasabiDebug", "setHasHeader$WooCommerce_wasabiDebug", "headerResourceId", "getHeaderResourceId", "isVisible", "setVisible", "itemResourceId", "getItemResourceId", "()I", "loadingResourceId", "getLoadingResourceId", "sectionItemsTotal", "getSectionItemsTotal", "state", "Lcom/woocommerce/android/widgets/sectionedrecyclerview/Section$State;", "getState", "()Lcom/woocommerce/android/widgets/sectionedrecyclerview/Section$State;", "setState", "(Lcom/woocommerce/android/widgets/sectionedrecyclerview/Section$State;)V", "getContentItemsTotal", "getEmptyViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "getFailedViewHolder", "getFooterViewHolder", "getHeaderViewHolder", "getItemViewHolder", "getLoadingViewHolder", "onBindContentViewHolder", "", "holder", "position", "onBindEmptyViewHolder", "onBindFailedViewHolder", "onBindFooterViewHolder", "onBindHeaderViewHolder", "onBindItemViewHolder", "onBindLoadingViewHolder", "setHasFooter", "setHasHeader", "State", "WooCommerce_wasabiDebug"})
public abstract class Section {
    @org.jetbrains.annotations.NotNull
    private com.woocommerce.android.widgets.sectionedrecyclerview.Section.State state = com.woocommerce.android.widgets.sectionedrecyclerview.Section.State.LOADED;
    private boolean isVisible = true;
    private boolean hasHeader = false;
    private boolean hasFooter = false;
    
    /**
     * Return the layout resource id of the header
     * @return layout resource id of the header
     */
    @org.jetbrains.annotations.Nullable
    @androidx.annotation.LayoutRes
    private final java.lang.Integer headerResourceId = null;
    
    /**
     * Return the layout resource id of the footer
     * @return layout resource id of the footer
     */
    @org.jetbrains.annotations.Nullable
    @androidx.annotation.LayoutRes
    private final java.lang.Integer footerResourceId = null;
    
    /**
     * Return the layout resource id of the item
     * @return layout resource id of the item
     */
    @androidx.annotation.LayoutRes
    private final int itemResourceId = 0;
    
    /**
     * Return the layout resource id of the loading view
     * @return layout resource id of the loading view
     */
    @org.jetbrains.annotations.Nullable
    @androidx.annotation.LayoutRes
    private final java.lang.Integer loadingResourceId = null;
    
    /**
     * Return the layout resource id of the failed view
     * @return layout resource id of the failed view
     */
    @org.jetbrains.annotations.Nullable
    @androidx.annotation.LayoutRes
    private final java.lang.Integer failedResourceId = null;
    
    /**
     * Return the layout resource id of the empty view
     * @return layout resource id of the empty view
     */
    @org.jetbrains.annotations.Nullable
    @androidx.annotation.LayoutRes
    private final java.lang.Integer emptyResourceId = null;
    
    public Section(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.widgets.sectionedrecyclerview.SectionParameters sectionParameters) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.widgets.sectionedrecyclerview.Section.State getState() {
        return null;
    }
    
    public final void setState(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.widgets.sectionedrecyclerview.Section.State state) {
    }
    
    public final boolean isVisible() {
        return false;
    }
    
    public final void setVisible(boolean p0) {
    }
    
    public final boolean getHasHeader$WooCommerce_wasabiDebug() {
        return false;
    }
    
    public final void setHasHeader$WooCommerce_wasabiDebug(boolean p0) {
    }
    
    public final boolean getHasFooter$WooCommerce_wasabiDebug() {
        return false;
    }
    
    public final void setHasFooter$WooCommerce_wasabiDebug(boolean p0) {
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
    
    public final int getSectionItemsTotal() {
        return 0;
    }
    
    /**
     * Return the total of items of this Section
     * @return total of items of this Section
     */
    public abstract int getContentItemsTotal();
    
    /**
     * Check if this Section has a header
     * @return true if this Section has a header
     */
    public final boolean hasHeader() {
        return false;
    }
    
    /**
     * Set if this Section has header
     * @param hasHeader true if this Section has a header
     */
    public final void setHasHeader(boolean hasHeader) {
    }
    
    /**
     * Check if this Section has a footer
     * @return true if this Section has a footer
     */
    public final boolean hasFooter() {
        return false;
    }
    
    /**
     * Set if this Section has footer
     * @param hasFooter true if this Section has a footer
     */
    public final void setHasFooter(boolean hasFooter) {
    }
    
    /**
     * Bind the data to the ViewHolder for the Content of this Section, that can be the Items,
     * Loading view or Failed view, depending on the current mState of the section
     * @param holder ViewHolder for the Content of this Section
     * @param position position of the item in the Section, not in the RecyclerView
     */
    public final void onBindContentViewHolder(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    /**
     * Return the ViewHolder for the Header of this Section
     * @param view View inflated by resource returned by getHeaderResourceId
     * @return ViewHolder for the Header of this Section
     */
    @org.jetbrains.annotations.NotNull
    public androidx.recyclerview.widget.RecyclerView.ViewHolder getHeaderViewHolder(@org.jetbrains.annotations.NotNull
    android.view.View view) {
        return null;
    }
    
    /**
     * Bind the data to the ViewHolder for the Header of this Section
     * @param holder ViewHolder for the Header of this Section
     */
    public void onBindHeaderViewHolder(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder) {
    }
    
    /**
     * Return the ViewHolder for the Footer of this Section
     * @param view View inflated by resource returned by getFooterResourceId
     * @return ViewHolder for the Footer of this Section
     */
    @org.jetbrains.annotations.NotNull
    public androidx.recyclerview.widget.RecyclerView.ViewHolder getFooterViewHolder(@org.jetbrains.annotations.NotNull
    android.view.View view) {
        return null;
    }
    
    /**
     * Bind the data to the ViewHolder for the Footer of this Section
     * @param holder ViewHolder for the Footer of this Section
     */
    public void onBindFooterViewHolder(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder) {
    }
    
    /**
     * Return the ViewHolder for a single Item of this Section
     * @param view View inflated by resource returned by getItemResourceId
     * @return ViewHolder for the Item of this Section
     */
    @org.jetbrains.annotations.NotNull
    public abstract androidx.recyclerview.widget.RecyclerView.ViewHolder getItemViewHolder(@org.jetbrains.annotations.NotNull
    android.view.View view);
    
    /**
     * Bind the data to the ViewHolder for an Item of this Section
     * @param holder ViewHolder for the Item of this Section
     * @param position position of the item in the Section, not in the RecyclerView
     */
    public abstract void onBindItemViewHolder(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position);
    
    /**
     * Return the ViewHolder for the Loading mState of this Section
     * @param view View inflated by resource returned by getItemResourceId
     * @return ViewHolder for the Loading mState of this Section
     */
    @org.jetbrains.annotations.NotNull
    public androidx.recyclerview.widget.RecyclerView.ViewHolder getLoadingViewHolder(@org.jetbrains.annotations.NotNull
    android.view.View view) {
        return null;
    }
    
    /**
     * Bind the data to the ViewHolder for Loading mState of this Section
     * @param holder ViewHolder for the Loading mState of this Section
     */
    public void onBindLoadingViewHolder(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder) {
    }
    
    /**
     * Return the ViewHolder for the Failed mState of this Section
     * @param view View inflated by resource returned by getItemResourceId
     * @return ViewHolder for the Failed of this Section
     */
    @org.jetbrains.annotations.NotNull
    public androidx.recyclerview.widget.RecyclerView.ViewHolder getFailedViewHolder(@org.jetbrains.annotations.NotNull
    android.view.View view) {
        return null;
    }
    
    /**
     * Bind the data to the ViewHolder for the Failed mState of this Section
     * @param holder ViewHolder for the Failed mState of this Section
     */
    public void onBindFailedViewHolder(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder) {
    }
    
    /**
     * Return the ViewHolder for the Empty mState of this Section
     * @param view View inflated by resource returned by getItemResourceId
     * @return ViewHolder for the Empty of this Section
     */
    @org.jetbrains.annotations.NotNull
    public androidx.recyclerview.widget.RecyclerView.ViewHolder getEmptyViewHolder(@org.jetbrains.annotations.NotNull
    android.view.View view) {
        return null;
    }
    
    /**
     * Bind the data to the ViewHolder for the Empty mState of this Section
     * @param holder ViewHolder for the Empty mState of this Section
     */
    public void onBindEmptyViewHolder(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/widgets/sectionedrecyclerview/Section$State;", "", "(Ljava/lang/String;I)V", "LOADING", "LOADED", "FAILED", "EMPTY", "WooCommerce_wasabiDebug"})
    public static enum State {
        /*public static final*/ LOADING /* = new LOADING() */,
        /*public static final*/ LOADED /* = new LOADED() */,
        /*public static final*/ FAILED /* = new FAILED() */,
        /*public static final*/ EMPTY /* = new EMPTY() */;
        
        State() {
        }
    }
}