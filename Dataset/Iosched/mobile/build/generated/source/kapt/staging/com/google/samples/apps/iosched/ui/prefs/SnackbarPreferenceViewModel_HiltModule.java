package com.google.samples.apps.iosched.ui.prefs;

import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;
import javax.annotation.Generated;

@Generated("androidx.hilt.AndroidXHiltProcessor")
@Module
@InstallIn(ActivityRetainedComponent.class)
@OriginatingElement(
    topLevelClass = SnackbarPreferenceViewModel.class
)
public interface SnackbarPreferenceViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.google.samples.apps.iosched.ui.prefs.SnackbarPreferenceViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(
      SnackbarPreferenceViewModel_AssistedFactory factory);
}
