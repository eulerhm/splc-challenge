package nl.rijksoverheid.en.onboarding

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import nl.rijksoverheid.en.R

public class SkipConsentConfirmationDialogFragmentDirections private constructor() {
  public companion object {
    public fun actionNext(): NavDirections = ActionOnlyNavDirections(R.id.action_next)
  }
}
