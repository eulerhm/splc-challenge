package nl.rijksoverheid.en.onboarding

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic
import nl.rijksoverheid.en.about.FAQItemId

public data class HowItWorksDetailFragmentArgs(
  public val faqItemId: FAQItemId
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
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

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): HowItWorksDetailFragmentArgs {
      bundle.setClassLoader(HowItWorksDetailFragmentArgs::class.java.classLoader)
      val __faqItemId : FAQItemId?
      if (bundle.containsKey("faqItemId")) {
        if (Parcelable::class.java.isAssignableFrom(FAQItemId::class.java) ||
            Serializable::class.java.isAssignableFrom(FAQItemId::class.java)) {
          __faqItemId = bundle.get("faqItemId") as FAQItemId?
        } else {
          throw UnsupportedOperationException(FAQItemId::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__faqItemId == null) {
          throw IllegalArgumentException("Argument \"faqItemId\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"faqItemId\" is missing and does not have an android:defaultValue")
      }
      return HowItWorksDetailFragmentArgs(__faqItemId)
    }
  }
}
