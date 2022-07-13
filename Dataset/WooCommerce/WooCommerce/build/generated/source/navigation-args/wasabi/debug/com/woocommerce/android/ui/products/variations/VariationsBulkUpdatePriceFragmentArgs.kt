package com.woocommerce.android.ui.products.variations

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class VariationsBulkUpdatePriceFragmentArgs(
  public val priceUpdateData: VariationsBulkUpdatePriceViewModel.PriceUpdateData
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if
        (Parcelable::class.java.isAssignableFrom(VariationsBulkUpdatePriceViewModel.PriceUpdateData::class.java)) {
      result.putParcelable("priceUpdateData", this.priceUpdateData as Parcelable)
    } else if
        (Serializable::class.java.isAssignableFrom(VariationsBulkUpdatePriceViewModel.PriceUpdateData::class.java)) {
      result.putSerializable("priceUpdateData", this.priceUpdateData as Serializable)
    } else {
      throw UnsupportedOperationException(VariationsBulkUpdatePriceViewModel.PriceUpdateData::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if
        (Parcelable::class.java.isAssignableFrom(VariationsBulkUpdatePriceViewModel.PriceUpdateData::class.java)) {
      result.set("priceUpdateData", this.priceUpdateData as Parcelable)
    } else if
        (Serializable::class.java.isAssignableFrom(VariationsBulkUpdatePriceViewModel.PriceUpdateData::class.java)) {
      result.set("priceUpdateData", this.priceUpdateData as Serializable)
    } else {
      throw UnsupportedOperationException(VariationsBulkUpdatePriceViewModel.PriceUpdateData::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): VariationsBulkUpdatePriceFragmentArgs {
      bundle.setClassLoader(VariationsBulkUpdatePriceFragmentArgs::class.java.classLoader)
      val __priceUpdateData : VariationsBulkUpdatePriceViewModel.PriceUpdateData?
      if (bundle.containsKey("priceUpdateData")) {
        if
            (Parcelable::class.java.isAssignableFrom(VariationsBulkUpdatePriceViewModel.PriceUpdateData::class.java)
            ||
            Serializable::class.java.isAssignableFrom(VariationsBulkUpdatePriceViewModel.PriceUpdateData::class.java)) {
          __priceUpdateData =
              bundle.get("priceUpdateData") as VariationsBulkUpdatePriceViewModel.PriceUpdateData?
        } else {
          throw UnsupportedOperationException(VariationsBulkUpdatePriceViewModel.PriceUpdateData::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__priceUpdateData == null) {
          throw IllegalArgumentException("Argument \"priceUpdateData\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"priceUpdateData\" is missing and does not have an android:defaultValue")
      }
      return VariationsBulkUpdatePriceFragmentArgs(__priceUpdateData)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        VariationsBulkUpdatePriceFragmentArgs {
      val __priceUpdateData : VariationsBulkUpdatePriceViewModel.PriceUpdateData?
      if (savedStateHandle.contains("priceUpdateData")) {
        if
            (Parcelable::class.java.isAssignableFrom(VariationsBulkUpdatePriceViewModel.PriceUpdateData::class.java)
            ||
            Serializable::class.java.isAssignableFrom(VariationsBulkUpdatePriceViewModel.PriceUpdateData::class.java)) {
          __priceUpdateData =
              savedStateHandle.get<VariationsBulkUpdatePriceViewModel.PriceUpdateData?>("priceUpdateData")
        } else {
          throw UnsupportedOperationException(VariationsBulkUpdatePriceViewModel.PriceUpdateData::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__priceUpdateData == null) {
          throw IllegalArgumentException("Argument \"priceUpdateData\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"priceUpdateData\" is missing and does not have an android:defaultValue")
      }
      return VariationsBulkUpdatePriceFragmentArgs(__priceUpdateData)
    }
  }
}
