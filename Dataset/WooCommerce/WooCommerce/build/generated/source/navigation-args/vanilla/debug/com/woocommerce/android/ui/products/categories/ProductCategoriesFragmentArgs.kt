package com.woocommerce.android.ui.products.categories

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Long
import kotlin.jvm.JvmStatic

public data class ProductCategoriesFragmentArgs(
  public val remoteProductId: Long = 0L
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putLong("remoteProductId", this.remoteProductId)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("remoteProductId", this.remoteProductId)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): ProductCategoriesFragmentArgs {
      bundle.setClassLoader(ProductCategoriesFragmentArgs::class.java.classLoader)
      val __remoteProductId : Long
      if (bundle.containsKey("remoteProductId")) {
        __remoteProductId = bundle.getLong("remoteProductId")
      } else {
        __remoteProductId = 0L
      }
      return ProductCategoriesFragmentArgs(__remoteProductId)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        ProductCategoriesFragmentArgs {
      val __remoteProductId : Long?
      if (savedStateHandle.contains("remoteProductId")) {
        __remoteProductId = savedStateHandle["remoteProductId"]
        if (__remoteProductId == null) {
          throw IllegalArgumentException("Argument \"remoteProductId\" of type long does not support null values")
        }
      } else {
        __remoteProductId = 0L
      }
      return ProductCategoriesFragmentArgs(__remoteProductId)
    }
  }
}
