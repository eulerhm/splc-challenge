package nl.rijksoverheid.en.onboarding

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import nl.rijksoverheid.en.R

public class EnableApiFragmentDirections private constructor() {
  public companion object {
    public fun actionExplain(): NavDirections = ActionOnlyNavDirections(R.id.action_explain)

    public fun actionSkipConsentConfirmation(): NavDirections =
        ActionOnlyNavDirections(R.id.action_skip_consent_confirmation)

    public fun actionNext(): NavDirections = ActionOnlyNavDirections(R.id.action_next)
  }
}
