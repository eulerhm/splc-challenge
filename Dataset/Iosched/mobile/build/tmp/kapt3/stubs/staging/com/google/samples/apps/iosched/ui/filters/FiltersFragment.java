package com.google.samples.apps.iosched.ui.filters;

import java.lang.System;

/**
 * Fragment that shows the list of filters for the Schedule
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\b&\u0018\u0000 $2\u00020\u0001:\u0001$B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0011\u001a\u00020\u0012J\u0012\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J&\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u001d\u001a\u00020\u0010H&J\u0006\u0010\u001e\u001a\u00020\u0012J\u0010\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u000eH\u0002J\u0010\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020#H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/google/samples/apps/iosched/ui/filters/FiltersFragment;", "Landroidx/fragment/app/Fragment;", "()V", "backPressedCallback", "Landroidx/activity/OnBackPressedCallback;", "behavior", "Lcom/google/samples/apps/iosched/widget/BottomSheetBehavior;", "binding", "Lcom/google/samples/apps/iosched/databinding/FragmentFiltersBinding;", "contentAlpha", "Landroidx/databinding/ObservableFloat;", "filterAdapter", "Lcom/google/samples/apps/iosched/ui/filters/SelectableFilterChipAdapter;", "pendingSheetState", "", "viewModel", "Lcom/google/samples/apps/iosched/ui/filters/FiltersViewModelDelegate;", "hideFiltersSheet", "", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "resolveViewModelDelegate", "showFiltersSheet", "updateBackPressedCallbackEnabled", "state", "updateFilterContentsAlpha", "slideOffset", "", "Companion", "mobile_staging"})
public abstract class FiltersFragment extends androidx.fragment.app.Fragment {
    private com.google.samples.apps.iosched.ui.filters.FiltersViewModelDelegate viewModel;
    private com.google.samples.apps.iosched.ui.filters.SelectableFilterChipAdapter filterAdapter;
    private com.google.samples.apps.iosched.databinding.FragmentFiltersBinding binding;
    private com.google.samples.apps.iosched.widget.BottomSheetBehavior<?> behavior;
    private androidx.databinding.ObservableFloat contentAlpha;
    private final androidx.activity.OnBackPressedCallback backPressedCallback = null;
    private int pendingSheetState = -1;
    private static final float ALPHA_CONTENT_START = 0.1F;
    private static final float ALPHA_CONTENT_END = 0.3F;
    public static final com.google.samples.apps.iosched.ui.filters.FiltersFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    /**
     * Resolve the [FiltersViewModelDelegate] for this instance.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract com.google.samples.apps.iosched.ui.filters.FiltersViewModelDelegate resolveViewModelDelegate();
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void updateFilterContentsAlpha(float slideOffset) {
    }
    
    private final void updateBackPressedCallbackEnabled(int state) {
    }
    
    public final void showFiltersSheet() {
    }
    
    public final void hideFiltersSheet() {
    }
    
    public FiltersFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/google/samples/apps/iosched/ui/filters/FiltersFragment$Companion;", "", "()V", "ALPHA_CONTENT_END", "", "ALPHA_CONTENT_START", "mobile_staging"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}