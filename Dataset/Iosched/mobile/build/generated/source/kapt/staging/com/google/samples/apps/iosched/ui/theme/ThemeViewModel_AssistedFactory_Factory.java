package com.google.samples.apps.iosched.ui.theme;

import dagger.internal.Factory;
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
public final class ThemeViewModel_AssistedFactory_Factory implements Factory<ThemeViewModel_AssistedFactory> {
  private final Provider<ThemedActivityDelegate> themedActivityDelegateProvider;

  public ThemeViewModel_AssistedFactory_Factory(
      Provider<ThemedActivityDelegate> themedActivityDelegateProvider) {
    this.themedActivityDelegateProvider = themedActivityDelegateProvider;
  }

  @Override
  public ThemeViewModel_AssistedFactory get() {
    return newInstance(themedActivityDelegateProvider);
  }

  public static ThemeViewModel_AssistedFactory_Factory create(
      Provider<ThemedActivityDelegate> themedActivityDelegateProvider) {
    return new ThemeViewModel_AssistedFactory_Factory(themedActivityDelegateProvider);
  }

  public static ThemeViewModel_AssistedFactory newInstance(
      Provider<ThemedActivityDelegate> themedActivityDelegate) {
    return new ThemeViewModel_AssistedFactory(themedActivityDelegate);
  }
}
