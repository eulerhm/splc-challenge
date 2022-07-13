package com.woocommerce.android.ui.products

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Boolean
import kotlin.Long
import kotlin.jvm.JvmStatic

public data class ProductImageViewerFragmentArgs(
  public val mediaId: Long,
  public val isDeletingAllowed: Boolean = true
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putBoolean("isDeletingAllowed", this.isDeletingAllowed)
    result.putLong("mediaId", this.mediaId)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("isDeletingAllowed", this.isDeletingAllowed)
    result.set("mediaId", this.mediaId)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): ProductImageViewerFragmentArgs {
      bundle.setClassLoader(ProductImageViewerFragmentArgs::class.java.classLoader)
      val __isDeletingAllowed : Boolean
      if (bundle.containsKey("isDeletingAllowed")) {
        __isDeletingAllowed = bundle.getBoolean("isDeletingAllowed")
      } else {
        __isDeletingAllowed = true
      }
      val __mediaId : Long
      if (bundle.containsKey("mediaId")) {
        __mediaId = bundle.getLong("mediaId")
      } else {
        throw IllegalArgumentException("Required argument \"mediaId\" is missing and does not have an android:defaultValue")
      }
      return ProductImageViewerFragmentArgs(__mediaId, __isDeletingAllowed)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        ProductImageViewerFragmentArgs {
      val __isDeletingAllowed : Boolean?
      if (savedStateHandle.contains("isDeletingAllowed")) {
        __isDeletingAllowed = savedStateHandle["isDeletingAllowed"]
        if (__isDeletingAllowed == null) {
          throw IllegalArgumentException("Argument \"isDeletingAllowed\" of type boolean does not support null values")
        }
      } else {
        __isDeletingAllowed = true
      }
      val __mediaId : Long?
      if (savedStateHandle.contains("mediaId")) {
        __mediaId = savedStateHandle["mediaId"]
        if (__mediaId == null) {
          throw IllegalArgumentException("Argument \"mediaId\" of type long does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"mediaId\" is missing and does not have an android:defaultValue")
      }
      return ProductImageViewerFragmentArgs(__mediaId, __isDeletingAllowed)
    }
  }
}
