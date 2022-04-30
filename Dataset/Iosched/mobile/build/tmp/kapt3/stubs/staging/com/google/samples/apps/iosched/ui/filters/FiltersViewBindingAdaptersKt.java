package com.google.samples.apps.iosched.ui.filters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0007\u001a \u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u001a \u0010\r\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u001a\u0018\u0010\u000e\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0006H\u0007\u001a\u0018\u0010\u0010\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007\u001a)\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0012H\u0007\u00a2\u0006\u0002\u0010\u0019\u00a8\u0006\u001a"}, d2 = {"activeFilters", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "filters", "", "Lcom/google/samples/apps/iosched/ui/filters/FilterChip;", "viewModel", "Lcom/google/samples/apps/iosched/ui/filters/FiltersViewModelDelegate;", "filterChipOnClick", "chip", "Lcom/google/android/material/chip/Chip;", "filterChip", "filterChipOnClose", "filterChipText", "filter", "filterChipTint", "color", "", "filterHeader", "textView", "Landroid/widget/TextView;", "showResultCount", "", "resultCount", "(Landroid/widget/TextView;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "mobile_staging"})
public final class FiltersViewBindingAdaptersKt {
    
    @androidx.databinding.BindingAdapter(requireAll = true, value = {"activeFilters", "viewModel"})
    public static final void activeFilters(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.Nullable()
    java.util.List<com.google.samples.apps.iosched.ui.filters.FilterChip> filters, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.filters.FiltersViewModelDelegate viewModel) {
    }
    
    @androidx.databinding.BindingAdapter(requireAll = true, value = {"showResultCount", "resultCount"})
    public static final void filterHeader(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textView, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean showResultCount, @org.jetbrains.annotations.Nullable()
    java.lang.Integer resultCount) {
    }
    
    @androidx.databinding.BindingAdapter(requireAll = true, value = {"filterChipOnClick", "viewModel"})
    public static final void filterChipOnClick(@org.jetbrains.annotations.NotNull()
    com.google.android.material.chip.Chip chip, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.filters.FilterChip filterChip, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.filters.FiltersViewModelDelegate viewModel) {
    }
    
    @androidx.databinding.BindingAdapter(requireAll = true, value = {"filterChipOnClose", "viewModel"})
    public static final void filterChipOnClose(@org.jetbrains.annotations.NotNull()
    com.google.android.material.chip.Chip chip, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.filters.FilterChip filterChip, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.filters.FiltersViewModelDelegate viewModel) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"filterChipText"})
    public static final void filterChipText(@org.jetbrains.annotations.NotNull()
    com.google.android.material.chip.Chip chip, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.filters.FilterChip filter) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"filterChipTint"})
    public static final void filterChipTint(@org.jetbrains.annotations.NotNull()
    com.google.android.material.chip.Chip chip, int color) {
    }
}