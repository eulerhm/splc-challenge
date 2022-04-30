package com.google.samples.apps.iosched.di;

import java.lang.System;

/**
 * Defines all the classes that need to be provided in the scope of the app.
 *
 * Define here all objects that are shared throughout the app, like SharedPreferences, navigators or
 * others. If some of those objects are singletons, they should be annotated with `@Singleton`.
 */
@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ApplicationComponent.class})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J,\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0012\u0010\u0011\u001a\u00020\u00122\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0007J\u0012\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0007J\u0012\u0010\u0015\u001a\u00020\u00162\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\u0017\u001a\u00020\u0018H\u0007J\b\u0010\u0019\u001a\u00020\u001aH\u0007J\u0012\u0010\u001b\u001a\u00020\u00102\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0007J\u0012\u0010\u001c\u001a\u00020\u001d2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0007J\u0012\u0010\u001e\u001a\u00020\n2\b\b\u0001\u0010\u001f\u001a\u00020 H\u0007\u00a8\u0006!"}, d2 = {"Lcom/google/samples/apps/iosched/di/AppModule;", "", "()V", "provideAgendaRepository", "Lcom/google/samples/apps/iosched/shared/data/agenda/AgendaRepository;", "appConfigDataSource", "Lcom/google/samples/apps/iosched/shared/data/config/AppConfigDataSource;", "provideAnalyticsHelper", "Lcom/google/samples/apps/iosched/shared/analytics/AnalyticsHelper;", "applicationScope", "Lkotlinx/coroutines/CoroutineScope;", "context", "Landroid/content/Context;", "signInDelegate", "Lcom/google/samples/apps/iosched/ui/signin/SignInViewModelDelegate;", "preferenceStorage", "Lcom/google/samples/apps/iosched/shared/data/prefs/PreferenceStorage;", "provideAppDatabase", "Lcom/google/samples/apps/iosched/shared/data/db/AppDatabase;", "provideClipboardManager", "Landroid/content/ClipboardManager;", "provideConnectivityManager", "Landroid/net/ConnectivityManager;", "provideGson", "Lcom/google/gson/Gson;", "provideMainThreadHandler", "Lcom/google/samples/apps/iosched/shared/domain/internal/IOSchedHandler;", "providePreferenceStorage", "provideWifiManager", "Landroid/net/wifi/WifiManager;", "providesApplicationScope", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "mobile_staging"})
@dagger.Module()
public final class AppModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.google.samples.apps.iosched.shared.data.prefs.PreferenceStorage providePreferenceStorage(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final android.net.wifi.WifiManager provideWifiManager(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final android.net.ConnectivityManager provideConnectivityManager(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final android.content.ClipboardManager provideClipboardManager(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.google.samples.apps.iosched.shared.di.ApplicationScope()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final kotlinx.coroutines.CoroutineScope providesApplicationScope(@org.jetbrains.annotations.NotNull()
    @com.google.samples.apps.iosched.shared.di.DefaultDispatcher()
    kotlinx.coroutines.CoroutineDispatcher defaultDispatcher) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.google.samples.apps.iosched.shared.di.MainThreadHandler()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.google.samples.apps.iosched.shared.domain.internal.IOSchedHandler provideMainThreadHandler() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper provideAnalyticsHelper(@org.jetbrains.annotations.NotNull()
    @com.google.samples.apps.iosched.shared.di.ApplicationScope()
    kotlinx.coroutines.CoroutineScope applicationScope, @org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate signInDelegate, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.data.prefs.PreferenceStorage preferenceStorage) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.google.samples.apps.iosched.shared.data.agenda.AgendaRepository provideAgendaRepository(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.data.config.AppConfigDataSource appConfigDataSource) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.google.samples.apps.iosched.shared.data.db.AppDatabase provideAppDatabase(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.google.gson.Gson provideGson() {
        return null;
    }
    
    public AppModule() {
        super();
    }
}