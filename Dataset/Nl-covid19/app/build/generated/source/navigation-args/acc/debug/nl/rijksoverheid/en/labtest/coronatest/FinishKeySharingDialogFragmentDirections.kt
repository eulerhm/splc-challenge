package nl.rijksoverheid.en.labtest.coronatest

import android.os.Bundle
import androidx.navigation.NavDirections
import kotlin.Int
import kotlin.String
import nl.rijksoverheid.en.MainNavDirections
import nl.rijksoverheid.en.R

public class FinishKeySharingDialogFragmentDirections private constructor() {
  private data class ActionLabTestDone(
    public val generatedKey: String
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_lab_test_done

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("generatedKey", this.generatedKey)
      return result
    }
  }

  public companion object {
    public fun actionLabTestDone(generatedKey: String): NavDirections =
        ActionLabTestDone(generatedKey)

    public fun actionEndOfLife(): NavDirections = MainNavDirections.actionEndOfLife()

    public fun actionAppUpdateRequired(appStorePackage: String?): NavDirections =
        MainNavDirections.actionAppUpdateRequired(appStorePackage)
  }
}
