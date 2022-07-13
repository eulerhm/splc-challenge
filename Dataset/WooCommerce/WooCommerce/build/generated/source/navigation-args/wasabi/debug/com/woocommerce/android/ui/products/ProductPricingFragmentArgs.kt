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

public data class ProductPricingFragmentArgs(
  public val requestCode: Int,
  public val pricingData: ProductPricingViewModel.PricingData
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putInt("requestCode", this.requestCode)
    if (Parcelable::class.java.isAssignableFrom(ProductPricingViewModel.PricingData::class.java)) {
      result.putParcelable("pricingData", this.pricingData as Parcelable)
    } else if
        (Serializable::class.java.isAssignableFrom(ProductPricingViewModel.PricingData::class.java)) {
      result.putSerializable("pricingData", this.pricingData as Serializable)
    } else {
      throw UnsupportedOperationException(ProductPricingViewModel.PricingData::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("requestCode", this.requestCode)
    if (Parcelable::class.java.isAssignableFrom(ProductPricingViewModel.PricingData::class.java)) {
      result.set("pricingData", this.pricingData as Parcelable)
    } else if
        (Serializable::class.java.isAssignableFrom(ProductPricingViewModel.PricingData::class.java)) {
      result.set("pricingData", this.pricingData as Serializable)
    } else {
      throw UnsupportedOperationException(ProductPricingViewModel.PricingData::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): ProductPricingFragmentArgs {
      bundle.setClassLoader(ProductPricingFragmentArgs::class.java.classLoader)
      val __requestCode : Int
      if (bundle.containsKey("requestCode")) {
        __requestCode = bundle.getInt("requestCode")
      } else {
        throw IllegalArgumentException("Required argument \"requestCode\" is missing and does not have an android:defaultValue")
      }
      val __pricingData : ProductPricingViewModel.PricingData?
      if (bundle.containsKey("pricingData")) {
        if (Parcelable::class.java.isAssignableFrom(ProductPricingViewModel.PricingData::class.java)
            ||
            Serializable::class.java.isAssignableFrom(ProductPricingViewModel.PricingData::class.java)) {
          __pricingData = bundle.get("pricingData") as ProductPricingViewModel.PricingData?
        } else {
          throw UnsupportedOperationException(ProductPricingViewModel.PricingData::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__pricingData == null) {
          throw IllegalArgumentException("Argument \"pricingData\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"pricingData\" is missing and does not have an android:defaultValue")
      }
      return ProductPricingFragmentArgs(__requestCode, __pricingData)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        ProductPricingFragmentArgs {
      val __requestCode : Int?
      if (savedStateHandle.contains("requestCode")) {
        __requestCode = savedStateHandle["requestCode"]
        if (__requestCode == null) {
          throw IllegalArgumentException("Argument \"requestCode\" of type integer does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"requestCode\" is missing and does not have an android:defaultValue")
      }
      val __pricingData : ProductPricingViewModel.PricingData?
      if (savedStateHandle.contains("pricingData")) {
        if (Parcelable::class.java.isAssignableFrom(ProductPricingViewModel.PricingData::class.java)
            ||
            Serializable::class.java.isAssignableFrom(ProductPricingViewModel.PricingData::class.java)) {
          __pricingData = savedStateHandle.get<ProductPricingViewModel.PricingData?>("pricingData")
        } else {
          throw UnsupportedOperationException(ProductPricingViewModel.PricingData::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__pricingData == null) {
          throw IllegalArgumentException("Argument \"pricingData\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"pricingData\" is missing and does not have an android:defaultValue")
      }
      return ProductPricingFragmentArgs(__requestCode, __pricingData)
    }
  }
}
