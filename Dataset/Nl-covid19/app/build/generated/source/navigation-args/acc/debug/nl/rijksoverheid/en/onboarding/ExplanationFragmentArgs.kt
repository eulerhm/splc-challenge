package nl.rijksoverheid.en.onboarding

import android.os.Bundle
import androidx.navigation.NavArgs
import kotlin.Boolean
import kotlin.Int
import kotlin.jvm.JvmStatic
import nl.rijksoverheid.en.R

public data class ExplanationFragmentArgs(
  public val fromFirstPage: Boolean = false,
  public val isExample: Boolean = true,
  public val title: Int = R.string.onboarding_example_2_headline,
  public val description: Int = R.string.onboarding_example_2_description,
  public val illustration: Int = R.drawable.illustration_explanation_example_2,
  public val animation: Int = 0
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putBoolean("fromFirstPage", this.fromFirstPage)
    result.putBoolean("isExample", this.isExample)
    result.putInt("title", this.title)
    result.putInt("description", this.description)
    result.putInt("illustration", this.illustration)
    result.putInt("animation", this.animation)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): ExplanationFragmentArgs {
      bundle.setClassLoader(ExplanationFragmentArgs::class.java.classLoader)
      val __fromFirstPage : Boolean
      if (bundle.containsKey("fromFirstPage")) {
        __fromFirstPage = bundle.getBoolean("fromFirstPage")
      } else {
        __fromFirstPage = false
      }
      val __isExample : Boolean
      if (bundle.containsKey("isExample")) {
        __isExample = bundle.getBoolean("isExample")
      } else {
        __isExample = true
      }
      val __title : Int
      if (bundle.containsKey("title")) {
        __title = bundle.getInt("title")
      } else {
        __title = R.string.onboarding_example_2_headline
      }
      val __description : Int
      if (bundle.containsKey("description")) {
        __description = bundle.getInt("description")
      } else {
        __description = R.string.onboarding_example_2_description
      }
      val __illustration : Int
      if (bundle.containsKey("illustration")) {
        __illustration = bundle.getInt("illustration")
      } else {
        __illustration = R.drawable.illustration_explanation_example_2
      }
      val __animation : Int
      if (bundle.containsKey("animation")) {
        __animation = bundle.getInt("animation")
      } else {
        __animation = 0
      }
      return ExplanationFragmentArgs(__fromFirstPage, __isExample, __title, __description,
          __illustration, __animation)
    }
  }
}
