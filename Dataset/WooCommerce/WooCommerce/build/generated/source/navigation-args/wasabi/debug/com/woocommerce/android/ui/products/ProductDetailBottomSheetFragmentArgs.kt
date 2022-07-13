package com.woocommerce.android.ui.products

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class ProductDetailBottomSheetFragmentArgs(
  public val productType: ProductType
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(ProductType::class.java)) {
      result.putParcelable("productType", this.productType as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(ProductType::class.java)) {
      result.putSerializable("productType", this.productType as Serializable)
    } else {
      throw UnsupportedOperationException(ProductType::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(ProductType::class.java)) {
      result.set("productType", this.productType as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(ProductType::class.java)) {
      result.set("productType", this.productType as Serializable)
    } else {
      throw UnsupportedOperationException(ProductType::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): ProductDetailBottomSheetFragmentArgs {
      bundle.setClassLoader(ProductDetailBottomSheetFragmentArgs::class.java.classLoader)
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
        throw IllegalArgumentException("Required argument \"productType\" is missing and does not have an android:defaultValue")
      }
      return ProductDetailBottomSheetFragmentArgs(__productType)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        ProductDetailBottomSheetFragmentArgs {
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
        throw IllegalArgumentException("Required argument \"productType\" is missing and does not have an android:defaultValue")
      }
      return ProductDetailBottomSheetFragmentArgs(__productType)
    }
  }
}
