package com.google.samples.apps.iosched.ui.signin;

import com.google.samples.apps.iosched.util.signin.SignInHandler;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SignOutDialogFragment_MembersInjector implements MembersInjector<SignOutDialogFragment> {
  private final Provider<SignInHandler> signInHandlerProvider;

  public SignOutDialogFragment_MembersInjector(Provider<SignInHandler> signInHandlerProvider) {
    this.signInHandlerProvider = signInHandlerProvider;
  }

  public static MembersInjector<SignOutDialogFragment> create(
      Provider<SignInHandler> signInHandlerProvider) {
    return new SignOutDialogFragment_MembersInjector(signInHandlerProvider);
  }

  @Override
  public void injectMembers(SignOutDialogFragment instance) {
    injectSignInHandler(instance, signInHandlerProvider.get());
  }

  @InjectedFieldSignature("com.google.samples.apps.iosched.ui.signin.SignOutDialogFragment.signInHandler")
  public static void injectSignInHandler(SignOutDialogFragment instance,
      SignInHandler signInHandler) {
    instance.signInHandler = signInHandler;
  }
}
