package com.google.samples.apps.iosched.ui.filters;

import java.lang.System;

/**
 * Interface to add filters functionality to a screen through a ViewModel.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0017\u001a\u00020\u0018H&J\u0016\u0010\u0019\u001a\u00020\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004H&J\u0018\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\tH&R\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u0007R\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0007R\u001e\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0007R\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0007\u00a8\u0006\u001e"}, d2 = {"Lcom/google/samples/apps/iosched/ui/filters/FiltersViewModelDelegate;", "", "filterChips", "Landroidx/lifecycle/LiveData;", "", "Lcom/google/samples/apps/iosched/ui/filters/FilterChip;", "getFilterChips", "()Landroidx/lifecycle/LiveData;", "hasAnyFilters", "", "getHasAnyFilters", "resultCount", "Landroidx/lifecycle/MutableLiveData;", "", "getResultCount", "()Landroidx/lifecycle/MutableLiveData;", "selectedFilterChips", "getSelectedFilterChips", "selectedFilters", "Lcom/google/samples/apps/iosched/model/filters/Filter;", "getSelectedFilters", "showResultCount", "getShowResultCount", "clearFilters", "", "setSupportedFilters", "filters", "toggleFilter", "filter", "enabled", "mobile_staging"})
public abstract interface FiltersViewModelDelegate {
    
    /**
     * The full list of filter chips.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.google.samples.apps.iosched.ui.filters.FilterChip>> getFilterChips();
    
    /**
     * The list of selected filters.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.google.samples.apps.iosched.model.filters.Filter>> getSelectedFilters();
    
    /**
     * The list of selected filter chips.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.google.samples.apps.iosched.ui.filters.FilterChip>> getSelectedFilterChips();
    
    /**
     * True if there are any selected filters.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.lang.Boolean> getHasAnyFilters();
    
    /**
     * Number of results from applying filters. Can be set by implementers.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.MutableLiveData<java.lang.Integer> getResultCount();
    
    /**
     * Whether to show the result count instead of the "Filters" header.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.lang.Boolean> getShowResultCount();
    
    /**
     * Set the list of filters.
     */
    public abstract void setSupportedFilters(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.google.samples.apps.iosched.model.filters.Filter> filters);
    
    /**
     * Set the selected state of the filter. Must be one of the supported filters.
     */
    public abstract void toggleFilter(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.model.filters.Filter filter, boolean enabled);
    
    /**
     * Clear all selected filters.
     */
    public abstract void clearFilters();
}