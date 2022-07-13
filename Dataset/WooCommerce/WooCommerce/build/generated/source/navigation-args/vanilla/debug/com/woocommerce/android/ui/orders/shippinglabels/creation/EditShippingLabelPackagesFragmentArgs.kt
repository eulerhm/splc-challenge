package com.woocommerce.android.ui.orders.shippinglabels.creation

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import com.woocommerce.android.model.ShippingLabelPackage
import java.lang.IllegalArgumentException
import kotlin.Array
import kotlin.Long
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class EditShippingLabelPackagesFragmentArgs(
  public val orderId: Long,
  public val shippingLabelPackages: Array<ShippingLabelPackage>
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putLong("orderId", this.orderId)
    result.putParcelableArray("shippingLabelPackages", this.shippingLabelPackages)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("orderId", this.orderId)
    result.set("shippingLabelPackages", this.shippingLabelPackages)
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("UNCHECKED_CAST")
    public fun fromBundle(bundle: Bundle): EditShippingLabelPackagesFragmentArgs {
      bundle.setClassLoader(EditShippingLabelPackagesFragmentArgs::class.java.classLoader)
      val __orderId : Long
      if (bundle.containsKey("orderId")) {
        __orderId = bundle.getLong("orderId")
      } else {
        throw IllegalArgumentException("Required argument \"orderId\" is missing and does not have an android:defaultValue")
      }
      val __shippingLabelPackages : Array<ShippingLabelPackage>?
      if (bundle.containsKey("shippingLabelPackages")) {
        __shippingLabelPackages = bundle.getParcelableArray("shippingLabelPackages")?.map { it as
            ShippingLabelPackage }?.toTypedArray()
        if (__shippingLabelPackages == null) {
          throw IllegalArgumentException("Argument \"shippingLabelPackages\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"shippingLabelPackages\" is missing and does not have an android:defaultValue")
      }
      return EditShippingLabelPackagesFragmentArgs(__orderId, __shippingLabelPackages)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        EditShippingLabelPackagesFragmentArgs {
      val __orderId : Long?
      if (savedStateHandle.contains("orderId")) {
        __orderId = savedStateHandle["orderId"]
        if (__orderId == null) {
          throw IllegalArgumentException("Argument \"orderId\" of type long does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"orderId\" is missing and does not have an android:defaultValue")
      }
      val __shippingLabelPackages : Array<ShippingLabelPackage>?
      if (savedStateHandle.contains("shippingLabelPackages")) {
        __shippingLabelPackages =
            savedStateHandle.get<Array<Parcelable>>("shippingLabelPackages")?.map { it as
            ShippingLabelPackage }?.toTypedArray()
        if (__shippingLabelPackages == null) {
          throw IllegalArgumentException("Argument \"shippingLabelPackages\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"shippingLabelPackages\" is missing and does not have an android:defaultValue")
      }
      return EditShippingLabelPackagesFragmentArgs(__orderId, __shippingLabelPackages)
    }
  }
}
