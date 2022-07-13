package com.woocommerce.android.ui.common.wpcomwebview

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class WPComWebViewFragmentArgs(
  public val urlToLoad: String,
  public val urlToTriggerExit: String? = null
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("urlToLoad", this.urlToLoad)
    result.putString("urlToTriggerExit", this.urlToTriggerExit)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("urlToLoad", this.urlToLoad)
    result.set("urlToTriggerExit", this.urlToTriggerExit)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): WPComWebViewFragmentArgs {
      bundle.setClassLoader(WPComWebViewFragmentArgs::class.java.classLoader)
      val __urlToLoad : String?
      if (bundle.containsKey("urlToLoad")) {
        __urlToLoad = bundle.getString("urlToLoad")
        if (__urlToLoad == null) {
          throw IllegalArgumentException("Argument \"urlToLoad\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"urlToLoad\" is missing and does not have an android:defaultValue")
      }
      val __urlToTriggerExit : String?
      if (bundle.containsKey("urlToTriggerExit")) {
        __urlToTriggerExit = bundle.getString("urlToTriggerExit")
      } else {
        __urlToTriggerExit = null
      }
      return WPComWebViewFragmentArgs(__urlToLoad, __urlToTriggerExit)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): WPComWebViewFragmentArgs {
      val __urlToLoad : String?
      if (savedStateHandle.contains("urlToLoad")) {
        __urlToLoad = savedStateHandle["urlToLoad"]
        if (__urlToLoad == null) {
          throw IllegalArgumentException("Argument \"urlToLoad\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"urlToLoad\" is missing and does not have an android:defaultValue")
      }
      val __urlToTriggerExit : String?
      if (savedStateHandle.contains("urlToTriggerExit")) {
        __urlToTriggerExit = savedStateHandle["urlToTriggerExit"]
      } else {
        __urlToTriggerExit = null
      }
      return WPComWebViewFragmentArgs(__urlToLoad, __urlToTriggerExit)
    }
  }
}
