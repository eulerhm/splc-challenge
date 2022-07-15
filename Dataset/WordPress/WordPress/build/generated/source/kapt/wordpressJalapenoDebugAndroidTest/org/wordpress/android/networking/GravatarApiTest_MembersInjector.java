// Generated by Dagger (https://dagger.dev).
package org.wordpress.android.networking;

import android.content.Context;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GravatarApiTest_MembersInjector implements MembersInjector<GravatarApiTest> {
  private final Provider<Context> mContextProvider;

  public GravatarApiTest_MembersInjector(Provider<Context> mContextProvider) {
    this.mContextProvider = mContextProvider;
  }

  public static MembersInjector<GravatarApiTest> create(Provider<Context> mContextProvider) {
    return new GravatarApiTest_MembersInjector(mContextProvider);
  }

  @Override
  public void injectMembers(GravatarApiTest instance) {
    injectMContext(instance, mContextProvider.get());
  }

  @InjectedFieldSignature("org.wordpress.android.networking.GravatarApiTest.mContext")
  public static void injectMContext(GravatarApiTest instance, Context mContext) {
    instance.mContext = mContext;
  }
}