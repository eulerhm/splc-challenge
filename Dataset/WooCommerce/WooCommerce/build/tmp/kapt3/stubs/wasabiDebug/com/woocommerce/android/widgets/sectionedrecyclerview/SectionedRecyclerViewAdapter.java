package com.woocommerce.android.widgets.sectionedrecyclerview;

import java.lang.System;

/**
 * A custom RecyclerView Adapter that allows [Sections][Section] to be added to it.
 * Sections are displayed in the same order they were added.
 *
 * Original version: https://github.com/luizgrp/SectionedRecyclerViewAdapter
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0016\u0018\u0000 W2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002WXB\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\nJ\u0016\u0010\u000e\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\nJ\u0015\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0007H\u0001\u00a2\u0006\u0002\b\u0014J\u0015\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0007H\u0001\u00a2\u0006\u0002\b\u0016J\u001d\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007H\u0001\u00a2\u0006\u0002\b\u001aJ\u001d\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0007H\u0001\u00a2\u0006\u0002\b\u001eJ%\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020 H\u0001\u00a2\u0006\u0002\b\u001eJ\u001d\u0010!\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0007H\u0001\u00a2\u0006\u0002\b\"J\u001d\u0010#\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0007H\u0001\u00a2\u0006\u0002\b$J\u0015\u0010%\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0007H\u0001\u00a2\u0006\u0002\b&J\u0018\u0010\'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020)2\u0006\u0010\u000f\u001a\u00020\nH\u0002J\u0018\u0010*\u001a\u00020\u00022\u0006\u0010(\u001a\u00020)2\u0006\u0010\u000f\u001a\u00020\nH\u0002J\u000e\u0010+\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\nJ\u000e\u0010+\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0006J\u0018\u0010,\u001a\u00020\u00022\u0006\u0010(\u001a\u00020)2\u0006\u0010\u000f\u001a\u00020\nH\u0002J\u000e\u0010-\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\nJ\u000e\u0010-\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0006J\u0018\u0010.\u001a\u00020\u00022\u0006\u0010(\u001a\u00020)2\u0006\u0010\u000f\u001a\u00020\nH\u0002J\b\u0010/\u001a\u00020\u0007H\u0016J\u0018\u00100\u001a\u00020\u00022\u0006\u0010(\u001a\u00020)2\u0006\u0010\u000f\u001a\u00020\nH\u0002J\u0010\u00101\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0016J\u0018\u00102\u001a\u00020\u00022\u0006\u0010(\u001a\u00020)2\u0006\u0010\u000f\u001a\u00020\nH\u0002J\u0016\u00103\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0007J\u0016\u00103\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0007J\u000e\u00104\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007J\u0010\u00105\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0011\u001a\u00020\u0006J\u000e\u00106\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0007J\u000e\u00107\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007J\u000e\u00108\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\nJ\u000e\u00108\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0006J\u0006\u00109\u001a\u00020\u0007J\u0010\u0010:\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0006H\u0002J\u000e\u0010;\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\nJ\u000e\u0010;\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006J\u000e\u0010<\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\nJ\u000e\u0010<\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006J\u000e\u0010=\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\nJ\u000e\u0010=\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006J\u000e\u0010>\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\nJ\u000e\u0010>\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006J\u000e\u0010?\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\nJ\u000e\u0010?\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006J\u000e\u0010@\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\nJ\u000e\u0010@\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006J\u0016\u0010A\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0007J\u0016\u0010A\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0007J\u0016\u0010B\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0007J\u0016\u0010B\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0007J\u001e\u0010C\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007J\u001e\u0010C\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007J\u001e\u0010D\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0007J&\u0010D\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020 J\u001e\u0010D\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0007J&\u0010D\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020 J\u001e\u0010E\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0007J\u001e\u0010E\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0007J\u001e\u0010F\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0007J\u001e\u0010F\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0007J\u0016\u0010G\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0007J\u0016\u0010G\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0007J\u0016\u0010H\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010I\u001a\u00020JJ\u0016\u0010H\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010I\u001a\u00020JJ\u0016\u0010K\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010L\u001a\u00020\u0007J\u0016\u0010K\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010L\u001a\u00020\u0007J\u000e\u0010M\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\nJ\u000e\u0010M\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006J\u0016\u0010N\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010O\u001a\u00020\u0007J\u0016\u0010N\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010O\u001a\u00020\u0007J\u0016\u0010P\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010I\u001a\u00020JJ\u0016\u0010P\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010I\u001a\u00020JJ\u0018\u0010Q\u001a\u00020\u00102\u0006\u0010R\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0007H\u0016J\u0018\u0010S\u001a\u00020\u00022\u0006\u0010(\u001a\u00020)2\u0006\u0010T\u001a\u00020\u0007H\u0016J\u0006\u0010U\u001a\u00020\u0010J\u000e\u0010V\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006Y"}, d2 = {"Lcom/woocommerce/android/widgets/sectionedrecyclerview/SectionedRecyclerViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "()V", "sectionViewTypeNumbers", "Ljava/util/HashMap;", "", "", "sectionsMap", "Ljava/util/LinkedHashMap;", "Lcom/woocommerce/android/widgets/sectionedrecyclerview/Section;", "getSectionsMap", "()Ljava/util/LinkedHashMap;", "viewTypeCount", "addSection", "section", "", "tag", "callSuperNotifyItemChanged", "position", "callSuperNotifyItemChanged$WooCommerce_wasabiDebug", "callSuperNotifyItemInserted", "callSuperNotifyItemInserted$WooCommerce_wasabiDebug", "callSuperNotifyItemMoved", "fromPosition", "toPosition", "callSuperNotifyItemMoved$WooCommerce_wasabiDebug", "callSuperNotifyItemRangeChanged", "positionStart", "itemCount", "callSuperNotifyItemRangeChanged$WooCommerce_wasabiDebug", "payload", "", "callSuperNotifyItemRangeInserted", "callSuperNotifyItemRangeInserted$WooCommerce_wasabiDebug", "callSuperNotifyItemRangeRemoved", "callSuperNotifyItemRangeRemoved$WooCommerce_wasabiDebug", "callSuperNotifyItemRemoved", "callSuperNotifyItemRemoved$WooCommerce_wasabiDebug", "getEmptyViewHolder", "parent", "Landroid/view/ViewGroup;", "getFailedViewHolder", "getFooterPositionInAdapter", "getFooterViewHolder", "getHeaderPositionInAdapter", "getHeaderViewHolder", "getItemCount", "getItemViewHolder", "getItemViewType", "getLoadingViewHolder", "getPositionInAdapter", "getPositionInSection", "getSection", "getSectionForPosition", "getSectionItemViewType", "getSectionPosition", "getSectionTotal", "getValidSectionOrThrowException", "notifyFooterChangedInSection", "notifyFooterInsertedInSection", "notifyFooterRemovedFromSection", "notifyHeaderChangedInSection", "notifyHeaderInsertedInSection", "notifyHeaderRemovedFromSection", "notifyItemChangedInSection", "notifyItemInsertedInSection", "notifyItemMovedInSection", "notifyItemRangeChangedInSection", "notifyItemRangeInsertedInSection", "notifyItemRangeRemovedFromSection", "notifyItemRemovedFromSection", "notifyNotLoadedStateChanged", "previousState", "Lcom/woocommerce/android/widgets/sectionedrecyclerview/Section$State;", "notifySectionChangedToInvisible", "previousSectionPosition", "notifySectionChangedToVisible", "notifyStateChangedFromLoaded", "previousContentItemsCount", "notifyStateChangedToLoaded", "onBindViewHolder", "holder", "onCreateViewHolder", "viewType", "removeAllSections", "removeSection", "Companion", "EmptyViewHolder", "WooCommerce_wasabiDebug"})
public class SectionedRecyclerViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    
    /**
     * Return a map with all mSections of this adapter.
     *
     * @return a map with all mSections
     */
    @org.jetbrains.annotations.NotNull
    private final java.util.LinkedHashMap<java.lang.String, com.woocommerce.android.widgets.sectionedrecyclerview.Section> sectionsMap = null;
    private final java.util.HashMap<java.lang.String, java.lang.Integer> sectionViewTypeNumbers = null;
    private int viewTypeCount = 0;
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.widgets.sectionedrecyclerview.SectionedRecyclerViewAdapter.Companion Companion = null;
    private static final int VIEW_TYPE_HEADER = 0;
    private static final int VIEW_TYPE_FOOTER = 1;
    private static final int VIEW_TYPE_ITEM_LOADED = 2;
    private static final int VIEW_TYPE_LOADING = 3;
    private static final int VIEW_TYPE_FAILED = 4;
    private static final int VIEW_TYPE_EMPTY = 5;
    private static final int VIEW_TYPE_QTY = 6;
    public static final int INVALID_POSITION = -1;
    
    public SectionedRecyclerViewAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.LinkedHashMap<java.lang.String, com.woocommerce.android.widgets.sectionedrecyclerview.Section> getSectionsMap() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    private final androidx.recyclerview.widget.RecyclerView.ViewHolder getItemViewHolder(android.view.ViewGroup parent, com.woocommerce.android.widgets.sectionedrecyclerview.Section section) {
        return null;
    }
    
    private final androidx.recyclerview.widget.RecyclerView.ViewHolder getHeaderViewHolder(android.view.ViewGroup parent, com.woocommerce.android.widgets.sectionedrecyclerview.Section section) {
        return null;
    }
    
    private final androidx.recyclerview.widget.RecyclerView.ViewHolder getFooterViewHolder(android.view.ViewGroup parent, com.woocommerce.android.widgets.sectionedrecyclerview.Section section) {
        return null;
    }
    
    private final androidx.recyclerview.widget.RecyclerView.ViewHolder getLoadingViewHolder(android.view.ViewGroup parent, com.woocommerce.android.widgets.sectionedrecyclerview.Section section) {
        return null;
    }
    
    private final androidx.recyclerview.widget.RecyclerView.ViewHolder getFailedViewHolder(android.view.ViewGroup parent, com.woocommerce.android.widgets.sectionedrecyclerview.Section section) {
        return null;
    }
    
    private final androidx.recyclerview.widget.RecyclerView.ViewHolder getEmptyViewHolder(android.view.ViewGroup parent, com.woocommerce.android.widgets.sectionedrecyclerview.Section section) {
        return null;
    }
    
    /**
     * Return the total number of sections
     * from the list
     */
    public final int getSectionTotal() {
        return 0;
    }
    
    /**
     * Add a section to this recyclerview.
     *
     * @param tag unique identifier of the section
     * @param section section to be added
     */
    public final void addSection(@org.jetbrains.annotations.NotNull
    java.lang.String tag, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.widgets.sectionedrecyclerview.Section section) {
    }
    
    /**
     * Add a section to this recyclerview with a random tag;
     *
     * @param section section to be added
     * @return generated tag
     */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String addSection(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.widgets.sectionedrecyclerview.Section section) {
        return null;
    }
    
    /**
     * Return the section with the tag provided.
     *
     * @param tag unique identifier of the section
     * @return section
     */
    @org.jetbrains.annotations.Nullable
    public final com.woocommerce.android.widgets.sectionedrecyclerview.Section getSection(@org.jetbrains.annotations.NotNull
    java.lang.String tag) {
        return null;
    }
    
    /**
     * Remove section from this recyclerview.
     *
     * @param tag unique identifier of the section
     */
    public final void removeSection(@org.jetbrains.annotations.NotNull
    java.lang.String tag) {
    }
    
    /**
     * Remove all mSections from this recyclerview.
     */
    public final void removeAllSections() {
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public int getItemViewType(int position) {
        return 0;
    }
    
    /**
     * Returns the Section ViewType of an item based on the position in the adapter:
     *
     * - SectionedRecyclerViewAdapter.VIEW_TYPE_HEADER
     * - SectionedRecyclerViewAdapter.VIEW_TYPE_FOOTER
     * - SectionedRecyclerViewAdapter.VIEW_TYPE_ITEM_LOADED
     * - SectionedRecyclerViewAdapter.VIEW_TYPE_LOADING
     * - SectionedRecyclerViewAdapter.VIEW_TYPE_FAILED
     * - SectionedRecyclerViewAdapter.VIEW_TYPE_EMPTY
     *
     * @param position position in the adapter
     * @return SectionedRecyclerViewAdapter.VIEW_TYPE_HEADER, VIEW_TYPE_FOOTER,
     * VIEW_TYPE_ITEM_LOADED, VIEW_TYPE_LOADING, VIEW_TYPE_FAILED or VIEW_TYPE_EMPTY
     */
    public final int getSectionItemViewType(int position) {
        return 0;
    }
    
    /**
     * Returns the Section object for a position in the adapter.
     *
     * @param position position in the adapter
     * @return Section object for that position
     */
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.widgets.sectionedrecyclerview.Section getSectionForPosition(int position) {
        return null;
    }
    
    /**
     * Return the item position relative to the section.
     *
     * @param position position of the item in the adapter
     * @return position of the item in the section
     */
    public final int getPositionInSection(int position) {
        return 0;
    }
    
    /**
     * Return the section position in the adapter.
     *
     * @param tag unique identifier of the section
     * @return position of the section in the adapter
     */
    public final int getSectionPosition(@org.jetbrains.annotations.NotNull
    java.lang.String tag) {
        return 0;
    }
    
    /**
     * Return the section position in the adapter.
     *
     * @param section a mVisible section of this adapter
     * @return position of the section in the adapter
     */
    public final int getSectionPosition(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.widgets.sectionedrecyclerview.Section section) {
        return 0;
    }
    
    /**
     * Helper method that receives position in relation to the section, and returns the position in
     * the adapter.
     *
     * @param tag unique identifier of the section
     * @param position position of the item in the section
     * @return position of the item in the adapter
     */
    public final int getPositionInAdapter(@org.jetbrains.annotations.NotNull
    java.lang.String tag, int position) {
        return 0;
    }
    
    /**
     * Helper method that receives position in relation to the section, and returns the position in
     * the adapter.
     *
     * @param section a mVisible section of this adapter
     * @param position position of the item in the section
     * @return position of the item in the adapter
     */
    public final int getPositionInAdapter(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.widgets.sectionedrecyclerview.Section section, int position) {
        return 0;
    }
    
    /**
     * Helper method that returns the position of header in the adapter.
     *
     * @param tag unique identifier of the section
     * @return position of the header in the adapter
     */
    public final int getHeaderPositionInAdapter(@org.jetbrains.annotations.NotNull
    java.lang.String tag) {
        return 0;
    }
    
    /**
     * Helper method that returns the position of header in the adapter.
     *
     * @param section a mVisible section of this adapter
     * @return position of the header in the adapter
     */
    public final int getHeaderPositionInAdapter(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.widgets.sectionedrecyclerview.Section section) {
        return 0;
    }
    
    /**
     * Helper method that returns the position of footer in the adapter.
     *
     * @param tag unique identifier of the section
     * @return position of the footer in the adapter
     */
    public final int getFooterPositionInAdapter(@org.jetbrains.annotations.NotNull
    java.lang.String tag) {
        return 0;
    }
    
    /**
     * Helper method that returns the position of header in the adapter.
     *
     * @param section a mVisible section of this adapter
     * @return position of the footer in the adapter
     */
    public final int getFooterPositionInAdapter(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.widgets.sectionedrecyclerview.Section section) {
        return 0;
    }
    
    /**
     * Helper method that receives position in relation to the section, calculates the relative
     * position in the adapter and calls [.notifyItemInserted].
     *
     * @param tag unique identifier of the section
     * @param position position of the item in the section
     */
    public final void notifyItemInsertedInSection(@org.jetbrains.annotations.NotNull
    java.lang.String tag, int position) {
    }
    
    /**
     * Helper method that receives position in relation to the section, calculates the relative
     * position in the adapter and calls [.notifyItemInserted].
     *
     * @param section a mVisible section of this adapter
     * @param position position of the item in the section
     */
    public final void notifyItemInsertedInSection(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.widgets.sectionedrecyclerview.Section section, int position) {
    }
    
    @androidx.annotation.VisibleForTesting
    public final void callSuperNotifyItemInserted$WooCommerce_wasabiDebug(int position) {
    }
    
    /**
     * Helper method that receives position in relation to the section, calculates the relative
     * position in the adapter and calls [.notifyItemRangeInserted].
     *
     * @param tag unique identifier of the section
     * @param positionStart position of the first item that was inserted in the section
     * @param itemCount number of items inserted in the section
     */
    public final void notifyItemRangeInsertedInSection(@org.jetbrains.annotations.NotNull
    java.lang.String tag, int positionStart, int itemCount) {
    }
    
    /**
     * Helper method that receives position in relation to the section, calculates the relative
     * position in the adapter and calls [.notifyItemRangeInserted].
     *
     * @param section a mVisible section of this adapter
     * @param positionStart position of the first item that was inserted in the section
     * @param itemCount number of items inserted in the section
     */
    public final void notifyItemRangeInsertedInSection(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.widgets.sectionedrecyclerview.Section section, int positionStart, int itemCount) {
    }
    
    @androidx.annotation.VisibleForTesting
    public final void callSuperNotifyItemRangeInserted$WooCommerce_wasabiDebug(int positionStart, int itemCount) {
    }
    
    /**
     * Helper method that receives position in relation to the section, calculates the relative
     * position in the adapter and calls [.notifyItemRemoved].
     *
     * @param tag unique identifier of the section
     * @param position position of the item in the section
     */
    public final void notifyItemRemovedFromSection(@org.jetbrains.annotations.NotNull
    java.lang.String tag, int position) {
    }
    
    /**
     * Helper method that receives position in relation to the section, calculates the relative
     * position in the adapter and calls [.notifyItemRemoved].
     *
     * @param section a mVisible section of this adapter
     * @param position position of the item in the section
     */
    public final void notifyItemRemovedFromSection(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.widgets.sectionedrecyclerview.Section section, int position) {
    }
    
    @androidx.annotation.VisibleForTesting
    public final void callSuperNotifyItemRemoved$WooCommerce_wasabiDebug(int position) {
    }
    
    /**
     * Helper method that receives position in relation to the section, calculates the relative
     * position in the adapter and calls [.notifyItemRangeRemoved].
     *
     * @param tag unique identifier of the section
     * @param positionStart previous position of the first item that was removed from the section
     * @param itemCount number of items removed from the section
     */
    public final void notifyItemRangeRemovedFromSection(@org.jetbrains.annotations.NotNull
    java.lang.String tag, int positionStart, int itemCount) {
    }
    
    /**
     * Helper method that receives position in relation to the section, calculates the relative
     * position in the adapter and calls [.notifyItemRangeRemoved].
     *
     * @param section a mVisible section of this adapter
     * @param positionStart previous position of the first item that was removed from the section
     * @param itemCount number of items removed from the section
     */
    public final void notifyItemRangeRemovedFromSection(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.widgets.sectionedrecyclerview.Section section, int positionStart, int itemCount) {
    }
    
    @androidx.annotation.VisibleForTesting
    public final void callSuperNotifyItemRangeRemoved$WooCommerce_wasabiDebug(int positionStart, int itemCount) {
    }
    
    /**
     * Helper method that receives position in relation to the section, calculates the relative
     * position in the adapter and calls [.notifyItemChanged].
     *
     * @param tag unique identifier of the section
     * @param position position of the item in the section
     */
    public final void notifyItemChangedInSection(@org.jetbrains.annotations.NotNull
    java.lang.String tag, int position) {
    }
    
    /**
     * Helper method that receives position in relation to the section, calculates the relative
     * position in the adapter and calls [.notifyItemChanged].
     *
     * @param section a mVisible section of this adapter
     * @param position position of the item in the section
     */
    public final void notifyItemChangedInSection(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.widgets.sectionedrecyclerview.Section section, int position) {
    }
    
    /**
     * Helper method that calculates the relative header position in the adapter and calls
     * [.notifyItemChanged].
     *
     * @param tag unique identifier of the section
     */
    public final void notifyHeaderChangedInSection(@org.jetbrains.annotations.NotNull
    java.lang.String tag) {
    }
    
    /**
     * Helper method that calculates the relative header position in the adapter and calls
     * [.notifyItemChanged].
     *
     * @param section a mVisible section of this adapter
     */
    public final void notifyHeaderChangedInSection(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.widgets.sectionedrecyclerview.Section section) {
    }
    
    /**
     * Helper method that calculates the relative footer position in the adapter and calls
     * [.notifyItemChanged].
     *
     * @param tag unique identifier of the section
     */
    public final void notifyFooterChangedInSection(@org.jetbrains.annotations.NotNull
    java.lang.String tag) {
    }
    
    /**
     * Helper method that calculates the relative footer position in the adapter and calls
     * [.notifyItemChanged].
     *
     * @param section a mVisible section of this adapter
     */
    public final void notifyFooterChangedInSection(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.widgets.sectionedrecyclerview.Section section) {
    }
    
    @androidx.annotation.VisibleForTesting
    public final void callSuperNotifyItemChanged$WooCommerce_wasabiDebug(int position) {
    }
    
    /**
     * Helper method that receives position in relation to the section, calculates the relative
     * position in the adapter and calls [.notifyItemRangeChanged].
     *
     * @param tag unique identifier of the section
     * @param positionStart position of the first item that was changed in the section
     * @param itemCount number of items changed in the section
     */
    public final void notifyItemRangeChangedInSection(@org.jetbrains.annotations.NotNull
    java.lang.String tag, int positionStart, int itemCount) {
    }
    
    /**
     * Helper method that receives position in relation to the section, calculates the relative
     * position in the adapter and calls [.notifyItemRangeChanged].
     *
     * @param section a mVisible section of this adapter
     * @param positionStart position of the first item that was changed in the section
     * @param itemCount number of items changed in the section
     */
    public final void notifyItemRangeChangedInSection(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.widgets.sectionedrecyclerview.Section section, int positionStart, int itemCount) {
    }
    
    @androidx.annotation.VisibleForTesting
    public final void callSuperNotifyItemRangeChanged$WooCommerce_wasabiDebug(int positionStart, int itemCount) {
    }
    
    /**
     * Helper method that receives position in relation to the section, calculates the relative
     * position in the adapter and calls [.notifyItemRangeChanged].
     *
     * @param tag unique identifier of the section
     * @param positionStart position of the first item that was inserted in the section
     * @param itemCount number of items inserted in the section
     * @param payload optional parameter, use null to identify a "full" update
     */
    public final void notifyItemRangeChangedInSection(@org.jetbrains.annotations.NotNull
    java.lang.String tag, int positionStart, int itemCount, @org.jetbrains.annotations.NotNull
    java.lang.Object payload) {
    }
    
    /**
     * Helper method that receives position in relation to the section, calculates the relative
     * position in the adapter and calls [.notifyItemRangeChanged].
     *
     * @param section a mVisible section of this adapter
     * @param positionStart position of the first item that was inserted in the section
     * @param itemCount number of items inserted in the section
     * @param payload optional parameter, use null to identify a "full" update
     */
    public final void notifyItemRangeChangedInSection(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.widgets.sectionedrecyclerview.Section section, int positionStart, int itemCount, @org.jetbrains.annotations.NotNull
    java.lang.Object payload) {
    }
    
    @androidx.annotation.VisibleForTesting
    public final void callSuperNotifyItemRangeChanged$WooCommerce_wasabiDebug(int positionStart, int itemCount, @org.jetbrains.annotations.NotNull
    java.lang.Object payload) {
    }
    
    /**
     * Helper method that receives position in relation to the section, calculates the relative
     * position in the adapter and calls [.notifyItemMoved].
     *
     * @param tag unique identifier of the section
     * @param fromPosition previous position of the item in the section
     * @param toPosition new position of the item in the section
     */
    public final void notifyItemMovedInSection(@org.jetbrains.annotations.NotNull
    java.lang.String tag, int fromPosition, int toPosition) {
    }
    
    /**
     * Helper method that receives position in relation to the section, calculates the relative
     * position in the adapter and calls [.notifyItemMoved].
     *
     * @param section a mVisible section of this adapter
     * @param fromPosition previous position of the item in the section
     * @param toPosition new position of the item in the section
     */
    public final void notifyItemMovedInSection(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.widgets.sectionedrecyclerview.Section section, int fromPosition, int toPosition) {
    }
    
    @androidx.annotation.VisibleForTesting
    public final void callSuperNotifyItemMoved$WooCommerce_wasabiDebug(int fromPosition, int toPosition) {
    }
    
    /**
     * Helper method that calls [.notifyItemChanged] with the position of the [State]
     * view holder in the adapter. Useful to be called after changing the State from
     * LOADING/FAILED/EMPTY to LOADING/FAILED/EMPTY.
     *
     * @param tag unique identifier of the section
     * @param previousState previous state of section
     */
    public final void notifyNotLoadedStateChanged(@org.jetbrains.annotations.NotNull
    java.lang.String tag, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.widgets.sectionedrecyclerview.Section.State previousState) {
    }
    
    /**
     * Helper method that calls [.notifyItemChanged] with the position of the [State]
     * view holder in the adapter. Useful to be called after changing the State from
     * LOADING/ FAILED/ EMPTY to LOADING/ FAILED/ EMPTY.
     *
     * @param section a mVisible section of this adapter
     * @param previousState previous state of section
     */
    public final void notifyNotLoadedStateChanged(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.widgets.sectionedrecyclerview.Section section, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.widgets.sectionedrecyclerview.Section.State previousState) {
    }
    
    /**
     * Helper method that calls [.notifyItemChanged] and [.notifyItemInserted] with
     * the position of the [State] view holder in the adapter. Useful to be called after
     * changing the State from LOADING/ FAILED/ EMPTY to LOADED.
     *
     * @param tag unique identifier of the section
     * @param previousState previous state of section
     */
    public final void notifyStateChangedToLoaded(@org.jetbrains.annotations.NotNull
    java.lang.String tag, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.widgets.sectionedrecyclerview.Section.State previousState) {
    }
    
    /**
     * Helper method that calls [.notifyItemChanged] and [.notifyItemInserted] with
     * the position of the [State] view holder in the adapter. Useful to be called after
     * changing the State from LOADING/ FAILED/ EMPTY to LOADED.
     *
     * @param section a mVisible section of this adapter
     * @param previousState previous state of section
     */
    public final void notifyStateChangedToLoaded(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.widgets.sectionedrecyclerview.Section section, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.widgets.sectionedrecyclerview.Section.State previousState) {
    }
    
    /**
     * Helper method that calls [.notifyItemRangeRemoved] and [.notifyItemChanged] with
     * the position of the [State] view holder in the adapter. Useful to be called after
     * changing the State from LOADED to LOADING/ FAILED/ EMPTY.
     *
     * @param tag unique identifier of the section
     * @param previousContentItemsCount previous content items count of section
     */
    public final void notifyStateChangedFromLoaded(@org.jetbrains.annotations.NotNull
    java.lang.String tag, int previousContentItemsCount) {
    }
    
    /**
     * Helper method that calls [.notifyItemRangeRemoved] and [.notifyItemChanged] with
     * the position of the [State] view holder in the adapter. Useful to be called after
     * changing the State from LOADED to LOADING/ FAILED/ EMPTY.
     *
     * @param section a mVisible section of this adapter
     * @param previousContentItemsCount previous content items count of section
     */
    public final void notifyStateChangedFromLoaded(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.widgets.sectionedrecyclerview.Section section, int previousContentItemsCount) {
    }
    
    /**
     * Helper method that calls [.notifyItemInserted] with the position of the section's
     * header in the adapter. Useful to be called after changing the visibility of the section's
     * header to mVisible with [Section.setHasHeader].
     *
     * @param tag unique identifier of the section
     */
    public final void notifyHeaderInsertedInSection(@org.jetbrains.annotations.NotNull
    java.lang.String tag) {
    }
    
    /**
     * Helper method that calls [.notifyItemInserted] with the position of the section's
     * header in the adapter. Useful to be called after changing the visibility of the section's
     * header to mVisible with [Section.setHasHeader].
     *
     * @param section a mVisible section of this adapter
     */
    public final void notifyHeaderInsertedInSection(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.widgets.sectionedrecyclerview.Section section) {
    }
    
    /**
     * Helper method that calls [.notifyItemInserted] with the position of the section's
     * footer in the adapter. Useful to be called after changing the visibility of the section's
     * footer to mVisible with [Section.setHasFooter].
     *
     * @param tag unique identifier of the section
     */
    public final void notifyFooterInsertedInSection(@org.jetbrains.annotations.NotNull
    java.lang.String tag) {
    }
    
    /**
     * Helper method that calls [.notifyItemInserted] with the position of the section's
     * footer in the adapter. Useful to be called after changing the visibility of the section's
     * footer to mVisible with [Section.setHasFooter].
     *
     * @param section a mVisible section of this adapter
     */
    public final void notifyFooterInsertedInSection(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.widgets.sectionedrecyclerview.Section section) {
    }
    
    /**
     * Helper method that calls [.notifyItemRemoved] with the position of the section's
     * header in the adapter. Useful to be called after changing the visibility of the section's
     * header to invisible with [Section.setHasHeader].
     *
     * @param tag unique identifier of the section
     */
    public final void notifyHeaderRemovedFromSection(@org.jetbrains.annotations.NotNull
    java.lang.String tag) {
    }
    
    /**
     * Helper method that calls [.notifyItemRemoved] with the position of the section's
     * header in the adapter. Useful to be called after changing the visibility of the section's
     * header to invisible with [Section.setHasHeader].
     *
     * @param section a mVisible section of this adapter
     */
    public final void notifyHeaderRemovedFromSection(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.widgets.sectionedrecyclerview.Section section) {
    }
    
    /**
     * Helper method that calls [.notifyItemRemoved] with the position of the section's
     * footer in the adapter. Useful to be called after changing the visibility of the section's
     * footer to invisible with [Section.setHasFooter].
     *
     * @param tag unique identifier of the section
     */
    public final void notifyFooterRemovedFromSection(@org.jetbrains.annotations.NotNull
    java.lang.String tag) {
    }
    
    /**
     * Helper method that calls [.notifyItemRemoved] with the position of the section's
     * footer in the adapter. Useful to be called after changing the visibility of the section's
     * footer to invisible with [Section.setHasFooter].
     *
     * @param section a mVisible section of this adapter
     */
    public final void notifyFooterRemovedFromSection(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.widgets.sectionedrecyclerview.Section section) {
    }
    
    /**
     * Helper method that calls [.notifyItemRangeInserted] with the position of the section
     * in the adapter. Useful to be called after changing the visibility of the section to mVisible
     *
     * @param tag unique identifier of the section
     */
    public final void notifySectionChangedToVisible(@org.jetbrains.annotations.NotNull
    java.lang.String tag) {
    }
    
    /**
     * Helper method that calls [.notifyItemRangeInserted] with the position of the section
     * in the adapter. Useful to be called after changing the visibility of the section to mVisible
     *
     * @param section a mVisible section of this adapter
     */
    public final void notifySectionChangedToVisible(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.widgets.sectionedrecyclerview.Section section) {
    }
    
    /**
     * Helper method that calls [.notifyItemRangeInserted] with the position of the section
     * in the adapter. Useful to be called after changing the visibility of the section to invisible
     *
     * @param tag unique identifier of the section
     * @param previousSectionPosition previous section position
     */
    public final void notifySectionChangedToInvisible(@org.jetbrains.annotations.NotNull
    java.lang.String tag, int previousSectionPosition) {
    }
    
    /**
     * Helper method that calls [.notifyItemRangeInserted] with the position of the section
     * in the adapter. Useful to be called after changing the visibility of the section to invisible
     *
     * @param section an invisible section of this adapter
     * @param previousSectionPosition previous section position
     */
    public final void notifySectionChangedToInvisible(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.widgets.sectionedrecyclerview.Section section, int previousSectionPosition) {
    }
    
    private final com.woocommerce.android.widgets.sectionedrecyclerview.Section getValidSectionOrThrowException(java.lang.String tag) {
        return null;
    }
    
    /**
     * A concrete class of an empty ViewHolder.
     * Should be used to avoid the boilerplate of creating a ViewHolder class for simple case
     * scenarios.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/widgets/sectionedrecyclerview/SectionedRecyclerViewAdapter$EmptyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "WooCommerce_wasabiDebug"})
    public static final class EmptyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public EmptyViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/woocommerce/android/widgets/sectionedrecyclerview/SectionedRecyclerViewAdapter$Companion;", "", "()V", "INVALID_POSITION", "", "VIEW_TYPE_EMPTY", "VIEW_TYPE_FAILED", "VIEW_TYPE_FOOTER", "VIEW_TYPE_HEADER", "VIEW_TYPE_ITEM_LOADED", "VIEW_TYPE_LOADING", "VIEW_TYPE_QTY", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}