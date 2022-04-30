package com.haroldadmin.moonshot.features.search;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.airbnb.epoxy.EpoxyController;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.haroldadmin.moonshot.base.MoonShotAsyncTypedEpoxyController;
import com.haroldadmin.moonshot.base.MoonShotState;
import com.haroldadmin.moonshot.base.MoonShotViewModel;
import com.haroldadmin.moonshot.features.launchDetails.LaunchDetailsFragmentArgs;
import com.haroldadmin.moonshot.features.launchPad.LaunchPadFragmentArgs;
import com.haroldadmin.moonshot.features.rocketDetails.RocketDetailsFragmentArgs;
import com.haroldadmin.moonshot.features.search.R;
import com.haroldadmin.moonshot.features.search.databinding.FragmentSearchBinding;
import com.haroldadmin.moonshot.features.search.di.DaggerSearchComponent;
import com.haroldadmin.moonshot.features.search.views.searchResultView;
import com.haroldadmin.moonshot.features.search.views.searchUninitializedView;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.FlowPreview;
import kotlinx.coroutines.flow.Flow;
import javax.inject.Inject;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlinx.coroutines.FlowPreview()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J&\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010%\u001a\u00020\u001cH\u0016J\b\u0010&\u001a\u00020\u001cH\u0016J\u001a\u0010\'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020 2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006)"}, d2 = {"Lcom/haroldadmin/moonshot/features/search/SearchFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "()V", "_binding", "Lcom/haroldadmin/moonshot/features/search/databinding/FragmentSearchBinding;", "binding", "getBinding", "()Lcom/haroldadmin/moonshot/features/search/databinding/FragmentSearchBinding;", "controller", "Lcom/haroldadmin/moonshot/base/MoonShotAsyncTypedEpoxyController;", "Lcom/haroldadmin/moonshot/features/search/SearchState;", "getController", "()Lcom/haroldadmin/moonshot/base/MoonShotAsyncTypedEpoxyController;", "controller$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/haroldadmin/moonshot/features/search/SearchViewModel;", "getViewModel", "()Lcom/haroldadmin/moonshot/features/search/SearchViewModel;", "viewModel$delegate", "Lcom/haroldadmin/vector/vectorLazy;", "viewModelFactory", "Lcom/haroldadmin/moonshot/features/search/SearchViewModel$Factory;", "getViewModelFactory", "()Lcom/haroldadmin/moonshot/features/search/SearchViewModel$Factory;", "setViewModelFactory", "(Lcom/haroldadmin/moonshot/features/search/SearchViewModel$Factory;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onStart", "onViewCreated", "view", "search_debug"})
public final class SearchFragment extends com.google.android.material.bottomsheet.BottomSheetDialogFragment {
    private com.haroldadmin.moonshot.features.search.databinding.FragmentSearchBinding _binding;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.haroldadmin.moonshot.features.search.SearchViewModel.Factory viewModelFactory;
    private final com.haroldadmin.vector.vectorLazy viewModel$delegate = null;
    private final kotlin.Lazy controller$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.haroldadmin.moonshot.features.search.databinding.FragmentSearchBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.features.search.SearchViewModel.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshot.features.search.SearchViewModel.Factory p0) {
    }
    
    private final com.haroldadmin.moonshot.features.search.SearchViewModel getViewModel() {
        return null;
    }
    
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
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final com.haroldadmin.moonshot.base.MoonShotAsyncTypedEpoxyController<com.haroldadmin.moonshot.features.search.SearchState> getController() {
        return null;
    }
    
    public SearchFragment() {
        super();
    }
}