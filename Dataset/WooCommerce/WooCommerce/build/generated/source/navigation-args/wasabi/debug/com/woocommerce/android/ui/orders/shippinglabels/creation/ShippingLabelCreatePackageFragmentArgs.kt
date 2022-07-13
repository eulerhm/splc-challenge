package com.woocommerce.android.ui.orders.shippinglabels.creation

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Int
import kotlin.jvm.JvmStatic

public data class ShippingLabelCreatePackageFragmentArgs(
  public val position: Int
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putInt("position", this.position)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("position", this.position)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): ShippingLabelCreatePackageFragmentArgs {
      bundle.setClassLoader(ShippingLabelCreatePackageFragmentArgs::class.java.classLoader)
      val __position : Int
      if (bundle.containsKey("position")) {
        __position = bundle.getInt("position")
      } else {
        throw IllegalArgumentException("Required argument \"position\" is missing and does not have an android:defaultValue")
      }
      return ShippingLabelCreatePackageFragmentArgs(__position)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        ShippingLabelCreatePackageFragmentArgs {
      val __position : Int?
      if (savedStateHandle.contains("position")) {
        __position = savedStateHandle["position"]
        if (__position == null) {
          throw IllegalArgumentException("Argument \"position\" of type integer does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"position\" is missing and does not have an android:defaultValue")
      }
      return ShippingLabelCreatePackageFragmentArgs(__position)
    }
  }
}
