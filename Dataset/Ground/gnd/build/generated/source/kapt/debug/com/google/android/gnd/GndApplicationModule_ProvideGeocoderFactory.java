// Generated by Dagger (https://dagger.dev).
package com.google.android.gnd;

import android.content.Context;
import android.location.Geocoder;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GndApplicationModule_ProvideGeocoderFactory implements Factory<Geocoder> {
  private final Provider<Context> contextProvider;

  public GndApplicationModule_ProvideGeocoderFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public Geocoder get() {
    return provideGeocoder(contextProvider.get());
  }

  public static GndApplicationModule_ProvideGeocoderFactory create(
      Provider<Context> contextProvider) {
    return new GndApplicationModule_ProvideGeocoderFactory(contextProvider);
  }

  public static Geocoder provideGeocoder(Context context) {
    return Preconditions.checkNotNullFromProvides(GndApplicationModule.provideGeocoder(context));
  }
}