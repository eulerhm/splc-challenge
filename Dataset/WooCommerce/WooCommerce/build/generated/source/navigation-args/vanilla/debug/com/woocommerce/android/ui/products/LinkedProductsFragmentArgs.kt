package com.woocommerce.android.ui.products

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Long
import kotlin.jvm.JvmStatic

public data class LinkedProductsFragmentArgs(
  public val remoteId: Long = 0L
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putLong("remoteId", this.remoteId)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("remoteId", this.remoteId)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): LinkedProductsFragmentArgs {
      bundle.setClassLoader(LinkedProductsFragmentArgs::class.java.classLoader)
      val __remoteId : Long
      if (bundle.containsKey("remoteId")) {
        __remoteId = bundle.getLong("remoteId")
      } else {
        __remoteId = 0L
      }
      return LinkedProductsFragmentArgs(__remoteId)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        LinkedProductsFragmentArgs {
      val __remoteId : Long?
      if (savedStateHandle.contains("remoteId")) {
        __remoteId = savedStateHandle["remoteId"]
        if (__remoteId == null) {
          throw IllegalArgumentException("Argument \"remoteId\" of type long does not support null values")
        }
      } else {
        __remoteId = 0L
      }
      return LinkedProductsFragmentArgs(__remoteId)
    }
  }
}
