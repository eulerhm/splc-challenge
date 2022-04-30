package nl.rijksoverheid.en.requesttest

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class RequestTestFragmentArgs(
  public val phoneNumber: String
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("phoneNumber", this.phoneNumber)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): RequestTestFragmentArgs {
      bundle.setClassLoader(RequestTestFragmentArgs::class.java.classLoader)
      val __phoneNumber : String?
      if (bundle.containsKey("phoneNumber")) {
        __phoneNumber = bundle.getString("phoneNumber")
        if (__phoneNumber == null) {
          throw IllegalArgumentException("Argument \"phoneNumber\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"phoneNumber\" is missing and does not have an android:defaultValue")
      }
      return RequestTestFragmentArgs(__phoneNumber)
    }
  }
}
