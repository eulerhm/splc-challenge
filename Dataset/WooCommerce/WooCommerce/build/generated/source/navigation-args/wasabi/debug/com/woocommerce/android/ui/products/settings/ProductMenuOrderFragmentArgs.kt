package com.woocommerce.android.ui.products.settings

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Int
import kotlin.jvm.JvmStatic

public data class ProductMenuOrderFragmentArgs(
  public val menuOrder: Int
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putInt("menuOrder", this.menuOrder)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("menuOrder", this.menuOrder)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): ProductMenuOrderFragmentArgs {
      bundle.setClassLoader(ProductMenuOrderFragmentArgs::class.java.classLoader)
      val __menuOrder : Int
      if (bundle.containsKey("menuOrder")) {
        __menuOrder = bundle.getInt("menuOrder")
      } else {
        throw IllegalArgumentException("Required argument \"menuOrder\" is missing and does not have an android:defaultValue")
      }
      return ProductMenuOrderFragmentArgs(__menuOrder)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        ProductMenuOrderFragmentArgs {
      val __menuOrder : Int?
      if (savedStateHandle.contains("menuOrder")) {
        __menuOrder = savedStateHandle["menuOrder"]
        if (__menuOrder == null) {
          throw IllegalArgumentException("Argument \"menuOrder\" of type integer does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"menuOrder\" is missing and does not have an android:defaultValue")
      }
      return ProductMenuOrderFragmentArgs(__menuOrder)
    }
  }
}
