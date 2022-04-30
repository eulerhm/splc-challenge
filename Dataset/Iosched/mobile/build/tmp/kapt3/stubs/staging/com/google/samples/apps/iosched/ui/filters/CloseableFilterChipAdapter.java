package com.google.samples.apps.iosched.ui.filters;

import java.lang.System;

/**
 * Adapter for closeable filters, e.g. those shown above search results.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/google/samples/apps/iosched/ui/filters/CloseableFilterChipAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/google/samples/apps/iosched/ui/filters/FilterChip;", "Lcom/google/samples/apps/iosched/ui/filters/CloseableFilterChipAdapter$FilterChipViewHolder;", "viewModelDelegate", "Lcom/google/samples/apps/iosched/ui/filters/FiltersViewModelDelegate;", "(Lcom/google/samples/apps/iosched/ui/filters/FiltersViewModelDelegate;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "FilterChipViewHolder", "mobile_staging"})
public final class CloseableFilterChipAdapter extends androidx.recyclerview.widget.ListAdapter<com.google.samples.apps.iosched.ui.filters.FilterChip, com.google.samples.apps.iosched.ui.filters.CloseableFilterChipAdapter.FilterChipViewHolder> {
    private final com.google.samples.apps.iosched.ui.filters.FiltersViewModelDelegate viewModelDelegate = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.google.samples.apps.iosched.ui.filters.CloseableFilterChipAdapter.FilterChipViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.filters.CloseableFilterChipAdapter.FilterChipViewHolder holder, int position) {
    }
    
    public CloseableFilterChipAdapter(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.filters.FiltersViewModelDelegate viewModelDelegate) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/google/samples/apps/iosched/ui/filters/CloseableFilterChipAdapter$FilterChipViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/google/samples/apps/iosched/databinding/ItemFilterChipCloseableBinding;", "(Lcom/google/samples/apps/iosched/databinding/ItemFilterChipCloseableBinding;)V", "bind", "", "item", "Lcom/google/samples/apps/iosched/ui/filters/FilterChip;", "mobile_staging"})
    public static final class FilterChipViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.google.samples.apps.iosched.databinding.ItemFilterChipCloseableBinding binding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.google.samples.apps.iosched.ui.filters.FilterChip item) {
        }
        
        public FilterChipViewHolder(@org.jetbrains.annotations.NotNull()
        com.google.samples.apps.iosched.databinding.ItemFilterChipCloseableBinding binding) {
            super(null);
        }
    }
}