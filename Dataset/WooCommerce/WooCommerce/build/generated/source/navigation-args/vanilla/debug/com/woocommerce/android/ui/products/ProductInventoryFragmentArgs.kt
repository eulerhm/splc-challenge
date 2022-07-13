package com.woocommerce.android.ui.products

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class ProductInventoryFragmentArgs(
  public val requestCode: Int,
  public val inventoryData: ProductInventoryViewModel.InventoryData,
  public val sku: String,
  public val productType: ProductType = ProductType.SIMPLE
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putInt("requestCode", this.requestCode)
    if
        (Parcelable::class.java.isAssignableFrom(ProductInventoryViewModel.InventoryData::class.java)) {
      result.putParcelable("inventoryData", this.inventoryData as Parcelable)
    } else if
        (Serializable::class.java.isAssignableFrom(ProductInventoryViewModel.InventoryData::class.java)) {
      result.putSerializable("inventoryData", this.inventoryData as Serializable)
    } else {
      throw UnsupportedOperationException(ProductInventoryViewModel.InventoryData::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    result.putString("sku", this.sku)
    if (Parcelable::class.java.isAssignableFrom(ProductType::class.java)) {
      result.putParcelable("productType", this.productType as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(ProductType::class.java)) {
      result.putSerializable("productType", this.productType as Serializable)
    }
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("requestCode", this.requestCode)
    if
        (Parcelable::class.java.isAssignableFrom(ProductInventoryViewModel.InventoryData::class.java)) {
      result.set("inventoryData", this.inventoryData as Parcelable)
    } else if
        (Serializable::class.java.isAssignableFrom(ProductInventoryViewModel.InventoryData::class.java)) {
      result.set("inventoryData", this.inventoryData as Serializable)
    } else {
      throw UnsupportedOperationException(ProductInventoryViewModel.InventoryData::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    result.set("sku", this.sku)
    if (Parcelable::class.java.isAssignableFrom(ProductType::class.java)) {
      result.set("productType", this.productType as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(ProductType::class.java)) {
      result.set("productType", this.productType as Serializable)
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): ProductInventoryFragmentArgs {
      bundle.setClassLoader(ProductInventoryFragmentArgs::class.java.classLoader)
      val __requestCode : Int
      if (bundle.containsKey("requestCode")) {
        __requestCode = bundle.getInt("requestCode")
      } else {
        throw IllegalArgumentException("Required argument \"requestCode\" is missing and does not have an android:defaultValue")
      }
      val __inventoryData : ProductInventoryViewModel.InventoryData?
      if (bundle.containsKey("inventoryData")) {
        if
            (Parcelable::class.java.isAssignableFrom(ProductInventoryViewModel.InventoryData::class.java)
            ||
            Serializable::class.java.isAssignableFrom(ProductInventoryViewModel.InventoryData::class.java)) {
          __inventoryData = bundle.get("inventoryData") as ProductInventoryViewModel.InventoryData?
        } else {
          throw UnsupportedOperationException(ProductInventoryViewModel.InventoryData::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__inventoryData == null) {
          throw IllegalArgumentException("Argument \"inventoryData\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"inventoryData\" is missing and does not have an android:defaultValue")
      }
      val __sku : String?
      if (bundle.containsKey("sku")) {
        __sku = bundle.getString("sku")
        if (__sku == null) {
          throw IllegalArgumentException("Argument \"sku\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"sku\" is missing and does not have an android:defaultValue")
      }
      val __productType : ProductType?
      if (bundle.containsKey("productType")) {
        if (Parcelable::class.java.isAssignableFrom(ProductType::class.java) ||
            Serializable::class.java.isAssignableFrom(ProductType::class.java)) {
          __productType = bundle.get("productType") as ProductType?
        } else {
          throw UnsupportedOperationException(ProductType::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__productType == null) {
          throw IllegalArgumentException("Argument \"productType\" is marked as non-null but was passed a null value.")
        }
      } else {
        __productType = ProductType.SIMPLE
      }
      return ProductInventoryFragmentArgs(__requestCode, __inventoryData, __sku, __productType)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        ProductInventoryFragmentArgs {
      val __requestCode : Int?
      if (savedStateHandle.contains("requestCode")) {
        __requestCode = savedStateHandle["requestCode"]
        if (__requestCode == null) {
          throw IllegalArgumentException("Argument \"requestCode\" of type integer does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"requestCode\" is missing and does not have an android:defaultValue")
      }
      val __inventoryData : ProductInventoryViewModel.InventoryData?
      if (savedStateHandle.contains("inventoryData")) {
        if
            (Parcelable::class.java.isAssignableFrom(ProductInventoryViewModel.InventoryData::class.java)
            ||
            Serializable::class.java.isAssignableFrom(ProductInventoryViewModel.InventoryData::class.java)) {
          __inventoryData =
              savedStateHandle.get<ProductInventoryViewModel.InventoryData?>("inventoryData")
        } else {
          throw UnsupportedOperationException(ProductInventoryViewModel.InventoryData::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__inventoryData == null) {
          throw IllegalArgumentException("Argument \"inventoryData\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"inventoryData\" is missing and does not have an android:defaultValue")
      }
      val __sku : String?
      if (savedStateHandle.contains("sku")) {
        __sku = savedStateHandle["sku"]
        if (__sku == null) {
          throw IllegalArgumentException("Argument \"sku\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"sku\" is missing and does not have an android:defaultValue")
      }
      val __productType : ProductType?
      if (savedStateHandle.contains("productType")) {
        if (Parcelable::class.java.isAssignableFrom(ProductType::class.java) ||
            Serializable::class.java.isAssignableFrom(ProductType::class.java)) {
          __productType = savedStateHandle.get<ProductType?>("productType")
        } else {
          throw UnsupportedOperationException(ProductType::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__productType == null) {
          throw IllegalArgumentException("Argument \"productType\" is marked as non-null but was passed a null value")
        }
      } else {
        __productType = ProductType.SIMPLE
      }
      return ProductInventoryFragmentArgs(__requestCode, __inventoryData, __sku, __productType)
    }
  }
}
