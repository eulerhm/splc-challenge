package com.woocommerce.android.ui.login;

import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.codegen.OriginatingElement;

@OriginatingElement(
    topLevelClass = WooLoginFragmentModule.class
)
@InstallIn(ActivityComponent.class)
@Module(
    includes = WooLoginFragmentModule.class
)
public final class HiltWrapper_WooLoginFragmentModule {
}
