package com.google.samples.apps.iosched.tests.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import kotlinx.coroutines.CoroutineDispatcher;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TestCoroutinesModule_ProvidesMainDispatcherFactory implements Factory<CoroutineDispatcher> {
  @Override
  public CoroutineDispatcher get() {
    return providesMainDispatcher();
  }

  public static TestCoroutinesModule_ProvidesMainDispatcherFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CoroutineDispatcher providesMainDispatcher() {
    return Preconditions.checkNotNull(TestCoroutinesModule.INSTANCE.providesMainDispatcher(), "Cannot return null from a non-@Nullable @Provides method");
  }

  private static final class InstanceHolder {
    private static final TestCoroutinesModule_ProvidesMainDispatcherFactory INSTANCE = new TestCoroutinesModule_ProvidesMainDispatcherFactory();
  }
}
