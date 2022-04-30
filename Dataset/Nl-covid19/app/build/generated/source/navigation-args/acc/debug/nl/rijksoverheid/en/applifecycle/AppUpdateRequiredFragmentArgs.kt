package nl.rijksoverheid.en.applifecycle

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class AppUpdateRequiredFragmentArgs(
  public val appStorePackage: String?
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("app_store_package", this.appStorePackage)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): AppUpdateRequiredFragmentArgs {
      bundle.setClassLoader(AppUpdateRequiredFragmentArgs::class.java.classLoader)
      val __appStorePackage : String?
      if (bundle.containsKey("app_store_package")) {
        __appStorePackage = bundle.getString("app_store_package")
      } else {
        throw IllegalArgumentException("Required argument \"app_store_package\" is missing and does not have an android:defaultValue")
      }
      return AppUpdateRequiredFragmentArgs(__appStorePackage)
    }
  }
}
