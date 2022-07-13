package com.woocommerce.android.ui.orders.notes

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Long
import kotlin.String
import kotlin.jvm.JvmStatic

public data class AddOrderNoteFragmentArgs(
  public val orderId: Long,
  public val orderNumber: String = "\"\""
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putLong("orderId", this.orderId)
    result.putString("orderNumber", this.orderNumber)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("orderId", this.orderId)
    result.set("orderNumber", this.orderNumber)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): AddOrderNoteFragmentArgs {
      bundle.setClassLoader(AddOrderNoteFragmentArgs::class.java.classLoader)
      val __orderId : Long
      if (bundle.containsKey("orderId")) {
        __orderId = bundle.getLong("orderId")
      } else {
        throw IllegalArgumentException("Required argument \"orderId\" is missing and does not have an android:defaultValue")
      }
      val __orderNumber : String?
      if (bundle.containsKey("orderNumber")) {
        __orderNumber = bundle.getString("orderNumber")
        if (__orderNumber == null) {
          throw IllegalArgumentException("Argument \"orderNumber\" is marked as non-null but was passed a null value.")
        }
      } else {
        __orderNumber = "\"\""
      }
      return AddOrderNoteFragmentArgs(__orderId, __orderNumber)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): AddOrderNoteFragmentArgs {
      val __orderId : Long?
      if (savedStateHandle.contains("orderId")) {
        __orderId = savedStateHandle["orderId"]
        if (__orderId == null) {
          throw IllegalArgumentException("Argument \"orderId\" of type long does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"orderId\" is missing and does not have an android:defaultValue")
      }
      val __orderNumber : String?
      if (savedStateHandle.contains("orderNumber")) {
        __orderNumber = savedStateHandle["orderNumber"]
        if (__orderNumber == null) {
          throw IllegalArgumentException("Argument \"orderNumber\" is marked as non-null but was passed a null value")
        }
      } else {
        __orderNumber = "\"\""
      }
      return AddOrderNoteFragmentArgs(__orderId, __orderNumber)
    }
  }
}
