// Generated by Dagger (https://dagger.dev).
package com.google.android.gnd.ui.syncstatus;

import com.google.android.gnd.ui.common.AbstractFragment_MembersInjector;
import com.google.android.gnd.ui.common.FeatureHelper;
import com.google.android.gnd.ui.common.Navigator;
import com.google.android.gnd.ui.common.ViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SyncStatusFragment_MembersInjector implements MembersInjector<SyncStatusFragment> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  private final Provider<Navigator> navigatorProvider;

  private final Provider<FeatureHelper> featureHelperProvider;

  public SyncStatusFragment_MembersInjector(Provider<ViewModelFactory> viewModelFactoryProvider,
      Provider<Navigator> navigatorProvider, Provider<FeatureHelper> featureHelperProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
    this.navigatorProvider = navigatorProvider;
    this.featureHelperProvider = featureHelperProvider;
  }

  public static MembersInjector<SyncStatusFragment> create(
      Provider<ViewModelFactory> viewModelFactoryProvider, Provider<Navigator> navigatorProvider,
      Provider<FeatureHelper> featureHelperProvider) {
    return new SyncStatusFragment_MembersInjector(viewModelFactoryProvider, navigatorProvider, featureHelperProvider);
  }

  @Override
  public void injectMembers(SyncStatusFragment instance) {
    AbstractFragment_MembersInjector.injectViewModelFactory(instance, viewModelFactoryProvider.get());
    injectNavigator(instance, navigatorProvider.get());
    injectFeatureHelper(instance, featureHelperProvider.get());
  }

  @InjectedFieldSignature("com.google.android.gnd.ui.syncstatus.SyncStatusFragment.navigator")
  public static void injectNavigator(SyncStatusFragment instance, Navigator navigator) {
    instance.navigator = navigator;
  }

  @InjectedFieldSignature("com.google.android.gnd.ui.syncstatus.SyncStatusFragment.featureHelper")
  public static void injectFeatureHelper(SyncStatusFragment instance, FeatureHelper featureHelper) {
    instance.featureHelper = featureHelper;
  }
}