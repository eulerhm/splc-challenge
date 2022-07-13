// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.ui.common.texteditor;

import androidx.lifecycle.SavedStateHandle;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SimpleTextEditorViewModel_Factory implements Factory<SimpleTextEditorViewModel> {
  private final Provider<SavedStateHandle> savedStateProvider;

  public SimpleTextEditorViewModel_Factory(Provider<SavedStateHandle> savedStateProvider) {
    this.savedStateProvider = savedStateProvider;
  }

  @Override
  public SimpleTextEditorViewModel get() {
    return newInstance(savedStateProvider.get());
  }

  public static SimpleTextEditorViewModel_Factory create(
      Provider<SavedStateHandle> savedStateProvider) {
    return new SimpleTextEditorViewModel_Factory(savedStateProvider);
  }

  public static SimpleTextEditorViewModel newInstance(SavedStateHandle savedState) {
    return new SimpleTextEditorViewModel(savedState);
  }
}