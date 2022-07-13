package com.woocommerce.android.ui.orders.creation.shipping

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import com.woocommerce.android.model.Order
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class OrderCreationShippingFragmentArgs(
  public val currentShippingLine: Order.ShippingLine?
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(Order.ShippingLine::class.java)) {
      result.putParcelable("currentShippingLine", this.currentShippingLine as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(Order.ShippingLine::class.java)) {
      result.putSerializable("currentShippingLine", this.currentShippingLine as Serializable?)
    } else {
      throw UnsupportedOperationException(Order.ShippingLine::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(Order.ShippingLine::class.java)) {
      result.set("currentShippingLine", this.currentShippingLine as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(Order.ShippingLine::class.java)) {
      result.set("currentShippingLine", this.currentShippingLine as Serializable?)
    } else {
      throw UnsupportedOperationException(Order.ShippingLine::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): OrderCreationShippingFragmentArgs {
      bundle.setClassLoader(OrderCreationShippingFragmentArgs::class.java.classLoader)
      val __currentShippingLine : Order.ShippingLine?
      if (bundle.containsKey("currentShippingLine")) {
        if (Parcelable::class.java.isAssignableFrom(Order.ShippingLine::class.java) ||
            Serializable::class.java.isAssignableFrom(Order.ShippingLine::class.java)) {
          __currentShippingLine = bundle.get("currentShippingLine") as Order.ShippingLine?
        } else {
          throw UnsupportedOperationException(Order.ShippingLine::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"currentShippingLine\" is missing and does not have an android:defaultValue")
      }
      return OrderCreationShippingFragmentArgs(__currentShippingLine)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        OrderCreationShippingFragmentArgs {
      val __currentShippingLine : Order.ShippingLine?
      if (savedStateHandle.contains("currentShippingLine")) {
        if (Parcelable::class.java.isAssignableFrom(Order.ShippingLine::class.java) ||
            Serializable::class.java.isAssignableFrom(Order.ShippingLine::class.java)) {
          __currentShippingLine = savedStateHandle.get<Order.ShippingLine?>("currentShippingLine")
        } else {
          throw UnsupportedOperationException(Order.ShippingLine::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"currentShippingLine\" is missing and does not have an android:defaultValue")
      }
      return OrderCreationShippingFragmentArgs(__currentShippingLine)
    }
  }
}
