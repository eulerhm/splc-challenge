package com.woocommerce.android.ui.orders.tracking

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.jvm.JvmStatic

public data class AddOrderShipmentTrackingFragmentArgs(
  public val orderId: Long,
  public val orderTrackingProvider: String? = "null",
  public val isCustomProvider: Boolean = false
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putLong("orderId", this.orderId)
    result.putString("orderTrackingProvider", this.orderTrackingProvider)
    result.putBoolean("isCustomProvider", this.isCustomProvider)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("orderId", this.orderId)
    result.set("orderTrackingProvider", this.orderTrackingProvider)
    result.set("isCustomProvider", this.isCustomProvider)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): AddOrderShipmentTrackingFragmentArgs {
      bundle.setClassLoader(AddOrderShipmentTrackingFragmentArgs::class.java.classLoader)
      val __orderId : Long
      if (bundle.containsKey("orderId")) {
        __orderId = bundle.getLong("orderId")
      } else {
        throw IllegalArgumentException("Required argument \"orderId\" is missing and does not have an android:defaultValue")
      }
      val __orderTrackingProvider : String?
      if (bundle.containsKey("orderTrackingProvider")) {
        __orderTrackingProvider = bundle.getString("orderTrackingProvider")
      } else {
        __orderTrackingProvider = "null"
      }
      val __isCustomProvider : Boolean
      if (bundle.containsKey("isCustomProvider")) {
        __isCustomProvider = bundle.getBoolean("isCustomProvider")
      } else {
        __isCustomProvider = false
      }
      return AddOrderShipmentTrackingFragmentArgs(__orderId, __orderTrackingProvider,
          __isCustomProvider)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        AddOrderShipmentTrackingFragmentArgs {
      val __orderId : Long?
      if (savedStateHandle.contains("orderId")) {
        __orderId = savedStateHandle["orderId"]
        if (__orderId == null) {
          throw IllegalArgumentException("Argument \"orderId\" of type long does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"orderId\" is missing and does not have an android:defaultValue")
      }
      val __orderTrackingProvider : String?
      if (savedStateHandle.contains("orderTrackingProvider")) {
        __orderTrackingProvider = savedStateHandle["orderTrackingProvider"]
      } else {
        __orderTrackingProvider = "null"
      }
      val __isCustomProvider : Boolean?
      if (savedStateHandle.contains("isCustomProvider")) {
        __isCustomProvider = savedStateHandle["isCustomProvider"]
        if (__isCustomProvider == null) {
          throw IllegalArgumentException("Argument \"isCustomProvider\" of type boolean does not support null values")
        }
      } else {
        __isCustomProvider = false
      }
      return AddOrderShipmentTrackingFragmentArgs(__orderId, __orderTrackingProvider,
          __isCustomProvider)
    }
  }
}
