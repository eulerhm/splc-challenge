package com.google.samples.apps.iosched.ui.theme;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class ThemeViewModel_AssistedFactory implements ViewModelAssistedFactory<ThemeViewModel> {
  private final Provider<ThemedActivityDelegate> themedActivityDelegate;

  @Inject
  ThemeViewModel_AssistedFactory(Provider<ThemedActivityDelegate> themedActivityDelegate) {
    this.themedActivityDelegate = themedActivityDelegate;
  }

  @Override
  @NonNull
  public ThemeViewModel create(@NonNull SavedStateHandle arg0) {
    return new ThemeViewModel(themedActivityDelegate.get());
  }
}
