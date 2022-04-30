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
public final class TestCoroutinesModule_ProvidesDefaultDispatcherFactory implements Factory<CoroutineDispatcher> {
  @Override
  public CoroutineDispatcher get() {
    return providesDefaultDispatcher();
  }

  public static TestCoroutinesModule_ProvidesDefaultDispatcherFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CoroutineDispatcher providesDefaultDispatcher() {
    return Preconditions.checkNotNull(TestCoroutinesModule.INSTANCE.providesDefaultDispatcher(), "Cannot return null from a non-@Nullable @Provides method");
  }

  private static final class InstanceHolder {
    private static final TestCoroutinesModule_ProvidesDefaultDispatcherFactory INSTANCE = new TestCoroutinesModule_ProvidesDefaultDispatcherFactory();
  }
}
