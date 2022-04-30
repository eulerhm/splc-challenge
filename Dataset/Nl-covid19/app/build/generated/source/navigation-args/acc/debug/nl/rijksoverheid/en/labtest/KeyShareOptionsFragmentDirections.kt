package nl.rijksoverheid.en.labtest

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import nl.rijksoverheid.en.MainNavDirections
import nl.rijksoverheid.en.R

public class KeyShareOptionsFragmentDirections private constructor() {
  private data class ActionLabTest(
    public val showEnterTransition: Boolean = true
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_lab_test

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putBoolean("showEnterTransition", this.showEnterTransition)
      return result
    }
  }

  public companion object {
    public fun actionLabTest(showEnterTransition: Boolean = true): NavDirections =
        ActionLabTest(showEnterTransition)

    public fun actionCoronaTestKeySharing(): NavDirections =
        ActionOnlyNavDirections(R.id.action_corona_test_key_sharing)

    public fun actionEndOfLife(): NavDirections = MainNavDirections.actionEndOfLife()

    public fun actionAppUpdateRequired(appStorePackage: String?): NavDirections =
        MainNavDirections.actionAppUpdateRequired(appStorePackage)
  }
}
