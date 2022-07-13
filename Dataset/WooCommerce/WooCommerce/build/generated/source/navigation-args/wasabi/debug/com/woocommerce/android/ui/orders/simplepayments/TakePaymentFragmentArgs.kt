package com.woocommerce.android.ui.orders.simplepayments

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

public data class TakePaymentFragmentArgs(
  public val order: Order
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(Order::class.java)) {
      result.putParcelable("order", this.order as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Order::class.java)) {
      result.putSerializable("order", this.order as Serializable)
    } else {
      throw UnsupportedOperationException(Order::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(Order::class.java)) {
      result.set("order", this.order as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Order::class.java)) {
      result.set("order", this.order as Serializable)
    } else {
      throw UnsupportedOperationException(Order::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): TakePaymentFragmentArgs {
      bundle.setClassLoader(TakePaymentFragmentArgs::class.java.classLoader)
      val __order : Order?
      if (bundle.containsKey("order")) {
        if (Parcelable::class.java.isAssignableFrom(Order::class.java) ||
            Serializable::class.java.isAssignableFrom(Order::class.java)) {
          __order = bundle.get("order") as Order?
        } else {
          throw UnsupportedOperationException(Order::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__order == null) {
          throw IllegalArgumentException("Argument \"order\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"order\" is missing and does not have an android:defaultValue")
      }
      return TakePaymentFragmentArgs(__order)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): TakePaymentFragmentArgs {
      val __order : Order?
      if (savedStateHandle.contains("order")) {
        if (Parcelable::class.java.isAssignableFrom(Order::class.java) ||
            Serializable::class.java.isAssignableFrom(Order::class.java)) {
          __order = savedStateHandle.get<Order?>("order")
        } else {
          throw UnsupportedOperationException(Order::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__order == null) {
          throw IllegalArgumentException("Argument \"order\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"order\" is missing and does not have an android:defaultValue")
      }
      return TakePaymentFragmentArgs(__order)
    }
  }
}
