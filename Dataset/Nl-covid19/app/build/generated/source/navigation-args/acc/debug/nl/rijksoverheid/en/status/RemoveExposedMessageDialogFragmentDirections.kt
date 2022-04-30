package nl.rijksoverheid.en.status

import androidx.navigation.NavDirections
import kotlin.String
import nl.rijksoverheid.en.MainNavDirections

public class RemoveExposedMessageDialogFragmentDirections private constructor() {
  public companion object {
    public fun actionEndOfLife(): NavDirections = MainNavDirections.actionEndOfLife()

    public fun actionAppUpdateRequired(appStorePackage: String?): NavDirections =
        MainNavDirections.actionAppUpdateRequired(appStorePackage)
  }
}
