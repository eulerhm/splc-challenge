package com.woocommerce.android.ui.products

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class ProductFilterListFragmentArgs(
  public val selectedStockStatus: String?,
  public val selectedProductStatus: String?,
  public val selectedProductType: String?,
  public val selectedProductCategoryId: String?,
  public val selectedProductCategoryName: String?
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("selectedStockStatus", this.selectedStockStatus)
    result.putString("selectedProductStatus", this.selectedProductStatus)
    result.putString("selectedProductType", this.selectedProductType)
    result.putString("selectedProductCategoryId", this.selectedProductCategoryId)
    result.putString("selectedProductCategoryName", this.selectedProductCategoryName)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("selectedStockStatus", this.selectedStockStatus)
    result.set("selectedProductStatus", this.selectedProductStatus)
    result.set("selectedProductType", this.selectedProductType)
    result.set("selectedProductCategoryId", this.selectedProductCategoryId)
    result.set("selectedProductCategoryName", this.selectedProductCategoryName)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): ProductFilterListFragmentArgs {
      bundle.setClassLoader(ProductFilterListFragmentArgs::class.java.classLoader)
      val __selectedStockStatus : String?
      if (bundle.containsKey("selectedStockStatus")) {
        __selectedStockStatus = bundle.getString("selectedStockStatus")
      } else {
        throw IllegalArgumentException("Required argument \"selectedStockStatus\" is missing and does not have an android:defaultValue")
      }
      val __selectedProductStatus : String?
      if (bundle.containsKey("selectedProductStatus")) {
        __selectedProductStatus = bundle.getString("selectedProductStatus")
      } else {
        throw IllegalArgumentException("Required argument \"selectedProductStatus\" is missing and does not have an android:defaultValue")
      }
      val __selectedProductType : String?
      if (bundle.containsKey("selectedProductType")) {
        __selectedProductType = bundle.getString("selectedProductType")
      } else {
        throw IllegalArgumentException("Required argument \"selectedProductType\" is missing and does not have an android:defaultValue")
      }
      val __selectedProductCategoryId : String?
      if (bundle.containsKey("selectedProductCategoryId")) {
        __selectedProductCategoryId = bundle.getString("selectedProductCategoryId")
      } else {
        throw IllegalArgumentException("Required argument \"selectedProductCategoryId\" is missing and does not have an android:defaultValue")
      }
      val __selectedProductCategoryName : String?
      if (bundle.containsKey("selectedProductCategoryName")) {
        __selectedProductCategoryName = bundle.getString("selectedProductCategoryName")
      } else {
        throw IllegalArgumentException("Required argument \"selectedProductCategoryName\" is missing and does not have an android:defaultValue")
      }
      return ProductFilterListFragmentArgs(__selectedStockStatus, __selectedProductStatus,
          __selectedProductType, __selectedProductCategoryId, __selectedProductCategoryName)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        ProductFilterListFragmentArgs {
      val __selectedStockStatus : String?
      if (savedStateHandle.contains("selectedStockStatus")) {
        __selectedStockStatus = savedStateHandle["selectedStockStatus"]
      } else {
        throw IllegalArgumentException("Required argument \"selectedStockStatus\" is missing and does not have an android:defaultValue")
      }
      val __selectedProductStatus : String?
      if (savedStateHandle.contains("selectedProductStatus")) {
        __selectedProductStatus = savedStateHandle["selectedProductStatus"]
      } else {
        throw IllegalArgumentException("Required argument \"selectedProductStatus\" is missing and does not have an android:defaultValue")
      }
      val __selectedProductType : String?
      if (savedStateHandle.contains("selectedProductType")) {
        __selectedProductType = savedStateHandle["selectedProductType"]
      } else {
        throw IllegalArgumentException("Required argument \"selectedProductType\" is missing and does not have an android:defaultValue")
      }
      val __selectedProductCategoryId : String?
      if (savedStateHandle.contains("selectedProductCategoryId")) {
        __selectedProductCategoryId = savedStateHandle["selectedProductCategoryId"]
      } else {
        throw IllegalArgumentException("Required argument \"selectedProductCategoryId\" is missing and does not have an android:defaultValue")
      }
      val __selectedProductCategoryName : String?
      if (savedStateHandle.contains("selectedProductCategoryName")) {
        __selectedProductCategoryName = savedStateHandle["selectedProductCategoryName"]
      } else {
        throw IllegalArgumentException("Required argument \"selectedProductCategoryName\" is missing and does not have an android:defaultValue")
      }
      return ProductFilterListFragmentArgs(__selectedStockStatus, __selectedProductStatus,
          __selectedProductType, __selectedProductCategoryId, __selectedProductCategoryName)
    }
  }
}
