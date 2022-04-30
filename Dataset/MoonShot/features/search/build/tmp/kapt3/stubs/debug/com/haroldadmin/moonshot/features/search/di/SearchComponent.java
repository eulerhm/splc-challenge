package com.haroldadmin.moonshot.features.search.di;

import com.haroldadmin.moonshot.base.di.FeatureScope;
import com.haroldadmin.moonshot.base.di.MoonShotFragmentComponent;
import com.haroldadmin.moonshot.di.AppComponent;
import com.haroldadmin.moonshot.features.search.SearchFragment;
import dagger.Component;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.FlowPreview;

@kotlinx.coroutines.FlowPreview()
@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Lcom/haroldadmin/moonshot/features/search/di/SearchComponent;", "Lcom/haroldadmin/moonshot/base/di/MoonShotFragmentComponent;", "Lcom/haroldadmin/moonshot/features/search/SearchFragment;", "search_debug"})
@com.haroldadmin.moonshot.base.di.FeatureScope()
@dagger.Component(modules = {com.haroldadmin.moonshot.features.search.di.SearchModule.class}, dependencies = {com.haroldadmin.moonshot.di.AppComponent.class})
public abstract interface SearchComponent extends com.haroldadmin.moonshot.base.di.MoonShotFragmentComponent<com.haroldadmin.moonshot.features.search.SearchFragment> {
}