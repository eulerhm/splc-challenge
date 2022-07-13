package com.woocommerce.android.ui.products

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import com.woocommerce.android.model.Product
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class ProductImagesFragmentArgs(
  public val images: Array<Product.Image>,
  public val showChooser: Boolean,
  public val requestCode: Int,
  public val remoteId: Long = 0L,
  public val selectedImage: Product.Image? = null
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putLong("remoteId", this.remoteId)
    result.putParcelableArray("images", this.images)
    if (Parcelable::class.java.isAssignableFrom(Product.Image::class.java)) {
      result.putParcelable("selectedImage", this.selectedImage as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(Product.Image::class.java)) {
      result.putSerializable("selectedImage", this.selectedImage as Serializable?)
    }
    result.putBoolean("showChooser", this.showChooser)
    result.putInt("requestCode", this.requestCode)
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("remoteId", this.remoteId)
    result.set("images", this.images)
    if (Parcelable::class.java.isAssignableFrom(Product.Image::class.java)) {
      result.set("selectedImage", this.selectedImage as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(Product.Image::class.java)) {
      result.set("selectedImage", this.selectedImage as Serializable?)
    }
    result.set("showChooser", this.showChooser)
    result.set("requestCode", this.requestCode)
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("UNCHECKED_CAST")
    public fun fromBundle(bundle: Bundle): ProductImagesFragmentArgs {
      bundle.setClassLoader(ProductImagesFragmentArgs::class.java.classLoader)
      val __remoteId : Long
      if (bundle.containsKey("remoteId")) {
        __remoteId = bundle.getLong("remoteId")
      } else {
        __remoteId = 0L
      }
      val __images : Array<Product.Image>?
      if (bundle.containsKey("images")) {
        __images = bundle.getParcelableArray("images")?.map { it as Product.Image }?.toTypedArray()
        if (__images == null) {
          throw IllegalArgumentException("Argument \"images\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"images\" is missing and does not have an android:defaultValue")
      }
      val __selectedImage : Product.Image?
      if (bundle.containsKey("selectedImage")) {
        if (Parcelable::class.java.isAssignableFrom(Product.Image::class.java) ||
            Serializable::class.java.isAssignableFrom(Product.Image::class.java)) {
          __selectedImage = bundle.get("selectedImage") as Product.Image?
        } else {
          throw UnsupportedOperationException(Product.Image::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        __selectedImage = null
      }
      val __showChooser : Boolean
      if (bundle.containsKey("showChooser")) {
        __showChooser = bundle.getBoolean("showChooser")
      } else {
        throw IllegalArgumentException("Required argument \"showChooser\" is missing and does not have an android:defaultValue")
      }
      val __requestCode : Int
      if (bundle.containsKey("requestCode")) {
        __requestCode = bundle.getInt("requestCode")
      } else {
        throw IllegalArgumentException("Required argument \"requestCode\" is missing and does not have an android:defaultValue")
      }
      return ProductImagesFragmentArgs(__images, __showChooser, __requestCode, __remoteId,
          __selectedImage)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): ProductImagesFragmentArgs {
      val __remoteId : Long?
      if (savedStateHandle.contains("remoteId")) {
        __remoteId = savedStateHandle["remoteId"]
        if (__remoteId == null) {
          throw IllegalArgumentException("Argument \"remoteId\" of type long does not support null values")
        }
      } else {
        __remoteId = 0L
      }
      val __images : Array<Product.Image>?
      if (savedStateHandle.contains("images")) {
        __images = savedStateHandle.get<Array<Parcelable>>("images")?.map { it as Product.Image
            }?.toTypedArray()
        if (__images == null) {
          throw IllegalArgumentException("Argument \"images\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"images\" is missing and does not have an android:defaultValue")
      }
      val __selectedImage : Product.Image?
      if (savedStateHandle.contains("selectedImage")) {
        if (Parcelable::class.java.isAssignableFrom(Product.Image::class.java) ||
            Serializable::class.java.isAssignableFrom(Product.Image::class.java)) {
          __selectedImage = savedStateHandle.get<Product.Image?>("selectedImage")
        } else {
          throw UnsupportedOperationException(Product.Image::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        __selectedImage = null
      }
      val __showChooser : Boolean?
      if (savedStateHandle.contains("showChooser")) {
        __showChooser = savedStateHandle["showChooser"]
        if (__showChooser == null) {
          throw IllegalArgumentException("Argument \"showChooser\" of type boolean does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"showChooser\" is missing and does not have an android:defaultValue")
      }
      val __requestCode : Int?
      if (savedStateHandle.contains("requestCode")) {
        __requestCode = savedStateHandle["requestCode"]
        if (__requestCode == null) {
          throw IllegalArgumentException("Argument \"requestCode\" of type integer does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"requestCode\" is missing and does not have an android:defaultValue")
      }
      return ProductImagesFragmentArgs(__images, __showChooser, __requestCode, __remoteId,
          __selectedImage)
    }
  }
}
