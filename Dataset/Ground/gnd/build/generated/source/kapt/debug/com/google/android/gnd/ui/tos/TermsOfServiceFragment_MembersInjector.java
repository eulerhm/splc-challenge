// Generated by Dagger (https://dagger.dev).
package com.google.android.gnd.ui.tos;

import com.google.android.gnd.ui.common.AbstractFragment_MembersInjector;
import com.google.android.gnd.ui.common.EphemeralPopups;
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
public final class TermsOfServiceFragment_MembersInjector implements MembersInjector<TermsOfServiceFragment> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  private final Provider<EphemeralPopups> popupsProvider;

  public TermsOfServiceFragment_MembersInjector(Provider<ViewModelFactory> viewModelFactoryProvider,
      Provider<EphemeralPopups> popupsProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
    this.popupsProvider = popupsProvider;
  }

  public static MembersInjector<TermsOfServiceFragment> create(
      Provider<ViewModelFactory> viewModelFactoryProvider,
      Provider<EphemeralPopups> popupsProvider) {
    return new TermsOfServiceFragment_MembersInjector(viewModelFactoryProvider, popupsProvider);
  }

  @Override
  public void injectMembers(TermsOfServiceFragment instance) {
    AbstractFragment_MembersInjector.injectViewModelFactory(instance, viewModelFactoryProvider.get());
    injectPopups(instance, popupsProvider.get());
  }

  @InjectedFieldSignature("com.google.android.gnd.ui.tos.TermsOfServiceFragment.popups")
  public static void injectPopups(TermsOfServiceFragment instance, EphemeralPopups popups) {
    instance.popups = popups;
  }
}