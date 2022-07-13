package com.woocommerce.android.ui.products.tags

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Long
import kotlin.jvm.JvmStatic

public data class ProductTagsFragmentArgs(
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
    public fun fromBundle(bundle: Bundle): ProductTagsFragmentArgs {
      bundle.setClassLoader(ProductTagsFragmentArgs::class.java.classLoader)
      val __remoteProductId : Long
      if (bundle.containsKey("remoteProductId")) {
        __remoteProductId = bundle.getLong("remoteProductId")
      } else {
        __remoteProductId = 0L
      }
      return ProductTagsFragmentArgs(__remoteProductId)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): ProductTagsFragmentArgs {
      val __remoteProductId : Long?
      if (savedStateHandle.contains("remoteProductId")) {
        __remoteProductId = savedStateHandle["remoteProductId"]
        if (__remoteProductId == null) {
          throw IllegalArgumentException("Argument \"remoteProductId\" of type long does not support null values")
        }
      } else {
        __remoteProductId = 0L
      }
      return ProductTagsFragmentArgs(__remoteProductId)
    }
  }
}
