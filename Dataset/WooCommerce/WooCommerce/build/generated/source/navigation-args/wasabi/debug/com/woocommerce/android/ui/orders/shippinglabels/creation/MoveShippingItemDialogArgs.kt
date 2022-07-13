package com.woocommerce.android.ui.orders.shippinglabels.creation

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import com.woocommerce.android.model.ShippingLabelPackage
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Array
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class MoveShippingItemDialogArgs(
  public val item: ShippingLabelPackage.Item,
  public val currentPackage: ShippingLabelPackage,
  public val packagesList: Array<ShippingLabelPackage>
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(ShippingLabelPackage.Item::class.java)) {
      result.putParcelable("item", this.item as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(ShippingLabelPackage.Item::class.java)) {
      result.putSerializable("item", this.item as Serializable)
    } else {
      throw UnsupportedOperationException(ShippingLabelPackage.Item::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    if (Parcelable::class.java.isAssignableFrom(ShippingLabelPackage::class.java)) {
      result.putParcelable("currentPackage", this.currentPackage as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(ShippingLabelPackage::class.java)) {
      result.putSerializable("currentPackage", this.currentPackage as Serializable)
    } else {
      throw UnsupportedOperationException(ShippingLabelPackage::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    result.putParcelableArray("packagesList", this.packagesList)
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(ShippingLabelPackage.Item::class.java)) {
      result.set("item", this.item as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(ShippingLabelPackage.Item::class.java)) {
      result.set("item", this.item as Serializable)
    } else {
      throw UnsupportedOperationException(ShippingLabelPackage.Item::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    if (Parcelable::class.java.isAssignableFrom(ShippingLabelPackage::class.java)) {
      result.set("currentPackage", this.currentPackage as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(ShippingLabelPackage::class.java)) {
      result.set("currentPackage", this.currentPackage as Serializable)
    } else {
      throw UnsupportedOperationException(ShippingLabelPackage::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    result.set("packagesList", this.packagesList)
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("UNCHECKED_CAST")
    public fun fromBundle(bundle: Bundle): MoveShippingItemDialogArgs {
      bundle.setClassLoader(MoveShippingItemDialogArgs::class.java.classLoader)
      val __item : ShippingLabelPackage.Item?
      if (bundle.containsKey("item")) {
        if (Parcelable::class.java.isAssignableFrom(ShippingLabelPackage.Item::class.java) ||
            Serializable::class.java.isAssignableFrom(ShippingLabelPackage.Item::class.java)) {
          __item = bundle.get("item") as ShippingLabelPackage.Item?
        } else {
          throw UnsupportedOperationException(ShippingLabelPackage.Item::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__item == null) {
          throw IllegalArgumentException("Argument \"item\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"item\" is missing and does not have an android:defaultValue")
      }
      val __currentPackage : ShippingLabelPackage?
      if (bundle.containsKey("currentPackage")) {
        if (Parcelable::class.java.isAssignableFrom(ShippingLabelPackage::class.java) ||
            Serializable::class.java.isAssignableFrom(ShippingLabelPackage::class.java)) {
          __currentPackage = bundle.get("currentPackage") as ShippingLabelPackage?
        } else {
          throw UnsupportedOperationException(ShippingLabelPackage::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__currentPackage == null) {
          throw IllegalArgumentException("Argument \"currentPackage\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"currentPackage\" is missing and does not have an android:defaultValue")
      }
      val __packagesList : Array<ShippingLabelPackage>?
      if (bundle.containsKey("packagesList")) {
        __packagesList = bundle.getParcelableArray("packagesList")?.map { it as ShippingLabelPackage
            }?.toTypedArray()
        if (__packagesList == null) {
          throw IllegalArgumentException("Argument \"packagesList\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"packagesList\" is missing and does not have an android:defaultValue")
      }
      return MoveShippingItemDialogArgs(__item, __currentPackage, __packagesList)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        MoveShippingItemDialogArgs {
      val __item : ShippingLabelPackage.Item?
      if (savedStateHandle.contains("item")) {
        if (Parcelable::class.java.isAssignableFrom(ShippingLabelPackage.Item::class.java) ||
            Serializable::class.java.isAssignableFrom(ShippingLabelPackage.Item::class.java)) {
          __item = savedStateHandle.get<ShippingLabelPackage.Item?>("item")
        } else {
          throw UnsupportedOperationException(ShippingLabelPackage.Item::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__item == null) {
          throw IllegalArgumentException("Argument \"item\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"item\" is missing and does not have an android:defaultValue")
      }
      val __currentPackage : ShippingLabelPackage?
      if (savedStateHandle.contains("currentPackage")) {
        if (Parcelable::class.java.isAssignableFrom(ShippingLabelPackage::class.java) ||
            Serializable::class.java.isAssignableFrom(ShippingLabelPackage::class.java)) {
          __currentPackage = savedStateHandle.get<ShippingLabelPackage?>("currentPackage")
        } else {
          throw UnsupportedOperationException(ShippingLabelPackage::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__currentPackage == null) {
          throw IllegalArgumentException("Argument \"currentPackage\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"currentPackage\" is missing and does not have an android:defaultValue")
      }
      val __packagesList : Array<ShippingLabelPackage>?
      if (savedStateHandle.contains("packagesList")) {
        __packagesList = savedStateHandle.get<Array<Parcelable>>("packagesList")?.map { it as
            ShippingLabelPackage }?.toTypedArray()
        if (__packagesList == null) {
          throw IllegalArgumentException("Argument \"packagesList\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"packagesList\" is missing and does not have an android:defaultValue")
      }
      return MoveShippingItemDialogArgs(__item, __currentPackage, __packagesList)
    }
  }
}
