package com.woocommerce.android.ui.prefs;

import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.FragmentComponent;
import dagger.hilt.codegen.OriginatingElement;

@OriginatingElement(
    topLevelClass = PrivacySettingsModule.class
)
@InstallIn(FragmentComponent.class)
@Module(
    includes = PrivacySettingsModule.class
)
public final class HiltWrapper_PrivacySettingsModule {
}
