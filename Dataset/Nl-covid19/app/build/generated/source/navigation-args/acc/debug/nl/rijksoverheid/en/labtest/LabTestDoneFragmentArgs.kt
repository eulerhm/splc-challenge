package nl.rijksoverheid.en.labtest

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class LabTestDoneFragmentArgs(
  public val generatedKey: String
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("generatedKey", this.generatedKey)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): LabTestDoneFragmentArgs {
      bundle.setClassLoader(LabTestDoneFragmentArgs::class.java.classLoader)
      val __generatedKey : String?
      if (bundle.containsKey("generatedKey")) {
        __generatedKey = bundle.getString("generatedKey")
        if (__generatedKey == null) {
          throw IllegalArgumentException("Argument \"generatedKey\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"generatedKey\" is missing and does not have an android:defaultValue")
      }
      return LabTestDoneFragmentArgs(__generatedKey)
    }
  }
}
