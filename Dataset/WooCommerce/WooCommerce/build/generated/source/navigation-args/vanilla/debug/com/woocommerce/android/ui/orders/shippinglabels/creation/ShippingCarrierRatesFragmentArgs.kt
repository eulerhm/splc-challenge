package com.woocommerce.android.ui.orders.shippinglabels.creation

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import com.woocommerce.android.model.Address
import com.woocommerce.android.model.CustomsPackage
import com.woocommerce.android.model.Order
import com.woocommerce.android.model.ShippingLabelPackage
import com.woocommerce.android.model.ShippingRate
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Array
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class ShippingCarrierRatesFragmentArgs(
  public val originAddress: Address,
  public val destinationAddress: Address,
  public val packages: Array<ShippingLabelPackage>,
  public val order: Order,
  public val customsPackages: Array<CustomsPackage>?,
  public val selectedRates: Array<ShippingRate>
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(Address::class.java)) {
      result.putParcelable("originAddress", this.originAddress as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Address::class.java)) {
      result.putSerializable("originAddress", this.originAddress as Serializable)
    } else {
      throw UnsupportedOperationException(Address::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    if (Parcelable::class.java.isAssignableFrom(Address::class.java)) {
      result.putParcelable("destinationAddress", this.destinationAddress as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Address::class.java)) {
      result.putSerializable("destinationAddress", this.destinationAddress as Serializable)
    } else {
      throw UnsupportedOperationException(Address::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    result.putParcelableArray("packages", this.packages)
    if (Parcelable::class.java.isAssignableFrom(Order::class.java)) {
      result.putParcelable("order", this.order as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Order::class.java)) {
      result.putSerializable("order", this.order as Serializable)
    } else {
      throw UnsupportedOperationException(Order::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    result.putParcelableArray("customsPackages", this.customsPackages)
    result.putParcelableArray("selectedRates", this.selectedRates)
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(Address::class.java)) {
      result.set("originAddress", this.originAddress as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Address::class.java)) {
      result.set("originAddress", this.originAddress as Serializable)
    } else {
      throw UnsupportedOperationException(Address::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    if (Parcelable::class.java.isAssignableFrom(Address::class.java)) {
      result.set("destinationAddress", this.destinationAddress as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Address::class.java)) {
      result.set("destinationAddress", this.destinationAddress as Serializable)
    } else {
      throw UnsupportedOperationException(Address::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    result.set("packages", this.packages)
    if (Parcelable::class.java.isAssignableFrom(Order::class.java)) {
      result.set("order", this.order as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Order::class.java)) {
      result.set("order", this.order as Serializable)
    } else {
      throw UnsupportedOperationException(Order::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    result.set("customsPackages", this.customsPackages)
    result.set("selectedRates", this.selectedRates)
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("UNCHECKED_CAST")
    public fun fromBundle(bundle: Bundle): ShippingCarrierRatesFragmentArgs {
      bundle.setClassLoader(ShippingCarrierRatesFragmentArgs::class.java.classLoader)
      val __originAddress : Address?
      if (bundle.containsKey("originAddress")) {
        if (Parcelable::class.java.isAssignableFrom(Address::class.java) ||
            Serializable::class.java.isAssignableFrom(Address::class.java)) {
          __originAddress = bundle.get("originAddress") as Address?
        } else {
          throw UnsupportedOperationException(Address::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__originAddress == null) {
          throw IllegalArgumentException("Argument \"originAddress\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"originAddress\" is missing and does not have an android:defaultValue")
      }
      val __destinationAddress : Address?
      if (bundle.containsKey("destinationAddress")) {
        if (Parcelable::class.java.isAssignableFrom(Address::class.java) ||
            Serializable::class.java.isAssignableFrom(Address::class.java)) {
          __destinationAddress = bundle.get("destinationAddress") as Address?
        } else {
          throw UnsupportedOperationException(Address::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__destinationAddress == null) {
          throw IllegalArgumentException("Argument \"destinationAddress\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"destinationAddress\" is missing and does not have an android:defaultValue")
      }
      val __packages : Array<ShippingLabelPackage>?
      if (bundle.containsKey("packages")) {
        __packages = bundle.getParcelableArray("packages")?.map { it as ShippingLabelPackage
            }?.toTypedArray()
        if (__packages == null) {
          throw IllegalArgumentException("Argument \"packages\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"packages\" is missing and does not have an android:defaultValue")
      }
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
      val __customsPackages : Array<CustomsPackage>?
      if (bundle.containsKey("customsPackages")) {
        __customsPackages = bundle.getParcelableArray("customsPackages")?.map { it as CustomsPackage
            }?.toTypedArray()
      } else {
        throw IllegalArgumentException("Required argument \"customsPackages\" is missing and does not have an android:defaultValue")
      }
      val __selectedRates : Array<ShippingRate>?
      if (bundle.containsKey("selectedRates")) {
        __selectedRates = bundle.getParcelableArray("selectedRates")?.map { it as ShippingRate
            }?.toTypedArray()
        if (__selectedRates == null) {
          throw IllegalArgumentException("Argument \"selectedRates\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"selectedRates\" is missing and does not have an android:defaultValue")
      }
      return ShippingCarrierRatesFragmentArgs(__originAddress, __destinationAddress, __packages,
          __order, __customsPackages, __selectedRates)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        ShippingCarrierRatesFragmentArgs {
      val __originAddress : Address?
      if (savedStateHandle.contains("originAddress")) {
        if (Parcelable::class.java.isAssignableFrom(Address::class.java) ||
            Serializable::class.java.isAssignableFrom(Address::class.java)) {
          __originAddress = savedStateHandle.get<Address?>("originAddress")
        } else {
          throw UnsupportedOperationException(Address::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__originAddress == null) {
          throw IllegalArgumentException("Argument \"originAddress\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"originAddress\" is missing and does not have an android:defaultValue")
      }
      val __destinationAddress : Address?
      if (savedStateHandle.contains("destinationAddress")) {
        if (Parcelable::class.java.isAssignableFrom(Address::class.java) ||
            Serializable::class.java.isAssignableFrom(Address::class.java)) {
          __destinationAddress = savedStateHandle.get<Address?>("destinationAddress")
        } else {
          throw UnsupportedOperationException(Address::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__destinationAddress == null) {
          throw IllegalArgumentException("Argument \"destinationAddress\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"destinationAddress\" is missing and does not have an android:defaultValue")
      }
      val __packages : Array<ShippingLabelPackage>?
      if (savedStateHandle.contains("packages")) {
        __packages = savedStateHandle.get<Array<Parcelable>>("packages")?.map { it as
            ShippingLabelPackage }?.toTypedArray()
        if (__packages == null) {
          throw IllegalArgumentException("Argument \"packages\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"packages\" is missing and does not have an android:defaultValue")
      }
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
      val __customsPackages : Array<CustomsPackage>?
      if (savedStateHandle.contains("customsPackages")) {
        __customsPackages = savedStateHandle.get<Array<Parcelable>>("customsPackages")?.map { it as
            CustomsPackage }?.toTypedArray()
      } else {
        throw IllegalArgumentException("Required argument \"customsPackages\" is missing and does not have an android:defaultValue")
      }
      val __selectedRates : Array<ShippingRate>?
      if (savedStateHandle.contains("selectedRates")) {
        __selectedRates = savedStateHandle.get<Array<Parcelable>>("selectedRates")?.map { it as
            ShippingRate }?.toTypedArray()
        if (__selectedRates == null) {
          throw IllegalArgumentException("Argument \"selectedRates\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"selectedRates\" is missing and does not have an android:defaultValue")
      }
      return ShippingCarrierRatesFragmentArgs(__originAddress, __destinationAddress, __packages,
          __order, __customsPackages, __selectedRates)
    }
  }
}
