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
public final class SignInDialogFragment_MembersInjector implements MembersInjector<SignInDialogFragment> {
  private final Provider<SignInHandler> signInHandlerProvider;

  public SignInDialogFragment_MembersInjector(Provider<SignInHandler> signInHandlerProvider) {
    this.signInHandlerProvider = signInHandlerProvider;
  }

  public static MembersInjector<SignInDialogFragment> create(
      Provider<SignInHandler> signInHandlerProvider) {
    return new SignInDialogFragment_MembersInjector(signInHandlerProvider);
  }

  @Override
  public void injectMembers(SignInDialogFragment instance) {
    injectSignInHandler(instance, signInHandlerProvider.get());
  }

  @InjectedFieldSignature("com.google.samples.apps.iosched.ui.signin.SignInDialogFragment.signInHandler")
  public static void injectSignInHandler(SignInDialogFragment instance,
      SignInHandler signInHandler) {
    instance.signInHandler = signInHandler;
  }
}
