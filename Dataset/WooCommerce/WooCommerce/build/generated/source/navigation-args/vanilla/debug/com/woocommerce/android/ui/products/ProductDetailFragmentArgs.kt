package com.woocommerce.android.ui.products

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Boolean
import kotlin.Long
import kotlin.jvm.JvmStatic

public data class ProductDetailFragmentArgs(
  public val remoteProductId: Long = 0L,
  public val isAddProduct: Boolean = false,
  public val isTrashEnabled: Boolean = false
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putLong("remoteProductId", this.remoteProductId)
    result.putBoolean("isAddProduct", this.isAddProduct)
    result.putBoolean("isTrashEnabled", this.isTrashEnabled)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("remoteProductId", this.remoteProductId)
    result.set("isAddProduct", this.isAddProduct)
    result.set("isTrashEnabled", this.isTrashEnabled)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): ProductDetailFragmentArgs {
      bundle.setClassLoader(ProductDetailFragmentArgs::class.java.classLoader)
      val __remoteProductId : Long
      if (bundle.containsKey("remoteProductId")) {
        __remoteProductId = bundle.getLong("remoteProductId")
      } else {
        __remoteProductId = 0L
      }
      val __isAddProduct : Boolean
      if (bundle.containsKey("isAddProduct")) {
        __isAddProduct = bundle.getBoolean("isAddProduct")
      } else {
        __isAddProduct = false
      }
      val __isTrashEnabled : Boolean
      if (bundle.containsKey("isTrashEnabled")) {
        __isTrashEnabled = bundle.getBoolean("isTrashEnabled")
      } else {
        __isTrashEnabled = false
      }
      return ProductDetailFragmentArgs(__remoteProductId, __isAddProduct, __isTrashEnabled)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): ProductDetailFragmentArgs {
      val __remoteProductId : Long?
      if (savedStateHandle.contains("remoteProductId")) {
        __remoteProductId = savedStateHandle["remoteProductId"]
        if (__remoteProductId == null) {
          throw IllegalArgumentException("Argument \"remoteProductId\" of type long does not support null values")
        }
      } else {
        __remoteProductId = 0L
      }
      val __isAddProduct : Boolean?
      if (savedStateHandle.contains("isAddProduct")) {
        __isAddProduct = savedStateHandle["isAddProduct"]
        if (__isAddProduct == null) {
          throw IllegalArgumentException("Argument \"isAddProduct\" of type boolean does not support null values")
        }
      } else {
        __isAddProduct = false
      }
      val __isTrashEnabled : Boolean?
      if (savedStateHandle.contains("isTrashEnabled")) {
        __isTrashEnabled = savedStateHandle["isTrashEnabled"]
        if (__isTrashEnabled == null) {
          throw IllegalArgumentException("Argument \"isTrashEnabled\" of type boolean does not support null values")
        }
      } else {
        __isTrashEnabled = false
      }
      return ProductDetailFragmentArgs(__remoteProductId, __isAddProduct, __isTrashEnabled)
    }
  }
}
