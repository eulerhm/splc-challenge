package com.google.samples.apps.iosched.ui.map;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper;
import com.google.samples.apps.iosched.shared.domain.prefs.MyLocationOptedInUseCase;
import com.google.samples.apps.iosched.shared.domain.prefs.OptIntoMyLocationUseCase;
import com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class MapViewModel_AssistedFactory implements ViewModelAssistedFactory<MapViewModel> {
  private final Provider<LoadGeoJsonFeaturesUseCase> loadGeoJsonFeaturesUseCase;

  private final Provider<AnalyticsHelper> analyticsHelper;

  private final Provider<SignInViewModelDelegate> signInViewModelDelegate;

  private final Provider<OptIntoMyLocationUseCase> optIntoMyLocationUseCase;

  private final Provider<MyLocationOptedInUseCase> myLocationOptedInUseCase;

  @Inject
  MapViewModel_AssistedFactory(Provider<LoadGeoJsonFeaturesUseCase> loadGeoJsonFeaturesUseCase,
      Provider<AnalyticsHelper> analyticsHelper,
      Provider<SignInViewModelDelegate> signInViewModelDelegate,
      Provider<OptIntoMyLocationUseCase> optIntoMyLocationUseCase,
      Provider<MyLocationOptedInUseCase> myLocationOptedInUseCase) {
    this.loadGeoJsonFeaturesUseCase = loadGeoJsonFeaturesUseCase;
    this.analyticsHelper = analyticsHelper;
    this.signInViewModelDelegate = signInViewModelDelegate;
    this.optIntoMyLocationUseCase = optIntoMyLocationUseCase;
    this.myLocationOptedInUseCase = myLocationOptedInUseCase;
  }

  @Override
  @NonNull
  public MapViewModel create(@NonNull SavedStateHandle arg0) {
    return new MapViewModel(loadGeoJsonFeaturesUseCase.get(), analyticsHelper.get(),
        signInViewModelDelegate.get(), optIntoMyLocationUseCase.get(),
        myLocationOptedInUseCase.get());
  }
}
