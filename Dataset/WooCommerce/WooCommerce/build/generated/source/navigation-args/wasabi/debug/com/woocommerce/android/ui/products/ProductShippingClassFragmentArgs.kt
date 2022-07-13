package com.woocommerce.android.ui.products

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Long
import kotlin.jvm.JvmStatic

public data class ProductShippingClassFragmentArgs(
  public val productShippingClassId: Long
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putLong("productShippingClassId", this.productShippingClassId)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("productShippingClassId", this.productShippingClassId)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): ProductShippingClassFragmentArgs {
      bundle.setClassLoader(ProductShippingClassFragmentArgs::class.java.classLoader)
      val __productShippingClassId : Long
      if (bundle.containsKey("productShippingClassId")) {
        __productShippingClassId = bundle.getLong("productShippingClassId")
      } else {
        throw IllegalArgumentException("Required argument \"productShippingClassId\" is missing and does not have an android:defaultValue")
      }
      return ProductShippingClassFragmentArgs(__productShippingClassId)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        ProductShippingClassFragmentArgs {
      val __productShippingClassId : Long?
      if (savedStateHandle.contains("productShippingClassId")) {
        __productShippingClassId = savedStateHandle["productShippingClassId"]
        if (__productShippingClassId == null) {
          throw IllegalArgumentException("Argument \"productShippingClassId\" of type long does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"productShippingClassId\" is missing and does not have an android:defaultValue")
      }
      return ProductShippingClassFragmentArgs(__productShippingClassId)
    }
  }
}
