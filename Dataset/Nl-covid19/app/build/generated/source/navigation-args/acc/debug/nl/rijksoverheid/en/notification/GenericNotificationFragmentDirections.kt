package nl.rijksoverheid.en.notification

import androidx.navigation.NavDirections
import kotlin.String
import nl.rijksoverheid.en.MainNavDirections

public class GenericNotificationFragmentDirections private constructor() {
  public companion object {
    public fun actionEndOfLife(): NavDirections = MainNavDirections.actionEndOfLife()

    public fun actionAppUpdateRequired(appStorePackage: String?): NavDirections =
        MainNavDirections.actionAppUpdateRequired(appStorePackage)
  }
}
