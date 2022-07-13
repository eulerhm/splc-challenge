package com.woocommerce.android.ui.products.variations.attributes.edit

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Long
import kotlin.jvm.JvmStatic

public data class EditVariationAttributesFragmentArgs(
  public val remoteProductId: Long = 0L,
  public val remoteVariationId: Long = 0L
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
    public fun fromBundle(bundle: Bundle): EditVariationAttributesFragmentArgs {
      bundle.setClassLoader(EditVariationAttributesFragmentArgs::class.java.classLoader)
      val __remoteProductId : Long
      if (bundle.containsKey("remoteProductId")) {
        __remoteProductId = bundle.getLong("remoteProductId")
      } else {
        __remoteProductId = 0L
      }
      val __remoteVariationId : Long
      if (bundle.containsKey("remoteVariationId")) {
        __remoteVariationId = bundle.getLong("remoteVariationId")
      } else {
        __remoteVariationId = 0L
      }
      return EditVariationAttributesFragmentArgs(__remoteProductId, __remoteVariationId)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        EditVariationAttributesFragmentArgs {
      val __remoteProductId : Long?
      if (savedStateHandle.contains("remoteProductId")) {
        __remoteProductId = savedStateHandle["remoteProductId"]
        if (__remoteProductId == null) {
          throw IllegalArgumentException("Argument \"remoteProductId\" of type long does not support null values")
        }
      } else {
        __remoteProductId = 0L
      }
      val __remoteVariationId : Long?
      if (savedStateHandle.contains("remoteVariationId")) {
        __remoteVariationId = savedStateHandle["remoteVariationId"]
        if (__remoteVariationId == null) {
          throw IllegalArgumentException("Argument \"remoteVariationId\" of type long does not support null values")
        }
      } else {
        __remoteVariationId = 0L
      }
      return EditVariationAttributesFragmentArgs(__remoteProductId, __remoteVariationId)
    }
  }
}
