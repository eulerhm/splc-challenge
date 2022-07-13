// Generated by Dagger (https://dagger.dev).
package com.google.android.gnd;

import com.google.android.gnd.persistence.remote.FakeRemoteDataStore;
import com.google.android.gnd.system.auth.FakeAuthenticationManager;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AcceptTermsOfServiceTest_MembersInjector implements MembersInjector<AcceptTermsOfServiceTest> {
  private final Provider<FakeAuthenticationManager> fakeAuthenticationManagerProvider;

  private final Provider<FakeRemoteDataStore> fakeRemoteDataStoreProvider;

  public AcceptTermsOfServiceTest_MembersInjector(
      Provider<FakeAuthenticationManager> fakeAuthenticationManagerProvider,
      Provider<FakeRemoteDataStore> fakeRemoteDataStoreProvider) {
    this.fakeAuthenticationManagerProvider = fakeAuthenticationManagerProvider;
    this.fakeRemoteDataStoreProvider = fakeRemoteDataStoreProvider;
  }

  public static MembersInjector<AcceptTermsOfServiceTest> create(
      Provider<FakeAuthenticationManager> fakeAuthenticationManagerProvider,
      Provider<FakeRemoteDataStore> fakeRemoteDataStoreProvider) {
    return new AcceptTermsOfServiceTest_MembersInjector(fakeAuthenticationManagerProvider, fakeRemoteDataStoreProvider);
  }

  @Override
  public void injectMembers(AcceptTermsOfServiceTest instance) {
    injectFakeAuthenticationManager(instance, fakeAuthenticationManagerProvider.get());
    injectFakeRemoteDataStore(instance, fakeRemoteDataStoreProvider.get());
  }

  @InjectedFieldSignature("com.google.android.gnd.AcceptTermsOfServiceTest.fakeAuthenticationManager")
  public static void injectFakeAuthenticationManager(AcceptTermsOfServiceTest instance,
      FakeAuthenticationManager fakeAuthenticationManager) {
    instance.fakeAuthenticationManager = fakeAuthenticationManager;
  }

  @InjectedFieldSignature("com.google.android.gnd.AcceptTermsOfServiceTest.fakeRemoteDataStore")
  public static void injectFakeRemoteDataStore(AcceptTermsOfServiceTest instance,
      FakeRemoteDataStore fakeRemoteDataStore) {
    instance.fakeRemoteDataStore = fakeRemoteDataStore;
  }
}