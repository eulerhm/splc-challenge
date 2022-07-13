package com.woocommerce.android.datastore;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\u0007\u00a8\u0006\n"}, d2 = {"Lcom/woocommerce/android/datastore/DataStoreModule;", "", "()V", "provideTrackerDataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "appContext", "Landroid/content/Context;", "appCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "WooCommerce_vanillaDebug"})
@dagger.Module()
public final class DataStoreModule {
    
    public DataStoreModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @DataStoreQualifier(value = com.woocommerce.android.datastore.DataStoreType.TRACKER)
    @javax.inject.Singleton()
    @dagger.Provides()
    public final androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> provideTrackerDataStore(@org.jetbrains.annotations.NotNull()
    android.content.Context appContext, @org.jetbrains.annotations.NotNull()
    @com.woocommerce.android.di.AppCoroutineScope()
    kotlinx.coroutines.CoroutineScope appCoroutineScope) {
        return null;
    }
}