package com.woocommerce.android.ui.orders.shippinglabels.creation

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import com.woocommerce.android.model.CustomsPackage
import com.woocommerce.android.model.ShippingLabelPackage
import java.lang.IllegalArgumentException
import kotlin.Array
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class ShippingCustomsFragmentArgs(
  public val originCountryCode: String,
  public val destinationCountryCode: String,
  public val shippingPackages: Array<ShippingLabelPackage>,
  public val customsPackages: Array<CustomsPackage>
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("originCountryCode", this.originCountryCode)
    result.putString("destinationCountryCode", this.destinationCountryCode)
    result.putParcelableArray("shippingPackages", this.shippingPackages)
    result.putParcelableArray("customsPackages", this.customsPackages)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("originCountryCode", this.originCountryCode)
    result.set("destinationCountryCode", this.destinationCountryCode)
    result.set("shippingPackages", this.shippingPackages)
    result.set("customsPackages", this.customsPackages)
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("UNCHECKED_CAST")
    public fun fromBundle(bundle: Bundle): ShippingCustomsFragmentArgs {
      bundle.setClassLoader(ShippingCustomsFragmentArgs::class.java.classLoader)
      val __originCountryCode : String?
      if (bundle.containsKey("originCountryCode")) {
        __originCountryCode = bundle.getString("originCountryCode")
        if (__originCountryCode == null) {
          throw IllegalArgumentException("Argument \"originCountryCode\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"originCountryCode\" is missing and does not have an android:defaultValue")
      }
      val __destinationCountryCode : String?
      if (bundle.containsKey("destinationCountryCode")) {
        __destinationCountryCode = bundle.getString("destinationCountryCode")
        if (__destinationCountryCode == null) {
          throw IllegalArgumentException("Argument \"destinationCountryCode\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"destinationCountryCode\" is missing and does not have an android:defaultValue")
      }
      val __shippingPackages : Array<ShippingLabelPackage>?
      if (bundle.containsKey("shippingPackages")) {
        __shippingPackages = bundle.getParcelableArray("shippingPackages")?.map { it as
            ShippingLabelPackage }?.toTypedArray()
        if (__shippingPackages == null) {
          throw IllegalArgumentException("Argument \"shippingPackages\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"shippingPackages\" is missing and does not have an android:defaultValue")
      }
      val __customsPackages : Array<CustomsPackage>?
      if (bundle.containsKey("customsPackages")) {
        __customsPackages = bundle.getParcelableArray("customsPackages")?.map { it as CustomsPackage
            }?.toTypedArray()
        if (__customsPackages == null) {
          throw IllegalArgumentException("Argument \"customsPackages\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"customsPackages\" is missing and does not have an android:defaultValue")
      }
      return ShippingCustomsFragmentArgs(__originCountryCode, __destinationCountryCode,
          __shippingPackages, __customsPackages)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        ShippingCustomsFragmentArgs {
      val __originCountryCode : String?
      if (savedStateHandle.contains("originCountryCode")) {
        __originCountryCode = savedStateHandle["originCountryCode"]
        if (__originCountryCode == null) {
          throw IllegalArgumentException("Argument \"originCountryCode\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"originCountryCode\" is missing and does not have an android:defaultValue")
      }
      val __destinationCountryCode : String?
      if (savedStateHandle.contains("destinationCountryCode")) {
        __destinationCountryCode = savedStateHandle["destinationCountryCode"]
        if (__destinationCountryCode == null) {
          throw IllegalArgumentException("Argument \"destinationCountryCode\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"destinationCountryCode\" is missing and does not have an android:defaultValue")
      }
      val __shippingPackages : Array<ShippingLabelPackage>?
      if (savedStateHandle.contains("shippingPackages")) {
        __shippingPackages = savedStateHandle.get<Array<Parcelable>>("shippingPackages")?.map { it
            as ShippingLabelPackage }?.toTypedArray()
        if (__shippingPackages == null) {
          throw IllegalArgumentException("Argument \"shippingPackages\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"shippingPackages\" is missing and does not have an android:defaultValue")
      }
      val __customsPackages : Array<CustomsPackage>?
      if (savedStateHandle.contains("customsPackages")) {
        __customsPackages = savedStateHandle.get<Array<Parcelable>>("customsPackages")?.map { it as
            CustomsPackage }?.toTypedArray()
        if (__customsPackages == null) {
          throw IllegalArgumentException("Argument \"customsPackages\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"customsPackages\" is missing and does not have an android:defaultValue")
      }
      return ShippingCustomsFragmentArgs(__originCountryCode, __destinationCountryCode,
          __shippingPackages, __customsPackages)
    }
  }
}
