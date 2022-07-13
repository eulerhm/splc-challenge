package com.woocommerce.android.ui.orders.creation.fees

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import java.math.BigDecimal
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class OrderCreationFeeFragmentArgs(
  public val orderSubTotal: BigDecimal,
  public val currentFeeValue: BigDecimal? = null
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(BigDecimal::class.java)) {
      result.putParcelable("orderSubTotal", this.orderSubTotal as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(BigDecimal::class.java)) {
      result.putSerializable("orderSubTotal", this.orderSubTotal as Serializable)
    } else {
      throw UnsupportedOperationException(BigDecimal::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    if (Parcelable::class.java.isAssignableFrom(BigDecimal::class.java)) {
      result.putParcelable("currentFeeValue", this.currentFeeValue as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(BigDecimal::class.java)) {
      result.putSerializable("currentFeeValue", this.currentFeeValue as Serializable?)
    }
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(BigDecimal::class.java)) {
      result.set("orderSubTotal", this.orderSubTotal as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(BigDecimal::class.java)) {
      result.set("orderSubTotal", this.orderSubTotal as Serializable)
    } else {
      throw UnsupportedOperationException(BigDecimal::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    if (Parcelable::class.java.isAssignableFrom(BigDecimal::class.java)) {
      result.set("currentFeeValue", this.currentFeeValue as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(BigDecimal::class.java)) {
      result.set("currentFeeValue", this.currentFeeValue as Serializable?)
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): OrderCreationFeeFragmentArgs {
      bundle.setClassLoader(OrderCreationFeeFragmentArgs::class.java.classLoader)
      val __orderSubTotal : BigDecimal?
      if (bundle.containsKey("orderSubTotal")) {
        if (Parcelable::class.java.isAssignableFrom(BigDecimal::class.java) ||
            Serializable::class.java.isAssignableFrom(BigDecimal::class.java)) {
          __orderSubTotal = bundle.get("orderSubTotal") as BigDecimal?
        } else {
          throw UnsupportedOperationException(BigDecimal::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__orderSubTotal == null) {
          throw IllegalArgumentException("Argument \"orderSubTotal\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"orderSubTotal\" is missing and does not have an android:defaultValue")
      }
      val __currentFeeValue : BigDecimal?
      if (bundle.containsKey("currentFeeValue")) {
        if (Parcelable::class.java.isAssignableFrom(BigDecimal::class.java) ||
            Serializable::class.java.isAssignableFrom(BigDecimal::class.java)) {
          __currentFeeValue = bundle.get("currentFeeValue") as BigDecimal?
        } else {
          throw UnsupportedOperationException(BigDecimal::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        __currentFeeValue = null
      }
      return OrderCreationFeeFragmentArgs(__orderSubTotal, __currentFeeValue)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        OrderCreationFeeFragmentArgs {
      val __orderSubTotal : BigDecimal?
      if (savedStateHandle.contains("orderSubTotal")) {
        if (Parcelable::class.java.isAssignableFrom(BigDecimal::class.java) ||
            Serializable::class.java.isAssignableFrom(BigDecimal::class.java)) {
          __orderSubTotal = savedStateHandle.get<BigDecimal?>("orderSubTotal")
        } else {
          throw UnsupportedOperationException(BigDecimal::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__orderSubTotal == null) {
          throw IllegalArgumentException("Argument \"orderSubTotal\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"orderSubTotal\" is missing and does not have an android:defaultValue")
      }
      val __currentFeeValue : BigDecimal?
      if (savedStateHandle.contains("currentFeeValue")) {
        if (Parcelable::class.java.isAssignableFrom(BigDecimal::class.java) ||
            Serializable::class.java.isAssignableFrom(BigDecimal::class.java)) {
          __currentFeeValue = savedStateHandle.get<BigDecimal?>("currentFeeValue")
        } else {
          throw UnsupportedOperationException(BigDecimal::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        __currentFeeValue = null
      }
      return OrderCreationFeeFragmentArgs(__orderSubTotal, __currentFeeValue)
    }
  }
}
