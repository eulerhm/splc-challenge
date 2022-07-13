// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.ui.orders.shippinglabels.creation;

import androidx.lifecycle.SavedStateHandle;
import com.woocommerce.android.ui.orders.shippinglabels.ShippingLabelRepository;
import com.woocommerce.android.ui.products.ParameterRepository;
import com.woocommerce.android.viewmodel.ResourceProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ShippingLabelCreateCustomPackageViewModel_Factory implements Factory<ShippingLabelCreateCustomPackageViewModel> {
  private final Provider<SavedStateHandle> savedStateProvider;

  private final Provider<ResourceProvider> resourceProvider;

  private final Provider<ShippingLabelRepository> shippingLabelRepositoryProvider;

  private final Provider<ParameterRepository> parameterRepositoryProvider;

  public ShippingLabelCreateCustomPackageViewModel_Factory(
      Provider<SavedStateHandle> savedStateProvider, Provider<ResourceProvider> resourceProvider,
      Provider<ShippingLabelRepository> shippingLabelRepositoryProvider,
      Provider<ParameterRepository> parameterRepositoryProvider) {
    this.savedStateProvider = savedStateProvider;
    this.resourceProvider = resourceProvider;
    this.shippingLabelRepositoryProvider = shippingLabelRepositoryProvider;
    this.parameterRepositoryProvider = parameterRepositoryProvider;
  }

  @Override
  public ShippingLabelCreateCustomPackageViewModel get() {
    return newInstance(savedStateProvider.get(), resourceProvider.get(), shippingLabelRepositoryProvider.get(), parameterRepositoryProvider.get());
  }

  public static ShippingLabelCreateCustomPackageViewModel_Factory create(
      Provider<SavedStateHandle> savedStateProvider, Provider<ResourceProvider> resourceProvider,
      Provider<ShippingLabelRepository> shippingLabelRepositoryProvider,
      Provider<ParameterRepository> parameterRepositoryProvider) {
    return new ShippingLabelCreateCustomPackageViewModel_Factory(savedStateProvider, resourceProvider, shippingLabelRepositoryProvider, parameterRepositoryProvider);
  }

  public static ShippingLabelCreateCustomPackageViewModel newInstance(SavedStateHandle savedState,
      ResourceProvider resourceProvider, ShippingLabelRepository shippingLabelRepository,
      ParameterRepository parameterRepository) {
    return new ShippingLabelCreateCustomPackageViewModel(savedState, resourceProvider, shippingLabelRepository, parameterRepository);
  }
}