// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.ui.orders.filters.domain;

import com.woocommerce.android.ui.orders.filters.data.OrderFiltersRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GetSelectedOrderFiltersCount_Factory implements Factory<GetSelectedOrderFiltersCount> {
  private final Provider<OrderFiltersRepository> orderFiltersRepositoryProvider;

  public GetSelectedOrderFiltersCount_Factory(
      Provider<OrderFiltersRepository> orderFiltersRepositoryProvider) {
    this.orderFiltersRepositoryProvider = orderFiltersRepositoryProvider;
  }

  @Override
  public GetSelectedOrderFiltersCount get() {
    return newInstance(orderFiltersRepositoryProvider.get());
  }

  public static GetSelectedOrderFiltersCount_Factory create(
      Provider<OrderFiltersRepository> orderFiltersRepositoryProvider) {
    return new GetSelectedOrderFiltersCount_Factory(orderFiltersRepositoryProvider);
  }

  public static GetSelectedOrderFiltersCount newInstance(
      OrderFiltersRepository orderFiltersRepository) {
    return new GetSelectedOrderFiltersCount(orderFiltersRepository);
  }
}