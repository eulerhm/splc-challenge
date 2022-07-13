// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.ui.orders.shippinglabels.creation;

import androidx.lifecycle.SavedStateHandle;
import com.woocommerce.android.ui.orders.shippinglabels.ShippingLabelRepository;
import com.woocommerce.android.ui.products.ParameterRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ShippingPackageSelectorViewModel_Factory implements Factory<ShippingPackageSelectorViewModel> {
  private final Provider<SavedStateHandle> savedStateProvider;

  private final Provider<ParameterRepository> parameterRepositoryProvider;

  private final Provider<ShippingLabelRepository> shippingLabelRepositoryProvider;

  public ShippingPackageSelectorViewModel_Factory(Provider<SavedStateHandle> savedStateProvider,
      Provider<ParameterRepository> parameterRepositoryProvider,
      Provider<ShippingLabelRepository> shippingLabelRepositoryProvider) {
    this.savedStateProvider = savedStateProvider;
    this.parameterRepositoryProvider = parameterRepositoryProvider;
    this.shippingLabelRepositoryProvider = shippingLabelRepositoryProvider;
  }

  @Override
  public ShippingPackageSelectorViewModel get() {
    return newInstance(savedStateProvider.get(), parameterRepositoryProvider.get(), shippingLabelRepositoryProvider.get());
  }

  public static ShippingPackageSelectorViewModel_Factory create(
      Provider<SavedStateHandle> savedStateProvider,
      Provider<ParameterRepository> parameterRepositoryProvider,
      Provider<ShippingLabelRepository> shippingLabelRepositoryProvider) {
    return new ShippingPackageSelectorViewModel_Factory(savedStateProvider, parameterRepositoryProvider, shippingLabelRepositoryProvider);
  }

  public static ShippingPackageSelectorViewModel newInstance(SavedStateHandle savedState,
      ParameterRepository parameterRepository, ShippingLabelRepository shippingLabelRepository) {
    return new ShippingPackageSelectorViewModel(savedState, parameterRepository, shippingLabelRepository);
  }
}