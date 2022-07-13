package com.woocommerce.android.ui.prefs

import androidx.navigation.NavDirections
import com.woocommerce.android.NavGraphSettingsDirections
import kotlin.String

public class PrivacySettingsFragmentDirections private constructor() {
  public companion object {
    public fun actionGlobalWPComWebViewFragment(urlToLoad: String, urlToTriggerExit: String? =
        null): NavDirections =
        NavGraphSettingsDirections.actionGlobalWPComWebViewFragment(urlToLoad, urlToTriggerExit)
  }
}
