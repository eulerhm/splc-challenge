package com.woocommerce.android.ui.products.downloads

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import com.woocommerce.android.model.ProductFile
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Boolean
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class ProductDownloadDetailsFragmentArgs(
  public val isEditing: Boolean,
  public val productFile: ProductFile
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putBoolean("isEditing", this.isEditing)
    if (Parcelable::class.java.isAssignableFrom(ProductFile::class.java)) {
      result.putParcelable("productFile", this.productFile as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(ProductFile::class.java)) {
      result.putSerializable("productFile", this.productFile as Serializable)
    } else {
      throw UnsupportedOperationException(ProductFile::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("isEditing", this.isEditing)
    if (Parcelable::class.java.isAssignableFrom(ProductFile::class.java)) {
      result.set("productFile", this.productFile as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(ProductFile::class.java)) {
      result.set("productFile", this.productFile as Serializable)
    } else {
      throw UnsupportedOperationException(ProductFile::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): ProductDownloadDetailsFragmentArgs {
      bundle.setClassLoader(ProductDownloadDetailsFragmentArgs::class.java.classLoader)
      val __isEditing : Boolean
      if (bundle.containsKey("isEditing")) {
        __isEditing = bundle.getBoolean("isEditing")
      } else {
        throw IllegalArgumentException("Required argument \"isEditing\" is missing and does not have an android:defaultValue")
      }
      val __productFile : ProductFile?
      if (bundle.containsKey("productFile")) {
        if (Parcelable::class.java.isAssignableFrom(ProductFile::class.java) ||
            Serializable::class.java.isAssignableFrom(ProductFile::class.java)) {
          __productFile = bundle.get("productFile") as ProductFile?
        } else {
          throw UnsupportedOperationException(ProductFile::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__productFile == null) {
          throw IllegalArgumentException("Argument \"productFile\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"productFile\" is missing and does not have an android:defaultValue")
      }
      return ProductDownloadDetailsFragmentArgs(__isEditing, __productFile)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        ProductDownloadDetailsFragmentArgs {
      val __isEditing : Boolean?
      if (savedStateHandle.contains("isEditing")) {
        __isEditing = savedStateHandle["isEditing"]
        if (__isEditing == null) {
          throw IllegalArgumentException("Argument \"isEditing\" of type boolean does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"isEditing\" is missing and does not have an android:defaultValue")
      }
      val __productFile : ProductFile?
      if (savedStateHandle.contains("productFile")) {
        if (Parcelable::class.java.isAssignableFrom(ProductFile::class.java) ||
            Serializable::class.java.isAssignableFrom(ProductFile::class.java)) {
          __productFile = savedStateHandle.get<ProductFile?>("productFile")
        } else {
          throw UnsupportedOperationException(ProductFile::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__productFile == null) {
          throw IllegalArgumentException("Argument \"productFile\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"productFile\" is missing and does not have an android:defaultValue")
      }
      return ProductDownloadDetailsFragmentArgs(__isEditing, __productFile)
    }
  }
}
