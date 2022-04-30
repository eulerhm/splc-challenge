package nl.rijksoverheid.en.about

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import nl.rijksoverheid.en.MainNavDirections
import nl.rijksoverheid.en.R

public class AboutFragmentDirections private constructor() {
  private data class ActionAboutDetail(
    public val faqItemId: FAQItemId
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_about_detail

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(FAQItemId::class.java)) {
        result.putParcelable("faqItemId", this.faqItemId as Parcelable)
      } else if (Serializable::class.java.isAssignableFrom(FAQItemId::class.java)) {
        result.putSerializable("faqItemId", this.faqItemId as Serializable)
      } else {
        throw UnsupportedOperationException(FAQItemId::class.java.name +
            " must implement Parcelable or Serializable or must be an Enum.")
      }
      return result
    }
  }

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
    public fun actionAboutDetail(faqItemId: FAQItemId): NavDirections = ActionAboutDetail(faqItemId)

    public fun actionPhoneCallNotSupportedDialog(phoneNumber: String): NavDirections =
        ActionPhoneCallNotSupportedDialog(phoneNumber)

    public fun actionEndOfLife(): NavDirections = MainNavDirections.actionEndOfLife()

    public fun actionAppUpdateRequired(appStorePackage: String?): NavDirections =
        MainNavDirections.actionAppUpdateRequired(appStorePackage)
  }
}
