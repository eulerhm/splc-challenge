package com.woocommerce.android.ui.products.addons.order

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Long
import kotlin.jvm.JvmStatic

public data class OrderedAddonFragmentArgs(
  public val orderId: Long,
  public val orderItemId: Long,
  public val addonsProductId: Long
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putLong("orderId", this.orderId)
    result.putLong("orderItemId", this.orderItemId)
    result.putLong("addonsProductId", this.addonsProductId)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("orderId", this.orderId)
    result.set("orderItemId", this.orderItemId)
    result.set("addonsProductId", this.addonsProductId)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): OrderedAddonFragmentArgs {
      bundle.setClassLoader(OrderedAddonFragmentArgs::class.java.classLoader)
      val __orderId : Long
      if (bundle.containsKey("orderId")) {
        __orderId = bundle.getLong("orderId")
      } else {
        throw IllegalArgumentException("Required argument \"orderId\" is missing and does not have an android:defaultValue")
      }
      val __orderItemId : Long
      if (bundle.containsKey("orderItemId")) {
        __orderItemId = bundle.getLong("orderItemId")
      } else {
        throw IllegalArgumentException("Required argument \"orderItemId\" is missing and does not have an android:defaultValue")
      }
      val __addonsProductId : Long
      if (bundle.containsKey("addonsProductId")) {
        __addonsProductId = bundle.getLong("addonsProductId")
      } else {
        throw IllegalArgumentException("Required argument \"addonsProductId\" is missing and does not have an android:defaultValue")
      }
      return OrderedAddonFragmentArgs(__orderId, __orderItemId, __addonsProductId)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): OrderedAddonFragmentArgs {
      val __orderId : Long?
      if (savedStateHandle.contains("orderId")) {
        __orderId = savedStateHandle["orderId"]
        if (__orderId == null) {
          throw IllegalArgumentException("Argument \"orderId\" of type long does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"orderId\" is missing and does not have an android:defaultValue")
      }
      val __orderItemId : Long?
      if (savedStateHandle.contains("orderItemId")) {
        __orderItemId = savedStateHandle["orderItemId"]
        if (__orderItemId == null) {
          throw IllegalArgumentException("Argument \"orderItemId\" of type long does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"orderItemId\" is missing and does not have an android:defaultValue")
      }
      val __addonsProductId : Long?
      if (savedStateHandle.contains("addonsProductId")) {
        __addonsProductId = savedStateHandle["addonsProductId"]
        if (__addonsProductId == null) {
          throw IllegalArgumentException("Argument \"addonsProductId\" of type long does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"addonsProductId\" is missing and does not have an android:defaultValue")
      }
      return OrderedAddonFragmentArgs(__orderId, __orderItemId, __addonsProductId)
    }
  }
}
