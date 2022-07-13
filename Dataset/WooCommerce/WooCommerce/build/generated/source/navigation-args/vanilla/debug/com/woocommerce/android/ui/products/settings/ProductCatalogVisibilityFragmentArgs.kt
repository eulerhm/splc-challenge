package com.woocommerce.android.ui.products.settings

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Boolean
import kotlin.String
import kotlin.jvm.JvmStatic

public data class ProductCatalogVisibilityFragmentArgs(
  public val catalogVisibility: String,
  public val featured: Boolean
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("catalogVisibility", this.catalogVisibility)
    result.putBoolean("featured", this.featured)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("catalogVisibility", this.catalogVisibility)
    result.set("featured", this.featured)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): ProductCatalogVisibilityFragmentArgs {
      bundle.setClassLoader(ProductCatalogVisibilityFragmentArgs::class.java.classLoader)
      val __catalogVisibility : String?
      if (bundle.containsKey("catalogVisibility")) {
        __catalogVisibility = bundle.getString("catalogVisibility")
        if (__catalogVisibility == null) {
          throw IllegalArgumentException("Argument \"catalogVisibility\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"catalogVisibility\" is missing and does not have an android:defaultValue")
      }
      val __featured : Boolean
      if (bundle.containsKey("featured")) {
        __featured = bundle.getBoolean("featured")
      } else {
        throw IllegalArgumentException("Required argument \"featured\" is missing and does not have an android:defaultValue")
      }
      return ProductCatalogVisibilityFragmentArgs(__catalogVisibility, __featured)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        ProductCatalogVisibilityFragmentArgs {
      val __catalogVisibility : String?
      if (savedStateHandle.contains("catalogVisibility")) {
        __catalogVisibility = savedStateHandle["catalogVisibility"]
        if (__catalogVisibility == null) {
          throw IllegalArgumentException("Argument \"catalogVisibility\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"catalogVisibility\" is missing and does not have an android:defaultValue")
      }
      val __featured : Boolean?
      if (savedStateHandle.contains("featured")) {
        __featured = savedStateHandle["featured"]
        if (__featured == null) {
          throw IllegalArgumentException("Argument \"featured\" of type boolean does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"featured\" is missing and does not have an android:defaultValue")
      }
      return ProductCatalogVisibilityFragmentArgs(__catalogVisibility, __featured)
    }
  }
}
