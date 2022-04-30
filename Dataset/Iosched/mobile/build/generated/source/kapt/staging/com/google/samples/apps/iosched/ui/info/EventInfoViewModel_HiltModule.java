package com.google.samples.apps.iosched.ui.info;

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
    topLevelClass = EventInfoViewModel.class
)
public interface EventInfoViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.google.samples.apps.iosched.ui.info.EventInfoViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(EventInfoViewModel_AssistedFactory factory);
}
