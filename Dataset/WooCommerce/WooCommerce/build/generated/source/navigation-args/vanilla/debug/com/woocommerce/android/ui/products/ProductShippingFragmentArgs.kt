package com.woocommerce.android.ui.products

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class ProductShippingFragmentArgs(
  public val requestCode: Int,
  public val shippingData: ProductShippingViewModel.ShippingData
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putInt("requestCode", this.requestCode)
    if
        (Parcelable::class.java.isAssignableFrom(ProductShippingViewModel.ShippingData::class.java)) {
      result.putParcelable("shippingData", this.shippingData as Parcelable)
    } else if
        (Serializable::class.java.isAssignableFrom(ProductShippingViewModel.ShippingData::class.java)) {
      result.putSerializable("shippingData", this.shippingData as Serializable)
    } else {
      throw UnsupportedOperationException(ProductShippingViewModel.ShippingData::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("requestCode", this.requestCode)
    if
        (Parcelable::class.java.isAssignableFrom(ProductShippingViewModel.ShippingData::class.java)) {
      result.set("shippingData", this.shippingData as Parcelable)
    } else if
        (Serializable::class.java.isAssignableFrom(ProductShippingViewModel.ShippingData::class.java)) {
      result.set("shippingData", this.shippingData as Serializable)
    } else {
      throw UnsupportedOperationException(ProductShippingViewModel.ShippingData::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): ProductShippingFragmentArgs {
      bundle.setClassLoader(ProductShippingFragmentArgs::class.java.classLoader)
      val __requestCode : Int
      if (bundle.containsKey("requestCode")) {
        __requestCode = bundle.getInt("requestCode")
      } else {
        throw IllegalArgumentException("Required argument \"requestCode\" is missing and does not have an android:defaultValue")
      }
      val __shippingData : ProductShippingViewModel.ShippingData?
      if (bundle.containsKey("shippingData")) {
        if
            (Parcelable::class.java.isAssignableFrom(ProductShippingViewModel.ShippingData::class.java)
            ||
            Serializable::class.java.isAssignableFrom(ProductShippingViewModel.ShippingData::class.java)) {
          __shippingData = bundle.get("shippingData") as ProductShippingViewModel.ShippingData?
        } else {
          throw UnsupportedOperationException(ProductShippingViewModel.ShippingData::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__shippingData == null) {
          throw IllegalArgumentException("Argument \"shippingData\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"shippingData\" is missing and does not have an android:defaultValue")
      }
      return ProductShippingFragmentArgs(__requestCode, __shippingData)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        ProductShippingFragmentArgs {
      val __requestCode : Int?
      if (savedStateHandle.contains("requestCode")) {
        __requestCode = savedStateHandle["requestCode"]
        if (__requestCode == null) {
          throw IllegalArgumentException("Argument \"requestCode\" of type integer does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"requestCode\" is missing and does not have an android:defaultValue")
      }
      val __shippingData : ProductShippingViewModel.ShippingData?
      if (savedStateHandle.contains("shippingData")) {
        if
            (Parcelable::class.java.isAssignableFrom(ProductShippingViewModel.ShippingData::class.java)
            ||
            Serializable::class.java.isAssignableFrom(ProductShippingViewModel.ShippingData::class.java)) {
          __shippingData =
              savedStateHandle.get<ProductShippingViewModel.ShippingData?>("shippingData")
        } else {
          throw UnsupportedOperationException(ProductShippingViewModel.ShippingData::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__shippingData == null) {
          throw IllegalArgumentException("Argument \"shippingData\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"shippingData\" is missing and does not have an android:defaultValue")
      }
      return ProductShippingFragmentArgs(__requestCode, __shippingData)
    }
  }
}
