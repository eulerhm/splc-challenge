package com.woocommerce.android.ui.products.variations

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Long
import kotlin.jvm.JvmStatic

public data class VariationDetailFragmentArgs(
  public val remoteProductId: Long,
  public val remoteVariationId: Long
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putLong("remoteProductId", this.remoteProductId)
    result.putLong("remoteVariationId", this.remoteVariationId)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("remoteProductId", this.remoteProductId)
    result.set("remoteVariationId", this.remoteVariationId)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): VariationDetailFragmentArgs {
      bundle.setClassLoader(VariationDetailFragmentArgs::class.java.classLoader)
      val __remoteProductId : Long
      if (bundle.containsKey("remoteProductId")) {
        __remoteProductId = bundle.getLong("remoteProductId")
      } else {
        throw IllegalArgumentException("Required argument \"remoteProductId\" is missing and does not have an android:defaultValue")
      }
      val __remoteVariationId : Long
      if (bundle.containsKey("remoteVariationId")) {
        __remoteVariationId = bundle.getLong("remoteVariationId")
      } else {
        throw IllegalArgumentException("Required argument \"remoteVariationId\" is missing and does not have an android:defaultValue")
      }
      return VariationDetailFragmentArgs(__remoteProductId, __remoteVariationId)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        VariationDetailFragmentArgs {
      val __remoteProductId : Long?
      if (savedStateHandle.contains("remoteProductId")) {
        __remoteProductId = savedStateHandle["remoteProductId"]
        if (__remoteProductId == null) {
          throw IllegalArgumentException("Argument \"remoteProductId\" of type long does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"remoteProductId\" is missing and does not have an android:defaultValue")
      }
      val __remoteVariationId : Long?
      if (savedStateHandle.contains("remoteVariationId")) {
        __remoteVariationId = savedStateHandle["remoteVariationId"]
        if (__remoteVariationId == null) {
          throw IllegalArgumentException("Argument \"remoteVariationId\" of type long does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"remoteVariationId\" is missing and does not have an android:defaultValue")
      }
      return VariationDetailFragmentArgs(__remoteProductId, __remoteVariationId)
    }
  }
}
