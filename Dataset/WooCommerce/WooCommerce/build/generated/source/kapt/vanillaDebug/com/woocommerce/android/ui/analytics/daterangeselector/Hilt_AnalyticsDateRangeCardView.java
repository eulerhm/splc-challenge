package com.woocommerce.android.ui.analytics.daterangeselector;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.card.MaterialCardView;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;
import java.lang.Object;
import java.lang.Override;

/**
 * A generated base class to be extended by the @dagger.hilt.android.AndroidEntryPoint annotated class. If using the Gradle plugin, this is swapped as the base class via bytecode transformation.
 */
public abstract class Hilt_AnalyticsDateRangeCardView extends MaterialCardView implements GeneratedComponentManagerHolder {
  private ViewComponentManager componentManager;

  private boolean injected;

  Hilt_AnalyticsDateRangeCardView(Context context) {
    super(context);
    inject();
  }

  Hilt_AnalyticsDateRangeCardView(Context context, AttributeSet attrs) {
    super(context, attrs);
    inject();
  }

  Hilt_AnalyticsDateRangeCardView(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
    inject();
  }

  @Override
  public final Object generatedComponent() {
    return this.componentManager().generatedComponent();
  }

  protected ViewComponentManager createComponentManager() {
    return new ViewComponentManager(this, false /* hasFragmentBindings */);
  }

  @Override
  public final ViewComponentManager componentManager() {
    if (componentManager == null) {
      componentManager = createComponentManager();
    }
    return componentManager;
  }

  protected void inject() {
    if (!injected) {
      injected = true;
      ((AnalyticsDateRangeCardView_GeneratedInjector) this.generatedComponent()).injectAnalyticsDateRangeCardView(UnsafeCasts.<AnalyticsDateRangeCardView>unsafeCast(this));
    }
  }
}
