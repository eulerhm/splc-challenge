package com.google.samples.apps.iosched.tests.ui;

import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ApplicationComponent;
import dagger.hilt.android.internal.testing.TestInjector;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.internal.GeneratedEntryPoint;
import javax.annotation.Generated;

@OriginatingElement(
    topLevelClass = InfoTest.class
)
@GeneratedEntryPoint
@InstallIn(ApplicationComponent.class)
@Generated("dagger.hilt.processor.internal.root.TestInjectorGenerator")
public interface InfoTest_GeneratedInjector extends TestInjector<InfoTest> {
  void injectTest(InfoTest infoTest);
}
