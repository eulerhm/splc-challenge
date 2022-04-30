package nl.rijksoverheid.en.status

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import nl.rijksoverheid.en.MainNavDirections
import nl.rijksoverheid.en.R

public class StatusFragmentDirections private constructor() {
  private data class ActionLabTest(
    public val showEnterTransition: Boolean = false
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_lab_test

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putBoolean("showEnterTransition", this.showEnterTransition)
      return result
    }
  }

  private data class ActionRequestTest(
    public val phoneNumber: String
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_request_test

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("phoneNumber", this.phoneNumber)
      return result
    }
  }

  private data class ActionPostNotification(
    public val lastExposureLocalDateString: String,
    public val notificationReceivedLocalDateString: String? = null
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_post_notification

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("lastExposureLocalDateString", this.lastExposureLocalDateString)
      result.putString("notificationReceivedLocalDateString",
          this.notificationReceivedLocalDateString)
      return result
    }
  }

  private data class ActionRemoveExposedMessage(
    public val formattedDate: String
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_remove_exposed_message

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("formattedDate", this.formattedDate)
      return result
    }
  }

  public companion object {
    public fun actionOnboarding(): NavDirections = ActionOnlyNavDirections(R.id.action_onboarding)

    public fun actionUpdatePlayServices(): NavDirections =
        ActionOnlyNavDirections(R.id.action_update_play_services)

    public fun actionKeySharingOptions(): NavDirections =
        ActionOnlyNavDirections(R.id.action_key_sharing_options)

    public fun actionLabTest(showEnterTransition: Boolean = false): NavDirections =
        ActionLabTest(showEnterTransition)

    public fun actionGenericNotification(): NavDirections =
        ActionOnlyNavDirections(R.id.action_generic_notification)

    public fun actionRequestTest(phoneNumber: String): NavDirections =
        ActionRequestTest(phoneNumber)

    public fun actionAbout(): NavDirections = ActionOnlyNavDirections(R.id.action_about)

    public fun actionPostNotification(lastExposureLocalDateString: String,
        notificationReceivedLocalDateString: String? = null): NavDirections =
        ActionPostNotification(lastExposureLocalDateString, notificationReceivedLocalDateString)

    public fun actionRemoveExposedMessage(formattedDate: String): NavDirections =
        ActionRemoveExposedMessage(formattedDate)

    public fun actionEnableLocationServices(): NavDirections =
        ActionOnlyNavDirections(R.id.action_enable_location_services)

    public fun actionSettings(): NavDirections = ActionOnlyNavDirections(R.id.action_settings)

    public fun actionNavInternetRequired(): NavDirections =
        ActionOnlyNavDirections(R.id.action_nav_internet_required)

    public fun actionEndOfLife(): NavDirections = MainNavDirections.actionEndOfLife()

    public fun actionAppUpdateRequired(appStorePackage: String?): NavDirections =
        MainNavDirections.actionAppUpdateRequired(appStorePackage)
  }
}
