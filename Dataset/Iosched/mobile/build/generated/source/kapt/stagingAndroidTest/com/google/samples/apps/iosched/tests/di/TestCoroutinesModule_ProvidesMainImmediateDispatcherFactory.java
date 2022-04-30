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
public final class TestCoroutinesModule_ProvidesMainImmediateDispatcherFactory implements Factory<CoroutineDispatcher> {
  @Override
  public CoroutineDispatcher get() {
    return providesMainImmediateDispatcher();
  }

  public static TestCoroutinesModule_ProvidesMainImmediateDispatcherFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CoroutineDispatcher providesMainImmediateDispatcher() {
    return Preconditions.checkNotNull(TestCoroutinesModule.INSTANCE.providesMainImmediateDispatcher(), "Cannot return null from a non-@Nullable @Provides method");
  }

  private static final class InstanceHolder {
    private static final TestCoroutinesModule_ProvidesMainImmediateDispatcherFactory INSTANCE = new TestCoroutinesModule_ProvidesMainImmediateDispatcherFactory();
  }
}
