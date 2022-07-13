package com.woocommerce.android.ui.products.settings

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class ProductStatusFragmentArgs(
  public val status: String
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("status", this.status)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("status", this.status)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): ProductStatusFragmentArgs {
      bundle.setClassLoader(ProductStatusFragmentArgs::class.java.classLoader)
      val __status : String?
      if (bundle.containsKey("status")) {
        __status = bundle.getString("status")
        if (__status == null) {
          throw IllegalArgumentException("Argument \"status\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"status\" is missing and does not have an android:defaultValue")
      }
      return ProductStatusFragmentArgs(__status)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): ProductStatusFragmentArgs {
      val __status : String?
      if (savedStateHandle.contains("status")) {
        __status = savedStateHandle["status"]
        if (__status == null) {
          throw IllegalArgumentException("Argument \"status\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"status\" is missing and does not have an android:defaultValue")
      }
      return ProductStatusFragmentArgs(__status)
    }
  }
}
