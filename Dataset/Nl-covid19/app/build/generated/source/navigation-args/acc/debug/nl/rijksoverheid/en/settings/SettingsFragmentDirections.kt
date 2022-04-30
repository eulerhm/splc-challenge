package nl.rijksoverheid.en.settings

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import kotlin.String
import nl.rijksoverheid.en.MainNavDirections
import nl.rijksoverheid.en.R

public class SettingsFragmentDirections private constructor() {
  public companion object {
    public fun actionEnableLocationServices(): NavDirections =
        ActionOnlyNavDirections(R.id.action_enable_location_services)

    public fun actionPauseConfirmation(): NavDirections =
        ActionOnlyNavDirections(R.id.action_pause_confirmation)

    public fun actionSelectPauseDuration(): NavDirections =
        ActionOnlyNavDirections(R.id.action_select_pause_duration)

    public fun actionEndOfLife(): NavDirections = MainNavDirections.actionEndOfLife()

    public fun actionAppUpdateRequired(appStorePackage: String?): NavDirections =
        MainNavDirections.actionAppUpdateRequired(appStorePackage)
  }
}
