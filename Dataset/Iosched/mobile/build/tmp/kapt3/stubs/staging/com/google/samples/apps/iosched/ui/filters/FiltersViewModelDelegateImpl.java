package com.google.samples.apps.iosched.ui.filters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0012H\u0002J\u0016\u0010\"\u001a\u00020\u001f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070\rH\u0016J\u0018\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0012H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\r0\fX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\fX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR \u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\r0\fX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000fR \u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\fX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u000fR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014\u00a8\u0006\'"}, d2 = {"Lcom/google/samples/apps/iosched/ui/filters/FiltersViewModelDelegateImpl;", "Lcom/google/samples/apps/iosched/ui/filters/FiltersViewModelDelegate;", "()V", "_filterChips", "", "Lcom/google/samples/apps/iosched/ui/filters/FilterChip;", "_filters", "Lcom/google/samples/apps/iosched/model/filters/Filter;", "_selectedFilterChips", "_selectedFilters", "", "filterChips", "Landroidx/lifecycle/MutableLiveData;", "", "getFilterChips", "()Landroidx/lifecycle/MutableLiveData;", "hasAnyFilters", "Landroidx/lifecycle/LiveData;", "", "getHasAnyFilters", "()Landroidx/lifecycle/LiveData;", "resultCount", "", "getResultCount", "selectedFilterChips", "getSelectedFilterChips", "selectedFilters", "getSelectedFilters", "showResultCount", "getShowResultCount", "clearFilters", "", "publish", "selectedChanged", "setSupportedFilters", "filters", "toggleFilter", "filter", "enabled", "mobile_staging"})
public final class FiltersViewModelDelegateImpl implements com.google.samples.apps.iosched.ui.filters.FiltersViewModelDelegate {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.google.samples.apps.iosched.ui.filters.FilterChip>> filterChips = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.google.samples.apps.iosched.model.filters.Filter>> selectedFilters = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.google.samples.apps.iosched.ui.filters.FilterChip>> selectedFilterChips = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> hasAnyFilters = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> resultCount = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> showResultCount = null;
    private java.util.List<com.google.samples.apps.iosched.model.filters.Filter> _filters;
    private final java.util.Set<com.google.samples.apps.iosched.model.filters.Filter> _selectedFilters = null;
    private java.util.List<com.google.samples.apps.iosched.ui.filters.FilterChip> _filterChips;
    private java.util.List<com.google.samples.apps.iosched.ui.filters.FilterChip> _selectedFilterChips;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.MutableLiveData<java.util.List<com.google.samples.apps.iosched.ui.filters.FilterChip>> getFilterChips() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.MutableLiveData<java.util.List<com.google.samples.apps.iosched.model.filters.Filter>> getSelectedFilters() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.MutableLiveData<java.util.List<com.google.samples.apps.iosched.ui.filters.FilterChip>> getSelectedFilterChips() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.lang.Boolean> getHasAnyFilters() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.MutableLiveData<java.lang.Integer> getResultCount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.lang.Boolean> getShowResultCount() {
        return null;
    }
    
    @java.lang.Override()
    public void setSupportedFilters(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.google.samples.apps.iosched.model.filters.Filter> filters) {
    }
    
    private final void publish(boolean selectedChanged) {
    }
    
    @java.lang.Override()
    public void toggleFilter(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.model.filters.Filter filter, boolean enabled) {
    }
    
    @java.lang.Override()
    public void clearFilters() {
    }
    
    public FiltersViewModelDelegateImpl() {
        super();
    }
}