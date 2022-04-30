package nl.rijksoverheid.en.labtest.coronatest

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import nl.rijksoverheid.en.MainNavDirections
import nl.rijksoverheid.en.R
import nl.rijksoverheid.en.about.FAQItemId

public class CoronaTestKeySharingFragmentDirections private constructor() {
  private data class ActionHowItWorks(
    public val faqItemId: FAQItemId
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_how_it_works

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

  public companion object {
    public fun actionHowItWorks(faqItemId: FAQItemId): NavDirections = ActionHowItWorks(faqItemId)

    public fun actionFinishKeySharing(): NavDirections =
        ActionOnlyNavDirections(R.id.action_finish_key_sharing)

    public fun actionEndOfLife(): NavDirections = MainNavDirections.actionEndOfLife()

    public fun actionAppUpdateRequired(appStorePackage: String?): NavDirections =
        MainNavDirections.actionAppUpdateRequired(appStorePackage)
  }
}
