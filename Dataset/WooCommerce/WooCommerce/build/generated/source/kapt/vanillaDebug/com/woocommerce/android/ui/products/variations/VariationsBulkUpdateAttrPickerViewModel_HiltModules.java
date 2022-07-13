package com.woocommerce.android.ui.products.variations;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.internal.lifecycle.HiltViewModelMap;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import dagger.multibindings.IntoSet;
import dagger.multibindings.StringKey;
import java.lang.String;

@OriginatingElement(
    topLevelClass = VariationsBulkUpdateAttrPickerViewModel.class
)
public final class VariationsBulkUpdateAttrPickerViewModel_HiltModules {
  private VariationsBulkUpdateAttrPickerViewModel_HiltModules() {
  }

  @Module
  @InstallIn(ViewModelComponent.class)
  public abstract static class BindsModule {
    private BindsModule() {
    }

    @Binds
    @IntoMap
    @StringKey("com.woocommerce.android.ui.products.variations.VariationsBulkUpdateAttrPickerViewModel")
    @HiltViewModelMap
    public abstract ViewModel binds(VariationsBulkUpdateAttrPickerViewModel vm);
  }

  @Module
  @InstallIn(ActivityRetainedComponent.class)
  public static final class KeyModule {
    private KeyModule() {
    }

    @Provides
    @IntoSet
    @HiltViewModelMap.KeySet
    public static String provide() {
      return "com.woocommerce.android.ui.products.variations.VariationsBulkUpdateAttrPickerViewModel";
    }
  }
}