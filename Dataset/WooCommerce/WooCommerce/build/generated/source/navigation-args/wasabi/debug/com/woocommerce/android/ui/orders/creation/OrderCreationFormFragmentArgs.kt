package com.woocommerce.android.ui.orders.creation

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class OrderCreationFormFragmentArgs(
  public val mode: OrderCreationViewModel.Mode
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(OrderCreationViewModel.Mode::class.java)) {
      result.putParcelable("mode", this.mode as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(OrderCreationViewModel.Mode::class.java)) {
      result.putSerializable("mode", this.mode as Serializable)
    } else {
      throw UnsupportedOperationException(OrderCreationViewModel.Mode::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(OrderCreationViewModel.Mode::class.java)) {
      result.set("mode", this.mode as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(OrderCreationViewModel.Mode::class.java)) {
      result.set("mode", this.mode as Serializable)
    } else {
      throw UnsupportedOperationException(OrderCreationViewModel.Mode::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): OrderCreationFormFragmentArgs {
      bundle.setClassLoader(OrderCreationFormFragmentArgs::class.java.classLoader)
      val __mode : OrderCreationViewModel.Mode?
      if (bundle.containsKey("mode")) {
        if (Parcelable::class.java.isAssignableFrom(OrderCreationViewModel.Mode::class.java) ||
            Serializable::class.java.isAssignableFrom(OrderCreationViewModel.Mode::class.java)) {
          __mode = bundle.get("mode") as OrderCreationViewModel.Mode?
        } else {
          throw UnsupportedOperationException(OrderCreationViewModel.Mode::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__mode == null) {
          throw IllegalArgumentException("Argument \"mode\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"mode\" is missing and does not have an android:defaultValue")
      }
      return OrderCreationFormFragmentArgs(__mode)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        OrderCreationFormFragmentArgs {
      val __mode : OrderCreationViewModel.Mode?
      if (savedStateHandle.contains("mode")) {
        if (Parcelable::class.java.isAssignableFrom(OrderCreationViewModel.Mode::class.java) ||
            Serializable::class.java.isAssignableFrom(OrderCreationViewModel.Mode::class.java)) {
          __mode = savedStateHandle.get<OrderCreationViewModel.Mode?>("mode")
        } else {
          throw UnsupportedOperationException(OrderCreationViewModel.Mode::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__mode == null) {
          throw IllegalArgumentException("Argument \"mode\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"mode\" is missing and does not have an android:defaultValue")
      }
      return OrderCreationFormFragmentArgs(__mode)
    }
  }
}
