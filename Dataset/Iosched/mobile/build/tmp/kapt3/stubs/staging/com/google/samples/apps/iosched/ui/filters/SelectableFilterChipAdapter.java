package com.google.samples.apps.iosched.ui.filters;

import java.lang.System;

/**
 * Adapter for selectable filters, e.g. ones shown in the filter sheet.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u001b\u001c\u001dB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u000eH\u0016J\u0016\u0010\u0015\u001a\u00020\u00112\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017J\u0018\u0010\u0019\u001a\u00020\u00112\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001aH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/google/samples/apps/iosched/ui/filters/SelectableFilterChipAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewModelDelegate", "Lcom/google/samples/apps/iosched/ui/filters/FiltersViewModelDelegate;", "(Lcom/google/samples/apps/iosched/ui/filters/FiltersViewModelDelegate;)V", "createFilterViewHolder", "Lcom/google/samples/apps/iosched/ui/filters/SelectableFilterChipAdapter$FilterViewHolder;", "parent", "Landroid/view/ViewGroup;", "createHeadingViewHolder", "Lcom/google/samples/apps/iosched/ui/filters/SelectableFilterChipAdapter$HeadingViewHolder;", "getItemViewType", "", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "viewType", "submitFilterList", "list", "", "Lcom/google/samples/apps/iosched/ui/filters/FilterChip;", "submitList", "", "Companion", "FilterViewHolder", "HeadingViewHolder", "mobile_staging"})
public final class SelectableFilterChipAdapter extends androidx.recyclerview.widget.ListAdapter<java.lang.Object, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final com.google.samples.apps.iosched.ui.filters.FiltersViewModelDelegate viewModelDelegate = null;
    private static final int VIEW_TYPE_HEADING = com.google.samples.apps.iosched.R.layout.item_generic_section_header;
    private static final int VIEW_TYPE_FILTER = com.google.samples.apps.iosched.R.layout.item_filter_chip_selectable;
    public static final com.google.samples.apps.iosched.ui.filters.SelectableFilterChipAdapter.Companion Companion = null;
    
    @java.lang.Override()
    public void submitList(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Object> list) {
    }
    
    /**
     * Prefer this method over [submitList] to add category headings.
     */
    public final void submitFilterList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.google.samples.apps.iosched.ui.filters.FilterChip> list) {
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    private final com.google.samples.apps.iosched.ui.filters.SelectableFilterChipAdapter.HeadingViewHolder createHeadingViewHolder(android.view.ViewGroup parent) {
        return null;
    }
    
    private final com.google.samples.apps.iosched.ui.filters.SelectableFilterChipAdapter.FilterViewHolder createFilterViewHolder(android.view.ViewGroup parent) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    public SelectableFilterChipAdapter(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.filters.FiltersViewModelDelegate viewModelDelegate) {
        super(null);
    }
    
    /**
     * ViewHolder for category heading items.
     */
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000\u00a2\u0006\u0002\b\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/google/samples/apps/iosched/ui/filters/SelectableFilterChipAdapter$HeadingViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/google/samples/apps/iosched/databinding/ItemGenericSectionHeaderBinding;", "(Lcom/google/samples/apps/iosched/databinding/ItemGenericSectionHeaderBinding;)V", "bind", "", "item", "Lcom/google/samples/apps/iosched/ui/SectionHeader;", "bind$mobile_staging", "mobile_staging"})
    public static final class HeadingViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.google.samples.apps.iosched.databinding.ItemGenericSectionHeaderBinding binding = null;
        
        public final void bind$mobile_staging(@org.jetbrains.annotations.NotNull()
        com.google.samples.apps.iosched.ui.SectionHeader item) {
        }
        
        public HeadingViewHolder(@org.jetbrains.annotations.NotNull()
        com.google.samples.apps.iosched.databinding.ItemGenericSectionHeaderBinding binding) {
            super(null);
        }
    }
    
    /**
     * ViewHolder for [FilterChip] items.
     */
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000\u00a2\u0006\u0002\b\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/google/samples/apps/iosched/ui/filters/SelectableFilterChipAdapter$FilterViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/google/samples/apps/iosched/databinding/ItemFilterChipSelectableBinding;", "(Lcom/google/samples/apps/iosched/databinding/ItemFilterChipSelectableBinding;)V", "bind", "", "item", "Lcom/google/samples/apps/iosched/ui/filters/FilterChip;", "bind$mobile_staging", "mobile_staging"})
    public static final class FilterViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.google.samples.apps.iosched.databinding.ItemFilterChipSelectableBinding binding = null;
        
        public final void bind$mobile_staging(@org.jetbrains.annotations.NotNull()
        com.google.samples.apps.iosched.ui.filters.FilterChip item) {
        }
        
        public FilterViewHolder(@org.jetbrains.annotations.NotNull()
        com.google.samples.apps.iosched.databinding.ItemFilterChipSelectableBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/google/samples/apps/iosched/ui/filters/SelectableFilterChipAdapter$Companion;", "", "()V", "VIEW_TYPE_FILTER", "", "VIEW_TYPE_HEADING", "insertCategoryHeadings", "", "list", "Lcom/google/samples/apps/iosched/ui/filters/FilterChip;", "mobile_staging"})
    public static final class Companion {
        
        /**
         * Inserts category headings in a list of [FilterChip]s to make a heterogeneous list.
         * Assumes the items are already grouped by [FilterChip.categoryLabel], beginning with
         * categoryLabel == '0'.
         */
        private final java.util.List<java.lang.Object> insertCategoryHeadings(java.util.List<com.google.samples.apps.iosched.ui.filters.FilterChip> list) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}