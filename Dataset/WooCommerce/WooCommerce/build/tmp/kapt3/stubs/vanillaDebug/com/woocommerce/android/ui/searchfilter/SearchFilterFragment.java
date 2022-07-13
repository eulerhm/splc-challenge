package com.woocommerce.android.ui.searchfilter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 .2\u00020\u0001:\u0001.B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001bH\u0002J\b\u0010\u001d\u001a\u00020\u001bH\u0016J\u001a\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010#\u001a\u00020\u001bH\u0002J\b\u0010$\u001a\u00020\u001bH\u0002J\b\u0010%\u001a\u00020\u001bH\u0002J\b\u0010&\u001a\u00020\u001bH\u0002J\u0010\u0010\'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\u0019H\u0002J\b\u0010)\u001a\u00020\u001bH\u0002J\u0016\u0010*\u001a\u00020\u001b2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006/"}, d2 = {"Lcom/woocommerce/android/ui/searchfilter/SearchFilterFragment;", "Lcom/woocommerce/android/ui/base/BaseFragment;", "()V", "_binding", "Lcom/woocommerce/android/databinding/FragmentSearchFilterBinding;", "binding", "getBinding", "()Lcom/woocommerce/android/databinding/FragmentSearchFilterBinding;", "navArgs", "Lcom/woocommerce/android/ui/searchfilter/SearchFilterFragmentArgs;", "getNavArgs", "()Lcom/woocommerce/android/ui/searchfilter/SearchFilterFragmentArgs;", "navArgs$delegate", "Landroidx/navigation/NavArgsLazy;", "searchFilterAdapter", "Lcom/woocommerce/android/ui/searchfilter/SearchFilterAdapter;", "searchTextWatcher", "Landroid/text/TextWatcher;", "viewModel", "Lcom/woocommerce/android/ui/searchfilter/SearchFilterViewModel;", "getViewModel", "()Lcom/woocommerce/android/ui/searchfilter/SearchFilterViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getFragmentTitle", "", "hideEmptyView", "", "hideSearchList", "onDestroyView", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setupEventObserver", "setupSearchInput", "setupSearchList", "setupViewStateObserver", "showEmptyView", "searchQuery", "showSearchList", "updateSearchList", "searchFilterItems", "", "Lcom/woocommerce/android/ui/searchfilter/SearchFilterItem;", "Companion", "WooCommerce_vanillaDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class SearchFilterFragment extends com.woocommerce.android.ui.base.BaseFragment {
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.searchfilter.SearchFilterFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = null;
    private final kotlin.Lazy viewModel$delegate = null;
    private final androidx.navigation.NavArgsLazy navArgs$delegate = null;
    private com.woocommerce.android.databinding.FragmentSearchFilterBinding _binding;
    private com.woocommerce.android.ui.searchfilter.SearchFilterAdapter searchFilterAdapter;
    private final android.text.TextWatcher searchTextWatcher = null;
    
    public SearchFilterFragment() {
        super();
    }
    
    private final com.woocommerce.android.ui.searchfilter.SearchFilterViewModel getViewModel() {
        return null;
    }
    
    private final com.woocommerce.android.ui.searchfilter.SearchFilterFragmentArgs getNavArgs() {
        return null;
    }
    
    private final com.woocommerce.android.databinding.FragmentSearchFilterBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getFragmentTitle() {
        return null;
    }
    
    private final void setupViewStateObserver() {
    }
    
    private final void setupEventObserver() {
    }
    
    private final void setupSearchInput() {
    }
    
    private final void setupSearchList() {
    }
    
    private final void updateSearchList(java.util.List<com.woocommerce.android.ui.searchfilter.SearchFilterItem> searchFilterItems) {
    }
    
    private final void showSearchList() {
    }
    
    private final void hideSearchList() {
    }
    
    private final void hideEmptyView() {
    }
    
    private final void showEmptyView(java.lang.String searchQuery) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/ui/searchfilter/SearchFilterFragment$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTAG() {
            return null;
        }
    }
}