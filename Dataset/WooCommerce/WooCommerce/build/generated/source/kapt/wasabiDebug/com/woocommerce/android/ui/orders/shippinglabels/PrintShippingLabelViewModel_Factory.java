// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.ui.orders.shippinglabels;

import androidx.lifecycle.SavedStateHandle;
import com.woocommerce.android.media.FileUtils;
import com.woocommerce.android.tools.NetworkStatus;
import com.woocommerce.android.util.Base64Decoder;
import com.woocommerce.android.util.CoroutineDispatchers;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PrintShippingLabelViewModel_Factory implements Factory<PrintShippingLabelViewModel> {
  private final Provider<SavedStateHandle> savedStateProvider;

  private final Provider<CoroutineDispatchers> dispatchersProvider;

  private final Provider<ShippingLabelRepository> repositoryProvider;

  private final Provider<NetworkStatus> networkStatusProvider;

  private final Provider<FileUtils> fileUtilsProvider;

  private final Provider<Base64Decoder> base64DecoderProvider;

  public PrintShippingLabelViewModel_Factory(Provider<SavedStateHandle> savedStateProvider,
      Provider<CoroutineDispatchers> dispatchersProvider,
      Provider<ShippingLabelRepository> repositoryProvider,
      Provider<NetworkStatus> networkStatusProvider, Provider<FileUtils> fileUtilsProvider,
      Provider<Base64Decoder> base64DecoderProvider) {
    this.savedStateProvider = savedStateProvider;
    this.dispatchersProvider = dispatchersProvider;
    this.repositoryProvider = repositoryProvider;
    this.networkStatusProvider = networkStatusProvider;
    this.fileUtilsProvider = fileUtilsProvider;
    this.base64DecoderProvider = base64DecoderProvider;
  }

  @Override
  public PrintShippingLabelViewModel get() {
    return newInstance(savedStateProvider.get(), dispatchersProvider.get(), repositoryProvider.get(), networkStatusProvider.get(), fileUtilsProvider.get(), base64DecoderProvider.get());
  }

  public static PrintShippingLabelViewModel_Factory create(
      Provider<SavedStateHandle> savedStateProvider,
      Provider<CoroutineDispatchers> dispatchersProvider,
      Provider<ShippingLabelRepository> repositoryProvider,
      Provider<NetworkStatus> networkStatusProvider, Provider<FileUtils> fileUtilsProvider,
      Provider<Base64Decoder> base64DecoderProvider) {
    return new PrintShippingLabelViewModel_Factory(savedStateProvider, dispatchersProvider, repositoryProvider, networkStatusProvider, fileUtilsProvider, base64DecoderProvider);
  }

  public static PrintShippingLabelViewModel newInstance(SavedStateHandle savedState,
      CoroutineDispatchers dispatchers, ShippingLabelRepository repository,
      NetworkStatus networkStatus, FileUtils fileUtils, Base64Decoder base64Decoder) {
    return new PrintShippingLabelViewModel(savedState, dispatchers, repository, networkStatus, fileUtils, base64Decoder);
  }
}