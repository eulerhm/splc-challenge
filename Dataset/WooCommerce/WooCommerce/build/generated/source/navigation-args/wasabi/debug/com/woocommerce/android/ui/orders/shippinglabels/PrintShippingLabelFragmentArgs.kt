package com.woocommerce.android.ui.orders.shippinglabels

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Boolean
import kotlin.Long
import kotlin.LongArray
import kotlin.jvm.JvmStatic

public data class PrintShippingLabelFragmentArgs(
  public val shippingLabelIds: LongArray,
  public val orderId: Long = 0L,
  public val isReprint: Boolean = true
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putLong("orderId", this.orderId)
    result.putLongArray("shippingLabelIds", this.shippingLabelIds)
    result.putBoolean("isReprint", this.isReprint)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("orderId", this.orderId)
    result.set("shippingLabelIds", this.shippingLabelIds)
    result.set("isReprint", this.isReprint)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): PrintShippingLabelFragmentArgs {
      bundle.setClassLoader(PrintShippingLabelFragmentArgs::class.java.classLoader)
      val __orderId : Long
      if (bundle.containsKey("orderId")) {
        __orderId = bundle.getLong("orderId")
      } else {
        __orderId = 0L
      }
      val __shippingLabelIds : LongArray?
      if (bundle.containsKey("shippingLabelIds")) {
        __shippingLabelIds = bundle.getLongArray("shippingLabelIds")
        if (__shippingLabelIds == null) {
          throw IllegalArgumentException("Argument \"shippingLabelIds\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"shippingLabelIds\" is missing and does not have an android:defaultValue")
      }
      val __isReprint : Boolean
      if (bundle.containsKey("isReprint")) {
        __isReprint = bundle.getBoolean("isReprint")
      } else {
        __isReprint = true
      }
      return PrintShippingLabelFragmentArgs(__shippingLabelIds, __orderId, __isReprint)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        PrintShippingLabelFragmentArgs {
      val __orderId : Long?
      if (savedStateHandle.contains("orderId")) {
        __orderId = savedStateHandle["orderId"]
        if (__orderId == null) {
          throw IllegalArgumentException("Argument \"orderId\" of type long does not support null values")
        }
      } else {
        __orderId = 0L
      }
      val __shippingLabelIds : LongArray?
      if (savedStateHandle.contains("shippingLabelIds")) {
        __shippingLabelIds = savedStateHandle["shippingLabelIds"]
        if (__shippingLabelIds == null) {
          throw IllegalArgumentException("Argument \"shippingLabelIds\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"shippingLabelIds\" is missing and does not have an android:defaultValue")
      }
      val __isReprint : Boolean?
      if (savedStateHandle.contains("isReprint")) {
        __isReprint = savedStateHandle["isReprint"]
        if (__isReprint == null) {
          throw IllegalArgumentException("Argument \"isReprint\" of type boolean does not support null values")
        }
      } else {
        __isReprint = true
      }
      return PrintShippingLabelFragmentArgs(__shippingLabelIds, __orderId, __isReprint)
    }
  }
}
