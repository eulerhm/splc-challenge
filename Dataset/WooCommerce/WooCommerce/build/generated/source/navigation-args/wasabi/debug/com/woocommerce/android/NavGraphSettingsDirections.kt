package com.woocommerce.android

import android.os.Bundle
import androidx.navigation.NavDirections
import kotlin.Int
import kotlin.String

public class NavGraphSettingsDirections private constructor() {
  private data class ActionGlobalWPComWebViewFragment(
    public val urlToLoad: String,
    public val urlToTriggerExit: String? = null
  ) : NavDirections {
    public override val actionId: Int = R.id.action_global_WPComWebViewFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("urlToLoad", this.urlToLoad)
        result.putString("urlToTriggerExit", this.urlToTriggerExit)
        return result
      }
  }

  public companion object {
    public fun actionGlobalWPComWebViewFragment(urlToLoad: String, urlToTriggerExit: String? =
        null): NavDirections = ActionGlobalWPComWebViewFragment(urlToLoad, urlToTriggerExit)
  }
}
