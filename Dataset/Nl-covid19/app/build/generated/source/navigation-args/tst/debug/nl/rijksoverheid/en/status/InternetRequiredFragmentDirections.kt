package nl.rijksoverheid.en.status

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import kotlin.String
import nl.rijksoverheid.en.MainNavDirections
import nl.rijksoverheid.en.R

public class InternetRequiredFragmentDirections private constructor() {
  public companion object {
    public fun actionShowSettings(): NavDirections =
        ActionOnlyNavDirections(R.id.action_show_settings)

    public fun actionEndOfLife(): NavDirections = MainNavDirections.actionEndOfLife()

    public fun actionAppUpdateRequired(appStorePackage: String?): NavDirections =
        MainNavDirections.actionAppUpdateRequired(appStorePackage)
  }
}
