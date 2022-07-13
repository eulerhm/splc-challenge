// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.model;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ShippingLabelMapper_Factory implements Factory<ShippingLabelMapper> {
  private final Provider<ShippingLabelAddressMapper> addressMapperProvider;

  public ShippingLabelMapper_Factory(Provider<ShippingLabelAddressMapper> addressMapperProvider) {
    this.addressMapperProvider = addressMapperProvider;
  }

  @Override
  public ShippingLabelMapper get() {
    return newInstance(addressMapperProvider.get());
  }

  public static ShippingLabelMapper_Factory create(
      Provider<ShippingLabelAddressMapper> addressMapperProvider) {
    return new ShippingLabelMapper_Factory(addressMapperProvider);
  }

  public static ShippingLabelMapper newInstance(ShippingLabelAddressMapper addressMapper) {
    return new ShippingLabelMapper(addressMapper);
  }
}