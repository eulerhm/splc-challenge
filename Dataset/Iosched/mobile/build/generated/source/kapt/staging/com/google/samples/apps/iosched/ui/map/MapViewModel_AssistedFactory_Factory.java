package com.google.samples.apps.iosched.ui.map;

import com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper;
import com.google.samples.apps.iosched.shared.domain.prefs.MyLocationOptedInUseCase;
import com.google.samples.apps.iosched.shared.domain.prefs.OptIntoMyLocationUseCase;
import com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate;
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
public final class MapViewModel_AssistedFactory_Factory implements Factory<MapViewModel_AssistedFactory> {
  private final Provider<LoadGeoJsonFeaturesUseCase> loadGeoJsonFeaturesUseCaseProvider;

  private final Provider<AnalyticsHelper> analyticsHelperProvider;

  private final Provider<SignInViewModelDelegate> signInViewModelDelegateProvider;

  private final Provider<OptIntoMyLocationUseCase> optIntoMyLocationUseCaseProvider;

  private final Provider<MyLocationOptedInUseCase> myLocationOptedInUseCaseProvider;

  public MapViewModel_AssistedFactory_Factory(
      Provider<LoadGeoJsonFeaturesUseCase> loadGeoJsonFeaturesUseCaseProvider,
      Provider<AnalyticsHelper> analyticsHelperProvider,
      Provider<SignInViewModelDelegate> signInViewModelDelegateProvider,
      Provider<OptIntoMyLocationUseCase> optIntoMyLocationUseCaseProvider,
      Provider<MyLocationOptedInUseCase> myLocationOptedInUseCaseProvider) {
    this.loadGeoJsonFeaturesUseCaseProvider = loadGeoJsonFeaturesUseCaseProvider;
    this.analyticsHelperProvider = analyticsHelperProvider;
    this.signInViewModelDelegateProvider = signInViewModelDelegateProvider;
    this.optIntoMyLocationUseCaseProvider = optIntoMyLocationUseCaseProvider;
    this.myLocationOptedInUseCaseProvider = myLocationOptedInUseCaseProvider;
  }

  @Override
  public MapViewModel_AssistedFactory get() {
    return newInstance(loadGeoJsonFeaturesUseCaseProvider, analyticsHelperProvider, signInViewModelDelegateProvider, optIntoMyLocationUseCaseProvider, myLocationOptedInUseCaseProvider);
  }

  public static MapViewModel_AssistedFactory_Factory create(
      Provider<LoadGeoJsonFeaturesUseCase> loadGeoJsonFeaturesUseCaseProvider,
      Provider<AnalyticsHelper> analyticsHelperProvider,
      Provider<SignInViewModelDelegate> signInViewModelDelegateProvider,
      Provider<OptIntoMyLocationUseCase> optIntoMyLocationUseCaseProvider,
      Provider<MyLocationOptedInUseCase> myLocationOptedInUseCaseProvider) {
    return new MapViewModel_AssistedFactory_Factory(loadGeoJsonFeaturesUseCaseProvider, analyticsHelperProvider, signInViewModelDelegateProvider, optIntoMyLocationUseCaseProvider, myLocationOptedInUseCaseProvider);
  }

  public static MapViewModel_AssistedFactory newInstance(
      Provider<LoadGeoJsonFeaturesUseCase> loadGeoJsonFeaturesUseCase,
      Provider<AnalyticsHelper> analyticsHelper,
      Provider<SignInViewModelDelegate> signInViewModelDelegate,
      Provider<OptIntoMyLocationUseCase> optIntoMyLocationUseCase,
      Provider<MyLocationOptedInUseCase> myLocationOptedInUseCase) {
    return new MapViewModel_AssistedFactory(loadGeoJsonFeaturesUseCase, analyticsHelper, signInViewModelDelegate, optIntoMyLocationUseCase, myLocationOptedInUseCase);
  }
}
