// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.ui.products;

import androidx.lifecycle.SavedStateHandle;
import com.woocommerce.android.tools.NetworkStatus;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GroupedProductListViewModel_Factory implements Factory<GroupedProductListViewModel> {
  private final Provider<SavedStateHandle> savedStateProvider;

  private final Provider<NetworkStatus> networkStatusProvider;

  private final Provider<GroupedProductListRepository> groupedProductListRepositoryProvider;

  public GroupedProductListViewModel_Factory(Provider<SavedStateHandle> savedStateProvider,
      Provider<NetworkStatus> networkStatusProvider,
      Provider<GroupedProductListRepository> groupedProductListRepositoryProvider) {
    this.savedStateProvider = savedStateProvider;
    this.networkStatusProvider = networkStatusProvider;
    this.groupedProductListRepositoryProvider = groupedProductListRepositoryProvider;
  }

  @Override
  public GroupedProductListViewModel get() {
    return newInstance(savedStateProvider.get(), networkStatusProvider.get(), groupedProductListRepositoryProvider.get());
  }

  public static GroupedProductListViewModel_Factory create(
      Provider<SavedStateHandle> savedStateProvider, Provider<NetworkStatus> networkStatusProvider,
      Provider<GroupedProductListRepository> groupedProductListRepositoryProvider) {
    return new GroupedProductListViewModel_Factory(savedStateProvider, networkStatusProvider, groupedProductListRepositoryProvider);
  }

  public static GroupedProductListViewModel newInstance(SavedStateHandle savedState,
      NetworkStatus networkStatus, GroupedProductListRepository groupedProductListRepository) {
    return new GroupedProductListViewModel(savedState, networkStatus, groupedProductListRepository);
  }
}