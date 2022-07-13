package com.woocommerce.android.ui.main;

import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.codegen.OriginatingElement;

@OriginatingElement(
    topLevelClass = MainModule.class
)
@InstallIn(ActivityComponent.class)
@Module(
    includes = MainModule.class
)
public final class HiltWrapper_MainModule {
}
