package com.woocommerce.android.ui.products

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Long
import kotlin.jvm.JvmStatic

public data class ProductExternalLinkFragmentArgs(
  public val remoteMediaId: Long
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putLong("remoteMediaId", this.remoteMediaId)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("remoteMediaId", this.remoteMediaId)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): ProductExternalLinkFragmentArgs {
      bundle.setClassLoader(ProductExternalLinkFragmentArgs::class.java.classLoader)
      val __remoteMediaId : Long
      if (bundle.containsKey("remoteMediaId")) {
        __remoteMediaId = bundle.getLong("remoteMediaId")
      } else {
        throw IllegalArgumentException("Required argument \"remoteMediaId\" is missing and does not have an android:defaultValue")
      }
      return ProductExternalLinkFragmentArgs(__remoteMediaId)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        ProductExternalLinkFragmentArgs {
      val __remoteMediaId : Long?
      if (savedStateHandle.contains("remoteMediaId")) {
        __remoteMediaId = savedStateHandle["remoteMediaId"]
        if (__remoteMediaId == null) {
          throw IllegalArgumentException("Argument \"remoteMediaId\" of type long does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"remoteMediaId\" is missing and does not have an android:defaultValue")
      }
      return ProductExternalLinkFragmentArgs(__remoteMediaId)
    }
  }
}
