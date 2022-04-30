package com.google.samples.apps.iosched.ui.speaker;

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
    topLevelClass = SpeakerViewModel.class
)
public interface SpeakerViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.google.samples.apps.iosched.ui.speaker.SpeakerViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(SpeakerViewModel_AssistedFactory factory);
}
