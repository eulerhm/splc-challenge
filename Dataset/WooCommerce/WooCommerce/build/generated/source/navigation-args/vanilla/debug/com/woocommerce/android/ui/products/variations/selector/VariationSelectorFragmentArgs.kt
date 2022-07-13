package com.woocommerce.android.ui.products.variations.selector

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Long
import kotlin.LongArray
import kotlin.jvm.JvmStatic

public data class VariationSelectorFragmentArgs(
  public val productId: Long,
  public val variationIds: LongArray
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putLong("productId", this.productId)
    result.putLongArray("variationIds", this.variationIds)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("productId", this.productId)
    result.set("variationIds", this.variationIds)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): VariationSelectorFragmentArgs {
      bundle.setClassLoader(VariationSelectorFragmentArgs::class.java.classLoader)
      val __productId : Long
      if (bundle.containsKey("productId")) {
        __productId = bundle.getLong("productId")
      } else {
        throw IllegalArgumentException("Required argument \"productId\" is missing and does not have an android:defaultValue")
      }
      val __variationIds : LongArray?
      if (bundle.containsKey("variationIds")) {
        __variationIds = bundle.getLongArray("variationIds")
        if (__variationIds == null) {
          throw IllegalArgumentException("Argument \"variationIds\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"variationIds\" is missing and does not have an android:defaultValue")
      }
      return VariationSelectorFragmentArgs(__productId, __variationIds)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        VariationSelectorFragmentArgs {
      val __productId : Long?
      if (savedStateHandle.contains("productId")) {
        __productId = savedStateHandle["productId"]
        if (__productId == null) {
          throw IllegalArgumentException("Argument \"productId\" of type long does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"productId\" is missing and does not have an android:defaultValue")
      }
      val __variationIds : LongArray?
      if (savedStateHandle.contains("variationIds")) {
        __variationIds = savedStateHandle["variationIds"]
        if (__variationIds == null) {
          throw IllegalArgumentException("Argument \"variationIds\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"variationIds\" is missing and does not have an android:defaultValue")
      }
      return VariationSelectorFragmentArgs(__productId, __variationIds)
    }
  }
}
