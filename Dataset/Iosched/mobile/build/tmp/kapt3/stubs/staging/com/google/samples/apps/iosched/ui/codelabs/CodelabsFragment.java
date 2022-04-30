package com.google.samples.apps.iosched.ui.codelabs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 82\u00020\u00012\u00020\u0002:\u00018B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020&H\u0016J\b\u0010\'\u001a\u00020&H\u0016J&\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u0010\u00100\u001a\u00020&2\u0006\u00101\u001a\u00020/H\u0016J\u001a\u00102\u001a\u00020&2\u0006\u00103\u001a\u00020)2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\b\u00104\u001a\u00020&H\u0016J\u0010\u00105\u001a\u00020&2\u0006\u00106\u001a\u000207H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017R\u0012\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u00069"}, d2 = {"Lcom/google/samples/apps/iosched/ui/codelabs/CodelabsFragment;", "Lcom/google/samples/apps/iosched/ui/MainNavigationFragment;", "Lcom/google/samples/apps/iosched/ui/codelabs/CodelabsActionsHandler;", "()V", "analyticsHelper", "Lcom/google/samples/apps/iosched/shared/analytics/AnalyticsHelper;", "getAnalyticsHelper", "()Lcom/google/samples/apps/iosched/shared/analytics/AnalyticsHelper;", "setAnalyticsHelper", "(Lcom/google/samples/apps/iosched/shared/analytics/AnalyticsHelper;)V", "binding", "Lcom/google/samples/apps/iosched/databinding/FragmentCodelabsBinding;", "codelabsAdapter", "Lcom/google/samples/apps/iosched/ui/codelabs/CodelabsAdapter;", "codelabsViewModel", "Lcom/google/samples/apps/iosched/ui/codelabs/CodelabsViewModel;", "getCodelabsViewModel", "()Lcom/google/samples/apps/iosched/ui/codelabs/CodelabsViewModel;", "codelabsViewModel$delegate", "Lkotlin/Lazy;", "mainActivityViewModel", "Lcom/google/samples/apps/iosched/ui/MainActivityViewModel;", "getMainActivityViewModel", "()Lcom/google/samples/apps/iosched/ui/MainActivityViewModel;", "mainActivityViewModel$delegate", "mapFeatureEnabled", "", "tagRecycledViewPool", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "getTagRecycledViewPool", "()Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "setTagRecycledViewPool", "(Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;)V", "addCodelabsAnalyticsQueryParams", "Landroid/net/Uri;", "url", "", "dismissCodelabsInfoCard", "", "launchCodelabsWebsite", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onSaveInstanceState", "outState", "onViewCreated", "view", "openCodelabsOnMap", "startCodelab", "codelab", "Lcom/google/samples/apps/iosched/model/Codelab;", "Companion", "mobile_staging"})
@dagger.hilt.android.AndroidEntryPoint()
public final class CodelabsFragment extends com.google.samples.apps.iosched.ui.MainNavigationFragment implements com.google.samples.apps.iosched.ui.codelabs.CodelabsActionsHandler {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "tagViewPool")
    @javax.inject.Inject()
    public androidx.recyclerview.widget.RecyclerView.RecycledViewPool tagRecycledViewPool;
    @com.google.samples.apps.iosched.shared.di.MapFeatureEnabledFlag()
    @javax.inject.Inject()
    public boolean mapFeatureEnabled = false;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper analyticsHelper;
    private com.google.samples.apps.iosched.databinding.FragmentCodelabsBinding binding;
    private final kotlin.Lazy codelabsViewModel$delegate = null;
    private final kotlin.Lazy mainActivityViewModel$delegate = null;
    private com.google.samples.apps.iosched.ui.codelabs.CodelabsAdapter codelabsAdapter;
    private static final java.lang.String CODELABS_WEBSITE = "https://g.co/io/codelabs";
    private static final java.lang.String PARAM_UTM_SOURCE = "utm_source";
    private static final java.lang.String PARAM_UTM_MEDIUM = "utm_medium";
    private static final java.lang.String VALUE_UTM_SOURCE = "ioapp";
    private static final java.lang.String VALUE_UTM_MEDIUM = "android";
    public static final com.google.samples.apps.iosched.ui.codelabs.CodelabsFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView.RecycledViewPool getTagRecycledViewPool() {
        return null;
    }
    
    public final void setTagRecycledViewPool(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.RecycledViewPool p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper getAnalyticsHelper() {
        return null;
    }
    
    public final void setAnalyticsHelper(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper p0) {
    }
    
    private final com.google.samples.apps.iosched.ui.codelabs.CodelabsViewModel getCodelabsViewModel() {
        return null;
    }
    
    private final com.google.samples.apps.iosched.ui.MainActivityViewModel getMainActivityViewModel() {
        return null;
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
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    public void dismissCodelabsInfoCard() {
    }
    
    @java.lang.Override()
    public void openCodelabsOnMap() {
    }
    
    @java.lang.Override()
    public void launchCodelabsWebsite() {
    }
    
    @java.lang.Override()
    public void startCodelab(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.model.Codelab codelab) {
    }
    
    private final android.net.Uri addCodelabsAnalyticsQueryParams(java.lang.String url) {
        return null;
    }
    
    public CodelabsFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/google/samples/apps/iosched/ui/codelabs/CodelabsFragment$Companion;", "", "()V", "CODELABS_WEBSITE", "", "PARAM_UTM_MEDIUM", "PARAM_UTM_SOURCE", "VALUE_UTM_MEDIUM", "VALUE_UTM_SOURCE", "mobile_staging"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}