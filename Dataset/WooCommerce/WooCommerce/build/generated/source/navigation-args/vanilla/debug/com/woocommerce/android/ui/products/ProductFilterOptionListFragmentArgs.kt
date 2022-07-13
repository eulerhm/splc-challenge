package com.woocommerce.android.ui.products

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Int
import kotlin.jvm.JvmStatic

public data class ProductFilterOptionListFragmentArgs(
  public val selectedFilterItemPosition: Int
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putInt("selectedFilterItemPosition", this.selectedFilterItemPosition)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("selectedFilterItemPosition", this.selectedFilterItemPosition)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): ProductFilterOptionListFragmentArgs {
      bundle.setClassLoader(ProductFilterOptionListFragmentArgs::class.java.classLoader)
      val __selectedFilterItemPosition : Int
      if (bundle.containsKey("selectedFilterItemPosition")) {
        __selectedFilterItemPosition = bundle.getInt("selectedFilterItemPosition")
      } else {
        throw IllegalArgumentException("Required argument \"selectedFilterItemPosition\" is missing and does not have an android:defaultValue")
      }
      return ProductFilterOptionListFragmentArgs(__selectedFilterItemPosition)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        ProductFilterOptionListFragmentArgs {
      val __selectedFilterItemPosition : Int?
      if (savedStateHandle.contains("selectedFilterItemPosition")) {
        __selectedFilterItemPosition = savedStateHandle["selectedFilterItemPosition"]
        if (__selectedFilterItemPosition == null) {
          throw IllegalArgumentException("Argument \"selectedFilterItemPosition\" of type integer does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"selectedFilterItemPosition\" is missing and does not have an android:defaultValue")
      }
      return ProductFilterOptionListFragmentArgs(__selectedFilterItemPosition)
    }
  }
}
