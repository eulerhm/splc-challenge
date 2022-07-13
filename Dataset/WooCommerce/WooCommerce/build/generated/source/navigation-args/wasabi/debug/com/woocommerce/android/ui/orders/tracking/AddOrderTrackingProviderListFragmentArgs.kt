package com.woocommerce.android.ui.orders.tracking

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Long
import kotlin.String
import kotlin.jvm.JvmStatic

public data class AddOrderTrackingProviderListFragmentArgs(
  public val orderId: Long,
  public val selectedProvider: String = ""
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putLong("orderId", this.orderId)
    result.putString("selectedProvider", this.selectedProvider)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("orderId", this.orderId)
    result.set("selectedProvider", this.selectedProvider)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): AddOrderTrackingProviderListFragmentArgs {
      bundle.setClassLoader(AddOrderTrackingProviderListFragmentArgs::class.java.classLoader)
      val __orderId : Long
      if (bundle.containsKey("orderId")) {
        __orderId = bundle.getLong("orderId")
      } else {
        throw IllegalArgumentException("Required argument \"orderId\" is missing and does not have an android:defaultValue")
      }
      val __selectedProvider : String?
      if (bundle.containsKey("selectedProvider")) {
        __selectedProvider = bundle.getString("selectedProvider")
        if (__selectedProvider == null) {
          throw IllegalArgumentException("Argument \"selectedProvider\" is marked as non-null but was passed a null value.")
        }
      } else {
        __selectedProvider = ""
      }
      return AddOrderTrackingProviderListFragmentArgs(__orderId, __selectedProvider)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        AddOrderTrackingProviderListFragmentArgs {
      val __orderId : Long?
      if (savedStateHandle.contains("orderId")) {
        __orderId = savedStateHandle["orderId"]
        if (__orderId == null) {
          throw IllegalArgumentException("Argument \"orderId\" of type long does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"orderId\" is missing and does not have an android:defaultValue")
      }
      val __selectedProvider : String?
      if (savedStateHandle.contains("selectedProvider")) {
        __selectedProvider = savedStateHandle["selectedProvider"]
        if (__selectedProvider == null) {
          throw IllegalArgumentException("Argument \"selectedProvider\" is marked as non-null but was passed a null value")
        }
      } else {
        __selectedProvider = ""
      }
      return AddOrderTrackingProviderListFragmentArgs(__orderId, __selectedProvider)
    }
  }
}
