// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.ui.orders.creation.variations;

import androidx.lifecycle.SavedStateHandle;
import com.woocommerce.android.ui.products.ProductDetailRepository;
import com.woocommerce.android.ui.products.variations.VariationRepository;
import com.woocommerce.android.util.CoroutineDispatchers;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class OrderCreationVariationSelectionViewModel_Factory implements Factory<OrderCreationVariationSelectionViewModel> {
  private final Provider<SavedStateHandle> savedStateHandleProvider;

  private final Provider<VariationRepository> variationRepositoryProvider;

  private final Provider<ProductDetailRepository> productRepositoryProvider;

  private final Provider<CoroutineDispatchers> dispatchersProvider;

  public OrderCreationVariationSelectionViewModel_Factory(
      Provider<SavedStateHandle> savedStateHandleProvider,
      Provider<VariationRepository> variationRepositoryProvider,
      Provider<ProductDetailRepository> productRepositoryProvider,
      Provider<CoroutineDispatchers> dispatchersProvider) {
    this.savedStateHandleProvider = savedStateHandleProvider;
    this.variationRepositoryProvider = variationRepositoryProvider;
    this.productRepositoryProvider = productRepositoryProvider;
    this.dispatchersProvider = dispatchersProvider;
  }

  @Override
  public OrderCreationVariationSelectionViewModel get() {
    return newInstance(savedStateHandleProvider.get(), variationRepositoryProvider.get(), productRepositoryProvider.get(), dispatchersProvider.get());
  }

  public static OrderCreationVariationSelectionViewModel_Factory create(
      Provider<SavedStateHandle> savedStateHandleProvider,
      Provider<VariationRepository> variationRepositoryProvider,
      Provider<ProductDetailRepository> productRepositoryProvider,
      Provider<CoroutineDispatchers> dispatchersProvider) {
    return new OrderCreationVariationSelectionViewModel_Factory(savedStateHandleProvider, variationRepositoryProvider, productRepositoryProvider, dispatchersProvider);
  }

  public static OrderCreationVariationSelectionViewModel newInstance(
      SavedStateHandle savedStateHandle, VariationRepository variationRepository,
      ProductDetailRepository productRepository, CoroutineDispatchers dispatchers) {
    return new OrderCreationVariationSelectionViewModel(savedStateHandle, variationRepository, productRepository, dispatchers);
  }
}