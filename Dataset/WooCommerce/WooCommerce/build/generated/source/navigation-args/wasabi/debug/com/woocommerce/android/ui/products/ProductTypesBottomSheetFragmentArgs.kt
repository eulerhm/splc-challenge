package com.woocommerce.android.ui.products

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.jvm.JvmStatic

public data class ProductTypesBottomSheetFragmentArgs(
  public val remoteProductId: Long = 0L,
  public val isAddProduct: Boolean = false,
  public val currentProductType: String? = "null",
  public val isCurrentProductVirtual: Boolean = false
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putLong("remoteProductId", this.remoteProductId)
    result.putBoolean("isAddProduct", this.isAddProduct)
    result.putString("currentProductType", this.currentProductType)
    result.putBoolean("isCurrentProductVirtual", this.isCurrentProductVirtual)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("remoteProductId", this.remoteProductId)
    result.set("isAddProduct", this.isAddProduct)
    result.set("currentProductType", this.currentProductType)
    result.set("isCurrentProductVirtual", this.isCurrentProductVirtual)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): ProductTypesBottomSheetFragmentArgs {
      bundle.setClassLoader(ProductTypesBottomSheetFragmentArgs::class.java.classLoader)
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
      val __currentProductType : String?
      if (bundle.containsKey("currentProductType")) {
        __currentProductType = bundle.getString("currentProductType")
      } else {
        __currentProductType = "null"
      }
      val __isCurrentProductVirtual : Boolean
      if (bundle.containsKey("isCurrentProductVirtual")) {
        __isCurrentProductVirtual = bundle.getBoolean("isCurrentProductVirtual")
      } else {
        __isCurrentProductVirtual = false
      }
      return ProductTypesBottomSheetFragmentArgs(__remoteProductId, __isAddProduct,
          __currentProductType, __isCurrentProductVirtual)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        ProductTypesBottomSheetFragmentArgs {
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
      val __currentProductType : String?
      if (savedStateHandle.contains("currentProductType")) {
        __currentProductType = savedStateHandle["currentProductType"]
      } else {
        __currentProductType = "null"
      }
      val __isCurrentProductVirtual : Boolean?
      if (savedStateHandle.contains("isCurrentProductVirtual")) {
        __isCurrentProductVirtual = savedStateHandle["isCurrentProductVirtual"]
        if (__isCurrentProductVirtual == null) {
          throw IllegalArgumentException("Argument \"isCurrentProductVirtual\" of type boolean does not support null values")
        }
      } else {
        __isCurrentProductVirtual = false
      }
      return ProductTypesBottomSheetFragmentArgs(__remoteProductId, __isAddProduct,
          __currentProductType, __isCurrentProductVirtual)
    }
  }
}
