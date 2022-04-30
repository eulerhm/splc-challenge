package nl.rijksoverheid.en.about

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

public class AboutDetailFragmentDirections private constructor() {
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

  public companion object {
    public fun actionAboutDetail(faqItemId: FAQItemId): NavDirections = ActionAboutDetail(faqItemId)

    public fun actionSettings(): NavDirections = ActionOnlyNavDirections(R.id.action_settings)

    public fun actionEndOfLife(): NavDirections = MainNavDirections.actionEndOfLife()

    public fun actionAppUpdateRequired(appStorePackage: String?): NavDirections =
        MainNavDirections.actionAppUpdateRequired(appStorePackage)
  }
}
