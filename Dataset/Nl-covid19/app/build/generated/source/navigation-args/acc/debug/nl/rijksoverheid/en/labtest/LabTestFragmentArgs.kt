package nl.rijksoverheid.en.labtest

import android.os.Bundle
import androidx.navigation.NavArgs
import kotlin.Boolean
import kotlin.jvm.JvmStatic

public data class LabTestFragmentArgs(
  public val showEnterTransition: Boolean = false
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putBoolean("showEnterTransition", this.showEnterTransition)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): LabTestFragmentArgs {
      bundle.setClassLoader(LabTestFragmentArgs::class.java.classLoader)
      val __showEnterTransition : Boolean
      if (bundle.containsKey("showEnterTransition")) {
        __showEnterTransition = bundle.getBoolean("showEnterTransition")
      } else {
        __showEnterTransition = false
      }
      return LabTestFragmentArgs(__showEnterTransition)
    }
  }
}
