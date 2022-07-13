package com.woocommerce.android.ui.products.categories.selector

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.LongArray
import kotlin.jvm.JvmStatic

public data class ProductCategorySelectorFragmentArgs(
  public val categoryIds: LongArray
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putLongArray("categoryIds", this.categoryIds)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("categoryIds", this.categoryIds)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): ProductCategorySelectorFragmentArgs {
      bundle.setClassLoader(ProductCategorySelectorFragmentArgs::class.java.classLoader)
      val __categoryIds : LongArray?
      if (bundle.containsKey("categoryIds")) {
        __categoryIds = bundle.getLongArray("categoryIds")
        if (__categoryIds == null) {
          throw IllegalArgumentException("Argument \"categoryIds\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"categoryIds\" is missing and does not have an android:defaultValue")
      }
      return ProductCategorySelectorFragmentArgs(__categoryIds)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        ProductCategorySelectorFragmentArgs {
      val __categoryIds : LongArray?
      if (savedStateHandle.contains("categoryIds")) {
        __categoryIds = savedStateHandle["categoryIds"]
        if (__categoryIds == null) {
          throw IllegalArgumentException("Argument \"categoryIds\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"categoryIds\" is missing and does not have an android:defaultValue")
      }
      return ProductCategorySelectorFragmentArgs(__categoryIds)
    }
  }
}
