package com.woocommerce.android.ui.products.selector

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.LongArray
import kotlin.jvm.JvmStatic

public data class ProductSelectorFragmentArgs(
  public val productIds: LongArray
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putLongArray("productIds", this.productIds)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("productIds", this.productIds)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): ProductSelectorFragmentArgs {
      bundle.setClassLoader(ProductSelectorFragmentArgs::class.java.classLoader)
      val __productIds : LongArray?
      if (bundle.containsKey("productIds")) {
        __productIds = bundle.getLongArray("productIds")
        if (__productIds == null) {
          throw IllegalArgumentException("Argument \"productIds\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"productIds\" is missing and does not have an android:defaultValue")
      }
      return ProductSelectorFragmentArgs(__productIds)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        ProductSelectorFragmentArgs {
      val __productIds : LongArray?
      if (savedStateHandle.contains("productIds")) {
        __productIds = savedStateHandle["productIds"]
        if (__productIds == null) {
          throw IllegalArgumentException("Argument \"productIds\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"productIds\" is missing and does not have an android:defaultValue")
      }
      return ProductSelectorFragmentArgs(__productIds)
    }
  }
}
