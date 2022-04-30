package nl.rijksoverheid.en.status

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class RemoveExposedMessageDialogFragmentArgs(
  public val formattedDate: String
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("formattedDate", this.formattedDate)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): RemoveExposedMessageDialogFragmentArgs {
      bundle.setClassLoader(RemoveExposedMessageDialogFragmentArgs::class.java.classLoader)
      val __formattedDate : String?
      if (bundle.containsKey("formattedDate")) {
        __formattedDate = bundle.getString("formattedDate")
        if (__formattedDate == null) {
          throw IllegalArgumentException("Argument \"formattedDate\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"formattedDate\" is missing and does not have an android:defaultValue")
      }
      return RemoveExposedMessageDialogFragmentArgs(__formattedDate)
    }
  }
}
