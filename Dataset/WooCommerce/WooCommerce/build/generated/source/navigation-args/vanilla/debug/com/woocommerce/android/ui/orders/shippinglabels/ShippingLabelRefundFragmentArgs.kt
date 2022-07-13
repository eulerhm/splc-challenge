package com.woocommerce.android.ui.orders.shippinglabels

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Long
import kotlin.jvm.JvmStatic

public data class ShippingLabelRefundFragmentArgs(
  public val orderId: Long = 0L,
  public val shippingLabelId: Long = 0L
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putLong("orderId", this.orderId)
    result.putLong("shippingLabelId", this.shippingLabelId)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("orderId", this.orderId)
    result.set("shippingLabelId", this.shippingLabelId)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): ShippingLabelRefundFragmentArgs {
      bundle.setClassLoader(ShippingLabelRefundFragmentArgs::class.java.classLoader)
      val __orderId : Long
      if (bundle.containsKey("orderId")) {
        __orderId = bundle.getLong("orderId")
      } else {
        __orderId = 0L
      }
      val __shippingLabelId : Long
      if (bundle.containsKey("shippingLabelId")) {
        __shippingLabelId = bundle.getLong("shippingLabelId")
      } else {
        __shippingLabelId = 0L
      }
      return ShippingLabelRefundFragmentArgs(__orderId, __shippingLabelId)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        ShippingLabelRefundFragmentArgs {
      val __orderId : Long?
      if (savedStateHandle.contains("orderId")) {
        __orderId = savedStateHandle["orderId"]
        if (__orderId == null) {
          throw IllegalArgumentException("Argument \"orderId\" of type long does not support null values")
        }
      } else {
        __orderId = 0L
      }
      val __shippingLabelId : Long?
      if (savedStateHandle.contains("shippingLabelId")) {
        __shippingLabelId = savedStateHandle["shippingLabelId"]
        if (__shippingLabelId == null) {
          throw IllegalArgumentException("Argument \"shippingLabelId\" of type long does not support null values")
        }
      } else {
        __shippingLabelId = 0L
      }
      return ShippingLabelRefundFragmentArgs(__orderId, __shippingLabelId)
    }
  }
}
