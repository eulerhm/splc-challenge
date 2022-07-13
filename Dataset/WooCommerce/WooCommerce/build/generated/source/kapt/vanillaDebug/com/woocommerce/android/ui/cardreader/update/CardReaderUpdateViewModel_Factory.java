// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.ui.cardreader.update;

import androidx.lifecycle.SavedStateHandle;
import com.woocommerce.android.cardreader.CardReaderManager;
import com.woocommerce.android.ui.cardreader.CardReaderTracker;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CardReaderUpdateViewModel_Factory implements Factory<CardReaderUpdateViewModel> {
  private final Provider<CardReaderManager> cardReaderManagerProvider;

  private final Provider<CardReaderTracker> trackerProvider;

  private final Provider<SavedStateHandle> savedStateProvider;

  public CardReaderUpdateViewModel_Factory(Provider<CardReaderManager> cardReaderManagerProvider,
      Provider<CardReaderTracker> trackerProvider, Provider<SavedStateHandle> savedStateProvider) {
    this.cardReaderManagerProvider = cardReaderManagerProvider;
    this.trackerProvider = trackerProvider;
    this.savedStateProvider = savedStateProvider;
  }

  @Override
  public CardReaderUpdateViewModel get() {
    return newInstance(cardReaderManagerProvider.get(), trackerProvider.get(), savedStateProvider.get());
  }

  public static CardReaderUpdateViewModel_Factory create(
      Provider<CardReaderManager> cardReaderManagerProvider,
      Provider<CardReaderTracker> trackerProvider, Provider<SavedStateHandle> savedStateProvider) {
    return new CardReaderUpdateViewModel_Factory(cardReaderManagerProvider, trackerProvider, savedStateProvider);
  }

  public static CardReaderUpdateViewModel newInstance(CardReaderManager cardReaderManager,
      CardReaderTracker tracker, SavedStateHandle savedState) {
    return new CardReaderUpdateViewModel(cardReaderManager, tracker, savedState);
  }
}