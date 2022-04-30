package nl.rijksoverheid.en.labtest

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
import nl.rijksoverheid.en.about.FAQItemId

public class LabTestFragmentDirections private constructor() {
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
    public fun actionLabTestDone(generatedKey: String): NavDirections =
        ActionLabTestDone(generatedKey)

    public fun actionHowItWorks(faqItemId: FAQItemId): NavDirections = ActionHowItWorks(faqItemId)

    public fun actionEndOfLife(): NavDirections = MainNavDirections.actionEndOfLife()

    public fun actionAppUpdateRequired(appStorePackage: String?): NavDirections =
        MainNavDirections.actionAppUpdateRequired(appStorePackage)
  }
}
