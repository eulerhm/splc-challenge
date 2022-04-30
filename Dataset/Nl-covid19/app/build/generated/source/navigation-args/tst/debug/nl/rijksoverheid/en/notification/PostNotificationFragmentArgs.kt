package nl.rijksoverheid.en.notification

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class PostNotificationFragmentArgs(
  public val lastExposureLocalDateString: String,
  public val notificationReceivedLocalDateString: String? = null
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("lastExposureLocalDateString", this.lastExposureLocalDateString)
    result.putString("notificationReceivedLocalDateString",
        this.notificationReceivedLocalDateString)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): PostNotificationFragmentArgs {
      bundle.setClassLoader(PostNotificationFragmentArgs::class.java.classLoader)
      val __lastExposureLocalDateString : String?
      if (bundle.containsKey("lastExposureLocalDateString")) {
        __lastExposureLocalDateString = bundle.getString("lastExposureLocalDateString")
        if (__lastExposureLocalDateString == null) {
          throw IllegalArgumentException("Argument \"lastExposureLocalDateString\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"lastExposureLocalDateString\" is missing and does not have an android:defaultValue")
      }
      val __notificationReceivedLocalDateString : String?
      if (bundle.containsKey("notificationReceivedLocalDateString")) {
        __notificationReceivedLocalDateString =
            bundle.getString("notificationReceivedLocalDateString")
      } else {
        __notificationReceivedLocalDateString = null
      }
      return PostNotificationFragmentArgs(__lastExposureLocalDateString,
          __notificationReceivedLocalDateString)
    }
  }
}
