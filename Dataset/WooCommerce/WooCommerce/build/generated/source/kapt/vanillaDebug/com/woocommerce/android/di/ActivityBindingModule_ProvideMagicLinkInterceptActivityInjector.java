package com.woocommerce.android.di;

import com.woocommerce.android.ui.login.MagicLinkInterceptActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityBindingModule_ProvideMagicLinkInterceptActivityInjector
          .MagicLinkInterceptActivitySubcomponent.class
)
public abstract class ActivityBindingModule_ProvideMagicLinkInterceptActivityInjector {
  private ActivityBindingModule_ProvideMagicLinkInterceptActivityInjector() {}

  @Binds
  @IntoMap
  @ClassKey(MagicLinkInterceptActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      MagicLinkInterceptActivitySubcomponent.Factory builder);

  @Subcomponent
  @ActivityScope
  public interface MagicLinkInterceptActivitySubcomponent
      extends AndroidInjector<MagicLinkInterceptActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<MagicLinkInterceptActivity> {}
  }
}
