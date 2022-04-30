package com.google.samples.apps.iosched.di;

import android.content.Context;
import com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper;
import com.google.samples.apps.iosched.shared.data.prefs.PreferenceStorage;
import com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideAnalyticsHelperFactory implements Factory<AnalyticsHelper> {
  private final AppModule module;

  private final Provider<CoroutineScope> applicationScopeProvider;

  private final Provider<Context> contextProvider;

  private final Provider<SignInViewModelDelegate> signInDelegateProvider;

  private final Provider<PreferenceStorage> preferenceStorageProvider;

  public AppModule_ProvideAnalyticsHelperFactory(AppModule module,
      Provider<CoroutineScope> applicationScopeProvider, Provider<Context> contextProvider,
      Provider<SignInViewModelDelegate> signInDelegateProvider,
      Provider<PreferenceStorage> preferenceStorageProvider) {
    this.module = module;
    this.applicationScopeProvider = applicationScopeProvider;
    this.contextProvider = contextProvider;
    this.signInDelegateProvider = signInDelegateProvider;
    this.preferenceStorageProvider = preferenceStorageProvider;
  }

  @Override
  public AnalyticsHelper get() {
    return provideAnalyticsHelper(module, applicationScopeProvider.get(), contextProvider.get(), signInDelegateProvider.get(), preferenceStorageProvider.get());
  }

  public static AppModule_ProvideAnalyticsHelperFactory create(AppModule module,
      Provider<CoroutineScope> applicationScopeProvider, Provider<Context> contextProvider,
      Provider<SignInViewModelDelegate> signInDelegateProvider,
      Provider<PreferenceStorage> preferenceStorageProvider) {
    return new AppModule_ProvideAnalyticsHelperFactory(module, applicationScopeProvider, contextProvider, signInDelegateProvider, preferenceStorageProvider);
  }

  public static AnalyticsHelper provideAnalyticsHelper(AppModule instance,
      CoroutineScope applicationScope, Context context, SignInViewModelDelegate signInDelegate,
      PreferenceStorage preferenceStorage) {
    return Preconditions.checkNotNull(instance.provideAnalyticsHelper(applicationScope, context, signInDelegate, preferenceStorage), "Cannot return null from a non-@Nullable @Provides method");
  }
}
