package nl.rijksoverheid.en

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import kotlin.Int
import kotlin.String

public class MainNavDirections private constructor() {
  private data class ActionAppUpdateRequired(
    public val appStorePackage: String?
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_app_update_required

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("app_store_package", this.appStorePackage)
      return result
    }
  }

  public companion object {
    public fun actionEndOfLife(): NavDirections = ActionOnlyNavDirections(R.id.action_end_of_life)

    public fun actionAppUpdateRequired(appStorePackage: String?): NavDirections =
        ActionAppUpdateRequired(appStorePackage)
  }
}
