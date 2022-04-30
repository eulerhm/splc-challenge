package com.google.samples.apps.iosched.tests;

import android.content.Context;
import dagger.hilt.android.internal.testing.TestApplicationComponentManager;
import dagger.hilt.android.internal.testing.TestApplicationComponentManagerHolder;
import dagger.hilt.internal.GeneratedComponentManager;
import java.lang.Object;
import java.lang.Override;
import javax.annotation.Generated;

@Generated("dagger.hilt.android.processor.internal.customtestapplication.CustomTestApplicationProcessor")
public final class CustomTestRunner_Application extends MainTestApplication implements GeneratedComponentManager<Object>, TestApplicationComponentManagerHolder {
  private TestApplicationComponentManager componentManager;

  @Override
  protected final void attachBaseContext(Context base) {
    super.attachBaseContext(base);
    componentManager = new TestApplicationComponentManager(this);
  }

  @Override
  public final Object componentManager() {
    return componentManager;
  }

  @Override
  public final Object generatedComponent() {
    return componentManager.generatedComponent();
  }
}
