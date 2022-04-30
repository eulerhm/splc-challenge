package nl.rijksoverheid.en.notification

import android.os.Bundle
import androidx.navigation.NavDirections
import kotlin.Int
import kotlin.String
import nl.rijksoverheid.en.MainNavDirections
import nl.rijksoverheid.en.R

public class PostNotificationFragmentDirections private constructor() {
  private data class ActionPhoneCallNotSupportedDialog(
    public val phoneNumber: String
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_phone_call_not_supported_dialog

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("phoneNumber", this.phoneNumber)
      return result
    }
  }

  public companion object {
    public fun actionPhoneCallNotSupportedDialog(phoneNumber: String): NavDirections =
        ActionPhoneCallNotSupportedDialog(phoneNumber)

    public fun actionEndOfLife(): NavDirections = MainNavDirections.actionEndOfLife()

    public fun actionAppUpdateRequired(appStorePackage: String?): NavDirections =
        MainNavDirections.actionAppUpdateRequired(appStorePackage)
  }
}
